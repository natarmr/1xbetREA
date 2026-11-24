package a;

import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public abstract class fgp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f9504a = new zfn(new ccp0((byte) 17), (byte) 0);
    public static final zfn b = new zfn(new ccp0((byte) 20), (byte) 0);
    public static final zfn c = new zfn(new ccp0((byte) 24), (byte) 0);

    public static final void a(int i, fet fetVar, mm40 mm40Var, String str) {
        fet fetVar2 = fetVar;
        String str2 = str;
        str2.getClass();
        fetVar2.g0(1304438993);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            tj30 tj30VarC = zq8.c((u12) fetVar2.k(f9504a), false);
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
            y9q0 y9q0VarM = (y9q0) fetVar2.k(c);
            if (y9q0VarM == null) {
                fetVar2.e0(1051887701);
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                y9q0VarM = g1t0.m();
            } else {
                fetVar2.e0(1051885872);
            }
            fetVar2.r(false);
            y9q0 y9q0Var = y9q0VarM;
            pz40 pz40Var = s6t0.f31722a;
            long jM123getWhite0d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
            f2q0 f2q0Var = (f2q0) fetVar2.k(b);
            int i3 = f2q0Var.f8826a;
            v8q0.a(str, null, jM123getWhite0d7_KjU, new n05(qmk.p, qmk.r, qmk.n), 0L, null, null, null, 0L, f2q0Var, qmk.C, 2, false, 2, 0, null, y9q0Var, fetVar2, (i2 >> 3) & 14, 24960, 107506);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n040(mm40Var, str2, i, (byte) 28);
        }
    }
}
