package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class plc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f27176a;
    public final String b;
    public final String c;
    public final double d;
    public final double e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public plc0(double d, String str, String str2, double d2, double d3, boolean z, boolean z2, boolean z3) {
        this.f27176a = d;
        this.b = str;
        this.c = str2;
        this.d = d2;
        this.e = d3;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public static plc0 a(plc0 plc0Var, double d, String str, String str2, double d2, double d3, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            d = plc0Var.f27176a;
        }
        double d4 = d;
        if ((i & 2) != 0) {
            str = plc0Var.b;
        }
        String str3 = str;
        String str4 = (i & 4) != 0 ? plc0Var.c : str2;
        double d5 = (i & 8) != 0 ? plc0Var.d : d2;
        double d6 = (i & 16) != 0 ? plc0Var.e : d3;
        boolean z4 = (i & 32) != 0 ? plc0Var.f : z;
        boolean z5 = (i & 64) != 0 ? plc0Var.g : z2;
        boolean z6 = (i & 128) != 0 ? plc0Var.h : z3;
        str3.getClass();
        str4.getClass();
        return new plc0(d4, str3, str4, d5, d6, z4, z5, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof plc0)) {
            return false;
        }
        plc0 plc0Var = (plc0) obj;
        return Double.compare(this.f27176a, plc0Var.f27176a) == 0 && this.b.equals(plc0Var.b) && this.c.equals(plc0Var.c) && Double.compare(this.d, plc0Var.d) == 0 && Double.compare(this.e, plc0Var.e) == 0 && this.f == plc0Var.f && this.g == plc0Var.g && this.h == plc0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + brm0.e(brm0.e(brm0.d(this.e, brm0.d(this.d, ua80.b(ua80.b(Double.hashCode(this.f27176a) * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbS = vqd.s("PromoInfoStateModel(amount=", this.f27176a, ", minCoef=", this.b);
        hne.B(sbS, ", currencySymbol=", this.c, ", betCoef=");
        sbS.append(this.d);
        ohs0.A(sbS, this.e, ", possibleWinValue=", ", possibleWinVisible=");
        ua80.u(", possiblePayoutVisible=", ", isVisible=", sbS, this.f, this.g);
        return rw2.p(sbS, this.h, Separators.RPAREN);
    }
}
