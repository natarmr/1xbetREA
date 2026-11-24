package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class di40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f6123a;
    public final int b;
    public final int c;
    public final long d;

    public di40(n0x n0xVar, int i, int i2, long j) {
        this.f6123a = n0xVar;
        this.b = i;
        this.c = i2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di40)) {
            return false;
        }
        di40 di40Var = (di40) obj;
        if (!this.f6123a.equals(di40Var.f6123a) || this.b != di40Var.b || this.c != di40Var.c) {
            return false;
        }
        long j = di40Var.d;
        int i = y3d.h;
        return h2t0.a(this.d, j);
    }

    public final int hashCode() {
        int iA = twn.a(this.c, twn.a(this.b, this.f6123a.hashCode() * 31, 31), 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.d) + iA;
    }

    public final String toString() {
        String strI = y3d.i(this.d);
        StringBuilder sb = new StringBuilder("MlbbGameMapHeroUiModel(image=");
        sb.append(this.f6123a);
        sb.append(", positionX=");
        sb.append(this.b);
        sb.append(", positionY=");
        return rw2.k(this.c, ", color=", strI, Separators.RPAREN, sb);
    }
}
