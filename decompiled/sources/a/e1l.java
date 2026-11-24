package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class e1l implements xg3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7041a;

    public e1l(int i) {
        this.f7041a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1l) && this.f7041a == ((e1l) obj).f7041a;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof e1l) && (p6t0Var2 instanceof e1l)) {
            return p6t0Var.getClass().equals(p6t0Var2.getClass());
        }
        return false;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7041a);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof e1l) && (p6t0Var2 instanceof e1l)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            k9x.G(linkedHashSet, new d1l(((e1l) p6t0Var).f7041a), new d1l(((e1l) p6t0Var2).f7041a));
            if (!linkedHashSet.isEmpty()) {
                return linkedHashSet;
            }
        }
        return null;
    }

    public final String toString() {
        return kng0.l("DotUiModel(imageTintAttr=", ua80.e(this.f7041a, "ImageTintAttr(value=", Separators.RPAREN), Separators.RPAREN);
    }
}
