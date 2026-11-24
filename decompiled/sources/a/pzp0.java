package a;

/* JADX INFO: loaded from: classes6.dex */
public abstract class pzp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f27858a = new zfn(new ozp0((byte) 0), (byte) 0);
    public static final zfn b = new zfn(pul.r, (byte) 0);

    public static final void a(ugd ugdVar, fet fetVar, int i) {
        fetVar.g0(662536424);
        byte b2 = 2;
        if (fetVar.U(i & 1, (i & 3) != 2)) {
            l5d0 l5d0VarA = f27858a.a(new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109));
            pz40 pz40Var = s6t0.f31722a;
            obc.e(new l5d0[]{l5d0VarA, b.a(new y3d(s6t0.b().f33626a.getTextPrimary()))}, ugdVar, fetVar, 48);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kqj0(ugdVar, i, b2);
        }
    }

    public static final void b(ugd ugdVar, fet fetVar, int i) {
        fetVar.g0(-821156946);
        byte b2 = 1;
        if (fetVar.U(i & 1, (i & 3) != 2)) {
            l5d0 l5d0VarA = f27858a.a(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045));
            pz40 pz40Var = s6t0.f31722a;
            obc.e(new l5d0[]{l5d0VarA, b.a(new y3d(s6t0.b().f33626a.getSecondary()))}, ugdVar, fetVar, 48);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kqj0(ugdVar, i, b2);
        }
    }
}
