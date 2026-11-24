package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class erk0 implements ork0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8286a;

    public erk0(long j) {
        this.f8286a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof erk0) && this.f8286a == ((erk0) obj).f8286a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8286a);
    }

    public final String toString() {
        return axq.h(this.f8286a, "OnSportClick(filterId=", Separators.RPAREN);
    }
}
