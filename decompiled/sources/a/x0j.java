package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class x0j implements y0j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40072a;
    public final int b;
    public final int c;

    public x0j(int i, int i2, long j) {
        this.f40072a = j;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0j)) {
            return false;
        }
        x0j x0jVar = (x0j) obj;
        return this.f40072a == x0jVar.f40072a && this.b == x0jVar.b && this.c == x0jVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Long.hashCode(this.f40072a) * 31, 31);
    }

    public final String toString() {
        return vqd.p(brm0.q(this.b, this.f40072a, "SendResult(productId=", ", taskKindId="), ", progress=", this.c, Separators.RPAREN);
    }
}
