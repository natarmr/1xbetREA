package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class m2j0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21063a;
    public final boolean b;
    public final boolean c;

    public m2j0(boolean z, boolean z2, boolean z3) {
        this.f21063a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2j0)) {
            return false;
        }
        m2j0 m2j0Var = (m2j0) obj;
        return this.f21063a == m2j0Var.f21063a && this.b == m2j0Var.b && this.c == m2j0Var.c;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof m2j0) && (p6t0Var2 instanceof m2j0)) {
            return p6t0Var.getClass().equals(p6t0Var2.getClass());
        }
        return false;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(Boolean.hashCode(this.f21063a) * 31, 31, this.b);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof m2j0) && (p6t0Var2 instanceof m2j0)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            m2j0 m2j0Var = (m2j0) p6t0Var;
            m2j0 m2j0Var2 = (m2j0) p6t0Var2;
            k9x.G(linkedHashSet, new l2j0(m2j0Var.f21063a), new l2j0(m2j0Var2.f21063a));
            k9x.G(linkedHashSet, new j2j0(m2j0Var.b), new j2j0(m2j0Var2.b));
            k9x.G(linkedHashSet, new k2j0(m2j0Var.c), new k2j0(m2j0Var2.c));
            if (!linkedHashSet.isEmpty()) {
                return linkedHashSet;
            }
        }
        return null;
    }

    public final String toString() {
        String strD = defpackage.c.d("ConfirmAnyChangeType(value=", Separators.RPAREN, this.f21063a);
        String strD2 = defpackage.c.d("AcceptAnyChangeType(value=", Separators.RPAREN, this.b);
        return axq.n(b1j.n("SettingsMakeBetCoefChangesUiModel(confirmAnyChangeType=", strD, ", acceptAnyChangeType=", strD2, ", acceptChangeIncreaseType="), defpackage.c.d("AcceptChangeIncreaseType(value=", Separators.RPAREN, this.c), Separators.RPAREN);
    }
}
