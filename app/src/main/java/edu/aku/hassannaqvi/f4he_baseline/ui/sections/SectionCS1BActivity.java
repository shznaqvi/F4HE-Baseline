package edu.aku.hassannaqvi.f4he_baseline.ui.sections;

import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.child_count;
import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.ecd;
import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.form;

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
import edu.aku.hassannaqvi.f4he_baseline.databinding.ActivitySectionCs1BBinding;
import edu.aku.hassannaqvi.f4he_baseline.ui.EndingActivity;

public class SectionCS1BActivity extends AppCompatActivity {

    private static final String TAG = "SectionCS1Bctivity";
    ActivitySectionCs1BBinding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        child_count = getIntent().getExtras().getInt("ecdCount");
        bi = DataBindingUtil.setContentView(this,R.layout.activity_section_cs1_b);
        bi.setForm(form);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        setupSkips();
    }

    private void setupSkips() {
    }

    private boolean insertNewRecord() {
        if (!ecd.getUid().equals("")) return true;
        MainApp.ecd.populateMeta();

        long rowId = 0;
        try {
            rowId = db.addEcdInfo(ecd);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        ecd.setId(String.valueOf(rowId));
        if (rowId > 0) {
            form.setUid(form.getDeviceId() + ecd.getId());
            db.updatesECDColumn(TableContracts.ECDInfo_Table.COLUMN_UID, ecd.getUid());
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
            updcount = db.updatesECDColumn(TableContracts.ECDInfo_Table.COLUMN_ECDINFO, ecd.ecdInfotoString());
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
        if(!insertNewRecord()) return;
        saveDraft();
        if (updateDB()) {
            finish();
            child_count --;

            if(child_count > 0)
            {
                form.setCs1q02c1(null);
                form.setCs1q02c1n(null);
                form.setCs1q02c1ecd(null);
                form.setCs1q02c1cent(null);
                startActivity(new Intent(this, SectionCS1BActivity.class).putExtra("ecdCount", child_count));
            }else {
                startActivity(new Intent(this, SectionCS1CActivity.class));
            }

        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    private void saveDraft() {
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

}