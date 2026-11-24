package a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/tsw;", "La/um40;", "La/xsw;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class tsw extends um40 {
    public final gy40 b;

    public tsw(gy40 gy40Var) {
        this.b = gy40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tsw) && Intrinsics.d(((tsw) obj).b, this.b);
    }

    @Override // a.um40
    public final lm40 f() {
        xsw xswVar = new xsw();
        xswVar.o = this.b;
        return xswVar;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        xsw xswVar = (xsw) lm40Var;
        gy40 gy40Var = xswVar.o;
        gy40 gy40Var2 = this.b;
        if (Intrinsics.d(gy40Var, gy40Var2)) {
            return;
        }
        xswVar.b1();
        xswVar.o = gy40Var2;
    }

    public final int hashCode() {
        return this.b.hashCode() * 31;
    }
}
