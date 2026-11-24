package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import com.huawei.hms.framework.common.BundleUtil;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final class jtt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17118a;

    public /* synthetic */ jtt0(byte b) {
        this.f17118a = b;
    }

    public static final void a(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        pz40 pz40Var;
        byte b;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1599633880);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar2.o0(objP);
            }
            pz40 pz40Var2 = (pz40) objP;
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            k7x.b(str, null, o2e.e0(o7k0.n(jm40Var, 24.0f), "TeamLogoTestTag"), a8k0.F(R.drawable.icon_globe_empty, 0, fetVar2), a8k0.F(R.drawable.icon_globe_empty, 0, fetVar2), null, null, null, null, null, null, null, fetVar2, ((i2 >> 3) & 14) | 36912, 0, 32736);
            mm40 mm40VarE0 = o2e.e0(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), "TeamNameTestTag");
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                pz40Var = pz40Var2;
                b = 1;
                objP2 = new dbo0(pz40Var, b);
                fetVar2.o0(objP2);
            } else {
                pz40Var = pz40Var2;
                b = 1;
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP2);
            y9q0 y9q0Var = new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109);
            long jM123getWhite0d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = new dbo0(pz40Var, (byte) 2);
                fetVar2.o0(objP3);
            }
            v8q0.a(str2, mm40VarA, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, (Function1) objP3, y9q0Var, fetVar2, (i2 >> 6) & 14, 1597824, 45048);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new man(mm40Var, str, str2, i, (byte) 24);
        }
    }

    public static final void b(x1z x1zVar, Function1 function1, fet fetVar, int i) {
        x1z x1zVar2;
        fet fetVar2 = fetVar;
        x1zVar.getClass();
        boolean z = x1zVar.h;
        function1.getClass();
        fetVar2.g0(2014704524);
        int i2 = i | (fetVar2.g(x1zVar) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = fetVar2.k(bmd.n) == k6z.b;
            String str = x1zVar.f;
            String str2 = x1zVar.e;
            jb30 jb30Var = x1zVar.d;
            zcl zclVar = qmk.f28987a;
            float f = z ? 0.0f : 2.0f;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = lgb.J(o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, f, 7), 1.0f), 68.0f), b5x.Q(z));
            StaticColors staticColors = StaticColors.INSTANCE;
            mm40 mm40VarK = s5x0.K(i120.Q(mm40VarJ, staticColors.m73getBlack400d7_KjU(), jd8.n), 8.0f, 6.0f);
            boolean z3 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objP = fetVar2.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new o0k0((Object) function1, (Object) x1zVar, (byte) 29);
                fetVar2.o0(objP);
            }
            mm40 mm40VarE0 = o2e.e0(y860.Y(mm40VarK, false, null, null, (Function0) objP, 15), "LastTeamMatchTestTag");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z4 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z4) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            o5n0.h(jb30Var.f16220a, fetVar2, 0);
            x7z x7zVar = new x7z(1.0f, true);
            lw3 lw3Var = uc9.f35418a;
            yx7 yx7Var = gqw0.j;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, x7zVar);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarA = zhg0Var.a(1.0f, jm40Var, true);
            yx7 yx7Var2 = gqw0.k;
            a(0, fetVar2, zhg0Var.b(yx7Var2, mm40VarA), x1zVar.b, x1zVar.c);
            v8q0.a(jb30Var.b, o2e.e0(zhg0Var.b(yx7Var2, zhg0Var.a(1.0f, jm40Var, true)), "BestOfTestTag"), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.j(), fetVar, 0, 0, 130040);
            mm40 mm40VarB = zhg0Var.b(yx7Var2, zhg0Var.a(1.0f, jm40Var, true));
            thg0 thg0VarA2 = shg0.a(uc9.b, yx7Var, fetVar, 6);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarB);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            ktt0.c(z2 ? w6x.q(str2, "-", str) : w6x.q(str, "-", str2), x1zVar.g, fetVar, 6);
            fetVar.r(true);
            fetVar.r(true);
            x1zVar2 = x1zVar;
            v8q0.a(jb30Var.c, o2e.e0(jm40Var, "EventDateTestTag"), staticColors.m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.e(), fetVar, 48, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            x1zVar2 = x1zVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a6p0((Object) x1zVar2, (Object) function1, i, (byte) 2);
        }
    }

    public static final void c(n0x n0xVar, fet fetVar, int i) {
        fetVar.g0(181844935);
        int i2 = (fetVar.g(n0xVar) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 64.0f);
            zfn zfnVar = zaq0.b;
            long separator60 = ((ThemeColors) fetVar.k(zfnVar)).getSeparator60();
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarS = i120.S(mm40VarN, 1.0f, separator60, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarS);
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
            mm40 mm40VarJ = lgb.J(o7k0.n(jm40Var, 32.0f), vgg0.f37379a);
            uc9.c(mm40VarJ, mm40VarJ, n0xVar, Integer.valueOf(R.drawable.ic_glyph_circle_globe), new y3d(((ThemeColors) fetVar.k(zfnVar)).getSecondary60()), null, null, gqw0.A, null, fetVar, ((i2 << 6) & 896) | 12582912, 352);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g0g(n0xVar, i, (byte) 8);
        }
    }

    public static final void d(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(590944425);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 298.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0g((Object) mm40Var, i, (byte) 3);
        }
    }

    public static final void e(lc00 lc00Var, gdu0 gdu0Var, m9s m9sVar, ctf0 ctf0Var, boolean z) {
        String strA;
        String str;
        m9sVar.getClass();
        ctf0Var.getClass();
        String str2 = gdu0Var.c;
        String str3 = gdu0Var.d;
        List list = gdu0Var.b;
        List list2 = gdu0Var.f11120a;
        if (str2.length() == 0 || str3.length() == 0) {
            return;
        }
        String string = (list2.size() > 0 ? list2.get(0) : "").toString();
        string.getClass();
        String string2 = (1 < list2.size() ? list2.get(1) : "").toString();
        string2.getClass();
        String string3 = (2 < list2.size() ? list2.get(2) : "").toString();
        string3.getClass();
        String string4 = (list.size() > 0 ? list.get(0) : "").toString();
        string4.getClass();
        String string5 = (1 < list.size() ? list.get(1) : "").toString();
        string5.getClass();
        String string6 = (2 < list.size() ? list.get(2) : "").toString();
        string6.getClass();
        String strH = h(str2);
        String strH2 = h(str3);
        qqs qqsVar = m9sVar.h;
        String str4 = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(qqsVar.b, new String[]{"-"}, false, 0, 6, null));
        String strI = i(ctf0Var, str4 != null ? Integer.parseInt(str4) : 0, z);
        String str5 = (String) CollectionsKt.f0(StringsKt__StringsKt.split$default(qqsVar.b, new String[]{"-"}, false, 0, 6, null));
        String strI2 = i(ctf0Var, str5 != null ? Integer.parseInt(str5) : 0, z);
        long jF = znq0.f(qqsVar.h);
        znq0 znq0Var = qqsVar.k;
        udu0 udu0Var = new udu0(znq0Var != null ? Long.valueOf(znq0.f(znq0Var.f44687a)) : null, jF);
        int iOrdinal = gdu0Var.e.ordinal();
        if (iOrdinal == 0) {
            strA = ctf0Var.b.a(R.string.bet_before_game_start, Arrays.copyOf(new Object[0], 0));
        } else if (iOrdinal == 2) {
            strA = ctf0Var.b.a(R.string.player_one_wins, Arrays.copyOf(new Object[0], 0));
        } else {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    str = "";
                } else {
                    strA = ctf0Var.b.a(R.string.drow, Arrays.copyOf(new Object[0], 0));
                }
                lc00Var.add(new xdu0(string, string2, string3, string4, string5, string6, strH, strH2, strI, strI2, udu0Var, str));
            }
            strA = ctf0Var.b.a(R.string.player_two_wins, Arrays.copyOf(new Object[0], 0));
        }
        str = strA;
        lc00Var.add(new xdu0(string, string2, string3, string4, string5, string6, strH, strH2, strI, strI2, udu0Var, str));
    }

    public static final String h(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        switch (lowerCase.hashCode()) {
            case -1857621509:
                return !lowerCase.equals("summult") ? "" : "(X1 + X2) * X3";
            case -891201504:
                return !lowerCase.equals("sumsum") ? "" : "X1 + X2 + X3";
            case 653953632:
                return !lowerCase.equals("multmult") ? "" : "X1 * X2 * X3";
            case 1406574363:
                return !lowerCase.equals("multsum") ? "" : "X1 * X2 + X3";
            default:
                return "";
        }
    }

    public static final String i(ctf0 ctf0Var, int i, boolean z) {
        if (z) {
            String upperCase = ctf0Var.b.a(R.string.synthetics_victory_formula_total_points, Arrays.copyOf(new Object[0], 0)).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            return upperCase;
        }
        String upperCase2 = ctf0Var.b.a(R.string.synthetics_victory_formula_total_points, Arrays.copyOf(new Object[0], 0)).toUpperCase(Locale.ROOT);
        upperCase2.getClass();
        return upperCase2 + Separators.SP + i;
    }

    public static final String j(int i, fet fetVar) {
        fetVar.k(dy2.f6873a);
        return ((Context) fetVar.k(dy2.b)).getResources().getString(i);
    }

    public static final y7t0 k(fet fetVar) {
        WeakHashMap weakHashMap = djv0.w;
        return new y7t0(zcm0.i(fetVar).g, zcm0.i(fetVar).b);
    }

    public static final int l(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final Object[] m(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        qx3.i(0, i, 6, objArr, objArr2);
        qx3.e(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final long o(float f, long j) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : y3d.c(y3d.d(j) * f, j);
    }

    public static final Object[] p(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        qx3.i(0, i, 6, objArr, objArr2);
        qx3.e(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] q(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        qx3.i(0, i, 6, objArr, objArr2);
        qx3.e(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    public static final ixo0 r(iwo0 iwo0Var, String str, boolean z) {
        xwo0 xwo0Var;
        bxo0 zwo0Var;
        tn7 sn7Var;
        boolean z2 = iwo0Var.f15501a;
        double d = iwo0Var.d;
        String str2 = iwo0Var.c;
        boolean z3 = iwo0Var.b;
        if (!z3 && !z) {
            if (d == 0.0d) {
                xwo0Var = null;
            } else {
                int i = cy7.f5159a;
                pn40 pn40Var = pn40.f27267a;
                zwo0Var = new zwo0(cy7.e(pn40.p(str, d)), d > 0.0d ? d4d.COMMERCE : d4d.TEXT_PRIMARY);
            }
            String str3 = iwo0Var.e;
            if (!z3 || z) {
                sn7Var = rn7.f30774a;
            } else {
                List<mvo0> list = iwo0Var.f;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (mvo0 mvo0Var : list) {
                    arrayList.add(new fuy(mvo0Var.f22468a, mvo0Var.b));
                }
                sn7Var = new sn7(dyb.r0(arrayList));
            }
            return new ixo0(z2, str2, zwo0Var, str3, sn7Var);
        }
        xwo0Var = xwo0.f41619a;
        zwo0Var = xwo0Var;
        String str4 = iwo0Var.e;
        if (z3) {
            sn7Var = rn7.f30774a;
        } else {
            sn7Var = rn7.f30774a;
        }
        return new ixo0(z2, str2, zwo0Var, str4, sn7Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    public static final gpq0 s(kpq0 kpq0Var) {
        ?? arrayList;
        List<e3b> list = kpq0Var.f18687a;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (e3b e3bVar : list) {
                e3bVar.getClass();
                String str = e3bVar.f7125a;
                String str2 = str == null ? "" : str;
                Integer num = e3bVar.b;
                int iIntValue = -1;
                int iIntValue2 = num != null ? num.intValue() : -1;
                Double d = e3bVar.c;
                double dDoubleValue = d != null ? d.doubleValue() : -1.0d;
                Double d2 = e3bVar.d;
                double dDoubleValue2 = d2 != null ? d2.doubleValue() : -1.0d;
                String str3 = e3bVar.e;
                String str4 = str3 != null ? str3 : "";
                Double d3 = e3bVar.f;
                double dDoubleValue3 = d3 != null ? d3.doubleValue() : -1.0d;
                Integer num2 = e3bVar.g;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                }
                arrayList.add(new z2b(dDoubleValue, dDoubleValue2, dDoubleValue3, iIntValue2, iIntValue, str2, str4));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        return new gpq0(arrayList);
    }

    public static final xjr0 t(Map.Entry entry) {
        entry.getClass();
        Integer num = (Integer) entry.getKey();
        Iterable iterable = (Iterable) entry.getValue();
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((md80) it.next()).f21584a));
        }
        return new xjr0(num, arrayList);
    }

    public static final wbv0 u(f280 f280Var, Integer num, v12 v12Var, int i) {
        k0d k0dVar;
        f280Var.getClass();
        int i2 = f280Var.f8801a;
        seo seoVar = f280Var.d;
        double d = seoVar.e;
        Double d2 = seoVar.f;
        String strN = w6x.n(i2, i, BundleUtil.UNDERLINE_TAG);
        int i3 = f280Var.f8801a;
        String str = f280Var.c;
        String strN2 = str != null ? ohs0.n(ujn.h, str) : "";
        String str2 = seoVar.m;
        String str3 = seoVar.g;
        if (seoVar.h) {
            k0dVar = k0d.b;
        } else if (d2 == null) {
            k0dVar = k0d.f17460a;
        } else if (d > d2.doubleValue()) {
            k0dVar = k0d.c;
        } else {
            k0dVar = d < d2.doubleValue() ? k0d.d : k0d.f17460a;
        }
        return new wbv0(strN, i3, strN2, new chl0(str2, str3, k0dVar, a65.f301a, seoVar.j, seoVar.k, false, false, new xgl0(-1L, 0.0d, 0.0d, "", 0, 0L, 0, 0L, false)), num, v12Var);
    }

    public static int v(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            jtt0 jtt0Var = ptt0.f27581a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return ptt0.b(i, hft0.e(bArr, j));
        }
        if (i2 == 2) {
            return ptt0.c(i, hft0.e(bArr, j), hft0.e(bArr, j + 1));
        }
        throw new AssertionError();
    }

    public static final LinkedHashMap w(lwv0 lwv0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("XBottomSheetMetadataKey", lwv0Var);
        return linkedHashMap;
    }

    public static boolean x(Comparator comparator, Collection collection) {
        Object objComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            objComparator = ((SortedSet) collection).comparator();
            if (objComparator == null) {
                objComparator = dpw0.b;
            }
        } else {
            if (!(collection instanceof oow0)) {
                return false;
            }
            objComparator = ((oow0) collection).g;
        }
        return comparator.equals(objComparator);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:2: B:23:0x0054->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:81:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x012c A[SYNTHETIC] */
    public final String f(byte[] bArr, int i, int i2) throws ynx {
        int i3;
        byte b;
        int i4;
        byte b2;
        byte b3;
        byte b4;
        switch (this.f17118a) {
            case 0:
                if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
                }
                int i5 = i + i2;
                char[] cArr = new char[i2];
                int i6 = 0;
                while (i < i5) {
                    byte b5 = bArr[i];
                    if (b5 < 0) {
                        while (i < i5) {
                            i3 = i + 1;
                            b = bArr[i];
                            if (b < 0) {
                                i4 = i6 + 1;
                                cArr[i6] = (char) b;
                                while (i3 < i5) {
                                    b2 = bArr[i3];
                                    if (b2 >= 0) {
                                        i3++;
                                        cArr[i4] = (char) b2;
                                        i4++;
                                    } else {
                                        i6 = i4;
                                        i = i3;
                                    }
                                }
                                i6 = i4;
                                i = i3;
                            } else if (b < -32) {
                                if (i3 < i5) {
                                    throw ynx.b();
                                }
                                i += 2;
                                byte b6 = bArr[i3];
                                int i7 = i6 + 1;
                                if (b >= -62 || etm0.o(b6)) {
                                    throw ynx.b();
                                }
                                cArr[i6] = (char) ((b6 & 63) | ((b & 31) << 6));
                                i6 = i7;
                            } else {
                                if (b >= -16) {
                                    if (i3 < i5 - 2) {
                                        throw ynx.b();
                                    }
                                    b4 = bArr[i3];
                                    int i8 = i + 3;
                                    byte b7 = bArr[i + 2];
                                    i += 4;
                                    byte b8 = bArr[i8];
                                    int i9 = i6 + 1;
                                    if (!etm0.o(b4)) {
                                        if ((((b4 + 112) + (b << 28)) >> 30) != 0 && !etm0.o(b7) && !etm0.o(b8)) {
                                            int i10 = ((b4 & 63) << 12) | ((b & 7) << 18) | ((b7 & 63) << 6) | (b8 & 63);
                                            cArr[i6] = (char) ((i10 >>> 10) + 55232);
                                            cArr[i9] = (char) ((i10 & 1023) + 56320);
                                            i6 += 2;
                                        }
                                    }
                                    throw ynx.b();
                                }
                                if (i3 < i5 - 1) {
                                    throw ynx.b();
                                }
                                int i11 = i + 2;
                                b3 = bArr[i3];
                                i += 3;
                                byte b9 = bArr[i11];
                                int i12 = i6 + 1;
                                if (!etm0.o(b3) || ((b == -32 && b3 < -96) || ((b == -19 && b3 >= -96) || etm0.o(b9)))) {
                                    throw ynx.b();
                                }
                                cArr[i6] = (char) (((b3 & 63) << 6) | ((b & 15) << 12) | (b9 & 63));
                                i6 = i12;
                            }
                        }
                        return new String(cArr, 0, i6);
                    }
                    i++;
                    cArr[i6] = (char) b5;
                    i6++;
                }
                while (i < i5) {
                    i3 = i + 1;
                    b = bArr[i];
                    if (b < 0) {
                        if (b < -32) {
                            if (i3 < i5) {
                                throw ynx.b();
                            }
                            i += 2;
                            byte b10 = bArr[i3];
                            int i13 = i6 + 1;
                            if (b >= -62) {
                            }
                            throw ynx.b();
                        }
                        if (b >= -16) {
                            if (i3 < i5 - 1) {
                                throw ynx.b();
                            }
                            int i14 = i + 2;
                            b3 = bArr[i3];
                            i += 3;
                            byte b11 = bArr[i14];
                            int i15 = i6 + 1;
                            if (etm0.o(b3)) {
                            }
                            throw ynx.b();
                        }
                        if (i3 < i5 - 2) {
                            throw ynx.b();
                        }
                        b4 = bArr[i3];
                        int i16 = i + 3;
                        byte b12 = bArr[i + 2];
                        i += 4;
                        byte b13 = bArr[i16];
                        int i17 = i6 + 1;
                        if (!etm0.o(b4)) {
                            if ((((b4 + 112) + (b << 28)) >> 30) != 0) {
                            }
                        }
                        throw ynx.b();
                    }
                    i4 = i6 + 1;
                    cArr[i6] = (char) b;
                    while (i3 < i5) {
                        b2 = bArr[i3];
                        if (b2 >= 0) {
                            i3++;
                            cArr[i4] = (char) b2;
                            i4++;
                        } else {
                            i6 = i4;
                            i = i3;
                        }
                    }
                    i6 = i4;
                    i = i3;
                }
                return new String(cArr, 0, i6);
            default:
                Charset charset = cmx.f4629a;
                String str = new String(bArr, i, i2, charset);
                if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                    throw ynx.b();
                }
                return str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x014d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0151  */
    /* JADX WARN: Code duplicated, block: B:71:0x0154  */
    /* JADX WARN: Code duplicated, block: B:75:0x0166  */
    /* JADX WARN: Code duplicated, block: B:77:0x016a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0180 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0182  */
    /* JADX WARN: Code duplicated, block: B:83:0x0187  */
    public final int g(String str, byte[] bArr, int i, int i2) {
        int i3;
        char cCharAt;
        int i4;
        char cCharAt2;
        long j;
        long j2;
        int i5;
        char cCharAt3;
        char c = 2048;
        char c2 = 57343;
        switch (this.f17118a) {
            case 0:
                int length = str.length();
                int i6 = i2 + i;
                int i7 = 0;
                while (i7 < length) {
                    int i8 = i7 + i;
                    if (i8 >= i6 || (cCharAt2 = str.charAt(i7)) >= 128) {
                        if (i7 == length) {
                            return i + length;
                        }
                        i3 = i + i7;
                        while (i7 < length) {
                            cCharAt = str.charAt(i7);
                            if (cCharAt >= 128 && i3 < i6) {
                                bArr[i3] = (byte) cCharAt;
                                i3++;
                            } else if (cCharAt >= 2048 && i3 <= i6 - 2) {
                                int i9 = i3 + 1;
                                bArr[i3] = (byte) ((cCharAt >>> 6) | 960);
                                i3 += 2;
                                bArr[i9] = (byte) ((cCharAt & '?') | 128);
                            } else {
                                if ((cCharAt < 55296 && 57343 >= cCharAt) || i3 > i6 - 3) {
                                    if (i3 > i6 - 4) {
                                        if (55296 <= cCharAt && cCharAt <= 57343 && ((i4 = i7 + 1) == str.length() || !Character.isSurrogatePair(cCharAt, str.charAt(i4)))) {
                                            throw new mtt0(i7, length);
                                        }
                                        itt0.e(cCharAt, i3);
                                        return 0;
                                    }
                                    int i10 = i7 + 1;
                                    if (i10 != str.length()) {
                                        char cCharAt4 = str.charAt(i10);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt4)) {
                                            int codePoint = Character.toCodePoint(cCharAt, cCharAt4);
                                            bArr[i3] = (byte) ((codePoint >>> 18) | 240);
                                            bArr[i3 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                            int i11 = i3 + 3;
                                            bArr[i3 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                            i3 += 4;
                                            bArr[i11] = (byte) ((codePoint & 63) | 128);
                                            i7 = i10;
                                        } else {
                                            i7 = i10;
                                        }
                                    }
                                    throw new mtt0(i7 - 1, length);
                                }
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | Response.TEMPORARILY_UNAVAILABLE);
                                int i12 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i12] = (byte) ((cCharAt & '?') | 128);
                            }
                            i7++;
                        }
                        return i3;
                    }
                    bArr[i8] = (byte) cCharAt2;
                    i7++;
                }
                if (i7 == length) {
                    return i + length;
                }
                i3 = i + i7;
                while (i7 < length) {
                    cCharAt = str.charAt(i7);
                    if (cCharAt >= 128) {
                        if (cCharAt >= 2048) {
                            if (cCharAt < 55296) {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | Response.TEMPORARILY_UNAVAILABLE);
                                int i13 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i13] = (byte) ((cCharAt & '?') | 128);
                            } else {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | Response.TEMPORARILY_UNAVAILABLE);
                                int i14 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i14] = (byte) ((cCharAt & '?') | 128);
                            }
                        } else if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | Response.TEMPORARILY_UNAVAILABLE);
                            int i15 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i15] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | Response.TEMPORARILY_UNAVAILABLE);
                            int i16 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i16] = (byte) ((cCharAt & '?') | 128);
                        }
                    } else if (cCharAt >= 2048) {
                        if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | Response.TEMPORARILY_UNAVAILABLE);
                            int i17 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i17] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | Response.TEMPORARILY_UNAVAILABLE);
                            int i18 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i18] = (byte) ((cCharAt & '?') | 128);
                        }
                    } else if (cCharAt < 55296) {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | Response.TEMPORARILY_UNAVAILABLE);
                        int i19 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i3 += 3;
                        bArr[i19] = (byte) ((cCharAt & '?') | 128);
                    } else {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | Response.TEMPORARILY_UNAVAILABLE);
                        int i110 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i3 += 3;
                        bArr[i110] = (byte) ((cCharAt & '?') | 128);
                    }
                    i7++;
                }
                return i3;
            default:
                long j3 = i;
                long j4 = ((long) i2) + j3;
                int length2 = str.length();
                if (length2 <= i2 && bArr.length - i2 >= i) {
                    int i20 = 0;
                    while (true) {
                        j = 1;
                        if (i20 < length2 && (cCharAt3 = str.charAt(i20)) < 128) {
                            hft0.l(bArr, j3, (byte) cCharAt3);
                            i20++;
                            j3 = 1 + j3;
                        }
                    }
                    if (i20 != length2) {
                        while (i20 < length2) {
                            char cCharAt5 = str.charAt(i20);
                            if (cCharAt5 < 128 && j3 < j4) {
                                hft0.l(bArr, j3, (byte) cCharAt5);
                                j2 = j;
                                j3 += j;
                            } else if (cCharAt5 >= c || j3 > j4 - 2) {
                                j2 = j;
                                if ((cCharAt5 < 55296 || c2 < cCharAt5) && j3 <= j4 - 3) {
                                    hft0.l(bArr, j3, (byte) ((cCharAt5 >>> '\f') | Response.TEMPORARILY_UNAVAILABLE));
                                    long j5 = j3 + 2;
                                    hft0.l(bArr, j3 + j2, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                                    j3 += 3;
                                    hft0.l(bArr, j5, (byte) ((cCharAt5 & '?') | 128));
                                } else {
                                    if (j3 <= j4 - 4) {
                                        int i21 = i20 + 1;
                                        if (i21 != length2) {
                                            char cCharAt6 = str.charAt(i21);
                                            if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                                int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                                hft0.l(bArr, j3, (byte) ((codePoint2 >>> 18) | 240));
                                                hft0.l(bArr, j3 + j2, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                                long j6 = j3 + 3;
                                                hft0.l(bArr, j3 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                                j3 += 4;
                                                hft0.l(bArr, j6, (byte) ((codePoint2 & 63) | 128));
                                                i20 = i21;
                                            } else {
                                                i20 = i21;
                                            }
                                        }
                                        throw new mtt0(i20 - 1, length2);
                                    }
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i5 = i20 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i5)))) {
                                        throw new mtt0(i20, length2);
                                    }
                                    itt0.h(cCharAt5, j3);
                                }
                            } else {
                                j2 = j;
                                long j7 = j3 + j2;
                                hft0.l(bArr, j3, (byte) ((cCharAt5 >>> 6) | 960));
                                j3 += 2;
                                hft0.l(bArr, j7, (byte) ((cCharAt5 & '?') | 128));
                            }
                            i20++;
                            j = j2;
                            c = 2048;
                            c2 = 57343;
                        }
                    }
                    return (int) j3;
                }
                itt0.q(str.charAt(length2 - 1), i + i2);
                return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x019e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:119:0x01a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:121:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x019c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x019c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x019c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x019c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x019c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x019c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:43:0x00af  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:67:0x0101  */
    /* JADX WARN: Code duplicated, block: B:69:0x0109  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [int] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [int] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [int] */
    /* JADX WARN: Type inference failed for: r5v7, types: [int] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public boolean n(byte[] bArr, int i, int i2) {
        boolean z;
        ?? r11;
        long j;
        int i3;
        int i4;
        long j2;
        byte bE;
        long j3;
        byte bE2;
        long j4;
        int i5 = i;
        ?? D = -1;
        D = -1;
        D = -1;
        D = -1;
        D = -1;
        D = -1;
        D = -1;
        D = -1;
        D = -1;
        D = -1;
        D = -1;
        D = -1;
        D = -1;
        D = -1;
        D = -1;
        D = -1;
        D = -1;
        D = -1;
        D = -1;
        D = -1;
        switch (this.f17118a) {
            case 0:
                z = false;
                while (i5 < i2 && bArr[i5] >= 0) {
                    i5++;
                }
                if (i5 >= i2) {
                    D = z;
                } else {
                    while (true) {
                        if (i5 >= i2) {
                            D = z;
                        } else {
                            int i6 = i5 + 1;
                            r11 = bArr[i5];
                            if (r11 >= 0) {
                                i5 = i6;
                            } else if (r11 < -32) {
                                if (i6 >= i2) {
                                    D = r11;
                                } else if (r11 >= -62) {
                                    i5 += 2;
                                    if (bArr[i6] > -65) {
                                    }
                                }
                            } else if (r11 < -16) {
                                if (i6 >= i2 - 1) {
                                    D = ptt0.d(bArr, i6, i2);
                                } else {
                                    int i7 = i5 + 2;
                                    ?? r2 = bArr[i6];
                                    if (r2 <= -65 && ((r11 != -32 || r2 >= -96) && (r11 != -19 || r2 < -96))) {
                                        i5 += 3;
                                        if (bArr[i7] > -65) {
                                        }
                                    }
                                }
                            } else if (i6 >= i2 - 2) {
                                D = ptt0.d(bArr, i6, i2);
                            } else {
                                int i8 = i5 + 2;
                                int i9 = bArr[i6];
                                if (i9 <= -65) {
                                    if ((((i9 + 112) + (r11 << 28)) >> 30) == 0) {
                                        int i10 = i5 + 3;
                                        if (bArr[i8] <= -65) {
                                            i5 += 4;
                                            if (bArr[i10] > -65) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (D == 0) {
                    return true;
                }
                return z;
            default:
                if ((i5 | i2 | (bArr.length - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i5), Integer.valueOf(i2)));
                }
                long j5 = i5;
                int i11 = (int) (((long) i2) - j5);
                if (i11 < 16) {
                    z = false;
                    j = 1;
                    i3 = 0;
                } else {
                    int i12 = 8 - (((int) j5) & 7);
                    long j6 = j5;
                    j = 1;
                    i3 = 0;
                    while (true) {
                        if (i3 < i12) {
                            long j7 = j6 + 1;
                            if (hft0.e(bArr, j6) < 0) {
                                z = false;
                            } else {
                                i3++;
                                j6 = j7;
                            }
                        } else {
                            while (true) {
                                int i13 = i3 + 8;
                                if (i13 <= i11) {
                                    z = false;
                                    if ((hft0.i(bArr, hft0.f + j6) & (-9187201950435737472L)) == 0) {
                                        j6 += 8;
                                        i3 = i13;
                                    }
                                } else {
                                    z = false;
                                }
                            }
                            while (true) {
                                if (i3 < i11) {
                                    long j8 = j6 + 1;
                                    if (hft0.e(bArr, j6) >= 0) {
                                        i3++;
                                        j6 = j8;
                                    }
                                } else {
                                    i3 = i11;
                                }
                            }
                        }
                    }
                }
                int i14 = i11 - i3;
                long j9 = j5 + ((long) i3);
                while (true) {
                    r11 = z;
                    while (i14 > 0) {
                        long j10 = j9 + j;
                        byte bE3 = hft0.e(bArr, j9);
                        if (bE3 >= 0) {
                            i14--;
                            r11 = bE3;
                            j9 = j10;
                        } else {
                            r11 = bE3;
                            j9 = j10;
                            if (i14 == 0) {
                                D = z;
                            } else {
                                i4 = i14 - 1;
                                if (r11 < -32) {
                                    if (i4 == 0) {
                                        D = r11;
                                    } else {
                                        i14 -= 2;
                                        if (r11 >= -62) {
                                            j2 = j9 + j;
                                            if (hft0.e(bArr, j9) > -65) {
                                                j9 = j2;
                                            }
                                        }
                                    }
                                } else if (r11 < -16) {
                                    if (i4 < 2) {
                                        D = v(j9, bArr, r11, i4);
                                    } else {
                                        i14 -= 3;
                                        long j11 = j9 + j;
                                        bE = hft0.e(bArr, j9);
                                        if (bE > -65 && ((r11 != -32 || bE >= -96) && (r11 != -19 || bE < -96))) {
                                            j9 += 2;
                                            if (hft0.e(bArr, j11) > -65) {
                                            }
                                        }
                                    }
                                } else if (i4 < 3) {
                                    D = v(j9, bArr, r11, i4);
                                } else {
                                    i14 -= 4;
                                    j3 = j9 + j;
                                    bE2 = hft0.e(bArr, j9);
                                    if (bE2 <= -65) {
                                        if ((((bE2 + 112) + (r11 << 28)) >> 30) == 0) {
                                            j4 = j9 + 2;
                                            if (hft0.e(bArr, j3) <= -65) {
                                                j9 += 3;
                                                if (hft0.e(bArr, j4) > -65) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (i14 == 0) {
                        D = z;
                    } else {
                        i4 = i14 - 1;
                        if (r11 < -32) {
                            if (i4 == 0) {
                                D = r11;
                            } else {
                                i14 -= 2;
                                if (r11 >= -62) {
                                    j2 = j9 + j;
                                    if (hft0.e(bArr, j9) > -65) {
                                        j9 = j2;
                                    }
                                }
                            }
                        } else if (r11 < -16) {
                            if (i4 < 2) {
                                D = v(j9, bArr, r11, i4);
                            } else {
                                i14 -= 3;
                                long j12 = j9 + j;
                                bE = hft0.e(bArr, j9);
                                if (bE > -65) {
                                }
                            }
                        } else if (i4 < 3) {
                            D = v(j9, bArr, r11, i4);
                        } else {
                            i14 -= 4;
                            j3 = j9 + j;
                            bE2 = hft0.e(bArr, j9);
                            if (bE2 <= -65) {
                                if ((((bE2 + 112) + (r11 << 28)) >> 30) == 0) {
                                    j4 = j9 + 2;
                                    if (hft0.e(bArr, j3) <= -65) {
                                        j9 += 3;
                                        if (hft0.e(bArr, j4) > -65) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (D == 0) {
                    return true;
                }
                return z;
        }
    }
}
