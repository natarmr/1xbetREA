package a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/hdq0;", "La/um40;", "La/jdq0;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class hdq0 extends um40 {
    public final gy40 b;
    public final boolean c;
    public final nul0 d;

    public hdq0(gy40 gy40Var, boolean z, nul0 nul0Var) {
        this.b = gy40Var;
        this.c = z;
        this.d = nul0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdq0)) {
            return false;
        }
        hdq0 hdq0Var = (hdq0) obj;
        return Intrinsics.d(this.b, hdq0Var.b) && this.c == hdq0Var.c && this.d.equals(hdq0Var.d);
    }

    @Override // a.um40
    public final lm40 f() {
        jdq0 jdq0Var = new jdq0();
        jdq0Var.o = this.b;
        jdq0Var.p = this.c;
        jdq0Var.q = this.d;
        jdq0Var.u = Float.NaN;
        jdq0Var.v = Float.NaN;
        return jdq0Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        jdq0 jdq0Var = (jdq0) lm40Var;
        jdq0Var.o = this.b;
        boolean z = jdq0Var.p;
        boolean z2 = this.c;
        if (z != z2) {
            n7x.I(jdq0Var);
        }
        jdq0Var.p = z2;
        jdq0Var.q = this.d;
        if (jdq0Var.t == null && !Float.isNaN(jdq0Var.v)) {
            jdq0Var.t = xf0.c(jdq0Var.v);
        }
        if (jdq0Var.s != null || Float.isNaN(jdq0Var.u)) {
            return;
        }
        jdq0Var.s = xf0.c(jdq0Var.u);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.b + ", checked=" + this.c + ", animationSpec=" + this.d + ')';
    }
}
