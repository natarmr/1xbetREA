package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class m7m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jbm f21326a;
    public final cbm b;
    public final jbm c;

    public m7m(jbm jbmVar, cbm cbmVar, jbm jbmVar2) {
        this.f21326a = jbmVar;
        this.b = cbmVar;
        this.c = jbmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7m)) {
            return false;
        }
        m7m m7mVar = (m7m) obj;
        return this.f21326a.equals(m7mVar.f21326a) && this.b.equals(m7mVar.b) && this.c.equals(m7mVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f21326a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DsCyberGameTeamLineupsUiModel(firstTeamLineupUiModel=" + this.f21326a + ", teamLineupInfoUiModel=" + this.b + ", secondTeamLineupUiModel=" + this.c + Separators.RPAREN;
    }
}
