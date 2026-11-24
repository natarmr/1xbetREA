package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vf50 implements uf50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37316a;
    public final long b;
    public final long c;
    public final boolean d;
    public final String e;
    public final String f;
    public final vg50 g;
    public final xh50 h;
    public final rg50 i;
    public final fi50 j;
    public final aj50 k;
    public final List l;
    public final eh50 m;
    public final eh50 n;

    public vf50(boolean z, long j, long j2, boolean z2, String str, String str2, vg50 vg50Var, xh50 xh50Var, rg50 rg50Var, fi50 fi50Var, aj50 aj50Var, List list, eh50 eh50Var, eh50 eh50Var2) {
        list.getClass();
        eh50Var2.getClass();
        this.f37316a = z;
        this.b = j;
        this.c = j2;
        this.d = z2;
        this.e = str;
        this.f = str2;
        this.g = vg50Var;
        this.h = xh50Var;
        this.i = rg50Var;
        this.j = fi50Var;
        this.k = aj50Var;
        this.l = list;
        this.m = eh50Var;
        this.n = eh50Var2;
    }

    @Override // a.uf50
    public final boolean a() {
        return this.d;
    }

    @Override // a.uf50
    public final rg50 b() {
        return this.i;
    }

    @Override // a.uf50
    public final long c() {
        return this.c;
    }

    @Override // a.uf50
    public final vg50 d() {
        return this.g;
    }

    @Override // a.uf50
    public final aj50 e() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf50)) {
            return false;
        }
        vf50 vf50Var = (vf50) obj;
        return this.f37316a == vf50Var.f37316a && this.b == vf50Var.b && this.c == vf50Var.c && this.d == vf50Var.d && this.e.equals(vf50Var.e) && this.f.equals(vf50Var.f) && Intrinsics.d(this.g, vf50Var.g) && this.h.equals(vf50Var.h) && this.i.equals(vf50Var.i) && Intrinsics.d(this.j, vf50Var.j) && Intrinsics.d(this.k, vf50Var.k) && Intrinsics.d(this.l, vf50Var.l) && this.m.equals(vf50Var.m) && Intrinsics.d(this.n, vf50Var.n);
    }

    @Override // a.uf50
    public final String f() {
        return this.f;
    }

    @Override // a.uf50
    public final xh50 g() {
        return this.h;
    }

    @Override // a.uf50
    public final long getId() {
        return this.b;
    }

    @Override // a.uf50
    public final String h() {
        return this.e;
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(brm0.e(rw2.b(rw2.b(Boolean.hashCode(this.f37316a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        vg50 vg50Var = this.g;
        int iHashCode = (this.i.hashCode() + ((this.h.hashCode() + ((iB + (vg50Var == null ? 0 : vg50Var.hashCode())) * 31)) * 31)) * 31;
        fi50 fi50Var = this.j;
        int iHashCode2 = (iHashCode + (fi50Var == null ? 0 : fi50Var.hashCode())) * 31;
        aj50 aj50Var = this.k;
        return this.n.hashCode() + ((this.m.hashCode() + dw9.a((iHashCode2 + (aj50Var != null ? aj50Var.hashCode() : 0)) * 31, 31, this.l)) * 31);
    }

    @Override // a.uf50
    public final boolean i() {
        return this.f37316a;
    }

    @Override // a.uf50
    public final fi50 j() {
        return this.j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NearestGameCardCricket(isLive=");
        sb.append(this.f37316a);
        sb.append(", id=");
        sb.append(this.b);
        kng0.A(sb, ", startTs=", this.c, ", isFinished=");
        f140.s(", gameVidName=", this.e, ", dopInfo=", sb, this.d);
        sb.append(this.f);
        sb.append(", matchInfo=");
        sb.append(this.g);
        sb.append(", sport=");
        sb.append(this.h);
        sb.append(", liga=");
        sb.append(this.i);
        sb.append(", subSport=");
        sb.append(this.j);
        sb.append(", score=");
        sb.append(this.k);
        sb.append(", tableStatistics=");
        sb.append(this.l);
        sb.append(", firstOpponent=");
        sb.append(this.m);
        sb.append(", secondOpponent=");
        sb.append(this.n);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
