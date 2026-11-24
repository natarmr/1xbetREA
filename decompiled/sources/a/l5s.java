package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class l5s implements u5s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19474a;
    public final long b;

    public l5s(long j, long j2) {
        this.f19474a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5s)) {
            return false;
        }
        l5s l5sVar = (l5s) obj;
        return this.f19474a == l5sVar.f19474a && this.b == l5sVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f19474a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f19474a, "Finished(gameId=", ", sportId="));
    }
}
