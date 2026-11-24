package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class pln {
    public final gho A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27192a;
    public final long b;
    public final long c;
    public final long d;
    public final double e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final long j;
    public final String k;
    public final double l;
    public final double m;
    public final String n;
    public final boolean o;
    public final long p;
    public final String q;
    public final String r;
    public final List s;
    public final List t;
    public final String u;
    public final String v;
    public final String w;
    public final boolean x;
    public final String y;
    public final boolean z;

    public pln(long j, long j2, long j3, long j4, double d, long j5, boolean z, boolean z2, String str, long j6, String str2, double d2, double d3, String str3, boolean z3, long j7, String str4, String str5, List list, List list2, String str6, String str7, String str8, boolean z4, String str9, boolean z5, gho ghoVar) {
        ohs0.z(str, str2, str3, str4, str5);
        list.getClass();
        list2.getClass();
        this.f27192a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = d;
        this.f = j5;
        this.g = z;
        this.h = z2;
        this.i = str;
        this.j = j6;
        this.k = str2;
        this.l = d2;
        this.m = d3;
        this.n = str3;
        this.o = z3;
        this.p = j7;
        this.q = str4;
        this.r = str5;
        this.s = list;
        this.t = list2;
        this.u = str6;
        this.v = str7;
        this.w = str8;
        this.x = z4;
        this.y = str9;
        this.z = z5;
        this.A = ghoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pln)) {
            return false;
        }
        pln plnVar = (pln) obj;
        return this.f27192a == plnVar.f27192a && this.b == plnVar.b && this.c == plnVar.c && this.d == plnVar.d && Double.compare(this.e, plnVar.e) == 0 && this.f == plnVar.f && this.g == plnVar.g && this.h == plnVar.h && Intrinsics.d(this.i, plnVar.i) && this.j == plnVar.j && Intrinsics.d(this.k, plnVar.k) && Double.compare(this.l, plnVar.l) == 0 && Double.compare(this.m, plnVar.m) == 0 && Intrinsics.d(this.n, plnVar.n) && this.o == plnVar.o && this.p == plnVar.p && Intrinsics.d(this.q, plnVar.q) && Intrinsics.d(this.r, plnVar.r) && Intrinsics.d(this.s, plnVar.s) && Intrinsics.d(this.t, plnVar.t) && this.u.equals(plnVar.u) && this.v.equals(plnVar.v) && this.w.equals(plnVar.w) && this.x == plnVar.x && this.y.equals(plnVar.y) && this.z == plnVar.z && this.A == plnVar.A;
    }

    public final int hashCode() {
        return this.A.hashCode() + brm0.e(ua80.b(brm0.e(ua80.b(ua80.b(ua80.b(dw9.a(dw9.a(ua80.b(ua80.b(rw2.b(brm0.e(ua80.b(brm0.d(this.m, brm0.d(this.l, ua80.b(rw2.b(ua80.b(brm0.e(brm0.e(rw2.b(brm0.d(this.e, rw2.b(rw2.b(rw2.b(Long.hashCode(this.f27192a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31), 31), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f27192a, "EditCouponEventModel(groupId=", ", betId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", gameId=", this.c, ", champId=");
        sbQ.append(this.d);
        ohs0.A(sbQ, this.e, ", param=", ", playerId=");
        hne.t(this.f, ", isLive=", sbQ, this.g);
        hne.u(", block=", ", event=", this.i, sbQ, this.h);
        kng0.A(sbQ, ", sportId=", this.j, ", champName=");
        hne.A(sbQ, this.k, ", coef=", this.l);
        ohs0.A(sbQ, this.m, ", coefOld=", ", coefficientFormatted=");
        brm0.C(this.n, ", relation=", ", timeStartSec=", sbQ, this.o);
        kng0.z(sbQ, this.p, ", teamOneName=", this.q);
        ua80.t(", teamTwoName=", this.r, ", firstTeamImage=", sbQ, this.s);
        sbQ.append(", secondTeamImage=");
        sbQ.append(this.t);
        sbQ.append(", periodName=");
        sbQ.append(this.u);
        f140.v(sbQ, ", gameVidName=", this.v, ", gameTypeName=", this.w);
        hne.u(", bannedExpress=", ", restrictionWarning=", this.y, sbQ, this.x);
        sbQ.append(", finishedGame=");
        sbQ.append(this.z);
        sbQ.append(", eventSpecialBetType=");
        sbQ.append(this.A);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
