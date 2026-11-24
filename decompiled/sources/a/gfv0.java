package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class gfv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11225a;

    public gfv0(long j) {
        this.f11225a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gfv0) && this.f11225a == ((gfv0) obj).f11225a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11225a);
    }

    public final String toString() {
        return axq.h(this.f11225a, "PostGameSelectResult(gameId=", Separators.RPAREN);
    }
}
