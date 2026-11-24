package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class pbn implements qbn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26716a;

    public final boolean equals(Object obj) {
        if (obj instanceof pbn) {
            return this.f26716a == ((pbn) obj).f26716a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f26716a);
    }

    public final String toString() {
        return axq.h(this.f26716a, "OnPlayerClick(playerId=", Separators.RPAREN);
    }
}
