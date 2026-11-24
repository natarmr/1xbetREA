package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class xui0 implements bvi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41513a;

    public xui0(long j) {
        this.f41513a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xui0) && ne60.c(this.f41513a, ((xui0) obj).f41513a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f41513a);
    }

    public final String toString() {
        return kng0.l("OnDrag(offset=", ne60.h(this.f41513a), Separators.RPAREN);
    }
}
