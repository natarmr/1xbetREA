package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class t5c0 implements i5c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33363a;
    public final int b;
    public final String c;

    public t5c0(String str, int i, boolean z) {
        this.f33363a = z;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5c0)) {
            return false;
        }
        t5c0 t5c0Var = (t5c0) obj;
        return this.f33363a == t5c0Var.f33363a && this.b == t5c0Var.b && this.c.equals(t5c0Var.c);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return axq.f(p6t0Var, p6t0Var2).equals(p6t0Var2.getClass());
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Boolean.hashCode(this.f33363a) * 31, 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof t5c0) || !(p6t0Var2 instanceof t5c0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        t5c0 t5c0Var = (t5c0) p6t0Var;
        t5c0 t5c0Var2 = (t5c0) p6t0Var2;
        k9x.G(linkedHashSet, new r5c0(t5c0Var.f33363a), new r5c0(t5c0Var2.f33363a));
        k9x.G(linkedHashSet, new p5c0(t5c0Var.b), new p5c0(t5c0Var2.b));
        k9x.G(linkedHashSet, new q5c0(t5c0Var.c), new q5c0(t5c0Var2.c));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strD = defpackage.c.d("ShowBalance(value=", Separators.RPAREN, this.f33363a);
        String strE = ua80.e(this.b, "PromoBalance(value=", Separators.RPAREN);
        return axq.n(b1j.n("PromoBannerSimpleUiItem(showBalance=", strD, ", promoBalance=", strE, ", promoUnit="), kng0.l("PromoUnit(value=", this.c, Separators.RPAREN), Separators.RPAREN);
    }
}
