package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ga0 implements qa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10942a;

    public ga0(long j) {
        this.f10942a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ga0) && this.f10942a == ((ga0) obj).f10942a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10942a);
    }

    public final String toString() {
        return axq.h(this.f10942a, "OnAddAggregatorClicked(gameId=", Separators.RPAREN);
    }
}
