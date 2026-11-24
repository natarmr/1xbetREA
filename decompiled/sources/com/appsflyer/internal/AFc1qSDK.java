package com.appsflyer.internal;

import a.twn;
import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1qSDK {
    final List<AFc1pSDK> d;

    public AFc1qSDK(List<AFc1pSDK> list) {
        list.getClass();
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AFc1qSDK) && Intrinsics.d(this.d, ((AFc1qSDK) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return twn.r(this.d, "StorageConfig(typeEntries=", Separators.RPAREN);
    }
}
