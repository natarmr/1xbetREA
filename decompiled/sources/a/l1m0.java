package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l1m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19261a;
    public final boolean b;
    public final List c;
    public final vhh0 d;
    public final xhh0 e;
    public final zdm0 f;
    public final nc5 g;

    public l1m0(boolean z, boolean z2, List list, vhh0 vhh0Var, xhh0 xhh0Var, zdm0 zdm0Var, nc5 nc5Var) {
        this.f19261a = z;
        this.b = z2;
        this.c = list;
        this.d = vhh0Var;
        this.e = xhh0Var;
        this.f = zdm0Var;
        this.g = nc5Var;
    }

    public static l1m0 a(l1m0 l1m0Var, boolean z, boolean z2, List list, vhh0 vhh0Var, xhh0 xhh0Var, zdm0 zdm0Var, nc5 nc5Var, int i) {
        l1m0Var.getClass();
        if ((i & 2) != 0) {
            z = l1m0Var.f19261a;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = l1m0Var.b;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            list = l1m0Var.c;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            vhh0Var = l1m0Var.d;
        }
        vhh0 vhh0Var2 = vhh0Var;
        if ((i & 32) != 0) {
            xhh0Var = l1m0Var.e;
        }
        xhh0 xhh0Var2 = xhh0Var;
        if ((i & 64) != 0) {
            zdm0Var = l1m0Var.f;
        }
        zdm0 zdm0Var2 = zdm0Var;
        if ((i & 128) != 0) {
            nc5Var = l1m0Var.g;
        }
        l1m0Var.getClass();
        return new l1m0(z3, z4, list2, vhh0Var2, xhh0Var2, zdm0Var2, nc5Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1m0)) {
            return false;
        }
        l1m0 l1m0Var = (l1m0) obj;
        return this.f19261a == l1m0Var.f19261a && this.b == l1m0Var.b && Intrinsics.d(this.c, l1m0Var.c) && this.d.equals(l1m0Var.d) && Intrinsics.d(this.e, l1m0Var.e) && this.f.equals(l1m0Var.f) && this.g.equals(l1m0Var.g);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(Boolean.hashCode(false) * 31, 31, this.f19261a), 31, this.b);
        List list = this.c;
        int iHashCode = (this.d.hashCode() + ((iE + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        xhh0 xhh0Var = this.e;
        return this.g.hashCode() + kng0.a(this.f, (iHashCode + (xhh0Var != null ? xhh0Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("StageNetStateModel(isLive=false, isLoading=", ", hasError=", ", result=", this.f19261a, this.b);
        sbQ.append(this.c);
        sbQ.append(", searchState=");
        sbQ.append(this.d);
        sbQ.append(", searchResult=");
        sbQ.append(this.e);
        sbQ.append(", statisticHeaderUiModel=");
        sbQ.append(this.f);
        sbQ.append(", backgroundHeaderModel=");
        sbQ.append(this.g);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
