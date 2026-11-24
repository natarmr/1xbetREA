package a;

import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class kbm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f18020a;

    static {
        zcl zclVar = qmk.f28987a;
        f18020a = 40.0f;
    }

    public static final void a(mm40 mm40Var, lbm lbmVar, fet fetVar, int i) {
        int i2;
        long jM125getWhite100d7_KjU;
        fet fetVar2 = fetVar;
        lbmVar.getClass();
        fetVar2.g0(1536684445);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(lbmVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarN = o7k0.n(mm40Var, f18020a);
            zcl zclVar = qmk.f28987a;
            zfn zfnVar = m8m0.f21378a;
            long jM125getWhite100d7_KjU2 = ((StaticColors) fetVar2.k(zfnVar)).m125getWhite100d7_KjU();
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.S(mm40VarN, 1.0f, jM125getWhite100d7_KjU2, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 4.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
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
            String str = lbmVar.f19760a;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            y9q0 y9q0VarM = g1t0.m();
            n05 n05Var = new n05(qmk.p, qmk.r, qmk.n);
            if (lbmVar.b) {
                fetVar2.e0(530439818);
                jM125getWhite100d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m130getWhite600d7_KjU();
            } else {
                fetVar2.e0(530441002);
                jM125getWhite100d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m125getWhite100d7_KjU();
            }
            fetVar2.r(false);
            v8q0.a(str, null, jM125getWhite100d7_KjU, n05Var, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, y9q0VarM, fetVar, 0, 24960, 109554);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kkl((Object) mm40Var, (Object) lbmVar, i, (byte) 22);
        }
    }
}
