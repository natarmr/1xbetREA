package a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/b6x;", "La/um40;", "La/c6x;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class b6x extends um40 {
    public final gy40 b;
    public final d6x c;

    public b6x(gy40 gy40Var, d6x d6xVar) {
        this.b = gy40Var;
        this.c = d6xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6x)) {
            return false;
        }
        b6x b6xVar = (b6x) obj;
        return Intrinsics.d(this.b, b6xVar.b) && Intrinsics.d(this.c, b6xVar.c);
    }

    @Override // a.um40
    public final lm40 f() {
        yzj yzjVarA = this.c.a(this.b);
        c6x c6xVar = new c6x();
        c6xVar.q = yzjVarA;
        c6xVar.Z0(yzjVarA);
        return c6xVar;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        c6x c6xVar = (c6x) lm40Var;
        yzj yzjVarA = this.c.a(this.b);
        c6xVar.a1(c6xVar.q);
        c6xVar.q = yzjVarA;
        c6xVar.Z0(yzjVarA);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
