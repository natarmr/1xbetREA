package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class mc9 implements oc9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21540a;

    public mc9(long j) {
        this.f21540a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mc9) && this.f21540a == ((mc9) obj).f21540a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21540a);
    }

    public final String toString() {
        return axq.h(this.f21540a, "OnCancelOutComeClick(eventId=", Separators.RPAREN);
    }
}
