package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h4q0 extends w8b {
    public final String d;
    public final int e;
    public final int f;

    public h4q0(String str, int i, int i2) {
        super(vqd.e(str, str), Integer.valueOf(i2), Integer.valueOf(i), 6);
        this.d = str;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4q0)) {
            return false;
        }
        h4q0 h4q0Var = (h4q0) obj;
        return Intrinsics.d(this.d, h4q0Var.d) && this.e == h4q0Var.e && this.f == h4q0Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + twn.a(this.e, this.d.hashCode() * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.f, Separators.RPAREN, kng0.p(this.e, "TextCellContentUiModel(value=", this.d, ", widthMin=", ", widthMax="));
    }
}
