package com.appsflyer.internal;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1rSDK {
    public final int AFKeystoreWrapper;
    public final String unregisterClient;

    public AFc1rSDK(int i, String str) {
        str.getClass();
        this.AFKeystoreWrapper = i;
        this.unregisterClient = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1rSDK)) {
            return false;
        }
        AFc1rSDK aFc1rSDK = (AFc1rSDK) obj;
        return this.AFKeystoreWrapper == aFc1rSDK.AFKeystoreWrapper && Intrinsics.d(this.unregisterClient, aFc1rSDK.unregisterClient);
    }

    public final int hashCode() {
        return this.unregisterClient.hashCode() + (Integer.hashCode(this.AFKeystoreWrapper) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.AFKeystoreWrapper, "AppSetIdModel(scope=", ", id=", this.unregisterClient, Separators.RPAREN);
    }
}
