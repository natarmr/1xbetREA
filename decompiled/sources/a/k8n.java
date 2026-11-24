package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class k8n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17880a;

    public k8n(long j) {
        this.f17880a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8n)) {
            return false;
        }
        long j = ((k8n) obj).f17880a;
        int i = y3d.h;
        return h2t0.a(this.f17880a, j);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f17880a);
    }

    public final String toString() {
        return kng0.l("Theme(activeCellColor=", y3d.i(this.f17880a), Separators.RPAREN);
    }
}
