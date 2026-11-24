package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class thv implements uhv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33978a;

    public final boolean equals(Object obj) {
        if (obj instanceof thv) {
            return this.f33978a == ((thv) obj).f33978a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f33978a);
    }

    public final String toString() {
        return axq.h(this.f33978a, "OnGroupChipClick(id=", Separators.RPAREN);
    }
}
