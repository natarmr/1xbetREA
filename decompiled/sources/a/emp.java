package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class emp implements smp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8059a;

    public emp(long j) {
        this.f8059a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof emp) && this.f8059a == ((emp) obj).f8059a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8059a);
    }

    public final String toString() {
        return axq.h(this.f8059a, "OnExpandGamesClick(id=", Separators.RPAREN);
    }
}
