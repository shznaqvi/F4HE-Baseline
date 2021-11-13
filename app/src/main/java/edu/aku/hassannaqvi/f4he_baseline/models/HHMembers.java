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
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts.HHMembersTable;
import edu.aku.hassannaqvi.f4he_baseline.core.MainApp;


public class HHMembers extends BaseObservable implements Observable {

    private final String TAG = "HHMembers";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String uuid = _EMPTY_;
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
    private String sA2 = _EMPTY_;

    // FIELD VARIABLES
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


    public HHMembers() {

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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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


    public String getsA2() {
        return sA2;
    }

    public void setsA2(String sA2) {
        this.sA2 = sA2;
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
        setHl1296x(hl12.equals("96") ? this.hl1296x : "");
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


    public HHMembers Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(HHMembersTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(HHMembersTable.COLUMN_UID));
        this.ebCode = cursor.getString(cursor.getColumnIndexOrThrow(HHMembersTable.COLUMN_ENUM_BLOCK));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(HHMembersTable.COLUMN_HHID));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(HHMembersTable.COLUMN_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(HHMembersTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(HHMembersTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(HHMembersTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(HHMembersTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(HHMembersTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(HHMembersTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(HHMembersTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(HHMembersTable.COLUMN_SYNCED_DATE));

        sA2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(HHMembersTable.COLUMN_SA2)));
        return this;
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


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(HHMembersTable.COLUMN_ID, this.id);
        json.put(HHMembersTable.COLUMN_UID, this.uid);
        json.put(HHMembersTable.COLUMN_ENUM_BLOCK, this.ebCode);
        json.put(HHMembersTable.COLUMN_HHID, this.hhid);
        json.put(HHMembersTable.COLUMN_SNO, this.sno);
        json.put(HHMembersTable.COLUMN_USERNAME, this.userName);
        json.put(HHMembersTable.COLUMN_SYSDATE, this.sysDate);
        json.put(HHMembersTable.COLUMN_DEVICEID, this.deviceId);
        json.put(HHMembersTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(HHMembersTable.COLUMN_ISTATUS, this.iStatus);
        json.put(HHMembersTable.COLUMN_SA2, new JSONObject(sA2toString()));
        return json;
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


}
