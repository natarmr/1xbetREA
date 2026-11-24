package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/m7k0;", "La/um40;", "La/p7k0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class m7k0 extends um40 {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;

    public m7k0(float f, float f2, float f3, float f4, boolean z, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7k0)) {
            return false;
        }
        m7k0 m7k0Var = (m7k0) obj;
        return ycl.b(this.b, m7k0Var.b) && ycl.b(this.c, m7k0Var.c) && ycl.b(this.d, m7k0Var.d) && ycl.b(this.e, m7k0Var.e) && this.f == m7k0Var.f;
    }

    @Override // a.um40
    public final lm40 f() {
        p7k0 p7k0Var = new p7k0();
        p7k0Var.o = this.b;
        p7k0Var.p = this.c;
        p7k0Var.q = this.d;
        p7k0Var.r = this.e;
        p7k0Var.s = this.f;
        return p7k0Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        p7k0 p7k0Var = (p7k0) lm40Var;
        p7k0Var.o = this.b;
        p7k0Var.p = this.c;
        p7k0Var.q = this.d;
        p7k0Var.r = this.e;
        p7k0Var.s = this.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + defpackage.c.a(defpackage.c.a(defpackage.c.a(Float.hashCode(this.b) * 31, this.c, 31), this.d, 31), this.e, 31);
    }

    public m7k0(float f, float f2, float f3, float f4, boolean z) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = z;
    }
}
