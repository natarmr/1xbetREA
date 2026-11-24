package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class tf80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33855a;
    public final lh80 b;

    public tf80() {
        long jF = fbc.f(4284900966L);
        lh80 lh80VarT = s5x0.t(0.0f, 0.0f, 3);
        this.f33855a = jF;
        this.b = lh80VarT;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!tf80.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        tf80 tf80Var = (tf80) obj;
        long j = tf80Var.f33855a;
        int i = y3d.h;
        return h2t0.a(this.f33855a, j) && this.b.equals(tf80Var.b);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.b.hashCode() + (Long.hashCode(this.f33855a) * 31);
    }

    public final String toString() {
        return "OverscrollConfiguration(glowColor=" + y3d.i(this.f33855a) + ", drawPadding=" + this.b + Separators.RPAREN;
    }
}
