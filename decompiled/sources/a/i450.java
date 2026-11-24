package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class i450 implements j450 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14130a;

    public i450(long j) {
        this.f14130a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i450) && this.f14130a == ((i450) obj).f14130a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14130a);
    }

    public final String toString() {
        return axq.h(this.f14130a, "OnTopGameClick(gameId=", Separators.RPAREN);
    }
}
