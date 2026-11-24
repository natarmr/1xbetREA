package a;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ggp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f11263a = new zfn(new ccp0((byte) 18), (byte) 0);
    public static final zfn b = new zfn(new ccp0((byte) 21), (byte) 0);
    public static final zfn c = new zfn(new ccp0((byte) 25), (byte) 0);
    public static final zfn d = new zfn(new ccp0((byte) 28), (byte) 0);

    public static final void a(int i, fet fetVar, mm40 mm40Var, String str) {
        fet fetVar2 = fetVar;
        String str2 = str;
        str2.getClass();
        fetVar2.g0(1382506783);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            tj30 tj30VarC = zq8.c((u12) fetVar2.k(b), false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zfn zfnVar = d;
            y9q0 y9q0VarM = (y9q0) fetVar2.k(zfnVar);
            if (y9q0VarM == null) {
                fetVar2.e0(-1605413009);
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                y9q0VarM = g1t0.m();
            } else {
                fetVar2.e0(-1605414838);
            }
            fetVar2.r(false);
            y9q0 y9q0Var = y9q0VarM;
            pz40 pz40Var = s6t0.f31722a;
            long textPrimary = s6t0.b().f33626a.getTextPrimary();
            f2q0 f2q0Var = (f2q0) fetVar2.k(c);
            int i3 = f2q0Var.f8826a;
            int iIntValue = ((Number) fetVar2.k(f11263a)).intValue();
            long jT = idm0.t(12);
            y9q0 y9q0Var2 = (y9q0) fetVar2.k(zfnVar);
            v8q0.a(str, null, textPrimary, new n05(jT, y9q0Var2 != null ? y9q0Var2.f42262a.b : idm0.t(14), idm0.t(1)), 0L, null, null, null, 0L, f2q0Var, 0L, 2, false, iIntValue, 0, null, y9q0Var, fetVar2, (i2 >> 3) & 14, 384, 109554);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgp0(mm40Var, str2, i, (byte) 0);
        }
    }
}
