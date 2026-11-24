package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rog implements sog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30834a;

    public final boolean equals(Object obj) {
        if (obj instanceof rog) {
            return this.f30834a.equals(((rog) obj).f30834a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30834a.hashCode();
    }

    public final String toString() {
        return kng0.l("TournamentTitle(value=", this.f30834a, Separators.RPAREN);
    }
}
