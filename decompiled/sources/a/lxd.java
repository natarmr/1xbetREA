package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lxd implements vxd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20809a;
    public final int b;

    public lxd(String str, int i) {
        this.f20809a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxd)) {
            return false;
        }
        lxd lxdVar = (lxd) obj;
        return Intrinsics.d(this.f20809a, lxdVar.f20809a) && this.b == lxdVar.b;
    }

    public final int hashCode() {
        String str = this.f20809a;
        return Integer.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "ShowCodeError(message=", this.f20809a, ", iconTintResId=", Separators.RPAREN);
    }
}
