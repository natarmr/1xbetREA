package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class eon implements gon {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8145a;

    public final boolean equals(Object obj) {
        if (obj instanceof eon) {
            return this.f8145a == ((eon) obj).f8145a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8145a);
    }

    public final String toString() {
        return axq.h(this.f8145a, "OnPinMarketsGroupClick(groupId=", Separators.RPAREN);
    }
}
