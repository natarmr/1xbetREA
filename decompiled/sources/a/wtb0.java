package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wtb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f39733a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final ex4 f;

    public wtb0(double d, boolean z, boolean z2, boolean z3, String str, ex4 ex4Var) {
        this.f39733a = d;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str;
        this.f = ex4Var;
    }

    public static wtb0 a(wtb0 wtb0Var, double d, int i) {
        if ((i & 1) != 0) {
            d = wtb0Var.f39733a;
        }
        double d2 = d;
        boolean z = (i & 2) != 0 ? wtb0Var.b : true;
        boolean z2 = (i & 4) != 0 ? wtb0Var.c : true;
        boolean z3 = (i & 8) != 0 ? wtb0Var.d : true;
        String str = wtb0Var.e;
        ex4 ex4Var = wtb0Var.f;
        wtb0Var.getClass();
        return new wtb0(d2, z, z2, z3, str, ex4Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wtb0)) {
            return false;
        }
        wtb0 wtb0Var = (wtb0) obj;
        return Double.compare(this.f39733a, wtb0Var.f39733a) == 0 && this.b == wtb0Var.b && this.c == wtb0Var.c && this.d == wtb0Var.d && Intrinsics.d(this.e, wtb0Var.e) && Intrinsics.d(this.f, wtb0Var.f);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(brm0.e(Double.hashCode(this.f39733a) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        ex4 ex4Var = this.f;
        return iHashCode + (ex4Var != null ? ex4Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrepareMakeBetStateModel(betSum=");
        sb.append(this.f39733a);
        sb.append(", isFastBet=");
        sb.append(this.b);
        w6x.A(", isApprovedBet=", ", isAdvanceBet=", sb, this.c, this.d);
        sb.append(", promoCode=");
        sb.append(this.e);
        sb.append(", autoBetParamsModel=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
