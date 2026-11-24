package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qhj {
    public final boolean A;
    public final String B;
    public final String C;
    public final zeo D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f28742a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;
    public final int h;
    public final int i;
    public final long j;
    public final long k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final long p;
    public final long q;
    public final long r;
    public final long s;
    public final double t;
    public final long u;
    public final long v;
    public final String w;
    public final String x;
    public final String y;
    public final boolean z;

    public qhj(double d, String str, long j, String str2, String str3, List list, List list2, int i, int i2, long j2, long j3, String str4, String str5, String str6, String str7, long j4, long j5, long j6, long j7, double d2, long j8, long j9, String str8, String str9, String str10, boolean z, boolean z2, String str11, String str12, zeo zeoVar) {
        list.getClass();
        list2.getClass();
        str10.getClass();
        this.f28742a = d;
        this.b = str;
        this.c = j;
        this.d = str2;
        this.e = str3;
        this.f = list;
        this.g = list2;
        this.h = i;
        this.i = i2;
        this.j = j2;
        this.k = j3;
        this.l = str4;
        this.m = str5;
        this.n = str6;
        this.o = str7;
        this.p = j4;
        this.q = j5;
        this.r = j6;
        this.s = j7;
        this.t = d2;
        this.u = j8;
        this.v = j9;
        this.w = str8;
        this.x = str9;
        this.y = str10;
        this.z = z;
        this.A = z2;
        this.B = str11;
        this.C = str12;
        this.D = zeoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhj)) {
            return false;
        }
        qhj qhjVar = (qhj) obj;
        return Double.compare(this.f28742a, qhjVar.f28742a) == 0 && this.b.equals(qhjVar.b) && this.c == qhjVar.c && this.d.equals(qhjVar.d) && this.e.equals(qhjVar.e) && Intrinsics.d(this.f, qhjVar.f) && Intrinsics.d(this.g, qhjVar.g) && this.h == qhjVar.h && this.i == qhjVar.i && this.j == qhjVar.j && this.k == qhjVar.k && this.l.equals(qhjVar.l) && this.m.equals(qhjVar.m) && this.n.equals(qhjVar.n) && this.o.equals(qhjVar.o) && this.p == qhjVar.p && this.q == qhjVar.q && this.r == qhjVar.r && this.s == qhjVar.s && Double.compare(this.t, qhjVar.t) == 0 && this.u == qhjVar.u && this.v == qhjVar.v && this.w.equals(qhjVar.w) && this.x.equals(qhjVar.x) && Intrinsics.d(this.y, qhjVar.y) && this.z == qhjVar.z && this.A == qhjVar.A && this.B.equals(qhjVar.B) && this.C.equals(qhjVar.C) && this.D.equals(qhjVar.D);
    }

    public final int hashCode() {
        return this.D.hashCode() + ua80.b(ua80.b(brm0.e(brm0.e(ua80.b(ua80.b(ua80.b(rw2.b(rw2.b(brm0.d(this.t, rw2.b(rw2.b(rw2.b(rw2.b(ua80.b(ua80.b(ua80.b(ua80.b(rw2.b(rw2.b(twn.a(this.i, twn.a(this.h, dw9.a(dw9.a(ua80.b(ua80.b(rw2.b(ua80.b(Double.hashCode(this.f28742a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), 31), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, this.C);
    }

    public final String toString() {
        StringBuilder sbS = vqd.s("DayExpressModel(coeff=", this.f28742a, ", coeffV=", this.b);
        kng0.A(sbS, ", betType=", this.c, ", teamOneName=");
        f140.v(sbS, this.d, ", teamTwoName=", this.e, ", firstTeamImages=");
        b1j.y(", secondTeamImages=", ", teamOneScore=", sbS, this.f, this.g);
        axq.r(this.h, this.i, ", teamTwoScore=", ", timeStart=", sbS);
        sbS.append(this.j);
        kng0.A(sbS, ", timePassed=", this.k, ", champName=");
        f140.v(sbS, this.l, ", betName=", this.m, ", periodName=");
        f140.v(sbS, this.n, ", currentPeriodName=", this.o, ", gameId=");
        sbS.append(this.p);
        kng0.A(sbS, ", mainGameId=", this.q, ", sportId=");
        sbS.append(this.r);
        kng0.A(sbS, ", expressNum=", this.s, ", betEventParam=");
        sbS.append(this.t);
        kng0.A(sbS, ", betEventGroupId=", this.u, ", playerId=");
        kng0.z(sbS, this.v, ", playerName=", this.w);
        f140.v(sbS, ", sportName=", this.x, ", matchName=", this.y);
        w6x.A(", betTypeIsDecimal=", ", live=", sbS, this.z, this.A);
        f140.v(sbS, ", gameType=", this.B, ", gameVid=", this.C);
        sbS.append(", eventParams=");
        sbS.append(this.D);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
