package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bcs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2368a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final long i;
    public final String j;
    public final long k;
    public final String l;
    public final String m;
    public final String n;
    public final long o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final boolean v;
    public final String w;
    public final boolean x;

    public bcs0(long j, long j2, long j3, boolean z, long j4, String str, String str2, String str3, long j5, String str4, long j6, String str5, String str6, String str7, long j7, String str8, String str9, String str10, String str11, String str12, String str13, boolean z2, String str14, boolean z3) {
        ohs0.z(str, str2, str3, str4, str5);
        ohs0.z(str6, str8, str9, str11, str12);
        str13.getClass();
        str14.getClass();
        this.f2368a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = j5;
        this.j = str4;
        this.k = j6;
        this.l = str5;
        this.m = str6;
        this.n = str7;
        this.o = j7;
        this.p = str8;
        this.q = str9;
        this.r = str10;
        this.s = str11;
        this.t = str12;
        this.u = str13;
        this.v = z2;
        this.w = str14;
        this.x = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcs0)) {
            return false;
        }
        bcs0 bcs0Var = (bcs0) obj;
        return this.f2368a == bcs0Var.f2368a && this.b == bcs0Var.b && this.c == bcs0Var.c && this.d == bcs0Var.d && this.e == bcs0Var.e && Intrinsics.d(this.f, bcs0Var.f) && Intrinsics.d(this.g, bcs0Var.g) && Intrinsics.d(this.h, bcs0Var.h) && this.i == bcs0Var.i && Intrinsics.d(this.j, bcs0Var.j) && this.k == bcs0Var.k && Intrinsics.d(this.l, bcs0Var.l) && Intrinsics.d(this.m, bcs0Var.m) && this.n.equals(bcs0Var.n) && this.o == bcs0Var.o && Intrinsics.d(this.p, bcs0Var.p) && Intrinsics.d(this.q, bcs0Var.q) && this.r.equals(bcs0Var.r) && Intrinsics.d(this.s, bcs0Var.s) && Intrinsics.d(this.t, bcs0Var.t) && Intrinsics.d(this.u, bcs0Var.u) && this.v == bcs0Var.v && Intrinsics.d(this.w, bcs0Var.w) && this.x == bcs0Var.x;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.x) + ua80.b(brm0.e(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(rw2.b(ua80.b(ua80.b(ua80.b(rw2.b(ua80.b(rw2.b(ua80.b(ua80.b(ua80.b(rw2.b(brm0.e(rw2.b(rw2.b(Long.hashCode(this.f2368a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f2368a, "TrackGameInfoModel(id=", ", sportId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", subSportId=", this.c, ", live=");
        rw2.v(this.e, ", champId=", sbQ, this.d);
        f140.v(sbQ, ", champName=", this.f, ", matchName=", this.g);
        hne.B(sbQ, ", fullName=", this.h, ", timeStart=");
        kng0.z(sbQ, this.i, ", sportName=", this.j);
        kng0.A(sbQ, ", teamOneId=", this.k, ", teamOneName=");
        f140.v(sbQ, this.l, ", teamOneImageNew=", this.m, ", teamOneSecondImage=");
        defpackage.c.i(sbQ, this.o, this.n, ", teamTwoId=");
        f140.v(sbQ, ", teamTwoName=", this.p, ", teamTwoImageNew=", this.q);
        f140.v(sbQ, ", teamTwoSecondImage=", this.r, ", matchScore=", this.s);
        f140.v(sbQ, ", periodStr=", this.t, ", vid=", this.u);
        hne.u(", isFinished=", ", statGameId=", this.w, sbQ, this.v);
        return f140.n(sbQ, ", homeAwayFlag=", this.x, Separators.RPAREN);
    }
}
