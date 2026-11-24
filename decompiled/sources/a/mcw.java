package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class mcw implements scw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21568a;

    public mcw(long j) {
        this.f21568a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mcw) && this.f21568a == ((mcw) obj).f21568a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21568a);
    }

    public final String toString() {
        return axq.h(this.f21568a, "OnBetLongClick(playerId=", Separators.RPAREN);
    }
}
