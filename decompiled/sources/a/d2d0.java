package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class d2d0 implements f2d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5351a;
    public final long b;

    public d2d0(long j, long j2) {
        this.f5351a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2d0)) {
            return false;
        }
        d2d0 d2d0Var = (d2d0) obj;
        return this.f5351a == d2d0Var.f5351a && this.b == d2d0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f5351a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f5351a, "Content(dateStart=", ", dateEnd="));
    }
}
