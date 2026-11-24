package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z0w {
    public final String A;
    public final String B;
    public final String C;
    public final double D;
    public final boolean E;
    public final long F;
    public final long G;
    public final String H;
    public final int I;
    public final int J;
    public final double K;
    public final String L;
    public final String M;
    public final String N;
    public final List O;
    public final List P;
    public final String Q;
    public final String R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43588a;
    public final String b;
    public final int c;
    public final double d;
    public final String e;
    public final long f;
    public final boolean g;
    public final long h;
    public final long i;
    public final String j;
    public final w0w k;
    public final boolean l;
    public final String m;
    public final long n;
    public final List o;
    public final String p;
    public final long q;
    public final List r;
    public final String s;
    public final long t;
    public final String u;
    public final int v;
    public final String w;
    public final String x;
    public final long y;
    public final boolean z;

    public z0w(long j, String str, int i, double d, String str2, long j2, boolean z, long j3, long j4, String str3, w0w w0wVar, boolean z2, String str4, long j5, List list, String str5, long j6, List list2, String str6, long j7, String str7, int i2, String str8, String str9, long j8, boolean z3, String str10, String str11, String str12, double d2, boolean z4, long j9, long j10, String str13, int i3, int i4, double d3, String str14, String str15, String str16, List list3, List list4, String str17, String str18) {
        hne.C(list, list2, list3, list4);
        this.f43588a = j;
        this.b = str;
        this.c = i;
        this.d = d;
        this.e = str2;
        this.f = j2;
        this.g = z;
        this.h = j3;
        this.i = j4;
        this.j = str3;
        this.k = w0wVar;
        this.l = z2;
        this.m = str4;
        this.n = j5;
        this.o = list;
        this.p = str5;
        this.q = j6;
        this.r = list2;
        this.s = str6;
        this.t = j7;
        this.u = str7;
        this.v = i2;
        this.w = str8;
        this.x = str9;
        this.y = j8;
        this.z = z3;
        this.A = str10;
        this.B = str11;
        this.C = str12;
        this.D = d2;
        this.E = z4;
        this.F = j9;
        this.G = j10;
        this.H = str13;
        this.I = i3;
        this.J = i4;
        this.K = d3;
        this.L = str14;
        this.M = str15;
        this.N = str16;
        this.O = list3;
        this.P = list4;
        this.Q = str17;
        this.R = str18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0w)) {
            return false;
        }
        z0w z0wVar = (z0w) obj;
        return this.f43588a == z0wVar.f43588a && this.b.equals(z0wVar.b) && this.c == z0wVar.c && Double.compare(this.d, z0wVar.d) == 0 && this.e.equals(z0wVar.e) && this.f == z0wVar.f && this.g == z0wVar.g && this.h == z0wVar.h && this.i == z0wVar.i && this.j.equals(z0wVar.j) && this.k == z0wVar.k && this.l == z0wVar.l && this.m.equals(z0wVar.m) && this.n == z0wVar.n && Intrinsics.d(this.o, z0wVar.o) && this.p.equals(z0wVar.p) && this.q == z0wVar.q && Intrinsics.d(this.r, z0wVar.r) && this.s.equals(z0wVar.s) && this.t == z0wVar.t && this.u.equals(z0wVar.u) && this.v == z0wVar.v && this.w.equals(z0wVar.w) && this.x.equals(z0wVar.x) && this.y == z0wVar.y && this.z == z0wVar.z && this.A.equals(z0wVar.A) && this.B.equals(z0wVar.B) && this.C.equals(z0wVar.C) && Double.compare(this.D, z0wVar.D) == 0 && this.E == z0wVar.E && this.F == z0wVar.F && this.G == z0wVar.G && this.H.equals(z0wVar.H) && this.I == z0wVar.I && this.J == z0wVar.J && Double.compare(this.K, z0wVar.K) == 0 && this.L.equals(z0wVar.L) && this.M.equals(z0wVar.M) && this.N.equals(z0wVar.N) && Intrinsics.d(this.O, z0wVar.O) && Intrinsics.d(this.P, z0wVar.P) && this.Q.equals(z0wVar.Q) && this.R.equals(z0wVar.R);
    }

    public final int hashCode() {
        return this.R.hashCode() + ua80.b(dw9.a(dw9.a(ua80.b(ua80.b(ua80.b(brm0.d(this.K, twn.a(this.J, twn.a(this.I, ua80.b(rw2.b(rw2.b(brm0.e(brm0.d(this.D, ua80.b(ua80.b(ua80.b(brm0.e(rw2.b(ua80.b(ua80.b(twn.a(this.v, ua80.b(rw2.b(ua80.b(dw9.a(rw2.b(ua80.b(dw9.a(rw2.b(ua80.b(brm0.e((this.k.hashCode() + ua80.b(rw2.b(rw2.b(brm0.e(rw2.b(ua80.b(brm0.d(this.d, twn.a(this.c, ua80.b(Long.hashCode(this.f43588a) * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j)) * 31, 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, this.C), 31), 31, this.E), 31, this.F), 31, this.G), 31, this.H), 31), 31), 31), 31, this.L), 31, this.M), 31, this.N), 31, this.O), 31, this.P), 31, this.Q);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f43588a, "HistoryEventModel(champId=", ", champName=", this.b);
        rw2.x(sbO, ", globalChampId=", this.c, ", coefficient=");
        hne.w(sbO, this.d, ", coefficientString=", this.e);
        kng0.A(sbO, ", dateStart=", this.f, ", finish=");
        rw2.v(this.h, ", mainGameId=", sbO, this.g);
        kng0.A(sbO, ", gameId=", this.i, ", gameName=");
        sbO.append(this.j);
        sbO.append(", status=");
        sbO.append(this.k);
        sbO.append(", live=");
        f140.s(", teamOne=", this.m, ", teamOneId=", sbO, this.l);
        hne.x(sbO, this.n, ", teamOneImageList=", this.o);
        hne.B(sbO, ", teamSecond=", this.p, ", teamSecondId=");
        hne.x(sbO, this.q, ", teamSecondImageList=", this.r);
        hne.B(sbO, ", score=", this.s, ", sportId=");
        kng0.z(sbO, this.t, ", sportName=", this.u);
        w6x.w(this.v, ", typeEventId=", ", periodName=", this.w, sbO);
        hne.B(sbO, ", typeEventName=", this.x, ", liveTime=");
        hne.t(this.y, ", hasAlternativeInfo=", sbO, this.z);
        f140.v(sbO, ", additionalGameInfo=", this.A, ", gameVidName=", this.B);
        hne.B(sbO, ", gameTypeName=", this.C, ", betEventParam=");
        rz4.x(sbO, this.D, ", playersDuel=", this.E);
        kng0.A(sbO, ", groupId=", this.F, ", playerId=");
        kng0.z(sbO, this.G, ", playerName=", this.H);
        rw2.s(this.I, this.J, ", subSportId=", ", blockLevel=", sbO);
        ohs0.A(sbO, this.K, ", blockValue=", ", statId=");
        f140.v(sbO, this.L, ", eventStatus=", this.M, ", returnedBetEventReasonName=");
        cs0.y(this.N, ", eventParamsList=", ", eventParamsPlayerNames=", sbO, this.O);
        h97.y(", scoreOpponent1=", this.Q, ", scoreOpponent2=", sbO, this.P);
        return axq.n(sbO, this.R, Separators.RPAREN);
    }
}
