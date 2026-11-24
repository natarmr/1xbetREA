package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rd2 implements sd2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f30270a;

    public final boolean equals(Object obj) {
        if (obj instanceof rd2) {
            return this.f30270a.equals(((rd2) obj).f30270a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30270a.hashCode();
    }

    public final String toString() {
        return twn.n("ResultGameCardAction(action=", this.f30270a, Separators.RPAREN);
    }
}
