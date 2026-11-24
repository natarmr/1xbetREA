package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class hxs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final svf f13827a;
    public final svf b;

    public hxs0(svf svfVar, svf svfVar2) {
        this.f13827a = svfVar;
        this.b = svfVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxs0)) {
            return false;
        }
        hxs0 hxs0Var = (hxs0) obj;
        return this.f13827a.equals(hxs0Var.f13827a) && this.b.equals(hxs0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13827a.hashCode() * 31);
    }

    public final String toString() {
        return "TwoTeamCurrentLastGameModel(firstTeamCurrentLastGameModel=" + this.f13827a + ", secondTeamCurrentLastGameModel=" + this.b + Separators.RPAREN;
    }
}
