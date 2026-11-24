package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class l1m implements m1m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19260a;
    public final long b;

    public l1m(long j, long j2) {
        this.f19260a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1m)) {
            return false;
        }
        l1m l1mVar = (l1m) obj;
        long j = l1mVar.f19260a;
        int i = y3d.h;
        return h2t0.a(this.f19260a, j) && h2t0.a(this.b, l1mVar.b);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.f19260a) * 31);
    }

    public final String toString() {
        return b1j.k("Outline(borderColor=", y3d.i(this.f19260a), ", backgroundColor=", y3d.i(this.b), Separators.RPAREN);
    }
}
