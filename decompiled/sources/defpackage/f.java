package defpackage;

import a.a6a;
import a.bby;
import a.ehl;
import a.fvt0;
import a.g7z;
import a.lm40;
import a.nr;
import a.qjj;
import a.t33;
import a.xf0;
import a.yje;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends lm40 implements ehl {
    public boolean o;
    public float p;
    public short q;
    public t33 r;
    public bby s;

    @Override // a.lm40
    public final void R0() {
        if (this.r == null) {
            this.r = xf0.c(1.0f);
        }
        Z0();
    }

    @Override // a.lm40
    public final void S0() {
        bby bbyVar = this.s;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.s = null;
    }

    @Override // a.lm40
    public final void T0() {
        Z0();
    }

    public final void Z0() {
        if (this.r == null) {
            return;
        }
        bby bbyVar = this.s;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.s = qjj.W(N0(), null, null, new e(this, yjeVar, (byte) 0), 3);
    }

    @Override // a.ehl
    public final void u0(g7z g7zVar) {
        a6a a6aVar = g7zVar.f10839a;
        t33 t33Var = this.r;
        float fFloatValue = t33Var != null ? ((Number) t33Var.d()).floatValue() : 1.0f;
        long jE0 = a6aVar.E0();
        nr nrVar = a6aVar.b;
        long jP = nrVar.p();
        nrVar.i().l();
        try {
            ((fvt0) nrVar.b).z(fFloatValue, fFloatValue, jE0);
            g7zVar.a();
        } finally {
            c.g(nrVar, jP);
        }
    }
}
