package a;

/* JADX INFO: loaded from: classes.dex */
public final class wbk extends sfx implements v6z {
    public vhv0 q;
    public itt0 r;
    public vhv0 s;

    @Override // a.sfx
    public final void a1() {
        this.s = new ujo(this.q, this.o);
        super.a1();
        n7x.I(this);
    }

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        itt0 itt0Var = this.r;
        vhv0 vhv0Var = this.s;
        itt0Var.getClass();
        int iD = vhv0Var.d(vj30Var);
        if (iD == 0) {
            return vj30.x(vj30Var, 0, 0, new vbk((byte) 0));
        }
        pu90 pu90VarS = pj30Var.S(p4e.b(j, 0, 0, iD, iD, 3));
        return vj30.x(vj30Var, pu90VarS.f27604a, iD, new y1(pu90VarS, (byte) 21));
    }
}
