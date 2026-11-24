package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class lpp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wpp0 f20453a;
    public final vpp0 b;
    public final opp0 c;

    public lpp0(wpp0 wpp0Var, vpp0 vpp0Var, opp0 opp0Var) {
        this.f20453a = wpp0Var;
        this.b = vpp0Var;
        this.c = opp0Var;
    }

    public static lpp0 a(lpp0 lpp0Var, wpp0 wpp0Var, vpp0 vpp0Var, opp0 opp0Var, int i) {
        if ((i & 1) != 0) {
            wpp0Var = lpp0Var.f20453a;
        }
        if ((i & 2) != 0) {
            vpp0Var = lpp0Var.b;
        }
        if ((i & 4) != 0) {
            opp0Var = lpp0Var.c;
        }
        return new lpp0(wpp0Var, vpp0Var, opp0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpp0)) {
            return false;
        }
        lpp0 lpp0Var = (lpp0) obj;
        return this.f20453a.equals(lpp0Var.f20453a) && this.b.equals(lpp0Var.b) && this.c.equals(lpp0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f20453a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TeamsGamesSubSectionStateModel(teamsLiveGames=" + this.f20453a + ", teamsLineGames=" + this.b + ", teamsHistoryGames=" + this.c + Separators.RPAREN;
    }
}
