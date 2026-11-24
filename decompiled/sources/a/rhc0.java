package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rhc0 implements shc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hds f30484a;
    public final String b;
    public final long c;
    public final imm d;
    public final imm e;

    public rhc0(hds hdsVar, String str, long j, imm immVar, imm immVar2) {
        this.f30484a = hdsVar;
        this.b = str;
        this.c = j;
        this.d = immVar;
        this.e = immVar2;
    }

    @Override // a.shc0
    public final long a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhc0)) {
            return false;
        }
        rhc0 rhc0Var = (rhc0) obj;
        if (!this.f30484a.equals(rhc0Var.f30484a) || !this.b.equals(rhc0Var.b)) {
            return false;
        }
        long j = rhc0Var.c;
        int i = y3d.h;
        return h2t0.a(this.c, j) && this.d.equals(rhc0Var.d) && this.e.equals(rhc0Var.e);
    }

    @Override // a.shc0
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        int iB = ua80.b(this.f30484a.hashCode() * 31, 31, this.b);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.e.hashCode() + h97.a(this.d, rw2.b(iB, 31, this.c), 31);
    }

    public final String toString() {
        return "OneXGame(imageInfo=" + this.f30484a + ", title=" + this.b + ", containerColor=" + y3d.i(this.c) + ", expandedNavigationBar=" + this.d + ", collapsedNavigationBar=" + this.e + Separators.RPAREN;
    }
}
