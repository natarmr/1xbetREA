package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class p1m implements s1m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26209a;
    public final long b;

    public p1m(long j, long j2) {
        this.f26209a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1m)) {
            return false;
        }
        p1m p1mVar = (p1m) obj;
        long j = p1mVar.f26209a;
        int i = y3d.h;
        return h2t0.a(this.f26209a, j) && h2t0.a(this.b, p1mVar.b);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.f26209a) * 31);
    }

    public final String toString() {
        return b1j.k("FilledS(backgroundColor=", y3d.i(this.f26209a), ", iconTint=", y3d.i(this.b), Separators.RPAREN);
    }
}
