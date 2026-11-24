package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class eko0 implements fko0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7963a;

    public eko0(long j) {
        this.f7963a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eko0)) {
            return false;
        }
        long j = ((eko0) obj).f7963a;
        int i = y3d.h;
        return h2t0.a(this.f7963a, j);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f7963a);
    }

    public final String toString() {
        return kng0.l("Filled(color=", y3d.i(this.f7963a), Separators.RPAREN);
    }
}
