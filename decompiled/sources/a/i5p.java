package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i5p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14203a;
    public final long b;
    public final long c;
    public final sgb d;
    public final String e;
    public final String f;
    public final String g;
    public final long h;
    public final boolean i;
    public final h5p j;
    public final int k;
    public final int l;
    public final long m;

    public i5p(int i, int i2, long j, long j2, long j3, long j4, long j5, sgb sgbVar, h5p h5pVar, String str, String str2, String str3, boolean z) {
        sgbVar.getClass();
        this.f14203a = j;
        this.b = j2;
        this.c = j3;
        this.d = sgbVar;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = j4;
        this.i = z;
        this.j = h5pVar;
        this.k = i;
        this.l = i2;
        this.m = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5p)) {
            return false;
        }
        i5p i5pVar = (i5p) obj;
        return this.f14203a == i5pVar.f14203a && this.b == i5pVar.b && this.c == i5pVar.c && Intrinsics.d(this.d, i5pVar.d) && this.e.equals(i5pVar.e) && this.f.equals(i5pVar.f) && this.g.equals(i5pVar.g) && this.h == i5pVar.h && this.i == i5pVar.i && this.j == i5pVar.j && this.k == i5pVar.k && this.l == i5pVar.l && this.m == i5pVar.m;
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + twn.a(this.l, twn.a(this.k, (this.j.hashCode() + brm0.e(rw2.b(ua80.b(ua80.b(ua80.b((this.d.hashCode() + rw2.b(rw2.b(Long.hashCode(this.f14203a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f14203a, "FavoriteChampModel(id=", ", sportId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", subSportId=", this.c, ", champType=");
        sbQ.append(this.d);
        sbQ.append(", name=");
        sbQ.append(this.e);
        sbQ.append(", sportName=");
        f140.v(sbQ, this.f, ", image=", this.g, ", country=");
        hne.t(this.h, ", live=", sbQ, this.i);
        sbQ.append(", champBadgeType=");
        sbQ.append(this.j);
        sbQ.append(", cyberType=");
        sbQ.append(this.k);
        rw2.x(sbQ, ", gamesCount=", this.l, ", globalChampId=");
        return brm0.k(this.m, Separators.RPAREN, sbQ);
    }
}
