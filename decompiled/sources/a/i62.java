package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class i62 implements s62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14221a;

    public i62(long j) {
        this.f14221a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i62) && this.f14221a == ((i62) obj).f14221a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14221a);
    }

    public final String toString() {
        return axq.h(this.f14221a, "OnClickChamp(id=", Separators.RPAREN);
    }
}
