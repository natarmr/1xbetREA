package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class l2l0 implements m2l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19315a;

    public l2l0(long j) {
        this.f19315a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l2l0) && ne60.c(this.f19315a, ((l2l0) obj).f19315a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f19315a);
    }

    public final String toString() {
        return kng0.l("OnDragStart(offset=", ne60.h(this.f19315a), Separators.RPAREN);
    }
}
