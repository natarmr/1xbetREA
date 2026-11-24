package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class tid implements uid {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34002a;

    public tid(long j) {
        this.f34002a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tid) && this.f34002a == ((tid) obj).f34002a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f34002a);
    }

    public final String toString() {
        return axq.h(this.f34002a, "OnZoneClick(gameId=", Separators.RPAREN);
    }
}
