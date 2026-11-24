package a;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zwp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f45118a = new zfn(new mhp0((byte) 24), (byte) 0);

    public static final void a(v0q0 v0q0Var, ugd ugdVar, fet fetVar, int i) {
        int i2;
        v0q0Var.getClass();
        fetVar.g0(-128769814);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(v0q0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (v0q0Var instanceof r0q0) {
            fetVar.e0(-775544165);
            r0q0 r0q0Var = (r0q0) v0q0Var;
            obc.d(f45118a.a(new dmm(new ta50(new wkm(0, r0q0Var.b, true, ra50.f30118a, r0q0Var.c)))), ugdVar, fetVar, (i2 & 112) | 8);
            fetVar.r(false);
        } else {
            fetVar.e0(-775581985);
            twn.v((i2 >> 3) & 14, ugdVar, fetVar, false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o1l0((Object) v0q0Var, (Object) ugdVar, i, (byte) 24);
        }
    }
}
