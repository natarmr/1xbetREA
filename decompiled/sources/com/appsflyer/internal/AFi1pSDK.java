package com.appsflyer.internal;

import a.kng0;
import a.rw2;
import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1pSDK {
    public final long AFKeystoreWrapper;
    public final String d;
    public final long registerClient;
    public final String unregisterClient;

    public AFi1pSDK(long j, long j2, String str, String str2) {
        this.registerClient = j;
        this.AFKeystoreWrapper = j2;
        this.unregisterClient = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFi1pSDK)) {
            return false;
        }
        AFi1pSDK aFi1pSDK = (AFi1pSDK) obj;
        return this.registerClient == aFi1pSDK.registerClient && this.AFKeystoreWrapper == aFi1pSDK.AFKeystoreWrapper && Intrinsics.d(this.unregisterClient, aFi1pSDK.unregisterClient) && Intrinsics.d(this.d, aFi1pSDK.d);
    }

    public final int hashCode() {
        int iB = rw2.b(Long.hashCode(this.registerClient) * 31, 31, this.AFKeystoreWrapper);
        String str = this.unregisterClient;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        long j = this.registerClient;
        long j2 = this.AFKeystoreWrapper;
        String str = this.unregisterClient;
        String str2 = this.d;
        StringBuilder sbQ = kng0.q(j, "PlayIntegrityApiData(piaTimestamp=", ", ttrMillis=");
        kng0.z(sbQ, j2, ", piaToken=", str);
        return rw2.o(sbQ, ", errorCode=", str2, Separators.RPAREN);
    }
}
