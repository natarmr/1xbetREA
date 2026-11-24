package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tlp0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ylp0 f34158a;
    public final ylp0 b;

    public tlp0(ylp0 ylp0Var, ylp0 ylp0Var2) {
        this.f34158a = ylp0Var;
        this.b = ylp0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlp0)) {
            return false;
        }
        tlp0 tlp0Var = (tlp0) obj;
        return this.f34158a.equals(tlp0Var.f34158a) && this.b.equals(tlp0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "TEAM_STAT_TABLET";
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f34158a.hashCode() - 392046063) * 31);
    }

    public final String toString() {
        return "TeamStatisticTabletUiModel(key=TEAM_STAT_TABLET, firstTeam=" + this.f34158a + ", secondTeam=" + this.b + Separators.RPAREN;
    }
}
