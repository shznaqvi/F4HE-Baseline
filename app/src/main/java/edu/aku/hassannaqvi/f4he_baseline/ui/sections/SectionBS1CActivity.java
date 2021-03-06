package edu.aku.hassannaqvi.f4he_baseline.ui.sections;

import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.mwra;

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
import edu.aku.hassannaqvi.f4he_baseline.databinding.ActivitySectionBs1cBinding;
import edu.aku.hassannaqvi.f4he_baseline.ui.EndingActivity;

public class SectionBS1CActivity extends AppCompatActivity {

    private static final String TAG = "SectionBS1AActivity";
    ActivitySectionBs1cBinding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_bs1c);
        bi.setMwra(mwra);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        setupSkips();
        if (MainApp.superuser)
            bi.btnContinue.setText("Review Next");

    }

    private void setupSkips() {
    }


    private boolean updateDB() {
        if (MainApp.superuser) return true;

        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesMWRAColumn(TableContracts.MwraTable.COLUMN_SB1, mwra.sB1toString());
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
        saveDraft();
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, SectionBS2Activity.class));
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    private void saveDraft() {
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        if (!Validator.emptyCheckingContainer(this, bi.GrpName)) return false;

        if (mwra.getBs1q1001().length() > 0 && mwra.getBs1q1002().length() > 0) {
            if (Integer.parseInt(mwra.getBs1q1001()) + Integer.parseInt(mwra.getBs1q1002()) == 0) {
                return Validator.emptyCustomTextBox(this, bi.bs1q1001, "Both Value Can't be ZERO");
            }
        }
        return true;
    }
}