package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lra implements qra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20520a;

    public lra(long j) {
        this.f20520a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lra) && this.f20520a == ((lra) obj).f20520a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20520a);
    }

    public final String toString() {
        return axq.h(this.f20520a, "OnEventCardClick(gameId=", Separators.RPAREN);
    }
}
