package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hy30 implements my30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f13843a;
    public final r040 b;
    public final cll c;
    public final boolean d;
    public final wy30 e;
    public final wy30 f;

    public hy30(iz30 iz30Var, r040 r040Var, cll cllVar, boolean z, wy30 wy30Var, qy30 qy30Var) {
        r040Var.getClass();
        this.f13843a = iz30Var;
        this.b = r040Var;
        this.c = cllVar;
        this.d = z;
        this.e = wy30Var;
        this.f = qy30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy30)) {
            return false;
        }
        hy30 hy30Var = (hy30) obj;
        return this.f13843a == hy30Var.f13843a && this.b == hy30Var.b && this.c.equals(hy30Var.c) && this.d == hy30Var.d && this.e.equals(hy30Var.e) && Intrinsics.d(this.f, hy30Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + brm0.e((this.c.hashCode() + w6x.f(this.b, this.f13843a.hashCode() * 31, 31)) * 31, 31, this.d)) * 31;
        wy30 wy30Var = this.f;
        return iHashCode + (wy30Var == null ? 0 : wy30Var.hashCode());
    }

    @Override // a.my30
    public final iz30 m() {
        return this.f13843a;
    }

    @Override // a.my30
    public final r040 n() {
        return this.b;
    }

    @Override // a.my30
    public final wy30 o0() {
        return this.e;
    }

    public final String toString() {
        return "BannerMenuCellUiItem(menuItemModel=" + this.f13843a + ", menuSectionType=" + this.b + ", style=" + this.c + ", isAlwaysVisible=" + this.d + ", menuClickModel=" + this.e + ", rightActionClickModel=" + this.f + Separators.RPAREN;
    }

    @Override // a.my30
    public final boolean y0() {
        return this.d;
    }
}
