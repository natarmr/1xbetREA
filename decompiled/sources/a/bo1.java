package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2910a;
    public final h9h0 b;
    public final String c;
    public final boolean d;
    public final List e;
    public final boolean f;
    public final Map g;
    public final ot0 h;
    public final String i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final String n;
    public final List o;
    public final int p;
    public final ql5 q;
    public final boolean r;
    public final long s;

    public bo1(String str, h9h0 h9h0Var, String str2, boolean z, List list, boolean z2, Map map, ot0 ot0Var, String str3, String str4, boolean z3, boolean z4, String str5, String str6, List list2, int i, ql5 ql5Var, boolean z5, long j) {
        list.getClass();
        str3.getClass();
        str4.getClass();
        list2.getClass();
        this.f2910a = str;
        this.b = h9h0Var;
        this.c = str2;
        this.d = z;
        this.e = list;
        this.f = z2;
        this.g = map;
        this.h = ot0Var;
        this.i = str3;
        this.j = str4;
        this.k = z3;
        this.l = z4;
        this.m = str5;
        this.n = str6;
        this.o = list2;
        this.p = i;
        this.q = ql5Var;
        this.r = z5;
        this.s = j;
    }

    public static bo1 a(bo1 bo1Var, String str, h9h0 h9h0Var, String str2, List list, boolean z, LinkedHashMap linkedHashMap, boolean z2, boolean z3, List list2, ql5 ql5Var, boolean z4, long j, int i) {
        String str3 = (i & 1) != 0 ? bo1Var.f2910a : str;
        h9h0 h9h0Var2 = (i & 2) != 0 ? bo1Var.b : h9h0Var;
        String str4 = (i & 4) != 0 ? bo1Var.c : str2;
        boolean z5 = bo1Var.d;
        List list3 = (i & 16) != 0 ? bo1Var.e : list;
        boolean z6 = (i & 32) != 0 ? bo1Var.f : z;
        bo1Var.getClass();
        Map map = (i & 128) != 0 ? bo1Var.g : linkedHashMap;
        ot0 ot0Var = bo1Var.h;
        String str5 = bo1Var.i;
        String str6 = bo1Var.j;
        boolean z7 = (i & 2048) != 0 ? bo1Var.k : z2;
        boolean z8 = (i & 4096) != 0 ? bo1Var.l : z3;
        String str7 = bo1Var.m;
        String str8 = bo1Var.n;
        List list4 = (i & 32768) != 0 ? bo1Var.o : list2;
        int i2 = bo1Var.p;
        ql5 ql5Var2 = (i & 131072) != 0 ? bo1Var.q : ql5Var;
        boolean z9 = (i & 262144) != 0 ? bo1Var.r : z4;
        long j2 = (i & 524288) != 0 ? bo1Var.s : j;
        bo1Var.getClass();
        str3.getClass();
        list3.getClass();
        str5.getClass();
        str6.getClass();
        list4.getClass();
        return new bo1(str3, h9h0Var2, str4, z5, list3, z6, map, ot0Var, str5, str6, z7, z8, str7, str8, list4, i2, ql5Var2, z9, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bo1)) {
            return false;
        }
        bo1 bo1Var = (bo1) obj;
        return this.f2910a.equals(bo1Var.f2910a) && this.b.equals(bo1Var.b) && this.c.equals(bo1Var.c) && this.d == bo1Var.d && Intrinsics.d(this.e, bo1Var.e) && this.f == bo1Var.f && this.g.equals(bo1Var.g) && this.h == bo1Var.h && Intrinsics.d(this.i, bo1Var.i) && Intrinsics.d(this.j, bo1Var.j) && this.k == bo1Var.k && this.l == bo1Var.l && this.m.equals(bo1Var.m) && this.n.equals(bo1Var.n) && Intrinsics.d(this.o, bo1Var.o) && this.p == bo1Var.p && Intrinsics.d(this.q, bo1Var.q) && this.r == bo1Var.r && this.s == bo1Var.s;
    }

    public final int hashCode() {
        int iA = twn.a(this.p, dw9.a(ua80.b(ua80.b(brm0.e(brm0.e(ua80.b(ua80.b((this.h.hashCode() + ohs0.f(this.g, twn.a(0, brm0.e(dw9.a(brm0.e(ua80.b((this.b.hashCode() + (this.f2910a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31);
        ql5 ql5Var = this.q;
        return Long.hashCode(this.s) + brm0.e((iA + (ql5Var != null ? ql5Var.hashCode() : 0)) * 31, 31, this.r);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AggregatorSearchState(query=");
        sb.append(this.f2910a);
        sb.append(", screenState=");
        sb.append(this.b);
        sb.append(", lastQuery=");
        brm0.C(this.c, ", hasSectionVirtual=", ", favoriteGames=", sb, this.d);
        rz4.z(sb, ", hasSearchResult=", this.e, ", subCategoryId=0, gamesMap=", this.f);
        sb.append(this.g);
        sb.append(", searchAggregatorCardStyle=");
        sb.append(this.h);
        sb.append(", navigationBarTitle=");
        f140.v(sb, this.i, ", navigationBarHint=", this.j, ", isLoggedIn=");
        ua80.u(", isConnected=", ", aggregatorSearchScreenType=", sb, this.k, this.l);
        f140.v(sb, this.m, ", searchScreenName=", this.n, ", defaultCategories=");
        brm0.v(this.p, ", lottieType=", ", balance=", sb, this.o);
        sb.append(this.q);
        sb.append(", defaultCategoriesAuthState=");
        sb.append(this.r);
        sb.append(", gameCategoryIdToOpen=");
        return brm0.k(this.s, Separators.RPAREN, sb);
    }
}
