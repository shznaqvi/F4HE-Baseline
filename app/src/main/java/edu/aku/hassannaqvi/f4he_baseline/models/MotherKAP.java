package edu.aku.hassannaqvi.f4he_baseline.models;

import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp._EMPTY_;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.f4he_baseline.BR;
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts;
import edu.aku.hassannaqvi.f4he_baseline.core.MainApp;


public class MotherKAP extends BaseObservable implements Observable {

    private final String TAG = "MotherKAP";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String uuid = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    private String psuCode = _EMPTY_;
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
    private final String sDS = _EMPTY_;

   /* // FIELD VARIABLES
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
    private String bs7q4h = _EMPTY_;*/

    // DS1

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

    public MotherKAP() {
    }

    public void populateMeta() {

        setSysDate(MainApp.form.getSysDate());
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        //   setUuid(MainApp.form.getUid());  // not applicable in Form table
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
        setpsuCode(MainApp.selectedPSU);
        setHhid(MainApp.selectedHHID);

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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Bindable
    public String getpsuCode() {
        return psuCode;
    }

    public void setpsuCode(String psuCode) {
        this.psuCode = psuCode;
        notifyPropertyChanged(BR.psuCode);
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

    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(TableContracts.MotherKAPTable.COLUMN_ID, this.id);
        json.put(TableContracts.MotherKAPTable.COLUMN_UID, this.uid);
        json.put(TableContracts.MotherKAPTable.COLUMN_UUID, this.uid);
        json.put(TableContracts.MotherKAPTable.COLUMN_HHID, this.hhid);
        json.put(TableContracts.MotherKAPTable.COLUMN_USERNAME, this.userName);
        json.put(TableContracts.MotherKAPTable.COLUMN_SYSDATE, this.sysDate);
        json.put(TableContracts.MotherKAPTable.COLUMN_DEVICEID, this.deviceId);
        json.put(TableContracts.MotherKAPTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(TableContracts.MotherKAPTable.COLUMN_ISTATUS, this.iStatus);
        json.put(TableContracts.MotherKAPTable.COLUMN_SD1, new JSONObject(sD1toString()));
        json.put(TableContracts.MotherKAPTable.COLUMN_SD2, new JSONObject(sD2toString()));
        json.put(TableContracts.MotherKAPTable.COLUMN_SD3, new JSONObject(sD3toString()));
        return json;
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


    public MotherKAP Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_UID));
        //this.psuCode = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_PSU_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_HHID));
        //this.sno = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SYNCED_DATE));

        sD1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MotherKAPTable.COLUMN_SD1)));
        sD2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MotherKAPTable.COLUMN_SD2)));
        sD3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MotherKAPTable.COLUMN_SD3)));
        return this;
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


}
