package edu.aku.hassannaqvi.f4he_baseline.ui.sections;


import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.adolListAll;
import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.ladol;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.util.ArrayList;

import edu.aku.hassannaqvi.f4he_baseline.R;
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts;
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts.LateAdolescentTable;
import edu.aku.hassannaqvi.f4he_baseline.core.MainApp;
import edu.aku.hassannaqvi.f4he_baseline.database.DatabaseHelper;
import edu.aku.hassannaqvi.f4he_baseline.databinding.ActivitySectionEs1Binding;
import edu.aku.hassannaqvi.f4he_baseline.ui.EndingActivity;

public class SectionES1Activity extends AppCompatActivity {
    private static final String TAG = "SectionES1Activity";
    ActivitySectionEs1Binding bi;
    private DatabaseHelper db;
    private ArrayList<String> adolNames, adolCodes, adolAges;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_es1);
        bi.setLadol(MainApp.ladol);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;

        populateSpinner();
    }


    private void populateSpinner() {

        // Populate Provinces

        adolNames = new ArrayList<>();
        adolCodes = new ArrayList<>();
        adolAges = new ArrayList<>();

        adolNames.add("...");
        adolCodes.add("...");
        adolAges.add("...");

        for (Integer a : adolListAll) {

            adolNames.add(MainApp.familyList.get(a).getHl1());
            adolCodes.add(String.valueOf(a));
            adolAges.add(MainApp.familyList.get(a).getHl1());

        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SectionES1Activity.this,
                R.layout.custom_spinner, adolNames);

        bi.es1resp.setAdapter(adapter);

    }

    private boolean insertNewRecord() {
        if (!ladol.getUid().equals("")) return true;
        ladol.populateMeta();
        long rowId = 0;
        try {
            rowId = db.addAdolescent(ladol);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        ladol.setId(String.valueOf(rowId));
        if (rowId > 0) {
            ladol.setUid(ladol.getDeviceId() + ladol.getId());
            db.updatesAdolColumn(LateAdolescentTable.COLUMN_UID, ladol.getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private boolean updateDB() {
        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            adolListAll.remove(bi.es1resp.getSelectedItemPosition() - 1);
            updcount = db.updatesAdolColumn(TableContracts.LateAdolescentTable.COLUMN_SE1, ladol.sE1toString());
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, R.string.upd_db + e.getMessage());
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount > 0) return true;
        else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    public void btnContinue(View view) {
        if (!formValidation()) return;
        if (!insertNewRecord()) return;
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, SectionES2Activity.class));


        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }



    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }
}