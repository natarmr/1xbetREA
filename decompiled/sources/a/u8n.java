package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class u8n implements v8n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35238a;

    public u8n(long j) {
        this.f35238a = j;
    }

    @Override // a.w8n
    public final long a() {
        return this.f35238a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8n)) {
            return false;
        }
        long j = ((u8n) obj).f35238a;
        int i = y3d.h;
        return h2t0.a(this.f35238a, j);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f35238a);
    }

    public final String toString() {
        return kng0.l("Right(activeCellColor=", y3d.i(this.f35238a), Separators.RPAREN);
    }
}
