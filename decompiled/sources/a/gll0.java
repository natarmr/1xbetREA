package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class gll0 implements ill0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11497a;

    public gll0(long j) {
        this.f11497a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gll0) && this.f11497a == ((gll0) obj).f11497a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11497a);
    }

    public final String toString() {
        return axq.h(this.f11497a, "OnExpandInfoClick(gameId=", Separators.RPAREN);
    }
}
