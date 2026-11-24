package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class x7d0 implements a8d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40409a;

    public x7d0(long j) {
        this.f40409a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x7d0) && this.f40409a == ((x7d0) obj).f40409a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f40409a);
    }

    public final String toString() {
        return axq.h(this.f40409a, "OnGameClicked(gameId=", Separators.RPAREN);
    }
}
