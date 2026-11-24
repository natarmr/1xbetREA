package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class sdm implements bem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32040a;

    public sdm(long j) {
        this.f32040a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sdm) && this.f32040a == ((sdm) obj).f32040a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f32040a);
    }

    public final String toString() {
        return axq.h(this.f32040a, "OnAllMarketsBtnClicked(gameId=", Separators.RPAREN);
    }
}
