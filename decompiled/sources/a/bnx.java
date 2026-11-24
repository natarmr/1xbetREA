package a;

/* JADX INFO: loaded from: classes.dex */
public final class bnx extends fnx {
    public enx p;
    public boolean q;

    @Override // a.fnx
    public final long Z0(pj30 pj30Var, long j) {
        int iD = this.p == enx.f8115a ? pj30Var.D(p4e.i(j)) : pj30Var.b(p4e.i(j));
        if (iD < 0) {
            iD = 0;
        }
        if (iD < 0) {
            zcx.a("height must be >= 0");
        }
        return r4e.h(0, Integer.MAX_VALUE, iD, iD);
    }

    @Override // a.fnx
    public final boolean a1() {
        return this.q;
    }

    @Override // a.fnx, a.v6z
    public final int v(c810 c810Var, pj30 pj30Var, int i) {
        return this.p == enx.f8115a ? pj30Var.D(i) : pj30Var.b(i);
    }

    @Override // a.fnx, a.v6z
    public final int w(c810 c810Var, pj30 pj30Var, int i) {
        return this.p == enx.f8115a ? pj30Var.D(i) : pj30Var.b(i);
    }
}
