package a;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/cn8;", "La/um40;", "La/bn8;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class cn8 extends um40 {
    public final float b;
    public final skk0 c;
    public final yjj0 d;

    public cn8(float f, skk0 skk0Var, yjj0 yjj0Var) {
        this.b = f;
        this.c = skk0Var;
        this.d = yjj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn8)) {
            return false;
        }
        cn8 cn8Var = (cn8) obj;
        return ycl.b(this.b, cn8Var.b) && this.c.equals(cn8Var.c) && Intrinsics.d(this.d, cn8Var.d);
    }

    @Override // a.um40
    public final lm40 f() {
        return new bn8(this.b, this.c, this.d);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        bn8 bn8Var = (bn8) lm40Var;
        float f = bn8Var.r;
        oi9 oi9Var = bn8Var.u;
        float f2 = this.b;
        if (!ycl.b(f, f2)) {
            bn8Var.r = f2;
            oi9Var.Z0();
        }
        skk0 skk0Var = bn8Var.s;
        skk0 skk0Var2 = this.c;
        if (!Intrinsics.d(skk0Var, skk0Var2)) {
            bn8Var.s = skk0Var2;
            oi9Var.Z0();
        }
        yjj0 yjj0Var = bn8Var.t;
        yjj0 yjj0Var2 = this.d;
        if (Intrinsics.d(yjj0Var, yjj0Var2)) {
            return;
        }
        bn8Var.t = yjj0Var2;
        oi9Var.Z0();
        s0x.S(bn8Var);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (Float.hashCode(this.b) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ycl.c(this.b) + ", brush=" + this.c + ", shape=" + this.d + Separators.RPAREN;
    }
}
