package a;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzdd;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface yow0 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(gpw0 gpw0Var);

    void getAppInstanceId(gpw0 gpw0Var);

    void getCachedAppInstanceId(gpw0 gpw0Var);

    void getConditionalUserProperties(String str, String str2, gpw0 gpw0Var);

    void getCurrentScreenClass(gpw0 gpw0Var);

    void getCurrentScreenName(gpw0 gpw0Var);

    void getGmpAppId(gpw0 gpw0Var);

    void getMaxUserProperties(String str, gpw0 gpw0Var);

    void getSessionId(gpw0 gpw0Var);

    void getTestFlag(gpw0 gpw0Var, int i);

    void getUserProperties(String str, String str2, boolean z, gpw0 gpw0Var);

    void initForTests(Map map);

    void initialize(gvw gvwVar, zzdb zzdbVar, long j);

    void initializeWithElapsedTime(gvw gvwVar, zzdb zzdbVar, long j, long j2);

    void isDataCollectionEnabled(gpw0 gpw0Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, gpw0 gpw0Var, long j);

    void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2);

    void logHealthData(int i, String str, gvw gvwVar, gvw gvwVar2, gvw gvwVar3);

    void onActivityCreated(gvw gvwVar, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(zzdd zzddVar, Bundle bundle, long j);

    void onActivityDestroyed(gvw gvwVar, long j);

    void onActivityDestroyedByScionActivityInfo(zzdd zzddVar, long j);

    void onActivityPaused(gvw gvwVar, long j);

    void onActivityPausedByScionActivityInfo(zzdd zzddVar, long j);

    void onActivityResumed(gvw gvwVar, long j);

    void onActivityResumedByScionActivityInfo(zzdd zzddVar, long j);

    void onActivitySaveInstanceState(gvw gvwVar, gpw0 gpw0Var, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(zzdd zzddVar, gpw0 gpw0Var, long j);

    void onActivityStarted(gvw gvwVar, long j);

    void onActivityStartedByScionActivityInfo(zzdd zzddVar, long j);

    void onActivityStopped(gvw gvwVar, long j);

    void onActivityStoppedByScionActivityInfo(zzdd zzddVar, long j);

    void performAction(Bundle bundle, gpw0 gpw0Var, long j);

    void registerOnMeasurementEventListener(rpw0 rpw0Var);

    void resetAnalyticsData(long j);

    void resetAnalyticsDataWithElapsedTime(long j, long j2);

    void retrieveAndUploadBatches(mpw0 mpw0Var);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(gvw gvwVar, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(zzdd zzddVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(rpw0 rpw0Var);

    void setInstanceIdProvider(eqw0 eqw0Var);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, gvw gvwVar, boolean z, long j);

    void unregisterOnMeasurementEventListener(rpw0 rpw0Var);
}
