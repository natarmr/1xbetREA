package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zr00 implements as00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44832a;

    public zr00(long j) {
        this.f44832a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zr00) && this.f44832a == ((zr00) obj).f44832a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f44832a);
    }

    public final String toString() {
        return axq.h(this.f44832a, "Enabled(timeToStart=", Separators.RPAREN);
    }
}
