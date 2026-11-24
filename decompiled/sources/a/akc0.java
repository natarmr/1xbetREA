package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class akc0 implements bkc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1017a;

    public akc0(long j) {
        this.f1017a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof akc0) && this.f1017a == ((akc0) obj).f1017a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1017a);
    }

    public final String toString() {
        return axq.h(this.f1017a, "SendGameUMResult(gameId=", Separators.RPAREN);
    }
}
