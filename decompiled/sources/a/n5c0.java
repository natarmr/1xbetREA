package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class n5c0 implements i5c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22938a;
    public final boolean b;

    public n5c0(boolean z, boolean z2) {
        this.f22938a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5c0)) {
            return false;
        }
        n5c0 n5c0Var = (n5c0) obj;
        return this.f22938a == n5c0Var.f22938a && this.b == n5c0Var.b;
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
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f22938a) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof n5c0) && (p6t0Var2 instanceof n5c0)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            n5c0 n5c0Var = (n5c0) p6t0Var;
            n5c0 n5c0Var2 = (n5c0) p6t0Var2;
            k9x.G(linkedHashSet, new k5c0(n5c0Var.f22938a), new k5c0(n5c0Var2.f22938a));
            k9x.G(linkedHashSet, new l5c0(n5c0Var.b), new l5c0(n5c0Var2.b));
            if (!linkedHashSet.isEmpty()) {
                return linkedHashSet;
            }
        }
        return null;
    }

    public final String toString() {
        return b1j.k("PromoBannerShimmerUiItem(balanceVisible=", defpackage.c.d("BalanceVisible(value=", Separators.RPAREN, this.f22938a), ", promoItemsVisible=", defpackage.c.d("PromoItemsVisible(value=", Separators.RPAREN, this.b), Separators.RPAREN);
    }
}
