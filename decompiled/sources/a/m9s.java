package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class m9s {
    public final long A;
    public final int B;
    public final boolean C;
    public final int D;
    public final String E;
    public final boolean F;
    public final String G;
    public final List H;
    public final cqg I;
    public final int J;
    public final boolean K;
    public final boh L;
    public final szj0 M;
    public final boolean N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21426a;
    public final long b;
    public final List c;
    public final List d;
    public final String e;
    public final String f;
    public final ka30 g;
    public final qqs h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final List m;
    public final List n;
    public final long o;
    public final long p;
    public final Long q;
    public final boolean r;
    public final boolean s;
    public final String t;
    public final String u;
    public final long v;
    public final long w;
    public final boolean x;
    public final sip y;
    public final String z;

    public m9s(long j, long j2, List list, List list2, String str, String str2, ka30 ka30Var, qqs qqsVar, String str3, String str4, String str5, String str6, List list3, List list4, long j3, long j4, Long l, boolean z, boolean z2, String str7, String str8, long j5, long j6, boolean z3, sip sipVar, String str9, long j7, int i, boolean z4, int i2, String str10, boolean z5, String str11, List list5, cqg cqgVar, int i3, boolean z6, boh bohVar, szj0 szj0Var, boolean z7) {
        list.getClass();
        list2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        this.f21426a = j;
        this.b = j2;
        this.c = list;
        this.d = list2;
        this.e = str;
        this.f = str2;
        this.g = ka30Var;
        this.h = qqsVar;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = str6;
        this.m = list3;
        this.n = list4;
        this.o = j3;
        this.p = j4;
        this.q = l;
        this.r = z;
        this.s = z2;
        this.t = str7;
        this.u = str8;
        this.v = j5;
        this.w = j6;
        this.x = z3;
        this.y = sipVar;
        this.z = str9;
        this.A = j7;
        this.B = i;
        this.C = z4;
        this.D = i2;
        this.E = str10;
        this.F = z5;
        this.G = str11;
        this.H = list5;
        this.I = cqgVar;
        this.J = i3;
        this.K = z6;
        this.L = bohVar;
        this.M = szj0Var;
        this.N = z7;
    }

    public static m9s a(m9s m9sVar, String str, ArrayList arrayList, int i, int i2) {
        long j = m9sVar.f21426a;
        long j2 = m9sVar.b;
        List list = m9sVar.c;
        List list2 = m9sVar.d;
        String str2 = (i & 16) != 0 ? m9sVar.e : str;
        String str3 = m9sVar.f;
        ka30 ka30Var = m9sVar.g;
        qqs qqsVar = m9sVar.h;
        String str4 = m9sVar.i;
        String str5 = m9sVar.j;
        String str6 = m9sVar.k;
        String str7 = m9sVar.l;
        List list3 = m9sVar.m;
        List list4 = m9sVar.n;
        long j3 = m9sVar.o;
        long j4 = m9sVar.p;
        Long l = m9sVar.q;
        boolean z = m9sVar.r;
        boolean z2 = m9sVar.s;
        String str8 = m9sVar.t;
        String str9 = m9sVar.u;
        long j5 = m9sVar.v;
        long j6 = m9sVar.w;
        boolean z3 = m9sVar.x;
        sip sipVar = m9sVar.y;
        String str10 = m9sVar.z;
        long j7 = m9sVar.A;
        int i3 = m9sVar.B;
        boolean z4 = m9sVar.C;
        int i4 = m9sVar.D;
        String str11 = m9sVar.E;
        boolean z5 = m9sVar.F;
        String str12 = m9sVar.G;
        List list5 = (i2 & 2) != 0 ? m9sVar.H : arrayList;
        cqg cqgVar = m9sVar.I;
        int i5 = m9sVar.J;
        boolean z6 = m9sVar.K;
        boh bohVar = m9sVar.L;
        szj0 szj0Var = m9sVar.M;
        boolean z7 = m9sVar.N;
        m9sVar.getClass();
        list.getClass();
        list2.getClass();
        str2.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        return new m9s(j, j2, list, list2, str2, str3, ka30Var, qqsVar, str4, str5, str6, str7, list3, list4, j3, j4, l, z, z2, str8, str9, j5, j6, z3, sipVar, str10, j7, i3, z4, i4, str11, z5, str12, list5, cqgVar, i5, z6, bohVar, szj0Var, z7);
    }

    public final boolean b() {
        return (StringsKt.W(this.u) || this.K) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9s)) {
            return false;
        }
        m9s m9sVar = (m9s) obj;
        return this.f21426a == m9sVar.f21426a && this.b == m9sVar.b && Intrinsics.d(this.c, m9sVar.c) && Intrinsics.d(this.d, m9sVar.d) && this.e.equals(m9sVar.e) && this.f.equals(m9sVar.f) && this.g.equals(m9sVar.g) && this.h.equals(m9sVar.h) && Intrinsics.d(this.i, m9sVar.i) && Intrinsics.d(this.j, m9sVar.j) && Intrinsics.d(this.k, m9sVar.k) && Intrinsics.d(this.l, m9sVar.l) && Intrinsics.d(this.m, m9sVar.m) && Intrinsics.d(this.n, m9sVar.n) && this.o == m9sVar.o && this.p == m9sVar.p && Intrinsics.d(this.q, m9sVar.q) && this.r == m9sVar.r && this.s == m9sVar.s && this.t.equals(m9sVar.t) && this.u.equals(m9sVar.u) && znq0.e(this.v, m9sVar.v) && znq0.e(this.w, m9sVar.w) && this.x == m9sVar.x && this.y == m9sVar.y && this.z.equals(m9sVar.z) && this.A == m9sVar.A && this.B == m9sVar.B && this.C == m9sVar.C && this.D == m9sVar.D && this.E.equals(m9sVar.E) && this.F == m9sVar.F && this.G.equals(m9sVar.G) && Intrinsics.d(this.H, m9sVar.H) && this.I.equals(m9sVar.I) && this.J == m9sVar.J && this.K == m9sVar.K && this.L == m9sVar.L && Intrinsics.d(this.M, m9sVar.M) && this.N == m9sVar.N;
    }

    public final int hashCode() {
        int iB = rw2.b(rw2.b(dw9.a(dw9.a(ua80.b(ua80.b(ua80.b(ua80.b((this.h.hashCode() + ua80.b(ua80.b(ua80.b(dw9.a(dw9.a(rw2.b(Long.hashCode(this.f21426a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g.f17945a)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p);
        Long l = this.q;
        int iHashCode = (this.L.hashCode() + brm0.e(twn.a(this.J, (this.I.hashCode() + dw9.a(ua80.b(brm0.e(ua80.b(twn.a(this.D, brm0.e(twn.a(this.B, rw2.b(ua80.b((this.y.hashCode() + brm0.e(rw2.b(rw2.b(ua80.b(ua80.b(brm0.e(brm0.e((iB + (l == null ? 0 : l.hashCode())) * 31, 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x)) * 31, 31, this.z), 31, this.A), 31), 31, this.C), 31), 31, this.E), 31, this.F), 31, this.G), 31, this.H)) * 31, 31), 31, this.K)) * 31;
        szj0 szj0Var = this.M;
        return Boolean.hashCode(this.N) + ((iHashCode + (szj0Var != null ? szj0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String strH = znq0.h(this.v);
        String strH2 = znq0.h(this.w);
        StringBuilder sbQ = kng0.q(this.f21426a, "GameDetailsModel(gameId=", ", constId=");
        hne.x(sbQ, this.b, ", teamOnePlayersIdsList=", this.c);
        sbQ.append(", teamTwoPlayersIdsList=");
        sbQ.append(this.d);
        sbQ.append(", fullName=");
        sbQ.append(this.e);
        sbQ.append(", champName=");
        sbQ.append(this.f);
        sbQ.append(", matchInfoModel=");
        sbQ.append(this.g);
        sbQ.append(", score=");
        sbQ.append(this.h);
        sbQ.append(", teamOneName=");
        sbQ.append(this.i);
        f140.v(sbQ, ", teamTwoName=", this.j, ", teamOneNameEng=", this.k);
        ua80.t(", teamTwoNameEng=", this.l, ", teamOneImageIdList=", sbQ, this.m);
        sbQ.append(", teamTwoImageIdList=");
        sbQ.append(this.n);
        sbQ.append(", sportId=");
        sbQ.append(this.o);
        kng0.A(sbQ, ", subSportId=", this.p, ", nextGameId=");
        sbQ.append(this.q);
        sbQ.append(", finished=");
        sbQ.append(this.r);
        sbQ.append(", subscriptionAvailable=");
        f140.s(", vid=", this.t, ", videoId=", sbQ, this.s);
        f140.v(sbQ, this.u, ", timeStart=", strH, ", timeBefore=");
        brm0.C(strH2, ", live=", ", feedKind=", sbQ, this.x);
        sbQ.append(this.y);
        sbQ.append(", sportName=");
        sbQ.append(this.z);
        sbQ.append(", champId=");
        ua80.v(sbQ, this.A, ", zoneId=", this.B);
        cs0.v(this.D, ", hasMarketsGraph=", ", hasStatistic=", sbQ, this.C);
        w6x.z(", dopInfo=", this.E, ", hasMarkets=", sbQ, this.F);
        ua80.t(", statId=", this.G, ", subGames=", sbQ, this.H);
        sbQ.append(", gameStatistic=");
        sbQ.append(this.I);
        sbQ.append(", timeMultiplier=");
        sbQ.append(this.J);
        sbQ.append(", isDuelChamp=");
        sbQ.append(this.K);
        sbQ.append(", cyberType=");
        sbQ.append(this.L);
        sbQ.append(", simulation=");
        sbQ.append(this.M);
        sbQ.append(", isHeadline=");
        sbQ.append(this.N);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
