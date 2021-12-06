package edu.aku.hassannaqvi.f4he_baseline.ui.sections;

import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.child;
import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.selectedChildName;

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
import edu.aku.hassannaqvi.f4he_baseline.databinding.ActivitySectionCs4Binding;
import edu.aku.hassannaqvi.f4he_baseline.ui.EndingActivity;

public class SectionCS4Activity extends AppCompatActivity {
    private static final String TAG = "SectionCS4Activity";
    ActivitySectionCs4Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_cs4);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        child.setCs4q01(MainApp.ageOfIndexChild < 1 ? "1" : "2");
        bi.setChild(child);
        if (MainApp.superuser)
            bi.btnContinue.setText("Review Next");

        bi.cs4q02t1.setText(String.format(getResources().getString(R.string.cs4q02t1), selectedChildName));
        bi.cs4q02ainfo.setText(String.format(getResources().getString(R.string.cs4q02ainfo), selectedChildName));
        bi.cs4q02binfo.setText(String.format(getResources().getString(R.string.cs4q02binfo), selectedChildName));
        bi.cs4q02cinfo.setText(String.format(getResources().getString(R.string.cs4q02cinfo), selectedChildName));
        bi.cs4q02dinfo.setText(String.format(getResources().getString(R.string.cs4q02dinfo), selectedChildName));
        bi.cs4q02einfo.setText(String.format(getResources().getString(R.string.cs4q02einfo), selectedChildName));
        bi.cs4q02finfo.setText(String.format(getResources().getString(R.string.cs4q02finfo), selectedChildName));
        bi.cs4q02ginfo.setText(String.format(getResources().getString(R.string.cs4q02ginfo), selectedChildName));
        bi.cs4q02hinfo.setText(String.format(getResources().getString(R.string.cs4q02hinfo), selectedChildName));
        bi.cs4q02iinfo.setText(String.format(getResources().getString(R.string.cs4q02iinfo), selectedChildName));
        bi.cs4q02jinfo.setText(String.format(getResources().getString(R.string.cs4q02jinfo), selectedChildName));
        bi.cs4q02kinfo.setText(String.format(getResources().getString(R.string.cs4q02kinfo), selectedChildName));
    }


    private boolean updateDB() {
        if (MainApp.superuser) return true;

        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesChildColumn(TableContracts.ChildTable.COLUMN_SC4, child.sC4toString());
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
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, SectionCS5Activity.class));
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