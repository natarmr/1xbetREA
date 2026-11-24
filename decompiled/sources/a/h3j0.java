package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class h3j0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12387a;
    public final boolean b;

    public h3j0(String str, boolean z) {
        this.f12387a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3j0)) {
            return false;
        }
        h3j0 h3j0Var = (h3j0) obj;
        return this.f12387a.equals(h3j0Var.f12387a) && this.b == h3j0Var.b;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof h3j0) && (p6t0Var2 instanceof h3j0)) {
            return p6t0Var.getClass().equals(p6t0Var2.getClass());
        }
        return false;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f12387a.hashCode() * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof h3j0) || !(p6t0Var2 instanceof h3j0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        h3j0 h3j0Var = (h3j0) p6t0Var;
        h3j0 h3j0Var2 = (h3j0) p6t0Var2;
        k9x.G(linkedHashSet, new f3j0(h3j0Var.f12387a), new f3j0(h3j0Var2.f12387a));
        k9x.G(linkedHashSet, new e3j0(h3j0Var.b), new e3j0(h3j0Var2.b));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        return b1j.k("SettingsMakeBetDefaultBetSumUiModel(defaultBetSum=", kng0.l("DefaultBetSumValue(value=", this.f12387a, Separators.RPAREN), ", defaultBetSumToggleChangeState=", defpackage.c.d("DefaultBetSumToggleChangeState(value=", Separators.RPAREN, this.b), Separators.RPAREN);
    }
}
