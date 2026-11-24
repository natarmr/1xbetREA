package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hbt0 implements ibt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12787a;

    public hbt0(long j) {
        this.f12787a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hbt0) && this.f12787a == ((hbt0) obj).f12787a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12787a);
    }

    public final String toString() {
        return axq.h(this.f12787a, "OnResultCardClick(gameId=", Separators.RPAREN);
    }
}
