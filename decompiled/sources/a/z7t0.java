package a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/z7t0;", "La/um40;", "La/a8t0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class z7t0 extends um40 {
    public final vhv0 b;

    public z7t0(vhv0 vhv0Var) {
        this.b = vhv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z7t0) {
            return Intrinsics.d(((z7t0) obj).b, this.b);
        }
        return false;
    }

    @Override // a.um40
    public final lm40 f() {
        a8t0 a8t0Var = new a8t0();
        a8t0Var.q = this.b;
        return a8t0Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        a8t0 a8t0Var = (a8t0) lm40Var;
        vhv0 vhv0Var = a8t0Var.q;
        vhv0 vhv0Var2 = this.b;
        if (Intrinsics.d(vhv0Var2, vhv0Var)) {
            return;
        }
        a8t0Var.q = vhv0Var2;
        a8t0Var.a1();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
