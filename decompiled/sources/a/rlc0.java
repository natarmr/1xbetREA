package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class rlc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f30690a;
    public final String b;
    public final String c;
    public final double d;
    public final double e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public rlc0(double d, String str, String str2, double d2, double d3, boolean z, boolean z2, boolean z3) {
        this.f30690a = d;
        this.b = str;
        this.c = str2;
        this.d = d2;
        this.e = d3;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rlc0)) {
            return false;
        }
        rlc0 rlc0Var = (rlc0) obj;
        return Double.compare(this.f30690a, rlc0Var.f30690a) == 0 && this.b.equals(rlc0Var.b) && this.c.equals(rlc0Var.c) && Double.compare(this.d, rlc0Var.d) == 0 && Double.compare(this.e, rlc0Var.e) == 0 && this.f == rlc0Var.f && this.g == rlc0Var.g && this.h == rlc0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + brm0.e(brm0.e(brm0.d(this.e, brm0.d(this.d, ua80.b(ua80.b(Double.hashCode(this.f30690a) * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbS = vqd.s("PromoInfoStateModel(amount=", this.f30690a, ", minCoef=", this.b);
        hne.B(sbS, ", currencySymbol=", this.c, ", betCoef=");
        sbS.append(this.d);
        ohs0.A(sbS, this.e, ", possibleWinValue=", ", possibleWinVisible=");
        ua80.u(", possiblePayoutVisible=", ", isVisible=", sbS, this.f, this.g);
        return rw2.p(sbS, this.h, Separators.RPAREN);
    }
}
