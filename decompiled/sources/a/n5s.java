package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class n5s implements u5s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22959a;

    public n5s(long j) {
        this.f22959a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n5s) && this.f22959a == ((n5s) obj).f22959a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22959a);
    }

    public final String toString() {
        return axq.h(this.f22959a, "Found(gameId=", Separators.RPAREN);
    }
}
