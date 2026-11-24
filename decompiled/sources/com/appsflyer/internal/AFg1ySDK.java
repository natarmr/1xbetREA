package com.appsflyer.internal;

import a.axq;
import a.dw9;
import a.twn;
import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1ySDK {
    final String AFKeystoreWrapper;
    final int AFLogger;
    final int d;
    final int registerClient;
    final int unregisterClient;

    public AFg1ySDK(int i, int i2, int i3, int i4, String str) {
        str.getClass();
        this.unregisterClient = i;
        this.d = i2;
        this.registerClient = i3;
        this.AFLogger = i4;
        this.AFKeystoreWrapper = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFg1ySDK)) {
            return false;
        }
        AFg1ySDK aFg1ySDK = (AFg1ySDK) obj;
        return this.unregisterClient == aFg1ySDK.unregisterClient && this.d == aFg1ySDK.d && this.registerClient == aFg1ySDK.registerClient && this.AFLogger == aFg1ySDK.AFLogger && Intrinsics.d(this.AFKeystoreWrapper, aFg1ySDK.AFKeystoreWrapper);
    }

    public final int hashCode() {
        return this.AFKeystoreWrapper.hashCode() + twn.a(this.AFLogger, twn.a(this.registerClient, twn.a(this.d, Integer.hashCode(this.unregisterClient) * 31, 31), 31), 31);
    }

    public final String toString() {
        int i = this.unregisterClient;
        int i2 = this.d;
        int i3 = this.registerClient;
        int i4 = this.AFLogger;
        String str = this.AFKeystoreWrapper;
        StringBuilder sbT = dw9.t("CmpTcfData(policyVersion=", i, ", gdprApplies=", ", cmpSdkId=", i2);
        axq.r(i3, i4, ", cmpSdkVersion=", ", tcString=", sbT);
        return axq.n(sbT, str, Separators.RPAREN);
    }
}
