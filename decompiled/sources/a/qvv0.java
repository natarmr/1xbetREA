package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class qvv0 implements svv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29408a;
    public final int b;
    public final int c;
    public final int d;

    public qvv0(int i, int i2, int i3, int i4) {
        this.f29408a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvv0)) {
            return false;
        }
        qvv0 qvv0Var = (qvv0) obj;
        return this.f29408a == qvv0Var.f29408a && this.b == qvv0Var.b && this.c == qvv0Var.c && this.d == qvv0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f29408a) * 31, 31), 31);
    }

    public final String toString() {
        return w6x.o(this.c, this.d, ", consecutiveClampCount=", Separators.RPAREN, dw9.t("Estimate(deltaPx=", this.f29408a, ", estimatedItemBottomPx=", ", stopLinePx=", this.b));
    }
}
