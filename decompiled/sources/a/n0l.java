package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n0l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22703a;
    public final String b;
    public final int c;
    public final List d;
    public final lnm0 e;
    public final int f;
    public final double g;
    public final boolean h;
    public final double i;
    public final List j;
    public final List k;
    public final List l;
    public final int m;
    public final List n;
    public final csr o;
    public final long p;
    public final double q;
    public final int r;
    public final double s;
    public final boolean t;

    public n0l(int i, String str, int i2, List list, lnm0 lnm0Var, int i3, double d, boolean z, double d2, List list2, List list3, List list4, int i4, List list5, csr csrVar, long j, double d3, int i5, double d4, boolean z2) {
        rz4.B(list, list2, list3, list4, list5);
        csrVar.getClass();
        this.f22703a = i;
        this.b = str;
        this.c = i2;
        this.d = list;
        this.e = lnm0Var;
        this.f = i3;
        this.g = d;
        this.h = z;
        this.i = d2;
        this.j = list2;
        this.k = list3;
        this.l = list4;
        this.m = i4;
        this.n = list5;
        this.o = csrVar;
        this.p = j;
        this.q = d3;
        this.r = i5;
        this.s = d4;
        this.t = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0l)) {
            return false;
        }
        n0l n0lVar = (n0l) obj;
        return this.f22703a == n0lVar.f22703a && this.b.equals(n0lVar.b) && this.c == n0lVar.c && Intrinsics.d(this.d, n0lVar.d) && this.e == n0lVar.e && this.f == n0lVar.f && Double.compare(this.g, n0lVar.g) == 0 && this.h == n0lVar.h && Double.compare(this.i, n0lVar.i) == 0 && Intrinsics.d(this.j, n0lVar.j) && Intrinsics.d(this.k, n0lVar.k) && Intrinsics.d(this.l, n0lVar.l) && this.m == n0lVar.m && Intrinsics.d(this.n, n0lVar.n) && Intrinsics.d(this.o, n0lVar.o) && this.p == n0lVar.p && Double.compare(this.q, n0lVar.q) == 0 && this.r == n0lVar.r && Double.compare(this.s, n0lVar.s) == 0 && this.t == n0lVar.t;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.t) + brm0.d(this.s, twn.a(this.r, brm0.d(this.q, rw2.b((this.o.hashCode() + dw9.a(twn.a(this.m, dw9.a(dw9.a(dw9.a(brm0.d(this.i, brm0.e(brm0.d(this.g, twn.a(this.f, (this.e.hashCode() + dw9.a(twn.a(this.c, ua80.b(Integer.hashCode(this.f22703a) * 31, 31, this.b), 31), 31, this.d)) * 31, 31), 31), 31, this.h), 31), 31, this.j), 31, this.k), 31, this.l), 31), 31, this.n)) * 31, 31, this.p), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f22703a, "DominoModel(opponent=", ", gameId=", this.b, ", actionNumber=");
        ohs0.v(this.c, ", playerBones=", ", gameStatus=", sbR, this.d);
        sbR.append(this.e);
        sbR.append(", fish=");
        sbR.append(this.f);
        sbR.append(", betSum=");
        rz4.x(sbR, this.g, ", rC=", this.h);
        ohs0.A(sbR, this.i, ", winSum=", ", firstDouble=");
        b1j.y(", endgeValues=", ", bonesOnTable=", sbR, this.j, this.k);
        brm0.v(this.m, ", yourAction=", ", opponentBones=", sbR, this.l);
        sbR.append(this.n);
        sbR.append(", bonusInfo=");
        sbR.append(this.o);
        sbR.append(", accountId=");
        sbR.append(this.p);
        ohs0.A(sbR, this.q, ", balanceNew=", ", bonesTableCount=");
        sbR.append(this.r);
        sbR.append(", coeff=");
        sbR.append(this.s);
        return f140.n(sbR, ", isGiveUp=", this.t, Separators.RPAREN);
    }
}
