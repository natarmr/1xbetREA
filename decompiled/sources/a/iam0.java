package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class iam0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9m0 f14445a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public iam0(t9m0 t9m0Var, String str, boolean z, boolean z2) {
        t9m0Var.getClass();
        this.f14445a = t9m0Var;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    public static iam0 c(iam0 iam0Var, boolean z) {
        t9m0 t9m0Var = iam0Var.f14445a;
        String str = iam0Var.b;
        boolean z2 = iam0Var.d;
        t9m0Var.getClass();
        return new iam0(t9m0Var, str, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iam0)) {
            return false;
        }
        iam0 iam0Var = (iam0) obj;
        return this.f14445a == iam0Var.f14445a && this.b.equals(iam0Var.b) && this.c == iam0Var.c && this.d == iam0Var.d;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof iam0) && (p6t0Var2 instanceof iam0) && ((iam0) p6t0Var).f14445a == ((iam0) p6t0Var2).f14445a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(ua80.b(this.f14445a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof iam0) || !(p6t0Var2 instanceof iam0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        iam0 iam0Var = (iam0) p6t0Var;
        iam0 iam0Var2 = (iam0) p6t0Var2;
        k9x.G(linkedHashSet, new gam0(iam0Var.b), new gam0(iam0Var2.b));
        k9x.G(linkedHashSet, new fam0(iam0Var.c), new fam0(iam0Var2.c));
        k9x.G(linkedHashSet, new eam0(iam0Var.d), new eam0(iam0Var2.d));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("Title(value=", this.b, Separators.RPAREN);
        String strD = defpackage.c.d("Selected(value=", Separators.RPAREN, this.c);
        String strD2 = defpackage.c.d("Disable(value=", Separators.RPAREN, this.d);
        StringBuilder sb = new StringBuilder("StatisticBlockUiModel(id=");
        sb.append(this.f14445a);
        sb.append(", title=");
        sb.append(strL);
        sb.append(", selected=");
        return ua80.m(sb, strD, ", disable=", strD2, Separators.RPAREN);
    }
}
