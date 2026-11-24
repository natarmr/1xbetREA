package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class z2l0 implements g3l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fpe f43675a;
    public final int b;
    public final long c;

    public z2l0(fpe fpeVar, int i, long j) {
        this.f43675a = fpeVar;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2l0)) {
            return false;
        }
        z2l0 z2l0Var = (z2l0) obj;
        if (!this.f43675a.equals(z2l0Var.f43675a) || this.b != z2l0Var.b) {
            return false;
        }
        long j = z2l0Var.c;
        int i = y3d.h;
        return h2t0.a(this.c, j);
    }

    public final int hashCode() {
        int iA = twn.a(this.b, this.f43675a.hashCode() * 31, 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.c) + iA;
    }

    public final String toString() {
        String strI = y3d.i(this.c);
        StringBuilder sb = new StringBuilder("CounterWithChevron(counterStyle=");
        sb.append(this.f43675a);
        sb.append(", counterValue=");
        sb.append(this.b);
        sb.append(", chevronIconColor=");
        return axq.n(sb, strI, Separators.RPAREN);
    }
}
