package a;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/gh60;", "La/um40;", "La/hh60;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class gh60 extends um40 {
    public final Function1 b;

    public gh60(Function1 function1) {
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gh60) {
            return this.b == ((gh60) obj).b;
        }
        return false;
    }

    @Override // a.um40
    public final lm40 f() {
        hh60 hh60Var = new hh60();
        hh60Var.o = this.b;
        return hh60Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        ((hh60) lm40Var).o = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
