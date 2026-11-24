package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class odl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25082a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final List i;
    public final List j;
    public final Set k;
    public final Set l;
    public final jkm m;
    public final long n;

    public odl0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str, List list, List list2, Set set, Set set2, jkm jkmVar, long j) {
        list.getClass();
        list2.getClass();
        set.getClass();
        set2.getClass();
        this.f25082a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = str;
        this.i = list;
        this.j = list2;
        this.k = set;
        this.l = set2;
        this.m = jkmVar;
        this.n = j;
    }

    public static odl0 a(odl0 odl0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, List list, List list2, Set set, Set set2, jkm jkmVar, int i) {
        boolean z7 = (i & 1) != 0 ? odl0Var.f25082a : false;
        boolean z8 = (i & 2) != 0 ? odl0Var.b : z;
        boolean z9 = (i & 4) != 0 ? odl0Var.c : z2;
        boolean z10 = (i & 8) != 0 ? odl0Var.d : z3;
        boolean z11 = (i & 16) != 0 ? odl0Var.e : z4;
        boolean z12 = (i & 32) != 0 ? odl0Var.f : z5;
        boolean z13 = (i & 64) != 0 ? odl0Var.g : z6;
        String str2 = (i & 128) != 0 ? odl0Var.h : str;
        List list3 = (i & 256) != 0 ? odl0Var.i : list;
        List list4 = (i & 512) != 0 ? odl0Var.j : list2;
        Set set3 = (i & 1024) != 0 ? odl0Var.k : set;
        Set set4 = (i & 2048) != 0 ? odl0Var.l : set2;
        jkm jkmVar2 = (i & 4096) != 0 ? odl0Var.m : jkmVar;
        long j = (i & 8192) != 0 ? odl0Var.n : 10000L;
        odl0Var.getClass();
        str2.getClass();
        list3.getClass();
        list4.getClass();
        set3.getClass();
        set4.getClass();
        return new odl0(z7, z8, z9, z10, z11, z12, z13, str2, list3, list4, set3, set4, jkmVar2, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odl0)) {
            return false;
        }
        odl0 odl0Var = (odl0) obj;
        return this.f25082a == odl0Var.f25082a && this.b == odl0Var.b && this.c == odl0Var.c && this.d == odl0Var.d && this.e == odl0Var.e && this.f == odl0Var.f && this.g == odl0Var.g && this.h.equals(odl0Var.h) && Intrinsics.d(this.i, odl0Var.i) && Intrinsics.d(this.j, odl0Var.j) && Intrinsics.d(this.k, odl0Var.k) && Intrinsics.d(this.l, odl0Var.l) && this.m.equals(odl0Var.m) && this.n == odl0Var.n;
    }

    public final int hashCode() {
        return Long.hashCode(this.n) + ((this.m.hashCode() + ohs0.g(this.l, ohs0.g(this.k, dw9.a(dw9.a(ua80.b(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f25082a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("SportGameFilterStateModel(hasLoading=", ", hasError=", ", hasResetAllSportFilterBtnEnable=", this.f25082a, this.b);
        ua80.u(", hasApplyBtnEnable=", ", hasMenuDiscardBtnEnabled=", sbQ, this.c, this.d);
        ua80.u(", hasSearchFieldExpanded=", ", hasSearchNothingFound=", sbQ, this.e, this.f);
        f140.s(", searchText=", this.h, ", allSportGameFilterList=", sbQ, this.g);
        b1j.y(", searchResultSportGameFilterList=", ", selectedSportGameFilterIds=", sbQ, this.i, this.j);
        sbQ.append(this.k);
        sbQ.append(", defaultSelectedSportGamesFilterIds=");
        sbQ.append(this.l);
        sbQ.append(", lottieConfig=");
        sbQ.append(this.m);
        sbQ.append(", countDownTimeMillis=");
        sbQ.append(this.n);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
