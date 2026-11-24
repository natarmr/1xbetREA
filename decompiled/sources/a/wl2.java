package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wl2 implements yl2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39335a;

    public wl2(long j) {
        this.f39335a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wl2) && this.f39335a == ((wl2) obj).f39335a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f39335a);
    }

    public final String toString() {
        return axq.h(this.f39335a, "OnSelectTab(id=", Separators.RPAREN);
    }
}
