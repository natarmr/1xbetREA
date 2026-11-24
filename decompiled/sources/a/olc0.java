package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class olc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f25446a;
    public final String b;
    public final String c;
    public final double d;
    public final double e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public olc0(double d, String str, String str2, double d2, double d3, boolean z, boolean z2, boolean z3) {
        str.getClass();
        str2.getClass();
        this.f25446a = d;
        this.b = str;
        this.c = str2;
        this.d = d2;
        this.e = d3;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public static olc0 a(olc0 olc0Var) {
        double d = olc0Var.f25446a;
        String str = olc0Var.b;
        String str2 = olc0Var.c;
        double d2 = olc0Var.d;
        double d3 = olc0Var.e;
        boolean z = olc0Var.f;
        boolean z2 = olc0Var.g;
        str.getClass();
        str2.getClass();
        return new olc0(d, str, str2, d2, d3, z, z2, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof olc0)) {
            return false;
        }
        olc0 olc0Var = (olc0) obj;
        return Double.compare(this.f25446a, olc0Var.f25446a) == 0 && Intrinsics.d(this.b, olc0Var.b) && Intrinsics.d(this.c, olc0Var.c) && Double.compare(this.d, olc0Var.d) == 0 && Double.compare(this.e, olc0Var.e) == 0 && this.f == olc0Var.f && this.g == olc0Var.g && this.h == olc0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + brm0.e(brm0.e(brm0.d(this.e, brm0.d(this.d, ua80.b(ua80.b(Double.hashCode(this.f25446a) * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbS = vqd.s("PromoInfoStateModel(amount=", this.f25446a, ", minCoef=", this.b);
        hne.B(sbS, ", currencySymbol=", this.c, ", betCoef=");
        sbS.append(this.d);
        ohs0.A(sbS, this.e, ", possibleWinValue=", ", possibleWinVisible=");
        ua80.u(", possiblePayoutVisible=", ", isVisible=", sbS, this.f, this.g);
        return rw2.p(sbS, this.h, Separators.RPAREN);
    }
}
