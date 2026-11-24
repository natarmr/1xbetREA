package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gdl extends lm40 implements hps0, g6z {
    public gdl o;
    public gdl p;
    public long q;

    @Override // a.lm40
    public final void S0() {
        this.p = null;
        this.o = null;
    }

    public final boolean Z0() {
        gdl gdlVar = this.o;
        if (gdlVar != null) {
            return gdlVar.Z0();
        }
        gdl gdlVar2 = this.p;
        if (gdlVar2 != null) {
            return gdlVar2.Z0();
        }
        return false;
    }

    @Override // a.g6z, a.xj30
    public final void a(long j) {
        this.q = j;
    }

    public final void a1() {
        gdl gdlVar = this.p;
        if (gdlVar != null) {
            gdlVar.a1();
            return;
        }
        gdl gdlVar2 = this.o;
        if (gdlVar2 != null) {
            gdlVar2.a1();
        }
    }

    public final void b1() {
        gdl gdlVar = this.p;
        if (gdlVar != null) {
            gdlVar.b1();
        }
        gdl gdlVar2 = this.o;
        if (gdlVar2 != null) {
            gdlVar2.b1();
        }
        this.o = null;
    }

    public final void c1(a1d a1dVar) {
        hps0 hps0Var;
        gdl gdlVar;
        gdl gdlVar2 = this.o;
        if (gdlVar2 == null || !vbc.U(gdlVar2, xbc.U(a1dVar))) {
            if (this.f20279a.n) {
                mie0 mie0Var = new mie0();
                etm0.w(this, new xg((Object) mie0Var, (Object) this, (Object) a1dVar, (byte) 4));
                hps0Var = (hps0) mie0Var.f21842a;
            } else {
                hps0Var = null;
            }
            gdlVar = (gdl) hps0Var;
        } else {
            gdlVar = gdlVar2;
        }
        if (gdlVar != null && gdlVar2 == null) {
            gdlVar.a1();
            gdlVar.c1(a1dVar);
            gdl gdlVar3 = this.p;
            if (gdlVar3 != null) {
                gdlVar3.b1();
            }
        } else if (gdlVar == null && gdlVar2 != null) {
            gdl gdlVar4 = this.p;
            if (gdlVar4 != null) {
                gdlVar4.a1();
                gdlVar4.c1(a1dVar);
            }
            gdlVar2.b1();
        } else if (!Intrinsics.d(gdlVar, gdlVar2)) {
            if (gdlVar != null) {
                gdlVar.a1();
                gdlVar.c1(a1dVar);
            }
            if (gdlVar2 != null) {
                gdlVar2.b1();
            }
        } else if (gdlVar != null) {
            gdlVar.c1(a1dVar);
        } else {
            gdl gdlVar5 = this.p;
            if (gdlVar5 != null) {
                gdlVar5.c1(a1dVar);
            }
        }
        this.o = gdlVar;
    }

    public final void d1() {
        gdl gdlVar = this.p;
        if (gdlVar != null) {
            gdlVar.d1();
            return;
        }
        gdl gdlVar2 = this.o;
        if (gdlVar2 != null) {
            gdlVar2.d1();
        }
    }

    @Override // a.hps0
    public final Object j() {
        return jtv.g;
    }
}
