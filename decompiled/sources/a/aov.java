package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class aov implements bov {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1221a;

    public final boolean equals(Object obj) {
        if (obj instanceof aov) {
            return this.f1221a.equals(((aov) obj).f1221a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1221a.hashCode();
    }

    public final String toString() {
        return kng0.l("TournamentTitle(value=", this.f1221a, Separators.RPAREN);
    }
}
