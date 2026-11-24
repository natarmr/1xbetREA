package a;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class brm extends lm40 implements ehl, v6z, vld {
    public fqj0 o;
    public final t33 p;
    public c4m0 q;
    public boolean r;
    public long s;
    public long t;
    public long u;
    public float v;
    public final float[] w;
    public scq0 x;

    public brm(fqj0 fqj0Var) {
        fqj0Var.getClass();
        this.o = fqj0Var;
        this.p = xf0.c(fqj0Var.f9977a);
        this.t = 0L;
        this.u = 0L;
        this.w = ui30.a();
    }

    @Override // a.lm40
    public final void R0() {
        this.x = x4d0.f0(this, new edl(this, (byte) 22));
    }

    @Override // a.lm40
    public final void S0() {
        scq0 scq0Var = this.x;
        if (scq0Var != null) {
            scq0Var.b();
        }
        c4m0 c4m0Var = this.q;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.q = null;
    }

    public final void Z0() {
        c4m0 c4m0Var = this.q;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.q = qjj.W(N0(), null, null, new arm((Context) mbc.R(this, dy2.b), this, null), 3);
        }
    }

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        pj30Var.getClass();
        pu90 pu90VarS = pj30Var.S(j);
        int i = pu90VarS.f27604a;
        this.v = pu90VarS.b + i;
        this.t = (((long) Float.floatToRawIntBits(i)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        this.u = (((long) Float.floatToRawIntBits(-pu90VarS.f27604a)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b, new cam(pu90VarS, (byte) 2));
    }

    @Override // a.ehl
    public final void u0(g7z g7zVar) {
        float fA;
        this.s = System.currentTimeMillis();
        if (!this.r) {
            g7zVar.a();
            fhl.u(g7zVar, this.o.e, 0L, 0L, 0.0f, null, null, 0, 126);
            return;
        }
        float fFloatValue = ((Number) this.p.d()).floatValue();
        zqm zqmVar = this.o.f;
        if (zqmVar.equals(xqm.f41328a)) {
            float f = this.v;
            float f2 = -f;
            fA = rw2.a(f, f2, fFloatValue, f2);
        } else if (!zqmVar.equals(yqm.f43083a)) {
            t9f.b();
            return;
        } else {
            float f3 = this.v;
            fA = rw2.a(-f3, f3, fFloatValue, f3);
        }
        float[] fArr = this.w;
        ui30.d(fArr);
        ui30.g(fArr, fA, 0.0f);
        g7zVar.a();
        fhl.u(g7zVar, this.o.e, 0L, 0L, 0.0f, null, null, 0, 126);
        fhl.r(g7zVar, new e900(this.o.d, null, ui30.b(this.t, fArr), ui30.b(this.u, fArr)), 0L, 0L, 0.0f, null, null, 0, 126);
    }
}
