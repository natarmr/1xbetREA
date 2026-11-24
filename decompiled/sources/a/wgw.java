package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wgw implements whw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39136a;

    public wgw(long j) {
        this.f39136a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wgw) && this.f39136a == ((wgw) obj).f39136a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f39136a);
    }

    public final String toString() {
        return axq.h(this.f39136a, "OnChampLiveGamesClick(champId=", Separators.RPAREN);
    }
}
