package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class l1d0 extends o1d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19247a;

    public l1d0(long j) {
        this.f19247a = j;
    }

    @Override // a.o1d0
    public final long a() {
        return this.f19247a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1d0) && this.f19247a == ((l1d0) obj).f19247a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19247a);
    }

    public final String toString() {
        return axq.h(this.f19247a, "None(requestTimeMillis=", Separators.RPAREN);
    }
}
