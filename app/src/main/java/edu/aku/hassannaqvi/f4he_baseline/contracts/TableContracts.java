package edu.aku.hassannaqvi.f4he_baseline.contracts;

import android.provider.BaseColumns;

public class TableContracts {


    public static abstract class FormsTable implements BaseColumns {
        public static final String TABLE_NAME = "formHH";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_ENUM_BLOCK = "ebCode";
        public static final String COLUMN_HHID = "hhid";
        public static final String COLUMN_SNO = "sno";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_SA1 = "sA1";
        public static final String COLUMN_SB1 = "sB1";
        public static final String COLUMN_SB2 = "sB2";
        public static final String COLUMN_SB3 = "sB3";
        public static final String COLUMN_SB41 = "sB41";
        public static final String COLUMN_SB42 = "sB42";
        public static final String COLUMN_SB5 = "sB5";
        public static final String COLUMN_SB6 = "sB6";
        public static final String COLUMN_SB7 = "sB7";
        public static final String COLUMN_SC1 = "sC1";
        public static final String COLUMN_SC2 = "sC2";
        public static final String COLUMN_SC31 = "sC31";
        public static final String COLUMN_SC32 = "sC32";
        public static final String COLUMN_SC4 = "sC4";
        public static final String COLUMN_SC5 = "sC5";
        public static final String COLUMN_SD1 = "sD1";
        public static final String COLUMN_SD2 = "sD2";
        public static final String COLUMN_SD3 = "sD3";
        public static final String COLUMN_SE1 = "sE1";
        public static final String COLUMN_SE2 = "sE2";
        public static final String COLUMN_SE3 = "sE3";
        public static final String COLUMN_SE4 = "sE4";


        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
    }

    public static abstract class HHMembersTable implements BaseColumns {
        public static final String TABLE_NAME = "HHMembers";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uid";
        public static final String COLUMN_ENUM_BLOCK = "ebCode";
        public static final String COLUMN_HHID = "hhid";
        public static final String COLUMN_SNO = "sno";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_SA2 = "sA2";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
    }

    public static abstract class FormBTable implements BaseColumns {
        public static final String TABLE_NAME = "formB";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_ENUM_BLOCK = "ebCode";
        public static final String COLUMN_HHID = "hhid";
        public static final String COLUMN_SNO = "sno";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_SB1 = "sB1";
        public static final String COLUMN_SB2 = "sB2";
        public static final String COLUMN_SB3 = "sB3";
        public static final String COLUMN_SB41 = "sB41";
        public static final String COLUMN_SB42 = "sB42";
        public static final String COLUMN_SB5 = "sB5";
        public static final String COLUMN_SB6 = "sB6";
        public static final String COLUMN_SB7 = "sB7";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
    }

    public static abstract class UsersTable implements BaseColumns {
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String TABLE_NAME = "users";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_PASSWORD = "password";
        public static final String COLUMN_FULLNAME = "full_name";

    }

    public static abstract class EnumBlocksTable implements BaseColumns {
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String TABLE_NAME = "enumBlocks";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_DISTRICT_NAME = "district_name";
        public static final String COLUMN_TEHSIL_NAME = "tehsil_name";
        public static final String COLUMN_ENUM_BLOCK_CODE = "eb_code";

        public static abstract class MWRAListTable implements BaseColumns {

            public static final String TABLE_NAME = "MWRAList";
            public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
            public static final String COLUMN_PROJECT_NAME = "projectName";
            public static final String COLUMN_ID = "_id";
            public static final String COLUMN_UID = "_uid";
            public static final String COLUMN_UUID = "_uid";
            public static final String COLUMN_ENUM_BLOCK = "ebCode";
            public static final String COLUMN_HHID = "hhid";
            public static final String COLUMN_SNO = "sno";
            public static final String COLUMN_USERNAME = "username";
            public static final String COLUMN_SYSDATE = "sysdate";
            public static final String COLUMN_SB1 = "sB1";
            public static final String COLUMN_SB2 = "sB2";
            public static final String COLUMN_SB3 = "sB3";
            public static final String COLUMN_SB41 = "sB41";
            public static final String COLUMN_SB42 = "sB42";
            public static final String COLUMN_SB5 = "sB5";
            public static final String COLUMN_SB6 = "sB6";
            public static final String COLUMN_SB7 = "sB7";

            public static final String COLUMN_DEVICEID = "deviceid";
            public static final String COLUMN_DEVICETAGID = "devicetagid";
            public static final String COLUMN_SYNCED = "synced";
            public static final String COLUMN_SYNCED_DATE = "synced_date";
            public static final String COLUMN_APPVERSION = "appversion";
            public static final String COLUMN_ISTATUS = "istatus";

        }
    }

    public static abstract class VersionTable implements BaseColumns {
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String TABLE_NAME = "versionApp";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_VERSION_PATH = "elements";
        public static final String COLUMN_VERSION_CODE = "versionCode";
        public static final String COLUMN_VERSION_NAME = "versionName";
        public static final String COLUMN_PATH_NAME = "outputFile";
        public static final String SERVER_URI = "output-metadata.json";

    }

    public static abstract class FamilyMemberListTable implements BaseColumns {
        public static final String TABLE_NAME = "FamilyMembersList";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_EB_CODE = "ebCode";
        public static final String COLUMN_HHID = "hhid";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_INDEXED = "indexed";
        public static final String COLUMN_SA2 = "sA2";

        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
    }

    public static abstract class MwraTable implements BaseColumns {
        public static final String TABLE_NAME = "MWRA";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_EB_CODE = "ebCode";
        public static final String COLUMN_HHID = "hhid";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_INDEXED = "indexed";
        public static final String COLUMN_SB1 = "sb1";

        public static final String COLUMN_SB2 = "sb2";
        public static final String COLUMN_SB3 = "sb3";
        public static final String COLUMN_SB41 = "sb41";
        public static final String COLUMN_SB42 = "sb42";
        public static final String COLUMN_SB5 = "sb5";
        public static final String COLUMN_SB6 = "sb6";
        public static final String COLUMN_SB7 = "sb7";

        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
    }


}
