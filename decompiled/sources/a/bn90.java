package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class bn90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2872a;

    public final boolean equals(Object obj) {
        if (obj instanceof bn90) {
            return this.f2872a == ((bn90) obj).f2872a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2872a);
    }

    public final String toString() {
        return axq.h(this.f2872a, "OnSubGameClick(subGameId=", Separators.RPAREN);
    }
}
