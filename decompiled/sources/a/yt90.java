package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class yt90 implements au90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43207a;
    public final long b;
    public final boolean c;

    public yt90(int i) {
        pz40 pz40Var = s6t0.f31722a;
        long secondary = s6t0.b().f33626a.getSecondary();
        boolean z = (i & 4) == 0;
        this.f43207a = R.drawable.ic_backspace;
        this.b = secondary;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt90)) {
            return false;
        }
        yt90 yt90Var = (yt90) obj;
        if (this.f43207a != yt90Var.f43207a) {
            return false;
        }
        long j = yt90Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && this.c == yt90Var.c;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f43207a) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Boolean.hashCode(this.c) + rw2.b(iHashCode, 31, this.b);
    }

    public final String toString() {
        return rw2.p(vqd.r(this.f43207a, "Delete(icon=", ", tint=", y3d.i(this.b), ", isRtl="), this.c, Separators.RPAREN);
    }
}
