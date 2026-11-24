package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class y1b0 implements b2b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41847a;

    public y1b0(long j) {
        this.f41847a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y1b0) && this.f41847a == ((y1b0) obj).f41847a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f41847a);
    }

    public final String toString() {
        return axq.h(this.f41847a, "OnPromoGameClick(id=", Separators.RPAREN);
    }
}
