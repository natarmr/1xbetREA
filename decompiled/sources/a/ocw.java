package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ocw implements scw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25048a;

    public ocw(long j) {
        this.f25048a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ocw) && this.f25048a == ((ocw) obj).f25048a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25048a);
    }

    public final String toString() {
        return axq.h(this.f25048a, "OnHeaderMainNominationClick(nominationId=", Separators.RPAREN);
    }
}
