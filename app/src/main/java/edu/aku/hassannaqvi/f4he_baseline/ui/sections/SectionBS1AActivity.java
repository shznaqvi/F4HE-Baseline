package edu.aku.hassannaqvi.f4he_baseline.ui.sections;

import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.adolListAll;
import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.adolListFemale;
import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.adolListMale;
import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.familyMember;
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
import edu.aku.hassannaqvi.f4he_baseline.databinding.ActivitySectionBs1aBinding;
import edu.aku.hassannaqvi.f4he_baseline.models.MWRA;
import edu.aku.hassannaqvi.f4he_baseline.ui.EndingActivity;

public class SectionBS1AActivity extends AppCompatActivity {
    private static final String TAG = "SectionBS1Activity";
    ActivitySectionBs1aBinding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_bs1a);
        db = MainApp.appInfo.getDbHelper();

        try {
            MainApp.mwra = db.getMwraByUUid();
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(MWRA): " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }

        if (MainApp.mwra == null) MainApp.mwra = new MWRA();
        bi.setMwra(MainApp.mwra);
        mwra.setBs1respline(MainApp.familyList.get(Integer.parseInt(MainApp.selectedMWRA)).getHl1());
        mwra.setBs1resp(MainApp.familyList.get(Integer.parseInt(MainApp.selectedMWRA)).getHl2());
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        adolListAll.addAll(adolListFemale);
        adolListAll.addAll(adolListMale);
    }


    private boolean insertNewRecord() {
        if (!mwra.getUid().equals("")) return true;
        mwra.populateMeta();

        long rowId = 0;
        try {
            rowId = db.addMWRA(mwra);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        mwra.setId(String.valueOf(rowId));
        if (rowId > 0) {
            mwra.setUid(mwra.getDeviceId() + mwra.getId());
            db.updatesMWRAColumn(TableContracts.MwraTable.COLUMN_UID, mwra.getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private boolean updateDB() {
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
        if (!insertNewRecord()) return;
        if (updateDB()) {
            finish();
            if (mwra.getBs1con().equals("2"))
                startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
            else
                startActivity(new Intent(this, SectionBS1BActivity.class));

        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        if (!Validator.emptyCheckingContainer(this, bi.GrpName)) return false;

        //TODO: Need to Identify MWRA by ID
        if (familyMember.getHl6y().length() > 0 && mwra.getBs1q1().length() > 0) {
            if (Integer.parseInt(mwra.getBs1q1()) >= Integer.parseInt(familyMember.getHl6y())) {
                return Validator.emptyCustomTextBox(this, bi.bs1q1, "Age on marriage must be Less Than age given in Roster");
            }
        }

        if (mwra.getBs1q1().length() > 0 && mwra.getBs1q5().length() > 0) {
            if (Integer.parseInt(mwra.getBs1q1()) > Integer.parseInt(mwra.getBs1q5())) {
                return Validator.emptyCustomTextBox(this, bi.bs1q5, "Must Be Greater Than BS1Q1");
            }
        }

        if (mwra.getBs1q3().length() > 0 && mwra.getBs1q6().length() > 0) {
            if (Integer.parseInt(mwra.getBs1q6()) > Integer.parseInt(mwra.getBs1q3())) {
                return Validator.emptyCustomTextBox(this, bi.bs1q6, "Must be Less Than BS1Q3");
            }
        }

        return true;
    }
}