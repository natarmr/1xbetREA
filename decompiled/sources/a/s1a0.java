package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class s1a0 implements w1a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31446a;

    public s1a0(long j) {
        this.f31446a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s1a0) && this.f31446a == ((s1a0) obj).f31446a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f31446a);
    }

    public final String toString() {
        return axq.h(this.f31446a, "OnPlayerClick(playerId=", Separators.RPAREN);
    }
}
