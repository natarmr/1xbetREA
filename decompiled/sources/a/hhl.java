package a;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/hhl;", "La/um40;", "La/oi9;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class hhl extends um40 {
    public final Function1 b;

    public hhl(Function1 function1) {
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hhl) {
            return this.b == ((hhl) obj).b;
        }
        return false;
    }

    @Override // a.um40
    public final lm40 f() {
        return new oi9(new pi9(), this.b);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        oi9 oi9Var = (oi9) lm40Var;
        oi9Var.r = this.b;
        oi9Var.Z0();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
