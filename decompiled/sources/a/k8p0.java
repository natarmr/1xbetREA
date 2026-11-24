package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class k8p0 implements m8p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17884a;

    public k8p0(long j) {
        this.f17884a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k8p0) && this.f17884a == ((k8p0) obj).f17884a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17884a);
    }

    public final String toString() {
        return axq.h(this.f17884a, "OnTopInfoCellClick(cellId=", Separators.RPAREN);
    }
}
