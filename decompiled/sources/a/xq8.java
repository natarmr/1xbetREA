package a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/xq8;", "La/um40;", "La/yq8;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class xq8 extends um40 {
    public final u12 b;
    public final boolean c;

    public xq8(u12 u12Var, boolean z) {
        this.b = u12Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        xq8 xq8Var = obj instanceof xq8 ? (xq8) obj : null;
        return xq8Var != null && Intrinsics.d(this.b, xq8Var.b) && this.c == xq8Var.c;
    }

    @Override // a.um40
    public final lm40 f() {
        yq8 yq8Var = new yq8();
        yq8Var.o = this.b;
        yq8Var.p = this.c;
        return yq8Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        yq8 yq8Var = (yq8) lm40Var;
        yq8Var.o = this.b;
        yq8Var.p = this.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }
}
