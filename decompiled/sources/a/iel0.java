package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class iel0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14639a;

    public final boolean equals(Object obj) {
        if (obj instanceof iel0) {
            return this.f14639a == ((iel0) obj).f14639a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14639a);
    }

    public final String toString() {
        return axq.h(this.f14639a, "SportId(value=", Separators.RPAREN);
    }
}
