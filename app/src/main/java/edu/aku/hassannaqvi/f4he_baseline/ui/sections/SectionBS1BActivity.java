package edu.aku.hassannaqvi.f4he_baseline.ui.sections;

import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.pregnancy;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.f4he_baseline.R;
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts;
import edu.aku.hassannaqvi.f4he_baseline.core.MainApp;
import edu.aku.hassannaqvi.f4he_baseline.database.DatabaseHelper;
import edu.aku.hassannaqvi.f4he_baseline.databinding.ActivitySectionBs1bBinding;
import edu.aku.hassannaqvi.f4he_baseline.ui.EndingActivity;

public class SectionBS1BActivity extends AppCompatActivity {

    private static final String TAG = "PregnancyActivity";
    ActivitySectionBs1bBinding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_bs1b);
        db = MainApp.appInfo.getDbHelper();
        //MainApp.preg_count++;
        try {
            MainApp.pregnancy = db.getPregByUUid(String.valueOf(++MainApp.preg_count));
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(Pregnancy): " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }

        // DB returning pregnancy object thus not required
        // if (pregnancy == null) MainApp.pregnancy = new Pregnancy();
        bi.setPreg(MainApp.pregnancy);
        bi.sno.setText("Pregnancy: " + MainApp.preg_count + " of " + MainApp.mwra.getBs1q6());
        pregnancy.setSno(String.valueOf(MainApp.preg_count));
        pregnancy.setMsno(MainApp.mwra.getBs1q1());
        setSupportActionBar(bi.toolbar);
        setupSkips();
    }

    private void setupSkips() {
        bi.bs1q7p1g.setOnCheckedChangeListener((radioGroup, i) -> {
            if (i == bi.bs1q7p1g02.getId()) bi.bs1q7p1b.setMaxvalue(1f);
            else bi.bs1q7p1b.setMaxvalue(2f);
        });
    }


    private boolean insertNewRecord() {
        if (!pregnancy.getUid().equals("")) return true;
        MainApp.pregnancy.populateMeta();
        long rowId = 0;
        try {
            rowId = db.addPregnancy(pregnancy);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        pregnancy.setId(String.valueOf(rowId));
        if (rowId > 0) {
            pregnancy.setUid(pregnancy.getDeviceId() + pregnancy.getId());
            db.updatesPregnancyColumn(TableContracts.PregnancyTable.COLUMN_UID, pregnancy.getUid());
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
            updcount = db.updatesPregnancyColumn(TableContracts.PregnancyTable.COLUMN_SB1, pregnancy.sB1toString());
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
            if (Integer.parseInt(MainApp.mwra.getBs1q6()) > MainApp.preg_count) {

              /*  pregnancy.setBs1q7p1g(null);
                pregnancy.setBs1q7p1d(null);
                pregnancy.setBs1q7p1d96x(null);
                pregnancy.setBs1q7p1b(null);*/
                startActivity(new Intent(this, SectionBS1BActivity.class));
            } else {
                startActivity(new Intent(this, SectionBS1CActivity.class));
            }
            setResult(RESULT_OK);
            finish();
        } else {
            Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
        }
    }



    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }
}