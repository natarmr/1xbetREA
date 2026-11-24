package a;

import android.app.Application;
import android.gov.nist.core.Separators;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public abstract class p7x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f26527a = 9;
    public static final int b = 10;
    public static final int c = 12;
    public static String d;
    public static int e;
    public static Boolean f;

    public static final bfj A(kzv kzvVar, ctf0 ctf0Var) {
        rdj rdjVar = rdj.f30294a;
        boolean zH = ctf0Var.h();
        long j = kzvVar.d;
        String strG = rdj.g(new znq0(j), efj.UNIVERSAL, Boolean.valueOf(zH), false, 56);
        String strA = ctf0Var.b.a(R.string.accepted, Arrays.copyOf(new Object[0], 0));
        pz40 pz40Var = s6t0.f31722a;
        return new bfj(R.drawable.ic_glyph_status_outline_check, s6t0.b().f33626a.getPrimary(), strG, strA);
    }

    public static String B(long j, boolean z, long j2) {
        String str;
        String strR;
        bzu bzuVarE = rz4.e("static", "img", "android", "sportgamebg");
        List listJ = q3d.j(1L, 2L, 3L, 4L, 6L, 8L, 10L, 40L, 167L, 146L, 257L, 153L, 235L, 243L, 258L, 66L);
        if (j == 85) {
            str = "swipe_fifa";
        } else if (j == 103) {
            str = "swipe_mk";
        } else if (j != 40) {
            str = "";
        } else if (j2 == 1) {
            str = "swipe_dota";
        } else {
            str = j2 == 46 ? "swipe_cs" : "40";
        }
        if (str.length() > 0) {
            strR = z ? str.concat("_dark.png") : str.concat(".png");
        } else {
            strR = r(z, listJ.contains(Long.valueOf(j)) ? j : 0L);
        }
        bzuVarE.g(strR);
        return ((StringBuilder) bzuVarE.b).toString();
    }

    public static final boolean C(List list, vr20 vr20Var, long j) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ru6 ru6Var = (ru6) it.next();
            if (ru6Var.d == j && ru6Var.h == vr20Var.b && ru6Var.g == vr20Var.m.f30476a && ru6Var.f == vr20Var.f) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    public static final boolean D(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        if (!z) {
            return false;
        }
        for (Object obj : a4xVar) {
            if (((p6t0) obj) instanceof uxx) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    public static final boolean E(e7z e7zVar) {
        if (e7zVar.i == null) {
            return false;
        }
        e7z e7zVarV = e7zVar.v();
        return (e7zVarV != null ? e7zVarV.i : null) == null || e7zVar.i1.b;
    }

    public static float F(float f2, float f3, float f4) {
        return (f4 * f3) + ((1.0f - f4) * f2);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0098  */
    public static final pv40 G(rzg0 rzg0Var, Function1 function1, Function1 function2, Function1 function3, fet fetVar, int i) {
        mbo0 mbo0Var;
        rzg0Var.getClass();
        function3.getClass();
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function2 = null;
        }
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (objP == obj) {
            objP = new ov40();
            function3.invoke(objP);
            fetVar.o0(objP);
        }
        ov40 ov40Var = (ov40) objP;
        fetVar.e0(-1254177748);
        LinkedHashMap linkedHashMap = ov40Var.f25909a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(wp20.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Object obj2 = (mbo0) entry.getKey();
            rb50 rb50Var = (rb50) entry.getValue();
            fetVar.b0(-991111185, obj2);
            u950 u950VarH = c9x.H(rzg0Var, new rb50[]{rb50Var}, fetVar);
            fetVar.r(false);
            linkedHashMap2.put(key, u950VarH);
        }
        fetVar.r(false);
        boolean zG = fetVar.g(linkedHashMap2);
        Object objP2 = fetVar.P();
        if (zG || objP2 == obj) {
            LinkedHashMap linkedHashMap3 = ov40Var.f25909a;
            mbo0 mbo0Var2 = ov40Var.b;
            if (mbo0Var2 == null) {
                Set setKeySet = linkedHashMap3.keySet();
                setKeySet.getClass();
                Object objT = CollectionsKt.T(setKeySet);
                objT.getClass();
                mbo0Var = (mbo0) objT;
            } else {
                mbo0Var = linkedHashMap3.containsKey(mbo0Var2) ? mbo0Var2 : null;
                if (mbo0Var == null) {
                    Set setKeySet2 = linkedHashMap3.keySet();
                    setKeySet2.getClass();
                    Object objT2 = CollectionsKt.T(setKeySet2);
                    objT2.getClass();
                    mbo0Var = (mbo0) objT2;
                }
            }
            objP2 = new pv40(linkedHashMap2, mbo0Var, function1, function2);
            fetVar.o0(objP2);
        }
        return (pv40) objP2;
    }

    public static void H(sty styVar, n78 n78Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            sf3.x(styVar, n78Var != null ? sf3.r(n78Var) : null);
        } else if (n78Var == null) {
            styVar.setXfermode(null);
        } else {
            PorterDuff.Mode modeQ = xf0.Q(n78Var);
            styVar.setXfermode(modeQ != null ? new PorterDuffXfermode(modeQ) : null);
        }
    }

    public static final sl I(yl ylVar) {
        String str = ylVar.b;
        if (str == null) {
            str = "";
        }
        Long l = ylVar.f42816a;
        if (l == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue = l.longValue();
        String str2 = ylVar.c;
        if (str2 != null) {
            return new sl(jLongValue, str, str2);
        }
        jf4.k(null);
        return null;
    }

    public static final v85 J(o95 o95Var, boolean z) {
        Long l = o95Var.f24863a;
        if (l == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue = l.longValue();
        String str = o95Var.b;
        String str2 = "";
        if (str == null) {
            if (z) {
                jf4.k(null);
                return null;
            }
            str = "";
        }
        String str3 = o95Var.c;
        if (str3 != null) {
            str2 = str3;
        } else if (z) {
            jf4.k(null);
            return null;
        }
        return new v85(jLongValue, str, str2);
    }

    public static final List K(stk0 stk0Var, ctf0 ctf0Var) {
        bqv bqvVar;
        Integer num;
        ctf0Var.getClass();
        List<a2e0> list = stk0Var.b;
        if (list.isEmpty()) {
            return iun.f15405a;
        }
        lc00 lc00VarB = kotlin.collections.a.b();
        String strA = ctf0Var.b.a(R.string.special_event_ratings, Arrays.copyOf(new Object[0], 0));
        pz40 pz40Var = s6t0.f31722a;
        y3d y3dVar = new y3d(s6t0.b().f33626a.getTextPrimary());
        Integer numValueOf = Integer.valueOf(list.size());
        if (list.size() > 1) {
            num = numValueOf;
            bqvVar = null;
        } else {
            bqvVar = null;
            num = null;
        }
        lc00VarB.add(new eok0(new hjm(strA, null, y3dVar, null, null, null, false, null, null, false, null, num, 4090), bqvVar, i9h0.f14386a));
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (a2e0 a2e0Var : list) {
            a2e0Var.getClass();
            arrayList.add(new e2e0(a2e0Var.f120a, a2e0Var.b));
        }
        lc00VarB.add(new o1e0(dyb.r0(arrayList)));
        return kotlin.collections.a.a(lc00VarB);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001c  */
    /* JADX WARN: Code duplicated, block: B:15:0x001f A[RETURN] */
    public static final oxk0 L(Integer num) {
        for (oxk0 oxk0Var : oxk0.values()) {
            byte b2 = oxk0Var.f26017a;
            if (num != null && b2 == num.intValue()) {
                if (oxk0Var == null) {
                    return oxk0.DEFAULT;
                }
                return oxk0Var;
            }
        }
        oxk0Var = null;
        if (oxk0Var == null) {
            return oxk0.DEFAULT;
        }
        return oxk0Var;
    }

    public static final lc00 M(bvk0 bvk0Var, ctf0 ctf0Var, int i, String str) {
        ctf0Var.getClass();
        str.getClass();
        lc00 lc00VarB = kotlin.collections.a.b();
        String strA = ctf0Var.b.a(R.string.statistic_stadium_title, Arrays.copyOf(new Object[0], 0));
        pz40 pz40Var = s6t0.f31722a;
        lc00VarB.add(new eok0(new hjm(strA, null, new y3d(s6t0.b().f33626a.getTextPrimary()), null, null, null, false, null, null, false, null, null, 8186), null, i9h0.f14386a));
        List list = bvk0Var.b;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(g1x.G((wwl0) it.next(), i, str, ctf0Var));
        }
        lc00VarB.add(new qxl0(dyb.r0(arrayList)));
        return kotlin.collections.a.a(lc00VarB);
    }

    public static final float N(String str) {
        String strR = kotlin.text.c.r(str, Separators.PERCENT, "", false);
        if (StringsKt.O(strR, Separators.COLON, false)) {
            Float fJ = kotlin.text.b.j((String) CollectionsKt.U(StringsKt__StringsKt.split$default(strR, new String[]{Separators.COLON}, false, 0, 6, null)));
            if (fJ != null) {
                return fJ.floatValue();
            }
            return 0.0f;
        }
        Float fJ2 = kotlin.text.b.j(strR);
        if (fJ2 != null) {
            return fJ2.floatValue();
        }
        return 0.0f;
    }

    public static final void a(mm40 mm40Var, lp00 lp00Var, fet fetVar, int i) {
        fetVar.g0(-1808496420);
        int i2 = (fetVar.g(lp00Var) ? 32 : 16) | i;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zq8.a(0, fetVar, i120.Q(mm40Var, fbc.d(lp00Var.f20417a), jd8.n));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7y(mm40Var, lp00Var, i, (byte) 26);
        }
    }

    public static final void b(k3t0 k3t0Var, llm0 llm0Var, Function0 function0, fet fetVar, int i) {
        k3t0Var.getClass();
        function0.getClass();
        fetVar.g0(-1431145775);
        int i2 = i | (fetVar.i(k3t0Var) ? 4 : 2) | (fetVar.e(llm0Var.ordinal()) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            i3t0 i3t0Var = (i3t0) k3t0Var;
            pz40 pz40VarY = i3t0Var.y(fetVar);
            zdm0 zdm0Var = ((g120) pz40VarY.getValue()).f10489a;
            r020 r020Var = ((g120) pz40VarY.getValue()).c;
            j9m0 j9m0Var = ((g120) pz40VarY.getValue()).b;
            boolean z = ((g120) pz40VarY.getValue()).d;
            f9m0 f9m0Var = new f9m0(R.string.statistic, fmm.f9790a, 0L, false, false, null, null, false, 252);
            boolean z2 = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new a2z(function0, (byte) 6);
                fetVar.o0(objP);
            }
            ffb0.D(null, f9m0Var, zdm0Var, j9m0Var, z, (Function0) objP, null, null, u1c.M(367743875, new odv((Object) llm0Var, (Object) r020Var, z, (Object) i3t0Var, (byte) 1), fetVar), fetVar, 102236160, 129);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mtz(k3t0Var, llm0Var, function0, i, (byte) 10);
        }
    }

    public static final void c(mm40 mm40Var, ugd ugdVar, Function2 function2, Function2 function3, fet fetVar, int i) {
        int i2;
        fetVar.g0(491384825);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function3) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = r71.B;
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
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
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            ugdVar.invoke(fetVar, Integer.valueOf((i2 >> 3) & 14));
            if (function2 == null) {
                fetVar.e0(-425807287);
                fetVar.r(false);
            } else {
                fetVar.e0(-1122114376);
                h97.q((i2 >> 6) & 14, fetVar, function2, false);
            }
            if (function3 == null) {
                fetVar.e0(-425766615);
                fetVar.r(false);
            } else {
                fetVar.e0(-1122113064);
                h97.q((i2 >> 9) & 14, fetVar, function3, false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vho((byte) 13, i, (Object) mm40Var, (Object) ugdVar, (Object) function2, (Object) function3);
        }
    }

    public static final void d(int i, fet fetVar, mm40 mm40Var, String str, String str2, String str3) {
        fet fetVar2;
        mm40 mm40Var2;
        ugd ugdVar;
        str.getClass();
        str3.getClass();
        fetVar.g0(323948475);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128) | (fetVar.g(str3) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            ugd ugdVarM = u1c.M(-1628358365, new yh20(str, (byte) 5), fetVar);
            ugd ugdVarM2 = null;
            if (str2.length() > 0) {
                fetVar.e0(-42056611);
                ugd ugdVarM3 = u1c.M(30856711, new yh20(str2, (byte) 6), fetVar);
                fetVar.r(false);
                ugdVar = ugdVarM3;
            } else {
                fetVar.e0(-41763413);
                fetVar.r(false);
                ugdVar = null;
            }
            if (str3.length() > 0) {
                fetVar.e0(-41659160);
                ugdVarM2 = u1c.M(-720692442, new yh20(str3, (byte) 7), fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(-41130517);
                fetVar.r(false);
            }
            fetVar2 = fetVar;
            c(mm40Var, ugdVarM, ugdVar, ugdVarM2, fetVar2, (i2 & 14) | 48);
            mm40Var2 = mm40Var;
        } else {
            fetVar2 = fetVar;
            mm40Var2 = mm40Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cm5(mm40Var2, str, str2, str3, i, (byte) 2);
        }
    }

    public static final void e(mm40 mm40Var, nr90 nr90Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        nr90Var.getClass();
        fetVar.g0(-718498598);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(nr90Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            fetVar2 = fetVar;
            jcb.l(s5x0.L(mm40Var, 16.0f, 0.0f, 2), nr90Var.f23990a, true, null, fetVar2, 384, 8);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dlw(mm40Var, nr90Var, i, (byte) 17);
        }
    }

    public static final void f(mm40 mm40Var, Function1 function1, fet fetVar, int i) {
        int i2;
        function1.getClass();
        fetVar.g0(1814363026);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            imm immVar = new imm(new ilm(qcc.S(R.attr.uikitSecondary, fetVar)), new plm(xsm0.s(R.string.online_call, fetVar), qcc.S(R.attr.uikitSecondary, fetVar), fa50.f9191a), fmm.f9790a, qcc.S(R.attr.uikitBackground0, fetVar), false, null);
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ma70(function1, (byte) 8);
                fetVar.o0(objP);
            }
            hlm.c(mm40Var, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, i2 & 14, 0, 4084);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sx(mm40Var, function1, i, (byte) 5);
        }
    }

    public static final void g(ctf0 ctf0Var, Function0 function0, Function0 function1, fet fetVar, int i) {
        function0.getClass();
        function1.getClass();
        fetVar.g0(-1233013189);
        int i2 = i | (fetVar.g(ctf0Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1169) != 1168)) {
            Integer numValueOf = Integer.valueOf(R.drawable.ic_glyph_circle_check);
            m0x m0xVar = new m0x(R.drawable.ic_glyph_circle_check, null, 6);
            zfn zfnVar = zaq0.b;
            oui0 oui0Var = new oui0(numValueOf, (y3d) null, m0xVar, new y3d(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), 18);
            lsm0 lsm0Var = ctf0Var.b;
            obc.q(null, new rqm((vui0) new tui0(lsm0Var.a(R.string.activate, Arrays.copyOf(new Object[0], 0)), new y3d(((ThemeColors) fetVar.k(zfnVar)).getTextPrimary())), (pui0) oui0Var, (pvi0) null, (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 508), false, null, function0, null, null, null, fetVar, (i2 << 6) & 57344, 237);
            zcl zclVar = qmk.f28987a;
            vtb.t(o7k0.e(jm40.b, 1.0f), qqm.f29173a, null, 0L, fetVar, 48, 12);
            obc.q(null, new rqm((vui0) new tui0(lsm0Var.a(R.string.change_action, Arrays.copyOf(new Object[0], 0)), new y3d(((ThemeColors) fetVar.k(zfnVar)).getTextPrimary())), (pui0) new oui0(Integer.valueOf(R.drawable.ic_glyph_edit), (y3d) null, new m0x(R.drawable.ic_glyph_edit, null, 6), new y3d(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), 18), (pvi0) null, (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 508), false, null, function1, null, null, null, fetVar, (i2 << 3) & 57344, 237);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o090(ctf0Var, function0, function1, i, (byte) 4);
        }
    }

    public static final void h(mm40 mm40Var, fqj0 fqj0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(1500879950);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(fqj0Var) ? 32 : 16);
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarO = ny9.O(2.7692308f, o7k0.d(s5x0.N(s5x0.L(jm40Var, 1.0f, 0.0f, 2), 0.0f, 1.0f, 0.0f, 0.0f, 13), 1.0f), false);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarO), fqj0Var));
            qxw.o(fetVar, o7k0.e(jm40Var, 8.0f));
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.d(s5x0.L(o7k0.e(jm40Var, 24.0f), 8.0f, 0.0f, 2), 1.0f)), fqj0Var));
            qxw.o(fetVar, o7k0.e(jm40Var, 4.0f));
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.d(s5x0.L(o7k0.e(jm40Var, 14.0f), 8.0f, 0.0f, 2), 1.0f)), fqj0Var));
            rz4.t(jm40Var, 4.0f, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xxh(mm40Var, fqj0Var, i, b2);
        }
    }

    public static final void i(mm40 mm40Var, lh80 lh80Var, fet fetVar, int i) {
        int i2;
        vcg0 vcg0Var = vcg0.f37186a;
        fetVar.g0(-2045366734);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(lh80Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.e(0) ? 256 : 128;
        }
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fqj0 fqj0VarD0 = vbc.d0(vqm.f37862a, fetVar, 0, 0);
            mm40 mm40VarI = s5x0.I(mm40Var, lh80Var);
            zcl zclVar = qmk.f28987a;
            ibc.A(mm40VarI, 8.0f, u1c.M(1512252744, new on7(fqj0VarD0), fetVar), fetVar, 384);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vx80(mm40Var, lh80Var, i, b2);
        }
    }

    public static final void j(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, String str, Function1 function1) {
        str.getClass();
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(223826956);
        int i2 = i | (fetVar.g(str) ? 32 : 16) | (fetVar.g(l7m0Var) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zfn zfnVar = zaq0.b;
            ilm ilmVar = new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary());
            plm plmVar = new plm(str, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50.f9191a);
            boolean zH = fetVar.h(((Boolean) l7m0Var.getValue()).booleanValue());
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zH || objP == cl5Var) {
                if (((Boolean) l7m0Var.getValue()).booleanValue()) {
                    pz40 pz40Var = s6t0.f31722a;
                    objP = new dmm(new ta50(new wkm(1, R.drawable.ic_glyph_agreements_history, true, ra50.f30118a, s6t0.b().f33626a.getSecondary())));
                } else {
                    objP = fmm.f9790a;
                }
                fetVar.o0(objP);
            }
            imm immVar = new imm(ilmVar, plmVar, (gmm) objP, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), false, null);
            int i3 = i2 & 7168;
            boolean z = i3 == 2048;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new dng0(function1, (byte) 5);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean z2 = i3 == 2048;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new a9g0(function1, (byte) 3);
                fetVar.o0(objP3);
            }
            hlm.c(mm40VarD, immVar, null, function0, null, (Function1) objP3, null, null, null, null, null, null, fetVar, 0, 0, 4052);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v9x(mm40Var, str, l7m0Var, function1, i);
        }
    }

    public static final void k(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1898996942);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            boolean zG = fetVar.g(((flh0) l7m0Var.getValue()).f9738a);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = ((flh0) l7m0Var.getValue()).f9738a.b;
                fetVar.o0(objP);
            }
            a4x a4xVar = (a4x) objP;
            mm40 mm40VarV = cjx.V(jm40.b, a8k0.G(xczVarA, fetVar), null);
            boolean zI = fetVar.i(a4xVar) | ((i2 & 112) == 32);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj) {
                objP2 = new or0(a4xVar, function1, (byte) 27);
                fetVar.o0(objP2);
            }
            b8k0.e(mm40VarV, xczVarA, null, null, null, null, false, null, (Function1) objP2, fetVar, 0, 508);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t5e0(l7m0Var, function1, i, (byte) 23);
        }
    }

    public static final void l(String str, fet fetVar, int i) {
        str.getClass();
        fetVar.g0(778982988);
        int i2 = (fetVar.g(str) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            wvb.o(null, 24.0f, 0L, fetVar, 0, 5);
            wwb.i(null, str, 0L, 0, 0L, fetVar, (i2 << 3) & 112, 29);
            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yh20((byte) 23, i, str);
        }
    }

    public static final void m(Function1 function1, vdj0 vdj0Var, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        function1.getClass();
        vdj0Var.getClass();
        fetVar.g0(1946080196);
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.i(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(vdj0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(mm40Var) ? 256 : 128;
        }
        byte b3 = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = wwi0.f39887a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new wvi0(b2);
                fetVar.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objP3 = fetVar.P();
            if (z || objP3 == cl5Var) {
                objP3 = new uwi0(vdj0Var, function1, b3);
                fetVar.o0(objP3);
            }
            y860.g(xdrVar, null, function2, null, (Function1) objP3, fetVar, 390, 10);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbg0((Object) function1, (Object) vdj0Var, mm40Var, i, (byte) 7);
        }
    }

    public static final long n(float f2, float f3) {
        return (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void o(y5d y5dVar, ctf0 ctf0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(495943324);
        if ((i & 48) == 0) {
            i2 = ((i & 64) == 0 ? fetVar.g(ctf0Var) : fetVar.i(ctf0Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 17) != 16)) {
            zcl zclVar = qmk.f28987a;
            wvb.o(null, 24.0f, 0L, fetVar, 0, 5);
            wwb.i(null, ctf0Var.b.a(R.string.select_action, Arrays.copyOf(new Object[0], 0)), 0L, 0, 0L, fetVar, 0, 29);
            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o680((Object) y5dVar, (Object) ctf0Var, i, (byte) 5);
        }
    }

    public static final gy30 p(String str, int i, long j, y3d y3dVar) {
        return new gy30(new ux30(14, 0L, str, (String) null), new rx30(new m0x(i, null, 6), j, null, i, 0L, new pc5(y3dVar), 436), null, 0L, null, null, 252);
    }

    public static final a4x q(gua0 gua0Var) {
        int i;
        lc00 lc00VarB = kotlin.collections.a.b();
        boolean z = gua0Var.k;
        zmb zmbVar = gua0Var.f;
        if (!z) {
            lc00VarB.add(new xip(0, R.drawable.ic_glyph_search, false, true));
        }
        int iOrdinal = zmbVar.ordinal();
        if (iOrdinal == 0) {
            i = R.drawable.ic_glyph_planet;
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return null;
            }
            i = R.drawable.ic_glyph_planet_active;
        }
        lc00VarB.add(new xip(4, i, zmbVar == zmb.b, true));
        if (!gua0Var.l) {
            boolean z2 = gua0Var.o;
            lc00VarB.add(new xip(3, z2 ? R.drawable.ic_glyph_filter_active : R.drawable.ic_glyph_filter_inactive, z2, true));
        }
        return dyb.o0(kotlin.collections.a.a(lc00VarB));
    }

    public static String r(boolean z, long j) {
        return dw9.o(j, z ? "_night.png" : "_day.png");
    }

    public static final f3w s(kzv kzvVar, ctf0 ctf0Var, String str) {
        if (!kzvVar.x) {
            return null;
        }
        String strConcat = "autoSale".concat(kzvVar.f19169a);
        String strA = ctf0Var.b.a(R.string.auto_sale_order_with_colon, Arrays.copyOf(new Object[0], 0));
        pn40 pn40Var = pn40.f27267a;
        return new f3w(strConcat, strA, pn40.c(kzvVar.y, p3u0.c), str, e3w.f7156a);
    }

    public static final f3w t(kzv kzvVar, ctf0 ctf0Var, String str) {
        double d2 = kzvVar.L;
        double d3 = kzvVar.f;
        String strA = (d2 >= d3 || kzvVar.g == i0w.i) ? ctf0Var.b.a(R.string.history_bet_rate, Arrays.copyOf(new Object[0], 0)) : ctf0Var.b.a(R.string.history_bet_rate_partially_sold, Arrays.copyOf(new Object[0], 0));
        pn40 pn40Var = pn40.f27267a;
        double d4 = kzvVar.C;
        if (d4 <= 0.0d) {
            d4 = d3 - kzvVar.E;
        }
        return new f3w("", strA, pn40.c(d4, p3u0.c), str, e3w.f7156a);
    }

    public static final long u(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final gbn v(Function1 function1, Function2 function2) {
        return new gbn(new v1x((byte) 7), new pkv(3, (byte) 28), new ulw(function1, function2, (byte) 1), btv.y);
    }

    public static String w() throws Throwable {
        BufferedReader bufferedReader;
        String str = d;
        if (str != null) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            d = processName;
            return processName;
        }
        int iMyPid = e;
        if (iMyPid == 0) {
            iMyPid = Process.myPid();
            e = iMyPid;
        }
        String strTrim = null;
        strTrim = null;
        strTrim = null;
        BufferedReader bufferedReader2 = null;
        strTrim = null;
        try {
            if (iMyPid > 0) {
                try {
                    StringBuilder sb = new StringBuilder(String.valueOf(iMyPid).length() + 14);
                    sb.append("/proc/");
                    sb.append(iMyPid);
                    sb.append("/cmdline");
                    String string = sb.toString();
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        bufferedReader = new BufferedReader(new FileReader(string));
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        try {
                            String line = bufferedReader.readLine();
                            s0x.H(line);
                            strTrim = line.trim();
                            bufferedReader.close();
                        } catch (IOException unused) {
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            d = strTrim;
                            return strTrim;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader;
                            if (bufferedReader2 != null) {
                                try {
                                    bufferedReader2.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th2;
                    }
                } catch (IOException unused3) {
                    bufferedReader = null;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (IOException unused4) {
        }
        d = strTrim;
        return strTrim;
    }

    public static final f3w x(kzv kzvVar, ctf0 ctf0Var, String str) {
        e3w e3wVar;
        BigDecimal bigDecimalSubtract = new BigDecimal(String.valueOf(kzvVar.f)).subtract(new BigDecimal(String.valueOf(kzvVar.E)));
        bigDecimalSubtract.getClass();
        BigDecimal bigDecimalSubtract2 = new BigDecimal(String.valueOf(kzvVar.m)).subtract(bigDecimalSubtract);
        bigDecimalSubtract2.getClass();
        double dDoubleValue = bigDecimalSubtract2.doubleValue();
        String strO = ntb.O(str, dDoubleValue);
        if (dDoubleValue > 0.0d) {
            e3wVar = e3w.b;
        } else {
            e3wVar = dDoubleValue < 0.0d ? e3w.c : e3w.f7156a;
        }
        return new f3w("", ctf0Var.b.a(R.string.history_your_profit_new, Arrays.copyOf(new Object[0], 0)), strO, str, e3wVar);
    }

    public static final String y(kzv kzvVar, ctf0 ctf0Var, String str) {
        pn40 pn40Var = pn40.f27267a;
        String strD = pn40.d(kzvVar.m, str, p3u0.c);
        return cy7.c() ? ua80.i("\u200e", strD, Separators.SP, StringsKt.v0(ctf0Var.b.a(R.string.history_sale_for_v2, Arrays.copyOf(new Object[]{""}, 1))).toString()) : ctf0Var.b.a(R.string.history_sale_for_v2, Arrays.copyOf(new Object[]{strD}, 1));
    }

    public static String z(boolean z, long j) {
        bzu bzuVarE = rz4.e("static", "img", "android", "sportgamebg");
        bzuVarE.g(r(z, q3d.j(1L, 2L, 3L, 4L, 6L, 8L, 10L, 40L, 167L, 146L, 257L, 153L, 235L, 243L, 258L, 66L).contains(Long.valueOf(j)) ? j : 0L));
        return ((StringBuilder) bzuVarE.b).toString();
    }
}
