package com.appsflyer.internal;

import a.f140;
import a.rw2;
import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
final class AFf1xSDK {
    final AFh1dSDK AFKeystoreWrapper;
    final String AFLogger;
    final AFd1fSDK<?> d;
    final String e;
    final long registerClient;
    final AFh1aSDK unregisterClient;
    final Throwable v;

    public AFf1xSDK(String str, long j, AFd1fSDK<?> aFd1fSDK, AFh1aSDK aFh1aSDK, AFh1dSDK aFh1dSDK, String str2, Throwable th) {
        str.getClass();
        this.AFLogger = str;
        this.registerClient = j;
        this.d = aFd1fSDK;
        this.unregisterClient = aFh1aSDK;
        this.AFKeystoreWrapper = aFh1dSDK;
        this.e = str2;
        this.v = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFf1xSDK)) {
            return false;
        }
        AFf1xSDK aFf1xSDK = (AFf1xSDK) obj;
        return Intrinsics.d(this.AFLogger, aFf1xSDK.AFLogger) && this.registerClient == aFf1xSDK.registerClient && Intrinsics.d(this.d, aFf1xSDK.d) && Intrinsics.d(this.unregisterClient, aFf1xSDK.unregisterClient) && this.AFKeystoreWrapper == aFf1xSDK.AFKeystoreWrapper && Intrinsics.d(this.e, aFf1xSDK.e) && Intrinsics.d(this.v, aFf1xSDK.v);
    }

    public final int hashCode() {
        int iB = rw2.b(this.AFLogger.hashCode() * 31, 31, this.registerClient);
        AFd1fSDK<?> aFd1fSDK = this.d;
        int iHashCode = (iB + (aFd1fSDK == null ? 0 : aFd1fSDK.hashCode())) * 31;
        AFh1aSDK aFh1aSDK = this.unregisterClient;
        int iHashCode2 = (iHashCode + (aFh1aSDK == null ? 0 : aFh1aSDK.hashCode())) * 31;
        AFh1dSDK aFh1dSDK = this.AFKeystoreWrapper;
        int iHashCode3 = (iHashCode2 + (aFh1dSDK == null ? 0 : aFh1dSDK.hashCode())) * 31;
        String str = this.e;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th = this.v;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        String str = this.AFLogger;
        long j = this.registerClient;
        AFd1fSDK<?> aFd1fSDK = this.d;
        AFh1aSDK aFh1aSDK = this.unregisterClient;
        AFh1dSDK aFh1dSDK = this.AFKeystoreWrapper;
        String str2 = this.e;
        Throwable th = this.v;
        StringBuilder sbO = f140.o(j, "SaveMetadataParams(cdnToken=", str, ", updateStartTime=");
        sbO.append(", response=");
        sbO.append(aFd1fSDK);
        sbO.append(", config=");
        sbO.append(aFh1aSDK);
        sbO.append(", signatureStatus=");
        sbO.append(aFh1dSDK);
        sbO.append(", cdnCacheStatus=");
        sbO.append(str2);
        sbO.append(", error=");
        sbO.append(th);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
