package edu.aku.hassannaqvi.f4he_baseline.ui.sections;

import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.form;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

import edu.aku.hassannaqvi.f4he_baseline.R;
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts;
import edu.aku.hassannaqvi.f4he_baseline.core.MainApp;
import edu.aku.hassannaqvi.f4he_baseline.database.DatabaseHelper;
import edu.aku.hassannaqvi.f4he_baseline.databinding.ActivitySectionAs1Binding;
import edu.aku.hassannaqvi.f4he_baseline.ui.EndingActivity;

public class SectionAS1Activity extends AppCompatActivity {
    private static final String TAG = "SectionAS1Activity";
    ActivitySectionAs1Binding bi;
    private List<String> countryCode, provinceCode, districtCode, villageCode;
    private List<String> countryName, provinceName, districtName, villageName;
    private DatabaseHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_as1);
        bi.setCallback(this);
        bi.setForm(form);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);
        populateSpinner(this);

    }


    private boolean insertNewRecord() {
        if (!form.getUid().equals("")) return true;
        long rowId = 0;
        try {
            rowId = db.addForm(form);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        form.setId(String.valueOf(rowId));
        if (rowId > 0) {
            form.setUid(form.getDeviceId() + form.getId());
            db.updatesFormColumn(TableContracts.FormsTable.COLUMN_UID, form.getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private boolean updateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = 0;
        try {
            updcount = db.updatesFormColumn(TableContracts.FormsTable.COLUMN_SE3, form.sE3toString());
        } catch (JSONException e) {
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    private void saveDraft() {
    }


    public void btnContinue(View view) {
        if (!formValidation()) return;
        if (!insertNewRecord()) return;
        saveDraft();
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, SectionAS2Activity.class).putExtra("complete", true));
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    public void populateSpinner(final Context context) {

        countryName = new ArrayList<>();
        countryCode = new ArrayList<>();

        //Collection<HealthFacilities> dc = db.getAllTehsils(MainApp.DIST_ID);
        /*ArrayList<Districts> dc = db.getDistrictsByUser(MainApp.user.getDist_id());

        for (Districts d : dc) {
            districtName.add(d.getDistrictName());
            districtCode.add(d.getDistrictCode());
        }*/


        countryName = new ArrayList<>();
        countryCode = new ArrayList<>();
        countryName.add("....");
        countryCode.add("....");
        countryName.add("Pakistan");
        countryCode.add("1");
        countryName.add("Afghanistan");
        countryCode.add("2");
        countryName.add("Tajikistan");
        countryCode.add("3");
        countryName.add("Kyrgyztan");
        countryCode.add("4");

        bi.as1q01.setAdapter(new ArrayAdapter<>(context, android.R.layout.simple_spinner_dropdown_item, provinceName));


        bi.as1q01.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) return;

                provinceName = new ArrayList<>();
                provinceCode = new ArrayList<>();
                provinceName.add("....");
                provinceCode.add("....");
                countryName.add("Sindh");
                countryCode.add("11111");
                countryName.add("Punjab");
                countryCode.add("22222");
                countryName.add("Balochistan");
                countryCode.add("33333");
                countryName.add("Kyber Pakhtunkah");
                countryCode.add("44444");

                bi.as1q02.setAdapter(new ArrayAdapter<>(context, android.R.layout.simple_spinner_dropdown_item, provinceName));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


    }
}