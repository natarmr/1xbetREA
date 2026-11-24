package a;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/oe60;", "La/um40;", "La/re60;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class oe60 extends um40 {
    public final float b;
    public final float c;
    public final boolean d;
    public final Function1 e;

    public oe60(float f, float f2, boolean z, Function1 function1) {
        this.b = f;
        this.c = f2;
        this.d = z;
        this.e = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        oe60 oe60Var = obj instanceof oe60 ? (oe60) obj : null;
        return oe60Var != null && ycl.b(this.b, oe60Var.b) && ycl.b(this.c, oe60Var.c) && this.d == oe60Var.d;
    }

    @Override // a.um40
    public final lm40 f() {
        re60 re60Var = new re60();
        re60Var.o = this.b;
        re60Var.p = this.c;
        re60Var.q = this.d;
        return re60Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        re60 re60Var = (re60) lm40Var;
        float f = re60Var.o;
        float f2 = this.b;
        boolean zB = ycl.b(f, f2);
        float f3 = this.c;
        boolean z = this.d;
        if (!zB || !ycl.b(re60Var.p, f3) || re60Var.q != z) {
            vcc.Z(re60Var).V(false);
        }
        re60Var.o = f2;
        re60Var.p = f3;
        re60Var.q = z;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + defpackage.c.a(Float.hashCode(this.b) * 31, this.c, 31);
    }

    public final String toString() {
        return rw2.p(b1j.n("OffsetModifierElement(x=", ycl.c(this.b), ", y=", ycl.c(this.c), ", rtlAware="), this.d, Separators.RPAREN);
    }
}
