package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class neo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23395a;
    public final long b;
    public final long c;
    public final uoy d;
    public final izc e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final String i;
    public final String j;
    public final double k;
    public final String l;
    public final double m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final long u;
    public final boolean v;
    public final boolean w;
    public final boolean x;

    public neo(long j, long j2, long j3, uoy uoyVar, izc izcVar, boolean z, boolean z2, long j4, String str, String str2, double d, String str3, double d2, String str4, String str5, String str6, String str7, boolean z3, boolean z4, boolean z5, long j5, boolean z6, boolean z7, boolean z8) {
        uoyVar.getClass();
        izcVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        cs0.x(str4, str5, str6, str7);
        this.f23395a = j;
        this.b = j2;
        this.c = j3;
        this.d = uoyVar;
        this.e = izcVar;
        this.f = z;
        this.g = z2;
        this.h = j4;
        this.i = str;
        this.j = str2;
        this.k = d;
        this.l = str3;
        this.m = d2;
        this.n = str4;
        this.o = str5;
        this.p = str6;
        this.q = str7;
        this.r = z3;
        this.s = z4;
        this.t = z5;
        this.u = j5;
        this.v = z6;
        this.w = z7;
        this.x = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof neo)) {
            return false;
        }
        neo neoVar = (neo) obj;
        return this.f23395a == neoVar.f23395a && this.b == neoVar.b && this.c == neoVar.c && this.d == neoVar.d && this.e == neoVar.e && this.f == neoVar.f && this.g == neoVar.g && this.h == neoVar.h && Intrinsics.d(this.i, neoVar.i) && Intrinsics.d(this.j, neoVar.j) && Double.compare(this.k, neoVar.k) == 0 && Intrinsics.d(this.l, neoVar.l) && Double.compare(this.m, neoVar.m) == 0 && Intrinsics.d(this.n, neoVar.n) && Intrinsics.d(this.o, neoVar.o) && Intrinsics.d(this.p, neoVar.p) && Intrinsics.d(this.q, neoVar.q) && this.r == neoVar.r && this.s == neoVar.s && this.t == neoVar.t && this.u == neoVar.u && this.v == neoVar.v && this.w == neoVar.w && this.x == neoVar.x;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.x) + brm0.e(brm0.e(rw2.b(brm0.e(brm0.e(brm0.e(ua80.b(ua80.b(ua80.b(ua80.b(brm0.d(this.m, ua80.b(brm0.d(this.k, ua80.b(ua80.b(rw2.b(brm0.e(brm0.e((this.e.hashCode() + twn.d(this.d, rw2.b(rw2.b(Long.hashCode(this.f23395a) * 31, 31, this.b), 31, this.c), 31)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31, this.l), 31), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f23395a, "EventMarketModel(betId=", ", groupId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", gameId=", this.c, ", kind=");
        sbQ.append(this.d);
        sbQ.append(", coefState=");
        sbQ.append(this.e);
        sbQ.append(", blocked=");
        ua80.u(", relation=", ", playerId=", sbQ, this.f, this.g);
        kng0.z(sbQ, this.h, ", playerName=", this.i);
        hne.B(sbQ, ", betParam=", this.j, ", param=");
        hne.w(sbQ, this.k, ", paramStr=", this.l);
        ohs0.A(sbQ, this.m, ", betCoef=", ", betCoefV=");
        f140.v(sbQ, this.n, ", coefViewName=", this.o, ", betName=");
        f140.v(sbQ, this.p, ", groupName=", this.q, ", startingPrice=");
        ua80.u(", isTracked=", ", finishedGame=", sbQ, this.r, this.s);
        rw2.v(this.u, ", sportId=", sbQ, this.t);
        w6x.A(", bannedExpress=", ", canMakeBet=", sbQ, this.v, this.w);
        return f140.n(sbQ, ", isInCoupon=", this.x, Separators.RPAREN);
    }
}
