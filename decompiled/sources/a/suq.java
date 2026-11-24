package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class suq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32833a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final kpm e;
    public final List f;
    public final zdm0 g;
    public final nc5 h;
    public final boolean i;

    public suq(boolean z, boolean z2, boolean z3, boolean z4, kpm kpmVar, List list, zdm0 zdm0Var, nc5 nc5Var, boolean z5) {
        list.getClass();
        this.f32833a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = kpmVar;
        this.f = list;
        this.g = zdm0Var;
        this.h = nc5Var;
        this.i = z5;
    }

    public static suq a(suq suqVar, boolean z, boolean z2, boolean z3, boolean z4, kpm kpmVar, List list, zdm0 zdm0Var, nc5 nc5Var, boolean z5, int i) {
        if ((i & 1) != 0) {
            z = suqVar.f32833a;
        }
        boolean z6 = z;
        if ((i & 2) != 0) {
            z2 = suqVar.b;
        }
        boolean z7 = z2;
        if ((i & 4) != 0) {
            z3 = suqVar.c;
        }
        boolean z8 = z3;
        if ((i & 8) != 0) {
            z4 = suqVar.d;
        }
        boolean z9 = z4;
        if ((i & 16) != 0) {
            kpmVar = suqVar.e;
        }
        kpm kpmVar2 = kpmVar;
        List list2 = (i & 32) != 0 ? suqVar.f : list;
        zdm0 zdm0Var2 = (i & 64) != 0 ? suqVar.g : zdm0Var;
        nc5 nc5Var2 = (i & 128) != 0 ? suqVar.h : nc5Var;
        boolean z10 = (i & 256) != 0 ? suqVar.i : z5;
        suqVar.getClass();
        list2.getClass();
        return new suq(z6, z7, z8, z9, kpmVar2, list2, zdm0Var2, nc5Var2, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof suq)) {
            return false;
        }
        suq suqVar = (suq) obj;
        return this.f32833a == suqVar.f32833a && this.b == suqVar.b && this.c == suqVar.c && this.d == suqVar.d && this.e.equals(suqVar.e) && Intrinsics.d(this.f, suqVar.f) && this.g.equals(suqVar.g) && this.h.equals(suqVar.h) && this.i == suqVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + kng0.a(this.g, dw9.a(dw9.c(this.e, brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f32833a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("ForecastState(isError=", ", isContentLoadingError=", ", isLoading=", this.f32833a, this.b);
        ua80.u(", isSuccess=", ", forecastScore=", sbQ, this.c, this.d);
        sbQ.append(this.e);
        sbQ.append(", forecastFacts=");
        sbQ.append(this.f);
        sbQ.append(", statisticHeaderUiModel=");
        sbQ.append(this.g);
        sbQ.append(", backgroundHeaderModel=");
        sbQ.append(this.h);
        sbQ.append(", isLive=");
        return rw2.p(sbQ, this.i, Separators.RPAREN);
    }
}
