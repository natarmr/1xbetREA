package a;

/* JADX INFO: loaded from: classes.dex */
public interface v6z extends yzj {
    default int U(c810 c810Var, pj30 pj30Var, int i) {
        return c(new rnx(c810Var, c810Var.getLayoutDirection()), new cvj(pj30Var, v460.b, w460.f38530a, (byte) 2), r4e.b(0, 0, 0, i, 7)).j();
    }

    uj30 c(vj30 vj30Var, pj30 pj30Var, long j);

    default int e0(c810 c810Var, pj30 pj30Var, int i) {
        return c(new rnx(c810Var, c810Var.getLayoutDirection()), new cvj(pj30Var, v460.f36763a, w460.f38530a, (byte) 2), r4e.b(0, 0, 0, i, 7)).j();
    }

    default int v(c810 c810Var, pj30 pj30Var, int i) {
        return c(new rnx(c810Var, c810Var.getLayoutDirection()), new cvj(pj30Var, v460.b, w460.b, (byte) 2), r4e.b(0, i, 0, 0, 13)).f();
    }

    default int w(c810 c810Var, pj30 pj30Var, int i) {
        return c(new rnx(c810Var, c810Var.getLayoutDirection()), new cvj(pj30Var, v460.f36763a, w460.b, (byte) 2), r4e.b(0, i, 0, 0, 13)).f();
    }
}
