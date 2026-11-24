package a;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/w6d;", "La/um40;", "La/z6d;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class w6d extends um40 {
    public final gy40 b;
    public final boolean c;
    public final Function0 d;
    public final Function0 e;

    public w6d(gy40 gy40Var, Function0 function0, Function0 function1, boolean z) {
        this.b = gy40Var;
        this.c = z;
        this.d = function0;
        this.e = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w6d.class != obj.getClass()) {
            return false;
        }
        w6d w6dVar = (w6d) obj;
        return Intrinsics.d(this.b, w6dVar.b) && this.c == w6dVar.c && this.d == w6dVar.d && this.e == w6dVar.e;
    }

    @Override // a.um40
    public final lm40 f() {
        return new z6d(this.b, this.d, this.e, this.c);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        boolean z;
        z6d z6dVar = (z6d) lm40Var;
        z6dVar.m1 = true;
        boolean z2 = z6dVar.l1 == null;
        Function0 function0 = this.e;
        if (z2 != (function0 == null)) {
            z6dVar.e1();
            s0x.S(z6dVar);
            z = true;
        } else {
            z = false;
        }
        z6dVar.l1 = function0;
        boolean z3 = z6dVar.v;
        boolean z4 = this.c;
        boolean z5 = z3 != z4 ? true : z;
        z6dVar.p1(this.b, null, false, z4, null, null, this.d);
        if (z5) {
            z6dVar.q1(false);
            z6dVar.q1(true);
        }
    }

    public final int hashCode() {
        gy40 gy40Var = this.b;
        int iHashCode = (this.d.hashCode() + brm0.e(brm0.e((gy40Var != null ? gy40Var.hashCode() : 0) * 961, 31, false), 29791, this.c)) * 961;
        Function0 function0 = this.e;
        return Boolean.hashCode(true) + ((iHashCode + (function0 != null ? function0.hashCode() : 0)) * 961);
    }
}
