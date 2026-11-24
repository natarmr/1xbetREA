package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class r3j implements z3j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29791a;

    public r3j(long j) {
        this.f29791a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r3j) && this.f29791a == ((r3j) obj).f29791a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f29791a);
    }

    public final String toString() {
        return axq.h(this.f29791a, "OnClickActivate(taskId=", Separators.RPAREN);
    }
}
