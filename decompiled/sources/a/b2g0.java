package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class b2g0 implements c2g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1851a;

    public final boolean equals(Object obj) {
        if (obj instanceof b2g0) {
            return this.f1851a == ((b2g0) obj).f1851a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1851a);
    }

    public final String toString() {
        return axq.h(this.f1851a, "OnFavoriteCardClick(gameId=", Separators.RPAREN);
    }
}
