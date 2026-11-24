package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class d4z implements f4z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5479a;

    public d4z(long j) {
        this.f5479a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d4z) && this.f5479a == ((d4z) obj).f5479a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5479a);
    }

    public final String toString() {
        return axq.h(this.f5479a, "Error(gameId=", Separators.RPAREN);
    }
}
