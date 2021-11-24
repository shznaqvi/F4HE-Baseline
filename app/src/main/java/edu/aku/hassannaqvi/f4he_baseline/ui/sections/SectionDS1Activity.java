package edu.aku.hassannaqvi.f4he_baseline.ui.sections;

import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.ladol;
import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.motherKAP;

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
import edu.aku.hassannaqvi.f4he_baseline.databinding.ActivitySectionDs1Binding;
import edu.aku.hassannaqvi.f4he_baseline.models.LateAdolescent;
import edu.aku.hassannaqvi.f4he_baseline.models.MotherKAP;
import edu.aku.hassannaqvi.f4he_baseline.ui.EndingActivity;

public class SectionDS1Activity extends AppCompatActivity {
    private static final String TAG = "SectionDS1Activity";
    ActivitySectionDs1Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_ds1);

        motherKAP = new MotherKAP();
        ladol = new LateAdolescent();

        motherKAP.setDs1q01(MainApp.familyList.get(Integer.parseInt(MainApp.selectedChild)).getHl2());
        motherKAP.setDs1q02(MainApp.familyList.get(Integer.parseInt(MainApp.selectedChild)).getHl1());
        bi.setMKap(MainApp.motherKAP);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
    }


    private boolean insertNewRecord() {
        if (!motherKAP.getUid().equals("")) return true;
        motherKAP.populateMeta();
        long rowId = 0;
        try {
            rowId = db.addMotherKap(motherKAP);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        motherKAP.setId(String.valueOf(rowId));
        if (rowId > 0) {
            motherKAP.setUid(motherKAP.getDeviceId() + motherKAP.getId());
            db.updatesAdolColumn(TableContracts.LateAdolescentTable.COLUMN_UID, motherKAP.getUid());
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
            updcount = db.updatesMotherKAPColumn(TableContracts.MotherKAPTable.COLUMN_SD1, MainApp.motherKAP.sD1toString());
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
            startActivity(new Intent(this, SectionDS2Activity.class));
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