package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class zal0 implements abl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44075a;

    public zal0(long j) {
        this.f44075a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zal0) && this.f44075a == ((zal0) obj).f44075a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f44075a);
    }

    public final String toString() {
        return axq.h(this.f44075a, "UpdateBroadcasting(nextGameId=", Separators.RPAREN);
    }
}
