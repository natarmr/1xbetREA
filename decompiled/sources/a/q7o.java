package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class q7o implements r7o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28260a;

    public q7o(long j) {
        this.f28260a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q7o) && this.f28260a == ((q7o) obj).f28260a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f28260a);
    }

    public final String toString() {
        return axq.h(this.f28260a, "OnTabClick(id=", Separators.RPAREN);
    }
}
