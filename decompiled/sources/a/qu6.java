package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class qu6 {
    public final int A;
    public final long B;
    public final double C;
    public final String D;
    public final int E;
    public final ic9 F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29333a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final long r;
    public final String s;
    public final double t;
    public final tv6 u;
    public final String v;
    public final uoy w;
    public final long x;
    public final zfa0 y;
    public final gwe z;

    public qu6(long j, long j2, long j3, long j4, long j5, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, long j6, String str13, double d, tv6 tv6Var, String str14, uoy uoyVar, long j7, zfa0 zfa0Var, gwe gweVar, int i, long j8, double d2, String str15, int i2, ic9 ic9Var) {
        ohs0.z(str, str2, str3, str4, str5);
        ohs0.z(str6, str7, str8, str9, str10);
        str11.getClass();
        str12.getClass();
        str13.getClass();
        str14.getClass();
        uoyVar.getClass();
        zfa0Var.getClass();
        gweVar.getClass();
        str15.getClass();
        this.f29333a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = str8;
        this.n = str9;
        this.o = str10;
        this.p = str11;
        this.q = str12;
        this.r = j6;
        this.s = str13;
        this.t = d;
        this.u = tv6Var;
        this.v = str14;
        this.w = uoyVar;
        this.x = j7;
        this.y = zfa0Var;
        this.z = gweVar;
        this.A = i;
        this.B = j8;
        this.C = d2;
        this.D = str15;
        this.E = i2;
        this.F = ic9Var;
    }

    public static qu6 a(qu6 qu6Var, long j, long j2, long j3, String str, String str2, String str3, String str4, String str5, double d, uoy uoyVar, long j4, zfa0 zfa0Var, int i, ic9 ic9Var, int i2) {
        long j5 = (i2 & 1) != 0 ? qu6Var.f29333a : j;
        long j6 = (i2 & 2) != 0 ? qu6Var.b : j2;
        long j7 = qu6Var.c;
        long j8 = (i2 & 8) != 0 ? qu6Var.d : j3;
        long j9 = qu6Var.e;
        String str6 = qu6Var.f;
        String str7 = qu6Var.g;
        String str8 = qu6Var.h;
        String str9 = qu6Var.i;
        String str10 = (i2 & 512) != 0 ? qu6Var.j : str;
        String str11 = qu6Var.k;
        String str12 = qu6Var.l;
        long j10 = j5;
        String str13 = (i2 & 4096) != 0 ? qu6Var.m : str2;
        String str14 = (i2 & 8192) != 0 ? qu6Var.n : str3;
        long j11 = j6;
        String str15 = (i2 & 16384) != 0 ? qu6Var.o : str4;
        String str16 = qu6Var.p;
        String str17 = qu6Var.q;
        long j12 = qu6Var.r;
        String str18 = (i2 & 262144) != 0 ? qu6Var.s : str5;
        long j13 = j8;
        double d2 = (i2 & 524288) != 0 ? qu6Var.t : d;
        tv6 tv6Var = qu6Var.u;
        String str19 = qu6Var.v;
        uoy uoyVar2 = (i2 & 4194304) != 0 ? qu6Var.w : uoyVar;
        long j14 = (i2 & 8388608) != 0 ? qu6Var.x : j4;
        zfa0 zfa0Var2 = (i2 & 16777216) != 0 ? qu6Var.y : zfa0Var;
        gwe gweVar = qu6Var.z;
        int i3 = (i2 & 67108864) != 0 ? qu6Var.A : i;
        long j15 = qu6Var.B;
        double d3 = qu6Var.C;
        String str20 = qu6Var.D;
        int i4 = qu6Var.E;
        ic9 ic9Var2 = (i2 & Integer.MIN_VALUE) != 0 ? qu6Var.F : ic9Var;
        qu6Var.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        ohs0.z(str10, str11, str12, str13, str14);
        ohs0.z(str15, str16, str17, str18, str19);
        uoyVar2.getClass();
        zfa0Var2.getClass();
        gweVar.getClass();
        str20.getClass();
        return new qu6(j10, j11, j7, j13, j9, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, j12, str18, d2, tv6Var, str19, uoyVar2, j14, zfa0Var2, gweVar, i3, j15, d3, str20, i4, ic9Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu6)) {
            return false;
        }
        qu6 qu6Var = (qu6) obj;
        return this.f29333a == qu6Var.f29333a && this.b == qu6Var.b && this.c == qu6Var.c && this.d == qu6Var.d && this.e == qu6Var.e && Intrinsics.d(this.f, qu6Var.f) && Intrinsics.d(this.g, qu6Var.g) && Intrinsics.d(this.h, qu6Var.h) && Intrinsics.d(this.i, qu6Var.i) && Intrinsics.d(this.j, qu6Var.j) && Intrinsics.d(this.k, qu6Var.k) && Intrinsics.d(this.l, qu6Var.l) && Intrinsics.d(this.m, qu6Var.m) && Intrinsics.d(this.n, qu6Var.n) && Intrinsics.d(this.o, qu6Var.o) && Intrinsics.d(this.p, qu6Var.p) && Intrinsics.d(this.q, qu6Var.q) && this.r == qu6Var.r && Intrinsics.d(this.s, qu6Var.s) && Double.compare(this.t, qu6Var.t) == 0 && this.u.equals(qu6Var.u) && Intrinsics.d(this.v, qu6Var.v) && this.w == qu6Var.w && this.x == qu6Var.x && Intrinsics.d(this.y, qu6Var.y) && this.z == qu6Var.z && this.A == qu6Var.A && this.B == qu6Var.B && Double.compare(this.C, qu6Var.C) == 0 && Intrinsics.d(this.D, qu6Var.D) && this.E == qu6Var.E && this.F.equals(qu6Var.F);
    }

    public final int hashCode() {
        return this.F.hashCode() + twn.a(this.E, ua80.b(brm0.d(this.C, rw2.b(twn.a(this.A, (this.z.hashCode() + ((this.y.hashCode() + rw2.b(twn.d(this.w, ua80.b((this.u.hashCode() + brm0.d(this.t, ua80.b(rw2.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(rw2.b(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f29333a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31)) * 31, 31, this.v), 31), 31, this.x)) * 31)) * 31, 31), 31, this.B), 31), 31, this.D), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f29333a, "BetEventEntityModel(id=", ", gameId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", mainGameId=", this.c, ", playerId=");
        sbQ.append(this.d);
        kng0.A(sbQ, ", sportId=", this.e, ", playerName=");
        f140.v(sbQ, this.f, ", gameMatchName=", this.g, ", firstOpponentFirstImg=");
        f140.v(sbQ, this.h, ", firstOpponentSecondImg=", this.i, ", firstOpponentName=");
        f140.v(sbQ, this.j, ", secondOpponentFirstImg=", this.k, ", secondOpponentSecondImg=");
        f140.v(sbQ, this.l, ", secondOpponentName=", this.m, ", opponentsFullName=");
        f140.v(sbQ, this.n, ", tournamentStage=", this.o, ", groupName=");
        f140.v(sbQ, this.p, ", champName=", this.q, ", expressNumber=");
        kng0.z(sbQ, this.r, ", coefficient=", this.s);
        ohs0.A(sbQ, this.t, ", param=", ", subtitle=");
        sbQ.append(this.u);
        sbQ.append(", name=");
        sbQ.append(this.v);
        sbQ.append(", kind=");
        sbQ.append(this.w);
        sbQ.append(", type=");
        sbQ.append(this.x);
        sbQ.append(", playersDuel=");
        sbQ.append(this.y);
        sbQ.append(", couponEntryFeature=");
        sbQ.append(this.z);
        rw2.x(sbQ, ", playersNumber=", this.A, ", groupId=");
        sbQ.append(this.B);
        ohs0.A(sbQ, this.C, ", optionLowerCf=", ", optionLowerCfView=");
        twn.w(this.E, this.D, ", couponTypeVid=", ", builderInfo=", sbQ);
        sbQ.append(this.F);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
