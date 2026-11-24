package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5830a;
    public final Set b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final mdm g;
    public final mdm h;
    public final boolean i;
    public final String j;
    public final Date k;
    public final j8l0 l;
    public final i8l0 m;

    public dc2(List list, Set set, boolean z, boolean z2, boolean z3, boolean z4, mdm mdmVar, mdm mdmVar2, boolean z5, String str, Date date, j8l0 j8l0Var, i8l0 i8l0Var) {
        list.getClass();
        set.getClass();
        this.f5830a = list;
        this.b = set;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = mdmVar;
        this.h = mdmVar2;
        this.i = z5;
        this.j = str;
        this.k = date;
        this.l = j8l0Var;
        this.m = i8l0Var;
    }

    public static dc2 a(dc2 dc2Var, List list, Set set, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, Date date, int i) {
        List list2 = (i & 1) != 0 ? dc2Var.f5830a : list;
        Set set2 = (i & 2) != 0 ? dc2Var.b : set;
        boolean z6 = (i & 4) != 0 ? dc2Var.c : z;
        boolean z7 = (i & 8) != 0 ? dc2Var.d : z2;
        boolean z8 = (i & 16) != 0 ? dc2Var.e : z3;
        boolean z9 = (i & 32) != 0 ? dc2Var.f : z4;
        mdm mdmVar = dc2Var.g;
        mdm mdmVar2 = dc2Var.h;
        boolean z10 = (i & 256) != 0 ? dc2Var.i : z5;
        String str2 = (i & 512) != 0 ? dc2Var.j : str;
        Date date2 = (i & 1024) != 0 ? dc2Var.k : date;
        j8l0 j8l0Var = dc2Var.l;
        i8l0 i8l0Var = dc2Var.m;
        dc2Var.getClass();
        list2.getClass();
        set2.getClass();
        return new dc2(list2, set2, z6, z7, z8, z9, mdmVar, mdmVar2, z10, str2, date2, j8l0Var, i8l0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc2)) {
            return false;
        }
        dc2 dc2Var = (dc2) obj;
        return Intrinsics.d(this.f5830a, dc2Var.f5830a) && Intrinsics.d(this.b, dc2Var.b) && this.c == dc2Var.c && this.d == dc2Var.d && this.e == dc2Var.e && this.f == dc2Var.f && this.g.equals(dc2Var.g) && this.h.equals(dc2Var.h) && this.i == dc2Var.i && this.j.equals(dc2Var.j) && Intrinsics.d(this.k, dc2Var.k) && this.l == dc2Var.l && this.m == dc2Var.m;
    }

    public final int hashCode() {
        int iB = ua80.b(brm0.e(f140.d(this.h, f140.d(this.g, brm0.e(brm0.e(brm0.e(brm0.e(ohs0.g(this.b, this.f5830a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31), 31, this.i), 31, this.j);
        Date date = this.k;
        return this.m.hashCode() + ((this.l.hashCode() + ((iB + (date == null ? 0 : date.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AltHistoryResultsState(sportItems=");
        sb.append(this.f5830a);
        sb.append(", selectedSportItems=");
        sb.append(this.b);
        sb.append(", isMultiSelectShow=");
        ua80.u(", isRefreshing=", ", loading=", sb, this.c, this.d);
        ua80.u(", showError=", ", lottieErrorConfig=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", lottieEmptyConfig=");
        sb.append(this.h);
        sb.append(", isConnection=");
        f140.s(", searchQuery=", this.j, ", date=", sb, this.i);
        sb.append(this.k);
        sb.append(", sportFeedListStyle=");
        sb.append(this.l);
        sb.append(", sportFeedListIconStyle=");
        sb.append(this.m);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
