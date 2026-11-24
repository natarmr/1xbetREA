package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class pv30 implements nw30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r040 f27645a;
    public final gy30 b;

    public pv30(r040 r040Var, gy30 gy30Var) {
        htz htzVar = iz30.f15618a;
        r040Var.getClass();
        this.f27645a = r040Var;
        this.b = gy30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv30)) {
            return false;
        }
        pv30 pv30Var = (pv30) obj;
        htz htzVar = iz30.f15618a;
        return this.f27645a == pv30Var.f27645a && this.b.equals(pv30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + w6x.f(this.f27645a, f140.g(iz30.y, Boolean.hashCode(false) * 31, 31), 31);
    }

    @Override // a.nw30
    public final iz30 m() {
        return iz30.y;
    }

    @Override // a.nw30
    public final r040 n() {
        return this.f27645a;
    }

    public final String toString() {
        return "CallMenuUiItem(isBadgeVisible=false, menuItemModel=" + iz30.y + ", menuSectionType=" + this.f27645a + ", menuCellStyle=" + this.b + Separators.RPAREN;
    }
}
