package a;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class d9n extends lm40 implements ehl, v6z, vld {
    public final Function0 o;
    public d1v0 p;
    public final t33 q;
    public c4m0 r;
    public boolean s;
    public long t;
    public float w;
    public scq0 y;
    public long u = 0;
    public long v = 0;
    public final float[] x = ui30.a();

    public d9n(d1v0 d1v0Var, Function0 function0) {
        this.o = function0;
        this.p = d1v0Var;
        this.q = xf0.c(d1v0Var.f5330a);
    }

    @Override // a.lm40
    public final void R0() {
        this.y = x4d0.f0(this, new edl(this, (byte) 26));
    }

    @Override // a.lm40
    public final void S0() {
        this.s = false;
        scq0 scq0Var = this.y;
        if (scq0Var != null) {
            scq0Var.b();
        }
        c4m0 c4m0Var = this.r;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.r = null;
    }

    public final void Z0() {
        c4m0 c4m0Var = this.r;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.r = qjj.W(N0(), null, null, new c9n((Context) mbc.R(this, dy2.b), this, null), 3);
        }
    }

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        pj30Var.getClass();
        pu90 pu90VarS = pj30Var.S(j);
        int i = pu90VarS.f27604a;
        int i2 = pu90VarS.b;
        this.w = i + i2;
        float f = i * 0.45f;
        float f2 = i / 2.0f;
        float f3 = i2 / 2.0f;
        double d = (this.p.d * 3.1415927f) / 180.0f;
        this.u = (((long) Float.floatToRawIntBits(f2 - (((float) Math.cos(d)) * f))) << 32) | (((long) Float.floatToRawIntBits(f3 - (((float) Math.sin(d)) * f))) & 4294967295L);
        this.v = (((long) Float.floatToRawIntBits((((float) Math.cos(d)) * f) + f2)) << 32) | (((long) Float.floatToRawIntBits((f * ((float) Math.sin(d))) + f3)) & 4294967295L);
        return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b, new cam(pu90VarS, (byte) 3));
    }

    @Override // a.ehl
    public final void u0(g7z g7zVar) {
        float fA;
        this.t = System.currentTimeMillis();
        if (!this.s) {
            g7zVar.a();
            return;
        }
        float fFloatValue = ((Number) this.q.d()).floatValue();
        b9n b9nVar = this.p.g;
        if (b9nVar.equals(z8n.f43976a)) {
            float f = this.w;
            float f2 = -f;
            fA = rw2.a(f, f2, fFloatValue, f2);
        } else if (!b9nVar.equals(a9n.f487a)) {
            t9f.b();
            return;
        } else {
            float f3 = this.w;
            fA = rw2.a(-f3, f3, fFloatValue, f3);
        }
        float[] fArr = this.x;
        ui30.d(fArr);
        ui30.g(fArr, fA, 0.0f);
        g7zVar.a();
        e900 e900Var = new e900(this.p.f, null, ui30.b(this.u, fArr), ui30.b(this.v, fArr));
        float f4 = this.p.e;
        fhl.f(g7zVar, e900Var, 0L, 0L, (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), null, 246);
    }
}
