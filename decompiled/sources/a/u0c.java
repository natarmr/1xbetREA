package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class u0c implements w0c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34848a;

    public u0c(long j) {
        this.f34848a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0c) && this.f34848a == ((u0c) obj).f34848a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f34848a);
    }

    public final String toString() {
        return axq.h(this.f34848a, "Running(timeSeconds=", Separators.RPAREN);
    }
}
