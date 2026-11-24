package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lcw implements scw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19819a;

    public lcw(long j) {
        this.f19819a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lcw) && this.f19819a == ((lcw) obj).f19819a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19819a);
    }

    public final String toString() {
        return axq.h(this.f19819a, "OnBetClick(playerId=", Separators.RPAREN);
    }
}
