package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ii6 implements ji6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14814a;

    public ii6(long j) {
        this.f14814a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ii6) && this.f14814a == ((ii6) obj).f14814a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14814a);
    }

    public final String toString() {
        return axq.h(this.f14814a, "LoadedEmpty(selectedSubGameId=", Separators.RPAREN);
    }
}
