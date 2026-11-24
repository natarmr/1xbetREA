package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class uhh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35679a;
    public final ifh0 b;
    public final String c;
    public final String d;
    public final cxk0 e;
    public final cxk0 f;
    public final List g;
    public final List h;
    public final List i;
    public final List j;
    public final long k;
    public final wcb l;
    public final Set m;
    public final mfh0 n;
    public final boolean o;
    public final sah0 p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final String v;
    public final n0w w;
    public final v5l0 x;
    public final int y;
    public final boolean z;

    public uhh0(int i, ifh0 ifh0Var, String str, String str2, cxk0 cxk0Var, cxk0 cxk0Var2, List list, List list2, List list3, List list4, long j, wcb wcbVar, Set set, mfh0 mfh0Var, boolean z, sah0 sah0Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str3, n0w n0wVar, v5l0 v5l0Var, int i2, boolean z7) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        set.getClass();
        str3.getClass();
        v5l0Var.getClass();
        this.f35679a = i;
        this.b = ifh0Var;
        this.c = str;
        this.d = str2;
        this.e = cxk0Var;
        this.f = cxk0Var2;
        this.g = list;
        this.h = list2;
        this.i = list3;
        this.j = list4;
        this.k = j;
        this.l = wcbVar;
        this.m = set;
        this.n = mfh0Var;
        this.o = z;
        this.p = sah0Var;
        this.q = z2;
        this.r = z3;
        this.s = z4;
        this.t = z5;
        this.u = z6;
        this.v = str3;
        this.w = n0wVar;
        this.x = v5l0Var;
        this.y = i2;
        this.z = z7;
    }

    public static uhh0 a(uhh0 uhh0Var, String str, String str2, cxk0 cxk0Var, cxk0 cxk0Var2, List list, List list2, List list3, List list4, long j, wcb wcbVar, LinkedHashSet linkedHashSet, mfh0 mfh0Var, boolean z, sah0 sah0Var, int i) {
        int i2 = uhh0Var.f35679a;
        ifh0 ifh0Var = uhh0Var.b;
        String str3 = (i & 4) != 0 ? uhh0Var.c : str;
        String str4 = (i & 8) != 0 ? uhh0Var.d : str2;
        cxk0 cxk0Var3 = (i & 16) != 0 ? uhh0Var.e : cxk0Var;
        cxk0 cxk0Var4 = (i & 32) != 0 ? uhh0Var.f : cxk0Var2;
        List list5 = (i & 64) != 0 ? uhh0Var.g : list;
        List list6 = (i & 128) != 0 ? uhh0Var.h : list2;
        List list7 = (i & 256) != 0 ? uhh0Var.i : list3;
        List list8 = (i & 512) != 0 ? uhh0Var.j : list4;
        long j2 = (i & 1024) != 0 ? uhh0Var.k : j;
        wcb wcbVar2 = (i & 2048) != 0 ? uhh0Var.l : wcbVar;
        Set set = (i & 4096) != 0 ? uhh0Var.m : linkedHashSet;
        mfh0 mfh0Var2 = (i & 8192) != 0 ? uhh0Var.n : mfh0Var;
        boolean z2 = (i & 16384) != 0 ? uhh0Var.o : z;
        sah0 sah0Var2 = (i & 32768) != 0 ? uhh0Var.p : sah0Var;
        boolean z3 = uhh0Var.q;
        boolean z4 = uhh0Var.r;
        boolean z5 = uhh0Var.s;
        boolean z6 = uhh0Var.t;
        boolean z7 = uhh0Var.u;
        String str5 = uhh0Var.v;
        n0w n0wVar = uhh0Var.w;
        v5l0 v5l0Var = uhh0Var.x;
        int i3 = uhh0Var.y;
        boolean z8 = uhh0Var.z;
        uhh0Var.getClass();
        str4.getClass();
        cxk0Var3.getClass();
        list5.getClass();
        list6.getClass();
        list7.getClass();
        list8.getClass();
        set.getClass();
        sah0Var2.getClass();
        str5.getClass();
        v5l0Var.getClass();
        return new uhh0(i2, ifh0Var, str3, str4, cxk0Var3, cxk0Var4, list5, list6, list7, list8, j2, wcbVar2, set, mfh0Var2, z2, sah0Var2, z3, z4, z5, z6, z7, str5, n0wVar, v5l0Var, i3, z8);
    }

    public final boolean b() {
        if (this.n != null) {
            return false;
        }
        cxk0 cxk0Var = this.e;
        if (!cxk0Var.f5126a.isEmpty() || !cxk0Var.b.isEmpty() || !cxk0Var.c.isEmpty()) {
            return false;
        }
        cxk0 cxk0Var2 = this.f;
        return cxk0Var2.f5126a.isEmpty() && cxk0Var2.b.isEmpty() && cxk0Var2.c.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uhh0)) {
            return false;
        }
        uhh0 uhh0Var = (uhh0) obj;
        return this.f35679a == uhh0Var.f35679a && this.b == uhh0Var.b && this.c.equals(uhh0Var.c) && this.d.equals(uhh0Var.d) && this.e.equals(uhh0Var.e) && this.f.equals(uhh0Var.f) && Intrinsics.d(this.g, uhh0Var.g) && Intrinsics.d(this.h, uhh0Var.h) && Intrinsics.d(this.i, uhh0Var.i) && Intrinsics.d(this.j, uhh0Var.j) && this.k == uhh0Var.k && Intrinsics.d(this.l, uhh0Var.l) && Intrinsics.d(this.m, uhh0Var.m) && Intrinsics.d(this.n, uhh0Var.n) && this.o == uhh0Var.o && this.p == uhh0Var.p && this.q == uhh0Var.q && this.r == uhh0Var.r && this.s == uhh0Var.s && this.t == uhh0Var.t && this.u == uhh0Var.u && Intrinsics.d(this.v, uhh0Var.v) && this.w == uhh0Var.w && this.x == uhh0Var.x && this.y == uhh0Var.y && this.z == uhh0Var.z;
    }

    public final int hashCode() {
        int iB = rw2.b(dw9.a(dw9.a(dw9.a(dw9.a((this.f.hashCode() + ((this.e.hashCode() + ua80.b(ua80.b((this.b.hashCode() + (Integer.hashCode(this.f35679a) * 31)) * 31, 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        wcb wcbVar = this.l;
        int iG = ohs0.g(this.m, (iB + (wcbVar == null ? 0 : wcbVar.hashCode())) * 31, 31);
        mfh0 mfh0Var = this.n;
        return Boolean.hashCode(this.z) + twn.a(this.y, axq.c(this.x, (this.w.hashCode() + ua80.b(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e((this.p.hashCode() + brm0.e((iG + (mfh0Var != null ? mfh0Var.hashCode() : 0)) * 31, 31, this.o)) * 31, 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchState(eventId=");
        sb.append(this.f35679a);
        sb.append(", searchEntryPoint=");
        sb.append(this.b);
        sb.append(", searchValue=");
        f140.v(sb, this.c, ", contentSearchValue=", this.d, ", upcomingEvents=");
        sb.append(this.e);
        sb.append(", searchEvents=");
        sb.append(this.f);
        sb.append(", gamesLiveSection=");
        b1j.y(", gamesLineSection=", ", gamesHistorySection=", sb, this.g, this.h);
        b1j.y(", filtersSportModelList=", ", selectedFilterId=", sb, this.i, this.j);
        sb.append(this.k);
        sb.append(", champImagesHolder=");
        sb.append(this.l);
        sb.append(", expandGamesHistoryIds=");
        sb.append(this.m);
        sb.append(", errorState=");
        sb.append(this.n);
        sb.append(", isLoading=");
        sb.append(this.o);
        sb.append(", scrollType=");
        sb.append(this.p);
        w6x.A(", isBettingDisabled=", ", hasStream=", sb, this.q, this.r);
        w6x.A(", isNewEventParams=", ", customSportIcon=", sb, this.s, this.t);
        hne.u(", topIcon=", ", overrideImagesId=", this.v, sb, this.u);
        sb.append(", historyDataSourceType=");
        sb.append(this.w);
        sb.append(", sportEventCardStyle=");
        sb.append(this.x);
        dw9.v(this.y, ", lottieType=", ", rtlSupport=", sb, this.z);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
