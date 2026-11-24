package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class pid implements uid {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27037a;

    public pid(long j) {
        this.f27037a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pid) && this.f27037a == ((pid) obj).f27037a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f27037a);
    }

    public final String toString() {
        return axq.h(this.f27037a, "OnGameCardClick(gameId=", Separators.RPAREN);
    }
}
