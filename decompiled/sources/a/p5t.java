package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class p5t {
    public final iwm0 A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26422a;
    public final int b;
    public final long c;
    public final long d;
    public final String e;
    public final long f;
    public final int g;
    public final String h;
    public final String i;
    public final int j;
    public final String k;
    public final String l;
    public final boolean m;
    public final long n;
    public final int o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final sil0 s;
    public final d3n0 t;
    public final slz u;
    public final h280 v;
    public final h280 w;
    public final e480 x;
    public final na30 y;
    public final iv10 z;

    public p5t(long j, int i, long j2, long j3, String str, long j4, int i2, String str2, String str3, int i3, String str4, String str5, boolean z, long j5, int i4, boolean z2, boolean z3, boolean z4, sil0 sil0Var, d3n0 d3n0Var, slz slzVar, h280 h280Var, h280 h280Var2, e480 e480Var, na30 na30Var, iv10 iv10Var, iwm0 iwm0Var) {
        this.f26422a = j;
        this.b = i;
        this.c = j2;
        this.d = j3;
        this.e = str;
        this.f = j4;
        this.g = i2;
        this.h = str2;
        this.i = str3;
        this.j = i3;
        this.k = str4;
        this.l = str5;
        this.m = z;
        this.n = j5;
        this.o = i4;
        this.p = z2;
        this.q = z3;
        this.r = z4;
        this.s = sil0Var;
        this.t = d3n0Var;
        this.u = slzVar;
        this.v = h280Var;
        this.w = h280Var2;
        this.x = e480Var;
        this.y = na30Var;
        this.z = iv10Var;
        this.A = iwm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5t)) {
            return false;
        }
        p5t p5tVar = (p5t) obj;
        return this.f26422a == p5tVar.f26422a && this.b == p5tVar.b && this.c == p5tVar.c && this.d == p5tVar.d && this.e.equals(p5tVar.e) && this.f == p5tVar.f && this.g == p5tVar.g && this.h.equals(p5tVar.h) && this.i.equals(p5tVar.i) && this.j == p5tVar.j && this.k.equals(p5tVar.k) && this.l.equals(p5tVar.l) && this.m == p5tVar.m && this.n == p5tVar.n && this.o == p5tVar.o && this.p == p5tVar.p && this.q == p5tVar.q && this.r == p5tVar.r && this.s.equals(p5tVar.s) && this.t.equals(p5tVar.t) && this.u.equals(p5tVar.u) && this.v.equals(p5tVar.v) && this.w.equals(p5tVar.w) && this.x.equals(p5tVar.x) && this.y.equals(p5tVar.y) && this.z.equals(p5tVar.z) && this.A.equals(p5tVar.A);
    }

    public final int hashCode() {
        return this.A.hashCode() + ((this.z.hashCode() + ((this.y.hashCode() + ua80.b((this.w.hashCode() + ((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((this.s.hashCode() + brm0.e(brm0.e(brm0.e(twn.a(this.o, rw2.b(brm0.e(ua80.b(ua80.b(twn.a(this.j, ua80.b(ua80.b(twn.a(this.g, rw2.b(ua80.b(rw2.b(rw2.b(twn.a(this.b, Long.hashCode(this.f26422a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h), 31, this.i), 31), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31), 31, this.p), 31, this.q), 31, this.r)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.x.f7170a)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f26422a, "GamesForCouponModel(id=", ", num=");
        kng0.A(sbQ, ", mainGameId=", this.c, ", constId=");
        kng0.z(sbQ, this.d, ", fullName=", this.e);
        kng0.A(sbQ, ", startTs=", this.f, ", countryId=");
        kng0.w(this.g, ", gameTypeName=", this.h, ", dopInfo=", sbQ);
        twn.w(this.j, this.i, ", period=", ", periodName=", sbQ);
        f140.v(sbQ, this.k, ", gameVidName=", this.l, ", isFinal=");
        rw2.v(this.n, ", mainConstId=", sbQ, this.m);
        dw9.v(this.o, ", kind=", ", hasHeadToHead=", sbQ, this.p);
        w6x.A(", subscriptionAvailable=", ", nonStarted=", sbQ, this.q, this.r);
        sbQ.append(", sportModel=");
        sbQ.append(this.s);
        sbQ.append(", subSportModel=");
        sbQ.append(this.t);
        sbQ.append(", ligaModel=");
        sbQ.append(this.u);
        sbQ.append(", firstOpponentModel=");
        sbQ.append(this.v);
        sbQ.append(", secondOpponentModel=");
        sbQ.append(this.w);
        sbQ.append(", opponentsModel=");
        sbQ.append(this.x);
        sbQ.append(", matchInfoModel=");
        sbQ.append(this.y);
        sbQ.append(", mainGameScoresModel=");
        sbQ.append(this.z);
        sbQ.append(", subGameScoresModel=");
        sbQ.append(this.A);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
