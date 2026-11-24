package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kya0 implements aza0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19098a;

    public kya0(long j) {
        this.f19098a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kya0) && this.f19098a == ((kya0) obj).f19098a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19098a);
    }

    public final String toString() {
        return axq.h(this.f19098a, "OnOpenBannerGame(gameId=", Separators.RPAREN);
    }
}
