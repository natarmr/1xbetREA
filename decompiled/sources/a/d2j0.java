package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class d2j0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5358a;
    public final String b;

    public d2j0(String str, boolean z) {
        this.f5358a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2j0)) {
            return false;
        }
        d2j0 d2j0Var = (d2j0) obj;
        return this.f5358a == d2j0Var.f5358a && this.b.equals(d2j0Var.b);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof d2j0) && (p6t0Var2 instanceof d2j0)) {
            return p6t0Var.getClass().equals(p6t0Var2.getClass());
        }
        return false;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f5358a) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof d2j0) || !(p6t0Var2 instanceof d2j0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        d2j0 d2j0Var = (d2j0) p6t0Var;
        d2j0 d2j0Var2 = (d2j0) p6t0Var2;
        k9x.G(linkedHashSet, new a2j0(d2j0Var.f5358a), new a2j0(d2j0Var2.f5358a));
        k9x.G(linkedHashSet, new b2j0(d2j0Var.b), new b2j0(d2j0Var2.b));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        return b1j.k("SettingsMakeBetAutoMaxUiModel(autoMaxToggleChangeState=", defpackage.c.d("AutoMaxToggleChangeState(value=", Separators.RPAREN, this.f5358a), ", description=", kng0.l("Description(value=", this.b, Separators.RPAREN), Separators.RPAREN);
    }
}
