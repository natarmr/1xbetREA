package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class aic implements bic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f917a;

    public final boolean equals(Object obj) {
        if (obj instanceof aic) {
            return this.f917a == ((aic) obj).f917a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f917a);
    }

    public final String toString() {
        return axq.h(this.f917a, "OnSubGameClick(id=", Separators.RPAREN);
    }
}
