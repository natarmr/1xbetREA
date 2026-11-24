package a;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/acz;", "La/um40;", "La/dcz;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class acz extends um40 {
    public final Function0 b;
    public final xbz c;
    public final ma80 d;
    public final boolean e;
    public final boolean f;

    public acz(Function0 function0, xbz xbzVar, ma80 ma80Var, boolean z, boolean z2) {
        this.b = function0;
        this.c = xbzVar;
        this.d = ma80Var;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acz)) {
            return false;
        }
        acz aczVar = (acz) obj;
        return this.b == aczVar.b && Intrinsics.d(this.c, aczVar.c) && this.d == aczVar.d && this.e == aczVar.e && this.f == aczVar.f;
    }

    @Override // a.um40
    public final lm40 f() {
        return new dcz(this.b, this.c, this.d, this.e, this.f);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        dcz dczVar = (dcz) lm40Var;
        dczVar.o = this.b;
        dczVar.p = this.c;
        ma80 ma80Var = dczVar.q;
        ma80 ma80Var2 = this.d;
        if (ma80Var != ma80Var2) {
            dczVar.q = ma80Var2;
            s0x.S(dczVar);
        }
        boolean z = dczVar.r;
        boolean z2 = this.e;
        boolean z3 = this.f;
        if (z == z2 && dczVar.s == z3) {
            return;
        }
        dczVar.r = z2;
        dczVar.s = z3;
        dczVar.Z0();
        s0x.S(dczVar);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31, 31, this.e);
    }
}
