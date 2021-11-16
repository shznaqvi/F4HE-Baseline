package edu.aku.hassannaqvi.f4he_baseline.ui;

import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.sharedPref;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.f4he_baseline.R;
import edu.aku.hassannaqvi.f4he_baseline.core.MainApp;
import edu.aku.hassannaqvi.f4he_baseline.database.DatabaseHelper;
import edu.aku.hassannaqvi.f4he_baseline.databinding.ActivityIdentificationBinding;
import edu.aku.hassannaqvi.f4he_baseline.models.Form;
import edu.aku.hassannaqvi.f4he_baseline.models.Villages;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionAS1Activity;


public class IdentificationActivity extends AppCompatActivity {

    private static final String TAG = "IdentificationActivity";
    ActivityIdentificationBinding bi;
    private DatabaseHelper db;
    private ArrayList<String> provinceNames;
    private ArrayList<String> provinceCodes;
    private ArrayList<String> districtNames;
    private ArrayList<String> districtCodes;
    private ArrayList<String> villageNames;
    private ArrayList<String> villageCodes;
    private ArrayList<String> psuCode;
    private ArrayList<String> headHH;
    private Intent openIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "1").equals("1") ? R.style.AppThemeEnglish1 : R.style.AppThemeUrdu);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_identification);
        db = MainApp.appInfo.dbHelper;
        // populateSpinner();

        bi.btnContinue.setText(R.string.open_hh_form);
        MainApp.form = new Form();


    }

    private void populateSpinner() {

        // Populate Provinces
        Collection<Villages> provinces = db.getProvinceByCountry(String.valueOf(MainApp.selectedCountry));

        provinceNames = new ArrayList<>();
        provinceCodes = new ArrayList<>();

        provinceNames.add("...");
        provinceCodes.add("...");

        for (Villages p : provinces) {

            provinceNames.add(p.getProvince());
            provinceCodes.add(p.getProvcode());

        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(IdentificationActivity.this,
                android.R.layout.simple_dropdown_item_1line, provinceNames);

        bi.as1q02.setAdapter(adapter);

        bi.as1q02.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                MainApp.selectedProvince = provinceCodes.get(position);

                // Populate Districts
                Collection<Villages> districts = db.getDistrictsByProvince(String.valueOf(MainApp.selectedCountry), MainApp.selectedProvince);

                districtNames = new ArrayList<>();
                districtCodes = new ArrayList<>();

                districtNames.add("...");
                districtCodes.add("...");

                for (Villages d : districts) {

                    districtNames.add(d.getDistrict_name());
                    districtCodes.add(d.getDcode());

                }

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(IdentificationActivity.this,
                        android.R.layout.simple_dropdown_item_1line, districtNames);

                bi.as1q04.setAdapter(adapter);

            }
        });

        bi.as1q04.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                MainApp.selectedDistrict = districtCodes.get(position);

                // Populate Villages
                Collection<Villages> villages = db.getVillagesByDistrict(String.valueOf(MainApp.selectedCountry), MainApp.selectedProvince, MainApp.selectedDistrict);

                villageNames = new ArrayList<>();
                villageCodes = new ArrayList<>();

                villageNames.add("...");
                villageCodes.add("...");
                psuCode.add("...");

                for (Villages v : villages) {

                    villageNames.add(v.getProvince());
                    villageCodes.add(v.getProvcode());
                    psuCode.add(v.getPsucode());

                }

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(IdentificationActivity.this,
                        android.R.layout.simple_dropdown_item_1line, villageNames);

                bi.as1q06.setAdapter(adapter);

            }
        });

        bi.as1q06.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                MainApp.selectedVillage = villageCodes.get(position);
                MainApp.selectedPSU = psuCode.get(position);


            }
        });


    }


    public void btnContinue(View view) {
        if (!formValidation()) return;
        MainApp.selectedHHID = bi.as1q08.getText().toString();

        if (!hhExists())
            saveDraftForm();
        finish();
        startActivity(new Intent(this, SectionAS1Activity.class));


    }


    private void saveDraftForm() {
        MainApp.form = new Form();

        MainApp.form.setUserName(MainApp.user.getUserName());
        MainApp.form.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        MainApp.form.setDeviceId(MainApp.deviceid);
        MainApp.form.setAppver(MainApp.versionName + "." + MainApp.versionCode);

        /*MainApp.form.setA105(bi.a105.getText().toString());
        MainApp.form.setA107(bi.a107.getText().toString());
        MainApp.form.setA108(bi.a108.getText().toString());
        MainApp.form.setA110(bi.a110.getText().toString());
        MainApp.form.setSno(MainApp.currentHousehold.getSno());*/


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
        /*RandomHH testRand = new RandomHH();
        testRand.setSno("1");
        testRand.setpsuCode("909090909");
        testRand.setHeadhh("Test Head");
        testRand.setHhno("999-99");
        RandomHH randHH = new RandomHH();
        if (!bi.a105.getText().toString().equals("909090909")) {
            randHH = db.getHHbyEnumBlocks(bi.a105.getText().toString(), bi.a110.getText().toString());
        } else {
            randHH = testRand;
        }
        if (!randHH.getpsuCode().equals("")) {
            bi.ahhead.setError(null);
            bi.ahhead.setText(randHH.getHeadhh());
            bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.colorAccent));
            bi.btnContinue.setEnabled(true);

            MainApp.currentHousehold = randHH;

        } else {
            bi.ahhead.setError("Not Found!");
            bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
            bi.btnContinue.setEnabled(false);
        }*/
        /*ArrayList<String> households = new ArrayList<String>();
        for (RandomHH r : randHH) {
            households.add(r.getHhno());
            headHH = new ArrayList<String>();
            headHH.add(r.getHeadhh());
        }*/
    }

    private boolean hhExists() {


        MainApp.form = new Form();
        try {
            MainApp.form = db.getFormByPSUHHNo(MainApp.selectedPSU, MainApp.selectedHHID);
        } catch (JSONException e) {
            Log.d(TAG, getString(R.string.hh_exists_form) + e.getMessage());
            Toast.makeText(this, getString(R.string.hh_exists_form) + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        return MainApp.form != null;


    }

  /*  public void searchEB(View view) {
        bi.btnContinue.setEnabled(false);
        Villages testEb = new Villages();
        testEb.setEnumBlock("909090909");
        testEb.setDistrictName("Test District 9");
        testEb.setTehsilName("Test Tehsil 9");
        Villages enumBlock = new Villages();
        *//*if (!bi.a105.getText().toString().equals(testEb.getEnumBlock())) {
            enumBlock = db.getEnumBlocks(bi.a105.getText().toString());
        } else {
            enumBlock = testEb;
        }

       *//**//* psuCode = new ArrayList<>();
        districtNames = new ArrayList<>();
        villageNames = new ArrayList<>();
        for (Villages eb : enumBlocks) {
            psuCode.add(eb.getEnumBlock());
            districtNames.add(eb.getDistrictName());
            villageNames.add(eb.getTehsilName()); //
        }*//**//*
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
        }*//*
    }*/
}
