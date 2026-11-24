package a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/bbh0;", "La/um40;", "La/lbh0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class bbh0 extends um40 {
    public final bch0 b;
    public final ma80 c;
    public final boolean d;
    public final boolean e;
    public final qkq f;
    public final gy40 g;

    public bbh0(bch0 bch0Var, ma80 ma80Var, boolean z, boolean z2, qkq qkqVar, gy40 gy40Var) {
        this.b = bch0Var;
        this.c = ma80Var;
        this.d = z;
        this.e = z2;
        this.f = qkqVar;
        this.g = gy40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbh0)) {
            return false;
        }
        bbh0 bbh0Var = (bbh0) obj;
        return Intrinsics.d(this.b, bbh0Var.b) && this.c == bbh0Var.c && this.d == bbh0Var.d && this.e == bbh0Var.e && Intrinsics.d(this.f, bbh0Var.f) && Intrinsics.d(this.g, bbh0Var.g);
    }

    @Override // a.um40
    public final lm40 f() {
        return new lbh0(null, this.f, this.g, this.c, null, this.b, this.d, this.e);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        ((lbh0) lm40Var).u1(null, this.f, this.g, this.c, null, this.b, this.d, this.e);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e((this.c.hashCode() + (this.b.hashCode() * 31)) * 961, 31, this.d), 31, this.e);
        qkq qkqVar = this.f;
        int iHashCode = (iE + (qkqVar != null ? qkqVar.hashCode() : 0)) * 31;
        gy40 gy40Var = this.g;
        return (iHashCode + (gy40Var != null ? gy40Var.hashCode() : 0)) * 31;
    }
}
