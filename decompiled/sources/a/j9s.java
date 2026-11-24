package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j9s implements l9s {
    public final String A;
    public final long B;
    public final int C;
    public final boolean D;
    public final int E;
    public final String F;
    public final s9s G;
    public final long H;
    public final Long I;
    public final long J;
    public final boolean K;
    public final boolean L;
    public final String M;
    public final List N;
    public final List O;
    public final boolean P;
    public final boolean Q;
    public final pqs R;
    public final List S;
    public final boh T;
    public final boolean U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16154a;
    public final long b;
    public final List c;
    public final List d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final String k;
    public final String l;
    public final ma30 m;
    public final String n;
    public final String o;
    public final String p;
    public final List q;
    public final List r;
    public final long s;
    public final long t;
    public final boolean u;
    public final boolean v;
    public final String w;
    public final String x;
    public final long y;
    public final boolean z;

    public j9s(long j, long j2, List list, List list2, String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, ma30 ma30Var, String str7, String str8, String str9, List list3, List list4, long j3, long j4, boolean z3, boolean z4, String str10, String str11, long j5, boolean z5, String str12, long j6, int i, boolean z6, int i2, String str13, s9s s9sVar, long j7, Long l, long j8, boolean z7, boolean z8, String str14, List list5, List list6, boolean z9, boolean z10, pqs pqsVar, List list7, boh bohVar, boolean z11) {
        list.getClass();
        str8.getClass();
        str9.getClass();
        list3.getClass();
        list4.getClass();
        b1j.B(list5, list6, list7);
        this.f16154a = j;
        this.b = j2;
        this.c = list;
        this.d = list2;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = z;
        this.i = z2;
        this.j = str4;
        this.k = str5;
        this.l = str6;
        this.m = ma30Var;
        this.n = str7;
        this.o = str8;
        this.p = str9;
        this.q = list3;
        this.r = list4;
        this.s = j3;
        this.t = j4;
        this.u = z3;
        this.v = z4;
        this.w = str10;
        this.x = str11;
        this.y = j5;
        this.z = z5;
        this.A = str12;
        this.B = j6;
        this.C = i;
        this.D = z6;
        this.E = i2;
        this.F = str13;
        this.G = s9sVar;
        this.H = j7;
        this.I = l;
        this.J = j8;
        this.K = z7;
        this.L = z8;
        this.M = str14;
        this.N = list5;
        this.O = list6;
        this.P = z9;
        this.Q = z10;
        this.R = pqsVar;
        this.S = list7;
        this.T = bohVar;
        this.U = z11;
    }

    @Override // a.l9s
    public final boh A() {
        return this.T;
    }

    @Override // a.l9s
    public final Long B() {
        return this.I;
    }

    @Override // a.l9s
    public final long C() {
        return this.b;
    }

    @Override // a.l9s
    public final String D() {
        return this.e;
    }

    @Override // a.l9s
    public final boolean E() {
        return this.u;
    }

    @Override // a.l9s
    public final List F() {
        return this.N;
    }

    @Override // a.l9s
    public final List G() {
        return this.q;
    }

    @Override // a.l9s
    public final boolean H() {
        return this.v;
    }

    @Override // a.l9s
    public final boolean I() {
        return this.P;
    }

    @Override // a.l9s
    public final boolean J() {
        return this.K;
    }

    @Override // a.l9s
    public final String L() {
        return this.w;
    }

    @Override // a.l9s
    public final String M() {
        return this.f;
    }

    @Override // a.l9s
    public final String N() {
        return this.A;
    }

    @Override // a.l9s
    public final List P() {
        return this.O;
    }

    @Override // a.l9s
    public final String Q() {
        return this.x;
    }

    @Override // a.l9s
    public final long R() {
        return this.J;
    }

    @Override // a.l9s
    public final boolean S() {
        return this.U;
    }

    @Override // a.l9s
    public final boolean T() {
        return this.i;
    }

    @Override // a.l9s
    public final List U() {
        return this.S;
    }

    @Override // a.l9s
    public final long a() {
        return this.f16154a;
    }

    @Override // a.l9s
    public final long b() {
        return this.B;
    }

    @Override // a.l9s
    public final long c() {
        return this.s;
    }

    @Override // a.l9s
    public final long d() {
        return this.t;
    }

    @Override // a.l9s
    public final boolean e() {
        return this.z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9s)) {
            return false;
        }
        j9s j9sVar = (j9s) obj;
        return this.f16154a == j9sVar.f16154a && this.b == j9sVar.b && Intrinsics.d(this.c, j9sVar.c) && this.d.equals(j9sVar.d) && Intrinsics.d(this.e, j9sVar.e) && this.f.equals(j9sVar.f) && this.g.equals(j9sVar.g) && this.h == j9sVar.h && this.i == j9sVar.i && this.j.equals(j9sVar.j) && this.k.equals(j9sVar.k) && this.l.equals(j9sVar.l) && this.m.equals(j9sVar.m) && this.n.equals(j9sVar.n) && Intrinsics.d(this.o, j9sVar.o) && Intrinsics.d(this.p, j9sVar.p) && Intrinsics.d(this.q, j9sVar.q) && Intrinsics.d(this.r, j9sVar.r) && this.s == j9sVar.s && this.t == j9sVar.t && this.u == j9sVar.u && this.v == j9sVar.v && this.w.equals(j9sVar.w) && this.x.equals(j9sVar.x) && znq0.e(this.y, j9sVar.y) && this.z == j9sVar.z && this.A.equals(j9sVar.A) && this.B == j9sVar.B && this.C == j9sVar.C && this.D == j9sVar.D && this.E == j9sVar.E && this.F.equals(j9sVar.F) && this.G == j9sVar.G && this.H == j9sVar.H && Intrinsics.d(this.I, j9sVar.I) && znq0.e(this.J, j9sVar.J) && this.K == j9sVar.K && this.L == j9sVar.L && this.M.equals(j9sVar.M) && Intrinsics.d(this.N, j9sVar.N) && Intrinsics.d(this.O, j9sVar.O) && this.P == j9sVar.P && this.Q == j9sVar.Q && Intrinsics.d(this.R, j9sVar.R) && Intrinsics.d(this.S, j9sVar.S) && this.T == j9sVar.T && this.U == j9sVar.U;
    }

    @Override // a.l9s
    public final String f() {
        return this.M;
    }

    @Override // a.l9s
    public final String g() {
        return this.p;
    }

    @Override // a.l9s
    public final s9s getType() {
        return this.G;
    }

    @Override // a.l9s
    public final String h() {
        return this.n;
    }

    public final int hashCode() {
        int iA = dw9.a(dw9.a(rw2.b(Long.hashCode(this.f16154a) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iB = rw2.b((this.G.hashCode() + ua80.b(twn.a(this.E, brm0.e(twn.a(this.C, rw2.b(ua80.b(brm0.e(rw2.b(ua80.b(ua80.b(brm0.e(brm0.e(rw2.b(rw2.b(dw9.a(dw9.a(ua80.b(ua80.b(ua80.b((this.m.hashCode() + ua80.b(ua80.b(ua80.b(brm0.e(brm0.e(ua80.b(ua80.b((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l)) * 31, 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31), 31, this.D), 31), 31, this.F)) * 31, 31, this.H);
        Long l = this.I;
        int iE = brm0.e(brm0.e(dw9.a(dw9.a(ua80.b(brm0.e(brm0.e(rw2.b((iB + (l == null ? 0 : l.hashCode())) * 31, 31, this.J), 31, this.K), 31, this.L), 31, this.M), 31, this.N), 31, this.O), 31, this.P), 31, this.Q);
        pqs pqsVar = this.R;
        return Boolean.hashCode(this.U) + ((this.T.hashCode() + dw9.a((iE + (pqsVar != null ? pqsVar.hashCode() : 0)) * 31, 31, this.S)) * 31);
    }

    @Override // a.l9s
    public final String i() {
        return this.g;
    }

    @Override // a.l9s
    public final String j() {
        return this.o;
    }

    @Override // a.l9s
    public final long k() {
        return this.H;
    }

    @Override // a.l9s
    public final boolean l() {
        return this.D;
    }

    @Override // a.l9s
    public final List m() {
        return this.d;
    }

    @Override // a.l9s
    public final int n() {
        return this.C;
    }

    @Override // a.l9s
    public final String o() {
        return this.j;
    }

    @Override // a.l9s
    public final List p() {
        return this.c;
    }

    @Override // a.l9s
    public final int q() {
        return this.E;
    }

    @Override // a.l9s
    public final String r() {
        return this.l;
    }

    @Override // a.l9s
    public final boolean t() {
        return this.Q;
    }

    public final String toString() {
        String strH = znq0.h(this.y);
        String strH2 = znq0.h(this.J);
        StringBuilder sbQ = kng0.q(this.f16154a, "BetBuilder(gameId=", ", constId=");
        hne.x(sbQ, this.b, ", teamOnePlayersIdsList=", this.c);
        sbQ.append(", teamTwoPlayersIdsList=");
        sbQ.append(this.d);
        sbQ.append(", fullName=");
        sbQ.append(this.e);
        f140.v(sbQ, ", mainFullName=", this.f, ", statGameId=", this.g);
        w6x.A(", hasStadiumInfo=", ", hasReviewEvents=", sbQ, this.h, this.i);
        f140.v(sbQ, ", champName=", this.j, ", champImage=", this.k);
        sbQ.append(", individualImage=");
        sbQ.append(this.l);
        sbQ.append(", matchInfoModel=");
        sbQ.append(this.m);
        f140.v(sbQ, ", fullScoreStr=", this.n, ", teamOneName=", this.o);
        ua80.t(", teamTwoName=", this.p, ", teamOneImageIdList=", sbQ, this.q);
        sbQ.append(", teamTwoImageIdList=");
        sbQ.append(this.r);
        sbQ.append(", sportId=");
        sbQ.append(this.s);
        kng0.A(sbQ, ", subSportId=", this.t, ", finished=");
        ua80.u(", subscriptionAvailable=", ", vid=", sbQ, this.u, this.v);
        f140.v(sbQ, this.w, ", videoId=", this.x, ", timeStart=");
        brm0.C(strH, ", live=", ", sportName=", sbQ, this.z);
        defpackage.c.i(sbQ, this.B, this.A, ", champId=");
        dw9.v(this.C, ", zoneId=", ", hasLineStatistic=", sbQ, this.D);
        w6x.w(this.E, ", hasStatistic=", ", extraInfo=", this.F, sbQ);
        sbQ.append(", type=");
        sbQ.append(this.G);
        sbQ.append(", specialEventId=");
        sbQ.append(this.H);
        sbQ.append(", stadiumId=");
        sbQ.append(this.I);
        w6x.z(", timePassed=", strH2, ", timeBackDirection=", sbQ, this.K);
        hne.u(", timeRun=", ", dopInfo=", this.M, sbQ, this.L);
        hne.v(", statistic=", ", tabloStatistic=", sbQ, this.N, this.O);
        w6x.A(", matchIsBreak=", ", isMainGame=", sbQ, this.P, this.Q);
        sbQ.append(", gameScoreModel=");
        sbQ.append(this.R);
        sbQ.append(", shortStatisticList=");
        sbQ.append(this.S);
        sbQ.append(", cyberType=");
        sbQ.append(this.T);
        sbQ.append(", nonStarted=");
        sbQ.append(this.U);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    @Override // a.l9s
    public final long u() {
        return this.y;
    }

    @Override // a.l9s
    public final List v() {
        return this.r;
    }

    @Override // a.l9s
    public final String w() {
        return this.F;
    }

    @Override // a.l9s
    public final boolean x() {
        return this.L;
    }

    @Override // a.l9s
    public final ma30 y() {
        return this.m;
    }

    @Override // a.l9s
    public final pqs z() {
        return this.R;
    }
}
