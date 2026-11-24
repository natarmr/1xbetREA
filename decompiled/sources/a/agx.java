package a;

/* JADX INFO: loaded from: classes.dex */
public class agx extends sfx implements v6z {
    public vhv0 q;

    public agx(vhv0 vhv0Var) {
        this.q = vhv0Var;
    }

    @Override // a.sfx
    public final vhv0 Z0(vhv0 vhv0Var) {
        return new y7t0(vhv0Var, this.q);
    }

    @Override // a.sfx
    public final void a1() {
        super.a1();
        n7x.I(this);
    }

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        int iA = this.p.a(vj30Var, vj30Var.getLayoutDirection()) - this.o.a(vj30Var, vj30Var.getLayoutDirection());
        int iD = this.p.d(vj30Var) - this.o.d(vj30Var);
        int iC = (this.p.c(vj30Var, vj30Var.getLayoutDirection()) - this.o.c(vj30Var, vj30Var.getLayoutDirection())) + iA;
        int iB = (this.p.b(vj30Var) - this.o.b(vj30Var)) + iD;
        pu90 pu90VarS = pj30Var.S(r4e.i(-iC, -iB, j));
        return vj30.x(vj30Var, r4e.g(pu90VarS.f27604a + iC, j), r4e.f(pu90VarS.b + iB, j), new mw7(pu90VarS, iA, iD, (byte) 1));
    }
}
