package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class onr implements pnr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25560a;

    public onr(long j) {
        this.f25560a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof onr) && this.f25560a == ((onr) obj).f25560a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25560a);
    }

    public final String toString() {
        return axq.h(this.f25560a, "UpdateBroadcasting(nextGameId=", Separators.RPAREN);
    }
}
