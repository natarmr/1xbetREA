package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class zyh0 implements ezh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45206a;

    public zyh0(long j) {
        this.f45206a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zyh0) && this.f45206a == ((zyh0) obj).f45206a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f45206a);
    }

    public final String toString() {
        return axq.h(this.f45206a, "OnBetClick(playerId=", Separators.RPAREN);
    }
}
