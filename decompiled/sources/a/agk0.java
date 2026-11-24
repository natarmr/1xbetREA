package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class agk0 extends c8m0 implements fgk0, l7m0, pz40 {
    public zfk0 b;

    public agk0(float f) {
        rfk0 rfk0VarH = xfk0.h();
        zfk0 zfk0Var = new zfk0(f, rfk0VarH.g());
        if (!(rfk0VarH instanceof x8v)) {
            zfk0Var.b = new zfk0(f, 1L);
        }
        this.b = zfk0Var;
    }

    @Override // a.b8m0
    public final e8m0 b(e8m0 e8m0Var, e8m0 e8m0Var2, e8m0 e8m0Var3) {
        if (((zfk0) e8m0Var2).c == ((zfk0) e8m0Var3).c) {
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
        return Float.valueOf(l());
    }

    @Override // a.b8m0
    public final void h(e8m0 e8m0Var) {
        this.b = (zfk0) e8m0Var;
    }

    public final float l() {
        return ((zfk0) xfk0.s(this.b, this)).c;
    }

    public final void m(float f) {
        rfk0 rfk0VarH;
        zfk0 zfk0Var = (zfk0) xfk0.f(this.b);
        if (zfk0Var.c == f) {
            return;
        }
        zfk0 zfk0Var2 = this.b;
        synchronized (xfk0.c) {
            rfk0VarH = xfk0.h();
            ((zfk0) xfk0.n(zfk0Var2, this, rfk0VarH, zfk0Var)).c = f;
        }
        xfk0.l(rfk0VarH, this);
    }

    @Override // a.pz40
    public final void setValue(Object obj) {
        m(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((zfk0) xfk0.f(this.b)).c + ")@" + hashCode();
    }
}
