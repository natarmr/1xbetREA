.class public interface abstract La/yow0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# virtual methods
.method public abstract beginAdUnitExposure(Ljava/lang/String;J)V
.end method

.method public abstract clearConditionalUserProperty(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
.end method

.method public abstract clearMeasurementEnabled(J)V
.end method

.method public abstract endAdUnitExposure(Ljava/lang/String;J)V
.end method

.method public abstract generateEventId(La/gpw0;)V
.end method

.method public abstract getAppInstanceId(La/gpw0;)V
.end method

.method public abstract getCachedAppInstanceId(La/gpw0;)V
.end method

.method public abstract getConditionalUserProperties(Ljava/lang/String;Ljava/lang/String;La/gpw0;)V
.end method

.method public abstract getCurrentScreenClass(La/gpw0;)V
.end method

.method public abstract getCurrentScreenName(La/gpw0;)V
.end method

.method public abstract getGmpAppId(La/gpw0;)V
.end method

.method public abstract getMaxUserProperties(Ljava/lang/String;La/gpw0;)V
.end method

.method public abstract getSessionId(La/gpw0;)V
.end method

.method public abstract getTestFlag(La/gpw0;I)V
.end method

.method public abstract getUserProperties(Ljava/lang/String;Ljava/lang/String;ZLa/gpw0;)V
.end method

.method public abstract initForTests(Ljava/util/Map;)V
.end method

.method public abstract initialize(La/gvw;Lcom/google/android/gms/internal/measurement/zzdb;J)V
.end method

.method public abstract initializeWithElapsedTime(La/gvw;Lcom/google/android/gms/internal/measurement/zzdb;JJ)V
.end method

.method public abstract isDataCollectionEnabled(La/gpw0;)V
.end method

.method public abstract logEvent(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V
.end method

.method public abstract logEventAndBundle(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;La/gpw0;J)V
.end method

.method public abstract logEventWithElapsedTime(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJJ)V
.end method

.method public abstract logHealthData(ILjava/lang/String;La/gvw;La/gvw;La/gvw;)V
.end method

.method public abstract onActivityCreated(La/gvw;Landroid/os/Bundle;J)V
.end method

.method public abstract onActivityCreatedByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdd;Landroid/os/Bundle;J)V
.end method

.method public abstract onActivityDestroyed(La/gvw;J)V
.end method

.method public abstract onActivityDestroyedByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdd;J)V
.end method

.method public abstract onActivityPaused(La/gvw;J)V
.end method

.method public abstract onActivityPausedByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdd;J)V
.end method

.method public abstract onActivityResumed(La/gvw;J)V
.end method

.method public abstract onActivityResumedByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdd;J)V
.end method

.method public abstract onActivitySaveInstanceState(La/gvw;La/gpw0;J)V
.end method

.method public abstract onActivitySaveInstanceStateByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdd;La/gpw0;J)V
.end method

.method public abstract onActivityStarted(La/gvw;J)V
.end method

.method public abstract onActivityStartedByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdd;J)V
.end method

.method public abstract onActivityStopped(La/gvw;J)V
.end method

.method public abstract onActivityStoppedByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdd;J)V
.end method

.method public abstract performAction(Landroid/os/Bundle;La/gpw0;J)V
.end method

.method public abstract registerOnMeasurementEventListener(La/rpw0;)V
.end method

.method public abstract resetAnalyticsData(J)V
.end method

.method public abstract resetAnalyticsDataWithElapsedTime(JJ)V
.end method

.method public abstract retrieveAndUploadBatches(La/mpw0;)V
.end method

.method public abstract setConditionalUserProperty(Landroid/os/Bundle;J)V
.end method

.method public abstract setConsent(Landroid/os/Bundle;J)V
.end method

.method public abstract setConsentThirdParty(Landroid/os/Bundle;J)V
.end method

.method public abstract setCurrentScreen(La/gvw;Ljava/lang/String;Ljava/lang/String;J)V
.end method

.method public abstract setCurrentScreenByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdd;Ljava/lang/String;Ljava/lang/String;J)V
.end method

.method public abstract setDataCollectionEnabled(Z)V
.end method

.method public abstract setDefaultEventParameters(Landroid/os/Bundle;)V
.end method

.method public abstract setEventInterceptor(La/rpw0;)V
.end method

.method public abstract setInstanceIdProvider(La/eqw0;)V
.end method

.method public abstract setMeasurementEnabled(ZJ)V
.end method

.method public abstract setMinimumSessionDuration(J)V
.end method

.method public abstract setSessionTimeoutDuration(J)V
.end method

.method public abstract setSgtmDebugInfo(Landroid/content/Intent;)V
.end method

.method public abstract setUserId(Ljava/lang/String;J)V
.end method

.method public abstract setUserProperty(Ljava/lang/String;Ljava/lang/String;La/gvw;ZJ)V
.end method

.method public abstract unregisterOnMeasurementEventListener(La/rpw0;)V
.end method
