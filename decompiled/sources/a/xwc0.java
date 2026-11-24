package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xwc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41604a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public xwc0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f41604a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public static xwc0 a(xwc0 xwc0Var, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            z = xwc0Var.f41604a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = xwc0Var.b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = xwc0Var.c;
        }
        boolean z7 = z3;
        boolean z8 = (i & 8) != 0 ? xwc0Var.d : true;
        if ((i & 16) != 0) {
            z4 = xwc0Var.e;
        }
        xwc0Var.getClass();
        return new xwc0(z5, z6, z7, z8, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwc0)) {
            return false;
        }
        xwc0 xwc0Var = (xwc0) obj;
        return this.f41604a == xwc0Var.f41604a && this.b == xwc0Var.b && this.c == xwc0Var.c && this.d == xwc0Var.d && this.e == xwc0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f41604a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("PromoWebAggregatorState(isLoading=", ", hasConnection=", ", pageNotFound=", this.f41604a, this.b);
        ua80.u(", hasOpenedWebView=", ", wasAuthorized=", sbQ, this.c, this.d);
        return rw2.p(sbQ, this.e, Separators.RPAREN);
    }
}
