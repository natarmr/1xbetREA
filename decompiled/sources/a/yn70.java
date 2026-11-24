package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class yn70 extends io70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42925a;

    public yn70(long j) {
        this.f42925a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yn70) && this.f42925a == ((yn70) obj).f42925a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f42925a);
    }

    public final String toString() {
        return axq.h(this.f42925a, "SendGameUMResult(gameId=", Separators.RPAREN);
    }
}
