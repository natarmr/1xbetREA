package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qxc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29477a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public qxc0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f29477a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public static qxc0 a(qxc0 qxc0Var, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            z = qxc0Var.f29477a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = qxc0Var.b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = qxc0Var.c;
        }
        boolean z7 = z3;
        boolean z8 = (i & 8) != 0 ? qxc0Var.d : true;
        if ((i & 16) != 0) {
            z4 = qxc0Var.e;
        }
        qxc0Var.getClass();
        return new qxc0(z5, z6, z7, z8, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxc0)) {
            return false;
        }
        qxc0 qxc0Var = (qxc0) obj;
        return this.f29477a == qxc0Var.f29477a && this.b == qxc0Var.b && this.c == qxc0Var.c && this.d == qxc0Var.d && this.e == qxc0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f29477a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("PromoWebState(isLoading=", ", hasConnection=", ", pageNotFound=", this.f29477a, this.b);
        ua80.u(", hasOpenedWebView=", ", wasAuthorized=", sbQ, this.c, this.d);
        return rw2.p(sbQ, this.e, Separators.RPAREN);
    }
}
