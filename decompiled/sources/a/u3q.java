package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class u3q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35010a;
    public final long b;

    public u3q(long j, long j2) {
        this.f35010a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3q)) {
            return false;
        }
        u3q u3qVar = (u3q) obj;
        return this.f35010a == u3qVar.f35010a && this.b == u3qVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f35010a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f35010a, "FilterSwipeXParams(expandSportId=", ", expandSubSportId="));
    }
}
