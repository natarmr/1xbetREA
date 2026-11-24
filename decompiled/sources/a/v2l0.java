package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class v2l0 implements g3l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36690a;

    public v2l0(long j) {
        this.f36690a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2l0)) {
            return false;
        }
        long j = ((v2l0) obj).f36690a;
        int i = y3d.h;
        return h2t0.a(this.f36690a, j);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f36690a);
    }

    public final String toString() {
        return kng0.l("Chevron(iconColor=", y3d.i(this.f36690a), Separators.RPAREN);
    }
}
