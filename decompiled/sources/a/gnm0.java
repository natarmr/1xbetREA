package a;

import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.huawei.hms.framework.common.BundleUtil;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.tournament_bracket.domain.model.CyberTournamentBracketMatchStatusModel;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gnm0 {
    public static int A(int i, int i2) {
        if (i2 < 0) {
            jf4.o("cannot store more than Integer.MAX_VALUE elements");
            return 0;
        }
        if (i2 <= i) {
            return i;
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i2) {
            iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public static final void a(mm40 mm40Var, fqj0 fqj0Var, fet fetVar, int i) {
        int i2;
        mm40Var.getClass();
        fqj0Var.getClass();
        fetVar.g0(-1795213081);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(fqj0Var) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(mm40Var, 80.0f), 32.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0Var));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xxh(mm40Var, fqj0Var, i, b);
        }
    }

    public static final void b(l7m0 l7m0Var, fet fetVar, int i) {
        int i2;
        l7m0Var.getClass();
        fetVar.g0(-1691594087);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object[] objArr = new Object[0];
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new f7f0(l7m0Var, (byte) 24);
                fetVar.o0(objP);
            }
            d(0, fetVar, ((Boolean) v3c.Y(objArr, (Function0) objP, fetVar).getValue()).booleanValue());
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xg10(l7m0Var, i, b);
        }
    }

    public static final void c(long j, fqj0 fqj0Var, fet fetVar, int i) {
        fetVar.g0(-920081276);
        int i2 = i | (fetVar.f(j) ? 4 : 2) | (fetVar.g(fqj0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), j, jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarQ, 8.0f, 18.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
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
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 70.0f), 16.0f);
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0Var));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(s5x0.N(jm40Var, 16.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f), 16.0f)), fqj0Var, fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yxh(j, fqj0Var, i, (byte) 9);
        }
    }

    public static final void d(int i, fet fetVar, boolean z) {
        int i2;
        fet fetVar2;
        boolean zC;
        fetVar.g0(-1050604501);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Window window = hxm0.p((View) fetVar.k(dy2.f)).getWindow();
            if (z) {
                fetVar.e0(-1131870730);
                fetVar.r(false);
                zC = true;
            } else {
                fetVar.e0(-313606080);
                zC = pkd.c(fetVar);
                fetVar.r(false);
            }
            boolean zI = fetVar.i(window) | fetVar.h(zC);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new yma(window, zC, b2);
                fetVar.o0(objP);
            }
            m0x0.D((Function0) objP, fetVar);
            boolean zI2 = fetVar.i(window) | fetVar.h(zC);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                objP2 = new yma(window, zC, b);
                fetVar.o0(objP2);
            }
            fetVar2 = fetVar;
            v3c.z((Function0) objP2, null, null, fetVar2, 0, 6);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fb50(b, i, z);
        }
    }

    public static final void e(a4x a4xVar, xcz xczVar, Function1 function1, fet fetVar, int i) {
        a4xVar.getClass();
        xczVar.getClass();
        function1.getClass();
        fetVar.g0(-43552808);
        int i2 = i | (fetVar.g(a4xVar) ? 4 : 2) | (fetVar.g(xczVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            boolean z = ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new a7j0(a4xVar, function1, (byte) 5);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarN, xczVar, null, null, null, null, false, null, (Function1) objP, fetVar, i2 & 112, 508);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new b7j0(a4xVar, xczVar, function1, i, (byte) 1);
        }
    }

    public static final void f(mm40 mm40Var, jjm jjmVar, fet fetVar, int i) {
        fetVar.g0(-1538489609);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(jjmVar) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            nkb.h(s5x0.L(mm40Var, 16.0f, 0.0f, 2), jjmVar, kjm.b, null, null, null, fetVar, (i2 & 112) | 384, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jfs0(mm40Var, jjmVar, i, b);
        }
    }

    public static final void g(mm40 mm40Var, tgt0 tgt0Var, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2;
        tgt0Var.getClass();
        fetVar.g0(-389341123);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(tgt0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = mm40Var;
            fetVar2 = fetVar;
            jcb.l(o2e.e0(s5x0.N(mm40Var2, 0.0f, 16.0f, 0.0f, 0.0f, 13), "DS_EMPTY_TAG"), tgt0Var.f33930a, true, null, fetVar2, 384, 8);
        } else {
            mm40Var2 = mm40Var;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new htr0(mm40Var2, tgt0Var, i, (byte) 24);
        }
    }

    public static final bbp0 h(o9p0 o9p0Var, obp0 obp0Var, g2v g2vVar, boolean z, long j, Function0 function0) {
        if (obp0Var == null && !z) {
            return new bbp0(new t8p0(ozb.Q(j, g2vVar)), (a4x) null, 6);
        }
        s8p0 s8p0Var = s8p0.f31814a;
        if (obp0Var != null || o9p0Var != null) {
            if (obp0Var != null) {
                i = j == 1 ? 1 : 0;
                Object obj = obp0Var.f24993a;
                e0g0 e0g0Var = j0g0.b;
                if (obj instanceof g0g0) {
                    Boolean boolValueOf = Boolean.valueOf(obp0Var.b instanceof g0g0);
                    if (i == 0) {
                        boolValueOf = null;
                    }
                    if (boolValueOf != null ? boolValueOf.booleanValue() : true) {
                        return new bbp0(new t8p0(ozb.Q(j, g2vVar)), (a4x) null, 6);
                    }
                }
            }
            a4x a4xVar = (a4x) function0.invoke();
            return a4xVar.isEmpty() ? new bbp0(new t8p0(ozb.P(j, g2vVar)), (a4x) null, 6) : new bbp0(s8p0Var, a4xVar, 4);
        }
        lc00 lc00VarB = kotlin.collections.a.b();
        lc00VarB.add(knm0.n("LINEUP_HEADER_SHIMMER_KEY"));
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            arrayList.add(new n9p0("LINEUP_SHIMMER_KEY", ehh.f7809a));
        }
        lc00VarB.addAll(arrayList);
        lc00VarB.add(knm0.n("TRANSFERS_HEADER_SHIMMER_KEY"));
        ArrayList arrayList2 = new ArrayList(3);
        for (int i2 = 0; i2 < 3; i2++) {
            arrayList2.add(new rbp0(twn.m(i2, "TRANSFERS_SHIMMER_KEY"), cdm.f4167a));
        }
        lc00VarB.addAll(arrayList2);
        lc00VarB.add(knm0.n("ACHIEVEMENTS_HEADER_SHIMMER_KEY"));
        ArrayList arrayList3 = new ArrayList(3);
        for (int i3 = 0; i3 < 3; i3++) {
            arrayList3.add(new q7p0(twn.m(i3, "ACHIEVEMENTS_SHIMMER_KEY"), i0g.f13946a));
        }
        lc00VarB.addAll(arrayList3);
        lc00VarB.add(knm0.n("RATING_TABLE_HEADER_SHIMMER_KEY"));
        lc00VarB.add(new x9p0("RATING_TABLE_SHIMMER_KEY", kam.f17971a));
        lc00VarB.add(knm0.n("TEAM_CARD_HEADER_SHIMMER_KEY"));
        lc00VarB.add(new nbp0("TEAM_CARD_SHIMMER_KEY", ahh.f875a));
        return new bbp0((u8p0) s8p0Var, dyb.o0(kotlin.collections.a.a(lc00VarB)), true);
    }

    public static void i(androidx.fragment.app.e eVar) {
        List listP;
        if (eVar == null || (listP = eVar.c.p()) == null) {
            return;
        }
        ArrayList<Fragment> arrayList = new ArrayList();
        for (Object obj : listP) {
            if (Intrinsics.d(((Fragment) obj).B, "mvu0")) {
                arrayList.add(obj);
            }
        }
        for (Fragment fragment : arrayList) {
            mvu0 mvu0Var = fragment instanceof mvu0 ? (mvu0) fragment : null;
            if (mvu0Var != null) {
                mvu0Var.y0();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b A[RETURN] */
    public static final bv9 j(bv9 bv9Var, dre0 dre0Var, List list, boolean z) {
        list.getClass();
        List parameters = dre0Var.getParameters();
        if (parameters == null || !parameters.isEmpty()) {
            Iterator it = parameters.iterator();
            while (it.hasNext()) {
                if (xtt0.i(((hre0) it.next()).p())) {
                }
            }
            if (!xtt0.i(dre0Var.getReturnType())) {
                return bv9Var;
            }
        } else if (!xtt0.i(dre0Var.getReturnType())) {
            return bv9Var;
        }
        return new j2u0(bv9Var, dre0Var, list, z);
    }

    public static final String k(kka kkaVar) {
        if (kkaVar.l == uoy.LIVE) {
            v5h0 v5h0Var = kkaVar.m;
            String str = v5h0Var != null ? v5h0Var.b : null;
            return str == null ? "" : str;
        }
        rdj rdjVar = rdj.f30294a;
        return rdj.g(new ynq0(((long) kkaVar.c) * 1000), efj.UNIVERSAL, Boolean.TRUE, false, 56);
    }

    public static final Method l(Class cls, dre0 dre0Var) {
        dre0Var.getClass();
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            declaredMethod.getClass();
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            c99.u("No unbox method found in inline class: ", cls, " (calling ", dre0Var);
            return null;
        }
    }

    public static final b9a0 m(String str, List list) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((b9a0) next).f2199a.equals(str));
        b9a0 b9a0Var = (b9a0) next;
        return b9a0Var == null ? b9a0.g : b9a0Var;
    }

    public static final String n(double d, double d2, String str) {
        double d3 = d2 * d;
        pn40 pn40Var = pn40.f27267a;
        return pn40.d(d3, str, p3u0.c);
    }

    public static final boolean o(kiy kiyVar) {
        if (kiyVar.h()) {
            return false;
        }
        fhy fhyVarO = kiyVar.o();
        sgy sgyVar = fhyVarO instanceof sgy ? (sgy) fhyVarO : null;
        Class clsI = sgyVar != null ? azw.I(sgyVar) : null;
        return (clsI == null || clsI.equals(Void.TYPE)) ? false : true;
    }

    public static final boolean p(ire0 ire0Var) {
        qpy qpyVarX;
        List listA = ire0Var.a();
        if (listA == null || !listA.isEmpty()) {
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                if (((hre0) it.next()).n() != aiy.f949a) {
                    return false;
                }
            }
        }
        String name = ire0Var.getName();
        ihy ihyVarK = ire0Var.K();
        String str = null;
        xgy xgyVar = ihyVarK instanceof xgy ? (xgy) ihyVarK : null;
        if (xgyVar != null && (qpyVarX = xgyVar.X()) != null) {
            str = qpyVarX.m;
        }
        return Intrinsics.d(name, str);
    }

    public static final String q(ctf0 ctf0Var, sba0 sba0Var, huo0 huo0Var, suo0 suo0Var) {
        ctf0Var.getClass();
        sba0 sba0Var2 = sba0.GAMING;
        if (sba0Var == sba0Var2 && (huo0Var instanceof wdt) && (suo0Var instanceof puo0)) {
            wdt wdtVar = (wdt) huo0Var;
            wqd wqdVar = wdtVar.f38989a;
            String str = wdtVar.b.b;
            pn40 pn40Var = pn40.f27267a;
            puo0 puo0Var = (puo0) suo0Var;
            return ctf0Var.b.a(R.string.daily_task_description_sum, Arrays.copyOf(new Object[]{str, "\u200e".concat(pn40.i(wqdVar.e, 2)), wqdVar.b, "\u200e".concat(pn40.i(puo0Var.f27627a, 0)), puo0Var.b.b, puo0Var.c.b}, 6));
        }
        if (sba0Var == sba0Var2 && (huo0Var instanceof ydt) && (suo0Var instanceof puo0)) {
            ydt ydtVar = (ydt) huo0Var;
            pn40 pn40Var2 = pn40.f27267a;
            puo0 puo0Var2 = (puo0) suo0Var;
            return ctf0Var.b.a(R.string.daily_task_description_bets, Arrays.copyOf(new Object[]{pn40.i(ydtVar.f42456a.e, 0), ydtVar.b.b, "\u200e".concat(pn40.i(puo0Var2.f27627a, 0)), puo0Var2.b.b, puo0Var2.c.b}, 5));
        }
        if (sba0Var == sba0Var2 && (huo0Var instanceof xdt) && (suo0Var instanceof puo0)) {
            xdt xdtVar = (xdt) huo0Var;
            wqd wqdVar2 = xdtVar.f40712a;
            String str2 = xdtVar.b.b;
            pn40 pn40Var3 = pn40.f27267a;
            puo0 puo0Var3 = (puo0) suo0Var;
            return ctf0Var.b.a(R.string.daily_task_description_2, Arrays.copyOf(new Object[]{str2, "\u200e".concat(pn40.i(wqdVar2.e, 2)), wqdVar2.b, "\u200e".concat(pn40.i(puo0Var3.f27627a, 0)), puo0Var3.b.b, puo0Var3.c.b}, 6));
        }
        if (sba0Var != sba0Var2 || !(huo0Var instanceof zdt) || !(suo0Var instanceof puo0)) {
            return ctf0Var.b.a(R.string.empty_str, Arrays.copyOf(new Object[0], 0));
        }
        zdt zdtVar = (zdt) huo0Var;
        pn40 pn40Var4 = pn40.f27267a;
        puo0 puo0Var4 = (puo0) suo0Var;
        return ctf0Var.b.a(R.string.daily_task_description_4, Arrays.copyOf(new Object[]{pn40.i(zdtVar.f44224a.e, 0), zdtVar.b.b, "\u200e".concat(pn40.i(puo0Var4.f27627a, 0)), puo0Var4.b.b, puo0Var4.c.b}, 5));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    public static final ays0 r(ays0 ays0Var, g93 g93Var) {
        ays0 ays0VarB;
        ays0Var.getClass();
        if (k93.a(ays0Var) == g93Var) {
            return ays0Var;
        }
        j93 j93Var = (j93) k93.b.n(k93.f17898a[0], ays0Var);
        if (j93Var != null) {
            if (ays0Var.isEmpty()) {
                ays0VarB = ays0Var;
            } else {
                fx3 fx3Var = ays0Var.f1685a;
                ArrayList arrayList = new ArrayList();
                for (Object obj : fx3Var) {
                    if (!Intrinsics.d((j93) obj, j93Var)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() == ays0Var.f1685a.b()) {
                    ays0VarB = ays0Var;
                } else {
                    ays0.b.getClass();
                    ays0VarB = fck0.b(arrayList);
                }
            }
            if (ays0VarB != null) {
                ays0Var = ays0VarB;
            }
        }
        if (g93Var.iterator().hasNext() || !g93Var.isEmpty()) {
            j93 j93Var2 = new j93(g93Var);
            fck0 fck0Var = ays0.b;
            sgy sgyVarB = sre0.f32672a.b(j93.class);
            fck0Var.getClass();
            String strV = sgyVarB.v();
            strV.getClass();
            if (ays0Var.f1685a.get(fck0Var.d(strV)) == null) {
                return ays0Var.isEmpty() ? new ays0(kotlin.collections.a.c(j93Var2)) : fck0.b(CollectionsKt.r0(CollectionsKt.L0(ays0Var), j93Var2));
            }
        }
        return ays0Var;
    }

    public static void s(androidx.fragment.app.e eVar) {
        if (eVar == null) {
            return;
        }
        Fragment fragmentJ = eVar.J("mvu0");
        mvu0 mvu0Var = fragmentJ instanceof mvu0 ? (mvu0) fragmentJ : null;
        if (mvu0Var != null) {
            mvu0Var.y0();
        }
        mvu0 mvu0Var2 = new mvu0();
        mvu0Var2.v0();
        sj3.E0(mvu0Var2, eVar, "mvu0");
    }

    public static final cxr0 t(mkh mkhVar, String str, mkh mkhVar2, boolean z, ctf0 ctf0Var) {
        zwr0 zwr0Var;
        String str2 = mkhVar.b;
        String str3 = mkhVar2.b;
        boolean z2 = str != null && str2.equals(str);
        if (z && z2) {
            zwr0Var = zwr0.f45122a;
        } else {
            zwr0Var = z2 ? zwr0.b : zwr0.c;
        }
        zwr0 zwr0Var2 = zwr0Var;
        int i = mkhVar.d;
        if (str2.length() == 0 && str3.length() == 0) {
            return axr0.f1636a;
        }
        long j = mkhVar.f21943a;
        String strA = (str2.length() != 0 || str3.length() <= 0) ? str2 : ctf0Var.b.a(R.string.cyber_tbd, Arrays.copyOf(new Object[0], 0));
        String strValueOf = (i == -1 || (str2.length() == 0 && str3.length() > 0)) ? "" : String.valueOf(i);
        boolean z3 = mkhVar.e;
        long jM130getWhite600d7_KjU = ((z3 || mkhVar2.e) && !z3) ? StaticColors.INSTANCE.m130getWhite600d7_KjU() : StaticColors.INSTANCE.m123getWhite0d7_KjU();
        return new bxr0(new dxr0(j, zwr0Var2, strA, strValueOf, jM130getWhite600d7_KjU, mkhVar.c));
    }

    public static final ays0 u(g93 g93Var) {
        g93Var.getClass();
        if (g93Var.isEmpty()) {
            ays0.b.getClass();
            return ays0.c;
        }
        fck0 fck0Var = ays0.b;
        List listC = kotlin.collections.a.c(new j93(g93Var));
        fck0Var.getClass();
        return fck0.b(listC);
    }

    public static final Class v(kiy kiyVar) {
        fhy fhyVarO = kiyVar != null ? kiyVar.o() : null;
        sgy sgyVar = fhyVarO instanceof sgy ? (sgy) fhyVarO : null;
        if (sgyVar != null && sgyVar.I()) {
            if (!xtt0.k(kiyVar)) {
                return azw.G(sgyVar);
            }
            kiy kiyVarS = xtt0.s(kiyVar);
            if (kiyVarS != null && !xtt0.k(kiyVarS) && !o(kiyVarS)) {
                return azw.G(sgyVar);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0253  */
    /* JADX WARN: Code duplicated, block: B:141:0x025d  */
    /* JADX WARN: Code duplicated, block: B:143:0x0262  */
    /* JADX WARN: Code duplicated, block: B:149:0x027a  */
    /* JADX WARN: Code duplicated, block: B:152:0x0282  */
    /* JADX WARN: Code duplicated, block: B:153:0x0287  */
    /* JADX WARN: Code duplicated, block: B:155:0x028b  */
    /* JADX WARN: Code duplicated, block: B:157:0x0290  */
    /* JADX WARN: Code duplicated, block: B:159:0x0295  */
    /* JADX WARN: Code duplicated, block: B:160:0x029a  */
    /* JADX WARN: Code duplicated, block: B:162:0x029e  */
    /* JADX WARN: Code duplicated, block: B:163:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:166:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:167:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:170:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:173:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:327:0x062d  */
    /* JADX WARN: Code duplicated, block: B:330:0x0637  */
    /* JADX WARN: Code duplicated, block: B:331:0x063a  */
    /* JADX WARN: Code duplicated, block: B:337:0x065a  */
    /* JADX WARN: Code duplicated, block: B:340:0x0662  */
    /* JADX WARN: Code duplicated, block: B:341:0x0667  */
    /* JADX WARN: Code duplicated, block: B:343:0x066b  */
    /* JADX WARN: Code duplicated, block: B:345:0x0670  */
    /* JADX WARN: Code duplicated, block: B:347:0x0675  */
    /* JADX WARN: Code duplicated, block: B:348:0x067a  */
    /* JADX WARN: Code duplicated, block: B:350:0x067e  */
    /* JADX WARN: Code duplicated, block: B:351:0x0681  */
    /* JADX WARN: Code duplicated, block: B:354:0x0687  */
    /* JADX WARN: Code duplicated, block: B:355:0x068a  */
    /* JADX WARN: Code duplicated, block: B:358:0x0693  */
    /* JADX WARN: Code duplicated, block: B:360:0x0699  */
    /* JADX WARN: Code duplicated, block: B:361:0x069c  */
    public static final utn0 w(kka kkaVar, boolean z, double d, String str, String str2, String str3, String str4, boolean z2, boolean z3) {
        String string;
        int i;
        double d2;
        String string2;
        int i2;
        wvs wvsVar;
        String str5;
        String str6;
        String str7;
        boolean z4;
        long j;
        l7n l7nVar;
        boolean z5;
        l7n l7nVar2;
        int i3;
        String str8;
        String str9;
        List list;
        List list2;
        g280 g280Var;
        String str10;
        List list3;
        g280 g280Var2;
        List list4;
        g280 g280Var3;
        String str11;
        List list5;
        int i4;
        wvs wvsVar2;
        String str12;
        String str13;
        String str14;
        boolean z6;
        long j2;
        l7n l7nVar3;
        boolean z7;
        l7n l7nVar4;
        int i5;
        List list6;
        List list7;
        g280 g280Var4;
        List list8;
        g280 g280Var5;
        List list9;
        g280 g280Var6;
        giz gizVar = kkaVar.g;
        uil0 uil0Var = kkaVar.e;
        teo teoVar = kkaVar.j;
        e3n0 e3n0Var = kkaVar.f;
        bnq0 bnq0Var = kkaVar.n;
        String str15 = kkaVar.o;
        cs0.x(str, str2, str3, str4);
        v5h0 v5h0Var = kkaVar.m;
        if (z2) {
            int i6 = e3n0Var.f7146a;
            Double d3 = teoVar.f;
            double d4 = teoVar.e;
            String str16 = teoVar.g;
            int i7 = uil0Var.f35737a;
            String str17 = uil0Var.b;
            String str18 = gizVar.b;
            wfp0 wfp0Var = kkaVar.h;
            List list10 = wfp0Var.c;
            wfp0 wfp0Var2 = kkaVar.i;
            if (wfp0Var2 == null) {
                str11 = str15;
                wvsVar2 = wvs.c;
                list5 = list10;
                i4 = 1;
            } else {
                str11 = str15;
                int size = list10.size();
                list5 = list10;
                i4 = 1;
                wvsVar2 = (size <= 1 || wfp0Var2.c.size() <= 1) ? wvs.b : wvs.f39854a;
            }
            int iOrdinal = wvsVar2.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != i4) {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                    int i8 = kkaVar.f18426a;
                    String strN = n(d4, d, str);
                    String strB = p7x.B(i7, z, i6);
                    kwn0 kwn0Var = new kwn0((bnq0Var != null ? bnq0Var.b : null) == l7n.b ? R.string.passed : R.string.crystal_time_before_game, bnq0Var != null ? bnq0Var.f2897a : 0L, bnq0Var != null ? bnq0Var.b : l7n.b, y(bnq0Var), (bnq0Var == null || bnq0Var.f2897a == 0) ? false : true, bnq0Var != null ? bnq0Var.c : false);
                    String str19 = wfp0Var.f39083a;
                    String strK = k(kkaVar);
                    strK.getClass();
                    fzc.f10401a.getClass();
                    return new mwn0(i8, str18, str17, str19, str2, str3, str11, str4, str16, strN, strB, kwn0Var, strK, kj5.i(d4, d3));
                }
                String str20 = str11;
                int i9 = kkaVar.f18426a;
                String str21 = ujn.h;
                g280 g280Var7 = (g280) CollectionsKt.firstOrNull(list5);
                String str22 = g280Var7 != null ? g280Var7.c : null;
                if (str22 == null) {
                    str22 = "";
                }
                String strN2 = ohs0.n(str21, str22);
                String str23 = ujn.h;
                String str24 = (wfp0Var2 == null || (list9 = wfp0Var2.c) == null || (g280Var6 = (g280) CollectionsKt.firstOrNull(list9)) == null) ? null : g280Var6.c;
                if (str24 == null) {
                    str24 = "";
                }
                String strN3 = ohs0.n(str23, str24);
                g280 g280Var8 = (g280) CollectionsKt.firstOrNull(list5);
                String str25 = g280Var8 != null ? g280Var8.b : "";
                String str26 = (wfp0Var2 == null || (list8 = wfp0Var2.c) == null || (g280Var5 = (g280) CollectionsKt.firstOrNull(list8)) == null) ? "" : g280Var5.b;
                String strN4 = n(d4, d, str);
                String strB2 = p7x.B(i7, z, i6);
                twn0 twn0Var = new twn0((bnq0Var != null ? bnq0Var.b : null) == l7n.b ? R.string.passed : R.string.crystal_time_before_game, bnq0Var != null ? bnq0Var.f2897a : 0L, bnq0Var != null ? bnq0Var.b : l7n.b, y(bnq0Var), (bnq0Var == null || bnq0Var.f2897a == 0) ? false : true, bnq0Var != null ? bnq0Var.c : false);
                String strK2 = k(kkaVar);
                strK2.getClass();
                str8 = v5h0Var != null ? v5h0Var.f36826a : null;
                str10 = str8 != null ? str8 : "";
                fzc.f10401a.getClass();
                return new vwn0(i9, str18, str17, strN2, strN3, str25, str26, str2, str3, str20, str4, str16, strN4, twn0Var, strK2, str10, strB2, kj5.i(d4, d3), z3);
            }
            int i10 = i4;
            String str27 = str11;
            int i11 = kkaVar.f18426a;
            String str28 = ujn.h;
            g280 g280Var9 = (g280) CollectionsKt.firstOrNull(list5);
            String str29 = g280Var9 != null ? g280Var9.c : null;
            if (str29 == null) {
                str29 = "";
            }
            String strN5 = ohs0.n(str28, str29);
            String str30 = ujn.h;
            String str31 = (wfp0Var2 == null || (list7 = wfp0Var2.c) == null || (g280Var4 = (g280) CollectionsKt.firstOrNull(list7)) == null) ? null : g280Var4.c;
            if (str31 == null) {
                str31 = "";
            }
            String strN6 = ohs0.n(str30, str31);
            String str32 = ujn.h;
            g280 g280Var10 = (g280) CollectionsKt.W(i10, list5);
            String str33 = g280Var10 != null ? g280Var10.c : null;
            if (str33 == null) {
                str33 = "";
            }
            String strN7 = ohs0.n(str32, str33);
            String str34 = ujn.h;
            if (wfp0Var2 != null && (list6 = wfp0Var2.c) != null) {
                str12 = strN7;
                g280 g280Var11 = (g280) CollectionsKt.W(1, list6);
                if (g280Var11 != null) {
                    str13 = g280Var11.c;
                }
                if (str13 == null) {
                    str13 = "";
                }
                String strN8 = ohs0.n(str34, str13);
                String str35 = wfp0Var.f39083a;
                if (wfp0Var2 != null) {
                    str14 = wfp0Var2.f39083a;
                } else {
                    str14 = "";
                }
                String strN9 = n(d4, d, str);
                String strB3 = p7x.B(i7, z, i6);
                if (bnq0Var != null || bnq0Var.f2897a == 0) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                unq0 unq0VarY = y(bnq0Var);
                if (bnq0Var != null) {
                    j2 = bnq0Var.f2897a;
                } else {
                    j2 = 0;
                }
                if (bnq0Var != null) {
                    l7nVar3 = bnq0Var.b;
                } else {
                    l7nVar3 = l7n.b;
                }
                l7n l7nVar5 = l7nVar3;
                if (bnq0Var != null) {
                    z7 = bnq0Var.c;
                } else {
                    z7 = false;
                }
                if (bnq0Var != null) {
                    l7nVar4 = bnq0Var.b;
                } else {
                    l7nVar4 = null;
                }
                if (l7nVar4 == l7n.b) {
                    i5 = R.string.passed;
                } else {
                    i5 = R.string.crystal_time_before_game;
                }
                ewn0 ewn0Var = new ewn0(i5, j2, l7nVar5, unq0VarY, z6, z7);
                String strK3 = k(kkaVar);
                strK3.getClass();
                str8 = v5h0Var != null ? v5h0Var.f36826a : null;
                str10 = str8 != null ? str8 : "";
                fzc.f10401a.getClass();
                return new gwn0(i11, str18, str17, strN5, str12, strN6, strN8, str35, str14, str2, str3, str27, str4, str16, strN9, strB3, ewn0Var, strK3, str10, kj5.i(d4, d3), z3);
            }
            str12 = strN7;
            str13 = null;
            if (str13 == null) {
                str13 = "";
            }
            String strN10 = ohs0.n(str34, str13);
            String str36 = wfp0Var.f39083a;
            if (wfp0Var2 != null) {
                str14 = wfp0Var2.f39083a;
            } else {
                str14 = "";
            }
            String strN11 = n(d4, d, str);
            String strB4 = p7x.B(i7, z, i6);
            if (bnq0Var != null) {
                z6 = false;
            } else {
                z6 = false;
            }
            unq0 unq0VarY2 = y(bnq0Var);
            if (bnq0Var != null) {
                j2 = bnq0Var.f2897a;
            } else {
                j2 = 0;
            }
            if (bnq0Var != null) {
                l7nVar3 = bnq0Var.b;
            } else {
                l7nVar3 = l7n.b;
            }
            l7n l7nVar6 = l7nVar3;
            if (bnq0Var != null) {
                z7 = bnq0Var.c;
            } else {
                z7 = false;
            }
            if (bnq0Var != null) {
                l7nVar4 = bnq0Var.b;
            } else {
                l7nVar4 = null;
            }
            if (l7nVar4 == l7n.b) {
                i5 = R.string.passed;
            } else {
                i5 = R.string.crystal_time_before_game;
            }
            ewn0 ewn0Var2 = new ewn0(i5, j2, l7nVar6, unq0VarY2, z6, z7);
            String strK4 = k(kkaVar);
            strK4.getClass();
            if (v5h0Var != null) {
            }
            if (str8 != null) {
            }
            fzc.f10401a.getClass();
            return new gwn0(i11, str18, str17, strN5, str12, strN6, strN10, str36, str14, str2, str3, str27, str4, str16, strN11, strB4, ewn0Var2, strK4, str10, kj5.i(d4, d3), z3);
        }
        String str37 = uil0Var.b;
        int i12 = uil0Var.f35737a;
        Double d5 = teoVar.f;
        double d6 = teoVar.e;
        String str38 = teoVar.g;
        String str39 = gizVar.b;
        wfp0 wfp0Var3 = kkaVar.h;
        List list11 = wfp0Var3.c;
        wfp0 wfp0Var4 = kkaVar.i;
        int i13 = e3n0Var.f7146a;
        boolean z8 = ((long) i12) == 40;
        if (z8) {
            bzu bzuVar = new bzu((byte) 23);
            bzuVar.g("static");
            bzuVar.g("svg");
            bzuVar.g("sports_v3");
            bzuVar.g("colored3d");
            bzuVar.g("40.svg");
            string = ((StringBuilder) bzuVar.b).toString();
        } else {
            string = "";
        }
        String str40 = string;
        if (z8) {
            long j3 = i12;
            d2 = d6;
            long j4 = i13;
            if (j3 != 0) {
                i = i13;
                bzu bzuVar2 = new bzu((byte) 23);
                bzuVar2.g("static");
                bzuVar2.g("img");
                bzuVar2.g("ImgDefault");
                bzuVar2.g("swipex");
                bzuVar2.g("colored3d");
                bzuVar2.g("svg");
                bzuVar2.g(j3 + BundleUtil.UNDERLINE_TAG + j4 + ".svg");
                string2 = ((StringBuilder) bzuVar2.b).toString();
            } else {
                i = i13;
                string2 = "";
            }
        } else {
            i = i13;
            d2 = d6;
            long j5 = i12;
            if (j5 != 0) {
                bzu bzuVar3 = new bzu((byte) 23);
                bzuVar3.g("static");
                bzuVar3.g("img");
                bzuVar3.g("ImgDefault");
                bzuVar3.g("swipex");
                bzuVar3.g("colored3d");
                bzuVar3.g("svg");
                bzuVar3.g(j5 + ".svg");
                string2 = ((StringBuilder) bzuVar3.b).toString();
            } else {
                string2 = "";
            }
        }
        String str41 = string2;
        if (wfp0Var4 == null) {
            wvsVar = wvs.c;
            i2 = 1;
        } else {
            i2 = 1;
            wvsVar = (list11.size() <= 1 || wfp0Var4.c.size() <= 1) ? wvs.b : wvs.f39854a;
        }
        int iOrdinal2 = wvsVar.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 != i2) {
                if (iOrdinal2 != 2) {
                    t9f.b();
                    return null;
                }
                int i14 = kkaVar.f18426a;
                double d7 = d2;
                String strN12 = n(d7, d, str);
                String strB5 = p7x.B(i12, z, i);
                ftn0 ftn0Var = new ftn0((bnq0Var != null ? bnq0Var.b : null) == l7n.b ? R.string.passed : R.string.crystal_time_before_game, bnq0Var != null ? bnq0Var.f2897a : 0L, bnq0Var != null ? bnq0Var.b : l7n.b, y(bnq0Var), (bnq0Var == null || bnq0Var.f2897a == 0) ? false : true, bnq0Var != null ? bnq0Var.c : false);
                String str42 = wfp0Var3.f39083a;
                fzc.f10401a.getClass();
                return new htn0(i14, str39, str37, str41, str40, str42, str2, str3, str4, str15, str38, strN12, strB5, ftn0Var, kj5.i(d7, d5));
            }
            int i15 = i;
            double d8 = d2;
            int i16 = kkaVar.f18426a;
            String str43 = ujn.h;
            g280 g280Var12 = (g280) CollectionsKt.firstOrNull(list11);
            String str44 = g280Var12 != null ? g280Var12.c : null;
            if (str44 == null) {
                str44 = "";
            }
            String strN13 = ohs0.n(str43, str44);
            String str45 = ujn.h;
            String str46 = (wfp0Var4 == null || (list4 = wfp0Var4.c) == null || (g280Var3 = (g280) CollectionsKt.firstOrNull(list4)) == null) ? null : g280Var3.c;
            if (str46 == null) {
                str46 = "";
            }
            String strN14 = ohs0.n(str45, str46);
            g280 g280Var13 = (g280) CollectionsKt.firstOrNull(list11);
            String str47 = g280Var13 != null ? g280Var13.b : "";
            String str48 = (wfp0Var4 == null || (list3 = wfp0Var4.c) == null || (g280Var2 = (g280) CollectionsKt.firstOrNull(list3)) == null) ? "" : g280Var2.b;
            String strN15 = n(d8, d, str);
            String str49 = str47;
            String strB6 = p7x.B(i12, z, i15);
            String strK5 = k(kkaVar);
            strK5.getClass();
            qtn0 qtn0Var = new qtn0((bnq0Var != null ? bnq0Var.b : null) == l7n.b ? R.string.passed : R.string.crystal_time_before_game, bnq0Var != null ? bnq0Var.f2897a : 0L, bnq0Var != null ? bnq0Var.b : l7n.b, y(bnq0Var), (bnq0Var == null || bnq0Var.f2897a == 0) ? false : true, bnq0Var != null ? bnq0Var.c : false);
            str8 = v5h0Var != 0 ? v5h0Var.f36826a : null;
            str10 = str8 != null ? str8 : "";
            fzc.f10401a.getClass();
            return new stn0(i16, str39, str37, str41, str40, strN13, strN14, str49, str48, str2, str3, str4, str15, str38, strN15, strK5, qtn0Var, str10, strB6, kj5.i(d8, d5), z3);
        }
        int i17 = i;
        double d9 = d2;
        int i18 = kkaVar.f18426a;
        String str50 = ujn.h;
        g280 g280Var14 = (g280) CollectionsKt.firstOrNull(list11);
        String str51 = g280Var14 != null ? g280Var14.c : null;
        if (str51 == null) {
            str51 = "";
        }
        String strN16 = ohs0.n(str50, str51);
        String str52 = ujn.h;
        String str53 = (wfp0Var4 == null || (list2 = wfp0Var4.c) == null || (g280Var = (g280) CollectionsKt.firstOrNull(list2)) == null) ? null : g280Var.c;
        if (str53 == null) {
            str53 = "";
        }
        String strN17 = ohs0.n(str52, str53);
        String str54 = ujn.h;
        g280 g280Var15 = (g280) CollectionsKt.W(1, list11);
        String str55 = g280Var15 != null ? g280Var15.c : null;
        if (str55 == null) {
            str55 = "";
        }
        String strN18 = ohs0.n(str54, str55);
        String str56 = ujn.h;
        if (wfp0Var4 != null && (list = wfp0Var4.c) != null) {
            str5 = strN18;
            g280 g280Var16 = (g280) CollectionsKt.W(1, list);
            if (g280Var16 != null) {
                str6 = g280Var16.c;
            }
            if (str6 == null) {
                str6 = "";
            }
            String strN19 = ohs0.n(str56, str6);
            String str57 = wfp0Var3.f39083a;
            if (wfp0Var4 != null) {
                str7 = wfp0Var4.f39083a;
            } else {
                str7 = "";
            }
            String strN20 = n(d9, d, str);
            String strB7 = p7x.B(i12, z, i17);
            String strK6 = k(kkaVar);
            strK6.getClass();
            if (bnq0Var != null || bnq0Var.f2897a == 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            unq0 unq0VarY3 = y(bnq0Var);
            if (bnq0Var != null) {
                j = bnq0Var.f2897a;
            } else {
                j = 0;
            }
            if (bnq0Var != null) {
                l7nVar = bnq0Var.b;
            } else {
                l7nVar = l7n.b;
            }
            l7n l7nVar7 = l7nVar;
            if (bnq0Var != null) {
                z5 = bnq0Var.c;
            } else {
                z5 = false;
            }
            if (bnq0Var != null) {
                l7nVar2 = bnq0Var.b;
            } else {
                l7nVar2 = null;
            }
            if (l7nVar2 == l7n.b) {
                i3 = R.string.passed;
            } else {
                i3 = R.string.crystal_time_before_game;
            }
            zsn0 zsn0Var = new zsn0(i3, j, l7nVar7, unq0VarY3, z4, z5);
            str8 = v5h0Var != null ? v5h0Var.f36826a : null;
            if (str8 == null) {
                str9 = "";
            } else {
                str9 = str8;
            }
            fzc.f10401a.getClass();
            return new btn0(i18, str39, str37, str41, str40, strN16, str5, strN17, strN19, str57, str7, str2, str3, str4, str15, str38, strN20, strB7, strK6, zsn0Var, str9, kj5.i(d9, d5), z3);
        }
        str5 = strN18;
        str6 = null;
        if (str6 == null) {
            str6 = "";
        }
        String strN110 = ohs0.n(str56, str6);
        String str58 = wfp0Var3.f39083a;
        if (wfp0Var4 != null) {
            str7 = wfp0Var4.f39083a;
        } else {
            str7 = "";
        }
        String strN21 = n(d9, d, str);
        String strB8 = p7x.B(i12, z, i17);
        String strK7 = k(kkaVar);
        strK7.getClass();
        if (bnq0Var != null) {
            z4 = false;
        } else {
            z4 = false;
        }
        unq0 unq0VarY4 = y(bnq0Var);
        if (bnq0Var != null) {
            j = bnq0Var.f2897a;
        } else {
            j = 0;
        }
        if (bnq0Var != null) {
            l7nVar = bnq0Var.b;
        } else {
            l7nVar = l7n.b;
        }
        l7n l7nVar8 = l7nVar;
        if (bnq0Var != null) {
            z5 = bnq0Var.c;
        } else {
            z5 = false;
        }
        if (bnq0Var != null) {
            l7nVar2 = bnq0Var.b;
        } else {
            l7nVar2 = null;
        }
        if (l7nVar2 == l7n.b) {
            i3 = R.string.passed;
        } else {
            i3 = R.string.crystal_time_before_game;
        }
        zsn0 zsn0Var2 = new zsn0(i3, j, l7nVar8, unq0VarY4, z4, z5);
        if (v5h0Var != null) {
        }
        if (str8 == null) {
            str9 = "";
        } else {
            str9 = str8;
        }
        fzc.f10401a.getClass();
        return new btn0(i18, str39, str37, str41, str40, strN16, str5, strN17, strN110, str58, str7, str2, str3, str4, str15, str38, strN21, strB8, strK7, zsn0Var2, str9, kj5.i(d9, d5), z3);
    }

    public static final lgq0 x(int i) {
        switch (i) {
            case 1:
                return lgq0.f20020a;
            case 2:
                return lgq0.b;
            case 3:
                return lgq0.c;
            case 4:
                return lgq0.d;
            case 5:
                return lgq0.e;
            case 6:
                return lgq0.f;
            default:
                jf4.k(null);
                return null;
        }
    }

    public static final unq0 y(bnq0 bnq0Var) {
        return (bnq0Var != null ? bnq0Var.b : null) == l7n.f19567a ? unq0.f35976a : unq0.c;
    }

    public static final exr0 z(zjh zjhVar, qlh qlhVar, boolean z, boolean z2, ctf0 ctf0Var) {
        String strF;
        String str = zjhVar.f44481a;
        ctf0Var.getClass();
        mkh mkhVar = zjhVar.d;
        mkh mkhVar2 = zjhVar.e;
        String str2 = mkhVar.b;
        String str3 = qlhVar.f28933a;
        String str4 = qlhVar.b;
        boolean z3 = str2.equals(str3) || mkhVar2.b.equals(str3);
        long j = zjhVar.j;
        if (j == -1 || j == 0) {
            strF = "";
        } else {
            rdj rdjVar = rdj.f30294a;
            strF = rdj.f(new znq0(j), sdj.UNIQUE_2, null, 60);
        }
        return new exr0(str, new ywr0(strF, zjhVar.h == CyberTournamentBracketMatchStatusModel.c ? ctf0Var.b.a(R.string.cyber_live, Arrays.copyOf(new Object[0], 0)) : "", z ? ctf0Var.b.a(R.string.cyber_final, Arrays.copyOf(new Object[0], 0)) : "", z2 ? ctf0Var.b.a(R.string.cyber_third_place, Arrays.copyOf(new Object[0], 0)) : ""), t(mkhVar, str3, mkhVar2, Intrinsics.d(str4, str), ctf0Var), t(mkhVar2, str3, mkhVar, Intrinsics.d(str4, str), ctf0Var), z3);
    }
}
