package a;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/kky;", "La/um40;", "La/mky;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class kky extends um40 {
    public final Function1 b;
    public final Function1 c;

    public kky(Function1 function1, Function1 function2) {
        this.b = function1;
        this.c = function2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kky)) {
            return false;
        }
        kky kkyVar = (kky) obj;
        return this.b == kkyVar.b && this.c == kkyVar.c;
    }

    @Override // a.um40
    public final lm40 f() {
        mky mkyVar = new mky();
        mkyVar.o = this.b;
        mkyVar.p = this.c;
        return mkyVar;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        mky mkyVar = (mky) lm40Var;
        mkyVar.o = this.b;
        mkyVar.p = this.c;
    }

    public final int hashCode() {
        Function1 function1 = this.b;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1 function2 = this.c;
        return iHashCode + (function2 != null ? function2.hashCode() : 0);
    }
}
