package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class i4d extends pm80 {
    public final long f;
    public float g = 1.0f;
    public a4d h;

    public i4d(long j) {
        this.f = j;
    }

    @Override // a.pm80
    public final boolean a(float f) {
        this.g = f;
        return true;
    }

    @Override // a.pm80
    public final boolean b(a4d a4dVar) {
        this.h = a4dVar;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4d)) {
            return false;
        }
        long j = ((i4d) obj).f;
        int i = y3d.h;
        return h2t0.a(this.f, j);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f);
    }

    @Override // a.pm80
    public final void j(fhl fhlVar) {
        fhl.u(fhlVar, this.f, 0L, 0L, this.g, null, this.h, 0, 86);
    }

    public final String toString() {
        return kng0.l("ColorPainter(color=", y3d.i(this.f), Separators.RPAREN);
    }
}
