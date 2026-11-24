package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class avi0 implements bvi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1526a;

    public avi0(long j) {
        this.f1526a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof avi0) && ne60.c(this.f1526a, ((avi0) obj).f1526a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f1526a);
    }

    public final String toString() {
        return kng0.l("OnDragStart(offset=", ne60.h(this.f1526a), Separators.RPAREN);
    }
}
