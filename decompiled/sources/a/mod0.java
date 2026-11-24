package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mod0 implements nod0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22131a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final double e;
    public final double f;
    public final double g;

    public mod0(boolean z, boolean z2, boolean z3, String str, double d, double d2, double d3) {
        str.getClass();
        this.f22131a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
        this.e = d;
        this.f = d2;
        this.g = d3;
    }

    public static mod0 a(mod0 mod0Var, boolean z, boolean z2, double d, int i) {
        boolean z3 = mod0Var.f22131a;
        if ((i & 2) != 0) {
            z = mod0Var.b;
        }
        boolean z4 = z;
        String str = mod0Var.d;
        double d2 = mod0Var.e;
        if ((i & 32) != 0) {
            d = mod0Var.f;
        }
        double d3 = mod0Var.g;
        str.getClass();
        return new mod0(z3, z4, z2, str, d2, d, d3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mod0)) {
            return false;
        }
        mod0 mod0Var = (mod0) obj;
        return this.f22131a == mod0Var.f22131a && this.b == mod0Var.b && this.c == mod0Var.c && Intrinsics.d(this.d, mod0Var.d) && Double.compare(this.e, mod0Var.e) == 0 && Double.compare(this.f, mod0Var.f) == 0 && Double.compare(this.g, mod0Var.g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.g) + brm0.d(this.f, brm0.d(this.e, ua80.b(brm0.e(brm0.e(Boolean.hashCode(this.f22131a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("Value(initialEnabledState=", ", quickBetEnabled=", ", saveButtonEnabled=", this.f22131a, this.b);
        f140.s(", currencySymbol=", this.d, ", initialQuickBetSum=", sbQ, this.c);
        sbQ.append(this.e);
        ohs0.A(sbQ, this.f, ", quickBetSum=", ", minBet=");
        return axq.l(sbQ, this.g, Separators.RPAREN);
    }
}
