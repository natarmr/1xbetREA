package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class du8 implements su8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6688a;

    public du8(long j) {
        this.f6688a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof du8) && this.f6688a == ((du8) obj).f6688a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6688a);
    }

    public final String toString() {
        return axq.h(this.f6688a, "OnFavoriteClick(gameId=", Separators.RPAREN);
    }
}
