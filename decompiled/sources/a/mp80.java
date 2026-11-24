package a;

/* JADX INFO: loaded from: classes.dex */
public final class mp80 extends lm40 implements v6z {
    public float o;
    public l7m0 p;
    public l7m0 q;

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        l7m0 l7m0Var = this.p;
        int iRound = (l7m0Var == null || ((Number) l7m0Var.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) l7m0Var.getValue()).floatValue() * this.o);
        l7m0 l7m0Var2 = this.q;
        int iRound2 = (l7m0Var2 == null || ((Number) l7m0Var2.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) l7m0Var2.getValue()).floatValue() * this.o);
        int iK = iRound != Integer.MAX_VALUE ? iRound : p4e.k(j);
        int iJ = iRound2 != Integer.MAX_VALUE ? iRound2 : p4e.j(j);
        if (iRound == Integer.MAX_VALUE) {
            iRound = p4e.i(j);
        }
        if (iRound2 == Integer.MAX_VALUE) {
            iRound2 = p4e.h(j);
        }
        pu90 pu90VarS = pj30Var.S(r4e.a(iK, iRound, iJ, iRound2));
        return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b, new cam(pu90VarS, (byte) 18));
    }
}
