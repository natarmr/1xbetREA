package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ap2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1229a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;
    public final String h;
    public final String i;
    public final long j;
    public final String k;
    public final String l;
    public final boolean m;
    public final boolean n;
    public final String o;
    public final String p;
    public final boolean q;
    public final int r;
    public final int s;

    public ap2(long j, long j2, long j3, String str, String str2, String str3, long j4, String str4, String str5, long j5, String str6, String str7, boolean z, boolean z2, String str8, String str9, boolean z3, int i, int i2) {
        this.f1229a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = j4;
        this.h = str4;
        this.i = str5;
        this.j = j5;
        this.k = str6;
        this.l = str7;
        this.m = z;
        this.n = z2;
        this.o = str8;
        this.p = str9;
        this.q = z3;
        this.r = i;
        this.s = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap2)) {
            return false;
        }
        ap2 ap2Var = (ap2) obj;
        return this.f1229a == ap2Var.f1229a && this.b == ap2Var.b && this.c == ap2Var.c && this.d.equals(ap2Var.d) && this.e.equals(ap2Var.e) && this.f.equals(ap2Var.f) && this.g == ap2Var.g && this.h.equals(ap2Var.h) && this.i.equals(ap2Var.i) && this.j == ap2Var.j && this.k.equals(ap2Var.k) && this.l.equals(ap2Var.l) && this.m == ap2Var.m && this.n == ap2Var.n && this.o.equals(ap2Var.o) && this.p.equals(ap2Var.p) && this.q == ap2Var.q && this.r == ap2Var.r && this.s == ap2Var.s;
    }

    public final int hashCode() {
        return Integer.hashCode(this.s) + twn.a(this.r, brm0.e(ua80.b(ua80.b(brm0.e(brm0.e(ua80.b(ua80.b(rw2.b(ua80.b(ua80.b(rw2.b(ua80.b(ua80.b(ua80.b(rw2.b(rw2.b(Long.hashCode(this.f1229a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f1229a, "AlternativeInfoUiModel(sport=", ", champId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", gameId=", this.c, ", champImage=");
        f140.v(sbQ, this.d, ", champName=", this.e, ", gameName=");
        defpackage.c.i(sbQ, this.g, this.f, ", firstTeamId=");
        f140.v(sbQ, ", firstTeamName=", this.h, ", firstTeamImageUrl=", this.i);
        kng0.A(sbQ, ", secondTeamId=", this.j, ", secondTeamName=");
        f140.v(sbQ, this.k, ", secondTeamImageUrl=", this.l, ", isFinished=");
        ua80.u(", canShowScore=", ", score=", sbQ, this.m, this.n);
        f140.v(sbQ, this.o, ", timeInfo=", this.p, ", timeInfoVisibility=");
        ua80.q(this.r, ", oppNumber=", ", teamNumber=", sbQ, this.q);
        return rz4.j(this.s, Separators.RPAREN, sbQ);
    }
}
