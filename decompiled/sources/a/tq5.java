package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class tq5 implements wq5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34365a;

    public tq5(long j) {
        this.f34365a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tq5) && this.f34365a == ((tq5) obj).f34365a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f34365a);
    }

    public final String toString() {
        return axq.h(this.f34365a, "OpenGame(gameId=", Separators.RPAREN);
    }
}
