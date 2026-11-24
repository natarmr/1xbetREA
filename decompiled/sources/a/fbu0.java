package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class fbu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9279a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final String g;

    public fbu0(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.f9279a = i;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = z2;
        this.f = z3;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbu0)) {
            return false;
        }
        fbu0 fbu0Var = (fbu0) obj;
        return this.f9279a == fbu0Var.f9279a && this.b == fbu0Var.b && this.c.equals(fbu0Var.c) && this.d.equals(fbu0Var.d) && this.e == fbu0Var.e && this.f == fbu0Var.f && this.g.equals(fbu0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + brm0.e(brm0.e(ua80.b(ua80.b(brm0.e(Integer.hashCode(this.f9279a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbL = h97.l(this.f9279a, "VerificationStatusUiModel(image=", ", titleVisible=", ", title=", this.b);
        f140.v(sbL, this.c, ", body=", this.d, ", toolbarVisible=");
        ua80.u(", buttonVisible=", ", buttonTitle=", sbL, this.e, this.f);
        return axq.n(sbL, this.g, Separators.RPAREN);
    }
}
