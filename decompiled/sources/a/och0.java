package a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/och0;", "La/um40;", "La/oah0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class och0 extends um40 {
    public final rah0 b;
    public final boolean c;
    public final boolean d;

    public och0(rah0 rah0Var, boolean z, boolean z2) {
        this.b = rah0Var;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof och0)) {
            return false;
        }
        och0 och0Var = (och0) obj;
        return Intrinsics.d(this.b, och0Var.b) && this.c == och0Var.c && this.d == och0Var.d;
    }

    @Override // a.um40
    public final lm40 f() {
        oah0 oah0Var = new oah0();
        oah0Var.o = this.b;
        oah0Var.p = this.c;
        oah0Var.q = this.d;
        return oah0Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        oah0 oah0Var = (oah0) lm40Var;
        oah0Var.o = this.b;
        oah0Var.p = this.c;
        oah0Var.q = this.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(this.b.hashCode() * 31, 31, this.c);
    }
}
