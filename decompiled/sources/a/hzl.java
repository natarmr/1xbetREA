package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hzl implements mzl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13912a;

    public hzl(long j) {
        this.f13912a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hzl) && this.f13912a == ((hzl) obj).f13912a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13912a);
    }

    public final String toString() {
        return axq.h(this.f13912a, "OnAllMarketsBtnClicked(gameId=", Separators.RPAREN);
    }
}
