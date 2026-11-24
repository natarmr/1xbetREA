package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class y5l0 implements hvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2n f42054a;
    public final vvs b;
    public final i9h0 c;
    public final v12 d;
    public final String e;

    public y5l0(a2n a2nVar, vvs vvsVar, i9h0 i9h0Var, v12 v12Var) {
        this.f42054a = a2nVar;
        this.b = vvsVar;
        this.c = i9h0Var;
        this.d = v12Var;
        this.e = kng0.k(a2nVar.getKey(), vvsVar.name());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5l0)) {
            return false;
        }
        y5l0 y5l0Var = (y5l0) obj;
        return this.f42054a.equals(y5l0Var.f42054a) && this.b == y5l0Var.b && this.c == y5l0Var.c && this.d == y5l0Var.d;
    }

    @Override // a.hvk0
    public final Object getKey() {
        return this.e;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f42054a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SportEventCardUiModel(eventCardItem=" + this.f42054a + ", gameType=" + this.b + ", screenStyle=" + this.c + ", alignmentInSection=" + this.d + Separators.RPAREN;
    }
}
