package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mb70 implements pb70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21494a;

    public mb70(long j) {
        this.f21494a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mb70) && this.f21494a == ((mb70) obj).f21494a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21494a);
    }

    public final String toString() {
        return axq.h(this.f21494a, "SendResultGameUM(gameId=", Separators.RPAREN);
    }
}
