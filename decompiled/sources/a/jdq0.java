package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class jdq0 extends lm40 implements v6z {
    public gy40 o;
    public boolean p;
    public nul0 q;
    public boolean r;
    public t33 s;
    public t33 t;
    public float u;
    public float v;

    @Override // a.lm40
    public final boolean O0() {
        return false;
    }

    @Override // a.lm40
    public final void R0() {
        qjj.W(N0(), null, null, new z2n0(this, null, (byte) 16), 3);
    }

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        float f;
        byte b = 0;
        byte b2 = 1;
        boolean z = (pj30Var.b(p4e.i(j)) == 0 || pj30Var.P(p4e.h(j)) == 0) ? false : true;
        if (this.r) {
            f = mzn0.f;
        } else {
            f = (z || this.p) ? fzn0.f10416a : fzn0.b;
        }
        float fW0 = vj30Var.w0(f);
        t33 t33Var = this.t;
        int iFloatValue = (int) (t33Var != null ? ((Number) t33Var.d()).floatValue() : fW0);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            zcx.a("width and height must be >= 0");
        }
        pu90 pu90VarS = pj30Var.S(r4e.h(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fW1 = vj30Var.w0((fzn0.d - vj30Var.s0(fW0)) / 2.0f);
        float fW2 = vj30Var.w0((fzn0.c - fzn0.f10416a) - fzn0.e);
        boolean z2 = this.r;
        if (z2 && this.p) {
            fW1 = fW2 - vj30Var.w0(mzn0.k);
        } else if (z2 && !this.p) {
            fW1 = vj30Var.w0(mzn0.k);
        } else if (this.p) {
            fW1 = fW2;
        }
        t33 t33Var2 = this.t;
        yje yjeVar = null;
        if (!Intrinsics.b(fW0, t33Var2 != null ? (Float) ((hgk0) t33Var2.e).getValue() : null)) {
            qjj.W(N0(), null, null, new idq0(this, fW0, yjeVar, b), 3);
        }
        t33 t33Var3 = this.s;
        if (!Intrinsics.b(fW1, t33Var3 != null ? (Float) ((hgk0) t33Var3.e).getValue() : null)) {
            qjj.W(N0(), null, null, new idq0(this, fW1, yjeVar, b2), 3);
        }
        if (Float.isNaN(this.v) && Float.isNaN(this.u)) {
            this.v = fW0;
            this.u = fW1;
        }
        return vj30.x(vj30Var, iFloatValue, iFloatValue, new ny2((Object) pu90VarS, (Object) this, fW1, (byte) 18));
    }
}
