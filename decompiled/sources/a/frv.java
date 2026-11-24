package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class frv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final IntRange f10037a = new IntRange(2, 3, 1);

    public static final void a(xk80 xk80Var, l7m0 l7m0Var, l7m0 l7m0Var2, Function1 function1, fet fetVar, int i) {
        int i2;
        yfe0 yfe0VarU;
        zjg zjgVar;
        a4x a4xVar;
        xk80Var.getClass();
        l7m0Var.getClass();
        l7m0Var2.getClass();
        function1.getClass();
        fetVar.g0(-2131477133);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(xk80Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(l7m0Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            gkw gkwVar = (gkw) l7m0Var.getValue();
            Integer numValueOf = (gkwVar == null || (a4xVar = gkwVar.b) == null) ? null : Integer.valueOf(a4xVar.size());
            if (numValueOf == null || numValueOf.intValue() != 1) {
                if (numValueOf != null) {
                    if (f10037a.b(numValueOf.intValue())) {
                        fetVar.e0(-2038269850);
                        b(xk80Var, l7m0Var, l7m0Var2, function1, fetVar, i2 & 8190);
                        fetVar.r(false);
                    }
                    yfe0VarU.d = zjgVar;
                }
                fetVar.e0(-2038028887);
                fetVar.r(false);
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    zjgVar = new zjg(xk80Var, l7m0Var, l7m0Var2, function1, i, (byte) 1);
                    yfe0VarU.d = zjgVar;
                }
                return;
            }
            fetVar.e0(-2038501327);
            c(l7m0Var, l7m0Var2, function1, fetVar, (i2 >> 3) & 1022);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            zjgVar = new zjg(xk80Var, l7m0Var, l7m0Var2, function1, i, (byte) 2);
            yfe0VarU.d = zjgVar;
        }
    }

    public static final void b(xk80 xk80Var, l7m0 l7m0Var, l7m0 l7m0Var2, Function1 function1, fet fetVar, int i) {
        int i2;
        l7m0 l7m0Var3;
        fetVar.g0(-1042071925);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(xk80Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            l7m0Var3 = l7m0Var2;
            i2 |= fetVar.g(l7m0Var3) ? 256 : 128;
        } else {
            l7m0Var3 = l7m0Var2;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            zfn zfnVar = zaq0.b;
            long secondary = ((ThemeColors) fetVar.k(zfnVar)).getSecondary();
            long background = ((ThemeColors) fetVar.k(zfnVar)).getBackground();
            boolean zH = fetVar.h(((Boolean) l7m0Var3.getValue()).booleanValue());
            Object objP2 = fetVar.P();
            if (zH || objP2 == cl5Var) {
                objP2 = new imm(new ilm(secondary), mlm.f21997a, fmm.f9790a, background, ((Boolean) l7m0Var3.getValue()).booleanValue(), null);
                fetVar.o0(objP2);
            }
            imm immVar = (imm) objP2;
            pz40 pz40VarF = androidx.compose.runtime.e.f(Integer.valueOf(xk80Var.k()), fetVar);
            Unit unit = Unit.f46060a;
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objP3 = fetVar.P();
            yje yjeVar = null;
            if (z || objP3 == cl5Var) {
                objP3 = new fco((byte) 2, yjeVar, xk80Var, l7m0Var);
                fetVar.o0(objP3);
            }
            m0x0.t(fetVar, unit, (Function2) objP3);
            mm40 mm40VarQ = i120.Q(yyw.X(o7k0.d(jm40.b, 1.0f), null, fetVar, 1), ((ThemeColors) fetVar.k(zfnVar)).getBackground(), jd8.n);
            boolean z2 = (i2 & 7168) == 2048;
            Object objP4 = fetVar.P();
            if (z2 || objP4 == cl5Var) {
                objP4 = new i8v(function1, (byte) 5);
                fetVar.o0(objP4);
            }
            hlm.c(mm40VarQ, immVar, null, (Function0) objP4, null, null, null, null, null, null, u1c.M(1089119965, new eco(l7m0Var, pz40VarF, xk80Var, vneVar, function1), fetVar), null, fetVar, 0, 6, 3060);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zjg(xk80Var, l7m0Var, l7m0Var2, function1, i, (byte) 3);
        }
    }

    public static final void c(l7m0 l7m0Var, l7m0 l7m0Var2, Function1 function1, fet fetVar, int i) {
        l7m0 l7m0Var3;
        int i2;
        l7m0 l7m0Var4;
        String str;
        ekw ekwVar;
        fetVar.g0(1340999958);
        if ((i & 6) == 0) {
            l7m0Var3 = l7m0Var;
            i2 = (fetVar.g(l7m0Var3) ? 4 : 2) | i;
        } else {
            l7m0Var3 = l7m0Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            l7m0Var4 = l7m0Var2;
            i2 |= fetVar.g(l7m0Var4) ? 32 : 16;
        } else {
            l7m0Var4 = l7m0Var2;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zfn zfnVar = zaq0.b;
            long secondary = ((ThemeColors) fetVar.k(zfnVar)).getSecondary();
            long secondary2 = ((ThemeColors) fetVar.k(zfnVar)).getSecondary();
            long background = ((ThemeColors) fetVar.k(zfnVar)).getBackground();
            boolean zH = fetVar.h(((Boolean) l7m0Var4.getValue()).booleanValue());
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zH || objP == cl5Var) {
                ilm ilmVar = new ilm(secondary);
                gkw gkwVar = (gkw) l7m0Var3.getValue();
                if (gkwVar == null || (ekwVar = gkwVar.c) == null || (str = ekwVar.b) == null) {
                    str = "";
                }
                objP = new imm(ilmVar, new plm(str, secondary2, fa50.f9191a), fmm.f9790a, background, ((Boolean) l7m0Var4.getValue()).booleanValue(), null);
                fetVar.o0(objP);
            }
            imm immVar = (imm) objP;
            mm40 mm40VarQ = i120.Q(o7k0.d(jm40.b, 1.0f), ((ThemeColors) fetVar.k(zfnVar)).getBackground(), jd8.n);
            boolean z = (i2 & 896) == 256;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new i8v(function1, (byte) 4);
                fetVar.o0(objP2);
            }
            hlm.c(mm40VarQ, immVar, null, (Function0) objP2, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4084);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new erv(l7m0Var3, l7m0Var2, function1, i, (byte) 0);
        }
    }
}
