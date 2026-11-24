package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class wck0 implements xck0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38928a;

    public wck0(long j) {
        this.f38928a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wck0) && this.f38928a == ((wck0) obj).f38928a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f38928a);
    }

    public final String toString() {
        return axq.h(this.f38928a, "Timer(timeInSeconds=", Separators.RPAREN);
    }
}
