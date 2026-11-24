package a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/jc5;", "La/um40;", "La/sc5;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class jc5 extends um40 {
    public final long b;
    public final t89 c;
    public final yjj0 d;

    public jc5(long j, t89 t89Var, yjj0 yjj0Var, int i) {
        j = (i & 1) != 0 ? y3d.g : j;
        t89Var = (i & 2) != 0 ? null : t89Var;
        this.b = j;
        this.c = t89Var;
        this.d = yjj0Var;
    }

    public final boolean equals(Object obj) {
        jc5 jc5Var = obj instanceof jc5 ? (jc5) obj : null;
        if (jc5Var == null) {
            return false;
        }
        long j = jc5Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && Intrinsics.d(this.c, jc5Var.c) && Intrinsics.d(this.d, jc5Var.d);
    }

    @Override // a.um40
    public final lm40 f() {
        sc5 sc5Var = new sc5();
        sc5Var.o = this.b;
        sc5Var.p = this.c;
        sc5Var.q = 1.0f;
        sc5Var.r = this.d;
        sc5Var.s = 9205357640488583168L;
        return sc5Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        sc5 sc5Var = (sc5) lm40Var;
        sc5Var.o = this.b;
        sc5Var.p = this.c;
        sc5Var.q = 1.0f;
        yjj0 yjj0Var = sc5Var.r;
        yjj0 yjj0Var2 = this.d;
        if (!Intrinsics.d(yjj0Var, yjj0Var2)) {
            sc5Var.r = yjj0Var2;
            s0x.S(sc5Var);
        }
        vfc.J(sc5Var);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        int iHashCode = Long.hashCode(this.b) * 31;
        t89 t89Var = this.c;
        return this.d.hashCode() + defpackage.c.a((iHashCode + (t89Var != null ? t89Var.hashCode() : 0)) * 31, 1.0f, 31);
    }
}
