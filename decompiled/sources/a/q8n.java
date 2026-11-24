package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class q8n implements s8n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28309a;

    public q8n(long j) {
        this.f28309a = j;
    }

    @Override // a.w8n
    public final long a() {
        return this.f28309a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8n)) {
            return false;
        }
        long j = ((q8n) obj).f28309a;
        int i = y3d.h;
        return h2t0.a(this.f28309a, j);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f28309a);
    }

    public final String toString() {
        return kng0.l("Left(activeCellColor=", y3d.i(this.f28309a), Separators.RPAREN);
    }
}
