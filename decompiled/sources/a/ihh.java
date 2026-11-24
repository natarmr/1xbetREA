package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ihh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14779a;
    public final zrm b;

    public ihh(long j, zrm zrmVar) {
        this.f14779a = j;
        this.b = zrmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihh)) {
            return false;
        }
        ihh ihhVar = (ihh) obj;
        return this.f14779a == ihhVar.f14779a && this.b.equals(ihhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f14779a) * 31);
    }

    public final String toString() {
        return "CyberTeamOtherTeamCellUiModel(id=" + this.f14779a + ", sportCellUiModel=" + this.b + Separators.RPAREN;
    }
}
