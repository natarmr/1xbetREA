package a;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/np80;", "La/um40;", "La/op80;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class np80 extends um40 {
    public final vhv0 b;
    public final Function1 c;

    public np80(q33 q33Var, Function1 function1) {
        q33Var.getClass();
        this.b = q33Var;
        this.c = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        np80 np80Var = obj instanceof np80 ? (np80) obj : null;
        if (np80Var == null) {
            return false;
        }
        return Intrinsics.d(this.b, np80Var.b);
    }

    @Override // a.um40
    public final lm40 f() {
        vhv0 vhv0Var = this.b;
        vhv0Var.getClass();
        op80 op80Var = new op80();
        op80Var.o = vhv0Var;
        op80Var.p = this.c;
        return op80Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        op80 op80Var = (op80) lm40Var;
        op80Var.getClass();
        vhv0 vhv0Var = this.b;
        vhv0Var.getClass();
        op80Var.o = vhv0Var;
        op80Var.p = this.c;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
