package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z5p implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43828a;
    public final long b;
    public final long c;
    public final sgb d;
    public final String e;
    public final String f;
    public final long g;
    public final boolean h;
    public final h5p i;
    public final int j;
    public final int k;
    public final String l;
    public final long m;

    public z5p(int i, int i2, long j, long j2, long j3, long j4, long j5, sgb sgbVar, h5p h5pVar, String str, String str2, String str3, boolean z) {
        sgbVar.getClass();
        str3.getClass();
        this.f43828a = j;
        this.b = j2;
        this.c = j3;
        this.d = sgbVar;
        this.e = str;
        this.f = str2;
        this.g = j4;
        this.h = z;
        this.i = h5pVar;
        this.j = i;
        this.k = i2;
        this.l = str3;
        this.m = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5p)) {
            return false;
        }
        z5p z5pVar = (z5p) obj;
        return this.f43828a == z5pVar.f43828a && this.b == z5pVar.b && this.c == z5pVar.c && Intrinsics.d(this.d, z5pVar.d) && this.e.equals(z5pVar.e) && this.f.equals(z5pVar.f) && this.g == z5pVar.g && this.h == z5pVar.h && this.i == z5pVar.i && this.j == z5pVar.j && this.k == z5pVar.k && Intrinsics.d(this.l, z5pVar.l) && this.m == z5pVar.m;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof z5p) && (p6t0Var2 instanceof z5p)) {
            return ((z5p) p6t0Var).f43828a == ((z5p) p6t0Var2).f43828a;
        }
        return p6t0Var.getClass().equals(p6t0Var2.getClass());
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + ua80.b(twn.a(this.k, twn.a(this.j, (this.i.hashCode() + brm0.e(rw2.b(ua80.b(ua80.b((this.d.hashCode() + rw2.b(rw2.b(Long.hashCode(this.f43828a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 961, this.f), 31, this.g), 31, this.h)) * 31, 31), 31), 31, this.l);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f43828a, "FavoriteChampsUiModel(id=", ", sportId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", subSportId=", this.c, ", champType=");
        sbQ.append(this.d);
        sbQ.append(", title=");
        sbQ.append(this.e);
        sbQ.append(", champIcon=");
        defpackage.c.i(sbQ, this.g, this.f, ", countryImage=, countryId=");
        sbQ.append(", live=");
        sbQ.append(this.h);
        sbQ.append(", champBadgeType=");
        sbQ.append(this.i);
        rw2.s(this.j, this.k, ", cyberType=", ", gamesCount=", sbQ);
        hne.B(sbQ, ", sportLogo=", this.l, ", globalChampId=");
        return brm0.k(this.m, Separators.RPAREN, sbQ);
    }
}
