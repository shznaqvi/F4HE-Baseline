package edu.aku.hassannaqvi.f4he_baseline.ui.sections;

import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.child;
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
import edu.aku.hassannaqvi.f4he_baseline.databinding.ActivitySectionCs1ABinding;
import edu.aku.hassannaqvi.f4he_baseline.models.Child;
import edu.aku.hassannaqvi.f4he_baseline.ui.EndingActivity;


public class SectionCS1AActivity extends AppCompatActivity {
    private static final String TAG = "SectionCS1AActivity";
    ActivitySectionCs1ABinding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_cs1_a);
        bi.setForm(form);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        child = new Child();
    }




    private boolean insertNewRecord() {
        if (!child.getUid().equals("")) return true;
        child.populateMeta();

        long rowId = 0;
        try {
            rowId = db.addChild(child);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        child.setId(String.valueOf(rowId));
        if (rowId > 0) {
            child.setUid(child.getDeviceId() + child.getId());
            db.updatesChildColumn(TableContracts.Child_Table.COLUMN_UID, child.getUid());
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
            updcount = db.updatesChildColumn(TableContracts.Child_Table.COLUMN_SC1, child.sC1toString());
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

            if (Integer.valueOf(form.getCs1q02()) > 0) {

                //startActivity(new Intent(this, SectionCS2Activity.class).putExtra("complete", true));
                startActivity(new Intent(this, SectionCS1BActivity.class).putExtra("ecdCount", Integer.valueOf(form.getCs1q02())));
            }
            else{
                startActivity(new Intent(this, SectionCS1CActivity.class).putExtra("ecdCount", Integer.valueOf(form.getCs1q02())));
            }
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