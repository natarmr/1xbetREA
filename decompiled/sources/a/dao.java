package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dao {
    public static final /* synthetic */ int t = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5759a;
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
    public final sh7 m;
    public final cao n;
    public final boolean o;
    public final boolean p;
    public final uoy q;
    public final boolean r;
    public final boolean s;

    static {
        new dao(0, 0L, 0L, 0.0d, 0L, 0.0d, "", false, "", "", "", "", new sh7(0L, ""), cao.f4021a, false, false, uoy.UNKNOWN, true, false);
    }

    public dao(int i, long j, long j2, double d, long j3, double d2, String str, boolean z, String str2, String str3, String str4, String str5, sh7 sh7Var, cao caoVar, boolean z2, boolean z3, uoy uoyVar, boolean z4, boolean z5) {
        str3.getClass();
        this.f5759a = i;
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
        this.m = sh7Var;
        this.n = caoVar;
        this.o = z2;
        this.p = z3;
        this.q = uoyVar;
        this.r = z4;
        this.s = z5;
    }

    public static dao a(dao daoVar, boolean z, boolean z2, int i) {
        cao caoVar = cao.f4021a;
        int i2 = daoVar.f5759a;
        long j = daoVar.b;
        long j2 = daoVar.c;
        double d = daoVar.d;
        long j3 = daoVar.e;
        double d2 = daoVar.f;
        String str = daoVar.g;
        boolean z3 = daoVar.h;
        String str2 = daoVar.i;
        String str3 = daoVar.j;
        String str4 = daoVar.k;
        String str5 = daoVar.l;
        sh7 sh7Var = daoVar.m;
        cao caoVar2 = (i & 8192) != 0 ? daoVar.n : caoVar;
        boolean z4 = (i & 16384) != 0 ? daoVar.o : z;
        boolean z5 = (i & 32768) != 0 ? daoVar.p : z2;
        uoy uoyVar = daoVar.q;
        boolean z6 = daoVar.r;
        boolean z7 = daoVar.s;
        daoVar.getClass();
        str3.getClass();
        return new dao(i2, j, j2, d, j3, d2, str, z3, str2, str3, str4, str5, sh7Var, caoVar2, z4, z5, uoyVar, z6, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dao)) {
            return false;
        }
        dao daoVar = (dao) obj;
        return this.f5759a == daoVar.f5759a && this.b == daoVar.b && this.c == daoVar.c && Double.compare(this.d, daoVar.d) == 0 && this.e == daoVar.e && Double.compare(this.f, daoVar.f) == 0 && this.g.equals(daoVar.g) && this.h == daoVar.h && this.i.equals(daoVar.i) && Intrinsics.d(this.j, daoVar.j) && this.k.equals(daoVar.k) && this.l.equals(daoVar.l) && this.m.equals(daoVar.m) && this.n == daoVar.n && this.o == daoVar.o && this.p == daoVar.p && this.q == daoVar.q && this.r == daoVar.r && this.s == daoVar.s;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.s) + brm0.e(twn.d(this.q, brm0.e(brm0.e((this.n.hashCode() + ((this.m.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(brm0.e(ua80.b(brm0.d(this.f, rw2.b(brm0.d(this.d, rw2.b(rw2.b(Integer.hashCode(this.f5759a) * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l)) * 31)) * 31, 31, this.o), 31, this.p), 31), 31, this.r);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f5759a, this.b, "EventBet(id=", ", marketTypeId=");
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
        sbQ.append(", coefColor=");
        sbQ.append(this.n);
        sbQ.append(", addedToCoupon=");
        sbQ.append(this.o);
        sbQ.append(", tracked=");
        sbQ.append(this.p);
        sbQ.append(", kind=");
        sbQ.append(this.q);
        w6x.A(", empty=", ", startingPrice=", sbQ, this.r, this.s);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
