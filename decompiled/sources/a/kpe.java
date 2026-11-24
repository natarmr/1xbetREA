package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class kpe implements ope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18670a;
    public final long b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kpe() {
        this(s6t0.b().f33626a.getBackgroundGroup(), s6t0.b().f33626a.getSecondary());
        pz40 pz40Var = s6t0.f31722a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpe)) {
            return false;
        }
        kpe kpeVar = (kpe) obj;
        long j = kpeVar.f18670a;
        int i = y3d.h;
        return h2t0.a(this.f18670a, j) && h2t0.a(this.b, kpeVar.b);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.f18670a) * 31);
    }

    public final String toString() {
        return b1j.k("Secondary(backgroundColor=", y3d.i(this.f18670a), ", textColor=", y3d.i(this.b), Separators.RPAREN);
    }

    public kpe(long j, long j2) {
        this.f18670a = j;
        this.b = j2;
    }
}
