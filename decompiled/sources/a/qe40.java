package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qe40 implements ef40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x4t f28565a;
    public final vbj b;

    public qe40(x4t x4tVar, vbj vbjVar) {
        this.f28565a = x4tVar;
        this.b = vbjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe40)) {
            return false;
        }
        qe40 qe40Var = (qe40) obj;
        return this.f28565a.equals(qe40Var.f28565a) && this.b.equals(qe40Var.b);
    }

    @Override // a.ef40
    public final String getKey() {
        x4t x4tVar = this.f28565a;
        if (!(x4tVar instanceof r4t)) {
            tre0 tre0Var = sre0.f32672a;
            return ohs0.n(tre0Var.b(qe40.class).J(), tre0Var.b(x4tVar.getClass()).J());
        }
        tre0 tre0Var2 = sre0.f32672a;
        return tre0Var2.b(qe40.class).J() + tre0Var2.b(x4tVar.getClass()).J() + ((r4t) x4tVar).f29854a;
    }

    @Override // a.ef40
    public final vbj getState() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28565a.hashCode() * 31);
    }

    public final String toString() {
        return "GamesCarousel(categoryType=" + this.f28565a + ", state=" + this.b + Separators.RPAREN;
    }
}
