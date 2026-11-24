package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class guv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11949a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final zdm0 e;
    public final nc5 f;

    public guv(boolean z, boolean z2, boolean z3, List list, zdm0 zdm0Var, nc5 nc5Var) {
        list.getClass();
        this.f11949a = z;
        this.b = z2;
        this.c = z3;
        this.d = list;
        this.e = zdm0Var;
        this.f = nc5Var;
    }

    public static guv a(guv guvVar, boolean z, boolean z2, ArrayList arrayList, zdm0 zdm0Var, nc5 nc5Var, int i) {
        if ((i & 1) != 0) {
            z = guvVar.f11949a;
        }
        boolean z3 = z;
        boolean z4 = (i & 2) != 0 ? guvVar.b : false;
        if ((i & 4) != 0) {
            z2 = guvVar.c;
        }
        boolean z5 = z2;
        List list = arrayList;
        if ((i & 8) != 0) {
            list = guvVar.d;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            zdm0Var = guvVar.e;
        }
        zdm0 zdm0Var2 = zdm0Var;
        if ((i & 32) != 0) {
            nc5Var = guvVar.f;
        }
        guvVar.getClass();
        list2.getClass();
        return new guv(z3, z4, z5, list2, zdm0Var2, nc5Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof guv)) {
            return false;
        }
        guv guvVar = (guv) obj;
        return this.f11949a == guvVar.f11949a && this.b == guvVar.b && this.c == guvVar.c && Intrinsics.d(this.d, guvVar.d) && this.e.equals(guvVar.e) && this.f.equals(guvVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + kng0.a(this.e, dw9.a(brm0.e(brm0.e(Boolean.hashCode(this.f11949a) * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("HeatMapStateModel(isLive=", ", isLoading=", ", hasError=", this.f11949a, this.b);
        vqd.y(sbQ, ", items=", this.d, ", statisticHeaderUiModel=", this.c);
        sbQ.append(this.e);
        sbQ.append(", backgroundHeaderModel=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
