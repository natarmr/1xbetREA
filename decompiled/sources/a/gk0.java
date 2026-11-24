package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gk0 implements ik0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11424a;

    public gk0(long j) {
        this.f11424a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gk0) && this.f11424a == ((gk0) obj).f11424a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11424a);
    }

    public final String toString() {
        return axq.h(this.f11424a, "VirtualGameClick(gameId=", Separators.RPAREN);
    }
}
