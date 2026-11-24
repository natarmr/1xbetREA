package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class b6b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f2044a;

    public final boolean equals(Object obj) {
        if (obj instanceof b6b0) {
            return this.f2044a.equals(((b6b0) obj).f2044a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2044a.hashCode();
    }

    public final String toString() {
        return vqd.n("SendAltDesignGameCardSideEffect(internalEffect=", this.f2044a, Separators.RPAREN);
    }
}
