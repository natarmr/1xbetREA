package a;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/u9o0;", "La/um40;", "La/v9o0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class u9o0 extends um40 {
    public final Function1 b;

    public u9o0(Function1 function1) {
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u9o0) {
            return this.b == ((u9o0) obj).b;
        }
        return false;
    }

    @Override // a.um40
    public final lm40 f() {
        v9o0 v9o0Var = new v9o0(i120.m);
        v9o0Var.r = this.b;
        return v9o0Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        v9o0 v9o0Var = (v9o0) lm40Var;
        Function1 function1 = v9o0Var.r;
        Function1 function2 = this.b;
        if (function1 != function2) {
            v9o0Var.r = function2;
            djv0 djv0Var = v9o0Var.s;
            if (djv0Var != null) {
                vhv0 vhv0Var = (vhv0) function2.invoke(djv0Var);
                if (Intrinsics.d(vhv0Var, v9o0Var.q)) {
                    return;
                }
                v9o0Var.q = vhv0Var;
                v9o0Var.a1();
            }
        }
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
