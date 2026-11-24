package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class i440 implements t440 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14128a;

    public i440(long j) {
        this.f14128a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i440) && this.f14128a == ((i440) obj).f14128a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14128a);
    }

    public final String toString() {
        return axq.h(this.f14128a, "CallbackOperatorRating(callbackId=", Separators.RPAREN);
    }
}
