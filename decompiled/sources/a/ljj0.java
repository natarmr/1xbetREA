package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ljj0 {
    public static final ljj0 d = new ljj0(0, 7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20155a;
    public final long b;
    public final float c;

    public ljj0(long j, int i) {
        this((i & 4) != 0 ? 0.0f : 16.0f, (i & 1) != 0 ? fbc.f(4278190080L) : j, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljj0)) {
            return false;
        }
        ljj0 ljj0Var = (ljj0) obj;
        long j = ljj0Var.f20155a;
        int i = y3d.h;
        return h2t0.a(this.f20155a, j) && ne60.c(this.b, ljj0Var.b) && this.c == ljj0Var.c;
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Float.hashCode(this.c) + rw2.b(Long.hashCode(this.f20155a) * 31, 31, this.b);
    }

    public final String toString() {
        return kng0.o(b1j.n("Shadow(color=", y3d.i(this.f20155a), ", offset=", ne60.h(this.b), ", blurRadius="), this.c, Separators.RPAREN);
    }

    public ljj0(float f, long j, long j2) {
        this.f20155a = j;
        this.b = j2;
        this.c = f;
    }
}
