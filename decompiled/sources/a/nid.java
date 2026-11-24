package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class nid implements uid {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23580a;

    public nid(long j) {
        this.f23580a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nid) && this.f23580a == ((nid) obj).f23580a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23580a);
    }

    public final String toString() {
        return axq.h(this.f23580a, "OnBroadcastSoonClick(gameId=", Separators.RPAREN);
    }
}
