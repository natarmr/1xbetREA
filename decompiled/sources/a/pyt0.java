package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pyt0 implements qyt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27814a;

    public final boolean equals(Object obj) {
        if (obj instanceof pyt0) {
            return this.f27814a.equals(((pyt0) obj).f27814a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27814a.hashCode();
    }

    public final String toString() {
        return kng0.l("MatchClick(value=", this.f27814a, Separators.RPAREN);
    }
}
