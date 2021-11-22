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
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts.MotherKAPTable;
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

        json.put(MotherKAPTable.COLUMN_ID, this.id);
        json.put(MotherKAPTable.COLUMN_UID, this.uid);
        json.put(MotherKAPTable.COLUMN_UUID, this.uid);
        json.put(MotherKAPTable.COLUMN_PSU_CODE, this.psuCode);
        json.put(MotherKAPTable.COLUMN_HHID, this.hhid);
        json.put(MotherKAPTable.COLUMN_USERNAME, this.userName);
        json.put(MotherKAPTable.COLUMN_SYSDATE, this.sysDate);
        json.put(MotherKAPTable.COLUMN_DEVICEID, this.deviceId);
        json.put(MotherKAPTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(MotherKAPTable.COLUMN_ISTATUS, this.iStatus);
        json.put(MotherKAPTable.COLUMN_SD1, new JSONObject(sD1toString()));
        json.put(MotherKAPTable.COLUMN_SD2, new JSONObject(sD2toString()));
        json.put(MotherKAPTable.COLUMN_SD3, new JSONObject(sD3toString()));
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
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(MotherKAPTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(MotherKAPTable.COLUMN_UID));
        this.psuCode = cursor.getString(cursor.getColumnIndexOrThrow(MotherKAPTable.COLUMN_PSU_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(MotherKAPTable.COLUMN_HHID));
        //this.sno = cursor.getString(cursor.getColumnIndexOrThrow(MotherKAPTable.COLUMN_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(MotherKAPTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(MotherKAPTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(MotherKAPTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(MotherKAPTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(MotherKAPTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(MotherKAPTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(MotherKAPTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(MotherKAPTable.COLUMN_SYNCED_DATE));

        sD1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(MotherKAPTable.COLUMN_SD1)));
        sD2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(MotherKAPTable.COLUMN_SD2)));
        sD3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(MotherKAPTable.COLUMN_SD3)));
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
