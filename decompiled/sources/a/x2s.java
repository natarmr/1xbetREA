package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class x2s implements y2s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40184a;

    public x2s(long j) {
        this.f40184a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x2s) && this.f40184a == ((x2s) obj).f40184a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f40184a);
    }

    public final String toString() {
        return axq.h(this.f40184a, "UpdateBroadcasting(nextGameId=", Separators.RPAREN);
    }
}
