package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ly30 implements my30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f20847a;
    public final r040 b;
    public final boolean c;
    public final wy30 d;
    public final wy30 e;
    public final gy30 f;
    public final cjm g;

    public ly30(iz30 iz30Var, r040 r040Var, boolean z, wy30 wy30Var, qy30 qy30Var, gy30 gy30Var, cjm cjmVar) {
        r040Var.getClass();
        gy30Var.getClass();
        this.f20847a = iz30Var;
        this.b = r040Var;
        this.c = z;
        this.d = wy30Var;
        this.e = qy30Var;
        this.f = gy30Var;
        this.g = cjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ly30)) {
            return false;
        }
        ly30 ly30Var = (ly30) obj;
        return this.f20847a == ly30Var.f20847a && this.b == ly30Var.b && this.c == ly30Var.c && this.d.equals(ly30Var.d) && Intrinsics.d(this.e, ly30Var.e) && Intrinsics.d(this.f, ly30Var.f) && this.g.equals(ly30Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + brm0.e(w6x.f(this.b, this.f20847a.hashCode() * 31, 31), 31, this.c)) * 31;
        wy30 wy30Var = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((iHashCode + (wy30Var == null ? 0 : wy30Var.hashCode())) * 31)) * 31);
    }

    @Override // a.my30
    public final iz30 m() {
        return this.f20847a;
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
        return "XGamesMenuCellUiItem(menuItemModel=" + this.f20847a + ", menuSectionType=" + this.b + ", isAlwaysVisible=" + this.c + ", menuClickModel=" + this.d + ", rightActionClickModel=" + this.e + ", style=" + this.f + ", xGamesModel=" + this.g + Separators.RPAREN;
    }

    @Override // a.my30
    public final boolean y0() {
        return this.c;
    }
}
