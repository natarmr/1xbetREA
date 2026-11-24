package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class o5z implements q5z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24708a;

    public o5z(long j) {
        this.f24708a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o5z) && this.f24708a == ((o5z) obj).f24708a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f24708a);
    }

    public final String toString() {
        return axq.h(this.f24708a, "Error(gameId=", Separators.RPAREN);
    }
}
