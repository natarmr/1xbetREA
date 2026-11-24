package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pw50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27695a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final xu50 e;
    public final zdm0 f;
    public final nc5 g;

    public pw50(boolean z, boolean z2, boolean z3, int i, xu50 xu50Var, zdm0 zdm0Var, nc5 nc5Var) {
        this.f27695a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.e = xu50Var;
        this.f = zdm0Var;
        this.g = nc5Var;
    }

    public static pw50 a(pw50 pw50Var, boolean z, boolean z2, boolean z3, int i, xu50 xu50Var, zdm0 zdm0Var, nc5 nc5Var, int i2) {
        if ((i2 & 1) != 0) {
            z = pw50Var.f27695a;
        }
        boolean z4 = z;
        if ((i2 & 2) != 0) {
            z2 = pw50Var.b;
        }
        boolean z5 = z2;
        if ((i2 & 4) != 0) {
            z3 = pw50Var.c;
        }
        boolean z6 = z3;
        if ((i2 & 8) != 0) {
            i = pw50Var.d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            xu50Var = pw50Var.e;
        }
        xu50 xu50Var2 = xu50Var;
        if ((i2 & 32) != 0) {
            zdm0Var = pw50Var.f;
        }
        zdm0 zdm0Var2 = zdm0Var;
        if ((i2 & 64) != 0) {
            nc5Var = pw50Var.g;
        }
        pw50Var.getClass();
        return new pw50(z4, z5, z6, i3, xu50Var2, zdm0Var2, nc5Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pw50)) {
            return false;
        }
        pw50 pw50Var = (pw50) obj;
        return this.f27695a == pw50Var.f27695a && this.b == pw50Var.b && this.c == pw50Var.c && this.d == pw50Var.d && Intrinsics.d(this.e, pw50Var.e) && this.f.equals(pw50Var.f) && this.g.equals(pw50Var.g);
    }

    public final int hashCode() {
        int iA = twn.a(this.d, brm0.e(brm0.e(Boolean.hashCode(this.f27695a) * 31, 31, this.b), 31, this.c), 31);
        xu50 xu50Var = this.e;
        return this.g.hashCode() + kng0.a(this.f, (iA + (xu50Var == null ? 0 : xu50Var.f41495a.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("NewsStateModel(isLive=", ", isLoading=", ", hasError=", this.f27695a, this.b);
        ua80.q(this.d, ", selectedTab=", ", newsModel=", sbQ, this.c);
        sbQ.append(this.e);
        sbQ.append(", statisticHeaderUiModel=");
        sbQ.append(this.f);
        sbQ.append(", backgroundHeaderModel=");
        sbQ.append(this.g);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
