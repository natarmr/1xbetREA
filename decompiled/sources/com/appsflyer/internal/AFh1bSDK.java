package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1bSDK {
    public final String AFKeystoreWrapper;
    public final long AFLogger;
    public final String d;
    public final Throwable e;
    public final AFh1dSDK force;
    public final int registerClient;
    public final long unregisterClient;
    public final String w;

    public AFh1bSDK(String str, String str2, long j, long j2, int i, AFh1dSDK aFh1dSDK, String str3, Throwable th) {
        this.d = str;
        this.AFKeystoreWrapper = str2;
        this.AFLogger = j;
        this.unregisterClient = j2;
        this.registerClient = i;
        this.force = aFh1dSDK;
        this.w = str3;
        this.e = th;
    }
}
