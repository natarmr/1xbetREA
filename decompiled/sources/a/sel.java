package a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/sel;", "La/um40;", "La/vel;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class sel extends um40 {
    public static final n2l j = new n2l((byte) 27);
    public final wel b;
    public final ma80 c;
    public final boolean d;
    public final gy40 e;
    public final boolean f;
    public final xdr g;
    public final xdr h;
    public final boolean i;

    public sel(wel welVar, ma80 ma80Var, boolean z, gy40 gy40Var, boolean z2, xdr xdrVar, xdr xdrVar2, boolean z3) {
        this.b = welVar;
        this.c = ma80Var;
        this.d = z;
        this.e = gy40Var;
        this.f = z2;
        this.g = xdrVar;
        this.h = xdrVar2;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sel.class != obj.getClass()) {
            return false;
        }
        sel selVar = (sel) obj;
        return Intrinsics.d(this.b, selVar.b) && this.c == selVar.c && this.d == selVar.d && Intrinsics.d(this.e, selVar.e) && this.f == selVar.f && Intrinsics.d(this.g, selVar.g) && Intrinsics.d(this.h, selVar.h) && this.i == selVar.i;
    }

    @Override // a.um40
    public final lm40 f() {
        vel velVar = new vel(j, this.d, this.e, this.c);
        velVar.k1 = this.b;
        velVar.l1 = this.f;
        velVar.m1 = this.g;
        velVar.n1 = this.h;
        velVar.o1 = this.i;
        return velVar;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        boolean z;
        boolean z2;
        vel velVar = (vel) lm40Var;
        wel welVar = velVar.k1;
        wel welVar2 = this.b;
        if (Intrinsics.d(welVar, welVar2)) {
            z = false;
        } else {
            velVar.k1 = welVar2;
            z = true;
        }
        boolean z3 = velVar.o1;
        boolean z4 = this.i;
        if (z3 != z4) {
            velVar.o1 = z4;
            z2 = true;
        } else {
            z2 = z;
        }
        velVar.m1 = this.g;
        velVar.n1 = this.h;
        velVar.l1 = this.f;
        velVar.t1(j, this.d, this.e, this.c, z2);
    }

    public final int hashCode() {
        int iE = brm0.e((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
        gy40 gy40Var = this.e;
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + ((this.g.hashCode() + brm0.e((iE + (gy40Var != null ? gy40Var.hashCode() : 0)) * 31, 31, this.f)) * 31)) * 31);
    }
}
