package a;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/bh80;", "La/um40;", "La/dh80;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class bh80 extends um40 {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final Function1 g;

    public bh80(float f, float f2, float f3, float f4, boolean z, Function1 function1) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = z;
        this.g = function1;
        boolean z2 = true;
        boolean z3 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z2 = false;
        }
        if (!z3 || !z2) {
            vcx.a("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        bh80 bh80Var = obj instanceof bh80 ? (bh80) obj : null;
        return bh80Var != null && ycl.b(this.b, bh80Var.b) && ycl.b(this.c, bh80Var.c) && ycl.b(this.d, bh80Var.d) && ycl.b(this.e, bh80Var.e) && this.f == bh80Var.f;
    }

    @Override // a.um40
    public final lm40 f() {
        dh80 dh80Var = new dh80();
        dh80Var.o = this.b;
        dh80Var.p = this.c;
        dh80Var.q = this.d;
        dh80Var.r = this.e;
        dh80Var.s = this.f;
        return dh80Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        dh80 dh80Var = (dh80) lm40Var;
        dh80Var.o = this.b;
        dh80Var.p = this.c;
        dh80Var.q = this.d;
        dh80Var.r = this.e;
        dh80Var.s = this.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + defpackage.c.a(defpackage.c.a(defpackage.c.a(Float.hashCode(this.b) * 31, this.c, 31), this.d, 31), this.e, 31);
    }
}
