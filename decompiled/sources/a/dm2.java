package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dm2 implements hm2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6305a;

    public dm2(long j) {
        this.f6305a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dm2) && this.f6305a == ((dm2) obj).f6305a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6305a);
    }

    public final String toString() {
        return axq.h(this.f6305a, "OnOneXGamesGameUMResultReceive(gameId=", Separators.RPAREN);
    }
}
