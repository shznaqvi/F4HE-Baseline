package edu.aku.hassannaqvi.f4he_baseline.models;

import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp._EMPTY_;
import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.selectedMWRA;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import org.json.JSONException;
import org.json.JSONObject;

import java.time.LocalDate;

import edu.aku.hassannaqvi.f4he_baseline.BR;
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts;
import edu.aku.hassannaqvi.f4he_baseline.core.MainApp;

public class MWRA extends BaseObservable implements Observable {

    private final String TAG = "MWRA";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    //Not saving in DB
    private final LocalDate localDate = null;
    private final boolean exist = false;
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String uuid = _EMPTY_;
    private String fmuid = _EMPTY_;
   // private String muid = _EMPTY_;
    private String cluster = _EMPTY_;
    private String hhid = _EMPTY_;
    private String sno = _EMPTY_;
    private String psuCode = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    private String indexed = _EMPTY_;
    private String deviceId = _EMPTY_;
    private String deviceTag = _EMPTY_;
    private String appver = _EMPTY_;
    private String endTime = _EMPTY_;
    private String iStatus = _EMPTY_;
    private String iStatus96x = _EMPTY_;
    private String synced = _EMPTY_;
    private String syncDate = _EMPTY_;

    //Section Vaiables
    private String sB1 = _EMPTY_;
    private String sB2 = _EMPTY_;
    private String sB3 = _EMPTY_;
    private String sB41 = _EMPTY_;
    private String sB42 = _EMPTY_;
    private String sB5 = _EMPTY_;
    private String sB6 = _EMPTY_;
    private String sB7 = _EMPTY_;


    // Field Variables bs1
    private String bs1resp = _EMPTY_;
    private String bs1respline = _EMPTY_;
    private String bs1con = _EMPTY_;
    private String bs1q1 = _EMPTY_;
    private String bs1q2 = _EMPTY_;
    private String bs1q3 = _EMPTY_;
    private String bs1q4 = _EMPTY_;
    private String bs1q5 = _EMPTY_;
    private String bs1q6 = _EMPTY_;
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
    private String bs2q466 = _EMPTY_;
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
    private String bs3q2b = _EMPTY_;
    private String bs3q2b96x = _EMPTY_;
    private String bs3q2c = _EMPTY_;
    private String bs3q2c96x = _EMPTY_;
    private String bs3q2d = _EMPTY_;
    private String bs3q2d96x = _EMPTY_;
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

/*    // DS1

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
    private String ds3q03g = _EMPTY_;*/


    // Constructor
    public void Mwra() {


    }


    public void populateMeta() {

        setSysDate(MainApp.form.getSysDate());
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setUuid(MainApp.form.getUid());  // not applicable in Form table
        setFmuid(MainApp.familyList.get(Integer.parseInt(selectedMWRA) - 1).getUid()); //// not applicable in Form table
        // setMuid(MainApp.familyList.get(Integer.parseInt(selectedMWRA) - 1).getUid());  // not applicable in Form table
        setSno(selectedMWRA);
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
        setpsuCode(MainApp.selectedPSU);
        setHhid(MainApp.selectedHHID);

    }


    public String getProjectName() {
        return projectName;
    }

    public String getId() {
        return id;
    }

    public String getUid() {
        return uid;
    }

    public String getUuid() {
        return uuid;
    }

    public String getFmuid() {
        return fmuid;
    }

    public void setFmuid(String fmuid) {
        this.fmuid = fmuid;
    }
/*
    public String getMuid() {
        return muid;
    }

    public void setMuid(String muid) {
        this.muid = muid;
    }*/


    public String getCluster() {
        return cluster;
    }

    public String getHhid() {
        return hhid;
    }


    public String getSno() {
        return sno;
    }

    public String getUserName() {
        return userName;
    }

    public String getSysDate() {
        return sysDate;
    }

    public String getIndexed() {
        return indexed;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getDeviceTag() {
        return deviceTag;
    }

    public String getAppver() {
        return appver;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getiStatus() {
        return iStatus;
    }

    public String getiStatus96x() {
        return iStatus96x;
    }

    public String getSynced() {
        return synced;
    }

    public String getSyncDate() {
        return syncDate;
    }


    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public void setHhid(String hhid) {
        this.hhid = hhid;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setSysDate(String sysDate) {
        this.sysDate = sysDate;
    }

    public void setIndexed(String indexed) {
        this.indexed = indexed;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public void setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
    }

    public void setAppver(String appver) {
        this.appver = appver;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setiStatus(String iStatus) {
        this.iStatus = iStatus;
    }

    public void setiStatus96x(String iStatus96x) {
        this.iStatus96x = iStatus96x;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public void setSyncDate(String syncDate) {
        this.syncDate = syncDate;
    }

    public String getpsuCode() {
        return psuCode;
    }

    private void setpsuCode(String psuCode) {
        this.psuCode = psuCode;
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
        this.sno = bs1respline;
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
        setBs2q3(bs2q1.equals("2") ? "" : this.bs2q3);
        setBs2q401(bs2q1.equals("2") ? "" : this.bs2q401);
        setBs2q402(bs2q1.equals("2") ? "" : this.bs2q402);
        setBs2q403(bs2q1.equals("2") ? "" : this.bs2q403);
        setBs2q404(bs2q1.equals("2") ? "" : this.bs2q404);
        setBs2q405(bs2q1.equals("2") ? "" : this.bs2q405);
        setBs2q406(bs2q1.equals("2") ? "" : this.bs2q406);
        setBs2q407(bs2q1.equals("2") ? "" : this.bs2q407);
        setBs2q408(bs2q1.equals("2") ? "" : this.bs2q408);
        setBs2q409(bs2q1.equals("2") ? "" : this.bs2q409);
        setBs2q410(bs2q1.equals("2") ? "" : this.bs2q410);
        setBs2q411(bs2q1.equals("2") ? "" : this.bs2q411);
        setBs2q412(bs2q1.equals("2") ? "" : this.bs2q412);
        setBs2q413(bs2q1.equals("2") ? "" : this.bs2q413);
        setBs2q414(bs2q1.equals("2") ? "" : this.bs2q414);
        setBs2q415(bs2q1.equals("2") ? "" : this.bs2q415);
        setBs2q416(bs2q1.equals("2") ? "" : this.bs2q416);
        setBs2q417(bs2q1.equals("2") ? "" : this.bs2q417);
        setBs2q418(bs2q1.equals("2") ? "" : this.bs2q418);
        setBs2q466(bs2q1.equals("2") ? "" : this.bs2q466);
        setBs2q4096(bs2q1.equals("2") ? "" : this.bs2q4096);
        setBs2q5(bs2q1.equals("2") ? "" : this.bs2q5);
        setBs2q601(bs2q1.equals("2") ? "" : this.bs2q601);
        setBs2q602(bs2q1.equals("2") ? "" : this.bs2q602);
        setBs2q603(bs2q1.equals("2") ? "" : this.bs2q603);
        setBs2q604(bs2q1.equals("2") ? "" : this.bs2q604);
        setBs2q605(bs2q1.equals("2") ? "" : this.bs2q605);
        setBs2q606(bs2q1.equals("2") ? "" : this.bs2q606);
        setBs2q607(bs2q1.equals("2") ? "" : this.bs2q607);
        setBs2q608(bs2q1.equals("2") ? "" : this.bs2q608);
        setBs2q609(bs2q1.equals("2") ? "" : this.bs2q609);
        setBs2q6010(bs2q1.equals("2") ? "" : this.bs2q6010);
        setBs2q6011(bs2q1.equals("2") ? "" : this.bs2q6011);
        setBs2q6012(bs2q1.equals("2") ? "" : this.bs2q6012);
        setBs2q6013(bs2q1.equals("2") ? "" : this.bs2q6013);
        setBs2q6014(bs2q1.equals("2") ? "" : this.bs2q6014);
        setBs2q6015(bs2q1.equals("2") ? "" : this.bs2q6015);
        setBs2q696(bs2q1.equals("2") ? "" : this.bs2q696);
        setBs2q7(bs2q1.equals("2") ? "" : this.bs2q7);
        setBs2q801(bs2q1.equals("2") ? "" : this.bs2q801);
        setBs2q802(bs2q1.equals("2") ? "" : this.bs2q802);
        setBs2q803(bs2q1.equals("2") ? "" : this.bs2q803);
        setBs2q804(bs2q1.equals("2") ? "" : this.bs2q804);
        setBs2q898(bs2q1.equals("2") ? "" : this.bs2q898);
        setBs2q896(bs2q1.equals("2") ? "" : this.bs2q896);
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
        setBs2q5(bs2q3.equals("2") ? "" : this.bs2q5);
        setBs2q601(bs2q3.equals("2") ? "" : this.bs2q601);
        setBs2q602(bs2q3.equals("2") ? "" : this.bs2q602);
        setBs2q603(bs2q3.equals("2") ? "" : this.bs2q603);
        setBs2q604(bs2q3.equals("2") ? "" : this.bs2q604);
        setBs2q605(bs2q3.equals("2") ? "" : this.bs2q605);
        setBs2q606(bs2q3.equals("2") ? "" : this.bs2q606);
        setBs2q607(bs2q3.equals("2") ? "" : this.bs2q607);
        setBs2q608(bs2q3.equals("2") ? "" : this.bs2q608);
        setBs2q609(bs2q3.equals("2") ? "" : this.bs2q609);
        setBs2q6010(bs2q3.equals("2") ? "" : this.bs2q6010);
        setBs2q6011(bs2q3.equals("2") ? "" : this.bs2q6011);
        setBs2q6012(bs2q3.equals("2") ? "" : this.bs2q6012);
        setBs2q6013(bs2q3.equals("2") ? "" : this.bs2q6013);
        setBs2q6014(bs2q3.equals("2") ? "" : this.bs2q6014);
        setBs2q6015(bs2q3.equals("2") ? "" : this.bs2q6015);
        setBs2q696(bs2q3.equals("2") ? "" : this.bs2q696);
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
        setBs2q5(bs2q412.equals("12") ? "" : this.bs2q5);
        setBs2q601(bs2q412.equals("12") ? "" : this.bs2q601);
        setBs2q602(bs2q412.equals("12") ? "" : this.bs2q602);
        setBs2q603(bs2q412.equals("12") ? "" : this.bs2q603);
        setBs2q604(bs2q412.equals("12") ? "" : this.bs2q604);
        setBs2q605(bs2q412.equals("12") ? "" : this.bs2q605);
        setBs2q606(bs2q412.equals("12") ? "" : this.bs2q606);
        setBs2q607(bs2q412.equals("12") ? "" : this.bs2q607);
        setBs2q608(bs2q412.equals("12") ? "" : this.bs2q608);
        setBs2q609(bs2q412.equals("12") ? "" : this.bs2q609);
        setBs2q6010(bs2q412.equals("12") ? "" : this.bs2q6010);
        setBs2q6011(bs2q412.equals("12") ? "" : this.bs2q6011);
        setBs2q6012(bs2q412.equals("12") ? "" : this.bs2q6012);
        setBs2q6013(bs2q412.equals("12") ? "" : this.bs2q6013);
        setBs2q6014(bs2q412.equals("12") ? "" : this.bs2q6014);
        setBs2q6015(bs2q412.equals("12") ? "" : this.bs2q6015);
        setBs2q696(bs2q412.equals("12") ? "" : this.bs2q696);
        notifyPropertyChanged(BR.bs2q412);
    }

    @Bindable
    public String getBs2q413() {
        return bs2q413;
    }

    public void setBs2q413(String bs2q413) {
        if (this.bs2q413.equals(bs2q413)) return;
        this.bs2q413 = bs2q413;
        setBs2q5(bs2q413.equals("13") ? "" : this.bs2q5);
        setBs2q601(bs2q413.equals("13") ? "" : this.bs2q601);
        setBs2q602(bs2q413.equals("13") ? "" : this.bs2q602);
        setBs2q603(bs2q413.equals("13") ? "" : this.bs2q603);
        setBs2q604(bs2q413.equals("13") ? "" : this.bs2q604);
        setBs2q605(bs2q413.equals("13") ? "" : this.bs2q605);
        setBs2q606(bs2q413.equals("13") ? "" : this.bs2q606);
        setBs2q607(bs2q413.equals("13") ? "" : this.bs2q607);
        setBs2q608(bs2q413.equals("13") ? "" : this.bs2q608);
        setBs2q609(bs2q413.equals("13") ? "" : this.bs2q609);
        setBs2q6010(bs2q413.equals("13") ? "" : this.bs2q6010);
        setBs2q6011(bs2q413.equals("13") ? "" : this.bs2q6011);
        setBs2q6012(bs2q413.equals("13") ? "" : this.bs2q6012);
        setBs2q6013(bs2q413.equals("13") ? "" : this.bs2q6013);
        setBs2q6014(bs2q413.equals("13") ? "" : this.bs2q6014);
        setBs2q6015(bs2q413.equals("13") ? "" : this.bs2q6015);
        setBs2q696(bs2q413.equals("13") ? "" : this.bs2q696);
        notifyPropertyChanged(BR.bs2q413);
    }

    @Bindable
    public String getBs2q414() {
        return bs2q414;
    }

    public void setBs2q414(String bs2q414) {
        if (this.bs2q414.equals(bs2q414)) return;
        this.bs2q414 = bs2q414;
        setBs2q5(bs2q414.equals("14") ? "" : this.bs2q5);
        setBs2q601(bs2q414.equals("14") ? "" : this.bs2q601);
        setBs2q602(bs2q414.equals("14") ? "" : this.bs2q602);
        setBs2q603(bs2q414.equals("14") ? "" : this.bs2q603);
        setBs2q604(bs2q414.equals("14") ? "" : this.bs2q604);
        setBs2q605(bs2q414.equals("14") ? "" : this.bs2q605);
        setBs2q606(bs2q414.equals("14") ? "" : this.bs2q606);
        setBs2q607(bs2q414.equals("14") ? "" : this.bs2q607);
        setBs2q608(bs2q414.equals("14") ? "" : this.bs2q608);
        setBs2q609(bs2q414.equals("14") ? "" : this.bs2q609);
        setBs2q6010(bs2q414.equals("14") ? "" : this.bs2q6010);
        setBs2q6011(bs2q414.equals("14") ? "" : this.bs2q6011);
        setBs2q6012(bs2q414.equals("14") ? "" : this.bs2q6012);
        setBs2q6013(bs2q414.equals("14") ? "" : this.bs2q6013);
        setBs2q6014(bs2q414.equals("14") ? "" : this.bs2q6014);
        setBs2q6015(bs2q414.equals("14") ? "" : this.bs2q6015);
        setBs2q696(bs2q414.equals("14") ? "" : this.bs2q696);
        notifyPropertyChanged(BR.bs2q414);
    }

    @Bindable
    public String getBs2q415() {
        return bs2q415;
    }

    public void setBs2q415(String bs2q415) {
        if (this.bs2q415.equals(bs2q415)) return;
        this.bs2q415 = bs2q415;
        setBs2q5(bs2q415.equals("15") ? "" : this.bs2q5);
        setBs2q601(bs2q415.equals("15") ? "" : this.bs2q601);
        setBs2q602(bs2q415.equals("15") ? "" : this.bs2q602);
        setBs2q603(bs2q415.equals("15") ? "" : this.bs2q603);
        setBs2q604(bs2q415.equals("15") ? "" : this.bs2q604);
        setBs2q605(bs2q415.equals("15") ? "" : this.bs2q605);
        setBs2q606(bs2q415.equals("15") ? "" : this.bs2q606);
        setBs2q607(bs2q415.equals("15") ? "" : this.bs2q607);
        setBs2q608(bs2q415.equals("15") ? "" : this.bs2q608);
        setBs2q609(bs2q415.equals("15") ? "" : this.bs2q609);
        setBs2q6010(bs2q415.equals("15") ? "" : this.bs2q6010);
        setBs2q6011(bs2q415.equals("15") ? "" : this.bs2q6011);
        setBs2q6012(bs2q415.equals("15") ? "" : this.bs2q6012);
        setBs2q6013(bs2q415.equals("15") ? "" : this.bs2q6013);
        setBs2q6014(bs2q415.equals("15") ? "" : this.bs2q6014);
        setBs2q6015(bs2q415.equals("15") ? "" : this.bs2q6015);
        setBs2q696(bs2q415.equals("15") ? "" : this.bs2q696);
        notifyPropertyChanged(BR.bs2q415);
    }

    @Bindable
    public String getBs2q416() {
        return bs2q416;
    }

    public void setBs2q416(String bs2q416) {
        if (this.bs2q416.equals(bs2q416)) return;
        this.bs2q416 = bs2q416;
        setBs2q5(bs2q416.equals("16") ? "" : this.bs2q5);
        setBs2q601(bs2q416.equals("16") ? "" : this.bs2q601);
        setBs2q602(bs2q416.equals("16") ? "" : this.bs2q602);
        setBs2q603(bs2q416.equals("16") ? "" : this.bs2q603);
        setBs2q604(bs2q416.equals("16") ? "" : this.bs2q604);
        setBs2q605(bs2q416.equals("16") ? "" : this.bs2q605);
        setBs2q606(bs2q416.equals("16") ? "" : this.bs2q606);
        setBs2q607(bs2q416.equals("16") ? "" : this.bs2q607);
        setBs2q608(bs2q416.equals("16") ? "" : this.bs2q608);
        setBs2q609(bs2q416.equals("16") ? "" : this.bs2q609);
        setBs2q6010(bs2q416.equals("16") ? "" : this.bs2q6010);
        setBs2q6011(bs2q416.equals("16") ? "" : this.bs2q6011);
        setBs2q6012(bs2q416.equals("16") ? "" : this.bs2q6012);
        setBs2q6013(bs2q416.equals("16") ? "" : this.bs2q6013);
        setBs2q6014(bs2q416.equals("16") ? "" : this.bs2q6014);
        setBs2q6015(bs2q416.equals("16") ? "" : this.bs2q6015);
        setBs2q696(bs2q416.equals("16") ? "" : this.bs2q696);
        notifyPropertyChanged(BR.bs2q416);
    }

    @Bindable
    public String getBs2q417() {
        return bs2q417;
    }

    public void setBs2q417(String bs2q417) {
        if (this.bs2q417.equals(bs2q417)) return;
        this.bs2q417 = bs2q417;
        setBs2q5(bs2q417.equals("17") ? "" : this.bs2q5);
        setBs2q601(bs2q417.equals("17") ? "" : this.bs2q601);
        setBs2q602(bs2q417.equals("17") ? "" : this.bs2q602);
        setBs2q603(bs2q417.equals("17") ? "" : this.bs2q603);
        setBs2q604(bs2q417.equals("17") ? "" : this.bs2q604);
        setBs2q605(bs2q417.equals("17") ? "" : this.bs2q605);
        setBs2q606(bs2q417.equals("17") ? "" : this.bs2q606);
        setBs2q607(bs2q417.equals("17") ? "" : this.bs2q607);
        setBs2q608(bs2q417.equals("17") ? "" : this.bs2q608);
        setBs2q609(bs2q417.equals("17") ? "" : this.bs2q609);
        setBs2q6010(bs2q417.equals("17") ? "" : this.bs2q6010);
        setBs2q6011(bs2q417.equals("17") ? "" : this.bs2q6011);
        setBs2q6012(bs2q417.equals("17") ? "" : this.bs2q6012);
        setBs2q6013(bs2q417.equals("17") ? "" : this.bs2q6013);
        setBs2q6014(bs2q417.equals("17") ? "" : this.bs2q6014);
        setBs2q6015(bs2q417.equals("17") ? "" : this.bs2q6015);
        setBs2q696(bs2q417.equals("17") ? "" : this.bs2q696);
        notifyPropertyChanged(BR.bs2q417);
    }

    @Bindable
    public String getBs2q418() {
        return bs2q418;
    }

    public void setBs2q418(String bs2q418) {
        if (this.bs2q418.equals(bs2q418)) return;
        this.bs2q418 = bs2q418;
        setBs2q5(bs2q418.equals("18") ? "" : this.bs2q5);
        setBs2q601(bs2q418.equals("18") ? "" : this.bs2q601);
        setBs2q602(bs2q418.equals("18") ? "" : this.bs2q602);
        setBs2q603(bs2q418.equals("18") ? "" : this.bs2q603);
        setBs2q604(bs2q418.equals("18") ? "" : this.bs2q604);
        setBs2q605(bs2q418.equals("18") ? "" : this.bs2q605);
        setBs2q606(bs2q418.equals("18") ? "" : this.bs2q606);
        setBs2q607(bs2q418.equals("18") ? "" : this.bs2q607);
        setBs2q608(bs2q418.equals("18") ? "" : this.bs2q608);
        setBs2q609(bs2q418.equals("18") ? "" : this.bs2q609);
        setBs2q6010(bs2q418.equals("18") ? "" : this.bs2q6010);
        setBs2q6011(bs2q418.equals("18") ? "" : this.bs2q6011);
        setBs2q6012(bs2q418.equals("18") ? "" : this.bs2q6012);
        setBs2q6013(bs2q418.equals("18") ? "" : this.bs2q6013);
        setBs2q6014(bs2q418.equals("18") ? "" : this.bs2q6014);
        setBs2q6015(bs2q418.equals("18") ? "" : this.bs2q6015);
        setBs2q696(bs2q418.equals("18") ? "" : this.bs2q696);
        notifyPropertyChanged(BR.bs2q418);
    }

    @Bindable
    public String getBs2q466() {
        return bs2q466;
    }

    public void setBs2q466(String bs2q466) {
        if (this.bs2q466.equals(bs2q466)) return;
        this.bs2q466 = bs2q466;
        setBs2q401(bs2q466.equals("66") ? "" : this.bs2q401);
        setBs2q402(bs2q466.equals("66") ? "" : this.bs2q402);
        setBs2q403(bs2q466.equals("66") ? "" : this.bs2q403);
        setBs2q404(bs2q466.equals("66") ? "" : this.bs2q404);
        setBs2q405(bs2q466.equals("66") ? "" : this.bs2q405);
        setBs2q406(bs2q466.equals("66") ? "" : this.bs2q406);
        setBs2q407(bs2q466.equals("66") ? "" : this.bs2q407);
        setBs2q408(bs2q466.equals("66") ? "" : this.bs2q408);
        setBs2q409(bs2q466.equals("66") ? "" : this.bs2q409);
        setBs2q410(bs2q466.equals("66") ? "" : this.bs2q410);
        setBs2q411(bs2q466.equals("66") ? "" : this.bs2q411);
        setBs2q412(bs2q466.equals("66") ? "" : this.bs2q412);
        setBs2q413(bs2q466.equals("66") ? "" : this.bs2q413);
        setBs2q414(bs2q466.equals("66") ? "" : this.bs2q414);
        setBs2q415(bs2q466.equals("66") ? "" : this.bs2q415);
        setBs2q416(bs2q466.equals("66") ? "" : this.bs2q416);
        setBs2q417(bs2q466.equals("66") ? "" : this.bs2q417);
        setBs2q418(bs2q466.equals("66") ? "" : this.bs2q418);
        setBs2q4096(bs2q466.equals("66") ? "" : this.bs2q4096);
        setBs2q5(bs2q466.equals("66") ? "" : this.bs2q5);
        setBs2q601(bs2q466.equals("66") ? "" : this.bs2q601);
        setBs2q602(bs2q466.equals("66") ? "" : this.bs2q602);
        setBs2q603(bs2q466.equals("66") ? "" : this.bs2q603);
        setBs2q604(bs2q466.equals("66") ? "" : this.bs2q604);
        setBs2q605(bs2q466.equals("66") ? "" : this.bs2q605);
        setBs2q606(bs2q466.equals("66") ? "" : this.bs2q606);
        setBs2q607(bs2q466.equals("66") ? "" : this.bs2q607);
        setBs2q608(bs2q466.equals("66") ? "" : this.bs2q608);
        setBs2q609(bs2q466.equals("66") ? "" : this.bs2q609);
        setBs2q6010(bs2q466.equals("66") ? "" : this.bs2q6010);
        setBs2q6011(bs2q466.equals("66") ? "" : this.bs2q6011);
        setBs2q6012(bs2q466.equals("66") ? "" : this.bs2q6012);
        setBs2q6013(bs2q466.equals("66") ? "" : this.bs2q6013);
        setBs2q6014(bs2q466.equals("66") ? "" : this.bs2q6014);
        setBs2q6015(bs2q466.equals("66") ? "" : this.bs2q6015);
        setBs2q696(bs2q466.equals("66") ? "" : this.bs2q696);
        notifyPropertyChanged(BR.bs2q466);
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
    public String getBs3q2b() {
        return bs3q2b;
    }

    public void setBs3q2b(String bs3q2b) {
        this.bs3q2b = bs3q2b;
        setBs3q2b96x(bs3q2b.equals("96") ? this.bs3q2b96x : "");
        notifyPropertyChanged(BR.bs3q2b);
    }

    @Bindable
    public String getBs3q2b96x() {
        return bs3q2b96x;
    }

    public void setBs3q2b96x(String bs3q2b96x) {
        this.bs3q2b96x = bs3q2b96x;
        notifyPropertyChanged(BR.bs3q2b96x);
    }

    @Bindable
    public String getBs3q2c() {
        return bs3q2c;
    }

    public void setBs3q2c(String bs3q2c) {
        this.bs3q2c = bs3q2c;
        setBs3q2c96x(bs3q2c.equals("96") ? this.bs3q2c96x : "");
        notifyPropertyChanged(BR.bs3q2c);
    }

    @Bindable
    public String getBs3q2c96x() {
        return bs3q2c96x;
    }

    public void setBs3q2c96x(String bs3q2c96x) {
        this.bs3q2c96x = bs3q2c96x;
        notifyPropertyChanged(BR.bs3q2c96x);
    }

    @Bindable
    public String getBs3q2d() {
        return bs3q2d;
    }

    public void setBs3q2d(String bs3q2d) {
        this.bs3q2d = bs3q2d;
        setBs3q2d96x(bs3q2d.equals("96") ? this.bs3q2d96x : "");
        notifyPropertyChanged(BR.bs3q2d);
    }

    @Bindable
    public String getBs3q2d96x() {
        return bs3q2d96x;
    }

    public void setBs3q2d96x(String bs3q2d96x) {
        this.bs3q2d96x = bs3q2d96x;
        notifyPropertyChanged(BR.bs3q2d96x);
    }

    @Bindable
    public String getBs3q3() {
        return bs3q3;
    }

    public void setBs3q3(String bs3q3) {
        this.bs3q3 = bs3q3;
        setBs3q401(bs3q3.equals("2") ? "" : this.bs3q401);
        setBs3q402(bs3q3.equals("2") ? "" : this.bs3q402);
        setBs3q403(bs3q3.equals("2") ? "" : this.bs3q403);
        setBs3q404(bs3q3.equals("2") ? "" : this.bs3q404);
        setBs3q405(bs3q3.equals("2") ? "" : this.bs3q405);
        setBs3q406(bs3q3.equals("2") ? "" : this.bs3q406);
        setBs3q407(bs3q3.equals("2") ? "" : this.bs3q407);
        setBs3q496(bs3q3.equals("2") ? "" : this.bs3q496);
        setBs3q498(bs3q3.equals("2") ? "" : this.bs3q498);
        setBs3q501(bs3q3.equals("2") ? "" : this.bs3q501);
        setBs3q502(bs3q3.equals("2") ? "" : this.bs3q502);
        setBs3q503(bs3q3.equals("2") ? "" : this.bs3q503);
        setBs3q504(bs3q3.equals("2") ? "" : this.bs3q504);
        setBs3q596(bs3q3.equals("2") ? "" : this.bs3q596);
        setBs3q598(bs3q3.equals("2") ? "" : this.bs3q598);
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
        if (this.bs4aq201.equals(bs4aq201)) return;
        this.bs4aq201 = bs4aq201;
        notifyPropertyChanged(BR.bs4aq201);
    }

    @Bindable
    public String getBs4aq202() {
        return bs4aq202;
    }

    public void setBs4aq202(String bs4aq202) {
        if (this.bs4aq202.equals(bs4aq202)) return;
        this.bs4aq202 = bs4aq202;
        notifyPropertyChanged(BR.bs4aq202);
    }

    @Bindable
    public String getBs4aq203() {
        return bs4aq203;
    }

    public void setBs4aq203(String bs4aq203) {
        if (this.bs4aq203.equals(bs4aq203)) return;
        this.bs4aq203 = bs4aq203;
        notifyPropertyChanged(BR.bs4aq203);
    }

    @Bindable
    public String getBs4aq204() {
        return bs4aq204;
    }

    public void setBs4aq204(String bs4aq204) {
        if (this.bs4aq204.equals(bs4aq204)) return;
        this.bs4aq204 = bs4aq204;
        notifyPropertyChanged(BR.bs4aq204);
    }

    @Bindable
    public String getBs4aq205() {
        return bs4aq205;
    }

    public void setBs4aq205(String bs4aq205) {
        if (this.bs4aq205.equals(bs4aq205)) return;
        this.bs4aq205 = bs4aq205;
        notifyPropertyChanged(BR.bs4aq205);
    }

    @Bindable
    public String getBs4aq206() {
        return bs4aq206;
    }

    public void setBs4aq206(String bs4aq206) {
        if (this.bs4aq206.equals(bs4aq206)) return;
        this.bs4aq206 = bs4aq206;
        notifyPropertyChanged(BR.bs4aq206);
    }

    @Bindable
    public String getBs4aq207() {
        return bs4aq207;
    }

    public void setBs4aq207(String bs4aq207) {
        if (this.bs4aq207.equals(bs4aq207)) return;
        this.bs4aq207 = bs4aq207;
        notifyPropertyChanged(BR.bs4aq207);
    }

    @Bindable
    public String getBs4aq208() {
        return bs4aq208;
    }

    public void setBs4aq208(String bs4aq208) {
        if (this.bs4aq208.equals(bs4aq208)) return;
        this.bs4aq208 = bs4aq208;
        notifyPropertyChanged(BR.bs4aq208);
    }

    @Bindable
    public String getBs4aq298() {
        return bs4aq298;
    }

    public void setBs4aq298(String bs4aq298) {
        if (this.bs4aq298.equals(bs4aq298)) return;
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
        if (this.bs4aq296.equals(bs4aq296)) return;
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
        setBs4bq21(bs4bq1.equals("2") ? "" : this.bs4bq21);
        setBs4bq22(bs4bq1.equals("2") ? "" : this.bs4bq22);
        setBs4bq23(bs4bq1.equals("2") ? "" : this.bs4bq23);
        setBs4bq24(bs4bq1.equals("2") ? "" : this.bs4bq24);
        setBs4bq296(bs4bq1.equals("2") ? "" : this.bs4bq296);
        setBs4bq298(bs4bq1.equals("2") ? "" : this.bs4bq298);
        setBs4bq31(bs4bq1.equals("2") ? "" : this.bs4bq31);
        setBs4bq32(bs4bq1.equals("2") ? "" : this.bs4bq32);
        setBs4bq33(bs4bq1.equals("2") ? "" : this.bs4bq33);
        setBs4bq34(bs4bq1.equals("2") ? "" : this.bs4bq34);
        setBs4bq35(bs4bq1.equals("2") ? "" : this.bs4bq35);
        setBs4bq36(bs4bq1.equals("2") ? "" : this.bs4bq36);
        setBs4bq396(bs4bq1.equals("2") ? "" : this.bs4bq396);
        setBs4bq398(bs4bq1.equals("2") ? "" : this.bs4bq398);
        setBs4bq4(bs4bq1.equals("2") ? "" : this.bs4bq4);
        setBs4bq51(bs4bq1.equals("2") ? "" : this.bs4bq51);
        setBs4bq52(bs4bq1.equals("2") ? "" : this.bs4bq52);
        setBs4bq53(bs4bq1.equals("2") ? "" : this.bs4bq53);
        setBs4bq596(bs4bq1.equals("2") ? "" : this.bs4bq596);
        setBs4bq598(bs4bq1.equals("2") ? "" : this.bs4bq598);
        setBs4bq6(bs4bq1.equals("2") ? "" : this.bs4bq6);
        setBs4bq7(bs4bq1.equals("2") ? "" : this.bs4bq7);
        setBs4bq81(bs4bq1.equals("2") ? "" : this.bs4bq81);
        setBs4bq82(bs4bq1.equals("2") ? "" : this.bs4bq82);
        setBs4bq83(bs4bq1.equals("2") ? "" : this.bs4bq83);
        setBs4bq84(bs4bq1.equals("2") ? "" : this.bs4bq84);
        setBs4bq85(bs4bq1.equals("2") ? "" : this.bs4bq85);
        setBs4bq86(bs4bq1.equals("2") ? "" : this.bs4bq86);
        setBs4bq87(bs4bq1.equals("2") ? "" : this.bs4bq87);
        setBs4bq896(bs4bq1.equals("2") ? "" : this.bs4bq896);
        setBs4bq898(bs4bq1.equals("2") ? "" : this.bs4bq898);
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
        if (this.bs4bq21.equals(bs4bq21)) return;
        this.bs4bq21 = bs4bq21;
        notifyPropertyChanged(BR.bs4bq21);
    }

    @Bindable
    public String getBs4bq22() {
        return bs4bq22;
    }

    public void setBs4bq22(String bs4bq22) {
        if (this.bs4bq22.equals(bs4bq22)) return;
        this.bs4bq22 = bs4bq22;
        notifyPropertyChanged(BR.bs4bq22);
    }

    @Bindable
    public String getBs4bq23() {
        return bs4bq23;
    }

    public void setBs4bq23(String bs4bq23) {
        if (this.bs4bq23.equals(bs4bq23)) return;
        this.bs4bq23 = bs4bq23;
        notifyPropertyChanged(BR.bs4bq23);
    }

    @Bindable
    public String getBs4bq24() {
        return bs4bq24;
    }

    public void setBs4bq24(String bs4bq24) {
        if (this.bs4bq24.equals(bs4bq24)) return;
        this.bs4bq24 = bs4bq24;
        notifyPropertyChanged(BR.bs4bq24);
    }

    @Bindable
    public String getBs4bq298() {
        return bs4bq298;
    }

    public void setBs4bq298(String bs4bq298) {
        if (this.bs4bq298.equals(bs4bq298)) return;
        this.bs4bq298 = bs4bq298;
        setBs4bq21(bs4bq298.equals("98") ? "" : this.bs4bq21);
        setBs4bq22(bs4bq298.equals("98") ? "" : this.bs4bq22);
        setBs4bq23(bs4bq298.equals("98") ? "" : this.bs4bq23);
        setBs4bq24(bs4bq298.equals("98") ? "" : this.bs4bq24);
        setBs4bq296(bs4bq298.equals("98") ? "" : this.bs4bq296);
        notifyPropertyChanged(BR.bs4bq298);
    }

    @Bindable
    public String getBs4bq296() {
        return bs4bq296;
    }

    public void setBs4bq296(String bs4bq296) {
        if (this.bs4bq296.equals(bs4bq296)) return;
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
        if (this.bs4bq31.equals(bs4bq31)) return;
        this.bs4bq31 = bs4bq31;
        notifyPropertyChanged(BR.bs4bq31);
    }

    @Bindable
    public String getBs4bq32() {
        return bs4bq32;
    }

    public void setBs4bq32(String bs4bq32) {
        if (this.bs4bq32.equals(bs4bq32)) return;
        this.bs4bq32 = bs4bq32;
        notifyPropertyChanged(BR.bs4bq32);
    }

    @Bindable
    public String getBs4bq33() {
        return bs4bq33;
    }

    public void setBs4bq33(String bs4bq33) {
        if (this.bs4bq33.equals(bs4bq33)) return;
        this.bs4bq33 = bs4bq33;
        notifyPropertyChanged(BR.bs4bq33);
    }

    @Bindable
    public String getBs4bq34() {
        return bs4bq34;
    }

    public void setBs4bq34(String bs4bq34) {
        if (this.bs4bq34.equals(bs4bq34)) return;
        this.bs4bq34 = bs4bq34;
        notifyPropertyChanged(BR.bs4bq34);
    }

    @Bindable
    public String getBs4bq35() {
        return bs4bq35;
    }

    public void setBs4bq35(String bs4bq35) {
        if (this.bs4bq35.equals(bs4bq35)) return;
        this.bs4bq35 = bs4bq35;
        notifyPropertyChanged(BR.bs4bq35);
    }

    @Bindable
    public String getBs4bq36() {
        return bs4bq36;
    }

    public void setBs4bq36(String bs4bq36) {
        if (this.bs4bq36.equals(bs4bq36)) return;
        this.bs4bq36 = bs4bq36;
        notifyPropertyChanged(BR.bs4bq36);
    }

    @Bindable
    public String getBs4bq398() {
        return bs4bq398;
    }

    public void setBs4bq398(String bs4bq398) {
        if (this.bs4bq398.equals(bs4bq398)) return;
        this.bs4bq398 = bs4bq398;
        setBs4bq31(bs4bq398.equals("98") ? "" : this.bs4bq31);
        setBs4bq32(bs4bq398.equals("98") ? "" : this.bs4bq32);
        setBs4bq33(bs4bq398.equals("98") ? "" : this.bs4bq33);
        setBs4bq34(bs4bq398.equals("98") ? "" : this.bs4bq34);
        setBs4bq35(bs4bq398.equals("98") ? "" : this.bs4bq35);
        setBs4bq36(bs4bq398.equals("98") ? "" : this.bs4bq36);
        setBs4bq396(bs4bq398.equals("98") ? "" : this.bs4bq396);
        notifyPropertyChanged(BR.bs4bq398);
    }

    @Bindable
    public String getBs4bq396() {
        return bs4bq396;
    }

    public void setBs4bq396(String bs4bq396) {
        if (this.bs4bq396.equals(bs4bq396)) return;
        this.bs4bq396 = bs4bq396;
        setBs4bq396x(bs4bq396.equals("96") ? this.bs4bq396x : "");
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
        setBs4bq51(bs4bq4.equals("1") ? this.bs4bq51 : "");
        setBs4bq52(bs4bq4.equals("1") ? this.bs4bq52 : "");
        setBs4bq53(bs4bq4.equals("1") ? this.bs4bq53 : "");
        setBs4bq596(bs4bq4.equals("1") ? this.bs4bq596 : "");
        setBs4bq598(bs4bq4.equals("1") ? this.bs4bq598 : "");
        setBs4bq6(bs4bq4.equals("1") ? this.bs4bq6 : "");
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
        if (this.bs4bq51.equals(bs4bq51)) return;
        this.bs4bq51 = bs4bq51;
        notifyPropertyChanged(BR.bs4bq51);
    }

    @Bindable
    public String getBs4bq52() {
        return bs4bq52;
    }

    public void setBs4bq52(String bs4bq52) {
        if (this.bs4bq52.equals(bs4bq52)) return;
        this.bs4bq52 = bs4bq52;
        notifyPropertyChanged(BR.bs4bq52);
    }

    @Bindable
    public String getBs4bq53() {
        return bs4bq53;
    }

    public void setBs4bq53(String bs4bq53) {
        if (this.bs4bq53.equals(bs4bq53)) return;
        this.bs4bq53 = bs4bq53;
        notifyPropertyChanged(BR.bs4bq53);
    }

    @Bindable
    public String getBs4bq598() {
        return bs4bq598;
    }

    public void setBs4bq598(String bs4bq598) {
        if (this.bs4bq598.equals(bs4bq598)) return;
        this.bs4bq598 = bs4bq598;
        setBs4bq51(bs4bq598.equals("98") ? "" : this.bs4bq51);
        setBs4bq52(bs4bq598.equals("98") ? "" : this.bs4bq52);
        setBs4bq53(bs4bq598.equals("98") ? "" : this.bs4bq53);
        setBs4bq596(bs4bq598.equals("98") ? "" : this.bs4bq596);
        notifyPropertyChanged(BR.bs4bq598);
    }

    @Bindable
    public String getBs4bq596() {
        return bs4bq596;
    }

    public void setBs4bq596(String bs4bq596) {
        if (this.bs4bq596.equals(bs4bq596)) return;
        this.bs4bq596 = bs4bq596;
        setBs4bq596x(bs4bq596.equals("96") ? this.bs4bq596x : "");
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
        setBs4bq696x(bs4bq6.equals("96") ? this.bs4bq696x : "");
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
        if (this.bs4bq81.equals(bs4bq81)) return;
        this.bs4bq81 = bs4bq81;
        notifyPropertyChanged(BR.bs4bq81);
    }

    @Bindable
    public String getBs4bq82() {
        return bs4bq82;
    }

    public void setBs4bq82(String bs4bq82) {
        if (this.bs4bq82.equals(bs4bq82)) return;
        this.bs4bq82 = bs4bq82;
        notifyPropertyChanged(BR.bs4bq82);
    }

    @Bindable
    public String getBs4bq83() {
        return bs4bq83;
    }

    public void setBs4bq83(String bs4bq83) {
        if (this.bs4bq83.equals(bs4bq83)) return;
        this.bs4bq83 = bs4bq83;
        notifyPropertyChanged(BR.bs4bq83);
    }

    @Bindable
    public String getBs4bq84() {
        return bs4bq84;
    }

    public void setBs4bq84(String bs4bq84) {
        if (this.bs4bq84.equals(bs4bq84)) return;
        this.bs4bq84 = bs4bq84;
        notifyPropertyChanged(BR.bs4bq84);
    }

    @Bindable
    public String getBs4bq85() {
        return bs4bq85;
    }

    public void setBs4bq85(String bs4bq85) {
        if (this.bs4bq85.equals(bs4bq85)) return;
        this.bs4bq85 = bs4bq85;
        notifyPropertyChanged(BR.bs4bq85);
    }

    @Bindable
    public String getBs4bq86() {
        return bs4bq86;
    }

    public void setBs4bq86(String bs4bq86) {
        if (this.bs4bq86.equals(bs4bq86)) return;
        this.bs4bq86 = bs4bq86;
        notifyPropertyChanged(BR.bs4bq86);
    }

    @Bindable
    public String getBs4bq87() {
        return bs4bq87;
    }

    public void setBs4bq87(String bs4bq87) {
        if (this.bs4bq87.equals(bs4bq87)) return;
        this.bs4bq87 = bs4bq87;
        notifyPropertyChanged(BR.bs4bq87);
    }

    @Bindable
    public String getBs4bq898() {
        return bs4bq898;
    }

    public void setBs4bq898(String bs4bq898) {
        if (this.bs4bq898.equals(bs4bq898)) return;
        this.bs4bq898 = bs4bq898;
        setBs4bq81(bs4bq898.equals("98") ? "" : this.bs4bq81);
        setBs4bq82(bs4bq898.equals("98") ? "" : this.bs4bq82);
        setBs4bq83(bs4bq898.equals("98") ? "" : this.bs4bq83);
        setBs4bq84(bs4bq898.equals("98") ? "" : this.bs4bq84);
        setBs4bq85(bs4bq898.equals("98") ? "" : this.bs4bq85);
        setBs4bq86(bs4bq898.equals("98") ? "" : this.bs4bq86);
        setBs4bq87(bs4bq898.equals("98") ? "" : this.bs4bq87);
        setBs4bq896(bs4bq898.equals("98") ? "" : this.bs4bq896);
        notifyPropertyChanged(BR.bs4bq898);
    }

    @Bindable
    public String getBs4bq896() {
        return bs4bq896;
    }

    public void setBs4bq896(String bs4bq896) {
        if (this.bs4bq896.equals(bs4bq896)) return;
        this.bs4bq896 = bs4bq896;
        setBs4bq896x(bs4bq896.equals("96") ? this.bs4bq896x : "");
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
        setBs5q201(bs5q1.equals("2") ? "" : this.bs5q201);
        setBs5q202(bs5q1.equals("2") ? "" : this.bs5q202);
        setBs5q203(bs5q1.equals("2") ? "" : this.bs5q203);
        setBs5q204(bs5q1.equals("2") ? "" : this.bs5q204);
        setBs5q205(bs5q1.equals("2") ? "" : this.bs5q205);
        setBs5q296(bs5q1.equals("2") ? "" : this.bs5q296);
        setBs5q297(bs5q1.equals("2") ? "" : this.bs5q297);
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
        if (this.bs5q201.equals(bs5q201)) return;
        this.bs5q201 = bs5q201;
        notifyPropertyChanged(BR.bs5q201);
    }

    @Bindable
    public String getBs5q202() {
        return bs5q202;
    }

    public void setBs5q202(String bs5q202) {
        if (this.bs5q202.equals(bs5q202)) return;
        this.bs5q202 = bs5q202;
        notifyPropertyChanged(BR.bs5q202);
    }

    @Bindable
    public String getBs5q203() {
        return bs5q203;
    }

    public void setBs5q203(String bs5q203) {
        if (this.bs5q203.equals(bs5q203)) return;
        this.bs5q203 = bs5q203;
        notifyPropertyChanged(BR.bs5q203);
    }

    @Bindable
    public String getBs5q204() {
        return bs5q204;
    }

    public void setBs5q204(String bs5q204) {
        if (this.bs5q204.equals(bs5q204)) return;
        this.bs5q204 = bs5q204;
        notifyPropertyChanged(BR.bs5q204);
    }

    @Bindable
    public String getBs5q205() {
        return bs5q205;
    }

    public void setBs5q205(String bs5q205) {
        if (this.bs5q205.equals(bs5q205)) return;
        this.bs5q205 = bs5q205;
        notifyPropertyChanged(BR.bs5q205);
    }

    @Bindable
    public String getBs5q296() {
        return bs5q296;
    }

    public void setBs5q296(String bs5q296) {
        if (this.bs5q296.equals(bs5q296)) return;
        this.bs5q296 = bs5q296;
        setBs5q296x(bs5q296.equals("96") ? this.bs5q296x : "");
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
        if (this.bs5q297.equals(bs5q297)) return;
        this.bs5q297 = bs5q297;
        setBs5q201(bs5q297.equals("97") ? "" : this.bs5q201);
        setBs5q202(bs5q297.equals("97") ? "" : this.bs5q202);
        setBs5q203(bs5q297.equals("97") ? "" : this.bs5q203);
        setBs5q204(bs5q297.equals("97") ? "" : this.bs5q204);
        setBs5q205(bs5q297.equals("97") ? "" : this.bs5q205);
        setBs5q296(bs5q297.equals("97") ? "" : this.bs5q296);
        notifyPropertyChanged(BR.bs5q297);
    }

    @Bindable
    public String getBs5q3() {
        return bs5q3;
    }

    public void setBs5q3(String bs5q3) {
        this.bs5q3 = bs5q3;
        setBs5q401(bs5q3.equals("2") ? "" : this.bs5q401);
        setBs5q402(bs5q3.equals("2") ? "" : this.bs5q402);
        setBs5q403(bs5q3.equals("2") ? "" : this.bs5q403);
        setBs5q404(bs5q3.equals("2") ? "" : this.bs5q404);
        setBs5q496(bs5q3.equals("2") ? "" : this.bs5q496);
        setBs5q497(bs5q3.equals("2") ? "" : this.bs5q497);
        setBs5q5(bs5q3.equals("2") ? "" : this.bs5q5);
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
        if (this.bs5q401.equals(bs5q401)) return;
        this.bs5q401 = bs5q401;
        notifyPropertyChanged(BR.bs5q401);
    }

    @Bindable
    public String getBs5q402() {
        return bs5q402;
    }

    public void setBs5q402(String bs5q402) {
        if (this.bs5q402.equals(bs5q402)) return;
        this.bs5q402 = bs5q402;
        notifyPropertyChanged(BR.bs5q402);
    }

    @Bindable
    public String getBs5q403() {
        return bs5q403;
    }

    public void setBs5q403(String bs5q403) {
        if (this.bs5q403.equals(bs5q403)) return;
        this.bs5q403 = bs5q403;
        notifyPropertyChanged(BR.bs5q403);
    }

    @Bindable
    public String getBs5q404() {
        return bs5q404;
    }

    public void setBs5q404(String bs5q404) {
        if (this.bs5q404.equals(bs5q404)) return;
        this.bs5q404 = bs5q404;
        notifyPropertyChanged(BR.bs5q404);
    }

    @Bindable
    public String getBs5q496() {
        return bs5q496;
    }

    public void setBs5q496(String bs5q496) {
        if (this.bs5q496.equals(bs5q496)) return;
        this.bs5q496 = bs5q496;
        setBs5q496x(bs5q496.equals("96") ? this.bs5q496x : "");
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
        if (this.bs5q497.equals(bs5q497)) return;
        this.bs5q497 = bs5q497;
        setBs5q401(bs5q497.equals("97") ? "" : this.bs5q401);
        setBs5q402(bs5q497.equals("97") ? "" : this.bs5q402);
        setBs5q403(bs5q497.equals("97") ? "" : this.bs5q403);
        setBs5q404(bs5q497.equals("97") ? "" : this.bs5q404);
        setBs5q496(bs5q497.equals("97") ? "" : this.bs5q496);
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
        setBs5q7(bs5q6.equals("2") ? "" : this.bs5q7);
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
        if (this.bs5q801.equals(bs5q801)) return;
        this.bs5q801 = bs5q801;
        notifyPropertyChanged(BR.bs5q801);
    }

    @Bindable
    public String getBs5q802() {
        return bs5q802;
    }

    public void setBs5q802(String bs5q802) {
        if (this.bs5q802.equals(bs5q802)) return;
        this.bs5q802 = bs5q802;
        notifyPropertyChanged(BR.bs5q802);
    }

    @Bindable
    public String getBs5q803() {
        return bs5q803;
    }

    public void setBs5q803(String bs5q803) {
        if (this.bs5q803.equals(bs5q803)) return;
        this.bs5q803 = bs5q803;
        notifyPropertyChanged(BR.bs5q803);
    }

    @Bindable
    public String getBs5q804() {
        return bs5q804;
    }

    public void setBs5q804(String bs5q804) {
        if (this.bs5q804.equals(bs5q804)) return;
        this.bs5q804 = bs5q804;
        notifyPropertyChanged(BR.bs5q804);
    }

    @Bindable
    public String getBs5q805() {
        return bs5q805;
    }

    public void setBs5q805(String bs5q805) {
        if (this.bs5q805.equals(bs5q805)) return;
        this.bs5q805 = bs5q805;
        notifyPropertyChanged(BR.bs5q805);
    }

    @Bindable
    public String getBs5q806() {
        return bs5q806;
    }

    public void setBs5q806(String bs5q806) {
        if (this.bs5q806.equals(bs5q806)) return;
        this.bs5q806 = bs5q806;
        notifyPropertyChanged(BR.bs5q806);
    }

    @Bindable
    public String getBs5q807() {
        return bs5q807;
    }

    public void setBs5q807(String bs5q807) {
        if (this.bs5q807.equals(bs5q807)) return;
        this.bs5q807 = bs5q807;
        notifyPropertyChanged(BR.bs5q807);
    }

    @Bindable
    public String getBs5q808() {
        return bs5q808;
    }

    public void setBs5q808(String bs5q808) {
        if (this.bs5q808.equals(bs5q808)) return;
        this.bs5q808 = bs5q808;
        notifyPropertyChanged(BR.bs5q808);
    }

    @Bindable
    public String getBs5q896() {
        return bs5q896;
    }

    public void setBs5q896(String bs5q896) {
        if (this.bs5q896.equals(bs5q896)) return;
        this.bs5q896 = bs5q896;
        setBs5q896x(bs5q896.equals("96") ? this.bs5q896x : "");
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
        if (this.bs5q898.equals(bs5q898)) return;
        this.bs5q898 = bs5q898;
        setBs5q801(bs5q898.equals("98") ? "" : this.bs5q801);
        setBs5q802(bs5q898.equals("98") ? "" : this.bs5q802);
        setBs5q803(bs5q898.equals("98") ? "" : this.bs5q803);
        setBs5q804(bs5q898.equals("98") ? "" : this.bs5q804);
        setBs5q805(bs5q898.equals("98") ? "" : this.bs5q805);
        setBs5q806(bs5q898.equals("98") ? "" : this.bs5q806);
        setBs5q807(bs5q898.equals("98") ? "" : this.bs5q807);
        setBs5q808(bs5q898.equals("98") ? "" : this.bs5q808);
        setBs5q896(bs5q898.equals("98") ? "" : this.bs5q896);
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
        if (this.bs5q901.equals(bs5q901)) return;
        this.bs5q901 = bs5q901;
        notifyPropertyChanged(BR.bs5q901);
    }

    @Bindable
    public String getBs5q902() {
        return bs5q902;
    }

    public void setBs5q902(String bs5q902) {
        if (this.bs5q902.equals(bs5q902)) return;
        this.bs5q902 = bs5q902;
        notifyPropertyChanged(BR.bs5q902);
    }

    @Bindable
    public String getBs5q903() {
        return bs5q903;
    }

    public void setBs5q903(String bs5q903) {
        if (this.bs5q903.equals(bs5q903)) return;
        this.bs5q903 = bs5q903;
        notifyPropertyChanged(BR.bs5q903);
    }

    @Bindable
    public String getBs5q904() {
        return bs5q904;
    }

    public void setBs5q904(String bs5q904) {
        if (this.bs5q904.equals(bs5q904)) return;
        this.bs5q904 = bs5q904;
        notifyPropertyChanged(BR.bs5q904);
    }

    @Bindable
    public String getBs5q905() {
        return bs5q905;
    }

    public void setBs5q905(String bs5q905) {
        if (this.bs5q905.equals(bs5q905)) return;
        this.bs5q905 = bs5q905;
        notifyPropertyChanged(BR.bs5q905);
    }

    @Bindable
    public String getBs5q906() {
        return bs5q906;
    }

    public void setBs5q906(String bs5q906) {
        if (this.bs5q906.equals(bs5q906)) return;
        this.bs5q906 = bs5q906;
        notifyPropertyChanged(BR.bs5q906);
    }

    @Bindable
    public String getBs5q907() {
        return bs5q907;
    }

    public void setBs5q907(String bs5q907) {
        if (this.bs5q907.equals(bs5q907)) return;
        this.bs5q907 = bs5q907;
        notifyPropertyChanged(BR.bs5q907);
    }

    @Bindable
    public String getBs5q908() {
        return bs5q908;
    }

    public void setBs5q908(String bs5q908) {
        if (this.bs5q908.equals(bs5q908)) return;
        this.bs5q908 = bs5q908;
        notifyPropertyChanged(BR.bs5q908);
    }

    @Bindable
    public String getBs5q996() {
        return bs5q996;
    }

    public void setBs5q996(String bs5q996) {
        if (this.bs5q996.equals(bs5q996)) return;
        this.bs5q996 = bs5q996;
        setBs5q996x(bs5q996.equals("96") ? this.bs5q996x : "");
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
        if (this.bs5q998.equals(bs5q998)) return;
        this.bs5q998 = bs5q998;
        setBs5q901(bs5q998.equals("98") ? "" : this.bs5q901);
        setBs5q902(bs5q998.equals("98") ? "" : this.bs5q902);
        setBs5q903(bs5q998.equals("98") ? "" : this.bs5q903);
        setBs5q904(bs5q998.equals("98") ? "" : this.bs5q904);
        setBs5q905(bs5q998.equals("98") ? "" : this.bs5q905);
        setBs5q906(bs5q998.equals("98") ? "" : this.bs5q906);
        setBs5q907(bs5q998.equals("98") ? "" : this.bs5q907);
        setBs5q908(bs5q998.equals("98") ? "" : this.bs5q908);
        setBs5q996(bs5q998.equals("98") ? "" : this.bs5q996);
        notifyPropertyChanged(BR.bs5q998);
    }

    @Bindable
    public String getBs5q10() {
        return bs5q10;
    }

    public void setBs5q10(String bs5q10) {
        this.bs5q10 = bs5q10;
        setBs5q1096x(bs5q10.equals("96") ? this.bs5q1096x : "");
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
        setBs6q1mx(bs6q1.equals("2") ? this.bs6q1mx : "");
        setBs6q2(bs6q1.equals("3") ? "" : this.bs6q2);
        setBs6q3(bs6q1.equals("3") ? this.bs6q3 : "");
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
        setBs6q3mx(bs6q3.equals("2") ? this.bs6q3mx : "");
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




    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(TableContracts.MwraTable.COLUMN_ID, this.id);
        json.put(TableContracts.MwraTable.COLUMN_UID, this.uid);
        json.put(TableContracts.MwraTable.COLUMN_PROJECT_NAME, this.projectName);

        json.put(TableContracts.MwraTable.COLUMN_UUID, this.uid);
        json.put(TableContracts.MwraTable.COLUMN_HHID, this.hhid);
        json.put(TableContracts.MwraTable.COLUMN_INDEXED, this.indexed);
        json.put(TableContracts.MwraTable.COLUMN_PSU_CODE, this.psuCode);
        json.put(TableContracts.MwraTable.COLUMN_USERNAME, this.userName);
        json.put(TableContracts.MwraTable.COLUMN_SYSDATE, this.sysDate);
        json.put(TableContracts.MwraTable.COLUMN_DEVICEID, this.deviceId);
        json.put(TableContracts.MwraTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(TableContracts.MwraTable.COLUMN_ISTATUS, this.iStatus);
        json.put(TableContracts.MwraTable.COLUMN_SYNCED, this.synced);
        json.put(TableContracts.MwraTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(TableContracts.MwraTable.COLUMN_SB1, new JSONObject(sB1toString()));
        json.put(TableContracts.MwraTable.COLUMN_SB2, new JSONObject(sB2toString()));
        json.put(TableContracts.MwraTable.COLUMN_SB3, new JSONObject(sB3toString()));
        json.put(TableContracts.MwraTable.COLUMN_SB41, new JSONObject(sB41toString()));
        json.put(TableContracts.MwraTable.COLUMN_SB42, new JSONObject(sB42toString()));
        json.put(TableContracts.MwraTable.COLUMN_SB5, new JSONObject(sB5toString()));
        json.put(TableContracts.MwraTable.COLUMN_SB6, new JSONObject(sB6toString()));
        json.put(TableContracts.MwraTable.COLUMN_SB7, new JSONObject(sB7toString()));

        return json;
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
                .put("bs2q466", bs2q466)
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
                .put("bs3q2b", bs3q2b)
                .put("bs3q2b96x", bs3q2b96x)
                .put("bs3q2c", bs3q2c)
                .put("bs3q2c96x", bs3q2c96x)
                .put("bs3q2d", bs3q2d)
                .put("bs3q2d96x", bs3q2d96x)
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

    public MWRA Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_UUID));
     // this.muid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_MUID));
        this.fmuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_FMUID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_PROJECT_NAME));
        this.psuCode = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_PSU_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_HHID));
        this.indexed = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_INDEXED));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SYNCED_DATE));


        sB1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SB1)));
        sB2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SB2)));
        sB3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SB3)));
        sB41Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SB41)));
        sB42Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SB42)));
        sB5Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SB5)));
        sB6Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SB6)));
        sB7Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SB7)));

        return this;
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
            this.bs2q466 = json.getString("bs2q466");
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
            this.bs3q2b = json.getString("bs3q2b");
            this.bs3q2b96x = json.getString("bs3q2b96x");
            this.bs3q2c = json.getString("bs3q2c");
            this.bs3q2c96x = json.getString("bs3q2c96x");
            this.bs3q2d = json.getString("bs3q2d");
            this.bs3q2d96x = json.getString("bs3q2d96x");
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




}
