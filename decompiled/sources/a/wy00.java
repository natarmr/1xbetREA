package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wy00 implements yy00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39955a;

    public final boolean equals(Object obj) {
        if (obj instanceof wy00) {
            return this.f39955a == ((wy00) obj).f39955a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f39955a);
    }

    public final String toString() {
        return axq.h(this.f39955a, "OnTabClick(value=", Separators.RPAREN);
    }
}
