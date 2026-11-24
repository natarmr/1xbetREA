package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w7g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38671a;
    public final boolean b;
    public final boolean c;
    public final l7g0 d;
    public final zdm0 e;
    public final nc5 f;

    public w7g0(boolean z, boolean z2, boolean z3, l7g0 l7g0Var, zdm0 zdm0Var, nc5 nc5Var) {
        this.f38671a = z;
        this.b = z2;
        this.c = z3;
        this.d = l7g0Var;
        this.e = zdm0Var;
        this.f = nc5Var;
    }

    public static w7g0 a(w7g0 w7g0Var, boolean z, boolean z2, boolean z3, l7g0 l7g0Var, zdm0 zdm0Var, nc5 nc5Var, int i) {
        if ((i & 1) != 0) {
            z = w7g0Var.f38671a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = w7g0Var.b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = w7g0Var.c;
        }
        boolean z6 = z3;
        if ((i & 8) != 0) {
            l7g0Var = w7g0Var.d;
        }
        l7g0 l7g0Var2 = l7g0Var;
        if ((i & 16) != 0) {
            zdm0Var = w7g0Var.e;
        }
        zdm0 zdm0Var2 = zdm0Var;
        if ((i & 32) != 0) {
            nc5Var = w7g0Var.f;
        }
        w7g0Var.getClass();
        return new w7g0(z4, z5, z6, l7g0Var2, zdm0Var2, nc5Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7g0)) {
            return false;
        }
        w7g0 w7g0Var = (w7g0) obj;
        return this.f38671a == w7g0Var.f38671a && this.b == w7g0Var.b && this.c == w7g0Var.c && Intrinsics.d(this.d, w7g0Var.d) && this.e.equals(w7g0Var.e) && this.f.equals(w7g0Var.f);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(Boolean.hashCode(this.f38671a) * 31, 31, this.b), 31, this.c);
        l7g0 l7g0Var = this.d;
        return this.f.hashCode() + kng0.a(this.e, (iE + (l7g0Var == null ? 0 : l7g0Var.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("ResultsGridStateModel(isLoading=", ", hasError=", ", isEmptyData=", this.f38671a, this.b);
        sbQ.append(this.c);
        sbQ.append(", resultsGridModel=");
        sbQ.append(this.d);
        sbQ.append(", statisticHeaderUiModel=");
        sbQ.append(this.e);
        sbQ.append(", backgroundHeaderModel=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
