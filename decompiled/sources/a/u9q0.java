package a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/u9q0;", "La/um40;", "La/x9q0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u9q0 extends um40 {
    public final String b;
    public final y9q0 c;
    public final mrq d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;
    public final n4d i;

    public u9q0(String str, y9q0 y9q0Var, mrq mrqVar, int i, boolean z, int i2, int i3, n4d n4dVar) {
        this.b = str;
        this.c = y9q0Var;
        this.d = mrqVar;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.i = n4dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9q0)) {
            return false;
        }
        u9q0 u9q0Var = (u9q0) obj;
        return Intrinsics.d(this.i, u9q0Var.i) && Intrinsics.d(this.b, u9q0Var.b) && Intrinsics.d(this.c, u9q0Var.c) && Intrinsics.d(this.d, u9q0Var.d) && this.e == u9q0Var.e && this.f == u9q0Var.f && this.g == u9q0Var.g && this.h == u9q0Var.h;
    }

    @Override // a.um40
    public final lm40 f() {
        x9q0 x9q0Var = new x9q0();
        x9q0Var.o = this.b;
        x9q0Var.p = this.c;
        x9q0Var.q = this.d;
        x9q0Var.r = this.e;
        x9q0Var.s = this.f;
        x9q0Var.t = this.g;
        x9q0Var.u = this.h;
        x9q0Var.v = this.i;
        return x9q0Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // a.um40
    public final void h(lm40 lm40Var) {
        boolean z;
        x9q0 x9q0Var = (x9q0) lm40Var;
        n4d n4dVar = x9q0Var.v;
        n4d n4dVar2 = this.i;
        boolean zD = Intrinsics.d(n4dVar2, n4dVar);
        x9q0Var.v = n4dVar2;
        boolean z2 = false;
        boolean z3 = true;
        y9q0 y9q0Var = this.c;
        if (zD) {
            y9q0 y9q0Var2 = x9q0Var.p;
            if (y9q0Var == y9q0Var2) {
                y9q0Var.getClass();
            } else if (!y9q0Var.f42262a.c(y9q0Var2.f42262a)) {
                z = true;
            }
            z = false;
        } else {
            z = true;
        }
        String str = x9q0Var.o;
        String str2 = this.b;
        if (!Intrinsics.d(str, str2)) {
            x9q0Var.o = str2;
            x9q0Var.z = null;
            z2 = true;
        }
        boolean z4 = !x9q0Var.p.c(y9q0Var);
        x9q0Var.p = y9q0Var;
        int i = x9q0Var.u;
        int i2 = this.h;
        if (i != i2) {
            x9q0Var.u = i2;
            z4 = true;
        }
        int i3 = x9q0Var.t;
        int i4 = this.g;
        if (i3 != i4) {
            x9q0Var.t = i4;
            z4 = true;
        }
        boolean z5 = x9q0Var.s;
        boolean z6 = this.f;
        if (z5 != z6) {
            x9q0Var.s = z6;
            z4 = true;
        }
        mrq mrqVar = x9q0Var.q;
        mrq mrqVar2 = this.d;
        if (!Intrinsics.d(mrqVar, mrqVar2)) {
            x9q0Var.q = mrqVar2;
            z4 = true;
        }
        int i5 = x9q0Var.r;
        int i6 = this.e;
        if (i5 == i6) {
            z3 = z4;
        } else {
            x9q0Var.r = i6;
        }
        if (z2 || z3) {
            bo80 bo80VarZ0 = x9q0Var.Z0();
            String str3 = x9q0Var.o;
            y9q0 y9q0Var3 = x9q0Var.p;
            mrq mrqVar3 = x9q0Var.q;
            int i7 = x9q0Var.r;
            boolean z7 = x9q0Var.s;
            int i8 = x9q0Var.t;
            int i9 = x9q0Var.u;
            bo80VarZ0.f2921a = str3;
            bo80VarZ0.b = y9q0Var3;
            bo80VarZ0.c = mrqVar3;
            bo80VarZ0.d = i7;
            bo80VarZ0.e = z7;
            bo80VarZ0.f = i8;
            bo80VarZ0.g = i9;
            bo80VarZ0.s = (bo80VarZ0.s << 2) | 2;
            bo80VarZ0.c();
        }
        if (x9q0Var.n) {
            if (z2 || (z && x9q0Var.y != null)) {
                s0x.S(x9q0Var);
            }
            if (z2 || z3) {
                n7x.I(x9q0Var);
                vfc.J(x9q0Var);
            }
            if (z) {
                vfc.J(x9q0Var);
            }
        }
    }

    public final int hashCode() {
        int iE = (((brm0.e(twn.a(this.e, (this.d.hashCode() + brm0.g(this.c, this.b.hashCode() * 31, 31)) * 31, 31), 31, this.f) + this.g) * 31) + this.h) * 31;
        n4d n4dVar = this.i;
        return iE + (n4dVar != null ? n4dVar.hashCode() : 0);
    }
}
