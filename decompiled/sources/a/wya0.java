package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wya0 implements aza0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39965a;

    public wya0(long j) {
        this.f39965a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wya0) && this.f39965a == ((wya0) obj).f39965a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f39965a);
    }

    public final String toString() {
        return axq.h(this.f39965a, "OnPromoGameClick(gameId=", Separators.RPAREN);
    }
}
