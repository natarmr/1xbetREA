package a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/hp80;", "La/um40;", "La/ip80;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hp80 extends um40 {
    public final vhv0 b;

    public hp80(q33 q33Var) {
        q33Var.getClass();
        this.b = q33Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        hp80 hp80Var = obj instanceof hp80 ? (hp80) obj : null;
        if (hp80Var == null) {
            return false;
        }
        return Intrinsics.d(this.b, hp80Var.b);
    }

    @Override // a.um40
    public final lm40 f() {
        vhv0 vhv0Var = this.b;
        vhv0Var.getClass();
        ip80 ip80Var = new ip80();
        ip80Var.o = vhv0Var;
        return ip80Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        ip80 ip80Var = (ip80) lm40Var;
        ip80Var.getClass();
        vhv0 vhv0Var = this.b;
        vhv0Var.getClass();
        ip80Var.o = vhv0Var;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
