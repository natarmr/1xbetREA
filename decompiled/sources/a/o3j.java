package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class o3j implements z3j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24588a;

    public o3j(long j) {
        this.f24588a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o3j) && this.f24588a == ((o3j) obj).f24588a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f24588a);
    }

    public final String toString() {
        return axq.h(this.f24588a, "OnActionButtonClick(id=", Separators.RPAREN);
    }
}
