package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rxm0 implements sxm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31272a;

    public rxm0(long j) {
        this.f31272a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rxm0) && this.f31272a == ((rxm0) obj).f31272a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f31272a);
    }

    public final String toString() {
        return axq.h(this.f31272a, "SubGameSelected(subGameId=", Separators.RPAREN);
    }
}
