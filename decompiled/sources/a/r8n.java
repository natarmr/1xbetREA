package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class r8n implements s8n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30035a;

    public r8n(long j) {
        this.f30035a = j;
    }

    @Override // a.w8n
    public final long a() {
        return this.f30035a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8n)) {
            return false;
        }
        long j = ((r8n) obj).f30035a;
        int i = y3d.h;
        return h2t0.a(this.f30035a, j);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f30035a);
    }

    public final String toString() {
        return kng0.l("Right(activeCellColor=", y3d.i(this.f30035a), Separators.RPAREN);
    }
}
