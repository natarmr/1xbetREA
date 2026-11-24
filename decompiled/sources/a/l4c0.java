package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class l4c0 implements n4c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19398a;
    public final o0x b;

    public l4c0(ArrayList arrayList) {
        m0x m0xVarY = j0x.y(true);
        this.f19398a = arrayList;
        this.b = m0xVarY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4c0)) {
            return false;
        }
        l4c0 l4c0Var = (l4c0) obj;
        return this.f19398a.equals(l4c0Var.f19398a) && this.b.equals(l4c0Var.b);
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
        return this.b.hashCode() + (this.f19398a.hashCode() * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof l4c0) || !(p6t0Var2 instanceof l4c0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        k9x.G(linkedHashSet, new k4c0(((l4c0) p6t0Var).f19398a), new k4c0(((l4c0) p6t0Var2).f19398a));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        return "PromoAdditionalHorizontalUiItem(promoList=" + hne.o("PromoList(value=", Separators.RPAREN, this.f19398a) + ", placeholder=" + this.b + Separators.RPAREN;
    }
}
