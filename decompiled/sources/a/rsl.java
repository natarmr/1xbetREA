package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rsl implements ssl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31037a;
    public final long b;

    public rsl(long j, long j2) {
        this.f31037a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rsl)) {
            return false;
        }
        rsl rslVar = (rsl) obj;
        long j = rslVar.f31037a;
        int i = y3d.h;
        return h2t0.a(this.f31037a, j) && h2t0.a(this.b, rslVar.b);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.f31037a) * 31);
    }

    public final String toString() {
        return b1j.k("Outline(borderColor=", y3d.i(this.f31037a), ", backgroundColor=", y3d.i(this.b), Separators.RPAREN);
    }
}
