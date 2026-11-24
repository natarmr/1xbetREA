package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class h450 implements j450 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12419a;

    public h450(long j) {
        this.f12419a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h450) && this.f12419a == ((h450) obj).f12419a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12419a);
    }

    public final String toString() {
        return axq.h(this.f12419a, "OnSpinnerCardsClick(gameId=", Separators.RPAREN);
    }
}
