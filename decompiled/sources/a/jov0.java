package a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/jov0;", "La/um40;", "La/jtj0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class jov0 extends um40 {
    public final w12 b;

    public jov0(w12 w12Var) {
        this.b = w12Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        jov0 jov0Var = obj instanceof jov0 ? (jov0) obj : null;
        if (jov0Var == null) {
            return false;
        }
        return Intrinsics.d(this.b, jov0Var.b);
    }

    @Override // a.um40
    public final lm40 f() {
        jtj0 jtj0Var = new jtj0();
        jtj0Var.o = this.b;
        return jtj0Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        ((jtj0) lm40Var).o = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
