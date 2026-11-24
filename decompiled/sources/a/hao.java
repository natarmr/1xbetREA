package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12733a;
    public final long b;
    public final long c;
    public final double d;
    public final long e;
    public final double f;
    public final String g;
    public final boolean h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final rh7 m;
    public final ur20 n;
    public final boolean o;
    public final boolean p;
    public final uoy q;
    public final boolean r;
    public final int s;
    public final zfa0 t;
    public final boolean u;
    public final long v;
    public final uyc w;

    public hao(int i, long j, long j2, double d, long j3, double d2, String str, boolean z, String str2, String str3, String str4, String str5, rh7 rh7Var, ur20 ur20Var, boolean z2, boolean z3, uoy uoyVar, boolean z4, int i2, zfa0 zfa0Var, boolean z5, long j4, uyc uycVar) {
        str.getClass();
        str3.getClass();
        str5.getClass();
        zfa0Var.getClass();
        this.f12733a = i;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = j3;
        this.f = d2;
        this.g = str;
        this.h = z;
        this.i = str2;
        this.j = str3;
        this.k = str4;
        this.l = str5;
        this.m = rh7Var;
        this.n = ur20Var;
        this.o = z2;
        this.p = z3;
        this.q = uoyVar;
        this.r = z4;
        this.s = i2;
        this.t = zfa0Var;
        this.u = z5;
        this.v = j4;
        this.w = uycVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hao)) {
            return false;
        }
        hao haoVar = (hao) obj;
        return this.f12733a == haoVar.f12733a && this.b == haoVar.b && this.c == haoVar.c && Double.compare(this.d, haoVar.d) == 0 && this.e == haoVar.e && Double.compare(this.f, haoVar.f) == 0 && Intrinsics.d(this.g, haoVar.g) && this.h == haoVar.h && this.i.equals(haoVar.i) && Intrinsics.d(this.j, haoVar.j) && this.k.equals(haoVar.k) && Intrinsics.d(this.l, haoVar.l) && this.m.equals(haoVar.m) && this.n == haoVar.n && this.o == haoVar.o && this.p == haoVar.p && this.q == haoVar.q && this.r == haoVar.r && this.s == haoVar.s && Intrinsics.d(this.t, haoVar.t) && this.u == haoVar.u && this.v == haoVar.v && this.w == haoVar.w;
    }

    public final int hashCode() {
        return this.w.hashCode() + rw2.b(brm0.e((this.t.hashCode() + twn.a(this.s, brm0.e(twn.d(this.q, brm0.e(brm0.e((this.n.hashCode() + ((this.m.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(brm0.e(ua80.b(brm0.d(this.f, rw2.b(brm0.d(this.d, rw2.b(rw2.b(Integer.hashCode(this.f12733a) * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l)) * 31)) * 31, 31, this.o), 31, this.p), 31), 31, this.r), 31)) * 31, 31, this.u), 31, this.v);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f12733a, this.b, "EventBetModel(id=", ", marketTypeId=");
        kng0.A(sbQ, ", gameId=", this.c, ", coef=");
        sbQ.append(this.d);
        kng0.A(sbQ, ", marketGroupId=", this.e, ", param=");
        hne.w(sbQ, this.f, ", paramStr=", this.g);
        hne.u(", blocked=", ", coefV=", this.i, sbQ, this.h);
        f140.v(sbQ, ", coefViewName=", this.j, ", marketName=", this.k);
        sbQ.append(", eventName=");
        sbQ.append(this.l);
        sbQ.append(", player=");
        sbQ.append(this.m);
        sbQ.append(", coefType=");
        sbQ.append(this.n);
        sbQ.append(", addedToCoupon=");
        sbQ.append(this.o);
        sbQ.append(", tracked=");
        sbQ.append(this.p);
        sbQ.append(", kind=");
        sbQ.append(this.q);
        cs0.v(this.s, ", startingPrice=", ", typeParam=", sbQ, this.r);
        sbQ.append(", playersDuel=");
        sbQ.append(this.t);
        sbQ.append(", specialSign=");
        sbQ.append(this.u);
        kng0.A(sbQ, ", polybetRuleId=", this.v, ", coefAvailable=");
        sbQ.append(this.w);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
