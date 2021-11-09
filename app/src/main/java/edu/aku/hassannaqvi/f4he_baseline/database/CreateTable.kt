package edu.aku.hassannaqvi.f4he_baseline.database


import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts.*
import edu.aku.hassannaqvi.f4he_baseline.core.MainApp.PROJECT_NAME


object CreateTable {

    const val DATABASE_NAME = "$PROJECT_NAME.db"
    const val DATABASE_COPY = "${PROJECT_NAME}_copy.db"
    const val DATABASE_VERSION = 1

    const val SQL_CREATE_FORMS = ("CREATE TABLE "
            + FormsTable.TABLE_NAME + "("
            + FormsTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + FormsTable.COLUMN_PROJECT_NAME + " TEXT,"
            + FormsTable.COLUMN_UID + " TEXT,"
            + FormsTable.COLUMN_ENUM_BLOCK + " TEXT,"
            + FormsTable.COLUMN_HHID + " TEXT,"
            + FormsTable.COLUMN_SNO + " TEXT,"
            + FormsTable.COLUMN_USERNAME + " TEXT,"
            + FormsTable.COLUMN_SYSDATE + " TEXT,"
            + FormsTable.COLUMN_ISTATUS + " TEXT,"
            + FormsTable.COLUMN_DEVICEID + " TEXT,"
            + FormsTable.COLUMN_DEVICETAGID + " TEXT,"
            + FormsTable.COLUMN_SYNCED + " TEXT,"
            + FormsTable.COLUMN_SYNCED_DATE + " TEXT,"
            + FormsTable.COLUMN_APPVERSION + " TEXT,"
            + FormsTable.COLUMN_SA1 + " TEXT,"
            + FormsTable.COLUMN_SA2 + " TEXT,"
            + FormsTable.COLUMN_SB1 + " TEXT,"
            + FormsTable.COLUMN_SB2 + " TEXT,"
            + FormsTable.COLUMN_SB3 + " TEXT,"
            + FormsTable.COLUMN_SB41 + " TEXT,"
            + FormsTable.COLUMN_SB42 + " TEXT,"
            + FormsTable.COLUMN_SB5 + " TEXT,"
            + FormsTable.COLUMN_SB6 + " TEXT,"
            + FormsTable.COLUMN_SB7 + " TEXT,"
            + FormsTable.COLUMN_SC1 + " TEXT,"
            + FormsTable.COLUMN_SC2 + " TEXT,"
            + FormsTable.COLUMN_SC31 + " TEXT,"
            + FormsTable.COLUMN_SC32 + " TEXT,"
            + FormsTable.COLUMN_SC4 + " TEXT,"
            + FormsTable.COLUMN_SC5 + " TEXT,"
            + FormsTable.COLUMN_SD1 + " TEXT,"
            + FormsTable.COLUMN_SD2 + " TEXT,"
            + FormsTable.COLUMN_SD3 + " TEXT,"
            + FormsTable.COLUMN_SE1 + " TEXT,"
            + FormsTable.COLUMN_SE2 + " TEXT,"
            + FormsTable.COLUMN_SE3 + " TEXT,"
            + FormsTable.COLUMN_SE4 + " TEXT"
            + " );"
            )

    const val SQL_CREATE_FORMB = ("CREATE TABLE "
            + FormBTable.TABLE_NAME + "("
            + FormBTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + FormBTable.COLUMN_PROJECT_NAME + " TEXT,"
            + FormBTable.COLUMN_UID + " TEXT,"
            + FormBTable.COLUMN_UUID + " TEXT,"
            + FormBTable.COLUMN_ENUM_BLOCK + " TEXT,"
            + FormBTable.COLUMN_HHID + " TEXT,"
            + FormBTable.COLUMN_SNO + " TEXT,"
            + FormBTable.COLUMN_USERNAME + " TEXT,"
            + FormBTable.COLUMN_SYSDATE + " TEXT,"
            + FormBTable.COLUMN_ISTATUS + " TEXT,"
            + FormBTable.COLUMN_DEVICEID + " TEXT,"
            + FormBTable.COLUMN_DEVICETAGID + " TEXT,"
            + FormBTable.COLUMN_SYNCED + " TEXT,"
            + FormBTable.COLUMN_SYNCED_DATE + " TEXT,"
            + FormBTable.COLUMN_APPVERSION + " TEXT,"
            + FormBTable.COLUMN_SB1 + " TEXT,"
            + FormBTable.COLUMN_SB2 + " TEXT,"
            + FormBTable.COLUMN_SB3 + " TEXT,"
            + FormBTable.COLUMN_SB41 + " TEXT,"
            + FormBTable.COLUMN_SB42 + " TEXT,"
            + FormBTable.COLUMN_SB5 + " TEXT,"
            + FormBTable.COLUMN_SB6 + " TEXT,"
            + FormBTable.COLUMN_SB7 + " TEXT"
            + " );"
            )

    const val SQL_CREATE_FAMILY_MEMBERS = ("CREATE TABLE "
            + FamilyMemberListTable.TABLE_NAME + "("
            + FamilyMemberListTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + FamilyMemberListTable.COLUMN_PROJECT_NAME + " TEXT,"
            + FamilyMemberListTable.COLUMN_UID + " TEXT,"
            + FamilyMemberListTable.COLUMN_UUID + " TEXT,"
            + FamilyMemberListTable.COLUMN_EB_CODE + " TEXT,"
            + FamilyMemberListTable.COLUMN_HHID + " TEXT,"
            + FamilyMemberListTable.COLUMN_USERNAME + " TEXT,"
            + FamilyMemberListTable.COLUMN_SYSDATE + " TEXT,"
            + FamilyMemberListTable.COLUMN_INDEXED + " TEXT,"
            + FamilyMemberListTable.COLUMN_ISTATUS + " TEXT,"
            + FamilyMemberListTable.COLUMN_DEVICEID + " TEXT,"
            + FamilyMemberListTable.COLUMN_DEVICETAGID + " TEXT,"
            + FamilyMemberListTable.COLUMN_SYNCED + " TEXT,"
            + FamilyMemberListTable.COLUMN_SYNCED_DATE + " TEXT,"
            + FamilyMemberListTable.COLUMN_APPVERSION + " TEXT,"
            + FamilyMemberListTable.COLUMN_SA2 + " TEXT"
            + " );"
            )


    const val SQL_CREATE_USERS = ("CREATE TABLE "
            + UsersTable.TABLE_NAME + "("
            + UsersTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + UsersTable.COLUMN_USERNAME + " TEXT,"
            + UsersTable.COLUMN_PASSWORD + " TEXT,"
            + UsersTable.COLUMN_FULLNAME + " TEXT"
            + " );"
            )


    const val SQL_CREATE_ENUMBLOCKS = ("CREATE TABLE "
            + EnumBlocksTable.TABLE_NAME + "("
            + EnumBlocksTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + EnumBlocksTable.COLUMN_DISTRICT_NAME + " TEXT,"
            + EnumBlocksTable.COLUMN_TEHSIL_NAME + " TEXT,"
            + EnumBlocksTable.COLUMN_ENUM_BLOCK_CODE + " TEXT"
            + " );"
            )


    /*const val SQL_CREATE_RANDOM = ("CREATE TABLE "
            + RandomTable.TABLE_NAME + "("
            + RandomTable.COLUMN_ID + " INTEGER PRIMARY KEY,"
            + RandomTable.COLUMN_SNO + " TEXT,"
            + RandomTable.COLUMN_ENUM_BLOCK_CODE + " TEXT,"
            + RandomTable.COLUMN_HH_NO + " TEXT,"
            + RandomTable.COLUMN_HEAD_HH + " TEXT"
            + " );"
            )*/

    const val SQL_CREATE_VERSIONAPP = ("CREATE TABLE "
            + VersionTable.TABLE_NAME + " ("
            + VersionTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + VersionTable.COLUMN_VERSION_CODE + " TEXT, "
            + VersionTable.COLUMN_VERSION_NAME + " TEXT, "
            + VersionTable.COLUMN_PATH_NAME + " TEXT "
            + ");"
            )


}