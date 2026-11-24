package a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/y1q0;", "La/um40;", "La/z1q0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class y1q0 extends um40 {
    public final String b;

    public y1q0(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1q0)) {
            return false;
        }
        return Intrinsics.d(this.b, ((y1q0) obj).b);
    }

    @Override // a.um40
    public final lm40 f() {
        z1q0 z1q0Var = new z1q0();
        z1q0Var.o = this.b;
        return z1q0Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        ((z1q0) lm40Var).o = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
