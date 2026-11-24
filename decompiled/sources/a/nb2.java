package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class nb2 implements tb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23219a;

    public final boolean equals(Object obj) {
        if (obj instanceof nb2) {
            return this.f23219a == ((nb2) obj).f23219a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23219a);
    }

    public final String toString() {
        return axq.h(this.f23219a, "OnClickSport(value=", Separators.RPAREN);
    }
}
