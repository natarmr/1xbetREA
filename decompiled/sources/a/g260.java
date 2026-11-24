package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class g260 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10548a;
    public final xhm b;
    public final f260 c;

    public g260(boolean z, xhm xhmVar, f260 f260Var) {
        this.f10548a = z;
        this.b = xhmVar;
        this.c = f260Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g260)) {
            return false;
        }
        g260 g260Var = (g260) obj;
        return this.f10548a == g260Var.f10548a && this.b.equals(g260Var.b) && this.c.equals(g260Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.f10548a) * 31)) * 31);
    }

    public final String toString() {
        return "NoTabsDashboardUiState(refreshing=" + this.f10548a + ", headerModel=" + this.b + ", content=" + this.c + Separators.RPAREN;
    }
}
