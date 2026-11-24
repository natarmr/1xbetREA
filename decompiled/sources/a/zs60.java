package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zs60 implements tt60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44892a;

    public zs60(long j) {
        this.f44892a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zs60) && this.f44892a == ((zs60) obj).f44892a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f44892a);
    }

    public final String toString() {
        return axq.h(this.f44892a, "OnGameUMResultReceive(gameId=", Separators.RPAREN);
    }
}
