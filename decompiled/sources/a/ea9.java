package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ea9 implements ha9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7456a;

    public ea9(long j) {
        this.f7456a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ea9) && this.f7456a == ((ea9) obj).f7456a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7456a);
    }

    public final String toString() {
        return axq.h(this.f7456a, "OnPlayerClick(playerId=", Separators.RPAREN);
    }
}
