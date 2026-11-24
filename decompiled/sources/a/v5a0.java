package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v5a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nc5 f36818a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final h8a0 e;
    public final oaa0 f;

    public v5a0(nc5 nc5Var, boolean z, boolean z2, boolean z3, h8a0 h8a0Var, oaa0 oaa0Var) {
        this.f36818a = nc5Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = h8a0Var;
        this.f = oaa0Var;
    }

    public static v5a0 a(v5a0 v5a0Var, nc5 nc5Var, boolean z, boolean z2, boolean z3, h8a0 h8a0Var, int i) {
        if ((i & 1) != 0) {
            nc5Var = v5a0Var.f36818a;
        }
        nc5 nc5Var2 = nc5Var;
        if ((i & 2) != 0) {
            z = v5a0Var.b;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            z2 = v5a0Var.c;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            z3 = v5a0Var.d;
        }
        boolean z6 = z3;
        if ((i & 16) != 0) {
            h8a0Var = v5a0Var.e;
        }
        oaa0 oaa0Var = v5a0Var.f;
        v5a0Var.getClass();
        return new v5a0(nc5Var2, z4, z5, z6, h8a0Var, oaa0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5a0)) {
            return false;
        }
        v5a0 v5a0Var = (v5a0) obj;
        return this.f36818a.equals(v5a0Var.f36818a) && this.b == v5a0Var.b && this.c == v5a0Var.c && this.d == v5a0Var.d && Intrinsics.d(this.e, v5a0Var.e) && this.f == v5a0Var.f;
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(brm0.e(this.f36818a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        h8a0 h8a0Var = this.e;
        return this.f.hashCode() + ((iE + (h8a0Var == null ? 0 : h8a0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerMainState(backgroundHeaderModel=");
        sb.append(this.f36818a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", isError=");
        ua80.u(", isEmpty=", ", playerMenuModel=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", screenType=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
