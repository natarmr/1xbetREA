package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fmp implements smp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9795a;

    public fmp(long j) {
        this.f9795a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fmp) && this.f9795a == ((fmp) obj).f9795a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9795a);
    }

    public final String toString() {
        return axq.h(this.f9795a, "OnFavoriteBtnClicked(gameId=", Separators.RPAREN);
    }
}
