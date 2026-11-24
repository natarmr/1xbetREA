package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class g5d implements e8q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10711a;

    public g5d(long j) {
        this.f10711a = j;
        if (j != 16) {
            return;
        }
        ycx.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5d)) {
            return false;
        }
        long j = ((g5d) obj).f10711a;
        int i = y3d.h;
        return h2t0.a(this.f10711a, j);
    }

    @Override // a.e8q0
    public final float g() {
        return y3d.d(this.f10711a);
    }

    @Override // a.e8q0
    public final long h() {
        return this.f10711a;
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f10711a);
    }

    @Override // a.e8q0
    public final t89 l() {
        return null;
    }

    public final String toString() {
        return kng0.l("ColorStyle(value=", y3d.i(this.f10711a), Separators.RPAREN);
    }
}
