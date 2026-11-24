package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class xqd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f41312a;
    public final String b;
    public final double c;
    public final int d;
    public final int e;

    public xqd(double d, double d2, int i, int i2, String str) {
        this.f41312a = d;
        this.b = str;
        this.c = d2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqd)) {
            return false;
        }
        xqd xqdVar = (xqd) obj;
        return Double.compare(this.f41312a, xqdVar.f41312a) == 0 && this.b.equals(xqdVar.b) && Double.compare(this.c, xqdVar.c) == 0 && this.d == xqdVar.d && this.e == xqdVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + twn.a(this.d, brm0.d(this.c, ua80.b(Double.hashCode(this.f41312a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sbS = vqd.s("Count(minAmountOperation=", this.f41312a, ", currency=", this.b);
        ohs0.A(sbS, this.c, ", percentCompleted=", ", currentCount=");
        return w6x.o(this.d, this.e, ", necessaryCount=", Separators.RPAREN, sbS);
    }
}
