package com.appsflyer.internal;

import a.f140;
import a.rw2;
import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1sSDK {
    public final String AFKeystoreWrapper;
    public final boolean AFLogger;
    public final long unregisterClient;

    public AFg1sSDK(String str, long j, boolean z) {
        str.getClass();
        this.AFKeystoreWrapper = str;
        this.unregisterClient = j;
        this.AFLogger = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFg1sSDK)) {
            return false;
        }
        AFg1sSDK aFg1sSDK = (AFg1sSDK) obj;
        return Intrinsics.d(this.AFKeystoreWrapper, aFg1sSDK.AFKeystoreWrapper) && this.unregisterClient == aFg1sSDK.unregisterClient && this.AFLogger == aFg1sSDK.AFLogger;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.AFLogger) + rw2.b(this.AFKeystoreWrapper.hashCode() * 31, 31, this.unregisterClient);
    }

    public final String toString() {
        String str = this.AFKeystoreWrapper;
        long j = this.unregisterClient;
        return f140.n(f140.o(j, "AFUninstallToken(token=", str, ", receivedTime="), ", isQueued=", this.AFLogger, Separators.RPAREN);
    }
}
