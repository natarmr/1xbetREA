package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ljs implements mjs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20166a;

    public ljs(long j) {
        this.f20166a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ljs) && this.f20166a == ((ljs) obj).f20166a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20166a);
    }

    public final String toString() {
        return axq.h(this.f20166a, "UpdateBroadcasting(nextGameId=", Separators.RPAREN);
    }
}
