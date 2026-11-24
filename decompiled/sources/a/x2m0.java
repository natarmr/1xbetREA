package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x2m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40175a;
    public final boolean b;
    public final pdt0 c;
    public final List d;
    public final zdm0 e;
    public final nc5 f;
    public final String g;

    public x2m0(boolean z, boolean z2, pdt0 pdt0Var, List list, zdm0 zdm0Var, nc5 nc5Var, String str) {
        list.getClass();
        this.f40175a = z;
        this.b = z2;
        this.c = pdt0Var;
        this.d = list;
        this.e = zdm0Var;
        this.f = nc5Var;
        this.g = str;
    }

    public static x2m0 a(x2m0 x2m0Var, boolean z, boolean z2, pdt0 pdt0Var, List list, zdm0 zdm0Var, nc5 nc5Var, int i) {
        if ((i & 1) != 0) {
            z = x2m0Var.f40175a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            z2 = x2m0Var.b;
        }
        boolean z4 = z2;
        if ((i & 4) != 0) {
            pdt0Var = x2m0Var.c;
        }
        pdt0 pdt0Var2 = pdt0Var;
        if ((i & 8) != 0) {
            list = x2m0Var.d;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            zdm0Var = x2m0Var.e;
        }
        zdm0 zdm0Var2 = zdm0Var;
        if ((i & 32) != 0) {
            nc5Var = x2m0Var.f;
        }
        String str = x2m0Var.g;
        x2m0Var.getClass();
        list2.getClass();
        return new x2m0(z3, z4, pdt0Var2, list2, zdm0Var2, nc5Var, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2m0)) {
            return false;
        }
        x2m0 x2m0Var = (x2m0) obj;
        return this.f40175a == x2m0Var.f40175a && this.b == x2m0Var.b && Intrinsics.d(this.c, x2m0Var.c) && Intrinsics.d(this.d, x2m0Var.d) && this.e.equals(x2m0Var.e) && this.f.equals(x2m0Var.f) && this.g.equals(x2m0Var.g);
    }

    public final int hashCode() {
        int iE = brm0.e(Boolean.hashCode(this.f40175a) * 31, 31, this.b);
        pdt0 pdt0Var = this.c;
        return this.g.hashCode() + ((this.f.hashCode() + kng0.a(this.e, dw9.a((iE + (pdt0Var == null ? 0 : pdt0Var.hashCode())) * 31, 31, this.d), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("StageTableStateModel(isLoading=", ", hasError=", ", universalStageTableModel=", this.f40175a, this.b);
        sbQ.append(this.c);
        sbQ.append(", groups=");
        sbQ.append(this.d);
        sbQ.append(", statisticHeaderUiModel=");
        sbQ.append(this.e);
        sbQ.append(", backgroundHeaderModel=");
        sbQ.append(this.f);
        sbQ.append(", title=");
        return axq.n(sbQ, this.g, Separators.RPAREN);
    }
}
