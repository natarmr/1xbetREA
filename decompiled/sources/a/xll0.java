package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class xll0 implements cml0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41079a;
    public final fol0 b;
    public final rml0 c;

    public xll0(long j, fol0 fol0Var, rml0 rml0Var) {
        this.f41079a = j;
        this.b = fol0Var;
        this.c = rml0Var;
    }

    @Override // a.cml0
    public final long a() {
        return this.f41079a;
    }

    @Override // a.cml0
    public final ynl0 b() {
        return this.c;
    }

    @Override // a.cml0
    public final kol0 d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xll0)) {
            return false;
        }
        xll0 xll0Var = (xll0) obj;
        return this.f41079a == xll0Var.f41079a && this.b.equals(xll0Var.b) && this.c.equals(xll0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f41079a) * 31)) * 31);
    }

    public final String toString() {
        return "LargeCardLargeSportIcon(gameId=" + this.f41079a + ", topBlock=" + this.b + ", middleBlock=" + this.c + Separators.RPAREN;
    }
}
