package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ig7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14722a;
    public final long b;
    public final long c;
    public final double d;
    public final long e;
    public final double f;
    public final String g;
    public final boolean h;
    public final String i;
    public final String j;
    public final rh7 k;
    public final uoy l;
    public final boolean m;
    public final zfa0 n;
    public final boolean o;
    public final long p;
    public final afo q;

    public ig7(int i, long j, long j2, double d, long j3, double d2, String str, boolean z, String str2, String str3, rh7 rh7Var, uoy uoyVar, boolean z2, yfa0 yfa0Var, boolean z3, long j4, afo afoVar) {
        str.getClass();
        str3.getClass();
        yfa0Var.getClass();
        this.f14722a = i;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = j3;
        this.f = d2;
        this.g = str;
        this.h = z;
        this.i = str2;
        this.j = str3;
        this.k = rh7Var;
        this.l = uoyVar;
        this.m = z2;
        this.n = yfa0Var;
        this.o = z3;
        this.p = j4;
        this.q = afoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig7)) {
            return false;
        }
        ig7 ig7Var = (ig7) obj;
        return this.f14722a == ig7Var.f14722a && this.b == ig7Var.b && this.c == ig7Var.c && Double.compare(this.d, ig7Var.d) == 0 && this.e == ig7Var.e && Double.compare(this.f, ig7Var.f) == 0 && Intrinsics.d(this.g, ig7Var.g) && this.h == ig7Var.h && this.i.equals(ig7Var.i) && Intrinsics.d(this.j, ig7Var.j) && this.k.equals(ig7Var.k) && this.l == ig7Var.l && this.m == ig7Var.m && Intrinsics.d(this.n, ig7Var.n) && this.o == ig7Var.o && this.p == ig7Var.p && this.q.equals(ig7Var.q);
    }

    public final int hashCode() {
        return this.q.hashCode() + rw2.b(brm0.e((this.n.hashCode() + brm0.e(twn.d(this.l, (this.k.hashCode() + ua80.b(ua80.b(brm0.e(ua80.b(brm0.d(this.f, rw2.b(brm0.d(this.d, rw2.b(rw2.b(Integer.hashCode(this.f14722a) * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j)) * 31, 31), 31, this.m)) * 31, 31, this.o), 31, this.p);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f14722a, this.b, "BetModel(id=", ", marketTypeId=");
        kng0.A(sbQ, ", gameId=", this.c, ", coef=");
        sbQ.append(this.d);
        kng0.A(sbQ, ", marketGroupId=", this.e, ", param=");
        hne.w(sbQ, this.f, ", paramStr=", this.g);
        hne.u(", blocked=", ", coefV=", this.i, sbQ, this.h);
        sbQ.append(", coefViewName=");
        sbQ.append(this.j);
        sbQ.append(", player=");
        sbQ.append(this.k);
        sbQ.append(", kind=");
        sbQ.append(this.l);
        sbQ.append(", startingPrice=");
        sbQ.append(this.m);
        sbQ.append(", playersDuel=");
        sbQ.append(this.n);
        sbQ.append(", specialSign=");
        sbQ.append(this.o);
        kng0.A(sbQ, ", polybetRuleId=", this.p, ", eventParams=");
        sbQ.append(this.q);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
