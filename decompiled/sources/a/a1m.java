package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class a1m implements d1m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f76a;
    public final long b;

    public a1m(long j, long j2) {
        this.f76a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1m)) {
            return false;
        }
        a1m a1mVar = (a1m) obj;
        long j = a1mVar.f76a;
        int i = y3d.h;
        return h2t0.a(this.f76a, j) && h2t0.a(this.b, a1mVar.b);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.f76a) * 31);
    }

    public final String toString() {
        return b1j.k("FilledS(backgroundColor=", y3d.i(this.f76a), ", iconTint=", y3d.i(this.b), Separators.RPAREN);
    }
}
