package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class olp implements qlp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25467a;
    public final String b;
    public final long c;
    public final int d;
    public final String e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final List i;
    public final jlp j;
    public boolean k;
    public final boolean l;
    public final yi00 m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;

    public olp(long j, String str, long j2, int i, String str2, int i2, boolean z, boolean z2, List list, jlp jlpVar, boolean z3, yi00 yi00Var, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.f25467a = j;
        this.b = str;
        this.c = j2;
        this.d = i;
        this.e = str2;
        this.f = i2;
        this.g = z;
        this.h = z2;
        this.i = list;
        this.j = jlpVar;
        this.k = false;
        this.l = z3;
        this.m = yi00Var;
        this.n = z4;
        this.o = z5;
        this.p = z6;
        this.q = z7;
        this.r = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof olp)) {
            return false;
        }
        olp olpVar = (olp) obj;
        return this.f25467a == olpVar.f25467a && Intrinsics.d(this.b, olpVar.b) && this.c == olpVar.c && this.d == olpVar.d && Intrinsics.d(this.e, olpVar.e) && this.f == olpVar.f && this.g == olpVar.g && this.h == olpVar.h && Intrinsics.d(this.i, olpVar.i) && Intrinsics.d(this.j, olpVar.j) && this.k == olpVar.k && this.l == olpVar.l && this.m.equals(olpVar.m) && this.n == olpVar.n && this.o == olpVar.o && this.p == olpVar.p && this.q == olpVar.q && this.r == olpVar.r;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof olp) && (p6t0Var2 instanceof olp) && ((olp) p6t0Var).f25467a == ((olp) p6t0Var2).f25467a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.r) + brm0.e(brm0.e(brm0.e(brm0.e(twn.a(0, twn.a(this.m.f42663a, brm0.e(brm0.e((this.j.hashCode() + dw9.a(brm0.e(brm0.e(twn.a(this.f, ua80.b(twn.a(this.d, brm0.e(rw2.b(ua80.b(Long.hashCode(this.f25467a) * 31, 31, this.b), 31, this.c), 31, false), 31), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i)) * 31, 31, this.k), 31, this.l), 31), 31), 31, this.n), 31, this.o), 31, this.p), 31, this.q);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof olp) && (p6t0Var2 instanceof olp)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            olp olpVar = (olp) p6t0Var;
            olp olpVar2 = (olp) p6t0Var2;
            k9x.G(linkedHashSet, olpVar.j, olpVar2.j);
            k9x.G(linkedHashSet, new klp(olpVar.f), new klp(olpVar2.f));
            k9x.G(linkedHashSet, new llp(olpVar.n), new llp(olpVar2.n));
            k9x.G(linkedHashSet, new mlp(olpVar.o), new mlp(olpVar2.o));
            k9x.G(linkedHashSet, new nlp(olpVar.r), new nlp(olpVar2.r));
            if (!linkedHashSet.isEmpty()) {
                return linkedHashSet;
            }
        }
        return null;
    }

    public final String toString() {
        String strE = ua80.e(this.f, "GamesCount(value=", Separators.RPAREN);
        boolean z = this.k;
        String strD = defpackage.c.d("MultiSelectEnabled(value=", Separators.RPAREN, this.n);
        String strD2 = defpackage.c.d("Selected(value=", Separators.RPAREN, this.o);
        String strD3 = defpackage.c.d("SelectionEnabled(value=", Separators.RPAREN, this.r);
        StringBuilder sbO = axq.o(this.f25467a, "FeedsChampSubItem(id=", ", title=", this.b);
        kng0.A(sbO, ", sportId=", this.c, ", live=false, subSportId=");
        kng0.w(this.d, ", image=", this.e, ", gamesCount=", sbO);
        brm0.C(strE, ", top=", ", new=", sbO, this.g);
        vqd.y(sbO, ", games=", this.i, ", favorite=", this.h);
        sbO.append(this.j);
        sbO.append(", lastInGroup=");
        sbO.append(z);
        sbO.append(", bettingDisabled=");
        sbO.append(this.l);
        sbO.append(", expressType=");
        sbO.append(this.m);
        sbO.append(", champImageResId=0, multiSelectEnabled=");
        f140.v(sbO, strD, ", selected=", strD2, ", expanded=");
        ua80.u(", expandedEnabled=", ", selectionEnabled=", sbO, this.p, this.q);
        return axq.n(sbO, strD3, Separators.RPAREN);
    }
}
