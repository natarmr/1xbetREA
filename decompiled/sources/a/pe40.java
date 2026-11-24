package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pe40 implements df40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4t f26833a;
    public final fyx b;

    public pe40(w4t w4tVar, fyx fyxVar) {
        this.f26833a = w4tVar;
        this.b = fyxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe40)) {
            return false;
        }
        pe40 pe40Var = (pe40) obj;
        return this.f26833a.equals(pe40Var.f26833a) && this.b.equals(pe40Var.b);
    }

    @Override // a.df40
    public final String getKey() {
        w4t w4tVar = this.f26833a;
        if (!(w4tVar instanceof q4t)) {
            tre0 tre0Var = sre0.f32672a;
            return ohs0.n(tre0Var.b(pe40.class).J(), tre0Var.b(w4tVar.getClass()).J());
        }
        tre0 tre0Var2 = sre0.f32672a;
        return tre0Var2.b(pe40.class).J() + tre0Var2.b(w4tVar.getClass()).J() + ((q4t) w4tVar).f28117a;
    }

    @Override // a.df40
    public final fyx getState() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f26833a.hashCode() * 31);
    }

    public final String toString() {
        return "GamesCarousel(categoryType=" + this.f26833a + ", state=" + this.b + Separators.RPAREN;
    }
}
