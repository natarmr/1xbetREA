package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class b6j0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2057a;
    public final String b;

    public b6j0(String str, boolean z) {
        this.f2057a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6j0)) {
            return false;
        }
        b6j0 b6j0Var = (b6j0) obj;
        return this.f2057a == b6j0Var.f2057a && this.b.equals(b6j0Var.b);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof b6j0) && (p6t0Var2 instanceof b6j0)) {
            return p6t0Var.getClass().equals(p6t0Var2.getClass());
        }
        return false;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f2057a) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof b6j0) || !(p6t0Var2 instanceof b6j0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b6j0 b6j0Var = (b6j0) p6t0Var;
        b6j0 b6j0Var2 = (b6j0) p6t0Var2;
        k9x.G(linkedHashSet, new z5j0(b6j0Var.f2057a), new z5j0(b6j0Var2.f2057a));
        k9x.G(linkedHashSet, new y5j0(b6j0Var.b), new y5j0(b6j0Var2.b));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        return b1j.k("SettingsMakeBetVipBetUiModel(vipBetToggleChangeState=", defpackage.c.d("VipBetToggleChangeState(value=", Separators.RPAREN, this.f2057a), ", description=", kng0.l("Description(value=", this.b, Separators.RPAREN), Separators.RPAREN);
    }
}
