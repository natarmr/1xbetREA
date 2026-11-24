package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lsl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20586a;
    public final List b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final List k;
    public final List l;
    public final boolean m;

    public lsl0(List list, List list2, boolean z, boolean z2, String str, boolean z3, boolean z4, int i, boolean z5, boolean z6, List list3, List list4, boolean z7) {
        hne.C(list, list2, list3, list4);
        this.f20586a = list;
        this.b = list2;
        this.c = z;
        this.d = z2;
        this.e = str;
        this.f = z3;
        this.g = z4;
        this.h = i;
        this.i = z5;
        this.j = z6;
        this.k = list3;
        this.l = list4;
        this.m = z7;
    }

    public static lsl0 a(lsl0 lsl0Var, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list3, List list4, int i) {
        List list5 = (i & 1) != 0 ? lsl0Var.f20586a : list;
        List list6 = (i & 2) != 0 ? lsl0Var.b : list2;
        boolean z6 = (i & 4) != 0 ? lsl0Var.c : z;
        boolean z7 = (i & 8) != 0 ? lsl0Var.d : z2;
        String str = (i & 16) != 0 ? lsl0Var.e : "";
        boolean z8 = (i & 32) != 0 ? lsl0Var.f : true;
        boolean z9 = (i & 64) != 0 ? lsl0Var.g : z3;
        int i2 = lsl0Var.h;
        boolean z10 = (i & 256) != 0 ? lsl0Var.i : z4;
        boolean z11 = (i & 512) != 0 ? lsl0Var.j : z5;
        List list7 = (i & 1024) != 0 ? lsl0Var.k : list3;
        List list8 = (i & 2048) != 0 ? lsl0Var.l : list4;
        boolean z12 = lsl0Var.m;
        lsl0Var.getClass();
        list5.getClass();
        list6.getClass();
        list7.getClass();
        list8.getClass();
        return new lsl0(list5, list6, z6, z7, str, z8, z9, i2, z10, z11, list7, list8, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsl0)) {
            return false;
        }
        lsl0 lsl0Var = (lsl0) obj;
        return Intrinsics.d(this.f20586a, lsl0Var.f20586a) && Intrinsics.d(this.b, lsl0Var.b) && this.c == lsl0Var.c && this.d == lsl0Var.d && this.e.equals(lsl0Var.e) && this.f == lsl0Var.f && this.g == lsl0Var.g && this.h == lsl0Var.h && this.i == lsl0Var.i && this.j == lsl0Var.j && Intrinsics.d(this.k, lsl0Var.k) && Intrinsics.d(this.l, lsl0Var.l) && this.m == lsl0Var.m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.m) + dw9.a(dw9.a(brm0.e(brm0.e(twn.a(this.h, brm0.e(brm0.e(ua80.b(brm0.e(brm0.e(dw9.a(this.f20586a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("SportsFilterState(lastSavedOrderedSportsList=", ", defaultCheckedSportIds=", this.f20586a, ", searchExpanded=", this.b);
        ua80.u(", queryWasEmpty=", ", initialQuery=", sbT, this.c, this.d);
        brm0.C(this.e, ", searchFocus=", ", isMovingEnabled=", sbT, this.f);
        ua80.q(this.h, ", checkedSportMaxCount=", ", scrollToTop=", sbT, this.g);
        ua80.u(", showError=", ", sportItems=", sbT, this.i, this.j);
        b1j.y(", sportItemsByQuery=", ", isDragEnabled=", sbT, this.k, this.l);
        return rw2.p(sbT, this.m, Separators.RPAREN);
    }
}
