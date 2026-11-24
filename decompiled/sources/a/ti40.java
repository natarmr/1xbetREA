package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ti40 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m7m f33991a;

    public ti40(m7m m7mVar) {
        this.f33991a = m7mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ti40) && this.f33991a.equals(((ti40) obj).f33991a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "TEAM_LINEUPS";
    }

    public final int hashCode() {
        return this.f33991a.hashCode() + 419149694;
    }

    public final String toString() {
        return "MlbbGameTeamLineupsUiModel(key=TEAM_LINEUPS, uiModel=" + this.f33991a + Separators.RPAREN;
    }
}
