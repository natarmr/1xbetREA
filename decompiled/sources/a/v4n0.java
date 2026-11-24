package a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/v4n0;", "La/um40;", "La/w4n0;", "io.coil-kt.coil3_coil-compose-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class v4n0 extends um40 {
    public final pm80 b;
    public final u12 c;
    public final qge d;
    public final float e;
    public final a4d f;
    public final boolean g;

    public v4n0(pm80 pm80Var, u12 u12Var, qge qgeVar, float f, a4d a4dVar, boolean z) {
        this.b = pm80Var;
        this.c = u12Var;
        this.d = qgeVar;
        this.e = f;
        this.f = a4dVar;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4n0)) {
            return false;
        }
        v4n0 v4n0Var = (v4n0) obj;
        return Intrinsics.d(this.b, v4n0Var.b) && Intrinsics.d(this.c, v4n0Var.c) && Intrinsics.d(this.d, v4n0Var.d) && Float.compare(this.e, v4n0Var.e) == 0 && Intrinsics.d(this.f, v4n0Var.f) && this.g == v4n0Var.g;
    }

    @Override // a.um40
    public final lm40 f() {
        w4n0 w4n0Var = new w4n0(this.c, this.d, this.e, this.f, this.g, null, null);
        w4n0Var.v = this.b;
        return w4n0Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        w4n0 w4n0Var = (w4n0) lm40Var;
        long jI = w4n0Var.v.i();
        pm80 pm80Var = this.b;
        boolean zB = h7k0.b(jI, pm80Var.i());
        w4n0Var.v = pm80Var;
        w4n0Var.o = this.c;
        w4n0Var.p = this.d;
        w4n0Var.q = this.e;
        w4n0Var.r = this.f;
        w4n0Var.s = this.g;
        if (!Intrinsics.d(w4n0Var.t, null)) {
            w4n0Var.t = null;
            s0x.S(w4n0Var);
        }
        if (!zB) {
            n7x.I(w4n0Var);
        }
        vfc.J(w4n0Var);
    }

    public final int hashCode() {
        int iA = defpackage.c.a((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31, this.e, 31);
        a4d a4dVar = this.f;
        return brm0.e((iA + (a4dVar == null ? 0 : a4dVar.hashCode())) * 31, 31, this.g);
    }

    public final String toString() {
        return "SubcomposeContentPainterElement(painter=" + this.b + ", alignment=" + this.c + ", contentScale=" + this.d + ", alpha=" + this.e + ", colorFilter=" + this.f + ", clipToBounds=" + this.g + ", contentDescription=null)";
    }
}
