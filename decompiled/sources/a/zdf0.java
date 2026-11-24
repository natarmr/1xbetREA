package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class zdf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f44211a;

    public final boolean equals(Object obj) {
        if (obj instanceof zdf0) {
            return this.f44211a.equals(((zdf0) obj).f44211a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44211a.hashCode();
    }

    public final String toString() {
        return vqd.n("SendAltDesignGameCardSideEffect(internalEffect=", this.f44211a, Separators.RPAREN);
    }
}
