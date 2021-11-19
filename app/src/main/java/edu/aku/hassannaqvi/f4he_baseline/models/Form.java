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
    private String projectName = PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
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
    private String sA1 = _EMPTY_;
    private String sC1 = _EMPTY_;
    private String sC2 = _EMPTY_;
    private String sC31 = _EMPTY_;
    private String sC32 = _EMPTY_;
    private String sC4 = _EMPTY_;
    private String sC5 = _EMPTY_;
    private String sD1 = _EMPTY_;
    private String sD2 = _EMPTY_;
    private String sD3 = _EMPTY_;

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


    public Form() {

        setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setAppver(MainApp.appInfo.getAppVersion());
        setAppver(MainApp.appInfo.getAppVersion());

    }


    public void populateMeta() {

        setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        //   setUuid(MainApp.form.getUid());  // not applicable in Form table
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
        setPsuCode(MainApp.selectedPSU);
        setHhid(MainApp.selectedHHID);

    }


    /*public void populateMeta() {

        setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        //   setUuid(MainApp.form.getUid());  // not applicable in Form table
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
        setPsuCode(MainApp.selectedPSU);
        setHhid(MainApp.selectedHHID);

    }


    public void populateMeta() {

        setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        //   setUuid(MainApp.form.getUid());  // not applicable in Form table
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
        setPsuCode(MainApp.selectedPSU);
        setHhid(MainApp.selectedHHID);

    }*/


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
    public String getPsuCode() {
        return psuCode;
    }

    public void setPsuCode(String psuCode) {
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
        setAs1q09(as1q23.equals("2") ? "" : this.as1q09);
        setAs1q10(as1q23.equals("2") ? "" : this.as1q10);
        setAs1q23a(as1q23.equals("2") ? "" : this.as1q23a);
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
        setCs1q8096x(cs1q8.equals("96") ? this.cs1q8096x : "");
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
        setCs1q9096x(cs1q9.equals("96") ? this.cs1q9096x : "");
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
        setCs1q11(cs1q10.equals("2") ? this.cs1q11 : "");
        notifyPropertyChanged(BR.cs1q10);
    }

    @Bindable
    public String getCs1q11() {
        return cs1q11;
    }

    public void setCs1q11(String cs1q11) {
        this.cs1q11 = cs1q11;
        setCs1q11096x(cs1q11.equals("96") ? this.cs1q11096x : "");
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
        setCs2q0801(cs2q07.equals("2") ? "" : this.cs2q0801);
        setCs2q08021(cs2q07.equals("2") ? "" : this.cs2q08021);
        setCs2q08022(cs2q07.equals("2") ? "" : this.cs2q08022);
        setCs2q08023(cs2q07.equals("2") ? "" : this.cs2q08023);
        setCs2q08024(cs2q07.equals("2") ? "" : this.cs2q08024);
        setCs2q0803(cs2q07.equals("2") ? "" : this.cs2q0803);
        setCs2q0804(cs2q07.equals("2") ? "" : this.cs2q0804);
        setCs2q0805(cs2q07.equals("2") ? "" : this.cs2q0805);
        setCs2q0806(cs2q07.equals("2") ? "" : this.cs2q0806);
        setCs2q0807(cs2q07.equals("2") ? "" : this.cs2q0807);
        setCs2q08081(cs2q07.equals("2") ? "" : this.cs2q08081);
        setCs2q08082(cs2q07.equals("2") ? "" : this.cs2q08082);
        setCs2q08083(cs2q07.equals("2") ? "" : this.cs2q08083);
        setCs2q0809(cs2q07.equals("2") ? "" : this.cs2q0809);
        setCs2q0810(cs2q07.equals("2") ? "" : this.cs2q0810);
        setCs2q0811(cs2q07.equals("2") ? "" : this.cs2q0811);
        setCs2q0812(cs2q07.equals("2") ? "" : this.cs2q0812);
        setCs2q0813(cs2q07.equals("2") ? "" : this.cs2q0813);
        setCs2q0814(cs2q07.equals("2") ? "" : this.cs2q0814);
        setCs2q0815(cs2q07.equals("2") ? "" : this.cs2q0815);
        setCs2q0816(cs2q07.equals("2") ? "" : this.cs2q0816);
        setCs2q0817(cs2q07.equals("2") ? "" : this.cs2q0817);
        setCs2q0818(cs2q07.equals("2") ? "" : this.cs2q0818);
        setCs2q0819(cs2q07.equals("2") ? "" : this.cs2q0819);
        setCs2q0820(cs2q07.equals("2") ? "" : this.cs2q0820);
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
        setCs3bq05(cs3bq04.equals("1") ? "" : this.cs3bq05);
        setCs3bq05aa(cs3bq04.equals("1") ? "" : this.cs3bq05aa);
        setCs3bq05ab(cs3bq04.equals("1") ? "" : this.cs3bq05ab);
        setCs3bq05ax(cs3bq04.equals("1") ? "" : this.cs3bq05ax);
        setCs3bq05a97(cs3bq04.equals("1") ? "" : this.cs3bq05a97);
        setCs3bq05ba(cs3bq04.equals("1") ? "" : this.cs3bq05ba);
        setCs3bq05bb(cs3bq04.equals("1") ? "" : this.cs3bq05bb);
        setCs3bq05bx(cs3bq04.equals("1") ? "" : this.cs3bq05bx);
        setCs3bq05b97(cs3bq04.equals("1") ? "" : this.cs3bq05b97);
        setCs3bq05ca(cs3bq04.equals("1") ? "" : this.cs3bq05ca);
        setCs3bq05cb(cs3bq04.equals("1") ? "" : this.cs3bq05cb);
        setCs3bq05cx(cs3bq04.equals("1") ? "" : this.cs3bq05cx);
        setCs3bq05c97(cs3bq04.equals("1") ? "" : this.cs3bq05c97);
        setCs3bq05da(cs3bq04.equals("1") ? "" : this.cs3bq05da);
        setCs3bq05db(cs3bq04.equals("1") ? "" : this.cs3bq05db);
        setCs3bq05dx(cs3bq04.equals("1") ? "" : this.cs3bq05dx);
        setCs3bq05d97(cs3bq04.equals("1") ? "" : this.cs3bq05d97);
        setCs3bq05ea(cs3bq04.equals("1") ? "" : this.cs3bq05ea);
        setCs3bq05eb(cs3bq04.equals("1") ? "" : this.cs3bq05eb);
        setCs3bq05ex(cs3bq04.equals("1") ? "" : this.cs3bq05ex);
        setCs3bq05e97(cs3bq04.equals("1") ? "" : this.cs3bq05e97);
        setCs3bq05fa(cs3bq04.equals("1") ? "" : this.cs3bq05fa);
        setCs3bq05fb(cs3bq04.equals("1") ? "" : this.cs3bq05fb);
        setCs3bq05fx(cs3bq04.equals("1") ? "" : this.cs3bq05fx);
        setCs3bq05f97(cs3bq04.equals("1") ? "" : this.cs3bq05f97);
        setCs3bq06(cs3bq04.equals("1") ? "" : this.cs3bq06);
        setCs3bq07(cs3bq04.equals("1") ? "" : this.cs3bq07);
        setCs3bq08(cs3bq04.equals("1") ? "" : this.cs3bq08);
        setCs3bq09(cs3bq04.equals("1") ? "" : this.cs3bq09);
        setCs3bq10(cs3bq04.equals("1") ? "" : this.cs3bq10);
        setCs3bq11(cs3bq04.equals("1") ? "" : this.cs3bq11);
        setCs3bq12(cs3bq04.equals("1") ? "" : this.cs3bq12);
        setCs3bq13(cs3bq04.equals("1") ? "" : this.cs3bq13);
        setCs3bq14(cs3bq04.equals("1") ? "" : this.cs3bq14);
        setCs3bq15(cs3bq04.equals("1") ? "" : this.cs3bq15);
        setCs3bq16(cs3bq04.equals("1") ? "" : this.cs3bq16);
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
        setCs3bq07(cs3bq06.equals("1") ? "" : this.cs3bq07);
        setCs3bq08(cs3bq06.equals("1") ? "" : this.cs3bq08);
        setCs3bq09(cs3bq06.equals("1") ? "" : this.cs3bq09);
        setCs3bq10(cs3bq06.equals("1") ? "" : this.cs3bq10);
        setCs3bq11(cs3bq06.equals("1") ? "" : this.cs3bq11);
        setCs3bq12(cs3bq06.equals("1") ? "" : this.cs3bq12);
        setCs3bq13(cs3bq06.equals("1") ? "" : this.cs3bq13);
        setCs3bq14(cs3bq06.equals("1") ? "" : this.cs3bq14);
        setCs3bq15(cs3bq06.equals("1") ? "" : this.cs3bq15);
        setCs3bq16(cs3bq06.equals("1") ? "" : this.cs3bq16);
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
        setCs4q02a(cs4q01.equals("1") ? "" : this.cs4q02a);
        setCs4q02b(cs4q01.equals("1") ? "" : this.cs4q02b);
        setCs4q02c(cs4q01.equals("1") ? "" : this.cs4q02c);
        setCs4q02d(cs4q01.equals("1") ? "" : this.cs4q02d);
        setCs4q02e(cs4q01.equals("1") ? "" : this.cs4q02e);
        setCs4q02f(cs4q01.equals("1") ? "" : this.cs4q02f);
        setCs4q02g(cs4q01.equals("1") ? "" : this.cs4q02g);
        setCs4q02h(cs4q01.equals("1") ? "" : this.cs4q02h);
        setCs4q02i(cs4q01.equals("1") ? "" : this.cs4q02i);
        setCs4q02j(cs4q01.equals("1") ? "" : this.cs4q02j);
        setCs4q02k(cs4q01.equals("1") ? "" : this.cs4q02k);
        setCs4q03(cs4q01.equals("1") ? "" : this.cs4q03);
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
        setCs5q02(cs5q01.equals("1") ? "" : this.cs5q02);
        setCs5q03(cs5q01.equals("1") ? "" : this.cs5q03);
        setCs5q04(cs5q01.equals("1") ? "" : this.cs5q04);
        setCs5q05(cs5q01.equals("1") ? "" : this.cs5q05);
        setCs5q06a(cs5q01.equals("1") ? "" : this.cs5q06a);
        setCs5q06b(cs5q01.equals("1") ? "" : this.cs5q06b);
        setCs5q07(cs5q01.equals("1") ? "" : this.cs5q07);
        setCs5q08a(cs5q01.equals("1") ? "" : this.cs5q08a);
        setCs5q08b(cs5q01.equals("1") ? "" : this.cs5q08b);
        setCs5q09(cs5q01.equals("1") ? "" : this.cs5q09);
        setCs5q10(cs5q01.equals("1") ? "" : this.cs5q10);
        setCs5q11(cs5q01.equals("1") ? "" : this.cs5q11);
        setCs5q12(cs5q01.equals("1") ? "" : this.cs5q12);
        setCs5q13(cs5q01.equals("1") ? "" : this.cs5q13);
        setCs5q14(cs5q01.equals("1") ? "" : this.cs5q14);
        setCs5q15(cs5q01.equals("1") ? "" : this.cs5q15);
        setCs5q16(cs5q01.equals("1") ? "" : this.cs5q16);
        setCs5q17(cs5q01.equals("1") ? "" : this.cs5q17);
        setCs5q18(cs5q01.equals("1") ? "" : this.cs5q18);
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
        setCs5q06a(cs5q05.equals("2") ? "" : cs5q06a);
        setCs5q06b(cs5q05.equals("1") ? "" : cs5q06b);
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
        setCs5q08a(cs5q07.equals("2") ? "" : cs5q08a);
        setCs5q08b(cs5q07.equals("1") ? "" : cs5q08b);
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
        setCs5q10(cs5q09.equals("2") ? "" : this.cs5q10);
        setCs5q11(cs5q09.equals("2") ? "" : this.cs5q11);
        setCs5q12(cs5q09.equals("2") ? "" : this.cs5q12);
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




    public Form Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_UID));
        this.psuCode = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_PSU_CODE));
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
        sC1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SC1)));
        sC2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SC2)));
        sC31Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SC31)));
        sC32Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SC32)));
        sC4Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SC4)));
        sC5Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SC5)));
        sD1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SD1)));
        sD2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SD2)));
        sD3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SD3)));
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


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(FormsTable.COLUMN_ID, this.id);
        json.put(FormsTable.COLUMN_UID, this.uid);
        json.put(FormsTable.COLUMN_PSU_CODE, this.psuCode);
        json.put(FormsTable.COLUMN_HHID, this.hhid);
        json.put(FormsTable.COLUMN_SNO, this.sno);
        json.put(FormsTable.COLUMN_USERNAME, this.userName);
        json.put(FormsTable.COLUMN_SYSDATE, this.sysDate);
        json.put(FormsTable.COLUMN_DEVICEID, this.deviceId);
        json.put(FormsTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(FormsTable.COLUMN_ISTATUS, this.iStatus);
        json.put(FormsTable.COLUMN_SA1, new JSONObject(sA1toString()));
        json.put(FormsTable.COLUMN_SC1, new JSONObject(sC1toString()));
        json.put(FormsTable.COLUMN_SC2, new JSONObject(sC2toString()));
        json.put(FormsTable.COLUMN_SC31, new JSONObject(sC31toString()));
        json.put(FormsTable.COLUMN_SC32, new JSONObject(sC32toString()));
        json.put(FormsTable.COLUMN_SC4, new JSONObject(sC4toString()));
        json.put(FormsTable.COLUMN_SC5, new JSONObject(sC5toString()));
        json.put(FormsTable.COLUMN_SD1, new JSONObject(sD1toString()));
        json.put(FormsTable.COLUMN_SD2, new JSONObject(sD2toString()));
        json.put(FormsTable.COLUMN_SD3, new JSONObject(sD3toString()));
        return json;
    }


}
