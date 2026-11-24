package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class iy30 implements my30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f15570a;
    public final r040 b;
    public final fc0 c;
    public final wy30 d;
    public final wy30 e;

    public iy30(iz30 iz30Var, r040 r040Var, fc0 fc0Var, wy30 wy30Var, qy30 qy30Var) {
        r040Var.getClass();
        this.f15570a = iz30Var;
        this.b = r040Var;
        this.c = fc0Var;
        this.d = wy30Var;
        this.e = qy30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy30)) {
            return false;
        }
        iy30 iy30Var = (iy30) obj;
        return this.f15570a == iy30Var.f15570a && this.b == iy30Var.b && this.c.equals(iy30Var.c) && this.d.equals(iy30Var.d) && Intrinsics.d(this.e, iy30Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + brm0.e((this.c.hashCode() + w6x.f(this.b, this.f15570a.hashCode() * 31, 31)) * 31, 31, false)) * 31;
        wy30 wy30Var = this.e;
        return iHashCode + (wy30Var != null ? wy30Var.hashCode() : 0);
    }

    @Override // a.my30
    public final iz30 m() {
        return this.f15570a;
    }

    @Override // a.my30
    public final r040 n() {
        return this.b;
    }

    @Override // a.my30
    public final wy30 o0() {
        return this.d;
    }

    public final String toString() {
        return "CompactBannerMenuCellUiItem(menuItemModel=" + this.f15570a + ", menuSectionType=" + this.b + ", style=" + this.c + ", isAlwaysVisible=false, menuClickModel=" + this.d + ", rightActionClickModel=" + this.e + Separators.RPAREN;
    }

    @Override // a.my30
    public final boolean y0() {
        return false;
    }
}
