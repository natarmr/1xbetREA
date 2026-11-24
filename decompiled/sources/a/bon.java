package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class bon implements gon {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2941a;

    public final boolean equals(Object obj) {
        if (obj instanceof bon) {
            return this.f2941a == ((bon) obj).f2941a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2941a);
    }

    public final String toString() {
        return axq.h(this.f2941a, "OnMarketsGroupHeaderClick(groupId=", Separators.RPAREN);
    }
}
