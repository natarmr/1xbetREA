package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class b2z implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f1877a;
    public final int b;
    public final int c;

    /* JADX WARN: Type inference failed for: r3v1, types: [byte, int] */
    public b2z(int i, int i2, long j) {
        this.f1877a = (int) j;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2z)) {
            return false;
        }
        b2z b2zVar = (b2z) obj;
        return ((long) this.f1877a) == ((long) b2zVar.f1877a) && this.b == b2zVar.b && this.c == b2zVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Long.hashCode(this.f1877a) * 31, 31);
    }

    public final String toString() {
        return vqd.p(brm0.q(this.b, this.f1877a, "LastMatchesFooterUiModel(id=", ", imageRes="), ", background=", this.c, Separators.RPAREN);
    }
}
