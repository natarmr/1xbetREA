package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class fnx extends lm40 implements v6z {
    public final /* synthetic */ byte o;

    @Override // a.v6z
    public int U(c810 c810Var, pj30 pj30Var, int i) {
        switch (this.o) {
            case 0:
                break;
        }
        return pj30Var.P(i);
    }

    public abstract long Z0(pj30 pj30Var, long j);

    public abstract boolean a1();

    @Override // a.v6z
    public uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        long jZ0 = Z0(pj30Var, j);
        if (a1()) {
            jZ0 = r4e.e(j, jZ0);
        }
        pu90 pu90VarS = pj30Var.S(jZ0);
        return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b, new cam(pu90VarS, (byte) 9));
    }

    @Override // a.v6z
    public int e0(c810 c810Var, pj30 pj30Var, int i) {
        switch (this.o) {
            case 0:
                break;
        }
        return pj30Var.L(i);
    }

    public int v(c810 c810Var, pj30 pj30Var, int i) {
        switch (this.o) {
            case 0:
                break;
        }
        return pj30Var.b(i);
    }

    public int w(c810 c810Var, pj30 pj30Var, int i) {
        switch (this.o) {
            case 0:
                break;
        }
        return pj30Var.D(i);
    }
}
