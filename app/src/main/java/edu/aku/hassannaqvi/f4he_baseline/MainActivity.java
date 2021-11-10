package edu.aku.hassannaqvi.f4he_baseline;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import edu.aku.hassannaqvi.f4he_baseline.core.MainApp;
import edu.aku.hassannaqvi.f4he_baseline.database.AndroidManager;
import edu.aku.hassannaqvi.f4he_baseline.databinding.ActivityMainBinding;
import edu.aku.hassannaqvi.f4he_baseline.models.Form;
import edu.aku.hassannaqvi.f4he_baseline.ui.IdentificationActivity;
import edu.aku.hassannaqvi.f4he_baseline.ui.SyncActivity;
import edu.aku.hassannaqvi.f4he_baseline.ui.lists.FormsReportPending;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionAS1Activity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionAS2Activity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionBS1Activity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionBS2Activity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionBS3Activity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionBS4AActivity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionBS4BActivity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionBS5Activity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionBS6Activity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionBS7Activity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionCS1Activity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionCS2Activity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionCS3AActivity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionCS3BActivity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionCS4Activity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionCS5Activity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionDS1Activity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionDS2Activity;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding bi;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setSupportActionBar(bi.toolbar);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        //getSupportActionBar().setIcon(R.drawable.app_icon);
        bi.adminView.setVisibility(MainApp.admin ? View.VISIBLE : View.GONE);
        bi.toolbar.setSubtitle("Welcome, " + MainApp.user.getFullname() + (MainApp.admin ? " (Admin)" : "") + "!");
    }

    public void sectionPress(View view) {

        switch (view.getId()) {
            case R.id.openForm:
                MainApp.idType = 1;
                break;
        /*    case R.id.openAnthro:
                MainApp.idType = 2;
                break;

            case R.id.updateBlood:
                MainApp.idType = 3;
                break;

            case R.id.updateStool:
                MainApp.idType = 4;
                break;*/
            default:
                MainApp.idType = 0;

        }


        switch (view.getId()) {

            case R.id.openForm:

                MainApp.form = new Form();
                startActivity(new Intent(this, IdentificationActivity.class));
                break;
        /*    case R.id.openAnthro:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionA2Activity.class));
                break;*/
            case R.id.seca1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionAS1Activity.class));
                break;
            case R.id.seca2:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionAS2Activity.class));
                break;

            case R.id.seca3:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionBS1Activity.class));
                break;
            case R.id.secb1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionBS2Activity.class));
                break;
            case R.id.secc1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionBS3Activity.class));
                break;
            case R.id.secc2:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionBS4AActivity.class));
                break;
            case R.id.secd1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionBS4BActivity.class));
                break;
            case R.id.sece1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionBS5Activity.class));
                break;
            case R.id.secf1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionBS6Activity.class));
                break;
            case R.id.secf2:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionBS7Activity.class));
                break;
            case R.id.secf3:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionCS1Activity.class));
                break;
            case R.id.secg1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionCS2Activity.class));
                break;
            case R.id.secg2:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionCS3AActivity.class));
                break;
            case R.id.secg3:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionCS3BActivity.class));
                break;
            case R.id.secg4:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionCS4Activity.class));
                break;
            case R.id.secg5:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionCS5Activity.class));
                break;
            case R.id.secg6:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionDS1Activity.class));
                break;
            case R.id.secg7:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionDS2Activity.class));
                break;
            case R.id.dbManager:
                startActivity(new Intent(this, AndroidManager.class));
                break;


        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = null;
        switch (item.getItemId()) {
            case R.id.action_database:
                //intent = new Intent(MainActivity.this, AndroidDatabaseManager.class);
                startActivity(intent);
                break;
            case R.id.onSync:
                intent = new Intent(MainActivity.this, SyncActivity.class);
                startActivity(intent);
                break;
            case R.id.checkPendingForms:
                intent = new Intent(MainActivity.this, FormsReportPending.class);
                startActivity(intent);
                break;
            case R.id.formsReportDate:
                //intent = new Intent(MainActivity.this, FormsReportDate.class);
                startActivity(intent);
                break;
            case R.id.formsReportCluster:
                //intent = new Intent(MainActivity.this, FormsReportCluster.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.item_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

}