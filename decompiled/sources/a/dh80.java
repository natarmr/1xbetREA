package a;

/* JADX INFO: loaded from: classes.dex */
public final class dh80 extends lm40 implements v6z {
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        int iT = vj30Var.T(this.q) + vj30Var.T(this.o);
        int iT2 = vj30Var.T(this.r) + vj30Var.T(this.p);
        pu90 pu90VarS = pj30Var.S(r4e.i(-iT, -iT2, j));
        return vj30.x(vj30Var, r4e.g(pu90VarS.f27604a + iT, j), r4e.f(pu90VarS.b + iT2, j), new ka70(this, pu90VarS, (byte) 3));
    }
}
