package a;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/i4i0;", "La/um40;", "La/k4i0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class i4i0 extends um40 {
    public final boolean b;
    public final gy40 c;
    public final d6x d;
    public final boolean e;
    public final ucg0 f;
    public final Function0 g;

    public i4i0(boolean z, gy40 gy40Var, d6x d6xVar, boolean z2, ucg0 ucg0Var, Function0 function0) {
        this.b = z;
        this.c = gy40Var;
        this.d = d6xVar;
        this.e = z2;
        this.f = ucg0Var;
        this.g = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i4i0.class != obj.getClass()) {
            return false;
        }
        i4i0 i4i0Var = (i4i0) obj;
        return this.b == i4i0Var.b && Intrinsics.d(this.c, i4i0Var.c) && Intrinsics.d(this.d, i4i0Var.d) && this.e == i4i0Var.e && this.f.equals(i4i0Var.f) && this.g == i4i0Var.g;
    }

    @Override // a.um40
    public final lm40 f() {
        k4i0 k4i0Var = new k4i0(this.c, this.d, false, this.e, null, this.f, this.g);
        k4i0Var.n1 = this.b;
        return k4i0Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        k4i0 k4i0Var = (k4i0) lm40Var;
        boolean z = k4i0Var.n1;
        boolean z2 = this.b;
        if (z != z2) {
            k4i0Var.n1 = z2;
            s0x.S(k4i0Var);
        }
        k4i0Var.p1(this.c, this.d, false, this.e, null, this.f, this.g);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.b) * 31;
        gy40 gy40Var = this.c;
        int iHashCode2 = (iHashCode + (gy40Var != null ? gy40Var.hashCode() : 0)) * 31;
        d6x d6xVar = this.d;
        return this.g.hashCode() + twn.a(this.f.f35427a, brm0.e(brm0.e((iHashCode2 + (d6xVar != null ? d6xVar.hashCode() : 0)) * 31, 31, false), 31, this.e), 31);
    }
}
