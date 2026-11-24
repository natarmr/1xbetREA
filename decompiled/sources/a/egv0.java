package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class egv0 implements ggv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7781a;
    public final imm b;
    public final htr c;

    public egv0(long j, imm immVar, htr htrVar) {
        this.f7781a = j;
        this.b = immVar;
        this.c = htrVar;
    }

    @Override // a.ggv0
    public final imm a() {
        return this.b;
    }

    @Override // a.ggv0
    public final long c() {
        return this.f7781a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egv0)) {
            return false;
        }
        egv0 egv0Var = (egv0) obj;
        long j = egv0Var.f7781a;
        int i = y3d.h;
        return h2t0.a(this.f7781a, j) && this.b.equals(egv0Var.b) && this.c.equals(egv0Var.c);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.c.hashCode() + h97.a(this.b, Long.hashCode(this.f7781a) * 31, 31);
    }

    public final String toString() {
        return "Content(backgroundColor=" + y3d.i(this.f7781a) + ", toolbarUiModel=" + this.b + ", gameCardCollection=" + this.c + Separators.RPAREN;
    }
}
