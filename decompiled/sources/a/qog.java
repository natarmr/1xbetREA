package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qog implements sog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29071a;

    public final boolean equals(Object obj) {
        if (obj instanceof qog) {
            return this.f29071a.equals(((qog) obj).f29071a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29071a.hashCode();
    }

    public final String toString() {
        return kng0.l("TournamentTime(value=", this.f29071a, Separators.RPAREN);
    }
}
