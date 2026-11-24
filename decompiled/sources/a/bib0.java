package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bib0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2652a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;
    public final List f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final long k;
    public final boolean l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final lxw r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final String v;
    public final String w;
    public final boolean x;

    public bib0(boolean z, boolean z2, String str, String str2, boolean z3, List list, boolean z4, boolean z5, boolean z6, boolean z7, long j, boolean z8, int i, boolean z9, boolean z10, boolean z11, boolean z12, lxw lxwVar, boolean z13, boolean z14, boolean z15, String str3, String str4, boolean z16) {
        list.getClass();
        this.f2652a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = z3;
        this.f = list;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = z7;
        this.k = j;
        this.l = z8;
        this.m = i;
        this.n = z9;
        this.o = z10;
        this.p = z11;
        this.q = z12;
        this.r = lxwVar;
        this.s = z13;
        this.t = z14;
        this.u = z15;
        this.v = str3;
        this.w = str4;
        this.x = z16;
    }

    public static bib0 a(bib0 bib0Var, boolean z, boolean z2, int i) {
        boolean z3 = (i & 1) != 0 ? bib0Var.f2652a : z;
        boolean z4 = bib0Var.b;
        String str = bib0Var.c;
        String str2 = bib0Var.d;
        boolean z5 = bib0Var.e;
        List list = bib0Var.f;
        boolean z6 = bib0Var.g;
        boolean z7 = bib0Var.h;
        boolean z8 = bib0Var.i;
        boolean z9 = bib0Var.j;
        long j = bib0Var.k;
        boolean z10 = bib0Var.l;
        int i2 = bib0Var.m;
        boolean z11 = bib0Var.n;
        boolean z12 = bib0Var.o;
        boolean z13 = bib0Var.p;
        boolean z14 = bib0Var.q;
        lxw lxwVar = bib0Var.r;
        boolean z15 = bib0Var.s;
        boolean z16 = (i & 524288) != 0 ? bib0Var.t : z2;
        boolean z17 = bib0Var.u;
        String str3 = bib0Var.v;
        String str4 = bib0Var.w;
        boolean z18 = bib0Var.x;
        list.getClass();
        return new bib0(z3, z4, str, str2, z5, list, z6, z7, z8, z9, j, z10, i2, z11, z12, z13, z14, lxwVar, z15, z16, z17, str3, str4, z18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bib0)) {
            return false;
        }
        bib0 bib0Var = (bib0) obj;
        return this.f2652a == bib0Var.f2652a && this.b == bib0Var.b && this.c.equals(bib0Var.c) && this.d.equals(bib0Var.d) && this.e == bib0Var.e && Intrinsics.d(this.f, bib0Var.f) && this.g == bib0Var.g && this.h == bib0Var.h && this.i == bib0Var.i && this.j == bib0Var.j && this.k == bib0Var.k && this.l == bib0Var.l && this.m == bib0Var.m && this.n == bib0Var.n && this.o == bib0Var.o && this.p == bib0Var.p && this.q == bib0Var.q && this.r == bib0Var.r && this.s == bib0Var.s && this.t == bib0Var.t && this.u == bib0Var.u && this.v.equals(bib0Var.v) && this.w.equals(bib0Var.w) && this.x == bib0Var.x;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.x) + twn.a(1357, ua80.b(ua80.b(brm0.e(brm0.e(brm0.e((this.r.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(twn.a(this.m, brm0.e(rw2.b(brm0.e(brm0.e(brm0.e(brm0.e(dw9.a(brm0.e(ua80.b(ua80.b(brm0.e(Boolean.hashCode(this.f2652a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31), 31, this.n), 31, this.o), 31, this.p), 31, this.q)) * 31, 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("PopularSettings(isDark=", ", isSearchVisible=", ", accountControlStyle=", this.f2652a, this.b);
        f140.v(sbQ, this.c, ", popularToolbarStyle=", this.d, ", hasPopularOnboardRegOrAuth=");
        vqd.y(sbQ, ", popularAllowedGeoList=", this.f, ", hasBonusIdentificationKZ=", this.e);
        ua80.u(", hasBalance=", ", hasSessionTimeTracker=", sbQ, this.g, this.h);
        ua80.u(", hasResponsibleBottomPopular=", ", popularOnboardRegOrAuthTimer=", sbQ, this.i, this.j);
        hne.t(this.k, ", showMinAgeBettingAlert=", sbQ, this.l);
        dw9.v(this.m, ", minimumAge=", ", hasSectionAggregator=", sbQ, this.n);
        w6x.A(", isBettingEnable=", ", balanceEnable=", sbQ, this.o, this.p);
        sbQ.append(", isVirtual=");
        sbQ.append(this.q);
        sbQ.append(", identificationFlow=");
        sbQ.append(this.r);
        w6x.A(", federalTaxLegislationInfoEnabled=", ", isStartFromLauncher=", sbQ, this.s, this.t);
        hne.u(", isNotificationPermissionEnable=", ", xGamesName=", this.v, sbQ, this.u);
        w6x.z(", tabsStyle=", this.w, ", groupId=1357, isUseStaticImage=", sbQ, this.x);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
