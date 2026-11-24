package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vtb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f37998a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final ex4 f;
    public final g920 g;
    public final boolean h;

    public vtb0(double d, boolean z, boolean z2, boolean z3, String str, ex4 ex4Var, g920 g920Var, boolean z4) {
        this.f37998a = d;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str;
        this.f = ex4Var;
        this.g = g920Var;
        this.h = z4;
    }

    public static vtb0 a(vtb0 vtb0Var, double d, int i) {
        g920 g920Var = g920.FAST;
        if ((i & 1) != 0) {
            d = vtb0Var.f37998a;
        }
        double d2 = d;
        boolean z = (i & 2) != 0 ? vtb0Var.b : true;
        boolean z2 = (i & 4) != 0 ? vtb0Var.c : true;
        boolean z3 = (i & 8) != 0 ? vtb0Var.d : true;
        String str = vtb0Var.e;
        ex4 ex4Var = vtb0Var.f;
        if ((i & 64) != 0) {
            g920Var = vtb0Var.g;
        }
        g920 g920Var2 = g920Var;
        boolean z4 = (i & 128) != 0 ? vtb0Var.h : true;
        vtb0Var.getClass();
        return new vtb0(d2, z, z2, z3, str, ex4Var, g920Var2, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vtb0)) {
            return false;
        }
        vtb0 vtb0Var = (vtb0) obj;
        return Double.compare(this.f37998a, vtb0Var.f37998a) == 0 && this.b == vtb0Var.b && this.c == vtb0Var.c && this.d == vtb0Var.d && Intrinsics.d(this.e, vtb0Var.e) && Intrinsics.d(this.f, vtb0Var.f) && this.g == vtb0Var.g && this.h == vtb0Var.h;
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(brm0.e(Double.hashCode(this.f37998a) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        ex4 ex4Var = this.f;
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((iHashCode + (ex4Var != null ? ex4Var.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrepareMakeBetStateModel(betSum=");
        sb.append(this.f37998a);
        sb.append(", isFastBet=");
        sb.append(this.b);
        w6x.A(", isApprovedBet=", ", isAdvanceBet=", sb, this.c, this.d);
        sb.append(", promoCode=");
        sb.append(this.e);
        sb.append(", autoBetParamsModel=");
        sb.append(this.f);
        sb.append(", makeBetOption=");
        sb.append(this.g);
        sb.append(", isChangedToSystem=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
