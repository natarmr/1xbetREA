package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class rw80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ox80 f31207a;
    public final ox80 b;

    public rw80(ox80 ox80Var, ox80 ox80Var2) {
        this.f31207a = ox80Var;
        this.b = ox80Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw80)) {
            return false;
        }
        rw80 rw80Var = (rw80) obj;
        return this.f31207a.equals(rw80Var.f31207a) && this.b.equals(rw80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f31207a.hashCode() * 31);
    }

    public final String toString() {
        return "PartnerBottomInfoAnnounceTeamsUiModel(firstTeam=" + this.f31207a + ", secondTeam=" + this.b + Separators.RPAREN;
    }
}
