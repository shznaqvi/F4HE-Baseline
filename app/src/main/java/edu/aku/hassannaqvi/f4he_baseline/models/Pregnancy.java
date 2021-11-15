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

import edu.aku.hassannaqvi.f4he_baseline.BR;
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts;
import edu.aku.hassannaqvi.f4he_baseline.core.MainApp;

public class Pregnancy extends BaseObservable implements Observable {

    private final String TAG = "Pregnancy";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String Uuid = _EMPTY_;
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

    // Section Variables
    private String sB1 = _EMPTY_;

    //Field Variables;
    private String bs1q7p1g= _EMPTY_ ;
    private String bs1q7p1d= _EMPTY_;
    private String bs1q7p1d96x= _EMPTY_;
    private String bs1q7p1b= _EMPTY_;
    private String bs1q7p2g= _EMPTY_;
    private String bs1q7p2d= _EMPTY_;
    private String bs1q7p2d96x= _EMPTY_;
    private String bs1q7p2b= _EMPTY_;
    private String bs1q7p3g= _EMPTY_;
    private String bs1q7p3d= _EMPTY_;
    private String bs1q7p3d96x= _EMPTY_;
    private String bs1q7p3b= _EMPTY_;
    private String bs1q7p4g= _EMPTY_;
    private String bs1q7p4d= _EMPTY_;
    private String bs1q7p4d96x= _EMPTY_;
    private String bs1q7p4b= _EMPTY_;
    private String bs1q7p5g= _EMPTY_;
    private String bs1q7p5d= _EMPTY_;
    private String bs1q7p5d96x= _EMPTY_;
    private String bs1q7p5b= _EMPTY_;
    private String bs1q08= _EMPTY_;
    private String bs1q09= _EMPTY_;
    private String bs1q0901= _EMPTY_;
    private String bs1q0902= _EMPTY_;
    private String bs1q0903= _EMPTY_;
    private String bs1q0904= _EMPTY_;
    private String bs1q0905= _EMPTY_;
    private String bs1q0906= _EMPTY_;
    private String bs1q0907= _EMPTY_;
    private String bs1q0908= _EMPTY_;
    private String bs1q09t296= _EMPTY_;
    private String bs1q09t296x= _EMPTY_;
    private String bs1q1001= _EMPTY_;
    private String bs1q1002= _EMPTY_;
    private String bs1q1098= _EMPTY_;
    private String bs1q11= _EMPTY_;
    private String bs1q12= _EMPTY_;
    private String bs1q13= _EMPTY_;
    private String bs1q1301= _EMPTY_;
    private String bs1q1302= _EMPTY_;
    private String bs1q1303= _EMPTY_;
    private String bs1q1304= _EMPTY_;
    private String bs1q1305= _EMPTY_;
    private String bs1q1306= _EMPTY_;
    private String bs1q1307= _EMPTY_;
    private String bs1q1308= _EMPTY_;
    private String bs1q1396= _EMPTY_;
    private String bs1q1396x= _EMPTY_;


    public String getsB1() {
        return sB1;
    }

    public void setsB1(String sB1) {
        this.sB1 = sB1;
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
        return Uuid;
    }

    public String getUserName() {
        return userName;
    }

    public String getSysDate() {
        return sysDate;
    }

    public String getEbCode() {
        return ebCode;
    }

    public String getHhid() {
        return hhid;
    }

    public String getSno() {
        return sno;
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
        Uuid = uuid;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setSysDate(String sysDate) {
        this.sysDate = sysDate;
    }

    public void setEbCode(String ebCode) {
        this.ebCode = ebCode;
    }

    public void setHhid(String hhid) {
        this.hhid = hhid;
    }

    public void setSno(String sno) {
        this.sno = sno;
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


    public void Pregnancy() {

        setSysDate(MainApp.form.getSysDate());
        setUserName(MainApp.form.getUserName());
        setDeviceId(MainApp.form.getDeviceId());
        setUuid(MainApp.form.getUid());
        setAppver(MainApp.form.getAppver());
        setEbCode(MainApp.form.getEbCode());
        setHhid(MainApp.form.getHhid());
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


    public void sB1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sB1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
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

    public String sB1toString() throws JSONException {
        Log.d(TAG, "sB1toString: ");
        JSONObject json = new JSONObject();
        json.put("bs1q7p1g", bs1q7p1g)
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

    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(TableContracts.FormsTable.COLUMN_ID, this.id);
        json.put(TableContracts.FormsTable.COLUMN_UID, this.uid);
        json.put(TableContracts.FormsTable.COLUMN_ENUM_BLOCK, this.ebCode);
        json.put(TableContracts.FormsTable.COLUMN_HHID, this.hhid);
        json.put(TableContracts.FormsTable.COLUMN_SNO, this.sno);
        json.put(TableContracts.FormsTable.COLUMN_USERNAME, this.userName);
        json.put(TableContracts.FormsTable.COLUMN_SYSDATE, this.sysDate);
        json.put(TableContracts.FormsTable.COLUMN_DEVICEID, this.deviceId);
        json.put(TableContracts.FormsTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(TableContracts.FormsTable.COLUMN_ISTATUS, this.iStatus);
        json.put(TableContracts.FormsTable.COLUMN_SB1, new JSONObject(sB1toString()));
        return json;
    }


    public Pregnancy Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.Pregnancy_Table.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.Pregnancy_Table.COLUMN_UID));
        //this.ebCode = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.Pregnancy_Table.COLUMN_ENUM_BLOCK));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.Pregnancy_Table.COLUMN_HHID));
        //this.sno = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.Pregnancy_Table.COLUMN_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.Pregnancy_Table.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.Pregnancy_Table.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.Pregnancy_Table.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.Pregnancy_Table.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.Pregnancy_Table.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.Pregnancy_Table.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.Pregnancy_Table.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.Pregnancy_Table.COLUMN_SYNCED_DATE));

        sB1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.Pregnancy_Table.COLUMN_SB1)));
        return this;
    }



}
