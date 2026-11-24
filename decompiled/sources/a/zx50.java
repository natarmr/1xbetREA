package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zx50 implements by50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45142a;

    public zx50(long j) {
        this.f45142a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zx50) && this.f45142a == ((zx50) obj).f45142a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f45142a);
    }

    public final String toString() {
        return axq.h(this.f45142a, "OnAggregatorGameClick(gameId=", Separators.RPAREN);
    }
}
