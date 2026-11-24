package a;

/* JADX INFO: loaded from: classes.dex */
public final class oge extends z1 {
    public final mz3 v;

    public oge(mz3 mz3Var, u12 u12Var, qge qgeVar, a4d a4dVar, boolean z, String str, t4e t4eVar) {
        super(u12Var, qgeVar, 1.0f, a4dVar, z, str, t4eVar);
        this.v = mz3Var;
    }

    @Override // a.lm40
    public final void R0() {
        vne vneVarN0 = N0();
        mz3 mz3Var = this.v;
        mz3Var.l = vneVarN0;
        mz3Var.c();
    }

    @Override // a.lm40
    public final void S0() {
        this.v.g();
    }

    @Override // a.lm40
    public final void T0() {
        this.v.n(null);
    }

    @Override // a.z1
    public final pm80 a1() {
        return this.v;
    }
}
