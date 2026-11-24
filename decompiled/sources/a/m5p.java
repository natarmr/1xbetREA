package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m5p implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21231a;
    public final long b;
    public final long c;
    public final long d;
    public final sgb e;
    public final String f;
    public final String g;
    public final long h;
    public final boolean i;
    public final h5p j;
    public final int k;
    public final int l;
    public final String m;

    public m5p(int i, int i2, long j, long j2, long j3, long j4, long j5, sgb sgbVar, h5p h5pVar, String str, String str2, String str3, boolean z) {
        sgbVar.getClass();
        str3.getClass();
        this.f21231a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = sgbVar;
        this.f = str;
        this.g = str2;
        this.h = j5;
        this.i = z;
        this.j = h5pVar;
        this.k = i;
        this.l = i2;
        this.m = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5p)) {
            return false;
        }
        m5p m5pVar = (m5p) obj;
        return this.f21231a == m5pVar.f21231a && this.b == m5pVar.b && this.c == m5pVar.c && this.d == m5pVar.d && Intrinsics.d(this.e, m5pVar.e) && this.f.equals(m5pVar.f) && this.g.equals(m5pVar.g) && this.h == m5pVar.h && this.i == m5pVar.i && this.j == m5pVar.j && this.k == m5pVar.k && this.l == m5pVar.l && Intrinsics.d(this.m, m5pVar.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + twn.a(this.l, twn.a(this.k, (this.j.hashCode() + brm0.e(rw2.b(ua80.b(ua80.b((this.e.hashCode() + rw2.b(rw2.b(rw2.b(Long.hashCode(this.f21231a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f), 961, this.g), 31, this.h), 31, this.i)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f21231a, "FavoriteChampUiModel(id=", ", sportId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", subSportId=", this.c, ", globalChampId=");
        sbQ.append(this.d);
        sbQ.append(", champType=");
        sbQ.append(this.e);
        f140.v(sbQ, ", title=", this.f, ", champIcon=", this.g);
        kng0.A(sbQ, ", countryImage=, countryId=", this.h, ", live=");
        sbQ.append(this.i);
        sbQ.append(", champBadgeType=");
        sbQ.append(this.j);
        sbQ.append(", cyberType=");
        axq.r(this.k, this.l, ", gamesCount=", ", sportLogo=", sbQ);
        return axq.n(sbQ, this.m, Separators.RPAREN);
    }
}
