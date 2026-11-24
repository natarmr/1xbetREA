package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class v4c0 implements n4c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f36770a;
    public final o0x b;

    public v4c0(ArrayList arrayList) {
        m0x m0xVarY = j0x.y(false);
        this.f36770a = arrayList;
        this.b = m0xVarY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4c0)) {
            return false;
        }
        v4c0 v4c0Var = (v4c0) obj;
        return this.f36770a.equals(v4c0Var.f36770a) && this.b.equals(v4c0Var.b);
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
        return this.b.hashCode() + (this.f36770a.hashCode() * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof v4c0) || !(p6t0Var2 instanceof v4c0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        k9x.G(linkedHashSet, new u4c0(((v4c0) p6t0Var).f36770a), new u4c0(((v4c0) p6t0Var2).f36770a));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        return "PromoAdditionalVerticalUiItem(promoList=" + hne.o("PromoList(value=", Separators.RPAREN, this.f36770a) + ", placeholder=" + this.b + Separators.RPAREN;
    }
}
