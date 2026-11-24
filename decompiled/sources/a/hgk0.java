package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class hgk0 extends c8m0 implements fgk0 {
    public final igk0 b;
    public ggk0 c;

    public hgk0(Object obj, igk0 igk0Var) {
        this.b = igk0Var;
        rfk0 rfk0VarH = xfk0.h();
        ggk0 ggk0Var = new ggk0(obj, rfk0VarH.g());
        if (!(rfk0VarH instanceof x8v)) {
            ggk0Var.b = new ggk0(obj, 1L);
        }
        this.c = ggk0Var;
    }

    @Override // a.b8m0
    public final e8m0 b(e8m0 e8m0Var, e8m0 e8m0Var2, e8m0 e8m0Var3) {
        if (this.b.g(((ggk0) e8m0Var2).c, ((ggk0) e8m0Var3).c)) {
            return e8m0Var2;
        }
        return null;
    }

    @Override // a.fgk0
    public final igk0 d() {
        return this.b;
    }

    @Override // a.b8m0
    public final e8m0 g() {
        return this.c;
    }

    @Override // a.l7m0
    public final Object getValue() {
        return ((ggk0) xfk0.s(this.c, this)).c;
    }

    @Override // a.b8m0
    public final void h(e8m0 e8m0Var) {
        this.c = (ggk0) e8m0Var;
    }

    @Override // a.pz40
    public final void setValue(Object obj) {
        rfk0 rfk0VarH;
        ggk0 ggk0Var = (ggk0) xfk0.f(this.c);
        if (this.b.g(ggk0Var.c, obj)) {
            return;
        }
        ggk0 ggk0Var2 = this.c;
        synchronized (xfk0.c) {
            rfk0VarH = xfk0.h();
            ((ggk0) xfk0.n(ggk0Var2, this, rfk0VarH, ggk0Var)).c = obj;
        }
        xfk0.l(rfk0VarH, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((ggk0) xfk0.f(this.c)).c + ")@" + hashCode();
    }
}
