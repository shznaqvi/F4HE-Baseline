package edu.aku.hassannaqvi.f4he_baseline.ui.sections;

import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.form;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
        setupSkips();
    }


    private void setupSkips() {

        /*bi.bs1q1.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (bi.bs1q1.getText().toString().trim().length() < 1) return;
                bi.bs1q5.setMinvalue(Float.parseFloat(bi.bs1q1.getText().toString()));
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });*/

    }


    public void bs1q1SetMax(CharSequence s, int start, int before, int count) {
        Log.w("tag", "bs1q1SetMax " + s);
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
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }
}