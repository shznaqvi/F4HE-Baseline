package edu.aku.hassannaqvi.f4he_baseline.models;

import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp._EMPTY_;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.f4he_baseline.BR;
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts.FormsTable;
import edu.aku.hassannaqvi.f4he_baseline.core.MainApp;


public class Form extends BaseObservable implements Observable {

    private final String TAG = "Form";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    private String ebCode = _EMPTY_;
    private String hhid = _EMPTY_;
    private String sno = _EMPTY_;
    private String deviceId = _EMPTY_;
    private String deviceTag = _EMPTY_;
    private String appver = _EMPTY_;
    private String endTime = _EMPTY_;
    private String iStatus = _EMPTY_;
    private String iStatus96x = _EMPTY_;
    private String synced = _EMPTY_;
    private String syncDate = _EMPTY_;


    // SECTION VARIABLES
    private String sA1 = _EMPTY_;
    private String sA2 = _EMPTY_;
    private String sB1 = _EMPTY_;
    private String sB2 = _EMPTY_;
    private String sB3 = _EMPTY_;
    private String sB41 = _EMPTY_;
    private String sB42 = _EMPTY_;
    private String sB5 = _EMPTY_;
    private String sB6 = _EMPTY_;
    private String sB7 = _EMPTY_;
    private String sC1 = _EMPTY_;
    private String sC2 = _EMPTY_;
    private String sC31 = _EMPTY_;
    private String sC32 = _EMPTY_;
    private String sC4 = _EMPTY_;
    private String sC5 = _EMPTY_;
    private String sD1 = _EMPTY_;
    private String sD2 = _EMPTY_;
    private String sD3 = _EMPTY_;
    private String sE1 = _EMPTY_;
    private String sE2 = _EMPTY_;
    private String sE3 = _EMPTY_;
    private String sE4 = _EMPTY_;

    // FIELD VARIABLES
    private String as1q01 = _EMPTY_;
    private String as1q02 = _EMPTY_;
    private String as1q03 = _EMPTY_;
    private String as1q04 = _EMPTY_;
    private String as1q05 = _EMPTY_;
    private String as1q06 = _EMPTY_;
    private String as1q07 = _EMPTY_;
    private String as1q08 = _EMPTY_;
    private String as1q09 = _EMPTY_;
    private String as1q10 = _EMPTY_;
    private String as1q11 = _EMPTY_;
    private String as1q12 = _EMPTY_;
    private String as1q13 = _EMPTY_;
    private String as1q14 = _EMPTY_;
    private String as1q15d = _EMPTY_;
    private String as1q15m = _EMPTY_;
    private String as1q15y = _EMPTY_;
    private String as1q16h = _EMPTY_;
    private String as1q16m = _EMPTY_;
    private String as1q17h = _EMPTY_;
    private String as1q17m = _EMPTY_;
    private String as1q18 = _EMPTY_;
    private String as1q19 = _EMPTY_;
    private String as1q20 = _EMPTY_;
    private String as1q21 = _EMPTY_;
    private String as1q22 = _EMPTY_;
    private String as1q23 = _EMPTY_;
    private String as1q23a = _EMPTY_;
    private String hl1 = _EMPTY_;
    private String hl2 = _EMPTY_;
    private String hl3 = _EMPTY_;
    private String hl4 = _EMPTY_;
    private String hl5d = _EMPTY_;
    private String hl5m = _EMPTY_;
    private String hl5y = _EMPTY_;
    private String hl6y = _EMPTY_;
    private String hl6m = _EMPTY_;
    private String hl7 = _EMPTY_;
    private String hl8 = _EMPTY_;
    private String hl9 = _EMPTY_;
    private String hl10 = _EMPTY_;
    private String hl11 = _EMPTY_;
    private String hl12 = _EMPTY_;
    private String hl1296x = _EMPTY_;
    private String hl13 = _EMPTY_;
    private String bs1resp = _EMPTY_;
    private String bs1respline = _EMPTY_;
    private String bs1con = _EMPTY_;
    private String bs1q1 = _EMPTY_;
    private String bs1q2 = _EMPTY_;
    private String bs1q3 = _EMPTY_;
    private String bs1q4 = _EMPTY_;
    private String bs1q5 = _EMPTY_;
    private String bs1q6 = _EMPTY_;
    private String bs1q7p1g = _EMPTY_;
    private String bs1q7p1d = _EMPTY_;
    private String bs1q7p1d96x = _EMPTY_;
    private String bs1q7p1b = _EMPTY_;
    private String bs1q7p2g = _EMPTY_;
    private String bs1q7p2d = _EMPTY_;
    private String bs1q7p2d96x = _EMPTY_;
    private String bs1q7p2b = _EMPTY_;
    private String bs1q7p3g = _EMPTY_;
    private String bs1q7p3d = _EMPTY_;
    private String bs1q7p3d96x = _EMPTY_;
    private String bs1q7p3b = _EMPTY_;
    private String bs1q7p4g = _EMPTY_;
    private String bs1q7p4d = _EMPTY_;
    private String bs1q7p4d96x = _EMPTY_;
    private String bs1q7p4b = _EMPTY_;
    private String bs1q7p5g = _EMPTY_;
    private String bs1q7p5d = _EMPTY_;
    private String bs1q7p5d96x = _EMPTY_;
    private String bs1q7p5b = _EMPTY_;
    private String bs1q08 = _EMPTY_;
    private String bs1q09 = _EMPTY_;
    private String bs1q0901 = _EMPTY_;
    private String bs1q0902 = _EMPTY_;
    private String bs1q0903 = _EMPTY_;
    private String bs1q0904 = _EMPTY_;
    private String bs1q0905 = _EMPTY_;
    private String bs1q0906 = _EMPTY_;
    private String bs1q0907 = _EMPTY_;
    private String bs1q0908 = _EMPTY_;
    private String bs1q09t296 = _EMPTY_;
    private String bs1q09t296x = _EMPTY_;
    private String bs1q1001 = _EMPTY_;
    private String bs1q1002 = _EMPTY_;
    private String bs1q1098 = _EMPTY_;
    private String bs1q11 = _EMPTY_;
    private String bs1q12 = _EMPTY_;
    private String bs1q13 = _EMPTY_;
    private String bs1q1301 = _EMPTY_;
    private String bs1q1302 = _EMPTY_;
    private String bs1q1303 = _EMPTY_;
    private String bs1q1304 = _EMPTY_;
    private String bs1q1305 = _EMPTY_;
    private String bs1q1306 = _EMPTY_;
    private String bs1q1307 = _EMPTY_;
    private String bs1q1308 = _EMPTY_;
    private String bs1q1396 = _EMPTY_;
    private String bs1q1396x = _EMPTY_;
    private String bs2q1 = _EMPTY_;
    private String bs2q2 = _EMPTY_;
    private String bs2q201 = _EMPTY_;
    private String bs2q202 = _EMPTY_;
    private String bs2q203 = _EMPTY_;
    private String bs2q204 = _EMPTY_;
    private String bs2q205 = _EMPTY_;
    private String bs2q206 = _EMPTY_;
    private String bs2q207 = _EMPTY_;
    private String bs2q208 = _EMPTY_;
    private String bs2q209 = _EMPTY_;
    private String bs2q210 = _EMPTY_;
    private String bs2q211 = _EMPTY_;
    private String bs2q212 = _EMPTY_;
    private String bs2q213 = _EMPTY_;
    private String bs2q214 = _EMPTY_;
    private String bs2q215 = _EMPTY_;
    private String bs2q216 = _EMPTY_;
    private String bs2q217 = _EMPTY_;
    private String bs2q218 = _EMPTY_;
    private String bs2q296 = _EMPTY_;
    private String bs2q296x = _EMPTY_;
    private String bs2q3 = _EMPTY_;
    private String bs2q4 = _EMPTY_;
    private String bs2q401 = _EMPTY_;
    private String bs2q402 = _EMPTY_;
    private String bs2q403 = _EMPTY_;
    private String bs2q404 = _EMPTY_;
    private String bs2q405 = _EMPTY_;
    private String bs2q406 = _EMPTY_;
    private String bs2q407 = _EMPTY_;
    private String bs2q408 = _EMPTY_;
    private String bs2q409 = _EMPTY_;
    private String bs2q410 = _EMPTY_;
    private String bs2q411 = _EMPTY_;
    private String bs2q412 = _EMPTY_;
    private String bs2q413 = _EMPTY_;
    private String bs2q414 = _EMPTY_;
    private String bs2q415 = _EMPTY_;
    private String bs2q416 = _EMPTY_;
    private String bs2q417 = _EMPTY_;
    private String bs2q418 = _EMPTY_;
    private String bs2q4096 = _EMPTY_;
    private String bs2q4096x = _EMPTY_;
    private String bs2q5 = _EMPTY_;
    private String bs2q6 = _EMPTY_;
    private String bs2q601 = _EMPTY_;
    private String bs2q602 = _EMPTY_;
    private String bs2q603 = _EMPTY_;
    private String bs2q604 = _EMPTY_;
    private String bs2q605 = _EMPTY_;
    private String bs2q606 = _EMPTY_;
    private String bs2q606x = _EMPTY_;
    private String bs2q607 = _EMPTY_;
    private String bs2q608 = _EMPTY_;
    private String bs2q609 = _EMPTY_;
    private String bs2q6010 = _EMPTY_;
    private String bs2q6010x = _EMPTY_;
    private String bs2q6011 = _EMPTY_;
    private String bs2q6011x = _EMPTY_;
    private String bs2q6012 = _EMPTY_;
    private String bs2q6013 = _EMPTY_;
    private String bs2q6014 = _EMPTY_;
    private String bs2q6015 = _EMPTY_;
    private String bs2q696 = _EMPTY_;
    private String bs2q696x = _EMPTY_;
    private String bs2q7 = _EMPTY_;
    private String bs2q796x = _EMPTY_;
    private String bs2q8 = _EMPTY_;
    private String bs2q801 = _EMPTY_;
    private String bs2q802 = _EMPTY_;
    private String bs2q803 = _EMPTY_;
    private String bs2q804 = _EMPTY_;
    private String bs2q898 = _EMPTY_;
    private String bs2q896 = _EMPTY_;
    private String bs2q896x = _EMPTY_;
    private String bs3q1 = _EMPTY_;
    private String bs3q101 = _EMPTY_;
    private String bs3q102 = _EMPTY_;
    private String bs3q103 = _EMPTY_;
    private String bs3q104 = _EMPTY_;
    private String bs3q105 = _EMPTY_;
    private String bs3q106 = _EMPTY_;
    private String bs3q107 = _EMPTY_;
    private String bs3q197 = _EMPTY_;
    private String bs3q198 = _EMPTY_;
    private String bs3q196 = _EMPTY_;
    private String bs3q196x = _EMPTY_;
    private String bs3q2a = _EMPTY_;
    private String bs3q2a96x = _EMPTY_;
    private String bs3q2b96 = _EMPTY_;
    private String bs3q2c96 = _EMPTY_;
    private String bs3q2d96 = _EMPTY_;
    private String bs3q3 = _EMPTY_;
    private String bs3q4 = _EMPTY_;
    private String bs3q401 = _EMPTY_;
    private String bs3q402 = _EMPTY_;
    private String bs3q403 = _EMPTY_;
    private String bs3q404 = _EMPTY_;
    private String bs3q405 = _EMPTY_;
    private String bs3q406 = _EMPTY_;
    private String bs3q407 = _EMPTY_;
    private String bs3q496 = _EMPTY_;
    private String bs3q496x = _EMPTY_;
    private String bs3q498 = _EMPTY_;
    private String bs3q5 = _EMPTY_;
    private String bs3q501 = _EMPTY_;
    private String bs3q502 = _EMPTY_;
    private String bs3q503 = _EMPTY_;
    private String bs3q504 = _EMPTY_;
    private String bs3q598 = _EMPTY_;
    private String bs3q596 = _EMPTY_;
    private String bs3q596x = _EMPTY_;
    private String bs3q6 = _EMPTY_;
    private String bs3q601 = _EMPTY_;
    private String bs3q602 = _EMPTY_;
    private String bs3q603 = _EMPTY_;
    private String bs3q604 = _EMPTY_;
    private String bs3q605 = _EMPTY_;
    private String bs3q606 = _EMPTY_;
    private String bs3q607 = _EMPTY_;
    private String bs3q608 = _EMPTY_;
    private String bs3q609 = _EMPTY_;
    private String bs3q698 = _EMPTY_;
    private String bs3q696 = _EMPTY_;
    private String bs3q696x = _EMPTY_;
    private String bs3q7 = _EMPTY_;
    private String bs3q701 = _EMPTY_;
    private String bs3q702 = _EMPTY_;
    private String bs3q703 = _EMPTY_;
    private String bs3q704 = _EMPTY_;
    private String bs3q705 = _EMPTY_;
    private String bs3q798 = _EMPTY_;
    private String bs3q796 = _EMPTY_;
    private String bs3q796x = _EMPTY_;
    private String bs3q8 = _EMPTY_;
    private String bs3q801 = _EMPTY_;
    private String bs3q802 = _EMPTY_;
    private String bs3q803 = _EMPTY_;
    private String bs3q804 = _EMPTY_;
    private String bs3q897 = _EMPTY_;
    private String bs3q896 = _EMPTY_;
    private String bs3q896x = _EMPTY_;
    private String bs3q9 = _EMPTY_;
    private String bs3q901 = _EMPTY_;
    private String bs3q902 = _EMPTY_;
    private String bs3q903 = _EMPTY_;
    private String bs3q904 = _EMPTY_;
    private String bs3q905 = _EMPTY_;
    private String bs3q906 = _EMPTY_;
    private String bs3q996 = _EMPTY_;
    private String bs3q996x = _EMPTY_;
    private String bs3q997 = _EMPTY_;
    private String bs3q10 = _EMPTY_;
    private String bs3q1001 = _EMPTY_;
    private String bs3q1002 = _EMPTY_;
    private String bs3q1003 = _EMPTY_;
    private String bs3q1004 = _EMPTY_;
    private String bs3q1005 = _EMPTY_;
    private String bs3q1006 = _EMPTY_;
    private String bs3q1007 = _EMPTY_;
    private String bs3q1008 = _EMPTY_;
    private String bs3q1009 = _EMPTY_;
    private String bs3q1096 = _EMPTY_;
    private String bs3q1096x = _EMPTY_;
    private String bs3q1097 = _EMPTY_;
    private String bs3q11 = _EMPTY_;
    private String bs3q12 = _EMPTY_;
    private String bs3q1201 = _EMPTY_;
    private String bs3q1202 = _EMPTY_;
    private String bs3q1203 = _EMPTY_;
    private String bs3q1204 = _EMPTY_;
    private String bs3q1205 = _EMPTY_;
    private String bs3q1206 = _EMPTY_;
    private String bs3q1206x = _EMPTY_;
    private String bs3q1207 = _EMPTY_;
    private String bs3q1296 = _EMPTY_;
    private String bs3q1296x = _EMPTY_;
    private String bs3q13 = _EMPTY_;
    private String bs3q14 = _EMPTY_;
    private String bs3q15 = _EMPTY_;
    private String bs4aq1 = _EMPTY_;
    private String bs4aq2 = _EMPTY_;
    private String bs4aq201 = _EMPTY_;
    private String bs4aq202 = _EMPTY_;
    private String bs4aq203 = _EMPTY_;
    private String bs4aq204 = _EMPTY_;
    private String bs4aq205 = _EMPTY_;
    private String bs4aq206 = _EMPTY_;
    private String bs4aq207 = _EMPTY_;
    private String bs4aq208 = _EMPTY_;
    private String bs4aq298 = _EMPTY_;
    private String bs4aq296 = _EMPTY_;
    private String bs4aq296x = _EMPTY_;
    private String bs4aq3 = _EMPTY_;
    private String bs4aq4 = _EMPTY_;
    private String bs4aq5 = _EMPTY_;
    private String bs4aq6 = _EMPTY_;
    private String bs4aq696x = _EMPTY_;
    private String bs4aq7 = _EMPTY_;
    private String bs4aq8 = _EMPTY_;
    private String bs4aq896x = _EMPTY_;
    private String bs4aq9 = _EMPTY_;
    private String bs4aq10 = _EMPTY_;
    private String bs4bq1 = _EMPTY_;
    private String bs4bq2 = _EMPTY_;
    private String bs4bq21 = _EMPTY_;
    private String bs4bq22 = _EMPTY_;
    private String bs4bq23 = _EMPTY_;
    private String bs4bq24 = _EMPTY_;
    private String bs4bq298 = _EMPTY_;
    private String bs4bq296 = _EMPTY_;
    private String bs4bq296x = _EMPTY_;
    private String bs4bq3 = _EMPTY_;
    private String bs4bq31 = _EMPTY_;
    private String bs4bq32 = _EMPTY_;
    private String bs4bq33 = _EMPTY_;
    private String bs4bq34 = _EMPTY_;
    private String bs4bq35 = _EMPTY_;
    private String bs4bq36 = _EMPTY_;
    private String bs4bq398 = _EMPTY_;
    private String bs4bq396 = _EMPTY_;
    private String bs4bq396x = _EMPTY_;
    private String bs4bq4 = _EMPTY_;
    private String bs4bq5 = _EMPTY_;
    private String bs4bq51 = _EMPTY_;
    private String bs4bq52 = _EMPTY_;
    private String bs4bq53 = _EMPTY_;
    private String bs4bq598 = _EMPTY_;
    private String bs4bq596 = _EMPTY_;
    private String bs4bq596x = _EMPTY_;
    private String bs4bq6 = _EMPTY_;
    private String bs4bq696x = _EMPTY_;
    private String bs4bq7 = _EMPTY_;
    private String bs4bq8 = _EMPTY_;
    private String bs4bq81 = _EMPTY_;
    private String bs4bq82 = _EMPTY_;
    private String bs4bq83 = _EMPTY_;
    private String bs4bq84 = _EMPTY_;
    private String bs4bq85 = _EMPTY_;
    private String bs4bq86 = _EMPTY_;
    private String bs4bq87 = _EMPTY_;
    private String bs4bq898 = _EMPTY_;
    private String bs4bq896 = _EMPTY_;
    private String bs4bq896x = _EMPTY_;
    private String bs5q1 = _EMPTY_;
    private String bs5q2 = _EMPTY_;
    private String bs5q201 = _EMPTY_;
    private String bs5q202 = _EMPTY_;
    private String bs5q203 = _EMPTY_;
    private String bs5q204 = _EMPTY_;
    private String bs5q205 = _EMPTY_;
    private String bs5q296 = _EMPTY_;
    private String bs5q296x = _EMPTY_;
    private String bs5q297 = _EMPTY_;
    private String bs5q3 = _EMPTY_;
    private String bs5q4 = _EMPTY_;
    private String bs5q401 = _EMPTY_;
    private String bs5q402 = _EMPTY_;
    private String bs5q403 = _EMPTY_;
    private String bs5q404 = _EMPTY_;
    private String bs5q496 = _EMPTY_;
    private String bs5q496x = _EMPTY_;
    private String bs5q497 = _EMPTY_;
    private String bs5q5 = _EMPTY_;
    private String bs5q6 = _EMPTY_;
    private String bs5q7 = _EMPTY_;
    private String bs5q8 = _EMPTY_;
    private String bs5q801 = _EMPTY_;
    private String bs5q802 = _EMPTY_;
    private String bs5q803 = _EMPTY_;
    private String bs5q804 = _EMPTY_;
    private String bs5q805 = _EMPTY_;
    private String bs5q806 = _EMPTY_;
    private String bs5q807 = _EMPTY_;
    private String bs5q808 = _EMPTY_;
    private String bs5q896 = _EMPTY_;
    private String bs5q896x = _EMPTY_;
    private String bs5q898 = _EMPTY_;
    private String bs5q9 = _EMPTY_;
    private String bs5q901 = _EMPTY_;
    private String bs5q902 = _EMPTY_;
    private String bs5q903 = _EMPTY_;
    private String bs5q904 = _EMPTY_;
    private String bs5q905 = _EMPTY_;
    private String bs5q906 = _EMPTY_;
    private String bs5q907 = _EMPTY_;
    private String bs5q908 = _EMPTY_;
    private String bs5q996 = _EMPTY_;
    private String bs5q996x = _EMPTY_;
    private String bs5q998 = _EMPTY_;
    private String bs5q10 = _EMPTY_;
    private String bs5q1096x = _EMPTY_;
    private String bs5q11 = _EMPTY_;
    private String bs5q12 = _EMPTY_;
    private String bs6q1 = _EMPTY_;
    private String bs6q1mx = _EMPTY_;
    private String bs6q2 = _EMPTY_;
    private String bs6q3 = _EMPTY_;
    private String bs6q3mx = _EMPTY_;
    private String bs7q1 = _EMPTY_;
    private String bs7q2line = _EMPTY_;
    private String bs7q3 = _EMPTY_;
    private String bs7q4a = _EMPTY_;
    private String bs7q4b = _EMPTY_;
    private String bs7q4c = _EMPTY_;
    private String bs7q4d = _EMPTY_;
    private String bs7q4e = _EMPTY_;
    private String bs7q4f = _EMPTY_;
    private String bs7q4g = _EMPTY_;
    private String bs7q4h = _EMPTY_;
    private String cs1q0101 = _EMPTY_;
    private String cs1q0102 = _EMPTY_;
    private String cs1q02 = _EMPTY_;
    private String cs1q02c1 = _EMPTY_;
    private String cs1q02c1n = _EMPTY_;
    private String cs1q02c1ecd = _EMPTY_;
    private String cs1q02c1cent = _EMPTY_;
    private String cs1q02c2 = _EMPTY_;
    private String cs1q02c2n = _EMPTY_;
    private String cs1q02c2ecd = _EMPTY_;
    private String cs1q02c2cent = _EMPTY_;
    private String cs1q02c3 = _EMPTY_;
    private String cs1q02c3n = _EMPTY_;
    private String cs1q02c3ecd = _EMPTY_;
    private String cs1q02c3cent = _EMPTY_;
    private String cs1q02c4 = _EMPTY_;
    private String cs1q02c4n = _EMPTY_;
    private String cs1q02c4ecd = _EMPTY_;
    private String cs1q02c4cent = _EMPTY_;
    private String cs1q02c5 = _EMPTY_;
    private String cs1q02c5n = _EMPTY_;
    private String cs1q02c5ecd = _EMPTY_;
    private String cs1q02c5cent = _EMPTY_;
    private String cs1q8 = _EMPTY_;
    private String cs1q8096x = _EMPTY_;
    private String cs1q9 = _EMPTY_;
    private String cs1q9096x = _EMPTY_;
    private String cs1q10 = _EMPTY_;
    private String cs1q11 = _EMPTY_;
    private String cs1q11096x = _EMPTY_;
    private String cs2q01 = _EMPTY_;
    private String cs2q02 = _EMPTY_;
    private String cs2q05 = _EMPTY_;
    private String cs2q0596x = _EMPTY_;
    private String cs2q06 = _EMPTY_;
    private String cs2q0696x = _EMPTY_;
    private String cs2q07 = _EMPTY_;
    private String cs2q0801 = _EMPTY_;
    private String cs2q08021 = _EMPTY_;
    private String cs2q08022 = _EMPTY_;
    private String cs2q08023 = _EMPTY_;
    private String cs2q08024 = _EMPTY_;
    private String cs2q0803 = _EMPTY_;
    private String cs2q0804 = _EMPTY_;
    private String cs2q0805 = _EMPTY_;
    private String cs2q0806 = _EMPTY_;
    private String cs2q0807 = _EMPTY_;
    private String cs2q08081 = _EMPTY_;
    private String cs2q08082 = _EMPTY_;
    private String cs2q08083 = _EMPTY_;
    private String cs2q0809 = _EMPTY_;
    private String cs2q0810 = _EMPTY_;
    private String cs2q0811 = _EMPTY_;
    private String cs2q0812 = _EMPTY_;
    private String cs2q0813 = _EMPTY_;
    private String cs2q0814 = _EMPTY_;
    private String cs2q0815 = _EMPTY_;
    private String cs2q0816 = _EMPTY_;
    private String cs2q0817 = _EMPTY_;
    private String cs2q0818 = _EMPTY_;
    private String cs2q0819 = _EMPTY_;
    private String cs2q0820 = _EMPTY_;
    private String cs3aq01 = _EMPTY_;
    private String cs3aq02 = _EMPTY_;
    private String cs3aq03 = _EMPTY_;
    private String cs3aq04 = _EMPTY_;
    private String cs3bq01 = _EMPTY_;
    private String cs3bq0101x = _EMPTY_;
    private String cs3bq02a = _EMPTY_;
    private String cs3bq02b = _EMPTY_;
    private String cs3bq02c = _EMPTY_;
    private String cs3bq03 = _EMPTY_;
    private String cs3bq0301x = _EMPTY_;
    private String cs3bq03a = _EMPTY_;
    private String cs3bq03adx = _EMPTY_;
    private String cs3bq03b = _EMPTY_;
    private String cs3bq03bdx = _EMPTY_;
    private String cs3bq04 = _EMPTY_;
    private String cs3bq05 = _EMPTY_;
    private String cs3bq05a = _EMPTY_;
    private String cs3bq05aa = _EMPTY_;
    private String cs3bq05ab = _EMPTY_;
    private String cs3bq05ax = _EMPTY_;
    private String cs3bq05a97 = _EMPTY_;
    private String cs3bq05b = _EMPTY_;
    private String cs3bq05ba = _EMPTY_;
    private String cs3bq05bb = _EMPTY_;
    private String cs3bq05bx = _EMPTY_;
    private String cs3bq05b97 = _EMPTY_;
    private String cs3bq05c = _EMPTY_;
    private String cs3bq05ca = _EMPTY_;
    private String cs3bq05cb = _EMPTY_;
    private String cs3bq05cx = _EMPTY_;
    private String cs3bq05c97 = _EMPTY_;
    private String cs3bq05d = _EMPTY_;
    private String cs3bq05da = _EMPTY_;
    private String cs3bq05db = _EMPTY_;
    private String cs3bq05dx = _EMPTY_;
    private String cs3bq05d97 = _EMPTY_;
    private String cs3bq05e = _EMPTY_;
    private String cs3bq05ea = _EMPTY_;
    private String cs3bq05eb = _EMPTY_;
    private String cs3bq05ex = _EMPTY_;
    private String cs3bq05e97 = _EMPTY_;
    private String cs3bq05f = _EMPTY_;
    private String cs3bq05fa = _EMPTY_;
    private String cs3bq05fb = _EMPTY_;
    private String cs3bq05fx = _EMPTY_;
    private String cs3bq05f97 = _EMPTY_;
    private String cs3bq06 = _EMPTY_;
    private String cs3bq07 = _EMPTY_;
    private String cs3bq08 = _EMPTY_;
    private String cs3bq09 = _EMPTY_;
    private String cs3bq10 = _EMPTY_;
    private String cs3bq11 = _EMPTY_;
    private String cs3bq12 = _EMPTY_;
    private String cs3bq13 = _EMPTY_;
    private String cs3bq14 = _EMPTY_;
    private String cs3bq15 = _EMPTY_;
    private String cs3bq16 = _EMPTY_;
    private String cs4q01 = _EMPTY_;
    private String cs4q02a = _EMPTY_;
    private String cs4q02b = _EMPTY_;
    private String cs4q02c = _EMPTY_;
    private String cs4q02d = _EMPTY_;
    private String cs4q02e = _EMPTY_;
    private String cs4q02f = _EMPTY_;
    private String cs4q02g = _EMPTY_;
    private String cs4q02h = _EMPTY_;
    private String cs4q02i = _EMPTY_;
    private String cs4q02j = _EMPTY_;
    private String cs4q02k = _EMPTY_;
    private String cs4q03 = _EMPTY_;
    private String cs5q01 = _EMPTY_;
    private String cs5q02 = _EMPTY_;
    private String cs5q03 = _EMPTY_;
    private String cs5q04 = _EMPTY_;
    private String cs5q05 = _EMPTY_;
    private String cs5q06a = _EMPTY_;
    private String cs5q06b = _EMPTY_;
    private String cs5q07 = _EMPTY_;
    private String cs5q08a = _EMPTY_;
    private String cs5q08b = _EMPTY_;
    private String cs5q09 = _EMPTY_;
    private String cs5q10 = _EMPTY_;
    private String cs5q11 = _EMPTY_;
    private String cs5q12 = _EMPTY_;
    private String cs5q13 = _EMPTY_;
    private String cs5q14 = _EMPTY_;
    private String cs5q15 = _EMPTY_;
    private String cs5q16 = _EMPTY_;
    private String cs5q17 = _EMPTY_;
    private String cs5q18 = _EMPTY_;
    private String ds1q01 = _EMPTY_;
    private String ds1q02 = _EMPTY_;
    private String ds1q03a = _EMPTY_;
    private String ds1q03b = _EMPTY_;
    private String ds1q03c = _EMPTY_;
    private String ds1q03d = _EMPTY_;
    private String ds1q03e = _EMPTY_;
    private String ds1q03f = _EMPTY_;
    private String ds1q04 = _EMPTY_;
    private String ds2q01a = _EMPTY_;
    private String ds2q01b = _EMPTY_;
    private String ds2q01c = _EMPTY_;
    private String ds3q01 = _EMPTY_;
    private String ds3q02 = _EMPTY_;
    private String ds3q03a = _EMPTY_;
    private String ds3q03b = _EMPTY_;
    private String ds3q03c = _EMPTY_;
    private String ds3q03d = _EMPTY_;
    private String ds3q03e = _EMPTY_;
    private String ds3q03f = _EMPTY_;
    private String ds3q03g = _EMPTY_;
    private String es1resp = _EMPTY_;
    private String es1respline = _EMPTY_;
    private String es1cons = _EMPTY_;
    private String es1q1 = _EMPTY_;
    private String es1q196x = _EMPTY_;
    private String es1q2 = _EMPTY_;
    private String es1q3 = _EMPTY_;
    private String es1q4 = _EMPTY_;
    private String es1q405 = _EMPTY_;
    private String es1q406 = _EMPTY_;
    private String es1q407 = _EMPTY_;
    private String es1q408 = _EMPTY_;
    private String es1q409 = _EMPTY_;
    private String es1q496 = _EMPTY_;
    private String es1q496x = _EMPTY_;
    private String es1q5 = _EMPTY_;
    private String es1q6 = _EMPTY_;
    private String es1q7 = _EMPTY_;
    private String es1q8a = _EMPTY_;
    private String es1q8b = _EMPTY_;
    private String es1q8c = _EMPTY_;
    private String es1q9 = _EMPTY_;
    private String es1q10 = _EMPTY_;
    private String es1q11 = _EMPTY_;
    private String es2q1 = _EMPTY_;
    private String es2q2 = _EMPTY_;
    private String es2q3 = _EMPTY_;
    private String es2q4 = _EMPTY_;
    private String es2q5 = _EMPTY_;
    private String es2q6 = _EMPTY_;
    private String es2q7 = _EMPTY_;
    private String es2q8 = _EMPTY_;
    private String es2q9 = _EMPTY_;
    private String es2q10 = _EMPTY_;
    private String es2q196x = _EMPTY_;
    private String es3q1 = _EMPTY_;
    private String es3q2 = _EMPTY_;
    private String es3q296x = _EMPTY_;
    private String es3q3 = _EMPTY_;
    private String es3q396x = _EMPTY_;
    private String es3q4 = _EMPTY_;
    private String es3q5 = _EMPTY_;
    private String es3q501 = _EMPTY_;
    private String es3q502 = _EMPTY_;
    private String es3q503 = _EMPTY_;
    private String es3q504 = _EMPTY_;
    private String es3q505 = _EMPTY_;
    private String es3q506 = _EMPTY_;
    private String es3q507 = _EMPTY_;
    private String es3q596 = _EMPTY_;
    private String es3q596x = _EMPTY_;
    private String es3q6 = _EMPTY_;
    private String es3q7 = _EMPTY_;
    private String es3q8 = _EMPTY_;
    private String es3q9 = _EMPTY_;
    private String es3q901 = _EMPTY_;
    private String es3q902 = _EMPTY_;
    private String es3q903 = _EMPTY_;
    private String es3q904 = _EMPTY_;
    private String es3q905 = _EMPTY_;
    private String es3q906 = _EMPTY_;
    private String es3q907 = _EMPTY_;
    private String es3q908 = _EMPTY_;
    private String es3q996 = _EMPTY_;
    private String es3q996x = _EMPTY_;
    private String es3q998 = _EMPTY_;
    private String es3q10 = _EMPTY_;
    private String es3q1001 = _EMPTY_;
    private String es3q1002 = _EMPTY_;
    private String es3q1003 = _EMPTY_;
    private String es3q1004 = _EMPTY_;
    private String es3q1005 = _EMPTY_;
    private String es3q1006 = _EMPTY_;
    private String es3q1007 = _EMPTY_;
    private String es3q1008 = _EMPTY_;
    private String es3q196 = _EMPTY_;
    private String es3q196x = _EMPTY_;
    private String es3q1098 = _EMPTY_;
    private String es3q11 = _EMPTY_;
    private String es3q1106x = _EMPTY_;
    private String es3q12 = _EMPTY_;
    private String es3q13 = _EMPTY_;
    private String es3q14 = _EMPTY_;
    private String es4q1 = _EMPTY_;
    private String es4q101 = _EMPTY_;
    private String es4q102 = _EMPTY_;
    private String es4q103 = _EMPTY_;
    private String es4q104 = _EMPTY_;
    private String es4q105 = _EMPTY_;
    private String es4q106 = _EMPTY_;
    private String es4q107 = _EMPTY_;
    private String es4q196 = _EMPTY_;
    private String es4q196x = _EMPTY_;
    private String es4q197 = _EMPTY_;
    private String es4q198 = _EMPTY_;
    private String es4q2 = _EMPTY_;
    private String es4q3 = _EMPTY_;
    private String es4q301 = _EMPTY_;
    private String es4q302 = _EMPTY_;
    private String es4q303 = _EMPTY_;
    private String es4q304 = _EMPTY_;
    private String es4q305 = _EMPTY_;
    private String es4q306 = _EMPTY_;
    private String es4q307 = _EMPTY_;
    private String es4q396 = _EMPTY_;
    private String es4q396x = _EMPTY_;
    private String es4q398 = _EMPTY_;
    private String es4q4 = _EMPTY_;
    private String es4q401 = _EMPTY_;
    private String es4q402 = _EMPTY_;
    private String es4q403 = _EMPTY_;
    private String es4q404 = _EMPTY_;
    private String es4q496 = _EMPTY_;
    private String es4q496x = _EMPTY_;
    private String es4q498 = _EMPTY_;
    private String es4q5 = _EMPTY_;
    private String es4q501 = _EMPTY_;
    private String es4q502 = _EMPTY_;
    private String es4q503 = _EMPTY_;
    private String es4q504 = _EMPTY_;
    private String es4q505 = _EMPTY_;
    private String es4q506 = _EMPTY_;
    private String es4q507 = _EMPTY_;
    private String es4q508 = _EMPTY_;
    private String es4q509 = _EMPTY_;
    private String es4q596 = _EMPTY_;
    private String es4q596x = _EMPTY_;
    private String es4q598 = _EMPTY_;
    private String es4q6 = _EMPTY_;
    private String es4q601 = _EMPTY_;
    private String es4q602 = _EMPTY_;
    private String es4q603 = _EMPTY_;
    private String es4q604 = _EMPTY_;
    private String es4q605 = _EMPTY_;
    private String es4q696 = _EMPTY_;
    private String es4q696x = _EMPTY_;
    private String es4q698 = _EMPTY_;
    private String es4q7 = _EMPTY_;
    private String es4q8 = _EMPTY_;
    private String es4q801 = _EMPTY_;
    private String es4q802 = _EMPTY_;
    private String es4q803 = _EMPTY_;
    private String es4q804 = _EMPTY_;
    private String es4q805 = _EMPTY_;
    private String es4q806 = _EMPTY_;
    private String es4q807 = _EMPTY_;
    private String es4q808 = _EMPTY_;
    private String es4q809 = _EMPTY_;
    private String es4q8010 = _EMPTY_;
    private String es4q8011 = _EMPTY_;
    private String es4q8012 = _EMPTY_;
    private String es4q8013 = _EMPTY_;
    private String es4q8014 = _EMPTY_;
    private String es4q8015 = _EMPTY_;
    private String es4q8016 = _EMPTY_;
    private String es4q8017 = _EMPTY_;
    private String es4q8018 = _EMPTY_;
    private String es4q866 = _EMPTY_;
    private String es4q896 = _EMPTY_;
    private String es4q896x = _EMPTY_;


    public Form() {

        setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setAppver(MainApp.appInfo.getAppVersion());
        setAppver(MainApp.appInfo.getAppVersion());

    }


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Bindable
    public String getEbCode() {
        return ebCode;
    }

    public void setEbCode(String ebCode) {
        this.ebCode = ebCode;
        notifyPropertyChanged(BR.ebCode);
    }

    @Bindable
    public String getHhid() {
        return hhid;
    }

    public void setHhid(String hhid) {
        this.hhid = hhid;
        notifyPropertyChanged(BR.hhid);
    }

    @Bindable
    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
        notifyPropertyChanged(BR.sno);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSysDate() {
        return sysDate;
    }

    public void setSysDate(String sysDate) {
        this.sysDate = sysDate;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceTag() {
        return deviceTag;
    }

    public void setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
    }

    public String getAppver() {
        return appver;
    }

    public void setAppver(String appver) {
        this.appver = appver;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getiStatus() {
        return iStatus;
    }

    public void setiStatus(String iStatus) {
        this.iStatus = iStatus;
    }

    public String getiStatus96x() {
        return iStatus96x;
    }

    public void setiStatus96x(String iStatus96x) {
        this.iStatus96x = iStatus96x;
    }

    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(String syncDate) {
        this.syncDate = syncDate;
    }

   /* public String getsH2a() {
        return sH2a;
    }

    public void setsH2a(String sH2a) {
        this.sH2a = sH2a;
    }*/

    public String getsA1() {
        return sA1;
    }

    public void setsA1(String sA1) {
        this.sA1 = sA1;
    }


    public String getsA2() {
        return sA2;
    }

    public void setsA2(String sA2) {
        this.sA2 = sA2;
    }


    public String getsB1() {
        return sB1;
    }

    public void setsB1(String sB1) {
        this.sB1 = sB1;
    }


    public String getsB2() {
        return sB2;
    }

    public void setsB2(String sB2) {
        this.sB2 = sB2;
    }


    public String getsB3() {
        return sB3;
    }

    public void setsB3(String sB3) {
        this.sB3 = sB3;
    }


    public String getsB41() {
        return sB41;
    }

    public void setsB41(String sB41) {
        this.sB41 = sB41;
    }


    public String getsB42() {
        return sB42;
    }

    public void setsB42(String sB42) {
        this.sB42 = sB42;
    }


    public String getsB5() {
        return sB5;
    }

    public void setsB5(String sB5) {
        this.sB5 = sB5;
    }


    public String getsB6() {
        return sB6;
    }

    public void setsB6(String sB6) {
        this.sB6 = sB6;
    }


    public String getsB7() {
        return sB7;
    }

    public void setsB7(String sB7) {
        this.sB7 = sB7;
    }


    public String getsC1() {
        return sC1;
    }

    public void setsC1(String sC1) {
        this.sC1 = sC1;
    }


    public String getsC2() {
        return sC2;
    }

    public void setsC2(String sC2) {
        this.sC2 = sC2;
    }


    public String getsC31() {
        return sC31;
    }

    public void setsC31(String sC31) {
        this.sC31 = sC31;
    }


    public String getsC32() {
        return sC32;
    }

    public void setsC32(String sC32) {
        this.sC32 = sC32;
    }


    public String getsC4() {
        return sC4;
    }

    public void setsC4(String sC4) {
        this.sC4 = sC4;
    }


    public String getsC5() {
        return sC5;
    }

    public void setsC5(String sC5) {
        this.sC5 = sC5;
    }


    public String getsD1() {
        return sD1;
    }

    public void setsD1(String sD1) {
        this.sD1 = sD1;
    }


    public String getsD2() {
        return sD2;
    }

    public void setsD2(String sD2) {
        this.sD2 = sD2;
    }


    public String getsD3() {
        return sD3;
    }

    public void setsD3(String sD3) {
        this.sD3 = sD3;
    }


    public String getsE1() {
        return sE1;
    }

    public void setsE1(String sE1) {
        this.sE1 = sE1;
    }


    public String getsE2() {
        return sE2;
    }

    public void setsE2(String sE2) {
        this.sE2 = sE2;
    }


    public String getsE3() {
        return sE3;
    }

    public void setsE3(String sE3) {
        this.sE3 = sE3;
    }


    public String getsE4() {
        return sE4;
    }

    public void setsE4(String sE4) {
        this.sE4 = sE4;
    }

    @Bindable
    public String getAs1q01() {
        return as1q01;
    }

    public void setAs1q01(String as1q01) {
        this.as1q01 = as1q01;
        notifyPropertyChanged(BR.as1q01);
    }

    @Bindable
    public String getAs1q02() {
        return as1q02;
    }

    public void setAs1q02(String as1q02) {
        this.as1q02 = as1q02;
        notifyPropertyChanged(BR.as1q02);
    }

    @Bindable
    public String getAs1q03() {
        return as1q03;
    }

    public void setAs1q03(String as1q03) {
        this.as1q03 = as1q03;
        notifyPropertyChanged(BR.as1q03);
    }

    @Bindable
    public String getAs1q04() {
        return as1q04;
    }

    public void setAs1q04(String as1q04) {
        this.as1q04 = as1q04;
        notifyPropertyChanged(BR.as1q04);
    }

    @Bindable
    public String getAs1q05() {
        return as1q05;
    }

    public void setAs1q05(String as1q05) {
        this.as1q05 = as1q05;
        notifyPropertyChanged(BR.as1q05);
    }

    @Bindable
    public String getAs1q06() {
        return as1q06;
    }

    public void setAs1q06(String as1q06) {
        this.as1q06 = as1q06;
        notifyPropertyChanged(BR.as1q06);
    }

    @Bindable
    public String getAs1q07() {
        return as1q07;
    }

    public void setAs1q07(String as1q07) {
        this.as1q07 = as1q07;
        notifyPropertyChanged(BR.as1q07);
    }

    @Bindable
    public String getAs1q08() {
        return as1q08;
    }

    public void setAs1q08(String as1q08) {
        this.as1q08 = as1q08;
        notifyPropertyChanged(BR.as1q08);
    }

    @Bindable
    public String getAs1q09() {
        return as1q09;
    }

    public void setAs1q09(String as1q09) {
        this.as1q09 = as1q09;
        notifyPropertyChanged(BR.as1q09);
    }

    @Bindable
    public String getAs1q10() {
        return as1q10;
    }

    public void setAs1q10(String as1q10) {
        this.as1q10 = as1q10;
        notifyPropertyChanged(BR.as1q10);
    }

    @Bindable
    public String getAs1q11() {
        return as1q11;
    }

    public void setAs1q11(String as1q11) {
        this.as1q11 = as1q11;
        notifyPropertyChanged(BR.as1q11);
    }

    @Bindable
    public String getAs1q12() {
        return as1q12;
    }

    public void setAs1q12(String as1q12) {
        this.as1q12 = as1q12;
        notifyPropertyChanged(BR.as1q12);
    }

    @Bindable
    public String getAs1q13() {
        return as1q13;
    }

    public void setAs1q13(String as1q13) {
        this.as1q13 = as1q13;
        notifyPropertyChanged(BR.as1q13);
    }

    @Bindable
    public String getAs1q14() {
        return as1q14;
    }

    public void setAs1q14(String as1q14) {
        this.as1q14 = as1q14;
        notifyPropertyChanged(BR.as1q14);
    }

    @Bindable
    public String getAs1q15d() {
        return as1q15d;
    }

    public void setAs1q15d(String as1q15d) {
        this.as1q15d = as1q15d;
        notifyPropertyChanged(BR.as1q15d);
    }

    @Bindable
    public String getAs1q15m() {
        return as1q15m;
    }

    public void setAs1q15m(String as1q15m) {
        this.as1q15m = as1q15m;
        notifyPropertyChanged(BR.as1q15m);
    }

    @Bindable
    public String getAs1q15y() {
        return as1q15y;
    }

    public void setAs1q15y(String as1q15y) {
        this.as1q15y = as1q15y;
        notifyPropertyChanged(BR.as1q15y);
    }

    @Bindable
    public String getAs1q16h() {
        return as1q16h;
    }

    public void setAs1q16h(String as1q16h) {
        this.as1q16h = as1q16h;
        notifyPropertyChanged(BR.as1q16h);
    }

    @Bindable
    public String getAs1q16m() {
        return as1q16m;
    }

    public void setAs1q16m(String as1q16m) {
        this.as1q16m = as1q16m;
        notifyPropertyChanged(BR.as1q16m);
    }

    @Bindable
    public String getAs1q17h() {
        return as1q17h;
    }

    public void setAs1q17h(String as1q17h) {
        this.as1q17h = as1q17h;
        notifyPropertyChanged(BR.as1q17h);
    }

    @Bindable
    public String getAs1q17m() {
        return as1q17m;
    }

    public void setAs1q17m(String as1q17m) {
        this.as1q17m = as1q17m;
        notifyPropertyChanged(BR.as1q17m);
    }

    @Bindable
    public String getAs1q18() {
        return as1q18;
    }

    public void setAs1q18(String as1q18) {
        this.as1q18 = as1q18;
        notifyPropertyChanged(BR.as1q18);
    }

    @Bindable
    public String getAs1q19() {
        return as1q19;
    }

    public void setAs1q19(String as1q19) {
        this.as1q19 = as1q19;
        notifyPropertyChanged(BR.as1q19);
    }

    @Bindable
    public String getAs1q20() {
        return as1q20;
    }

    public void setAs1q20(String as1q20) {
        this.as1q20 = as1q20;
        notifyPropertyChanged(BR.as1q20);
    }

    @Bindable
    public String getAs1q21() {
        return as1q21;
    }

    public void setAs1q21(String as1q21) {
        this.as1q21 = as1q21;
        notifyPropertyChanged(BR.as1q21);
    }

    @Bindable
    public String getAs1q22() {
        return as1q22;
    }

    public void setAs1q22(String as1q22) {
        this.as1q22 = as1q22;
        notifyPropertyChanged(BR.as1q22);
    }

    @Bindable
    public String getAs1q23() {
        return as1q23;
    }

    public void setAs1q23(String as1q23) {
        this.as1q23 = as1q23;
        notifyPropertyChanged(BR.as1q23);
    }

    @Bindable
    public String getAs1q23a() {
        return as1q23a;
    }

    public void setAs1q23a(String as1q23a) {
        this.as1q23a = as1q23a;
        notifyPropertyChanged(BR.as1q23a);
    }

    @Bindable
    public String getHl1() {
        return hl1;
    }

    public void setHl1(String hl1) {
        this.hl1 = hl1;
        notifyPropertyChanged(BR.hl1);
    }

    @Bindable
    public String getHl2() {
        return hl2;
    }

    public void setHl2(String hl2) {
        this.hl2 = hl2;
        notifyPropertyChanged(BR.hl2);
    }

    @Bindable
    public String getHl3() {
        return hl3;
    }

    public void setHl3(String hl3) {
        this.hl3 = hl3;
        notifyPropertyChanged(BR.hl3);
    }

    @Bindable
    public String getHl4() {
        return hl4;
    }

    public void setHl4(String hl4) {
        this.hl4 = hl4;
        notifyPropertyChanged(BR.hl4);
    }

    @Bindable
    public String getHl5d() {
        return hl5d;
    }

    public void setHl5d(String hl5d) {
        this.hl5d = hl5d;
        notifyPropertyChanged(BR.hl5d);
    }

    @Bindable
    public String getHl5m() {
        return hl5m;
    }

    public void setHl5m(String hl5m) {
        this.hl5m = hl5m;
        notifyPropertyChanged(BR.hl5m);
    }

    @Bindable
    public String getHl5y() {
        return hl5y;
    }

    public void setHl5y(String hl5y) {
        this.hl5y = hl5y;
        notifyPropertyChanged(BR.hl5y);
    }

    @Bindable
    public String getHl6y() {
        return hl6y;
    }

    public void setHl6y(String hl6y) {
        this.hl6y = hl6y;
        notifyPropertyChanged(BR.hl6y);
    }

    @Bindable
    public String getHl6m() {
        return hl6m;
    }

    public void setHl6m(String hl6m) {
        this.hl6m = hl6m;
        notifyPropertyChanged(BR.hl6m);
    }

    @Bindable
    public String getHl7() {
        return hl7;
    }

    public void setHl7(String hl7) {
        this.hl7 = hl7;
        notifyPropertyChanged(BR.hl7);
    }

    @Bindable
    public String getHl8() {
        return hl8;
    }

    public void setHl8(String hl8) {
        this.hl8 = hl8;
        notifyPropertyChanged(BR.hl8);
    }

    @Bindable
    public String getHl9() {
        return hl9;
    }

    public void setHl9(String hl9) {
        this.hl9 = hl9;
        notifyPropertyChanged(BR.hl9);
    }

    @Bindable
    public String getHl10() {
        return hl10;
    }

    public void setHl10(String hl10) {
        this.hl10 = hl10;
        notifyPropertyChanged(BR.hl10);
    }

    @Bindable
    public String getHl11() {
        return hl11;
    }

    public void setHl11(String hl11) {
        this.hl11 = hl11;
        notifyPropertyChanged(BR.hl11);
    }

    @Bindable
    public String getHl12() {
        return hl12;
    }

    public void setHl12(String hl12) {
        this.hl12 = hl12;
        notifyPropertyChanged(BR.hl12);
    }

    @Bindable
    public String getHl1296x() {
        return hl1296x;
    }

    public void setHl1296x(String hl1296x) {
        this.hl1296x = hl1296x;
        notifyPropertyChanged(BR.hl1296x);
    }

    @Bindable
    public String getHl13() {
        return hl13;
    }

    public void setHl13(String hl13) {
        this.hl13 = hl13;
        notifyPropertyChanged(BR.hl13);
    }

    @Bindable
    public String getBs1resp() {
        return bs1resp;
    }

    public void setBs1resp(String bs1resp) {
        this.bs1resp = bs1resp;
        notifyPropertyChanged(BR.bs1resp);
    }

    @Bindable
    public String getBs1respline() {
        return bs1respline;
    }

    public void setBs1respline(String bs1respline) {
        this.bs1respline = bs1respline;
        notifyPropertyChanged(BR.bs1respline);
    }

    @Bindable
    public String getBs1con() {
        return bs1con;
    }

    public void setBs1con(String bs1con) {
        this.bs1con = bs1con;
        setBs1q1(bs1con.equals("2") ? "" : this.bs1q1);
        setBs1q2(bs1con.equals("2") ? "" : this.bs1q2);
        setBs1q3(bs1con.equals("2") ? "" : this.bs1q3);
        setBs1q4(bs1con.equals("2") ? "" : this.bs1q4);
        setBs1q5(bs1con.equals("2") ? "" : this.bs1q5);
        setBs1q6(bs1con.equals("2") ? "" : this.bs1q6);
        setBs1q7p1d(bs1con.equals("2") ? "" : this.bs1q7p1d);
        setBs1q7p1g(bs1con.equals("2") ? "" : this.bs1q7p1g);
        setBs1q7p1b(bs1con.equals("2") ? "" : this.bs1q7p1b);
        setBs1q7p2d(bs1con.equals("2") ? "" : this.bs1q7p2d);
        setBs1q7p2g(bs1con.equals("2") ? "" : this.bs1q7p2g);
        setBs1q7p2b(bs1con.equals("2") ? "" : this.bs1q7p2b);
        setBs1q7p3d(bs1con.equals("2") ? "" : this.bs1q7p3d);
        setBs1q7p3g(bs1con.equals("2") ? "" : this.bs1q7p3g);
        setBs1q7p3b(bs1con.equals("2") ? "" : this.bs1q7p3b);
        setBs1q7p4d(bs1con.equals("2") ? "" : this.bs1q7p4d);
        setBs1q7p4g(bs1con.equals("2") ? "" : this.bs1q7p4g);
        setBs1q7p4b(bs1con.equals("2") ? "" : this.bs1q7p4b);
        setBs1q7p5d(bs1con.equals("2") ? "" : this.bs1q7p5d);
        setBs1q7p5g(bs1con.equals("2") ? "" : this.bs1q7p5g);
        setBs1q7p5b(bs1con.equals("2") ? "" : this.bs1q7p5b);
        setBs1q08(bs1con.equals("2") ? "" : this.bs1q08);
        setBs1q0901(bs1con.equals("2") ? "" : this.bs1q0901);
        setBs1q0902(bs1con.equals("2") ? "" : this.bs1q0902);
        setBs1q0903(bs1con.equals("2") ? "" : this.bs1q0903);
        setBs1q0904(bs1con.equals("2") ? "" : this.bs1q0904);
        setBs1q0905(bs1con.equals("2") ? "" : this.bs1q0905);
        setBs1q0906(bs1con.equals("2") ? "" : this.bs1q0906);
        setBs1q0907(bs1con.equals("2") ? "" : this.bs1q0907);
        setBs1q0908(bs1con.equals("2") ? "" : this.bs1q0908);
        setBs1q09t296(bs1con.equals("2") ? "" : this.bs1q09t296);
        setBs1q1001(bs1con.equals("2") ? "" : this.bs1q1001);
        setBs1q1002(bs1con.equals("2") ? "" : this.bs1q1002);
        setBs1q1098(bs1con.equals("2") ? "" : this.bs1q1098);
        setBs1q11(bs1con.equals("2") ? "" : this.bs1q11);
        setBs1q12(bs1con.equals("2") ? "" : this.bs1q12);
        setBs1q1301(bs1con.equals("2") ? "" : this.bs1q1301);
        setBs1q1302(bs1con.equals("2") ? "" : this.bs1q1302);
        setBs1q1303(bs1con.equals("2") ? "" : this.bs1q1303);
        setBs1q1304(bs1con.equals("2") ? "" : this.bs1q1304);
        setBs1q1305(bs1con.equals("2") ? "" : this.bs1q1305);
        setBs1q1306(bs1con.equals("2") ? "" : this.bs1q1306);
        setBs1q1307(bs1con.equals("2") ? "" : this.bs1q1307);
        setBs1q1308(bs1con.equals("2") ? "" : this.bs1q1308);
        setBs1q1396(bs1con.equals("2") ? "" : this.bs1q1396);
        notifyPropertyChanged(BR.bs1con);
    }

    @Bindable
    public String getBs1q1() {
        return bs1q1;
    }

    public void setBs1q1(String bs1q1) {
        this.bs1q1 = bs1q1;
        notifyPropertyChanged(BR.bs1q1);
    }

    @Bindable
    public String getBs1q2() {
        return bs1q2;
    }

    public void setBs1q2(String bs1q2) {
        this.bs1q2 = bs1q2;
        notifyPropertyChanged(BR.bs1q2);
    }

    @Bindable
    public String getBs1q3() {
        return bs1q3;
    }

    public void setBs1q3(String bs1q3) {
        this.bs1q3 = bs1q3;
        notifyPropertyChanged(BR.bs1q3);
    }

    @Bindable
    public String getBs1q4() {
        return bs1q4;
    }

    public void setBs1q4(String bs1q4) {
        this.bs1q4 = bs1q4;
        notifyPropertyChanged(BR.bs1q4);
    }

    @Bindable
    public String getBs1q5() {
        return bs1q5;
    }

    public void setBs1q5(String bs1q5) {
        this.bs1q5 = bs1q5;
        notifyPropertyChanged(BR.bs1q5);
    }

    @Bindable
    public String getBs1q6() {
        return bs1q6;
    }

    public void setBs1q6(String bs1q6) {
        this.bs1q6 = bs1q6;
        notifyPropertyChanged(BR.bs1q6);
    }

    @Bindable
    public String getBs1q7p1g() {
        return bs1q7p1g;
    }

    public void setBs1q7p1g(String bs1q7p1g) {
        this.bs1q7p1g = bs1q7p1g;
        notifyPropertyChanged(BR.bs1q7p1g);
    }

    @Bindable
    public String getBs1q7p1d() {
        return bs1q7p1d;
    }

    public void setBs1q7p1d(String bs1q7p1d) {
        this.bs1q7p1d = bs1q7p1d;
        setBs1q7p1d96x(bs1q7p1d.equals("96") ? this.bs1q7p1d96x : "");
        notifyPropertyChanged(BR.bs1q7p1d);
    }

    @Bindable
    public String getBs1q7p1d96x() {
        return bs1q7p1d96x;
    }

    public void setBs1q7p1d96x(String bs1q7p1d96x) {
        this.bs1q7p1d96x = bs1q7p1d96x;
        notifyPropertyChanged(BR.bs1q7p1d96x);
    }

    @Bindable
    public String getBs1q7p1b() {
        return bs1q7p1b;
    }

    public void setBs1q7p1b(String bs1q7p1b) {
        this.bs1q7p1b = bs1q7p1b;
        notifyPropertyChanged(BR.bs1q7p1b);
    }

    @Bindable
    public String getBs1q7p2g() {
        return bs1q7p2g;
    }

    public void setBs1q7p2g(String bs1q7p2g) {
        this.bs1q7p2g = bs1q7p2g;
        notifyPropertyChanged(BR.bs1q7p2g);
    }

    @Bindable
    public String getBs1q7p2d() {
        return bs1q7p2d;
    }

    public void setBs1q7p2d(String bs1q7p2d) {
        this.bs1q7p2d = bs1q7p2d;
        setBs1q7p2d96x(bs1q7p2d.equals("96") ? this.bs1q7p2d96x : "");
        notifyPropertyChanged(BR.bs1q7p2d);
    }

    @Bindable
    public String getBs1q7p2d96x() {
        return bs1q7p2d96x;
    }

    public void setBs1q7p2d96x(String bs1q7p2d96x) {
        this.bs1q7p2d96x = bs1q7p2d96x;
        notifyPropertyChanged(BR.bs1q7p2d96x);
    }

    @Bindable
    public String getBs1q7p2b() {
        return bs1q7p2b;
    }

    public void setBs1q7p2b(String bs1q7p2b) {
        this.bs1q7p2b = bs1q7p2b;
        notifyPropertyChanged(BR.bs1q7p2b);
    }

    @Bindable
    public String getBs1q7p3g() {
        return bs1q7p3g;
    }

    public void setBs1q7p3g(String bs1q7p3g) {
        this.bs1q7p3g = bs1q7p3g;
        notifyPropertyChanged(BR.bs1q7p3g);
    }

    @Bindable
    public String getBs1q7p3d() {
        return bs1q7p3d;
    }

    public void setBs1q7p3d(String bs1q7p3d) {
        this.bs1q7p3d = bs1q7p3d;
        setBs1q7p3d96x(bs1q7p5d.equals("96") ? this.bs1q7p3d96x : "");
        notifyPropertyChanged(BR.bs1q7p3d);
    }

    @Bindable
    public String getBs1q7p3d96x() {
        return bs1q7p3d96x;
    }

    public void setBs1q7p3d96x(String bs1q7p3d96x) {
        this.bs1q7p3d96x = bs1q7p3d96x;
        notifyPropertyChanged(BR.bs1q7p3d96x);
    }

    @Bindable
    public String getBs1q7p3b() {
        return bs1q7p3b;
    }

    public void setBs1q7p3b(String bs1q7p3b) {
        this.bs1q7p3b = bs1q7p3b;
        notifyPropertyChanged(BR.bs1q7p3b);
    }

    @Bindable
    public String getBs1q7p4g() {
        return bs1q7p4g;
    }

    public void setBs1q7p4g(String bs1q7p4g) {
        this.bs1q7p4g = bs1q7p4g;
        notifyPropertyChanged(BR.bs1q7p4g);
    }

    @Bindable
    public String getBs1q7p4d() {
        return bs1q7p4d;
    }

    public void setBs1q7p4d(String bs1q7p4d) {
        this.bs1q7p4d = bs1q7p4d;
        setBs1q7p4d96x(bs1q7p4d.equals("96") ? this.bs1q7p4d96x : "");
        notifyPropertyChanged(BR.bs1q7p4d);
    }

    @Bindable
    public String getBs1q7p4d96x() {
        return bs1q7p4d96x;
    }

    public void setBs1q7p4d96x(String bs1q7p4d96x) {
        this.bs1q7p4d96x = bs1q7p4d96x;
        notifyPropertyChanged(BR.bs1q7p4d96x);
    }

    @Bindable
    public String getBs1q7p4b() {
        return bs1q7p4b;
    }

    public void setBs1q7p4b(String bs1q7p4b) {
        this.bs1q7p4b = bs1q7p4b;
        notifyPropertyChanged(BR.bs1q7p4b);
    }

    @Bindable
    public String getBs1q7p5g() {
        return bs1q7p5g;
    }

    public void setBs1q7p5g(String bs1q7p5g) {
        this.bs1q7p5g = bs1q7p5g;
        notifyPropertyChanged(BR.bs1q7p5g);
    }

    @Bindable
    public String getBs1q7p5d() {
        return bs1q7p5d;
    }

    public void setBs1q7p5d(String bs1q7p5d) {
        this.bs1q7p5d = bs1q7p5d;
        setBs1q7p5d96x(bs1q7p5d.equals("96") ? this.bs1q7p5d96x : "");
        notifyPropertyChanged(BR.bs1q7p5d);
    }

    @Bindable
    public String getBs1q7p5d96x() {
        return bs1q7p5d96x;
    }

    public void setBs1q7p5d96x(String bs1q7p5d96x) {
        this.bs1q7p5d96x = bs1q7p5d96x;
        notifyPropertyChanged(BR.bs1q7p5d96x);
    }

    @Bindable
    public String getBs1q7p5b() {
        return bs1q7p5b;
    }

    public void setBs1q7p5b(String bs1q7p5b) {
        this.bs1q7p5b = bs1q7p5b;
        notifyPropertyChanged(BR.bs1q7p5b);
    }

    @Bindable
    public String getBs1q08() {
        return bs1q08;
    }

    public void setBs1q08(String bs1q08) {
        this.bs1q08 = bs1q08;
        setBs1q0901(bs1q08.equals("2") ? "" : this.bs1q0901);
        setBs1q0901(bs1q08.equals("2") ? "" : this.bs1q0901);
        setBs1q0902(bs1q08.equals("2") ? "" : this.bs1q0902);
        setBs1q0903(bs1q08.equals("2") ? "" : this.bs1q0903);
        setBs1q0904(bs1q08.equals("2") ? "" : this.bs1q0904);
        setBs1q0905(bs1q08.equals("2") ? "" : this.bs1q0905);
        setBs1q0906(bs1q08.equals("2") ? "" : this.bs1q0906);
        setBs1q0907(bs1q08.equals("2") ? "" : this.bs1q0907);
        setBs1q0908(bs1q08.equals("2") ? "" : this.bs1q0908);
        setBs1q09t296(bs1q08.equals("2") ? "" : this.bs1q09t296);
        setBs1q1001(bs1q08.equals("2") ? "" : this.bs1q1001);
        setBs1q1002(bs1q08.equals("2") ? "" : this.bs1q1002);
        setBs1q1098(bs1q08.equals("2") ? "" : this.bs1q1098);
        setBs1q11(bs1q08.equals("2") ? "" : this.bs1q11);
        notifyPropertyChanged(BR.bs1q08);
    }

    @Bindable
    public String getBs1q09() {
        return bs1q09;
    }

    public void setBs1q09(String bs1q09) {
        this.bs1q09 = bs1q09;
        notifyPropertyChanged(BR.bs1q09);
    }

    @Bindable
    public String getBs1q0901() {
        return bs1q0901;
    }

    public void setBs1q0901(String bs1q0901) {
        if (this.bs1q0901.equals(bs1q0901)) return;
        this.bs1q0901 = bs1q0901;
        notifyPropertyChanged(BR.bs1q0901);
    }

    @Bindable
    public String getBs1q0902() {
        return bs1q0902;
    }

    public void setBs1q0902(String bs1q0902) {
        if (this.bs1q0902.equals(bs1q0902)) return;
        this.bs1q0902 = bs1q0902;
        notifyPropertyChanged(BR.bs1q0902);
    }

    @Bindable
    public String getBs1q0903() {
        return bs1q0903;
    }

    public void setBs1q0903(String bs1q0903) {
        if (this.bs1q0903.equals(bs1q0903)) return;
        this.bs1q0903 = bs1q0903;
        notifyPropertyChanged(BR.bs1q0903);
    }

    @Bindable
    public String getBs1q0904() {
        return bs1q0904;
    }

    public void setBs1q0904(String bs1q0904) {
        if (this.bs1q0904.equals(bs1q0904)) return;
        this.bs1q0904 = bs1q0904;
        notifyPropertyChanged(BR.bs1q0904);
    }

    @Bindable
    public String getBs1q0905() {
        return bs1q0905;
    }

    public void setBs1q0905(String bs1q0905) {
        if (this.bs1q0905.equals(bs1q0905)) return;
        this.bs1q0905 = bs1q0905;
        notifyPropertyChanged(BR.bs1q0905);
    }

    @Bindable
    public String getBs1q0906() {
        return bs1q0906;
    }

    public void setBs1q0906(String bs1q0906) {
        if (this.bs1q0906.equals(bs1q0906)) return;
        this.bs1q0906 = bs1q0906;
        notifyPropertyChanged(BR.bs1q0906);
    }

    @Bindable
    public String getBs1q0907() {
        return bs1q0907;
    }

    public void setBs1q0907(String bs1q0907) {
        if (this.bs1q0907.equals(bs1q0907)) return;
        this.bs1q0907 = bs1q0907;
        notifyPropertyChanged(BR.bs1q0907);
    }

    @Bindable
    public String getBs1q0908() {
        return bs1q0908;
    }

    public void setBs1q0908(String bs1q0908) {
        if (this.bs1q0908.equals(bs1q0908)) return;
        this.bs1q0908 = bs1q0908;
        notifyPropertyChanged(BR.bs1q0908);
    }

    @Bindable
    public String getBs1q09t296() {
        return bs1q09t296;
    }

    public void setBs1q09t296(String bs1q09t296) {
        if (this.bs1q09t296.equals(bs1q09t296)) return;
        this.bs1q09t296 = bs1q09t296;
        setBs1q09t296x(bs1q09t296.equals("96") ? this.bs1q09t296x : "");
        notifyPropertyChanged(BR.bs1q09t296);
    }

    @Bindable
    public String getBs1q09t296x() {
        return bs1q09t296x;
    }

    public void setBs1q09t296x(String bs1q09t296x) {
        this.bs1q09t296x = bs1q09t296x;
        notifyPropertyChanged(BR.bs1q09t296x);
    }

    @Bindable
    public String getBs1q1001() {
        return bs1q1001;
    }

    public void setBs1q1001(String bs1q1001) {
        this.bs1q1001 = bs1q1001;
        notifyPropertyChanged(BR.bs1q1001);
    }

    @Bindable
    public String getBs1q1002() {
        return bs1q1002;
    }

    public void setBs1q1002(String bs1q1002) {
        this.bs1q1002 = bs1q1002;
        notifyPropertyChanged(BR.bs1q1002);
    }

    @Bindable
    public String getBs1q1098() {
        return bs1q1098;
    }

    public void setBs1q1098(String bs1q1098) {
        if (this.bs1q1098.equals(bs1q1098)) return;
        this.bs1q1098 = bs1q1098;
        setBs1q1001(bs1q1098.equals("98") ? "" : this.bs1q1001);
        setBs1q1002(bs1q1098.equals("98") ? "" : this.bs1q1002);
        notifyPropertyChanged(BR.bs1q1098);
    }

    @Bindable
    public String getBs1q11() {
        return bs1q11;
    }

    public void setBs1q11(String bs1q11) {
        this.bs1q11 = bs1q11;
        notifyPropertyChanged(BR.bs1q11);
    }

    @Bindable
    public String getBs1q12() {
        return bs1q12;
    }

    public void setBs1q12(String bs1q12) {
        this.bs1q12 = bs1q12;
        notifyPropertyChanged(BR.bs1q12);
    }

    @Bindable
    public String getBs1q13() {
        return bs1q13;
    }

    public void setBs1q13(String bs1q13) {
        this.bs1q13 = bs1q13;
        notifyPropertyChanged(BR.bs1q13);
    }

    @Bindable
    public String getBs1q1301() {
        return bs1q1301;
    }

    public void setBs1q1301(String bs1q1301) {
        if (this.bs1q1301.equals(bs1q1301)) return;
        this.bs1q1301 = bs1q1301;
        notifyPropertyChanged(BR.bs1q1301);
    }

    @Bindable
    public String getBs1q1302() {
        return bs1q1302;
    }

    public void setBs1q1302(String bs1q1302) {
        if (this.bs1q1302.equals(bs1q1302)) return;
        this.bs1q1302 = bs1q1302;
        notifyPropertyChanged(BR.bs1q1302);
    }

    @Bindable
    public String getBs1q1303() {
        return bs1q1303;
    }

    public void setBs1q1303(String bs1q1303) {
        if (this.bs1q1303.equals(bs1q1303)) return;
        this.bs1q1303 = bs1q1303;
        notifyPropertyChanged(BR.bs1q1303);
    }

    @Bindable
    public String getBs1q1304() {
        return bs1q1304;
    }

    public void setBs1q1304(String bs1q1304) {
        if (this.bs1q1304.equals(bs1q1304)) return;
        this.bs1q1304 = bs1q1304;
        notifyPropertyChanged(BR.bs1q1304);
    }

    @Bindable
    public String getBs1q1305() {
        return bs1q1305;
    }

    public void setBs1q1305(String bs1q1305) {
        if (this.bs1q1305.equals(bs1q1305)) return;
        this.bs1q1305 = bs1q1305;
        notifyPropertyChanged(BR.bs1q1305);
    }

    @Bindable
    public String getBs1q1306() {
        return bs1q1306;
    }

    public void setBs1q1306(String bs1q1306) {
        if (this.bs1q1306.equals(bs1q1306)) return;
        this.bs1q1306 = bs1q1306;
        notifyPropertyChanged(BR.bs1q1306);
    }

    @Bindable
    public String getBs1q1307() {
        return bs1q1307;
    }

    public void setBs1q1307(String bs1q1307) {
        if (this.bs1q1307.equals(bs1q1307)) return;
        this.bs1q1307 = bs1q1307;
        notifyPropertyChanged(BR.bs1q1307);
    }

    @Bindable
    public String getBs1q1308() {
        return bs1q1308;
    }

    public void setBs1q1308(String bs1q1308) {
        if (this.bs1q1308.equals(bs1q1308)) return;
        this.bs1q1308 = bs1q1308;
        notifyPropertyChanged(BR.bs1q1308);
    }

    @Bindable
    public String getBs1q1396() {
        return bs1q1396;
    }

    public void setBs1q1396(String bs1q1396) {
        if (this.bs1q1396.equals(bs1q1396)) return;
        this.bs1q1396 = bs1q1396;
        setBs1q1396x(bs1q1396.equals("96") ? this.bs1q1396x : "");
        notifyPropertyChanged(BR.bs1q1396);
    }

    @Bindable
    public String getBs1q1396x() {
        return bs1q1396x;
    }

    public void setBs1q1396x(String bs1q1396x) {
        this.bs1q1396x = bs1q1396x;
        notifyPropertyChanged(BR.bs1q1396x);
    }

    @Bindable
    public String getBs2q1() {
        return bs2q1;
    }

    public void setBs2q1(String bs2q1) {
        this.bs2q1 = bs2q1;
        setBs2q201(bs2q1.equals("2") ? "" : this.bs2q201);
        setBs2q202(bs2q1.equals("2") ? "" : this.bs2q202);
        setBs2q203(bs2q1.equals("2") ? "" : this.bs2q203);
        setBs2q204(bs2q1.equals("2") ? "" : this.bs2q204);
        setBs2q205(bs2q1.equals("2") ? "" : this.bs2q205);
        setBs2q206(bs2q1.equals("2") ? "" : this.bs2q206);
        setBs2q207(bs2q1.equals("2") ? "" : this.bs2q207);
        setBs2q208(bs2q1.equals("2") ? "" : this.bs2q208);
        setBs2q209(bs2q1.equals("2") ? "" : this.bs2q209);
        setBs2q210(bs2q1.equals("2") ? "" : this.bs2q210);
        setBs2q211(bs2q1.equals("2") ? "" : this.bs2q211);
        setBs2q212(bs2q1.equals("2") ? "" : this.bs2q212);
        setBs2q213(bs2q1.equals("2") ? "" : this.bs2q213);
        setBs2q214(bs2q1.equals("2") ? "" : this.bs2q214);
        setBs2q215(bs2q1.equals("2") ? "" : this.bs2q215);
        setBs2q216(bs2q1.equals("2") ? "" : this.bs2q216);
        setBs2q217(bs2q1.equals("2") ? "" : this.bs2q217);
        setBs2q218(bs2q1.equals("2") ? "" : this.bs2q218);
        setBs2q296(bs2q1.equals("2") ? "" : this.bs2q296);
        notifyPropertyChanged(BR.bs2q1);
    }

    @Bindable
    public String getBs2q2() {
        return bs2q2;
    }

    public void setBs2q2(String bs2q2) {
        this.bs2q2 = bs2q2;
        notifyPropertyChanged(BR.bs2q2);
    }

    @Bindable
    public String getBs2q201() {
        return bs2q201;
    }

    public void setBs2q201(String bs2q201) {
        if (this.bs2q201.equals(bs2q201)) return;
        this.bs2q201 = bs2q201;
        notifyPropertyChanged(BR.bs2q201);
    }

    @Bindable
    public String getBs2q202() {
        return bs2q202;
    }

    public void setBs2q202(String bs2q202) {
        if (this.bs2q202.equals(bs2q202)) return;
        this.bs2q202 = bs2q202;
        notifyPropertyChanged(BR.bs2q202);
    }

    @Bindable
    public String getBs2q203() {
        return bs2q203;
    }

    public void setBs2q203(String bs2q203) {
        if (this.bs2q203.equals(bs2q203)) return;
        this.bs2q203 = bs2q203;
        notifyPropertyChanged(BR.bs2q203);
    }

    @Bindable
    public String getBs2q204() {
        return bs2q204;
    }

    public void setBs2q204(String bs2q204) {
        if (this.bs2q204.equals(bs2q204)) return;
        this.bs2q204 = bs2q204;
        notifyPropertyChanged(BR.bs2q204);
    }

    @Bindable
    public String getBs2q205() {
        return bs2q205;
    }

    public void setBs2q205(String bs2q205) {
        if (this.bs2q205.equals(bs2q205)) return;
        this.bs2q205 = bs2q205;
        notifyPropertyChanged(BR.bs2q205);
    }

    @Bindable
    public String getBs2q206() {
        return bs2q206;
    }

    public void setBs2q206(String bs2q206) {
        if (this.bs2q206.equals(bs2q206)) return;
        this.bs2q206 = bs2q206;
        notifyPropertyChanged(BR.bs2q206);
    }

    @Bindable
    public String getBs2q207() {
        return bs2q207;
    }

    public void setBs2q207(String bs2q207) {
        if (this.bs2q207.equals(bs2q207)) return;
        this.bs2q207 = bs2q207;
        notifyPropertyChanged(BR.bs2q207);
    }

    @Bindable
    public String getBs2q208() {
        return bs2q208;
    }

    public void setBs2q208(String bs2q208) {
        if (this.bs2q208.equals(bs2q208)) return;
        this.bs2q208 = bs2q208;
        notifyPropertyChanged(BR.bs2q208);
    }

    @Bindable
    public String getBs2q209() {
        return bs2q209;
    }

    public void setBs2q209(String bs2q209) {
        if (this.bs2q209.equals(bs2q209)) return;
        this.bs2q209 = bs2q209;
        notifyPropertyChanged(BR.bs2q209);
    }

    @Bindable
    public String getBs2q210() {
        return bs2q210;
    }

    public void setBs2q210(String bs2q210) {
        if (this.bs2q210.equals(bs2q210)) return;
        this.bs2q210 = bs2q210;
        notifyPropertyChanged(BR.bs2q210);
    }

    @Bindable
    public String getBs2q211() {
        return bs2q211;
    }

    public void setBs2q211(String bs2q211) {
        if (this.bs2q211.equals(bs2q211)) return;
        this.bs2q211 = bs2q211;
        notifyPropertyChanged(BR.bs2q211);
    }

    @Bindable
    public String getBs2q212() {
        return bs2q212;
    }

    public void setBs2q212(String bs2q212) {
        if (this.bs2q212.equals(bs2q212)) return;
        this.bs2q212 = bs2q212;
        notifyPropertyChanged(BR.bs2q212);
    }

    @Bindable
    public String getBs2q213() {
        return bs2q213;
    }

    public void setBs2q213(String bs2q213) {
        if (this.bs2q213.equals(bs2q213)) return;
        this.bs2q213 = bs2q213;
        notifyPropertyChanged(BR.bs2q213);
    }

    @Bindable
    public String getBs2q214() {
        return bs2q214;
    }

    public void setBs2q214(String bs2q214) {
        if (this.bs2q214.equals(bs2q214)) return;
        this.bs2q214 = bs2q214;
        notifyPropertyChanged(BR.bs2q214);
    }

    @Bindable
    public String getBs2q215() {
        return bs2q215;
    }

    public void setBs2q215(String bs2q215) {
        if (this.bs2q215.equals(bs2q215)) return;
        this.bs2q215 = bs2q215;
        notifyPropertyChanged(BR.bs2q215);
    }

    @Bindable
    public String getBs2q216() {
        return bs2q216;
    }

    public void setBs2q216(String bs2q216) {
        if (this.bs2q216.equals(bs2q216)) return;
        this.bs2q216 = bs2q216;
        notifyPropertyChanged(BR.bs2q216);
    }

    @Bindable
    public String getBs2q217() {
        return bs2q217;
    }

    public void setBs2q217(String bs2q217) {
        if (this.bs2q217.equals(bs2q217)) return;
        this.bs2q217 = bs2q217;
        notifyPropertyChanged(BR.bs2q217);
    }

    @Bindable
    public String getBs2q218() {
        return bs2q218;
    }

    public void setBs2q218(String bs2q218) {
        if (this.bs2q218.equals(bs2q218)) return;
        this.bs2q218 = bs2q218;
        notifyPropertyChanged(BR.bs2q218);
    }

    @Bindable
    public String getBs2q296() {
        return bs2q296;
    }

    public void setBs2q296(String bs2q296) {
        if (this.bs2q296.equals(bs2q296)) return;
        this.bs2q296 = bs2q296;
        setBs2q296x(bs2q296.equals("96") ? this.bs2q296x : "");
        notifyPropertyChanged(BR.bs2q296);
    }

    @Bindable
    public String getBs2q296x() {
        return bs2q296x;
    }

    public void setBs2q296x(String bs2q296x) {
        this.bs2q296x = bs2q296x;
        notifyPropertyChanged(BR.bs2q296x);
    }

    @Bindable
    public String getBs2q3() {
        return bs2q3;
    }

    public void setBs2q3(String bs2q3) {
        this.bs2q3 = bs2q3;
        setBs2q401(bs2q3.equals("2") ? "" : this.bs2q401);
        setBs2q402(bs2q3.equals("2") ? "" : this.bs2q402);
        setBs2q403(bs2q3.equals("2") ? "" : this.bs2q403);
        setBs2q404(bs2q3.equals("2") ? "" : this.bs2q404);
        setBs2q405(bs2q3.equals("2") ? "" : this.bs2q405);
        setBs2q406(bs2q3.equals("2") ? "" : this.bs2q406);
        setBs2q407(bs2q3.equals("2") ? "" : this.bs2q407);
        setBs2q408(bs2q3.equals("2") ? "" : this.bs2q408);
        setBs2q409(bs2q3.equals("2") ? "" : this.bs2q409);
        setBs2q410(bs2q3.equals("2") ? "" : this.bs2q410);
        setBs2q411(bs2q3.equals("2") ? "" : this.bs2q411);
        setBs2q412(bs2q3.equals("2") ? "" : this.bs2q412);
        setBs2q413(bs2q3.equals("2") ? "" : this.bs2q413);
        setBs2q414(bs2q3.equals("2") ? "" : this.bs2q414);
        setBs2q415(bs2q3.equals("2") ? "" : this.bs2q415);
        setBs2q416(bs2q3.equals("2") ? "" : this.bs2q416);
        setBs2q417(bs2q3.equals("2") ? "" : this.bs2q417);
        setBs2q418(bs2q3.equals("2") ? "" : this.bs2q418);
        setBs2q4096(bs2q3.equals("2") ? "" : this.bs2q4096);
        notifyPropertyChanged(BR.bs2q3);
    }

    @Bindable
    public String getBs2q4() {
        return bs2q4;
    }

    public void setBs2q4(String bs2q4) {
        this.bs2q4 = bs2q4;
        notifyPropertyChanged(BR.bs2q4);
    }

    @Bindable
    public String getBs2q401() {
        return bs2q401;
    }

    public void setBs2q401(String bs2q401) {
        if (this.bs2q401.equals(bs2q401)) return;
        this.bs2q401 = bs2q401;
        notifyPropertyChanged(BR.bs2q401);
    }

    @Bindable
    public String getBs2q402() {
        return bs2q402;
    }

    public void setBs2q402(String bs2q402) {
        if (this.bs2q402.equals(bs2q402)) return;
        this.bs2q402 = bs2q402;
        notifyPropertyChanged(BR.bs2q402);
    }

    @Bindable
    public String getBs2q403() {
        return bs2q403;
    }

    public void setBs2q403(String bs2q403) {
        if (this.bs2q403.equals(bs2q403)) return;
        this.bs2q403 = bs2q403;
        notifyPropertyChanged(BR.bs2q403);
    }

    @Bindable
    public String getBs2q404() {
        return bs2q404;
    }

    public void setBs2q404(String bs2q404) {
        if (this.bs2q404.equals(bs2q404)) return;
        this.bs2q404 = bs2q404;
        notifyPropertyChanged(BR.bs2q404);
    }

    @Bindable
    public String getBs2q405() {
        return bs2q405;
    }

    public void setBs2q405(String bs2q405) {
        if (this.bs2q405.equals(bs2q405)) return;
        this.bs2q405 = bs2q405;
        notifyPropertyChanged(BR.bs2q405);
    }

    @Bindable
    public String getBs2q406() {
        return bs2q406;
    }

    public void setBs2q406(String bs2q406) {
        if (this.bs2q406.equals(bs2q406)) return;
        this.bs2q406 = bs2q406;
        notifyPropertyChanged(BR.bs2q406);
    }

    @Bindable
    public String getBs2q407() {
        return bs2q407;
    }

    public void setBs2q407(String bs2q407) {
        if (this.bs2q407.equals(bs2q407)) return;
        this.bs2q407 = bs2q407;
        notifyPropertyChanged(BR.bs2q407);
    }

    @Bindable
    public String getBs2q408() {
        return bs2q408;
    }

    public void setBs2q408(String bs2q408) {
        if (this.bs2q408.equals(bs2q408)) return;
        this.bs2q408 = bs2q408;
        notifyPropertyChanged(BR.bs2q408);
    }

    @Bindable
    public String getBs2q409() {
        return bs2q409;
    }

    public void setBs2q409(String bs2q409) {
        if (this.bs2q409.equals(bs2q409)) return;
        this.bs2q409 = bs2q409;
        notifyPropertyChanged(BR.bs2q409);
    }

    @Bindable
    public String getBs2q410() {
        return bs2q410;
    }

    public void setBs2q410(String bs2q410) {
        if (this.bs2q410.equals(bs2q410)) return;
        this.bs2q410 = bs2q410;
        notifyPropertyChanged(BR.bs2q410);
    }

    @Bindable
    public String getBs2q411() {
        return bs2q411;
    }

    public void setBs2q411(String bs2q411) {
        if (this.bs2q411.equals(bs2q411)) return;
        this.bs2q411 = bs2q411;
        notifyPropertyChanged(BR.bs2q411);
    }

    @Bindable
    public String getBs2q412() {
        return bs2q412;
    }

    public void setBs2q412(String bs2q412) {
        if (this.bs2q412.equals(bs2q412)) return;
        this.bs2q412 = bs2q412;
        notifyPropertyChanged(BR.bs2q412);
    }

    @Bindable
    public String getBs2q413() {
        return bs2q413;
    }

    public void setBs2q413(String bs2q413) {
        if (this.bs2q413.equals(bs2q413)) return;
        this.bs2q413 = bs2q413;
        notifyPropertyChanged(BR.bs2q413);
    }

    @Bindable
    public String getBs2q414() {
        return bs2q414;
    }

    public void setBs2q414(String bs2q414) {
        if (this.bs2q414.equals(bs2q414)) return;
        this.bs2q414 = bs2q414;
        notifyPropertyChanged(BR.bs2q414);
    }

    @Bindable
    public String getBs2q415() {
        return bs2q415;
    }

    public void setBs2q415(String bs2q415) {
        if (this.bs2q415.equals(bs2q415)) return;
        this.bs2q415 = bs2q415;
        notifyPropertyChanged(BR.bs2q415);
    }

    @Bindable
    public String getBs2q416() {
        return bs2q416;
    }

    public void setBs2q416(String bs2q416) {
        if (this.bs2q416.equals(bs2q416)) return;
        this.bs2q416 = bs2q416;
        notifyPropertyChanged(BR.bs2q416);
    }

    @Bindable
    public String getBs2q417() {
        return bs2q417;
    }

    public void setBs2q417(String bs2q417) {
        if (this.bs2q417.equals(bs2q417)) return;
        this.bs2q417 = bs2q417;
        notifyPropertyChanged(BR.bs2q417);
    }

    @Bindable
    public String getBs2q418() {
        return bs2q418;
    }

    public void setBs2q418(String bs2q418) {
        if (this.bs2q418.equals(bs2q418)) return;
        this.bs2q418 = bs2q418;
        notifyPropertyChanged(BR.bs2q418);
    }

    @Bindable
    public String getBs2q4096() {
        return bs2q4096;
    }

    public void setBs2q4096(String bs2q4096) {
        if (this.bs2q4096.equals(bs2q4096)) return;
        this.bs2q4096 = bs2q4096;
        setBs2q4096x(bs2q4096.equals("96") ? this.bs2q4096x : "");
        notifyPropertyChanged(BR.bs2q4096);
    }

    @Bindable
    public String getBs2q4096x() {
        return bs2q4096x;
    }

    public void setBs2q4096x(String bs2q4096x) {
        this.bs2q4096x = bs2q4096x;
        notifyPropertyChanged(BR.bs2q4096x);
    }

    @Bindable
    public String getBs2q5() {
        return bs2q5;
    }

    public void setBs2q5(String bs2q5) {
        this.bs2q5 = bs2q5;
        notifyPropertyChanged(BR.bs2q5);
    }

    @Bindable
    public String getBs2q6() {
        return bs2q6;
    }

    public void setBs2q6(String bs2q6) {
        this.bs2q6 = bs2q6;
        notifyPropertyChanged(BR.bs2q6);
    }

    @Bindable
    public String getBs2q601() {
        return bs2q601;
    }

    public void setBs2q601(String bs2q601) {
        if (this.bs2q601.equals(bs2q601)) return;
        this.bs2q601 = bs2q601;
        notifyPropertyChanged(BR.bs2q601);
    }

    @Bindable
    public String getBs2q602() {
        return bs2q602;
    }

    public void setBs2q602(String bs2q602) {
        if (this.bs2q602.equals(bs2q602)) return;
        this.bs2q602 = bs2q602;
        notifyPropertyChanged(BR.bs2q602);
    }

    @Bindable
    public String getBs2q603() {
        return bs2q603;
    }

    public void setBs2q603(String bs2q603) {
        if (this.bs2q603.equals(bs2q603)) return;
        this.bs2q603 = bs2q603;
        notifyPropertyChanged(BR.bs2q603);
    }

    @Bindable
    public String getBs2q604() {
        return bs2q604;
    }

    public void setBs2q604(String bs2q604) {
        if (this.bs2q604.equals(bs2q604)) return;
        this.bs2q604 = bs2q604;
        notifyPropertyChanged(BR.bs2q604);
    }

    @Bindable
    public String getBs2q605() {
        return bs2q605;
    }

    public void setBs2q605(String bs2q605) {
        if (this.bs2q605.equals(bs2q605)) return;
        this.bs2q605 = bs2q605;
        notifyPropertyChanged(BR.bs2q605);
    }

    @Bindable
    public String getBs2q606() {
        return bs2q606;
    }

    public void setBs2q606(String bs2q606) {
        if (this.bs2q606.equals(bs2q606)) return;
        this.bs2q606 = bs2q606;
        setBs2q606x(bs2q606.equals("6") ? this.bs2q606x : "");
        notifyPropertyChanged(BR.bs2q606);
    }

    @Bindable
    public String getBs2q606x() {
        return bs2q606x;
    }

    public void setBs2q606x(String bs2q606x) {
        this.bs2q606x = bs2q606x;
        notifyPropertyChanged(BR.bs2q606x);
    }

    @Bindable
    public String getBs2q607() {
        return bs2q607;
    }

    public void setBs2q607(String bs2q607) {
        if (this.bs2q607.equals(bs2q607)) return;
        this.bs2q607 = bs2q607;
        notifyPropertyChanged(BR.bs2q607);
    }

    @Bindable
    public String getBs2q608() {
        return bs2q608;
    }

    public void setBs2q608(String bs2q608) {
        if (this.bs2q608.equals(bs2q608)) return;
        this.bs2q608 = bs2q608;
        notifyPropertyChanged(BR.bs2q608);
    }

    @Bindable
    public String getBs2q609() {
        return bs2q609;
    }

    public void setBs2q609(String bs2q609) {
        if (this.bs2q609.equals(bs2q609)) return;
        this.bs2q609 = bs2q609;
        notifyPropertyChanged(BR.bs2q609);
    }

    @Bindable
    public String getBs2q6010() {
        return bs2q6010;
    }

    public void setBs2q6010(String bs2q6010) {
        if (this.bs2q6010.equals(bs2q6010)) return;
        this.bs2q6010 = bs2q6010;
        setBs2q6010x(bs2q6010.equals("10") ? this.bs2q6010x : "");
        notifyPropertyChanged(BR.bs2q6010);
    }

    @Bindable
    public String getBs2q6010x() {
        return bs2q6010x;
    }

    public void setBs2q6010x(String bs2q6010x) {
        this.bs2q6010x = bs2q6010x;
        notifyPropertyChanged(BR.bs2q6010x);
    }

    @Bindable
    public String getBs2q6011() {
        return bs2q6011;
    }

    public void setBs2q6011(String bs2q6011) {
        if (this.bs2q6011.equals(bs2q6011)) return;
        this.bs2q6011 = bs2q6011;
        setBs2q6011x(bs2q6011.equals("11") ? this.bs2q6011x : "");
        notifyPropertyChanged(BR.bs2q6011);
    }

    @Bindable
    public String getBs2q6011x() {
        return bs2q6011x;
    }

    public void setBs2q6011x(String bs2q6011x) {
        this.bs2q6011x = bs2q6011x;
        notifyPropertyChanged(BR.bs2q6011x);
    }

    @Bindable
    public String getBs2q6012() {
        return bs2q6012;
    }

    public void setBs2q6012(String bs2q6012) {
        if (this.bs2q6012.equals(bs2q6012)) return;
        this.bs2q6012 = bs2q6012;
        notifyPropertyChanged(BR.bs2q6012);
    }

    @Bindable
    public String getBs2q6013() {
        return bs2q6013;
    }

    public void setBs2q6013(String bs2q6013) {
        if (this.bs2q6013.equals(bs2q6013)) return;
        this.bs2q6013 = bs2q6013;
        notifyPropertyChanged(BR.bs2q6013);
    }

    @Bindable
    public String getBs2q6014() {
        return bs2q6014;
    }

    public void setBs2q6014(String bs2q6014) {
        if (this.bs2q6014.equals(bs2q6014)) return;
        this.bs2q6014 = bs2q6014;
        notifyPropertyChanged(BR.bs2q6014);
    }

    @Bindable
    public String getBs2q6015() {
        return bs2q6015;
    }

    public void setBs2q6015(String bs2q6015) {
        if (this.bs2q6015.equals(bs2q6015)) return;
        this.bs2q6015 = bs2q6015;
        notifyPropertyChanged(BR.bs2q6015);
    }

    @Bindable
    public String getBs2q696() {
        return bs2q696;
    }

    public void setBs2q696(String bs2q696) {
        if (this.bs2q696.equals(bs2q696)) return;
        this.bs2q696 = bs2q696;
        setBs2q696x(bs2q696.equals("96") ? this.bs2q696x : "");
        notifyPropertyChanged(BR.bs2q696);
    }

    @Bindable
    public String getBs2q696x() {
        return bs2q696x;
    }

    public void setBs2q696x(String bs2q696x) {
        this.bs2q696x = bs2q696x;
        notifyPropertyChanged(BR.bs2q696x);
    }

    @Bindable
    public String getBs2q7() {
        return bs2q7;
    }

    public void setBs2q7(String bs2q7) {
        this.bs2q7 = bs2q7;
        setBs2q796x(bs2q7.equals("96") ? this.bs2q796x : "");
        notifyPropertyChanged(BR.bs2q7);
    }

    @Bindable
    public String getBs2q796x() {
        return bs2q796x;
    }

    public void setBs2q796x(String bs2q796x) {
        this.bs2q796x = bs2q796x;
        notifyPropertyChanged(BR.bs2q796x);
    }

    @Bindable
    public String getBs2q8() {
        return bs2q8;
    }

    public void setBs2q8(String bs2q8) {
        this.bs2q8 = bs2q8;
        notifyPropertyChanged(BR.bs2q8);
    }

    @Bindable
    public String getBs2q801() {
        return bs2q801;
    }

    public void setBs2q801(String bs2q801) {
        if (this.bs2q801.equals(bs2q801)) return;
        this.bs2q801 = bs2q801;
        notifyPropertyChanged(BR.bs2q801);
    }

    @Bindable
    public String getBs2q802() {
        return bs2q802;
    }

    public void setBs2q802(String bs2q802) {
        if (this.bs2q802.equals(bs2q802)) return;
        this.bs2q802 = bs2q802;
        notifyPropertyChanged(BR.bs2q802);
    }

    @Bindable
    public String getBs2q803() {
        return bs2q803;
    }

    public void setBs2q803(String bs2q803) {
        if (this.bs2q803.equals(bs2q803)) return;
        this.bs2q803 = bs2q803;
        notifyPropertyChanged(BR.bs2q803);
    }

    @Bindable
    public String getBs2q804() {
        return bs2q804;
    }

    public void setBs2q804(String bs2q804) {
        if (this.bs2q804.equals(bs2q804)) return;
        this.bs2q804 = bs2q804;
        notifyPropertyChanged(BR.bs2q804);
    }

    @Bindable
    public String getBs2q898() {
        return bs2q898;
    }

    public void setBs2q898(String bs2q898) {
        if (this.bs2q898.equals(bs2q898)) return;
        this.bs2q898 = bs2q898;
        setBs2q801(bs2q898.equals("98") ? "" : this.bs2q801);
        setBs2q802(bs2q898.equals("98") ? "" : this.bs2q802);
        setBs2q803(bs2q898.equals("98") ? "" : this.bs2q803);
        setBs2q804(bs2q898.equals("98") ? "" : this.bs2q804);
        setBs2q896(bs2q898.equals("98") ? "" : this.bs2q896);
        notifyPropertyChanged(BR.bs2q898);
    }

    @Bindable
    public String getBs2q896() {
        return bs2q896;
    }

    public void setBs2q896(String bs2q896) {
        if (this.bs2q896.equals(bs2q896)) return;
        this.bs2q896 = bs2q896;
        setBs2q896x(bs2q896.equals("96") ? this.bs2q896x : "");
        notifyPropertyChanged(BR.bs2q896);
    }

    @Bindable
    public String getBs2q896x() {
        return bs2q896x;
    }

    public void setBs2q896x(String bs2q896x) {
        this.bs2q896x = bs2q896x;
        notifyPropertyChanged(BR.bs2q896x);
    }

    @Bindable
    public String getBs3q1() {
        return bs3q1;
    }

    public void setBs3q1(String bs3q1) {
        this.bs3q1 = bs3q1;
        notifyPropertyChanged(BR.bs3q1);
    }

    @Bindable
    public String getBs3q101() {
        return bs3q101;
    }

    public void setBs3q101(String bs3q101) {
        if (this.bs3q101.equals(bs3q101)) return;
        this.bs3q101 = bs3q101;
        notifyPropertyChanged(BR.bs3q101);
    }

    @Bindable
    public String getBs3q102() {
        return bs3q102;
    }

    public void setBs3q102(String bs3q102) {
        if (this.bs3q102.equals(bs3q102)) return;
        this.bs3q102 = bs3q102;
        notifyPropertyChanged(BR.bs3q102);
    }

    @Bindable
    public String getBs3q103() {
        return bs3q103;
    }

    public void setBs3q103(String bs3q103) {
        if (this.bs3q103.equals(bs3q103)) return;
        this.bs3q103 = bs3q103;
        notifyPropertyChanged(BR.bs3q103);
    }

    @Bindable
    public String getBs3q104() {
        return bs3q104;
    }

    public void setBs3q104(String bs3q104) {
        if (this.bs3q104.equals(bs3q104)) return;
        this.bs3q104 = bs3q104;
        notifyPropertyChanged(BR.bs3q104);
    }

    @Bindable
    public String getBs3q105() {
        return bs3q105;
    }

    public void setBs3q105(String bs3q105) {
        if (this.bs3q105.equals(bs3q105)) return;
        this.bs3q105 = bs3q105;
        notifyPropertyChanged(BR.bs3q105);
    }

    @Bindable
    public String getBs3q106() {
        return bs3q106;
    }

    public void setBs3q106(String bs3q106) {
        if (this.bs3q106.equals(bs3q106)) return;
        this.bs3q106 = bs3q106;
        notifyPropertyChanged(BR.bs3q106);
    }

    @Bindable
    public String getBs3q107() {
        return bs3q107;
    }

    public void setBs3q107(String bs3q107) {
        if (this.bs3q107.equals(bs3q107)) return;
        this.bs3q107 = bs3q107;
        notifyPropertyChanged(BR.bs3q107);
    }

    @Bindable
    public String getBs3q197() {
        return bs3q197;
    }

    public void setBs3q197(String bs3q197) {
        if (this.bs3q197.equals(bs3q197)) return;
        this.bs3q197 = bs3q197;
        setBs3q101(bs3q197.equals("97") ? "" : this.bs3q101);
        setBs3q102(bs3q197.equals("97") ? "" : this.bs3q102);
        setBs3q103(bs3q197.equals("97") ? "" : this.bs3q103);
        setBs3q104(bs3q197.equals("97") ? "" : this.bs3q104);
        setBs3q105(bs3q197.equals("97") ? "" : this.bs3q105);
        setBs3q106(bs3q197.equals("97") ? "" : this.bs3q106);
        setBs3q107(bs3q197.equals("97") ? "" : this.bs3q107);
        setBs3q196(bs3q197.equals("97") ? "" : this.bs3q196);
        setBs3q198(bs3q197.equals("97") ? "" : this.bs3q198);
        notifyPropertyChanged(BR.bs3q197);
    }

    @Bindable
    public String getBs3q198() {
        return bs3q198;
    }

    public void setBs3q198(String bs3q198) {
        if (this.bs3q198.equals(bs3q198)) return;
        this.bs3q198 = bs3q198;
        setBs3q101(bs3q198.equals("98") ? "" : this.bs3q101);
        setBs3q102(bs3q198.equals("98") ? "" : this.bs3q102);
        setBs3q103(bs3q198.equals("98") ? "" : this.bs3q103);
        setBs3q104(bs3q198.equals("98") ? "" : this.bs3q104);
        setBs3q105(bs3q198.equals("98") ? "" : this.bs3q105);
        setBs3q106(bs3q198.equals("98") ? "" : this.bs3q106);
        setBs3q107(bs3q198.equals("98") ? "" : this.bs3q107);
        setBs3q196(bs3q198.equals("98") ? "" : this.bs3q196);
        setBs3q197(bs3q198.equals("98") ? "" : this.bs3q197);
        notifyPropertyChanged(BR.bs3q198);
    }

    @Bindable
    public String getBs3q196() {
        return bs3q196;
    }

    public void setBs3q196(String bs3q196) {
        if (this.bs3q196.equals(bs3q196)) return;
        this.bs3q196 = bs3q196;
        setBs3q196x(bs3q196.equals("96") ? this.bs3q196x : "");
        notifyPropertyChanged(BR.bs3q196);
    }

    @Bindable
    public String getBs3q196x() {
        return bs3q196x;
    }

    public void setBs3q196x(String bs3q196x) {
        this.bs3q196x = bs3q196x;
        notifyPropertyChanged(BR.bs3q196x);
    }

    @Bindable
    public String getBs3q2a() {
        return bs3q2a;
    }

    public void setBs3q2a(String bs3q2a) {
        this.bs3q2a = bs3q2a;
        setBs3q2a96x(bs3q2a.equals("96") ? this.bs3q2a96x : "");
        notifyPropertyChanged(BR.bs3q2a);
    }

    @Bindable
    public String getBs3q2a96x() {
        return bs3q2a96x;
    }

    public void setBs3q2a96x(String bs3q2a96x) {
        this.bs3q2a96x = bs3q2a96x;
        notifyPropertyChanged(BR.bs3q2a96x);
    }

    @Bindable
    public String getBs3q2b96() {
        return bs3q2b96;
    }

    public void setBs3q2b96(String bs3q2b96) {
        this.bs3q2b96 = bs3q2b96;
        notifyPropertyChanged(BR.bs3q2b96);
    }

    @Bindable
    public String getBs3q2c96() {
        return bs3q2c96;
    }

    public void setBs3q2c96(String bs3q2c96) {
        this.bs3q2c96 = bs3q2c96;
        notifyPropertyChanged(BR.bs3q2c96);
    }

    @Bindable
    public String getBs3q2d96() {
        return bs3q2d96;
    }

    public void setBs3q2d96(String bs3q2d96) {
        this.bs3q2d96 = bs3q2d96;
        notifyPropertyChanged(BR.bs3q2d96);
    }

    @Bindable
    public String getBs3q3() {
        return bs3q3;
    }

    public void setBs3q3(String bs3q3) {
        this.bs3q3 = bs3q3;
        notifyPropertyChanged(BR.bs3q3);
    }

    @Bindable
    public String getBs3q4() {
        return bs3q4;
    }

    public void setBs3q4(String bs3q4) {
        this.bs3q4 = bs3q4;
        notifyPropertyChanged(BR.bs3q4);
    }

    @Bindable
    public String getBs3q401() {
        return bs3q401;
    }

    public void setBs3q401(String bs3q401) {
        if (this.bs3q401.equals(bs3q401)) return;
        this.bs3q401 = bs3q401;
        notifyPropertyChanged(BR.bs3q401);
    }

    @Bindable
    public String getBs3q402() {
        return bs3q402;
    }

    public void setBs3q402(String bs3q402) {
        if (this.bs3q402.equals(bs3q402)) return;
        this.bs3q402 = bs3q402;
        notifyPropertyChanged(BR.bs3q402);
    }

    @Bindable
    public String getBs3q403() {
        return bs3q403;
    }

    public void setBs3q403(String bs3q403) {
        if (this.bs3q403.equals(bs3q403)) return;
        this.bs3q403 = bs3q403;
        notifyPropertyChanged(BR.bs3q403);
    }

    @Bindable
    public String getBs3q404() {
        return bs3q404;
    }

    public void setBs3q404(String bs3q404) {
        if (this.bs3q404.equals(bs3q404)) return;
        this.bs3q404 = bs3q404;
        notifyPropertyChanged(BR.bs3q404);
    }

    @Bindable
    public String getBs3q405() {
        return bs3q405;
    }

    public void setBs3q405(String bs3q405) {
        if (this.bs3q405.equals(bs3q405)) return;
        this.bs3q405 = bs3q405;
        notifyPropertyChanged(BR.bs3q405);
    }

    @Bindable
    public String getBs3q406() {
        return bs3q406;
    }

    public void setBs3q406(String bs3q406) {
        if (this.bs3q406.equals(bs3q406)) return;
        this.bs3q406 = bs3q406;
        notifyPropertyChanged(BR.bs3q406);
    }

    @Bindable
    public String getBs3q407() {
        return bs3q407;
    }

    public void setBs3q407(String bs3q407) {
        if (this.bs3q407.equals(bs3q407)) return;
        this.bs3q407 = bs3q407;
        notifyPropertyChanged(BR.bs3q407);
    }

    @Bindable
    public String getBs3q496() {
        return bs3q496;
    }

    public void setBs3q496(String bs3q496) {
        if (this.bs3q496.equals(bs3q496)) return;
        this.bs3q496 = bs3q496;
        setBs3q496x(bs3q496.equals("96") ? this.bs3q496x : "");
        notifyPropertyChanged(BR.bs3q496);
    }

    @Bindable
    public String getBs3q496x() {
        return bs3q496x;
    }

    public void setBs3q496x(String bs3q496x) {
        this.bs3q496x = bs3q496x;
        notifyPropertyChanged(BR.bs3q496x);
    }

    @Bindable
    public String getBs3q498() {
        return bs3q498;
    }

    public void setBs3q498(String bs3q498) {
        if (this.bs3q498.equals(bs3q498)) return;
        this.bs3q498 = bs3q498;
        setBs3q401(bs3q498.equals("98") ? "" : this.bs3q401);
        setBs3q402(bs3q498.equals("98") ? "" : this.bs3q402);
        setBs3q403(bs3q498.equals("98") ? "" : this.bs3q403);
        setBs3q404(bs3q498.equals("98") ? "" : this.bs3q404);
        setBs3q405(bs3q498.equals("98") ? "" : this.bs3q405);
        setBs3q406(bs3q498.equals("98") ? "" : this.bs3q406);
        setBs3q407(bs3q498.equals("98") ? "" : this.bs3q407);
        setBs3q496(bs3q498.equals("98") ? "" : this.bs3q496);
        notifyPropertyChanged(BR.bs3q498);
    }

    @Bindable
    public String getBs3q5() {
        return bs3q5;
    }

    public void setBs3q5(String bs3q5) {
        this.bs3q5 = bs3q5;
        notifyPropertyChanged(BR.bs3q5);
    }

    @Bindable
    public String getBs3q501() {
        return bs3q501;
    }

    public void setBs3q501(String bs3q501) {
        if (this.bs3q501.equals(bs3q501)) return;
        this.bs3q501 = bs3q501;
        notifyPropertyChanged(BR.bs3q501);
    }

    @Bindable
    public String getBs3q502() {
        return bs3q502;
    }

    public void setBs3q502(String bs3q502) {
        if (this.bs3q502.equals(bs3q502)) return;
        this.bs3q502 = bs3q502;
        notifyPropertyChanged(BR.bs3q502);
    }

    @Bindable
    public String getBs3q503() {
        return bs3q503;
    }

    public void setBs3q503(String bs3q503) {
        if (this.bs3q503.equals(bs3q503)) return;
        this.bs3q503 = bs3q503;
        notifyPropertyChanged(BR.bs3q503);
    }

    @Bindable
    public String getBs3q504() {
        return bs3q504;
    }

    public void setBs3q504(String bs3q504) {
        if (this.bs3q504.equals(bs3q504)) return;
        this.bs3q504 = bs3q504;
        notifyPropertyChanged(BR.bs3q504);
    }

    @Bindable
    public String getBs3q598() {
        return bs3q598;
    }

    public void setBs3q598(String bs3q598) {
        if (this.bs3q598.equals(bs3q598)) return;
        this.bs3q598 = bs3q598;
        setBs3q501(bs3q598.equals("98") ? "" : this.bs3q501);
        setBs3q502(bs3q598.equals("98") ? "" : this.bs3q502);
        setBs3q503(bs3q598.equals("98") ? "" : this.bs3q503);
        setBs3q504(bs3q598.equals("98") ? "" : this.bs3q504);
        setBs3q596(bs3q598.equals("98") ? "" : this.bs3q596);
        notifyPropertyChanged(BR.bs3q598);
    }

    @Bindable
    public String getBs3q596() {
        return bs3q596;
    }

    public void setBs3q596(String bs3q596) {
        if (this.bs3q596.equals(bs3q596)) return;
        this.bs3q596 = bs3q596;
        setBs3q596x(bs3q596.equals("96") ? this.bs3q596x : "");
        notifyPropertyChanged(BR.bs3q596);
    }

    @Bindable
    public String getBs3q596x() {
        return bs3q596x;
    }

    public void setBs3q596x(String bs3q596x) {
        this.bs3q596x = bs3q596x;
        notifyPropertyChanged(BR.bs3q596x);
    }

    @Bindable
    public String getBs3q6() {
        return bs3q6;
    }

    public void setBs3q6(String bs3q6) {
        this.bs3q6 = bs3q6;
        notifyPropertyChanged(BR.bs3q6);
    }

    @Bindable
    public String getBs3q601() {
        return bs3q601;
    }

    public void setBs3q601(String bs3q601) {
        if (this.bs3q601.equals(bs3q601)) return;
        this.bs3q601 = bs3q601;
        notifyPropertyChanged(BR.bs3q601);
    }

    @Bindable
    public String getBs3q602() {
        return bs3q602;
    }

    public void setBs3q602(String bs3q602) {
        if (this.bs3q602.equals(bs3q602)) return;
        this.bs3q602 = bs3q602;
        notifyPropertyChanged(BR.bs3q602);
    }

    @Bindable
    public String getBs3q603() {
        return bs3q603;
    }

    public void setBs3q603(String bs3q603) {
        if (this.bs3q603.equals(bs3q603)) return;
        this.bs3q603 = bs3q603;
        notifyPropertyChanged(BR.bs3q603);
    }

    @Bindable
    public String getBs3q604() {
        return bs3q604;
    }

    public void setBs3q604(String bs3q604) {
        if (this.bs3q604.equals(bs3q604)) return;
        this.bs3q604 = bs3q604;
        notifyPropertyChanged(BR.bs3q604);
    }

    @Bindable
    public String getBs3q605() {
        return bs3q605;
    }

    public void setBs3q605(String bs3q605) {
        if (this.bs3q605.equals(bs3q605)) return;
        this.bs3q605 = bs3q605;
        notifyPropertyChanged(BR.bs3q605);
    }

    @Bindable
    public String getBs3q606() {
        return bs3q606;
    }

    public void setBs3q606(String bs3q606) {
        if (this.bs3q606.equals(bs3q606)) return;
        this.bs3q606 = bs3q606;
        notifyPropertyChanged(BR.bs3q606);
    }

    @Bindable
    public String getBs3q607() {
        return bs3q607;
    }

    public void setBs3q607(String bs3q607) {
        if (this.bs3q607.equals(bs3q607)) return;
        this.bs3q607 = bs3q607;
        notifyPropertyChanged(BR.bs3q607);
    }

    @Bindable
    public String getBs3q608() {
        return bs3q608;
    }

    public void setBs3q608(String bs3q608) {
        if (this.bs3q608.equals(bs3q608)) return;
        this.bs3q608 = bs3q608;
        notifyPropertyChanged(BR.bs3q608);
    }

    @Bindable
    public String getBs3q609() {
        return bs3q609;
    }

    public void setBs3q609(String bs3q609) {
        if (this.bs3q609.equals(bs3q609)) return;
        this.bs3q609 = bs3q609;
        notifyPropertyChanged(BR.bs3q609);
    }

    @Bindable
    public String getBs3q698() {
        return bs3q698;
    }

    public void setBs3q698(String bs3q698) {
        if (this.bs3q698.equals(bs3q698)) return;
        this.bs3q698 = bs3q698;
        setBs3q601(bs3q698.equals("98") ? "" : this.bs3q601);
        setBs3q602(bs3q698.equals("98") ? "" : this.bs3q602);
        setBs3q603(bs3q698.equals("98") ? "" : this.bs3q603);
        setBs3q604(bs3q698.equals("98") ? "" : this.bs3q604);
        setBs3q605(bs3q698.equals("98") ? "" : this.bs3q605);
        setBs3q606(bs3q698.equals("98") ? "" : this.bs3q606);
        setBs3q607(bs3q698.equals("98") ? "" : this.bs3q607);
        setBs3q608(bs3q698.equals("98") ? "" : this.bs3q608);
        setBs3q609(bs3q698.equals("98") ? "" : this.bs3q609);
        setBs3q696(bs3q698.equals("98") ? "" : this.bs3q696);
        notifyPropertyChanged(BR.bs3q698);
    }

    @Bindable
    public String getBs3q696() {
        return bs3q696;
    }

    public void setBs3q696(String bs3q696) {
        if (this.bs3q696.equals(bs3q696)) return;
        this.bs3q696 = bs3q696;
        setBs3q696x(bs3q696.equals("96") ? this.bs3q696x : "");
        notifyPropertyChanged(BR.bs3q696);
    }

    @Bindable
    public String getBs3q696x() {
        return bs3q696x;
    }

    public void setBs3q696x(String bs3q696x) {
        this.bs3q696x = bs3q696x;
        notifyPropertyChanged(BR.bs3q696x);
    }

    @Bindable
    public String getBs3q7() {
        return bs3q7;
    }

    public void setBs3q7(String bs3q7) {
        this.bs3q7 = bs3q7;
        notifyPropertyChanged(BR.bs3q7);
    }

    @Bindable
    public String getBs3q701() {
        return bs3q701;
    }

    public void setBs3q701(String bs3q701) {
        if (this.bs3q701.equals(bs3q701)) return;
        this.bs3q701 = bs3q701;
        notifyPropertyChanged(BR.bs3q701);
    }

    @Bindable
    public String getBs3q702() {
        return bs3q702;
    }

    public void setBs3q702(String bs3q702) {
        if (this.bs3q702.equals(bs3q702)) return;
        this.bs3q702 = bs3q702;
        notifyPropertyChanged(BR.bs3q702);
    }

    @Bindable
    public String getBs3q703() {
        return bs3q703;
    }

    public void setBs3q703(String bs3q703) {
        if (this.bs3q703.equals(bs3q703)) return;
        this.bs3q703 = bs3q703;
        notifyPropertyChanged(BR.bs3q703);
    }

    @Bindable
    public String getBs3q704() {
        return bs3q704;
    }

    public void setBs3q704(String bs3q704) {
        if (this.bs3q704.equals(bs3q704)) return;
        this.bs3q704 = bs3q704;
        notifyPropertyChanged(BR.bs3q704);
    }

    @Bindable
    public String getBs3q705() {
        return bs3q705;
    }

    public void setBs3q705(String bs3q705) {
        if (this.bs3q705.equals(bs3q705)) return;
        this.bs3q705 = bs3q705;
        notifyPropertyChanged(BR.bs3q705);
    }

    @Bindable
    public String getBs3q798() {
        return bs3q798;
    }

    public void setBs3q798(String bs3q798) {
        if (this.bs3q798.equals(bs3q798)) return;
        this.bs3q798 = bs3q798;
        setBs3q701(bs3q798.equals("98") ? "" : this.bs3q701);
        setBs3q702(bs3q798.equals("98") ? "" : this.bs3q702);
        setBs3q703(bs3q798.equals("98") ? "" : this.bs3q703);
        setBs3q704(bs3q798.equals("98") ? "" : this.bs3q704);
        setBs3q705(bs3q798.equals("98") ? "" : this.bs3q705);
        setBs3q796(bs3q798.equals("98") ? "" : this.bs3q796);
        notifyPropertyChanged(BR.bs3q798);
    }

    @Bindable
    public String getBs3q796() {
        return bs3q796;
    }

    public void setBs3q796(String bs3q796) {
        if (this.bs3q796.equals(bs3q796)) return;
        this.bs3q796 = bs3q796;
        setBs3q796x(bs3q796.equals("96") ? this.bs3q796x : "");
        notifyPropertyChanged(BR.bs3q796);
    }

    @Bindable
    public String getBs3q796x() {
        return bs3q796x;
    }

    public void setBs3q796x(String bs3q796x) {
        this.bs3q796x = bs3q796x;
        notifyPropertyChanged(BR.bs3q796x);
    }

    @Bindable
    public String getBs3q8() {
        return bs3q8;
    }

    public void setBs3q8(String bs3q8) {
        this.bs3q8 = bs3q8;
        notifyPropertyChanged(BR.bs3q8);
    }

    @Bindable
    public String getBs3q801() {
        return bs3q801;
    }

    public void setBs3q801(String bs3q801) {
        if (this.bs3q801.equals(bs3q801)) return;
        this.bs3q801 = bs3q801;
        notifyPropertyChanged(BR.bs3q801);
    }

    @Bindable
    public String getBs3q802() {
        return bs3q802;
    }

    public void setBs3q802(String bs3q802) {
        if (this.bs3q802.equals(bs3q802)) return;
        this.bs3q802 = bs3q802;
        notifyPropertyChanged(BR.bs3q802);
    }

    @Bindable
    public String getBs3q803() {
        return bs3q803;
    }

    public void setBs3q803(String bs3q803) {
        if (this.bs3q803.equals(bs3q803)) return;
        this.bs3q803 = bs3q803;
        notifyPropertyChanged(BR.bs3q803);
    }

    @Bindable
    public String getBs3q804() {
        return bs3q804;
    }

    public void setBs3q804(String bs3q804) {
        if (this.bs3q804.equals(bs3q804)) return;
        this.bs3q804 = bs3q804;
        notifyPropertyChanged(BR.bs3q804);
    }

    @Bindable
    public String getBs3q897() {
        return bs3q897;
    }

    public void setBs3q897(String bs3q897) {
        if (this.bs3q897.equals(bs3q897)) return;
        this.bs3q897 = bs3q897;
        setBs3q801(bs3q897.equals("97") ? "" : this.bs3q801);
        setBs3q802(bs3q897.equals("97") ? "" : this.bs3q802);
        setBs3q803(bs3q897.equals("97") ? "" : this.bs3q803);
        setBs3q804(bs3q897.equals("97") ? "" : this.bs3q804);
        setBs3q896(bs3q897.equals("97") ? "" : this.bs3q896);
        notifyPropertyChanged(BR.bs3q897);
    }

    @Bindable
    public String getBs3q896() {
        return bs3q896;
    }

    public void setBs3q896(String bs3q896) {
        if (this.bs3q896.equals(bs3q896)) return;
        this.bs3q896 = bs3q896;
        setBs3q896x(bs3q896.equals("96") ? this.bs3q896x : "");
        notifyPropertyChanged(BR.bs3q896);
    }

    @Bindable
    public String getBs3q896x() {
        return bs3q896x;
    }

    public void setBs3q896x(String bs3q896x) {
        this.bs3q896x = bs3q896x;
        notifyPropertyChanged(BR.bs3q896x);
    }

    @Bindable
    public String getBs3q9() {
        return bs3q9;
    }

    public void setBs3q9(String bs3q9) {
        this.bs3q9 = bs3q9;
        notifyPropertyChanged(BR.bs3q9);
    }

    @Bindable
    public String getBs3q901() {
        return bs3q901;
    }

    public void setBs3q901(String bs3q901) {
        if (this.bs3q901.equals(bs3q901)) return;
        this.bs3q901 = bs3q901;
        notifyPropertyChanged(BR.bs3q901);
    }

    @Bindable
    public String getBs3q902() {
        return bs3q902;
    }

    public void setBs3q902(String bs3q902) {
        if (this.bs3q902.equals(bs3q902)) return;
        this.bs3q902 = bs3q902;
        notifyPropertyChanged(BR.bs3q902);
    }

    @Bindable
    public String getBs3q903() {
        return bs3q903;
    }

    public void setBs3q903(String bs3q903) {
        if (this.bs3q903.equals(bs3q903)) return;
        this.bs3q903 = bs3q903;
        notifyPropertyChanged(BR.bs3q903);
    }

    @Bindable
    public String getBs3q904() {
        return bs3q904;
    }

    public void setBs3q904(String bs3q904) {
        if (this.bs3q904.equals(bs3q904)) return;
        this.bs3q904 = bs3q904;
        notifyPropertyChanged(BR.bs3q904);
    }

    @Bindable
    public String getBs3q905() {
        return bs3q905;
    }

    public void setBs3q905(String bs3q905) {
        if (this.bs3q905.equals(bs3q905)) return;
        this.bs3q905 = bs3q905;
        notifyPropertyChanged(BR.bs3q905);
    }

    @Bindable
    public String getBs3q906() {
        return bs3q906;
    }

    public void setBs3q906(String bs3q906) {
        if (this.bs3q906.equals(bs3q906)) return;
        this.bs3q906 = bs3q906;
        notifyPropertyChanged(BR.bs3q906);
    }

    @Bindable
    public String getBs3q996() {
        return bs3q996;
    }

    public void setBs3q996(String bs3q996) {
        if (this.bs3q996.equals(bs3q996)) return;
        this.bs3q996 = bs3q996;
        setBs3q996x(bs3q996.equals("96") ? this.bs3q996x : "");
        notifyPropertyChanged(BR.bs3q996);
    }

    @Bindable
    public String getBs3q996x() {
        return bs3q996x;
    }

    public void setBs3q996x(String bs3q996x) {
        this.bs3q996x = bs3q996x;
        notifyPropertyChanged(BR.bs3q996x);
    }

    @Bindable
    public String getBs3q997() {
        return bs3q997;
    }

    public void setBs3q997(String bs3q997) {
        if (this.bs3q997.equals(bs3q997)) return;
        this.bs3q997 = bs3q997;
        setBs3q901(bs3q997.equals("97") ? "" : this.bs3q901);
        setBs3q902(bs3q997.equals("97") ? "" : this.bs3q902);
        setBs3q903(bs3q997.equals("97") ? "" : this.bs3q903);
        setBs3q904(bs3q997.equals("97") ? "" : this.bs3q904);
        setBs3q905(bs3q997.equals("97") ? "" : this.bs3q905);
        setBs3q906(bs3q997.equals("97") ? "" : this.bs3q906);
        setBs3q996(bs3q997.equals("97") ? "" : this.bs3q996);
        notifyPropertyChanged(BR.bs3q997);
    }

    @Bindable
    public String getBs3q10() {
        return bs3q10;
    }

    public void setBs3q10(String bs3q10) {
        this.bs3q10 = bs3q10;
        notifyPropertyChanged(BR.bs3q10);
    }

    @Bindable
    public String getBs3q1001() {
        return bs3q1001;
    }

    public void setBs3q1001(String bs3q1001) {
        if (this.bs3q1001.equals(bs3q1001)) return;
        this.bs3q1001 = bs3q1001;
        notifyPropertyChanged(BR.bs3q1001);
    }

    @Bindable
    public String getBs3q1002() {
        return bs3q1002;
    }

    public void setBs3q1002(String bs3q1002) {
        if (this.bs3q1002.equals(bs3q1002)) return;
        this.bs3q1002 = bs3q1002;
        notifyPropertyChanged(BR.bs3q1002);
    }

    @Bindable
    public String getBs3q1003() {
        return bs3q1003;
    }

    public void setBs3q1003(String bs3q1003) {
        if (this.bs3q1003.equals(bs3q1003)) return;
        this.bs3q1003 = bs3q1003;
        notifyPropertyChanged(BR.bs3q1003);
    }

    @Bindable
    public String getBs3q1004() {
        return bs3q1004;
    }

    public void setBs3q1004(String bs3q1004) {
        if (this.bs3q1004.equals(bs3q1004)) return;
        this.bs3q1004 = bs3q1004;
        notifyPropertyChanged(BR.bs3q1004);
    }

    @Bindable
    public String getBs3q1005() {
        return bs3q1005;
    }

    public void setBs3q1005(String bs3q1005) {
        if (this.bs3q1005.equals(bs3q1005)) return;
        this.bs3q1005 = bs3q1005;
        notifyPropertyChanged(BR.bs3q1005);
    }

    @Bindable
    public String getBs3q1006() {
        return bs3q1006;
    }

    public void setBs3q1006(String bs3q1006) {
        if (this.bs3q1006.equals(bs3q1006)) return;
        this.bs3q1006 = bs3q1006;
        notifyPropertyChanged(BR.bs3q1006);
    }

    @Bindable
    public String getBs3q1007() {
        return bs3q1007;
    }

    public void setBs3q1007(String bs3q1007) {
        if (this.bs3q1007.equals(bs3q1007)) return;
        this.bs3q1007 = bs3q1007;
        notifyPropertyChanged(BR.bs3q1007);
    }

    @Bindable
    public String getBs3q1008() {
        return bs3q1008;
    }

    public void setBs3q1008(String bs3q1008) {
        if (this.bs3q1008.equals(bs3q1008)) return;
        this.bs3q1008 = bs3q1008;
        notifyPropertyChanged(BR.bs3q1008);
    }

    @Bindable
    public String getBs3q1009() {
        return bs3q1009;
    }

    public void setBs3q1009(String bs3q1009) {
        if (this.bs3q1009.equals(bs3q1009)) return;
        this.bs3q1009 = bs3q1009;
        notifyPropertyChanged(BR.bs3q1009);
    }

    @Bindable
    public String getBs3q1096() {
        return bs3q1096;
    }

    public void setBs3q1096(String bs3q1096) {
        if (this.bs3q1096.equals(bs3q1096)) return;
        this.bs3q1096 = bs3q1096;
        setBs3q1096x(bs3q1096.equals("96") ? this.bs3q1096x : "");
        notifyPropertyChanged(BR.bs3q1096);
    }

    @Bindable
    public String getBs3q1096x() {
        return bs3q1096x;
    }

    public void setBs3q1096x(String bs3q1096x) {
        this.bs3q1096x = bs3q1096x;
        notifyPropertyChanged(BR.bs3q1096x);
    }

    @Bindable
    public String getBs3q1097() {
        return bs3q1097;
    }

    public void setBs3q1097(String bs3q1097) {
        if (this.bs3q1097.equals(bs3q1097)) return;
        this.bs3q1097 = bs3q1097;
        setBs3q1001(bs3q1097.equals("97") ? "" : this.bs3q1001);
        setBs3q1002(bs3q1097.equals("97") ? "" : this.bs3q1002);
        setBs3q1003(bs3q1097.equals("97") ? "" : this.bs3q1003);
        setBs3q1004(bs3q1097.equals("97") ? "" : this.bs3q1004);
        setBs3q1005(bs3q1097.equals("97") ? "" : this.bs3q1005);
        setBs3q1006(bs3q1097.equals("97") ? "" : this.bs3q1006);
        setBs3q1007(bs3q1097.equals("97") ? "" : this.bs3q1007);
        setBs3q1008(bs3q1097.equals("97") ? "" : this.bs3q1008);
        setBs3q1009(bs3q1097.equals("97") ? "" : this.bs3q1009);
        setBs3q1096(bs3q1097.equals("97") ? "" : this.bs3q1096);
        notifyPropertyChanged(BR.bs3q1097);
    }

    @Bindable
    public String getBs3q11() {
        return bs3q11;
    }

    public void setBs3q11(String bs3q11) {
        this.bs3q11 = bs3q11;
        setBs3q1201(bs3q11.equals("2") ? "" : this.bs3q1201);
        setBs3q1202(bs3q11.equals("2") ? "" : this.bs3q1202);
        setBs3q1203(bs3q11.equals("2") ? "" : this.bs3q1203);
        setBs3q1204(bs3q11.equals("2") ? "" : this.bs3q1204);
        setBs3q1205(bs3q11.equals("2") ? "" : this.bs3q1205);
        setBs3q1206(bs3q11.equals("2") ? "" : this.bs3q1206);
        setBs3q1207(bs3q11.equals("2") ? "" : this.bs3q1207);
        setBs3q1296(bs3q11.equals("2") ? "" : this.bs3q1296);
        notifyPropertyChanged(BR.bs3q11);
    }

    @Bindable
    public String getBs3q12() {
        return bs3q12;
    }

    public void setBs3q12(String bs3q12) {
        this.bs3q12 = bs3q12;
        notifyPropertyChanged(BR.bs3q12);
    }

    @Bindable
    public String getBs3q1201() {
        return bs3q1201;
    }

    public void setBs3q1201(String bs3q1201) {
        if (this.bs3q1201.equals(bs3q1201)) return;
        this.bs3q1201 = bs3q1201;
        notifyPropertyChanged(BR.bs3q1201);
    }

    @Bindable
    public String getBs3q1202() {
        return bs3q1202;
    }

    public void setBs3q1202(String bs3q1202) {
        if (this.bs3q1202.equals(bs3q1202)) return;
        this.bs3q1202 = bs3q1202;
        notifyPropertyChanged(BR.bs3q1202);
    }

    @Bindable
    public String getBs3q1203() {
        return bs3q1203;
    }

    public void setBs3q1203(String bs3q1203) {
        if (this.bs3q1203.equals(bs3q1203)) return;
        this.bs3q1203 = bs3q1203;
        notifyPropertyChanged(BR.bs3q1203);
    }

    @Bindable
    public String getBs3q1204() {
        return bs3q1204;
    }

    public void setBs3q1204(String bs3q1204) {
        if (this.bs3q1204.equals(bs3q1204)) return;
        this.bs3q1204 = bs3q1204;
        notifyPropertyChanged(BR.bs3q1204);
    }

    @Bindable
    public String getBs3q1205() {
        return bs3q1205;
    }

    public void setBs3q1205(String bs3q1205) {
        if (this.bs3q1205.equals(bs3q1205)) return;
        this.bs3q1205 = bs3q1205;
        notifyPropertyChanged(BR.bs3q1205);
    }

    @Bindable
    public String getBs3q1206() {
        return bs3q1206;
    }

    public void setBs3q1206(String bs3q1206) {
        if (this.bs3q1206.equals(bs3q1206)) return;
        this.bs3q1206 = bs3q1206;
        setBs3q1206x(bs3q1206.equals("6") ? this.bs3q1206x : "");
        notifyPropertyChanged(BR.bs3q1206);
    }

    @Bindable
    public String getBs3q1206x() {
        return bs3q1206x;
    }

    public void setBs3q1206x(String bs3q1206x) {
        this.bs3q1206x = bs3q1206x;
        notifyPropertyChanged(BR.bs3q1206x);
    }

    @Bindable
    public String getBs3q1207() {
        return bs3q1207;
    }

    public void setBs3q1207(String bs3q1207) {
        if (this.bs3q1207.equals(bs3q1207)) return;
        this.bs3q1207 = bs3q1207;
        notifyPropertyChanged(BR.bs3q1207);
    }

    @Bindable
    public String getBs3q1296() {
        return bs3q1296;
    }

    public void setBs3q1296(String bs3q1296) {
        if (this.bs3q1296.equals(bs3q1296)) return;
        this.bs3q1296 = bs3q1296;
        setBs3q1296x(bs3q1296.equals("96") ? this.bs3q1296x : "");
        notifyPropertyChanged(BR.bs3q1296);
    }

    @Bindable
    public String getBs3q1296x() {
        return bs3q1296x;
    }

    public void setBs3q1296x(String bs3q1296x) {
        this.bs3q1296x = bs3q1296x;
        notifyPropertyChanged(BR.bs3q1296x);
    }

    @Bindable
    public String getBs3q13() {
        return bs3q13;
    }

    public void setBs3q13(String bs3q13) {
        this.bs3q13 = bs3q13;
        notifyPropertyChanged(BR.bs3q13);
    }

    @Bindable
    public String getBs3q14() {
        return bs3q14;
    }

    public void setBs3q14(String bs3q14) {
        this.bs3q14 = bs3q14;
        notifyPropertyChanged(BR.bs3q14);
    }

    @Bindable
    public String getBs3q15() {
        return bs3q15;
    }

    public void setBs3q15(String bs3q15) {
        this.bs3q15 = bs3q15;
        notifyPropertyChanged(BR.bs3q15);
    }

    @Bindable
    public String getBs4aq1() {
        return bs4aq1;
    }

    public void setBs4aq1(String bs4aq1) {
        this.bs4aq1 = bs4aq1;
        setBs4aq201(bs4aq1.equals("2") ? "" : this.bs4aq201);
        setBs4aq202(bs4aq1.equals("2") ? "" : this.bs4aq202);
        setBs4aq203(bs4aq1.equals("2") ? "" : this.bs4aq203);
        setBs4aq204(bs4aq1.equals("2") ? "" : this.bs4aq204);
        setBs4aq205(bs4aq1.equals("2") ? "" : this.bs4aq205);
        setBs4aq206(bs4aq1.equals("2") ? "" : this.bs4aq206);
        setBs4aq207(bs4aq1.equals("2") ? "" : this.bs4aq207);
        setBs4aq208(bs4aq1.equals("2") ? "" : this.bs4aq208);
        setBs4aq296(bs4aq1.equals("2") ? "" : this.bs4aq296);
        setBs4aq298(bs4aq1.equals("2") ? "" : this.bs4aq298);
        setBs4aq3(bs4aq1.equals("2") ? "" : this.bs4aq3);
        setBs4aq4(bs4aq1.equals("2") ? "" : this.bs4aq4);
        setBs4aq5(bs4aq1.equals("2") ? "" : this.bs4aq5);
        setBs4aq6(bs4aq1.equals("2") ? "" : this.bs4aq6);
        setBs4aq7(bs4aq1.equals("2") ? "" : this.bs4aq7);
        setBs4aq8(bs4aq1.equals("2") ? "" : this.bs4aq8);
        setBs4aq9(bs4aq1.equals("2") ? "" : this.bs4aq9);
        setBs4aq10(bs4aq1.equals("2") ? "" : this.bs4aq10);
        notifyPropertyChanged(BR.bs4aq1);
    }

    @Bindable
    public String getBs4aq2() {
        return bs4aq2;
    }

    public void setBs4aq2(String bs4aq2) {
        this.bs4aq2 = bs4aq2;
        notifyPropertyChanged(BR.bs4aq2);
    }

    @Bindable
    public String getBs4aq201() {
        return bs4aq201;
    }

    public void setBs4aq201(String bs4aq201) {
        this.bs4aq201 = bs4aq201;
        notifyPropertyChanged(BR.bs4aq201);
    }

    @Bindable
    public String getBs4aq202() {
        return bs4aq202;
    }

    public void setBs4aq202(String bs4aq202) {
        this.bs4aq202 = bs4aq202;
        notifyPropertyChanged(BR.bs4aq202);
    }

    @Bindable
    public String getBs4aq203() {
        return bs4aq203;
    }

    public void setBs4aq203(String bs4aq203) {
        this.bs4aq203 = bs4aq203;
        notifyPropertyChanged(BR.bs4aq203);
    }

    @Bindable
    public String getBs4aq204() {
        return bs4aq204;
    }

    public void setBs4aq204(String bs4aq204) {
        this.bs4aq204 = bs4aq204;
        notifyPropertyChanged(BR.bs4aq204);
    }

    @Bindable
    public String getBs4aq205() {
        return bs4aq205;
    }

    public void setBs4aq205(String bs4aq205) {
        this.bs4aq205 = bs4aq205;
        notifyPropertyChanged(BR.bs4aq205);
    }

    @Bindable
    public String getBs4aq206() {
        return bs4aq206;
    }

    public void setBs4aq206(String bs4aq206) {
        this.bs4aq206 = bs4aq206;
        notifyPropertyChanged(BR.bs4aq206);
    }

    @Bindable
    public String getBs4aq207() {
        return bs4aq207;
    }

    public void setBs4aq207(String bs4aq207) {
        this.bs4aq207 = bs4aq207;
        notifyPropertyChanged(BR.bs4aq207);
    }

    @Bindable
    public String getBs4aq208() {
        return bs4aq208;
    }

    public void setBs4aq208(String bs4aq208) {
        this.bs4aq208 = bs4aq208;
        notifyPropertyChanged(BR.bs4aq208);
    }

    @Bindable
    public String getBs4aq298() {
        return bs4aq298;
    }

    public void setBs4aq298(String bs4aq298) {
        this.bs4aq298 = bs4aq298;
        setBs4aq201(bs4aq298.equals("98") ? "" : this.bs4aq201);
        setBs4aq202(bs4aq298.equals("98") ? "" : this.bs4aq202);
        setBs4aq203(bs4aq298.equals("98") ? "" : this.bs4aq203);
        setBs4aq204(bs4aq298.equals("98") ? "" : this.bs4aq204);
        setBs4aq205(bs4aq298.equals("98") ? "" : this.bs4aq205);
        setBs4aq206(bs4aq298.equals("98") ? "" : this.bs4aq206);
        setBs4aq207(bs4aq298.equals("98") ? "" : this.bs4aq207);
        setBs4aq208(bs4aq298.equals("98") ? "" : this.bs4aq208);
        setBs4aq296(bs4aq298.equals("98") ? "" : this.bs4aq296);
        notifyPropertyChanged(BR.bs4aq298);
    }

    @Bindable
    public String getBs4aq296() {
        return bs4aq296;
    }

    public void setBs4aq296(String bs4aq296) {
        this.bs4aq296 = bs4aq296;
        setBs4aq296x(bs4aq296.equals("96") ? this.bs4aq296x : "");
        notifyPropertyChanged(BR.bs4aq296);
    }

    @Bindable
    public String getBs4aq296x() {
        return bs4aq296x;
    }

    public void setBs4aq296x(String bs4aq296x) {
        this.bs4aq296x = bs4aq296x;
        notifyPropertyChanged(BR.bs4aq296x);
    }

    @Bindable
    public String getBs4aq3() {
        return bs4aq3;
    }

    public void setBs4aq3(String bs4aq3) {
        this.bs4aq3 = bs4aq3;
        setBs4aq4(bs4aq3.equals("2") ? "" : this.bs4aq4);
        setBs4aq5(bs4aq3.equals("2") ? "" : this.bs4aq5);
        setBs4aq6(bs4aq3.equals("2") ? "" : this.bs4aq6);
        notifyPropertyChanged(BR.bs4aq3);
    }

    @Bindable
    public String getBs4aq4() {
        return bs4aq4;
    }

    public void setBs4aq4(String bs4aq4) {
        this.bs4aq4 = bs4aq4;
        setBs4aq5(bs4aq4.equals("2") ? "" : this.bs4aq5);
        setBs4aq6(bs4aq4.equals("2") ? "" : this.bs4aq6);
        notifyPropertyChanged(BR.bs4aq4);
    }

    @Bindable
    public String getBs4aq5() {
        return bs4aq5;
    }

    public void setBs4aq5(String bs4aq5) {
        this.bs4aq5 = bs4aq5;
        setBs4aq6(bs4aq5.equals("2") ? "" : this.bs4aq6);
        notifyPropertyChanged(BR.bs4aq5);
    }

    @Bindable
    public String getBs4aq6() {
        return bs4aq6;
    }

    public void setBs4aq6(String bs4aq6) {
        this.bs4aq6 = bs4aq6;
        setBs4aq696x(bs4aq6.equals("96") ? this.bs4aq696x : "");
        notifyPropertyChanged(BR.bs4aq6);
    }

    @Bindable
    public String getBs4aq696x() {
        return bs4aq696x;
    }

    public void setBs4aq696x(String bs4aq696x) {
        this.bs4aq696x = bs4aq696x;
        notifyPropertyChanged(BR.bs4aq696x);
    }

    @Bindable
    public String getBs4aq7() {
        return bs4aq7;
    }

    public void setBs4aq7(String bs4aq7) {
        this.bs4aq7 = bs4aq7;
        setBs4aq8(bs4aq7.equals("1") ? this.bs4aq8 : "");
        notifyPropertyChanged(BR.bs4aq7);
    }

    @Bindable
    public String getBs4aq8() {
        return bs4aq8;
    }

    public void setBs4aq8(String bs4aq8) {
        this.bs4aq8 = bs4aq8;
        setBs4aq896x(bs4aq8.equals("96") ? this.bs4aq896x : "");
        notifyPropertyChanged(BR.bs4aq8);
    }

    @Bindable
    public String getBs4aq896x() {
        return bs4aq896x;
    }

    public void setBs4aq896x(String bs4aq896x) {
        this.bs4aq896x = bs4aq896x;
        notifyPropertyChanged(BR.bs4aq896x);
    }

    @Bindable
    public String getBs4aq9() {
        return bs4aq9;
    }

    public void setBs4aq9(String bs4aq9) {
        this.bs4aq9 = bs4aq9;
        setBs4aq10(bs4aq9.equals("1") ? this.bs4aq10 : "");
        notifyPropertyChanged(BR.bs4aq9);
    }

    @Bindable
    public String getBs4aq10() {
        return bs4aq10;
    }

    public void setBs4aq10(String bs4aq10) {
        this.bs4aq10 = bs4aq10;
        notifyPropertyChanged(BR.bs4aq10);
    }

    @Bindable
    public String getBs4bq1() {
        return bs4bq1;
    }

    public void setBs4bq1(String bs4bq1) {
        this.bs4bq1 = bs4bq1;
        notifyPropertyChanged(BR.bs4bq1);
    }

    @Bindable
    public String getBs4bq2() {
        return bs4bq2;
    }

    public void setBs4bq2(String bs4bq2) {
        this.bs4bq2 = bs4bq2;
        notifyPropertyChanged(BR.bs4bq2);
    }

    @Bindable
    public String getBs4bq21() {
        return bs4bq21;
    }

    public void setBs4bq21(String bs4bq21) {
        this.bs4bq21 = bs4bq21;
        notifyPropertyChanged(BR.bs4bq21);
    }

    @Bindable
    public String getBs4bq22() {
        return bs4bq22;
    }

    public void setBs4bq22(String bs4bq22) {
        this.bs4bq22 = bs4bq22;
        notifyPropertyChanged(BR.bs4bq22);
    }

    @Bindable
    public String getBs4bq23() {
        return bs4bq23;
    }

    public void setBs4bq23(String bs4bq23) {
        this.bs4bq23 = bs4bq23;
        notifyPropertyChanged(BR.bs4bq23);
    }

    @Bindable
    public String getBs4bq24() {
        return bs4bq24;
    }

    public void setBs4bq24(String bs4bq24) {
        this.bs4bq24 = bs4bq24;
        notifyPropertyChanged(BR.bs4bq24);
    }

    @Bindable
    public String getBs4bq298() {
        return bs4bq298;
    }

    public void setBs4bq298(String bs4bq298) {
        this.bs4bq298 = bs4bq298;
        notifyPropertyChanged(BR.bs4bq298);
    }

    @Bindable
    public String getBs4bq296() {
        return bs4bq296;
    }

    public void setBs4bq296(String bs4bq296) {
        this.bs4bq296 = bs4bq296;
        setBs4bq296x(bs4bq296.equals("96") ? this.bs4bq296x : "");
        notifyPropertyChanged(BR.bs4bq296);
    }

    @Bindable
    public String getBs4bq296x() {
        return bs4bq296x;
    }

    public void setBs4bq296x(String bs4bq296x) {
        this.bs4bq296x = bs4bq296x;
        notifyPropertyChanged(BR.bs4bq296x);
    }

    @Bindable
    public String getBs4bq3() {
        return bs4bq3;
    }

    public void setBs4bq3(String bs4bq3) {
        this.bs4bq3 = bs4bq3;
        notifyPropertyChanged(BR.bs4bq3);
    }

    @Bindable
    public String getBs4bq31() {
        return bs4bq31;
    }

    public void setBs4bq31(String bs4bq31) {
        this.bs4bq31 = bs4bq31;
        notifyPropertyChanged(BR.bs4bq31);
    }

    @Bindable
    public String getBs4bq32() {
        return bs4bq32;
    }

    public void setBs4bq32(String bs4bq32) {
        this.bs4bq32 = bs4bq32;
        notifyPropertyChanged(BR.bs4bq32);
    }

    @Bindable
    public String getBs4bq33() {
        return bs4bq33;
    }

    public void setBs4bq33(String bs4bq33) {
        this.bs4bq33 = bs4bq33;
        notifyPropertyChanged(BR.bs4bq33);
    }

    @Bindable
    public String getBs4bq34() {
        return bs4bq34;
    }

    public void setBs4bq34(String bs4bq34) {
        this.bs4bq34 = bs4bq34;
        notifyPropertyChanged(BR.bs4bq34);
    }

    @Bindable
    public String getBs4bq35() {
        return bs4bq35;
    }

    public void setBs4bq35(String bs4bq35) {
        this.bs4bq35 = bs4bq35;
        notifyPropertyChanged(BR.bs4bq35);
    }

    @Bindable
    public String getBs4bq36() {
        return bs4bq36;
    }

    public void setBs4bq36(String bs4bq36) {
        this.bs4bq36 = bs4bq36;
        notifyPropertyChanged(BR.bs4bq36);
    }

    @Bindable
    public String getBs4bq398() {
        return bs4bq398;
    }

    public void setBs4bq398(String bs4bq398) {
        this.bs4bq398 = bs4bq398;
        notifyPropertyChanged(BR.bs4bq398);
    }

    @Bindable
    public String getBs4bq396() {
        return bs4bq396;
    }

    public void setBs4bq396(String bs4bq396) {
        this.bs4bq396 = bs4bq396;
        notifyPropertyChanged(BR.bs4bq396);
    }

    @Bindable
    public String getBs4bq396x() {
        return bs4bq396x;
    }

    public void setBs4bq396x(String bs4bq396x) {
        this.bs4bq396x = bs4bq396x;
        notifyPropertyChanged(BR.bs4bq396x);
    }

    @Bindable
    public String getBs4bq4() {
        return bs4bq4;
    }

    public void setBs4bq4(String bs4bq4) {
        this.bs4bq4 = bs4bq4;
        notifyPropertyChanged(BR.bs4bq4);
    }

    @Bindable
    public String getBs4bq5() {
        return bs4bq5;
    }

    public void setBs4bq5(String bs4bq5) {
        this.bs4bq5 = bs4bq5;
        notifyPropertyChanged(BR.bs4bq5);
    }

    @Bindable
    public String getBs4bq51() {
        return bs4bq51;
    }

    public void setBs4bq51(String bs4bq51) {
        this.bs4bq51 = bs4bq51;
        notifyPropertyChanged(BR.bs4bq51);
    }

    @Bindable
    public String getBs4bq52() {
        return bs4bq52;
    }

    public void setBs4bq52(String bs4bq52) {
        this.bs4bq52 = bs4bq52;
        notifyPropertyChanged(BR.bs4bq52);
    }

    @Bindable
    public String getBs4bq53() {
        return bs4bq53;
    }

    public void setBs4bq53(String bs4bq53) {
        this.bs4bq53 = bs4bq53;
        notifyPropertyChanged(BR.bs4bq53);
    }

    @Bindable
    public String getBs4bq598() {
        return bs4bq598;
    }

    public void setBs4bq598(String bs4bq598) {
        this.bs4bq598 = bs4bq598;
        notifyPropertyChanged(BR.bs4bq598);
    }

    @Bindable
    public String getBs4bq596() {
        return bs4bq596;
    }

    public void setBs4bq596(String bs4bq596) {
        this.bs4bq596 = bs4bq596;
        notifyPropertyChanged(BR.bs4bq596);
    }

    @Bindable
    public String getBs4bq596x() {
        return bs4bq596x;
    }

    public void setBs4bq596x(String bs4bq596x) {
        this.bs4bq596x = bs4bq596x;
        notifyPropertyChanged(BR.bs4bq596x);
    }

    @Bindable
    public String getBs4bq6() {
        return bs4bq6;
    }

    public void setBs4bq6(String bs4bq6) {
        this.bs4bq6 = bs4bq6;
        notifyPropertyChanged(BR.bs4bq6);
    }

    @Bindable
    public String getBs4bq696x() {
        return bs4bq696x;
    }

    public void setBs4bq696x(String bs4bq696x) {
        this.bs4bq696x = bs4bq696x;
        notifyPropertyChanged(BR.bs4bq696x);
    }

    @Bindable
    public String getBs4bq7() {
        return bs4bq7;
    }

    public void setBs4bq7(String bs4bq7) {
        this.bs4bq7 = bs4bq7;
        notifyPropertyChanged(BR.bs4bq7);
    }

    @Bindable
    public String getBs4bq8() {
        return bs4bq8;
    }

    public void setBs4bq8(String bs4bq8) {
        this.bs4bq8 = bs4bq8;
        notifyPropertyChanged(BR.bs4bq8);
    }

    @Bindable
    public String getBs4bq81() {
        return bs4bq81;
    }

    public void setBs4bq81(String bs4bq81) {
        this.bs4bq81 = bs4bq81;
        notifyPropertyChanged(BR.bs4bq81);
    }

    @Bindable
    public String getBs4bq82() {
        return bs4bq82;
    }

    public void setBs4bq82(String bs4bq82) {
        this.bs4bq82 = bs4bq82;
        notifyPropertyChanged(BR.bs4bq82);
    }

    @Bindable
    public String getBs4bq83() {
        return bs4bq83;
    }

    public void setBs4bq83(String bs4bq83) {
        this.bs4bq83 = bs4bq83;
        notifyPropertyChanged(BR.bs4bq83);
    }

    @Bindable
    public String getBs4bq84() {
        return bs4bq84;
    }

    public void setBs4bq84(String bs4bq84) {
        this.bs4bq84 = bs4bq84;
        notifyPropertyChanged(BR.bs4bq84);
    }

    @Bindable
    public String getBs4bq85() {
        return bs4bq85;
    }

    public void setBs4bq85(String bs4bq85) {
        this.bs4bq85 = bs4bq85;
        notifyPropertyChanged(BR.bs4bq85);
    }

    @Bindable
    public String getBs4bq86() {
        return bs4bq86;
    }

    public void setBs4bq86(String bs4bq86) {
        this.bs4bq86 = bs4bq86;
        notifyPropertyChanged(BR.bs4bq86);
    }

    @Bindable
    public String getBs4bq87() {
        return bs4bq87;
    }

    public void setBs4bq87(String bs4bq87) {
        this.bs4bq87 = bs4bq87;
        notifyPropertyChanged(BR.bs4bq87);
    }

    @Bindable
    public String getBs4bq898() {
        return bs4bq898;
    }

    public void setBs4bq898(String bs4bq898) {
        this.bs4bq898 = bs4bq898;
        notifyPropertyChanged(BR.bs4bq898);
    }

    @Bindable
    public String getBs4bq896() {
        return bs4bq896;
    }

    public void setBs4bq896(String bs4bq896) {
        this.bs4bq896 = bs4bq896;
        notifyPropertyChanged(BR.bs4bq896);
    }

    @Bindable
    public String getBs4bq896x() {
        return bs4bq896x;
    }

    public void setBs4bq896x(String bs4bq896x) {
        this.bs4bq896x = bs4bq896x;
        notifyPropertyChanged(BR.bs4bq896x);
    }

    @Bindable
    public String getBs5q1() {
        return bs5q1;
    }

    public void setBs5q1(String bs5q1) {
        this.bs5q1 = bs5q1;
        notifyPropertyChanged(BR.bs5q1);
    }

    @Bindable
    public String getBs5q2() {
        return bs5q2;
    }

    public void setBs5q2(String bs5q2) {
        this.bs5q2 = bs5q2;
        notifyPropertyChanged(BR.bs5q2);
    }

    @Bindable
    public String getBs5q201() {
        return bs5q201;
    }

    public void setBs5q201(String bs5q201) {
        this.bs5q201 = bs5q201;
        notifyPropertyChanged(BR.bs5q201);
    }

    @Bindable
    public String getBs5q202() {
        return bs5q202;
    }

    public void setBs5q202(String bs5q202) {
        this.bs5q202 = bs5q202;
        notifyPropertyChanged(BR.bs5q202);
    }

    @Bindable
    public String getBs5q203() {
        return bs5q203;
    }

    public void setBs5q203(String bs5q203) {
        this.bs5q203 = bs5q203;
        notifyPropertyChanged(BR.bs5q203);
    }

    @Bindable
    public String getBs5q204() {
        return bs5q204;
    }

    public void setBs5q204(String bs5q204) {
        this.bs5q204 = bs5q204;
        notifyPropertyChanged(BR.bs5q204);
    }

    @Bindable
    public String getBs5q205() {
        return bs5q205;
    }

    public void setBs5q205(String bs5q205) {
        this.bs5q205 = bs5q205;
        notifyPropertyChanged(BR.bs5q205);
    }

    @Bindable
    public String getBs5q296() {
        return bs5q296;
    }

    public void setBs5q296(String bs5q296) {
        this.bs5q296 = bs5q296;
        notifyPropertyChanged(BR.bs5q296);
    }

    @Bindable
    public String getBs5q296x() {
        return bs5q296x;
    }

    public void setBs5q296x(String bs5q296x) {
        this.bs5q296x = bs5q296x;
        notifyPropertyChanged(BR.bs5q296x);
    }

    @Bindable
    public String getBs5q297() {
        return bs5q297;
    }

    public void setBs5q297(String bs5q297) {
        this.bs5q297 = bs5q297;
        notifyPropertyChanged(BR.bs5q297);
    }

    @Bindable
    public String getBs5q3() {
        return bs5q3;
    }

    public void setBs5q3(String bs5q3) {
        this.bs5q3 = bs5q3;
        notifyPropertyChanged(BR.bs5q3);
    }

    @Bindable
    public String getBs5q4() {
        return bs5q4;
    }

    public void setBs5q4(String bs5q4) {
        this.bs5q4 = bs5q4;
        notifyPropertyChanged(BR.bs5q4);
    }

    @Bindable
    public String getBs5q401() {
        return bs5q401;
    }

    public void setBs5q401(String bs5q401) {
        this.bs5q401 = bs5q401;
        notifyPropertyChanged(BR.bs5q401);
    }

    @Bindable
    public String getBs5q402() {
        return bs5q402;
    }

    public void setBs5q402(String bs5q402) {
        this.bs5q402 = bs5q402;
        notifyPropertyChanged(BR.bs5q402);
    }

    @Bindable
    public String getBs5q403() {
        return bs5q403;
    }

    public void setBs5q403(String bs5q403) {
        this.bs5q403 = bs5q403;
        notifyPropertyChanged(BR.bs5q403);
    }

    @Bindable
    public String getBs5q404() {
        return bs5q404;
    }

    public void setBs5q404(String bs5q404) {
        this.bs5q404 = bs5q404;
        notifyPropertyChanged(BR.bs5q404);
    }

    @Bindable
    public String getBs5q496() {
        return bs5q496;
    }

    public void setBs5q496(String bs5q496) {
        this.bs5q496 = bs5q496;
        notifyPropertyChanged(BR.bs5q496);
    }

    @Bindable
    public String getBs5q496x() {
        return bs5q496x;
    }

    public void setBs5q496x(String bs5q496x) {
        this.bs5q496x = bs5q496x;
        notifyPropertyChanged(BR.bs5q496x);
    }

    @Bindable
    public String getBs5q497() {
        return bs5q497;
    }

    public void setBs5q497(String bs5q497) {
        this.bs5q497 = bs5q497;
        notifyPropertyChanged(BR.bs5q497);
    }

    @Bindable
    public String getBs5q5() {
        return bs5q5;
    }

    public void setBs5q5(String bs5q5) {
        this.bs5q5 = bs5q5;
        notifyPropertyChanged(BR.bs5q5);
    }

    @Bindable
    public String getBs5q6() {
        return bs5q6;
    }

    public void setBs5q6(String bs5q6) {
        this.bs5q6 = bs5q6;
        notifyPropertyChanged(BR.bs5q6);
    }

    @Bindable
    public String getBs5q7() {
        return bs5q7;
    }

    public void setBs5q7(String bs5q7) {
        this.bs5q7 = bs5q7;
        notifyPropertyChanged(BR.bs5q7);
    }

    @Bindable
    public String getBs5q8() {
        return bs5q8;
    }

    public void setBs5q8(String bs5q8) {
        this.bs5q8 = bs5q8;
        notifyPropertyChanged(BR.bs5q8);
    }

    @Bindable
    public String getBs5q801() {
        return bs5q801;
    }

    public void setBs5q801(String bs5q801) {
        this.bs5q801 = bs5q801;
        notifyPropertyChanged(BR.bs5q801);
    }

    @Bindable
    public String getBs5q802() {
        return bs5q802;
    }

    public void setBs5q802(String bs5q802) {
        this.bs5q802 = bs5q802;
        notifyPropertyChanged(BR.bs5q802);
    }

    @Bindable
    public String getBs5q803() {
        return bs5q803;
    }

    public void setBs5q803(String bs5q803) {
        this.bs5q803 = bs5q803;
        notifyPropertyChanged(BR.bs5q803);
    }

    @Bindable
    public String getBs5q804() {
        return bs5q804;
    }

    public void setBs5q804(String bs5q804) {
        this.bs5q804 = bs5q804;
        notifyPropertyChanged(BR.bs5q804);
    }

    @Bindable
    public String getBs5q805() {
        return bs5q805;
    }

    public void setBs5q805(String bs5q805) {
        this.bs5q805 = bs5q805;
        notifyPropertyChanged(BR.bs5q805);
    }

    @Bindable
    public String getBs5q806() {
        return bs5q806;
    }

    public void setBs5q806(String bs5q806) {
        this.bs5q806 = bs5q806;
        notifyPropertyChanged(BR.bs5q806);
    }

    @Bindable
    public String getBs5q807() {
        return bs5q807;
    }

    public void setBs5q807(String bs5q807) {
        this.bs5q807 = bs5q807;
        notifyPropertyChanged(BR.bs5q807);
    }

    @Bindable
    public String getBs5q808() {
        return bs5q808;
    }

    public void setBs5q808(String bs5q808) {
        this.bs5q808 = bs5q808;
        notifyPropertyChanged(BR.bs5q808);
    }

    @Bindable
    public String getBs5q896() {
        return bs5q896;
    }

    public void setBs5q896(String bs5q896) {
        this.bs5q896 = bs5q896;
        notifyPropertyChanged(BR.bs5q896);
    }

    @Bindable
    public String getBs5q896x() {
        return bs5q896x;
    }

    public void setBs5q896x(String bs5q896x) {
        this.bs5q896x = bs5q896x;
        notifyPropertyChanged(BR.bs5q896x);
    }

    @Bindable
    public String getBs5q898() {
        return bs5q898;
    }

    public void setBs5q898(String bs5q898) {
        this.bs5q898 = bs5q898;
        notifyPropertyChanged(BR.bs5q898);
    }

    @Bindable
    public String getBs5q9() {
        return bs5q9;
    }

    public void setBs5q9(String bs5q9) {
        this.bs5q9 = bs5q9;
        notifyPropertyChanged(BR.bs5q9);
    }

    @Bindable
    public String getBs5q901() {
        return bs5q901;
    }

    public void setBs5q901(String bs5q901) {
        this.bs5q901 = bs5q901;
        notifyPropertyChanged(BR.bs5q901);
    }

    @Bindable
    public String getBs5q902() {
        return bs5q902;
    }

    public void setBs5q902(String bs5q902) {
        this.bs5q902 = bs5q902;
        notifyPropertyChanged(BR.bs5q902);
    }

    @Bindable
    public String getBs5q903() {
        return bs5q903;
    }

    public void setBs5q903(String bs5q903) {
        this.bs5q903 = bs5q903;
        notifyPropertyChanged(BR.bs5q903);
    }

    @Bindable
    public String getBs5q904() {
        return bs5q904;
    }

    public void setBs5q904(String bs5q904) {
        this.bs5q904 = bs5q904;
        notifyPropertyChanged(BR.bs5q904);
    }

    @Bindable
    public String getBs5q905() {
        return bs5q905;
    }

    public void setBs5q905(String bs5q905) {
        this.bs5q905 = bs5q905;
        notifyPropertyChanged(BR.bs5q905);
    }

    @Bindable
    public String getBs5q906() {
        return bs5q906;
    }

    public void setBs5q906(String bs5q906) {
        this.bs5q906 = bs5q906;
        notifyPropertyChanged(BR.bs5q906);
    }

    @Bindable
    public String getBs5q907() {
        return bs5q907;
    }

    public void setBs5q907(String bs5q907) {
        this.bs5q907 = bs5q907;
        notifyPropertyChanged(BR.bs5q907);
    }

    @Bindable
    public String getBs5q908() {
        return bs5q908;
    }

    public void setBs5q908(String bs5q908) {
        this.bs5q908 = bs5q908;
        notifyPropertyChanged(BR.bs5q908);
    }

    @Bindable
    public String getBs5q996() {
        return bs5q996;
    }

    public void setBs5q996(String bs5q996) {
        this.bs5q996 = bs5q996;
        notifyPropertyChanged(BR.bs5q996);
    }

    @Bindable
    public String getBs5q996x() {
        return bs5q996x;
    }

    public void setBs5q996x(String bs5q996x) {
        this.bs5q996x = bs5q996x;
        notifyPropertyChanged(BR.bs5q996x);
    }

    @Bindable
    public String getBs5q998() {
        return bs5q998;
    }

    public void setBs5q998(String bs5q998) {
        this.bs5q998 = bs5q998;
        notifyPropertyChanged(BR.bs5q998);
    }

    @Bindable
    public String getBs5q10() {
        return bs5q10;
    }

    public void setBs5q10(String bs5q10) {
        this.bs5q10 = bs5q10;
        notifyPropertyChanged(BR.bs5q10);
    }

    @Bindable
    public String getBs5q1096x() {
        return bs5q1096x;
    }

    public void setBs5q1096x(String bs5q1096x) {
        this.bs5q1096x = bs5q1096x;
        notifyPropertyChanged(BR.bs5q1096x);
    }

    @Bindable
    public String getBs5q11() {
        return bs5q11;
    }

    public void setBs5q11(String bs5q11) {
        this.bs5q11 = bs5q11;
        notifyPropertyChanged(BR.bs5q11);
    }

    @Bindable
    public String getBs5q12() {
        return bs5q12;
    }

    public void setBs5q12(String bs5q12) {
        this.bs5q12 = bs5q12;
        notifyPropertyChanged(BR.bs5q12);
    }

    @Bindable
    public String getBs6q1() {
        return bs6q1;
    }

    public void setBs6q1(String bs6q1) {
        this.bs6q1 = bs6q1;
        notifyPropertyChanged(BR.bs6q1);
    }

    @Bindable
    public String getBs6q1mx() {
        return bs6q1mx;
    }

    public void setBs6q1mx(String bs6q1mx) {
        this.bs6q1mx = bs6q1mx;
        notifyPropertyChanged(BR.bs6q1mx);
    }

    @Bindable
    public String getBs6q2() {
        return bs6q2;
    }

    public void setBs6q2(String bs6q2) {
        this.bs6q2 = bs6q2;
        notifyPropertyChanged(BR.bs6q2);
    }

    @Bindable
    public String getBs6q3() {
        return bs6q3;
    }

    public void setBs6q3(String bs6q3) {
        this.bs6q3 = bs6q3;
        notifyPropertyChanged(BR.bs6q3);
    }

    @Bindable
    public String getBs6q3mx() {
        return bs6q3mx;
    }

    public void setBs6q3mx(String bs6q3mx) {
        this.bs6q3mx = bs6q3mx;
        notifyPropertyChanged(BR.bs6q3mx);
    }

    @Bindable
    public String getBs7q1() {
        return bs7q1;
    }

    public void setBs7q1(String bs7q1) {
        this.bs7q1 = bs7q1;
        notifyPropertyChanged(BR.bs7q1);
    }

    @Bindable
    public String getBs7q2line() {
        return bs7q2line;
    }

    public void setBs7q2line(String bs7q2line) {
        this.bs7q2line = bs7q2line;
        notifyPropertyChanged(BR.bs7q2line);
    }

    @Bindable
    public String getBs7q3() {
        return bs7q3;
    }

    public void setBs7q3(String bs7q3) {
        this.bs7q3 = bs7q3;
        notifyPropertyChanged(BR.bs7q3);
    }

    @Bindable
    public String getBs7q4a() {
        return bs7q4a;
    }

    public void setBs7q4a(String bs7q4a) {
        this.bs7q4a = bs7q4a;
        notifyPropertyChanged(BR.bs7q4a);
    }

    @Bindable
    public String getBs7q4b() {
        return bs7q4b;
    }

    public void setBs7q4b(String bs7q4b) {
        this.bs7q4b = bs7q4b;
        notifyPropertyChanged(BR.bs7q4b);
    }

    @Bindable
    public String getBs7q4c() {
        return bs7q4c;
    }

    public void setBs7q4c(String bs7q4c) {
        this.bs7q4c = bs7q4c;
        notifyPropertyChanged(BR.bs7q4c);
    }

    @Bindable
    public String getBs7q4d() {
        return bs7q4d;
    }

    public void setBs7q4d(String bs7q4d) {
        this.bs7q4d = bs7q4d;
        notifyPropertyChanged(BR.bs7q4d);
    }

    @Bindable
    public String getBs7q4e() {
        return bs7q4e;
    }

    public void setBs7q4e(String bs7q4e) {
        this.bs7q4e = bs7q4e;
        notifyPropertyChanged(BR.bs7q4e);
    }

    @Bindable
    public String getBs7q4f() {
        return bs7q4f;
    }

    public void setBs7q4f(String bs7q4f) {
        this.bs7q4f = bs7q4f;
        notifyPropertyChanged(BR.bs7q4f);
    }

    @Bindable
    public String getBs7q4g() {
        return bs7q4g;
    }

    public void setBs7q4g(String bs7q4g) {
        this.bs7q4g = bs7q4g;
        notifyPropertyChanged(BR.bs7q4g);
    }

    @Bindable
    public String getBs7q4h() {
        return bs7q4h;
    }

    public void setBs7q4h(String bs7q4h) {
        this.bs7q4h = bs7q4h;
        notifyPropertyChanged(BR.bs7q4h);
    }

    @Bindable
    public String getCs1q0101() {
        return cs1q0101;
    }

    public void setCs1q0101(String cs1q0101) {
        this.cs1q0101 = cs1q0101;
        notifyPropertyChanged(BR.cs1q0101);
    }

    @Bindable
    public String getCs1q0102() {
        return cs1q0102;
    }

    public void setCs1q0102(String cs1q0102) {
        this.cs1q0102 = cs1q0102;
        notifyPropertyChanged(BR.cs1q0102);
    }

    @Bindable
    public String getCs1q02() {
        return cs1q02;
    }

    public void setCs1q02(String cs1q02) {
        this.cs1q02 = cs1q02;
        notifyPropertyChanged(BR.cs1q02);
    }

    @Bindable
    public String getCs1q02c1() {
        return cs1q02c1;
    }

    public void setCs1q02c1(String cs1q02c1) {
        this.cs1q02c1 = cs1q02c1;
        notifyPropertyChanged(BR.cs1q02c1);
    }

    @Bindable
    public String getCs1q02c1n() {
        return cs1q02c1n;
    }

    public void setCs1q02c1n(String cs1q02c1n) {
        this.cs1q02c1n = cs1q02c1n;
        notifyPropertyChanged(BR.cs1q02c1n);
    }

    @Bindable
    public String getCs1q02c1ecd() {
        return cs1q02c1ecd;
    }

    public void setCs1q02c1ecd(String cs1q02c1ecd) {
        this.cs1q02c1ecd = cs1q02c1ecd;
        notifyPropertyChanged(BR.cs1q02c1ecd);
    }

    @Bindable
    public String getCs1q02c1cent() {
        return cs1q02c1cent;
    }

    public void setCs1q02c1cent(String cs1q02c1cent) {
        this.cs1q02c1cent = cs1q02c1cent;
        notifyPropertyChanged(BR.cs1q02c1cent);
    }

    @Bindable
    public String getCs1q02c2() {
        return cs1q02c2;
    }

    public void setCs1q02c2(String cs1q02c2) {
        this.cs1q02c2 = cs1q02c2;
        notifyPropertyChanged(BR.cs1q02c2);
    }

    @Bindable
    public String getCs1q02c2n() {
        return cs1q02c2n;
    }

    public void setCs1q02c2n(String cs1q02c2n) {
        this.cs1q02c2n = cs1q02c2n;
        notifyPropertyChanged(BR.cs1q02c2n);
    }

    @Bindable
    public String getCs1q02c2ecd() {
        return cs1q02c2ecd;
    }

    public void setCs1q02c2ecd(String cs1q02c2ecd) {
        this.cs1q02c2ecd = cs1q02c2ecd;
        notifyPropertyChanged(BR.cs1q02c2ecd);
    }

    @Bindable
    public String getCs1q02c2cent() {
        return cs1q02c2cent;
    }

    public void setCs1q02c2cent(String cs1q02c2cent) {
        this.cs1q02c2cent = cs1q02c2cent;
        notifyPropertyChanged(BR.cs1q02c2cent);
    }

    @Bindable
    public String getCs1q02c3() {
        return cs1q02c3;
    }

    public void setCs1q02c3(String cs1q02c3) {
        this.cs1q02c3 = cs1q02c3;
        notifyPropertyChanged(BR.cs1q02c3);
    }

    @Bindable
    public String getCs1q02c3n() {
        return cs1q02c3n;
    }

    public void setCs1q02c3n(String cs1q02c3n) {
        this.cs1q02c3n = cs1q02c3n;
        notifyPropertyChanged(BR.cs1q02c3n);
    }

    @Bindable
    public String getCs1q02c3ecd() {
        return cs1q02c3ecd;
    }

    public void setCs1q02c3ecd(String cs1q02c3ecd) {
        this.cs1q02c3ecd = cs1q02c3ecd;
        notifyPropertyChanged(BR.cs1q02c3ecd);
    }

    @Bindable
    public String getCs1q02c3cent() {
        return cs1q02c3cent;
    }

    public void setCs1q02c3cent(String cs1q02c3cent) {
        this.cs1q02c3cent = cs1q02c3cent;
        notifyPropertyChanged(BR.cs1q02c3cent);
    }

    @Bindable
    public String getCs1q02c4() {
        return cs1q02c4;
    }

    public void setCs1q02c4(String cs1q02c4) {
        this.cs1q02c4 = cs1q02c4;
        notifyPropertyChanged(BR.cs1q02c4);
    }

    @Bindable
    public String getCs1q02c4n() {
        return cs1q02c4n;
    }

    public void setCs1q02c4n(String cs1q02c4n) {
        this.cs1q02c4n = cs1q02c4n;
        notifyPropertyChanged(BR.cs1q02c4n);
    }

    @Bindable
    public String getCs1q02c4ecd() {
        return cs1q02c4ecd;
    }

    public void setCs1q02c4ecd(String cs1q02c4ecd) {
        this.cs1q02c4ecd = cs1q02c4ecd;
        notifyPropertyChanged(BR.cs1q02c4ecd);
    }

    @Bindable
    public String getCs1q02c4cent() {
        return cs1q02c4cent;
    }

    public void setCs1q02c4cent(String cs1q02c4cent) {
        this.cs1q02c4cent = cs1q02c4cent;
        notifyPropertyChanged(BR.cs1q02c4cent);
    }

    @Bindable
    public String getCs1q02c5() {
        return cs1q02c5;
    }

    public void setCs1q02c5(String cs1q02c5) {
        this.cs1q02c5 = cs1q02c5;
        notifyPropertyChanged(BR.cs1q02c5);
    }

    @Bindable
    public String getCs1q02c5n() {
        return cs1q02c5n;
    }

    public void setCs1q02c5n(String cs1q02c5n) {
        this.cs1q02c5n = cs1q02c5n;
        notifyPropertyChanged(BR.cs1q02c5n);
    }

    @Bindable
    public String getCs1q02c5ecd() {
        return cs1q02c5ecd;
    }

    public void setCs1q02c5ecd(String cs1q02c5ecd) {
        this.cs1q02c5ecd = cs1q02c5ecd;
        notifyPropertyChanged(BR.cs1q02c5ecd);
    }

    @Bindable
    public String getCs1q02c5cent() {
        return cs1q02c5cent;
    }

    public void setCs1q02c5cent(String cs1q02c5cent) {
        this.cs1q02c5cent = cs1q02c5cent;
        notifyPropertyChanged(BR.cs1q02c5cent);
    }

    @Bindable
    public String getCs1q8() {
        return cs1q8;
    }

    public void setCs1q8(String cs1q8) {
        this.cs1q8 = cs1q8;
        setCs1q8096x(cs1q8.equals("96") ? this.cs1q8096x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.cs1q8);
    }

    @Bindable
    public String getCs1q8096x() {
        return cs1q8096x;
    }

    public void setCs1q8096x(String cs1q8096x) {
        this.cs1q8096x = cs1q8096x;
        notifyPropertyChanged(BR.cs1q8096x);
    }

    @Bindable
    public String getCs1q9() {
        return cs1q9;
    }

    public void setCs1q9(String cs1q9) {
        this.cs1q9 = cs1q9;
        setCs1q9096x(cs1q9.equals("96") ? this.cs1q9096x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.cs1q9);
    }

    @Bindable
    public String getCs1q9096x() {
        return cs1q9096x;
    }

    public void setCs1q9096x(String cs1q9096x) {
        this.cs1q9096x = cs1q9096x;
        notifyPropertyChanged(BR.cs1q9096x);
    }

    @Bindable
    public String getCs1q10() {
        return cs1q10;
    }

    public void setCs1q10(String cs1q10) {
        this.cs1q10 = cs1q10;
        notifyPropertyChanged(BR.cs1q10);
    }

    @Bindable
    public String getCs1q11() {
        return cs1q11;
    }

    public void setCs1q11(String cs1q11) {
        this.cs1q11 = cs1q11;
        setCs1q11096x(cs1q11.equals("96") ? this.cs1q11096x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.cs1q11);
    }

    @Bindable
    public String getCs1q11096x() {
        return cs1q11096x;
    }

    public void setCs1q11096x(String cs1q11096x) {
        this.cs1q11096x = cs1q11096x;
        notifyPropertyChanged(BR.cs1q11096x);
    }

    @Bindable
    public String getCs2q01() {
        return cs2q01;
    }

    public void setCs2q01(String cs2q01) {
        this.cs2q01 = cs2q01;
        notifyPropertyChanged(BR.cs2q01);
    }

    @Bindable
    public String getCs2q02() {
        return cs2q02;
    }

    public void setCs2q02(String cs2q02) {
        this.cs2q02 = cs2q02;
        notifyPropertyChanged(BR.cs2q02);
    }

    @Bindable
    public String getCs2q05() {
        return cs2q05;
    }

    public void setCs2q05(String cs2q05) {
        this.cs2q05 = cs2q05;
        setCs2q0596x(cs2q05.equals("96") ? this.cs2q0596x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.cs2q05);
    }

    @Bindable
    public String getCs2q0596x() {
        return cs2q0596x;
    }

    public void setCs2q0596x(String cs2q0596x) {
        this.cs2q0596x = cs2q0596x;
        notifyPropertyChanged(BR.cs2q0596x);
    }

    @Bindable
    public String getCs2q06() {
        return cs2q06;
    }

    public void setCs2q06(String cs2q06) {
        this.cs2q06 = cs2q06;
        setCs2q0696x(cs2q06.equals("96") ? this.cs2q0696x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.cs2q06);
    }

    @Bindable
    public String getCs2q0696x() {
        return cs2q0696x;
    }

    public void setCs2q0696x(String cs2q0696x) {
        this.cs2q0696x = cs2q0696x;
        notifyPropertyChanged(BR.cs2q0696x);
    }

    @Bindable
    public String getCs2q07() {
        return cs2q07;
    }

    public void setCs2q07(String cs2q07) {
        this.cs2q07 = cs2q07;
        notifyPropertyChanged(BR.cs2q07);
    }

    @Bindable
    public String getCs2q0801() {
        return cs2q0801;
    }

    public void setCs2q0801(String cs2q0801) {
        this.cs2q0801 = cs2q0801;
        notifyPropertyChanged(BR.cs2q0801);
    }

    @Bindable
    public String getCs2q08021() {
        return cs2q08021;
    }

    public void setCs2q08021(String cs2q08021) {
        this.cs2q08021 = cs2q08021;
        notifyPropertyChanged(BR.cs2q08021);
    }

    @Bindable
    public String getCs2q08022() {
        return cs2q08022;
    }

    public void setCs2q08022(String cs2q08022) {
        this.cs2q08022 = cs2q08022;
        notifyPropertyChanged(BR.cs2q08022);
    }

    @Bindable
    public String getCs2q08023() {
        return cs2q08023;
    }

    public void setCs2q08023(String cs2q08023) {
        this.cs2q08023 = cs2q08023;
        notifyPropertyChanged(BR.cs2q08023);
    }

    @Bindable
    public String getCs2q08024() {
        return cs2q08024;
    }

    public void setCs2q08024(String cs2q08024) {
        this.cs2q08024 = cs2q08024;
        notifyPropertyChanged(BR.cs2q08024);
    }

    @Bindable
    public String getCs2q0803() {
        return cs2q0803;
    }

    public void setCs2q0803(String cs2q0803) {
        this.cs2q0803 = cs2q0803;
        notifyPropertyChanged(BR.cs2q0803);
    }

    @Bindable
    public String getCs2q0804() {
        return cs2q0804;
    }

    public void setCs2q0804(String cs2q0804) {
        this.cs2q0804 = cs2q0804;
        notifyPropertyChanged(BR.cs2q0804);
    }

    @Bindable
    public String getCs2q0805() {
        return cs2q0805;
    }

    public void setCs2q0805(String cs2q0805) {
        this.cs2q0805 = cs2q0805;
        notifyPropertyChanged(BR.cs2q0805);
    }

    @Bindable
    public String getCs2q0806() {
        return cs2q0806;
    }

    public void setCs2q0806(String cs2q0806) {
        this.cs2q0806 = cs2q0806;
        notifyPropertyChanged(BR.cs2q0806);
    }

    @Bindable
    public String getCs2q0807() {
        return cs2q0807;
    }

    public void setCs2q0807(String cs2q0807) {
        this.cs2q0807 = cs2q0807;
        notifyPropertyChanged(BR.cs2q0807);
    }

    @Bindable
    public String getCs2q08081() {
        return cs2q08081;
    }

    public void setCs2q08081(String cs2q08081) {
        this.cs2q08081 = cs2q08081;
        notifyPropertyChanged(BR.cs2q08081);
    }

    @Bindable
    public String getCs2q08082() {
        return cs2q08082;
    }

    public void setCs2q08082(String cs2q08082) {
        this.cs2q08082 = cs2q08082;
        notifyPropertyChanged(BR.cs2q08082);
    }

    @Bindable
    public String getCs2q08083() {
        return cs2q08083;
    }

    public void setCs2q08083(String cs2q08083) {
        this.cs2q08083 = cs2q08083;
        notifyPropertyChanged(BR.cs2q08083);
    }

    @Bindable
    public String getCs2q0809() {
        return cs2q0809;
    }

    public void setCs2q0809(String cs2q0809) {
        this.cs2q0809 = cs2q0809;
        notifyPropertyChanged(BR.cs2q0809);
    }

    @Bindable
    public String getCs2q0810() {
        return cs2q0810;
    }

    public void setCs2q0810(String cs2q0810) {
        this.cs2q0810 = cs2q0810;
        notifyPropertyChanged(BR.cs2q0810);
    }

    @Bindable
    public String getCs2q0811() {
        return cs2q0811;
    }

    public void setCs2q0811(String cs2q0811) {
        this.cs2q0811 = cs2q0811;
        notifyPropertyChanged(BR.cs2q0811);
    }

    @Bindable
    public String getCs2q0812() {
        return cs2q0812;
    }

    public void setCs2q0812(String cs2q0812) {
        this.cs2q0812 = cs2q0812;
        notifyPropertyChanged(BR.cs2q0812);
    }

    @Bindable
    public String getCs2q0813() {
        return cs2q0813;
    }

    public void setCs2q0813(String cs2q0813) {
        this.cs2q0813 = cs2q0813;
        notifyPropertyChanged(BR.cs2q0813);
    }

    @Bindable
    public String getCs2q0814() {
        return cs2q0814;
    }

    public void setCs2q0814(String cs2q0814) {
        this.cs2q0814 = cs2q0814;
        notifyPropertyChanged(BR.cs2q0814);
    }

    @Bindable
    public String getCs2q0815() {
        return cs2q0815;
    }

    public void setCs2q0815(String cs2q0815) {
        this.cs2q0815 = cs2q0815;
        notifyPropertyChanged(BR.cs2q0815);
    }

    @Bindable
    public String getCs2q0816() {
        return cs2q0816;
    }

    public void setCs2q0816(String cs2q0816) {
        this.cs2q0816 = cs2q0816;
        notifyPropertyChanged(BR.cs2q0816);
    }

    @Bindable
    public String getCs2q0817() {
        return cs2q0817;
    }

    public void setCs2q0817(String cs2q0817) {
        this.cs2q0817 = cs2q0817;
        notifyPropertyChanged(BR.cs2q0817);
    }

    @Bindable
    public String getCs2q0818() {
        return cs2q0818;
    }

    public void setCs2q0818(String cs2q0818) {
        this.cs2q0818 = cs2q0818;
        notifyPropertyChanged(BR.cs2q0818);
    }

    @Bindable
    public String getCs2q0819() {
        return cs2q0819;
    }

    public void setCs2q0819(String cs2q0819) {
        this.cs2q0819 = cs2q0819;
        notifyPropertyChanged(BR.cs2q0819);
    }

    @Bindable
    public String getCs2q0820() {
        return cs2q0820;
    }

    public void setCs2q0820(String cs2q0820) {
        this.cs2q0820 = cs2q0820;
        notifyPropertyChanged(BR.cs2q0820);
    }

    @Bindable
    public String getCs3aq01() {
        return cs3aq01;
    }

    public void setCs3aq01(String cs3aq01) {
        this.cs3aq01 = cs3aq01;
        notifyPropertyChanged(BR.cs3aq01);
    }

    @Bindable
    public String getCs3aq02() {
        return cs3aq02;
    }

    public void setCs3aq02(String cs3aq02) {
        this.cs3aq02 = cs3aq02;
        notifyPropertyChanged(BR.cs3aq02);
    }

    @Bindable
    public String getCs3aq03() {
        return cs3aq03;
    }

    public void setCs3aq03(String cs3aq03) {
        this.cs3aq03 = cs3aq03;
        notifyPropertyChanged(BR.cs3aq03);
    }

    @Bindable
    public String getCs3aq04() {
        return cs3aq04;
    }

    public void setCs3aq04(String cs3aq04) {
        this.cs3aq04 = cs3aq04;
        notifyPropertyChanged(BR.cs3aq04);
    }

    @Bindable
    public String getCs3bq01() {
        return cs3bq01;
    }

    public void setCs3bq01(String cs3bq01) {
        this.cs3bq01 = cs3bq01;
        setCs3bq0101x(cs3bq01.equals("1") ? this.cs3bq0101x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.cs3bq01);
    }

    @Bindable
    public String getCs3bq0101x() {
        return cs3bq0101x;
    }

    public void setCs3bq0101x(String cs3bq0101x) {
        this.cs3bq0101x = cs3bq0101x;
        notifyPropertyChanged(BR.cs3bq0101x);
    }

    @Bindable
    public String getCs3bq02a() {
        return cs3bq02a;
    }

    public void setCs3bq02a(String cs3bq02a) {
        this.cs3bq02a = cs3bq02a;
        notifyPropertyChanged(BR.cs3bq02a);
    }

    @Bindable
    public String getCs3bq02b() {
        return cs3bq02b;
    }

    public void setCs3bq02b(String cs3bq02b) {
        this.cs3bq02b = cs3bq02b;
        notifyPropertyChanged(BR.cs3bq02b);
    }

    @Bindable
    public String getCs3bq02c() {
        return cs3bq02c;
    }

    public void setCs3bq02c(String cs3bq02c) {
        this.cs3bq02c = cs3bq02c;
        notifyPropertyChanged(BR.cs3bq02c);
    }

    @Bindable
    public String getCs3bq03() {
        return cs3bq03;
    }

    public void setCs3bq03(String cs3bq03) {
        this.cs3bq03 = cs3bq03;
        setCs3bq0301x(cs3bq03.equals("1") ? this.cs3bq0301x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.cs3bq03);
    }

    @Bindable
    public String getCs3bq0301x() {
        return cs3bq0301x;
    }

    public void setCs3bq0301x(String cs3bq0301x) {
        this.cs3bq0301x = cs3bq0301x;
        notifyPropertyChanged(BR.cs3bq0301x);
    }

    @Bindable
    public String getCs3bq03a() {
        return cs3bq03a;
    }

    public void setCs3bq03a(String cs3bq03a) {
        this.cs3bq03a = cs3bq03a;
        setCs3bq03adx(cs3bq03a.equals("1") ? this.cs3bq03adx : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.cs3bq03a);
    }

    @Bindable
    public String getCs3bq03adx() {
        return cs3bq03adx;
    }

    public void setCs3bq03adx(String cs3bq03adx) {
        this.cs3bq03adx = cs3bq03adx;
        notifyPropertyChanged(BR.cs3bq03adx);
    }

    @Bindable
    public String getCs3bq03b() {
        return cs3bq03b;
    }

    public void setCs3bq03b(String cs3bq03b) {
        this.cs3bq03b = cs3bq03b;
        setCs3bq03bdx(cs3bq03b.equals("1") ? this.cs3bq03bdx : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.cs3bq03b);
    }

    @Bindable
    public String getCs3bq03bdx() {
        return cs3bq03bdx;
    }

    public void setCs3bq03bdx(String cs3bq03bdx) {
        this.cs3bq03bdx = cs3bq03bdx;
        notifyPropertyChanged(BR.cs3bq03bdx);
    }

    @Bindable
    public String getCs3bq04() {
        return cs3bq04;
    }

    public void setCs3bq04(String cs3bq04) {
        this.cs3bq04 = cs3bq04;
        notifyPropertyChanged(BR.cs3bq04);
    }

    @Bindable
    public String getCs3bq05() {
        return cs3bq05;
    }

    public void setCs3bq05(String cs3bq05) {
        this.cs3bq05 = cs3bq05;
        notifyPropertyChanged(BR.cs3bq05);
    }

    @Bindable
    public String getCs3bq05a() {
        return cs3bq05a;
    }

    public void setCs3bq05a(String cs3bq05a) {
        this.cs3bq05a = cs3bq05a;
        notifyPropertyChanged(BR.cs3bq05a);
    }

    @Bindable
    public String getCs3bq05aa() {
        return cs3bq05aa;
    }

    public void setCs3bq05aa(String cs3bq05aa) {
        if (this.cs3bq05aa.equals(cs3bq05aa)) return; // for all checkboxes
        this.cs3bq05aa = cs3bq05aa;
        notifyPropertyChanged(BR.cs3bq05aa);
    }

    @Bindable
    public String getCs3bq05ab() {
        return cs3bq05ab;
    }

    public void setCs3bq05ab(String cs3bq05ab) {
        if (this.cs3bq05ab.equals(cs3bq05ab)) return; // for all checkboxes
        this.cs3bq05ab = cs3bq05ab;
        notifyPropertyChanged(BR.cs3bq05ab);
    }

    @Bindable
    public String getCs3bq05ax() {
        return cs3bq05ax;
    }

    public void setCs3bq05ax(String cs3bq05ax) {
        if (this.cs3bq05ax.equals(cs3bq05ax)) return; // for all checkboxes
        this.cs3bq05ax = cs3bq05ax;
        notifyPropertyChanged(BR.cs3bq05ax);
    }

    @Bindable
    public String getCs3bq05a97() {
        return cs3bq05a97;
    }

    public void setCs3bq05a97(String cs3bq05a97) {
        if (this.cs3bq05a97.equals(cs3bq05a97)) return; // for all checkboxes
        this.cs3bq05a97 = cs3bq05a97;
        setCs3bq05aa(cs3bq05a97.equals("97") ? "" : this.cs3bq05aa);
        setCs3bq05ab(cs3bq05a97.equals("97") ? "" : this.cs3bq05ab);
        setCs3bq05ax(cs3bq05a97.equals("97") ? "" : this.cs3bq05ax);
        notifyPropertyChanged(BR.cs3bq05a97);
    }

    @Bindable
    public String getCs3bq05b() {
        return cs3bq05b;
    }

    public void setCs3bq05b(String cs3bq05b) {
        this.cs3bq05b = cs3bq05b;
        notifyPropertyChanged(BR.cs3bq05b);
    }

    @Bindable
    public String getCs3bq05ba() {
        return cs3bq05ba;
    }

    public void setCs3bq05ba(String cs3bq05ba) {
        if (this.cs3bq05ba.equals(cs3bq05ba)) return; // for all checkboxes
        this.cs3bq05ba = cs3bq05ba;
        notifyPropertyChanged(BR.cs3bq05ba);
    }

    @Bindable
    public String getCs3bq05bb() {
        return cs3bq05bb;
    }

    public void setCs3bq05bb(String cs3bq05bb) {
        if (this.cs3bq05bb.equals(cs3bq05bb)) return; // for all checkboxes
        this.cs3bq05bb = cs3bq05bb;
        notifyPropertyChanged(BR.cs3bq05bb);
    }

    @Bindable
    public String getCs3bq05bx() {
        return cs3bq05bx;
    }

    public void setCs3bq05bx(String cs3bq05bx) {
        if (this.cs3bq05bx.equals(cs3bq05bx)) return; // for all checkboxes
        this.cs3bq05bx = cs3bq05bx;
        notifyPropertyChanged(BR.cs3bq05bx);
    }

    @Bindable
    public String getCs3bq05b97() {
        return cs3bq05b97;
    }

    public void setCs3bq05b97(String cs3bq05b97) {
        if (this.cs3bq05b97.equals(cs3bq05b97)) return; // for all checkboxes
        this.cs3bq05b97 = cs3bq05b97;
        setCs3bq05ba(cs3bq05b97.equals("97") ? "" : this.cs3bq05ba);
        setCs3bq05bb(cs3bq05b97.equals("97") ? "" : this.cs3bq05bb);
        setCs3bq05bx(cs3bq05b97.equals("97") ? "" : this.cs3bq05bx);
        notifyPropertyChanged(BR.cs3bq05b97);
    }

    @Bindable
    public String getCs3bq05c() {
        return cs3bq05c;
    }

    public void setCs3bq05c(String cs3bq05c) {
        this.cs3bq05c = cs3bq05c;
        notifyPropertyChanged(BR.cs3bq05c);
    }

    @Bindable
    public String getCs3bq05ca() {
        return cs3bq05ca;
    }

    public void setCs3bq05ca(String cs3bq05ca) {
        if (this.cs3bq05ca.equals(cs3bq05ca)) return; // for all checkboxes
        this.cs3bq05ca = cs3bq05ca;
        notifyPropertyChanged(BR.cs3bq05ca);
    }

    @Bindable
    public String getCs3bq05cb() {
        return cs3bq05cb;
    }

    public void setCs3bq05cb(String cs3bq05cb) {
        if (this.cs3bq05cb.equals(cs3bq05cb)) return; // for all checkboxes
        this.cs3bq05cb = cs3bq05cb;
        notifyPropertyChanged(BR.cs3bq05cb);
    }

    @Bindable
    public String getCs3bq05cx() {
        return cs3bq05cx;
    }

    public void setCs3bq05cx(String cs3bq05cx) {
        if (this.cs3bq05cx.equals(cs3bq05cx)) return; // for all checkboxes
        this.cs3bq05cx = cs3bq05cx;
        notifyPropertyChanged(BR.cs3bq05cx);
    }

    @Bindable
    public String getCs3bq05c97() {
        return cs3bq05c97;
    }

    public void setCs3bq05c97(String cs3bq05c97) {
        if (this.cs3bq05c97.equals(cs3bq05c97)) return; // for all checkboxes
        this.cs3bq05c97 = cs3bq05c97;
        setCs3bq05ca(cs3bq05c97.equals("97") ? "" : this.cs3bq05ca);
        setCs3bq05cb(cs3bq05c97.equals("97") ? "" : this.cs3bq05cb);
        setCs3bq05cx(cs3bq05c97.equals("97") ? "" : this.cs3bq05cx);
        notifyPropertyChanged(BR.cs3bq05c97);
    }

    @Bindable
    public String getCs3bq05d() {
        return cs3bq05d;
    }

    public void setCs3bq05d(String cs3bq05d) {
        this.cs3bq05d = cs3bq05d;
        notifyPropertyChanged(BR.cs3bq05d);
    }

    @Bindable
    public String getCs3bq05da() {
        return cs3bq05da;
    }

    public void setCs3bq05da(String cs3bq05da) {
        if (this.cs3bq05da.equals(cs3bq05da)) return; // for all checkboxes
        this.cs3bq05da = cs3bq05da;
        notifyPropertyChanged(BR.cs3bq05da);
    }

    @Bindable
    public String getCs3bq05db() {
        return cs3bq05db;
    }

    public void setCs3bq05db(String cs3bq05db) {
        if (this.cs3bq05db.equals(cs3bq05db)) return; // for all checkboxes
        this.cs3bq05db = cs3bq05db;
        notifyPropertyChanged(BR.cs3bq05db);
    }

    @Bindable
    public String getCs3bq05dx() {
        return cs3bq05dx;
    }

    public void setCs3bq05dx(String cs3bq05dx) {
        if (this.cs3bq05dx.equals(cs3bq05dx)) return; // for all checkboxes
        this.cs3bq05dx = cs3bq05dx;
        notifyPropertyChanged(BR.cs3bq05dx);
    }

    @Bindable
    public String getCs3bq05d97() {
        return cs3bq05d97;
    }

    public void setCs3bq05d97(String cs3bq05d97) {
        if (this.cs3bq05d97.equals(cs3bq05d97)) return; // for all checkboxes
        this.cs3bq05d97 = cs3bq05d97;
        setCs3bq05da(cs3bq05d97.equals("97") ? "" : this.cs3bq05da);
        setCs3bq05db(cs3bq05d97.equals("97") ? "" : this.cs3bq05db);
        setCs3bq05dx(cs3bq05d97.equals("97") ? "" : this.cs3bq05dx);
        notifyPropertyChanged(BR.cs3bq05d97);
    }

    @Bindable
    public String getCs3bq05e() {
        return cs3bq05e;
    }

    public void setCs3bq05e(String cs3bq05e) {
        this.cs3bq05e = cs3bq05e;
        notifyPropertyChanged(BR.cs3bq05e);
    }

    @Bindable
    public String getCs3bq05ea() {
        return cs3bq05ea;
    }

    public void setCs3bq05ea(String cs3bq05ea) {
        if (this.cs3bq05ea.equals(cs3bq05ea)) return; // for all checkboxes
        this.cs3bq05ea = cs3bq05ea;
        notifyPropertyChanged(BR.cs3bq05ea);
    }

    @Bindable
    public String getCs3bq05eb() {
        return cs3bq05eb;
    }

    public void setCs3bq05eb(String cs3bq05eb) {
        if (this.cs3bq05eb.equals(cs3bq05eb)) return; // for all checkboxes
        this.cs3bq05eb = cs3bq05eb;
        notifyPropertyChanged(BR.cs3bq05eb);
    }

    @Bindable
    public String getCs3bq05ex() {
        return cs3bq05ex;
    }

    public void setCs3bq05ex(String cs3bq05ex) {
        if (this.cs3bq05ex.equals(cs3bq05ex)) return; // for all checkboxes
        this.cs3bq05ex = cs3bq05ex;
        notifyPropertyChanged(BR.cs3bq05ex);
    }

    @Bindable
    public String getCs3bq05e97() {
        return cs3bq05e97;
    }

    public void setCs3bq05e97(String cs3bq05e97) {
        if (this.cs3bq05e97.equals(cs3bq05e97)) return; // for all checkboxes
        this.cs3bq05e97 = cs3bq05e97;
        setCs3bq05ea(cs3bq05e97.equals("97") ? "" : this.cs3bq05ea);
        setCs3bq05eb(cs3bq05e97.equals("97") ? "" : this.cs3bq05eb);
        setCs3bq05ex(cs3bq05e97.equals("97") ? "" : this.cs3bq05ex);
        notifyPropertyChanged(BR.cs3bq05e97);
    }

    @Bindable
    public String getCs3bq05f() {
        return cs3bq05f;
    }

    public void setCs3bq05f(String cs3bq05f) {
        this.cs3bq05f = cs3bq05f;
        notifyPropertyChanged(BR.cs3bq05f);
    }

    @Bindable
    public String getCs3bq05fa() {
        return cs3bq05fa;
    }

    public void setCs3bq05fa(String cs3bq05fa) {
        if (this.cs3bq05fa.equals(cs3bq05fa)) return; // for all checkboxes
        this.cs3bq05fa = cs3bq05fa;
        notifyPropertyChanged(BR.cs3bq05fa);
    }

    @Bindable
    public String getCs3bq05fb() {
        return cs3bq05fb;
    }

    public void setCs3bq05fb(String cs3bq05fb) {
        if (this.cs3bq05fb.equals(cs3bq05fb)) return; // for all checkboxes
        this.cs3bq05fb = cs3bq05fb;
        notifyPropertyChanged(BR.cs3bq05fb);
    }

    @Bindable
    public String getCs3bq05fx() {
        return cs3bq05fx;
    }

    public void setCs3bq05fx(String cs3bq05fx) {
        if (this.cs3bq05fx.equals(cs3bq05fx)) return; // for all checkboxes
        this.cs3bq05fx = cs3bq05fx;
        notifyPropertyChanged(BR.cs3bq05fx);
    }

    @Bindable
    public String getCs3bq05f97() {
        return cs3bq05f97;
    }

    public void setCs3bq05f97(String cs3bq05f97) {
        if (this.cs3bq05f97.equals(cs3bq05f97)) return; // for all checkboxes
        this.cs3bq05f97 = cs3bq05f97;
        setCs3bq05fa(cs3bq05f97.equals("97") ? "" : this.cs3bq05fa);
        setCs3bq05fb(cs3bq05f97.equals("97") ? "" : this.cs3bq05fb);
        setCs3bq05fx(cs3bq05f97.equals("97") ? "" : this.cs3bq05fx);
        notifyPropertyChanged(BR.cs3bq05f97);
    }

    @Bindable
    public String getCs3bq06() {
        return cs3bq06;
    }

    public void setCs3bq06(String cs3bq06) {
        this.cs3bq06 = cs3bq06;
        notifyPropertyChanged(BR.cs3bq06);
    }

    @Bindable
    public String getCs3bq07() {
        return cs3bq07;
    }

    public void setCs3bq07(String cs3bq07) {
        this.cs3bq07 = cs3bq07;
        notifyPropertyChanged(BR.cs3bq07);
    }

    @Bindable
    public String getCs3bq08() {
        return cs3bq08;
    }

    public void setCs3bq08(String cs3bq08) {
        this.cs3bq08 = cs3bq08;
        notifyPropertyChanged(BR.cs3bq08);
    }

    @Bindable
    public String getCs3bq09() {
        return cs3bq09;
    }

    public void setCs3bq09(String cs3bq09) {
        this.cs3bq09 = cs3bq09;
        notifyPropertyChanged(BR.cs3bq09);
    }

    @Bindable
    public String getCs3bq10() {
        return cs3bq10;
    }

    public void setCs3bq10(String cs3bq10) {
        this.cs3bq10 = cs3bq10;
        notifyPropertyChanged(BR.cs3bq10);
    }

    @Bindable
    public String getCs3bq11() {
        return cs3bq11;
    }

    public void setCs3bq11(String cs3bq11) {
        this.cs3bq11 = cs3bq11;
        notifyPropertyChanged(BR.cs3bq11);
    }

    @Bindable
    public String getCs3bq12() {
        return cs3bq12;
    }

    public void setCs3bq12(String cs3bq12) {
        this.cs3bq12 = cs3bq12;
        notifyPropertyChanged(BR.cs3bq12);
    }

    @Bindable
    public String getCs3bq13() {
        return cs3bq13;
    }

    public void setCs3bq13(String cs3bq13) {
        this.cs3bq13 = cs3bq13;
        notifyPropertyChanged(BR.cs3bq13);
    }

    @Bindable
    public String getCs3bq14() {
        return cs3bq14;
    }

    public void setCs3bq14(String cs3bq14) {
        this.cs3bq14 = cs3bq14;
        notifyPropertyChanged(BR.cs3bq14);
    }

    @Bindable
    public String getCs3bq15() {
        return cs3bq15;
    }

    public void setCs3bq15(String cs3bq15) {
        this.cs3bq15 = cs3bq15;
        notifyPropertyChanged(BR.cs3bq15);
    }

    @Bindable
    public String getCs3bq16() {
        return cs3bq16;
    }

    public void setCs3bq16(String cs3bq16) {
        this.cs3bq16 = cs3bq16;
        notifyPropertyChanged(BR.cs3bq16);
    }

    @Bindable
    public String getCs4q01() {
        return cs4q01;
    }

    public void setCs4q01(String cs4q01) {
        this.cs4q01 = cs4q01;
        notifyPropertyChanged(BR.cs4q01);
    }

    @Bindable
    public String getCs4q02a() {
        return cs4q02a;
    }

    public void setCs4q02a(String cs4q02a) {
        this.cs4q02a = cs4q02a;
        notifyPropertyChanged(BR.cs4q02a);
    }

    @Bindable
    public String getCs4q02b() {
        return cs4q02b;
    }

    public void setCs4q02b(String cs4q02b) {
        this.cs4q02b = cs4q02b;
        notifyPropertyChanged(BR.cs4q02b);
    }

    @Bindable
    public String getCs4q02c() {
        return cs4q02c;
    }

    public void setCs4q02c(String cs4q02c) {
        this.cs4q02c = cs4q02c;
        notifyPropertyChanged(BR.cs4q02c);
    }

    @Bindable
    public String getCs4q02d() {
        return cs4q02d;
    }

    public void setCs4q02d(String cs4q02d) {
        this.cs4q02d = cs4q02d;
        notifyPropertyChanged(BR.cs4q02d);
    }

    @Bindable
    public String getCs4q02e() {
        return cs4q02e;
    }

    public void setCs4q02e(String cs4q02e) {
        this.cs4q02e = cs4q02e;
        notifyPropertyChanged(BR.cs4q02e);
    }

    @Bindable
    public String getCs4q02f() {
        return cs4q02f;
    }

    public void setCs4q02f(String cs4q02f) {
        this.cs4q02f = cs4q02f;
        notifyPropertyChanged(BR.cs4q02f);
    }

    @Bindable
    public String getCs4q02g() {
        return cs4q02g;
    }

    public void setCs4q02g(String cs4q02g) {
        this.cs4q02g = cs4q02g;
        notifyPropertyChanged(BR.cs4q02g);
    }

    @Bindable
    public String getCs4q02h() {
        return cs4q02h;
    }

    public void setCs4q02h(String cs4q02h) {
        this.cs4q02h = cs4q02h;
        notifyPropertyChanged(BR.cs4q02h);
    }

    @Bindable
    public String getCs4q02i() {
        return cs4q02i;
    }

    public void setCs4q02i(String cs4q02i) {
        this.cs4q02i = cs4q02i;
        notifyPropertyChanged(BR.cs4q02i);
    }

    @Bindable
    public String getCs4q02j() {
        return cs4q02j;
    }

    public void setCs4q02j(String cs4q02j) {
        this.cs4q02j = cs4q02j;
        notifyPropertyChanged(BR.cs4q02j);
    }

    @Bindable
    public String getCs4q02k() {
        return cs4q02k;
    }

    public void setCs4q02k(String cs4q02k) {
        this.cs4q02k = cs4q02k;
        notifyPropertyChanged(BR.cs4q02k);
    }

    @Bindable
    public String getCs4q03() {
        return cs4q03;
    }

    public void setCs4q03(String cs4q03) {
        this.cs4q03 = cs4q03;
        notifyPropertyChanged(BR.cs4q03);
    }

    @Bindable
    public String getCs5q01() {
        return cs5q01;
    }

    public void setCs5q01(String cs5q01) {
        this.cs5q01 = cs5q01;
        notifyPropertyChanged(BR.cs5q01);
    }

    @Bindable
    public String getCs5q02() {
        return cs5q02;
    }

    public void setCs5q02(String cs5q02) {
        this.cs5q02 = cs5q02;
        notifyPropertyChanged(BR.cs5q02);
    }

    @Bindable
    public String getCs5q03() {
        return cs5q03;
    }

    public void setCs5q03(String cs5q03) {
        this.cs5q03 = cs5q03;
        notifyPropertyChanged(BR.cs5q03);
    }

    @Bindable
    public String getCs5q04() {
        return cs5q04;
    }

    public void setCs5q04(String cs5q04) {
        this.cs5q04 = cs5q04;
        notifyPropertyChanged(BR.cs5q04);
    }

    @Bindable
    public String getCs5q05() {
        return cs5q05;
    }

    public void setCs5q05(String cs5q05) {
        this.cs5q05 = cs5q05;
        notifyPropertyChanged(BR.cs5q05);
    }

    @Bindable
    public String getCs5q06a() {
        return cs5q06a;
    }

    public void setCs5q06a(String cs5q06a) {
        this.cs5q06a = cs5q06a;
        notifyPropertyChanged(BR.cs5q06a);
    }

    @Bindable
    public String getCs5q06b() {
        return cs5q06b;
    }

    public void setCs5q06b(String cs5q06b) {
        this.cs5q06b = cs5q06b;
        notifyPropertyChanged(BR.cs5q06b);
    }

    @Bindable
    public String getCs5q07() {
        return cs5q07;
    }

    public void setCs5q07(String cs5q07) {
        this.cs5q07 = cs5q07;
        notifyPropertyChanged(BR.cs5q07);
    }

    @Bindable
    public String getCs5q08a() {
        return cs5q08a;
    }

    public void setCs5q08a(String cs5q08a) {
        this.cs5q08a = cs5q08a;
        notifyPropertyChanged(BR.cs5q08a);
    }

    @Bindable
    public String getCs5q08b() {
        return cs5q08b;
    }

    public void setCs5q08b(String cs5q08b) {
        this.cs5q08b = cs5q08b;
        notifyPropertyChanged(BR.cs5q08b);
    }

    @Bindable
    public String getCs5q09() {
        return cs5q09;
    }

    public void setCs5q09(String cs5q09) {
        this.cs5q09 = cs5q09;
        notifyPropertyChanged(BR.cs5q09);
    }

    @Bindable
    public String getCs5q10() {
        return cs5q10;
    }

    public void setCs5q10(String cs5q10) {
        this.cs5q10 = cs5q10;
        notifyPropertyChanged(BR.cs5q10);
    }

    @Bindable
    public String getCs5q11() {
        return cs5q11;
    }

    public void setCs5q11(String cs5q11) {
        this.cs5q11 = cs5q11;
        notifyPropertyChanged(BR.cs5q11);
    }

    @Bindable
    public String getCs5q12() {
        return cs5q12;
    }

    public void setCs5q12(String cs5q12) {
        this.cs5q12 = cs5q12;
        notifyPropertyChanged(BR.cs5q12);
    }

    @Bindable
    public String getCs5q13() {
        return cs5q13;
    }

    public void setCs5q13(String cs5q13) {
        this.cs5q13 = cs5q13;
        notifyPropertyChanged(BR.cs5q13);
    }

    @Bindable
    public String getCs5q14() {
        return cs5q14;
    }

    public void setCs5q14(String cs5q14) {
        this.cs5q14 = cs5q14;
        notifyPropertyChanged(BR.cs5q14);
    }

    @Bindable
    public String getCs5q15() {
        return cs5q15;
    }

    public void setCs5q15(String cs5q15) {
        this.cs5q15 = cs5q15;
        notifyPropertyChanged(BR.cs5q15);
    }

    @Bindable
    public String getCs5q16() {
        return cs5q16;
    }

    public void setCs5q16(String cs5q16) {
        this.cs5q16 = cs5q16;
        notifyPropertyChanged(BR.cs5q16);
    }

    @Bindable
    public String getCs5q17() {
        return cs5q17;
    }

    public void setCs5q17(String cs5q17) {
        this.cs5q17 = cs5q17;
        notifyPropertyChanged(BR.cs5q17);
    }

    @Bindable
    public String getCs5q18() {
        return cs5q18;
    }

    public void setCs5q18(String cs5q18) {
        this.cs5q18 = cs5q18;
        notifyPropertyChanged(BR.cs5q18);
    }

    @Bindable
    public String getDs1q01() {
        return ds1q01;
    }

    public void setDs1q01(String ds1q01) {
        this.ds1q01 = ds1q01;
        notifyPropertyChanged(BR.ds1q01);
    }

    @Bindable
    public String getDs1q02() {
        return ds1q02;
    }

    public void setDs1q02(String ds1q02) {
        this.ds1q02 = ds1q02;
        notifyPropertyChanged(BR.ds1q02);
    }

    @Bindable
    public String getDs1q03a() {
        return ds1q03a;
    }

    public void setDs1q03a(String ds1q03a) {
        this.ds1q03a = ds1q03a;
        notifyPropertyChanged(BR.ds1q03a);
    }

    @Bindable
    public String getDs1q03b() {
        return ds1q03b;
    }

    public void setDs1q03b(String ds1q03b) {
        this.ds1q03b = ds1q03b;
        notifyPropertyChanged(BR.ds1q03b);
    }

    @Bindable
    public String getDs1q03c() {
        return ds1q03c;
    }

    public void setDs1q03c(String ds1q03c) {
        this.ds1q03c = ds1q03c;
        notifyPropertyChanged(BR.ds1q03c);
    }

    @Bindable
    public String getDs1q03d() {
        return ds1q03d;
    }

    public void setDs1q03d(String ds1q03d) {
        this.ds1q03d = ds1q03d;
        notifyPropertyChanged(BR.ds1q03d);
    }

    @Bindable
    public String getDs1q03e() {
        return ds1q03e;
    }

    public void setDs1q03e(String ds1q03e) {
        this.ds1q03e = ds1q03e;
        notifyPropertyChanged(BR.ds1q03e);
    }

    @Bindable
    public String getDs1q03f() {
        return ds1q03f;
    }

    public void setDs1q03f(String ds1q03f) {
        this.ds1q03f = ds1q03f;
        notifyPropertyChanged(BR.ds1q03f);
    }

    @Bindable
    public String getDs1q04() {
        return ds1q04;
    }

    public void setDs1q04(String ds1q04) {
        this.ds1q04 = ds1q04;
        notifyPropertyChanged(BR.ds1q04);
    }

    @Bindable
    public String getDs2q01a() {
        return ds2q01a;
    }

    public void setDs2q01a(String ds2q01a) {
        this.ds2q01a = ds2q01a;
        notifyPropertyChanged(BR.ds2q01a);
    }

    @Bindable
    public String getDs2q01b() {
        return ds2q01b;
    }

    public void setDs2q01b(String ds2q01b) {
        this.ds2q01b = ds2q01b;
        notifyPropertyChanged(BR.ds2q01b);
    }

    @Bindable
    public String getDs2q01c() {
        return ds2q01c;
    }

    public void setDs2q01c(String ds2q01c) {
        this.ds2q01c = ds2q01c;
        notifyPropertyChanged(BR.ds2q01c);
    }

    @Bindable
    public String getDs3q01() {
        return ds3q01;
    }

    public void setDs3q01(String ds3q01) {
        this.ds3q01 = ds3q01;
        notifyPropertyChanged(BR.ds3q01);
    }

    @Bindable
    public String getDs3q02() {
        return ds3q02;
    }

    public void setDs3q02(String ds3q02) {
        this.ds3q02 = ds3q02;
        notifyPropertyChanged(BR.ds3q02);
    }

    @Bindable
    public String getDs3q03a() {
        return ds3q03a;
    }

    public void setDs3q03a(String ds3q03a) {
        this.ds3q03a = ds3q03a;
        notifyPropertyChanged(BR.ds3q03a);
    }

    @Bindable
    public String getDs3q03b() {
        return ds3q03b;
    }

    public void setDs3q03b(String ds3q03b) {
        this.ds3q03b = ds3q03b;
        notifyPropertyChanged(BR.ds3q03b);
    }

    @Bindable
    public String getDs3q03c() {
        return ds3q03c;
    }

    public void setDs3q03c(String ds3q03c) {
        this.ds3q03c = ds3q03c;
        notifyPropertyChanged(BR.ds3q03c);
    }

    @Bindable
    public String getDs3q03d() {
        return ds3q03d;
    }

    public void setDs3q03d(String ds3q03d) {
        this.ds3q03d = ds3q03d;
        notifyPropertyChanged(BR.ds3q03d);
    }

    @Bindable
    public String getDs3q03e() {
        return ds3q03e;
    }

    public void setDs3q03e(String ds3q03e) {
        this.ds3q03e = ds3q03e;
        notifyPropertyChanged(BR.ds3q03e);
    }

    @Bindable
    public String getDs3q03f() {
        return ds3q03f;
    }

    public void setDs3q03f(String ds3q03f) {
        this.ds3q03f = ds3q03f;
        notifyPropertyChanged(BR.ds3q03f);
    }

    @Bindable
    public String getDs3q03g() {
        return ds3q03g;
    }

    public void setDs3q03g(String ds3q03g) {
        this.ds3q03g = ds3q03g;
        notifyPropertyChanged(BR.ds3q03g);
    }

    @Bindable
    public String getEs1resp() {
        return es1resp;
    }

    public void setEs1resp(String es1resp) {
        this.es1resp = es1resp;
        notifyPropertyChanged(BR.es1resp);
    }

    @Bindable
    public String getEs1respline() {
        return es1respline;
    }

    public void setEs1respline(String es1respline) {
        this.es1respline = es1respline;
        notifyPropertyChanged(BR.es1respline);
    }

    @Bindable
    public String getEs1cons() {
        return es1cons;
    }

    public void setEs1cons(String es1cons) {
        this.es1cons = es1cons;
        notifyPropertyChanged(BR.es1cons);
    }

    @Bindable
    public String getEs1q1() {
        return es1q1;
    }

    public void setEs1q1(String es1q1) {
        this.es1q1 = es1q1;
        setEs1q196x(es1q1.equals("96") ? this.es1q196x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.es1q1);
    }

    @Bindable
    public String getEs1q196x() {
        return es1q196x;
    }

    public void setEs1q196x(String es1q196x) {
        this.es1q196x = es1q196x;
        notifyPropertyChanged(BR.es1q196x);
    }

    @Bindable
    public String getEs1q2() {
        return es1q2;
    }

    public void setEs1q2(String es1q2) {
        this.es1q2 = es1q2;
        notifyPropertyChanged(BR.es1q2);
    }

    @Bindable
    public String getEs1q3() {
        return es1q3;
    }

    public void setEs1q3(String es1q3) {
        this.es1q3 = es1q3;
        notifyPropertyChanged(BR.es1q3);
    }

    @Bindable
    public String getEs1q4() {
        return es1q4;
    }

    public void setEs1q4(String es1q4) {
        this.es1q4 = es1q4;
        notifyPropertyChanged(BR.es1q4);
    }

    @Bindable
    public String getEs1q405() {
        return es1q405;
    }

    public void setEs1q405(String es1q405) {
        if (this.es1q405.equals(es1q405)) return; // for all checkboxes
        this.es1q405 = es1q405;
        notifyPropertyChanged(BR.es1q405);
    }

    @Bindable
    public String getEs1q406() {
        return es1q406;
    }

    public void setEs1q406(String es1q406) {
        if (this.es1q406.equals(es1q406)) return; // for all checkboxes
        this.es1q406 = es1q406;
        notifyPropertyChanged(BR.es1q406);
    }

    @Bindable
    public String getEs1q407() {
        return es1q407;
    }

    public void setEs1q407(String es1q407) {
        if (this.es1q407.equals(es1q407)) return; // for all checkboxes
        this.es1q407 = es1q407;
        notifyPropertyChanged(BR.es1q407);
    }

    @Bindable
    public String getEs1q408() {
        return es1q408;
    }

    public void setEs1q408(String es1q408) {
        if (this.es1q408.equals(es1q408)) return; // for all checkboxes
        this.es1q408 = es1q408;
        notifyPropertyChanged(BR.es1q408);
    }

    @Bindable
    public String getEs1q409() {
        return es1q409;
    }

    public void setEs1q409(String es1q409) {
        if (this.es1q409.equals(es1q409)) return; // for all checkboxes
        this.es1q409 = es1q409;
        notifyPropertyChanged(BR.es1q409);
    }

    @Bindable
    public String getEs1q496() {
        return es1q496;
    }

    public void setEs1q496(String es1q496) {
        if (this.es1q496.equals(es1q496)) return; // for all checkboxes
        this.es1q496 = es1q496;
        setEs1q496x(es1q496.equals("96") ? this.es1q496x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.es1q496);
    }

    @Bindable
    public String getEs1q496x() {
        return es1q496x;
    }

    public void setEs1q496x(String es1q496x) {
        this.es1q496x = es1q496x;
        notifyPropertyChanged(BR.es1q496x);
    }

    @Bindable
    public String getEs1q5() {
        return es1q5;
    }

    public void setEs1q5(String es1q5) {
        this.es1q5 = es1q5;
        notifyPropertyChanged(BR.es1q5);
    }

    @Bindable
    public String getEs1q6() {
        return es1q6;
    }

    public void setEs1q6(String es1q6) {
        this.es1q6 = es1q6;
        notifyPropertyChanged(BR.es1q6);
    }

    @Bindable
    public String getEs1q7() {
        return es1q7;
    }

    public void setEs1q7(String es1q7) {
        this.es1q7 = es1q7;
        notifyPropertyChanged(BR.es1q7);
    }

    @Bindable
    public String getEs1q8a() {
        return es1q8a;
    }

    public void setEs1q8a(String es1q8a) {
        this.es1q8a = es1q8a;
        notifyPropertyChanged(BR.es1q8a);
    }

    @Bindable
    public String getEs1q8b() {
        return es1q8b;
    }

    public void setEs1q8b(String es1q8b) {
        this.es1q8b = es1q8b;
        notifyPropertyChanged(BR.es1q8b);
    }

    @Bindable
    public String getEs1q8c() {
        return es1q8c;
    }

    public void setEs1q8c(String es1q8c) {
        this.es1q8c = es1q8c;
        notifyPropertyChanged(BR.es1q8c);
    }

    @Bindable
    public String getEs1q9() {
        return es1q9;
    }

    public void setEs1q9(String es1q9) {
        this.es1q9 = es1q9;
        notifyPropertyChanged(BR.es1q9);
    }

    @Bindable
    public String getEs1q10() {
        return es1q10;
    }

    public void setEs1q10(String es1q10) {
        this.es1q10 = es1q10;
        notifyPropertyChanged(BR.es1q10);
    }

    @Bindable
    public String getEs1q11() {
        return es1q11;
    }

    public void setEs1q11(String es1q11) {
        this.es1q11 = es1q11;
        notifyPropertyChanged(BR.es1q11);
    }

    @Bindable
    public String getEs2q1() {
        return es2q1;
    }

    public void setEs2q1(String es2q1) {
        this.es2q1 = es2q1;
        notifyPropertyChanged(BR.es2q1);
    }

    @Bindable
    public String getEs2q2() {
        return es2q2;
    }

    public void setEs2q2(String es2q2) {
        this.es2q2 = es2q2;
        notifyPropertyChanged(BR.es2q2);
    }

    @Bindable
    public String getEs2q3() {
        return es2q3;
    }

    public void setEs2q3(String es2q3) {
        this.es2q3 = es2q3;
        notifyPropertyChanged(BR.es2q3);
    }

    @Bindable
    public String getEs2q4() {
        return es2q4;
    }

    public void setEs2q4(String es2q4) {
        this.es2q4 = es2q4;
        notifyPropertyChanged(BR.es2q4);
    }

    @Bindable
    public String getEs2q5() {
        return es2q5;
    }

    public void setEs2q5(String es2q5) {
        this.es2q5 = es2q5;
        notifyPropertyChanged(BR.es2q5);
    }

    @Bindable
    public String getEs2q6() {
        return es2q6;
    }

    public void setEs2q6(String es2q6) {
        this.es2q6 = es2q6;
        notifyPropertyChanged(BR.es2q6);
    }

    @Bindable
    public String getEs2q7() {
        return es2q7;
    }

    public void setEs2q7(String es2q7) {
        this.es2q7 = es2q7;
        notifyPropertyChanged(BR.es2q7);
    }

    @Bindable
    public String getEs2q8() {
        return es2q8;
    }

    public void setEs2q8(String es2q8) {
        this.es2q8 = es2q8;
        notifyPropertyChanged(BR.es2q8);
    }

    @Bindable
    public String getEs2q9() {
        return es2q9;
    }

    public void setEs2q9(String es2q9) {
        this.es2q9 = es2q9;
        notifyPropertyChanged(BR.es2q9);
    }

    @Bindable
    public String getEs2q10() {
        return es2q10;
    }

    public void setEs2q10(String es2q10) {
        this.es2q10 = es2q10;
        setEs2q196x(es2q10.equals("96") ? this.es2q196x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.es2q10);
    }

    @Bindable
    public String getEs2q196x() {
        return es2q196x;
    }

    public void setEs2q196x(String es2q196x) {
        this.es2q196x = es2q196x;
        notifyPropertyChanged(BR.es2q196x);
    }

    @Bindable
    public String getEs3q1() {
        return es3q1;
    }

    public void setEs3q1(String es3q1) {
        this.es3q1 = es3q1;
        notifyPropertyChanged(BR.es3q1);
    }

    @Bindable
    public String getEs3q2() {
        return es3q2;
    }

    public void setEs3q2(String es3q2) {
        this.es3q2 = es3q2;
        setEs3q296x(es3q2.equals("96") ? this.es3q296x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.es3q2);
    }

    @Bindable
    public String getEs3q296x() {
        return es3q296x;
    }

    public void setEs3q296x(String es3q296x) {
        this.es3q296x = es3q296x;
        notifyPropertyChanged(BR.es3q296x);
    }

    @Bindable
    public String getEs3q3() {
        return es3q3;
    }

    public void setEs3q3(String es3q3) {
        this.es3q3 = es3q3;
        setEs3q396x(es3q3.equals("96") ? this.es3q396x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.es3q3);
    }

    @Bindable
    public String getEs3q396x() {
        return es3q396x;
    }

    public void setEs3q396x(String es3q396x) {
        this.es3q396x = es3q396x;
        notifyPropertyChanged(BR.es3q396x);
    }

    @Bindable
    public String getEs3q4() {
        return es3q4;
    }

    public void setEs3q4(String es3q4) {
        this.es3q4 = es3q4;
        notifyPropertyChanged(BR.es3q4);
    }

    @Bindable
    public String getEs3q5() {
        return es3q5;
    }

    public void setEs3q5(String es3q5) {
        this.es3q5 = es3q5;
        notifyPropertyChanged(BR.es3q5);
    }

    @Bindable
    public String getEs3q501() {
        return es3q501;
    }

    public void setEs3q501(String es3q501) {
        if (this.es3q501.equals(es3q501)) return; // for all checkboxes
        this.es3q501 = es3q501;
        notifyPropertyChanged(BR.es3q501);
    }

    @Bindable
    public String getEs3q502() {
        return es3q502;
    }

    public void setEs3q502(String es3q502) {
        if (this.es3q502.equals(es3q502)) return; // for all checkboxes
        this.es3q502 = es3q502;
        notifyPropertyChanged(BR.es3q502);
    }

    @Bindable
    public String getEs3q503() {
        return es3q503;
    }

    public void setEs3q503(String es3q503) {
        if (this.es3q503.equals(es3q503)) return; // for all checkboxes
        this.es3q503 = es3q503;
        notifyPropertyChanged(BR.es3q503);
    }

    @Bindable
    public String getEs3q504() {
        return es3q504;
    }

    public void setEs3q504(String es3q504) {
        if (this.es3q504.equals(es3q504)) return; // for all checkboxes
        this.es3q504 = es3q504;
        notifyPropertyChanged(BR.es3q504);
    }

    @Bindable
    public String getEs3q505() {
        return es3q505;
    }

    public void setEs3q505(String es3q505) {
        if (this.es3q505.equals(es3q505)) return; // for all checkboxes
        this.es3q505 = es3q505;
        notifyPropertyChanged(BR.es3q505);
    }

    @Bindable
    public String getEs3q506() {
        return es3q506;
    }

    public void setEs3q506(String es3q506) {
        if (this.es3q506.equals(es3q506)) return; // for all checkboxes
        this.es3q506 = es3q506;
        notifyPropertyChanged(BR.es3q506);
    }

    @Bindable
    public String getEs3q507() {
        return es3q507;
    }

    public void setEs3q507(String es3q507) {
        if (this.es3q507.equals(es3q507)) return; // for all checkboxes
        this.es3q507 = es3q507;
        notifyPropertyChanged(BR.es3q507);
    }

    @Bindable
    public String getEs3q596() {
        return es3q596;
    }

    public void setEs3q596(String es3q596) {
        if (this.es3q596.equals(es3q596)) return; // for all checkboxes
        this.es3q596 = es3q596;
        setEs3q596x(es3q596.equals("96") ? this.es3q596x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.es3q596);
    }

    @Bindable
    public String getEs3q596x() {
        return es3q596x;
    }

    public void setEs3q596x(String es3q596x) {
        this.es3q596x = es3q596x;
        notifyPropertyChanged(BR.es3q596x);
    }

    @Bindable
    public String getEs3q6() {
        return es3q6;
    }

    public void setEs3q6(String es3q6) {
        this.es3q6 = es3q6;
        notifyPropertyChanged(BR.es3q6);
    }

    @Bindable
    public String getEs3q7() {
        return es3q7;
    }

    public void setEs3q7(String es3q7) {
        this.es3q7 = es3q7;
        notifyPropertyChanged(BR.es3q7);
    }

    @Bindable
    public String getEs3q8() {
        return es3q8;
    }

    public void setEs3q8(String es3q8) {
        this.es3q8 = es3q8;
        notifyPropertyChanged(BR.es3q8);
    }

    @Bindable
    public String getEs3q9() {
        return es3q9;
    }

    public void setEs3q9(String es3q9) {
        this.es3q9 = es3q9;
        notifyPropertyChanged(BR.es3q9);
    }

    @Bindable
    public String getEs3q901() {
        return es3q901;
    }

    public void setEs3q901(String es3q901) {
        if (this.es3q901.equals(es3q901)) return; // for all checkboxes
        this.es3q901 = es3q901;
        notifyPropertyChanged(BR.es3q901);
    }

    @Bindable
    public String getEs3q902() {
        return es3q902;
    }

    public void setEs3q902(String es3q902) {
        if (this.es3q902.equals(es3q902)) return; // for all checkboxes
        this.es3q902 = es3q902;
        notifyPropertyChanged(BR.es3q902);
    }

    @Bindable
    public String getEs3q903() {
        return es3q903;
    }

    public void setEs3q903(String es3q903) {
        if (this.es3q596.equals(es3q596)) return; // for all checkboxes
        this.es3q903 = es3q903;
        notifyPropertyChanged(BR.es3q903);
    }

    @Bindable
    public String getEs3q904() {
        return es3q904;
    }

    public void setEs3q904(String es3q904) {
        if (this.es3q904.equals(es3q904)) return; // for all checkboxes
        this.es3q904 = es3q904;
        notifyPropertyChanged(BR.es3q904);
    }

    @Bindable
    public String getEs3q905() {
        return es3q905;
    }

    public void setEs3q905(String es3q905) {
        if (this.es3q905.equals(es3q905)) return; // for all checkboxes
        this.es3q905 = es3q905;
        notifyPropertyChanged(BR.es3q905);
    }

    @Bindable
    public String getEs3q906() {
        return es3q906;
    }

    public void setEs3q906(String es3q906) {
        if (this.es3q906.equals(es3q906)) return; // for all checkboxes
        this.es3q906 = es3q906;
        notifyPropertyChanged(BR.es3q906);
    }

    @Bindable
    public String getEs3q907() {
        return es3q907;
    }

    public void setEs3q907(String es3q907) {
        if (this.es3q907.equals(es3q907)) return; // for all checkboxes
        this.es3q907 = es3q907;
        notifyPropertyChanged(BR.es3q907);
    }

    @Bindable
    public String getEs3q908() {
        return es3q908;
    }

    public void setEs3q908(String es3q908) {
        if (this.es3q908.equals(es3q908)) return; // for all checkboxes
        this.es3q908 = es3q908;
        notifyPropertyChanged(BR.es3q908);
    }

    @Bindable
    public String getEs3q996() {
        return es3q996;
    }

    public void setEs3q996(String es3q996) {
        if (this.es3q996.equals(es3q996)) return; // for all checkboxes
        this.es3q996 = es3q996;
        setEs3q996x(es3q996.equals("96") ? this.es3q996x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.es3q996);
    }

    @Bindable
    public String getEs3q996x() {
        return es3q996x;
    }

    public void setEs3q996x(String es3q996x) {
        this.es3q996x = es3q996x;
        notifyPropertyChanged(BR.es3q996x);
    }

    @Bindable
    public String getEs3q998() {
        return es3q998;
    }

    public void setEs3q998(String es3q998) {
        if (this.es3q998.equals(es3q998)) return; // for all checkboxes
        this.es3q998 = es3q998;
        notifyPropertyChanged(BR.es3q998);
    }

    @Bindable
    public String getEs3q10() {
        return es3q10;
    }

    public void setEs3q10(String es3q10) {
        this.es3q10 = es3q10;
        notifyPropertyChanged(BR.es3q10);
    }

    @Bindable
    public String getEs3q1001() {
        return es3q1001;
    }

    public void setEs3q1001(String es3q1001) {
        if (this.es3q1001.equals(es3q1001)) return; // for all checkboxes
        this.es3q1001 = es3q1001;
        notifyPropertyChanged(BR.es3q1001);
    }

    @Bindable
    public String getEs3q1002() {
        return es3q1002;
    }

    public void setEs3q1002(String es3q1002) {
        if (this.es3q1002.equals(es3q1002)) return; // for all checkboxes
        this.es3q1002 = es3q1002;
        notifyPropertyChanged(BR.es3q1002);
    }

    @Bindable
    public String getEs3q1003() {
        return es3q1003;
    }

    public void setEs3q1003(String es3q1003) {
        if (this.es3q1003.equals(es3q1003)) return; // for all checkboxes
        this.es3q1003 = es3q1003;
        notifyPropertyChanged(BR.es3q1003);
    }

    @Bindable
    public String getEs3q1004() {
        return es3q1004;
    }

    public void setEs3q1004(String es3q1004) {
        if (this.es3q1004.equals(es3q1004)) return; // for all checkboxes
        this.es3q1004 = es3q1004;
        notifyPropertyChanged(BR.es3q1004);
    }

    @Bindable
    public String getEs3q1005() {
        return es3q1005;
    }

    public void setEs3q1005(String es3q1005) {
        if (this.es3q1005.equals(es3q1005)) return; // for all checkboxes
        this.es3q1005 = es3q1005;
        notifyPropertyChanged(BR.es3q1005);
    }

    @Bindable
    public String getEs3q1006() {
        return es3q1006;
    }

    public void setEs3q1006(String es3q1006) {
        if (this.es3q1006.equals(es3q1006)) return; // for all checkboxes
        this.es3q1006 = es3q1006;
        notifyPropertyChanged(BR.es3q1006);
    }

    @Bindable
    public String getEs3q1007() {
        return es3q1007;
    }

    public void setEs3q1007(String es3q1007) {
        if (this.es3q998.equals(es3q1007)) return; // for all checkboxes
        this.es3q1007 = es3q1007;
        notifyPropertyChanged(BR.es3q1007);
    }

    @Bindable
    public String getEs3q1008() {
        return es3q1008;
    }

    public void setEs3q1008(String es3q1008) {
        if (this.es3q1008.equals(es3q1008)) return; // for all checkboxes
        this.es3q1008 = es3q1008;
        notifyPropertyChanged(BR.es3q1008);
    }

    @Bindable
    public String getEs3q196() {
        return es3q196;
    }

    public void setEs3q196(String es3q196) {
        if (this.es3q196.equals(es3q196)) return; // for all checkboxes
        this.es3q196 = es3q196;
        setEs3q196x(es3q196.equals("96") ? this.es3q196x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.es3q196);
    }

    @Bindable
    public String getEs3q196x() {
        return es3q196x;
    }

    public void setEs3q196x(String es3q196x) {
        this.es3q196x = es3q196x;
        notifyPropertyChanged(BR.es3q196x);
    }

    @Bindable
    public String getEs3q1098() {
        return es3q1098;
    }

    public void setEs3q1098(String es3q1098) {
        if (this.es3q1098.equals(es3q1098)) return; // for all checkboxes
        this.es3q1098 = es3q1098;
        notifyPropertyChanged(BR.es3q1098);
    }

    @Bindable
    public String getEs3q11() {
        return es3q11;
    }

    public void setEs3q11(String es3q11) {
        this.es3q11 = es3q11;
        setEs3q1106x(es3q11.equals("96") ? this.es3q1106x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.es3q11);
    }

    @Bindable
    public String getEs3q1106x() {
        return es3q1106x;
    }

    public void setEs3q1106x(String es3q1106x) {
        this.es3q1106x = es3q1106x;
        notifyPropertyChanged(BR.es3q1106x);
    }

    @Bindable
    public String getEs3q12() {
        return es3q12;
    }

    public void setEs3q12(String es3q12) {
        this.es3q12 = es3q12;
        notifyPropertyChanged(BR.es3q12);
    }

    @Bindable
    public String getEs3q13() {
        return es3q13;
    }

    public void setEs3q13(String es3q13) {
        this.es3q13 = es3q13;
        notifyPropertyChanged(BR.es3q13);
    }

    @Bindable
    public String getEs3q14() {
        return es3q14;
    }

    public void setEs3q14(String es3q14) {
        this.es3q14 = es3q14;
        notifyPropertyChanged(BR.es3q14);
    }

    @Bindable
    public String getEs4q1() {
        return es4q1;
    }

    public void setEs4q1(String es4q1) {
        this.es4q1 = es4q1;
        notifyPropertyChanged(BR.es4q1);
    }

    @Bindable
    public String getEs4q101() {
        return es4q101;
    }

    public void setEs4q101(String es4q101) {
        if (this.es4q101.equals(es4q101)) return; // for all checkboxes
        this.es4q101 = es4q101;
        notifyPropertyChanged(BR.es4q101);
    }

    @Bindable
    public String getEs4q102() {
        return es4q102;
    }

    public void setEs4q102(String es4q102) {
        if (this.es4q102.equals(es4q102)) return; // for all checkboxes
        this.es4q102 = es4q102;
        notifyPropertyChanged(BR.es4q102);
    }

    @Bindable
    public String getEs4q103() {
        return es4q103;
    }

    public void setEs4q103(String es4q103) {
        if (this.es4q103.equals(es4q103)) return; // for all checkboxes
        this.es4q103 = es4q103;
        notifyPropertyChanged(BR.es4q103);
    }

    @Bindable
    public String getEs4q104() {
        return es4q104;
    }

    public void setEs4q104(String es4q104) {
        if (this.es4q104.equals(es4q104)) return; // for all checkboxes
        this.es4q104 = es4q104;
        notifyPropertyChanged(BR.es4q104);
    }

    @Bindable
    public String getEs4q105() {
        return es4q105;
    }

    public void setEs4q105(String es4q105) {
        if (this.es4q105.equals(es4q105)) return; // for all checkboxes
        this.es4q105 = es4q105;
        notifyPropertyChanged(BR.es4q105);
    }

    @Bindable
    public String getEs4q106() {
        return es4q106;
    }

    public void setEs4q106(String es4q106) {
        if (this.es4q106.equals(es4q106)) return; // for all checkboxes
        this.es4q106 = es4q106;
        notifyPropertyChanged(BR.es4q106);
    }

    @Bindable
    public String getEs4q107() {
        return es4q107;
    }

    public void setEs4q107(String es4q107) {
        if (this.es4q107.equals(es4q107)) return; // for all checkboxes
        this.es4q107 = es4q107;
        notifyPropertyChanged(BR.es4q107);
    }

    @Bindable
    public String getEs4q196() {
        return es4q196;
    }

    public void setEs4q196(String es4q196) {
        if (this.es4q196.equals(es4q196)) return; // for all checkboxes
        this.es4q196 = es4q196;
        setEs4q196x(es4q196.equals("96") ? this.es4q196x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.es4q196);
    }

    @Bindable
    public String getEs4q196x() {
        return es4q196x;
    }

    public void setEs4q196x(String es4q196x) {
        this.es4q196x = es4q196x;
        notifyPropertyChanged(BR.es4q196x);
    }

    @Bindable
    public String getEs4q197() {
        return es4q197;
    }

    public void setEs4q197(String es4q197) {
        if (this.es4q197.equals(es4q197)) return; // for all checkboxes
        this.es4q197 = es4q197;
        setEs4q101(es4q197.equals("97") ? "" : this.es4q101);
        setEs4q102(es4q197.equals("97") ? "" : this.es4q102);
        setEs4q103(es4q197.equals("97") ? "" : this.es4q103);
        setEs4q104(es4q197.equals("97") ? "" : this.es4q104);
        setEs4q105(es4q197.equals("97") ? "" : this.es4q105);
        setEs4q106(es4q197.equals("97") ? "" : this.es4q106);
        setEs4q196(es4q197.equals("97") ? "" : this.es4q196);
        setEs4q198(es4q197.equals("97") ? "" : this.es4q198);
        notifyPropertyChanged(BR.es4q197);
    }

    @Bindable
    public String getEs4q198() {
        return es4q198;
    }

    public void setEs4q198(String es4q198) {
        if (this.es4q198.equals(es4q198)) return; // for all checkboxes
        this.es4q198 = es4q198;
        setEs4q101(es4q198.equals("98") ? "" : this.es4q101);
        setEs4q102(es4q198.equals("98") ? "" : this.es4q102);
        setEs4q103(es4q198.equals("98") ? "" : this.es4q103);
        setEs4q104(es4q198.equals("98") ? "" : this.es4q104);
        setEs4q105(es4q198.equals("98") ? "" : this.es4q105);
        setEs4q106(es4q198.equals("98") ? "" : this.es4q106);
        setEs4q196(es4q198.equals("98") ? "" : this.es4q196);
        setEs4q197(es4q198.equals("98") ? "" : this.es4q197);
        notifyPropertyChanged(BR.es4q198);
    }

    @Bindable
    public String getEs4q2() {
        return es4q2;
    }

    public void setEs4q2(String es4q2) {
        this.es4q2 = es4q2;
        notifyPropertyChanged(BR.es4q2);
    }

    @Bindable
    public String getEs4q3() {
        return es4q3;
    }

    public void setEs4q3(String es4q3) {
        this.es4q3 = es4q3;
        notifyPropertyChanged(BR.es4q3);
    }

    @Bindable
    public String getEs4q301() {
        return es4q301;
    }

    public void setEs4q301(String es4q301) {
        if (this.es4q301.equals(es4q301)) return; // for all checkboxes
        this.es4q301 = es4q301;
        notifyPropertyChanged(BR.es4q301);
    }

    @Bindable
    public String getEs4q302() {
        return es4q302;
    }

    public void setEs4q302(String es4q302) {
        if (this.es4q302.equals(es4q302)) return; // for all checkboxes
        this.es4q302 = es4q302;
        notifyPropertyChanged(BR.es4q302);
    }

    @Bindable
    public String getEs4q303() {
        return es4q303;
    }

    public void setEs4q303(String es4q303) {
        if (this.es4q303.equals(es4q303)) return; // for all checkboxes
        this.es4q303 = es4q303;
        notifyPropertyChanged(BR.es4q303);
    }

    @Bindable
    public String getEs4q304() {
        return es4q304;
    }

    public void setEs4q304(String es4q304) {
        if (this.es4q304.equals(es4q304)) return; // for all checkboxes
        this.es4q304 = es4q304;
        notifyPropertyChanged(BR.es4q304);
    }

    @Bindable
    public String getEs4q305() {
        return es4q305;
    }

    public void setEs4q305(String es4q305) {
        if (this.es4q305.equals(es4q305)) return; // for all checkboxes
        this.es4q305 = es4q305;
        notifyPropertyChanged(BR.es4q305);
    }

    @Bindable
    public String getEs4q306() {
        return es4q306;
    }

    public void setEs4q306(String es4q306) {
        if (this.es4q306.equals(es4q306)) return; // for all checkboxes
        this.es4q306 = es4q306;
        notifyPropertyChanged(BR.es4q306);
    }

    @Bindable
    public String getEs4q307() {
        return es4q307;
    }

    public void setEs4q307(String es4q307) {
        if (this.es4q307.equals(es4q307)) return; // for all checkboxes
        this.es4q307 = es4q307;
        notifyPropertyChanged(BR.es4q307);
    }

    @Bindable
    public String getEs4q396() {
        return es4q396;
    }

    public void setEs4q396(String es4q396) {
        if (this.es4q396.equals(es4q396)) return; // for all checkboxes
        this.es4q396 = es4q396;
        setEs4q396x(es4q396.equals("96") ? this.es4q396x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.es4q396);
    }

    @Bindable
    public String getEs4q396x() {
        return es4q396x;
    }

    public void setEs4q396x(String es4q396x) {
        this.es4q396x = es4q396x;
        notifyPropertyChanged(BR.es4q396x);
    }

    @Bindable
    public String getEs4q398() {
        return es4q398;
    }

    public void setEs4q398(String es4q398) {
        if (this.es4q398.equals(es4q398)) return; // for all checkboxes
        this.es4q398 = es4q398;
        setEs4q301(es4q398.equals("98") ? "" : this.es4q301);
        setEs4q302(es4q398.equals("98") ? "" : this.es4q302);
        setEs4q303(es4q398.equals("98") ? "" : this.es4q303);
        setEs4q304(es4q398.equals("98") ? "" : this.es4q304);
        setEs4q305(es4q398.equals("98") ? "" : this.es4q305);
        setEs4q306(es4q398.equals("98") ? "" : this.es4q306);
        setEs4q307(es4q398.equals("98") ? "" : this.es4q307);
        setEs4q396(es4q398.equals("98") ? "" : this.es4q396);
        notifyPropertyChanged(BR.es4q398);
    }

    @Bindable
    public String getEs4q4() {
        return es4q4;
    }

    public void setEs4q4(String es4q4) {
        this.es4q4 = es4q4;
        notifyPropertyChanged(BR.es4q4);
    }

    @Bindable
    public String getEs4q401() {
        return es4q401;
    }

    public void setEs4q401(String es4q401) {
        if (this.es4q401.equals(es4q401)) return; // for all checkboxes
        this.es4q401 = es4q401;
        notifyPropertyChanged(BR.es4q401);
    }

    @Bindable
    public String getEs4q402() {
        return es4q402;
    }

    public void setEs4q402(String es4q402) {
        if (this.es4q402.equals(es4q402)) return; // for all checkboxes
        this.es4q402 = es4q402;
        notifyPropertyChanged(BR.es4q402);
    }

    @Bindable
    public String getEs4q403() {
        return es4q403;
    }

    public void setEs4q403(String es4q403) {
        if (this.es4q403.equals(es4q403)) return; // for all checkboxes
        this.es4q403 = es4q403;
        notifyPropertyChanged(BR.es4q403);
    }

    @Bindable
    public String getEs4q404() {
        return es4q404;
    }

    public void setEs4q404(String es4q404) {
        if (this.es4q404.equals(es4q404)) return; // for all checkboxes
        this.es4q404 = es4q404;
        notifyPropertyChanged(BR.es4q404);
    }

    @Bindable
    public String getEs4q496() {
        return es4q496;
    }

    public void setEs4q496(String es4q496) {
        if (this.es4q496.equals(es4q496)) return; // for all checkboxes
        this.es4q496 = es4q496;
        setEs4q496x(es4q496.equals("96") ? this.es4q496x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.es4q496);
    }

    @Bindable
    public String getEs4q496x() {
        return es4q496x;
    }

    public void setEs4q496x(String es4q496x) {
        this.es4q496x = es4q496x;
        notifyPropertyChanged(BR.es4q496x);
    }

    @Bindable
    public String getEs4q498() {
        return es4q498;
    }

    public void setEs4q498(String es4q498) {
        if (this.es4q498.equals(es4q498)) return; // for all checkboxes
        this.es4q498 = es4q498;
        setEs4q401(es4q498.equals("98") ? "" : this.es4q401);
        setEs4q402(es4q498.equals("98") ? "" : this.es4q402);
        setEs4q403(es4q498.equals("98") ? "" : this.es4q403);
        setEs4q404(es4q498.equals("98") ? "" : this.es4q404);
        setEs4q496(es4q498.equals("98") ? "" : this.es4q496);
        notifyPropertyChanged(BR.es4q498);
    }

    @Bindable
    public String getEs4q5() {
        return es4q5;
    }

    public void setEs4q5(String es4q5) {
        this.es4q5 = es4q5;
        notifyPropertyChanged(BR.es4q5);
    }

    @Bindable
    public String getEs4q501() {
        return es4q501;
    }

    public void setEs4q501(String es4q501) {
        if (this.es4q501.equals(es4q501)) return; // for all checkboxes
        this.es4q501 = es4q501;
        notifyPropertyChanged(BR.es4q501);
    }

    @Bindable
    public String getEs4q502() {
        return es4q502;
    }

    public void setEs4q502(String es4q502) {
        if (this.es4q502.equals(es4q502)) return; // for all checkboxes
        this.es4q502 = es4q502;
        notifyPropertyChanged(BR.es4q502);
    }

    @Bindable
    public String getEs4q503() {
        return es4q503;
    }

    public void setEs4q503(String es4q503) {
        if (this.es4q503.equals(es4q503)) return; // for all checkboxes
        this.es4q503 = es4q503;
        notifyPropertyChanged(BR.es4q503);
    }

    @Bindable
    public String getEs4q504() {
        return es4q504;
    }

    public void setEs4q504(String es4q504) {
        if (this.es4q504.equals(es4q504)) return; // for all checkboxes
        this.es4q504 = es4q504;
        notifyPropertyChanged(BR.es4q504);
    }

    @Bindable
    public String getEs4q505() {
        return es4q505;
    }

    public void setEs4q505(String es4q505) {
        if (this.es4q505.equals(es4q505)) return; // for all checkboxes
        this.es4q505 = es4q505;
        notifyPropertyChanged(BR.es4q505);
    }

    @Bindable
    public String getEs4q506() {
        return es4q506;
    }

    public void setEs4q506(String es4q506) {
        if (this.es4q506.equals(es4q506)) return; // for all checkboxes
        this.es4q506 = es4q506;
        notifyPropertyChanged(BR.es4q506);
    }

    @Bindable
    public String getEs4q507() {
        return es4q507;
    }

    public void setEs4q507(String es4q507) {
        if (this.es4q507.equals(es4q507)) return; // for all checkboxes
        this.es4q507 = es4q507;
        notifyPropertyChanged(BR.es4q507);
    }

    @Bindable
    public String getEs4q508() {
        return es4q508;
    }

    public void setEs4q508(String es4q508) {
        if (this.es4q508.equals(es4q508)) return; // for all checkboxes
        this.es4q508 = es4q508;
        notifyPropertyChanged(BR.es4q508);
    }

    @Bindable
    public String getEs4q509() {
        return es4q509;
    }

    public void setEs4q509(String es4q509) {
        if (this.es4q509.equals(es4q509)) return; // for all checkboxes
        this.es4q509 = es4q509;
        notifyPropertyChanged(BR.es4q509);
    }

    @Bindable
    public String getEs4q596() {
        return es4q596;
    }

    public void setEs4q596(String es4q596) {
        if (this.es4q596.equals(es4q596)) return; // for all checkboxes
        this.es4q596 = es4q596;
        setEs4q596x(es4q596.equals("96") ? this.es4q596x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.es4q596);
    }

    @Bindable
    public String getEs4q596x() {
        return es4q596x;
    }

    public void setEs4q596x(String es4q596x) {
        this.es4q596x = es4q596x;
        notifyPropertyChanged(BR.es4q596x);
    }

    @Bindable
    public String getEs4q598() {
        return es4q598;
    }

    public void setEs4q598(String es4q598) {
        if (this.es4q598.equals(es4q598)) return; // for all checkboxes
        this.es4q598 = es4q598;
        setEs4q501(es4q598.equals("98") ? "" : this.es4q501);
        setEs4q502(es4q598.equals("98") ? "" : this.es4q502);
        setEs4q503(es4q598.equals("98") ? "" : this.es4q503);
        setEs4q504(es4q598.equals("98") ? "" : this.es4q504);
        setEs4q505(es4q598.equals("98") ? "" : this.es4q505);
        setEs4q506(es4q598.equals("98") ? "" : this.es4q506);
        setEs4q507(es4q598.equals("98") ? "" : this.es4q507);
        setEs4q508(es4q598.equals("98") ? "" : this.es4q508);
        setEs4q506(es4q598.equals("98") ? "" : this.es4q506);
        setEs4q596(es4q598.equals("98") ? "" : this.es4q596);
        notifyPropertyChanged(BR.es4q598);
    }

    @Bindable
    public String getEs4q6() {
        return es4q6;
    }

    public void setEs4q6(String es4q6) {
        this.es4q6 = es4q6;
        notifyPropertyChanged(BR.es4q6);
    }

    @Bindable
    public String getEs4q601() {
        return es4q601;
    }

    public void setEs4q601(String es4q601) {
        if (this.es4q601.equals(es4q601)) return; // for all checkboxes
        this.es4q601 = es4q601;
        notifyPropertyChanged(BR.es4q601);
    }

    @Bindable
    public String getEs4q602() {
        return es4q602;
    }

    public void setEs4q602(String es4q602) {
        if (this.es4q602.equals(es4q602)) return; // for all checkboxes
        this.es4q602 = es4q602;
        notifyPropertyChanged(BR.es4q602);
    }

    @Bindable
    public String getEs4q603() {
        return es4q603;
    }

    public void setEs4q603(String es4q603) {
        if (this.es4q603.equals(es4q603)) return; // for all checkboxes
        this.es4q603 = es4q603;
        notifyPropertyChanged(BR.es4q603);
    }

    @Bindable
    public String getEs4q604() {
        return es4q604;
    }

    public void setEs4q604(String es4q604) {
        if (this.es4q604.equals(es4q604)) return; // for all checkboxes
        this.es4q604 = es4q604;
        notifyPropertyChanged(BR.es4q604);
    }

    @Bindable
    public String getEs4q605() {
        return es4q605;
    }

    public void setEs4q605(String es4q605) {
        if (this.es4q605.equals(es4q605)) return; // for all checkboxes
        this.es4q605 = es4q605;
        notifyPropertyChanged(BR.es4q605);
    }

    @Bindable
    public String getEs4q696() {
        return es4q696;
    }

    public void setEs4q696(String es4q696) {
        if (this.es4q696.equals(es4q696)) return; // for all checkboxes
        this.es4q696 = es4q696;
        setEs4q696x(es4q696.equals("96") ? this.es4q696x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.es4q696);
    }

    @Bindable
    public String getEs4q696x() {
        return es4q696x;
    }

    public void setEs4q696x(String es4q696x) {
        this.es4q696x = es4q696x;
        notifyPropertyChanged(BR.es4q696x);
    }

    @Bindable
    public String getEs4q698() {
        return es4q698;
    }

    public void setEs4q698(String es4q698) {
        if (this.es4q698.equals(es4q698)) return; // for all checkboxes
        this.es4q698 = es4q698;
        setEs4q601(es4q698.equals("98") ? "" : this.es4q601);
        setEs4q602(es4q698.equals("98") ? "" : this.es4q602);
        setEs4q603(es4q698.equals("98") ? "" : this.es4q603);
        setEs4q604(es4q698.equals("98") ? "" : this.es4q604);
        setEs4q605(es4q698.equals("98") ? "" : this.es4q605);
        setEs4q696(es4q698.equals("98") ? "" : this.es4q696);
        notifyPropertyChanged(BR.es4q698);
    }

    @Bindable
    public String getEs4q7() {
        return es4q7;
    }

    public void setEs4q7(String es4q7) {
        this.es4q7 = es4q7;
        notifyPropertyChanged(BR.es4q7);
    }

    @Bindable
    public String getEs4q8() {
        return es4q8;
    }

    public void setEs4q8(String es4q8) {
        this.es4q8 = es4q8;
        notifyPropertyChanged(BR.es4q8);
    }

    @Bindable
    public String getEs4q801() {
        return es4q801;
    }

    public void setEs4q801(String es4q801) {
        if (this.es4q801.equals(es4q801)) return; // for all checkboxes
        this.es4q801 = es4q801;
        notifyPropertyChanged(BR.es4q801);
    }

    @Bindable
    public String getEs4q802() {
        return es4q802;
    }

    public void setEs4q802(String es4q802) {
        if (this.es4q802.equals(es4q802)) return; // for all checkboxes
        this.es4q802 = es4q802;
        notifyPropertyChanged(BR.es4q802);
    }

    @Bindable
    public String getEs4q803() {
        return es4q803;
    }

    public void setEs4q803(String es4q803) {
        if (this.es4q803.equals(es4q803)) return; // for all checkboxes
        this.es4q803 = es4q803;
        notifyPropertyChanged(BR.es4q803);
    }

    @Bindable
    public String getEs4q804() {
        return es4q804;
    }

    public void setEs4q804(String es4q804) {
        if (this.es4q804.equals(es4q804)) return; // for all checkboxes
        this.es4q804 = es4q804;
        notifyPropertyChanged(BR.es4q804);
    }

    @Bindable
    public String getEs4q805() {
        return es4q805;
    }

    public void setEs4q805(String es4q805) {
        if (this.es4q805.equals(es4q805)) return; // for all checkboxes
        this.es4q805 = es4q805;
        notifyPropertyChanged(BR.es4q805);
    }

    @Bindable
    public String getEs4q806() {
        return es4q806;
    }

    public void setEs4q806(String es4q806) {
        if (this.es4q806.equals(es4q806)) return; // for all checkboxes
        this.es4q806 = es4q806;
        notifyPropertyChanged(BR.es4q806);
    }

    @Bindable
    public String getEs4q807() {
        return es4q807;
    }

    public void setEs4q807(String es4q807) {
        if (this.es4q807.equals(es4q807)) return; // for all checkboxes
        this.es4q807 = es4q807;
        notifyPropertyChanged(BR.es4q807);
    }

    @Bindable
    public String getEs4q808() {
        return es4q808;
    }

    public void setEs4q808(String es4q808) {
        if (this.es4q808.equals(es4q808)) return; // for all checkboxes
        this.es4q808 = es4q808;
        notifyPropertyChanged(BR.es4q808);
    }

    @Bindable
    public String getEs4q809() {
        return es4q809;
    }

    public void setEs4q809(String es4q809) {
        if (this.es4q809.equals(es4q809)) return; // for all checkboxes
        this.es4q809 = es4q809;
        notifyPropertyChanged(BR.es4q809);
    }

    @Bindable
    public String getEs4q8010() {
        return es4q8010;
    }

    public void setEs4q8010(String es4q8010) {
        if (this.es4q8010.equals(es4q8010)) return; // for all checkboxes
        this.es4q8010 = es4q8010;
        notifyPropertyChanged(BR.es4q8010);
    }

    @Bindable
    public String getEs4q8011() {
        return es4q8011;
    }

    public void setEs4q8011(String es4q8011) {
        if (this.es4q8011.equals(es4q8011)) return; // for all checkboxes
        this.es4q8011 = es4q8011;
        notifyPropertyChanged(BR.es4q8011);
    }

    @Bindable
    public String getEs4q8012() {
        return es4q8012;
    }

    public void setEs4q8012(String es4q8012) {
        if (this.es4q8012.equals(es4q8012)) return; // for all checkboxes
        this.es4q8012 = es4q8012;
        notifyPropertyChanged(BR.es4q8012);
    }

    @Bindable
    public String getEs4q8013() {
        return es4q8013;
    }

    public void setEs4q8013(String es4q8013) {
        if (this.es4q8013.equals(es4q8013)) return; // for all checkboxes
        this.es4q8013 = es4q8013;
        notifyPropertyChanged(BR.es4q8013);
    }

    @Bindable
    public String getEs4q8014() {
        return es4q8014;
    }

    public void setEs4q8014(String es4q8014) {
        if (this.es4q8014.equals(es4q8014)) return; // for all checkboxes
        this.es4q8014 = es4q8014;
        notifyPropertyChanged(BR.es4q8014);
    }

    @Bindable
    public String getEs4q8015() {
        return es4q8015;
    }

    public void setEs4q8015(String es4q8015) {
        if (this.es4q8015.equals(es4q8015)) return; // for all checkboxes
        this.es4q8015 = es4q8015;
        notifyPropertyChanged(BR.es4q8015);
    }

    @Bindable
    public String getEs4q8016() {
        return es4q8016;
    }

    public void setEs4q8016(String es4q8016) {
        if (this.es4q8016.equals(es4q8016)) return; // for all checkboxes
        this.es4q8016 = es4q8016;
        notifyPropertyChanged(BR.es4q8016);
    }

    @Bindable
    public String getEs4q8017() {
        return es4q8017;
    }

    public void setEs4q8017(String es4q8017) {
        if (this.es4q8017.equals(es4q8017)) return; // for all checkboxes
        this.es4q8017 = es4q8017;
        notifyPropertyChanged(BR.es4q8017);
    }

    @Bindable
    public String getEs4q8018() {
        return es4q8018;
    }

    public void setEs4q8018(String es4q8018) {
        if (this.es4q8018.equals(es4q8018)) return; // for all checkboxes
        this.es4q8018 = es4q8018;
        notifyPropertyChanged(BR.es4q8018);
    }

    @Bindable
    public String getEs4q866() {
        return es4q866;
    }

    public void setEs4q866(String es4q866) {
        if (this.es4q866.equals(es4q866)) return; // for all checkboxes
        this.es4q866 = es4q866;
        setEs4q801(es4q866.equals("66") ? "" : this.es4q801);
        setEs4q802(es4q866.equals("66") ? "" : this.es4q802);
        setEs4q803(es4q866.equals("66") ? "" : this.es4q803);
        setEs4q804(es4q866.equals("66") ? "" : this.es4q804);
        setEs4q805(es4q866.equals("66") ? "" : this.es4q805);
        setEs4q806(es4q866.equals("66") ? "" : this.es4q806);
        setEs4q807(es4q866.equals("66") ? "" : this.es4q807);
        setEs4q808(es4q866.equals("66") ? "" : this.es4q808);
        setEs4q809(es4q866.equals("66") ? "" : this.es4q809);
        setEs4q8010(es4q866.equals("66") ? "" : this.es4q8010);
        setEs4q8011(es4q866.equals("66") ? "" : this.es4q8011);
        setEs4q8012(es4q866.equals("66") ? "" : this.es4q8012);
        setEs4q8013(es4q866.equals("66") ? "" : this.es4q8013);
        setEs4q8014(es4q866.equals("66") ? "" : this.es4q8014);
        setEs4q8015(es4q866.equals("66") ? "" : this.es4q8015);
        setEs4q8016(es4q866.equals("66") ? "" : this.es4q8016);
        setEs4q8017(es4q866.equals("66") ? "" : this.es4q8017);
        setEs4q8018(es4q866.equals("66") ? "" : this.es4q8018);
        setEs4q896(es4q866.equals("66") ? "" : this.es4q896);
        notifyPropertyChanged(BR.es4q866);
    }

    @Bindable
    public String getEs4q896() {
        return es4q896;
    }

    public void setEs4q896(String es4q896) {
        if (this.es4q896.equals(es4q896)) return; // for all checkboxes
        this.es4q896 = es4q896;
        setEs4q896x(es4q896.equals("96") ? this.es4q896x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.es4q896);
    }

    @Bindable
    public String getEs4q896x() {
        return es4q896x;
    }

    public void setEs4q896x(String es4q896x) {
        this.es4q896x = es4q896x;
        notifyPropertyChanged(BR.es4q896x);
    }


    public Form Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_UID));
        this.ebCode = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ENUM_BLOCK));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_HHID));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED_DATE));

        sA1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA1)));
        sA2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA2)));
        sB1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SB1)));
        sB2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SB2)));
        sB3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SB3)));
        sB41Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SB41)));
        sB42Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SB42)));
        sB5Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SB5)));
        sB6Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SB6)));
        sB7Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SB7)));
        sC1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SC1)));
        sC2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SC2)));
        sC31Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SC31)));
        sC32Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SC32)));
        sC4Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SC4)));
        sC5Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SC5)));
        sD1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SD1)));
        sD2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SD2)));
        sD3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SD3)));
        sE1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SE1)));
        sE2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SE2)));
        sE3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SE3)));
        sE4Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SE4)));
        return this;
    }

    public void sA1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sA1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.as1q01 = json.getString("as1q01");
            this.as1q02 = json.getString("as1q02");
            this.as1q03 = json.getString("as1q03");
            this.as1q04 = json.getString("as1q04");
            this.as1q05 = json.getString("as1q05");
            this.as1q06 = json.getString("as1q06");
            this.as1q07 = json.getString("as1q07");
            this.as1q08 = json.getString("as1q08");
            this.as1q09 = json.getString("as1q09");
            this.as1q10 = json.getString("as1q10");
            this.as1q11 = json.getString("as1q11");
            this.as1q12 = json.getString("as1q12");
            this.as1q13 = json.getString("as1q13");
            this.as1q14 = json.getString("as1q14");
            this.as1q15d = json.getString("as1q15d");
            this.as1q15m = json.getString("as1q15m");
            this.as1q15y = json.getString("as1q15y");
            this.as1q16h = json.getString("as1q16h");
            this.as1q16m = json.getString("as1q16m");
            this.as1q17h = json.getString("as1q17h");
            this.as1q17m = json.getString("as1q17m");
            this.as1q18 = json.getString("as1q18");
            this.as1q19 = json.getString("as1q19");
            this.as1q20 = json.getString("as1q20");
            this.as1q21 = json.getString("as1q21");
            this.as1q22 = json.getString("as1q22");
            this.as1q23 = json.getString("as1q23");
            this.as1q23a = json.getString("as1q23a");
        }
    }

    public void sA2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sA2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.hl1 = json.getString("hl1");
            this.hl2 = json.getString("hl2");
            this.hl3 = json.getString("hl3");
            this.hl4 = json.getString("hl4");
            this.hl5d = json.getString("hl5d");
            this.hl5m = json.getString("hl5m");
            this.hl5y = json.getString("hl5y");
            this.hl6y = json.getString("hl6y");
            this.hl6m = json.getString("hl6m");
            this.hl7 = json.getString("hl7");
            this.hl8 = json.getString("hl8");
            this.hl9 = json.getString("hl9");
            this.hl10 = json.getString("hl10");
            this.hl11 = json.getString("hl11");
            this.hl12 = json.getString("hl12");
            this.hl1296x = json.getString("hl1296x");
            this.hl13 = json.getString("hl13");
        }
    }

    public void sB1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sB1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.bs1resp = json.getString("bs1resp");
            this.bs1respline = json.getString("bs1respline");
            this.bs1con = json.getString("bs1con");
            this.bs1q1 = json.getString("bs1q1");
            this.bs1q2 = json.getString("bs1q2");
            this.bs1q3 = json.getString("bs1q3");
            this.bs1q4 = json.getString("bs1q4");
            this.bs1q5 = json.getString("bs1q5");
            this.bs1q6 = json.getString("bs1q6");
            this.bs1q7p1g = json.getString("bs1q7p1g");
            this.bs1q7p1d = json.getString("bs1q7p1d");
            this.bs1q7p1d96x = json.getString("bs1q7p1d96x");
            this.bs1q7p1b = json.getString("bs1q7p1b");
            this.bs1q7p2g = json.getString("bs1q7p2g");
            this.bs1q7p2d = json.getString("bs1q7p2d");
            this.bs1q7p2d96x = json.getString("bs1q7p2d96x");
            this.bs1q7p2b = json.getString("bs1q7p2b");
            this.bs1q7p3g = json.getString("bs1q7p3g");
            this.bs1q7p3d = json.getString("bs1q7p3d");
            this.bs1q7p3d96x = json.getString("bs1q7p3d96x");
            this.bs1q7p3b = json.getString("bs1q7p3b");
            this.bs1q7p4g = json.getString("bs1q7p4g");
            this.bs1q7p4d = json.getString("bs1q7p4d");
            this.bs1q7p4d96x = json.getString("bs1q7p4d96x");
            this.bs1q7p4b = json.getString("bs1q7p4b");
            this.bs1q7p5g = json.getString("bs1q7p5g");
            this.bs1q7p5d = json.getString("bs1q7p5d");
            this.bs1q7p5d96x = json.getString("bs1q7p5d96x");
            this.bs1q7p5b = json.getString("bs1q7p5b");
            this.bs1q08 = json.getString("bs1q08");
            this.bs1q09 = json.getString("bs1q09");
            this.bs1q0901 = json.getString("bs1q0901");
            this.bs1q0902 = json.getString("bs1q0902");
            this.bs1q0903 = json.getString("bs1q0903");
            this.bs1q0904 = json.getString("bs1q0904");
            this.bs1q0905 = json.getString("bs1q0905");
            this.bs1q0906 = json.getString("bs1q0906");
            this.bs1q0907 = json.getString("bs1q0907");
            this.bs1q0908 = json.getString("bs1q0908");
            this.bs1q09t296 = json.getString("bs1q09t296");
            this.bs1q09t296x = json.getString("bs1q09t296x");
            this.bs1q1001 = json.getString("bs1q1001");
            this.bs1q1002 = json.getString("bs1q1002");
            this.bs1q1098 = json.getString("bs1q1098");
            this.bs1q11 = json.getString("bs1q11");
            this.bs1q12 = json.getString("bs1q12");
            this.bs1q13 = json.getString("bs1q13");
            this.bs1q1301 = json.getString("bs1q1301");
            this.bs1q1302 = json.getString("bs1q1302");
            this.bs1q1303 = json.getString("bs1q1303");
            this.bs1q1304 = json.getString("bs1q1304");
            this.bs1q1305 = json.getString("bs1q1305");
            this.bs1q1306 = json.getString("bs1q1306");
            this.bs1q1307 = json.getString("bs1q1307");
            this.bs1q1308 = json.getString("bs1q1308");
            this.bs1q1396 = json.getString("bs1q1396");
            this.bs1q1396x = json.getString("bs1q1396x");
        }
    }

    public void sB2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sB2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.bs2q1 = json.getString("bs2q1");
            this.bs2q2 = json.getString("bs2q2");
            this.bs2q201 = json.getString("bs2q201");
            this.bs2q202 = json.getString("bs2q202");
            this.bs2q203 = json.getString("bs2q203");
            this.bs2q204 = json.getString("bs2q204");
            this.bs2q205 = json.getString("bs2q205");
            this.bs2q206 = json.getString("bs2q206");
            this.bs2q207 = json.getString("bs2q207");
            this.bs2q208 = json.getString("bs2q208");
            this.bs2q209 = json.getString("bs2q209");
            this.bs2q210 = json.getString("bs2q210");
            this.bs2q211 = json.getString("bs2q211");
            this.bs2q212 = json.getString("bs2q212");
            this.bs2q213 = json.getString("bs2q213");
            this.bs2q214 = json.getString("bs2q214");
            this.bs2q215 = json.getString("bs2q215");
            this.bs2q216 = json.getString("bs2q216");
            this.bs2q217 = json.getString("bs2q217");
            this.bs2q218 = json.getString("bs2q218");
            this.bs2q296 = json.getString("bs2q296");
            this.bs2q296x = json.getString("bs2q296x");
            this.bs2q3 = json.getString("bs2q3");
            this.bs2q4 = json.getString("bs2q4");
            this.bs2q401 = json.getString("bs2q401");
            this.bs2q402 = json.getString("bs2q402");
            this.bs2q403 = json.getString("bs2q403");
            this.bs2q404 = json.getString("bs2q404");
            this.bs2q405 = json.getString("bs2q405");
            this.bs2q406 = json.getString("bs2q406");
            this.bs2q407 = json.getString("bs2q407");
            this.bs2q408 = json.getString("bs2q408");
            this.bs2q409 = json.getString("bs2q409");
            this.bs2q410 = json.getString("bs2q410");
            this.bs2q411 = json.getString("bs2q411");
            this.bs2q412 = json.getString("bs2q412");
            this.bs2q413 = json.getString("bs2q413");
            this.bs2q414 = json.getString("bs2q414");
            this.bs2q415 = json.getString("bs2q415");
            this.bs2q416 = json.getString("bs2q416");
            this.bs2q417 = json.getString("bs2q417");
            this.bs2q418 = json.getString("bs2q418");
            this.bs2q4096 = json.getString("bs2q4096");
            this.bs2q4096x = json.getString("bs2q4096x");
            this.bs2q5 = json.getString("bs2q5");
            this.bs2q6 = json.getString("bs2q6");
            this.bs2q601 = json.getString("bs2q601");
            this.bs2q602 = json.getString("bs2q602");
            this.bs2q603 = json.getString("bs2q603");
            this.bs2q604 = json.getString("bs2q604");
            this.bs2q605 = json.getString("bs2q605");
            this.bs2q606 = json.getString("bs2q606");
            this.bs2q606x = json.getString("bs2q606x");
            this.bs2q607 = json.getString("bs2q607");
            this.bs2q608 = json.getString("bs2q608");
            this.bs2q609 = json.getString("bs2q609");
            this.bs2q6010 = json.getString("bs2q6010");
            this.bs2q6010x = json.getString("bs2q6010x");
            this.bs2q6011 = json.getString("bs2q6011");
            this.bs2q6011x = json.getString("bs2q6011x");
            this.bs2q6012 = json.getString("bs2q6012");
            this.bs2q6013 = json.getString("bs2q6013");
            this.bs2q6014 = json.getString("bs2q6014");
            this.bs2q6015 = json.getString("bs2q6015");
            this.bs2q696 = json.getString("bs2q696");
            this.bs2q696x = json.getString("bs2q696x");
            this.bs2q7 = json.getString("bs2q7");
            this.bs2q796x = json.getString("bs2q796x");
            this.bs2q8 = json.getString("bs2q8");
            this.bs2q801 = json.getString("bs2q801");
            this.bs2q802 = json.getString("bs2q802");
            this.bs2q803 = json.getString("bs2q803");
            this.bs2q804 = json.getString("bs2q804");
            this.bs2q898 = json.getString("bs2q898");
            this.bs2q896 = json.getString("bs2q896");
            this.bs2q896x = json.getString("bs2q896x");
        }
    }

    public void sB3Hydrate(String string) throws JSONException {
        Log.d(TAG, "sB3Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.bs3q1 = json.getString("bs3q1");
            this.bs3q101 = json.getString("bs3q101");
            this.bs3q102 = json.getString("bs3q102");
            this.bs3q103 = json.getString("bs3q103");
            this.bs3q104 = json.getString("bs3q104");
            this.bs3q105 = json.getString("bs3q105");
            this.bs3q106 = json.getString("bs3q106");
            this.bs3q107 = json.getString("bs3q107");
            this.bs3q197 = json.getString("bs3q197");
            this.bs3q198 = json.getString("bs3q198");
            this.bs3q196 = json.getString("bs3q196");
            this.bs3q196x = json.getString("bs3q196x");
            this.bs3q2a = json.getString("bs3q2a");
            this.bs3q2a96x = json.getString("bs3q2a96x");
            this.bs3q2b96 = json.getString("bs3q2b96");
            this.bs3q2c96 = json.getString("bs3q2c96");
            this.bs3q2d96 = json.getString("bs3q2d96");
            this.bs3q3 = json.getString("bs3q3");
            this.bs3q4 = json.getString("bs3q4");
            this.bs3q401 = json.getString("bs3q401");
            this.bs3q402 = json.getString("bs3q402");
            this.bs3q403 = json.getString("bs3q403");
            this.bs3q404 = json.getString("bs3q404");
            this.bs3q405 = json.getString("bs3q405");
            this.bs3q406 = json.getString("bs3q406");
            this.bs3q407 = json.getString("bs3q407");
            this.bs3q496 = json.getString("bs3q496");
            this.bs3q496x = json.getString("bs3q496x");
            this.bs3q498 = json.getString("bs3q498");
            this.bs3q5 = json.getString("bs3q5");
            this.bs3q501 = json.getString("bs3q501");
            this.bs3q502 = json.getString("bs3q502");
            this.bs3q503 = json.getString("bs3q503");
            this.bs3q504 = json.getString("bs3q504");
            this.bs3q598 = json.getString("bs3q598");
            this.bs3q596 = json.getString("bs3q596");
            this.bs3q596x = json.getString("bs3q596x");
            this.bs3q6 = json.getString("bs3q6");
            this.bs3q601 = json.getString("bs3q601");
            this.bs3q602 = json.getString("bs3q602");
            this.bs3q603 = json.getString("bs3q603");
            this.bs3q604 = json.getString("bs3q604");
            this.bs3q605 = json.getString("bs3q605");
            this.bs3q606 = json.getString("bs3q606");
            this.bs3q607 = json.getString("bs3q607");
            this.bs3q608 = json.getString("bs3q608");
            this.bs3q609 = json.getString("bs3q609");
            this.bs3q698 = json.getString("bs3q698");
            this.bs3q696 = json.getString("bs3q696");
            this.bs3q696x = json.getString("bs3q696x");
            this.bs3q7 = json.getString("bs3q7");
            this.bs3q701 = json.getString("bs3q701");
            this.bs3q702 = json.getString("bs3q702");
            this.bs3q703 = json.getString("bs3q703");
            this.bs3q704 = json.getString("bs3q704");
            this.bs3q705 = json.getString("bs3q705");
            this.bs3q798 = json.getString("bs3q798");
            this.bs3q796 = json.getString("bs3q796");
            this.bs3q796x = json.getString("bs3q796x");
            this.bs3q8 = json.getString("bs3q8");
            this.bs3q801 = json.getString("bs3q801");
            this.bs3q802 = json.getString("bs3q802");
            this.bs3q803 = json.getString("bs3q803");
            this.bs3q804 = json.getString("bs3q804");
            this.bs3q897 = json.getString("bs3q897");
            this.bs3q896 = json.getString("bs3q896");
            this.bs3q896x = json.getString("bs3q896x");
            this.bs3q9 = json.getString("bs3q9");
            this.bs3q901 = json.getString("bs3q901");
            this.bs3q902 = json.getString("bs3q902");
            this.bs3q903 = json.getString("bs3q903");
            this.bs3q904 = json.getString("bs3q904");
            this.bs3q905 = json.getString("bs3q905");
            this.bs3q906 = json.getString("bs3q906");
            this.bs3q996 = json.getString("bs3q996");
            this.bs3q996x = json.getString("bs3q996x");
            this.bs3q997 = json.getString("bs3q997");
            this.bs3q10 = json.getString("bs3q10");
            this.bs3q1001 = json.getString("bs3q1001");
            this.bs3q1002 = json.getString("bs3q1002");
            this.bs3q1003 = json.getString("bs3q1003");
            this.bs3q1004 = json.getString("bs3q1004");
            this.bs3q1005 = json.getString("bs3q1005");
            this.bs3q1006 = json.getString("bs3q1006");
            this.bs3q1007 = json.getString("bs3q1007");
            this.bs3q1008 = json.getString("bs3q1008");
            this.bs3q1009 = json.getString("bs3q1009");
            this.bs3q1096 = json.getString("bs3q1096");
            this.bs3q1096x = json.getString("bs3q1096x");
            this.bs3q1097 = json.getString("bs3q1097");
            this.bs3q11 = json.getString("bs3q11");
            this.bs3q12 = json.getString("bs3q12");
            this.bs3q1201 = json.getString("bs3q1201");
            this.bs3q1202 = json.getString("bs3q1202");
            this.bs3q1203 = json.getString("bs3q1203");
            this.bs3q1204 = json.getString("bs3q1204");
            this.bs3q1205 = json.getString("bs3q1205");
            this.bs3q1206 = json.getString("bs3q1206");
            this.bs3q1206x = json.getString("bs3q1206x");
            this.bs3q1207 = json.getString("bs3q1207");
            this.bs3q1296 = json.getString("bs3q1296");
            this.bs3q1296x = json.getString("bs3q1296x");
            this.bs3q13 = json.getString("bs3q13");
            this.bs3q14 = json.getString("bs3q14");
            this.bs3q15 = json.getString("bs3q15");
        }
    }

    public void sB41Hydrate(String string) throws JSONException {
        Log.d(TAG, "sB41Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.bs4aq1 = json.getString("bs4aq1");
            this.bs4aq2 = json.getString("bs4aq2");
            this.bs4aq201 = json.getString("bs4aq201");
            this.bs4aq202 = json.getString("bs4aq202");
            this.bs4aq203 = json.getString("bs4aq203");
            this.bs4aq204 = json.getString("bs4aq204");
            this.bs4aq205 = json.getString("bs4aq205");
            this.bs4aq206 = json.getString("bs4aq206");
            this.bs4aq207 = json.getString("bs4aq207");
            this.bs4aq208 = json.getString("bs4aq208");
            this.bs4aq298 = json.getString("bs4aq298");
            this.bs4aq296 = json.getString("bs4aq296");
            this.bs4aq296x = json.getString("bs4aq296x");
            this.bs4aq3 = json.getString("bs4aq3");
            this.bs4aq4 = json.getString("bs4aq4");
            this.bs4aq5 = json.getString("bs4aq5");
            this.bs4aq6 = json.getString("bs4aq6");
            this.bs4aq696x = json.getString("bs4aq696x");
            this.bs4aq7 = json.getString("bs4aq7");
            this.bs4aq8 = json.getString("bs4aq8");
            this.bs4aq896x = json.getString("bs4aq896x");
            this.bs4aq9 = json.getString("bs4aq9");
            this.bs4aq10 = json.getString("bs4aq10");
        }
    }

    public void sB42Hydrate(String string) throws JSONException {
        Log.d(TAG, "sB42Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.bs4bq1 = json.getString("bs4bq1");
            this.bs4bq2 = json.getString("bs4bq2");
            this.bs4bq21 = json.getString("bs4bq21");
            this.bs4bq22 = json.getString("bs4bq22");
            this.bs4bq23 = json.getString("bs4bq23");
            this.bs4bq24 = json.getString("bs4bq24");
            this.bs4bq298 = json.getString("bs4bq298");
            this.bs4bq296 = json.getString("bs4bq296");
            this.bs4bq296x = json.getString("bs4bq296x");
            this.bs4bq3 = json.getString("bs4bq3");
            this.bs4bq31 = json.getString("bs4bq31");
            this.bs4bq32 = json.getString("bs4bq32");
            this.bs4bq33 = json.getString("bs4bq33");
            this.bs4bq34 = json.getString("bs4bq34");
            this.bs4bq35 = json.getString("bs4bq35");
            this.bs4bq36 = json.getString("bs4bq36");
            this.bs4bq398 = json.getString("bs4bq398");
            this.bs4bq396 = json.getString("bs4bq396");
            this.bs4bq396x = json.getString("bs4bq396x");
            this.bs4bq4 = json.getString("bs4bq4");
            this.bs4bq5 = json.getString("bs4bq5");
            this.bs4bq51 = json.getString("bs4bq51");
            this.bs4bq52 = json.getString("bs4bq52");
            this.bs4bq53 = json.getString("bs4bq53");
            this.bs4bq598 = json.getString("bs4bq598");
            this.bs4bq596 = json.getString("bs4bq596");
            this.bs4bq596x = json.getString("bs4bq596x");
            this.bs4bq6 = json.getString("bs4bq6");
            this.bs4bq696x = json.getString("bs4bq696x");
            this.bs4bq7 = json.getString("bs4bq7");
            this.bs4bq8 = json.getString("bs4bq8");
            this.bs4bq81 = json.getString("bs4bq81");
            this.bs4bq82 = json.getString("bs4bq82");
            this.bs4bq83 = json.getString("bs4bq83");
            this.bs4bq84 = json.getString("bs4bq84");
            this.bs4bq85 = json.getString("bs4bq85");
            this.bs4bq86 = json.getString("bs4bq86");
            this.bs4bq87 = json.getString("bs4bq87");
            this.bs4bq898 = json.getString("bs4bq898");
            this.bs4bq896 = json.getString("bs4bq896");
            this.bs4bq896x = json.getString("bs4bq896x");
        }
    }

    public void sB5Hydrate(String string) throws JSONException {
        Log.d(TAG, "sB5Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.bs5q1 = json.getString("bs5q1");
            this.bs5q2 = json.getString("bs5q2");
            this.bs5q201 = json.getString("bs5q201");
            this.bs5q202 = json.getString("bs5q202");
            this.bs5q203 = json.getString("bs5q203");
            this.bs5q204 = json.getString("bs5q204");
            this.bs5q205 = json.getString("bs5q205");
            this.bs5q296 = json.getString("bs5q296");
            this.bs5q296x = json.getString("bs5q296x");
            this.bs5q297 = json.getString("bs5q297");
            this.bs5q3 = json.getString("bs5q3");
            this.bs5q4 = json.getString("bs5q4");
            this.bs5q401 = json.getString("bs5q401");
            this.bs5q402 = json.getString("bs5q402");
            this.bs5q403 = json.getString("bs5q403");
            this.bs5q404 = json.getString("bs5q404");
            this.bs5q496 = json.getString("bs5q496");
            this.bs5q496x = json.getString("bs5q496x");
            this.bs5q497 = json.getString("bs5q497");
            this.bs5q5 = json.getString("bs5q5");
            this.bs5q6 = json.getString("bs5q6");
            this.bs5q7 = json.getString("bs5q7");
            this.bs5q8 = json.getString("bs5q8");
            this.bs5q801 = json.getString("bs5q801");
            this.bs5q802 = json.getString("bs5q802");
            this.bs5q803 = json.getString("bs5q803");
            this.bs5q804 = json.getString("bs5q804");
            this.bs5q805 = json.getString("bs5q805");
            this.bs5q806 = json.getString("bs5q806");
            this.bs5q807 = json.getString("bs5q807");
            this.bs5q808 = json.getString("bs5q808");
            this.bs5q896 = json.getString("bs5q896");
            this.bs5q896x = json.getString("bs5q896x");
            this.bs5q898 = json.getString("bs5q898");
            this.bs5q9 = json.getString("bs5q9");
            this.bs5q901 = json.getString("bs5q901");
            this.bs5q902 = json.getString("bs5q902");
            this.bs5q903 = json.getString("bs5q903");
            this.bs5q904 = json.getString("bs5q904");
            this.bs5q905 = json.getString("bs5q905");
            this.bs5q906 = json.getString("bs5q906");
            this.bs5q907 = json.getString("bs5q907");
            this.bs5q908 = json.getString("bs5q908");
            this.bs5q996 = json.getString("bs5q996");
            this.bs5q996x = json.getString("bs5q996x");
            this.bs5q998 = json.getString("bs5q998");
            this.bs5q10 = json.getString("bs5q10");
            this.bs5q1096x = json.getString("bs5q1096x");
            this.bs5q11 = json.getString("bs5q11");
            this.bs5q12 = json.getString("bs5q12");
        }
    }

    public void sB6Hydrate(String string) throws JSONException {
        Log.d(TAG, "sB6Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.bs6q1 = json.getString("bs6q1");
            this.bs6q1mx = json.getString("bs6q1mx");
            this.bs6q2 = json.getString("bs6q2");
            this.bs6q3 = json.getString("bs6q3");
            this.bs6q3mx = json.getString("bs6q3mx");
        }
    }

    public void sB7Hydrate(String string) throws JSONException {
        Log.d(TAG, "sB7Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.bs7q1 = json.getString("bs7q1");
            this.bs7q2line = json.getString("bs7q2line");
            this.bs7q3 = json.getString("bs7q3");
            this.bs7q4a = json.getString("bs7q4a");
            this.bs7q4b = json.getString("bs7q4b");
            this.bs7q4c = json.getString("bs7q4c");
            this.bs7q4d = json.getString("bs7q4d");
            this.bs7q4e = json.getString("bs7q4e");
            this.bs7q4f = json.getString("bs7q4f");
            this.bs7q4g = json.getString("bs7q4g");
            this.bs7q4h = json.getString("bs7q4h");
        }
    }

    public void sC1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sC1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.cs1q0101 = json.getString("cs1q0101");
            this.cs1q0102 = json.getString("cs1q0102");
            this.cs1q02 = json.getString("cs1q02");
            this.cs1q02c1 = json.getString("cs1q02c1");
            this.cs1q02c1n = json.getString("cs1q02c1n");
            this.cs1q02c1ecd = json.getString("cs1q02c1ecd");
            this.cs1q02c1cent = json.getString("cs1q02c1cent");
            this.cs1q02c2 = json.getString("cs1q02c2");
            this.cs1q02c2n = json.getString("cs1q02c2n");
            this.cs1q02c2ecd = json.getString("cs1q02c2ecd");
            this.cs1q02c2cent = json.getString("cs1q02c2cent");
            this.cs1q02c3 = json.getString("cs1q02c3");
            this.cs1q02c3n = json.getString("cs1q02c3n");
            this.cs1q02c3ecd = json.getString("cs1q02c3ecd");
            this.cs1q02c3cent = json.getString("cs1q02c3cent");
            this.cs1q02c4 = json.getString("cs1q02c4");
            this.cs1q02c4n = json.getString("cs1q02c4n");
            this.cs1q02c4ecd = json.getString("cs1q02c4ecd");
            this.cs1q02c4cent = json.getString("cs1q02c4cent");
            this.cs1q02c5 = json.getString("cs1q02c5");
            this.cs1q02c5n = json.getString("cs1q02c5n");
            this.cs1q02c5ecd = json.getString("cs1q02c5ecd");
            this.cs1q02c5cent = json.getString("cs1q02c5cent");
            this.cs1q8 = json.getString("cs1q8");
            this.cs1q8096x = json.getString("cs1q8096x");
            this.cs1q9 = json.getString("cs1q9");
            this.cs1q9096x = json.getString("cs1q9096x");
            this.cs1q10 = json.getString("cs1q10");
            this.cs1q11 = json.getString("cs1q11");
            this.cs1q11096x = json.getString("cs1q11096x");
        }
    }

    public void sC2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sC2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.cs2q01 = json.getString("cs2q01");
            this.cs2q02 = json.getString("cs2q02");
            this.cs2q05 = json.getString("cs2q05");
            this.cs2q0596x = json.getString("cs2q0596x");
            this.cs2q06 = json.getString("cs2q06");
            this.cs2q0696x = json.getString("cs2q0696x");
            this.cs2q07 = json.getString("cs2q07");
            this.cs2q0801 = json.getString("cs2q0801");
            this.cs2q08021 = json.getString("cs2q08021");
            this.cs2q08022 = json.getString("cs2q08022");
            this.cs2q08023 = json.getString("cs2q08023");
            this.cs2q08024 = json.getString("cs2q08024");
            this.cs2q0803 = json.getString("cs2q0803");
            this.cs2q0804 = json.getString("cs2q0804");
            this.cs2q0805 = json.getString("cs2q0805");
            this.cs2q0806 = json.getString("cs2q0806");
            this.cs2q0807 = json.getString("cs2q0807");
            this.cs2q08081 = json.getString("cs2q08081");
            this.cs2q08082 = json.getString("cs2q08082");
            this.cs2q08083 = json.getString("cs2q08083");
            this.cs2q0809 = json.getString("cs2q0809");
            this.cs2q0810 = json.getString("cs2q0810");
            this.cs2q0811 = json.getString("cs2q0811");
            this.cs2q0812 = json.getString("cs2q0812");
            this.cs2q0813 = json.getString("cs2q0813");
            this.cs2q0814 = json.getString("cs2q0814");
            this.cs2q0815 = json.getString("cs2q0815");
            this.cs2q0816 = json.getString("cs2q0816");
            this.cs2q0817 = json.getString("cs2q0817");
            this.cs2q0818 = json.getString("cs2q0818");
            this.cs2q0819 = json.getString("cs2q0819");
            this.cs2q0820 = json.getString("cs2q0820");
        }
    }

    public void sC31Hydrate(String string) throws JSONException {
        Log.d(TAG, "sC31Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.cs3aq01 = json.getString("cs3aq01");
            this.cs3aq02 = json.getString("cs3aq02");
            this.cs3aq03 = json.getString("cs3aq03");
            this.cs3aq04 = json.getString("cs3aq04");
        }
    }

    public void sC32Hydrate(String string) throws JSONException {
        Log.d(TAG, "sC32Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.cs3bq01 = json.getString("cs3bq01");
            this.cs3bq0101x = json.getString("cs3bq0101x");
            this.cs3bq02a = json.getString("cs3bq02a");
            this.cs3bq02b = json.getString("cs3bq02b");
            this.cs3bq02c = json.getString("cs3bq02c");
            this.cs3bq03 = json.getString("cs3bq03");
            this.cs3bq0301x = json.getString("cs3bq0301x");
            this.cs3bq03a = json.getString("cs3bq03a");
            this.cs3bq03adx = json.getString("cs3bq03adx");
            this.cs3bq03b = json.getString("cs3bq03b");
            this.cs3bq03bdx = json.getString("cs3bq03bdx");
            this.cs3bq04 = json.getString("cs3bq04");
            this.cs3bq05 = json.getString("cs3bq05");
            this.cs3bq05a = json.getString("cs3bq05a");
            this.cs3bq05aa = json.getString("cs3bq05aa");
            this.cs3bq05ab = json.getString("cs3bq05ab");
            this.cs3bq05ax = json.getString("cs3bq05ax");
            this.cs3bq05a97 = json.getString("cs3bq05a97");
            this.cs3bq05b = json.getString("cs3bq05b");
            this.cs3bq05ba = json.getString("cs3bq05ba");
            this.cs3bq05bb = json.getString("cs3bq05bb");
            this.cs3bq05bx = json.getString("cs3bq05bx");
            this.cs3bq05b97 = json.getString("cs3bq05b97");
            this.cs3bq05c = json.getString("cs3bq05c");
            this.cs3bq05ca = json.getString("cs3bq05ca");
            this.cs3bq05cb = json.getString("cs3bq05cb");
            this.cs3bq05cx = json.getString("cs3bq05cx");
            this.cs3bq05c97 = json.getString("cs3bq05c97");
            this.cs3bq05d = json.getString("cs3bq05d");
            this.cs3bq05da = json.getString("cs3bq05da");
            this.cs3bq05db = json.getString("cs3bq05db");
            this.cs3bq05dx = json.getString("cs3bq05dx");
            this.cs3bq05d97 = json.getString("cs3bq05d97");
            this.cs3bq05e = json.getString("cs3bq05e");
            this.cs3bq05ea = json.getString("cs3bq05ea");
            this.cs3bq05eb = json.getString("cs3bq05eb");
            this.cs3bq05ex = json.getString("cs3bq05ex");
            this.cs3bq05e97 = json.getString("cs3bq05e97");
            this.cs3bq05f = json.getString("cs3bq05f");
            this.cs3bq05fa = json.getString("cs3bq05fa");
            this.cs3bq05fb = json.getString("cs3bq05fb");
            this.cs3bq05fx = json.getString("cs3bq05fx");
            this.cs3bq05f97 = json.getString("cs3bq05f97");
            this.cs3bq06 = json.getString("cs3bq06");
            this.cs3bq07 = json.getString("cs3bq07");
            this.cs3bq08 = json.getString("cs3bq08");
            this.cs3bq09 = json.getString("cs3bq09");
            this.cs3bq10 = json.getString("cs3bq10");
            this.cs3bq11 = json.getString("cs3bq11");
            this.cs3bq12 = json.getString("cs3bq12");
            this.cs3bq13 = json.getString("cs3bq13");
            this.cs3bq14 = json.getString("cs3bq14");
            this.cs3bq15 = json.getString("cs3bq15");
            this.cs3bq16 = json.getString("cs3bq16");
        }
    }

    public void sC4Hydrate(String string) throws JSONException {
        Log.d(TAG, "sC4Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.cs4q01 = json.getString("cs4q01");
            this.cs4q02a = json.getString("cs4q02a");
            this.cs4q02b = json.getString("cs4q02b");
            this.cs4q02c = json.getString("cs4q02c");
            this.cs4q02d = json.getString("cs4q02d");
            this.cs4q02e = json.getString("cs4q02e");
            this.cs4q02f = json.getString("cs4q02f");
            this.cs4q02g = json.getString("cs4q02g");
            this.cs4q02h = json.getString("cs4q02h");
            this.cs4q02i = json.getString("cs4q02i");
            this.cs4q02j = json.getString("cs4q02j");
            this.cs4q02k = json.getString("cs4q02k");
            this.cs4q03 = json.getString("cs4q03");
        }
    }

    public void sC5Hydrate(String string) throws JSONException {
        Log.d(TAG, "sC5Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.cs5q01 = json.getString("cs5q01");
            this.cs5q02 = json.getString("cs5q02");
            this.cs5q03 = json.getString("cs5q03");
            this.cs5q04 = json.getString("cs5q04");
            this.cs5q05 = json.getString("cs5q05");
            this.cs5q06a = json.getString("cs5q06a");
            this.cs5q06b = json.getString("cs5q06b");
            this.cs5q07 = json.getString("cs5q07");
            this.cs5q08a = json.getString("cs5q08a");
            this.cs5q08b = json.getString("cs5q08b");
            this.cs5q09 = json.getString("cs5q09");
            this.cs5q10 = json.getString("cs5q10");
            this.cs5q11 = json.getString("cs5q11");
            this.cs5q12 = json.getString("cs5q12");
            this.cs5q13 = json.getString("cs5q13");
            this.cs5q14 = json.getString("cs5q14");
            this.cs5q15 = json.getString("cs5q15");
            this.cs5q16 = json.getString("cs5q16");
            this.cs5q17 = json.getString("cs5q17");
            this.cs5q18 = json.getString("cs5q18");
        }
    }

    public void sD1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sD1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.ds1q01 = json.getString("ds1q01");
            this.ds1q02 = json.getString("ds1q02");
            this.ds1q03a = json.getString("ds1q03a");
            this.ds1q03b = json.getString("ds1q03b");
            this.ds1q03c = json.getString("ds1q03c");
            this.ds1q03d = json.getString("ds1q03d");
            this.ds1q03e = json.getString("ds1q03e");
            this.ds1q03f = json.getString("ds1q03f");
            this.ds1q04 = json.getString("ds1q04");
        }
    }

    public void sD2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sD2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.ds2q01a = json.getString("ds2q01a");
            this.ds2q01b = json.getString("ds2q01b");
            this.ds2q01c = json.getString("ds2q01c");
        }
    }

    public void sD3Hydrate(String string) throws JSONException {
        Log.d(TAG, "sD3Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.ds3q01 = json.getString("ds3q01");
            this.ds3q02 = json.getString("ds3q02");
            this.ds3q03a = json.getString("ds3q03a");
            this.ds3q03b = json.getString("ds3q03b");
            this.ds3q03c = json.getString("ds3q03c");
            this.ds3q03d = json.getString("ds3q03d");
            this.ds3q03e = json.getString("ds3q03e");
            this.ds3q03f = json.getString("ds3q03f");
            this.ds3q03g = json.getString("ds3q03g");
        }
    }

    public void sE1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sE1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.es1resp = json.getString("es1resp");
            this.es1respline = json.getString("es1respline");
            this.es1cons = json.getString("es1cons");
            this.es1q1 = json.getString("es1q1");
            this.es1q196x = json.getString("es1q196x");
            this.es1q2 = json.getString("es1q2");
            this.es1q3 = json.getString("es1q3");
            this.es1q4 = json.getString("es1q4");
            this.es1q405 = json.getString("es1q405");
            this.es1q406 = json.getString("es1q406");
            this.es1q407 = json.getString("es1q407");
            this.es1q408 = json.getString("es1q408");
            this.es1q409 = json.getString("es1q409");
            this.es1q496 = json.getString("es1q496");
            this.es1q496x = json.getString("es1q496x");
            this.es1q5 = json.getString("es1q5");
            this.es1q6 = json.getString("es1q6");
            this.es1q7 = json.getString("es1q7");
            this.es1q8a = json.getString("es1q8a");
            this.es1q8b = json.getString("es1q8b");
            this.es1q8c = json.getString("es1q8c");
            this.es1q9 = json.getString("es1q9");
            this.es1q10 = json.getString("es1q10");
            this.es1q11 = json.getString("es1q11");
        }
    }

    public void sE2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sE2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.es2q1 = json.getString("es2q1");
            this.es2q2 = json.getString("es2q2");
            this.es2q3 = json.getString("es2q3");
            this.es2q4 = json.getString("es2q4");
            this.es2q5 = json.getString("es2q5");
            this.es2q6 = json.getString("es2q6");
            this.es2q7 = json.getString("es2q7");
            this.es2q8 = json.getString("es2q8");
            this.es2q9 = json.getString("es2q9");
            this.es2q10 = json.getString("es2q10");
            this.es2q196x = json.getString("es2q196x");
        }
    }

    public void sE3Hydrate(String string) throws JSONException {
        Log.d(TAG, "sE3Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.es3q1 = json.getString("es3q1");
            this.es3q2 = json.getString("es3q2");
            this.es3q296x = json.getString("es3q296x");
            this.es3q3 = json.getString("es3q3");
            this.es3q396x = json.getString("es3q396x");
            this.es3q4 = json.getString("es3q4");
            this.es3q5 = json.getString("es3q5");
            this.es3q501 = json.getString("es3q501");
            this.es3q502 = json.getString("es3q502");
            this.es3q503 = json.getString("es3q503");
            this.es3q504 = json.getString("es3q504");
            this.es3q505 = json.getString("es3q505");
            this.es3q506 = json.getString("es3q506");
            this.es3q507 = json.getString("es3q507");
            this.es3q596 = json.getString("es3q596");
            this.es3q596x = json.getString("es3q596x");
            this.es3q6 = json.getString("es3q6");
            this.es3q7 = json.getString("es3q7");
            this.es3q8 = json.getString("es3q8");
            this.es3q9 = json.getString("es3q9");
            this.es3q901 = json.getString("es3q901");
            this.es3q902 = json.getString("es3q902");
            this.es3q903 = json.getString("es3q903");
            this.es3q904 = json.getString("es3q904");
            this.es3q905 = json.getString("es3q905");
            this.es3q906 = json.getString("es3q906");
            this.es3q907 = json.getString("es3q907");
            this.es3q908 = json.getString("es3q908");
            this.es3q996 = json.getString("es3q996");
            this.es3q996x = json.getString("es3q996x");
            this.es3q998 = json.getString("es3q998");
            this.es3q10 = json.getString("es3q10");
            this.es3q1001 = json.getString("es3q1001");
            this.es3q1002 = json.getString("es3q1002");
            this.es3q1003 = json.getString("es3q1003");
            this.es3q1004 = json.getString("es3q1004");
            this.es3q1005 = json.getString("es3q1005");
            this.es3q1006 = json.getString("es3q1006");
            this.es3q1007 = json.getString("es3q1007");
            this.es3q1008 = json.getString("es3q1008");
            this.es3q196 = json.getString("es3q196");
            this.es3q196x = json.getString("es3q196x");
            this.es3q1098 = json.getString("es3q1098");
            this.es3q11 = json.getString("es3q11");
            this.es3q1106x = json.getString("es3q1106x");
            this.es3q12 = json.getString("es3q12");
            this.es3q13 = json.getString("es3q13");
            this.es3q14 = json.getString("es3q14");
        }
    }

    public void sE4Hydrate(String string) throws JSONException {
        Log.d(TAG, "sE4Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.es4q1 = json.getString("es4q1");
            this.es4q101 = json.getString("es4q101");
            this.es4q102 = json.getString("es4q102");
            this.es4q103 = json.getString("es4q103");
            this.es4q104 = json.getString("es4q104");
            this.es4q105 = json.getString("es4q105");
            this.es4q106 = json.getString("es4q106");
            this.es4q107 = json.getString("es4q107");
            this.es4q196 = json.getString("es4q196");
            this.es4q196x = json.getString("es4q196x");
            this.es4q197 = json.getString("es4q197");
            this.es4q198 = json.getString("es4q198");
            this.es4q2 = json.getString("es4q2");
            this.es4q3 = json.getString("es4q3");
            this.es4q301 = json.getString("es4q301");
            this.es4q302 = json.getString("es4q302");
            this.es4q303 = json.getString("es4q303");
            this.es4q304 = json.getString("es4q304");
            this.es4q305 = json.getString("es4q305");
            this.es4q306 = json.getString("es4q306");
            this.es4q307 = json.getString("es4q307");
            this.es4q396 = json.getString("es4q396");
            this.es4q396x = json.getString("es4q396x");
            this.es4q398 = json.getString("es4q398");
            this.es4q4 = json.getString("es4q4");
            this.es4q401 = json.getString("es4q401");
            this.es4q402 = json.getString("es4q402");
            this.es4q403 = json.getString("es4q403");
            this.es4q404 = json.getString("es4q404");
            this.es4q496 = json.getString("es4q496");
            this.es4q496x = json.getString("es4q496x");
            this.es4q498 = json.getString("es4q498");
            this.es4q5 = json.getString("es4q5");
            this.es4q501 = json.getString("es4q501");
            this.es4q502 = json.getString("es4q502");
            this.es4q503 = json.getString("es4q503");
            this.es4q504 = json.getString("es4q504");
            this.es4q505 = json.getString("es4q505");
            this.es4q506 = json.getString("es4q506");
            this.es4q507 = json.getString("es4q507");
            this.es4q508 = json.getString("es4q508");
            this.es4q509 = json.getString("es4q509");
            this.es4q596 = json.getString("es4q596");
            this.es4q596x = json.getString("es4q596x");
            this.es4q598 = json.getString("es4q598");
            this.es4q6 = json.getString("es4q6");
            this.es4q601 = json.getString("es4q601");
            this.es4q602 = json.getString("es4q602");
            this.es4q603 = json.getString("es4q603");
            this.es4q604 = json.getString("es4q604");
            this.es4q605 = json.getString("es4q605");
            this.es4q696 = json.getString("es4q696");
            this.es4q696x = json.getString("es4q696x");
            this.es4q698 = json.getString("es4q698");
            this.es4q7 = json.getString("es4q7");
            this.es4q8 = json.getString("es4q8");
            this.es4q801 = json.getString("es4q801");
            this.es4q802 = json.getString("es4q802");
            this.es4q803 = json.getString("es4q803");
            this.es4q804 = json.getString("es4q804");
            this.es4q805 = json.getString("es4q805");
            this.es4q806 = json.getString("es4q806");
            this.es4q807 = json.getString("es4q807");
            this.es4q808 = json.getString("es4q808");
            this.es4q809 = json.getString("es4q809");
            this.es4q8010 = json.getString("es4q8010");
            this.es4q8011 = json.getString("es4q8011");
            this.es4q8012 = json.getString("es4q8012");
            this.es4q8013 = json.getString("es4q8013");
            this.es4q8014 = json.getString("es4q8014");
            this.es4q8015 = json.getString("es4q8015");
            this.es4q8016 = json.getString("es4q8016");
            this.es4q8017 = json.getString("es4q8017");
            this.es4q8018 = json.getString("es4q8018");
            this.es4q866 = json.getString("es4q866");
            this.es4q896 = json.getString("es4q896");
            this.es4q896x = json.getString("es4q896x");
        }
    }


    public String sA1toString() throws JSONException {
        Log.d(TAG, "sA1toString: ");
        JSONObject json = new JSONObject();
        json.put("as1q01", as1q01)
                .put("as1q02", as1q02)
                .put("as1q03", as1q03)
                .put("as1q04", as1q04)
                .put("as1q05", as1q05)
                .put("as1q06", as1q06)
                .put("as1q07", as1q07)
                .put("as1q08", as1q08)
                .put("as1q09", as1q09)
                .put("as1q10", as1q10)
                .put("as1q11", as1q11)
                .put("as1q12", as1q12)
                .put("as1q13", as1q13)
                .put("as1q14", as1q14)
                .put("as1q15d", as1q15d)
                .put("as1q15m", as1q15m)
                .put("as1q15y", as1q15y)
                .put("as1q16h", as1q16h)
                .put("as1q16m", as1q16m)
                .put("as1q17h", as1q17h)
                .put("as1q17m", as1q17m)
                .put("as1q18", as1q18)
                .put("as1q19", as1q19)
                .put("as1q20", as1q20)
                .put("as1q21", as1q21)
                .put("as1q22", as1q22)
                .put("as1q23", as1q23)
                .put("as1q23a", as1q23a);
        return json.toString();
    }

    public String sA2toString() throws JSONException {
        Log.d(TAG, "sA2toString: ");
        JSONObject json = new JSONObject();
        json.put("hl1", hl1)
                .put("hl2", hl2)
                .put("hl3", hl3)
                .put("hl4", hl4)
                .put("hl5d", hl5d)
                .put("hl5m", hl5m)
                .put("hl5y", hl5y)
                .put("hl6y", hl6y)
                .put("hl6m", hl6m)
                .put("hl7", hl7)
                .put("hl8", hl8)
                .put("hl9", hl9)
                .put("hl10", hl10)
                .put("hl11", hl11)
                .put("hl12", hl12)
                .put("hl1296x", hl1296x)
                .put("hl13", hl13);
        return json.toString();
    }

    public String sB1toString() throws JSONException {
        Log.d(TAG, "sB1toString: ");
        JSONObject json = new JSONObject();
        json.put("bs1resp", bs1resp)
                .put("bs1respline", bs1respline)
                .put("bs1con", bs1con)
                .put("bs1q1", bs1q1)
                .put("bs1q2", bs1q2)
                .put("bs1q3", bs1q3)
                .put("bs1q4", bs1q4)
                .put("bs1q5", bs1q5)
                .put("bs1q6", bs1q6)
                .put("bs1q7p1g", bs1q7p1g)
                .put("bs1q7p1d", bs1q7p1d)
                .put("bs1q7p1d96x", bs1q7p1d96x)
                .put("bs1q7p1b", bs1q7p1b)
                .put("bs1q7p2g", bs1q7p2g)
                .put("bs1q7p2d", bs1q7p2d)
                .put("bs1q7p2d96x", bs1q7p2d96x)
                .put("bs1q7p2b", bs1q7p2b)
                .put("bs1q7p3g", bs1q7p3g)
                .put("bs1q7p3d", bs1q7p3d)
                .put("bs1q7p3d96x", bs1q7p3d96x)
                .put("bs1q7p3b", bs1q7p3b)
                .put("bs1q7p4g", bs1q7p4g)
                .put("bs1q7p4d", bs1q7p4d)
                .put("bs1q7p4d96x", bs1q7p4d96x)
                .put("bs1q7p4b", bs1q7p4b)
                .put("bs1q7p5g", bs1q7p5g)
                .put("bs1q7p5d", bs1q7p5d)
                .put("bs1q7p5d96x", bs1q7p5d96x)
                .put("bs1q7p5b", bs1q7p5b)
                .put("bs1q08", bs1q08)
                .put("bs1q09", bs1q09)
                .put("bs1q0901", bs1q0901)
                .put("bs1q0902", bs1q0902)
                .put("bs1q0903", bs1q0903)
                .put("bs1q0904", bs1q0904)
                .put("bs1q0905", bs1q0905)
                .put("bs1q0906", bs1q0906)
                .put("bs1q0907", bs1q0907)
                .put("bs1q0908", bs1q0908)
                .put("bs1q09t296", bs1q09t296)
                .put("bs1q09t296x", bs1q09t296x)
                .put("bs1q1001", bs1q1001)
                .put("bs1q1002", bs1q1002)
                .put("bs1q1098", bs1q1098)
                .put("bs1q11", bs1q11)
                .put("bs1q12", bs1q12)
                .put("bs1q13", bs1q13)
                .put("bs1q1301", bs1q1301)
                .put("bs1q1302", bs1q1302)
                .put("bs1q1303", bs1q1303)
                .put("bs1q1304", bs1q1304)
                .put("bs1q1305", bs1q1305)
                .put("bs1q1306", bs1q1306)
                .put("bs1q1307", bs1q1307)
                .put("bs1q1308", bs1q1308)
                .put("bs1q1396", bs1q1396)
                .put("bs1q1396x", bs1q1396x);
        return json.toString();
    }

    public String sB2toString() throws JSONException {
        Log.d(TAG, "sB2toString: ");
        JSONObject json = new JSONObject();
        json.put("bs2q1", bs2q1)
                .put("bs2q2", bs2q2)
                .put("bs2q201", bs2q201)
                .put("bs2q202", bs2q202)
                .put("bs2q203", bs2q203)
                .put("bs2q204", bs2q204)
                .put("bs2q205", bs2q205)
                .put("bs2q206", bs2q206)
                .put("bs2q207", bs2q207)
                .put("bs2q208", bs2q208)
                .put("bs2q209", bs2q209)
                .put("bs2q210", bs2q210)
                .put("bs2q211", bs2q211)
                .put("bs2q212", bs2q212)
                .put("bs2q213", bs2q213)
                .put("bs2q214", bs2q214)
                .put("bs2q215", bs2q215)
                .put("bs2q216", bs2q216)
                .put("bs2q217", bs2q217)
                .put("bs2q218", bs2q218)
                .put("bs2q296", bs2q296)
                .put("bs2q296x", bs2q296x)
                .put("bs2q3", bs2q3)
                .put("bs2q4", bs2q4)
                .put("bs2q401", bs2q401)
                .put("bs2q402", bs2q402)
                .put("bs2q403", bs2q403)
                .put("bs2q404", bs2q404)
                .put("bs2q405", bs2q405)
                .put("bs2q406", bs2q406)
                .put("bs2q407", bs2q407)
                .put("bs2q408", bs2q408)
                .put("bs2q409", bs2q409)
                .put("bs2q410", bs2q410)
                .put("bs2q411", bs2q411)
                .put("bs2q412", bs2q412)
                .put("bs2q413", bs2q413)
                .put("bs2q414", bs2q414)
                .put("bs2q415", bs2q415)
                .put("bs2q416", bs2q416)
                .put("bs2q417", bs2q417)
                .put("bs2q418", bs2q418)
                .put("bs2q4096", bs2q4096)
                .put("bs2q4096x", bs2q4096x)
                .put("bs2q5", bs2q5)
                .put("bs2q6", bs2q6)
                .put("bs2q601", bs2q601)
                .put("bs2q602", bs2q602)
                .put("bs2q603", bs2q603)
                .put("bs2q604", bs2q604)
                .put("bs2q605", bs2q605)
                .put("bs2q606", bs2q606)
                .put("bs2q606x", bs2q606x)
                .put("bs2q607", bs2q607)
                .put("bs2q608", bs2q608)
                .put("bs2q609", bs2q609)
                .put("bs2q6010", bs2q6010)
                .put("bs2q6010x", bs2q6010x)
                .put("bs2q6011", bs2q6011)
                .put("bs2q6011x", bs2q6011x)
                .put("bs2q6012", bs2q6012)
                .put("bs2q6013", bs2q6013)
                .put("bs2q6014", bs2q6014)
                .put("bs2q6015", bs2q6015)
                .put("bs2q696", bs2q696)
                .put("bs2q696x", bs2q696x)
                .put("bs2q7", bs2q7)
                .put("bs2q796x", bs2q796x)
                .put("bs2q8", bs2q8)
                .put("bs2q801", bs2q801)
                .put("bs2q802", bs2q802)
                .put("bs2q803", bs2q803)
                .put("bs2q804", bs2q804)
                .put("bs2q898", bs2q898)
                .put("bs2q896", bs2q896)
                .put("bs2q896x", bs2q896x);
        return json.toString();
    }

    public String sB3toString() throws JSONException {
        Log.d(TAG, "sB3toString: ");
        JSONObject json = new JSONObject();
        json.put("bs3q1", bs3q1)
                .put("bs3q101", bs3q101)
                .put("bs3q102", bs3q102)
                .put("bs3q103", bs3q103)
                .put("bs3q104", bs3q104)
                .put("bs3q105", bs3q105)
                .put("bs3q106", bs3q106)
                .put("bs3q107", bs3q107)
                .put("bs3q197", bs3q197)
                .put("bs3q198", bs3q198)
                .put("bs3q196", bs3q196)
                .put("bs3q196x", bs3q196x)
                .put("bs3q2a", bs3q2a)
                .put("bs3q2a96x", bs3q2a96x)
                .put("bs3q2b96", bs3q2b96)
                .put("bs3q2c96", bs3q2c96)
                .put("bs3q2d96", bs3q2d96)
                .put("bs3q3", bs3q3)
                .put("bs3q4", bs3q4)
                .put("bs3q401", bs3q401)
                .put("bs3q402", bs3q402)
                .put("bs3q403", bs3q403)
                .put("bs3q404", bs3q404)
                .put("bs3q405", bs3q405)
                .put("bs3q406", bs3q406)
                .put("bs3q407", bs3q407)
                .put("bs3q496", bs3q496)
                .put("bs3q496x", bs3q496x)
                .put("bs3q498", bs3q498)
                .put("bs3q5", bs3q5)
                .put("bs3q501", bs3q501)
                .put("bs3q502", bs3q502)
                .put("bs3q503", bs3q503)
                .put("bs3q504", bs3q504)
                .put("bs3q598", bs3q598)
                .put("bs3q596", bs3q596)
                .put("bs3q596x", bs3q596x)
                .put("bs3q6", bs3q6)
                .put("bs3q601", bs3q601)
                .put("bs3q602", bs3q602)
                .put("bs3q603", bs3q603)
                .put("bs3q604", bs3q604)
                .put("bs3q605", bs3q605)
                .put("bs3q606", bs3q606)
                .put("bs3q607", bs3q607)
                .put("bs3q608", bs3q608)
                .put("bs3q609", bs3q609)
                .put("bs3q698", bs3q698)
                .put("bs3q696", bs3q696)
                .put("bs3q696x", bs3q696x)
                .put("bs3q7", bs3q7)
                .put("bs3q701", bs3q701)
                .put("bs3q702", bs3q702)
                .put("bs3q703", bs3q703)
                .put("bs3q704", bs3q704)
                .put("bs3q705", bs3q705)
                .put("bs3q798", bs3q798)
                .put("bs3q796", bs3q796)
                .put("bs3q796x", bs3q796x)
                .put("bs3q8", bs3q8)
                .put("bs3q801", bs3q801)
                .put("bs3q802", bs3q802)
                .put("bs3q803", bs3q803)
                .put("bs3q804", bs3q804)
                .put("bs3q897", bs3q897)
                .put("bs3q896", bs3q896)
                .put("bs3q896x", bs3q896x)
                .put("bs3q9", bs3q9)
                .put("bs3q901", bs3q901)
                .put("bs3q902", bs3q902)
                .put("bs3q903", bs3q903)
                .put("bs3q904", bs3q904)
                .put("bs3q905", bs3q905)
                .put("bs3q906", bs3q906)
                .put("bs3q996", bs3q996)
                .put("bs3q996x", bs3q996x)
                .put("bs3q997", bs3q997)
                .put("bs3q10", bs3q10)
                .put("bs3q1001", bs3q1001)
                .put("bs3q1002", bs3q1002)
                .put("bs3q1003", bs3q1003)
                .put("bs3q1004", bs3q1004)
                .put("bs3q1005", bs3q1005)
                .put("bs3q1006", bs3q1006)
                .put("bs3q1007", bs3q1007)
                .put("bs3q1008", bs3q1008)
                .put("bs3q1009", bs3q1009)
                .put("bs3q1096", bs3q1096)
                .put("bs3q1096x", bs3q1096x)
                .put("bs3q1097", bs3q1097)
                .put("bs3q11", bs3q11)
                .put("bs3q12", bs3q12)
                .put("bs3q1201", bs3q1201)
                .put("bs3q1202", bs3q1202)
                .put("bs3q1203", bs3q1203)
                .put("bs3q1204", bs3q1204)
                .put("bs3q1205", bs3q1205)
                .put("bs3q1206", bs3q1206)
                .put("bs3q1206x", bs3q1206x)
                .put("bs3q1207", bs3q1207)
                .put("bs3q1296", bs3q1296)
                .put("bs3q1296x", bs3q1296x)
                .put("bs3q13", bs3q13)
                .put("bs3q14", bs3q14)
                .put("bs3q15", bs3q15);
        return json.toString();
    }

    public String sB41toString() throws JSONException {
        Log.d(TAG, "sB41toString: ");
        JSONObject json = new JSONObject();
        json.put("bs4aq1", bs4aq1)
                .put("bs4aq2", bs4aq2)
                .put("bs4aq201", bs4aq201)
                .put("bs4aq202", bs4aq202)
                .put("bs4aq203", bs4aq203)
                .put("bs4aq204", bs4aq204)
                .put("bs4aq205", bs4aq205)
                .put("bs4aq206", bs4aq206)
                .put("bs4aq207", bs4aq207)
                .put("bs4aq208", bs4aq208)
                .put("bs4aq298", bs4aq298)
                .put("bs4aq296", bs4aq296)
                .put("bs4aq296x", bs4aq296x)
                .put("bs4aq3", bs4aq3)
                .put("bs4aq4", bs4aq4)
                .put("bs4aq5", bs4aq5)
                .put("bs4aq6", bs4aq6)
                .put("bs4aq696x", bs4aq696x)
                .put("bs4aq7", bs4aq7)
                .put("bs4aq8", bs4aq8)
                .put("bs4aq896x", bs4aq896x)
                .put("bs4aq9", bs4aq9)
                .put("bs4aq10", bs4aq10);
        return json.toString();
    }

    public String sB42toString() throws JSONException {
        Log.d(TAG, "sB42toString: ");
        JSONObject json = new JSONObject();
        json.put("bs4bq1", bs4bq1)
                .put("bs4bq2", bs4bq2)
                .put("bs4bq21", bs4bq21)
                .put("bs4bq22", bs4bq22)
                .put("bs4bq23", bs4bq23)
                .put("bs4bq24", bs4bq24)
                .put("bs4bq298", bs4bq298)
                .put("bs4bq296", bs4bq296)
                .put("bs4bq296x", bs4bq296x)
                .put("bs4bq3", bs4bq3)
                .put("bs4bq31", bs4bq31)
                .put("bs4bq32", bs4bq32)
                .put("bs4bq33", bs4bq33)
                .put("bs4bq34", bs4bq34)
                .put("bs4bq35", bs4bq35)
                .put("bs4bq36", bs4bq36)
                .put("bs4bq398", bs4bq398)
                .put("bs4bq396", bs4bq396)
                .put("bs4bq396x", bs4bq396x)
                .put("bs4bq4", bs4bq4)
                .put("bs4bq5", bs4bq5)
                .put("bs4bq51", bs4bq51)
                .put("bs4bq52", bs4bq52)
                .put("bs4bq53", bs4bq53)
                .put("bs4bq598", bs4bq598)
                .put("bs4bq596", bs4bq596)
                .put("bs4bq596x", bs4bq596x)
                .put("bs4bq6", bs4bq6)
                .put("bs4bq696x", bs4bq696x)
                .put("bs4bq7", bs4bq7)
                .put("bs4bq8", bs4bq8)
                .put("bs4bq81", bs4bq81)
                .put("bs4bq82", bs4bq82)
                .put("bs4bq83", bs4bq83)
                .put("bs4bq84", bs4bq84)
                .put("bs4bq85", bs4bq85)
                .put("bs4bq86", bs4bq86)
                .put("bs4bq87", bs4bq87)
                .put("bs4bq898", bs4bq898)
                .put("bs4bq896", bs4bq896)
                .put("bs4bq896x", bs4bq896x);
        return json.toString();
    }

    public String sB5toString() throws JSONException {
        Log.d(TAG, "sB5toString: ");
        JSONObject json = new JSONObject();
        json.put("bs5q1", bs5q1)
                .put("bs5q2", bs5q2)
                .put("bs5q201", bs5q201)
                .put("bs5q202", bs5q202)
                .put("bs5q203", bs5q203)
                .put("bs5q204", bs5q204)
                .put("bs5q205", bs5q205)
                .put("bs5q296", bs5q296)
                .put("bs5q296x", bs5q296x)
                .put("bs5q297", bs5q297)
                .put("bs5q3", bs5q3)
                .put("bs5q4", bs5q4)
                .put("bs5q401", bs5q401)
                .put("bs5q402", bs5q402)
                .put("bs5q403", bs5q403)
                .put("bs5q404", bs5q404)
                .put("bs5q496", bs5q496)
                .put("bs5q496x", bs5q496x)
                .put("bs5q497", bs5q497)
                .put("bs5q5", bs5q5)
                .put("bs5q6", bs5q6)
                .put("bs5q7", bs5q7)
                .put("bs5q8", bs5q8)
                .put("bs5q801", bs5q801)
                .put("bs5q802", bs5q802)
                .put("bs5q803", bs5q803)
                .put("bs5q804", bs5q804)
                .put("bs5q805", bs5q805)
                .put("bs5q806", bs5q806)
                .put("bs5q807", bs5q807)
                .put("bs5q808", bs5q808)
                .put("bs5q896", bs5q896)
                .put("bs5q896x", bs5q896x)
                .put("bs5q898", bs5q898)
                .put("bs5q9", bs5q9)
                .put("bs5q901", bs5q901)
                .put("bs5q902", bs5q902)
                .put("bs5q903", bs5q903)
                .put("bs5q904", bs5q904)
                .put("bs5q905", bs5q905)
                .put("bs5q906", bs5q906)
                .put("bs5q907", bs5q907)
                .put("bs5q908", bs5q908)
                .put("bs5q996", bs5q996)
                .put("bs5q996x", bs5q996x)
                .put("bs5q998", bs5q998)
                .put("bs5q10", bs5q10)
                .put("bs5q1096x", bs5q1096x)
                .put("bs5q11", bs5q11)
                .put("bs5q12", bs5q12);
        return json.toString();
    }

    public String sB6toString() throws JSONException {
        Log.d(TAG, "sB6toString: ");
        JSONObject json = new JSONObject();
        json.put("bs6q1", bs6q1)
                .put("bs6q1mx", bs6q1mx)
                .put("bs6q2", bs6q2)
                .put("bs6q3", bs6q3)
                .put("bs6q3mx", bs6q3mx);
        return json.toString();
    }

    public String sB7toString() throws JSONException {
        Log.d(TAG, "sB7toString: ");
        JSONObject json = new JSONObject();
        json.put("bs7q1", bs7q1)
                .put("bs7q2line", bs7q2line)
                .put("bs7q3", bs7q3)
                .put("bs7q4a", bs7q4a)
                .put("bs7q4b", bs7q4b)
                .put("bs7q4c", bs7q4c)
                .put("bs7q4d", bs7q4d)
                .put("bs7q4e", bs7q4e)
                .put("bs7q4f", bs7q4f)
                .put("bs7q4g", bs7q4g)
                .put("bs7q4h", bs7q4h);
        return json.toString();
    }

    public String sC1toString() throws JSONException {
        Log.d(TAG, "sC1toString: ");
        JSONObject json = new JSONObject();
        json.put("cs1q0101", cs1q0101)
                .put("cs1q0102", cs1q0102)
                .put("cs1q02", cs1q02)
                .put("cs1q02c1", cs1q02c1)
                .put("cs1q02c1n", cs1q02c1n)
                .put("cs1q02c1ecd", cs1q02c1ecd)
                .put("cs1q02c1cent", cs1q02c1cent)
                .put("cs1q02c2", cs1q02c2)
                .put("cs1q02c2n", cs1q02c2n)
                .put("cs1q02c2ecd", cs1q02c2ecd)
                .put("cs1q02c2cent", cs1q02c2cent)
                .put("cs1q02c3", cs1q02c3)
                .put("cs1q02c3n", cs1q02c3n)
                .put("cs1q02c3ecd", cs1q02c3ecd)
                .put("cs1q02c3cent", cs1q02c3cent)
                .put("cs1q02c4", cs1q02c4)
                .put("cs1q02c4n", cs1q02c4n)
                .put("cs1q02c4ecd", cs1q02c4ecd)
                .put("cs1q02c4cent", cs1q02c4cent)
                .put("cs1q02c5", cs1q02c5)
                .put("cs1q02c5n", cs1q02c5n)
                .put("cs1q02c5ecd", cs1q02c5ecd)
                .put("cs1q02c5cent", cs1q02c5cent)
                .put("cs1q8", cs1q8)
                .put("cs1q8096x", cs1q8096x)
                .put("cs1q9", cs1q9)
                .put("cs1q9096x", cs1q9096x)
                .put("cs1q10", cs1q10)
                .put("cs1q11", cs1q11)
                .put("cs1q11096x", cs1q11096x);
        return json.toString();
    }

    public String sC2toString() throws JSONException {
        Log.d(TAG, "sC2toString: ");
        JSONObject json = new JSONObject();
        json.put("cs2q01", cs2q01)
                .put("cs2q02", cs2q02)
                .put("cs2q05", cs2q05)
                .put("cs2q0596x", cs2q0596x)
                .put("cs2q06", cs2q06)
                .put("cs2q0696x", cs2q0696x)
                .put("cs2q07", cs2q07)
                .put("cs2q0801", cs2q0801)
                .put("cs2q08021", cs2q08021)
                .put("cs2q08022", cs2q08022)
                .put("cs2q08023", cs2q08023)
                .put("cs2q08024", cs2q08024)
                .put("cs2q0803", cs2q0803)
                .put("cs2q0804", cs2q0804)
                .put("cs2q0805", cs2q0805)
                .put("cs2q0806", cs2q0806)
                .put("cs2q0807", cs2q0807)
                .put("cs2q08081", cs2q08081)
                .put("cs2q08082", cs2q08082)
                .put("cs2q08083", cs2q08083)
                .put("cs2q0809", cs2q0809)
                .put("cs2q0810", cs2q0810)
                .put("cs2q0811", cs2q0811)
                .put("cs2q0812", cs2q0812)
                .put("cs2q0813", cs2q0813)
                .put("cs2q0814", cs2q0814)
                .put("cs2q0815", cs2q0815)
                .put("cs2q0816", cs2q0816)
                .put("cs2q0817", cs2q0817)
                .put("cs2q0818", cs2q0818)
                .put("cs2q0819", cs2q0819)
                .put("cs2q0820", cs2q0820);
        return json.toString();
    }

    public String sC31toString() throws JSONException {
        Log.d(TAG, "sC31toString: ");
        JSONObject json = new JSONObject();
        json.put("cs3aq01", cs3aq01)
                .put("cs3aq02", cs3aq02)
                .put("cs3aq03", cs3aq03)
                .put("cs3aq04", cs3aq04);
        return json.toString();
    }

    public String sC32toString() throws JSONException {
        Log.d(TAG, "sC32toString: ");
        JSONObject json = new JSONObject();
        json.put("cs3bq01", cs3bq01)
                .put("cs3bq0101x", cs3bq0101x)
                .put("cs3bq02a", cs3bq02a)
                .put("cs3bq02b", cs3bq02b)
                .put("cs3bq02c", cs3bq02c)
                .put("cs3bq03", cs3bq03)
                .put("cs3bq0301x", cs3bq0301x)
                .put("cs3bq03a", cs3bq03a)
                .put("cs3bq03adx", cs3bq03adx)
                .put("cs3bq03b", cs3bq03b)
                .put("cs3bq03bdx", cs3bq03bdx)
                .put("cs3bq04", cs3bq04)
                .put("cs3bq05", cs3bq05)
                .put("cs3bq05a", cs3bq05a)
                .put("cs3bq05aa", cs3bq05aa)
                .put("cs3bq05ab", cs3bq05ab)
                .put("cs3bq05ax", cs3bq05ax)
                .put("cs3bq05a97", cs3bq05a97)
                .put("cs3bq05b", cs3bq05b)
                .put("cs3bq05ba", cs3bq05ba)
                .put("cs3bq05bb", cs3bq05bb)
                .put("cs3bq05bx", cs3bq05bx)
                .put("cs3bq05b97", cs3bq05b97)
                .put("cs3bq05c", cs3bq05c)
                .put("cs3bq05ca", cs3bq05ca)
                .put("cs3bq05cb", cs3bq05cb)
                .put("cs3bq05cx", cs3bq05cx)
                .put("cs3bq05c97", cs3bq05c97)
                .put("cs3bq05d", cs3bq05d)
                .put("cs3bq05da", cs3bq05da)
                .put("cs3bq05db", cs3bq05db)
                .put("cs3bq05dx", cs3bq05dx)
                .put("cs3bq05d97", cs3bq05d97)
                .put("cs3bq05e", cs3bq05e)
                .put("cs3bq05ea", cs3bq05ea)
                .put("cs3bq05eb", cs3bq05eb)
                .put("cs3bq05ex", cs3bq05ex)
                .put("cs3bq05e97", cs3bq05e97)
                .put("cs3bq05f", cs3bq05f)
                .put("cs3bq05fa", cs3bq05fa)
                .put("cs3bq05fb", cs3bq05fb)
                .put("cs3bq05fx", cs3bq05fx)
                .put("cs3bq05f97", cs3bq05f97)
                .put("cs3bq06", cs3bq06)
                .put("cs3bq07", cs3bq07)
                .put("cs3bq08", cs3bq08)
                .put("cs3bq09", cs3bq09)
                .put("cs3bq10", cs3bq10)
                .put("cs3bq11", cs3bq11)
                .put("cs3bq12", cs3bq12)
                .put("cs3bq13", cs3bq13)
                .put("cs3bq14", cs3bq14)
                .put("cs3bq15", cs3bq15)
                .put("cs3bq16", cs3bq16);
        return json.toString();
    }

    public String sC4toString() throws JSONException {
        Log.d(TAG, "sC4toString: ");
        JSONObject json = new JSONObject();
        json.put("cs4q01", cs4q01)
                .put("cs4q02a", cs4q02a)
                .put("cs4q02b", cs4q02b)
                .put("cs4q02c", cs4q02c)
                .put("cs4q02d", cs4q02d)
                .put("cs4q02e", cs4q02e)
                .put("cs4q02f", cs4q02f)
                .put("cs4q02g", cs4q02g)
                .put("cs4q02h", cs4q02h)
                .put("cs4q02i", cs4q02i)
                .put("cs4q02j", cs4q02j)
                .put("cs4q02k", cs4q02k)
                .put("cs4q03", cs4q03);
        return json.toString();
    }

    public String sC5toString() throws JSONException {
        Log.d(TAG, "sC5toString: ");
        JSONObject json = new JSONObject();
        json.put("cs5q01", cs5q01)
                .put("cs5q02", cs5q02)
                .put("cs5q03", cs5q03)
                .put("cs5q04", cs5q04)
                .put("cs5q05", cs5q05)
                .put("cs5q06a", cs5q06a)
                .put("cs5q06b", cs5q06b)
                .put("cs5q07", cs5q07)
                .put("cs5q08a", cs5q08a)
                .put("cs5q08b", cs5q08b)
                .put("cs5q09", cs5q09)
                .put("cs5q10", cs5q10)
                .put("cs5q11", cs5q11)
                .put("cs5q12", cs5q12)
                .put("cs5q13", cs5q13)
                .put("cs5q14", cs5q14)
                .put("cs5q15", cs5q15)
                .put("cs5q16", cs5q16)
                .put("cs5q17", cs5q17)
                .put("cs5q18", cs5q18);
        return json.toString();
    }

    public String sD1toString() throws JSONException {
        Log.d(TAG, "sD1toString: ");
        JSONObject json = new JSONObject();
        json.put("ds1q01", ds1q01)
                .put("ds1q02", ds1q02)
                .put("ds1q03a", ds1q03a)
                .put("ds1q03b", ds1q03b)
                .put("ds1q03c", ds1q03c)
                .put("ds1q03d", ds1q03d)
                .put("ds1q03e", ds1q03e)
                .put("ds1q03f", ds1q03f)
                .put("ds1q04", ds1q04);
        return json.toString();
    }

    public String sD2toString() throws JSONException {
        Log.d(TAG, "sD2toString: ");
        JSONObject json = new JSONObject();
        json.put("ds2q01a", ds2q01a)
                .put("ds2q01b", ds2q01b)
                .put("ds2q01c", ds2q01c);
        return json.toString();
    }

    public String sD3toString() throws JSONException {
        Log.d(TAG, "sD3toString: ");
        JSONObject json = new JSONObject();
        json.put("ds3q01", ds3q01)
                .put("ds3q02", ds3q02)
                .put("ds3q03a", ds3q03a)
                .put("ds3q03b", ds3q03b)
                .put("ds3q03c", ds3q03c)
                .put("ds3q03d", ds3q03d)
                .put("ds3q03e", ds3q03e)
                .put("ds3q03f", ds3q03f)
                .put("ds3q03g", ds3q03g);
        return json.toString();
    }

    public String sE1toString() throws JSONException {
        Log.d(TAG, "sE1toString: ");
        JSONObject json = new JSONObject();
        json.put("es1resp", es1resp)
                .put("es1respline", es1respline)
                .put("es1cons", es1cons)
                .put("es1q1", es1q1)
                .put("es1q196x", es1q196x)
                .put("es1q2", es1q2)
                .put("es1q3", es1q3)
                .put("es1q4", es1q4)
                .put("es1q405", es1q405)
                .put("es1q406", es1q406)
                .put("es1q407", es1q407)
                .put("es1q408", es1q408)
                .put("es1q409", es1q409)
                .put("es1q496", es1q496)
                .put("es1q496x", es1q496x)
                .put("es1q5", es1q5)
                .put("es1q6", es1q6)
                .put("es1q7", es1q7)
                .put("es1q8a", es1q8a)
                .put("es1q8b", es1q8b)
                .put("es1q8c", es1q8c)
                .put("es1q9", es1q9)
                .put("es1q10", es1q10)
                .put("es1q11", es1q11);
        return json.toString();
    }

    public String sE2toString() throws JSONException {
        Log.d(TAG, "sE2toString: ");
        JSONObject json = new JSONObject();
        json.put("es2q1", es2q1)
                .put("es2q2", es2q2)
                .put("es2q3", es2q3)
                .put("es2q4", es2q4)
                .put("es2q5", es2q5)
                .put("es2q6", es2q6)
                .put("es2q7", es2q7)
                .put("es2q8", es2q8)
                .put("es2q9", es2q9)
                .put("es2q10", es2q10)
                .put("es2q196x", es2q196x);
        return json.toString();
    }

    public String sE3toString() throws JSONException {
        Log.d(TAG, "sE3toString: ");
        JSONObject json = new JSONObject();
        json.put("es3q1", es3q1)
                .put("es3q2", es3q2)
                .put("es3q296x", es3q296x)
                .put("es3q3", es3q3)
                .put("es3q396x", es3q396x)
                .put("es3q4", es3q4)
                .put("es3q5", es3q5)
                .put("es3q501", es3q501)
                .put("es3q502", es3q502)
                .put("es3q503", es3q503)
                .put("es3q504", es3q504)
                .put("es3q505", es3q505)
                .put("es3q506", es3q506)
                .put("es3q507", es3q507)
                .put("es3q596", es3q596)
                .put("es3q596x", es3q596x)
                .put("es3q6", es3q6)
                .put("es3q7", es3q7)
                .put("es3q8", es3q8)
                .put("es3q9", es3q9)
                .put("es3q901", es3q901)
                .put("es3q902", es3q902)
                .put("es3q903", es3q903)
                .put("es3q904", es3q904)
                .put("es3q905", es3q905)
                .put("es3q906", es3q906)
                .put("es3q907", es3q907)
                .put("es3q908", es3q908)
                .put("es3q996", es3q996)
                .put("es3q996x", es3q996x)
                .put("es3q998", es3q998)
                .put("es3q10", es3q10)
                .put("es3q1001", es3q1001)
                .put("es3q1002", es3q1002)
                .put("es3q1003", es3q1003)
                .put("es3q1004", es3q1004)
                .put("es3q1005", es3q1005)
                .put("es3q1006", es3q1006)
                .put("es3q1007", es3q1007)
                .put("es3q1008", es3q1008)
                .put("es3q196", es3q196)
                .put("es3q196x", es3q196x)
                .put("es3q1098", es3q1098)
                .put("es3q11", es3q11)
                .put("es3q1106x", es3q1106x)
                .put("es3q12", es3q12)
                .put("es3q13", es3q13)
                .put("es3q14", es3q14);
        return json.toString();
    }

    public String sE4toString() throws JSONException {
        Log.d(TAG, "sE4toString: ");
        JSONObject json = new JSONObject();
        json.put("es4q1", es4q1)
                .put("es4q101", es4q101)
                .put("es4q102", es4q102)
                .put("es4q103", es4q103)
                .put("es4q104", es4q104)
                .put("es4q105", es4q105)
                .put("es4q106", es4q106)
                .put("es4q107", es4q107)
                .put("es4q196", es4q196)
                .put("es4q196x", es4q196x)
                .put("es4q197", es4q197)
                .put("es4q198", es4q198)
                .put("es4q2", es4q2)
                .put("es4q3", es4q3)
                .put("es4q301", es4q301)
                .put("es4q302", es4q302)
                .put("es4q303", es4q303)
                .put("es4q304", es4q304)
                .put("es4q305", es4q305)
                .put("es4q306", es4q306)
                .put("es4q307", es4q307)
                .put("es4q396", es4q396)
                .put("es4q396x", es4q396x)
                .put("es4q398", es4q398)
                .put("es4q4", es4q4)
                .put("es4q401", es4q401)
                .put("es4q402", es4q402)
                .put("es4q403", es4q403)
                .put("es4q404", es4q404)
                .put("es4q496", es4q496)
                .put("es4q496x", es4q496x)
                .put("es4q498", es4q498)
                .put("es4q5", es4q5)
                .put("es4q501", es4q501)
                .put("es4q502", es4q502)
                .put("es4q503", es4q503)
                .put("es4q504", es4q504)
                .put("es4q505", es4q505)
                .put("es4q506", es4q506)
                .put("es4q507", es4q507)
                .put("es4q508", es4q508)
                .put("es4q509", es4q509)
                .put("es4q596", es4q596)
                .put("es4q596x", es4q596x)
                .put("es4q598", es4q598)
                .put("es4q6", es4q6)
                .put("es4q601", es4q601)
                .put("es4q602", es4q602)
                .put("es4q603", es4q603)
                .put("es4q604", es4q604)
                .put("es4q605", es4q605)
                .put("es4q696", es4q696)
                .put("es4q696x", es4q696x)
                .put("es4q698", es4q698)
                .put("es4q7", es4q7)
                .put("es4q8", es4q8)
                .put("es4q801", es4q801)
                .put("es4q802", es4q802)
                .put("es4q803", es4q803)
                .put("es4q804", es4q804)
                .put("es4q805", es4q805)
                .put("es4q806", es4q806)
                .put("es4q807", es4q807)
                .put("es4q808", es4q808)
                .put("es4q809", es4q809)
                .put("es4q8010", es4q8010)
                .put("es4q8011", es4q8011)
                .put("es4q8012", es4q8012)
                .put("es4q8013", es4q8013)
                .put("es4q8014", es4q8014)
                .put("es4q8015", es4q8015)
                .put("es4q8016", es4q8016)
                .put("es4q8017", es4q8017)
                .put("es4q8018", es4q8018)
                .put("es4q866", es4q866)
                .put("es4q896", es4q896)
                .put("es4q896x", es4q896x);
        return json.toString();
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(FormsTable.COLUMN_ID, this.id);
        json.put(FormsTable.COLUMN_UID, this.uid);
        json.put(FormsTable.COLUMN_ENUM_BLOCK, this.ebCode);
        json.put(FormsTable.COLUMN_HHID, this.hhid);
        json.put(FormsTable.COLUMN_SNO, this.sno);
        json.put(FormsTable.COLUMN_USERNAME, this.userName);
        json.put(FormsTable.COLUMN_SYSDATE, this.sysDate);
        json.put(FormsTable.COLUMN_DEVICEID, this.deviceId);
        json.put(FormsTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(FormsTable.COLUMN_ISTATUS, this.iStatus);
        json.put(FormsTable.COLUMN_SA1, new JSONObject(sA1toString()));
        json.put(FormsTable.COLUMN_SA2, new JSONObject(sA2toString()));
        json.put(FormsTable.COLUMN_SB1, new JSONObject(sB1toString()));
        json.put(FormsTable.COLUMN_SB2, new JSONObject(sB2toString()));
        json.put(FormsTable.COLUMN_SB3, new JSONObject(sB3toString()));
        json.put(FormsTable.COLUMN_SB41, new JSONObject(sB41toString()));
        json.put(FormsTable.COLUMN_SB42, new JSONObject(sB42toString()));
        json.put(FormsTable.COLUMN_SB5, new JSONObject(sB5toString()));
        json.put(FormsTable.COLUMN_SB6, new JSONObject(sB6toString()));
        json.put(FormsTable.COLUMN_SB7, new JSONObject(sB7toString()));
        json.put(FormsTable.COLUMN_SC1, new JSONObject(sC1toString()));
        json.put(FormsTable.COLUMN_SC2, new JSONObject(sC2toString()));
        json.put(FormsTable.COLUMN_SC31, new JSONObject(sC31toString()));
        json.put(FormsTable.COLUMN_SC32, new JSONObject(sC32toString()));
        json.put(FormsTable.COLUMN_SC4, new JSONObject(sC4toString()));
        json.put(FormsTable.COLUMN_SC5, new JSONObject(sC5toString()));
        json.put(FormsTable.COLUMN_SD1, new JSONObject(sD1toString()));
        json.put(FormsTable.COLUMN_SD2, new JSONObject(sD2toString()));
        json.put(FormsTable.COLUMN_SD3, new JSONObject(sD3toString()));
        json.put(FormsTable.COLUMN_SE1, new JSONObject(sE1toString()));
        json.put(FormsTable.COLUMN_SE2, new JSONObject(sE2toString()));
        json.put(FormsTable.COLUMN_SE3, new JSONObject(sE3toString()));
        json.put(FormsTable.COLUMN_SE4, new JSONObject(sE4toString()));
        return json;
    }


}
