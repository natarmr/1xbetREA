package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class fu8 implements su8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10150a;

    public fu8(long j) {
        this.f10150a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fu8) && this.f10150a == ((fu8) obj).f10150a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10150a);
    }

    public final String toString() {
        return axq.h(this.f10150a, "OnGameClick(gameId=", Separators.RPAREN);
    }
}
