package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class pxo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bop0 f27762a;
    public final rqm b;

    public pxo0(bop0 bop0Var, rqm rqmVar) {
        this.f27762a = bop0Var;
        this.b = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxo0)) {
            return false;
        }
        pxo0 pxo0Var = (pxo0) obj;
        return this.f27762a == pxo0Var.f27762a && this.b.equals(pxo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f27762a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamActionItemUiModel(team=" + this.f27762a + ", style=" + this.b + Separators.RPAREN;
    }
}
