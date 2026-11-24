package a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/qqq;", "La/um40;", "La/uqq;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class qqq extends um40 {
    public final gy40 b;

    public qqq(gy40 gy40Var) {
        this.b = gy40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qqq) {
            return Intrinsics.d(this.b, ((qqq) obj).b);
        }
        return false;
    }

    @Override // a.um40
    public final lm40 f() {
        return new uqq(this.b, 1, null);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        ((uqq) lm40Var).e1(this.b);
    }

    public final int hashCode() {
        gy40 gy40Var = this.b;
        if (gy40Var != null) {
            return gy40Var.hashCode();
        }
        return 0;
    }
}
