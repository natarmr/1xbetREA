package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class x3j0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40222a;
    public final boolean b;
    public final boolean c;

    public x3j0(boolean z, boolean z2, boolean z3) {
        this.f40222a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3j0)) {
            return false;
        }
        x3j0 x3j0Var = (x3j0) obj;
        return this.f40222a == x3j0Var.f40222a && this.b == x3j0Var.b && this.c == x3j0Var.c;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof x3j0) && (p6t0Var2 instanceof x3j0)) {
            return p6t0Var.getClass().equals(p6t0Var2.getClass());
        }
        return false;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(Boolean.hashCode(this.f40222a) * 31, 31, this.b);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof x3j0) && (p6t0Var2 instanceof x3j0)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            x3j0 x3j0Var = (x3j0) p6t0Var;
            x3j0 x3j0Var2 = (x3j0) p6t0Var2;
            k9x.G(linkedHashSet, new v3j0(x3j0Var.b), new v3j0(x3j0Var2.b));
            k9x.G(linkedHashSet, new u3j0(x3j0Var.c), new u3j0(x3j0Var2.c));
            if (!linkedHashSet.isEmpty()) {
                return linkedHashSet;
            }
        }
        return null;
    }

    public final String toString() {
        String strD = defpackage.c.d("ResetCoefOnScoreToggleChangeState(value=", Separators.RPAREN, this.b);
        return axq.n(axq.q("SettingsMakeBetExactCoefUiModel(hasSectionEnabled=", ", resetCoefOnScoreToggleChangeState=", strD, this.f40222a, ", fromLineToLiveToggleChangeState="), defpackage.c.d("FromLineToLiveToggleChangeState(value=", Separators.RPAREN, this.c), Separators.RPAREN);
    }
}
