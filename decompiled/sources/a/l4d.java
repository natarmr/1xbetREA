package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class l4d extends mbc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19399a;
    public final long b;

    public l4d(long j, long j2) {
        this.f19399a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4d)) {
            return false;
        }
        l4d l4dVar = (l4d) obj;
        long j = l4dVar.f19399a;
        int i = y3d.h;
        return h2t0.a(this.f19399a, j) && h2t0.a(this.b, l4dVar.b);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.f19399a) * 31);
    }

    public final String toString() {
        return b1j.k("TwoTone(firstColor=", y3d.i(this.f19399a), ", secondColor=", y3d.i(this.b), Separators.RPAREN);
    }
}
