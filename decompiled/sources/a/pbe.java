package a;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/pbe;", "La/um40;", "La/qbe;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class pbe extends um40 {
    public final Function1 b;

    public pbe(Function1 function1) {
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pbe) && ((pbe) obj).b == this.b;
    }

    @Override // a.um40
    public final lm40 f() {
        qbe qbeVar = new qbe();
        qbeVar.q = this.b;
        return qbeVar;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        qbe qbeVar = (qbe) lm40Var;
        Function1 function1 = qbeVar.q;
        Function1 function2 = this.b;
        if (function2 != function1) {
            qbeVar.q = function2;
            qbeVar.a1();
        }
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
