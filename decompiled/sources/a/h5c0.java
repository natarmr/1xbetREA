package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class h5c0 implements i5c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12473a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final ArrayList g;
    public final o0x h;

    public h5c0(int i, String str, boolean z, boolean z2, boolean z3, boolean z4, ArrayList arrayList) {
        m0x m0xVarY = j0x.y(true);
        this.f12473a = i;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = arrayList;
        this.h = m0xVarY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5c0)) {
            return false;
        }
        h5c0 h5c0Var = (h5c0) obj;
        return this.f12473a == h5c0Var.f12473a && this.b.equals(h5c0Var.b) && this.c == h5c0Var.c && this.d == h5c0Var.d && this.e == h5c0Var.e && this.f == h5c0Var.f && this.g.equals(h5c0Var.g) && this.h.equals(h5c0Var.h);
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
        return this.h.hashCode() + twn.g(this.g, brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(Integer.hashCode(this.f12473a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof h5c0) || !(p6t0Var2 instanceof h5c0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        h5c0 h5c0Var = (h5c0) p6t0Var;
        String str = h5c0Var.b;
        z4c0 z4c0Var = new z4c0(h5c0Var.f12473a);
        h5c0 h5c0Var2 = (h5c0) p6t0Var2;
        String str2 = h5c0Var2.b;
        k9x.G(linkedHashSet, z4c0Var, new z4c0(h5c0Var2.f12473a));
        k9x.G(linkedHashSet, new d5c0(str), new d5c0(str2));
        k9x.G(linkedHashSet, new a5c0(h5c0Var.c), new a5c0(h5c0Var2.c));
        k9x.G(linkedHashSet, new c5c0(h5c0Var.d), new c5c0(h5c0Var2.d));
        k9x.G(linkedHashSet, new b5c0(h5c0Var.e), new b5c0(h5c0Var2.e));
        k9x.G(linkedHashSet, new f5c0(h5c0Var.f), new f5c0(h5c0Var2.f));
        k9x.G(linkedHashSet, new d5c0(str), new d5c0(str2));
        k9x.G(linkedHashSet, new e5c0(h5c0Var.g), new e5c0(h5c0Var2.g));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strE = ua80.e(this.f12473a, "PromoBalance(value=", Separators.RPAREN);
        String strL = kng0.l("PromoUnit(value=", this.b, Separators.RPAREN);
        String strD = defpackage.c.d("PromoBalanceVisible(value=", Separators.RPAREN, this.c);
        String strD2 = defpackage.c.d("PromoButtonVisible(value=", Separators.RPAREN, this.d);
        String strD3 = defpackage.c.d("PromoButtonLoading(value=", Separators.RPAREN, this.e);
        String strD4 = defpackage.c.d("PromotionsVisible(value=", Separators.RPAREN, this.f);
        String strO = hne.o("PromotionsList(value=", Separators.RPAREN, this.g);
        StringBuilder sbN = b1j.n("PromoBannerExtendedUiItem(promoBalance=", strE, ", promoUnit=", strL, ", promoBalanceVisible=");
        f140.v(sbN, strD, ", promoButtonVisible=", strD2, ", promoButtonLoading=");
        f140.v(sbN, strD3, ", promotionsVisible=", strD4, ", promotionsList=");
        sbN.append(strO);
        sbN.append(", placeholder=");
        sbN.append(this.h);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
