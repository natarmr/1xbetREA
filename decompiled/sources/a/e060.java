package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class e060 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6975a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public e060(String str, boolean z, boolean z2, boolean z3) {
        this.f6975a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e060)) {
            return false;
        }
        e060 e060Var = (e060) obj;
        return this.f6975a.equals(e060Var.f6975a) && this.b == e060Var.b && this.c == e060Var.c && this.d == e060Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(brm0.e(this.f6975a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", isAggregator=", Separators.RPAREN, brm0.u("NoTabsDashboardFiltersConfig(xGamesName=", this.f6975a, ", hasXGames=", this.b, ", isVirtual="), this.c, this.d);
    }
}
