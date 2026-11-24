package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g0f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10456a;
    public final List b;
    public final double c;
    public final List d;
    public final double e;
    public final long f;
    public final double g;
    public final double h;
    public final boolean i;
    public final double j;
    public final boolean k;
    public final int l;
    public final String m;
    public final boolean n;
    public final int o;
    public final String p;
    public final List q;
    public final double r;
    public final double s;
    public final boolean t;

    public g0f(long j, List list, double d, List list2, double d2, long j2, double d3, double d4, boolean z, double d5, boolean z2, int i, String str, boolean z3, int i2, String str2, List list3, double d6, double d7, boolean z4) {
        b1j.B(list, list2, list3);
        this.f10456a = j;
        this.b = list;
        this.c = d;
        this.d = list2;
        this.e = d2;
        this.f = j2;
        this.g = d3;
        this.h = d4;
        this.i = z;
        this.j = d5;
        this.k = z2;
        this.l = i;
        this.m = str;
        this.n = z3;
        this.o = i2;
        this.p = str2;
        this.q = list3;
        this.r = d6;
        this.s = d7;
        this.t = z4;
    }

    public static g0f a(g0f g0fVar, long j, List list, double d, List list2, double d2, long j2, double d3, double d4, boolean z, double d5, boolean z2, int i, String str, boolean z3, int i2, String str2, List list3, double d6, double d7, boolean z4, int i3) {
        long j3 = (i3 & 1) != 0 ? g0fVar.f10456a : j;
        List list4 = (i3 & 2) != 0 ? g0fVar.b : list;
        double d8 = (i3 & 4) != 0 ? g0fVar.c : d;
        List list5 = (i3 & 8) != 0 ? g0fVar.d : list2;
        double d9 = (i3 & 16) != 0 ? g0fVar.e : d2;
        long j4 = (i3 & 32) != 0 ? g0fVar.f : j2;
        double d10 = (i3 & 64) != 0 ? g0fVar.g : d3;
        double d11 = (i3 & 128) != 0 ? g0fVar.h : d4;
        long j5 = j3;
        boolean z5 = (i3 & 256) != 0 ? g0fVar.i : z;
        double d12 = (i3 & 512) != 0 ? g0fVar.j : d5;
        boolean z6 = (i3 & 1024) != 0 ? g0fVar.k : z2;
        int i4 = (i3 & 2048) != 0 ? g0fVar.l : i;
        boolean z7 = z6;
        String str3 = (i3 & 4096) != 0 ? g0fVar.m : str;
        boolean z8 = (i3 & 8192) != 0 ? g0fVar.n : z3;
        int i5 = (i3 & 16384) != 0 ? g0fVar.o : i2;
        String str4 = (i3 & 32768) != 0 ? g0fVar.p : str2;
        List list6 = (i3 & 65536) != 0 ? g0fVar.q : list3;
        int i6 = i5;
        double d13 = (i3 & 131072) != 0 ? g0fVar.r : d6;
        double d14 = (i3 & 262144) != 0 ? g0fVar.s : d7;
        boolean z9 = (i3 & 524288) != 0 ? g0fVar.t : z4;
        g0fVar.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        return new g0f(j5, list4, d8, list5, d9, j4, d10, d11, z5, d12, z7, i4, str3, z8, i6, str4, list6, d13, d14, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0f)) {
            return false;
        }
        g0f g0fVar = (g0f) obj;
        return this.f10456a == g0fVar.f10456a && Intrinsics.d(this.b, g0fVar.b) && Double.compare(this.c, g0fVar.c) == 0 && Intrinsics.d(this.d, g0fVar.d) && Double.compare(this.e, g0fVar.e) == 0 && this.f == g0fVar.f && Double.compare(this.g, g0fVar.g) == 0 && Double.compare(this.h, g0fVar.h) == 0 && this.i == g0fVar.i && Double.compare(this.j, g0fVar.j) == 0 && this.k == g0fVar.k && this.l == g0fVar.l && this.m.equals(g0fVar.m) && this.n == g0fVar.n && this.o == g0fVar.o && this.p.equals(g0fVar.p) && Intrinsics.d(this.q, g0fVar.q) && Double.compare(this.r, g0fVar.r) == 0 && Double.compare(this.s, g0fVar.s) == 0 && this.t == g0fVar.t;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.t) + brm0.d(this.s, brm0.d(this.r, dw9.a(ua80.b(twn.a(this.o, brm0.e(ua80.b(twn.a(this.l, brm0.e(brm0.d(this.j, brm0.e(brm0.d(this.h, brm0.d(this.g, rw2.b(brm0.d(this.e, dw9.a(brm0.d(this.c, dw9.a(Long.hashCode(this.f10456a) * 31, 31, this.b), 31), 31, this.d), 31), 31, this.f), 31), 31), 31, this.i), 31), 31, this.k), 31), 31, this.m), 31, this.n), 31), 31, this.p), 31, this.q), 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = cs0.p(this.f10456a, "CouponModel(balanceId=", ", betBlockList=", this.b);
        ohs0.A(sbP, this.c, ", minBet=", ", minBetSystemList=");
        sbP.append(this.d);
        sbP.append(", maxBet=");
        sbP.append(this.e);
        kng0.A(sbP, ", expressNum=", this.f, ", coef=");
        sbP.append(this.g);
        ohs0.A(sbP, this.h, ", antiExpressCoef=", ", unlimitedBet=");
        sbP.append(this.i);
        sbP.append(", maxPayout=");
        sbP.append(this.j);
        cs0.v(this.l, ", negAsiaBetFlg=", ", eventsCountForBoost=", sbP, this.k);
        w6x.z(", minCoefForBoost=", this.m, ", isExpressBoost=", sbP, this.n);
        w6x.w(this.o, ", minEventCountToBoost=", ", restrictionWarning=", this.p, sbP);
        sbP.append(", restrictionWarningGameIds=");
        sbP.append(this.q);
        sbP.append(", betStep=");
        sbP.append(this.r);
        ohs0.A(sbP, this.s, ", initialBet=", ", eachWayBet=");
        return rw2.p(sbP, this.t, Separators.RPAREN);
    }
}
