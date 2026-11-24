package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28404a;

    public qan(long j) {
        this.f28404a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qan)) {
            return false;
        }
        long j = ((qan) obj).f28404a;
        int i = y3d.h;
        return h2t0.a(this.f28404a, j);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f28404a);
    }

    public final String toString() {
        return kng0.l("Solid(color=", y3d.i(this.f28404a), Separators.RPAREN);
    }
}
