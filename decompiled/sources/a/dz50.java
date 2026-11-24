package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dz50 implements iz50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6925a;

    public dz50(long j) {
        this.f6925a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dz50) && this.f6925a == ((dz50) obj).f6925a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6925a);
    }

    public final String toString() {
        return axq.h(this.f6925a, "OnMenuActionSelected(gameId=", Separators.RPAREN);
    }
}
