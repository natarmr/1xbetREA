package a;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/cvq0;", "La/um40;", "La/dvq0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class cvq0 extends um40 {
    public final boolean b;
    public final gy40 c;
    public final boolean d;
    public final ucg0 e;
    public final Function1 f;

    public cvq0(boolean z, gy40 gy40Var, boolean z2, ucg0 ucg0Var, Function1 function1) {
        this.b = z;
        this.c = gy40Var;
        this.d = z2;
        this.e = ucg0Var;
        this.f = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cvq0.class != obj.getClass()) {
            return false;
        }
        cvq0 cvq0Var = (cvq0) obj;
        return this.b == cvq0Var.b && Intrinsics.d(this.c, cvq0Var.c) && this.d == cvq0Var.d && this.e.equals(cvq0Var.e) && this.f == cvq0Var.f;
    }

    @Override // a.um40
    public final lm40 f() {
        return new dvq0(this.b, this.c, this.d, this.e, this.f);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        dvq0 dvq0Var = (dvq0) lm40Var;
        boolean z = dvq0Var.n1;
        boolean z2 = this.b;
        if (z != z2) {
            dvq0Var.n1 = z2;
            s0x.S(dvq0Var);
        }
        dvq0Var.o1 = this.f;
        dvq0Var.p1(this.c, null, false, this.d, null, this.e, dvq0Var.p1);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.b) * 31;
        gy40 gy40Var = this.c;
        return this.f.hashCode() + twn.a(this.e.f35427a, brm0.e(brm0.e((iHashCode + (gy40Var != null ? gy40Var.hashCode() : 0)) * 961, 31, false), 31, this.d), 31);
    }
}
