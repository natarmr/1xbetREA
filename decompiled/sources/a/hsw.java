package a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hsw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f13604a = new zfn(new kdw((byte) 16), (byte) 0);

    public static final void a(mm40 mm40Var, jsw jswVar, fet fetVar, int i) {
        mm40 mm40Var2;
        int i2;
        jswVar.getClass();
        fetVar.g0(-283904558);
        int i3 = i | 6 | (fetVar.g(jswVar) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            int iOrdinal = ((k6z) fetVar.k(f13604a)).ordinal();
            if (iOrdinal == 0) {
                i2 = 1;
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return;
                }
                i2 = 2;
            }
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40.b;
            mm40 mm40VarL = s5x0.L(o7k0.e(mm40Var2, 34.0f), 8.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
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
            obc.d(egp0.c.a(y9q0.a(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), 0L, 0L, null, null, null, 0L, null, null, 0, i2, 0L, null, null, 16711679)), u1c.M(1395049518, new o6o(jswVar, i2, (byte) 17), fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sjs(mm40Var2, jswVar, i, (byte) 19);
        }
    }
}
