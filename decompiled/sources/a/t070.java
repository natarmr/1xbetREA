package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class t070 implements j170 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33106a;

    public t070(long j) {
        this.f33106a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t070) && this.f33106a == ((t070) obj).f33106a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f33106a);
    }

    public final String toString() {
        return axq.h(this.f33106a, "OnGameUMResultReceive(gameId=", Separators.RPAREN);
    }
}
