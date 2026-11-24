package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class tdc0 implements wdc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33762a;

    public tdc0(long j) {
        this.f33762a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tdc0) && this.f33762a == ((tdc0) obj).f33762a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f33762a);
    }

    public final String toString() {
        return axq.h(this.f33762a, "SelectFilterById(id=", Separators.RPAREN);
    }
}
