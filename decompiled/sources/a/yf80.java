package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/yf80;", "La/um40;", "La/zf80;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class yf80 extends um40 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof yf80);
    }

    @Override // a.um40
    public final lm40 f() {
        zf80 zf80Var = new zf80();
        zf80Var.q = null;
        return zf80Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        zf80 zf80Var = (zf80) lm40Var;
        yzj yzjVar = zf80Var.q;
        if (yzjVar != null) {
            zf80Var.a1(yzjVar);
        }
        zf80Var.q = null;
        zf80Var.q = null;
    }

    public final int hashCode() {
        return 0;
    }
}
