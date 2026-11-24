package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hp60 implements vp60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13428a;

    public hp60(long j) {
        this.f13428a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hp60) && this.f13428a == ((hp60) obj).f13428a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13428a);
    }

    public final String toString() {
        return axq.h(this.f13428a, "OnGameUMResultReceive(gameId=", Separators.RPAREN);
    }
}
