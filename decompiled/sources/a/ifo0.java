package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes6.dex */
public final class ifo0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14698a;
    public final boolean b;

    public ifo0(String str, boolean z) {
        this.f14698a = str;
        this.b = z;
    }

    public static ifo0 c(ifo0 ifo0Var, boolean z) {
        String str = ifo0Var.f14698a;
        ifo0Var.getClass();
        return new ifo0(str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifo0)) {
            return false;
        }
        ifo0 ifo0Var = (ifo0) obj;
        return this.f14698a.equals(ifo0Var.f14698a) && this.b == ifo0Var.b;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof ifo0) && (p6t0Var2 instanceof ifo0)) {
            return ((ifo0) p6t0Var).f14698a.equals(((ifo0) p6t0Var2).f14698a);
        }
        return false;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f14698a.hashCode() * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof ifo0) || !(p6t0Var2 instanceof ifo0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ifo0 ifo0Var = (ifo0) p6t0Var;
        ifo0 ifo0Var2 = (ifo0) p6t0Var2;
        k9x.G(linkedHashSet, new ffo0(ifo0Var.b), new ffo0(ifo0Var2.b));
        k9x.G(linkedHashSet, new gfo0(ifo0Var.f14698a), new gfo0(ifo0Var2.f14698a));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        return b1j.k("TabUiModel(titleTab=", kng0.l("TitleTab(value=", this.f14698a, Separators.RPAREN), ", isSelected=", defpackage.c.d("IsSelected(value=", Separators.RPAREN, this.b), Separators.RPAREN);
    }
}
