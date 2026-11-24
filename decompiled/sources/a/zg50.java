package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zg50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44328a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final xh50 f;
    public final rg50 g;
    public final eh50 h;
    public final eh50 i;
    public final vg50 j;
    public final boolean k;
    public final String l;
    public final String m;
    public final rh50 n;
    public final List o;
    public final List p;
    public final fi50 q;

    public zg50(long j, long j2, long j3, long j4, long j5, xh50 xh50Var, rg50 rg50Var, eh50 eh50Var, eh50 eh50Var2, vg50 vg50Var, boolean z, String str, String str2, rh50 rh50Var, List list, List list2, fi50 fi50Var) {
        list.getClass();
        list2.getClass();
        this.f44328a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = xh50Var;
        this.g = rg50Var;
        this.h = eh50Var;
        this.i = eh50Var2;
        this.j = vg50Var;
        this.k = z;
        this.l = str;
        this.m = str2;
        this.n = rh50Var;
        this.o = list;
        this.p = list2;
        this.q = fi50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zg50)) {
            return false;
        }
        zg50 zg50Var = (zg50) obj;
        return this.f44328a == zg50Var.f44328a && this.b == zg50Var.b && this.c == zg50Var.c && this.d == zg50Var.d && this.e == zg50Var.e && this.f.equals(zg50Var.f) && this.g.equals(zg50Var.g) && this.h.equals(zg50Var.h) && Intrinsics.d(this.i, zg50Var.i) && Intrinsics.d(this.j, zg50Var.j) && this.k == zg50Var.k && this.l.equals(zg50Var.l) && this.m.equals(zg50Var.m) && Intrinsics.d(this.n, zg50Var.n) && Intrinsics.d(this.o, zg50Var.o) && Intrinsics.d(this.p, zg50Var.p) && Intrinsics.d(this.q, zg50Var.q);
    }

    public final int hashCode() {
        int iHashCode = (this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + rw2.b(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f44328a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31)) * 31;
        eh50 eh50Var = this.i;
        int iHashCode2 = (iHashCode + (eh50Var == null ? 0 : eh50Var.hashCode())) * 31;
        vg50 vg50Var = this.j;
        int iB = ua80.b(ua80.b(brm0.e((iHashCode2 + (vg50Var == null ? 0 : vg50Var.hashCode())) * 31, 31, this.k), 31, this.l), 31, this.m);
        rh50 rh50Var = this.n;
        int iA = dw9.a(dw9.a((iB + (rh50Var == null ? 0 : rh50Var.hashCode())) * 31, 31, this.o), 31, this.p);
        fi50 fi50Var = this.q;
        return iA + (fi50Var != null ? fi50Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f44328a, "NearestGameDetailsModel(id=", ", num=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", constId=", this.c, ", startTs=");
        sbQ.append(this.d);
        kng0.A(sbQ, ", kind=", this.e, ", sport=");
        sbQ.append(this.f);
        sbQ.append(", liga=");
        sbQ.append(this.g);
        sbQ.append(", firstOpponent=");
        sbQ.append(this.h);
        sbQ.append(", secondOpponent=");
        sbQ.append(this.i);
        sbQ.append(", matchInfo=");
        sbQ.append(this.j);
        sbQ.append(", isFinished=");
        sbQ.append(this.k);
        sbQ.append(", gameVidName=");
        f140.v(sbQ, this.l, ", dopInfo=", this.m, ", score=");
        sbQ.append(this.n);
        sbQ.append(", tableStatistics=");
        sbQ.append(this.o);
        sbQ.append(", periods=");
        sbQ.append(this.p);
        sbQ.append(", subSport=");
        sbQ.append(this.q);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
