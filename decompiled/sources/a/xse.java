package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class xse implements yse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3h0 f41412a;
    public final g3h0 b;
    public final g3h0 c;
    public final vjp0 d;

    public xse(g3h0 g3h0Var, g3h0 g3h0Var2, g3h0 g3h0Var3, vjp0 vjp0Var) {
        this.f41412a = g3h0Var;
        this.b = g3h0Var2;
        this.c = g3h0Var3;
        this.d = vjp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xse)) {
            return false;
        }
        xse xseVar = (xse) obj;
        return this.f41412a.equals(xseVar.f41412a) && this.b.equals(xseVar.b) && this.c.equals(xseVar.c) && this.d == xseVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f41412a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TennisScoreCellsUiModel(gameScoreColumn=" + this.f41412a + ", setScoreColumn=" + this.b + ", totalScoreColumn=" + this.c + ", serve=" + this.d + Separators.RPAREN;
    }
}
