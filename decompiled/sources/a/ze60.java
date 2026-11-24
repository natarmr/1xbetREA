package a;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/ze60;", "La/um40;", "La/af60;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ze60 extends um40 {
    public final Function1 b;

    public ze60(Function1 function1, i160 i160Var) {
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ze60 ze60Var = obj instanceof ze60 ? (ze60) obj : null;
        return ze60Var != null && this.b == ze60Var.b;
    }

    @Override // a.um40
    public final lm40 f() {
        af60 af60Var = new af60();
        af60Var.o = this.b;
        af60Var.p = true;
        return af60Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        af60 af60Var = (af60) lm40Var;
        Function1 function1 = af60Var.o;
        Function1 function2 = this.b;
        if (function1 != function2 || !af60Var.p) {
            vcc.Z(af60Var).V(false);
        }
        af60Var.o = function2;
        af60Var.p = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.b + ", rtlAware=true)";
    }
}
