package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class l8s0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19620a;
    public final String b;
    public final long c;

    public l8s0(String str, String str2, long j) {
        this.f19620a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8s0)) {
            return false;
        }
        l8s0 l8s0Var = (l8s0) obj;
        return this.f19620a.equals(l8s0Var.f19620a) && this.b.equals(l8s0Var.b) && this.c == l8s0Var.c;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof l8s0) && (p6t0Var2 instanceof l8s0);
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(this.f19620a.hashCode() * 31, 31, this.b), 31, false), 31, false), 31, false), 31, false);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof l8s0) || !(p6t0Var2 instanceof l8s0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        l8s0 l8s0Var = (l8s0) p6t0Var;
        l8s0 l8s0Var2 = (l8s0) p6t0Var2;
        k9x.G(linkedHashSet, new h8s0(l8s0Var.f19620a), new h8s0(l8s0Var2.f19620a));
        k9x.G(linkedHashSet, new i8s0(l8s0Var.b), new i8s0(l8s0Var2.b));
        k9x.G(linkedHashSet, new j8s0(), new j8s0());
        k9x.G(linkedHashSet, new e8s0(), new e8s0());
        k9x.G(linkedHashSet, new f8s0(), new f8s0());
        k9x.G(linkedHashSet, new g8s0(), new g8s0());
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        return brm0.k(this.c, Separators.RPAREN, b1j.n("TournamentTopTeamItemUiModel(image=", kng0.l("Image(value=", this.f19620a, Separators.RPAREN), ", name=", kng0.l("Name(value=", this.b, Separators.RPAREN), ", partnerTeamBadgeEnabled=PartnerTeamBadgeEnabled(value=false), aegisFirstBadgeEnabled=AegisFirstBadgeEnabled(value=false), aegisSecondBadgeEnabled=AegisSecondBadgeEnabled(value=false), aegisThirdBadgeEnabled=AegisThirdBadgeEnabled(value=false), teamId="));
    }
}
