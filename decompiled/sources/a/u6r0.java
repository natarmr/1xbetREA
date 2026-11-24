package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class u6r0 implements v6r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f35152a;

    public final boolean equals(Object obj) {
        if (obj instanceof u6r0) {
            return this.f35152a.equals(((u6r0) obj).f35152a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35152a.hashCode();
    }

    public final String toString() {
        return vqd.n("SendAltDesignGameCardSideEffect(internalEffect=", this.f35152a, Separators.RPAREN);
    }
}
