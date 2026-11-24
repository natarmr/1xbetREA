package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class oc2 implements uc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25008a;

    public final boolean equals(Object obj) {
        if (obj instanceof oc2) {
            return this.f25008a == ((oc2) obj).f25008a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25008a);
    }

    public final String toString() {
        return axq.h(this.f25008a, "OnClickSport(values=", Separators.RPAREN);
    }
}
