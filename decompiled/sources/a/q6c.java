package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class q6c implements r6c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28192a;

    public q6c(long j) {
        this.f28192a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q6c) && this.f28192a == ((q6c) obj).f28192a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f28192a);
    }

    public final String toString() {
        return axq.h(this.f28192a, "Running(timeSeconds=", Separators.RPAREN);
    }
}
