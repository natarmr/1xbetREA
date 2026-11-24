package a;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/kpq;", "La/um40;", "La/mpq;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class kpq extends um40 {
    public final Function1 b;

    public kpq(Function1 function1) {
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kpq) {
            return this.b == ((kpq) obj).b;
        }
        return false;
    }

    @Override // a.um40
    public final lm40 f() {
        mpq mpqVar = new mpq();
        mpqVar.o = this.b;
        return mpqVar;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        ((mpq) lm40Var).o = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
