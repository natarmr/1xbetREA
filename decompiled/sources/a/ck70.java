package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ck70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4493a;
    public final double b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final double f;
    public final boolean g;
    public final boolean h;

    public ck70(boolean z, double d, String str, boolean z2, boolean z3, double d2, boolean z4, boolean z5) {
        this.f4493a = z;
        this.b = d;
        this.c = str;
        this.d = z2;
        this.e = z3;
        this.f = d2;
        this.g = z4;
        this.h = z5;
    }

    public static ck70 a(ck70 ck70Var, boolean z, double d, String str, boolean z2, boolean z3, double d2, boolean z4, boolean z5, int i) {
        if ((i & 1) != 0) {
            z = ck70Var.f4493a;
        }
        boolean z6 = z;
        if ((i & 2) != 0) {
            d = ck70Var.b;
        }
        double d3 = d;
        if ((i & 4) != 0) {
            str = ck70Var.c;
        }
        String str2 = str;
        boolean z7 = (i & 8) != 0 ? ck70Var.d : z2;
        boolean z8 = (i & 16) != 0 ? ck70Var.e : z3;
        double d4 = (i & 32) != 0 ? ck70Var.f : d2;
        boolean z9 = (i & 64) != 0 ? ck70Var.g : z4;
        boolean z10 = (i & 128) != 0 ? ck70Var.h : z5;
        ck70Var.getClass();
        str2.getClass();
        return new ck70(z6, d3, str2, z7, z8, d4, z9, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck70)) {
            return false;
        }
        ck70 ck70Var = (ck70) obj;
        return this.f4493a == ck70Var.f4493a && Double.compare(this.b, ck70Var.b) == 0 && this.c.equals(ck70Var.c) && this.d == ck70Var.d && this.e == ck70Var.e && Double.compare(this.f, ck70Var.f) == 0 && this.g == ck70Var.g && this.h == ck70Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + brm0.e(brm0.d(this.f, brm0.e(brm0.e(ua80.b(brm0.d(this.b, Boolean.hashCode(this.f4493a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewState(win=");
        sb.append(this.f4493a);
        sb.append(", winAmount=");
        sb.append(this.b);
        w6x.z(", currencySymbol=", this.c, ", returnHalfBonus=", sb, this.d);
        rz4.A(sb, ", draw=", this.e, ", betSum=");
        rz4.x(sb, this.f, ", showPlayAgain=", this.g);
        return f140.n(sb, ", isFish=", this.h, Separators.RPAREN);
    }
}
