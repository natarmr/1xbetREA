package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zgb implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44336a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final vf5 g;
    public final boolean h;
    public final int i;
    public final long j;
    public final boolean k;
    public final long l;

    public zgb(long j, long j2, long j3, String str, String str2, boolean z, vf5 vf5Var, boolean z2, int i, long j4, boolean z3, long j5) {
        str.getClass();
        this.f44336a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = vf5Var;
        this.h = z2;
        this.i = i;
        this.j = j4;
        this.k = z3;
        this.l = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgb)) {
            return false;
        }
        zgb zgbVar = (zgb) obj;
        return this.f44336a == zgbVar.f44336a && this.b == zgbVar.b && this.c == zgbVar.c && Intrinsics.d(this.d, zgbVar.d) && this.e.equals(zgbVar.e) && this.f == zgbVar.f && this.g == zgbVar.g && this.h == zgbVar.h && this.i == zgbVar.i && this.j == zgbVar.j && this.k == zgbVar.k && this.l == zgbVar.l;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof zgb) && (p6t0Var2 instanceof zgb) && ((zgb) p6t0Var).f44336a == ((zgb) p6t0Var2).f44336a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        int iE = brm0.e(ua80.b(ua80.b(rw2.b(rw2.b(Long.hashCode(this.f44336a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        vf5 vf5Var = this.g;
        return Long.hashCode(this.l) + brm0.e(rw2.b(twn.a(this.i, brm0.e((iE + (vf5Var == null ? 0 : vf5Var.hashCode())) * 31, 31, this.h), 31), 31, this.j), 31, this.k);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof zgb) || !(p6t0Var2 instanceof zgb)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        zgb zgbVar = (zgb) p6t0Var;
        zgb zgbVar2 = (zgb) p6t0Var2;
        k9x.G(linkedHashSet, new vgb(zgbVar.d), new vgb(zgbVar2.d));
        k9x.G(linkedHashSet, new ugb(zgbVar.e), new ugb(zgbVar2.e));
        k9x.G(linkedHashSet, new xgb(zgbVar.f), new xgb(zgbVar2.f));
        k9x.G(linkedHashSet, new wgb(zgbVar.i), new wgb(zgbVar2.i));
        k9x.G(linkedHashSet, new tgb(zgbVar.k), new tgb(zgbVar2.k));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("ChampName(value=", this.d, Separators.RPAREN);
        String strL2 = kng0.l("ChampLogo(value=", this.e, Separators.RPAREN);
        String strD = defpackage.c.d("Favorite(value=", Separators.RPAREN, this.f);
        String strE = ua80.e(this.i, "CountGames(value=", Separators.RPAREN);
        String strD2 = defpackage.c.d("BettingDisabled(value=", Separators.RPAREN, this.k);
        StringBuilder sbQ = kng0.q(this.f44336a, "ChampUiModel(id=", ", sportId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", subSportId=", this.c, ", champName=");
        f140.v(sbQ, strL, ", champLogo=", strL2, ", favorite=");
        sbQ.append(strD);
        sbQ.append(", badgeType=");
        sbQ.append(this.g);
        sbQ.append(", live=");
        f140.s(", countGames=", strE, ", firstGameId=", sbQ, this.h);
        kng0.z(sbQ, this.j, ", bettingDisabled=", strD2);
        return rw2.n(sbQ, this.l, ", globalChampId=", Separators.RPAREN);
    }
}
