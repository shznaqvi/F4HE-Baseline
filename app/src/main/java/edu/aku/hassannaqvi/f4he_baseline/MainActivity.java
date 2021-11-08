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
import edu.aku.hassannaqvi.f4he_baseline.database.AndroidDatabaseManager;
import edu.aku.hassannaqvi.f4he_baseline.databinding.ActivityMainBinding;
import edu.aku.hassannaqvi.f4he_baseline.models.Form;
import edu.aku.hassannaqvi.f4he_baseline.ui.IdentificationActivity;
import edu.aku.hassannaqvi.f4he_baseline.ui.SyncActivity;
import edu.aku.hassannaqvi.f4he_baseline.ui.lists.FormsReportCluster;
import edu.aku.hassannaqvi.f4he_baseline.ui.lists.FormsReportDate;
import edu.aku.hassannaqvi.f4he_baseline.ui.lists.FormsReportPending;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionA31Activity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionA32Activity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionB1Activity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionB2Activity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionC1Activity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionC2Activity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionD1Activity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionE1Activity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionF1Activity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionF2Activity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionF3Activity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionG1Activity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionG2Activity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionG3Activity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionG4Activity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionG5Activity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionG6Activity;
import edu.aku.hassannaqvi.f4he_baseline.ui.sections.SectionG7Activity;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding bi;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_main);
        bi.setCallback(this);
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
                startActivity(new Intent(this, SectionA31Activity.class));
                break;
            case R.id.seca2:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionA32Activity.class));
                break;

            case R.id.seca3:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionB1Activity.class));
                break;
            case R.id.secb1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionB2Activity.class));
                break;
            case R.id.secc1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionC1Activity.class));
                break;
            case R.id.secc2:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionC2Activity.class));
                break;
            case R.id.secd1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionD1Activity.class));
                break;
            case R.id.sece1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionE1Activity.class));
                break;
            case R.id.secf1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF1Activity.class));
                break;
            case R.id.secf2:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF2Activity.class));
                break;
            case R.id.secf3:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF3Activity.class));
                break;
            case R.id.secg1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionG1Activity.class));
                break;
            case R.id.secg2:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionG2Activity.class));
                break;
            case R.id.secg3:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionG3Activity.class));
                break;
            case R.id.secg4:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionG4Activity.class));
                break;
            case R.id.secg5:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionG5Activity.class));
                break;
            case R.id.secg6:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionG6Activity.class));
                break;
            case R.id.secg7:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionG7Activity.class));
                break;
            case R.id.dbManager:
                startActivity(new Intent(this, AndroidDatabaseManager.class));
                break;


        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = null;
        switch (item.getItemId()) {
            case R.id.action_database:
                intent = new Intent(MainActivity.this, AndroidDatabaseManager.class);
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
                intent = new Intent(MainActivity.this, FormsReportDate.class);
                startActivity(intent);
                break;
            case R.id.formsReportCluster:
                intent = new Intent(MainActivity.this, FormsReportCluster.class);
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