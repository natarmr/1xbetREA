package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class eip implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final npo f7870a;

    public eip(npo npoVar) {
        this.f7870a = npoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eip) && this.f7870a == ((eip) obj).f7870a;
    }

    public final int hashCode() {
        return this.f7870a.hashCode();
    }

    public final String toString() {
        return "FeedContentShimmerUiModel(sportExpressCardShimmerStyle=" + this.f7870a + Separators.RPAREN;
    }
}
