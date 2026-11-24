package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class v1b0 implements b2b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36623a;

    public v1b0(long j) {
        this.f36623a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v1b0) && this.f36623a == ((v1b0) obj).f36623a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f36623a);
    }

    public final String toString() {
        return axq.h(this.f36623a, "OnFavoritePromoGameClick(id=", Separators.RPAREN);
    }
}
