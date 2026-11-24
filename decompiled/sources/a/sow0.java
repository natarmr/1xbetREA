package a;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzdd;

/* JADX INFO: loaded from: classes2.dex */
public final class sow0 extends y4w0 implements yow0 {
    @Override // a.yow0
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        parcelG.writeLong(j);
        H(parcelG, 23);
    }

    @Override // a.yow0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        wmw0.b(parcelG, bundle);
        H(parcelG, 9);
    }

    @Override // a.yow0
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        parcelG.writeLong(j);
        H(parcelG, 24);
    }

    @Override // a.yow0
    public final void generateEventId(gpw0 gpw0Var) {
        Parcel parcelG = G();
        wmw0.c(parcelG, gpw0Var);
        H(parcelG, 22);
    }

    @Override // a.yow0
    public final void getCachedAppInstanceId(gpw0 gpw0Var) {
        Parcel parcelG = G();
        wmw0.c(parcelG, gpw0Var);
        H(parcelG, 19);
    }

    @Override // a.yow0
    public final void getConditionalUserProperties(String str, String str2, gpw0 gpw0Var) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        wmw0.c(parcelG, gpw0Var);
        H(parcelG, 10);
    }

    @Override // a.yow0
    public final void getCurrentScreenClass(gpw0 gpw0Var) {
        Parcel parcelG = G();
        wmw0.c(parcelG, gpw0Var);
        H(parcelG, 17);
    }

    @Override // a.yow0
    public final void getCurrentScreenName(gpw0 gpw0Var) {
        Parcel parcelG = G();
        wmw0.c(parcelG, gpw0Var);
        H(parcelG, 16);
    }

    @Override // a.yow0
    public final void getGmpAppId(gpw0 gpw0Var) {
        Parcel parcelG = G();
        wmw0.c(parcelG, gpw0Var);
        H(parcelG, 21);
    }

    @Override // a.yow0
    public final void getMaxUserProperties(String str, gpw0 gpw0Var) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        wmw0.c(parcelG, gpw0Var);
        H(parcelG, 6);
    }

    @Override // a.yow0
    public final void getUserProperties(String str, String str2, boolean z, gpw0 gpw0Var) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        ClassLoader classLoader = wmw0.f39422a;
        parcelG.writeInt(z ? 1 : 0);
        wmw0.c(parcelG, gpw0Var);
        H(parcelG, 5);
    }

    @Override // a.yow0
    public final void initialize(gvw gvwVar, zzdb zzdbVar, long j) {
        Parcel parcelG = G();
        wmw0.c(parcelG, gvwVar);
        wmw0.b(parcelG, zzdbVar);
        parcelG.writeLong(j);
        H(parcelG, 1);
    }

    @Override // a.yow0
    public final void initializeWithElapsedTime(gvw gvwVar, zzdb zzdbVar, long j, long j2) {
        Parcel parcelG = G();
        wmw0.c(parcelG, gvwVar);
        wmw0.b(parcelG, zzdbVar);
        parcelG.writeLong(j);
        parcelG.writeLong(j2);
        H(parcelG, 60);
    }

    @Override // a.yow0
    public final void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        wmw0.b(parcelG, bundle);
        parcelG.writeInt(z ? 1 : 0);
        parcelG.writeInt(1);
        parcelG.writeLong(j);
        parcelG.writeLong(j2);
        H(parcelG, 59);
    }

    @Override // a.yow0
    public final void logHealthData(int i, String str, gvw gvwVar, gvw gvwVar2, gvw gvwVar3) {
        Parcel parcelG = G();
        parcelG.writeInt(5);
        parcelG.writeString("Error with data collection. Data lost.");
        wmw0.c(parcelG, gvwVar);
        wmw0.c(parcelG, gvwVar2);
        wmw0.c(parcelG, gvwVar3);
        H(parcelG, 33);
    }

    @Override // a.yow0
    public final void onActivityCreatedByScionActivityInfo(zzdd zzddVar, Bundle bundle, long j) {
        Parcel parcelG = G();
        wmw0.b(parcelG, zzddVar);
        wmw0.b(parcelG, bundle);
        parcelG.writeLong(j);
        H(parcelG, 53);
    }

    @Override // a.yow0
    public final void onActivityDestroyedByScionActivityInfo(zzdd zzddVar, long j) {
        Parcel parcelG = G();
        wmw0.b(parcelG, zzddVar);
        parcelG.writeLong(j);
        H(parcelG, 54);
    }

    @Override // a.yow0
    public final void onActivityPausedByScionActivityInfo(zzdd zzddVar, long j) {
        Parcel parcelG = G();
        wmw0.b(parcelG, zzddVar);
        parcelG.writeLong(j);
        H(parcelG, 55);
    }

    @Override // a.yow0
    public final void onActivityResumedByScionActivityInfo(zzdd zzddVar, long j) {
        Parcel parcelG = G();
        wmw0.b(parcelG, zzddVar);
        parcelG.writeLong(j);
        H(parcelG, 56);
    }

    @Override // a.yow0
    public final void onActivitySaveInstanceStateByScionActivityInfo(zzdd zzddVar, gpw0 gpw0Var, long j) {
        Parcel parcelG = G();
        wmw0.b(parcelG, zzddVar);
        wmw0.c(parcelG, gpw0Var);
        parcelG.writeLong(j);
        H(parcelG, 57);
    }

    @Override // a.yow0
    public final void onActivityStartedByScionActivityInfo(zzdd zzddVar, long j) {
        Parcel parcelG = G();
        wmw0.b(parcelG, zzddVar);
        parcelG.writeLong(j);
        H(parcelG, 51);
    }

    @Override // a.yow0
    public final void onActivityStoppedByScionActivityInfo(zzdd zzddVar, long j) {
        Parcel parcelG = G();
        wmw0.b(parcelG, zzddVar);
        parcelG.writeLong(j);
        H(parcelG, 52);
    }

    @Override // a.yow0
    public final void registerOnMeasurementEventListener(rpw0 rpw0Var) {
        Parcel parcelG = G();
        wmw0.c(parcelG, rpw0Var);
        H(parcelG, 35);
    }

    @Override // a.yow0
    public final void retrieveAndUploadBatches(mpw0 mpw0Var) {
        Parcel parcelG = G();
        wmw0.c(parcelG, mpw0Var);
        H(parcelG, 58);
    }

    @Override // a.yow0
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelG = G();
        wmw0.b(parcelG, bundle);
        parcelG.writeLong(j);
        H(parcelG, 8);
    }

    @Override // a.yow0
    public final void setConsentThirdParty(Bundle bundle, long j) {
        Parcel parcelG = G();
        wmw0.b(parcelG, bundle);
        parcelG.writeLong(j);
        H(parcelG, 45);
    }

    @Override // a.yow0
    public final void setCurrentScreenByScionActivityInfo(zzdd zzddVar, String str, String str2, long j) {
        Parcel parcelG = G();
        wmw0.b(parcelG, zzddVar);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        parcelG.writeLong(j);
        H(parcelG, 50);
    }

    @Override // a.yow0
    public final void setDataCollectionEnabled(boolean z) {
        throw null;
    }

    @Override // a.yow0
    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel parcelG = G();
        ClassLoader classLoader = wmw0.f39422a;
        parcelG.writeInt(z ? 1 : 0);
        parcelG.writeLong(j);
        H(parcelG, 11);
    }

    @Override // a.yow0
    public final void setUserId(String str, long j) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        parcelG.writeLong(j);
        H(parcelG, 7);
    }

    @Override // a.yow0
    public final void setUserProperty(String str, String str2, gvw gvwVar, boolean z, long j) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        wmw0.c(parcelG, gvwVar);
        parcelG.writeInt(z ? 1 : 0);
        parcelG.writeLong(j);
        H(parcelG, 4);
    }
}
