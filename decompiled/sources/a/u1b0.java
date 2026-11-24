package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class u1b0 implements b2b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34896a;

    public u1b0(long j) {
        this.f34896a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u1b0) && this.f34896a == ((u1b0) obj).f34896a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f34896a);
    }

    public final String toString() {
        return axq.h(this.f34896a, "OnCategoryClick(partitionId=", Separators.RPAREN);
    }
}
