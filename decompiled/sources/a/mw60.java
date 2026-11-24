package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mw60 implements bx60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22489a;

    public mw60(long j) {
        this.f22489a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mw60) && this.f22489a == ((mw60) obj).f22489a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22489a);
    }

    public final String toString() {
        return axq.h(this.f22489a, "OnGameUMResultReceive(gameId=", Separators.RPAREN);
    }
}
