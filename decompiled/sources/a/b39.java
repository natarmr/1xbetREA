package a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/b39;", "La/um40;", "La/e39;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class b39 extends um40 {
    public final d39 b;

    public b39(d39 d39Var) {
        this.b = d39Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b39) {
            return Intrinsics.d(this.b, ((b39) obj).b);
        }
        return false;
    }

    @Override // a.um40
    public final lm40 f() {
        e39 e39Var = new e39();
        e39Var.o = this.b;
        return e39Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        e39 e39Var = (e39) lm40Var;
        d39 d39Var = e39Var.o;
        if (d39Var != null) {
            d39Var.f5392a.j(e39Var);
        }
        d39 d39Var2 = this.b;
        if (d39Var2 != null) {
            d39Var2.f5392a.b(e39Var);
        }
        e39Var.o = d39Var2;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
