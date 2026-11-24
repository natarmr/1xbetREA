package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qsl implements ssl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29264a;
    public final long b;

    public qsl(long j, long j2) {
        this.f29264a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsl)) {
            return false;
        }
        qsl qslVar = (qsl) obj;
        long j = qslVar.f29264a;
        int i = y3d.h;
        return h2t0.a(this.f29264a, j) && h2t0.a(this.b, qslVar.b);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.f29264a) * 31);
    }

    public final String toString() {
        return b1j.k("FilledUnited(borderColor=", y3d.i(this.f29264a), ", backgroundColor=", y3d.i(this.b), Separators.RPAREN);
    }
}
