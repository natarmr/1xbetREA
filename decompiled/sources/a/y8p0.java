package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class y8p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42205a;
    public final rqm b;

    public y8p0(long j, rqm rqmVar) {
        this.f42205a = j;
        this.b = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8p0)) {
            return false;
        }
        y8p0 y8p0Var = (y8p0) obj;
        return this.f42205a == y8p0Var.f42205a && this.b.equals(y8p0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f42205a) * 31);
    }

    public final String toString() {
        return "TeamDetailsDisciplineDialogUiModel(subSportId=" + this.f42205a + ", settingCell=" + this.b + Separators.RPAREN;
    }
}
