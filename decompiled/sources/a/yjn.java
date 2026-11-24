package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class yjn implements bkn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42748a;

    public final boolean equals(Object obj) {
        if (obj instanceof yjn) {
            return this.f42748a == ((yjn) obj).f42748a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f42748a);
    }

    public final String toString() {
        return axq.h(this.f42748a, "OnEachWayClick(gameId=", Separators.RPAREN);
    }
}
