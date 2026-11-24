package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class g39 extends lm40 implements z29, g6z {
    public nee o;
    public boolean p;

    public static final jge0 Z0(g39 g39Var, s460 s460Var, gj4 gj4Var) {
        jge0 jge0Var;
        if (g39Var.n && g39Var.p) {
            s460 s460VarY = vcc.Y(g39Var);
            if (!s460Var.g1().n) {
                s460Var = null;
            }
            if (s460Var != null && (jge0Var = (jge0) gj4Var.invoke()) != null) {
                return jge0Var.m(s460VarY.w(s460Var, false).g());
            }
        }
        return null;
    }

    @Override // a.g6z
    public final void N(j6z j6zVar) {
        this.p = true;
    }

    @Override // a.lm40
    public final boolean O0() {
        return false;
    }

    @Override // a.z29
    public final Object a0(s460 s460Var, gj4 gj4Var, zje zjeVar) {
        Object objJ = d5c.J(zjeVar, new jv0(this, s460Var, gj4Var, new kk0(this, s460Var, gj4Var, (byte) 13), null, (byte) 4));
        return objJ == wne.f39444a ? objJ : Unit.f46060a;
    }
}
