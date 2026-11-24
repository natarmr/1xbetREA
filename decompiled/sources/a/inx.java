package a;

/* JADX INFO: loaded from: classes.dex */
public final class inx extends fnx {
    public enx p;
    public boolean q;

    @Override // a.fnx, a.v6z
    public final int U(c810 c810Var, pj30 pj30Var, int i) {
        return this.p == enx.f8115a ? pj30Var.L(i) : pj30Var.P(i);
    }

    @Override // a.fnx
    public final long Z0(pj30 pj30Var, long j) {
        int iL = this.p == enx.f8115a ? pj30Var.L(p4e.h(j)) : pj30Var.P(p4e.h(j));
        if (iL < 0) {
            iL = 0;
        }
        if (iL < 0) {
            zcx.a("width must be >= 0");
        }
        return r4e.h(iL, iL, 0, Integer.MAX_VALUE);
    }

    @Override // a.fnx
    public final boolean a1() {
        return this.q;
    }

    @Override // a.fnx, a.v6z
    public final int e0(c810 c810Var, pj30 pj30Var, int i) {
        return this.p == enx.f8115a ? pj30Var.L(i) : pj30Var.P(i);
    }
}
