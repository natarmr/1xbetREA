package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ufl0 implements dgl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35583a;

    public ufl0(long j) {
        this.f35583a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ufl0) && this.f35583a == ((ufl0) obj).f35583a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f35583a);
    }

    public final String toString() {
        return axq.h(this.f35583a, "OnLongClickMultiselect(sportId=", Separators.RPAREN);
    }
}
