package a;

import android.gov.nist.core.Separators;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class ulf implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f35869a;

    public ulf(ank0 ank0Var) {
        this.f35869a = ank0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ulf) && this.f35869a.equals(((ulf) obj).f35869a);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return axq.f(p6t0Var, p6t0Var2).equals(p6t0Var2.getClass());
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.f35869a.f1159a.hashCode();
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return iun.f15405a;
    }

    public final String toString() {
        return w6x.p("Cs2GameLogTitleUiModel(title=", this.f35869a, Separators.RPAREN);
    }
}
