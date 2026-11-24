package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class cgk0 extends c8m0 implements fgk0, l7m0, pz40 {
    public bgk0 b;

    public cgk0(int i) {
        rfk0 rfk0VarH = xfk0.h();
        bgk0 bgk0Var = new bgk0(rfk0VarH.g(), i);
        if (!(rfk0VarH instanceof x8v)) {
            bgk0Var.b = new bgk0(1L, i);
        }
        this.b = bgk0Var;
    }

    @Override // a.b8m0
    public final e8m0 b(e8m0 e8m0Var, e8m0 e8m0Var2, e8m0 e8m0Var3) {
        if (((bgk0) e8m0Var2).c == ((bgk0) e8m0Var3).c) {
            return e8m0Var2;
        }
        return null;
    }

    @Override // a.fgk0
    public final igk0 d() {
        return rek0.c;
    }

    @Override // a.b8m0
    public final e8m0 g() {
        return this.b;
    }

    @Override // a.l7m0
    public final Object getValue() {
        return Integer.valueOf(l());
    }

    @Override // a.b8m0
    public final void h(e8m0 e8m0Var) {
        this.b = (bgk0) e8m0Var;
    }

    public final int l() {
        return ((bgk0) xfk0.s(this.b, this)).c;
    }

    public final void m(int i) {
        rfk0 rfk0VarH;
        bgk0 bgk0Var = (bgk0) xfk0.f(this.b);
        if (bgk0Var.c != i) {
            bgk0 bgk0Var2 = this.b;
            synchronized (xfk0.c) {
                rfk0VarH = xfk0.h();
                ((bgk0) xfk0.n(bgk0Var2, this, rfk0VarH, bgk0Var)).c = i;
            }
            xfk0.l(rfk0VarH, this);
        }
    }

    @Override // a.pz40
    public final void setValue(Object obj) {
        m(((Number) obj).intValue());
    }

    public final String toString() {
        return f140.j(((bgk0) xfk0.f(this.b)).c, "MutableIntState(value=", hashCode(), ")@");
    }
}
