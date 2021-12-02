package edu.aku.hassannaqvi.f4he_baseline.database;


import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.IBAHC;
import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.child;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import android.util.Log;

import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteOpenHelper;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts.ChildTable;
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts.ECDInfoTable;
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts.EntryLogTable;
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts.FamilyMembersTable;
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts.FormsTable;
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts.LateAdolescentTable;
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts.MotherKAPTable;
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts.MwraTable;
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts.PregnancyTable;
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts.UsersTable;
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts.VersionTable;
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts.VillagesTable;
import edu.aku.hassannaqvi.f4he_baseline.core.MainApp;
import edu.aku.hassannaqvi.f4he_baseline.models.Child;
import edu.aku.hassannaqvi.f4he_baseline.models.ECDInfo;
import edu.aku.hassannaqvi.f4he_baseline.models.EntryLog;
import edu.aku.hassannaqvi.f4he_baseline.models.FamilyMembers;
import edu.aku.hassannaqvi.f4he_baseline.models.Form;
import edu.aku.hassannaqvi.f4he_baseline.models.LateAdolescent;
import edu.aku.hassannaqvi.f4he_baseline.models.MWRA;
import edu.aku.hassannaqvi.f4he_baseline.models.MotherKAP;
import edu.aku.hassannaqvi.f4he_baseline.models.Pregnancy;
import edu.aku.hassannaqvi.f4he_baseline.models.Users;
import edu.aku.hassannaqvi.f4he_baseline.models.VersionApp;
import edu.aku.hassannaqvi.f4he_baseline.models.Villages;



/*import edu.aku.hassannaqvi.naunehal.models.Immunization;*/

/**
 * @author hassan.naqvi on 11/30/2016.
 * @update ali azaz on 01/07/21
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    private final String TAG = "DatabaseHelper";
    public static final String DATABASE_NAME = PROJECT_NAME + ".db";
    public static final String DATABASE_COPY = PROJECT_NAME + "_copy.db";
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_PASSWORD = IBAHC;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CreateTable.SQL_CREATE_USERS);
        db.execSQL(CreateTable.SQL_CREATE_VILLAGES);
        //db.execSQL(SQL_CREATE_RANDOM);
        db.execSQL(CreateTable.SQL_CREATE_FORMS);
        db.execSQL(CreateTable.SQL_CREATE_ENTRYLOGS);
        db.execSQL(CreateTable.SQL_CREATE_MWRA);
        db.execSQL(CreateTable.SQL_CREATE_PREGNANCY);
        db.execSQL(CreateTable.SQL_CREATE_ADOLESCENT);
        db.execSQL(CreateTable.SQL_CREATE_CHILD);
        db.execSQL(CreateTable.SQL_CREATE_ECDINFO);

        db.execSQL(CreateTable.SQL_CREATE_FAMILYMEMBERS);
        db.execSQL(CreateTable.SQL_CREATE_MOTHER_KAP);
        db.execSQL(CreateTable.SQL_CREATE_VERSIONAPP);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        switch (oldVersion) {
            case 1:
            case 2:
        }
    }


    //ADDITION in DB
    public Long addForm(Form form) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_PROJECT_NAME, form.getProjectName());
        values.put(FormsTable.COLUMN_UID, form.getUid());
        values.put(FormsTable.COLUMN_PSU_CODE, form.getPsuCode());
        values.put(FormsTable.COLUMN_HHID, form.getHhid());
        values.put(FormsTable.COLUMN_SNO, form.getSno());
        values.put(FormsTable.COLUMN_USERNAME, form.getUserName());
        values.put(FormsTable.COLUMN_SYSDATE, form.getSysDate());
        values.put(FormsTable.COLUMN_SA1, form.sA1toString());
        values.put(FormsTable.COLUMN_ISTATUS, form.getiStatus());
        values.put(FormsTable.COLUMN_DEVICETAGID, form.getDeviceTag());
        values.put(FormsTable.COLUMN_ENTRY_TYPE, form.getEntryType());
        values.put(FormsTable.COLUMN_DEVICEID, form.getDeviceId());
        values.put(FormsTable.COLUMN_APPVERSION, form.getAppver());
        values.put(FormsTable.COLUMN_SYNCED, form.getSynced());
        values.put(FormsTable.COLUMN_SYNCED_DATE, form.getSyncDate());

        long newRowId;
        newRowId = db.insert(
                FormsTable.TABLE_NAME,
                FormsTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addEntryLog(EntryLog entryLog) {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(EntryLogTable.COLUMN_PROJECT_NAME, entryLog.getProjectName());
        values.put(EntryLogTable.COLUMN_UUID, entryLog.getUuid());
        values.put(EntryLogTable.COLUMN_PSU_CODE, entryLog.getPsuCode());
        values.put(EntryLogTable.COLUMN_HHID, entryLog.getHhid());
        values.put(EntryLogTable.COLUMN_USERNAME, entryLog.getUserName());
        values.put(EntryLogTable.COLUMN_SYSDATE, entryLog.getSysDate());
        values.put(EntryLogTable.COLUMN_ISTATUS, entryLog.getiStatus());
        values.put(EntryLogTable.COLUMN_ENTRY_TYPE, entryLog.getEntryType());
        values.put(EntryLogTable.COLUMN_APPVERSION, entryLog.getAppver());
        values.put(EntryLogTable.COLUMN_SYNCED, entryLog.getSynced());
        values.put(EntryLogTable.COLUMN_SYNCED_DATE, entryLog.getSyncDate());

        long newRowId;
        newRowId = db.insert(
                EntryLogTable.TABLE_NAME,
                EntryLogTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addMWRA(MWRA mwra) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(MwraTable.COLUMN_PROJECT_NAME, mwra.getProjectName());
        values.put(MwraTable.COLUMN_UID, mwra.getUid());
        values.put(MwraTable.COLUMN_UUID, mwra.getUuid());
        values.put(MwraTable.COLUMN_FMUID, mwra.getFmuid());
        values.put(MwraTable.COLUMN_MUID, mwra.getMuid());
        values.put(MwraTable.COLUMN_SNO, mwra.getSno());
        values.put(MwraTable.COLUMN_PSU_CODE, mwra.getpsuCode());
        values.put(MwraTable.COLUMN_HHID, mwra.getHhid());
        values.put(MwraTable.COLUMN_USERNAME, mwra.getUserName());
        values.put(MwraTable.COLUMN_SYSDATE, mwra.getSysDate());
        values.put(MwraTable.COLUMN_SB1, mwra.sB1toString());
        values.put(MwraTable.COLUMN_SB2, mwra.sB2toString());
        values.put(MwraTable.COLUMN_SB3, mwra.sB3toString());
        values.put(MwraTable.COLUMN_SB41, mwra.sB41toString());
        values.put(MwraTable.COLUMN_SB42, mwra.sB42toString());
        values.put(MwraTable.COLUMN_SB5, mwra.sB5toString());
        values.put(MwraTable.COLUMN_SB6, mwra.sB6toString());
        values.put(MwraTable.COLUMN_SB7, mwra.sB7toString());
        values.put(MwraTable.COLUMN_ISTATUS, mwra.getiStatus());
        values.put(MwraTable.COLUMN_DEVICETAGID, mwra.getDeviceTag());
        values.put(MwraTable.COLUMN_DEVICEID, mwra.getDeviceId());
        values.put(MwraTable.COLUMN_APPVERSION, mwra.getAppver());
        values.put(MwraTable.COLUMN_SYNCED, mwra.getSynced());
        values.put(MwraTable.COLUMN_SYNCED_DATE, mwra.getSyncDate());

        long newRowId;
        newRowId = db.insert(
                MwraTable.TABLE_NAME,
                MwraTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addChild(Child child) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(ChildTable.COLUMN_PROJECT_NAME, child.getProjectName());
        values.put(ChildTable.COLUMN_UID, child.getUid());
        values.put(ChildTable.COLUMN_UUID, child.getUuid());
        values.put(ChildTable.COLUMN_FMUID, child.getUuid());
        values.put(ChildTable.COLUMN_MUID, child.getMuid());
        values.put(ChildTable.COLUMN_SNO, child.getSno());
        values.put(ChildTable.COLUMN_PSU_CODE, child.getpsuCode());
        values.put(ChildTable.COLUMN_HHID, child.getHhid());
        values.put(ChildTable.COLUMN_USERNAME, child.getUserName());
        values.put(ChildTable.COLUMN_SYSDATE, child.getSysDate());
        values.put(ChildTable.COLUMN_SC1, child.sC1toString());
        values.put(ChildTable.COLUMN_SC2, child.sC2toString());
        values.put(ChildTable.COLUMN_SC31, child.sC31toString());
        values.put(ChildTable.COLUMN_SC32, child.sC32toString());
        values.put(ChildTable.COLUMN_SC4, child.sC4toString());
        values.put(ChildTable.COLUMN_SC5, child.sC5toString());
        values.put(ChildTable.COLUMN_ISTATUS, child.getiStatus());
        values.put(ChildTable.COLUMN_DEVICETAGID, child.getDeviceTag());
        values.put(ChildTable.COLUMN_DEVICEID, child.getDeviceId());
        values.put(ChildTable.COLUMN_APPVERSION, child.getAppver());
        values.put(ChildTable.COLUMN_SYNCED, child.getSynced());
        values.put(ChildTable.COLUMN_SYNCED_DATE, child.getSyncDate());
        long newRowId;
        newRowId = db.insert(
                ChildTable.TABLE_NAME,
                ChildTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addAdolescent(LateAdolescent adol) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(LateAdolescentTable.COLUMN_PROJECT_NAME, adol.getProjectName());
        values.put(LateAdolescentTable.COLUMN_UID, adol.getUid());
        values.put(LateAdolescentTable.COLUMN_UUID, adol.getUuid());
        values.put(LateAdolescentTable.COLUMN_PSU_CODE, adol.getpsuCode());
        values.put(LateAdolescentTable.COLUMN_HHID, adol.getHhid());
        values.put(LateAdolescentTable.COLUMN_USERNAME, adol.getUserName());
        values.put(LateAdolescentTable.COLUMN_SYSDATE, adol.getSysDate());
        values.put(LateAdolescentTable.COLUMN_SE1, adol.sE1toString());
        values.put(LateAdolescentTable.COLUMN_SE2, adol.sE2toString());
        values.put(LateAdolescentTable.COLUMN_SE3, adol.sE3toString());
        values.put(LateAdolescentTable.COLUMN_SE4, adol.sE4toString());
        values.put(LateAdolescentTable.COLUMN_ISTATUS, adol.getiStatus());
        values.put(LateAdolescentTable.COLUMN_DEVICETAGID, adol.getDeviceTag());
        values.put(LateAdolescentTable.COLUMN_DEVICEID, adol.getDeviceId());
        values.put(LateAdolescentTable.COLUMN_APPVERSION, adol.getAppver());
        values.put(LateAdolescentTable.COLUMN_SYNCED, adol.getSynced());
        values.put(LateAdolescentTable.COLUMN_SYNCED_DATE, adol.getSyncDate());
        long newRowId;
        newRowId = db.insert(
                LateAdolescentTable.TABLE_NAME,
                LateAdolescentTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addPregnancy(Pregnancy preg) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(PregnancyTable.COLUMN_PROJECT_NAME, preg.getProjectName());
        values.put(PregnancyTable.COLUMN_UID, preg.getUid());
        values.put(PregnancyTable.COLUMN_UUID, preg.getUuid());
        values.put(PregnancyTable.COLUMN_MUID, preg.getMuid());
        values.put(PregnancyTable.COLUMN_PSU_CODE, preg.getpsuCode());
        values.put(PregnancyTable.COLUMN_HHID, preg.getHhid());
        values.put(PregnancyTable.COLUMN_SNO, preg.getSno());
        values.put(PregnancyTable.COLUMN_USERNAME, preg.getUserName());
        values.put(PregnancyTable.COLUMN_SYSDATE, preg.getSysDate());
        values.put(PregnancyTable.COLUMN_SB1, preg.sB1toString());
        values.put(PregnancyTable.COLUMN_ISTATUS, preg.getiStatus());
        values.put(PregnancyTable.COLUMN_DEVICETAGID, preg.getDeviceTag());
        values.put(PregnancyTable.COLUMN_DEVICEID, preg.getDeviceId());
        values.put(PregnancyTable.COLUMN_APPVERSION, preg.getAppver());
        values.put(PregnancyTable.COLUMN_SYNCED, preg.getSynced());
        values.put(PregnancyTable.COLUMN_SYNCED_DATE, preg.getSyncDate());

        long newRowId;
        newRowId = db.insert(
                PregnancyTable.TABLE_NAME,
                PregnancyTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addEcdInfo(ECDInfo ecd) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(ECDInfoTable.COLUMN_PROJECT_NAME, ecd.getProjectName());
        values.put(ECDInfoTable.COLUMN_UID, ecd.getUid());
        values.put(ECDInfoTable.COLUMN_UUID, ecd.getUuid());
        values.put(ECDInfoTable.COLUMN_PSU_CODE, ecd.getpsuCode());
        values.put(ECDInfoTable.COLUMN_HHID, ecd.getHhid());
        values.put(ECDInfoTable.COLUMN_USERNAME, ecd.getUserName());
        values.put(ECDInfoTable.COLUMN_SYSDATE, ecd.getSysDate());
        values.put(ECDInfoTable.COLUMN_ECDINFO, ecd.ecdInfotoString());
        values.put(ECDInfoTable.COLUMN_ISTATUS, ecd.getiStatus());
        values.put(ECDInfoTable.COLUMN_DEVICETAGID, ecd.getDeviceTag());
        values.put(ECDInfoTable.COLUMN_DEVICEID, ecd.getDeviceId());
        values.put(ECDInfoTable.COLUMN_APPVERSION, ecd.getAppver());
        values.put(ECDInfoTable.COLUMN_SYNCED, ecd.getSynced());
        values.put(ECDInfoTable.COLUMN_SYNCED_DATE, ecd.getSyncDate());

        long newRowId;
        newRowId = db.insert(
                ECDInfoTable.TABLE_NAME,
                ECDInfoTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addHHMembers(FamilyMembers members) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(FamilyMembersTable.COLUMN_PROJECT_NAME, members.getProjectName());
        values.put(FamilyMembersTable.COLUMN_UID, members.getUid());
        values.put(FamilyMembersTable.COLUMN_UUID, members.getUuid());
        values.put(FamilyMembersTable.COLUMN_PSU_CODE, members.getpsuCode());
        values.put(FamilyMembersTable.COLUMN_HHID, members.getHhid());
        values.put(FamilyMembersTable.COLUMN_SNO, members.getSno());
        values.put(FamilyMembersTable.COLUMN_USERNAME, members.getUserName());
        values.put(FamilyMembersTable.COLUMN_SYSDATE, members.getSysDate());
        values.put(FamilyMembersTable.COLUMN_SA2, members.sA2toString());
        values.put(FamilyMembersTable.COLUMN_ISTATUS, members.getiStatus());
        values.put(FamilyMembersTable.COLUMN_DEVICETAGID, members.getDeviceTag());
        values.put(FamilyMembersTable.COLUMN_DEVICEID, members.getDeviceId());
        values.put(FamilyMembersTable.COLUMN_APPVERSION, members.getAppver());


        long newRowId;
        newRowId = db.insert(
                FamilyMembersTable.TABLE_NAME,
                FamilyMembersTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addMotherKap(MotherKAP motherKAP) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(MotherKAPTable.COLUMN_PROJECT_NAME, motherKAP.getProjectName());
        values.put(MotherKAPTable.COLUMN_UID, motherKAP.getUid());
        values.put(MotherKAPTable.COLUMN_UUID, motherKAP.getUuid());
        values.put(MotherKAPTable.COLUMN_PSU_CODE, motherKAP.getpsuCode());
        values.put(MotherKAPTable.COLUMN_HHID, motherKAP.getHhid());
        values.put(MotherKAPTable.COLUMN_SNO, motherKAP.getSno());
        values.put(MotherKAPTable.COLUMN_USERNAME, motherKAP.getUserName());
        values.put(MotherKAPTable.COLUMN_SYSDATE, motherKAP.getSysDate());
        values.put(MotherKAPTable.COLUMN_SD1, motherKAP.sD1toString());
        values.put(MotherKAPTable.COLUMN_SD2, motherKAP.sD2toString());
        values.put(MotherKAPTable.COLUMN_SD3, motherKAP.sD3toString());
        values.put(MotherKAPTable.COLUMN_ISTATUS, motherKAP.getiStatus());
        values.put(MotherKAPTable.COLUMN_DEVICETAGID, motherKAP.getDeviceTag());
        values.put(MotherKAPTable.COLUMN_DEVICEID, motherKAP.getDeviceId());
        values.put(MotherKAPTable.COLUMN_APPVERSION, motherKAP.getAppver());
        values.put(MotherKAPTable.COLUMN_SYNCED, motherKAP.getSynced());
        values.put(MotherKAPTable.COLUMN_SYNCED_DATE, motherKAP.getSyncDate());
        long newRowId;
        newRowId = db.insert(
                MotherKAPTable.TABLE_NAME,
                MotherKAPTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addFamilyMembers(FamilyMembers members) throws JSONException {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(FamilyMembersTable.COLUMN_PROJECT_NAME, members.getProjectName());
        values.put(FamilyMembersTable.COLUMN_UID, members.getUid());
        values.put(FamilyMembersTable.COLUMN_UUID, members.getUuid());
        values.put(FamilyMembersTable.COLUMN_PSU_CODE, members.getpsuCode());
        values.put(FamilyMembersTable.COLUMN_HHID, members.getHhid());
        values.put(FamilyMembersTable.COLUMN_USERNAME, members.getUserName());
        values.put(FamilyMembersTable.COLUMN_SYSDATE, members.getSysDate());
        values.put(FamilyMembersTable.COLUMN_INDEXED, members.getIndexed());
        values.put(FamilyMembersTable.COLUMN_SA2, members.sA2toString());

        values.put(FamilyMembersTable.COLUMN_ISTATUS, members.getiStatus());

        values.put(FamilyMembersTable.COLUMN_DEVICETAGID, members.getDeviceTag());
        values.put(FamilyMembersTable.COLUMN_DEVICEID, members.getDeviceId());
        values.put(FamilyMembersTable.COLUMN_APPVERSION, members.getAppver());
        values.put(FamilyMembersTable.COLUMN_SYNCED, members.getSynced());
        values.put(FamilyMembersTable.COLUMN_SYNCED_DATE, members.getSyncDate());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                FamilyMembersTable.TABLE_NAME,
                FamilyMembersTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }


    //UPDATE in DB
    public int updatesFormColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = FormsTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.form.getId())};

        return db.update(FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesEntryLogColumn(String column, String value, String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = EntryLogTable._ID + " =? ";
        String[] selectionArgs = {id};

        return db.update(EntryLogTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }


    public int updatesChildColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = ChildTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(child.getId())};

        return db.update(ChildTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesECDColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = ECDInfoTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.ecdInfo.getId())};

        return db.update(ECDInfoTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesPregnancyColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = PregnancyTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.pregnancy.getId())};

        return db.update(PregnancyTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesMWRAColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = MwraTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.mwra.getId())};

        return db.update(MwraTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesAdolColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = LateAdolescentTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.ladol.getId())};

        return db.update(LateAdolescentTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesMotherKAPColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = MotherKAPTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.motherKAP.getId())};

        return db.update(MotherKAPTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesMemberColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = FamilyMembersTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.familyMember.getId())};

        return db.update(FamilyMembersTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updateEnding() {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_ISTATUS, MainApp.form.getiStatus());

        // Which row to update, based on the ID
        String selection = FormsTable.COLUMN_ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.form.getId())};

        return db.update(FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }


    //Functions that dealing with table data
    public boolean doLogin(String username, String password) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = {
                UsersTable.COLUMN_ID,
                UsersTable.COLUMN_USERNAME,
                UsersTable.COLUMN_PASSWORD,
                UsersTable.COLUMN_FULLNAME,
                UsersTable.COLUMN_DESIGNATION,
        };
        String whereClause = UsersTable.COLUMN_USERNAME + "=? AND " + UsersTable.COLUMN_PASSWORD + "=?";
        String[] whereArgs = {username, password};
        String groupBy = null;
        String having = null;
        String orderBy = UsersTable.COLUMN_ID + " ASC";

        Users loggedInUser = null;
        try {
            c = db.query(
                    UsersTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                loggedInUser = new Users().hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        MainApp.user = loggedInUser;
        return c.getCount() > 0;
    }

    public ArrayList<Form> getFormsByDate(String sysdate) {

        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = {
                FormsTable._ID,
                FormsTable.COLUMN_UID,
                FormsTable.COLUMN_SYSDATE,
                FormsTable.COLUMN_USERNAME,
                FormsTable.COLUMN_ISTATUS,
                FormsTable.COLUMN_SYNCED,

        };
        String whereClause = FormsTable.COLUMN_SYSDATE + " Like ? ";
        String[] whereArgs = new String[]{"%" + sysdate + " %"};
        String groupBy = null;
        String having = null;
        String orderBy = FormsTable.COLUMN_ID + " ASC";
        ArrayList<Form> allForms = new ArrayList<>();
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Form forms = new Form();
                forms.setId(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ID)));
                forms.setUid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_UID)));
                forms.setSysDate(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE)));
                forms.setUserName(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_USERNAME)));
                allForms.add(forms);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allForms;
    }


    // istatus examples: (1) or (1,9) or (1,3,5)
    public Form getFormByAssessNo(String uid, String istatus) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = FormsTable.COLUMN_UID + "=? AND " +
                FormsTable.COLUMN_ISTATUS + " in " + istatus;

        String[] whereArgs = {uid};

        String groupBy = null;
        String having = null;

        String orderBy = FormsTable.COLUMN_ID + " ASC";

        Form allFC = null;
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                allFC = new Form().Hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }

    public ArrayList<Cursor> getDatabaseManagerData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase(DATABASE_PASSWORD);
        String[] columns = new String[]{"message"};
        //an array list of cursor to save two cursors one has results from the query
        //other cursor stores error message if any errors are triggered
        ArrayList<Cursor> alc = new ArrayList<Cursor>(2);
        MatrixCursor Cursor2 = new MatrixCursor(columns);
        alc.add(null);
        alc.add(null);

        try {
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(Query, null);

            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {

                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (Exception sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }
    }

    /*public int updateTemp(String assessNo, String temp) {
        SQLiteDatabase db = this.getReadableDatabase();

        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_TSF305, temp);
        values.put(FormsTable.COLUMN_SYSDATE, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()) + "-Updated");
        values.put(FormsTable.COLUMN_ISTATUS, "1");
        values.put(FormsTable.COLUMN_SYNCED, (byte[]) null);

        String selection = FormsTable.COLUMN_ASSESMENT_NO + " =? AND " + FormsTable.COLUMN_ISTATUS + " =? ";
        // String selection = FormsTable.COLUMN_ASSESMENT_NO + " =? ";
        String[] selectionArgs = {assessNo, "9"};
        // String[] selectionArgs = {assessNo};

        return db.update(FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }*/


    public int syncVersionApp(JSONObject VersionList) {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        db.delete(VersionTable.TABLE_NAME, null, null);
        long count = 0;
        try {
            JSONObject jsonObjectCC = ((JSONArray) VersionList.get(VersionTable.COLUMN_VERSION_PATH)).getJSONObject(0);
            VersionApp Vc = new VersionApp();
            Vc.sync(jsonObjectCC);

            ContentValues values = new ContentValues();

            values.put(VersionTable.COLUMN_PATH_NAME, Vc.getPathname());
            values.put(VersionTable.COLUMN_VERSION_CODE, Vc.getVersioncode());
            values.put(VersionTable.COLUMN_VERSION_NAME, Vc.getVersionname());

            count = db.insert(VersionTable.TABLE_NAME, null, values);
            if (count > 0) count = 1;

        } catch (Exception ignored) {
        } finally {
            db.close();
        }

        return (int) count;
    }

    public int syncUser(JSONArray userList) {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        db.delete(UsersTable.TABLE_NAME, null, null);
        int insertCount = 0;
        try {
            for (int i = 0; i < userList.length(); i++) {

                JSONObject jsonObjectUser = userList.getJSONObject(i);

                Users user = new Users();
                user.sync(jsonObjectUser);
                ContentValues values = new ContentValues();

                values.put(UsersTable.COLUMN_USERNAME, user.getUserName());
                values.put(UsersTable.COLUMN_PASSWORD, user.getPassword());
                values.put(UsersTable.COLUMN_FULLNAME, user.getFullname());
                values.put(UsersTable.COLUMN_DESIGNATION, user.getDesignation());
                long rowID = db.insert(UsersTable.TABLE_NAME, null, values);
                if (rowID != -1) insertCount++;
            }

        } catch (Exception e) {
            Log.d(TAG, "syncUser(e): " + e);
            db.close();
        } finally {
            db.close();
        }
        return insertCount;
    }

    public int syncClusters(JSONArray clusterList) {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        db.delete(VillagesTable.TABLE_NAME, null, null);
        int insertCount = 0;
        try {
            for (int i = 0; i < clusterList.length(); i++) {

                JSONObject json = clusterList.getJSONObject(i);

                Villages villages = new Villages();
                villages.sync(json);
                ContentValues values = new ContentValues();

                values.put(VillagesTable.COLUMN_COUNTRY, villages.getCountry());
                values.put(VillagesTable.COLUMN_CCODE, villages.getCcode());
                values.put(VillagesTable.COLUMN_PROVINCE, villages.getProvince());
                values.put(VillagesTable.COLUMN_PROVCODE, villages.getProvcode());
                values.put(VillagesTable.COLUMN_DISTRICT_NAME, villages.getDistrict_name());
                values.put(VillagesTable.COLUMN_DCODE, villages.getDcode());
                values.put(VillagesTable.COLUMN_VILLAGE, villages.getVillage());
                values.put(VillagesTable.COLUMN_VCODE, villages.getVcode());
                values.put(VillagesTable.COLUMN_PSUCODE, villages.getPsucode());


                long rowID = db.insert(VillagesTable.TABLE_NAME, null, values);
                if (rowID != -1) insertCount++;
            }

        } catch (Exception e) {
            Log.d(TAG, "syncClusters(e): " + e);
            db.close();
        } finally {
            db.close();
        }
        return insertCount;
    }

    /*public int syncRandom(JSONArray list) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(RandomTable.TABLE_NAME, null, null);
        int insertCount = 0;
        try {
            for (int i = 0; i < list.length(); i++) {

                JSONObject json = list.getJSONObject(i);

                RandomHH ran = new RandomHH();
                ran.sync(json);
                ContentValues values = new ContentValues();
                values.put(RandomTable.COLUMN_ID, ran.getID());
                values.put(RandomTable.COLUMN_SNO, ran.getSno());
                values.put(RandomTable.COLUMN_ENUM_BLOCK_CODE, ran.getpsuCode());
                values.put(RandomTable.COLUMN_HH_NO, ran.getHhno());
                values.put(RandomTable.COLUMN_HEAD_HH, ran.getHeadhh());
                long rowID = db.insert(RandomTable.TABLE_NAME, null, values);
                if (rowID != -1) insertCount++;
            }

        } catch (Exception e) {
            Log.d(TAG, "syncRandom(e): " + e);
            db.close();
        } finally {
            db.close();
        }
        return insertCount;
    }*/


    //get UnSyncedTables
    public JSONArray getUnsyncedFormHH() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        //whereClause = null;
        whereClause = FormsTable.COLUMN_SYNCED + " = '' AND " +
                FormsTable.COLUMN_ISTATUS + "!= ''";

        String[] whereArgs = null;

        String groupBy = null;
        String having = null;

        String orderBy = FormsTable.COLUMN_ID + " ASC";

        JSONArray allForms = new JSONArray();
        c = db.query(
                FormsTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            /** WorkManager Upload
             /*Form fc = new Form();
             allFC.add(fc.Hydrate(c));*/
            Log.d(TAG, "getUnsyncedFormHH: " + c.getCount());
            Form form = new Form();
            allForms.put(form.Hydrate(c).toJSONObject());


        }

        c.close();
        db.close();

        Log.d(TAG, "getUnsyncedFormHH: " + allForms.toString().length());
        Log.d(TAG, "getUnsyncedFormHH: " + allForms);
        return allForms;
    }

    public JSONArray getUnsyncedFamilyMembers() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause;
        whereClause = FamilyMembersTable.COLUMN_SYNCED + " = '' ";

        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = FamilyMembersTable.COLUMN_ID + " ASC";

        JSONArray all = new JSONArray();
        c = db.query(
                FamilyMembersTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedFamilyMembers: " + c.getCount());
            FamilyMembers fm = new FamilyMembers();
            all.put(fm.Hydrate(c).toJSONObject());
        }

        c.close();

        db.close();

        Log.d(TAG, "getUnsyncedFamilyMembers: " + all.toString().length());
        Log.d(TAG, "getUnsyncedFamilyMembers: " + all);
        return all;
    }

    public JSONArray getUnsyncedMWRA() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause;
        whereClause = MwraTable.COLUMN_SYNCED + " = '' ";

        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = MwraTable.COLUMN_ID + " ASC";

        JSONArray all = new JSONArray();
        c = db.query(
                MwraTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedMWRA: " + c.getCount());
            MWRA mwra = new MWRA();
            all.put(mwra.Hydrate(c).toJSONObject());
        }

        c.close();

        Log.d(TAG, "getUnsyncedMWRA: " + all.toString().length());
        Log.d(TAG, "getUnsyncedMWRA: " + all);
        return all;
    }

    public JSONArray getUnsyncedPregnancy() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause;
        whereClause = PregnancyTable.COLUMN_SYNCED + " = '' ";

        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = PregnancyTable.COLUMN_ID + " ASC";

        JSONArray all = new JSONArray();
        c = db.query(
                PregnancyTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedPregnancy: " + c.getCount());
            Pregnancy preg = new Pregnancy();
            all.put(preg.Hydrate(c).toJSONObject());
        }

        c.close();

        Log.d(TAG, "getUnsyncedPregnancy: " + all.toString().length());
        Log.d(TAG, "getUnsyncedPregnancy: " + all);
        return all;
    }

    public JSONArray getUnsyncedChild() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause;
        whereClause = ChildTable.COLUMN_SYNCED + " = '' ";

        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = ChildTable.COLUMN_ID + " ASC";

        JSONArray allChild = new JSONArray();
        c = db.query(
                ChildTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedChild: " + c.getCount());
            Child ch = new Child();
            allChild.put(ch.Hydrate(c).toJSONObject());
        }

        Log.d(TAG, "getUnsyncedChild: " + allChild.toString().length());
        Log.d(TAG, "getUnsyncedChild: " + allChild);
        return allChild;
    }

    public JSONArray getUnsyncedmotherKAP() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause;
        whereClause = MotherKAPTable.COLUMN_SYNCED + " = '' ";

        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = MotherKAPTable.COLUMN_ID + " ASC";

        JSONArray all = new JSONArray();
        c = db.query(
                MotherKAPTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedmotherKAP: " + c.getCount());
            MotherKAP kap = new MotherKAP();
            all.put(kap.Hydrate(c).toJSONObject());
        }
        Log.d(TAG, "getUnsyncedmotherKAP: " + all.toString().length());
        Log.d(TAG, "getUnsyncedmotherKAP: " + all);
        return all;
    }

    public JSONArray getUnsyncedEcdInfo() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause;
        whereClause = ECDInfoTable.COLUMN_SYNCED + " = '' ";

        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = ECDInfoTable.COLUMN_ID + " ASC";

        JSONArray all = new JSONArray();
        c = db.query(
                ECDInfoTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedEcdInfo: " + c.getCount());
            ECDInfo ecdInfo = new ECDInfo();
            all.put(ecdInfo.Hydrate(c).toJSONObject());
        }
        Log.d(TAG, "getUnsyncedEcdInfo: " + all.toString().length());
        Log.d(TAG, "getUnsyncedEcdInfo: " + all);
        return all;
    }

    public JSONArray getUnsyncedLateAdolescent() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause;
        whereClause = LateAdolescentTable.COLUMN_SYNCED + " = '' ";

        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = LateAdolescentTable.COLUMN_ID + " ASC";

        JSONArray all = new JSONArray();
        c = db.query(
                LateAdolescentTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedLateAdolescent: " + c.getCount());
            LateAdolescent ldol = new LateAdolescent();
            all.put(ldol.Hydrate(c).toJSONObject());
        }
        Log.d(TAG, "getUnsyncedLateAdolescent: " + all.toString().length());
        Log.d(TAG, "getUnsyncedLateAdolescent: " + all);
        return all;
    }

    public JSONArray getUnsyncedEntryLog() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause;
        whereClause = EntryLogTable.COLUMN_SYNCED + " = '' ";

        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = EntryLogTable.COLUMN_ID + " ASC";

        JSONArray all = new JSONArray();
        c = db.query(
                EntryLogTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedEntryLog: " + c.getCount());
            EntryLog entryLog = new EntryLog();
            all.put(entryLog.Hydrate(c).toJSONObject());
        }
        Log.d(TAG, "getUnsyncedEntryLog: " + all.toString().length());
        Log.d(TAG, "getUnsyncedEntryLog: " + all);
        return all;
    }


    //update SyncedTables
    public void updateSyncedFormHH(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_SYNCED, true);
        values.put(FormsTable.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = FormsTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};

        int count = db.update(
                FormsTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedFamilyMembers(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(FamilyMembersTable.COLUMN_SYNCED, true);
        values.put(FamilyMembersTable.COLUMN_SYNCED_DATE, new Date().toString());
        String where = FamilyMembersTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};
        int count = db.update(
                FamilyMembersTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedMWRA(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(MwraTable.COLUMN_SYNCED, true);
        values.put(MwraTable.COLUMN_SYNCED_DATE, new Date().toString());
        String where = MwraTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};
        int count = db.update(
                MwraTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedPregnancy(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(PregnancyTable.COLUMN_SYNCED, true);
        values.put(PregnancyTable.COLUMN_SYNCED_DATE, new Date().toString());
        String where = PregnancyTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};
        int count = db.update(
                PregnancyTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedChild(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(ChildTable.COLUMN_SYNCED, true);
        values.put(ChildTable.COLUMN_SYNCED_DATE, new Date().toString());
        String where = ChildTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};
        int count = db.update(
                ChildTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedmotherKAP(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(MotherKAPTable.COLUMN_SYNCED, true);
        values.put(MotherKAPTable.COLUMN_SYNCED_DATE, new Date().toString());
        String where = MotherKAPTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};
        int count = db.update(
                MotherKAPTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedEcdInfo(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(ECDInfoTable.COLUMN_SYNCED, true);
        values.put(ECDInfoTable.COLUMN_SYNCED_DATE, new Date().toString());
        String where = ECDInfoTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};
        int count = db.update(
                ECDInfoTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedLateAdolescent(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(LateAdolescentTable.COLUMN_SYNCED, true);
        values.put(LateAdolescentTable.COLUMN_SYNCED_DATE, new Date().toString());
        String where = LateAdolescentTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};
        int count = db.update(
                LateAdolescentTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }


    public ArrayList<Cursor> getData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase(DATABASE_PASSWORD);
        String[] columns = new String[]{"message"};
        //an array list of cursor to save two cursors one has results from the query
        //other cursor stores error message if any errors are triggered
        ArrayList<Cursor> alc = new ArrayList<Cursor>(2);
        MatrixCursor Cursor2 = new MatrixCursor(columns);
        alc.add(null);
        alc.add(null);

        try {
            String maxQuery = Query;
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(maxQuery, null);

            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {

                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (SQLException sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        } catch (Exception ex) {
            Log.d("printing exception", ex.getMessage());

            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + ex.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }
    }

    /*public RandomHH checkHousehold(String cluster_no, String hh_no) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;
        String selection = RandomTable.COLUMN_ENUM_BLOCK_CODE + "= ? AND "
                + RandomTable.COLUMN_HH_NO + "= ? ";
        String[] selectionArgs = {cluster_no, hh_no};

        int cCount;
        RandomHH hh = null;
        try {
            c = db.query(
                    RandomTable.TABLE_NAME,
                    columns,
                    selection,
                    selectionArgs,
                    null,
                    null,
                    null
            );
            while (c.moveToNext()) {

                hh = new RandomHH().hydrate(c);

            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }

        return hh;

    }*/

    public Form getFormByPsuHHNo(String psuCode, String hhid) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = FormsTable.COLUMN_PSU_CODE + "=? AND " +
                FormsTable.COLUMN_HHID + " =? ";

        String[] whereArgs = {psuCode, hhid};

        String groupBy = null;
        String having = null;

        String orderBy = FormsTable.COLUMN_ID + " ASC";

        Form form = null;
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                form = new Form().Hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return form;
    }


    public Collection<Form> getFormsByCluster(String cluster) {

        // String sysdate =  spDateT.substring(0, 8).trim()
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause = FormsTable.COLUMN_PSU_CODE + " = ? ";
        String[] whereArgs = new String[]{cluster};
//        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsTable.COLUMN_ID + " ASC";

        Collection<Form> allFC = new ArrayList<>();
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Form fc = new Form();
                fc.setId(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ID)));
                fc.setUid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_UID)));
                fc.setSysDate(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE)));
                fc.setPsuCode(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_PSU_CODE)));
                fc.setHhid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_HHID)));
                fc.setSno(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SNO)));
                fc.setiStatus(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS)));
                fc.setSynced(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED)));
                allFC.add(fc);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }

    public Collection<Form> getTodayForms(String sysdate) {

        // String sysdate =  spDateT.substring(0, 8).trim()
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause = FormsTable.COLUMN_SYSDATE + " Like ? ";
        String[] whereArgs = new String[]{"%" + sysdate + " %"};
//        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;

        String orderBy = FormsTable.COLUMN_ID + " DESC";

        Collection<Form> allFC = new ArrayList<>();
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Form fc = new Form();
                fc.setId(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ID)));
                fc.setUid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_UID)));
                fc.setSysDate(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE)));
                fc.setPsuCode(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_PSU_CODE)));
                fc.setHhid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_HHID)));
                fc.setiStatus(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS)));
                fc.setSynced(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED)));
                allFC.add(fc);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }


    public Collection<Form> getPendingForms() {

        // String sysdate =  spDateT.substring(0, 8).trim()
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause = FormsTable.COLUMN_ISTATUS + " = ?";
        String[] whereArgs = new String[]{""};
//        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;

        String orderBy = FormsTable.COLUMN_ID + " DESC";

        Collection<Form> allFC = new ArrayList<>();
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Form fc = new Form();
                fc.setId(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ID)));
                fc.setUid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_UID)));
                fc.setSysDate(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE)));
                fc.setPsuCode(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_PSU_CODE)));
                fc.setHhid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_HHID)));
                fc.setSno(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SNO)));
                fc.setiStatus(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS)));
                fc.setSynced(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED)));
                allFC.add(fc);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }


    public Villages getVillagesByCode(String psucode) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause = VillagesTable.COLUMN_PSUCODE + " = ?";

        String[] whereArgs = {psucode};

        String groupBy = null;
        String having = null;

        String orderBy = VillagesTable.COLUMN_PSUCODE + " ASC";

        Villages e = new Villages();
        try {
            c = db.query(
                    VillagesTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy
            );
            while (c.moveToNext()) {
                e = new Villages().hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return e;

    }

    /*public RandomHH getHHbyEnumBlocks(String psuCode, String hhno) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;

        String whereClause = RandomTable.COLUMN_ENUM_BLOCK_CODE + " = ? AND " +
                RandomTable.COLUMN_HH_NO + " = ?";

        String[] whereArgs = {psuCode, hhno};

        String groupBy = null;
        String having = null;

        String orderBy = RandomTable.COLUMN_HH_NO + " ASC";

        String limit = "5000";

        RandomHH randHH = new RandomHH();
        try {
            c = db.query(true,
                    RandomTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy,
                    limit
                    // The sort order
            );
            while (c.moveToNext()) {
                randHH = new RandomHH().hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return randHH;
    }*/

    public List<FamilyMembers> getMemberBYUID(String uid) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = FamilyMembersTable.COLUMN_UUID + "=?";

        String[] whereArgs = {uid};

        String groupBy = null;
        String having = null;

        String orderBy = FamilyMembersTable.COLUMN_ID + " ASC";

        ArrayList<FamilyMembers> membersByUID = new ArrayList<>();
        try {
            c = db.query(
                    FamilyMembersTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                FamilyMembers mwra = new FamilyMembers().Hydrate(c);

                membersByUID.add(mwra);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return membersByUID;
    }

    public FamilyMembers getSelectedMemberBYUID(String uid) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = FamilyMembersTable.COLUMN_UUID + "=? AND "
                + FamilyMembersTable.COLUMN_INDEXED + "=?";

        String[] whereArgs = {uid, "1"};

        String groupBy = null;
        String having = null;

        String orderBy = FamilyMembersTable.COLUMN_ID + " ASC";

        FamilyMembers membersByUID = new FamilyMembers();
        try {
            c = db.query(
                    FamilyMembersTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                membersByUID = new FamilyMembers().Hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return membersByUID;
    }

    /*public List<FoodConsumption> getFoodConsumptionBYUID(String uid) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = FoodConsumptionTable.COLUMN_UUID + "=? ";

        String[] whereArgs = {uid};

        String groupBy = null;
        String having = null;

        String orderBy = FoodConsumptionTable.COLUMN_ID + " ASC";

        List<FoodConsumption> foodConsumption = new ArrayList<>();
        try {
            c = db.query(
                    FoodConsumptionTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                foodConsumption.add(new FoodConsumption().Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return foodConsumption;
    }*/

    public int updatesfamilyListColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = FamilyMembersTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.familyMember.getId())};

        return db.update(FamilyMembersTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }


    public Collection<Villages> getAllCountries() {

        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;

        Boolean distinct = true;
        String tableName = VillagesTable.TABLE_NAME;
        String[] columns = null;
        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = VillagesTable.COLUMN_COUNTRY;
        String having = null;
        String orderBy = VillagesTable.COLUMN_COUNTRY + " ASC";
        String limitRows = "9999";

        Collection<Villages> allCountries = new ArrayList<>();
        try {
            c = db.query(
                    distinct,       // Distinct values
                    tableName,      // The table to query
                    columns,        // The columns to return
                    whereClause,    // The columns for the WHERE clause
                    whereArgs,      // The values for the WHERE clause
                    groupBy,        // don't group the rows
                    having,         // don't filter by row groups
                    orderBy,
                    limitRows
            );
            while (c.moveToNext()) {

                allCountries.add(new Villages().hydrate(c));

            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allCountries;
    }

    public Collection<Villages> getProvinceByCountry(String cCode) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;

        Boolean distinct = true;
        String tableName = VillagesTable.TABLE_NAME;
        String[] columns = null;
        String whereClause = VillagesTable.COLUMN_CCODE + "= ?";
        String[] whereArgs = {cCode};
        String groupBy = VillagesTable.COLUMN_PROVINCE;
        String having = null;
        String orderBy = VillagesTable.COLUMN_PROVINCE + " ASC";
        String limitRows = "9999";

        Collection<Villages> allProvinces = new ArrayList<>();
        try {
            c = db.query(
                    distinct,       // Distinct values
                    tableName,      // The table to query
                    columns,        // The columns to return
                    whereClause,    // The columns for the WHERE clause
                    whereArgs,      // The values for the WHERE clause
                    groupBy,        // don't group the rows
                    having,         // don't filter by row groups
                    orderBy,
                    limitRows
            );
            while (c.moveToNext()) {

                allProvinces.add(new Villages().hydrate(c));

            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allProvinces;
    }

    public Collection<Villages> getDistrictsByProvince(String cCode, String provCode) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;

        Boolean distinct = true;
        String tableName = VillagesTable.TABLE_NAME;
        String[] columns = null;
        String whereClause = VillagesTable.COLUMN_CCODE + "= ? AND " +
                VillagesTable.COLUMN_PROVCODE + "= ? ";
        String[] whereArgs = {cCode, provCode};
        String groupBy = VillagesTable.COLUMN_DISTRICT_NAME;
        String having = null;
        String orderBy = VillagesTable.COLUMN_DISTRICT_NAME + " ASC";
        String limitRows = "9999";

        Collection<Villages> allProvinces = new ArrayList<>();
        try {
            c = db.query(
                    distinct,       // Distinct values
                    tableName,      // The table to query
                    columns,        // The columns to return
                    whereClause,    // The columns for the WHERE clause
                    whereArgs,      // The values for the WHERE clause
                    groupBy,        // don't group the rows
                    having,         // don't filter by row groups
                    orderBy,
                    limitRows
            );
            while (c.moveToNext()) {

                allProvinces.add(new Villages().hydrate(c));

            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allProvinces;
    }

    public Collection<Villages> getVillagesByDistrict(String cCode, String provCode, String distCode) {

        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;

        Boolean distinct = true;
        String tableName = VillagesTable.TABLE_NAME;
        String[] columns = null;
        String whereClause = VillagesTable.COLUMN_CCODE + "= ? AND " +
                VillagesTable.COLUMN_PROVCODE + "= ? AND " +
                VillagesTable.COLUMN_DCODE + "= ? ";
        String[] whereArgs = {cCode, provCode, distCode};
        String groupBy = VillagesTable.COLUMN_VILLAGE;
        String having = null;
        String orderBy = VillagesTable.COLUMN_VILLAGE + " ASC";
        String limitRows = "9999";

        Collection<Villages> allVillages = new ArrayList<>();
        try {
            c = db.query(
                    distinct,       // Distinct values
                    tableName,      // The table to query
                    columns,        // The columns to return
                    whereClause,    // The columns for the WHERE clause
                    whereArgs,      // The values for the WHERE clause
                    groupBy,        // don't group the rows
                    having,         // don't filter by row groups
                    orderBy,
                    limitRows
            );
            while (c.moveToNext()) {

                allVillages.add(new Villages().hydrate(c));

            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allVillages;
    }

    public Form getFormByPSUHHNo(String psuCode, String hhid) throws JSONException {

        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;

        Boolean distinct = false;
        String tableName = FormsTable.TABLE_NAME;
        String[] columns = null;
        String whereClause = FormsTable.COLUMN_PSU_CODE + "= ? AND " +
                FormsTable.COLUMN_HHID + "= ? ";
        String[] whereArgs = {psuCode, hhid};
        String groupBy = null;
        String having = null;
        String orderBy = FormsTable.COLUMN_SYSDATE + " ASC";
        String limitRows = "1";

        c = db.query(
                distinct,       // Distinct values
                tableName,      // The table to query
                columns,        // The columns to return
                whereClause,    // The columns for the WHERE clause
                whereArgs,      // The values for the WHERE clause
                groupBy,        // don't group the rows
                having,         // don't filter by row groups
                orderBy,
                limitRows
        );

        Form form = null;
        while (c.moveToNext()) {
            form = (new Form().Hydrate(c));
        }

        c.close();
        db.close();
        return form;

    }


    public MWRA getMwraByUUid() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c;
        String[] columns = null;

        String whereClause;
        whereClause = MwraTable.COLUMN_UUID + "=? ";

        String[] whereArgs = {MainApp.form.getUid()};

        String groupBy = null;
        String having = null;

        String orderBy = MwraTable.COLUMN_ID + " ASC";

        MWRA mwra = null;

        c = db.query(
                MwraTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            mwra = new MWRA().Hydrate(c);
        }

        db.close();

        return mwra;
    }

    public Pregnancy getPregByUUid(String pSNo) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c;
        String[] columns = null;

        String whereClause;
        whereClause = PregnancyTable.COLUMN_MUID + "=? AND " +
                PregnancyTable.COLUMN_UUID + "=? AND " +
                PregnancyTable.COLUMN_SNO + "=? "
        ;

        String[] whereArgs = {MainApp.mwra.getUid(), MainApp.form.getUid(), pSNo};

        String groupBy = null;
        String having = null;

        String orderBy = PregnancyTable.COLUMN_ID + " ASC";

        Pregnancy pregnancy = new Pregnancy();  // Pregnancies can never be null.

        c = db.query(
                PregnancyTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            pregnancy = new Pregnancy().Hydrate(c);
        }

        db.close();

        return pregnancy;
    }

    public Child getChildByUUid() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c;
        String[] columns = null;

        String whereClause;
        whereClause = ChildTable.COLUMN_UUID + "=? ";

        String[] whereArgs = {MainApp.form.getUid()};

        String groupBy = null;
        String having = null;

        String orderBy = ChildTable.COLUMN_ID + " ASC";

        Child child = new Child();  // Pregnancies can never be null.

        c = db.query(
                ChildTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            child = new Child().Hydrate(c);
        }

        db.close();

        return child;
    }

    public ECDInfo getECDataByUUid(int ecdNo) throws JSONException {

        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c;
        String[] columns = null;

        String whereClause;
        whereClause = ECDInfoTable.COLUMN_UUID + "=? AND " +
                ECDInfoTable.COLUMN_ECDINFO + " = ?";

        String[] whereArgs = {MainApp.form.getUid()};

        String groupBy = null;
        String having = null;

        String orderBy = ECDInfoTable.COLUMN_ID + " ASC";

        ECDInfo ecdInfo = new ECDInfo();  // Pregnancies can never be null.

        c = db.query(
                ECDInfoTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                   // The sort order
        );
        if (c.getCount() >= ecdNo) {
            c.moveToPosition(ecdNo);
            ecdInfo = new ECDInfo().Hydrate(c);
        }
      /*  while (c.moveToNext()) {
            ecdInfo = new ECDInfo().Hydrate(c);
        }*/

        db.close();

        return ecdInfo;
    }
}
