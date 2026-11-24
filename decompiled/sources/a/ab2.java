package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ab2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f558a;
    public final Date b;
    public final boolean c;
    public final za2 d;
    public final zvh0 e;
    public final v5l0 f;
    public final h8l0 g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final List k;
    public final wcb l;
    public final Set m;
    public final int n;
    public final boolean o;

    public ab2(String str, Date date, boolean z, za2 za2Var, zvh0 zvh0Var, v5l0 v5l0Var, h8l0 h8l0Var, boolean z2, boolean z3, boolean z4, List list, wcb wcbVar, Set set, int i, boolean z5) {
        list.getClass();
        set.getClass();
        this.f558a = str;
        this.b = date;
        this.c = z;
        this.d = za2Var;
        this.e = zvh0Var;
        this.f = v5l0Var;
        this.g = h8l0Var;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = list;
        this.l = wcbVar;
        this.m = set;
        this.n = i;
        this.o = z5;
    }

    public static ab2 a(ab2 ab2Var, String str, Date date, boolean z, za2 za2Var, boolean z2, boolean z3, boolean z4, List list, wcb wcbVar, Set set, int i) {
        String str2 = (i & 1) != 0 ? ab2Var.f558a : str;
        Date date2 = (i & 2) != 0 ? ab2Var.b : date;
        boolean z5 = (i & 4) != 0 ? ab2Var.c : z;
        ab2Var.getClass();
        za2 za2Var2 = (i & 16) != 0 ? ab2Var.d : za2Var;
        zvh0 zvh0Var = ab2Var.e;
        v5l0 v5l0Var = ab2Var.f;
        h8l0 h8l0Var = ab2Var.g;
        boolean z6 = (i & 256) != 0 ? ab2Var.h : z2;
        boolean z7 = (i & 512) != 0 ? ab2Var.i : z3;
        boolean z8 = (i & 1024) != 0 ? ab2Var.j : z4;
        List list2 = (i & 2048) != 0 ? ab2Var.k : list;
        wcb wcbVar2 = (i & 4096) != 0 ? ab2Var.l : wcbVar;
        Set set2 = (i & 8192) != 0 ? ab2Var.m : set;
        int i2 = ab2Var.n;
        boolean z9 = ab2Var.o;
        ab2Var.getClass();
        list2.getClass();
        set2.getClass();
        return new ab2(str2, date2, z5, za2Var2, zvh0Var, v5l0Var, h8l0Var, z6, z7, z8, list2, wcbVar2, set2, i2, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab2)) {
            return false;
        }
        ab2 ab2Var = (ab2) obj;
        return this.f558a.equals(ab2Var.f558a) && Intrinsics.d(this.b, ab2Var.b) && this.c == ab2Var.c && this.d.equals(ab2Var.d) && this.e == ab2Var.e && this.f == ab2Var.f && this.g == ab2Var.g && this.h == ab2Var.h && this.i == ab2Var.i && this.j == ab2Var.j && Intrinsics.d(this.k, ab2Var.k) && Intrinsics.d(this.l, ab2Var.l) && Intrinsics.d(this.m, ab2Var.m) && this.n == ab2Var.n && this.o == ab2Var.o;
    }

    public final int hashCode() {
        int iHashCode = this.f558a.hashCode() * 31;
        Date date = this.b;
        int iA = dw9.a(brm0.e(brm0.e(brm0.e((this.g.hashCode() + axq.c(this.f, (this.e.hashCode() + ((this.d.hashCode() + brm0.e(brm0.e((iHashCode + (date == null ? 0 : date.hashCode())) * 31, 31, this.c), 31, false)) * 31)) * 31, 31)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        wcb wcbVar = this.l;
        return Boolean.hashCode(this.o) + twn.a(this.n, ohs0.g(this.m, (iA + (wcbVar != null ? wcbVar.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AltGamesHistoryResultsState(searchQuery=");
        sb.append(this.f558a);
        sb.append(", choosenDate=");
        sb.append(this.b);
        sb.append(", connected=");
        sb.append(this.c);
        sb.append(", isLoading=false, dataState=");
        sb.append(this.d);
        sb.append(", segmentControlStyleModel=");
        sb.append(this.e);
        sb.append(", sportEventCardStyle=");
        sb.append(this.f);
        sb.append(", sportFeedHeaderStyle=");
        sb.append(this.g);
        sb.append(", isSearchActive=");
        sb.append(this.h);
        sb.append(", refresh=");
        ua80.u(", scrollTop=", ", specialEvents=", sb, this.i, this.j);
        sb.append(this.k);
        sb.append(", champImagesHolder=");
        sb.append(this.l);
        sb.append(", expandedHistoryGamesIds=");
        sb.append(this.m);
        sb.append(", lottieType=");
        sb.append(this.n);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.o, Separators.RPAREN);
    }
}
