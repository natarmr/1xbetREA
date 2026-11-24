package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ilp implements qlp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14991a;
    public final String b;
    public final long c;
    public final boolean d;
    public final int e;
    public final String f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final List l;
    public final dlp m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;

    public ilp(long j, String str, long j2, boolean z, int i, String str2, int i2, boolean z2, boolean z3, boolean z4, boolean z5, List list, dlp dlpVar, boolean z6, boolean z7, boolean z8, boolean z9) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.f14991a = j;
        this.b = str;
        this.c = j2;
        this.d = z;
        this.e = i;
        this.f = str2;
        this.g = i2;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = list;
        this.m = dlpVar;
        this.n = z6;
        this.o = z7;
        this.p = z8;
        this.q = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ilp)) {
            return false;
        }
        ilp ilpVar = (ilp) obj;
        return this.f14991a == ilpVar.f14991a && Intrinsics.d(this.b, ilpVar.b) && this.c == ilpVar.c && this.d == ilpVar.d && this.e == ilpVar.e && Intrinsics.d(this.f, ilpVar.f) && this.g == ilpVar.g && this.h == ilpVar.h && this.i == ilpVar.i && this.j == ilpVar.j && this.k == ilpVar.k && Intrinsics.d(this.l, ilpVar.l) && Intrinsics.d(this.m, ilpVar.m) && this.n == ilpVar.n && this.o == ilpVar.o && this.p == ilpVar.p && this.q == ilpVar.q;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof ilp) && (p6t0Var2 instanceof ilp) && ((ilp) p6t0Var).f14991a == ((ilp) p6t0Var2).f14991a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.q) + brm0.e(brm0.e(brm0.e((this.m.hashCode() + dw9.a(brm0.e(brm0.e(brm0.e(brm0.e(twn.a(this.g, ua80.b(twn.a(this.e, brm0.e(rw2.b(ua80.b(Long.hashCode(this.f14991a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l)) * 31, 31, this.n), 31, this.o), 31, this.p);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof ilp) && (p6t0Var2 instanceof ilp)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ilp ilpVar = (ilp) p6t0Var;
            ilp ilpVar2 = (ilp) p6t0Var2;
            k9x.G(linkedHashSet, ilpVar.m, ilpVar2.m);
            k9x.G(linkedHashSet, new elp(ilpVar.g), new elp(ilpVar2.g));
            k9x.G(linkedHashSet, new flp(ilpVar.o), new flp(ilpVar2.o));
            k9x.G(linkedHashSet, new glp(ilpVar.p), new glp(ilpVar2.p));
            k9x.G(linkedHashSet, new hlp(ilpVar.q), new hlp(ilpVar2.q));
            if (!linkedHashSet.isEmpty()) {
                return linkedHashSet;
            }
        }
        return null;
    }

    public final String toString() {
        String strE = ua80.e(this.g, "GamesCount(value=", Separators.RPAREN);
        String strD = defpackage.c.d("MultiSelectEnabled(value=", Separators.RPAREN, this.o);
        String strD2 = defpackage.c.d("Selected(value=", Separators.RPAREN, this.p);
        String strD3 = defpackage.c.d("SelectionEnabled(value=", Separators.RPAREN, this.q);
        StringBuilder sbO = axq.o(this.f14991a, "FeedsChampSingleItem(id=", ", title=", this.b);
        kng0.A(sbO, ", sportId=", this.c, ", live=");
        ua80.q(this.e, ", subSportId=", ", image=", sbO, this.d);
        f140.v(sbO, this.f, ", gamesCount=", strE, ", top=");
        ua80.u(", new=", ", expanded=", sbO, this.h, this.i);
        ua80.u(", expandedEnabled=", ", games=", sbO, this.j, this.k);
        sbO.append(this.l);
        sbO.append(", favorite=");
        sbO.append(this.m);
        sbO.append(", bettingDisabled=");
        f140.s(", multiSelectEnabled=", strD, ", selected=", sbO, this.n);
        return ua80.m(sbO, strD2, ", selectionEnabled=", strD3, Separators.RPAREN);
    }
}
