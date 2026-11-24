package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zfl0 implements dgl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44305a;

    public zfl0(long j) {
        this.f44305a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zfl0) && this.f44305a == ((zfl0) obj).f44305a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f44305a);
    }

    public final String toString() {
        return axq.h(this.f44305a, "SelectionChanged(sportId=", Separators.RPAREN);
    }
}
