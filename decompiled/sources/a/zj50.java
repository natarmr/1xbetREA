package a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/zj50;", "La/um40;", "La/ek50;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class zj50 extends um40 {
    public final vj50 b;
    public final yj50 c;

    public zj50(vj50 vj50Var, yj50 yj50Var) {
        this.b = vj50Var;
        this.c = yj50Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zj50)) {
            return false;
        }
        zj50 zj50Var = (zj50) obj;
        return Intrinsics.d(zj50Var.b, this.b) && Intrinsics.d(zj50Var.c, this.c);
    }

    @Override // a.um40
    public final lm40 f() {
        return new ek50(this.b, this.c);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        ek50 ek50Var = (ek50) lm40Var;
        ek50Var.o = this.b;
        yj50 yj50Var = ek50Var.p;
        if (yj50Var.f42727a == ek50Var) {
            yj50Var.f42727a = null;
            yj50Var.d = null;
            yj50Var.c = knx.h;
        }
        yj50 yj50Var2 = this.c;
        if (yj50Var2 == null) {
            yj50Var = new yj50();
            ek50Var.p = yj50Var;
        } else if (yj50Var2 != yj50Var) {
            ek50Var.p = yj50Var2;
            yj50Var = yj50Var2;
        }
        if (ek50Var.n) {
            yj50Var.f42727a = ek50Var;
            yj50Var.b = null;
            ek50Var.q = null;
            yj50Var.c = new np30(ek50Var, (byte) 19);
            yj50Var.d = ek50Var.N0();
        }
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        yj50 yj50Var = this.c;
        return iHashCode + (yj50Var != null ? yj50Var.hashCode() : 0);
    }
}
