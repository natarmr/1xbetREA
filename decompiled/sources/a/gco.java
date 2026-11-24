package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.IndividualColors;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gco {
    public static final void a(xk80 xk80Var, l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        a4x a4xVar;
        xk80Var.getClass();
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1939398855);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(xk80Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            gkw gkwVar = (gkw) l7m0Var.getValue();
            if (((gkwVar == null || (a4xVar = gkwVar.b) == null) ? 0 : a4xVar.size()) > 1) {
                fetVar.e0(-731007441);
                b(xk80Var, l7m0Var, function1, fetVar, i2 & 1022);
                fetVar.r(false);
            } else {
                fetVar.e0(-730848845);
                c(xk80Var, l7m0Var, function1, fetVar, i2 & 1022);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dyj(xk80Var, l7m0Var, function1, i, (byte) 1);
        }
    }

    public static final void b(xk80 xk80Var, l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(1405636513);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(xk80Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            zfn zfnVar = j7x.f16059a;
            long splashBackground = ((IndividualColors) fetVar.k(zfnVar)).getSplashBackground();
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new imm(new ilm(StaticColors.INSTANCE.m123getWhite0d7_KjU()), mlm.f21997a, fmm.f9790a, splashBackground, false, null);
                fetVar.o0(objP2);
            }
            imm immVar = (imm) objP2;
            pz40 pz40VarF = androidx.compose.runtime.e.f(Integer.valueOf(xk80Var.k()), fetVar);
            Unit unit = Unit.f46060a;
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objP3 = fetVar.P();
            yje yjeVar = null;
            if (z || objP3 == cl5Var) {
                objP3 = new fco(b, yjeVar, xk80Var, l7m0Var);
                fetVar.o0(objP3);
            }
            m0x0.t(fetVar, unit, (Function2) objP3);
            mm40 mm40VarX = yyw.X(i120.Q(o7k0.d(jm40.b, 1.0f), ((IndividualColors) fetVar.k(zfnVar)).getSplashBackground(), jd8.n), null, fetVar, 1);
            b = (i2 & 896) == 256 ? (byte) 1 : (byte) 0;
            Object objP4 = fetVar.P();
            if (b != 0 || objP4 == cl5Var) {
                objP4 = new s8o(function1, (byte) 2);
                fetVar.o0(objP4);
            }
            hlm.c(mm40VarX, immVar, null, (Function0) objP4, null, null, null, null, null, null, u1c.M(-447685261, new eco(pz40VarF, xk80Var, vneVar, l7m0Var, function1), fetVar), null, fetVar, 48, 6, 3060);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dyj(xk80Var, l7m0Var, function1, i, (byte) 2);
        }
    }

    public static final void c(xk80 xk80Var, l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        String str;
        ekw ekwVar;
        fetVar.g0(-1146611813);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(xk80Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            zfn zfnVar = j7x.f16059a;
            long splashBackground = ((IndividualColors) fetVar.k(zfnVar)).getSplashBackground();
            Unit unit = Unit.f46060a;
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new fco(b, null, xk80Var, l7m0Var);
                fetVar.o0(objP);
            }
            m0x0.t(fetVar, unit, (Function2) objP);
            mm40 mm40VarQ = i120.Q(o7k0.d(jm40.b, 1.0f), ((IndividualColors) fetVar.k(zfnVar)).getSplashBackground(), jd8.n);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                ilm ilmVar = new ilm(StaticColors.INSTANCE.m123getWhite0d7_KjU());
                gkw gkwVar = (gkw) l7m0Var.getValue();
                if (gkwVar == null || (ekwVar = gkwVar.c) == null || (str = ekwVar.b) == null) {
                    str = "";
                }
                imm immVar = new imm(ilmVar, new plm(str, jM123getWhite0d7_KjU, fa50.f9191a), fmm.f9790a, splashBackground, false, null);
                fetVar.o0(immVar);
                objP2 = immVar;
            }
            imm immVar2 = (imm) objP2;
            boolean z2 = (i2 & 896) == 256;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new s8o(function1, (byte) 3);
                fetVar.o0(objP3);
            }
            hlm.c(mm40VarQ, immVar2, null, (Function0) objP3, null, null, null, null, null, null, null, null, fetVar, 48, 0, 4084);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dyj(xk80Var, l7m0Var, function1, i, (byte) 3);
        }
    }
}
