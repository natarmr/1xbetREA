package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class sk70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32334a;
    public final double b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final double f;
    public final boolean g;

    public sk70(boolean z, double d, String str, boolean z2, boolean z3, double d2, boolean z4) {
        this.f32334a = z;
        this.b = d;
        this.c = str;
        this.d = z2;
        this.e = z3;
        this.f = d2;
        this.g = z4;
    }

    public static sk70 a(sk70 sk70Var, boolean z, double d, String str, boolean z2, boolean z3, double d2, boolean z4, int i) {
        if ((i & 1) != 0) {
            z = sk70Var.f32334a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            d = sk70Var.b;
        }
        double d3 = d;
        if ((i & 4) != 0) {
            str = sk70Var.c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            z2 = sk70Var.d;
        }
        boolean z6 = z2;
        boolean z7 = (i & 16) != 0 ? sk70Var.e : z3;
        double d4 = (i & 32) != 0 ? sk70Var.f : d2;
        boolean z8 = (i & 64) != 0 ? sk70Var.g : z4;
        sk70Var.getClass();
        str2.getClass();
        return new sk70(z5, d3, str2, z6, z7, d4, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk70)) {
            return false;
        }
        sk70 sk70Var = (sk70) obj;
        return this.f32334a == sk70Var.f32334a && Double.compare(this.b, sk70Var.b) == 0 && this.c.equals(sk70Var.c) && this.d == sk70Var.d && this.e == sk70Var.e && Double.compare(this.f, sk70Var.f) == 0 && this.g == sk70Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + brm0.d(this.f, brm0.e(brm0.e(ua80.b(brm0.d(this.b, Boolean.hashCode(this.f32334a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewState(win=");
        sb.append(this.f32334a);
        sb.append(", winAmount=");
        sb.append(this.b);
        w6x.z(", currencySymbol=", this.c, ", returnHalfBonus=", sb, this.d);
        rz4.A(sb, ", draw=", this.e, ", betSum=");
        rz4.x(sb, this.f, ", showPlayAgain=", this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
