package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10792a;
    public final Date b;
    public final boolean c;
    public final f72 d;
    public final j8l0 e;
    public final zvh0 f;
    public final v5l0 g;
    public final i8l0 h;
    public final h8l0 i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final Set p;
    public final List q;
    public final Set r;

    public g72(String str, Date date, boolean z, f72 f72Var, j8l0 j8l0Var, zvh0 zvh0Var, v5l0 v5l0Var, i8l0 i8l0Var, h8l0 h8l0Var, boolean z2, boolean z3, boolean z4, int i, boolean z5, boolean z6, Set set, List list, Set set2) {
        str.getClass();
        set.getClass();
        list.getClass();
        set2.getClass();
        this.f10792a = str;
        this.b = date;
        this.c = z;
        this.d = f72Var;
        this.e = j8l0Var;
        this.f = zvh0Var;
        this.g = v5l0Var;
        this.h = i8l0Var;
        this.i = h8l0Var;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = i;
        this.n = z5;
        this.o = z6;
        this.p = set;
        this.q = list;
        this.r = set2;
    }

    public static g72 a(g72 g72Var, String str, Date date, boolean z, f72 f72Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Set set, List list, Set set2, int i) {
        String str2 = (i & 1) != 0 ? g72Var.f10792a : str;
        Date date2 = (i & 2) != 0 ? g72Var.b : date;
        boolean z7 = (i & 4) != 0 ? g72Var.c : z;
        g72Var.getClass();
        f72 f72Var2 = (i & 16) != 0 ? g72Var.d : f72Var;
        j8l0 j8l0Var = g72Var.e;
        zvh0 zvh0Var = g72Var.f;
        v5l0 v5l0Var = g72Var.g;
        i8l0 i8l0Var = g72Var.h;
        h8l0 h8l0Var = g72Var.i;
        boolean z8 = (i & 1024) != 0 ? g72Var.j : z2;
        boolean z9 = (i & 2048) != 0 ? g72Var.k : z3;
        boolean z10 = (i & 4096) != 0 ? g72Var.l : z4;
        int i2 = g72Var.m;
        boolean z11 = (i & 16384) != 0 ? g72Var.n : z5;
        boolean z12 = (32768 & i) != 0 ? g72Var.o : z6;
        Set set3 = (65536 & i) != 0 ? g72Var.p : set;
        List list2 = (131072 & i) != 0 ? g72Var.q : list;
        Set set4 = (i & 262144) != 0 ? g72Var.r : set2;
        g72Var.getClass();
        str2.getClass();
        set3.getClass();
        list2.getClass();
        set4.getClass();
        return new g72(str2, date2, z7, f72Var2, j8l0Var, zvh0Var, v5l0Var, i8l0Var, h8l0Var, z8, z9, z10, i2, z11, z12, set3, list2, set4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g72)) {
            return false;
        }
        g72 g72Var = (g72) obj;
        return Intrinsics.d(this.f10792a, g72Var.f10792a) && Intrinsics.d(this.b, g72Var.b) && this.c == g72Var.c && this.d.equals(g72Var.d) && this.e == g72Var.e && this.f == g72Var.f && this.g == g72Var.g && this.h == g72Var.h && this.i == g72Var.i && this.j == g72Var.j && this.k == g72Var.k && this.l == g72Var.l && this.m == g72Var.m && this.n == g72Var.n && this.o == g72Var.o && Intrinsics.d(this.p, g72Var.p) && Intrinsics.d(this.q, g72Var.q) && Intrinsics.d(this.r, g72Var.r);
    }

    public final int hashCode() {
        int iHashCode = this.f10792a.hashCode() * 31;
        Date date = this.b;
        return this.r.hashCode() + dw9.a(ohs0.g(this.p, brm0.e(brm0.e(twn.a(this.m, brm0.e(brm0.e(brm0.e((this.i.hashCode() + ((this.h.hashCode() + axq.c(this.g, (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + brm0.e(brm0.e((iHashCode + (date == null ? 0 : date.hashCode())) * 31, 31, this.c), 31, false)) * 31)) * 31)) * 31, 31)) * 31)) * 31, 31, this.j), 31, this.k), 31, this.l), 31), 31, this.n), 31, this.o), 31), 31, this.q);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AltChampResultsState(searchQuery=");
        sb.append(this.f10792a);
        sb.append(", choosenDate=");
        sb.append(this.b);
        sb.append(", connected=");
        sb.append(this.c);
        sb.append(", isLoading=false, champsState=");
        sb.append(this.d);
        sb.append(", sportFeedListStyle=");
        sb.append(this.e);
        sb.append(", segmentControlStyleModel=");
        sb.append(this.f);
        sb.append(", sportEventCardStyle=");
        sb.append(this.g);
        sb.append(", sportFeedListIconStyle=");
        sb.append(this.h);
        sb.append(", sportFeedHeaderStyle=");
        sb.append(this.i);
        sb.append(", isSearchActive=");
        sb.append(this.j);
        sb.append(", refresh=");
        ua80.u(", scrollTop=", ", lottieType=", sb, this.k, this.l);
        brm0.w(this.m, ", expandedInitedSport=", ", selectionEnable=", sb, this.n);
        sb.append(this.o);
        sb.append(", selectedIds=");
        sb.append(this.p);
        sb.append(", favoriteChampModels=");
        sb.append(this.q);
        sb.append(", expandedIds=");
        sb.append(this.r);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
