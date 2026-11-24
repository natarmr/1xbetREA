package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class c6m0 implements e6m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3824a;

    public c6m0(long j) {
        this.f3824a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c6m0) && this.f3824a == ((c6m0) obj).f3824a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3824a);
    }

    public final String toString() {
        return axq.h(this.f3824a, "Measured(durationMillis=", Separators.RPAREN);
    }
}
