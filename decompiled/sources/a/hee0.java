package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hee0 implements pee0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12920a;

    public hee0(long j) {
        this.f12920a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hee0) && this.f12920a == ((hee0) obj).f12920a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12920a);
    }

    public final String toString() {
        return axq.h(this.f12920a, "OnFavoriteClick(gameId=", Separators.RPAREN);
    }
}
