package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d6m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugg0 f5555a;
    public static final ugg0 b;

    static {
        zcl zclVar = qmk.i;
        ugg0 ugg0Var = vgg0.f37379a;
        f5555a = new ugg0(zclVar, zclVar, zclVar, zclVar);
        zcl zclVar2 = qmk.g;
        b = new ugg0(zclVar2, zclVar2, zclVar2, zclVar2);
    }

    public static final void a(mm40 mm40Var, String str, xjp0 xjp0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(-1860652174);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.e(xjp0Var.ordinal()) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 36.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarE0 = o2e.e0(o7k0.d(jm40.b, 1.0f), xjp0Var == xjp0.f40998a ? "FirstTeamNameTestTag" : "SecondTeamNameTestTag");
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarE0, jM123getWhite0d7_KjU, new n05(qmk.q, qmk.r, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.m(), fetVar, (i2 >> 3) & 14, 24960, 109552);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ikl((Object) mm40Var, (Object) str, (Object) xjp0Var, i, (byte) 11);
        }
    }

    public static final void b(v5m v5mVar, xjp0 xjp0Var, boolean z, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        Function1 function3;
        fetVar.g0(1695665875);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(v5mVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.e(xjp0Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z2 = (xjp0Var == xjp0.f40998a) != (fetVar.k(bmd.n) == k6z.b);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 56.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z3 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarN2 = o7k0.n(jm40Var, 56.0f);
            ugg0 ugg0Var = f5555a;
            mm40 mm40VarS = i120.S(lgb.J(mm40VarN2, ugg0Var), 1.0f, ((StaticColors) fetVar.k(m8m0.f21378a)).m125getWhite100d7_KjU(), ugg0Var);
            int i3 = i2 & 14;
            boolean z4 = ((i2 & 7168) == 2048) | (i3 == 4);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z4 || objP == cl5Var) {
                objP = new c6m(function1, v5mVar, (byte) 1);
                fetVar.o0(objP);
            }
            mm40 mm40VarJ = s5x0.J(o2e.e0(feb.O(mm40VarS, (Function0) objP), "TeamImageTestTag"), 4.0f);
            tj30 tj30VarC2 = zq8.c(gqw0.e, false);
            int i4 = i2;
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarJ);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            d(v5mVar, v5mVar.f && z2, fetVar, i3);
            fetVar.r(true);
            Boolean bool = v5mVar.e;
            if (bool == null) {
                fetVar.e0(64105236);
                fetVar.r(false);
                function3 = function2;
            } else {
                fetVar.e0(64105237);
                boolean zBooleanValue = bool.booleanValue();
                mm40 mm40VarQ = ffb0.Q(jr8.f16991a.b(jm40Var, z ? gqw0.g : gqw0.i), z ? -1.0f : 1.0f, 1.0f);
                boolean z5 = (i3 == 4) | ((57344 & i4) == 16384);
                Object objP2 = fetVar.P();
                if (z5 || objP2 == cl5Var) {
                    function3 = function2;
                    objP2 = new c6m(function3, v5mVar, (byte) 2);
                    fetVar.o0(objP2);
                } else {
                    function3 = function2;
                }
                i5m.a(0, fetVar, mm40VarQ, (Function0) objP2, zBooleanValue);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            function3 = function2;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mg((Object) v5mVar, (Object) xjp0Var, z, function1, (wdr) function3, i, (byte) 6);
        }
    }

    public static final void c(mm40 mm40Var, v5m v5mVar, xjp0 xjp0Var, boolean z, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        boolean z2;
        Function1 function3;
        function1.getClass();
        function2.getClass();
        fetVar.g0(367155389);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(v5mVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.e(xjp0Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z2 = z;
            i2 |= fetVar.h(z2) ? 2048 : 1024;
        } else {
            z2 = z;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            function3 = function2;
            i2 |= fetVar.i(function3) ? 131072 : 65536;
        } else {
            function3 = function2;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            xx7 xx7Var = gqw0.n;
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), xx7Var, fetVar, 48);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            b(v5mVar, xjp0Var, z2, function1, function3, fetVar, 65534 & (i3 >> 3));
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            boolean z3 = ((57344 & i3) == 16384) | ((i3 & 112) == 32);
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new c6m(function1, v5mVar, (byte) 0);
                fetVar.o0(objP);
            }
            a(feb.O(mm40VarD, (Function0) objP), v5mVar.b, xjp0Var, fetVar, i3 & 896);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ig2((Object) mm40Var, (Object) v5mVar, (Object) xjp0Var, z, function1, (wdr) function2, i, (byte) 9);
        }
    }

    public static final void d(v5m v5mVar, boolean z, fet fetVar, int i) {
        int i2;
        mm40 mm40VarT;
        fetVar.g0(1441613270);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(v5mVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = lgb.J(o7k0.n(jm40Var, 48.0f), b);
            if (z) {
                fetVar.e0(-1884076140);
                Object objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = new xjl((byte) 23);
                    fetVar.o0(objP);
                }
                mm40VarT = i4w0.T(jm40Var, (Function1) objP);
                fetVar.r(false);
            } else {
                fetVar.e0(-1884075010);
                fetVar.r(false);
                mm40VarT = jm40Var;
            }
            rq8.b(mm40VarJ.e(mm40VarT), o7k0.n(jm40Var, 48.0f), v5mVar.c, v5mVar.d, new y3d(((StaticColors) fetVar.k(m8m0.f21378a)).m130getWhite600d7_KjU()), null, null, gqw0.A, null, fetVar, 12582912, 352);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ooh(v5mVar, z, i, (byte) 3);
        }
    }
}
