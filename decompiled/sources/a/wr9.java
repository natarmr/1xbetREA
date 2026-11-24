package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wr9 implements as9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39628a;

    public wr9(long j) {
        this.f39628a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wr9) && this.f39628a == ((wr9) obj).f39628a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f39628a);
    }

    public final String toString() {
        return axq.h(this.f39628a, "ShowCallbackOperatorRatingDialog(callId=", Separators.RPAREN);
    }
}
