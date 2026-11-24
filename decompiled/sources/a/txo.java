package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class txo implements vxo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34711a;

    public txo(String str) {
        str.getClass();
        this.f34711a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof txo) && Intrinsics.d(this.f34711a, ((txo) obj).f34711a);
    }

    public final int hashCode() {
        return this.f34711a.hashCode();
    }

    public final String toString() {
        return kng0.l("EnterRepeatNewPass(value=", this.f34711a, Separators.RPAREN);
    }
}
