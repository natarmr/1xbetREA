package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ghc implements jhc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11290a;

    public final boolean equals(Object obj) {
        if (obj instanceof ghc) {
            return this.f11290a == ((ghc) obj).f11290a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11290a);
    }

    public final String toString() {
        return axq.h(this.f11290a, "OnLimitValueChooseLoss(newValue=", Separators.RPAREN);
    }
}
