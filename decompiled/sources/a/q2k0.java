package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class q2k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yi5 f28003a;
    public final rqm b;

    public q2k0(yi5 yi5Var, rqm rqmVar) {
        this.f28003a = yi5Var;
        this.b = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2k0)) {
            return false;
        }
        q2k0 q2k0Var = (q2k0) obj;
        return this.f28003a == q2k0Var.f28003a && this.b.equals(q2k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28003a.hashCode() * 31);
    }

    public final String toString() {
        return "SinglePageMenuItemUiModel(menuItem=" + this.f28003a + ", style=" + this.b + Separators.RPAREN;
    }
}
