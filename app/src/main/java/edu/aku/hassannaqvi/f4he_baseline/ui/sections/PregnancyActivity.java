package edu.aku.hassannaqvi.f4he_baseline.ui.sections;

import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.form;
import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.pregnancy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.f4he_baseline.MainActivity;
import edu.aku.hassannaqvi.f4he_baseline.R;
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts;
import edu.aku.hassannaqvi.f4he_baseline.core.MainApp;
import edu.aku.hassannaqvi.f4he_baseline.database.DatabaseHelper;
import edu.aku.hassannaqvi.f4he_baseline.databinding.ActivityPregnancyBinding;

public class PregnancyActivity extends AppCompatActivity {

    private static final String TAG = "PregnancyActivity";
    ActivityPregnancyBinding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        MainApp.preg_count = getIntent().getExtras().getInt("count");
            super.onCreate(savedInstanceState);
            bi = DataBindingUtil.setContentView(this, R.layout.activity_pregnancy);
            bi.setForm(MainApp.form);
            setSupportActionBar(bi.toolbar);
            db = MainApp.appInfo.dbHelper;
            setupSkips();
            }

    private void setupSkips() {
    }



    private boolean insertNewRecord() {
        /*if (!pregnancy.getUid().equals("")) return true;
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
            db.updatesPregnancyColumn(TableContracts.Pregnancy_Table.COLUMN_UID, pregnancy.getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }*/
        return true;
    }

    private boolean updateDB() {
        /*db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesPregnancyColumn(TableContracts.Pregnancy_Table.COLUMN_SB1, pregnancy.sB1toString());
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, R.string.upd_db + e.getMessage());
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount > 0) return true;
        else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }*/
        return true;
    }

    public void btnContinue(View view) {
        if (!formValidation()) return;
        //updateMemCategory();
        if (!insertNewRecord()) return;
        // saveDraft();
        if (updateDB()) {
            finish();
            MainApp.preg_count --;
            if(MainApp.preg_count > 0)
            {

                form.setBs1q7p1g(null);
                form.setBs1q7p1d(null);
                form.setBs1q7p1d96x(null);
                form.setBs1q7p1b(null);
                startActivity(new Intent(this, PregnancyActivity.class).putExtra("count", MainApp.preg_count));
            }else {
                startActivity(new Intent(this, SectionBS1AActivity.class));
            }
            setResult(RESULT_OK);
            finish();
        } else {
            Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
        }
    }


    private void saveDraft() {
    }


    public void btnEnd(View view) {
        finish();
        //startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
        startActivity(new Intent(this, MainActivity.class));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }
}