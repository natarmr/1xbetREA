package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class l7v0 implements n7v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19579a;

    public l7v0(long j) {
        this.f19579a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l7v0) && this.f19579a == ((l7v0) obj).f19579a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19579a);
    }

    public final String toString() {
        return axq.h(this.f19579a, "OnRatingCellClick(id=", Separators.RPAREN);
    }
}
