package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jij {
    public final String A;
    public final zeo B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f16577a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final List h;
    public final List i;
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
    public final boolean y;
    public final String z;

    public jij(double d, String str, long j, String str2, String str3, int i, int i2, List list, List list2, long j2, long j3, String str4, String str5, String str6, String str7, long j4, long j5, long j6, long j7, double d2, long j8, long j9, String str8, String str9, boolean z, String str10, String str11, zeo zeoVar) {
        list.getClass();
        list2.getClass();
        this.f16577a = d;
        this.b = str;
        this.c = j;
        this.d = str2;
        this.e = str3;
        this.f = i;
        this.g = i2;
        this.h = list;
        this.i = list2;
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
        this.y = z;
        this.z = str10;
        this.A = str11;
        this.B = zeoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jij)) {
            return false;
        }
        jij jijVar = (jij) obj;
        return Double.compare(this.f16577a, jijVar.f16577a) == 0 && this.b.equals(jijVar.b) && this.c == jijVar.c && this.d.equals(jijVar.d) && this.e.equals(jijVar.e) && this.f == jijVar.f && this.g == jijVar.g && Intrinsics.d(this.h, jijVar.h) && Intrinsics.d(this.i, jijVar.i) && this.j == jijVar.j && this.k == jijVar.k && this.l.equals(jijVar.l) && this.m.equals(jijVar.m) && this.n.equals(jijVar.n) && this.o.equals(jijVar.o) && this.p == jijVar.p && this.q == jijVar.q && this.r == jijVar.r && this.s == jijVar.s && Double.compare(this.t, jijVar.t) == 0 && this.u == jijVar.u && this.v == jijVar.v && this.w.equals(jijVar.w) && this.x.equals(jijVar.x) && this.y == jijVar.y && this.z.equals(jijVar.z) && this.A.equals(jijVar.A) && this.B.equals(jijVar.B);
    }

    public final int hashCode() {
        return this.B.hashCode() + ua80.b(ua80.b(brm0.e(ua80.b(ua80.b(rw2.b(rw2.b(brm0.d(this.t, rw2.b(rw2.b(rw2.b(rw2.b(ua80.b(ua80.b(ua80.b(ua80.b(rw2.b(rw2.b(dw9.a(dw9.a(twn.a(this.g, twn.a(this.f, ua80.b(ua80.b(rw2.b(ua80.b(Double.hashCode(this.f16577a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A);
    }

    public final String toString() {
        StringBuilder sbS = vqd.s("DayExpressZipModel(coeff=", this.f16577a, ", coeffV=", this.b);
        kng0.A(sbS, ", betType=", this.c, ", teamOneName=");
        f140.v(sbS, this.d, ", teamTwoName=", this.e, ", teamOneScore=");
        axq.r(this.f, this.g, ", teamTwoScore=", ", teamOneImages=", sbS);
        b1j.y(", teamTwoImages=", ", timeStart=", sbS, this.h, this.i);
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
        w6x.z(", sportName=", this.x, ", live=", sbS, this.y);
        f140.v(sbS, ", gameType=", this.z, ", gameVid=", this.A);
        sbS.append(", eventParams=");
        sbS.append(this.B);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
