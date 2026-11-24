package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class hpm implements ipm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13450a;
    public final long b;

    public hpm(long j, int i) {
        pz40 pz40Var = s6t0.f31722a;
        long separator = s6t0.b().f33626a.getSeparator();
        j = (i & 2) != 0 ? s6t0.b().f33626a.getBackgroundContent() : j;
        this.f13450a = separator;
        this.b = j;
    }

    @Override // a.ipm
    public final long a() {
        return this.f13450a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpm)) {
            return false;
        }
        hpm hpmVar = (hpm) obj;
        long j = hpmVar.f13450a;
        int i = y3d.h;
        return h2t0.a(this.f13450a, j) && h2t0.a(this.b, hpmVar.b);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.f13450a) * 31);
    }

    public final String toString() {
        return b1j.k("Theme(borderColor=", y3d.i(this.f13450a), ", backgroundColor=", y3d.i(this.b), Separators.RPAREN);
    }
}
