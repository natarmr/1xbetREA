package a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/uah0;", "La/um40;", "La/vah0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class uah0 extends um40 {
    public final bch0 b;
    public final ma80 c;
    public final boolean d;
    public final boolean e;
    public final qkq f;
    public final gy40 g;
    public final j39 h;
    public final boolean i;
    public final vf80 j;

    public uah0(j39 j39Var, qkq qkqVar, gy40 gy40Var, ma80 ma80Var, vf80 vf80Var, bch0 bch0Var, boolean z, boolean z2, boolean z3) {
        this.b = bch0Var;
        this.c = ma80Var;
        this.d = z;
        this.e = z2;
        this.f = qkqVar;
        this.g = gy40Var;
        this.h = j39Var;
        this.i = z3;
        this.j = vf80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uah0.class != obj.getClass()) {
            return false;
        }
        uah0 uah0Var = (uah0) obj;
        return this.b.equals(uah0Var.b) && this.c == uah0Var.c && this.d == uah0Var.d && this.e == uah0Var.e && Intrinsics.d(this.f, uah0Var.f) && Intrinsics.d(this.g, uah0Var.g) && Intrinsics.d(this.h, uah0Var.h) && this.i == uah0Var.i && Intrinsics.d(this.j, uah0Var.j);
    }

    @Override // a.um40
    public final lm40 f() {
        vah0 vah0Var = new vah0();
        vah0Var.q = this.b;
        vah0Var.r = this.c;
        vah0Var.s = this.d;
        vah0Var.t = this.e;
        vah0Var.u = this.f;
        vah0Var.v = this.g;
        vah0Var.w = this.h;
        vah0Var.x = this.i;
        vah0Var.y = this.j;
        return vah0Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        ((vah0) lm40Var).e1(this.h, this.f, this.g, this.c, this.j, this.b, this.i, this.d, this.e);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d), 31, this.e);
        qkq qkqVar = this.f;
        int iHashCode = (iE + (qkqVar != null ? qkqVar.hashCode() : 0)) * 31;
        gy40 gy40Var = this.g;
        int iHashCode2 = (iHashCode + (gy40Var != null ? gy40Var.hashCode() : 0)) * 31;
        j39 j39Var = this.h;
        int iE2 = brm0.e((iHashCode2 + (j39Var != null ? j39Var.hashCode() : 0)) * 31, 31, this.i);
        vf80 vf80Var = this.j;
        return iE2 + (vf80Var != null ? vf80Var.hashCode() : 0);
    }
}
