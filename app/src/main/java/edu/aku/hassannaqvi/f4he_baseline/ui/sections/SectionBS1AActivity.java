package edu.aku.hassannaqvi.f4he_baseline.ui.sections;

import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.familyMembers;
import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.form;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.f4he_baseline.MainActivity;
import edu.aku.hassannaqvi.f4he_baseline.R;
import edu.aku.hassannaqvi.f4he_baseline.core.MainApp;
import edu.aku.hassannaqvi.f4he_baseline.database.DatabaseHelper;
import edu.aku.hassannaqvi.f4he_baseline.databinding.ActivitySectionBs1aBinding;

public class SectionBS1AActivity extends AppCompatActivity {
    private static final String TAG = "SectionBS1Activity";
    ActivitySectionBs1aBinding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_bs1a);
        bi.setForm(form);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
    }



    private boolean updateDB() {
       /* db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesFormColumn(TableContracts.FormsTable.COLUMN_SB1, form.sB1toString());
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
        saveDraft();
        if (updateDB()) {
            finish();
            if (Integer.valueOf(form.getBs1q6()) > 0 || Integer.valueOf(form.getBs1q3()) > 0) {
                //startActivity(new Intent(this, SectionBS2Activity.class).putExtra("complete", true));
                startActivity(new Intent(this, SectionBS1BActivity.class).putExtra("count", Integer.valueOf(form.getBs1q6())));
            } else {
                startActivity(new Intent(this, SectionBS2Activity.class));
            }
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    private void saveDraft() {
    }


    public void btnEnd(View view) {
        finish();
        //startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
        startActivity(new Intent(this, MainActivity.class));
    }


    private boolean formValidation() {
        if (!Validator.emptyCheckingContainer(this, bi.GrpName)) return false;

        //TODO: Need to Identify MWRA by ID
        if (familyMembers.getHl6y().length() > 0 && form.getBs1q1().length() > 0) {
            if (Integer.parseInt(form.getBs1q1()) >= Integer.parseInt(familyMembers.getHl6y())) {
                return Validator.emptyCustomTextBox(this, bi.bs1q1, "Age on marriage must be Less Than age given in Roster");
            }
        }

        if (form.getBs1q1().length() > 0 && form.getBs1q5().length() > 0) {
            if (Integer.parseInt(form.getBs1q1()) >= Integer.parseInt(form.getBs1q5())) {
                return Validator.emptyCustomTextBox(this, bi.bs1q5, "Must Be Greater Than BS1Q1");
            }
        }

        if (form.getBs1q3().length() > 0 && form.getBs1q6().length() > 0) {
            if (Integer.parseInt(form.getBs1q6()) > Integer.parseInt(form.getBs1q3())) {
                return Validator.emptyCustomTextBox(this, bi.bs1q6, "Must be Less Than BS1Q3");
            }
        }

        return true;
    }
}