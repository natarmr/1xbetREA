package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fs80 f12994a;
    public final List b;
    public final a4x c;
    public final a4x d;
    public final List e;
    public final String f;
    public final boolean g;
    public final w7r0 h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final mdm o;
    public final ql5 p;
    public final kg q;

    public hg0(fs80 fs80Var, List list, a4x a4xVar, a4x a4xVar2, List list2, String str, boolean z, w7r0 w7r0Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, mdm mdmVar, ql5 ql5Var, kg kgVar) {
        list.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        list2.getClass();
        str.getClass();
        kgVar.getClass();
        this.f12994a = fs80Var;
        this.b = list;
        this.c = a4xVar;
        this.d = a4xVar2;
        this.e = list2;
        this.f = str;
        this.g = z;
        this.h = w7r0Var;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = z7;
        this.o = mdmVar;
        this.p = ql5Var;
        this.q = kgVar;
    }

    public static hg0 a(hg0 hg0Var, fs80 fs80Var, List list, a4x a4xVar, a4x a4xVar2, List list2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, mdm mdmVar, ql5 ql5Var, int i) {
        fs80 fs80Var2 = (i & 1) != 0 ? hg0Var.f12994a : fs80Var;
        List list3 = (i & 2) != 0 ? hg0Var.b : list;
        a4x a4xVar3 = (i & 4) != 0 ? hg0Var.c : a4xVar;
        a4x a4xVar4 = (i & 8) != 0 ? hg0Var.d : a4xVar2;
        List list4 = (i & 16) != 0 ? hg0Var.e : list2;
        String str = hg0Var.f;
        hg0Var.getClass();
        boolean z7 = (i & 128) != 0 ? hg0Var.g : z;
        w7r0 w7r0Var = hg0Var.h;
        boolean z8 = (i & 512) != 0 ? hg0Var.i : z2;
        boolean z9 = (i & 1024) != 0 ? hg0Var.j : z3;
        boolean z10 = (i & 2048) != 0 ? hg0Var.k : z4;
        boolean z11 = (i & 4096) != 0 ? hg0Var.l : z5;
        boolean z12 = (i & 8192) != 0 ? hg0Var.m : z6;
        boolean z13 = hg0Var.n;
        mdm mdmVar2 = (32768 & i) != 0 ? hg0Var.o : mdmVar;
        ql5 ql5Var2 = (i & 65536) != 0 ? hg0Var.p : ql5Var;
        kg kgVar = hg0Var.q;
        hg0Var.getClass();
        list3.getClass();
        a4xVar3.getClass();
        a4xVar4.getClass();
        list4.getClass();
        str.getClass();
        kgVar.getClass();
        return new hg0(fs80Var2, list3, a4xVar3, a4xVar4, list4, str, z7, w7r0Var, z8, z9, z10, z11, z12, z13, mdmVar2, ql5Var2, kgVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg0)) {
            return false;
        }
        hg0 hg0Var = (hg0) obj;
        return this.f12994a.equals(hg0Var.f12994a) && Intrinsics.d(this.b, hg0Var.b) && Intrinsics.d(this.c, hg0Var.c) && Intrinsics.d(this.d, hg0Var.d) && Intrinsics.d(this.e, hg0Var.e) && Intrinsics.d(this.f, hg0Var.f) && this.g == hg0Var.g && this.h.equals(hg0Var.h) && this.i == hg0Var.i && this.j == hg0Var.j && this.k == hg0Var.k && this.l == hg0Var.l && this.m == hg0Var.m && this.n == hg0Var.n && Intrinsics.d(this.o, hg0Var.o) && Intrinsics.d(this.p, hg0Var.p) && this.q == hg0Var.q;
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e((this.h.hashCode() + brm0.e(brm0.e(ua80.b(dw9.a(cs0.b(this.d, cs0.b(this.c, dw9.a(this.f12994a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, true), 31, this.g)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
        mdm mdmVar = this.o;
        int iHashCode = (iE + (mdmVar == null ? 0 : mdmVar.hashCode())) * 31;
        ql5 ql5Var = this.p;
        return this.q.hashCode() + ((iHashCode + (ql5Var != null ? ql5Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AggregatorCategoriesState(deeplinkModel=");
        sb.append(this.f12994a);
        sb.append(", bannerState=");
        sb.append(this.b);
        sb.append(", categoryState=");
        hne.y(sb, this.c, ", partitionsState=", this.d, ", specialBannersState=");
        h97.y(", title=", this.f, ", showShimmers=true, lastConnection=", sb, this.e);
        sb.append(this.g);
        sb.append(", topItemState=");
        sb.append(this.h);
        sb.append(", isAuth=");
        ua80.u(", isLoadingBanner=", ", isLoadingCategory=", sb, this.i, this.j);
        ua80.u(", isLoadingPartition=", ", isLoadingSpecialBanners=", sb, this.k, this.l);
        ua80.u(", isSpecialBannersMethodEnabled=", ", emptyConfig=", sb, this.m, this.n);
        sb.append(this.o);
        sb.append(", balance=");
        sb.append(this.p);
        sb.append(", accountSelectionStyle=");
        sb.append(this.q);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
