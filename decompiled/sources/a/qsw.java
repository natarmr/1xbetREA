package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class qsw extends lm40 implements hps0, gpa0, vld {
    public cdl o;
    public d13 p;
    public boolean q;

    public qsw(d13 d13Var, cdl cdlVar) {
        this.o = cdlVar;
        this.p = d13Var;
    }

    @Override // a.lm40
    public final void S0() {
        d1();
    }

    public final void Z0() {
        d13 d13Var;
        mie0 mie0Var = new mie0();
        etm0.u(this, new h7w(mie0Var));
        qsw qswVar = (qsw) mie0Var.f21842a;
        if (qswVar == null || (d13Var = qswVar.p) == null) {
            d13Var = this.p;
        }
        a1(d13Var);
    }

    public void a1(bpa0 bpa0Var) {
        cpa0 cpa0Var = (cpa0) mbc.R(this, bmd.w);
        if (cpa0Var != null) {
            ((lx2) cpa0Var).f20793a = bpa0Var;
        }
    }

    public final void b1() {
        hie0 hie0Var = new hie0();
        hie0Var.f13108a = true;
        etm0.w(this, new fdl(hie0Var));
        if (hie0Var.f13108a) {
            Z0();
        }
    }

    public boolean c1(int i) {
        return (i == 3 || i == 4) ? false : true;
    }

    @Override // a.gpa0
    public final long d0() {
        if (this.o == null) {
            return dwr0.f6813a;
        }
        w6k w6kVar = vcc.Z(this).z;
        int i = dwr0.b;
        return egm0.k(w6kVar.T(10.0f), w6kVar.T(40.0f), w6kVar.T(10.0f), w6kVar.T(40.0f));
    }

    public final void d1() {
        if (this.q) {
            this.q = false;
            if (this.n) {
                mie0 mie0Var = new mie0();
                etm0.u(this, new cx2(mie0Var, (byte) 6));
                qsw qswVar = (qsw) mie0Var.f21842a;
                if (qswVar != null) {
                    qswVar.Z0();
                } else {
                    a1(null);
                }
            }
        }
    }

    @Override // a.gpa0
    public final void h(woa0 woa0Var, xoa0 xoa0Var, long j) {
        if (xoa0Var == xoa0.b) {
            List list = woa0Var.f39485a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (c1(((dpa0) list.get(i)).i)) {
                    int i2 = woa0Var.f;
                    if (i2 == 4) {
                        this.q = true;
                        b1();
                        return;
                    } else {
                        if (i2 == 5) {
                            d1();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // a.gpa0
    public final void n0() {
        d1();
    }
}
