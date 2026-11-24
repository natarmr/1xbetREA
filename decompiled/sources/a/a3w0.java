package a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/a3w0;", "La/um40;", "La/b3w0;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a3w0 extends um40 {
    public final float b;
    public final Object c;

    public a3w0(Object obj, float f) {
        this.b = f;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a3w0)) {
            return false;
        }
        a3w0 a3w0Var = (a3w0) obj;
        return a3w0Var.b == this.b && Intrinsics.d(a3w0Var.c, this.c);
    }

    @Override // a.um40
    public final lm40 f() {
        b3w0 b3w0Var = new b3w0();
        b3w0Var.o = this.b;
        b3w0Var.p = this.c;
        return b3w0Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        b3w0 b3w0Var = (b3w0) lm40Var;
        b3w0Var.o = this.b;
        b3w0Var.p = this.c;
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.b) * 31;
        Object obj = this.c;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }
}
