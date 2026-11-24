package a;

/* JADX INFO: loaded from: classes.dex */
public final class nh80 extends lm40 implements v6z {
    public hh80 o;

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        float fB = this.o.b(vj30Var.getLayoutDirection());
        float fD = this.o.d();
        float fC = this.o.c(vj30Var.getLayoutDirection());
        float fA = this.o.a();
        if (!((ycl.a(fB, 0.0f) >= 0) & (ycl.a(fD, 0.0f) >= 0) & (ycl.a(fC, 0.0f) >= 0) & (ycl.a(fA, 0.0f) >= 0))) {
            vcx.a("Padding must be non-negative");
        }
        int iT = vj30Var.T(fB);
        int iT2 = vj30Var.T(fC) + iT;
        int iT3 = vj30Var.T(fD);
        int iT4 = vj30Var.T(fA) + iT3;
        pu90 pu90VarS = pj30Var.S(r4e.i(-iT2, -iT4, j));
        return vj30.x(vj30Var, r4e.g(pu90VarS.f27604a + iT2, j), r4e.f(pu90VarS.b + iT4, j), new mw7(pu90VarS, iT, iT3, (byte) 3));
    }
}
