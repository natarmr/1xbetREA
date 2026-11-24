package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class g75 implements k75 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10798a;

    public g75(long j) {
        this.f10798a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g75) && this.f10798a == ((g75) obj).f10798a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10798a);
    }

    public final String toString() {
        return axq.h(this.f10798a, "OnGameClicked(gameId=", Separators.RPAREN);
    }
}
