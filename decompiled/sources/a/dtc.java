package a;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/dtc;", "La/um40;", "La/htc;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class dtc extends um40 {
    public final gy40 b;
    public final d6x c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final ucg0 g;
    public final Function0 h;

    public dtc(gy40 gy40Var, d6x d6xVar, boolean z, boolean z2, String str, ucg0 ucg0Var, Function0 function0) {
        this.b = gy40Var;
        this.c = d6xVar;
        this.d = z;
        this.e = z2;
        this.f = str;
        this.g = ucg0Var;
        this.h = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dtc.class != obj.getClass()) {
            return false;
        }
        dtc dtcVar = (dtc) obj;
        return Intrinsics.d(this.b, dtcVar.b) && Intrinsics.d(this.c, dtcVar.c) && this.d == dtcVar.d && this.e == dtcVar.e && Intrinsics.d(this.f, dtcVar.f) && Intrinsics.d(this.g, dtcVar.g) && this.h == dtcVar.h;
    }

    @Override // a.um40
    public final lm40 f() {
        return new htc(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        ((htc) lm40Var).p1(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final int hashCode() {
        gy40 gy40Var = this.b;
        int iHashCode = (gy40Var != null ? gy40Var.hashCode() : 0) * 31;
        d6x d6xVar = this.c;
        int iE = brm0.e(brm0.e((iHashCode + (d6xVar != null ? d6xVar.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode2 = (iE + (str != null ? str.hashCode() : 0)) * 31;
        ucg0 ucg0Var = this.g;
        return this.h.hashCode() + ((iHashCode2 + (ucg0Var != null ? Integer.hashCode(ucg0Var.f35427a) : 0)) * 31);
    }
}
