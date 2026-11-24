package a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlockModel;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public abstract class n7x {
    public static cz10 A(int i) {
        if (i == 1) {
            return hy10.c;
        }
        if (i == 18) {
            return ty10.c;
        }
        if (i == 47) {
            return ry10.c;
        }
        if (i == 68) {
            return my10.c;
        }
        if (i == 35) {
            return oy10.c;
        }
        if (i == 36) {
            return py10.c;
        }
        switch (i) {
            case 3:
                return ey10.c;
            case 4:
                return sy10.c;
            case 5:
                return jy10.c;
            case 6:
                return by10.c;
            case 7:
                return xy10.c;
            case 8:
                return yy10.c;
            case 9:
                return vy10.c;
            case 10:
                return ny10.c;
            case 11:
                return cy10.c;
            case 12:
                return bz10.c;
            case 13:
                return qy10.c;
            case 14:
                return uy10.c;
            default:
                switch (i) {
                    case 38:
                        return iy10.c;
                    case 39:
                        return az10.c;
                    case 40:
                        return wy10.c;
                    case 41:
                        return ly10.c;
                    case 42:
                        return gy10.c;
                    case 43:
                        return fy10.c;
                    case 44:
                        return dy10.c;
                    case 45:
                        return ky10.c;
                    default:
                        return zy10.c;
                }
        }
    }

    public static final gbn B(Function1 function1) {
        byte b = 27;
        return new gbn(new v1x((byte) 6), new pkv(3, b), new dht(function1, b), btv.x);
    }

    public static final long C(KeyEvent keyEvent) {
        return u7x.c(keyEvent.getKeyCode());
    }

    public static final wui0 D(int i, int i2, boolean z) {
        if (i2 == 0 && z) {
            return wui0.b;
        }
        if (i2 == 0) {
            return wui0.f39793a;
        }
        if (i == 0) {
            return wui0.b;
        }
        if (i == i2 && z) {
            return wui0.c;
        }
        return i == i2 ? wui0.d : wui0.c;
    }

    public static final a4x E(c260 c260Var, List list, mdm mdmVar, ctf0 ctf0Var) {
        oz50 oz50Var = c260Var.b;
        if (oz50Var == null) {
            return lak0.c;
        }
        int i = oz50Var.n ? 2 : 1;
        lc00 lc00VarB = kotlin.collections.a.b();
        if (mdmVar != null) {
            lc00VarB.add(new w360(mdmVar));
        }
        lc00VarB.add(new a460(new hjm(ctf0Var.b.a(R.string.recommend, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190), f460.f8899a));
        ArrayList arrayListQ = Q(list, oz50Var.l, ctf0Var, oz50Var.j, oz50Var.b, oz50Var.f26089a, oz50Var.k, oz50Var.m, oz50Var.p);
        ArrayList arrayList = new ArrayList(r3d.q(arrayListQ, 10));
        int i2 = 0;
        for (Object obj : arrayListQ) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            int i4 = i2 % i;
            arrayList.add(new mbo((a2n) obj, i4 == 0, i4 != 0));
            i2 = i3;
        }
        return cs0.f(lc00VarB, lc00VarB, arrayList);
    }

    public static final lc00 F(boolean z) {
        int i = z ? 2 : 1;
        lc00 lc00VarB = kotlin.collections.a.b();
        lc00VarB.add(N(f460.f8899a));
        ArrayList arrayList = new ArrayList(4);
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i2 % i;
            arrayList.add(new mbo(new x56(g0l0.f10465a, twn.m(i2, "recommended_shimmer")), i3 == 0, i3 != 0));
        }
        lc00VarB.addAll(arrayList);
        return kotlin.collections.a.a(lc00VarB);
    }

    public static final int G(vrz vrzVar) {
        if (vrzVar == fe7.BET_LIMIT_1_DAY || vrzVar == n7k.DEPOSIT_LIMIT_1_DAY) {
            return R.string.limits_daily_limit_title;
        }
        if (vrzVar == fe7.BET_LIMIT_7_DAY || vrzVar == n7k.DEPOSIT_LIMIT_7_DAY) {
            return R.string.limits_weekly_limit_title;
        }
        if (vrzVar == fe7.BET_LIMIT_30_DAY || vrzVar == n7k.DEPOSIT_LIMIT_30_DAY) {
            return R.string.limits_monthly_limit_title;
        }
        if (vrzVar == liq0.f20118a) {
            return R.string.limits_self_exclusion_desc;
        }
        if (vrzVar == zrz.b) {
            return R.string.empty_str;
        }
        t9f.b();
        return 0;
    }

    public static final int H(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final void I(v6z v6zVar) {
        vcc.Z(v6zVar).F();
    }

    public static final boolean J(String str) {
        str.getClass();
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '-') {
                return false;
            }
        }
        return true;
    }

    public static final edg0 K(vcg0 vcg0Var) {
        int iOrdinal = vcg0Var.ordinal();
        if (iOrdinal == 0) {
            pz40 pz40Var = s6t0.f31722a;
            return new edg0(s6t0.b().f33626a.getPrimary(), s6t0.b().f33626a.getBackgroundContent(), s6t0.b().f33626a.getPrimaryForeground(), s6t0.b().f33626a.getTextPrimary(), s6t0.b().f33626a.getPrimaryForeground80(), s6t0.b().f33626a.getSecondary());
        }
        if (iOrdinal == 1) {
            pz40 pz40Var2 = s6t0.f31722a;
            return new edg0(s6t0.b().f33626a.getPrimary(), s6t0.b().f33626a.getBackground(), s6t0.b().f33626a.getPrimaryForeground(), s6t0.b().f33626a.getTextPrimary(), s6t0.b().f33626a.getPrimaryForeground80(), s6t0.b().f33626a.getSecondary());
        }
        if (iOrdinal != 2) {
            t9f.b();
            return null;
        }
        pz40 pz40Var3 = s6t0.f31722a;
        StaticColors staticColors = StaticColors.INSTANCE;
        return new edg0(staticColors.m123getWhite0d7_KjU(), staticColors.m70getBlack200d7_KjU(), staticColors.m62getBlack0d7_KjU(), staticColors.m123getWhite0d7_KjU(), staticColors.m78getBlack800d7_KjU(), staticColors.m131getWhite800d7_KjU());
    }

    public static int L(q8b q8bVar, int i, int i2, int i3) {
        x0x.A(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        Math.addExact(Math.addExact(i4, i5), 1 << i3);
        if (q8bVar.b() < i) {
            return -1;
        }
        int iG = q8bVar.g(i);
        if (iG == i4) {
            if (q8bVar.b() < i2) {
                return -1;
            }
            int iG2 = q8bVar.g(i2);
            iG += iG2;
            if (iG2 == i5) {
                if (q8bVar.b() < i3) {
                    return -1;
                }
                return q8bVar.g(i3) + iG;
            }
        }
        return iG;
    }

    public static final String M(String str) {
        str.getClass();
        return kotlin.text.c.r(kotlin.text.c.r(kotlin.text.c.r(str, "\r", "", false), Separators.RETURN, "", false), Separators.DOUBLE_QUOTE, "", false);
    }

    public static final a460 N(j460 j460Var) {
        return new a460(new ijm(), j460Var);
    }

    public static void O(q8b q8bVar) {
        q8bVar.o(3);
        q8bVar.o(8);
        boolean zF = q8bVar.f();
        boolean zF2 = q8bVar.f();
        if (zF) {
            q8bVar.o(5);
        }
        if (zF2) {
            q8bVar.o(6);
        }
    }

    public static void P(q8b q8bVar) {
        int iG;
        int iG2 = q8bVar.g(2);
        if (iG2 == 0) {
            q8bVar.o(6);
            return;
        }
        int iL = L(q8bVar, 5, 8, 16) + 1;
        if (iG2 == 1) {
            q8bVar.o(iL * 7);
            return;
        }
        if (iG2 == 2) {
            boolean zF = q8bVar.f();
            int i = zF ? 1 : 5;
            int i2 = zF ? 7 : 5;
            int i3 = zF ? 8 : 6;
            int i4 = 0;
            while (i4 < iL) {
                if (q8bVar.f()) {
                    q8bVar.o(7);
                    iG = 0;
                } else {
                    if (q8bVar.g(2) == 3 && q8bVar.g(i2) * i != 0) {
                        q8bVar.n();
                    }
                    iG = q8bVar.g(i3) * i;
                    if (iG != 0 && iG != 180) {
                        q8bVar.n();
                    }
                    q8bVar.n();
                }
                if (iG != 0 && iG != 180 && q8bVar.f()) {
                    i4++;
                }
                i4++;
            }
        }
    }

    public static final ArrayList Q(List list, wcb wcbVar, ctf0 ctf0Var, boolean z, boolean z2, v5l0 v5l0Var, y78 y78Var, List list2, boolean z3) {
        Object next;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d0t d0tVar = (d0t) it.next();
            Iterator it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((lok0) next).f20396a != d0tVar.O);
            lok0 lok0Var = (lok0) next;
            String strA = wcbVar.a(d0tVar.v, d0tVar.u);
            ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Integer.valueOf(((lok0) it3.next()).f20396a));
            }
            boolean z4 = lok0Var != null ? lok0Var.n : false;
            boolean z5 = lok0Var != null ? lok0Var.p : false;
            m5l0 m5l0Var = d0tVar.K.isEmpty() ? i5l0.f14197a : l5l0.f19463a;
            String str = lok0Var != null ? lok0Var.u : null;
            if (str == null) {
                str = "";
            }
            arrayList.add(wwb.V(d0tVar, ctf0Var, y78Var, z, z2, strA, false, arrayList2, z4, z5, false, v5l0Var, m5l0Var, str, z3));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    /* JADX WARN: Code duplicated, block: B:12:0x001c A[RETURN] */
    public static final oxk0 R(String str) {
        for (oxk0 oxk0Var : oxk0.values()) {
            if (oxk0Var.b.equals(str)) {
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

    public static final void a(boolean z, ugd ugdVar, fet fetVar) {
        jwb.e(Boolean.valueOf(z), null, ro4.m0(0, 0, null, 7), "Crossfade", u1c.M(1713276527, new uis(ugdVar, (byte) 7), fetVar), fetVar, 27648, 2);
    }

    public static final void b(foa0 foa0Var, boolean z, boolean z2, fet fetVar, int i) {
        fetVar.g0(2043327886);
        byte b = 2;
        int i2 = i | (fetVar.g(foa0Var) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.h(z2) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, z2 ? 12.0f : 0.0f, 0.0f, z ? 36.0f : 0.0f, 5);
            fetVar.e0(-1003410150);
            fetVar.e0(212064437);
            fetVar.r(false);
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new bk30(w6kVar);
                fetVar.o0(objP);
            }
            bk30 bk30Var = (bk30) objP;
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = new g3e();
                fetVar.o0(objP2);
            }
            g3e g3eVar = (g3e) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP3);
            }
            pz40 pz40Var = (pz40) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                objP4 = new v3e(g3eVar);
                fetVar.o0(objP4);
            }
            v3e v3eVar = (v3e) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == obj) {
                objP5 = androidx.compose.runtime.e.d(Unit.f46060a, m2a.v);
                fetVar.o0(objP5);
            }
            pz40 pz40Var2 = (pz40) objP5;
            boolean zI = fetVar.i(bk30Var) | fetVar.e(257);
            Object objP6 = fetVar.P();
            if (zI || objP6 == obj) {
                objP6 = new a5n(pz40Var2, bk30Var, v3eVar, pz40Var, (byte) 2);
                fetVar.o0(objP6);
            }
            tj30 tj30Var = (tj30) objP6;
            Object objP7 = fetVar.P();
            if (objP7 == obj) {
                objP7 = new b5n(pz40Var, v3eVar, b);
                fetVar.o0(objP7);
            }
            Function0 function0 = (Function0) objP7;
            boolean zI2 = fetVar.i(bk30Var);
            Object objP8 = fetVar.P();
            if (zI2 || objP8 == obj) {
                objP8 = new c5n(bk30Var, b);
                fetVar.o0(objP8);
            }
            l7x.s(pai0.a(mm40VarN, false, (Function1) objP8), u1c.M(1200550679, new qxx(pz40Var2, g3eVar, function0, z, foa0Var), fetVar), tj30Var, fetVar, 48);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new uo1(foa0Var, z, z2, i, (byte) 2);
        }
    }

    public static final void c(mm40 mm40Var, ugd ugdVar, xdr xdrVar, xdr xdrVar2, ugd ugdVar2, ugd ugdVar3, fet fetVar, int i) {
        ugd ugdVar4;
        ugd ugdVar5;
        pfx pfxVarI;
        fetVar.g0(-1050865522);
        int i2 = i | (fetVar.i(xdrVar) ? 256 : 128) | (fetVar.i(xdrVar2) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            WeakHashMap weakHashMap = djv0.w;
            q33 q33Var = zcm0.i(fetVar).e;
            int i3 = q33Var.e().d;
            Integer numValueOf = Integer.valueOf(i3);
            Integer numValueOf2 = null;
            if (i3 == 0) {
                numValueOf = null;
            }
            if (numValueOf == null) {
                fetVar.e0(-317538066);
                View view = (View) fetVar.k(dy2.f);
                WeakHashMap weakHashMap2 = rgu0.f30456a;
                xiv0 xiv0VarA = jgu0.a(view);
                if (xiv0VarA != null && (pfxVarI = xiv0VarA.f40966a.i(2)) != null) {
                    numValueOf2 = Integer.valueOf(pfxVarI.d);
                }
                fetVar.r(false);
                numValueOf = numValueOf2;
            } else {
                fetVar.e0(-564438041);
                fetVar.r(false);
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
            boolean zE = fetVar.e(iIntValue);
            Object objP = fetVar.P();
            if (zE || objP == ukd.f35823a) {
                objP = new mq8(iIntValue, (byte) 7);
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
            jm40 jm40Var = jm40.b;
            ugdVar.F(mrv.k0(jm40Var, "MEDIA_ID"), fetVar, 54);
            if (xdrVar == null) {
                fetVar.e0(1890031143);
                fetVar.r(false);
            } else {
                fetVar.e0(-493220582);
                w6x.v(((i2 >> 3) & 112) | 6, xdrVar, mrv.k0(jm40Var, "COMPANY_LOGO_ID"), fetVar, false);
            }
            if (xdrVar2 == null) {
                fetVar.e0(1890109511);
                fetVar.r(false);
            } else {
                fetVar.e0(-493218054);
                w6x.v(((i2 >> 6) & 112) | 6, xdrVar2, mrv.k0(jm40Var, "PARTNER_LOGO_ID"), fetVar, false);
            }
            ugdVar4 = ugdVar2;
            ugdVar4.F(mrv.k0(jm40Var, "STEP_PROGRESS_BAR_ID"), fetVar, 54);
            mm40 mm40VarK0 = mrv.k0(jm40Var, "APP_VERSION_ID");
            ugdVar5 = ugdVar3;
            ugdVar5.F(mm40VarK0, fetVar, 54);
            fetVar.r(true);
        } else {
            ugdVar4 = ugdVar2;
            ugdVar5 = ugdVar3;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nq00(mm40Var, ugdVar, xdrVar, xdrVar2, ugdVar4, ugdVar5, i, (byte) 4);
        }
    }

    public static final void d(xcz xczVar, mr90 mr90Var, Function1 function1, fet fetVar, int i) {
        int i2;
        float fA;
        xczVar.getClass();
        mr90Var.getClass();
        function1.getClass();
        fetVar.g0(1006909589);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(xczVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(mr90Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            WeakHashMap weakHashMap = djv0.w;
            if (((Boolean) ((hgk0) zcm0.i(fetVar).c.d).getValue()).booleanValue()) {
                fetVar.e0(792213584);
                fetVar.r(false);
                zcl zclVar = qmk.f28987a;
                fA = 0.0f;
            } else {
                fetVar.e0(792250071);
                fA = i120.O(zcm0.i(fetVar).e, fetVar).a();
                fetVar.r(false);
            }
            a4x a4xVar = mr90Var.f22258a;
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new wi6(xczVar, null, (byte) 6);
                fetVar.o0(objP);
            }
            m0x0.t(fetVar, a4xVar, (Function2) objP);
            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, fA, 7);
            boolean zG = fetVar.g(a4xVar) | ((i2 & 7168) == 2048);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new or0(a4xVar, function1, (byte) 20);
                fetVar.o0(objP2);
            }
            b8k0.e(jm40Var, xczVar, lh80VarU, null, null, null, false, null, (Function1) objP2, fetVar, i2 & 126, Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new if00(xczVar, mr90Var, function1, i);
        }
    }

    public static final void e(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        float f;
        l7m0 l7m0Var2 = l7m0Var;
        Function1 function2 = function1;
        function2.getClass();
        l7m0Var2.getClass();
        fetVar.g0(-1849329780);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.i(function2) ? 32 : 16) | (fetVar.g(l7m0Var2) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            int iB = (int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() & 4294967295L);
            boolean zE = fetVar.e(iB) | fetVar.g(w6kVar);
            Object objP = fetVar.P();
            if (zE || objP == ukd.f35823a) {
                if (ycl.a(w6kVar.r0(iB), 640.0f) <= 0) {
                    zcl zclVar = qmk.f28987a;
                    f = 12.0f;
                } else {
                    zcl zclVar2 = qmk.f28987a;
                    f = 64.0f;
                }
                objP = twn.j(f, fetVar);
            }
            float f2 = ((ycl) objP).f42389a;
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar3 = qmk.f28987a;
            p7x.f(o7k0.e(mm40VarD, 56.0f), function2, fetVar, i2 & 112);
            mm40 mm40VarN = s5x0.N(jm40Var, 36.0f, f2, 36.0f, 0.0f, 8);
            ugd ugdVarM = u1c.M(-1755683510, new tft(l7m0Var2, (byte) 3), fetVar);
            byte b = 5;
            ugd ugdVarM2 = u1c.M(456732427, new tft(l7m0Var2, b), fetVar);
            ugd ugdVarM3 = u1c.M(-1625818932, new dqz(l7m0Var2, function2, b), fetVar);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            y5d y5dVar = y5d.f42040a;
            ugdVarM.F(y5dVar, fetVar, 54);
            ugdVarM2.F(y5dVar, fetVar, 54);
            ugdVarM3.F(y5dVar, fetVar, 54);
            fetVar.r(true);
            qxw.o(fetVar, y5dVar.b(jm40Var, true));
            l7m0Var2 = l7m0Var;
            function2 = function1;
            q5x.o(o050.S(s5x0.N(jm40Var, 36.0f, 0.0f, 36.0f, 32.0f, 2)), null, u1c.M(-1798792073, new s000(function2, l7m0Var2, (byte) 29), fetVar), u1c.M(413623864, new zs70(l7m0Var2, function2, (byte) 0), fetVar), u1c.M(-1668927495, new zs70(function2, l7m0Var2, (byte) 1), fetVar), fetVar, 28032);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kr0(mm40Var, function2, l7m0Var2, i, (byte) 26);
        }
    }

    public static final void f(int i, ugd ugdVar, ugd ugdVar2, fet fetVar, mm40 mm40Var, boolean z) {
        mm40 mm40Var2;
        fetVar.g0(-715771836);
        int i2 = i | 6 | (fetVar.h(z) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarD, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            ugdVar.invoke(fetVar, 6);
            yx7 yx7Var = gqw0.j;
            b34.e(y5d.f42040a, z, null, kzn.c(ro4.m0(0, 0, null, 7), yx7Var, 12), kzn.i(ro4.m0(0, 0, null, 7), yx7Var, 12), null, u1c.M(596401042, new uis(ugdVar2, (byte) 8), fetVar), fetVar, 1572870 | (i2 & 112), 18);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gka(mm40Var2, z, ugdVar, ugdVar2, i, (byte) 7);
        }
    }

    public static final void g(mm40 mm40Var, gra0 gra0Var, lh80 lh80Var, zcz zczVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        Boolean bool;
        zczVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(-1782889628);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(gra0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(lh80Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(zczVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function2) ? 131072 : 65536;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            xcz xczVarA = zczVar.a("POLYBET_CHAMP_LAZY_LIST_STATE", fetVar);
            wom womVarF = mom.f(fetVar);
            pz40 pz40VarF = androidx.compose.runtime.e.f(function1, fetVar);
            Boolean boolValueOf = Boolean.valueOf(gra0Var.d);
            boolean zG = ((i3 & 112) == 32) | fetVar.g(xczVarA) | fetVar.g(pz40VarF);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                bool = boolValueOf;
                fra0 fra0Var = new fra0((Object) gra0Var, (Object) xczVarA, (Object) pz40VarF, (yje) null, (byte) 0);
                fetVar.o0(fra0Var);
                objP = fra0Var;
            } else {
                bool = boolValueOf;
            }
            m0x0.t(fetVar, bool, (Function2) objP);
            boolean z = gra0Var.c;
            boolean z2 = (57344 & i3) == 16384;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new i0a0(function1, (byte) 26);
                fetVar.o0(objP2);
            }
            mom.c(mm40Var, z, womVarF, null, false, null, (Function0) objP2, null, u1c.M(1033864121, new qb(xczVarA, (Object) lh80Var, function2, (byte) 10), fetVar), fetVar, (i3 & 14) | 100663296, 184);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg0(mm40Var, (Object) gra0Var, (Object) lh80Var, (Object) zczVar, function1, function2, i, (byte) 26);
        }
    }

    public static final void h(mm40 mm40Var, y9q0 y9q0Var, d4d d4dVar, mzc0 mzc0Var, Function1 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        mzc0Var.getClass();
        String str = mzc0Var.e;
        fetVar2.g0(-86206847);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(y9q0Var) ? 32 : 16) | (fetVar2.g(mzc0Var) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
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
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            boolean zC = pkd.c(fetVar2);
            boolean zH = fetVar2.h(zC);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zH || objP == cl5Var) {
                objP = Integer.valueOf(zC ? R.drawable.news_catalog_placeholder_dark : R.drawable.news_catalog_placeholder);
                fetVar2.o0(objP);
            }
            int iIntValue = ((Number) objP).intValue();
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.e(hz3.f13888a);
                fetVar2.o0(objP2);
            }
            pz40 pz40Var = (pz40) objP2;
            Object objA = mzc0Var.d.a();
            boolean z2 = (i2 & 7168) == 2048;
            Object objP3 = fetVar2.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new zlb0(function1, mzc0Var, pz40Var, (byte) 7);
                fetVar2.o0(objP3);
            }
            pm80 pm80VarX = l7x.X(objA, (Function1) objP3, null, fetVar, 0, 26);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarO = ny9.O(2.7692308f, o7k0.d(s5x0.N(s5x0.L(jm40Var, 1.0f, 0.0f, 2), 0.0f, 1.0f, 0.0f, 0.0f, 13), 1.0f), false);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarO);
            if (((lz3) pz40Var.getValue()) instanceof kz3) {
                fetVar.e0(-1318023799);
            } else {
                fetVar.e0(-1317965767);
                pm80VarX = a8k0.F(iIntValue, 0, fetVar);
            }
            fetVar.r(false);
            j0x.b(pm80VarX, null, mm40VarE, null, gqw0.A, 0.0f, null, fetVar, 24632, 104);
            if (str.length() > 0) {
                fetVar.e0(-1317738723);
                j6n.h(str, new iro0(d4dVar), null, 1, 0, fetVar, 3072, 20);
                fetVar.r(false);
            } else {
                fetVar.e0(-1317461955);
                fetVar.r(false);
            }
            fetVar.r(true);
            qxw.o(fetVar, o7k0.e(jm40Var, 8.0f));
            mm40 mm40VarL = s5x0.L(o7k0.d(jm40Var, 1.0f), 8.0f, 0.0f, 2);
            String str2 = mzc0Var.b;
            zfn zfnVar = zaq0.b;
            v8q0.a(str2, mm40VarL, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0Var, fetVar, 0, ((i2 << 18) & 29360128) | 24960, 110584);
            mm40 mm40VarL2 = s5x0.L(ua80.d(jm40Var, 4.0f, fetVar, jm40Var, 1.0f), 8.0f, 0.0f, 2);
            String str3 = mzc0Var.c;
            long secondary = ((ThemeColors) fetVar.k(zfnVar)).getSecondary();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str3, mm40VarL2, secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            rz4.t(jm40Var, 4.0f, fetVar2, true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ajw((Object) mm40Var, (Object) y9q0Var, (Object) d4dVar, (Object) mzc0Var, function1, i, (byte) 21);
        }
    }

    public static final void i(mm40 mm40Var, o1e0 o1e0Var, Function1 function1, fet fetVar, int i) {
        float f;
        o1e0Var.getClass();
        function1.getClass();
        fetVar.g0(-1726059699);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(o1e0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            int i3 = ((Configuration) fetVar.k(dy2.f6873a)).screenWidthDp;
            boolean z = o1e0Var.f24475a.size() == 1;
            boolean zE = fetVar.e(i3);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zE || objP == cl5Var) {
                if (i3 <= 320) {
                    zcl zclVar = qmk.f28987a;
                    f = 320.0f;
                } else {
                    zcl zclVar2 = qmk.f28987a;
                    f = 344.0f;
                }
                objP = twn.j(f, fetVar);
            }
            float f2 = ((ycl) objP).f42389a;
            zcl zclVar3 = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            lh80 lh80VarT = s5x0.t(qmk.a(fetVar).c, 0.0f, 2);
            boolean zH = ((i2 & 112) == 32) | fetVar.h(z) | fetVar.d(f2) | ((i2 & 896) == 256);
            Object objP2 = fetVar.P();
            if (zH || objP2 == cl5Var) {
                objP2 = new xs8(o1e0Var, z, f2, function1);
                fetVar.o0(objP2);
            }
            b8k0.f(mm40Var, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP2, fetVar, 14 & i2, 490);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rwc0(mm40Var, o1e0Var, function1, i, (byte) 11);
        }
    }

    public static final void j(mm40 mm40Var, e2e0 e2e0Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-1969468195);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(e2e0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            gy30 gy30Var = new gy30(new ux30(14, 0L, e2e0Var.b, (String) null), new rx30(new m0x(R.drawable.ic_glyph_statistics, null, 6), 0L, null, R.drawable.ic_glyph_statistics, 0L, null, Response.BAD_GATEWAY), null, 0L, null, null, 252);
            boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new gvb0(function1, e2e0Var, (byte) 12);
                fetVar.o0(objP);
            }
            jiq0.y(mm40Var, gy30Var, (Function0) objP, null, null, fetVar, i2 & 14, 24);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rwc0(mm40Var, e2e0Var, function1, i, (byte) 12);
        }
    }

    public static final void k(mm40 mm40Var, int i, a4x a4xVar, aoo0 aoo0Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        a4xVar.getClass();
        aoo0Var.getClass();
        function1.getClass();
        fetVar.g0(-718739343);
        int i3 = i2 | 6 | (fetVar.e(i) ? 32 : 16) | (fetVar.g(a4xVar) ? 256 : 128) | (fetVar.e(aoo0Var.ordinal()) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z = (57344 & i3) == 16384;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new dvd0(function1, (byte) 22);
                fetVar.o0(objP);
            }
            Function1 function2 = (Function1) objP;
            boolean z2 = ((i3 & 7168) == 2048) | ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new g18((Object) aoo0Var, (Object) a4xVar, i, (byte) 11);
                fetVar.o0(objP2);
            }
            jm40 jm40Var = jm40.b;
            dwi0.b(function2, jm40Var, (Function1) objP2, fetVar, 48, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ku90(mm40Var2, i, a4xVar, aoo0Var, function1, i2);
        }
    }

    public static final void l(mm40 mm40Var, String str, String str2, l7m0 l7m0Var, prm prmVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        str.getClass();
        l7m0Var.getClass();
        function1.getClass();
        fetVar2.g0(1814084826);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128) | (fetVar2.g(l7m0Var) ? 2048 : 1024) | (fetVar2.g(prmVar) ? 16384 : 8192) | (fetVar2.i(function1) ? 131072 : 65536);
        if (fetVar2.U(i2 & 1, (74899 & i2) != 74898)) {
            mm40Var2 = jm40.b;
            mm40 mm40VarE0 = o2e.e0(mm40Var2, "SALE_SETTINGS_COLUMN_TAG");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
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
            ay3.d(i2 & 8176, fetVar2, null, l7m0Var, str, str2);
            boolean z = (458752 & i2) == 131072;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new a9g0(function1, (byte) 2);
                fetVar2.o0(objP);
            }
            qcc.k(null, prmVar, (Function1) objP, fetVar2, (i2 >> 9) & 112, 1);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new acb0(mm40Var2, str, str2, l7m0Var, prmVar, function1, i);
        }
    }

    public static final void m(jjl jjlVar, gjl gjlVar, final Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i) {
        int i2;
        long backgroundContent;
        long jM123getWhite0d7_KjU;
        long jM123getWhite0d7_KjU2;
        long jM130getWhite600d7_KjU;
        long jM123getWhite0d7_KjU3;
        long jM123getWhite0d7_KjU4;
        long jM123getWhite0d7_KjU5;
        fet fetVar2 = fetVar;
        jjlVar.getClass();
        y3d y3dVar = jjlVar.e;
        gjlVar.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        fetVar2.g0(1493241800);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(jjlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.e(gjlVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.i(function2) ? 16384 : 8192;
        }
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z = fetVar2.k(bmd.n) == k6z.b;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.a(0.0f);
                fetVar2.o0(objP);
            }
            final agk0 agk0Var = (agk0) objP;
            boolean z2 = z;
            int i3 = i2;
            l7m0 l7m0VarB = d43.b(agk0Var.l(), ro4.m0(Response.BAD_REQUEST, 0, new zsf(0.0f, 0.0f, 0.5f, 1.0f), 2), null, null, fetVar2, 48, 28);
            final float fFloatValue = z2 ? -((Number) l7m0VarB.getValue()).floatValue() : ((Number) l7m0VarB.getValue()).floatValue();
            boolean zH = fetVar2.h(z2);
            Object objP2 = fetVar2.P();
            if (zH || objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.b(z2 ? R.drawable.ic_glyph_wallet_alt_subtract_rtl : R.drawable.ic_glyph_wallet_alt_subtract);
                fetVar2.o0(objP2);
            }
            final cgk0 cgk0Var = (cgk0) objP2;
            boolean zH2 = fetVar2.h(z2);
            Object objP3 = fetVar2.P();
            if (zH2 || objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.b(z2 ? R.drawable.ic_glyph_update_rtl : R.drawable.ic_glyph_update);
                fetVar2.o0(objP3);
            }
            final cgk0 cgk0Var2 = (cgk0) objP3;
            String str = jjlVar.c;
            boolean zG = fetVar2.g(y3dVar);
            Object objP4 = fetVar2.P();
            if (zG || objP4 == cl5Var) {
                if (y3dVar != null) {
                    backgroundContent = y3dVar.f41946a;
                } else {
                    pz40 pz40Var = s6t0.f31722a;
                    backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                }
                objP4 = dw9.e(backgroundContent, fetVar2);
            }
            long j = ((y3d) objP4).f41946a;
            int i4 = i3 & 112;
            boolean z3 = i4 == 32;
            Object objP5 = fetVar2.P();
            if (z3 || objP5 == cl5Var) {
                if (gjlVar == gjl.f11403a) {
                    pz40 pz40Var2 = s6t0.f31722a;
                    jM123getWhite0d7_KjU = s6t0.b().f33626a.getPrimary();
                } else {
                    pz40 pz40Var3 = s6t0.f31722a;
                    jM123getWhite0d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
                }
                objP5 = dw9.e(jM123getWhite0d7_KjU, fetVar2);
            }
            final long j2 = ((y3d) objP5).f41946a;
            boolean z4 = i4 == 32;
            Object objP6 = fetVar2.P();
            if (z4 || objP6 == cl5Var) {
                if (gjlVar == gjl.f11403a) {
                    pz40 pz40Var4 = s6t0.f31722a;
                    jM123getWhite0d7_KjU2 = s6t0.b().f33626a.getPrimary();
                } else {
                    pz40 pz40Var5 = s6t0.f31722a;
                    jM123getWhite0d7_KjU2 = StaticColors.INSTANCE.m123getWhite0d7_KjU();
                }
                objP6 = dw9.e(jM123getWhite0d7_KjU2, fetVar2);
            }
            final long j3 = ((y3d) objP6).f41946a;
            boolean z5 = i4 == 32;
            Object objP7 = fetVar2.P();
            if (z5 || objP7 == cl5Var) {
                if (gjlVar == gjl.f11403a) {
                    pz40 pz40Var6 = s6t0.f31722a;
                    jM130getWhite600d7_KjU = s6t0.b().f33626a.getSeparator();
                } else {
                    pz40 pz40Var7 = s6t0.f31722a;
                    jM130getWhite600d7_KjU = StaticColors.INSTANCE.m130getWhite600d7_KjU();
                }
                objP7 = dw9.e(jM130getWhite600d7_KjU, fetVar2);
            }
            long j4 = ((y3d) objP7).f41946a;
            boolean z6 = i4 == 32;
            Object objP8 = fetVar2.P();
            if (z6 || objP8 == cl5Var) {
                if (gjlVar == gjl.f11403a) {
                    pz40 pz40Var8 = s6t0.f31722a;
                    jM123getWhite0d7_KjU3 = s6t0.b().f33626a.getPrimary();
                } else {
                    pz40 pz40Var9 = s6t0.f31722a;
                    jM123getWhite0d7_KjU3 = StaticColors.INSTANCE.m123getWhite0d7_KjU();
                }
                objP8 = dw9.e(jM123getWhite0d7_KjU3, fetVar2);
            }
            long j5 = ((y3d) objP8).f41946a;
            boolean z7 = i4 == 32;
            Object objP9 = fetVar2.P();
            if (z7 || objP9 == cl5Var) {
                if (gjlVar == gjl.f11403a) {
                    pz40 pz40Var10 = s6t0.f31722a;
                    jM123getWhite0d7_KjU4 = s6t0.b().f33626a.getTextPrimary();
                } else {
                    pz40 pz40Var11 = s6t0.f31722a;
                    jM123getWhite0d7_KjU4 = StaticColors.INSTANCE.m123getWhite0d7_KjU();
                }
                objP9 = dw9.e(jM123getWhite0d7_KjU4, fetVar2);
            }
            long j6 = ((y3d) objP9).f41946a;
            boolean z8 = i4 == 32;
            Object objP10 = fetVar2.P();
            if (z8 || objP10 == cl5Var) {
                if (gjlVar == gjl.f11403a) {
                    pz40 pz40Var12 = s6t0.f31722a;
                    jM123getWhite0d7_KjU5 = s6t0.b().f33626a.getTextPrimary();
                } else {
                    pz40 pz40Var13 = s6t0.f31722a;
                    jM123getWhite0d7_KjU5 = StaticColors.INSTANCE.m123getWhite0d7_KjU();
                }
                objP10 = dw9.e(jM123getWhite0d7_KjU5, fetVar2);
            }
            long j7 = ((y3d) objP10).f41946a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), j, jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarQ, 16.0f, 8.0f);
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z9 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z9) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarN = s5x0.N(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0.0f, 8.0f, 8.0f, 8.0f, 1);
            thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            w9x.l(48.0f, 48.0f, u1c.M(-402208534, new Function2() { // from class: a.rjh0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    fet fetVar3 = (fet) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                        zcl zclVar2 = qmk.f28987a;
                        jm40 jm40Var2 = jm40.b;
                        mm40 mm40VarP = o7k0.p(jm40Var2, 36.0f, 36.0f);
                        Object objP11 = fetVar3.P();
                        cl5 cl5Var2 = ukd.f35823a;
                        if (objP11 == cl5Var2) {
                            objP11 = dw9.j(fetVar3);
                        }
                        gy40 gy40Var = (gy40) objP11;
                        Function0 function3 = function0;
                        boolean zG2 = fetVar3.g(function3);
                        Object objP12 = fetVar3.P();
                        if (zG2 || objP12 == cl5Var2) {
                            objP12 = new zhq(function3, agk0Var, (byte) 3);
                            fetVar3.o0(objP12);
                        }
                        mm40 mm40VarW = y860.W(mm40VarP, gy40Var, null, false, null, (Function0) objP12, 28);
                        tj30 tj30VarC = zq8.c(gqw0.d, false);
                        int iHashCode3 = Long.hashCode(fetVar3.T);
                        bh90 bh90VarM3 = fetVar3.m();
                        mm40 mm40VarC2 = kbc.c0(fetVar3, mm40VarW);
                        mkd.c0.getClass();
                        fetVar3.i0();
                        boolean z10 = fetVar3.S;
                        pcy pcyVar2 = e7z.u1;
                        if (z10) {
                            fetVar3.l(pcyVar2);
                        } else {
                            fetVar3.r0();
                        }
                        shd shdVar5 = gqw0.x;
                        jpm0.o(fetVar3, tj30VarC, shdVar5);
                        shd shdVar6 = gqw0.w;
                        jpm0.o(fetVar3, bh90VarM3, shdVar6);
                        Integer numValueOf2 = Integer.valueOf(iHashCode3);
                        shd shdVar7 = gqw0.y;
                        jpm0.o(fetVar3, numValueOf2, shdVar7);
                        jpm0.n(fetVar3);
                        shd shdVar8 = gqw0.v;
                        jpm0.o(fetVar3, mm40VarC2, shdVar8);
                        mm40 mm40VarE0 = o2e.e0(o7k0.n(jm40Var2, 24.0f), "UPDATE_ACCOUNT_BTN");
                        tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                        int iHashCode4 = Long.hashCode(fetVar3.T);
                        bh90 bh90VarM4 = fetVar3.m();
                        mm40 mm40VarC3 = kbc.c0(fetVar3, mm40VarE0);
                        fetVar3.i0();
                        if (fetVar3.S) {
                            fetVar3.l(pcyVar2);
                        } else {
                            fetVar3.r0();
                        }
                        jpm0.o(fetVar3, tj30VarC2, shdVar5);
                        jpm0.o(fetVar3, bh90VarM4, shdVar6);
                        vqd.u(iHashCode4, fetVar3, shdVar7, fetVar3);
                        jpm0.o(fetVar3, mm40VarC3, shdVar8);
                        dww.b(jpm0.t(cgk0Var2.l(), 6, fetVar3), null, a8k0.I(jr8.f16991a.b(ffb0.Q(o7k0.n(jm40Var2, 16.0f), 4.0f, 2.0f), gqw0.i), fFloatValue), j3, fetVar3, 48, 0);
                        dww.b(jpm0.t(cgk0Var.l(), 6, fetVar3), null, o7k0.n(jm40Var2, 24.0f), j2, fetVar3, 48, 0);
                        fetVar3.r(true);
                        fetVar3.r(true);
                    } else {
                        fetVar3.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar2), fetVar, 384, 0);
            fetVar2 = fetVar;
            jcb.H(s5x0.L(o7k0.e(jm40Var, 36.0f), 0.0f, 8.0f, 1), 1.0f, j4, fetVar2, 0, 0);
            w9x.l(48.0f, 0.0f, u1c.M(-351652141, new mkd0(function1, jjlVar, j5, j6, (byte) 1), fetVar2), fetVar2, 384, 2);
            fetVar2.r(true);
            if (str != null) {
                fetVar2.e0(-917786162);
                qzb.n(ig.a(fetVar2, o7k0.u(o7k0.e(jm40Var, 36.0f), 0.0f, 160.0f, 1)), new wul(iul.e, oe9.b, new ve9(str, R.drawable.ic_glyph_plus_small), true, false, false), function2, fetVar2, (i3 >> 6) & 896, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-917032738);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yhq(jjlVar, gjlVar, function0, function1, function2, i, (byte) 3);
        }
    }

    public static final void n(mm40 mm40Var, qxl0 qxl0Var, Function2 function2, fet fetVar, int i) {
        qxl0Var.getClass();
        function2.getClass();
        fetVar.g0(1049251935);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(qxl0Var) ? 32 : 16) | (fetVar.i(function2) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            float f = ((Configuration) fetVar.k(dy2.f6873a)).screenWidthDp;
            mm40 mm40VarE0 = o2e.e0(mm40Var, "STADIUMS_LAZY_ROW");
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            lh80 lh80VarT = s5x0.t(qmk.a(fetVar).c, 0.0f, 2);
            boolean zD = ((i2 & 112) == 32) | fetVar.d(f) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (zD || objP == ukd.f35823a) {
                objP = new ny2((Object) qxl0Var, f, (Object) function2, (byte) 15);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarE0, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, 490);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aak0(mm40Var, qxl0Var, function2, i, (byte) 25);
        }
    }

    public static final void o(s4q0 s4q0Var, Context context, boolean z, String str, long j) {
        if (o9q0.c(j) || str.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        Context context2 = context;
        List list = (List) ccq0.h.invoke(context2);
        if (list.isEmpty()) {
            return;
        }
        vy40 vy40Var = s4q0Var.f31620a;
        vy40 vy40Var2 = s4q0Var.f31620a;
        f5q0 f5q0Var = f5q0.b;
        vy40Var.a(f5q0Var);
        int size = list.size();
        int i = 0;
        while (i < size) {
            ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            vy40Var2.a(new b5q0(new xyb0(i), resolveInfo.loadLabel(packageManager).toString(), 0, new c6n(context2, resolveInfo, z, str, j)));
            i++;
            context2 = context;
        }
        vy40Var2.a(f5q0Var);
    }

    public static final boolean p(List list) {
        list.getClass();
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xg90 xg90Var = (xg90) it.next();
            xg90Var.getClass();
            if (!(xg90Var instanceof vg90)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean q(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            xg90 xg90Var = (xg90) it.next();
            xg90Var.getClass();
            if (!(xg90Var instanceof ug90) || !(xg90Var instanceof sg90)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean r(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            xg90 xg90Var = (xg90) it.next();
            xg90Var.getClass();
            if (!(xg90Var instanceof ug90) || !(xg90Var instanceof tg90)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean s(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            xg90 xg90Var = (xg90) it.next();
            xg90Var.getClass();
            if ((xg90Var instanceof ug90) && (xg90Var instanceof sg90)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean t(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            xg90 xg90Var = (xg90) it.next();
            xg90Var.getClass();
            if ((xg90Var instanceof ug90) && (xg90Var instanceof tg90)) {
                return true;
            }
        }
        return false;
    }

    public static final jo20 u(lnf0 lnf0Var, sgs sgsVar, zos zosVar, Long l) {
        sgsVar.getClass();
        zosVar.getClass();
        jo20 jo20Var = new jo20();
        jo20Var.put("cfView", Integer.valueOf(sgsVar.c));
        int i = sgsVar.g;
        if (i > 0) {
            jo20Var.put("country", Integer.valueOf(i));
        }
        jo20Var.put("fcountry", Integer.valueOf(lnf0Var.b));
        jo20Var.put("gameId", Long.valueOf(zosVar.f44730a));
        jo20Var.put("gr", 1357);
        jo20Var.put("lng", lnf0Var.f20342a);
        if (l != null) {
            jo20Var.put("marketType", l);
        }
        jo20Var.put("ref", 1);
        boolean z = sgsVar.e;
        long j = sgsVar.f;
        if (z && j > 0) {
            jo20Var.put("userId", Long.valueOf(j));
        }
        return w6x.j(22, jo20Var, "whence");
    }

    public static final jo20 v(long j, long j2, boolean z, jvn jvnVar, int i, int i2) {
        jvnVar.getClass();
        jo20 jo20Var = new jo20();
        jo20Var.put("cfView", Integer.valueOf(jvnVar.getId()));
        jo20Var.put("country", Integer.valueOf(i));
        jo20Var.put("fcountry", Integer.valueOf(i2));
        jo20Var.put("gameId", Long.valueOf(j));
        jo20Var.put("ref", 1);
        if (z && j2 > 0) {
            jo20Var.put("userId", Long.valueOf(j2));
        }
        return w6x.j(22, jo20Var, "whence");
    }

    public static final rx w(ctf0 ctf0Var, List list) {
        int i;
        ctf0Var.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((StatisticBlockModel) obj).c) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        String strValueOf = String.valueOf(list.size());
        String strA = size == 0 ? "" : ctf0Var.b.a(R.string.hidden_amount, Arrays.copyOf(new Object[]{String.valueOf(size), strValueOf}, 2));
        if (list.isEmpty()) {
            i = R.drawable.ic_glyph_select_all_inactive;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                StatisticBlockModel statisticBlockModel = (StatisticBlockModel) it.next();
                if (!statisticBlockModel.c || statisticBlockModel.b != Integer.MAX_VALUE) {
                    if (!list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            StatisticBlockModel statisticBlockModel2 = (StatisticBlockModel) it2.next();
                            if (!statisticBlockModel2.c || statisticBlockModel2.b != list.indexOf(statisticBlockModel2)) {
                                i = R.drawable.ic_glyph_select_all_active;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
            i = R.drawable.ic_glyph_select_all_inactive;
        }
        return new rx(i, ctf0Var.b.a(R.string.information_block_settings, Arrays.copyOf(new Object[0], 0)), strA, mx.f22528a);
    }

    public static final float x(String str) {
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

    public static void y(long j, String str) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    public static void z(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
