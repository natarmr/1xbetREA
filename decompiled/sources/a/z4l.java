package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z4l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43775a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final int f;
    public final long g;
    public final int h;
    public final List i;
    public final l1h j;
    public final List k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final long o;
    public final int p;
    public final String q;
    public final i6l r;
    public final int s;

    public z4l(int i, String str, int i2, String str2, int i3, int i4, long j, int i5, List list, l1h l1hVar, List list2, boolean z, boolean z2, boolean z3, long j2, int i6, String str3, i6l i6lVar, int i7) {
        list.getClass();
        list2.getClass();
        this.f43775a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = i3;
        this.f = i4;
        this.g = j;
        this.h = i5;
        this.i = list;
        this.j = l1hVar;
        this.k = list2;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = j2;
        this.p = i6;
        this.q = str3;
        this.r = i6lVar;
        this.s = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4l)) {
            return false;
        }
        z4l z4lVar = (z4l) obj;
        return this.f43775a == z4lVar.f43775a && this.b.equals(z4lVar.b) && this.c == z4lVar.c && this.d.equals(z4lVar.d) && this.e == z4lVar.e && this.f == z4lVar.f && this.g == z4lVar.g && this.h == z4lVar.h && Intrinsics.d(this.i, z4lVar.i) && this.j.equals(z4lVar.j) && Intrinsics.d(this.k, z4lVar.k) && this.l == z4lVar.l && this.m == z4lVar.m && this.n == z4lVar.n && this.o == z4lVar.o && this.p == z4lVar.p && this.q.equals(z4lVar.q) && this.r == z4lVar.r && this.s == z4lVar.s;
    }

    public final int hashCode() {
        return Integer.hashCode(this.s) + ((this.r.hashCode() + ua80.b(twn.a(this.p, rw2.b(brm0.e(brm0.e(brm0.e(dw9.a((this.j.hashCode() + dw9.a(twn.a(this.h, rw2.b(twn.a(this.f, twn.a(this.e, ua80.b(twn.a(this.c, ua80.b(Integer.hashCode(this.f43775a) * 31, 31, this.b), 31), 31, this.d), 31), 31), 31, this.g), 31), 31, this.i)) * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31), 31, this.q)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f43775a, "DotaHeroesStatisticModel(heroId=", ", heroName=", this.b, ", level=");
        kng0.w(this.c, ", playerName=", this.d, ", positionX=", sbR);
        axq.r(this.e, this.f, ", positionY=", ", respawnTimer=", sbR);
        ua80.v(sbR, this.g, ", ultimateState=", this.h);
        sbR.append(", equipmentIds=");
        sbR.append(this.i);
        sbR.append(", individualHeroStatistic=");
        sbR.append(this.j);
        esw0.k(sbR, ", heroAbility=", this.k, ", hasAegis=", this.l);
        w6x.A(", hasAghanimsScepter=", ", hasAghanimsShard=", sbR, this.m, this.n);
        kng0.A(sbR, ", aegisTimer=", this.o, ", buyBack=");
        kng0.w(this.p, ", heroImage=", this.q, ", race=", sbR);
        sbR.append(this.r);
        sbR.append(", neutralItem=");
        sbR.append(this.s);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
