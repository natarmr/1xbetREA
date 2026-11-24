package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class q4k0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o4k0 f28101a;
    public final int b;

    public q4k0(o4k0 o4k0Var, int i) {
        this.f28101a = o4k0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4k0)) {
            return false;
        }
        q4k0 q4k0Var = (q4k0) obj;
        return this.f28101a.equals(q4k0Var.f28101a) && this.b == q4k0Var.b;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof q4k0) && (p6t0Var2 instanceof q4k0);
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + ((this.f28101a.hashCode() + (Long.hashCode(1L) * 31)) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof q4k0) || !(p6t0Var2 instanceof q4k0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        q4k0 q4k0Var = (q4k0) p6t0Var;
        q4k0 q4k0Var2 = (q4k0) p6t0Var2;
        k9x.G(linkedHashSet, q4k0Var.f28101a, q4k0Var2.f28101a);
        k9x.G(linkedHashSet, new n4k0(q4k0Var.b), new n4k0(q4k0Var2.b));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        return "SingleTeamLastMatchesHeaderUiModel(id=1, teamImage=" + this.f28101a + ", background=" + ua80.e(this.b, "Background(value=", Separators.RPAREN) + Separators.RPAREN;
    }
}
