package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class xx3 implements xg3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41639a;

    public xx3(int i) {
        this.f41639a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xx3) && this.f41639a == ((xx3) obj).f41639a;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof xx3) && (p6t0Var2 instanceof xx3)) {
            return p6t0Var.getClass().equals(p6t0Var2.getClass());
        }
        return false;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41639a);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof xx3) && (p6t0Var2 instanceof xx3)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            k9x.G(linkedHashSet, new wx3(((xx3) p6t0Var).f41639a), new wx3(((xx3) p6t0Var2).f41639a));
            if (!linkedHashSet.isEmpty()) {
                return linkedHashSet;
            }
        }
        return null;
    }

    public final String toString() {
        return kng0.l("ArrowUiModel(imageTintAttr=", ua80.e(this.f41639a, "ImageTintAttr(value=", Separators.RPAREN), Separators.RPAREN);
    }
}
