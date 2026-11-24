package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xje0 extends v8b implements bke0 {
    public final String d;
    public final int e;
    public final int f;

    public xje0(String str, int i, int i2) {
        super(14, null, Integer.valueOf(i2), q3d.j(vqd.e(str, str), new g9b(i)));
        this.d = str;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xje0)) {
            return false;
        }
        xje0 xje0Var = (xje0) obj;
        return Intrinsics.d(this.d, xje0Var.d) && this.e == xje0Var.e && this.f == xje0Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + twn.a(this.e, this.d.hashCode() * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.f, Separators.RPAREN, kng0.p(this.e, "RefereeTeamsColumnHeader(title=", this.d, ", spaceWidth=", ", minWidthCell="));
    }
}
