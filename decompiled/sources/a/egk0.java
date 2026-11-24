package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class egk0 extends c8m0 implements fgk0, pz40, l7m0 {
    public dgk0 b;

    public egk0(long j) {
        rfk0 rfk0VarH = xfk0.h();
        dgk0 dgk0Var = new dgk0(rfk0VarH.g(), j);
        if (!(rfk0VarH instanceof x8v)) {
            dgk0Var.b = new dgk0(1L, j);
        }
        this.b = dgk0Var;
    }

    @Override // a.b8m0
    public final e8m0 b(e8m0 e8m0Var, e8m0 e8m0Var2, e8m0 e8m0Var3) {
        if (((dgk0) e8m0Var2).c == ((dgk0) e8m0Var3).c) {
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
        return Long.valueOf(l());
    }

    @Override // a.b8m0
    public final void h(e8m0 e8m0Var) {
        this.b = (dgk0) e8m0Var;
    }

    public final long l() {
        return ((dgk0) xfk0.s(this.b, this)).c;
    }

    public final void m(long j) {
        rfk0 rfk0VarH;
        dgk0 dgk0Var = (dgk0) xfk0.f(this.b);
        if (dgk0Var.c != j) {
            dgk0 dgk0Var2 = this.b;
            synchronized (xfk0.c) {
                rfk0VarH = xfk0.h();
                ((dgk0) xfk0.n(dgk0Var2, this, rfk0VarH, dgk0Var)).c = j;
            }
            xfk0.l(rfk0VarH, this);
        }
    }

    @Override // a.pz40
    public final void setValue(Object obj) {
        m(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((dgk0) xfk0.f(this.b)).c + ")@" + hashCode();
    }
}
