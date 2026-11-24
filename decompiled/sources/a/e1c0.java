package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e1c0 {
    public static final void a(mtl mtlVar, Function1 function1, fet fetVar, int i) {
        fetVar.g0(132533188);
        int i2 = (fetVar.g(mtlVar) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b = 17;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new rpa0(function1, b);
                fetVar.o0(objP);
            }
            bkb.f(mm40VarD, mtlVar, null, false, null, (Function1) objP, fetVar, ((i2 << 3) & 112) | 6, 28);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7a0(mtlVar, function1, i, (byte) 17);
        }
    }

    public static final void b(a4x a4xVar, hh80 hh80Var, Function1 function1, fet fetVar, int i) {
        Object obj;
        int i2;
        fetVar.g0(-1826009944);
        if ((i & 6) == 0) {
            obj = a4xVar;
            i2 = (fetVar.g(obj) ? 4 : 2) | i;
        } else {
            obj = a4xVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(hh80Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            mm40 mm40VarI = s5x0.I(o7k0.c, hh80Var);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarI, 16.0f, 0.0f, 2);
            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 16.0f, 7);
            boolean zF = ((i2 & 14) == 4) | fetVar.f(backgroundContent) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (zF || objP == ukd.f35823a) {
                objP = new mz0(obj, backgroundContent, function1, (byte) 24);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarL, null, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, 0, 506);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new la70(a4xVar, hh80Var, function1, i, (byte) 16);
        }
    }

    public static final void c(int i, fet fetVar) {
        fetVar.g0(1444080690);
        if (fetVar.U(i & 1, i != 0)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(k7n0.H(jm40Var, 2.0f).e(o7k0.c), ((StaticColors) fetVar.k(m8m0.f21378a)).m109getOverlayBackground400d7_KjU(), jd8.n);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new npa0((byte) 21);
                fetVar.o0(objP);
            }
            mm40 mm40VarY = y860.Y(mm40VarQ, false, null, null, (Function0) objP, 14);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar, 54);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarY);
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
            kpb.j(jm40Var, new dkm((ycl) null, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getPrimary()), 3), fetVar, 6, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j3b0(i, (byte) 21);
        }
    }

    public static final void d(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-949182017);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            q1c0 q1c0Var = (q1c0) l7m0Var.getValue();
            if (q1c0Var.f27946a) {
                fetVar.e0(-1630846169);
                c(0, fetVar);
            } else {
                fetVar.e0(983384003);
            }
            fetVar.r(false);
            mm40 mm40VarA = fbh0.a(jm40.b, wha0.T(fetVar), ma80.f21447a, true, null, 52);
            ugd ugdVarM = u1c.M(-656661637, new ru80(function1, (byte) 4), fetVar);
            ugd ugdVarM2 = u1c.M(1220607258, new r7a0(q1c0Var, function1, (byte) 16), fetVar);
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            zcl zclVar = qmk.f28987a;
            m8x.y(mm40VarA, ugdVarM, ugdVarM2, null, null, 0, background, 0L, i120.N(0.0f, 0.0f, 0.0f, 0.0f, 14), u1c.M(-1793871728, new in80(q1c0Var, function1, (byte) 6), fetVar), fetVar, 805306800, 184);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zs70(l7m0Var, function1, i, (byte) 21);
        }
    }

    public static final void e(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-761416248);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            d(l7m0Var, function1, fetVar, i2 & 126);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zs70(l7m0Var, function1, i, (byte) 20);
        }
    }

    public static final float f(boolean z) {
        if (z) {
            zcl zclVar = qmk.f28987a;
            return 16.0f;
        }
        zcl zclVar2 = qmk.f28987a;
        return 0.0f;
    }
}
