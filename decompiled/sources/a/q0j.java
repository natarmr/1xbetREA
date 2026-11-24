package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class q0j implements t0j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27901a;
    public final int b;
    public final int c;

    public q0j(int i, int i2, long j) {
        this.f27901a = j;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0j)) {
            return false;
        }
        q0j q0jVar = (q0j) obj;
        return this.f27901a == q0jVar.f27901a && this.b == q0jVar.b && this.c == q0jVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Long.hashCode(this.f27901a) * 31, 31);
    }

    public final String toString() {
        return vqd.p(brm0.q(this.b, this.f27901a, "Launch(productId=", ", taskKindId="), ", progress=", this.c, Separators.RPAREN);
    }
}
