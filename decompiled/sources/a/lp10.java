package a;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/lp10;", "La/um40;", "La/np10;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class lp10 extends um40 {
    public final vpj0 b;
    public final a1i c;
    public final yv90 d;

    public lp10(vpj0 vpj0Var, a1i a1iVar, yv90 yv90Var) {
        this.b = vpj0Var;
        this.c = a1iVar;
        this.d = yv90Var;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // a.um40
    public final lm40 f() {
        return new np10(this.b, this.c, this.d);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        np10 np10Var = (np10) lm40Var;
        float f = np10Var.q;
        long j = np10Var.s;
        float f2 = np10Var.t;
        boolean z = np10Var.r;
        float f3 = np10Var.u;
        boolean z2 = np10Var.v;
        yv90 yv90Var = np10Var.w;
        View view = np10Var.x;
        w6k w6kVar = np10Var.y;
        np10Var.o = this.b;
        np10Var.q = Float.NaN;
        np10Var.r = true;
        np10Var.s = 9205357640488583168L;
        np10Var.t = Float.NaN;
        np10Var.u = Float.NaN;
        np10Var.v = true;
        np10Var.p = this.c;
        yv90 yv90Var2 = this.d;
        np10Var.w = yv90Var2;
        View viewZ = tdc.Z(np10Var);
        w6k w6kVar2 = vcc.Z(np10Var).z;
        if (np10Var.z != null) {
            zai0 zai0Var = op10.f25618a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(f)) && Float.NaN != f && !yv90Var2.b()) || 9205357640488583168L != j || !ycl.b(Float.NaN, f2) || !ycl.b(Float.NaN, f3) || true != z || true != z2 || !yv90Var2.equals(yv90Var) || !viewZ.equals(view) || !Intrinsics.d(w6kVar2, w6kVar)) {
                np10Var.a1();
            }
        }
        np10Var.b1();
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + brm0.e(defpackage.c.a(defpackage.c.a(rw2.b(brm0.e(defpackage.c.a(this.b.hashCode() * 961, Float.NaN, 31), 31, true), 31, 9205357640488583168L), Float.NaN, 31), Float.NaN, 31), 31, true)) * 31);
    }
}
