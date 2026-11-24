package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class xsw extends lm40 implements gpa0 {
    public gy40 o;
    public rsw p;

    @Override // a.lm40
    public final void S0() {
        b1();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Z0(zje zjeVar) {
        usw uswVar;
        rsw rswVar;
        if (zjeVar instanceof usw) {
            uswVar = (usw) zjeVar;
            int i = uswVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                uswVar.l = i - Integer.MIN_VALUE;
            } else {
                uswVar = new usw(this, zjeVar);
            }
        } else {
            uswVar = new usw(this, zjeVar);
        }
        Object obj = uswVar.j;
        wne wneVar = wne.f39444a;
        int i2 = uswVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            if (this.p == null) {
                rsw rswVar2 = new rsw();
                gy40 gy40Var = this.o;
                uswVar.i = rswVar2;
                uswVar.l = 1;
                if (gy40Var.a(rswVar2, uswVar) == wneVar) {
                    return wneVar;
                }
                rswVar = rswVar2;
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        rswVar = uswVar.i;
        z1x.P(obj);
        this.p = rswVar;
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a1(zje zjeVar) {
        vsw vswVar;
        if (zjeVar instanceof vsw) {
            vswVar = (vsw) zjeVar;
            int i = vswVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                vswVar.k = i - Integer.MIN_VALUE;
            } else {
                vswVar = new vsw(this, zjeVar);
            }
        } else {
            vswVar = new vsw(this, zjeVar);
        }
        Object obj = vswVar.i;
        wne wneVar = wne.f39444a;
        int i2 = vswVar.k;
        if (i2 == 0) {
            z1x.P(obj);
            rsw rswVar = this.p;
            if (rswVar != null) {
                ssw sswVar = new ssw(rswVar);
                gy40 gy40Var = this.o;
                vswVar.k = 1;
                if (gy40Var.a(sswVar, vswVar) == wneVar) {
                    return wneVar;
                }
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        this.p = null;
        return Unit.f46060a;
    }

    public final void b1() {
        rsw rswVar = this.p;
        if (rswVar != null) {
            this.o.b(new ssw(rswVar));
            this.p = null;
        }
    }

    @Override // a.gpa0
    public final void h(woa0 woa0Var, xoa0 xoa0Var, long j) {
        if (xoa0Var == xoa0.b) {
            int i = woa0Var.f;
            yje yjeVar = null;
            if (i == 4) {
                qjj.W(N0(), null, null, new wsw(this, yjeVar, (byte) 0), 3);
            } else if (i == 5) {
                qjj.W(N0(), null, null, new wsw(this, yjeVar, (byte) 1), 3);
            }
        }
    }

    @Override // a.gpa0
    public final void n0() {
        b1();
    }
}
