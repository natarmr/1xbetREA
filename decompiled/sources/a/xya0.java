package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xya0 implements aza0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41698a;

    public xya0(long j) {
        this.f41698a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xya0) && this.f41698a == ((xya0) obj).f41698a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f41698a);
    }

    public final String toString() {
        return axq.h(this.f41698a, "OnPromoGameFavoriteClick(gameId=", Separators.RPAREN);
    }
}
