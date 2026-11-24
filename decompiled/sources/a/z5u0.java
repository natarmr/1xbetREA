package a;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/z5u0;", "La/um40;", "La/b6u0;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class z5u0 extends um40 {
    public final oms0 b;
    public final vls0 c;
    public final pzn d;
    public final alo e;
    public final toj0 f;

    public z5u0(oms0 oms0Var, vls0 vls0Var, pzn pznVar, alo aloVar, toj0 toj0Var) {
        this.b = oms0Var;
        this.c = vls0Var;
        this.d = pznVar;
        this.e = aloVar;
        this.f = toj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z5u0) {
            z5u0 z5u0Var = (z5u0) obj;
            return this.b == z5u0Var.b && Intrinsics.d(this.c, z5u0Var.c) && this.d.equals(z5u0Var.d) && Intrinsics.d(this.e, z5u0Var.e) && this.f == z5u0Var.f;
        }
        return false;
    }

    @Override // a.um40
    public final lm40 f() {
        b6u0 b6u0Var = new b6u0();
        b6u0Var.o = this.c;
        b6u0Var.p = this.d;
        b6u0Var.q = this.e;
        b6u0Var.r = this.f;
        return b6u0Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        b6u0 b6u0Var = (b6u0) lm40Var;
        b6u0Var.getClass();
        b6u0Var.o = this.c;
        b6u0Var.p = this.d;
        b6u0Var.q = this.e;
        b6u0Var.r = this.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.f1078a.hashCode() + ((this.d.f27854a.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "VeilModifierElement(transition=" + this.b + ", veilAnimation=" + this.c + ", enter=" + this.d + ", exit=" + this.e + ", mutableTransformState=" + this.f + Separators.RPAREN;
    }
}
