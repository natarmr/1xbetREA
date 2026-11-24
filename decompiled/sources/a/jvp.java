package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jvp implements kvp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17214a;

    public jvp(long j) {
        this.f17214a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jvp) && this.f17214a == ((jvp) obj).f17214a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17214a);
    }

    public final String toString() {
        return axq.h(this.f17214a, "OnTabClick(tabId=", Separators.RPAREN);
    }
}
