package edu.aku.hassannaqvi.f4he_baseline.models;

import static edu.aku.hassannaqvi.f4he_baseline.core.MainApp._EMPTY_;

import androidx.databinding.BaseObservable;
import androidx.databinding.PropertyChangeRegistry;

import java.time.LocalDate;

import edu.aku.hassannaqvi.f4he_baseline.core.MainApp;

public class MWRA extends BaseObservable {

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
    private String cluster = _EMPTY_;
    private String hhid = _EMPTY_;
    private String ebCode = _EMPTY_;
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

    //Field Variables bs2


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

    public String getCluster() {
        return cluster;
    }

    public String getHhid() {
        return hhid;
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

    public String getBs1resp() {
        return bs1resp;
    }

    public String getBs1respline() {
        return bs1respline;
    }

    public String getBs1con() {
        return bs1con;
    }

    public String getBs1q1() {
        return bs1q1;
    }

    public String getBs1q2() {
        return bs1q2;
    }

    public String getBs1q3() {
        return bs1q3;
    }

    public String getBs1q4() {
        return bs1q4;
    }

    public String getBs1q5() {
        return bs1q5;
    }

    public String getBs1q6() {
        return bs1q6;
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

    public void setBs1resp(String bs1resp) {
        this.bs1resp = bs1resp;
    }

    public void setBs1respline(String bs1respline) {
        this.bs1respline = bs1respline;
    }

    public void setBs1con(String bs1con) {
        this.bs1con = bs1con;
    }

    public void setBs1q1(String bs1q1) {
        this.bs1q1 = bs1q1;
    }

    public void setBs1q2(String bs1q2) {
        this.bs1q2 = bs1q2;
    }

    public void setBs1q3(String bs1q3) {
        this.bs1q3 = bs1q3;
    }

    public void setBs1q4(String bs1q4) {
        this.bs1q4 = bs1q4;
    }

    public void setBs1q5(String bs1q5) {
        this.bs1q5 = bs1q5;
    }

    public void setBs1q6(String bs1q6) {
        this.bs1q6 = bs1q6;
    }

    public String getEbCode() {
        return ebCode;
    }

    private void setEbCode(String ebCode) {
        this.ebCode = ebCode;
    }


    public void Mwra() {

        setSysDate(MainApp.form.getSysDate());
        setUserName(MainApp.form.getUserName());
        setDeviceId(MainApp.form.getDeviceId());
        setUuid(MainApp.form.getUid());
        setAppver(MainApp.form.getAppver());
        setEbCode(MainApp.form.getEbCode());
        setHhid(MainApp.form.getHhid());
    }
}
