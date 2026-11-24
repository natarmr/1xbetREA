package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hsd0 extends w8b implements isd0 {
    public final String d;
    public final int e;
    public final int f;

    public hsd0(String str, int i, int i2) {
        super(vqd.e(str, str), Integer.valueOf(i2), Integer.valueOf(i), 6);
        this.d = str;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hsd0)) {
            return false;
        }
        hsd0 hsd0Var = (hsd0) obj;
        return Intrinsics.d(this.d, hsd0Var.d) && this.e == hsd0Var.e && this.f == hsd0Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + twn.a(this.e, this.d.hashCode() * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.f, Separators.RPAREN, kng0.p(this.e, "TextCell(value=", this.d, ", minWidthCell=", ", maxWidthCell="));
    }
}
