package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public abstract class vko0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f37583a = new zfn(new dco0((byte) 24), (byte) 0);

    /* JADX WARN: Code duplicated, block: B:42:0x008c  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(mm40 mm40Var, elo0 elo0Var, Function1 function1, fet fetVar, int i) {
        fet fetVar2;
        int i2;
        Object obj;
        int i3;
        fet fetVar3;
        fet fetVar4 = fetVar;
        elo0Var.getClass();
        function1.getClass();
        fetVar4.g0(853462321);
        int i4 = (fetVar4.g(mm40Var) ? 4 : 2) | i | (fetVar4.g(elo0Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i4 |= fetVar4.i(function1) ? 256 : 128;
        }
        if (fetVar4.U(i4 & 1, (i4 & 147) != 146)) {
            int iOrdinal = ((k6z) fetVar4.k(f37583a)).ordinal();
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
            mm40 mm40VarL = s5x0.L(mm40Var, 0.0f, 8.0f, 1);
            boolean z = ((i4 & 112) == 32) | ((i4 & 896) == 256);
            Object objP = fetVar4.P();
            if (z) {
                Object o0k0Var = new o0k0(function1, elo0Var, (byte) 24);
                fetVar4.o0(o0k0Var);
                obj = o0k0Var;
            } else {
                obj = objP;
                if (objP == ukd.f35823a) {
                    Object o0k0Var2 = new o0k0(function1, elo0Var, (byte) 24);
                    fetVar4.o0(o0k0Var2);
                    obj = o0k0Var2;
                }
            }
            mm40 mm40VarW = y860.W(mm40VarL, null, null, false, null, (Function0) obj, 28);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar4, 0);
            int iHashCode = Long.hashCode(fetVar4.T);
            bh90 bh90VarM = fetVar4.m();
            mm40 mm40VarC0 = kbc.c0(fetVar4, mm40VarW);
            mkd.c0.getClass();
            fetVar4.i0();
            boolean z2 = fetVar4.S;
            Function0 function0 = e7z.u1;
            if (z2) {
                fetVar4.l(function0);
            } else {
                fetVar4.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar4, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar4, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar4, numValueOf, shdVar3);
            jpm0.n(fetVar4);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar4, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar4.T);
            bh90 bh90VarM2 = fetVar4.m();
            mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarD);
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(function0);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, tj30VarC, shdVar);
            jpm0.o(fetVar4, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar4, shdVar3, fetVar4);
            jpm0.o(fetVar4, mm40VarC1, shdVar4);
            zx7 zx7Var = gqw0.d;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarS = o7k0.s(o7k0.e(jr8Var.b(jm40Var, zx7Var), 32.0f), 2.0f);
            jkv0 jkv0Var = elo0Var.h;
            mm40VarS.getClass();
            byte b = 19;
            if (jkv0Var != null) {
                mm40VarS = rq8.L(mm40VarS, new ij90(true, (Object) jkv0Var, b));
            }
            zq8.a(0, fetVar4, mm40VarS);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar4, 54);
            int iHashCode3 = Long.hashCode(fetVar4.T);
            bh90 bh90VarM3 = fetVar4.m();
            mm40 mm40VarC2 = kbc.c0(fetVar4, jm40Var);
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(function0);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, thg0VarA, shdVar);
            jpm0.o(fetVar4, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar4, shdVar3, fetVar4);
            jpm0.o(fetVar4, mm40VarC2, shdVar4);
            mm40 mm40VarN = s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            c5a0 c5a0Var = elo0Var.f8011a.f23347a;
            w6n w6nVar = w6n.h;
            n2x.l(mm40VarN, c5a0Var, w6nVar, null, fetVar4, 384, 8);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarN2 = s5x0.N(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 8.0f, 0.0f, 0.0f, 0.0f, 14);
            String str = elo0Var.b;
            y9q0 y9q0VarA = y9q0.a(g1t0.d(), 0L, 0L, null, null, null, 0L, null, null, 0, i2, 0L, null, null, 16711679);
            int i5 = i2;
            pz40 pz40Var = s6t0.f31722a;
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str, mm40VarN2, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(1), 0L, 2, false, 2, 0, null, y9q0VarA, fetVar, 0, 24960, 109560);
            v8q0.a(elo0Var.f, o7k0.s(s5x0.L(jm40Var, 4.0f, 0.0f, 2), 48.0f), staticColors.m123getWhite0d7_KjU(), new n05(qmk.p, qmk.q, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, g1t0.d(), fetVar, 0, 24576, 113648);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            v8q0.a(elo0Var.d, s5x0.N(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0.0f, 0.0f, 8.0f, 0.0f, 11), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(2), 0L, 2, false, 2, 0, null, y9q0.a(g1t0.d(), 0L, 0L, null, null, null, 0L, null, null, 0, i5, 0L, null, null, 16711679), fetVar, 0, 24960, 109560);
            fet fetVar5 = fetVar;
            n2x.l(s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), elo0Var.c.f23347a, w6nVar, null, fetVar5, 384, 8);
            fetVar5.r(true);
            mm40 mm40VarS2 = o7k0.s(o7k0.e(jr8Var.b(jm40Var, gqw0.f), 32.0f), 2.0f);
            jkv0 jkv0Var2 = elo0Var.i;
            mm40VarS2.getClass();
            if (jkv0Var2 == null) {
                i3 = 0;
            } else {
                i3 = 0;
                mm40VarS2 = rq8.L(mm40VarS2, new ij90(false ? 1 : 0, (Object) jkv0Var2, (byte) 19));
            }
            zq8.a(i3, fetVar5, mm40VarS2);
            fetVar5.r(true);
            if (elo0Var.e.length() > 0) {
                fetVar5.e0(-1738679146);
                v8q0.a(elo0Var.e, s5x0.L(s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 2.0f, 0.0f, 0.0f, 13), 8.0f, 0.0f, 2), staticColors.m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.h(), fetVar, 0, 24960, 109560);
                fet fetVar6 = fetVar;
                fetVar6.r(i3);
                fetVar3 = fetVar6;
            } else {
                fetVar5.e0(-1738222361);
                fetVar5.r(i3);
                fetVar3 = fetVar5;
            }
            fetVar3.r(true);
            fetVar2 = fetVar3;
        } else {
            fetVar4.X();
            fetVar2 = fetVar4;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r93(mm40Var, elo0Var, function1, i, (byte) 15);
        }
    }
}
