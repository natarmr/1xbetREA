package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dxm0 implements exm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6854a;

    public dxm0(long j) {
        this.f6854a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dxm0) && this.f6854a == ((dxm0) obj).f6854a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6854a);
    }

    public final String toString() {
        return axq.h(this.f6854a, "OnSubGameSelected(id=", Separators.RPAREN);
    }
}
