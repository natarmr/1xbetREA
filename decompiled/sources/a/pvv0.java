package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class pvv0 implements svv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27681a;
    public final int b;
    public final int c;
    public final int d;

    public pvv0(int i, int i2, int i3, int i4) {
        this.f27681a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvv0)) {
            return false;
        }
        pvv0 pvv0Var = (pvv0) obj;
        return this.f27681a == pvv0Var.f27681a && this.b == pvv0Var.b && this.c == pvv0Var.c && this.d == pvv0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f27681a) * 31, 31), 31);
    }

    public final String toString() {
        return w6x.o(this.c, this.d, ", consecutiveClampCount=", Separators.RPAREN, dw9.t("Dispatch(deltaPx=", this.f27681a, ", itemBottomPx=", ", stopLinePx=", this.b));
    }
}
