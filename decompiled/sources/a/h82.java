package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class h82 implements i82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12605a;

    public h82(long j) {
        this.f12605a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h82) && this.f12605a == ((h82) obj).f12605a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12605a);
    }

    public final String toString() {
        return axq.h(this.f12605a, "OnTabSelected(position=", Separators.RPAREN);
    }
}
