package com.appsflyer.internal;

import a.dw9;
import a.rz4;
import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1pSDK {
    final int AFKeystoreWrapper;
    final String d;
    final List<AFe1zSDK> unregisterClient;

    /* JADX WARN: Multi-variable type inference failed */
    public AFc1pSDK(String str, List<? extends AFe1zSDK> list, int i) {
        str.getClass();
        list.getClass();
        this.d = str;
        this.unregisterClient = list;
        this.AFKeystoreWrapper = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1pSDK)) {
            return false;
        }
        AFc1pSDK aFc1pSDK = (AFc1pSDK) obj;
        return Intrinsics.d(this.d, aFc1pSDK.d) && Intrinsics.d(this.unregisterClient, aFc1pSDK.unregisterClient) && this.AFKeystoreWrapper == aFc1pSDK.AFKeystoreWrapper;
    }

    public final int hashCode() {
        return Integer.hashCode(this.AFKeystoreWrapper) + dw9.a(this.d.hashCode() * 31, 31, this.unregisterClient);
    }

    public final String toString() {
        return rz4.j(this.AFKeystoreWrapper, Separators.RPAREN, defpackage.c.f("StorageConfigTypeEntry(cacheDirName=", this.d, ", eventTypes=", this.unregisterClient, ", maxCapacity="));
    }
}
