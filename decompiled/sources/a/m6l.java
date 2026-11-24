package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class m6l extends jwb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21276a;

    public m6l(long j) {
        this.f21276a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m6l) && this.f21276a == ((m6l) obj).f21276a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21276a);
    }

    public final String toString() {
        return axq.h(this.f21276a, "Available(seconds=", Separators.RPAREN);
    }
}
