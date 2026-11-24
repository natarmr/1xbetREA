package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class te8 implements bf8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33806a;

    public te8(long j) {
        this.f33806a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof te8) && this.f33806a == ((te8) obj).f33806a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f33806a);
    }

    public final String toString() {
        return axq.h(this.f33806a, "OnGameUMResultReceive(gameId=", Separators.RPAREN);
    }
}
