package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class jwe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17246a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final long j;
    public final double k;
    public final String l;
    public final String m;
    public final String n;
    public final int o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final long t;
    public final double u;
    public final uoy v;
    public final zfa0 w;
    public final String x;
    public final String y;
    public final yeo z;

    public jwe(long j, long j2, long j3, long j4, long j5, String str, String str2, String str3, String str4, long j6, double d, String str5, String str6, String str7, int i, String str8, String str9, String str10, String str11, long j7, double d2, uoy uoyVar, zfa0 zfa0Var, String str12, String str13, yeo yeoVar) {
        ohs0.z(str, str3, str6, str7, str9);
        str11.getClass();
        zfa0Var.getClass();
        str13.getClass();
        this.f17246a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = j6;
        this.k = d;
        this.l = str5;
        this.m = str6;
        this.n = str7;
        this.o = i;
        this.p = str8;
        this.q = str9;
        this.r = str10;
        this.s = str11;
        this.t = j7;
        this.u = d2;
        this.v = uoyVar;
        this.w = zfa0Var;
        this.x = str12;
        this.y = str13;
        this.z = yeoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwe)) {
            return false;
        }
        jwe jweVar = (jwe) obj;
        return this.f17246a == jweVar.f17246a && this.b == jweVar.b && this.c == jweVar.c && this.d == jweVar.d && this.e == jweVar.e && Intrinsics.d(this.f, jweVar.f) && this.g.equals(jweVar.g) && Intrinsics.d(this.h, jweVar.h) && this.i.equals(jweVar.i) && this.j == jweVar.j && Double.compare(this.k, jweVar.k) == 0 && this.l.equals(jweVar.l) && Intrinsics.d(this.m, jweVar.m) && Intrinsics.d(this.n, jweVar.n) && this.o == jweVar.o && this.p.equals(jweVar.p) && Intrinsics.d(this.q, jweVar.q) && this.r.equals(jweVar.r) && Intrinsics.d(this.s, jweVar.s) && this.t == jweVar.t && Double.compare(this.u, jweVar.u) == 0 && this.v == jweVar.v && Intrinsics.d(this.w, jweVar.w) && this.x.equals(jweVar.x) && Intrinsics.d(this.y, jweVar.y) && this.z.equals(jweVar.z);
    }

    public final int hashCode() {
        return this.z.hashCode() + ua80.b(ua80.b((this.w.hashCode() + twn.d(this.v, brm0.d(this.u, rw2.b(ua80.b(ua80.b(ua80.b(ua80.b(twn.a(this.o, ua80.b(ua80.b(ua80.b(brm0.d(this.k, rw2.b(ua80.b(ua80.b(ua80.b(ua80.b(rw2.b(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f17246a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31, this.l), 31, this.m), 31, this.n), 31), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31), 31)) * 31, 31, this.x), 31, this.y);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f17246a, "CouponEventModel(gameId=", ", mainGameId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", typeEventId=", this.c, ", sportId=");
        sbQ.append(this.d);
        kng0.A(sbQ, ", playerId=", this.e, ", playerName=");
        f140.v(sbQ, this.f, ", fullName=", this.g, ", champName=");
        f140.v(sbQ, this.h, ", betName=", this.i, ", groupId=");
        sbQ.append(this.j);
        ohs0.A(sbQ, this.k, ", param=", ", gameMatchName=");
        f140.v(sbQ, this.l, ", firstTeamName=", this.m, ", secondTeamName=");
        twn.w(this.o, this.n, ", playersNumber=", ", firstOpponentFirstImg=", sbQ);
        f140.v(sbQ, this.p, ", firstOpponentSecondImg=", this.q, ", secondOpponentFirstImg=");
        f140.v(sbQ, this.r, ", secondOpponentSecondImg=", this.s, ", timeStart=");
        sbQ.append(this.t);
        ohs0.A(sbQ, this.u, ", coef=", ", kind=");
        sbQ.append(this.v);
        sbQ.append(", playersDuelModel=");
        sbQ.append(this.w);
        sbQ.append(", gameType=");
        f140.v(sbQ, this.x, ", gameVidName=", this.y, ", eventParams=");
        sbQ.append(this.z);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
