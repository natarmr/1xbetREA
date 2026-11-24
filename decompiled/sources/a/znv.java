package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class znv implements bov {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44693a;

    public final boolean equals(Object obj) {
        if (obj instanceof znv) {
            return this.f44693a.equals(((znv) obj).f44693a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44693a.hashCode();
    }

    public final String toString() {
        return kng0.l("TournamentDate(value=", this.f44693a, Separators.RPAREN);
    }
}
