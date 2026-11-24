package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class y1c implements a2c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41848a;

    public y1c(long j) {
        this.f41848a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y1c) && this.f41848a == ((y1c) obj).f41848a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f41848a);
    }

    public final String toString() {
        return axq.h(this.f41848a, "TooBig(limitSize=", Separators.RPAREN);
    }
}
