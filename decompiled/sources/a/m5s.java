package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class m5s implements v5s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21234a;
    public final long b;

    public m5s(long j, long j2) {
        this.f21234a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5s)) {
            return false;
        }
        m5s m5sVar = (m5s) obj;
        return this.f21234a == m5sVar.f21234a && this.b == m5sVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f21234a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f21234a, "Finished(gameId=", ", sportId="));
    }
}
