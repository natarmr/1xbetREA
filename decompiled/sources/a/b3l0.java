package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class b3l0 implements g3l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1913a;

    public b3l0(long j) {
        this.f1913a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3l0)) {
            return false;
        }
        long j = ((b3l0) obj).f1913a;
        int i = y3d.h;
        return h2t0.a(this.f1913a, j);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f1913a);
    }

    public final String toString() {
        return kng0.l("DragAndDrop(iconColor=", y3d.i(this.f1913a), Separators.RPAREN);
    }
}
