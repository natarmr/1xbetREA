package a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/lp80;", "La/um40;", "La/mp80;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class lp80 extends um40 {
    public final float b;
    public final l7m0 c;
    public final l7m0 d;

    public /* synthetic */ lp80(float f, l7m0 l7m0Var, l7m0 l7m0Var2, int i) {
        this(f, (i & 2) != 0 ? null : l7m0Var, (i & 4) != 0 ? null : l7m0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp80)) {
            return false;
        }
        lp80 lp80Var = (lp80) obj;
        return this.b == lp80Var.b && Intrinsics.d(this.c, lp80Var.c) && Intrinsics.d(this.d, lp80Var.d);
    }

    @Override // a.um40
    public final lm40 f() {
        mp80 mp80Var = new mp80();
        mp80Var.o = this.b;
        mp80Var.p = this.c;
        mp80Var.q = this.d;
        return mp80Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        mp80 mp80Var = (mp80) lm40Var;
        mp80Var.o = this.b;
        mp80Var.p = this.c;
        mp80Var.q = this.d;
    }

    public final int hashCode() {
        l7m0 l7m0Var = this.c;
        int iHashCode = (l7m0Var != null ? l7m0Var.hashCode() : 0) * 31;
        l7m0 l7m0Var2 = this.d;
        return Float.hashCode(this.b) + ((iHashCode + (l7m0Var2 != null ? l7m0Var2.hashCode() : 0)) * 31);
    }

    public lp80(float f, l7m0 l7m0Var, l7m0 l7m0Var2) {
        this.b = f;
        this.c = l7m0Var;
        this.d = l7m0Var2;
    }
}
