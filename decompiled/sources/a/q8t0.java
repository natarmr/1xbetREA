package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class q8t0 implements u8t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28315a;

    public q8t0(long j) {
        this.f28315a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q8t0) && this.f28315a == ((q8t0) obj).f28315a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f28315a);
    }

    public final String toString() {
        return axq.h(this.f28315a, "OnResultCardClick(gameId=", Separators.RPAREN);
    }
}
