package a;

/* JADX INFO: loaded from: classes.dex */
public final class lqq extends f3k implements fe60, vld {
    public final nqq q;
    public pbz r;

    public lqq() {
        nqq nqqVar = new nqq(0, new brk(2, this, lqq.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, (byte) 22), 9);
        Z0(nqqVar);
        this.q = nqqVar;
    }

    @Override // a.fe60
    public final void R() {
        mie0 mie0Var = new mie0();
        c9x.B(this, new gmo(mie0Var, this, (byte) 13));
        pbz pbzVar = (pbz) mie0Var.f21842a;
        if (this.q.e1().b()) {
            pbz pbzVar2 = this.r;
            if (pbzVar2 != null) {
                pbzVar2.b();
            }
            if (pbzVar != null) {
                pbzVar.a();
            } else {
                pbzVar = null;
            }
            this.r = pbzVar;
        }
    }
}
