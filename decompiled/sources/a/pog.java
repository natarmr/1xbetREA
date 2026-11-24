package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class pog implements sog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27327a;

    public final boolean equals(Object obj) {
        if (obj instanceof pog) {
            return this.f27327a.equals(((pog) obj).f27327a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27327a.hashCode();
    }

    public final String toString() {
        return kng0.l("TournamentDate(value=", this.f27327a, Separators.RPAREN);
    }
}
