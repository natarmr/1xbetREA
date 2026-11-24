package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vt80 implements cu80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37993a;

    public vt80(long j) {
        this.f37993a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vt80) && this.f37993a == ((vt80) obj).f37993a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f37993a);
    }

    public final String toString() {
        return axq.h(this.f37993a, "OnGameClick(gameId=", Separators.RPAREN);
    }
}
