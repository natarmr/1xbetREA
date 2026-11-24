package a;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/w8d0;", "La/um40;", "La/c9d0;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w8d0 extends um40 {
    public final boolean b;
    public final Function0 c;
    public final boolean d;
    public final d9d0 e;
    public final float f;

    public w8d0(boolean z, Function0 function0, boolean z2, d9d0 d9d0Var, float f) {
        this.b = z;
        this.c = function0;
        this.d = z2;
        this.e = d9d0Var;
        this.f = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8d0)) {
            return false;
        }
        w8d0 w8d0Var = (w8d0) obj;
        return this.b == w8d0Var.b && this.d == w8d0Var.d && this.c == w8d0Var.c && Intrinsics.d(this.e, w8d0Var.e) && ycl.b(this.f, w8d0Var.f);
    }

    @Override // a.um40
    public final lm40 f() {
        return new c9d0(this.b, this.c, this.d, this.e, this.f);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        c9d0 c9d0Var = (c9d0) lm40Var;
        c9d0Var.r = this.c;
        c9d0Var.s = this.d;
        c9d0Var.t = this.e;
        c9d0Var.u = this.f;
        boolean z = c9d0Var.q;
        boolean z2 = this.b;
        if (z != z2) {
            c9d0Var.q = z2;
            qjj.W(c9d0Var.N0(), null, null, new z8b0(c9d0Var, null, (byte) 4), 3);
        }
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + ((this.e.hashCode() + ((this.c.hashCode() + brm0.e(Boolean.hashCode(this.b) * 31, 31, this.d)) * 31)) * 31);
    }
}
