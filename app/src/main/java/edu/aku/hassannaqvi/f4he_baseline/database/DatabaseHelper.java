package edu.aku.hassannaqvi.f4he_baseline.database;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts;
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts.EnumBlocksTable;
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts.FamilyMemberListTable;
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts.FormBTable;
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts.FormsTable;
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts.HHMembersTable;
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts.UsersTable;
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts.VersionTable;
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts.MwraTable;
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts.Child_Table;
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts.LateAdolescent_Table;
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts.Pregnancy_Table;
import edu.aku.hassannaqvi.f4he_baseline.core.MainApp;
import edu.aku.hassannaqvi.f4he_baseline.models.Child;
import edu.aku.hassannaqvi.f4he_baseline.models.ECDInfo;
import edu.aku.hassannaqvi.f4he_baseline.models.EnumBlocks;
import edu.aku.hassannaqvi.f4he_baseline.models.FamilyMembers;
import edu.aku.hassannaqvi.f4he_baseline.models.Form;
import edu.aku.hassannaqvi.f4he_baseline.models.FormB;
import edu.aku.hassannaqvi.f4he_baseline.models.HHMembers;
import edu.aku.hassannaqvi.f4he_baseline.models.LateAdolescent;
import edu.aku.hassannaqvi.f4he_baseline.models.MWRA;
import edu.aku.hassannaqvi.f4he_baseline.models.Pregnancy;
import edu.aku.hassannaqvi.f4he_baseline.models.Users;
import edu.aku.hassannaqvi.f4he_baseline.models.VersionApp;



/*import edu.aku.hassannaqvi.naunehal.models.Immunization;*/

/**
 * @author hassan.naqvi on 11/30/2016.
 * @update ali azaz on 01/07/21
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    private final String TAG = "DatabaseHelper";

    public DatabaseHelper(Context context) {
        super(context, CreateTable.DATABASE_NAME, null, CreateTable.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CreateTable.SQL_CREATE_USERS);
        db.execSQL(CreateTable.SQL_CREATE_ENUMBLOCKS);
        //db.execSQL(SQL_CREATE_RANDOM);
        db.execSQL(CreateTable.SQL_CREATE_FORMS);
        db.execSQL(CreateTable.SQL_CREATE_MWRA);
        db.execSQL(CreateTable.SQL_CREATE_PREGNANCY);
        db.execSQL(CreateTable.SQL_CREATE_ADOLESCENT);
        db.execSQL(CreateTable.SQL_CREATE_CHILD);
        db.execSQL(CreateTable.SQL_CREATE_ECDINFO);

        db.execSQL(CreateTable.SQL_CREATE_HHMEMBERS);
        db.execSQL(CreateTable.SQL_CREATE_FORMB);
        //db.execSQL(SQL_CREATE_FOODS_CONSUMPTION);
        db.execSQL(CreateTable.SQL_CREATE_FAMILY_MEMBERS);
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
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_PROJECT_NAME, form.getProjectName());
        values.put(FormsTable.COLUMN_UID, form.getUid());
        values.put(FormsTable.COLUMN_ENUM_BLOCK, form.getEbCode());
        values.put(FormsTable.COLUMN_HHID, form.getHhid());
        values.put(FormsTable.COLUMN_SNO, form.getSno());
        values.put(FormsTable.COLUMN_USERNAME, form.getUserName());
        values.put(FormsTable.COLUMN_SYSDATE, form.getSysDate());
        values.put(FormsTable.COLUMN_SA1, form.sA1toString());
        values.put(FormsTable.COLUMN_SB1, form.sB1toString());
        values.put(FormsTable.COLUMN_SB2, form.sB2toString());
        values.put(FormsTable.COLUMN_SB3, form.sB3toString());
        values.put(FormsTable.COLUMN_SB41, form.sB41toString());
        values.put(FormsTable.COLUMN_SB42, form.sB42toString());
        values.put(FormsTable.COLUMN_SB5, form.sB5toString());
        values.put(FormsTable.COLUMN_SB6, form.sB6toString());
        values.put(FormsTable.COLUMN_SB7, form.sB7toString());
        values.put(FormsTable.COLUMN_SC1, form.sC1toString());
        values.put(FormsTable.COLUMN_SC2, form.sC2toString());
        values.put(FormsTable.COLUMN_SC31, form.sC31toString());
        values.put(FormsTable.COLUMN_SC32, form.sC32toString());
        values.put(FormsTable.COLUMN_SC4, form.sC4toString());
        values.put(FormsTable.COLUMN_SC5, form.sC5toString());
        values.put(FormsTable.COLUMN_SD1, form.sD1toString());
        values.put(FormsTable.COLUMN_SD2, form.sD2toString());
        values.put(FormsTable.COLUMN_SD3, form.sD3toString());
        values.put(FormsTable.COLUMN_SE1, form.sE1toString());
        values.put(FormsTable.COLUMN_SE2, form.sE2toString());
        values.put(FormsTable.COLUMN_SE3, form.sE3toString());
        values.put(FormsTable.COLUMN_SE4, form.sE4toString());
        values.put(FormsTable.COLUMN_ISTATUS, form.getiStatus());
        values.put(FormsTable.COLUMN_DEVICETAGID, form.getDeviceTag());
        values.put(FormsTable.COLUMN_DEVICEID, form.getDeviceId());
        values.put(FormsTable.COLUMN_APPVERSION, form.getAppver());

        long newRowId;
        newRowId = db.insert(
                FormsTable.TABLE_NAME,
                FormsTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addMWRA(MWRA mwra) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(TableContracts.MwraTable.COLUMN_PROJECT_NAME, mwra.getProjectName());
        values.put(TableContracts.MwraTable.COLUMN_UID, mwra.getUid());
        values.put(TableContracts.MwraTable.COLUMN_UUID, mwra.getUuid());
        values.put(TableContracts.MwraTable.COLUMN_HHID, mwra.getHhid());
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
        values.put(MwraTable.COLUMN_SD1, mwra.sD1toString());
        values.put(MwraTable.COLUMN_SD2, mwra.sD2toString());
        values.put(MwraTable.COLUMN_SD3, mwra.sD3toString());
        values.put(MwraTable.COLUMN_ISTATUS, mwra.getiStatus());
        values.put(MwraTable.COLUMN_DEVICETAGID, mwra.getDeviceTag());
        values.put(MwraTable.COLUMN_DEVICEID, mwra.getDeviceId());
        values.put(MwraTable.COLUMN_APPVERSION, mwra.getAppver());

        long newRowId;
        newRowId = db.insert(
                MwraTable.TABLE_NAME,
                MwraTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }


    public Long addChild(Child child) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(TableContracts.Child_Table.COLUMN_PROJECT_NAME, child.getProjectName());
        values.put(TableContracts.Child_Table.COLUMN_UID, child.getUid());
        values.put(TableContracts.Child_Table.COLUMN_UUID, child.getUuid());
        values.put(TableContracts.Child_Table.COLUMN_HHID, child.getHhid());
        values.put(TableContracts.Child_Table.COLUMN_USERNAME, child.getUserName());
        values.put(Child_Table.COLUMN_SYSDATE, child.getSysDate());
        values.put(Child_Table.COLUMN_SC1, child.sC1toString());
        values.put(Child_Table.COLUMN_SC2, child.sC2toString());
        values.put(Child_Table.COLUMN_SC31, child.sC31toString());
        values.put(Child_Table.COLUMN_SC32, child.sC32toString());
        values.put(Child_Table.COLUMN_SC4, child.sC4toString());
        values.put(Child_Table.COLUMN_SC5, child.sC5toString());
        values.put(Child_Table.COLUMN_ISTATUS, child.getiStatus());
        values.put(Child_Table.COLUMN_DEVICETAGID, child.getDeviceTag());
        values.put(Child_Table.COLUMN_DEVICEID, child.getDeviceId());
        values.put(Child_Table.COLUMN_APPVERSION, child.getAppver());

        long newRowId;
        newRowId = db.insert(
                Child_Table.TABLE_NAME,
                Child_Table.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }


    public Long addAdolescent(LateAdolescent adol) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(TableContracts.LateAdolescent_Table.COLUMN_PROJECT_NAME, adol.getProjectName());
        values.put(TableContracts.LateAdolescent_Table.COLUMN_UID, adol.getUid());
        values.put(TableContracts.LateAdolescent_Table.COLUMN_UUID, adol.getUuid());
        values.put(TableContracts.LateAdolescent_Table.COLUMN_HHID, adol.getHhid());
        values.put(TableContracts.LateAdolescent_Table.COLUMN_USERNAME, adol.getUserName());
        values.put(LateAdolescent_Table.COLUMN_SYSDATE, adol.getSysDate());
        values.put(LateAdolescent_Table.COLUMN_SE1, adol.sE1toString());
        values.put(LateAdolescent_Table.COLUMN_SE2, adol.sE2toString());
        values.put(LateAdolescent_Table.COLUMN_SE3, adol.sE3toString());
        values.put(LateAdolescent_Table.COLUMN_SE4, adol.sE4toString());
        values.put(LateAdolescent_Table.COLUMN_ISTATUS, adol.getiStatus());
        values.put(LateAdolescent_Table.COLUMN_DEVICETAGID, adol.getDeviceTag());
        values.put(LateAdolescent_Table.COLUMN_DEVICEID, adol.getDeviceId());
        values.put(LateAdolescent_Table.COLUMN_APPVERSION, adol.getAppver());

        long newRowId;
        newRowId = db.insert(
                LateAdolescent_Table.TABLE_NAME,
                LateAdolescent_Table.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addPregnancy(Pregnancy preg) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(TableContracts.Pregnancy_Table.COLUMN_PROJECT_NAME, preg.getProjectName());
        values.put(TableContracts.Pregnancy_Table.COLUMN_UID, preg.getUid());
        values.put(TableContracts.Pregnancy_Table.COLUMN_UUID, preg.getUuid());
        values.put(TableContracts.Pregnancy_Table.COLUMN_HHID, preg.getHhid());
        values.put(TableContracts.Pregnancy_Table.COLUMN_USERNAME, preg.getUserName());
        values.put(Pregnancy_Table.COLUMN_SYSDATE, preg.getSysDate());
        values.put(Pregnancy_Table.COLUMN_SB1, preg.sB1toString());
        values.put(Pregnancy_Table.COLUMN_ISTATUS, preg.getiStatus());
        values.put(Pregnancy_Table.COLUMN_DEVICETAGID, preg.getDeviceTag());
        values.put(Pregnancy_Table.COLUMN_DEVICEID, preg.getDeviceId());
        values.put(Pregnancy_Table.COLUMN_APPVERSION, preg.getAppver());

        long newRowId;
        newRowId = db.insert(
                Pregnancy_Table.TABLE_NAME,
                Pregnancy_Table.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addEcdInfo(ECDInfo ecd) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(TableContracts.ECDInfo_Table.COLUMN_PROJECT_NAME, ecd.getProjectName());
        values.put(TableContracts.ECDInfo_Table.COLUMN_UID, ecd.getUid());
        values.put(TableContracts.ECDInfo_Table.COLUMN_UUID, ecd.getUuid());
        values.put(TableContracts.ECDInfo_Table.COLUMN_HHID, ecd.getHhid());
        values.put(TableContracts.ECDInfo_Table.COLUMN_USERNAME, ecd.getUserName());
        values.put(TableContracts.ECDInfo_Table.COLUMN_SYSDATE, ecd.getSysDate());
        values.put(TableContracts.ECDInfo_Table.COLUMN_ECDINFO, ecd.ecdInfotoString());
        values.put(TableContracts.ECDInfo_Table.COLUMN_ISTATUS, ecd.getiStatus());
        values.put(TableContracts.ECDInfo_Table.COLUMN_DEVICETAGID, ecd.getDeviceTag());
        values.put(TableContracts.ECDInfo_Table.COLUMN_DEVICEID, ecd.getDeviceId());
        values.put(TableContracts.ECDInfo_Table.COLUMN_APPVERSION, ecd.getAppver());

        long newRowId;
        newRowId = db.insert(
                Pregnancy_Table.TABLE_NAME,
                Pregnancy_Table.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }



    public Long addHHMembers(HHMembers members) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(HHMembersTable.COLUMN_PROJECT_NAME, members.getProjectName());
        values.put(HHMembersTable.COLUMN_UID, members.getUid());
        values.put(HHMembersTable.COLUMN_UUID, members.getUuid());
        values.put(HHMembersTable.COLUMN_ENUM_BLOCK, members.getEbCode());
        values.put(HHMembersTable.COLUMN_HHID, members.getHhid());
        values.put(HHMembersTable.COLUMN_SNO, members.getSno());
        values.put(HHMembersTable.COLUMN_USERNAME, members.getUserName());
        values.put(HHMembersTable.COLUMN_SYSDATE, members.getSysDate());
        values.put(HHMembersTable.COLUMN_SA2, members.sA2toString());
        values.put(HHMembersTable.COLUMN_ISTATUS, members.getiStatus());
        values.put(HHMembersTable.COLUMN_DEVICETAGID, members.getDeviceTag());
        values.put(HHMembersTable.COLUMN_DEVICEID, members.getDeviceId());
        values.put(HHMembersTable.COLUMN_APPVERSION, members.getAppver());

        long newRowId;
        newRowId = db.insert(
                HHMembersTable.TABLE_NAME,
                HHMembersTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addFormB(FormB b) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(FormBTable.COLUMN_PROJECT_NAME, b.getProjectName());
        values.put(FormBTable.COLUMN_UID, b.getUid());
        values.put(FormBTable.COLUMN_UUID, b.getUuid());
        values.put(FormBTable.COLUMN_ENUM_BLOCK, b.getEbCode());
        values.put(FormBTable.COLUMN_HHID, b.getHhid());
        values.put(FormBTable.COLUMN_SNO, b.getSno());
        values.put(FormBTable.COLUMN_USERNAME, b.getUserName());
        values.put(FormBTable.COLUMN_SYSDATE, b.getSysDate());
        values.put(FormBTable.COLUMN_SB1, b.sB1toString());
        values.put(FormBTable.COLUMN_SB2, b.sB2toString());
        values.put(FormBTable.COLUMN_SB3, b.sB3toString());
        values.put(FormBTable.COLUMN_SB41, b.sB41toString());
        values.put(FormBTable.COLUMN_SB42, b.sB42toString());
        values.put(FormBTable.COLUMN_SB5, b.sB5toString());
        values.put(FormBTable.COLUMN_SB6, b.sB6toString());
        values.put(FormBTable.COLUMN_SB7, b.sB7toString());
        values.put(FormBTable.COLUMN_ISTATUS, b.getiStatus());
        values.put(FormBTable.COLUMN_DEVICETAGID, b.getDeviceTag());
        values.put(FormBTable.COLUMN_DEVICEID, b.getDeviceId());
        values.put(FormBTable.COLUMN_APPVERSION, b.getAppver());

        long newRowId;
        newRowId = db.insert(
                FormBTable.TABLE_NAME,
                FormBTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    //ADDITION in DB
    public Long addFamilyMembers(FamilyMembers members) throws JSONException {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(FamilyMemberListTable.COLUMN_PROJECT_NAME, members.getProjectName());
        values.put(FamilyMemberListTable.COLUMN_UID, members.getUid());
        values.put(FamilyMemberListTable.COLUMN_UUID, members.getUuid());
        values.put(FamilyMemberListTable.COLUMN_EB_CODE, members.getEbCode());
        values.put(FamilyMemberListTable.COLUMN_HHID, members.getHhid());
        values.put(FamilyMemberListTable.COLUMN_USERNAME, members.getUserName());
        values.put(FamilyMemberListTable.COLUMN_SYSDATE, members.getSysDate());
        values.put(FamilyMemberListTable.COLUMN_INDEXED, members.getIndexed());
        values.put(FamilyMemberListTable.COLUMN_SA2, members.sA2toString());

        values.put(FamilyMemberListTable.COLUMN_ISTATUS, members.getiStatus());

        values.put(FamilyMemberListTable.COLUMN_DEVICETAGID, members.getDeviceTag());
        values.put(FamilyMemberListTable.COLUMN_DEVICEID, members.getDeviceId());
        values.put(FamilyMemberListTable.COLUMN_APPVERSION, members.getAppver());


        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                FamilyMemberListTable.TABLE_NAME,
                FamilyMemberListTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }


    //UPDATE in DB
    public int updatesFormColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase();

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = FormsTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.form.getId())};

        return db.update(FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesFormBColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase();

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = FormBTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.formB.getId())};

        return db.update(FormBTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }


    public int updatesMemberColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase();

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = HHMembersTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.hhMembers.getId())};

        return db.update(HHMembersTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updateEnding() {
        SQLiteDatabase db = this.getReadableDatabase();

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

    /*
     * Functions that dealing with table data
     * */
    public boolean doLogin(String username, String password) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                UsersTable.COLUMN_ID,
                UsersTable.COLUMN_USERNAME,
                UsersTable.COLUMN_PASSWORD,
                UsersTable.COLUMN_FULLNAME,
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

        SQLiteDatabase db = this.getReadableDatabase();
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
        SQLiteDatabase db = this.getReadableDatabase();
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
        SQLiteDatabase sqlDB = this.getWritableDatabase();
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
        SQLiteDatabase db = this.getWritableDatabase();
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
        SQLiteDatabase db = this.getWritableDatabase();
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
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(EnumBlocksTable.TABLE_NAME, null, null);
        int insertCount = 0;
        try {
            for (int i = 0; i < clusterList.length(); i++) {

                JSONObject json = clusterList.getJSONObject(i);

                EnumBlocks cluster = new EnumBlocks();
                cluster.sync(json);
                ContentValues values = new ContentValues();

                values.put(EnumBlocksTable.COLUMN_DISTRICT_NAME, cluster.getDistrictName());
                values.put(EnumBlocksTable.COLUMN_TEHSIL_NAME, cluster.getTehsilName());
                values.put(EnumBlocksTable.COLUMN_ENUM_BLOCK_CODE, cluster.getEnumBlock());
                long rowID = db.insert(EnumBlocksTable.TABLE_NAME, null, values);
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
                values.put(RandomTable.COLUMN_ENUM_BLOCK_CODE, ran.getEbcode());
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
    public JSONArray getUnsyncedForms() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        //whereClause = null;
        whereClause = FormsTable.COLUMN_SYNCED + " is null AND " +
                FormsTable.COLUMN_ISTATUS + "!= ''";

        String[] whereArgs = null;

        String groupBy = null;
        String having = null;

        String orderBy = FormsTable.COLUMN_ID + " ASC";

        JSONArray allForms = new JSONArray();
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
                /** WorkManager Upload
                 /*Form fc = new Form();
                 allFC.add(fc.Hydrate(c));*/
                Log.d(TAG, "getUnsyncedForms: " + c.getCount());
                Form form = new Form();
                allForms.put(form.Hydrate(c).toJSONObject());


            }
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, "getUnsyncedForms: getUnsyncedForms " + e.getMessage()
            );
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        Log.d(TAG, "getUnsyncedForms: " + allForms.toString().length());
        Log.d(TAG, "getUnsyncedForms: " + allForms);
        return allForms;
    }

    //update SyncedTables
    public void updateSyncedforms(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

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


    public ArrayList<Cursor> getData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase();
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

    public Form getFormByClusterHHNo(String enumblock, String hh_no) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = FormsTable.COLUMN_ENUM_BLOCK + "=? AND " +
                FormsTable.COLUMN_HHID + " =? ";

        String[] whereArgs = {enumblock, hh_no};

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
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;
        String whereClause = FormsTable.COLUMN_ENUM_BLOCK + " = ? ";
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
                fc.setEbCode(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ENUM_BLOCK)));
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
        SQLiteDatabase db = this.getReadableDatabase();
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
                fc.setEbCode(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ENUM_BLOCK)));
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
        SQLiteDatabase db = this.getReadableDatabase();
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
                fc.setEbCode(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ENUM_BLOCK)));
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


    public EnumBlocks getEnumBlocks(String ebCode) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;

        String whereClause = EnumBlocksTable.COLUMN_ENUM_BLOCK_CODE + " = ?";

        String[] whereArgs = {ebCode};

        String groupBy = null;
        String having = null;

        String orderBy = EnumBlocksTable.COLUMN_ENUM_BLOCK_CODE + " ASC";

        EnumBlocks e = new EnumBlocks();
        try {
            c = db.query(
                    EnumBlocksTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy
            );
            while (c.moveToNext()) {
                e = new EnumBlocks().hydrate(c);
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

    /*public RandomHH getHHbyEnumBlocks(String ebcode, String hhno) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;

        String whereClause = RandomTable.COLUMN_ENUM_BLOCK_CODE + " = ? AND " +
                RandomTable.COLUMN_HH_NO + " = ?";

        String[] whereArgs = {ebcode, hhno};

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
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = FamilyMemberListTable.COLUMN_UUID + "=?";

        String[] whereArgs = {uid};

        String groupBy = null;
        String having = null;

        String orderBy = FamilyMemberListTable.COLUMN_ID + " ASC";

        ArrayList<FamilyMembers> membersByUID = new ArrayList<>();
        try {
            c = db.query(
                    FamilyMemberListTable.TABLE_NAME,  // The table to query
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
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = FamilyMemberListTable.COLUMN_UUID + "=? AND "
                + FamilyMemberListTable.COLUMN_INDEXED + "=?";

        String[] whereArgs = {uid, "1"};

        String groupBy = null;
        String having = null;

        String orderBy = FamilyMemberListTable.COLUMN_ID + " ASC";

        FamilyMembers membersByUID = new FamilyMembers();
        try {
            c = db.query(
                    FamilyMemberListTable.TABLE_NAME,  // The table to query
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
        SQLiteDatabase db = this.getReadableDatabase();

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = FamilyMemberListTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.familyMember.getId())};

        return db.update(FamilyMemberListTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }


}
