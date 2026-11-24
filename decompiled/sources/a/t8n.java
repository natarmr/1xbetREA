package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class t8n implements v8n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33519a;

    public t8n(long j) {
        this.f33519a = j;
    }

    @Override // a.w8n
    public final long a() {
        return this.f33519a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8n)) {
            return false;
        }
        long j = ((t8n) obj).f33519a;
        int i = y3d.h;
        return h2t0.a(this.f33519a, j);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f33519a);
    }

    public final String toString() {
        return kng0.l("Left(activeCellColor=", y3d.i(this.f33519a), Separators.RPAREN);
    }
}
