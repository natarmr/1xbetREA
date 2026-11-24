package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jy30 implements my30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f17340a;
    public final r040 b;
    public final boolean c;
    public final wy30 d;
    public final wy30 e;
    public final c0m f;

    public jy30(iz30 iz30Var, r040 r040Var, boolean z, wy30 wy30Var, qy30 qy30Var, c0m c0mVar) {
        iz30Var.getClass();
        r040Var.getClass();
        this.f17340a = iz30Var;
        this.b = r040Var;
        this.c = z;
        this.d = wy30Var;
        this.e = qy30Var;
        this.f = c0mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy30)) {
            return false;
        }
        jy30 jy30Var = (jy30) obj;
        return this.f17340a == jy30Var.f17340a && this.b == jy30Var.b && this.c == jy30Var.c && this.d.equals(jy30Var.d) && Intrinsics.d(this.e, jy30Var.e) && this.f.equals(jy30Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + brm0.e(w6x.f(this.b, this.f17340a.hashCode() * 31, 31), 31, this.c)) * 31;
        wy30 wy30Var = this.e;
        return this.f.hashCode() + ((iHashCode + (wy30Var == null ? 0 : wy30Var.hashCode())) * 31);
    }

    @Override // a.my30
    public final iz30 m() {
        return this.f17340a;
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
        return "CompactMenuCellUiItem(menuItemModel=" + this.f17340a + ", menuSectionType=" + this.b + ", isAlwaysVisible=" + this.c + ", menuClickModel=" + this.d + ", rightActionClickModel=" + this.e + ", style=" + this.f + Separators.RPAREN;
    }

    @Override // a.my30
    public final boolean y0() {
        return this.c;
    }
}
