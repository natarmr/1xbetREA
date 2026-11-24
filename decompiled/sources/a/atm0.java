package a;

import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.graphics.Typeface;
import android.javax.sip.message.Response;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class atm0 {
    public atm0() {
        new ConcurrentHashMap();
    }

    public static final void a(mm40 mm40Var, long j, long j2, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(-576329831);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.f(j2) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            float fB = bdl.b(j2);
            float fA = bdl.a(j2);
            jm40 jm40Var = jm40.b;
            zq8.a(0, fetVar, i120.Q(o7k0.p(jm40Var, fB, fA), j, vgg0.f37379a));
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vhh(mm40Var2, j, j2, i);
        }
    }

    public static final void b(rep0 rep0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1079660447);
        int i2 = i | (fetVar2.g(rep0Var) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            k7x.b(rep0Var.f30347a, null, o7k0.n(jm40Var, 24.0f), null, a8k0.F(R.drawable.icon_globe_empty, 0, fetVar2), null, null, null, null, null, null, null, fetVar2, 32816, 0, 32744);
            qxw.o(fetVar2, o7k0.s(jm40Var, 8.0f));
            String str = rep0Var.b;
            x7z x7zVar = new x7z(1.0f, true);
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str, x7zVar, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            if (rep0Var.c.length() > 0) {
                fetVar2.e0(2029394729);
                qxw.o(fetVar2, o7k0.s(jm40Var, 14.0f));
                j0x.b(a8k0.F(rep0Var.d, 0, fetVar2), null, o7k0.n(jm40Var, 14.0f), null, null, 0.0f, null, fetVar2, 56, 120);
                qxw.o(fetVar2, o7k0.s(jm40Var, 8.0f));
                v8q0.a(rep0Var.c, s5x0.N(jm40Var, 0.0f, 0.0f, 6.0f, 0.0f, 11), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.d(), fetVar, 0, 0, 131064);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(2029913669);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l7p0(rep0Var, i, (byte) 3);
        }
    }

    public static final void c(int i, fet fetVar, mm40 mm40Var, String str) {
        byte b;
        fet fetVar2 = fetVar;
        String str2 = str;
        str2.getClass();
        fetVar2.g0(484218659);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 40.0f);
            zfn zfnVar = zaq0.b;
            long jM177getSeparator600d7_KjU = ((ThemeColors) fetVar2.k(zfnVar)).getSeparator60();
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarS = i120.S(mm40VarN, 1.0f, jM177getSeparator600d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarS);
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
            mm40 mm40VarJ = s5x0.J(jm40.b, 4.0f);
            n05 n05Var = new n05(qmk.p, qmk.q, qmk.n);
            long jM183getTextPrimary0d7_KjU = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            b = 1;
            v8q0.a(str, mm40VarJ, jM183getTextPrimary0d7_KjU, n05Var, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar2, (i2 >> 3) & 14, 24960, 110576);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            b = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgp0(mm40Var, str2, i, b);
        }
    }

    public static final void d(String str, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1844353731);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
            pm80 pm80VarF = a8k0.F(R.drawable.default_background, 0, fetVar);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            k7x.b(str, null, jr8.f16991a.b(o7k0.e(mm40VarD, 438.0f), gqw0.b), pm80VarF, pm80VarF, null, null, null, null, null, gqw0.A, null, fetVar, (i2 & 14) | 36912, 6, 31712);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v((byte) 14, i, str);
        }
    }

    public static final void e(mm40 mm40Var, hh80 hh80Var, ow3 ow3Var, sw3 sw3Var, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1090151935);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.e(3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(hh80Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(ow3Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(sw3Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(ugdVar) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            k6z k6zVar = (k6z) fetVar.k(bmd.n);
            boolean zE = ((i2 & 112) == 32) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384) | ((i2 & 896) == 256) | fetVar.e(k6zVar.ordinal());
            Object objP = fetVar.P();
            if (zE || objP == ukd.f35823a) {
                objP = new a5n(ow3Var, sw3Var, hh80Var, k6zVar);
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            int i3 = (((((i2 << 3) & 112) | ((i2 >> 15) & 14)) << 6) & 896) | 6;
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
            twn.v((i3 >> 6) & 14, ugdVar, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p4t0(mm40Var, hh80Var, ow3Var, sw3Var, ugdVar, i, (byte) 2);
        }
    }

    public static final void f(lc00 lc00Var, m9s m9sVar, ctf0 ctf0Var) {
        m9sVar.getClass();
        ctf0Var.getClass();
        qqs qqsVar = m9sVar.h;
        int i = qqsVar.f;
        List list = qqsVar.c;
        if (qqsVar.c.isEmpty()) {
            return;
        }
        lc00Var.add(new psv("TENNIS_HEADER_KEY", R.string.set_statistics));
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ctf0Var.b.a(R.string.cybergame_synthetic_set_v2, Arrays.copyOf(new Object[]{((ve90) it.next()).f37273a}, 1)));
        }
        lc00Var.add(new m8o0(arrayList));
        String str = m9sVar.i;
        List list2 = m9sVar.m;
        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
        Iterator it2 = list2.iterator();
        while (true) {
            String str2 = "";
            if (!it2.hasNext()) {
                break;
            }
            String str3 = (String) it2.next();
            str3.getClass();
            if (!kotlin.text.c.x(str3, ujn.h, false)) {
                if (str3.length() != 0) {
                    List list3 = u0d.f34849a;
                    if (!u0d.c(str3)) {
                        str2 = String.format(Locale.ENGLISH, StringsKt.O(str3, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str3}, 2));
                    }
                }
                str3 = str2;
            }
            arrayList2.add(str3);
        }
        ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((ve90) it3.next()).b);
        }
        lc00Var.add(new p8o0("TENNIS_FIRST_TEAM_KEY", str, arrayList2, R.drawable.cybergame_synthetic_tennis_first_bg, arrayList3, i == 1));
        String str4 = m9sVar.j;
        List<String> list4 = m9sVar.n;
        ArrayList arrayList4 = new ArrayList(r3d.q(list4, 10));
        for (String str5 : list4) {
            str5.getClass();
            if (!kotlin.text.c.x(str5, ujn.h, false)) {
                if (str5.length() != 0) {
                    List list5 = u0d.f34849a;
                    if (!u0d.c(str5)) {
                        str5 = String.format(Locale.ENGLISH, StringsKt.O(str5, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str5}, 2));
                    }
                }
                str5 = "";
            }
            arrayList4.add(str5);
        }
        ArrayList arrayList5 = new ArrayList(r3d.q(list, 10));
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((ve90) it4.next()).c);
        }
        lc00Var.add(new p8o0("TENNIS_SECOND_TEAM_KEY", str4, arrayList4, R.drawable.cybergame_synthetic_tennis_second_bg, arrayList5, i == 2));
    }

    public static ssq k(ssq[] ssqVarArr, int i) {
        int i2 = (i & 1) == 0 ? Response.BAD_REQUEST : 700;
        boolean z = (i & 2) != 0;
        ssq ssqVar = null;
        int i3 = Integer.MAX_VALUE;
        for (ssq ssqVar2 : ssqVarArr) {
            int iAbs = (Math.abs(ssqVar2.c - i2) * 2) + (ssqVar2.d == z ? 0 : 1);
            if (ssqVar == null || i3 > iAbs) {
                ssqVar = ssqVar2;
                i3 = iAbs;
            }
        }
        return ssqVar;
    }

    public static byte[] l(String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (str == null) {
            return null;
        }
        return str.getBytes(charset);
    }

    public static final String m(uu4 uu4Var) {
        uu4Var.getClass();
        if (uu4Var != null) {
            if (uu4Var instanceof ru4) {
                return "";
            }
            if (uu4Var instanceof su4) {
                su4 su4Var = (su4) uu4Var;
                return dw9.m(su4Var.b, Separators.SLASH, su4Var.f32804a);
            }
            if (uu4Var instanceof tu4) {
                return ((tu4) uu4Var).f34533a;
            }
        }
        t9f.b();
        return null;
    }

    public static final exo0 n(hxu hxuVar, String str, e4f e4fVar, ctf0 ctf0Var) {
        hxuVar.getClass();
        str.getClass();
        ctf0Var.getClass();
        ivo0 ivo0Var = hxuVar.f13829a;
        boolean zL = osm0.l(ivo0Var);
        String str2 = ivo0Var.f15455a;
        String strI0 = jtv.I0(ivo0Var.b, str, false);
        ivo0 ivo0Var2 = hxuVar.b;
        boolean zL2 = osm0.l(ivo0Var2);
        String str3 = ivo0Var2.f15455a;
        String strI1 = jtv.I0(ivo0Var2.b, str, false);
        ivo0 ivo0Var3 = hxuVar.c;
        boolean zL3 = osm0.l(ivo0Var3);
        String str4 = ivo0Var3.f15455a;
        String strI2 = jtv.I0(ivo0Var3.b, str, false);
        ivo0 ivo0Var4 = hxuVar.d;
        boolean zL4 = osm0.l(ivo0Var4);
        String str5 = ivo0Var4.f15455a;
        double d = ivo0Var4.b;
        String strI3 = jtv.I0(d, str, false);
        ivo0 ivo0Var5 = hxuVar.e;
        boolean zL5 = osm0.l(ivo0Var5);
        String str6 = ivo0Var5.f15455a;
        String strI4 = jtv.I0(ivo0Var5.b, str, false);
        ivo0 ivo0Var6 = hxuVar.f;
        boolean z = osm0.l(ivo0Var6) && e4fVar != e4f.f;
        e4f e4fVar2 = e4f.e;
        String strF = e4fVar == e4fVar2 ? ctf0Var.f(R.string.history_your_win_new, new Object[0]) : ivo0Var6.f15455a;
        int iA = e4fVar == e4fVar2 ? ctf0Var.a(R.color.static_green) : ctf0.b(R.attr.uikitTextPrimary, ctf0Var);
        String strI5 = jtv.I0(ivo0Var6.b, str, false);
        pn40 pn40Var = pn40.f27267a;
        return new exo0(zL, str2, strI0, str3, strI1, zL2, zL3, str4, strI2, zL4, str5, strI3, str6, zL5, strI4, z, strF, strI5, iA, pn40.d(d, str, p3u0.c));
    }

    public static final hgr0 o(nz10 nz10Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        return new fgr0(wzb.e0(nz10Var), wzb.i0(nz10Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    public static final f0s0 p(i0s0 i0s0Var) {
        ?? arrayList;
        ?? arrayList2;
        n0s0 n0s0Var;
        i0s0Var.getClass();
        Long l = i0s0Var.f13962a;
        long jLongValue = l != null ? l.longValue() : 0L;
        List<m0s0> list = i0s0Var.b;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (m0s0 m0s0Var : list) {
                m0s0Var.getClass();
                String str = m0s0Var.f20971a;
                if (str == null) {
                    str = "";
                }
                String str2 = m0s0Var.b;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = m0s0Var.c;
                if (str3 == null) {
                    str3 = "";
                }
                q0s0 q0s0Var = m0s0Var.d;
                if (q0s0Var != null) {
                    Float f = q0s0Var.f27919a;
                    float fFloatValue = f != null ? f.floatValue() : 0.0f;
                    Integer num = q0s0Var.b;
                    n0s0Var = new n0s0(fFloatValue, num != null ? num.intValue() : 0);
                } else {
                    n0s0Var = new n0s0(0.0f, 0);
                }
                arrayList.add(new j0s0(str, str2, str3, n0s0Var));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        List<e0s0> list2 = i0s0Var.c;
        if (list2 != null) {
            arrayList2 = new ArrayList(r3d.q(list2, 10));
            for (e0s0 e0s0Var : list2) {
                e0s0Var.getClass();
                String str4 = e0s0Var.f7004a;
                if (str4 == null) {
                    str4 = "";
                }
                Integer num2 = e0s0Var.b;
                int iIntValue = num2 != null ? num2.intValue() : -1;
                Integer num3 = e0s0Var.c;
                int iIntValue2 = num3 != null ? num3.intValue() : -1;
                Integer num4 = e0s0Var.d;
                arrayList2.add(new b0s0(iIntValue, iIntValue2, num4 != null ? num4.intValue() : 0, str4));
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = iun.f15405a;
        }
        return new f0s0(jLongValue, arrayList, arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    public static final tns0 q(wns0 wns0Var) {
        ?? arrayList;
        Object next;
        wns0Var.getClass();
        String str = wns0Var.f39463a;
        String str2 = str == null ? "" : str;
        Map map = wns0Var.b;
        if (map == null) {
            map = lun.f20680a;
            map.getClass();
        }
        Map map2 = map;
        String str3 = wns0Var.c;
        String str4 = str3 == null ? "" : str3;
        Map map3 = wns0Var.d;
        if (map3 == null) {
            map3 = lun.f20680a;
            map3.getClass();
        }
        Map map4 = map3;
        String str5 = wns0Var.e;
        String str6 = str5 == null ? "" : str5;
        String str7 = wns0Var.f;
        String str8 = str7 == null ? "" : str7;
        btw btwVar = wns0Var.g;
        if (btwVar == null) {
            btwVar = new btw();
        }
        ysw yswVar = new ysw(btwVar.f3203a, btwVar.b, btwVar.c, btwVar.d);
        List list = wns0Var.h;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(q((wns0) it.next()));
            }
        } else {
            arrayList = iun.f15405a;
        }
        ?? r10 = arrayList;
        gne0 gne0Var = clg0.b;
        String str9 = wns0Var.i;
        String str10 = str9 != null ? str9 : "";
        gne0Var.getClass();
        Iterator it2 = clg0.f.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!((clg0) next).f4558a.equals(str10));
        clg0 clg0Var = (clg0) next;
        if (clg0Var == null) {
            clg0Var = clg0.DEFAULT;
        }
        return new tns0(str2, map2, str4, map4, str6, str8, yswVar, r10, clg0Var);
    }

    public static final x9v0 r(bav0 bav0Var) {
        List list = bav0Var.f2278a;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                Integer num = bav0Var.c;
                int i = 0;
                int iIntValue = num != null ? num.intValue() : 0;
                Long l = bav0Var.b;
                long jLongValue = l != null ? l.longValue() : Long.MAX_VALUE;
                s9v0 s9v0Var = bav0Var.e;
                csr csrVarW = s9v0Var != null ? zsm0.w(s9v0Var) : null;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(eeq.T(((hav0) it.next()).f12744a));
                }
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                for (Object obj : arrayList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        q3d.p();
                        throw null;
                    }
                    arrayList2.add(new iav0(i, (esr) obj));
                    i = i2;
                }
                Double d = bav0Var.f;
                double dDoubleValue = d != null ? d.doubleValue() : -1.0d;
                Long l2 = bav0Var.g;
                return new x9v0(iIntValue, jLongValue, csrVarW, arrayList2, dDoubleValue, l2 != null ? l2.longValue() : -1L);
            }
        }
        jf4.k(null);
        return null;
    }

    public abstract Typeface g(Context context, esq esqVar, Resources resources, int i);

    public abstract Typeface h(Context context, ssq[] ssqVarArr, int i);

    public Typeface i(int i, Context context, List list) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface j(Context context, Resources resources, int i, String str, int i2) {
        File fileR = btm0.r(context);
        if (fileR == null) {
            return null;
        }
        try {
            if (btm0.n(fileR, resources, i)) {
                return Typeface.createFromFile(fileR.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileR.delete();
        }
    }

    public abstract fpw0 s();

    public Integer t() {
        return null;
    }
}
