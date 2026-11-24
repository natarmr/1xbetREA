package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vr20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37878a;
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
    public final uoy o;
    public final boolean p;
    public final int q;
    public final zfa0 r;
    public final boolean s;
    public final long t;

    public vr20(int i, long j, long j2, double d, long j3, double d2, String str, boolean z, String str2, String str3, String str4, String str5, rh7 rh7Var, ur20 ur20Var, uoy uoyVar, boolean z2, int i2, yfa0 yfa0Var, boolean z3, long j4) {
        str.getClass();
        str3.getClass();
        str5.getClass();
        yfa0Var.getClass();
        this.f37878a = i;
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
        this.o = uoyVar;
        this.p = z2;
        this.q = i2;
        this.r = yfa0Var;
        this.s = z3;
        this.t = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr20)) {
            return false;
        }
        vr20 vr20Var = (vr20) obj;
        return this.f37878a == vr20Var.f37878a && this.b == vr20Var.b && this.c == vr20Var.c && Double.compare(this.d, vr20Var.d) == 0 && this.e == vr20Var.e && Double.compare(this.f, vr20Var.f) == 0 && Intrinsics.d(this.g, vr20Var.g) && this.h == vr20Var.h && this.i.equals(vr20Var.i) && Intrinsics.d(this.j, vr20Var.j) && this.k.equals(vr20Var.k) && Intrinsics.d(this.l, vr20Var.l) && this.m.equals(vr20Var.m) && this.n == vr20Var.n && this.o == vr20Var.o && this.p == vr20Var.p && this.q == vr20Var.q && Intrinsics.d(this.r, vr20Var.r) && this.s == vr20Var.s && this.t == vr20Var.t;
    }

    public final int hashCode() {
        return Long.hashCode(this.t) + brm0.e((this.r.hashCode() + twn.a(this.q, brm0.e(twn.d(this.o, (this.n.hashCode() + ((this.m.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(brm0.e(ua80.b(brm0.d(this.f, rw2.b(brm0.d(this.d, rw2.b(rw2.b(Integer.hashCode(this.f37878a) * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l)) * 31)) * 31, 31), 31, this.p), 31)) * 31, 31, this.s);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f37878a, this.b, "MarketBetModel(id=", ", marketTypeId=");
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
        sbQ.append(", kind=");
        sbQ.append(this.o);
        cs0.v(this.q, ", startingPrice=", ", typeParam=", sbQ, this.p);
        sbQ.append(", playersDuel=");
        sbQ.append(this.r);
        sbQ.append(", specialSign=");
        sbQ.append(this.s);
        return rw2.n(sbQ, this.t, ", polybetRuleId=", Separators.RPAREN);
    }
}
