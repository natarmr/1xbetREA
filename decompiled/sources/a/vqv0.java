package a;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/vqv0;", "La/um40;", "La/wqv0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class vqv0 extends um40 {
    public final dnk b;
    public final boolean c;
    public final Function2 d;
    public final Object e;

    public vqv0(dnk dnkVar, boolean z, Function2 function2, Object obj) {
        this.b = dnkVar;
        this.c = z;
        this.d = function2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vqv0.class != obj.getClass()) {
            return false;
        }
        vqv0 vqv0Var = (vqv0) obj;
        return this.b == vqv0Var.b && this.c == vqv0Var.c && Intrinsics.d(this.e, vqv0Var.e);
    }

    @Override // a.um40
    public final lm40 f() {
        wqv0 wqv0Var = new wqv0();
        wqv0Var.o = this.b;
        wqv0Var.p = this.c;
        wqv0Var.q = this.d;
        return wqv0Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        wqv0 wqv0Var = (wqv0) lm40Var;
        wqv0Var.o = this.b;
        wqv0Var.p = this.c;
        wqv0Var.q = this.d;
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(this.b.hashCode() * 31, 31, this.c);
    }
}
