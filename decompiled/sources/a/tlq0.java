package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class tlq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34159a;

    public final boolean equals(Object obj) {
        if (obj instanceof tlq0) {
            return this.f34159a == ((tlq0) obj).f34159a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f34159a);
    }

    public final String toString() {
        return axq.h(this.f34159a, "TimeStart(value=", Separators.RPAREN);
    }
}
