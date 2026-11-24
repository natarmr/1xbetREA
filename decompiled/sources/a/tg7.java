package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tg7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33895a;
    public final long b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final double o;
    public final String p;
    public final long q;
    public final String r;
    public final uoy s;
    public final long t;
    public final double u;
    public final long v;
    public final String w;
    public final long x;

    public tg7(long j, long j2, long j3, long j4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, double d, String str11, long j5, String str12, uoy uoyVar, long j6, double d2, long j7, String str13, long j8) {
        str8.getClass();
        str12.getClass();
        this.f33895a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = str8;
        this.m = str9;
        this.n = str10;
        this.o = d;
        this.p = str11;
        this.q = j5;
        this.r = str12;
        this.s = uoyVar;
        this.t = j6;
        this.u = d2;
        this.v = j7;
        this.w = str13;
        this.x = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg7)) {
            return false;
        }
        tg7 tg7Var = (tg7) obj;
        return this.f33895a == tg7Var.f33895a && this.b == tg7Var.b && this.c == tg7Var.c && this.d == tg7Var.d && this.e.equals(tg7Var.e) && this.f.equals(tg7Var.f) && this.g.equals(tg7Var.g) && this.h.equals(tg7Var.h) && this.i.equals(tg7Var.i) && this.j.equals(tg7Var.j) && this.k.equals(tg7Var.k) && Intrinsics.d(this.l, tg7Var.l) && this.m.equals(tg7Var.m) && this.n.equals(tg7Var.n) && Double.compare(this.o, tg7Var.o) == 0 && this.p.equals(tg7Var.p) && this.q == tg7Var.q && Intrinsics.d(this.r, tg7Var.r) && this.s == tg7Var.s && this.t == tg7Var.t && Double.compare(this.u, tg7Var.u) == 0 && this.v == tg7Var.v && this.w.equals(tg7Var.w) && this.x == tg7Var.x;
    }

    public final int hashCode() {
        return Long.hashCode(this.x) + ua80.b(rw2.b(brm0.d(this.u, rw2.b(twn.d(this.s, ua80.b(rw2.b(ua80.b(brm0.d(this.o, ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f33895a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31), 31, this.p), 31, this.q), 31, this.r), 31), 31, this.t), 31), 31, this.v), 31, this.w);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f33895a, "BetOnFavoriteEventModel(gameId=", ", mainGameId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", sportId=", this.c, ", subSportId=");
        kng0.z(sbQ, this.d, ", fullName=", this.e);
        f140.v(sbQ, ", firstOpponentFirstImg=", this.f, ", firstOpponentSecondImg=", this.g);
        f140.v(sbQ, ", firstOpponentName=", this.h, ", secondOpponentFirstImg=", this.i);
        f140.v(sbQ, ", secondOpponentSecondImg=", this.j, ", secondOpponentName=", this.k);
        f140.v(sbQ, ", groupName=", this.l, ", champName=", this.m);
        hne.B(sbQ, ", gameTypeName=", this.n, ", coefficient=");
        hne.w(sbQ, this.o, ", coefView=", this.p);
        kng0.A(sbQ, ", timeStart=", this.q, ", marketName=");
        sbQ.append(this.r);
        sbQ.append(", kind=");
        sbQ.append(this.s);
        sbQ.append(", type=");
        sbQ.append(this.t);
        ohs0.A(sbQ, this.u, ", parameter=", ", playerId=");
        kng0.z(sbQ, this.v, ", playerName=", this.w);
        return rw2.n(sbQ, this.x, ", groupId=", Separators.RPAREN);
    }
}
