package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p6g0 extends w8b {
    public final String d;
    public final int e;
    public final t2m0 f;
    public final int g;
    public final int h;

    public p6g0(String str, int i, t2m0 t2m0Var, int i2, int i3) {
        super(vqd.e(str, str), Integer.valueOf(i3), Integer.valueOf(i2), 6);
        this.d = str;
        this.e = i;
        this.f = t2m0Var;
        this.g = i2;
        this.h = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6g0)) {
            return false;
        }
        p6g0 p6g0Var = (p6g0) obj;
        return Intrinsics.d(this.d, p6g0Var.d) && this.e == p6g0Var.e && this.f == p6g0Var.f && this.g == p6g0Var.g && this.h == p6g0Var.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + twn.a(this.g, (this.f.hashCode() + twn.a(this.e, this.d.hashCode() * 31, 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.e, "ResultCell(value=", this.d, ", textColorRes=", ", color=");
        sbP.append(this.f);
        sbP.append(", minWidthCell=");
        sbP.append(this.g);
        sbP.append(", maxWidthCell=");
        return rz4.j(this.h, Separators.RPAREN, sbP);
    }
}
