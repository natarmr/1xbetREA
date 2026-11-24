package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gzy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f12205a = new zfn(new pcy((byte) 14), (byte) 0);

    /* JADX WARN: Code duplicated, block: B:38:0x0079  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(mm40 mm40Var, hzy hzyVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2;
        int i2;
        Object obj;
        int i3;
        int i4;
        fet fetVar3;
        fet fetVar4 = fetVar;
        hzyVar.getClass();
        function1.getClass();
        fetVar4.g0(866319222);
        int i5 = i | 6 | (fetVar4.g(hzyVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i5 |= fetVar4.i(function1) ? 256 : 128;
        }
        if (fetVar4.U(i5 & 1, (i5 & 147) != 146)) {
            int iOrdinal = ((k6z) fetVar4.k(f12205a)).ordinal();
            if (iOrdinal == 0) {
                i2 = 1;
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return;
                }
                i2 = 2;
            }
            boolean z = ((i5 & 112) == 32) | ((i5 & 896) == 256);
            Object objP = fetVar4.P();
            if (z) {
                Object wqvVar = new wqv(function1, hzyVar, (byte) 24);
                fetVar4.o0(wqvVar);
                obj = wqvVar;
            } else {
                obj = objP;
                if (objP == ukd.f35823a) {
                    Object wqvVar2 = new wqv(function1, hzyVar, (byte) 24);
                    fetVar4.o0(wqvVar2);
                    obj = wqvVar2;
                }
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = y860.W(jm40Var, null, null, false, null, (Function0) obj, 28);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            jpm0.o(fetVar4, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar4, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar4, numValueOf, shdVar3);
            jpm0.n(fetVar4);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar4, mm40VarC0, shdVar4);
            mbc.o(zfi0.f44303a, o7k0.d(jm40Var, 1.0f), false, fetVar, 54, 4);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarD);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            zx7 zx7Var2 = gqw0.d;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarS = o7k0.s(o7k0.e(jr8Var.b(jm40Var, zx7Var2), 32.0f), 2.0f);
            ikv0 ikv0Var = hzyVar.h;
            mm40VarS.getClass();
            byte b = 18;
            if (ikv0Var == null) {
                i3 = 0;
            } else {
                mm40VarS = rq8.L(mm40VarS, new ij90(true, (Object) ikv0Var, b));
                i3 = 0;
            }
            zq8.a(i3, fetVar, mm40VarS);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar, 54);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar4);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarL = s5x0.L(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 8.0f, 0.0f, 2);
            String str = hzyVar.b;
            y9q0 y9q0VarA = y9q0.a(g1t0.d(), 0L, 0L, null, null, null, 0L, null, null, 0, i2, 0L, null, null, 16711679);
            int i6 = i2;
            androidx.compose.runtime.d dVar = zaq0.b;
            v8q0.a(str, mm40VarL, ((ThemeColors) fetVar.k(dVar)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(2), 0L, 2, false, 2, 0, null, y9q0VarA, fetVar, 0, 24960, 109560);
            d5a0 d5a0Var = hzyVar.f13924a.f25087a;
            w6n w6nVar = w6n.h;
            x2x.t(null, d5a0Var, w6nVar, null, fetVar, 384, 9);
            v8q0.a(hzyVar.f, s5x0.L(o7k0.s(jm40Var, 48.0f), 4.0f, 0.0f, 2), ((ThemeColors) fetVar.k(dVar)).getTextPrimary(), new n05(qmk.p, qmk.q, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, g1t0.m(), fetVar, 0, 24576, 113648);
            x2x.t(null, hzyVar.c.f25087a, w6nVar, null, fetVar, 384, 9);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            v8q0.a(hzyVar.d, s5x0.L(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 8.0f, 0.0f, 2), ((ThemeColors) fetVar.k(dVar)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(1), 0L, 2, false, 2, 0, null, y9q0.a(g1t0.d(), 0L, 0L, null, null, null, 0L, null, null, 0, i6, 0L, null, null, 16711679), fetVar, 0, 24960, 109560);
            fet fetVar5 = fetVar;
            fetVar5.r(true);
            mm40 mm40VarS2 = o7k0.s(o7k0.e(jr8Var.b(jm40Var, gqw0.f), 32.0f), 2.0f);
            ikv0 ikv0Var2 = hzyVar.i;
            mm40VarS2.getClass();
            if (ikv0Var2 == null) {
                i4 = 0;
            } else {
                i4 = 0;
                mm40VarS2 = rq8.L(mm40VarS2, new ij90(false ? 1 : 0, (Object) ikv0Var2, (byte) 18));
            }
            zq8.a(i4, fetVar5, mm40VarS2);
            fetVar5.r(true);
            if (hzyVar.e.length() > 0) {
                fetVar5.e0(-778753270);
                v8q0.a(hzyVar.e, s5x0.L(s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 2.0f, 0.0f, 0.0f, 13), 8.0f, 0.0f, 2), ((ThemeColors) fetVar5.k(dVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.h(), fetVar, 0, 24960, 109560);
                fet fetVar6 = fetVar;
                fetVar6.r(i4);
                fetVar3 = fetVar6;
            } else {
                fetVar5.e0(-778249272);
                fetVar5.r(i4);
                fetVar3 = fetVar5;
            }
            fetVar3.r(true);
            fetVar3.r(true);
            mm40Var2 = jm40Var;
            fetVar2 = fetVar3;
        } else {
            fetVar4.X();
            mm40Var2 = mm40Var;
            fetVar2 = fetVar4;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r93(mm40Var2, hzyVar, function1, i, (byte) 9);
        }
    }
}
