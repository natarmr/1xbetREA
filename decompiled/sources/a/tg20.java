package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tg20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f33889a;
    public final double b;
    public final boolean c;
    public final boolean d;

    public tg20(double d, double d2, boolean z, boolean z2) {
        this.f33889a = d;
        this.b = d2;
        this.c = z;
        this.d = z2;
    }

    public static tg20 a(tg20 tg20Var, double d) {
        double d2 = tg20Var.b;
        boolean z = tg20Var.c;
        boolean z2 = tg20Var.d;
        tg20Var.getClass();
        return new tg20(d, d2, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg20)) {
            return false;
        }
        tg20 tg20Var = (tg20) obj;
        return Double.compare(this.f33889a, tg20Var.f33889a) == 0 && Double.compare(this.b, tg20Var.b) == 0 && this.c == tg20Var.c && this.d == tg20Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(brm0.d(this.b, Double.hashCode(this.f33889a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbP = brm0.p(this.f33889a, "MakeBetStepSettingsModel(initialBet=", ", betStep=");
        rz4.x(sbP, this.b, ", makeBetStepEnabled=", this.c);
        return f140.n(sbP, ", hasInitialBet=", this.d, Separators.RPAREN);
    }
}
