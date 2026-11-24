package a;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/i2q0;", "La/um40;", "La/l2q0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i2q0 extends um40 {
    public final j83 b;
    public final y9q0 c;
    public final mrq d;
    public final Function1 e;
    public final int f;
    public final boolean g;
    public final int h;
    public final int i;
    public final List j;
    public final Function1 k;
    public final n4d l;
    public final n05 m;
    public final Function1 n;

    public i2q0(j83 j83Var, y9q0 y9q0Var, mrq mrqVar, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function2, n4d n4dVar, n05 n05Var, Function1 function3) {
        this.b = j83Var;
        this.c = y9q0Var;
        this.d = mrqVar;
        this.e = function1;
        this.f = i;
        this.g = z;
        this.h = i2;
        this.i = i3;
        this.j = list;
        this.k = function2;
        this.l = n4dVar;
        this.m = n05Var;
        this.n = function3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2q0)) {
            return false;
        }
        i2q0 i2q0Var = (i2q0) obj;
        return Intrinsics.d(this.l, i2q0Var.l) && Intrinsics.d(this.b, i2q0Var.b) && Intrinsics.d(this.c, i2q0Var.c) && Intrinsics.d(this.j, i2q0Var.j) && Intrinsics.d(this.d, i2q0Var.d) && this.e == i2q0Var.e && this.n == i2q0Var.n && this.f == i2q0Var.f && this.g == i2q0Var.g && this.h == i2q0Var.h && this.i == i2q0Var.i && this.k == i2q0Var.k;
    }

    @Override // a.um40
    public final lm40 f() {
        l2q0 l2q0Var = new l2q0();
        l2q0Var.o = this.b;
        l2q0Var.p = this.c;
        l2q0Var.q = this.d;
        l2q0Var.r = this.e;
        l2q0Var.s = this.f;
        l2q0Var.t = this.g;
        l2q0Var.u = this.h;
        l2q0Var.v = this.i;
        l2q0Var.w = this.j;
        l2q0Var.x = this.k;
        l2q0Var.y = this.l;
        l2q0Var.z = this.m;
        l2q0Var.A = this.n;
        return l2q0Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // a.um40
    public final void h(lm40 lm40Var) {
        boolean z;
        l2q0 l2q0Var = (l2q0) lm40Var;
        n4d n4dVar = l2q0Var.y;
        n4d n4dVar2 = this.l;
        boolean zD = Intrinsics.d(n4dVar2, n4dVar);
        l2q0Var.y = n4dVar2;
        boolean z2 = false;
        boolean z3 = true;
        y9q0 y9q0Var = this.c;
        if (zD) {
            y9q0 y9q0Var2 = l2q0Var.p;
            if (y9q0Var == y9q0Var2) {
                y9q0Var.getClass();
            } else if (!y9q0Var.f42262a.c(y9q0Var2.f42262a)) {
                z = true;
            }
            z = false;
        } else {
            z = true;
        }
        String str = l2q0Var.o.b;
        j83 j83Var = this.b;
        boolean zD2 = Intrinsics.d(str, j83Var.b);
        boolean z4 = (zD2 && Intrinsics.d(l2q0Var.o.f16067a, j83Var.f16067a)) ? false : true;
        if (z4) {
            l2q0Var.o = j83Var;
        }
        if (!zD2) {
            l2q0Var.f1 = null;
        }
        boolean z5 = !l2q0Var.p.c(y9q0Var);
        l2q0Var.p = y9q0Var;
        List list = l2q0Var.w;
        List list2 = this.j;
        if (!Intrinsics.d(list, list2)) {
            l2q0Var.w = list2;
            z5 = true;
        }
        int i = l2q0Var.v;
        int i2 = this.i;
        if (i != i2) {
            l2q0Var.v = i2;
            z5 = true;
        }
        int i3 = l2q0Var.u;
        int i4 = this.h;
        if (i3 != i4) {
            l2q0Var.u = i4;
            z5 = true;
        }
        boolean z6 = l2q0Var.t;
        boolean z7 = this.g;
        if (z6 != z7) {
            l2q0Var.t = z7;
            z5 = true;
        }
        mrq mrqVar = l2q0Var.q;
        mrq mrqVar2 = this.d;
        if (!Intrinsics.d(mrqVar, mrqVar2)) {
            l2q0Var.q = mrqVar2;
            z5 = true;
        }
        int i5 = l2q0Var.s;
        int i6 = this.f;
        if (i5 != i6) {
            l2q0Var.s = i6;
            z5 = true;
        }
        n05 n05Var = l2q0Var.z;
        n05 n05Var2 = this.m;
        if (!Intrinsics.d(n05Var, n05Var2)) {
            l2q0Var.z = n05Var2;
            z5 = true;
        }
        Function1 function1 = l2q0Var.r;
        Function1 function2 = this.e;
        if (function1 != function2) {
            l2q0Var.r = function2;
            z2 = true;
        }
        Function1 function3 = l2q0Var.x;
        Function1 function4 = this.k;
        if (function3 != function4) {
            l2q0Var.x = function4;
            z2 = true;
        }
        Function1 function5 = l2q0Var.A;
        Function1 function6 = this.n;
        if (function5 != function6) {
            l2q0Var.A = function6;
        } else {
            z3 = z2;
        }
        if (z4 || z5 || z3) {
            ew40 ew40VarZ0 = l2q0Var.Z0();
            j83 j83Var2 = l2q0Var.o;
            y9q0 y9q0Var3 = l2q0Var.p;
            mrq mrqVar3 = l2q0Var.q;
            int i7 = l2q0Var.s;
            boolean z8 = l2q0Var.t;
            int i8 = l2q0Var.u;
            int i9 = l2q0Var.v;
            List list3 = l2q0Var.w;
            n05 n05Var3 = l2q0Var.z;
            ew40VarZ0.f8503a = j83Var2;
            ew40VarZ0.f(y9q0Var3);
            ew40VarZ0.b = mrqVar3;
            ew40VarZ0.c = i7;
            ew40VarZ0.d = z8;
            ew40VarZ0.e = i8;
            ew40VarZ0.f = i9;
            ew40VarZ0.g = list3;
            ew40VarZ0.h = n05Var3;
            ew40VarZ0.s = (ew40VarZ0.s << 2) | 2;
            ew40VarZ0.m = null;
            ew40VarZ0.o = null;
            ew40VarZ0.q = -1;
            ew40VarZ0.p = -1;
            ew40VarZ0.r = null;
        }
        if (l2q0Var.n) {
            if (z4 || (z && l2q0Var.Z != null)) {
                s0x.S(l2q0Var);
            }
            if (z4 || z5 || z3) {
                n7x.I(l2q0Var);
                vfc.J(l2q0Var);
            }
            if (z) {
                vfc.J(l2q0Var);
            }
        }
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + brm0.g(this.c, this.b.hashCode() * 31, 31)) * 31;
        Function1 function1 = this.e;
        int iE = (((brm0.e(twn.a(this.f, (iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31, 31), 31, this.g) + this.h) * 31) + this.i) * 31;
        List list = this.j;
        int iHashCode2 = (iE + (list != null ? list.hashCode() : 0)) * 31;
        Function1 function2 = this.k;
        int iHashCode3 = (iHashCode2 + (function2 != null ? function2.hashCode() : 0)) * 961;
        n4d n4dVar = this.l;
        int iHashCode4 = (iHashCode3 + (n4dVar != null ? n4dVar.hashCode() : 0)) * 31;
        Function1 function3 = this.n;
        return iHashCode4 + (function3 != null ? function3.hashCode() : 0);
    }
}
