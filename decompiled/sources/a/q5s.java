package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class q5s implements u5s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28167a;

    public q5s(long j) {
        this.f28167a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q5s) && this.f28167a == ((q5s) obj).f28167a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f28167a);
    }

    public final String toString() {
        return axq.h(this.f28167a, "NotFound(gameId=", Separators.RPAREN);
    }
}
