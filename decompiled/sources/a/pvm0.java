package a;

import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.CustomColors;
import org.xplatform.uikit.compose.color.IndividualColors;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pvm0 {
    public static final String B(g3s0 g3s0Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        int iOrdinal = g3s0Var.ordinal();
        if (iOrdinal == 0) {
            return ctf0Var.b.a(R.string.stages, Arrays.copyOf(new Object[0], 0));
        }
        if (iOrdinal == 1) {
            return ctf0Var.b.a(R.string.common, Arrays.copyOf(new Object[0], 0));
        }
        t9f.b();
        return null;
    }

    public static void D(String str, List list, int i) {
        if (list.size() == i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i + " parameters found " + list.size());
    }

    public static void E(String str, List list, int i) {
        if (list.size() >= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i + " parameters found " + list.size());
    }

    public static void F(int i, String str, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i + " parameters found " + arrayList.size());
    }

    public static boolean G(jlw0 jlw0Var) {
        if (jlw0Var == null) {
            return false;
        }
        Double dZzd = jlw0Var.zzd();
        return !dZzd.isNaN() && dZzd.doubleValue() >= 0.0d && dZzd.equals(Double.valueOf(Math.floor(dZzd.doubleValue())));
    }

    public static smw0 H(String str) {
        smw0 smw0Var;
        if (str == null || str.isEmpty()) {
            smw0Var = null;
        } else {
            smw0Var = (smw0) smw0.M1.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (smw0Var != null) {
            return smw0Var;
        }
        jf4.o(kng0.k("Unsupported commandId ", str));
        return null;
    }

    public static boolean I(jlw0 jlw0Var, jlw0 jlw0Var2) {
        if (!jlw0Var.getClass().equals(jlw0Var2.getClass())) {
            return false;
        }
        if ((jlw0Var instanceof wlw0) || (jlw0Var instanceof okw0)) {
            return true;
        }
        if (jlw0Var instanceof ihw0) {
            if (Double.isNaN(jlw0Var.zzd().doubleValue()) || Double.isNaN(jlw0Var2.zzd().doubleValue())) {
                return false;
            }
            return jlw0Var.zzd().equals(jlw0Var2.zzd());
        }
        if (jlw0Var instanceof slw0) {
            return jlw0Var.zzc().equals(jlw0Var2.zzc());
        }
        if (jlw0Var instanceof pfw0) {
            return jlw0Var.zze().equals(jlw0Var2.zze());
        }
        return jlw0Var == jlw0Var2;
    }

    public static int J(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d))) % 4.294967296E9d);
    }

    public static double K(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        return ((double) (d > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d));
    }

    public static Object L(jlw0 jlw0Var) {
        if (jlw0.W0.equals(jlw0Var)) {
            return null;
        }
        if (jlw0.V0.equals(jlw0Var)) {
            return "";
        }
        if (jlw0Var instanceof akw0) {
            return M((akw0) jlw0Var);
        }
        if (!(jlw0Var instanceof rew0)) {
            return !jlw0Var.zzd().isNaN() ? jlw0Var.zzd() : jlw0Var.zzc();
        }
        ArrayList arrayList = new ArrayList();
        rew0 rew0Var = (rew0) jlw0Var;
        int i = 0;
        while (i < rew0Var.k()) {
            if (i >= rew0Var.k()) {
                v4i0.o(b1j.h(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
                return null;
            }
            int i2 = i + 1;
            Object objL = L(rew0Var.l(i));
            if (objL != null) {
                arrayList.add(objL);
            }
            i = i2;
        }
        return arrayList;
    }

    public static HashMap M(akw0 akw0Var) {
        HashMap map = new HashMap();
        for (String str : new ArrayList(akw0Var.f1043a.keySet())) {
            Object objL = L(akw0Var.b(str));
            if (objL != null) {
                map.put(str, objL);
            }
        }
        return map;
    }

    public static void N(h0q0 h0q0Var) {
        int iJ = J(h0q0Var.O("runtime.counter").zzd().doubleValue() + 1.0d);
        if (iJ <= 1000000) {
            h0q0Var.M("runtime.counter", new ihw0(Double.valueOf(iJ)));
        } else {
            jf4.n("Instructions allowed exceeded");
        }
    }

    public static final void a(int i, fet fetVar, mm40 mm40Var, Function0 function0) {
        int i2;
        fet fetVar2;
        mm40 mm40Var2;
        Function0 function1;
        fetVar.g0(-334126118);
        if ((i & 6) == 0) {
            i2 = (fetVar.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar2 = fetVar;
            function1 = function0;
            mm40Var2 = mm40Var;
            qzb.n(mm40Var2, new wul(lul.e, oe9.f25112a, new ue9(rsm0.w(R.string.make_bet, 0, fetVar)), true, false, true), function1, fetVar2, ((i2 >> 3) & 14) | ((i2 << 6) & 896), 0);
        } else {
            fetVar2 = fetVar;
            mm40Var2 = mm40Var;
            function1 = function0;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wb5(function1, mm40Var2, i, (byte) 10);
        }
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var, Function0 function0) {
        int i2;
        fetVar.g0(-229333316);
        if ((i & 6) == 0) {
            i2 = (fetVar.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            obc.d(lcg0.f19798a.a(new icg0(new hcg0(0.0f, 0.0f, 0.0f, 0.0f), 1)), u1c.M(877210492, new lw0(mm40Var, function0, (byte) 17), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wb5(function0, mm40Var, i, (byte) 9);
        }
    }

    public static final void c(mm40 mm40Var, l7m0 l7m0Var, l7m0 l7m0Var2, Function0 function0, fet fetVar, int i) {
        int i2;
        l7m0 l7m0Var3;
        fetVar.g0(1741419867);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            l7m0Var3 = l7m0Var;
            i2 |= fetVar.g(l7m0Var3) ? 32 : 16;
        } else {
            l7m0Var3 = l7m0Var;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(l7m0Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if (!fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            fetVar.X();
        } else if (((Boolean) l7m0Var3.getValue()).booleanValue()) {
            fetVar.e0(-270486734);
            a((i2 >> 9) & 14, fetVar, o7k0.d(mm40Var, 1.0f), function0);
            fetVar.r(false);
        } else {
            fetVar.e0(-270309724);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 40.0f), 1.0f);
            zfn zfnVar = zaq0.b;
            long secondary10 = ((ThemeColors) fetVar.k(zfnVar)).getSecondary10();
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            lmc.r(1572864, qmk.o, fetVar, s5x0.K(i120.Q(mm40VarD, secondary10, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 12.0f, 10.0f), y9q0.a(g1t0.j(), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), y9q0.a(g1t0.j(), ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), rsm0.w(R.string.toto_chosen_2, 0, fetVar), (String) l7m0Var2.getValue());
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rmr0(mm40Var, l7m0Var3, l7m0Var2, function0, i, (byte) 0);
        }
    }

    public static final void d(mgs mgsVar, fet fetVar, int i) {
        fetVar.g0(-141274764);
        int i2 = (fetVar.g(jm40.b) ? 4 : 2) | i | (fetVar.g(mgsVar) ? 32 : 16);
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else {
            if (!(mgsVar instanceof mgs)) {
                throw b1j.f(1673909026, fetVar, false);
            }
            fetVar.e0(352130411);
            k5n0.f(androidx.compose.runtime.e.f(mgsVar, fetVar), fetVar, i2 & 14);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new edk0(mgsVar, i, (byte) 26);
        }
    }

    public static final void e(Function2 function2, fet fetVar, int i) {
        yfe0 yfe0VarU;
        qyl qylVar;
        function2.getClass();
        fetVar.g0(-316196513);
        byte b = 4;
        int i2 = (fetVar.g(function2) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            rdo0 rdo0Var = (rdo0) fetVar.k(sdo0.f32043a);
            if (rdo0Var == null) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    qylVar = new qyl(function2, i, b);
                }
            } else {
                boolean zG = fetVar.g(rdo0Var) | ((i2 & 14) == 4);
                Object objP = fetVar.P();
                if (zG || objP == ukd.f35823a) {
                    objP = new lcl0(rdo0Var, function2, null, (byte) 12);
                    fetVar.o0(objP);
                }
                m0x0.t(fetVar, rdo0Var, (Function2) objP);
            }
            yfe0VarU.d = qylVar;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            qylVar = new qyl(function2, i, (byte) 5);
            yfe0VarU.d = qylVar;
        }
    }

    public static final void f(int i, fet fetVar, mm40 mm40Var, Function0 function0) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1285588321);
        int i2 = i | 6 | (fetVar2.i(function0) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarP = o7k0.p(jm40Var, 122.0f, 132.0f);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarW = y860.W(i120.Q(mm40VarP, s6t0.b().f33626a.getBackgroundContent(), vgg0.a(16.0f)), null, null, false, null, function0, 28);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.n, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_plus_small, 0, fetVar2);
            zfn zfnVar = zaq0.b;
            dww.c(pm80VarF, null, o7k0.n(jm40Var, 24.0f), ((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), fetVar2, 56, 0);
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            String strW = rsm0.w(R.string.add, 0, fetVar2);
            long primary = ((ThemeColors) fetVar2.k(zfnVar)).getPrimary();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(strW, mm40VarN, primary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.m(), fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lw0(mm40Var2, function0, i, (byte) 15);
        }
    }

    public static final void g(mm40 mm40Var, zrr0 zrr0Var, fet fetVar, int i) {
        zrr0Var.getClass();
        fetVar.g0(-404109978);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(zrr0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            x8x.b(null, zrr0Var.f44871a, fetVar, 0);
            q8x.g(null, zrr0Var.b, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a6p0((Object) mm40Var, (Object) zrr0Var, i, (byte) 17);
        }
    }

    public static final void h(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function0 function0, Function0 function1) {
        int i2;
        l7m0Var.getClass();
        function0.getClass();
        function1.getClass();
        fetVar.g0(2100479756);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(mm40Var) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object objP = fetVar.P();
            byte b2 = 3;
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = jgk0.b(new ojr0(l7m0Var, b2));
                fetVar.o0(objP);
            }
            l7m0 l7m0Var2 = (l7m0) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = jgk0.b(new ojr0(l7m0Var, b));
                fetVar.o0(objP2);
            }
            l7m0 l7m0Var3 = (l7m0) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = jgk0.b(new ojr0(l7m0Var, (byte) 5));
                fetVar.o0(objP3);
            }
            l7m0 l7m0Var4 = (l7m0) objP3;
            if (((Boolean) l7m0Var2.getValue()).booleanValue()) {
                fetVar.e0(2014493063);
                mm40 mm40VarW = o7k0.w(mm40Var, null, false, 3);
                pz40 pz40Var = s6t0.f31722a;
                long shadowSoft = s6t0.b().f33626a.getShadowSoft();
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarJ = s5x0.J(i120.Q(lgb.J(qcc.F(qcc.F(mm40VarW, shadowSoft, 20.0f, 12.0f, 4.0f, 0.0f, 112), s6t0.b().f33626a.getShadowSoft(), 20.0f, 32.0f, -4.0f, 0.0f, 112), vgg0.c(20.0f, 20.0f, 0.0f, 0.0f, 12)), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n), 12.0f);
                thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
                jm40 jm40Var = jm40.b;
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                b((i2 >> 3) & 14, fetVar, o050.S(mm40VarD.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true))), function0);
                qxw.o(fetVar, o7k0.s(jm40Var, 12.0f));
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                c(o050.S(o2e.e0(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), "SELECTED_OUTCOME_MAKE_BET")), l7m0Var3, l7m0Var4, function1, fetVar, ((i2 << 3) & 7168) | 432);
                fetVar.r(true);
                fetVar.r(false);
            } else {
                fetVar.e0(2016106582);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qmr0(l7m0Var, function0, function1, mm40Var, i);
        }
    }

    public static final void i(mm40 mm40Var, nss0 nss0Var, fet fetVar, int i) {
        nss0Var.getClass();
        fetVar.g0(-1938984967);
        int i2 = i | 6 | (fetVar.g(nss0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (nss0Var instanceof lss0) {
                fetVar.e0(-1285815445);
                j((lss0) nss0Var, fetVar, i2 & 126);
                fetVar.r(false);
            } else {
                if (!nss0Var.equals(mss0.f22337a)) {
                    throw b1j.f(651256833, fetVar, false);
                }
                fetVar.e0(-1285708588);
                k(6, fetVar);
                fetVar.r(false);
            }
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new htr0(mm40Var, nss0Var, i, (byte) 11);
        }
    }

    public static final void j(lss0 lss0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-803420851);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(lss0Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = mu90.p;
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarK0 = mrv.k0(jm40Var, "BACK_IMAGE_ID");
            pm80 pm80VarF = a8k0.F(R.drawable.tv_bet_back, 0, fetVar);
            pge pgeVar = gqw0.h1;
            j0x.b(pm80VarF, null, mm40VarK0, null, pgeVar, 0.0f, null, fetVar, 25016, 104);
            j0x.b(a8k0.F(R.drawable.tv_bet_score, 0, fetVar), null, mrv.k0(jm40Var, "SCORE_IMAGE_ID"), null, pgeVar, 0.0f, null, fetVar, 25016, 104);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-578373450, new p6r0(lss0Var, (byte) 22), fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nb50(lss0Var, i);
        }
    }

    public static final void k(int i, fet fetVar) {
        int i2;
        fetVar.g0(-2030534120);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        byte b = 2;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            int iB = (int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() >> 32);
            float f = ((Resources) fetVar.k(dy2.c)).getDisplayMetrics().density;
            boolean zE = fetVar.e(iB) | fetVar.d(f);
            Object objP = fetVar.P();
            if (zE || objP == ukd.f35823a) {
                objP = androidx.compose.runtime.e.a((iB / f) / 2.6f);
                fetVar.o0(objP);
            }
            qxw.o(fetVar, xbc.c0(o7k0.e(o7k0.d(jm40Var, 1.0f), ((agk0) objP).l()), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bur0(i, b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v16 */
    public static final void l(mm40 mm40Var, hdv0 hdv0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        ?? r11;
        hdv0Var.getClass();
        int i3 = hdv0Var.f12890a;
        function1.getClass();
        fetVar.g0(712667345);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.d(32.0f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(hdv0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Resources resources = (Resources) fetVar.k(dy2.c);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 56.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar2, zclVar2, zclVar2, zclVar2);
            StaticColors staticColors = StaticColors.INSTANCE;
            mm40 mm40VarQ = i120.Q(mm40VarN, staticColors.m126getWhite200d7_KjU(), ugg0Var2);
            boolean z = (i2 & 7168) == 2048;
            int i4 = i2 & 896;
            boolean z2 = z | (i4 == 256);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new ugu0(function1, hdv0Var, (byte) 5);
                fetVar.o0(objP);
            }
            mm40 mm40VarE0 = o2e.e0(feb.O(mm40VarQ, (Function0) objP), "WIDGET_BUTTON_ITEM_BOX" + resources.getResourceEntryName(i3));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN2 = o7k0.n(jm40Var, 32.0f);
            zx7 zx7Var = gqw0.e;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarB = jr8Var.b(mm40VarN2, zx7Var);
            boolean z3 = i4 == 256;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                r11 = 0;
                objP2 = new gdv0((Object) hdv0Var, (byte) (0 == true ? 1 : 0));
                fetVar.o0(objP2);
            } else {
                r11 = 0;
            }
            dww.c(a8k0.F(i3, r11, fetVar), null, o2e.e0(pai0.a(mm40VarB, r11, (Function1) objP2), "WIDGET_BUTTON_ITEM_ICON"), staticColors.m123getWhite0d7_KjU(), fetVar, 56, 0);
            if (hdv0Var.b) {
                fetVar.e0(-2073549470);
                thb.f(ffb0.Q(jr8Var.b(jm40Var, gqw0.c), 4.0f, -4.0f), new pf5(2, new y3d(((IndividualColors) fetVar.k(j7x.f16059a)).getSplashBackground())), fetVar, 0, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(-2073191017);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s0n0(mm40Var, hdv0Var, function1, i, (byte) 26);
        }
    }

    public static final ArrayList o(ArrayList arrayList, List list, mer merVar) {
        wsy wsyVarF;
        list.getClass();
        arrayList.size();
        list.size();
        ArrayList<Pair> arrayListT0 = CollectionsKt.T0(arrayList, list);
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayListT0, 10));
        for (Pair pair : arrayListT0) {
            wsy wsyVar = (wsy) pair.f46059a;
            k3u0 k3u0Var = (k3u0) pair.b;
            int i = k3u0Var.g;
            g93 annotations = k3u0Var.getAnnotations();
            g950 name = k3u0Var.getName();
            name.getClass();
            boolean zQ1 = k3u0Var.q1();
            boolean z = k3u0Var.i;
            boolean z2 = k3u0Var.j;
            if (k3u0Var.k != null) {
                int i2 = rek.f30339a;
                ym40 ym40VarC = oek.c(merVar);
                ym40VarC.getClass();
                wsyVarF = ym40VarC.c().f(wsyVar);
            } else {
                wsyVarF = null;
            }
            wsy wsyVar2 = wsyVarF;
            gmk0 gmk0VarB = k3u0Var.b();
            gmk0VarB.getClass();
            arrayList2.add(new k3u0(merVar, null, i, annotations, name, wsyVar, zQ1, z, z2, wsyVar2, gmk0VarB));
        }
        return arrayList2;
    }

    public static String p(og9 og9Var) {
        StringBuilder sb = new StringBuilder(og9Var.size());
        for (int i = 0; i < og9Var.size(); i++) {
            byte b = og9Var.b(i);
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                        } else {
                            sb.append((char) b);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final yqh q(f0t f0tVar, List list) {
        Object next;
        f0tVar.getClass();
        list.getClass();
        String str = f0tVar.b;
        StringBuilder sb = new StringBuilder(ujn.h);
        Locale locale = Locale.ENGLISH;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((wvp) next).f39848a != f0tVar.f8731a);
        wvp wvpVar = (wvp) next;
        String str2 = String.format(locale, "ufcStatistic/v1/image/%s", Arrays.copyOf(new Object[]{wvpVar != null ? wvpVar.b : ""}, 1));
        if (str2.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(str2, ujn.h, false) || kotlin.text.c.x(str2, "https://", false)) {
            sb.setLength(0);
            sb.append(str2);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(str2, '/'));
        }
        c280 c280Var = new c280(sb.toString(), R.drawable.cybergames_ufc_fighter_placeholder);
        int i = f0tVar.e;
        Integer numValueOf = i != 0 ? Integer.valueOf(i) : null;
        StringBuilder sb2 = new StringBuilder(ujn.h);
        String str3 = String.format(Locale.ENGLISH, "static/img/android/country/%s.png", Arrays.copyOf(new Object[]{String.valueOf(numValueOf)}, 1));
        if (str3.length() == 0) {
            sb2.setLength(0);
        } else if (StringsKt.O(str3, ujn.h, false) || kotlin.text.c.x(str3, "https://", false)) {
            sb2.setLength(0);
            sb2.append(str3);
        } else {
            if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                sb2.append('/');
            }
            sb2.append(StringsKt.y0(str3, '/'));
        }
        return new yqh(str, c280Var, new n0x(sb2.toString()));
    }

    public static final eaz r(wm40 wm40Var) {
        wm40 wm40Var2;
        wm40Var.getClass();
        int i = rek.f30339a;
        Iterator it = wm40Var.I().S().b().iterator();
        while (true) {
            if (!it.hasNext()) {
                wm40Var2 = null;
                break;
            }
            wsy wsyVar = (wsy) it.next();
            if (!ary.y(wsyVar)) {
                foc focVarN = wsyVar.S().n();
                int i2 = oek.f25126a;
                if (oek.m(focVarN, slc.f32392a) || oek.m(focVarN, slc.c)) {
                    focVarN.getClass();
                    wm40Var2 = (wm40) focVarN;
                    break;
                }
            }
        }
        if (wm40Var2 == null) {
            return null;
        }
        cr30 cr30VarU = wm40Var2.U();
        eaz eazVar = cr30VarU instanceof eaz ? (eaz) cr30VarU : null;
        return eazVar == null ? r(wm40Var2) : eazVar;
    }

    public static final bxv0 s(ywv0 ywv0Var) {
        ywv0Var.getClass();
        return ywv0Var.b.p();
    }

    public static final long t(int i, int i2, boolean z) {
        if (!z) {
            return i > i2 ? StaticColors.INSTANCE.m94getGamesTextVictory0d7_KjU() : StaticColors.INSTANCE.m123getWhite0d7_KjU();
        }
        if (i > i2) {
            return StaticColors.INSTANCE.m94getGamesTextVictory0d7_KjU();
        }
        return i == i2 ? StaticColors.INSTANCE.m132getYellow0d7_KjU() : CustomColors.INSTANCE.m42getItsme0d7_KjU();
    }

    public static final boolean w(d0t d0tVar) {
        d0tVar.getClass();
        f0t f0tVar = d0tVar.q;
        f0t f0tVar2 = d0tVar.r;
        String str = f0tVar2.b;
        if (f0tVar.b.length() == 0) {
            return false;
        }
        return (str.length() == 0 && f0tVar2.c.isEmpty()) || str.length() > 0;
    }

    public abstract void A(View view, float f, float f2);

    public abstract boolean C(View view, int i);

    public abstract int m(View view, int i);

    public int n(View view, int i) {
        return view.getTop();
    }

    public int u(View view) {
        return 0;
    }

    public int v(View view) {
        return 0;
    }

    public abstract void y(int i);

    public abstract void z(View view, int i, int i2);

    public void x(View view, int i) {
    }
}
