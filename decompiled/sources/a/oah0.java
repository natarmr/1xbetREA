package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class oah0 extends lm40 implements v6z, qai0 {
    public rah0 o;
    public boolean p;
    public boolean q;

    @Override // a.v6z
    public final int U(c810 c810Var, pj30 pj30Var, int i) {
        if (this.q) {
            i = Integer.MAX_VALUE;
        }
        return pj30Var.P(i);
    }

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        d5c.H(j, this.q ? ma80.f21447a : ma80.b);
        pu90 pu90VarS = pj30Var.S(p4e.b(j, 0, this.q ? p4e.i(j) : Integer.MAX_VALUE, 0, this.q ? Integer.MAX_VALUE : p4e.h(j), 5));
        int i = pu90VarS.f27604a;
        int i2 = p4e.i(j);
        if (i > i2) {
            i = i2;
        }
        int i3 = pu90VarS.b;
        int iH = p4e.h(j);
        if (i3 > iH) {
            i3 = iH;
        }
        int i4 = pu90VarS.b - i3;
        int i5 = pu90VarS.f27604a - i;
        if (!this.q) {
            i4 = i5;
        }
        rah0 rah0Var = this.o;
        cgk0 cgk0Var = rah0Var.f;
        cgk0 cgk0Var2 = rah0Var.f30133a;
        cgk0Var.m(i4);
        rfk0 rfk0VarJ = vdx.J();
        Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
        rfk0 rfk0VarW = vdx.W(rfk0VarJ);
        try {
            if (cgk0Var2.l() > i4) {
                cgk0Var2.m(i4);
            }
            vdx.Y(rfk0VarJ, rfk0VarW, function1E);
            this.o.b.m(this.q ? i3 : i);
            this.o.c.m(this.q ? pu90VarS.b : pu90VarS.f27604a);
            ((hgk0) this.o.d).setValue(Boolean.valueOf(this.p));
            return vj30.x(vj30Var, i, i3, new g18((Object) this, i4, (Object) pu90VarS, (byte) 14));
        } catch (Throwable th) {
            vdx.Y(rfk0VarJ, rfk0VarW, function1E);
            throw th;
        }
    }

    @Override // a.v6z
    public final int e0(c810 c810Var, pj30 pj30Var, int i) {
        if (this.q) {
            i = Integer.MAX_VALUE;
        }
        return pj30Var.L(i);
    }

    @Override // a.v6z
    public final int v(c810 c810Var, pj30 pj30Var, int i) {
        if (!this.q) {
            i = Integer.MAX_VALUE;
        }
        return pj30Var.b(i);
    }

    @Override // a.v6z
    public final int w(c810 c810Var, pj30 pj30Var, int i) {
        if (!this.q) {
            i = Integer.MAX_VALUE;
        }
        return pj30Var.D(i);
    }

    @Override // a.qai0
    public final void x0(abi0 abi0Var) {
        yai0.j(abi0Var);
        final byte b = 0;
        final byte b2 = 1;
        t9h0 t9h0Var = new t9h0(new Function0(this) { // from class: a.nah0
            public final /* synthetic */ oah0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iL;
                byte b3 = b;
                oah0 oah0Var = this.b;
                switch (b3) {
                    case 0:
                        iL = oah0Var.o.f30133a.l();
                        break;
                    default:
                        iL = oah0Var.o.f.l();
                        break;
                }
                return Float.valueOf(iL);
            }
        }, new Function0(this) { // from class: a.nah0
            public final /* synthetic */ oah0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iL;
                byte b3 = b2;
                oah0 oah0Var = this.b;
                switch (b3) {
                    case 0:
                        iL = oah0Var.o.f30133a.l();
                        break;
                    default:
                        iL = oah0Var.o.f.l();
                        break;
                }
                return Float.valueOf(iL);
            }
        }, this.p);
        if (this.q) {
            zai0 zai0Var = xai0.w;
            iiy iiyVar = yai0.f42300a[13];
            zai0Var.getClass();
            abi0Var.b(zai0Var, t9h0Var);
            return;
        }
        zai0 zai0Var2 = xai0.v;
        iiy iiyVar2 = yai0.f42300a[12];
        zai0Var2.getClass();
        abi0Var.b(zai0Var2, t9h0Var);
    }
}
