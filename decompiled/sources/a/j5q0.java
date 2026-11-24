package a;

/* JADX INFO: loaded from: classes.dex */
public final class j5q0 extends f3k implements vld, v4q0 {
    public hcp0 q;
    public bu r;
    public f7q0 s;
    public sme t;
    public c4m0 u;
    public final zbk v = jgk0.b(new h3q0((Object) this, (byte) 3));
    public jge0 w = jge0.e;

    public j5q0(hcp0 hcp0Var, bu buVar, f7q0 f7q0Var, sme smeVar) {
        this.q = hcp0Var;
        this.r = buVar;
        this.s = f7q0Var;
        this.t = smeVar;
    }

    @Override // a.v4q0
    public final u4q0 G() {
        return (u4q0) this.v.getValue();
    }

    @Override // a.v4q0
    public final long L0(j6z j6zVar) {
        return y0(j6zVar).g();
    }

    @Override // a.lm40
    public final void R0() {
        hcp0 hcp0Var = this.q;
        hcp0Var.c = iwq0.c;
        hcp0Var.b = this;
    }

    @Override // a.lm40
    public final void S0() {
        hcp0 hcp0Var = this.q;
        hcp0Var.c = iwq0.b;
        hcp0Var.b = null;
    }

    @Override // a.v4q0
    public final jge0 y0(j6z j6zVar) {
        if (!this.n) {
            return this.w;
        }
        jge0 jge0Var = (jge0) this.t.invoke(j6zVar);
        if (jge0Var == null) {
            return this.w;
        }
        this.w = jge0Var;
        return jge0Var;
    }
}
