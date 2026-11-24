package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class z4b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43762a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final vcp h;
    public final boolean i;
    public final boolean j;

    public z4b(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2, vcp vcpVar, boolean z6, boolean z7) {
        this.f43762a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = str;
        this.g = str2;
        this.h = vcpVar;
        this.i = z6;
        this.j = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4b)) {
            return false;
        }
        z4b z4bVar = (z4b) obj;
        return this.f43762a == z4bVar.f43762a && this.b == z4bVar.b && this.c == z4bVar.c && this.d == z4bVar.d && this.e == z4bVar.e && this.f.equals(z4bVar.f) && this.g.equals(z4bVar.g) && this.h == z4bVar.h && this.i == z4bVar.i && this.j == z4bVar.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + brm0.e((this.h.hashCode() + ua80.b(ua80.b(brm0.e(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f43762a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31, 31, this.i);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("CategoryImageHeaderConfig(isBettingDisabled=", ", hasPopularBalance=", ", hasSectionXGames=", this.f43762a, this.b);
        ua80.u(", hasSectionAggregator=", ", hasSectionVirtual=", sbQ, this.c, this.d);
        f140.s(", accountControlStyle=", this.f, ", xGameName=", sbQ, this.e);
        sbQ.append(this.g);
        sbQ.append(", favoriteStyle=");
        sbQ.append(this.h);
        sbQ.append(", hasTeamBet=");
        return ohs0.p(", isTablet=", Separators.RPAREN, sbQ, this.i, this.j);
    }
}
