package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class tnd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34228a;
    public final y9q0 b;
    public final long c;

    public tnd0(int i, y9q0 y9q0Var, long j) {
        this.f34228a = i;
        this.b = y9q0Var;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnd0)) {
            return false;
        }
        tnd0 tnd0Var = (tnd0) obj;
        if (this.f34228a != tnd0Var.f34228a || !this.b.equals(tnd0Var.b)) {
            return false;
        }
        long j = tnd0Var.c;
        int i = y3d.h;
        return h2t0.a(this.c, j);
    }

    public final int hashCode() {
        int iG = brm0.g(this.b, Integer.hashCode(this.f34228a) * 31, 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.c) + iG;
    }

    public final String toString() {
        String strI = y3d.i(this.c);
        StringBuilder sb = new StringBuilder("QuickBetTextStyle(textAppearanceResId=");
        sb.append(this.f34228a);
        sb.append(", textStyle=");
        sb.append(this.b);
        sb.append(", containerColor=");
        return axq.n(sb, strI, Separators.RPAREN);
    }
}
