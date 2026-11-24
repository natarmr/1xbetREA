package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class p7s implements q7s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26521a;

    public final boolean equals(Object obj) {
        if (obj instanceof p7s) {
            return this.f26521a == ((p7s) obj).f26521a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f26521a);
    }

    public final String toString() {
        return axq.h(this.f26521a, "UpdateBroadcasting(nextGameId=", Separators.RPAREN);
    }
}
