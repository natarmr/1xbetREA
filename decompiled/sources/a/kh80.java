package a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/kh80;", "La/um40;", "La/nh80;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class kh80 extends um40 {
    public final hh80 b;

    public kh80(hh80 hh80Var, r580 r580Var) {
        this.b = hh80Var;
    }

    public final boolean equals(Object obj) {
        kh80 kh80Var = obj instanceof kh80 ? (kh80) obj : null;
        if (kh80Var == null) {
            return false;
        }
        return Intrinsics.d(this.b, kh80Var.b);
    }

    @Override // a.um40
    public final lm40 f() {
        nh80 nh80Var = new nh80();
        nh80Var.o = this.b;
        return nh80Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        ((nh80) lm40Var).o = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
