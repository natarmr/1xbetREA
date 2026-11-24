package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class wqv0 extends lm40 implements v6z {
    public dnk o;
    public boolean p;
    public Function2 q;

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        dnk dnkVar = this.o;
        dnk dnkVar2 = dnk.f6373a;
        int iK = dnkVar != dnkVar2 ? 0 : p4e.k(j);
        dnk dnkVar3 = this.o;
        dnk dnkVar4 = dnk.b;
        pu90 pu90VarS = pj30Var.S(r4e.a(iK, (this.o == dnkVar2 || !this.p) ? p4e.i(j) : Integer.MAX_VALUE, dnkVar3 == dnkVar4 ? p4e.j(j) : 0, (this.o == dnkVar4 || !this.p) ? p4e.h(j) : Integer.MAX_VALUE));
        int iD = l1e0.d(pu90VarS.f27604a, p4e.k(j), p4e.i(j));
        int iD2 = l1e0.d(pu90VarS.b, p4e.j(j), p4e.h(j));
        return vj30.x(vj30Var, iD, iD2, new yc6(this, iD, pu90VarS, iD2, vj30Var));
    }
}
