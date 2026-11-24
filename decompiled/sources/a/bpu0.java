package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bpu0 implements cpu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3001a;

    public bpu0(long j) {
        this.f3001a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bpu0) && this.f3001a == ((bpu0) obj).f3001a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3001a);
    }

    public final String toString() {
        return axq.h(this.f3001a, "OnSubHeaderClick(id=", Separators.RPAREN);
    }
}
