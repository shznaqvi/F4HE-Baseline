package edu.aku.hassannaqvi.f4he_baseline.ui;

import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.sharedPref;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.f4he_baseline.R;
import edu.aku.hassannaqvi.f4he_baseline.core.MainApp;
import edu.aku.hassannaqvi.f4he_baseline.database.DatabaseHelper;
import edu.aku.hassannaqvi.f4he_baseline.databinding.ActivityIdentificationBinding;
import edu.aku.hassannaqvi.f4he_baseline.models.EnumBlocks;
import edu.aku.hassannaqvi.f4he_baseline.models.Form;
import edu.aku.hassannaqvi.f4he_baseline.models.RandomHH;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionA1Activity;


public class IdentificationActivity extends AppCompatActivity {

    private static final String TAG = "IdentificationActivity";
    ActivityIdentificationBinding bi;
    private DatabaseHelper db;
    private ArrayList<String> ebCode;
    private ArrayList<String> districtNames;
    private ArrayList<String> tehsilNames;
    private ArrayList<String> headHH;
    private Intent openIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "1").equals("1") ? R.style.AppThemeEnglish1 : R.style.AppThemeUrdu);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_identification);
        bi.setCallback(this);
        db = MainApp.appInfo.dbHelper;
        // populateSpinner();

        openIntent = new Intent();
        switch (MainApp.idType) {
            case 1:
                bi.btnContinue.setText(R.string.open_hh_form);
                MainApp.form = new Form();
                openIntent = new Intent(this, SectionA1Activity.class);
                break;
         /*   case 2:
                bi.btnContinue.setText(R.string.open_anhtro_form);
                MainApp.anthro = new Anthro();
                openIntent = new Intent(this, SectionAnthroActivity.class);
                break;
            case 3:
                bi.btnContinue.setText(R.string.open_blood_form);
                //     MainApp.sample = new Sample();
                openIntent = new Intent(this, SectionSamplesActivity.class);
                break;
            case 4:
                bi.btnContinue.setText(R.string.open_stool_form);
                //    MainApp.sample = new Sample();
                openIntent = new Intent(this, SectionSamplesActivity.class);
                break;*/

        }

        bi.a105.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                bi.a107.setText(null);
                bi.a108.setText(null);
                bi.a110.setText(null);
                bi.ahhead.setText(null);
                bi.fldGrpHH.setVisibility(View.GONE);
                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
                bi.btnContinue.setEnabled(false);
            }
        });

        bi.a110.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                bi.ahhead.setText(null);
                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
                bi.btnContinue.setEnabled(false);
            }
        });


    }

    private void populateSpinner() {
     /*   Collection<EnumBlocks> enumBlocks = db.getEnumBlocks();
        ebCode = new ArrayList<>();
        districtNames = new ArrayList<>();
        tehsilNames = new ArrayList<>();
        for (EnumBlocks eb : enumBlocks) {
            ebCode.add(eb.getEnumBlock());
            districtNames.add(eb.getDistrictName());
            tehsilNames.add(eb.getTehsilName()); //
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, ebCode);

        bi.a105.setAdapter(adapter);

        bi.a105.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                int position = ebCode.indexOf(bi.a105.getText().toString());
                bi.a107.setText(districtNames.get(position));
                bi.a108.setText(tehsilNames.get(position));

                Collection<RandomHH> randHH = db.getHHbyEnumBlocks(bi.a105.getText().toString());
                ArrayList<String> households = new ArrayList<String>();
                for (RandomHH r : randHH) {
                    households.add(r.getHhno());
                    headHH = new ArrayList<String>();
                    headHH.add(r.getHeadhh());



                }


                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(IdentificationActivity.this,
                        android.R.layout.simple_dropdown_item_1line, households);

                bi.a105.setAdapter(adapter);

            }
        });

        bi.a110.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


            }
        });*/

    }


    public void btnContinue(View view) {
        if (!formValidation()) return;
        switch (MainApp.idType) {
            case 1:
                if (!hhExists())
                    saveDraftForm();
                finish();
                startActivity(openIntent);
                break;
          /*  case 2:
                if (hhExists()) {
                    saveDraftAnthro();
                    finish();
                    startActivity(openIntent);
                } else {
                    Toast.makeText(this, getString(R.string.info_hh_form_not_exist), Toast.LENGTH_LONG).show();
                }
                break;
            case 3:
            case 4:
                if (hhExists()) {
                    saveDraftSamples();
                    finish();
                    startActivity(openIntent);
                } else {
                    Toast.makeText(this, getString(R.string.info_hh_form_not_exist), Toast.LENGTH_LONG).show();
                }
                break;
*/
        }


    }


    private void saveDraftForm() {
        MainApp.form = new Form();

        MainApp.form.setUserName(MainApp.user.getUserName());
        MainApp.form.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        MainApp.form.setDeviceId(MainApp.deviceid);
        MainApp.form.setAppver(MainApp.versionName + "." + MainApp.versionCode);

        MainApp.form.setA105(bi.a105.getText().toString());
        MainApp.form.setA107(bi.a107.getText().toString());
        MainApp.form.setA108(bi.a108.getText().toString());
        MainApp.form.setA110(bi.a110.getText().toString());
        MainApp.form.setSno(MainApp.currentHousehold.getSno());


    }

   /* private void saveDraftAnthro() {
        MainApp.anthro = new Anthro();

        MainApp.anthro.setUserName(MainApp.user.getUserName());
        MainApp.anthro.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        MainApp.anthro.setDeviceId(MainApp.deviceid);
        MainApp.anthro.setAppver(MainApp.versionName + "." + MainApp.versionCode);

    }

    private void saveDraftSamples() {

        MainApp.samples = new Samples();
        MainApp.samples.setUserName(MainApp.user.getUserName());
        MainApp.samples.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        MainApp.samples.setDeviceId(MainApp.deviceid);
        MainApp.samples.setAppver(MainApp.versionName + "." + MainApp.versionCode);
    }*/


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    public void checkHousehold(View view) {
        RandomHH testRand = new RandomHH();
        testRand.setSno("1");
        testRand.setEbcode("909090909");
        testRand.setHeadhh("Test Head");
        testRand.setHhno("999-99");
        RandomHH randHH = new RandomHH();
        if (!bi.a105.getText().toString().equals("909090909")) {
            randHH = db.getHHbyEnumBlocks(bi.a105.getText().toString(), bi.a110.getText().toString());
        } else {
            randHH = testRand;
        }
        if (!randHH.getEbcode().equals("")) {
            bi.ahhead.setError(null);
            bi.ahhead.setText(randHH.getHeadhh());
            bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.colorAccent));
            bi.btnContinue.setEnabled(true);

            MainApp.currentHousehold = randHH;

        } else {
            bi.ahhead.setError("Not Found!");
            bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
            bi.btnContinue.setEnabled(false);
        }
        /*ArrayList<String> households = new ArrayList<String>();
        for (RandomHH r : randHH) {
            households.add(r.getHhno());
            headHH = new ArrayList<String>();
            headHH.add(r.getHeadhh());
        }*/
    }

    private boolean hhExists() {

        switch (MainApp.idType) {
            case 1:
                MainApp.form = new Form();
                try {
                    MainApp.form = db.getFormByClusterHHNo(bi.a105.getText().toString(), bi.a110.getText().toString());
                } catch (JSONException e) {
                    Log.d(TAG, getString(R.string.hh_exists_form) + e.getMessage());
                    Toast.makeText(this, getString(R.string.hh_exists_form) + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
                return MainApp.form != null;

            case 2:
            case 3:
            case 4:
                MainApp.form = new Form();
                try {
                    MainApp.form = db.getFormByClusterHHNo(bi.a105.getText().toString(), bi.a110.getText().toString());
                    // Populate Subject Names for spinner Adapter in Samples Activity.
                    if (MainApp.form != null) {
                        MainApp.subjectNames = new ArrayList<>();
                        MainApp.subjectNames.add("...");

                    /*    // Add woman if exist
                        if (!MainApp.form.getA104n().equals("")) {
                            MainApp.subjectNames.add(MainApp.form.getA104n() + " (" + MainApp.form.getW102() + ")");
                            // Add child if both woman and child exist
                            if (!MainApp.form.getA104n().equals("")) {
                                MainApp.subjectNames.add(MainApp.form.getA104n());
                            } else {
                                Toast.makeText(this, R.string.child_info_missing, Toast.LENGTH_SHORT).show();
                                return false;

                            }
                        } else {
                            Toast.makeText(this, R.string.woman_child_info_missing, Toast.LENGTH_SHORT).show();
                            return false;

                        }*/
                    } else {
                        return MainApp.form != null;
                    }
             /*       MainApp.samples = new Samples();
                    MainApp.anthro = new Anthro();*/
                    //MainApp.samples = db.getSamplesByClusterHHNo(bi.h103.getText().toString(), bi.h103.getText().toString());
                } catch (JSONException e) {
                    e.printStackTrace();
                    Log.d(TAG, getString(R.string.hh_exists_form) + e.getMessage());
                    Toast.makeText(this, getString(R.string.hh_exists_form) + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
                return MainApp.form != null;

            default:
                return false;

        }
    }

    public void searchEB(View view) {
        bi.btnContinue.setEnabled(false);
        EnumBlocks testEb = new EnumBlocks();
        testEb.setEnumBlock("909090909");
        testEb.setDistrictName("Test District 9");
        testEb.setTehsilName("Test Tehsil 9");
        EnumBlocks enumBlock = new EnumBlocks();
        if (!bi.a105.getText().toString().equals(testEb.getEnumBlock())) {
            enumBlock = db.getEnumBlocks(bi.a105.getText().toString());
        } else {
            enumBlock = testEb;
        }

       /* ebCode = new ArrayList<>();
        districtNames = new ArrayList<>();
        tehsilNames = new ArrayList<>();
        for (EnumBlocks eb : enumBlocks) {
            ebCode.add(eb.getEnumBlock());
            districtNames.add(eb.getDistrictName());
            tehsilNames.add(eb.getTehsilName()); //
        }*/
        if (!enumBlock.getEnumBlock().equals("")) {
            bi.a107.setError(null);
            bi.a108.setError(null);
            bi.a107.setText(enumBlock.getDistrictName());
            bi.a108.setText(enumBlock.getTehsilName());
            bi.fldGrpHH.setVisibility(View.VISIBLE);

        } else {
            bi.a107.setError("Not Found!");
            bi.a108.setError("Not Found!");
            bi.a110.setText(null);
            bi.ahhead.setText(null);
            bi.fldGrpHH.setVisibility(View.GONE);
        }
    }
}
