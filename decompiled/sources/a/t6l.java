package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class t6l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33422a;

    public final boolean equals(Object obj) {
        if (obj instanceof t6l) {
            return this.f33422a == ((t6l) obj).f33422a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f33422a);
    }

    public final String toString() {
        return axq.h(this.f33422a, "RespawnTime(value=", Separators.RPAREN);
    }
}
