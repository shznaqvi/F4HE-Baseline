package edu.aku.hassannaqvi.f4he_baseline.ui.sections;

import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.child_count;
import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.ecdInfo;
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
//        child_count = getIntent().getExtras().getInt("ecdCount");
        MainApp.ecdCount++;
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_cs1_b);
        db = MainApp.appInfo.dbHelper;
        try {
            ecdInfo = db.getECDataByUUid(String.valueOf(MainApp.ecdCount++));
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(ECDInfo): " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }

//        if (MainApp.mwra == null) MainApp.mwra = new MWRA();
        bi.setEcdInfo(MainApp.ecdInfo);
        setSupportActionBar(bi.toolbar);

        child_count++;
    }


    private boolean insertNewRecord() {
        if (!ecdInfo.getUid().equals("")) return true;
        MainApp.ecdInfo.populateMeta();

        long rowId = 0;
        try {
            rowId = db.addEcdInfo(ecdInfo);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        ecdInfo.setId(String.valueOf(rowId));
        if (rowId > 0) {
            form.setUid(form.getDeviceId() + ecdInfo.getId());
            db.updatesECDColumn(TableContracts.ECDInfoTable.COLUMN_UID, ecdInfo.getUid());
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
            updcount = db.updatesECDColumn(TableContracts.ECDInfoTable.COLUMN_ECDINFO, ecdInfo.ecdInfotoString());
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
            if (Integer.parseInt(MainApp.child.getCs1q02()) > child_count) {
                startActivity(new Intent(this, SectionCS1BActivity.class).putExtra("ecdCount", child_count));
            } else {
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