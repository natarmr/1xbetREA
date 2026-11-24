package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class l5m implements o5m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u5m f19464a;

    public l5m(u5m u5mVar) {
        this.f19464a = u5mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l5m) && this.f19464a.equals(((l5m) obj).f19464a);
    }

    public final int hashCode() {
        return this.f19464a.hashCode();
    }

    public final String toString() {
        return "OneTeam(uiModel=" + this.f19464a + Separators.RPAREN;
    }
}
