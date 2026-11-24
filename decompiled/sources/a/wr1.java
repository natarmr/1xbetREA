package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wr1 implements yr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39617a;

    public wr1(long j) {
        this.f39617a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wr1) && this.f39617a == ((wr1) obj).f39617a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f39617a);
    }

    public final String toString() {
        return axq.h(this.f39617a, "Stage(id=", Separators.RPAREN);
    }
}
