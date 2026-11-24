package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class iwo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15501a;
    public final boolean b;
    public final String c;
    public final double d;
    public final String e;
    public final List f;

    public iwo0(double d, String str, String str2, List list, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.f15501a = z;
        this.b = z2;
        this.c = str;
        this.d = d;
        this.e = str2;
        this.f = list;
    }

    public static iwo0 a(iwo0 iwo0Var, boolean z, boolean z2, double d, List list, int i) {
        if ((i & 1) != 0) {
            z = iwo0Var.f15501a;
        }
        boolean z3 = z;
        String str = iwo0Var.c;
        if ((i & 8) != 0) {
            d = iwo0Var.d;
        }
        double d2 = d;
        String str2 = iwo0Var.e;
        if ((i & 32) != 0) {
            list = iwo0Var.f;
        }
        List list2 = list;
        iwo0Var.getClass();
        str.getClass();
        str2.getClass();
        list2.getClass();
        return new iwo0(d2, str, str2, list2, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwo0)) {
            return false;
        }
        iwo0 iwo0Var = (iwo0) obj;
        return this.f15501a == iwo0Var.f15501a && this.b == iwo0Var.b && Intrinsics.d(this.c, iwo0Var.c) && Double.compare(this.d, iwo0Var.d) == 0 && Intrinsics.d(this.e, iwo0Var.e) && Intrinsics.d(this.f, iwo0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(brm0.d(this.d, ua80.b(brm0.e(Boolean.hashCode(this.f15501a) * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("TaxStateModel(isVisible=", ", isLoading=", ", taxTitle=", this.f15501a, this.b);
        hne.A(sbQ, this.c, ", taxPayDif=", this.d);
        ua80.t(", betTooltipTitle=", this.e, ", values=", sbQ, this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
