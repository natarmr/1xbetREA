package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class o5s implements v5s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24703a;

    public o5s(long j) {
        this.f24703a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o5s) && this.f24703a == ((o5s) obj).f24703a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f24703a);
    }

    public final String toString() {
        return axq.h(this.f24703a, "Found(gameId=", Separators.RPAREN);
    }
}
