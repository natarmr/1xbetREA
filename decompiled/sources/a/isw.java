package a;

/* JADX INFO: loaded from: classes5.dex */
public abstract class isw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f15326a = new zfn(new kdw((byte) 17), (byte) 0);

    public static final void a(mm40 mm40Var, ksw kswVar, fet fetVar, int i) {
        int i2;
        kswVar.getClass();
        fetVar.g0(769441850);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(kswVar) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            int iOrdinal = ((k6z) fetVar.k(f15326a)).ordinal();
            if (iOrdinal == 0) {
                i2 = 1;
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return;
                }
                i2 = 2;
            }
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            obc.d(dgp0.d.a(y9q0.a(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), 0L, 0L, null, null, null, 0L, null, null, 0, i2, 0L, null, null, 16711679)), u1c.M(1277410654, new o6o(kswVar, i2, (byte) 18), fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sjs(mm40Var, kswVar, i, (byte) 20);
        }
    }
}
