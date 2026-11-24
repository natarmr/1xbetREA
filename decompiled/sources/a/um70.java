package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class um70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35906a;
    public final double b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final double f;
    public final int g;
    public final boolean h;

    public um70(boolean z, double d, String str, boolean z2, boolean z3, double d2, int i, boolean z4) {
        this.f35906a = z;
        this.b = d;
        this.c = str;
        this.d = z2;
        this.e = z3;
        this.f = d2;
        this.g = i;
        this.h = z4;
    }

    public static um70 a(um70 um70Var, boolean z, double d, String str, boolean z2, boolean z3, double d2, int i, boolean z4, int i2) {
        if ((i2 & 1) != 0) {
            z = um70Var.f35906a;
        }
        boolean z5 = z;
        if ((i2 & 2) != 0) {
            d = um70Var.b;
        }
        double d3 = d;
        if ((i2 & 4) != 0) {
            str = um70Var.c;
        }
        String str2 = str;
        boolean z6 = (i2 & 8) != 0 ? um70Var.d : z2;
        boolean z7 = (i2 & 16) != 0 ? um70Var.e : z3;
        double d4 = (i2 & 32) != 0 ? um70Var.f : d2;
        int i3 = (i2 & 64) != 0 ? um70Var.g : i;
        boolean z8 = (i2 & 128) != 0 ? um70Var.h : z4;
        um70Var.getClass();
        str2.getClass();
        return new um70(z5, d3, str2, z6, z7, d4, i3, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um70)) {
            return false;
        }
        um70 um70Var = (um70) obj;
        return this.f35906a == um70Var.f35906a && Double.compare(this.b, um70Var.b) == 0 && this.c.equals(um70Var.c) && this.d == um70Var.d && this.e == um70Var.e && Double.compare(this.f, um70Var.f) == 0 && this.g == um70Var.g && this.h == um70Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + twn.a(this.g, brm0.d(this.f, brm0.e(brm0.e(ua80.b(brm0.d(this.b, Boolean.hashCode(this.f35906a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewState(win=");
        sb.append(this.f35906a);
        sb.append(", winAmount=");
        sb.append(this.b);
        w6x.z(", currencySymbol=", this.c, ", returnHalfBonus=", sb, this.d);
        rz4.A(sb, ", draw=", this.e, ", betSum=");
        rz4.w(sb, this.f, ", coefficient=", this.g);
        return f140.n(sb, ", showPlayAgain=", this.h, Separators.RPAREN);
    }
}
