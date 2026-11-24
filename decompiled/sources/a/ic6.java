package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ic6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fc6 f14521a;
    public final fc6 b;

    public ic6(fc6 fc6Var, fc6 fc6Var2) {
        this.f14521a = fc6Var;
        this.b = fc6Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic6)) {
            return false;
        }
        ic6 ic6Var = (ic6) obj;
        return this.f14521a.equals(ic6Var.f14521a) && this.b.equals(ic6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f14521a.hashCode() * 31);
    }

    public final String toString() {
        return "BestHeroesModel(firstTeam=" + this.f14521a + ", secondTeam=" + this.b + Separators.RPAREN;
    }
}
