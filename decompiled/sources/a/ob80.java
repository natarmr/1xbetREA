package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ob80 implements ac80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24966a;

    public ob80(long j) {
        this.f24966a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ob80) && this.f24966a == ((ob80) obj).f24966a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f24966a);
    }

    public final String toString() {
        return axq.h(this.f24966a, "OnRemoveFromAggregatorClicked(gameId=", Separators.RPAREN);
    }
}
