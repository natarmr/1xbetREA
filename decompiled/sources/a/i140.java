package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class i140 implements f240 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13979a;
    public final iz30 b;
    public final r040 c;
    public final gy30 d;

    public i140(boolean z, iz30 iz30Var, r040 r040Var, gy30 gy30Var) {
        this.f13979a = z;
        this.b = iz30Var;
        this.c = r040Var;
        this.d = gy30Var;
    }

    @Override // a.f240
    public final boolean K() {
        return this.f13979a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i140)) {
            return false;
        }
        i140 i140Var = (i140) obj;
        return this.f13979a == i140Var.f13979a && this.b == i140Var.b && this.c == i140Var.c && this.d.equals(i140Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + w6x.f(this.c, f140.g(this.b, Boolean.hashCode(this.f13979a) * 31, 31), 31);
    }

    @Override // a.f240
    public final iz30 m() {
        return this.b;
    }

    @Override // a.f240
    public final r040 n() {
        return this.c;
    }

    public final String toString() {
        return "CallMenuUiItem(isBadgeVisible=" + this.f13979a + ", menuItemModel=" + this.b + ", menuSectionType=" + this.c + ", menuCellStyle=" + this.d + Separators.RPAREN;
    }
}
