package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jmt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16781a;

    public jmt0(long j) {
        this.f16781a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jmt0) && this.f16781a == ((jmt0) obj).f16781a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16781a);
    }

    public final String toString() {
        return axq.h(this.f16781a, "UpdateSlowModeEvent(slowModeDelaySec=", Separators.RPAREN);
    }
}
