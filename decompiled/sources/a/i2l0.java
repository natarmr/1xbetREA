package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class i2l0 implements m2l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14054a;

    public i2l0(long j) {
        this.f14054a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i2l0) && ne60.c(this.f14054a, ((i2l0) obj).f14054a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f14054a);
    }

    public final String toString() {
        return kng0.l("OnDrag(offset=", ne60.h(this.f14054a), Separators.RPAREN);
    }
}
