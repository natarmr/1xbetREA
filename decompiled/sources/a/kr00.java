package a;

/* JADX INFO: loaded from: classes5.dex */
public abstract class kr00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f18743a = new zfn(new ago((byte) 28), (byte) 0);

    public static final void a(ugd ugdVar, fet fetVar, int i) {
        k6z k6zVar;
        fetVar.g0(2144000788);
        if (fetVar.U(i & 1, (i & 3) != 2)) {
            if (((Boolean) fetVar.k(f18743a)).booleanValue()) {
                fetVar.e0(1468948802);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(1468998123);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(1850617428, new w(ugdVar, (byte) 15), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new w(ugdVar, i, (byte) 16);
        }
    }
}
