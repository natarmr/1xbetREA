package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ky30 implements my30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f19088a;
    public final r040 b;
    public final gy30 c;
    public final boolean d;
    public final wy30 e;
    public final wy30 f;

    public ky30(iz30 iz30Var, r040 r040Var, gy30 gy30Var, boolean z, wy30 wy30Var, qy30 qy30Var) {
        iz30Var.getClass();
        r040Var.getClass();
        gy30Var.getClass();
        this.f19088a = iz30Var;
        this.b = r040Var;
        this.c = gy30Var;
        this.d = z;
        this.e = wy30Var;
        this.f = qy30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky30)) {
            return false;
        }
        ky30 ky30Var = (ky30) obj;
        return this.f19088a == ky30Var.f19088a && this.b == ky30Var.b && Intrinsics.d(this.c, ky30Var.c) && this.d == ky30Var.d && this.e.equals(ky30Var.e) && Intrinsics.d(this.f, ky30Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + brm0.e((this.c.hashCode() + w6x.f(this.b, this.f19088a.hashCode() * 31, 31)) * 31, 31, this.d)) * 31;
        wy30 wy30Var = this.f;
        return iHashCode + (wy30Var == null ? 0 : wy30Var.hashCode());
    }

    @Override // a.my30
    public final iz30 m() {
        return this.f19088a;
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
        return "SimpeMenuCellUiItem(menuItemModel=" + this.f19088a + ", menuSectionType=" + this.b + ", style=" + this.c + ", isAlwaysVisible=" + this.d + ", menuClickModel=" + this.e + ", rightActionClickModel=" + this.f + Separators.RPAREN;
    }

    @Override // a.my30
    public final boolean y0() {
        return this.d;
    }
}
