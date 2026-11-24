package a;

import android.content.Context;
import android.content.res.Configuration;
import android.gov.nist.core.Separators;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ckb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static gpj0 f4497a;

    public static final void A(int i, fet fetVar, mm40 mm40Var, c280 c280Var, String str) {
        int i2;
        String str2;
        fetVar.g0(-940505589);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i2 |= fetVar.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(c280Var) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.n, fetVar, 48);
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
            boolean z2 = (i2 & 896) == 256;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z2 || objP == obj) {
                objP = new u6n(d4d.SECONDARY60, w6n.f, c280Var);
                fetVar.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            boolean zG = fetVar.g(u6nVar);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new d1n(u6nVar, (byte) 1);
                fetVar.o0(objP2);
            }
            kkb.p(1, fetVar, null, (Function0) objP2);
            mm40 mm40VarE = o7k0.e(jm40.b, 30.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            long textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            f1t0.a(null, str2, textPrimary, null, 0L, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, g1t0.d(), 0L, fetVar, i2 & 112, 437241);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iym(mm40Var, str, c280Var, i, (byte) 2);
        }
    }

    public static final void B(mm40 mm40Var, String str, String str2, c280 c280Var, c280 c280Var2, y1m y1mVar, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(-1918498816);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128) | (fetVar.g(c280Var) ? 2048 : 1024) | (fetVar.g(c280Var2) ? 16384 : 8192) | (fetVar.g(y1mVar) ? 131072 : 65536) | (fetVar.h(z) ? 1048576 : 524288);
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            mm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(16.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            int i3 = i2 >> 3;
            A((i2 & 112) | (i3 & 896), fetVar, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), c280Var, str);
            obb.q(null, y1mVar, z, fetVar, (i2 >> 12) & 1008, 1);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            A(((i2 >> 6) & 896) | (i3 & 112), fetVar, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), c280Var2, str2);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pym(mm40Var2, str, str2, c280Var, c280Var2, y1mVar, z, i, (byte) 0);
        }
    }

    public static final void C(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fetVar.g0(-1976356688);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.h(), fetVar, ((i2 >> 3) & 14) | ((i2 << 3) & 112), 24960, 110584);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdm(mm40Var, str2, i, (byte) 5);
        }
    }

    public static final void D(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fetVar.g0(-455525314);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, ((i2 >> 3) & 14) | ((i2 << 3) & 112), 24960, 110584);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdm(mm40Var, str2, i, (byte) 7);
        }
    }

    public static final void E(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        fetVar.g0(57160453);
        int i2 = i | 6 | (fetVar.g(a4xVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            l7m0 l7m0VarT = ahb.T(a4xVar, fetVar, (i2 >> 3) & 14);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            fetVar.e0(-290332325);
            int i3 = 0;
            for (Object obj : (List) l7m0VarT.getValue()) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                fetVar.b0(1443955680, Integer.valueOf(i3));
                feb.n((egm) obj, fetVar);
                fetVar.r(false);
                i3 = i4;
            }
            fetVar.r(false);
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw1(mm40Var, a4xVar, i, (byte) 9);
        }
    }

    public static final qoj0 F() {
        return roj0.a(0, 1, i99.b);
    }

    public static final void G(o0x o0xVar, fet fetVar, int i) {
        fetVar.g0(1884985786);
        int i2 = i | (fetVar.g(o0xVar) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_category_new, 0, fetVar);
            zcl zclVar = qmk.f28987a;
            k7x.b(o0xVar.a(), null, o7k0.n(jm40.b, 16.0f), pm80VarF, pm80VarF, null, null, null, null, null, gqw0.A, new m78(((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), 5), fetVar, 36912, 6, 27616);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o9b(o0xVar, i, (byte) 1);
        }
    }

    public static final void H(int i, fet fetVar, mm40 mm40Var, String str) {
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(1454934116);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 36.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            mm40 mm40VarE0 = o2e.e0(o7k0.d(jm40.b, 1.0f), "ONE_OPP_TEAM_NAME");
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarE0, jM123getWhite0d7_KjU, new n05(qmk.q, qmk.r, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.m(), fetVar2, ((i2 >> 3) & 14) | 48, 24960, 109552);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hx1(mm40Var, str2, i, (byte) 27);
        }
    }

    public static final void I(mm40 mm40Var, e6m e6mVar, fet fetVar, int i) {
        fetVar.g0(1612488931);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(e6mVar) ? 32 : 16);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = androidx.compose.runtime.e.e(Boolean.TRUE);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP2);
            }
            vne vneVar = (vne) objP2;
            Long lValueOf = Long.valueOf(e6mVar.b);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP3 = fetVar.P();
            if (z || objP3 == obj) {
                objP3 = new t5m(e6mVar, pz40Var, null, b);
                fetVar.o0(objP3);
            }
            m0x0.t(fetVar, lValueOf, (Function2) objP3);
            boolean z2 = i3 == 32;
            Object objP4 = fetVar.P();
            if (z2 || objP4 == obj) {
                objP4 = new c8n(e6mVar.f7292a, new w7n(new z7n(), e6mVar.b, e6mVar.c, e6mVar.f, e6mVar.e, null, 32));
                fetVar.o0(objP4);
            }
            c8n c8nVar = (c8n) objP4;
            if (((Boolean) pz40Var.getValue()).booleanValue()) {
                fetVar.e0(-1550642480);
                boolean zI = fetVar.i(vneVar);
                Object objP5 = fetVar.P();
                if (zI || objP5 == obj) {
                    objP5 = new s5m(vneVar, pz40Var, b);
                    fetVar.o0(objP5);
                }
                v7n.c(mm40Var, c8nVar, (Function0) objP5, fetVar, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(-1550351297);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p5m(mm40Var, e6mVar, i, (byte) 1);
        }
    }

    public static final void J(lc00 lc00Var, o8j o8jVar, ctf0 ctf0Var, m9s m9sVar) {
        f9a0 f9a0Var;
        String strA;
        ctf0Var.getClass();
        m9sVar.getClass();
        qqs qqsVar = m9sVar.h;
        int i = o8jVar.f24831a;
        String strValueOf = String.valueOf(o8jVar.b);
        strValueOf.getClass();
        String strValueOf2 = String.valueOf(o8jVar.c);
        strValueOf2.getClass();
        String strValueOf3 = String.valueOf(o8jVar.d);
        strValueOf3.getClass();
        String strValueOf4 = String.valueOf(o8jVar.e);
        strValueOf4.getClass();
        List list = o8jVar.h;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (Iterator it = list.iterator(); it.hasNext(); it = it) {
            xcq0 xcq0Var = (xcq0) it.next();
            arrayList.add(new s8j(xcq0Var.f40659a, xcq0Var.b, xcq0Var.c, xcq0Var.d, xcq0Var.e));
        }
        List list2 = o8jVar.i;
        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
        for (Iterator it2 = list2.iterator(); it2.hasNext(); it2 = it2) {
            xcq0 xcq0Var2 = (xcq0) it2.next();
            arrayList2.add(new s8j(xcq0Var2.f40659a, xcq0Var2.b, xcq0Var2.c, xcq0Var2.d, xcq0Var2.e));
        }
        String strValueOf5 = String.valueOf(o8jVar.f);
        strValueOf5.getClass();
        String strValueOf6 = String.valueOf(o8jVar.g);
        strValueOf6.getClass();
        int iOrdinal = o8jVar.j.ordinal();
        if (iOrdinal == 0) {
            f9a0Var = f9a0.f9146a;
        } else if (iOrdinal == 1) {
            f9a0Var = f9a0.b;
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return;
            }
            f9a0Var = f9a0.c;
        }
        long jF = znq0.f(qqsVar.h);
        znq0 znq0Var = qqsVar.k;
        f9a0 f9a0Var2 = f9a0Var;
        f9j f9jVar = new f9j(znq0Var != null ? Long.valueOf(znq0.f(znq0Var.f44687a)) : null, jF);
        n9j n9jVar = o8jVar.k;
        long j = m9sVar.v;
        int iOrdinal2 = n9jVar.ordinal();
        if (iOrdinal2 == 0) {
            strA = ctf0Var.b.a(R.string.player_one_wins, Arrays.copyOf(new Object[0], 0));
        } else if (iOrdinal2 != 1) {
            uen uenVar = wen.b;
            long jL = j - wen.l(ibc.w0(System.currentTimeMillis(), bfn.MILLISECONDS), bfn.SECONDS);
            strA = (1 > jL || jL >= 21600) ? "" : ctf0Var.b.a(R.string.bet_before_game_start, Arrays.copyOf(new Object[0], 0));
        } else {
            strA = ctf0Var.b.a(R.string.player_two_wins, Arrays.copyOf(new Object[0], 0));
        }
        lc00Var.add(new h9j(i, strValueOf, strValueOf2, strValueOf3, strValueOf4, arrayList, arrayList2, strValueOf5, strValueOf6, f9a0Var2, f9jVar, strA));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00b1  */
    public static final cof K(int i, long j, trf trfVar, ctf0 ctf0Var, String str, String str2, String str3, boolean z) {
        String str4 = str2;
        List list = trfVar.f34420a;
        str.getClass();
        ctf0Var.getClass();
        int i2 = 0;
        List listJ = q3d.j(0, 1, 2, 3, 4);
        ArrayList arrayList = new ArrayList(r3d.q(listJ, 10));
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            arrayList.add((pqf) CollectionsKt.W(((Number) it.next()).intValue(), list));
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((pqf) it2.next()) == null) {
                    return null;
                }
            }
        }
        ArrayList arrayListS = CollectionsKt.S(arrayList);
        pqf pqfVar = (pqf) arrayListS.get(0);
        pqf pqfVar2 = (pqf) arrayListS.get(1);
        pqf pqfVar3 = (pqf) arrayListS.get(2);
        pqf pqfVar4 = (pqf) arrayListS.get(3);
        pqf pqfVar5 = (pqf) arrayListS.get(4);
        if (!kotlin.text.c.x(str4, ujn.h, false)) {
            if (str4.length() == 0) {
                str4 = "";
            } else {
                List list2 = u0d.f34849a;
                if (u0d.c(str4)) {
                    str4 = "";
                } else {
                    str4 = String.format(Locale.ENGLISH, StringsKt.O(str4, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str4}, 2));
                }
            }
        }
        vnf vnfVar = new vnf(str4, str);
        oqf oqfVarC0 = c0(pqfVar);
        oqf oqfVarC1 = c0(pqfVar2);
        oqf oqfVarC2 = c0(pqfVar3);
        oqf oqfVarC3 = c0(pqfVar4);
        oqf oqfVarC4 = c0(pqfVar5);
        list.getClass();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            i2 += ((pqf) it3.next()).b;
        }
        return new cof(str3, j, vnfVar, i, oqfVarC0, oqfVarC1, oqfVarC2, oqfVarC3, oqfVarC4, ctf0Var.b.a(R.string.cs2_total_cash_v2, Arrays.copyOf(new Object[]{String.valueOf(i2)}, 1)), z);
    }

    public static final List L(List list, x9l x9lVar, m9s m9sVar, yws ywsVar, boolean z) {
        if (x9lVar == null) {
            return iun.f15405a;
        }
        c5l c5lVar = x9lVar.f40514a;
        y9l y9lVar = c5lVar.b;
        lc00 lc00VarB = kotlin.collections.a.b();
        ArrayList<e9l> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            t9m0 t9m0Var = (t9m0) it.next();
            c0o c0oVar = e9l.f;
            y2 y2VarH = ohs0.h(c0oVar, c0oVar);
            while (y2VarH.hasNext()) {
                Object next = y2VarH.next();
                if (((e9l) next).f7427a == t9m0Var) {
                    obj = next;
                    break;
                }
            }
            e9l e9lVar = (e9l) obj;
            if (e9lVar != null) {
                arrayList.add(e9lVar);
            }
        }
        for (e9l e9lVar2 : arrayList) {
            int iOrdinal = e9lVar2.ordinal();
            short s = e9lVar2.f7427a.f33572a;
            switch (iOrdinal) {
                case 0:
                    if (bkb.V(c5lVar)) {
                        lc00VarB.add(Integer.valueOf(s));
                    }
                    break;
                case 1:
                case 2:
                    i6l i6lVar = y9lVar.f42253a;
                    i6l i6lVar2 = i6l.f14245a;
                    if (i6lVar == i6lVar2 || c5lVar.c.f42253a == i6lVar2 || bkb.V(c5lVar) || (ywsVar != null && ywsVar.b > 0 && !z)) {
                        lc00VarB.add(Integer.valueOf(s));
                    }
                    break;
                case 3:
                    if (bkb.W(c5lVar, m9sVar)) {
                        lc00VarB.add(Integer.valueOf(s));
                    }
                    break;
                case 4:
                    String str = (String) CollectionsKt.firstOrNull(m9sVar.m);
                    if (str == null) {
                        str = "";
                    }
                    String str2 = (String) CollectionsKt.firstOrNull(m9sVar.n);
                    if (bkb.T(c5lVar, str, str2 != null ? str2 : "")) {
                        lc00VarB.add(Integer.valueOf(s));
                    }
                    break;
                case 5:
                    if (zjb.t(m9sVar, c5lVar.f3777a.g, y9lVar.f42253a).d.isEmpty()) {
                        lc00VarB.add(Integer.valueOf(s));
                    }
                    break;
                case 6:
                    if (bkb.U(c5lVar)) {
                        lc00VarB.add(Integer.valueOf(s));
                    }
                    break;
                case 7:
                    if (bkb.S(x9lVar.b)) {
                        lc00VarB.add(Integer.valueOf(s));
                    }
                    break;
                case 8:
                    if (bkb.R(x9lVar.c)) {
                        lc00VarB.add(Integer.valueOf(s));
                    }
                    break;
                case 9:
                    if (x2x.b0(x9lVar.d, m9sVar)) {
                        lc00VarB.add(Integer.valueOf(s));
                    }
                    break;
                default:
                    t9f.b();
                    return null;
            }
        }
        return kotlin.collections.a.a(lc00VarB);
    }

    public static String M(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        charArray.getClass();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (char c : charArray) {
            if (z && Character.isLetter(c)) {
                sb.append(Character.toUpperCase(c));
                z = false;
            } else {
                if (Character.isWhitespace(c)) {
                    z = true;
                }
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String N(Context context) {
        String str = context.getResources().getConfiguration().getLayoutDirection() == 1 ? "rtl" : "ltr";
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(R.font.roboto_medium, typedValue, true);
        String string = typedValue.string.toString();
        TypedValue typedValue2 = new TypedValue();
        context.getResources().getValue(R.font.roboto_regular, typedValue2, true);
        String string2 = typedValue2.string.toString();
        String strW = W(R.attr.uikitTextPrimary, context);
        String strW2 = W(R.attr.uikitSecondary, context);
        String strW3 = W(R.attr.uikitPrimary, context);
        String strW4 = W(R.attr.uikitBackgroundContent, context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.extra_large_horizontal_margin_dynamic);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.space_8);
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.space_12);
        int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(R.dimen.space_16);
        int dimensionPixelSize5 = context.getResources().getDimensionPixelSize(R.dimen.space_32);
        int dimensionPixelSize6 = context.getResources().getDimensionPixelSize(R.dimen.text_20);
        int dimensionPixelSize7 = context.getResources().getDimensionPixelSize(R.dimen.text_16);
        int dimensionPixelSize8 = context.getResources().getDimensionPixelSize(R.dimen.corner_radius_16);
        int i = (dimensionPixelSize5 - dimensionPixelSize7) / 2;
        if (i <= 0) {
            i = 0;
        }
        int i2 = i;
        StringBuilder sbN = b1j.n("<style>@font-face {               font-family:WebViewMedium;               src:url('file:///android_", string, "');               font-family:WebViewRegular;               src:url('file:///android_", string2, "');           }\tbody {       background-color: ");
        f140.v(sbN, strW4, ";       direction: ", str, ";\t\tfont-family: WebViewRegular;\t\tfont-size: ");
        axq.r(dimensionPixelSize7, dimensionPixelSize3, "px;\t\tfont-style: normal;\t\tfont-weight: 400;\t\tpadding: 0 0 0 0;\t\tmargin: ", "px ", sbN);
        axq.r(dimensionPixelSize, dimensionPixelSize5, "px ", "px ", sbN);
        axq.r(dimensionPixelSize, dimensionPixelSize7, "px;\t}\tp {\t\tfont-family: WebViewRegular;\t\tfont-size: ", "px;\t\tfont-style: normal;\t\tfont-weight: 400;\t\tcolor: ", sbN);
        twn.w(dimensionPixelSize3, strW2, ";\t\tpadding: 0;\t\tmargin: ", "px 0 0 0;\t}\th1 {\t\tfont-family: WebViewMedium;\t\tfont-size: ", sbN);
        kng0.w(dimensionPixelSize6, "px;\t\tfont-style: normal;\t\tfont-weight: 510;\t\tcolor: ", strW, ";\t\tpadding: 0;\t\tmargin: ", sbN);
        axq.r(dimensionPixelSize4, dimensionPixelSize7, "px 0 0 0;\t}\th2, h3, h4, h5, h6 {\t\tfont-family: WebViewMedium;\t\tfont-size: ", "px;\t\tfont-style: normal;\t\tfont-weight: 510;\t\tcolor: ", sbN);
        twn.w(dimensionPixelSize4, strW, ";\t\tpadding: 0;\t\tmargin: ", "px 0 0 0;\t}\timg {       border-radius: ", sbN);
        axq.r(dimensionPixelSize8, dimensionPixelSize2, "px;\t\tmax-width: 100%;\t\theight: auto;\t\tdisplay: block;\t\tmargin: ", "px auto;\t}   p:has(img) {        margin: ", sbN);
        axq.r(dimensionPixelSize2, dimensionPixelSize2, "px 0 0 0;   }    p.with-img {\t\tmargin: ", "px 0 0 0;   }    p img {       float: none !important;   } \ta {       -webkit-tap-highlight-color: transparent;\t\tfont-family: WebViewMedium;\t\tcolor: ", sbN);
        twn.w(dimensionPixelSize7, strW3, ";\t\tfont-size: ", "px;\t\ttext-decoration: none;\t\ttext-overflow: ellipsis;\t\toverflow: hidden;\t\twhite-space: nowrap;\t\tmargin: ", sbN);
        axq.r(dimensionPixelSize2, i2, "px 0 0 0;\t\tpadding: ", "px 0px ", sbN);
        kng0.w(i2, "px 0px;\t}    ol li::marker,    ul li::marker {       color: ", strW2, ";   }   ol, ul {        margin: ", sbN);
        return rz4.j(dimensionPixelSize3, "px 0 0 0; } </style>", sbN);
    }

    public static final int O(pt0 pt0Var, int i) {
        int iOrdinal = pt0Var.ordinal();
        if (iOrdinal == 2) {
            return i >= 640 ? 3 : 2;
        }
        if (iOrdinal != 4) {
            return i >= 560 ? 3 : 2;
        }
        return i >= 640 ? 2 : 1;
    }

    public static final jo20 P(long j, String str) {
        str.getClass();
        jo20 jo20Var = new jo20();
        jo20Var.put("feedId", Long.valueOf(j));
        if (str.length() > 0) {
            jo20Var.put("tourTime", str);
        }
        return jo20Var.b();
    }

    public static final String Q(d0t d0tVar, dmr dmrVar) {
        Object objPrevious;
        List list = d0tVar.p.n;
        ListIterator listIterator = list.listIterator(list.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((cmr) objPrevious).f4620a != dmrVar);
        cmr cmrVar = (cmr) objPrevious;
        String str = cmrVar != null ? cmrVar.b : null;
        return str == null ? "" : str;
    }

    public static ugd R(rwm0 rwm0Var) {
        if (!rwm0Var.d) {
            return null;
        }
        return new ugd(-1580422901, true, new ft0(jm40.b, (byte) 6));
    }

    public static final String S(z0w z0wVar, ueo ueoVar, String str, boolean z, boolean z2, boolean z3) {
        z0wVar.getClass();
        if (ueoVar == null) {
            return z0wVar.x;
        }
        String str2 = ueoVar.b;
        List list = z0wVar.O;
        List list2 = z0wVar.P;
        int i = ueoVar.c;
        return ohs0.n(StringsKt.u0(str + " \n" + dii0.a(str2, list, list2, Integer.valueOf(i), z, new BigDecimal(String.valueOf(z0wVar.D)), z0wVar.H, Long.valueOf(z0wVar.t), ueoVar.f35538a, nt20.m, z2, z3)).toString(), "\u200e");
    }

    public static final String T(z0w z0wVar, List list, String str, boolean z, boolean z2, boolean z3) {
        Object next;
        list.getClass();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ueo) next).f35538a != z0wVar.v);
        ueo ueoVar = (ueo) next;
        if (ueoVar == null) {
            return z0wVar.x;
        }
        String str2 = ueoVar.b;
        List list2 = z0wVar.O;
        List list3 = z0wVar.P;
        int i = ueoVar.c;
        return ohs0.n(StringsKt.u0(str + " \n" + dii0.a(str2, list2, list3, Integer.valueOf(i), z, new BigDecimal(String.valueOf(z0wVar.D)), z0wVar.H, Long.valueOf(z0wVar.t), ueoVar.f35538a, nt20.m, z2, z3)).toString(), "\u200e");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[PHI: r11
  0x003b: PHI (r11v9 java.lang.String) = (r11v2 java.lang.String), (r11v11 java.lang.String) binds: [B:26:0x0076, B:11:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    public static final ffr U(ljg ljgVar, mog mogVar, boolean z) {
        ArrayList arrayListW;
        String str;
        ljgVar.getClass();
        v1h v1hVar = ljgVar.d;
        List list = ljgVar.f20149a;
        boolean z2 = mogVar instanceof kog;
        if (z2) {
            arrayListW = thb.w(list, v1hVar.g);
        } else {
            if (!(mogVar instanceof log)) {
                t9f.b();
                return null;
            }
            arrayListW = thb.w(list, v1hVar.h);
        }
        String str2 = "";
        if (z2) {
            str = ljgVar.b.d;
            str.getClass();
            if (kotlin.text.c.x(str, ujn.h, false)) {
                str2 = str;
            } else if (str.length() != 0) {
                List list2 = u0d.f34849a;
                if (!u0d.c(str)) {
                    str2 = String.format(Locale.ENGLISH, StringsKt.O(str, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str}, 2));
                }
            }
        } else {
            if (!(mogVar instanceof log)) {
                t9f.b();
                return null;
            }
            str = ljgVar.c.d;
            str.getClass();
            if (kotlin.text.c.x(str, ujn.h, false)) {
                str2 = str;
            } else if (str.length() != 0) {
                List list3 = u0d.f34849a;
                if (!u0d.c(str)) {
                    str2 = String.format(Locale.ENGLISH, StringsKt.O(str, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str}, 2));
                }
            }
        }
        return new ffr(z ? R.drawable.ic_glyph_chevron_down_small : R.drawable.ic_glyph_chevron_up_small, z ? dyb.r0(CollectionsKt.D0(arrayListW, 5)) : dyb.r0(arrayListW), str2, arrayListW.size() > 5);
    }

    public static final String V(boolean z, boolean z2, List list, String str, List list2, int i, boolean z3, boolean z4) {
        String strR;
        Object next;
        String str2;
        Iterator it = list.iterator();
        while (true) {
            strR = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ueo ueoVar = (ueo) next;
            z0w z0wVar = (z0w) CollectionsKt.W(i, list2);
            if (z0wVar != null) {
                if (ueoVar.f35538a == z0wVar.v) {
                    break;
                }
            }
        }
        ueo ueoVar2 = (ueo) next;
        Object objValueOf = ueoVar2 != null ? Integer.valueOf(ueoVar2.c) : 0L;
        z0w z0wVar2 = (z0w) CollectionsKt.W(i, list2);
        if (z0wVar2 != null) {
            String strT = T(z0wVar2, list, str, z2, z3, z4);
            if (!z || objValueOf.equals(0L)) {
                str2 = ". ";
            } else {
                str2 = ". [Р :" + objValueOf + "]: ";
            }
            strR = kotlin.text.c.r(strT, " \n", str2, false);
        }
        return strR == null ? "" : strR;
    }

    public static String W(int i, Context context) {
        TypedValue typedValue = j5d.f15927a;
        String hexString = Integer.toHexString(j5d.a(context, i, false));
        hexString.getClass();
        Locale locale = Locale.US;
        locale.getClass();
        String upperCase = hexString.toUpperCase(locale);
        upperCase.getClass();
        return kng0.l(Separators.POUND, upperCase.substring(2), upperCase.substring(0, 2));
    }

    public static final boolean X(d0t d0tVar) {
        d0tVar.getClass();
        long j = d0tVar.v;
        return j == ixg.d.b || j == ltg.d.b || j == 4;
    }

    public static final void Y() {
        try {
            gpj0 gpj0Var = f4497a;
            if (gpj0Var == null) {
                gpj0Var = (gpj0) ((jhi) ((hhq) nfq.d().b(hhq.class))).o.get();
                gpj0Var.getClass();
                f4497a = gpj0Var;
            }
            if (gpj0Var == null) {
                Intrinsics.h("sharedSessionRepository");
                throw null;
            }
            if (gpj0Var.i) {
                if (gpj0Var != null) {
                    gpj0Var.a();
                } else {
                    Intrinsics.h("sharedSessionRepository");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }

    public static final void Z(View view, int i) {
        view.getClass();
        try {
            e0g0 e0g0Var = j0g0.b;
            view.performHapticFeedback(i);
        } catch (Throwable unused) {
            e0g0 e0g0Var2 = j0g0.b;
        }
    }

    public static final void a(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fetVar.g0(572778253);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, y9q0.a(g1t0.d(), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, ((i2 >> 3) & 14) | ((i2 << 3) & 112), 24960, 109560);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdm(mm40Var, str2, i, (byte) 6);
        }
    }

    public static final void a0(omv omvVar, int i) {
        omvVar.getClass();
        try {
            e0g0 e0g0Var = j0g0.b;
            ((tv90) omvVar).a(i);
        } catch (Throwable unused) {
            e0g0 e0g0Var2 = j0g0.b;
        }
    }

    public static final void b(int i, int i2, fet fetVar, mm40 mm40Var, String str, boolean z) {
        pm80 pm80VarF;
        fet fetVar2 = fetVar;
        fetVar2.g0(733215471);
        int i3 = i2 | (fetVar2.e(i) ? 32 : 16) | (fetVar2.g(str) ? 256 : 128) | (fetVar2.h(z) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, 8.0f, 0.0f, 2);
            y9q0 y9q0VarI = g1t0.i();
            zfn zfnVar = zaq0.b;
            v8q0.a(str, mm40VarL, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarI, fetVar, (i3 >> 6) & 14, 24960, 110584);
            mm40 mm40VarE = o7k0.e(jm40Var, 24.0f);
            long backgroundGroup = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundGroup();
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(s5x0.N(i120.Q(mm40VarE, backgroundGroup, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 6.0f, 0.0f, 4.0f, 0.0f, 10), "CARD_EXTRA_INFO_ROW");
            thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE0);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            v8q0.a(String.valueOf(i), null, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.n(), fetVar, 0, 24576, 114682);
            fetVar2 = fetVar;
            if (z) {
                fetVar2.e0(532056578);
                pm80VarF = a8k0.F(R.drawable.ic_glyph_chevron_up_small, 0, fetVar2);
                fetVar2.r(false);
            } else {
                fetVar2.e0(532150880);
                pm80VarF = a8k0.F(R.drawable.ic_glyph_chevron_down_small, 0, fetVar2);
                fetVar2.r(false);
            }
            dww.c(pm80VarF, null, o2e.e0(o7k0.n(s5x0.N(jm40Var, 2.0f, 0.0f, 0.0f, 0.0f, 14), 16.0f), "CARD_EXTRA_INFO_ICON"), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fetVar2, 56, 0);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw(i, i2, mm40Var, str, z);
        }
    }

    public static final hee b0(jee jeeVar) {
        jeeVar.getClass();
        int iOrdinal = jeeVar.ordinal();
        if (iOrdinal == 0) {
            return hee.f12919a;
        }
        if (iOrdinal == 1) {
            return hee.b;
        }
        if (iOrdinal == 2) {
            return hee.c;
        }
        if (iOrdinal == 3) {
            return hee.d;
        }
        if (iOrdinal == 4) {
            return hee.e;
        }
        t9f.b();
        return null;
    }

    public static final void c(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, String str) {
        fet fetVar2 = fetVar;
        String str2 = str;
        a4xVar.getClass();
        fetVar2.g0(111488424);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16) | (fetVar.g(a4xVar) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.e, gqw0.m, fetVar2, 6);
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), 1.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            Iterator itO = h97.o(fetVar2, mm40VarC1, shdVar4, -381751359, a4xVar);
            while (itO.hasNext()) {
                G((o0x) itO.next(), fetVar2, 0);
            }
            fetVar2.r(false);
            fetVar2.r(true);
            v8q0.a(str, o2e.e0(jm40Var, "CARD_INFO_TEXT"), ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar2, ((i2 >> 3) & 14) | 48, 24960, 110584);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pea(mm40Var, str2, a4xVar, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0201 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x0203  */
    /* JADX WARN: Code duplicated, block: B:107:0x0215  */
    /* JADX WARN: Code duplicated, block: B:109:0x021b  */
    /* JADX WARN: Code duplicated, block: B:110:0x021d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0223  */
    /* JADX WARN: Code duplicated, block: B:116:0x0230  */
    /* JADX WARN: Code duplicated, block: B:118:0x0240 A[PHI: r7
  0x0240: PHI (r7v7 int) = (r7v6 int), (r7v11 int) binds: [B:106:0x0213, B:109:0x021b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:120:0x024d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0258  */
    /* JADX WARN: Code duplicated, block: B:125:0x025c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0267  */
    /* JADX WARN: Code duplicated, block: B:129:0x026a  */
    /* JADX WARN: Code duplicated, block: B:132:0x0275  */
    /* JADX WARN: Code duplicated, block: B:133:0x0278  */
    /* JADX WARN: Code duplicated, block: B:136:0x0283  */
    /* JADX WARN: Code duplicated, block: B:137:0x0286  */
    /* JADX WARN: Code duplicated, block: B:66:0x0155  */
    /* JADX WARN: Code duplicated, block: B:68:0x0166  */
    /* JADX WARN: Code duplicated, block: B:69:0x016b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0174  */
    /* JADX WARN: Code duplicated, block: B:73:0x017a  */
    /* JADX WARN: Code duplicated, block: B:74:0x017c  */
    /* JADX WARN: Code duplicated, block: B:80:0x018f  */
    /* JADX WARN: Code duplicated, block: B:82:0x019f A[PHI: r7
  0x019f: PHI (r7v21 int) = (r7v20 int), (r7v24 int) binds: [B:70:0x0172, B:73:0x017a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x01ac  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.lang.CharSequence, java.lang.StringBuilder] */
    public static final oqf c0(pqf pqfVar) {
        String str;
        String string;
        char c;
        String string2;
        boolean z;
        int i;
        String string3;
        StringBuilder sb;
        char c2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        char c3;
        StringBuilder sb2;
        String strL;
        int i2;
        char c4;
        char c5;
        Map map;
        int i3;
        char c6;
        pqfVar.getClass();
        nqf nqfVar = pqfVar.h;
        String str10 = nqfVar.d;
        lc00 lc00VarB = kotlin.collections.a.b();
        Map map2 = nqfVar.f;
        Iterator it = map2.keySet().iterator();
        while (true) {
            ?? r13 = 0;
            if (!it.hasNext()) {
                break;
            }
            String str11 = (String) it.next();
            Integer num = (Integer) map2.get(str11);
            int iIntValue = num != null ? num.intValue() : 0;
            int i4 = 0;
            while (i4 < iIntValue) {
                ?? sb3 = new StringBuilder(ujn.h);
                String strL2 = kng0.l("/sfiles/sppic1/cyber/cs/", str11, ".png");
                if (strL2.length() == 0) {
                    sb3.setLength(r13);
                    map = map2;
                } else {
                    map = map2;
                    if (StringsKt.O(strL2, ujn.h, r13) || kotlin.text.c.x(strL2, "https://", r13)) {
                        sb3.setLength(r13 == true ? 1 : 0);
                        sb3.append(strL2);
                    } else {
                        if (sb3.length() <= 0 || StringsKt.S(sb3, Separators.SLASH)) {
                            i3 = 1;
                            c6 = '/';
                        } else {
                            sb3.append('/');
                            c6 = '/';
                            i3 = 1;
                        }
                        char[] cArr = new char[i3];
                        cArr[r13] = c6;
                        sb3.append(StringsKt.y0(strL2, cArr));
                    }
                }
                lc00VarB.add(sb3.toString());
                i4++;
                map2 = map;
                r13 = 0;
            }
        }
        lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
        ank0 ank0VarF = egm0.f(pqfVar.f27413a, pqfVar.i);
        if (!nqfVar.c) {
            if (nqfVar.e) {
                StringBuilder sb4 = new StringBuilder(ujn.h);
                int i5 = 0;
                if (StringsKt.O("/sfiles/sppic1/cyber/cs/bombplant.png", ujn.h, false)) {
                    sb4.setLength(i5);
                    sb4.append("/sfiles/sppic1/cyber/cs/bombplant.png");
                } else if (kotlin.text.c.x("/sfiles/sppic1/cyber/cs/bombplant.png", "https://", false)) {
                    i5 = 0;
                    sb4.setLength(i5);
                    sb4.append("/sfiles/sppic1/cyber/cs/bombplant.png");
                } else {
                    if (sb4.length() <= 0 || StringsKt.S(sb4, Separators.SLASH)) {
                        c = '/';
                    } else {
                        c = '/';
                        sb4.append('/');
                    }
                    sb4.append(StringsKt.y0("/sfiles/sppic1/cyber/cs/bombplant.png", c));
                }
                string = sb4.toString();
            } else {
                str = "";
            }
            if (str10.length() > 0) {
                sb2 = new StringBuilder(ujn.h);
                strL = kng0.l("/sfiles/sppic1/cyber/cs/", str10, ".png");
                if (strL.length() == 0) {
                    sb2.setLength(0);
                } else {
                    i2 = 0;
                    if (StringsKt.O(strL, ujn.h, false)) {
                        sb2.setLength(i2);
                        sb2.append(strL);
                    } else if (kotlin.text.c.x(strL, "https://", false)) {
                        i2 = 0;
                        sb2.setLength(i2);
                        sb2.append(strL);
                    } else {
                        if (sb2.length() > 0 || StringsKt.S(sb2, Separators.SLASH)) {
                            c4 = '/';
                        } else {
                            c4 = '/';
                            sb2.append('/');
                        }
                        sb2.append(StringsKt.y0(strL, c4));
                    }
                }
                string2 = sb2.toString();
            } else {
                string2 = "";
            }
            z = nqfVar.b;
            if (!z && nqfVar.f23956a) {
                StringBuilder sb5 = new StringBuilder(ujn.h);
                int i6 = 0;
                if (StringsKt.O("/sfiles/sppic1/cyber/cs/kevlar_helmet.png", ujn.h, false)) {
                    sb5.setLength(i6);
                    sb5.append("/sfiles/sppic1/cyber/cs/kevlar_helmet.png");
                } else if (kotlin.text.c.x("/sfiles/sppic1/cyber/cs/kevlar_helmet.png", "https://", false)) {
                    i6 = 0;
                    sb5.setLength(i6);
                    sb5.append("/sfiles/sppic1/cyber/cs/kevlar_helmet.png");
                } else {
                    if (sb5.length() <= 0 || StringsKt.S(sb5, Separators.SLASH)) {
                        c3 = '/';
                    } else {
                        c3 = '/';
                        sb5.append('/');
                    }
                    sb5.append(StringsKt.y0("/sfiles/sppic1/cyber/cs/kevlar_helmet.png", c3));
                }
                string3 = sb5.toString();
                i = 0;
            } else if (z) {
                sb = new StringBuilder(ujn.h);
                i = 0;
                if (StringsKt.O("/sfiles/sppic1/cyber/cs/kevlar.png", ujn.h, false)) {
                    sb.setLength(i);
                    sb.append("/sfiles/sppic1/cyber/cs/kevlar.png");
                } else if (kotlin.text.c.x("/sfiles/sppic1/cyber/cs/kevlar.png", "https://", false)) {
                    i = 0;
                    sb.setLength(i);
                    sb.append("/sfiles/sppic1/cyber/cs/kevlar.png");
                } else {
                    if (sb.length() > 0 || StringsKt.S(sb, Separators.SLASH)) {
                        c2 = '/';
                    } else {
                        c2 = '/';
                        sb.append('/');
                    }
                    i = 0;
                    sb.append(StringsKt.y0("/sfiles/sppic1/cyber/cs/kevlar.png", c2));
                }
                string3 = sb.toString();
            } else {
                i = 0;
                string3 = "";
            }
            str2 = (String) CollectionsKt.W(i, lc00VarA);
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2;
            }
            str4 = (String) CollectionsKt.W(1, lc00VarA);
            if (str4 == null) {
                str5 = "";
            } else {
                str5 = str4;
            }
            str6 = (String) CollectionsKt.W(2, lc00VarA);
            if (str6 == null) {
                str7 = "";
            } else {
                str7 = str6;
            }
            str8 = (String) CollectionsKt.W(3, lc00VarA);
            if (str8 == null) {
                str9 = "";
            } else {
                str9 = str8;
            }
            return new oqf(ank0VarF, str, string2, string3, str3, str5, str7, str9);
        }
        StringBuilder sb6 = new StringBuilder(ujn.h);
        int i7 = 0;
        if (StringsKt.O("/sfiles/sppic1/cyber/cs/defusekit.png", ujn.h, false)) {
            sb6.setLength(i7);
            sb6.append("/sfiles/sppic1/cyber/cs/defusekit.png");
        } else if (kotlin.text.c.x("/sfiles/sppic1/cyber/cs/defusekit.png", "https://", false)) {
            i7 = 0;
            sb6.setLength(i7);
            sb6.append("/sfiles/sppic1/cyber/cs/defusekit.png");
        } else {
            if (sb6.length() <= 0 || StringsKt.S(sb6, Separators.SLASH)) {
                c5 = '/';
            } else {
                c5 = '/';
                sb6.append('/');
            }
            sb6.append(StringsKt.y0("/sfiles/sppic1/cyber/cs/defusekit.png", c5));
        }
        string = sb6.toString();
        str = string;
        if (str10.length() > 0) {
            sb2 = new StringBuilder(ujn.h);
            strL = kng0.l("/sfiles/sppic1/cyber/cs/", str10, ".png");
            if (strL.length() == 0) {
                sb2.setLength(0);
            } else {
                i2 = 0;
                if (StringsKt.O(strL, ujn.h, false)) {
                    sb2.setLength(i2);
                    sb2.append(strL);
                } else if (kotlin.text.c.x(strL, "https://", false)) {
                    i2 = 0;
                    sb2.setLength(i2);
                    sb2.append(strL);
                } else {
                    if (sb2.length() > 0) {
                        c4 = '/';
                    } else {
                        c4 = '/';
                    }
                    sb2.append(StringsKt.y0(strL, c4));
                }
            }
            string2 = sb2.toString();
        } else {
            string2 = "";
        }
        z = nqfVar.b;
        if (!z) {
            if (z) {
                sb = new StringBuilder(ujn.h);
                i = 0;
                if (StringsKt.O("/sfiles/sppic1/cyber/cs/kevlar.png", ujn.h, false)) {
                    sb.setLength(i);
                    sb.append("/sfiles/sppic1/cyber/cs/kevlar.png");
                } else if (kotlin.text.c.x("/sfiles/sppic1/cyber/cs/kevlar.png", "https://", false)) {
                    i = 0;
                    sb.setLength(i);
                    sb.append("/sfiles/sppic1/cyber/cs/kevlar.png");
                } else {
                    if (sb.length() > 0) {
                        c2 = '/';
                    } else {
                        c2 = '/';
                    }
                    i = 0;
                    sb.append(StringsKt.y0("/sfiles/sppic1/cyber/cs/kevlar.png", c2));
                }
                string3 = sb.toString();
            } else {
                i = 0;
                string3 = "";
            }
        } else if (z) {
            sb = new StringBuilder(ujn.h);
            i = 0;
            if (StringsKt.O("/sfiles/sppic1/cyber/cs/kevlar.png", ujn.h, false)) {
                sb.setLength(i);
                sb.append("/sfiles/sppic1/cyber/cs/kevlar.png");
            } else if (kotlin.text.c.x("/sfiles/sppic1/cyber/cs/kevlar.png", "https://", false)) {
                i = 0;
                sb.setLength(i);
                sb.append("/sfiles/sppic1/cyber/cs/kevlar.png");
            } else {
                if (sb.length() > 0) {
                    c2 = '/';
                } else {
                    c2 = '/';
                }
                i = 0;
                sb.append(StringsKt.y0("/sfiles/sppic1/cyber/cs/kevlar.png", c2));
            }
            string3 = sb.toString();
        } else {
            i = 0;
            string3 = "";
        }
        str2 = (String) CollectionsKt.W(i, lc00VarA);
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        str4 = (String) CollectionsKt.W(1, lc00VarA);
        if (str4 == null) {
            str5 = "";
        } else {
            str5 = str4;
        }
        str6 = (String) CollectionsKt.W(2, lc00VarA);
        if (str6 == null) {
            str7 = "";
        } else {
            str7 = str6;
        }
        str8 = (String) CollectionsKt.W(3, lc00VarA);
        if (str8 == null) {
            str9 = "";
        } else {
            str9 = str8;
        }
        return new oqf(ank0VarF, str, string2, string3, str3, str5, str7, str9);
    }

    public static final void d(mm40 mm40Var, dkb dkbVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        function1.getClass();
        fetVar.g0(-858833262);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(dkbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
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
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar).e, 0.0f, xfn.a(fetVar).e, 0.0f, 10);
            hjm hjmVar = dkbVar.f6222a;
            kjm kjmVar = kjm.f18392a;
            int i3 = i2 & 896;
            boolean z2 = (i3 == 256) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new dib(function1, dkbVar);
                fetVar.o0(objP);
            }
            int i4 = i3;
            nkb.h(mm40VarN, hjmVar, kjmVar, null, (Function0) objP, null, fetVar, 384, 40);
            mm40 mm40VarI = s5x0.I(o7k0.d(jm40Var, 1.0f), s5x0.t(xfn.a(fetVar).c, 0.0f, 2));
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA2 = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), xx7Var, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarI);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            fetVar.e0(1794478566);
            for (goh gohVar : dkbVar.b) {
                foh fohVar = gohVar.f11632a;
                int i5 = i4;
                boolean z3 = i5 == 256;
                Object objP2 = fetVar.P();
                if (z3 || objP2 == cl5Var) {
                    objP2 = new xz8(function1, (byte) 29);
                    fetVar.o0(objP2);
                }
                dyb.j(gohVar, (Function1) objP2, null, fetVar, 9);
                i4 = i5;
            }
            ohs0.x(fetVar, false, true, true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sa5((byte) 22, i, (Object) mm40Var2, (Object) dkbVar, function1);
        }
    }

    public static final euh d0(c6u0 c6u0Var) {
        int i;
        c6u0Var.getClass();
        String str = c6u0Var.f3836a;
        switch (c6u0Var.b) {
            case 1:
                i = R.drawable.ic_yellow_tshirt;
                break;
            case 2:
                i = R.drawable.ic_green_tshirt;
                break;
            case 3:
                i = R.drawable.ic_red_tshirt;
                break;
            case 4:
                i = R.drawable.ic_blue_tshirt;
                break;
            case 5:
                i = R.drawable.ic_white_tshirt;
                break;
            case 6:
                i = R.drawable.ic_pink_tshirt;
                break;
            case 7:
                i = R.drawable.ic_orange_tshirt;
                break;
            case 8:
                i = R.drawable.ic_black_tshirt;
                break;
            case 9:
                i = R.drawable.ic_red_polka_dot_tshirt;
                break;
            case 10:
                i = R.drawable.ic_blue_polka_dot_tshirt;
                break;
            default:
                i = R.drawable.ic_unknown_tshirt;
                break;
        }
        return new euh(str, i);
    }

    public static final void e(final dk5 dk5Var, fet fetVar, int i) {
        dk5Var.getClass();
        fetVar.g0(997417364);
        int i2 = (fetVar.i(dk5Var) ? 4 : 2) | i;
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            final pz40 pz40VarQ = gkb.Q(vtb.N(dk5Var.c0), null, fetVar, 0, 7);
            final pz40 pz40VarQ2 = gkb.Q(vtb.N(dk5Var.h0), null, fetVar, 0, 7);
            final pz40 pz40VarO = gkb.O(new sj5(dk5Var.U, dk5Var, b), iun.f15405a, null, fetVar, 48, 14);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(Boolean.TRUE);
                fetVar.o0(objP);
            }
            final pz40 pz40Var = (pz40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP2);
            }
            final pz40 pz40Var2 = (pz40) objP2;
            final pz40 pz40VarQ3 = gkb.Q(vtb.N(dk5Var.e0), null, fetVar, 0, 7);
            final xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP3);
            }
            final pz40 pz40Var3 = (pz40) objP3;
            final d9d0 d9d0VarO = idx.O(fetVar);
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP4);
            }
            final vne vneVar = (vne) objP4;
            pk5 pk5Var = (pk5) pz40VarQ2.getValue();
            mk5 mk5Var = pk5Var instanceof mk5 ? (mk5) pk5Var : null;
            final boolean z = mk5Var != null && mk5Var.b;
            m8x.y(o2e.e0(jm40.b, "CompactListComponent"), u1c.M(1194327896, new ywa((Object) xczVarA, (Object) dk5Var, (Object) pz40VarQ, (byte) 14), fetVar), null, null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), 0L, null, u1c.M(-12406045, new xdr() { // from class: a.kbd
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    hh80 hh80Var = (hh80) obj;
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    hh80Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= fetVar2.g(hh80Var) ? 4 : 2;
                    }
                    if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                        float fD = hh80Var.d();
                        zcl zclVar = qmk.f28987a;
                        zq8.a(0, fetVar2, i120.Q(s5x0.N(jm40.b, 0.0f, fD + 168.0f + 24.0f, 0.0f, 0.0f, 13), ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), jd8.n).e(o7k0.c));
                        boolean z2 = z;
                        pz40 pz40Var4 = pz40Var;
                        pz40 pz40Var5 = pz40Var2;
                        boolean z3 = (!z2 || ((Boolean) pz40Var4.getValue()).booleanValue() || ((Boolean) pz40Var5.getValue()).booleanValue()) ? false : true;
                        pz40 pz40Var6 = pz40Var3;
                        boolean zBooleanValue = ((Boolean) pz40Var6.getValue()).booleanValue();
                        vne vneVar2 = vneVar;
                        boolean zI = fetVar2.i(vneVar2);
                        dk5 dk5Var2 = dk5Var;
                        boolean zI2 = zI | fetVar2.i(dk5Var2);
                        Object objP5 = fetVar2.P();
                        if (zI2 || objP5 == ukd.f35823a) {
                            objP5 = new kk0(vneVar2, dk5Var2, pz40Var6, (byte) 16);
                            fetVar2.o0(objP5);
                        }
                        Function0 function0 = (Function0) objP5;
                        xcz xczVar = xczVarA;
                        l7m0 l7m0Var = pz40VarQ;
                        l7m0 l7m0Var2 = pz40VarQ3;
                        pz40 pz40Var7 = pz40VarQ2;
                        d9d0 d9d0Var = d9d0VarO;
                        ucx.C(12582912, null, u1c.M(425018651, new qk7(hh80Var, pz40Var5, xczVar, l7m0Var, dk5Var2, l7m0Var2, pz40Var7, vneVar2, d9d0Var, pz40VarO, pz40Var4, pz40Var6), fetVar2), null, fetVar2, null, d9d0Var, function0, zBooleanValue, z3);
                    } else {
                        fetVar2.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 805306422, 444);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gj5(dk5Var, i, (byte) 3);
        }
    }

    public static final n3w e0(vw4 vw4Var, HistoryTypeModel historyTypeModel, String str, boolean z, boolean z2, boolean z3, List list, boolean z4, List list2, boolean z5, boolean z6) {
        e4f e4fVar;
        Iterator it;
        uoy uoyVar;
        lb90 lb90Var;
        Object next;
        boolean z7;
        vw4Var.getClass();
        list.getClass();
        list2.getClass();
        String str2 = vw4Var.f38130a;
        s77 s77VarM = hp4.M(historyTypeModel);
        long j = vw4Var.h;
        double d = vw4Var.e;
        String str3 = vw4Var.i;
        long j2 = vw4Var.d;
        double d2 = vw4Var.j;
        int iOrdinal = vw4Var.g.ordinal();
        if (iOrdinal == 0) {
            e4fVar = e4f.b;
        } else if (iOrdinal == 1) {
            e4fVar = e4f.k;
        } else if (iOrdinal == 2) {
            e4fVar = e4f.l;
        } else {
            if (iOrdinal != 3) {
                t9f.b();
                return null;
            }
            e4fVar = e4f.m;
        }
        e4f e4fVar2 = e4fVar;
        double d3 = vw4Var.k;
        double d4 = vw4Var.l;
        double d5 = vw4Var.f;
        double d6 = vw4Var.c;
        lb90 lb90Var2 = vw4Var.m;
        double d7 = vw4Var.n;
        double d8 = vw4Var.o;
        boolean z8 = vw4Var.p;
        double d9 = vw4Var.q;
        int i = vw4Var.r;
        int i2 = vw4Var.s;
        int i3 = vw4Var.t;
        double d10 = vw4Var.u;
        boolean z9 = vw4Var.v;
        double d11 = vw4Var.w;
        q4f q4fVar = vw4Var.b;
        v21 v21Var = v21.NONE;
        r21 r21Var = r21.NONE;
        boolean z10 = vw4Var.x;
        String str4 = vw4Var.y;
        String str5 = vw4Var.z;
        double d12 = vw4Var.A;
        boolean z11 = vw4Var.B;
        double d13 = vw4Var.C;
        String str6 = vw4Var.D;
        boolean z12 = vw4Var.E;
        boolean z13 = vw4Var.F;
        boolean z14 = vw4Var.G;
        boolean z15 = vw4Var.H;
        double d14 = vw4Var.I;
        hxu hxuVar = vw4Var.J;
        nob0 nob0Var = vw4Var.K;
        lb90 lb90Var3 = lb90Var2;
        mob0 mob0Var = new mob0(nob0Var.f23860a, nob0Var.b, nob0Var.c, nob0Var.d, nob0Var.e);
        long j3 = vw4Var.L;
        String str7 = vw4Var.M;
        uoy uoyVar2 = vw4Var.N;
        long j4 = vw4Var.O;
        double d15 = vw4Var.P;
        double d16 = vw4Var.Q;
        boolean z16 = vw4Var.R;
        boolean z17 = vw4Var.S;
        List list3 = vw4Var.T;
        ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
        Iterator it2 = list3.iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            Object next2 = it2.next();
            int i5 = i4 + 1;
            if (i4 < 0) {
                q3d.p();
                throw null;
            }
            z0w z0wVar = (z0w) next2;
            Iterator it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    it = it2;
                    uoyVar = uoyVar2;
                    lb90Var = lb90Var3;
                    next = null;
                    break;
                }
                next = it3.next();
                it = it2;
                uoyVar = uoyVar2;
                lb90Var = lb90Var3;
                if (((xco) next).f40655a == z0wVar.F) {
                    break;
                }
                it2 = it;
                lb90Var3 = lb90Var;
                uoyVar2 = uoyVar;
            }
            xco xcoVar = (xco) next;
            String str8 = xcoVar != null ? xcoVar.b : null;
            if (str8 == null) {
                str8 = "";
            }
            String strV = V(z3, z4, list, str8, vw4Var.T, i4, z5, z6);
            int iG0 = gq80.g0(z0wVar.v, list);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                double d17 = d;
                if (((xco) obj).e) {
                    arrayList2.add(obj);
                }
                d = d17;
            }
            double d18 = d;
            if (arrayList2.isEmpty()) {
                z7 = false;
                break;
            }
            Iterator it4 = arrayList2.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    z7 = false;
                    break;
                }
                Iterator it5 = it4;
                if (((xco) it4.next()).f40655a == z0wVar.F) {
                    z7 = true;
                    break;
                }
                it4 = it5;
            }
            arrayList.add(ju70.W(z0wVar, strV, iG0, z7, false));
            i4 = i5;
            it2 = it;
            lb90Var3 = lb90Var;
            uoyVar2 = uoyVar;
            d = d18;
        }
        return new n3w(str2, str2, s77VarM, j, d, str3, str, "", "", j2, d2, e4fVar2, d3, d4, d5, d6, lb90Var3, d7, d8, z8, "set", d9, false, "", i, i2, i3, d10, z9, d11, false, q4fVar, v21Var, r21Var, z, z10, str4, str5, d12, z11, d13, str6, z2, z12, z13, z14, false, z15, z15, d14, hxuVar, mob0Var, j3, str7, uoyVar2, j4, d15, d16, z16, z17, arrayList, qjj.Z(vw4Var.U), vw4Var.V, vw4Var.W, 0L, vw4Var.X);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0122  */
    /* JADX WARN: Code duplicated, block: B:103:0x012b  */
    /* JADX WARN: Code duplicated, block: B:105:0x012e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0131  */
    /* JADX WARN: Code duplicated, block: B:108:0x0133  */
    /* JADX WARN: Code duplicated, block: B:110:0x0137  */
    /* JADX WARN: Code duplicated, block: B:112:0x013e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0155  */
    /* JADX WARN: Code duplicated, block: B:116:0x0162  */
    /* JADX WARN: Code duplicated, block: B:118:0x0166  */
    /* JADX WARN: Code duplicated, block: B:120:0x0174 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x017f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0185 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x018e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0192 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x019b  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:137:0x01ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x01b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:140:0x01b3 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:142:0x01ba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:145:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:151:0x01df A[LOOP:0: B:150:0x01dd->B:151:0x01df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:157:0x020f  */
    /* JADX WARN: Code duplicated, block: B:158:0x0213  */
    /* JADX WARN: Code duplicated, block: B:160:0x0216  */
    /* JADX WARN: Code duplicated, block: B:162:0x023a  */
    /* JADX WARN: Code duplicated, block: B:164:0x0245  */
    /* JADX WARN: Code duplicated, block: B:166:0x0255  */
    /* JADX WARN: Code duplicated, block: B:167:0x0259  */
    /* JADX WARN: Code duplicated, block: B:169:0x025c  */
    /* JADX WARN: Code duplicated, block: B:170:0x025f  */
    /* JADX WARN: Code duplicated, block: B:173:0x029a  */
    /* JADX WARN: Code duplicated, block: B:175:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:177:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:180:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:90:0x0100  */
    /* JADX WARN: Code duplicated, block: B:97:0x0119 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x011b  */
    public static final void f(mm40 mm40Var, final bml bmlVar, d9z d9zVar, final hh80 hh80Var, Function0 function0, Function1 function1, Function1 function2, Function1 function3, fet fetVar, final int i, final int i2) {
        mm40 mm40Var2;
        int i3;
        d9z d9zVarA;
        hh80 hh80Var2;
        Function0 function4;
        int i4;
        Function1 function5;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        final Function1 function6;
        final mm40 mm40Var3;
        final d9z d9zVar2;
        final Function0 function7;
        final Function1 function8;
        final Function1 function9;
        yfe0 yfe0VarU;
        Function1 function10;
        Function1 function11;
        Function1 function12;
        d9z d9zVar3;
        int i10;
        pt0 type;
        pt0 pt0Var;
        int iO;
        pt0 pt0Var2;
        pt0 pt0Var3;
        d9z d9zVar4;
        pt0 pt0Var4;
        mm40 mm40Var4;
        int iO2;
        ArrayList arrayList;
        int i11;
        List list;
        yll yllVarA;
        mm40 mm40Var5;
        mm40 mm40Var6;
        aml amlVar;
        boolean z2;
        d9z d9zVar5;
        Function0 function13;
        aml amlVar2;
        fet fetVar2 = fetVar;
        bmlVar.getClass();
        fetVar2.g0(873864811);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar2.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar2.g(bmlVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                d9zVarA = d9zVar;
                int i13 = fetVar2.g(d9zVarA) ? 256 : 128;
                i3 |= i13;
            } else {
                d9zVarA = d9zVar;
            }
            i3 |= i13;
        } else {
            d9zVarA = d9zVar;
        }
        if ((i & 3072) == 0) {
            hh80Var2 = hh80Var;
            i3 |= fetVar2.g(hh80Var2) ? 2048 : 1024;
        } else {
            hh80Var2 = hh80Var;
        }
        int i14 = i2 & 16;
        if (i14 == 0) {
            if ((i & 24576) == 0) {
                function4 = function0;
                i3 |= fetVar2.i(function4) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    function5 = function1;
                    if (fetVar2.i(function5)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    if ((1572864 & i) == 0) {
                        if (fetVar2.i(function2)) {
                            i7 = 1048576;
                        } else {
                            i7 = 524288;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 128;
                    if (i8 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (fetVar2.i(function3)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 4793491) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar2.U(i3 & 1, z)) {
                        fetVar2.Z();
                        if ((i & 1) != 0 || fetVar2.B()) {
                            if (i12 != 0) {
                                mm40Var2 = jm40.b;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                                d9zVarA = f9z.a(fetVar2);
                            }
                            if (i14 != 0) {
                                function4 = null;
                            }
                            if (i4 != 0) {
                                function5 = null;
                            }
                            if (i6 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i8 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            function12 = function10;
                            d9zVar3 = d9zVarA;
                        } else {
                            fetVar2.X();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            function11 = function3;
                            mm40Var2 = mm40Var2;
                            d9zVar3 = d9zVarA;
                            function4 = function4;
                            function5 = function5;
                            function12 = function2;
                        }
                        fetVar2.s();
                        i10 = ((Configuration) fetVar2.k(dy2.f6873a)).screenWidthDp;
                        if (bmlVar instanceof zll) {
                            list = ((zll) bmlVar).c;
                            d9zVar4 = d9zVar3;
                            mm40Var4 = mm40Var2;
                        } else {
                            if (bmlVar instanceof aml) {
                                t9f.b();
                                return;
                            }
                            type = bmlVar.getType();
                            boolean z3 = bmlVar.a() instanceof wll;
                            pt0Var = pt0.f27539a;
                            if (type == pt0Var || !z3) {
                                iO = 6;
                                pt0Var2 = pt0.b;
                                if (type == pt0Var2 || !z3) {
                                    pt0Var3 = pt0.c;
                                    if (type == pt0Var3 || !z3) {
                                        d9zVar4 = d9zVar3;
                                        pt0Var4 = pt0.d;
                                        if (type == pt0Var4 || !z3) {
                                            mm40Var4 = mm40Var2;
                                            if (type == pt0.e || !z3) {
                                                if (type != pt0Var || type == pt0Var2) {
                                                    iO2 = O(type, i10);
                                                } else if (type == pt0Var3) {
                                                    iO = O(type, i10) * 6;
                                                } else if (type == pt0Var4) {
                                                    iO2 = O(type, i10);
                                                } else {
                                                    iO = O(type, i10) * 8;
                                                }
                                                iO = iO2 * 4;
                                            } else {
                                                iO = 9;
                                            }
                                        }
                                    } else {
                                        d9zVar4 = d9zVar3;
                                        mm40Var4 = mm40Var2;
                                        iO = 4;
                                    }
                                } else {
                                    d9zVar4 = d9zVar3;
                                }
                                mm40Var4 = mm40Var2;
                            } else {
                                d9zVar4 = d9zVar3;
                                mm40Var4 = mm40Var2;
                                iO = 6;
                            }
                            arrayList = new ArrayList(iO);
                            for (i11 = 0; i11 < iO; i11++) {
                                arrayList.add(new fp1());
                            }
                            list = arrayList;
                        }
                        yllVarA = bmlVar.a();
                        if (yllVarA instanceof wll) {
                            fetVar2.e0(1510792812);
                            pt0 type2 = bmlVar.getType();
                            p0s p0sVar = ((wll) yllVarA).f39359a;
                            if (bmlVar instanceof aml) {
                                amlVar2 = (aml) bmlVar;
                            } else {
                                amlVar2 = null;
                            }
                            boolean z4 = amlVar2 != null ? amlVar2.c : true;
                            int i15 = i3 & 14;
                            int i16 = i3 << 3;
                            mm40Var6 = mm40Var4;
                            g(mm40Var6, list, type2, p0sVar, hh80Var2, z4, function5, function12, function11, fetVar2, (29360128 & i16) | (3670016 & i16) | (57344 & i16) | i15 | (234881024 & i16));
                            fetVar2.r(false);
                            d9zVar5 = d9zVar4;
                            function13 = function4;
                        } else {
                            mm40Var5 = mm40Var4;
                            if (Intrinsics.d(yllVarA, xll.f41078a)) {
                                throw b1j.f(-2029478060, fetVar2, false);
                            }
                            fetVar2.e0(1511403109);
                            mm40Var6 = mm40Var5;
                            pt0 type3 = bmlVar.getType();
                            if (bmlVar instanceof aml) {
                                amlVar = (aml) bmlVar;
                            } else {
                                amlVar = null;
                            }
                            if (amlVar != null) {
                                z2 = amlVar.c;
                            } else {
                                z2 = true;
                            }
                            int i17 = i3 << 3;
                            int i18 = (i17 & 57344) | (i17 & 7168) | (i3 & 14);
                            int i19 = i3 << 6;
                            d9zVar5 = d9zVar4;
                            Function1 function14 = function11;
                            Function1 function15 = function12;
                            Function1 function16 = function5;
                            Function0 function17 = function4;
                            h(mm40Var6, list, type3, d9zVar5, hh80Var, z2, function17, function16, function15, function14, fetVar2, i18 | (i19 & 3670016) | (i19 & 29360128) | (i19 & 234881024) | (i19 & 1879048192));
                            function13 = function17;
                            function5 = function16;
                            function12 = function15;
                            function11 = function14;
                            fetVar2 = fetVar2;
                            fetVar2.r(false);
                        }
                        function7 = function13;
                        mm40Var3 = mm40Var6;
                        d9zVar2 = d9zVar5;
                        function8 = function5;
                        function9 = function12;
                        function6 = function11;
                    } else {
                        fetVar2.X();
                        function6 = function3;
                        mm40Var3 = mm40Var2;
                        d9zVar2 = d9zVarA;
                        function7 = function4;
                        function8 = function5;
                        function9 = function2;
                    }
                    yfe0VarU = fetVar2.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.ull
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                ckb.f(mm40Var3, bmlVar, d9zVar2, hh80Var, function7, function8, function9, function6, (fet) obj, x8x.L(i | 1), i2);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i3 |= 1572864;
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (fetVar2.i(function3)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i3 & 4793491) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar2.U(i3 & 1, z)) {
                    fetVar2.Z();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            mm40Var2 = jm40.b;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            d9zVarA = f9z.a(fetVar2);
                        }
                        if (i14 != 0) {
                            function4 = null;
                        }
                        if (i4 != 0) {
                            function5 = null;
                        }
                        if (i6 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i8 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        function12 = function10;
                        d9zVar3 = d9zVarA;
                    } else {
                        if (i12 != 0) {
                            mm40Var2 = jm40.b;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            d9zVarA = f9z.a(fetVar2);
                        }
                        if (i14 != 0) {
                            function4 = null;
                        }
                        if (i4 != 0) {
                            function5 = null;
                        }
                        if (i6 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i8 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        function12 = function10;
                        d9zVar3 = d9zVarA;
                    }
                    fetVar2.s();
                    i10 = ((Configuration) fetVar2.k(dy2.f6873a)).screenWidthDp;
                    if (bmlVar instanceof zll) {
                        list = ((zll) bmlVar).c;
                        d9zVar4 = d9zVar3;
                        mm40Var4 = mm40Var2;
                    } else {
                        if (bmlVar instanceof aml) {
                            t9f.b();
                            return;
                        }
                        type = bmlVar.getType();
                        boolean z5 = bmlVar.a() instanceof wll;
                        pt0Var = pt0.f27539a;
                        if (type == pt0Var) {
                            iO = 6;
                            pt0Var2 = pt0.b;
                            if (type == pt0Var2) {
                                pt0Var3 = pt0.c;
                                if (type == pt0Var3) {
                                    d9zVar4 = d9zVar3;
                                    pt0Var4 = pt0.d;
                                    if (type == pt0Var4) {
                                    }
                                    mm40Var4 = mm40Var2;
                                    if (type == pt0.e) {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    } else {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    }
                                } else {
                                    d9zVar4 = d9zVar3;
                                    pt0Var4 = pt0.d;
                                    if (type == pt0Var4) {
                                    }
                                    mm40Var4 = mm40Var2;
                                    if (type == pt0.e) {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    } else {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    }
                                }
                            } else {
                                pt0Var3 = pt0.c;
                                if (type == pt0Var3) {
                                    d9zVar4 = d9zVar3;
                                    pt0Var4 = pt0.d;
                                    if (type == pt0Var4) {
                                    }
                                    mm40Var4 = mm40Var2;
                                    if (type == pt0.e) {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    } else {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    }
                                } else {
                                    d9zVar4 = d9zVar3;
                                    pt0Var4 = pt0.d;
                                    if (type == pt0Var4) {
                                    }
                                    mm40Var4 = mm40Var2;
                                    if (type == pt0.e) {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    } else {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    }
                                }
                            }
                        } else {
                            iO = 6;
                            pt0Var2 = pt0.b;
                            if (type == pt0Var2) {
                                pt0Var3 = pt0.c;
                                if (type == pt0Var3) {
                                    d9zVar4 = d9zVar3;
                                    pt0Var4 = pt0.d;
                                    if (type == pt0Var4) {
                                    }
                                    mm40Var4 = mm40Var2;
                                    if (type == pt0.e) {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    } else {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    }
                                } else {
                                    d9zVar4 = d9zVar3;
                                    pt0Var4 = pt0.d;
                                    if (type == pt0Var4) {
                                    }
                                    mm40Var4 = mm40Var2;
                                    if (type == pt0.e) {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    } else {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    }
                                }
                            } else {
                                pt0Var3 = pt0.c;
                                if (type == pt0Var3) {
                                    d9zVar4 = d9zVar3;
                                    pt0Var4 = pt0.d;
                                    if (type == pt0Var4) {
                                    }
                                    mm40Var4 = mm40Var2;
                                    if (type == pt0.e) {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    } else {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    }
                                } else {
                                    d9zVar4 = d9zVar3;
                                    pt0Var4 = pt0.d;
                                    if (type == pt0Var4) {
                                    }
                                    mm40Var4 = mm40Var2;
                                    if (type == pt0.e) {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    } else {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    }
                                }
                            }
                        }
                        arrayList = new ArrayList(iO);
                        while (i11 < iO) {
                            arrayList.add(new fp1());
                        }
                        list = arrayList;
                    }
                    yllVarA = bmlVar.a();
                    if (yllVarA instanceof wll) {
                        fetVar2.e0(1510792812);
                        pt0 type4 = bmlVar.getType();
                        p0s p0sVar2 = ((wll) yllVarA).f39359a;
                        if (bmlVar instanceof aml) {
                            amlVar2 = (aml) bmlVar;
                        } else {
                            amlVar2 = null;
                        }
                        if (amlVar2 != null) {
                        }
                        int i110 = i3 & 14;
                        int i111 = i3 << 3;
                        mm40Var6 = mm40Var4;
                        g(mm40Var6, list, type4, p0sVar2, hh80Var2, z4, function5, function12, function11, fetVar2, (29360128 & i111) | (3670016 & i111) | (57344 & i111) | i110 | (234881024 & i111));
                        fetVar2.r(false);
                        d9zVar5 = d9zVar4;
                        function13 = function4;
                    } else {
                        mm40Var5 = mm40Var4;
                        if (Intrinsics.d(yllVarA, xll.f41078a)) {
                            throw b1j.f(-2029478060, fetVar2, false);
                        }
                        fetVar2.e0(1511403109);
                        mm40Var6 = mm40Var5;
                        pt0 type5 = bmlVar.getType();
                        if (bmlVar instanceof aml) {
                            amlVar = (aml) bmlVar;
                        } else {
                            amlVar = null;
                        }
                        if (amlVar != null) {
                            z2 = amlVar.c;
                        } else {
                            z2 = true;
                        }
                        int i112 = i3 << 3;
                        int i113 = (i112 & 57344) | (i112 & 7168) | (i3 & 14);
                        int i114 = i3 << 6;
                        d9zVar5 = d9zVar4;
                        Function1 function18 = function11;
                        Function1 function19 = function12;
                        Function1 function110 = function5;
                        Function0 function111 = function4;
                        h(mm40Var6, list, type5, d9zVar5, hh80Var, z2, function111, function110, function19, function18, fetVar2, i113 | (i114 & 3670016) | (i114 & 29360128) | (i114 & 234881024) | (i114 & 1879048192));
                        function13 = function111;
                        function5 = function110;
                        function12 = function19;
                        function11 = function18;
                        fetVar2 = fetVar2;
                        fetVar2.r(false);
                    }
                    function7 = function13;
                    mm40Var3 = mm40Var6;
                    d9zVar2 = d9zVar5;
                    function8 = function5;
                    function9 = function12;
                    function6 = function11;
                } else {
                    fetVar2.X();
                    function6 = function3;
                    mm40Var3 = mm40Var2;
                    d9zVar2 = d9zVarA;
                    function7 = function4;
                    function8 = function5;
                    function9 = function2;
                }
                yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.ull
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ckb.f(mm40Var3, bmlVar, d9zVar2, hh80Var, function7, function8, function9, function6, (fet) obj, x8x.L(i | 1), i2);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i3 |= 196608;
            function5 = function1;
            i6 = i2 & 64;
            if (i6 != 0) {
                if ((1572864 & i) == 0) {
                    if (fetVar2.i(function2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (fetVar2.i(function3)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i3 & 4793491) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar2.U(i3 & 1, z)) {
                    fetVar2.Z();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            mm40Var2 = jm40.b;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            d9zVarA = f9z.a(fetVar2);
                        }
                        if (i14 != 0) {
                            function4 = null;
                        }
                        if (i4 != 0) {
                            function5 = null;
                        }
                        if (i6 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i8 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        function12 = function10;
                        d9zVar3 = d9zVarA;
                    } else {
                        if (i12 != 0) {
                            mm40Var2 = jm40.b;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            d9zVarA = f9z.a(fetVar2);
                        }
                        if (i14 != 0) {
                            function4 = null;
                        }
                        if (i4 != 0) {
                            function5 = null;
                        }
                        if (i6 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i8 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        function12 = function10;
                        d9zVar3 = d9zVarA;
                    }
                    fetVar2.s();
                    i10 = ((Configuration) fetVar2.k(dy2.f6873a)).screenWidthDp;
                    if (bmlVar instanceof zll) {
                        list = ((zll) bmlVar).c;
                        d9zVar4 = d9zVar3;
                        mm40Var4 = mm40Var2;
                    } else {
                        if (bmlVar instanceof aml) {
                            t9f.b();
                            return;
                        }
                        type = bmlVar.getType();
                        boolean z6 = bmlVar.a() instanceof wll;
                        pt0Var = pt0.f27539a;
                        if (type == pt0Var) {
                            iO = 6;
                            pt0Var2 = pt0.b;
                            if (type == pt0Var2) {
                                pt0Var3 = pt0.c;
                                if (type == pt0Var3) {
                                    d9zVar4 = d9zVar3;
                                    pt0Var4 = pt0.d;
                                    if (type == pt0Var4) {
                                    }
                                    mm40Var4 = mm40Var2;
                                    if (type == pt0.e) {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    } else {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    }
                                } else {
                                    d9zVar4 = d9zVar3;
                                    pt0Var4 = pt0.d;
                                    if (type == pt0Var4) {
                                    }
                                    mm40Var4 = mm40Var2;
                                    if (type == pt0.e) {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    } else {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    }
                                }
                            } else {
                                pt0Var3 = pt0.c;
                                if (type == pt0Var3) {
                                    d9zVar4 = d9zVar3;
                                    pt0Var4 = pt0.d;
                                    if (type == pt0Var4) {
                                    }
                                    mm40Var4 = mm40Var2;
                                    if (type == pt0.e) {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    } else {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    }
                                } else {
                                    d9zVar4 = d9zVar3;
                                    pt0Var4 = pt0.d;
                                    if (type == pt0Var4) {
                                    }
                                    mm40Var4 = mm40Var2;
                                    if (type == pt0.e) {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    } else {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    }
                                }
                            }
                        } else {
                            iO = 6;
                            pt0Var2 = pt0.b;
                            if (type == pt0Var2) {
                                pt0Var3 = pt0.c;
                                if (type == pt0Var3) {
                                    d9zVar4 = d9zVar3;
                                    pt0Var4 = pt0.d;
                                    if (type == pt0Var4) {
                                    }
                                    mm40Var4 = mm40Var2;
                                    if (type == pt0.e) {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    } else {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    }
                                } else {
                                    d9zVar4 = d9zVar3;
                                    pt0Var4 = pt0.d;
                                    if (type == pt0Var4) {
                                    }
                                    mm40Var4 = mm40Var2;
                                    if (type == pt0.e) {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    } else {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    }
                                }
                            } else {
                                pt0Var3 = pt0.c;
                                if (type == pt0Var3) {
                                    d9zVar4 = d9zVar3;
                                    pt0Var4 = pt0.d;
                                    if (type == pt0Var4) {
                                    }
                                    mm40Var4 = mm40Var2;
                                    if (type == pt0.e) {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    } else {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    }
                                } else {
                                    d9zVar4 = d9zVar3;
                                    pt0Var4 = pt0.d;
                                    if (type == pt0Var4) {
                                    }
                                    mm40Var4 = mm40Var2;
                                    if (type == pt0.e) {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    } else {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    }
                                }
                            }
                        }
                        arrayList = new ArrayList(iO);
                        while (i11 < iO) {
                            arrayList.add(new fp1());
                        }
                        list = arrayList;
                    }
                    yllVarA = bmlVar.a();
                    if (yllVarA instanceof wll) {
                        fetVar2.e0(1510792812);
                        pt0 type6 = bmlVar.getType();
                        p0s p0sVar3 = ((wll) yllVarA).f39359a;
                        if (bmlVar instanceof aml) {
                            amlVar2 = (aml) bmlVar;
                        } else {
                            amlVar2 = null;
                        }
                        if (amlVar2 != null) {
                        }
                        int i115 = i3 & 14;
                        int i116 = i3 << 3;
                        mm40Var6 = mm40Var4;
                        g(mm40Var6, list, type6, p0sVar3, hh80Var2, z4, function5, function12, function11, fetVar2, (29360128 & i116) | (3670016 & i116) | (57344 & i116) | i115 | (234881024 & i116));
                        fetVar2.r(false);
                        d9zVar5 = d9zVar4;
                        function13 = function4;
                    } else {
                        mm40Var5 = mm40Var4;
                        if (Intrinsics.d(yllVarA, xll.f41078a)) {
                            throw b1j.f(-2029478060, fetVar2, false);
                        }
                        fetVar2.e0(1511403109);
                        mm40Var6 = mm40Var5;
                        pt0 type7 = bmlVar.getType();
                        if (bmlVar instanceof aml) {
                            amlVar = (aml) bmlVar;
                        } else {
                            amlVar = null;
                        }
                        if (amlVar != null) {
                            z2 = amlVar.c;
                        } else {
                            z2 = true;
                        }
                        int i117 = i3 << 3;
                        int i118 = (i117 & 57344) | (i117 & 7168) | (i3 & 14);
                        int i119 = i3 << 6;
                        d9zVar5 = d9zVar4;
                        Function1 function112 = function11;
                        Function1 function113 = function12;
                        Function1 function114 = function5;
                        Function0 function115 = function4;
                        h(mm40Var6, list, type7, d9zVar5, hh80Var, z2, function115, function114, function113, function112, fetVar2, i118 | (i119 & 3670016) | (i119 & 29360128) | (i119 & 234881024) | (i119 & 1879048192));
                        function13 = function115;
                        function5 = function114;
                        function12 = function113;
                        function11 = function112;
                        fetVar2 = fetVar2;
                        fetVar2.r(false);
                    }
                    function7 = function13;
                    mm40Var3 = mm40Var6;
                    d9zVar2 = d9zVar5;
                    function8 = function5;
                    function9 = function12;
                    function6 = function11;
                } else {
                    fetVar2.X();
                    function6 = function3;
                    mm40Var3 = mm40Var2;
                    d9zVar2 = d9zVarA;
                    function7 = function4;
                    function8 = function5;
                    function9 = function2;
                }
                yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.ull
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ckb.f(mm40Var3, bmlVar, d9zVar2, hh80Var, function7, function8, function9, function6, (fet) obj, x8x.L(i | 1), i2);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i3 |= 1572864;
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (fetVar2.i(function3)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            if ((i3 & 4793491) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar2.U(i3 & 1, z)) {
                fetVar2.Z();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        mm40Var2 = jm40.b;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        d9zVarA = f9z.a(fetVar2);
                    }
                    if (i14 != 0) {
                        function4 = null;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if (i6 != 0) {
                        function10 = null;
                    } else {
                        function10 = function2;
                    }
                    if (i8 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    function12 = function10;
                    d9zVar3 = d9zVarA;
                } else {
                    if (i12 != 0) {
                        mm40Var2 = jm40.b;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        d9zVarA = f9z.a(fetVar2);
                    }
                    if (i14 != 0) {
                        function4 = null;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if (i6 != 0) {
                        function10 = null;
                    } else {
                        function10 = function2;
                    }
                    if (i8 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    function12 = function10;
                    d9zVar3 = d9zVarA;
                }
                fetVar2.s();
                i10 = ((Configuration) fetVar2.k(dy2.f6873a)).screenWidthDp;
                if (bmlVar instanceof zll) {
                    list = ((zll) bmlVar).c;
                    d9zVar4 = d9zVar3;
                    mm40Var4 = mm40Var2;
                } else {
                    if (bmlVar instanceof aml) {
                        t9f.b();
                        return;
                    }
                    type = bmlVar.getType();
                    boolean z7 = bmlVar.a() instanceof wll;
                    pt0Var = pt0.f27539a;
                    if (type == pt0Var) {
                        iO = 6;
                        pt0Var2 = pt0.b;
                        if (type == pt0Var2) {
                            pt0Var3 = pt0.c;
                            if (type == pt0Var3) {
                                d9zVar4 = d9zVar3;
                                pt0Var4 = pt0.d;
                                if (type == pt0Var4) {
                                }
                                mm40Var4 = mm40Var2;
                                if (type == pt0.e) {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                } else {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                }
                            } else {
                                d9zVar4 = d9zVar3;
                                pt0Var4 = pt0.d;
                                if (type == pt0Var4) {
                                }
                                mm40Var4 = mm40Var2;
                                if (type == pt0.e) {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                } else {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                }
                            }
                        } else {
                            pt0Var3 = pt0.c;
                            if (type == pt0Var3) {
                                d9zVar4 = d9zVar3;
                                pt0Var4 = pt0.d;
                                if (type == pt0Var4) {
                                }
                                mm40Var4 = mm40Var2;
                                if (type == pt0.e) {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                } else {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                }
                            } else {
                                d9zVar4 = d9zVar3;
                                pt0Var4 = pt0.d;
                                if (type == pt0Var4) {
                                }
                                mm40Var4 = mm40Var2;
                                if (type == pt0.e) {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                } else {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                }
                            }
                        }
                    } else {
                        iO = 6;
                        pt0Var2 = pt0.b;
                        if (type == pt0Var2) {
                            pt0Var3 = pt0.c;
                            if (type == pt0Var3) {
                                d9zVar4 = d9zVar3;
                                pt0Var4 = pt0.d;
                                if (type == pt0Var4) {
                                }
                                mm40Var4 = mm40Var2;
                                if (type == pt0.e) {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                } else {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                }
                            } else {
                                d9zVar4 = d9zVar3;
                                pt0Var4 = pt0.d;
                                if (type == pt0Var4) {
                                }
                                mm40Var4 = mm40Var2;
                                if (type == pt0.e) {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                } else {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                }
                            }
                        } else {
                            pt0Var3 = pt0.c;
                            if (type == pt0Var3) {
                                d9zVar4 = d9zVar3;
                                pt0Var4 = pt0.d;
                                if (type == pt0Var4) {
                                }
                                mm40Var4 = mm40Var2;
                                if (type == pt0.e) {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                } else {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                }
                            } else {
                                d9zVar4 = d9zVar3;
                                pt0Var4 = pt0.d;
                                if (type == pt0Var4) {
                                }
                                mm40Var4 = mm40Var2;
                                if (type == pt0.e) {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                } else {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                }
                            }
                        }
                    }
                    arrayList = new ArrayList(iO);
                    while (i11 < iO) {
                        arrayList.add(new fp1());
                    }
                    list = arrayList;
                }
                yllVarA = bmlVar.a();
                if (yllVarA instanceof wll) {
                    fetVar2.e0(1510792812);
                    pt0 type8 = bmlVar.getType();
                    p0s p0sVar4 = ((wll) yllVarA).f39359a;
                    if (bmlVar instanceof aml) {
                        amlVar2 = (aml) bmlVar;
                    } else {
                        amlVar2 = null;
                    }
                    if (amlVar2 != null) {
                    }
                    int i1110 = i3 & 14;
                    int i1111 = i3 << 3;
                    mm40Var6 = mm40Var4;
                    g(mm40Var6, list, type8, p0sVar4, hh80Var2, z4, function5, function12, function11, fetVar2, (29360128 & i1111) | (3670016 & i1111) | (57344 & i1111) | i1110 | (234881024 & i1111));
                    fetVar2.r(false);
                    d9zVar5 = d9zVar4;
                    function13 = function4;
                } else {
                    mm40Var5 = mm40Var4;
                    if (Intrinsics.d(yllVarA, xll.f41078a)) {
                        throw b1j.f(-2029478060, fetVar2, false);
                    }
                    fetVar2.e0(1511403109);
                    mm40Var6 = mm40Var5;
                    pt0 type9 = bmlVar.getType();
                    if (bmlVar instanceof aml) {
                        amlVar = (aml) bmlVar;
                    } else {
                        amlVar = null;
                    }
                    if (amlVar != null) {
                        z2 = amlVar.c;
                    } else {
                        z2 = true;
                    }
                    int i1112 = i3 << 3;
                    int i1113 = (i1112 & 57344) | (i1112 & 7168) | (i3 & 14);
                    int i1114 = i3 << 6;
                    d9zVar5 = d9zVar4;
                    Function1 function116 = function11;
                    Function1 function117 = function12;
                    Function1 function118 = function5;
                    Function0 function119 = function4;
                    h(mm40Var6, list, type9, d9zVar5, hh80Var, z2, function119, function118, function117, function116, fetVar2, i1113 | (i1114 & 3670016) | (i1114 & 29360128) | (i1114 & 234881024) | (i1114 & 1879048192));
                    function13 = function119;
                    function5 = function118;
                    function12 = function117;
                    function11 = function116;
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                }
                function7 = function13;
                mm40Var3 = mm40Var6;
                d9zVar2 = d9zVar5;
                function8 = function5;
                function9 = function12;
                function6 = function11;
            } else {
                fetVar2.X();
                function6 = function3;
                mm40Var3 = mm40Var2;
                d9zVar2 = d9zVarA;
                function7 = function4;
                function8 = function5;
                function9 = function2;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.ull
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ckb.f(mm40Var3, bmlVar, d9zVar2, hh80Var, function7, function8, function9, function6, (fet) obj, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i3 |= 24576;
        function4 = function0;
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                function5 = function1;
                if (fetVar2.i(function5)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                if ((1572864 & i) == 0) {
                    if (fetVar2.i(function2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (fetVar2.i(function3)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i3 & 4793491) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar2.U(i3 & 1, z)) {
                    fetVar2.Z();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            mm40Var2 = jm40.b;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            d9zVarA = f9z.a(fetVar2);
                        }
                        if (i14 != 0) {
                            function4 = null;
                        }
                        if (i4 != 0) {
                            function5 = null;
                        }
                        if (i6 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i8 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        function12 = function10;
                        d9zVar3 = d9zVarA;
                    } else {
                        if (i12 != 0) {
                            mm40Var2 = jm40.b;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            d9zVarA = f9z.a(fetVar2);
                        }
                        if (i14 != 0) {
                            function4 = null;
                        }
                        if (i4 != 0) {
                            function5 = null;
                        }
                        if (i6 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i8 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        function12 = function10;
                        d9zVar3 = d9zVarA;
                    }
                    fetVar2.s();
                    i10 = ((Configuration) fetVar2.k(dy2.f6873a)).screenWidthDp;
                    if (bmlVar instanceof zll) {
                        list = ((zll) bmlVar).c;
                        d9zVar4 = d9zVar3;
                        mm40Var4 = mm40Var2;
                    } else {
                        if (bmlVar instanceof aml) {
                            t9f.b();
                            return;
                        }
                        type = bmlVar.getType();
                        boolean z8 = bmlVar.a() instanceof wll;
                        pt0Var = pt0.f27539a;
                        if (type == pt0Var) {
                            iO = 6;
                            pt0Var2 = pt0.b;
                            if (type == pt0Var2) {
                                pt0Var3 = pt0.c;
                                if (type == pt0Var3) {
                                    d9zVar4 = d9zVar3;
                                    pt0Var4 = pt0.d;
                                    if (type == pt0Var4) {
                                    }
                                    mm40Var4 = mm40Var2;
                                    if (type == pt0.e) {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    } else {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    }
                                } else {
                                    d9zVar4 = d9zVar3;
                                    pt0Var4 = pt0.d;
                                    if (type == pt0Var4) {
                                    }
                                    mm40Var4 = mm40Var2;
                                    if (type == pt0.e) {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    } else {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    }
                                }
                            } else {
                                pt0Var3 = pt0.c;
                                if (type == pt0Var3) {
                                    d9zVar4 = d9zVar3;
                                    pt0Var4 = pt0.d;
                                    if (type == pt0Var4) {
                                    }
                                    mm40Var4 = mm40Var2;
                                    if (type == pt0.e) {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    } else {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    }
                                } else {
                                    d9zVar4 = d9zVar3;
                                    pt0Var4 = pt0.d;
                                    if (type == pt0Var4) {
                                    }
                                    mm40Var4 = mm40Var2;
                                    if (type == pt0.e) {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    } else {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    }
                                }
                            }
                        } else {
                            iO = 6;
                            pt0Var2 = pt0.b;
                            if (type == pt0Var2) {
                                pt0Var3 = pt0.c;
                                if (type == pt0Var3) {
                                    d9zVar4 = d9zVar3;
                                    pt0Var4 = pt0.d;
                                    if (type == pt0Var4) {
                                    }
                                    mm40Var4 = mm40Var2;
                                    if (type == pt0.e) {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    } else {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    }
                                } else {
                                    d9zVar4 = d9zVar3;
                                    pt0Var4 = pt0.d;
                                    if (type == pt0Var4) {
                                    }
                                    mm40Var4 = mm40Var2;
                                    if (type == pt0.e) {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    } else {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    }
                                }
                            } else {
                                pt0Var3 = pt0.c;
                                if (type == pt0Var3) {
                                    d9zVar4 = d9zVar3;
                                    pt0Var4 = pt0.d;
                                    if (type == pt0Var4) {
                                    }
                                    mm40Var4 = mm40Var2;
                                    if (type == pt0.e) {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    } else {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    }
                                } else {
                                    d9zVar4 = d9zVar3;
                                    pt0Var4 = pt0.d;
                                    if (type == pt0Var4) {
                                    }
                                    mm40Var4 = mm40Var2;
                                    if (type == pt0.e) {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    } else {
                                        if (type != pt0Var) {
                                            iO2 = O(type, i10);
                                        } else if (type == pt0Var3) {
                                            iO = O(type, i10) * 6;
                                        } else if (type == pt0Var4) {
                                            iO2 = O(type, i10);
                                        } else {
                                            iO = O(type, i10) * 8;
                                        }
                                        iO = iO2 * 4;
                                    }
                                }
                            }
                        }
                        arrayList = new ArrayList(iO);
                        while (i11 < iO) {
                            arrayList.add(new fp1());
                        }
                        list = arrayList;
                    }
                    yllVarA = bmlVar.a();
                    if (yllVarA instanceof wll) {
                        fetVar2.e0(1510792812);
                        pt0 type10 = bmlVar.getType();
                        p0s p0sVar5 = ((wll) yllVarA).f39359a;
                        if (bmlVar instanceof aml) {
                            amlVar2 = (aml) bmlVar;
                        } else {
                            amlVar2 = null;
                        }
                        if (amlVar2 != null) {
                        }
                        int i1115 = i3 & 14;
                        int i1116 = i3 << 3;
                        mm40Var6 = mm40Var4;
                        g(mm40Var6, list, type10, p0sVar5, hh80Var2, z4, function5, function12, function11, fetVar2, (29360128 & i1116) | (3670016 & i1116) | (57344 & i1116) | i1115 | (234881024 & i1116));
                        fetVar2.r(false);
                        d9zVar5 = d9zVar4;
                        function13 = function4;
                    } else {
                        mm40Var5 = mm40Var4;
                        if (Intrinsics.d(yllVarA, xll.f41078a)) {
                            throw b1j.f(-2029478060, fetVar2, false);
                        }
                        fetVar2.e0(1511403109);
                        mm40Var6 = mm40Var5;
                        pt0 type11 = bmlVar.getType();
                        if (bmlVar instanceof aml) {
                            amlVar = (aml) bmlVar;
                        } else {
                            amlVar = null;
                        }
                        if (amlVar != null) {
                            z2 = amlVar.c;
                        } else {
                            z2 = true;
                        }
                        int i1117 = i3 << 3;
                        int i1118 = (i1117 & 57344) | (i1117 & 7168) | (i3 & 14);
                        int i1119 = i3 << 6;
                        d9zVar5 = d9zVar4;
                        Function1 function1110 = function11;
                        Function1 function1111 = function12;
                        Function1 function1112 = function5;
                        Function0 function1113 = function4;
                        h(mm40Var6, list, type11, d9zVar5, hh80Var, z2, function1113, function1112, function1111, function1110, fetVar2, i1118 | (i1119 & 3670016) | (i1119 & 29360128) | (i1119 & 234881024) | (i1119 & 1879048192));
                        function13 = function1113;
                        function5 = function1112;
                        function12 = function1111;
                        function11 = function1110;
                        fetVar2 = fetVar2;
                        fetVar2.r(false);
                    }
                    function7 = function13;
                    mm40Var3 = mm40Var6;
                    d9zVar2 = d9zVar5;
                    function8 = function5;
                    function9 = function12;
                    function6 = function11;
                } else {
                    fetVar2.X();
                    function6 = function3;
                    mm40Var3 = mm40Var2;
                    d9zVar2 = d9zVarA;
                    function7 = function4;
                    function8 = function5;
                    function9 = function2;
                }
                yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.ull
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ckb.f(mm40Var3, bmlVar, d9zVar2, hh80Var, function7, function8, function9, function6, (fet) obj, x8x.L(i | 1), i2);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i3 |= 1572864;
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (fetVar2.i(function3)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            if ((i3 & 4793491) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar2.U(i3 & 1, z)) {
                fetVar2.Z();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        mm40Var2 = jm40.b;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        d9zVarA = f9z.a(fetVar2);
                    }
                    if (i14 != 0) {
                        function4 = null;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if (i6 != 0) {
                        function10 = null;
                    } else {
                        function10 = function2;
                    }
                    if (i8 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    function12 = function10;
                    d9zVar3 = d9zVarA;
                } else {
                    if (i12 != 0) {
                        mm40Var2 = jm40.b;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        d9zVarA = f9z.a(fetVar2);
                    }
                    if (i14 != 0) {
                        function4 = null;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if (i6 != 0) {
                        function10 = null;
                    } else {
                        function10 = function2;
                    }
                    if (i8 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    function12 = function10;
                    d9zVar3 = d9zVarA;
                }
                fetVar2.s();
                i10 = ((Configuration) fetVar2.k(dy2.f6873a)).screenWidthDp;
                if (bmlVar instanceof zll) {
                    list = ((zll) bmlVar).c;
                    d9zVar4 = d9zVar3;
                    mm40Var4 = mm40Var2;
                } else {
                    if (bmlVar instanceof aml) {
                        t9f.b();
                        return;
                    }
                    type = bmlVar.getType();
                    boolean z9 = bmlVar.a() instanceof wll;
                    pt0Var = pt0.f27539a;
                    if (type == pt0Var) {
                        iO = 6;
                        pt0Var2 = pt0.b;
                        if (type == pt0Var2) {
                            pt0Var3 = pt0.c;
                            if (type == pt0Var3) {
                                d9zVar4 = d9zVar3;
                                pt0Var4 = pt0.d;
                                if (type == pt0Var4) {
                                }
                                mm40Var4 = mm40Var2;
                                if (type == pt0.e) {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                } else {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                }
                            } else {
                                d9zVar4 = d9zVar3;
                                pt0Var4 = pt0.d;
                                if (type == pt0Var4) {
                                }
                                mm40Var4 = mm40Var2;
                                if (type == pt0.e) {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                } else {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                }
                            }
                        } else {
                            pt0Var3 = pt0.c;
                            if (type == pt0Var3) {
                                d9zVar4 = d9zVar3;
                                pt0Var4 = pt0.d;
                                if (type == pt0Var4) {
                                }
                                mm40Var4 = mm40Var2;
                                if (type == pt0.e) {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                } else {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                }
                            } else {
                                d9zVar4 = d9zVar3;
                                pt0Var4 = pt0.d;
                                if (type == pt0Var4) {
                                }
                                mm40Var4 = mm40Var2;
                                if (type == pt0.e) {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                } else {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                }
                            }
                        }
                    } else {
                        iO = 6;
                        pt0Var2 = pt0.b;
                        if (type == pt0Var2) {
                            pt0Var3 = pt0.c;
                            if (type == pt0Var3) {
                                d9zVar4 = d9zVar3;
                                pt0Var4 = pt0.d;
                                if (type == pt0Var4) {
                                }
                                mm40Var4 = mm40Var2;
                                if (type == pt0.e) {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                } else {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                }
                            } else {
                                d9zVar4 = d9zVar3;
                                pt0Var4 = pt0.d;
                                if (type == pt0Var4) {
                                }
                                mm40Var4 = mm40Var2;
                                if (type == pt0.e) {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                } else {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                }
                            }
                        } else {
                            pt0Var3 = pt0.c;
                            if (type == pt0Var3) {
                                d9zVar4 = d9zVar3;
                                pt0Var4 = pt0.d;
                                if (type == pt0Var4) {
                                }
                                mm40Var4 = mm40Var2;
                                if (type == pt0.e) {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                } else {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                }
                            } else {
                                d9zVar4 = d9zVar3;
                                pt0Var4 = pt0.d;
                                if (type == pt0Var4) {
                                }
                                mm40Var4 = mm40Var2;
                                if (type == pt0.e) {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                } else {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                }
                            }
                        }
                    }
                    arrayList = new ArrayList(iO);
                    while (i11 < iO) {
                        arrayList.add(new fp1());
                    }
                    list = arrayList;
                }
                yllVarA = bmlVar.a();
                if (yllVarA instanceof wll) {
                    fetVar2.e0(1510792812);
                    pt0 type12 = bmlVar.getType();
                    p0s p0sVar6 = ((wll) yllVarA).f39359a;
                    if (bmlVar instanceof aml) {
                        amlVar2 = (aml) bmlVar;
                    } else {
                        amlVar2 = null;
                    }
                    if (amlVar2 != null) {
                    }
                    int i11110 = i3 & 14;
                    int i11111 = i3 << 3;
                    mm40Var6 = mm40Var4;
                    g(mm40Var6, list, type12, p0sVar6, hh80Var2, z4, function5, function12, function11, fetVar2, (29360128 & i11111) | (3670016 & i11111) | (57344 & i11111) | i11110 | (234881024 & i11111));
                    fetVar2.r(false);
                    d9zVar5 = d9zVar4;
                    function13 = function4;
                } else {
                    mm40Var5 = mm40Var4;
                    if (Intrinsics.d(yllVarA, xll.f41078a)) {
                        throw b1j.f(-2029478060, fetVar2, false);
                    }
                    fetVar2.e0(1511403109);
                    mm40Var6 = mm40Var5;
                    pt0 type13 = bmlVar.getType();
                    if (bmlVar instanceof aml) {
                        amlVar = (aml) bmlVar;
                    } else {
                        amlVar = null;
                    }
                    if (amlVar != null) {
                        z2 = amlVar.c;
                    } else {
                        z2 = true;
                    }
                    int i11112 = i3 << 3;
                    int i11113 = (i11112 & 57344) | (i11112 & 7168) | (i3 & 14);
                    int i11114 = i3 << 6;
                    d9zVar5 = d9zVar4;
                    Function1 function1114 = function11;
                    Function1 function1115 = function12;
                    Function1 function1116 = function5;
                    Function0 function1117 = function4;
                    h(mm40Var6, list, type13, d9zVar5, hh80Var, z2, function1117, function1116, function1115, function1114, fetVar2, i11113 | (i11114 & 3670016) | (i11114 & 29360128) | (i11114 & 234881024) | (i11114 & 1879048192));
                    function13 = function1117;
                    function5 = function1116;
                    function12 = function1115;
                    function11 = function1114;
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                }
                function7 = function13;
                mm40Var3 = mm40Var6;
                d9zVar2 = d9zVar5;
                function8 = function5;
                function9 = function12;
                function6 = function11;
            } else {
                fetVar2.X();
                function6 = function3;
                mm40Var3 = mm40Var2;
                d9zVar2 = d9zVarA;
                function7 = function4;
                function8 = function5;
                function9 = function2;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.ull
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ckb.f(mm40Var3, bmlVar, d9zVar2, hh80Var, function7, function8, function9, function6, (fet) obj, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i3 |= 196608;
        function5 = function1;
        i6 = i2 & 64;
        if (i6 != 0) {
            if ((1572864 & i) == 0) {
                if (fetVar2.i(function2)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (fetVar2.i(function3)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            if ((i3 & 4793491) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar2.U(i3 & 1, z)) {
                fetVar2.Z();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        mm40Var2 = jm40.b;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        d9zVarA = f9z.a(fetVar2);
                    }
                    if (i14 != 0) {
                        function4 = null;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if (i6 != 0) {
                        function10 = null;
                    } else {
                        function10 = function2;
                    }
                    if (i8 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    function12 = function10;
                    d9zVar3 = d9zVarA;
                } else {
                    if (i12 != 0) {
                        mm40Var2 = jm40.b;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        d9zVarA = f9z.a(fetVar2);
                    }
                    if (i14 != 0) {
                        function4 = null;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if (i6 != 0) {
                        function10 = null;
                    } else {
                        function10 = function2;
                    }
                    if (i8 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    function12 = function10;
                    d9zVar3 = d9zVarA;
                }
                fetVar2.s();
                i10 = ((Configuration) fetVar2.k(dy2.f6873a)).screenWidthDp;
                if (bmlVar instanceof zll) {
                    list = ((zll) bmlVar).c;
                    d9zVar4 = d9zVar3;
                    mm40Var4 = mm40Var2;
                } else {
                    if (bmlVar instanceof aml) {
                        t9f.b();
                        return;
                    }
                    type = bmlVar.getType();
                    boolean z10 = bmlVar.a() instanceof wll;
                    pt0Var = pt0.f27539a;
                    if (type == pt0Var) {
                        iO = 6;
                        pt0Var2 = pt0.b;
                        if (type == pt0Var2) {
                            pt0Var3 = pt0.c;
                            if (type == pt0Var3) {
                                d9zVar4 = d9zVar3;
                                pt0Var4 = pt0.d;
                                if (type == pt0Var4) {
                                }
                                mm40Var4 = mm40Var2;
                                if (type == pt0.e) {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                } else {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                }
                            } else {
                                d9zVar4 = d9zVar3;
                                pt0Var4 = pt0.d;
                                if (type == pt0Var4) {
                                }
                                mm40Var4 = mm40Var2;
                                if (type == pt0.e) {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                } else {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                }
                            }
                        } else {
                            pt0Var3 = pt0.c;
                            if (type == pt0Var3) {
                                d9zVar4 = d9zVar3;
                                pt0Var4 = pt0.d;
                                if (type == pt0Var4) {
                                }
                                mm40Var4 = mm40Var2;
                                if (type == pt0.e) {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                } else {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                }
                            } else {
                                d9zVar4 = d9zVar3;
                                pt0Var4 = pt0.d;
                                if (type == pt0Var4) {
                                }
                                mm40Var4 = mm40Var2;
                                if (type == pt0.e) {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                } else {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                }
                            }
                        }
                    } else {
                        iO = 6;
                        pt0Var2 = pt0.b;
                        if (type == pt0Var2) {
                            pt0Var3 = pt0.c;
                            if (type == pt0Var3) {
                                d9zVar4 = d9zVar3;
                                pt0Var4 = pt0.d;
                                if (type == pt0Var4) {
                                }
                                mm40Var4 = mm40Var2;
                                if (type == pt0.e) {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                } else {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                }
                            } else {
                                d9zVar4 = d9zVar3;
                                pt0Var4 = pt0.d;
                                if (type == pt0Var4) {
                                }
                                mm40Var4 = mm40Var2;
                                if (type == pt0.e) {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                } else {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                }
                            }
                        } else {
                            pt0Var3 = pt0.c;
                            if (type == pt0Var3) {
                                d9zVar4 = d9zVar3;
                                pt0Var4 = pt0.d;
                                if (type == pt0Var4) {
                                }
                                mm40Var4 = mm40Var2;
                                if (type == pt0.e) {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                } else {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                }
                            } else {
                                d9zVar4 = d9zVar3;
                                pt0Var4 = pt0.d;
                                if (type == pt0Var4) {
                                }
                                mm40Var4 = mm40Var2;
                                if (type == pt0.e) {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                } else {
                                    if (type != pt0Var) {
                                        iO2 = O(type, i10);
                                    } else if (type == pt0Var3) {
                                        iO = O(type, i10) * 6;
                                    } else if (type == pt0Var4) {
                                        iO2 = O(type, i10);
                                    } else {
                                        iO = O(type, i10) * 8;
                                    }
                                    iO = iO2 * 4;
                                }
                            }
                        }
                    }
                    arrayList = new ArrayList(iO);
                    while (i11 < iO) {
                        arrayList.add(new fp1());
                    }
                    list = arrayList;
                }
                yllVarA = bmlVar.a();
                if (yllVarA instanceof wll) {
                    fetVar2.e0(1510792812);
                    pt0 type14 = bmlVar.getType();
                    p0s p0sVar7 = ((wll) yllVarA).f39359a;
                    if (bmlVar instanceof aml) {
                        amlVar2 = (aml) bmlVar;
                    } else {
                        amlVar2 = null;
                    }
                    if (amlVar2 != null) {
                    }
                    int i11115 = i3 & 14;
                    int i11116 = i3 << 3;
                    mm40Var6 = mm40Var4;
                    g(mm40Var6, list, type14, p0sVar7, hh80Var2, z4, function5, function12, function11, fetVar2, (29360128 & i11116) | (3670016 & i11116) | (57344 & i11116) | i11115 | (234881024 & i11116));
                    fetVar2.r(false);
                    d9zVar5 = d9zVar4;
                    function13 = function4;
                } else {
                    mm40Var5 = mm40Var4;
                    if (Intrinsics.d(yllVarA, xll.f41078a)) {
                        throw b1j.f(-2029478060, fetVar2, false);
                    }
                    fetVar2.e0(1511403109);
                    mm40Var6 = mm40Var5;
                    pt0 type15 = bmlVar.getType();
                    if (bmlVar instanceof aml) {
                        amlVar = (aml) bmlVar;
                    } else {
                        amlVar = null;
                    }
                    if (amlVar != null) {
                        z2 = amlVar.c;
                    } else {
                        z2 = true;
                    }
                    int i11117 = i3 << 3;
                    int i11118 = (i11117 & 57344) | (i11117 & 7168) | (i3 & 14);
                    int i11119 = i3 << 6;
                    d9zVar5 = d9zVar4;
                    Function1 function1118 = function11;
                    Function1 function1119 = function12;
                    Function1 function11110 = function5;
                    Function0 function11111 = function4;
                    h(mm40Var6, list, type15, d9zVar5, hh80Var, z2, function11111, function11110, function1119, function1118, fetVar2, i11118 | (i11119 & 3670016) | (i11119 & 29360128) | (i11119 & 234881024) | (i11119 & 1879048192));
                    function13 = function11111;
                    function5 = function11110;
                    function12 = function1119;
                    function11 = function1118;
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                }
                function7 = function13;
                mm40Var3 = mm40Var6;
                d9zVar2 = d9zVar5;
                function8 = function5;
                function9 = function12;
                function6 = function11;
            } else {
                fetVar2.X();
                function6 = function3;
                mm40Var3 = mm40Var2;
                d9zVar2 = d9zVarA;
                function7 = function4;
                function8 = function5;
                function9 = function2;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.ull
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ckb.f(mm40Var3, bmlVar, d9zVar2, hh80Var, function7, function8, function9, function6, (fet) obj, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i3 |= 1572864;
        i8 = i2 & 128;
        if (i8 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (fetVar2.i(function3)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i3 |= i9;
        }
        if ((i3 & 4793491) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar2.U(i3 & 1, z)) {
            fetVar2.Z();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    mm40Var2 = jm40.b;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    d9zVarA = f9z.a(fetVar2);
                }
                if (i14 != 0) {
                    function4 = null;
                }
                if (i4 != 0) {
                    function5 = null;
                }
                if (i6 != 0) {
                    function10 = null;
                } else {
                    function10 = function2;
                }
                if (i8 != 0) {
                    function11 = null;
                } else {
                    function11 = function3;
                }
                function12 = function10;
                d9zVar3 = d9zVarA;
            } else {
                if (i12 != 0) {
                    mm40Var2 = jm40.b;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    d9zVarA = f9z.a(fetVar2);
                }
                if (i14 != 0) {
                    function4 = null;
                }
                if (i4 != 0) {
                    function5 = null;
                }
                if (i6 != 0) {
                    function10 = null;
                } else {
                    function10 = function2;
                }
                if (i8 != 0) {
                    function11 = null;
                } else {
                    function11 = function3;
                }
                function12 = function10;
                d9zVar3 = d9zVarA;
            }
            fetVar2.s();
            i10 = ((Configuration) fetVar2.k(dy2.f6873a)).screenWidthDp;
            if (bmlVar instanceof zll) {
                list = ((zll) bmlVar).c;
                d9zVar4 = d9zVar3;
                mm40Var4 = mm40Var2;
            } else {
                if (bmlVar instanceof aml) {
                    t9f.b();
                    return;
                }
                type = bmlVar.getType();
                boolean z11 = bmlVar.a() instanceof wll;
                pt0Var = pt0.f27539a;
                if (type == pt0Var) {
                    iO = 6;
                    pt0Var2 = pt0.b;
                    if (type == pt0Var2) {
                        pt0Var3 = pt0.c;
                        if (type == pt0Var3) {
                            d9zVar4 = d9zVar3;
                            pt0Var4 = pt0.d;
                            if (type == pt0Var4) {
                            }
                            mm40Var4 = mm40Var2;
                            if (type == pt0.e) {
                                if (type != pt0Var) {
                                    iO2 = O(type, i10);
                                } else if (type == pt0Var3) {
                                    iO = O(type, i10) * 6;
                                } else if (type == pt0Var4) {
                                    iO2 = O(type, i10);
                                } else {
                                    iO = O(type, i10) * 8;
                                }
                                iO = iO2 * 4;
                            } else {
                                if (type != pt0Var) {
                                    iO2 = O(type, i10);
                                } else if (type == pt0Var3) {
                                    iO = O(type, i10) * 6;
                                } else if (type == pt0Var4) {
                                    iO2 = O(type, i10);
                                } else {
                                    iO = O(type, i10) * 8;
                                }
                                iO = iO2 * 4;
                            }
                        } else {
                            d9zVar4 = d9zVar3;
                            pt0Var4 = pt0.d;
                            if (type == pt0Var4) {
                            }
                            mm40Var4 = mm40Var2;
                            if (type == pt0.e) {
                                if (type != pt0Var) {
                                    iO2 = O(type, i10);
                                } else if (type == pt0Var3) {
                                    iO = O(type, i10) * 6;
                                } else if (type == pt0Var4) {
                                    iO2 = O(type, i10);
                                } else {
                                    iO = O(type, i10) * 8;
                                }
                                iO = iO2 * 4;
                            } else {
                                if (type != pt0Var) {
                                    iO2 = O(type, i10);
                                } else if (type == pt0Var3) {
                                    iO = O(type, i10) * 6;
                                } else if (type == pt0Var4) {
                                    iO2 = O(type, i10);
                                } else {
                                    iO = O(type, i10) * 8;
                                }
                                iO = iO2 * 4;
                            }
                        }
                    } else {
                        pt0Var3 = pt0.c;
                        if (type == pt0Var3) {
                            d9zVar4 = d9zVar3;
                            pt0Var4 = pt0.d;
                            if (type == pt0Var4) {
                            }
                            mm40Var4 = mm40Var2;
                            if (type == pt0.e) {
                                if (type != pt0Var) {
                                    iO2 = O(type, i10);
                                } else if (type == pt0Var3) {
                                    iO = O(type, i10) * 6;
                                } else if (type == pt0Var4) {
                                    iO2 = O(type, i10);
                                } else {
                                    iO = O(type, i10) * 8;
                                }
                                iO = iO2 * 4;
                            } else {
                                if (type != pt0Var) {
                                    iO2 = O(type, i10);
                                } else if (type == pt0Var3) {
                                    iO = O(type, i10) * 6;
                                } else if (type == pt0Var4) {
                                    iO2 = O(type, i10);
                                } else {
                                    iO = O(type, i10) * 8;
                                }
                                iO = iO2 * 4;
                            }
                        } else {
                            d9zVar4 = d9zVar3;
                            pt0Var4 = pt0.d;
                            if (type == pt0Var4) {
                            }
                            mm40Var4 = mm40Var2;
                            if (type == pt0.e) {
                                if (type != pt0Var) {
                                    iO2 = O(type, i10);
                                } else if (type == pt0Var3) {
                                    iO = O(type, i10) * 6;
                                } else if (type == pt0Var4) {
                                    iO2 = O(type, i10);
                                } else {
                                    iO = O(type, i10) * 8;
                                }
                                iO = iO2 * 4;
                            } else {
                                if (type != pt0Var) {
                                    iO2 = O(type, i10);
                                } else if (type == pt0Var3) {
                                    iO = O(type, i10) * 6;
                                } else if (type == pt0Var4) {
                                    iO2 = O(type, i10);
                                } else {
                                    iO = O(type, i10) * 8;
                                }
                                iO = iO2 * 4;
                            }
                        }
                    }
                } else {
                    iO = 6;
                    pt0Var2 = pt0.b;
                    if (type == pt0Var2) {
                        pt0Var3 = pt0.c;
                        if (type == pt0Var3) {
                            d9zVar4 = d9zVar3;
                            pt0Var4 = pt0.d;
                            if (type == pt0Var4) {
                            }
                            mm40Var4 = mm40Var2;
                            if (type == pt0.e) {
                                if (type != pt0Var) {
                                    iO2 = O(type, i10);
                                } else if (type == pt0Var3) {
                                    iO = O(type, i10) * 6;
                                } else if (type == pt0Var4) {
                                    iO2 = O(type, i10);
                                } else {
                                    iO = O(type, i10) * 8;
                                }
                                iO = iO2 * 4;
                            } else {
                                if (type != pt0Var) {
                                    iO2 = O(type, i10);
                                } else if (type == pt0Var3) {
                                    iO = O(type, i10) * 6;
                                } else if (type == pt0Var4) {
                                    iO2 = O(type, i10);
                                } else {
                                    iO = O(type, i10) * 8;
                                }
                                iO = iO2 * 4;
                            }
                        } else {
                            d9zVar4 = d9zVar3;
                            pt0Var4 = pt0.d;
                            if (type == pt0Var4) {
                            }
                            mm40Var4 = mm40Var2;
                            if (type == pt0.e) {
                                if (type != pt0Var) {
                                    iO2 = O(type, i10);
                                } else if (type == pt0Var3) {
                                    iO = O(type, i10) * 6;
                                } else if (type == pt0Var4) {
                                    iO2 = O(type, i10);
                                } else {
                                    iO = O(type, i10) * 8;
                                }
                                iO = iO2 * 4;
                            } else {
                                if (type != pt0Var) {
                                    iO2 = O(type, i10);
                                } else if (type == pt0Var3) {
                                    iO = O(type, i10) * 6;
                                } else if (type == pt0Var4) {
                                    iO2 = O(type, i10);
                                } else {
                                    iO = O(type, i10) * 8;
                                }
                                iO = iO2 * 4;
                            }
                        }
                    } else {
                        pt0Var3 = pt0.c;
                        if (type == pt0Var3) {
                            d9zVar4 = d9zVar3;
                            pt0Var4 = pt0.d;
                            if (type == pt0Var4) {
                            }
                            mm40Var4 = mm40Var2;
                            if (type == pt0.e) {
                                if (type != pt0Var) {
                                    iO2 = O(type, i10);
                                } else if (type == pt0Var3) {
                                    iO = O(type, i10) * 6;
                                } else if (type == pt0Var4) {
                                    iO2 = O(type, i10);
                                } else {
                                    iO = O(type, i10) * 8;
                                }
                                iO = iO2 * 4;
                            } else {
                                if (type != pt0Var) {
                                    iO2 = O(type, i10);
                                } else if (type == pt0Var3) {
                                    iO = O(type, i10) * 6;
                                } else if (type == pt0Var4) {
                                    iO2 = O(type, i10);
                                } else {
                                    iO = O(type, i10) * 8;
                                }
                                iO = iO2 * 4;
                            }
                        } else {
                            d9zVar4 = d9zVar3;
                            pt0Var4 = pt0.d;
                            if (type == pt0Var4) {
                            }
                            mm40Var4 = mm40Var2;
                            if (type == pt0.e) {
                                if (type != pt0Var) {
                                    iO2 = O(type, i10);
                                } else if (type == pt0Var3) {
                                    iO = O(type, i10) * 6;
                                } else if (type == pt0Var4) {
                                    iO2 = O(type, i10);
                                } else {
                                    iO = O(type, i10) * 8;
                                }
                                iO = iO2 * 4;
                            } else {
                                if (type != pt0Var) {
                                    iO2 = O(type, i10);
                                } else if (type == pt0Var3) {
                                    iO = O(type, i10) * 6;
                                } else if (type == pt0Var4) {
                                    iO2 = O(type, i10);
                                } else {
                                    iO = O(type, i10) * 8;
                                }
                                iO = iO2 * 4;
                            }
                        }
                    }
                }
                arrayList = new ArrayList(iO);
                while (i11 < iO) {
                    arrayList.add(new fp1());
                }
                list = arrayList;
            }
            yllVarA = bmlVar.a();
            if (yllVarA instanceof wll) {
                fetVar2.e0(1510792812);
                pt0 type16 = bmlVar.getType();
                p0s p0sVar8 = ((wll) yllVarA).f39359a;
                if (bmlVar instanceof aml) {
                    amlVar2 = (aml) bmlVar;
                } else {
                    amlVar2 = null;
                }
                if (amlVar2 != null) {
                }
                int i111110 = i3 & 14;
                int i111111 = i3 << 3;
                mm40Var6 = mm40Var4;
                g(mm40Var6, list, type16, p0sVar8, hh80Var2, z4, function5, function12, function11, fetVar2, (29360128 & i111111) | (3670016 & i111111) | (57344 & i111111) | i111110 | (234881024 & i111111));
                fetVar2.r(false);
                d9zVar5 = d9zVar4;
                function13 = function4;
            } else {
                mm40Var5 = mm40Var4;
                if (Intrinsics.d(yllVarA, xll.f41078a)) {
                    throw b1j.f(-2029478060, fetVar2, false);
                }
                fetVar2.e0(1511403109);
                mm40Var6 = mm40Var5;
                pt0 type17 = bmlVar.getType();
                if (bmlVar instanceof aml) {
                    amlVar = (aml) bmlVar;
                } else {
                    amlVar = null;
                }
                if (amlVar != null) {
                    z2 = amlVar.c;
                } else {
                    z2 = true;
                }
                int i111112 = i3 << 3;
                int i111113 = (i111112 & 57344) | (i111112 & 7168) | (i3 & 14);
                int i111114 = i3 << 6;
                d9zVar5 = d9zVar4;
                Function1 function11112 = function11;
                Function1 function11113 = function12;
                Function1 function11114 = function5;
                Function0 function11115 = function4;
                h(mm40Var6, list, type17, d9zVar5, hh80Var, z2, function11115, function11114, function11113, function11112, fetVar2, i111113 | (i111114 & 3670016) | (i111114 & 29360128) | (i111114 & 234881024) | (i111114 & 1879048192));
                function13 = function11115;
                function5 = function11114;
                function12 = function11113;
                function11 = function11112;
                fetVar2 = fetVar2;
                fetVar2.r(false);
            }
            function7 = function13;
            mm40Var3 = mm40Var6;
            d9zVar2 = d9zVar5;
            function8 = function5;
            function9 = function12;
            function6 = function11;
        } else {
            fetVar2.X();
            function6 = function3;
            mm40Var3 = mm40Var2;
            d9zVar2 = d9zVarA;
            function7 = function4;
            function8 = function5;
            function9 = function2;
        }
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.ull
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ckb.f(mm40Var3, bmlVar, d9zVar2, hh80Var, function7, function8, function9, function6, (fet) obj, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final n3w f0(kzv kzvVar, HistoryTypeModel historyTypeModel, String str, boolean z, boolean z2, boolean z3, List list, boolean z4, List list2, boolean z5, boolean z6) {
        Object next;
        String strT;
        String str2;
        lb90 lb90Var;
        boolean z7;
        String str3;
        Object next2;
        boolean z8;
        kzvVar.getClass();
        list.getClass();
        list2.getClass();
        Iterator it = list2.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((xco) next).f40655a != kzvVar.T);
        xco xcoVar = (xco) next;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ueo) obj).d == 2) {
                arrayList.add(obj);
            }
        }
        i7u i7uVar = i7u.c;
        List list3 = kzvVar.Y;
        boolean zA = i7uVar.a(list3, arrayList);
        String str4 = kzvVar.f19169a;
        s77 s77VarM = hp4.M(historyTypeModel);
        long j = kzvVar.h;
        double d = kzvVar.e;
        String str5 = kzvVar.i;
        String str6 = kzvVar.l;
        String str7 = kzvVar.k;
        long j2 = kzvVar.d;
        double d2 = kzvVar.j;
        e4f e4fVarU = jeb.U(kzvVar.g);
        double d3 = kzvVar.m;
        double d4 = kzvVar.M;
        double d5 = kzvVar.f;
        double d6 = kzvVar.c;
        lb90 lb90Var2 = kzvVar.n;
        double d7 = kzvVar.o;
        double d8 = kzvVar.p;
        boolean z9 = kzvVar.q;
        z0w z0wVar = (z0w) CollectionsKt.W(0, list3);
        if (z0wVar != null) {
            String str8 = xcoVar != null ? xcoVar.b : null;
            strT = T(z0wVar, list, str8 == null ? "" : str8, z4, z5, z6);
        } else {
            strT = null;
        }
        String str9 = strT == null ? "" : strT;
        double d9 = kzvVar.r;
        boolean z10 = kzvVar.s;
        int i = kzvVar.t;
        int i2 = kzvVar.u;
        int i3 = kzvVar.v;
        double d10 = kzvVar.w;
        boolean z11 = kzvVar.x;
        double d11 = kzvVar.y;
        q4f q4fVar = kzvVar.b;
        v21 v21Var = v21.NONE;
        r21 r21Var = r21.NONE;
        boolean z12 = kzvVar.z;
        String str10 = kzvVar.A;
        String str11 = kzvVar.B;
        double d12 = kzvVar.C;
        boolean z13 = kzvVar.D;
        double d13 = kzvVar.E;
        String str12 = kzvVar.F;
        boolean z14 = kzvVar.G;
        boolean z15 = kzvVar.H;
        boolean z16 = kzvVar.I;
        boolean z17 = kzvVar.J;
        boolean z18 = kzvVar.K;
        double d14 = kzvVar.N;
        hxu hxuVar = kzvVar.O;
        nob0 nob0Var = kzvVar.P;
        mob0 mob0Var = new mob0(nob0Var.f23860a, nob0Var.b, nob0Var.c, nob0Var.d, nob0Var.e);
        long j3 = kzvVar.Q;
        String str13 = kzvVar.R;
        uoy uoyVar = kzvVar.S;
        long j4 = kzvVar.T;
        double d15 = kzvVar.U;
        double d16 = kzvVar.V;
        boolean z19 = kzvVar.W;
        boolean z20 = kzvVar.X;
        ArrayList arrayList2 = new ArrayList(r3d.q(list3, 10));
        Iterator it2 = list3.iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            Object next3 = it2.next();
            int i5 = i4 + 1;
            if (i4 < 0) {
                q3d.p();
                throw null;
            }
            z0w z0wVar2 = (z0w) next3;
            z0wVar2.getClass();
            Iterator it3 = it2;
            uoy uoyVar2 = uoyVar;
            long j5 = z0wVar2.F;
            int i6 = z0wVar2.v;
            if (!arrayList.isEmpty()) {
                Iterator it4 = arrayList.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        str2 = str13;
                        lb90Var = lb90Var2;
                        z7 = false;
                        break;
                    }
                    Iterator it5 = it4;
                    ueo ueoVar = (ueo) it4.next();
                    str2 = str13;
                    lb90Var = lb90Var2;
                    if (ueoVar.d == 2 && ((int) ueoVar.f35538a) == i6) {
                        z7 = true;
                        break;
                    }
                    it4 = it5;
                    str13 = str2;
                    lb90Var2 = lb90Var;
                }
            } else {
                str2 = str13;
                lb90Var = lb90Var2;
                z7 = false;
            }
            Iterator it6 = list2.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    str3 = str7;
                    next2 = null;
                    break;
                }
                next2 = it6.next();
                str3 = str7;
                if (((xco) next2).f40655a == j5) {
                    break;
                }
                str7 = str3;
            }
            xco xcoVar2 = (xco) next2;
            String str14 = xcoVar2 != null ? xcoVar2.b : null;
            String strV = V(z3, z4, list, str14 == null ? "" : str14, kzvVar.Y, i4, z5, z6);
            int iG0 = gq80.g0(i6, list);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list2) {
                String str15 = str4;
                if (((xco) obj2).e) {
                    arrayList3.add(obj2);
                }
                str4 = str15;
            }
            String str16 = str4;
            if (arrayList3.isEmpty()) {
                z8 = false;
                break;
            }
            Iterator it7 = arrayList3.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    z8 = false;
                    break;
                    break;
                }
                if (((xco) it7.next()).f40655a == j5) {
                    z8 = true;
                    break;
                }
            }
            arrayList2.add(ju70.W(z0wVar2, strV, iG0, z8, z7));
            str4 = str16;
            i4 = i5;
            uoyVar = uoyVar2;
            it2 = it3;
            str13 = str2;
            lb90Var2 = lb90Var;
            str7 = str3;
        }
        return new n3w(str4, "", s77VarM, j, d, str5, str, str7, str6, j2, d2, e4fVarU, d3, d4, d5, d6, lb90Var2, d7, d8, z9, str9, d9, z10, "", i, i2, i3, d10, z11, d11, false, q4fVar, v21Var, r21Var, z, z12, str10, str11, d12, z13, d13, str12, z2, z14, z15, z16, zA, z17, z18, d14, hxuVar, mob0Var, j3, str13, uoyVar, j4, d15, d16, z19, z20, arrayList2, qjj.Z(kzvVar.Z), kzvVar.a0, kzvVar.b0, 0L, kzvVar.d0);
    }

    public static final void g(mm40 mm40Var, List list, pt0 pt0Var, p0s p0sVar, hh80 hh80Var, boolean z, Function1 function1, Function1 function2, Function1 function3, fet fetVar, int i) {
        int i2;
        boolean z2;
        fet fetVar2 = fetVar;
        fetVar2.g0(2096314094);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar2.g(list) : fetVar2.i(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.e(pt0Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(p0sVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.g(hh80Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            z2 = z;
            i2 |= fetVar2.h(z2) ? 131072 : 65536;
        } else {
            z2 = z;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar2.i(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar2.i(function2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= fetVar2.i(function3) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (38347923 & i3) != 38347922)) {
            fetVar2.Z();
            if ((i & 1) != 0 && !fetVar2.B()) {
                fetVar2.X();
            }
            fetVar2.s();
            if (pt0Var == pt0.e) {
                fetVar2.e0(-1825624509);
                int iE = l1e0.e(list.size(), new IntRange(0, 3, 1));
                zcl zclVar = qmk.f28987a;
                u7x.a(o7k0.e(mm40Var, ((iE - 1) * 8.0f) + (64.0f * iE)), dyb.r0(list), new ngv(iE), p0sVar, null, hh80Var, new qw3(8.0f, true, new jf4((byte) 14)), new qw3(8.0f, true, new jf4((byte) 14)), null, z2, null, u1c.M(-1139898233, new rgh(function2, function3, (byte) 9), fetVar2), fetVar, (i3 & 7168) | ((i3 << 3) & 458752), ((i3 >> 15) & 14) | 384);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1824536967);
                mm40 mm40VarE0 = o2e.e0(mm40Var, "LAZY_ROW_CARD_COLLECTION");
                zcl zclVar2 = qmk.f28987a;
                a8k0.c(mm40VarE0, dyb.r0(list), null, p0sVar, hh80Var, new qw3(8.0f, true, new jf4((byte) 14)), null, null, false, null, u1c.M(-1555695973, new x2g((Object) pt0Var, (Object) function1, (Object) function2, (Object) function3, (byte) 17), fetVar2), fetVar2, i3 & 64512);
                fetVar2.r(false);
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dcc(mm40Var, list, pt0Var, p0sVar, hh80Var, z, function1, function2, function3, i);
        }
    }

    public static final n3w g0(z7y z7yVar) {
        z7yVar.getClass();
        String str = z7yVar.f43943a;
        s77 s77Var = s77.JACKPOT;
        double d = z7yVar.f;
        String strValueOf = String.valueOf(d);
        String str2 = z7yVar.h;
        long j = z7yVar.d;
        e4f e4fVarU = jeb.U(z7yVar.e);
        double d2 = z7yVar.g;
        double d3 = z7yVar.c;
        q4f q4fVar = q4f.y;
        v21 v21Var = v21.NONE;
        r21 r21Var = r21.NONE;
        hxu hxuVar = z7yVar.k;
        mob0 mob0Var = mob0.f;
        uoy uoyVar = uoy.UNKNOWN;
        iun iunVar = iun.f15405a;
        an6.f1135a.getClass();
        return new n3w(str, "", s77Var, 0L, d, strValueOf, str2, "", "", j, 0.0d, e4fVarU, 0.0d, 0.0d, d2, d3, lb90.f19744a, 0.0d, 0.0d, false, "", 0.0d, false, "", 1, 1, 0, 0.0d, false, 0.0d, false, q4fVar, v21Var, r21Var, false, false, "", "", 0.0d, false, 0.0d, "", false, false, false, false, false, false, false, 0.0d, hxuVar, mob0Var, 0L, "", uoyVar, 0L, 0.0d, 0.0d, false, false, iunVar, kl5.d(0), ozc.POSSIBLE_PAYOUT, "", 0L, "");
    }

    public static final void h(mm40 mm40Var, List list, pt0 pt0Var, d9z d9zVar, hh80 hh80Var, boolean z, Function0 function0, Function1 function1, Function1 function2, Function1 function3, fet fetVar, int i) {
        int i2;
        Object obj;
        Object dgVar;
        fetVar.g0(1830167845);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(list) : fetVar.i(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.e(pt0Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(d9zVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(hh80Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.i(function1) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            obj = function2;
            i2 |= fetVar.i(obj) ? 67108864 : 33554432;
        } else {
            obj = function2;
        }
        if ((i & 805306368) == 0) {
            i2 |= fetVar.i(function3) ? 536870912 : 268435456;
        }
        if (fetVar.U(i2 & 1, (i2 & 306783379) != 306783378)) {
            int i3 = ((Configuration) fetVar.k(dy2.f6873a)).screenWidthDp;
            cl5 cl5Var = ukd.f35823a;
            if (function0 != null) {
                fetVar.e0(-2078898905);
                int i4 = i2 >> 9;
                int i5 = (i4 & 14) | 384 | (i2 & 112) | (i4 & 7168);
                boolean z2 = ((((i5 & 14) ^ 6) > 4 && fetVar.g(d9zVar)) || (i5 & 6) == 4) | ((((i5 & 7168) ^ 3072) > 2048 && fetVar.g(function0)) || (i5 & 3072) == 2048);
                Object objP = fetVar.P();
                if (z2 || objP == cl5Var) {
                    objP = new xi1(d9zVar, function0, null, (byte) 4);
                    fetVar.o0(objP);
                }
                m0x0.t(fetVar, list, (Function2) objP);
                fetVar.r(false);
            } else {
                fetVar.e0(-2078693251);
                fetVar.r(false);
            }
            mm40 mm40VarE0 = o2e.e0(mm40Var, "LAZY_VERTICAL_GRID_AGGREGATOR_CARD_COLLECTION");
            ngv ngvVar = new ngv(O(pt0Var, i3));
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            qw3 qw3Var2 = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z3 = ((i2 & 112) == 32 || ((i2 & 64) != 0 && fetVar.i(list))) | ((i2 & 896) == 256) | ((29360128 & i2) == 8388608) | ((i2 & 234881024) == 67108864) | ((1879048192 & i2) == 536870912);
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                dgVar = new dg(list, pt0Var, function1, obj, function3, (byte) 14);
                fetVar.o0(dgVar);
            } else {
                dgVar = objP2;
            }
            g8x.i(ngvVar, mm40VarE0, d9zVar, hh80Var, qw3Var2, qw3Var, null, z, null, (Function1) dgVar, fetVar, ((i2 >> 3) & 8064) | ((i2 << 9) & 234881024), 656);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bcc(mm40Var, list, pt0Var, d9zVar, hh80Var, z, function0, function1, function2, function3, i);
        }
    }

    public static final n3w h0(nc10 nc10Var, String str) {
        nc10Var.getClass();
        String str2 = nc10Var.d;
        s77 s77Var = s77.LOTTO;
        String strValueOf = String.valueOf(0.0d);
        long j = nc10Var.e;
        e4f e4fVar = e4f.b;
        double d = nc10Var.f;
        q4f q4fVar = q4f.z;
        v21 v21Var = v21.NONE;
        r21 r21Var = r21.NONE;
        hxu hxuVar = hxu.h;
        mob0 mob0Var = mob0.f;
        uoy uoyVar = uoy.UNKNOWN;
        iun iunVar = iun.f15405a;
        an6.f1135a.getClass();
        return new n3w(str2, "", s77Var, 0L, 0.0d, strValueOf, str, "", "", j, 0.0d, e4fVar, 0.0d, 0.0d, d, 0.0d, lb90.f19744a, 0.0d, 0.0d, false, "", 0.0d, false, "", 1, 1, 0, 0.0d, false, 0.0d, false, q4fVar, v21Var, r21Var, false, false, "", "", 0.0d, false, 0.0d, "", false, false, false, false, false, false, false, 0.0d, hxuVar, mob0Var, 0L, "", uoyVar, 0L, 0.0d, 0.0d, false, false, iunVar, kl5.d(0), ozc.POSSIBLE_PAYOUT, "", 0L, "");
    }

    public static final void i(mm40 mm40Var, vul vulVar, wul wulVar, long j, Function0 function0, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        long j2;
        boolean z;
        wulVar.getClass();
        function0.getClass();
        fetVar.g0(692902596);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = i | (fetVar.g(mm40Var2) ? 4 : 2);
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        int i5 = i3 | (fetVar.g(wulVar) ? 256 : 128) | 3072 | (fetVar.i(function0) ? 16384 : 8192);
        if (fetVar.U(i5 & 1, (i5 & 9363) != 9362)) {
            mm40 mm40Var3 = i4 != 0 ? jm40.b : mm40Var2;
            j2 = y3d.f;
            mm40 mm40VarQ = i120.Q(mm40Var3, j2, jd8.n);
            i4 i4VarG0 = dyb.g0(wulVar);
            int iOrdinal = vulVar.ordinal();
            cl5 cl5Var = ukd.f35823a;
            if (iOrdinal == 0) {
                fetVar.e0(159477982);
                zcl zclVar = qmk.f28987a;
                z = (i5 & 57344) == 16384;
                Object objP = fetVar.P();
                if (z || objP == cl5Var) {
                    objP = new cjl(function0, (byte) 7);
                    fetVar.o0(objP);
                }
                j120.i(mm40VarQ, i4VarG0, 12.0f, false, "DS_BUTTON_HORIZONTAL_PRESET", (Function1) objP, fetVar, 27648, 0);
                fetVar.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw b1j.f(159476061, fetVar, false);
                }
                fetVar.e0(159489416);
                z = (i5 & 57344) == 16384;
                Object objP2 = fetVar.P();
                if (z || objP2 == cl5Var) {
                    objP2 = new cjl(function0, (byte) 8);
                    fetVar.o0(objP2);
                }
                j120.j(0, fetVar, i4VarG0, mm40VarQ, (Function1) objP2);
                fetVar.r(false);
            }
            mm40Var2 = mm40Var3;
        } else {
            fetVar.X();
            j2 = j;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rtl(mm40Var2, vulVar, wulVar, j2, function0, i, i2);
        }
    }

    public static final n3w i0(for0 for0Var, String str) {
        for0Var.getClass();
        String str2 = for0Var.f9896a;
        s77 s77Var = s77.TOTO;
        double d = for0Var.e;
        String str3 = for0Var.h;
        long j = for0Var.d;
        e4f e4fVarU = jeb.U(for0Var.g);
        double d2 = for0Var.f;
        double d3 = for0Var.c;
        String str4 = for0Var.i;
        boolean z = for0Var.j;
        q4f q4fVar = for0Var.b;
        v21 v21Var = v21.NONE;
        r21 r21Var = r21.NONE;
        boolean z2 = for0Var.k;
        hxu hxuVar = for0Var.l;
        mob0 mob0Var = mob0.f;
        uoy uoyVar = uoy.UNKNOWN;
        List list = for0Var.m;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wmr0 wmr0Var = (wmr0) it.next();
            wmr0Var.getClass();
            double d4 = d2;
            long j2 = wmr0Var.f39418a;
            Iterator it2 = it;
            String str5 = wmr0Var.b;
            long j3 = wmr0Var.c;
            long j4 = wmr0Var.d;
            long j5 = wmr0Var.e;
            mvn mvnVarX = thb.X(wmr0Var.f);
            String str6 = wmr0Var.g;
            long j6 = wmr0Var.h;
            List list2 = wmr0Var.i;
            String str7 = wmr0Var.j;
            long j7 = wmr0Var.k;
            List list3 = wmr0Var.l;
            String str8 = wmr0Var.m;
            long j8 = wmr0Var.n;
            String str9 = wmr0Var.o;
            int i = wmr0Var.p;
            String str10 = wmr0Var.r;
            arrayList.add(new su6(j2, str5, 0, 0.0d, "", j3, false, j4, j5, "", mvnVarX, false, str6, j6, list2, str7, j7, list3, str8, j8, str9, i, 0, str10, 0L, false, "", "", str10, false, 0.0d, 0L, 0L, "", 0, -1, -1, 0.0d, wmr0Var.q, "", false, "", "", false, wmr0Var.t, wmr0Var.u));
            it = it2;
            d2 = d4;
        }
        an6.f1135a.getClass();
        return new n3w(str2, "", s77Var, 0L, d, str3, str, "", "", j, 0.0d, e4fVarU, 0.0d, 0.0d, d2, d3, lb90.f19744a, 0.0d, 0.0d, false, "", 0.0d, false, str4, 1, 1, 0, 0.0d, false, 0.0d, z, q4fVar, v21Var, r21Var, false, false, "", str4, 0.0d, false, 0.0d, "", false, z2, false, false, false, false, false, 0.0d, hxuVar, mob0Var, 0L, "", uoyVar, 0L, 0.0d, 0.0d, false, false, arrayList, kl5.d(0), ozc.POSSIBLE_PAYOUT, "", for0Var.n, "");
    }

    public static final void j(u5m u5mVar, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i) {
        int i2;
        k6z k6zVar;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(-125241095);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(u5mVar) ? 4 : 2) | i;
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
            i2 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            if (u5mVar.g) {
                fetVar.e0(-97599904);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-97598980);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(-1659306567, new eqk((Object) u5mVar, function0, function1, function2, (byte) 15), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0i((byte) 9, i, (Object) u5mVar, (Object) function0, (Object) function1, (Object) function2);
        }
    }

    public static final List j0(d0t d0tVar, dmr dmrVar) {
        List listG0 = nia0.g0(Q(d0tVar, dmrVar));
        ArrayList arrayList = new ArrayList(r3d.q(listG0, 10));
        Iterator it = listG0.iterator();
        while (it.hasNext()) {
            arrayList.add(jwb.P((vua) it.next()));
        }
        return arrayList.isEmpty() ? kotlin.collections.a.c(jaa.b) : arrayList;
    }

    public static final void k(mm40 mm40Var, qim qimVar, boolean z, e2d e2dVar, ugd ugdVar, Function1 function1, fet fetVar, int i, int i2) {
        qimVar.getClass();
        function1.getClass();
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            e2dVar = nip.d(null, null, fetVar, 7);
        }
        if ((i2 & 16) != 0) {
            ugdVar = null;
        }
        if (qimVar instanceof oim) {
            fetVar.e0(-1300546362);
            int i3 = i >> 3;
            f7k.j(mm40Var, z, (oim) qimVar, ugdVar, function1, fetVar, (i & 14) | (i3 & 112) | ((i << 3) & 896) | (i3 & 7168) | (i3 & 57344));
            fetVar.r(false);
            return;
        }
        ugd ugdVar2 = ugdVar;
        if (qimVar instanceof mim) {
            fetVar.e0(-1300213515);
            ulb.l(mm40Var, (mim) qimVar, z, e2dVar, ugdVar2, function1, fetVar, i & 524286);
            fetVar.r(false);
        } else if (qimVar instanceof lim) {
            fetVar.e0(-1299829487);
            j2e.t(mm40Var, (lim) qimVar, z, e2dVar, ugdVar2, function1, fetVar, i & 524286);
            fetVar.r(false);
        } else {
            if (!(qimVar instanceof nim)) {
                throw b1j.f(512234735, fetVar, false);
            }
            fetVar.e0(-1299432966);
            int i4 = i >> 3;
            sj3.o(mm40Var, z, (nim) qimVar, ugdVar2, function1, fetVar, (i & 14) | (i4 & 112) | ((i << 3) & 896) | (i4 & 7168) | (i4 & 57344));
            fetVar.r(false);
        }
    }

    public static final void l(mm40 mm40Var, wnm wnmVar, fet fetVar, int i) {
        mm40 mm40Var2;
        boolean z;
        fetVar.g0(-1652363095);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(wnmVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(i120.Q(o7k0.d(o7k0.e(mm40Var, 44.0f), 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n), 12.0f, 2.0f, 12.0f, 0.0f, 8);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z2) {
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
            mm40 mm40VarN2 = jm40.b;
            mm40 mm40VarN3 = s5x0.N(mm40VarN2, 0.0f, 0.0f, 0.0f, 4.0f, 7);
            String str = wnmVar.c;
            String str2 = wnmVar.f39457a;
            C(0, fetVar, mm40VarN3, str);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            boolean zG = fetVar.g(str2);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                if (str2.length() == 0) {
                    mm40Var2 = mm40VarN2;
                } else {
                    mm40VarN2 = s5x0.N(mm40VarN2, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                    mm40Var2 = mm40VarN2;
                }
                z = true;
                objP = mm40VarN2.e(new x7z(1.0f, true));
                fetVar.o0(objP);
            } else {
                mm40Var2 = mm40VarN2;
                z = true;
            }
            D(0, fetVar, (mm40) objP, wnmVar.b);
            a(0, fetVar, yyw.U(mm40Var2, 0.5f), str2);
            fetVar.r(z);
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p5m(mm40Var, wnmVar, i, (byte) 27);
        }
    }

    public static final void m(mm40 mm40Var, mym mymVar, fet fetVar, int i) {
        int i2;
        k6z k6zVar;
        fetVar.g0(1792289323);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mymVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (mymVar.g) {
                fetVar.e0(108159826);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(108160750);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(s5x0.L(mm40VarD, 12.0f, 0.0f, 2), 116.0f);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.n, fetVar, 48);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            obc.d(bmd.n.a(k6zVar), u1c.M(1659194209, new mxm(mymVar, (byte) 5), fetVar), fetVar, 56);
            E(0, fetVar, mymVar.e, null);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xvm((byte) 23, i, mm40Var, mymVar);
        }
    }

    public static final void n(mm40 mm40Var, final eim0 eim0Var, Function1 function1, fet fetVar, int i) {
        float f;
        long backgroundContent;
        eim0Var.getClass();
        function1.getClass();
        fetVar.g0(-1090771049);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(eim0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            if (eim0Var instanceof zhm0) {
                zcl zclVar = qmk.f28987a;
                f = 16.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 20.0f;
            }
            float f2 = f;
            pim0 pim0VarE = eim0Var.e();
            if (pim0VarE != null) {
                if (pim0VarE instanceof nim0) {
                    fetVar.e0(-258945183);
                    backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
                    fetVar.r(false);
                } else if (pim0VarE instanceof oim0) {
                    fetVar.e0(-258942264);
                    backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                    fetVar.r(false);
                }
                long j = backgroundContent;
                boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
                Object objP = fetVar.P();
                if (z || objP == ukd.f35823a) {
                    objP = new gnm(function1, eim0Var, (byte) 17);
                    fetVar.o0(objP);
                }
                a8k0.n(y860.W(mm40Var, null, null, false, null, (Function0) objP, 28), f2, j, null, u1c.M(1387378744, new Function2() { // from class: a.s4n
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        boolean z2;
                        boolean z3;
                        boolean z4;
                        boolean z5;
                        boolean z6;
                        byte b3 = b;
                        eim0 eim0Var2 = eim0Var;
                        switch (b3) {
                            case 0:
                                fet fetVar2 = (fet) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    cnm0 cnm0VarD = eim0Var2.d();
                                    boolean z7 = cnm0VarD instanceof xmm0;
                                    jm40 jm40Var = jm40.b;
                                    if (z7) {
                                        fetVar2.e0(929995765);
                                        zcl zclVar3 = qmk.f28987a;
                                        qcc.d(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), ((xmm0) cnm0VarD).f41134a, fetVar2, 0);
                                        fetVar2.r(false);
                                    } else if (cnm0VarD instanceof bnm0) {
                                        fetVar2.e0(930268596);
                                        zcl zclVar4 = qmk.f28987a;
                                        qcc.d(s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), ((bnm0) cnm0VarD).f2891a, fetVar2, 0);
                                        fetVar2.r(false);
                                    } else if (cnm0VarD instanceof anm0) {
                                        fetVar2.e0(930546356);
                                        zcl zclVar5 = qmk.f28987a;
                                        qcc.d(s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), ((anm0) cnm0VarD).f1163a, fetVar2, 0);
                                        fetVar2.r(false);
                                    } else if (cnm0VarD instanceof zmm0) {
                                        fetVar2.e0(930819156);
                                        zcl zclVar6 = qmk.f28987a;
                                        qcc.d(s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), ((zmm0) cnm0VarD).f44632a, fetVar2, 0);
                                        fetVar2.r(false);
                                    } else {
                                        if (!(cnm0VarD instanceof ymm0)) {
                                            throw b1j.f(1831113112, fetVar2, false);
                                        }
                                        fetVar2.e0(931095924);
                                        zcl zclVar7 = qmk.f28987a;
                                        qcc.d(s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), ((ymm0) cnm0VarD).f42898a, fetVar2, 0);
                                        fetVar2.r(false);
                                    }
                                } else {
                                    fetVar2.X();
                                }
                                return Unit.f46060a;
                            default:
                                fet fetVar3 = (fet) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    klm0 klm0VarB = eim0Var2.b();
                                    if (klm0VarB != null) {
                                        boolean z8 = klm0VarB instanceof hkm0;
                                        jm40 jm40Var2 = jm40.b;
                                        if (z8) {
                                            fetVar3.e0(-2098890826);
                                            hkm0 hkm0Var = (hkm0) klm0VarB;
                                            if (hkm0Var instanceof bkm0) {
                                                fetVar3.e0(1827055728);
                                                zcl zclVar8 = qmk.f28987a;
                                                mm40 mm40VarN = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                                bkm0 bkm0Var = (bkm0) hkm0Var;
                                                xtm xtmVar = new xtm(bkm0Var.f2756a, bkm0Var.b, bkm0Var.c, bkm0Var.d, bkm0Var.e, bkm0Var.f, bkm0Var.g, bkm0Var.h, bkm0Var.i, bkm0Var.j, bkm0Var.k);
                                                z6 = false;
                                                w9x.y(mm40VarN, xtmVar, fetVar3, 0);
                                                fetVar3.r(false);
                                            } else if (hkm0Var instanceof ckm0) {
                                                fetVar3.e0(1828577580);
                                                zcl zclVar9 = qmk.f28987a;
                                                ckm0 ckm0Var = (ckm0) hkm0Var;
                                                vbc.y(s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7), ckm0Var.f4514a, ckm0Var.b, ckm0Var.c, fetVar3, 0);
                                                z6 = false;
                                                fetVar3.r(false);
                                            } else if (hkm0Var instanceof dkm0) {
                                                fetVar3.e0(1830248976);
                                                zcl zclVar10 = qmk.f28987a;
                                                mm40 mm40VarN2 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                                dkm0 dkm0Var = (dkm0) hkm0Var;
                                                yxm yxmVar = new yxm(dkm0Var.b, dkm0Var.f6238a, dkm0Var.c, dkm0Var.d, dkm0Var.e);
                                                z6 = false;
                                                jcb.n(mm40VarN2, yxmVar, fetVar3, 0);
                                                fetVar3.r(false);
                                            } else if (hkm0Var instanceof ekm0) {
                                                fetVar3.e0(1831640225);
                                                zcl zclVar11 = qmk.f28987a;
                                                mm40 mm40VarN3 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                                ekm0 ekm0Var = (ekm0) hkm0Var;
                                                bzm bzmVar = ekm0Var.f7959a;
                                                bzm bzmVar2 = ekm0Var.b;
                                                String str = ekm0Var.d;
                                                azm azmVar = ekm0Var.c;
                                                q6x q6xVar = q6x.f28221a;
                                                uym uymVar = new uym(bzmVar, bzmVar2, azmVar, str, ekm0Var.e, ekm0Var.f);
                                                z6 = false;
                                                sj3.r(mm40VarN3, uymVar, fetVar3, 0);
                                                fetVar3.r(false);
                                            } else if (hkm0Var instanceof fkm0) {
                                                fetVar3.e0(1832453045);
                                                zcl zclVar12 = qmk.f28987a;
                                                mm40 mm40VarN4 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                                fkm0 fkm0Var = (fkm0) hkm0Var;
                                                h1n h1nVar = fkm0Var.f9701a;
                                                h1n h1nVar2 = fkm0Var.b;
                                                mpm mpmVar = fkm0Var.c;
                                                String str2 = fkm0Var.d;
                                                String str3 = fkm0Var.e;
                                                String str4 = fkm0Var.f;
                                                x0m x0mVar = x0m.f40076a;
                                                n4c.n(mm40VarN4, h1nVar, h1nVar2, mpmVar, str2, str3, str4, fetVar3, 0);
                                                z6 = false;
                                                fetVar3.r(false);
                                            } else {
                                                if (!(hkm0Var instanceof gkm0)) {
                                                    throw b1j.f(613129619, fetVar3, false);
                                                }
                                                fetVar3.e0(1833064737);
                                                zcl zclVar13 = qmk.f28987a;
                                                mm40 mm40VarN5 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                                gkm0 gkm0Var = (gkm0) hkm0Var;
                                                bzm bzmVar3 = gkm0Var.f11451a;
                                                bzm bzmVar4 = gkm0Var.b;
                                                String str5 = gkm0Var.d;
                                                azm azmVar2 = gkm0Var.c;
                                                q6x q6xVar2 = q6x.f28221a;
                                                uym uymVar2 = new uym(bzmVar3, bzmVar4, azmVar2, str5, gkm0Var.e, gkm0Var.f);
                                                z6 = false;
                                                sj3.r(mm40VarN5, uymVar2, fetVar3, 0);
                                                fetVar3.r(false);
                                            }
                                            fetVar3.r(z6);
                                        } else if (klm0VarB instanceof jlm0) {
                                            fetVar3.e0(-2098706438);
                                            jlm0 jlm0Var = (jlm0) klm0VarB;
                                            if (jlm0Var instanceof dlm0) {
                                                fetVar3.e0(1436207602);
                                                zcl zclVar14 = qmk.f28987a;
                                                mm40 mm40VarN6 = s5x0.N(jm40Var2, 0.0f, 6.0f, 0.0f, 12.0f, 5);
                                                dlm0 dlm0Var = (dlm0) jlm0Var;
                                                i1n i1nVar = dlm0Var.f6290a;
                                                i1n i1nVar2 = dlm0Var.b;
                                                String str6 = dlm0Var.d;
                                                String str7 = dlm0Var.e;
                                                String str8 = dlm0Var.c;
                                                x0m x0mVar2 = x0m.f40076a;
                                                d5c.m(mm40VarN6, i1nVar, i1nVar2, "", str8, str6, str7, fetVar3, 805306368);
                                                z5 = false;
                                                fetVar3.r(false);
                                            } else if (jlm0Var instanceof elm0) {
                                                fetVar3.e0(1437512702);
                                                zcl zclVar15 = qmk.f28987a;
                                                elm0 elm0Var = (elm0) jlm0Var;
                                                xbc.n(s5x0.N(jm40Var2, 0.0f, 6.0f, 0.0f, 12.0f, 5), elm0Var.f8007a, elm0Var.b, elm0Var.c, fetVar3, 0);
                                                z5 = false;
                                                fetVar3.r(false);
                                            } else if (jlm0Var instanceof flm0) {
                                                fetVar3.e0(1439312872);
                                                zcl zclVar16 = qmk.f28987a;
                                                mm40 mm40VarN7 = s5x0.N(jm40Var2, 0.0f, 6.0f, 0.0f, 12.0f, 5);
                                                flm0 flm0Var = (flm0) jlm0Var;
                                                zxm zxmVar = new zxm(flm0Var.f9746a, flm0Var.b, flm0Var.c, flm0Var.d);
                                                z5 = false;
                                                rcb.B(mm40VarN7, zxmVar, fetVar3, 0);
                                                fetVar3.r(false);
                                            } else if (jlm0Var instanceof glm0) {
                                                fetVar3.e0(1440438358);
                                                zcl zclVar17 = qmk.f28987a;
                                                mm40 mm40VarN8 = s5x0.N(jm40Var2, 0.0f, 6.0f, 0.0f, 12.0f, 5);
                                                glm0 glm0Var = (glm0) jlm0Var;
                                                i1n i1nVar3 = glm0Var.f11499a;
                                                i1n i1nVar4 = glm0Var.b;
                                                String str9 = glm0Var.e;
                                                String str10 = glm0Var.f;
                                                String str11 = glm0Var.c;
                                                String str12 = glm0Var.d;
                                                x0m x0mVar3 = x0m.f40076a;
                                                d5c.m(mm40VarN8, i1nVar3, i1nVar4, str11, str12, str9, str10, fetVar3, 0);
                                                z5 = false;
                                                fetVar3.r(false);
                                            } else if (jlm0Var instanceof hlm0) {
                                                fetVar3.e0(1441259858);
                                                zcl zclVar18 = qmk.f28987a;
                                                mm40 mm40VarN9 = s5x0.N(jm40Var2, 0.0f, 6.0f, 0.0f, 12.0f, 5);
                                                hlm0 hlm0Var = (hlm0) jlm0Var;
                                                i1n i1nVar5 = hlm0Var.f13270a;
                                                i1n i1nVar6 = hlm0Var.b;
                                                String str13 = hlm0Var.e;
                                                String str14 = hlm0Var.f;
                                                String str15 = hlm0Var.c;
                                                String str16 = hlm0Var.d;
                                                x0m x0mVar4 = x0m.f40076a;
                                                d5c.m(mm40VarN9, i1nVar5, i1nVar6, str15, str16, str13, str14, fetVar3, 805306368);
                                                z5 = false;
                                                fetVar3.r(false);
                                            } else {
                                                if (!(jlm0Var instanceof ilm0)) {
                                                    throw b1j.f(-1477688636, fetVar3, false);
                                                }
                                                fetVar3.e0(1442081110);
                                                zcl zclVar19 = qmk.f28987a;
                                                mm40 mm40VarN10 = s5x0.N(jm40Var2, 0.0f, 6.0f, 0.0f, 12.0f, 5);
                                                ilm0 ilm0Var = (ilm0) jlm0Var;
                                                i1n i1nVar7 = ilm0Var.f14987a;
                                                i1n i1nVar8 = ilm0Var.b;
                                                String str17 = ilm0Var.e;
                                                String str18 = ilm0Var.f;
                                                String str19 = ilm0Var.c;
                                                String str20 = ilm0Var.d;
                                                x0m x0mVar5 = x0m.f40076a;
                                                d5c.m(mm40VarN10, i1nVar7, i1nVar8, str19, str20, str17, str18, fetVar3, 0);
                                                z5 = false;
                                                fetVar3.r(false);
                                            }
                                            fetVar3.r(z5);
                                        } else if (klm0VarB instanceof clm0) {
                                            fetVar3.e0(-2098521802);
                                            clm0 clm0Var = (clm0) klm0VarB;
                                            if (clm0Var instanceof wkm0) {
                                                fetVar3.e0(2113780272);
                                                zcl zclVar20 = qmk.f28987a;
                                                wkm0 wkm0Var = (wkm0) clm0Var;
                                                x9x.A(s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7), new ytm(wkm0Var.f39314a, wkm0Var.b, wkm0Var.c, wkm0Var.d, wkm0Var.e, wkm0Var.f, wkm0Var.g, wkm0Var.h, wkm0Var.i, wkm0Var.j, wkm0Var.k, wkm0Var.l, wkm0Var.m), fetVar3, 0);
                                                fetVar3.r(false);
                                                z4 = false;
                                            } else if (clm0Var instanceof xkm0) {
                                                fetVar3.e0(2115690461);
                                                zcl zclVar21 = qmk.f28987a;
                                                xkm0 xkm0Var = (xkm0) clm0Var;
                                                qcc.l(s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7), xkm0Var.f41035a, xkm0Var.b, xkm0Var.c, fetVar3, 0);
                                                z4 = false;
                                                fetVar3.r(false);
                                            } else if (clm0Var instanceof ykm0) {
                                                fetVar3.e0(2117482726);
                                                zcl zclVar22 = qmk.f28987a;
                                                mm40 mm40VarN11 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                ykm0 ykm0Var = (ykm0) clm0Var;
                                                aym aymVar = new aym(ykm0Var.b, ykm0Var.f42798a, ykm0Var.c, ykm0Var.d, ykm0Var.e);
                                                z4 = false;
                                                vdb.z(mm40VarN11, aymVar, fetVar3, 0);
                                                fetVar3.r(false);
                                            } else if (clm0Var instanceof zkm0) {
                                                fetVar3.e0(2118681589);
                                                zcl zclVar23 = qmk.f28987a;
                                                mm40 mm40VarN12 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                zkm0 zkm0Var = (zkm0) clm0Var;
                                                j1n j1nVar = zkm0Var.f44541a;
                                                j1n j1nVar2 = zkm0Var.b;
                                                String str21 = zkm0Var.d;
                                                String str22 = zkm0Var.e;
                                                String str23 = zkm0Var.f;
                                                String str24 = zkm0Var.c;
                                                x0m x0mVar6 = x0m.f40076a;
                                                aac.q(mm40VarN12, j1nVar, j1nVar2, str24, str21, str22, str23, fetVar3, 0);
                                                z4 = false;
                                                fetVar3.r(false);
                                            } else if (clm0Var instanceof alm0) {
                                                fetVar3.e0(2119486225);
                                                zcl zclVar24 = qmk.f28987a;
                                                mm40 mm40VarN13 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                alm0 alm0Var = (alm0) clm0Var;
                                                j1n j1nVar3 = alm0Var.f1076a;
                                                j1n j1nVar4 = alm0Var.b;
                                                String str25 = alm0Var.d;
                                                String str26 = alm0Var.e;
                                                String str27 = alm0Var.f;
                                                String str28 = alm0Var.c;
                                                x0m x0mVar7 = x0m.f40076a;
                                                aac.q(mm40VarN13, j1nVar3, j1nVar4, str28, str25, str26, str27, fetVar3, 805306368);
                                                z4 = false;
                                                fetVar3.r(false);
                                            } else {
                                                if (!(clm0Var instanceof blm0)) {
                                                    throw b1j.f(1869305128, fetVar3, false);
                                                }
                                                fetVar3.e0(2120290613);
                                                zcl zclVar25 = qmk.f28987a;
                                                mm40 mm40VarN14 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                blm0 blm0Var = (blm0) clm0Var;
                                                j1n j1nVar5 = blm0Var.f2802a;
                                                j1n j1nVar6 = blm0Var.b;
                                                String str29 = blm0Var.d;
                                                String str30 = blm0Var.e;
                                                String str31 = blm0Var.f;
                                                String str32 = blm0Var.c;
                                                x0m x0mVar8 = x0m.f40076a;
                                                aac.q(mm40VarN14, j1nVar5, j1nVar6, str32, str29, str30, str31, fetVar3, 0);
                                                z4 = false;
                                                fetVar3.r(false);
                                            }
                                            fetVar3.r(z4);
                                        } else if (klm0VarB instanceof vkm0) {
                                            fetVar3.e0(-2098338437);
                                            vkm0 vkm0Var = (vkm0) klm0VarB;
                                            if (vkm0Var instanceof pkm0) {
                                                fetVar3.e0(975045769);
                                                zcl zclVar26 = qmk.f28987a;
                                                pkm0 pkm0Var = (pkm0) vkm0Var;
                                                kcx.u(s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7), new ztm(pkm0Var.f27142a, pkm0Var.b, pkm0Var.c, pkm0Var.d, pkm0Var.e, pkm0Var.f, pkm0Var.g, pkm0Var.h, pkm0Var.i, pkm0Var.j, pkm0Var.k, pkm0Var.l, pkm0Var.m), fetVar3, 0);
                                                fetVar3.r(false);
                                                z3 = false;
                                            } else if (vkm0Var instanceof qkm0) {
                                                fetVar3.e0(976689110);
                                                zcl zclVar27 = qmk.f28987a;
                                                qkm0 qkm0Var = (qkm0) vkm0Var;
                                                vcc.j(s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7), qkm0Var.f28893a, qkm0Var.b, qkm0Var.c, fetVar3, 0);
                                                z3 = false;
                                                fetVar3.r(false);
                                            } else if (vkm0Var instanceof rkm0) {
                                                fetVar3.e0(978533951);
                                                zcl zclVar28 = qmk.f28987a;
                                                mm40 mm40VarN15 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                rkm0 rkm0Var = (rkm0) vkm0Var;
                                                bym bymVar = new bym(rkm0Var.b, rkm0Var.f30656a, rkm0Var.c, rkm0Var.d, rkm0Var.e);
                                                z3 = false;
                                                feb.p(mm40VarN15, bymVar, fetVar3, 0);
                                                fetVar3.r(false);
                                            } else if (vkm0Var instanceof skm0) {
                                                fetVar3.e0(979897424);
                                                zcl zclVar29 = qmk.f28987a;
                                                mm40 mm40VarN16 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                skm0 skm0Var = (skm0) vkm0Var;
                                                bzm bzmVar5 = skm0Var.f32358a;
                                                bzm bzmVar6 = skm0Var.b;
                                                String str33 = skm0Var.d;
                                                azm azmVar3 = skm0Var.c;
                                                q6x q6xVar3 = q6x.f28221a;
                                                vym vymVar = new vym(bzmVar5, bzmVar6, azmVar3, str33, skm0Var.e, skm0Var.f);
                                                z3 = false;
                                                kpb.k(mm40VarN16, vymVar, fetVar3, 0);
                                                fetVar3.r(false);
                                            } else if (vkm0Var instanceof tkm0) {
                                                fetVar3.e0(980710027);
                                                zcl zclVar30 = qmk.f28987a;
                                                mm40 mm40VarN17 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                tkm0 tkm0Var = (tkm0) vkm0Var;
                                                k1n k1nVar = tkm0Var.f34102a;
                                                k1n k1nVar2 = tkm0Var.b;
                                                String str34 = tkm0Var.d;
                                                String str35 = tkm0Var.e;
                                                a2m a2mVar = tkm0Var.c;
                                                String str36 = tkm0Var.f;
                                                x0m x0mVar9 = x0m.f40076a;
                                                sac.r(mm40VarN17, k1nVar, k1nVar2, a2mVar, str34, str35, str36, fetVar3, 0);
                                                z3 = false;
                                                fetVar3.r(false);
                                            } else {
                                                if (!(vkm0Var instanceof ukm0)) {
                                                    throw b1j.f(-245638306, fetVar3, false);
                                                }
                                                fetVar3.e0(981310776);
                                                zcl zclVar31 = qmk.f28987a;
                                                mm40 mm40VarN18 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                ukm0 ukm0Var = (ukm0) vkm0Var;
                                                bzm bzmVar7 = ukm0Var.f35835a;
                                                bzm bzmVar8 = ukm0Var.b;
                                                String str37 = ukm0Var.d;
                                                azm azmVar4 = ukm0Var.c;
                                                q6x q6xVar4 = q6x.f28221a;
                                                vym vymVar2 = new vym(bzmVar7, bzmVar8, azmVar4, str37, ukm0Var.e, ukm0Var.f);
                                                z3 = false;
                                                kpb.k(mm40VarN18, vymVar2, fetVar3, 0);
                                                fetVar3.r(false);
                                            }
                                            fetVar3.r(z3);
                                        } else if (klm0VarB instanceof okm0) {
                                            fetVar3.e0(-2098155785);
                                            okm0 okm0Var = (okm0) klm0VarB;
                                            if (okm0Var instanceof ikm0) {
                                                fetVar3.e0(678614378);
                                                zcl zclVar32 = qmk.f28987a;
                                                ikm0 ikm0Var = (ikm0) okm0Var;
                                                kcx.u(s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7), new ztm(ikm0Var.f14934a, ikm0Var.b, ikm0Var.c, ikm0Var.d, ikm0Var.e, ikm0Var.f, ikm0Var.g, ikm0Var.h, ikm0Var.i, ikm0Var.j, ikm0Var.k, ikm0Var.l, ikm0Var.m), fetVar3, 0);
                                                fetVar3.r(false);
                                                z2 = false;
                                            } else if (okm0Var instanceof jkm0) {
                                                fetVar3.e0(680265655);
                                                zcl zclVar33 = qmk.f28987a;
                                                jkm0 jkm0Var = (jkm0) okm0Var;
                                                vcc.j(s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7), jkm0Var.f16677a, jkm0Var.b, jkm0Var.c, fetVar3, 0);
                                                z2 = false;
                                                fetVar3.r(false);
                                            } else if (okm0Var instanceof kkm0) {
                                                fetVar3.e0(682122400);
                                                zcl zclVar34 = qmk.f28987a;
                                                mm40 mm40VarN19 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                kkm0 kkm0Var = (kkm0) okm0Var;
                                                bym bymVar2 = new bym(kkm0Var.b, kkm0Var.f18448a, kkm0Var.c, kkm0Var.d, kkm0Var.e);
                                                z2 = false;
                                                feb.p(mm40VarN19, bymVar2, fetVar3, 0);
                                                fetVar3.r(false);
                                            } else if (okm0Var instanceof lkm0) {
                                                fetVar3.e0(683493809);
                                                zcl zclVar35 = qmk.f28987a;
                                                mm40 mm40VarN20 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                lkm0 lkm0Var = (lkm0) okm0Var;
                                                bzm bzmVar9 = lkm0Var.f20207a;
                                                bzm bzmVar10 = lkm0Var.b;
                                                String str38 = lkm0Var.d;
                                                azm azmVar5 = lkm0Var.c;
                                                q6x q6xVar5 = q6x.f28221a;
                                                vym vymVar3 = new vym(bzmVar9, bzmVar10, azmVar5, str38, lkm0Var.e, lkm0Var.f);
                                                z2 = false;
                                                kpb.k(mm40VarN20, vymVar3, fetVar3, 0);
                                                fetVar3.r(false);
                                            } else if (okm0Var instanceof mkm0) {
                                                fetVar3.e0(684310380);
                                                zcl zclVar36 = qmk.f28987a;
                                                mm40 mm40VarN21 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                mkm0 mkm0Var = (mkm0) okm0Var;
                                                k1n k1nVar3 = mkm0Var.f21950a;
                                                k1n k1nVar4 = mkm0Var.b;
                                                String str39 = mkm0Var.d;
                                                String str40 = mkm0Var.e;
                                                a2m a2mVar2 = mkm0Var.c;
                                                String str41 = mkm0Var.f;
                                                x0m x0mVar10 = x0m.f40076a;
                                                sac.r(mm40VarN21, k1nVar3, k1nVar4, a2mVar2, str39, str40, str41, fetVar3, 0);
                                                z2 = false;
                                                fetVar3.r(false);
                                            } else {
                                                if (!(okm0Var instanceof nkm0)) {
                                                    throw b1j.f(1823009285, fetVar3, false);
                                                }
                                                fetVar3.e0(684915097);
                                                zcl zclVar37 = qmk.f28987a;
                                                mm40 mm40VarN22 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                nkm0 nkm0Var = (nkm0) okm0Var;
                                                bzm bzmVar11 = nkm0Var.f23687a;
                                                bzm bzmVar12 = nkm0Var.b;
                                                String str42 = nkm0Var.d;
                                                azm azmVar6 = nkm0Var.c;
                                                q6x q6xVar6 = q6x.f28221a;
                                                vym vymVar4 = new vym(bzmVar11, bzmVar12, azmVar6, str42, nkm0Var.e, nkm0Var.f);
                                                z2 = false;
                                                kpb.k(mm40VarN22, vymVar4, fetVar3, 0);
                                                fetVar3.r(false);
                                            }
                                            fetVar3.r(z2);
                                        }
                                    }
                                    throw b1j.f(-344803662, fetVar3, false);
                                }
                                fetVar3.X();
                                return Unit.f46060a;
                        }
                    }
                }, fetVar), u1c.M(902433495, new Function2() { // from class: a.s4n
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        boolean z2;
                        boolean z3;
                        boolean z4;
                        boolean z5;
                        boolean z6;
                        byte b3 = b2;
                        eim0 eim0Var2 = eim0Var;
                        switch (b3) {
                            case 0:
                                fet fetVar2 = (fet) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    cnm0 cnm0VarD = eim0Var2.d();
                                    boolean z7 = cnm0VarD instanceof xmm0;
                                    jm40 jm40Var = jm40.b;
                                    if (z7) {
                                        fetVar2.e0(929995765);
                                        zcl zclVar3 = qmk.f28987a;
                                        qcc.d(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), ((xmm0) cnm0VarD).f41134a, fetVar2, 0);
                                        fetVar2.r(false);
                                    } else if (cnm0VarD instanceof bnm0) {
                                        fetVar2.e0(930268596);
                                        zcl zclVar4 = qmk.f28987a;
                                        qcc.d(s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), ((bnm0) cnm0VarD).f2891a, fetVar2, 0);
                                        fetVar2.r(false);
                                    } else if (cnm0VarD instanceof anm0) {
                                        fetVar2.e0(930546356);
                                        zcl zclVar5 = qmk.f28987a;
                                        qcc.d(s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), ((anm0) cnm0VarD).f1163a, fetVar2, 0);
                                        fetVar2.r(false);
                                    } else if (cnm0VarD instanceof zmm0) {
                                        fetVar2.e0(930819156);
                                        zcl zclVar6 = qmk.f28987a;
                                        qcc.d(s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), ((zmm0) cnm0VarD).f44632a, fetVar2, 0);
                                        fetVar2.r(false);
                                    } else {
                                        if (!(cnm0VarD instanceof ymm0)) {
                                            throw b1j.f(1831113112, fetVar2, false);
                                        }
                                        fetVar2.e0(931095924);
                                        zcl zclVar7 = qmk.f28987a;
                                        qcc.d(s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), ((ymm0) cnm0VarD).f42898a, fetVar2, 0);
                                        fetVar2.r(false);
                                    }
                                } else {
                                    fetVar2.X();
                                }
                                return Unit.f46060a;
                            default:
                                fet fetVar3 = (fet) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    klm0 klm0VarB = eim0Var2.b();
                                    if (klm0VarB != null) {
                                        boolean z8 = klm0VarB instanceof hkm0;
                                        jm40 jm40Var2 = jm40.b;
                                        if (z8) {
                                            fetVar3.e0(-2098890826);
                                            hkm0 hkm0Var = (hkm0) klm0VarB;
                                            if (hkm0Var instanceof bkm0) {
                                                fetVar3.e0(1827055728);
                                                zcl zclVar8 = qmk.f28987a;
                                                mm40 mm40VarN = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                                bkm0 bkm0Var = (bkm0) hkm0Var;
                                                xtm xtmVar = new xtm(bkm0Var.f2756a, bkm0Var.b, bkm0Var.c, bkm0Var.d, bkm0Var.e, bkm0Var.f, bkm0Var.g, bkm0Var.h, bkm0Var.i, bkm0Var.j, bkm0Var.k);
                                                z6 = false;
                                                w9x.y(mm40VarN, xtmVar, fetVar3, 0);
                                                fetVar3.r(false);
                                            } else if (hkm0Var instanceof ckm0) {
                                                fetVar3.e0(1828577580);
                                                zcl zclVar9 = qmk.f28987a;
                                                ckm0 ckm0Var = (ckm0) hkm0Var;
                                                vbc.y(s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7), ckm0Var.f4514a, ckm0Var.b, ckm0Var.c, fetVar3, 0);
                                                z6 = false;
                                                fetVar3.r(false);
                                            } else if (hkm0Var instanceof dkm0) {
                                                fetVar3.e0(1830248976);
                                                zcl zclVar10 = qmk.f28987a;
                                                mm40 mm40VarN2 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                                dkm0 dkm0Var = (dkm0) hkm0Var;
                                                yxm yxmVar = new yxm(dkm0Var.b, dkm0Var.f6238a, dkm0Var.c, dkm0Var.d, dkm0Var.e);
                                                z6 = false;
                                                jcb.n(mm40VarN2, yxmVar, fetVar3, 0);
                                                fetVar3.r(false);
                                            } else if (hkm0Var instanceof ekm0) {
                                                fetVar3.e0(1831640225);
                                                zcl zclVar11 = qmk.f28987a;
                                                mm40 mm40VarN3 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                                ekm0 ekm0Var = (ekm0) hkm0Var;
                                                bzm bzmVar = ekm0Var.f7959a;
                                                bzm bzmVar2 = ekm0Var.b;
                                                String str = ekm0Var.d;
                                                azm azmVar = ekm0Var.c;
                                                q6x q6xVar = q6x.f28221a;
                                                uym uymVar = new uym(bzmVar, bzmVar2, azmVar, str, ekm0Var.e, ekm0Var.f);
                                                z6 = false;
                                                sj3.r(mm40VarN3, uymVar, fetVar3, 0);
                                                fetVar3.r(false);
                                            } else if (hkm0Var instanceof fkm0) {
                                                fetVar3.e0(1832453045);
                                                zcl zclVar12 = qmk.f28987a;
                                                mm40 mm40VarN4 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                                fkm0 fkm0Var = (fkm0) hkm0Var;
                                                h1n h1nVar = fkm0Var.f9701a;
                                                h1n h1nVar2 = fkm0Var.b;
                                                mpm mpmVar = fkm0Var.c;
                                                String str2 = fkm0Var.d;
                                                String str3 = fkm0Var.e;
                                                String str4 = fkm0Var.f;
                                                x0m x0mVar = x0m.f40076a;
                                                n4c.n(mm40VarN4, h1nVar, h1nVar2, mpmVar, str2, str3, str4, fetVar3, 0);
                                                z6 = false;
                                                fetVar3.r(false);
                                            } else {
                                                if (!(hkm0Var instanceof gkm0)) {
                                                    throw b1j.f(613129619, fetVar3, false);
                                                }
                                                fetVar3.e0(1833064737);
                                                zcl zclVar13 = qmk.f28987a;
                                                mm40 mm40VarN5 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                                gkm0 gkm0Var = (gkm0) hkm0Var;
                                                bzm bzmVar3 = gkm0Var.f11451a;
                                                bzm bzmVar4 = gkm0Var.b;
                                                String str5 = gkm0Var.d;
                                                azm azmVar2 = gkm0Var.c;
                                                q6x q6xVar2 = q6x.f28221a;
                                                uym uymVar2 = new uym(bzmVar3, bzmVar4, azmVar2, str5, gkm0Var.e, gkm0Var.f);
                                                z6 = false;
                                                sj3.r(mm40VarN5, uymVar2, fetVar3, 0);
                                                fetVar3.r(false);
                                            }
                                            fetVar3.r(z6);
                                        } else if (klm0VarB instanceof jlm0) {
                                            fetVar3.e0(-2098706438);
                                            jlm0 jlm0Var = (jlm0) klm0VarB;
                                            if (jlm0Var instanceof dlm0) {
                                                fetVar3.e0(1436207602);
                                                zcl zclVar14 = qmk.f28987a;
                                                mm40 mm40VarN6 = s5x0.N(jm40Var2, 0.0f, 6.0f, 0.0f, 12.0f, 5);
                                                dlm0 dlm0Var = (dlm0) jlm0Var;
                                                i1n i1nVar = dlm0Var.f6290a;
                                                i1n i1nVar2 = dlm0Var.b;
                                                String str6 = dlm0Var.d;
                                                String str7 = dlm0Var.e;
                                                String str8 = dlm0Var.c;
                                                x0m x0mVar2 = x0m.f40076a;
                                                d5c.m(mm40VarN6, i1nVar, i1nVar2, "", str8, str6, str7, fetVar3, 805306368);
                                                z5 = false;
                                                fetVar3.r(false);
                                            } else if (jlm0Var instanceof elm0) {
                                                fetVar3.e0(1437512702);
                                                zcl zclVar15 = qmk.f28987a;
                                                elm0 elm0Var = (elm0) jlm0Var;
                                                xbc.n(s5x0.N(jm40Var2, 0.0f, 6.0f, 0.0f, 12.0f, 5), elm0Var.f8007a, elm0Var.b, elm0Var.c, fetVar3, 0);
                                                z5 = false;
                                                fetVar3.r(false);
                                            } else if (jlm0Var instanceof flm0) {
                                                fetVar3.e0(1439312872);
                                                zcl zclVar16 = qmk.f28987a;
                                                mm40 mm40VarN7 = s5x0.N(jm40Var2, 0.0f, 6.0f, 0.0f, 12.0f, 5);
                                                flm0 flm0Var = (flm0) jlm0Var;
                                                zxm zxmVar = new zxm(flm0Var.f9746a, flm0Var.b, flm0Var.c, flm0Var.d);
                                                z5 = false;
                                                rcb.B(mm40VarN7, zxmVar, fetVar3, 0);
                                                fetVar3.r(false);
                                            } else if (jlm0Var instanceof glm0) {
                                                fetVar3.e0(1440438358);
                                                zcl zclVar17 = qmk.f28987a;
                                                mm40 mm40VarN8 = s5x0.N(jm40Var2, 0.0f, 6.0f, 0.0f, 12.0f, 5);
                                                glm0 glm0Var = (glm0) jlm0Var;
                                                i1n i1nVar3 = glm0Var.f11499a;
                                                i1n i1nVar4 = glm0Var.b;
                                                String str9 = glm0Var.e;
                                                String str10 = glm0Var.f;
                                                String str11 = glm0Var.c;
                                                String str12 = glm0Var.d;
                                                x0m x0mVar3 = x0m.f40076a;
                                                d5c.m(mm40VarN8, i1nVar3, i1nVar4, str11, str12, str9, str10, fetVar3, 0);
                                                z5 = false;
                                                fetVar3.r(false);
                                            } else if (jlm0Var instanceof hlm0) {
                                                fetVar3.e0(1441259858);
                                                zcl zclVar18 = qmk.f28987a;
                                                mm40 mm40VarN9 = s5x0.N(jm40Var2, 0.0f, 6.0f, 0.0f, 12.0f, 5);
                                                hlm0 hlm0Var = (hlm0) jlm0Var;
                                                i1n i1nVar5 = hlm0Var.f13270a;
                                                i1n i1nVar6 = hlm0Var.b;
                                                String str13 = hlm0Var.e;
                                                String str14 = hlm0Var.f;
                                                String str15 = hlm0Var.c;
                                                String str16 = hlm0Var.d;
                                                x0m x0mVar4 = x0m.f40076a;
                                                d5c.m(mm40VarN9, i1nVar5, i1nVar6, str15, str16, str13, str14, fetVar3, 805306368);
                                                z5 = false;
                                                fetVar3.r(false);
                                            } else {
                                                if (!(jlm0Var instanceof ilm0)) {
                                                    throw b1j.f(-1477688636, fetVar3, false);
                                                }
                                                fetVar3.e0(1442081110);
                                                zcl zclVar19 = qmk.f28987a;
                                                mm40 mm40VarN10 = s5x0.N(jm40Var2, 0.0f, 6.0f, 0.0f, 12.0f, 5);
                                                ilm0 ilm0Var = (ilm0) jlm0Var;
                                                i1n i1nVar7 = ilm0Var.f14987a;
                                                i1n i1nVar8 = ilm0Var.b;
                                                String str17 = ilm0Var.e;
                                                String str18 = ilm0Var.f;
                                                String str19 = ilm0Var.c;
                                                String str20 = ilm0Var.d;
                                                x0m x0mVar5 = x0m.f40076a;
                                                d5c.m(mm40VarN10, i1nVar7, i1nVar8, str19, str20, str17, str18, fetVar3, 0);
                                                z5 = false;
                                                fetVar3.r(false);
                                            }
                                            fetVar3.r(z5);
                                        } else if (klm0VarB instanceof clm0) {
                                            fetVar3.e0(-2098521802);
                                            clm0 clm0Var = (clm0) klm0VarB;
                                            if (clm0Var instanceof wkm0) {
                                                fetVar3.e0(2113780272);
                                                zcl zclVar20 = qmk.f28987a;
                                                wkm0 wkm0Var = (wkm0) clm0Var;
                                                x9x.A(s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7), new ytm(wkm0Var.f39314a, wkm0Var.b, wkm0Var.c, wkm0Var.d, wkm0Var.e, wkm0Var.f, wkm0Var.g, wkm0Var.h, wkm0Var.i, wkm0Var.j, wkm0Var.k, wkm0Var.l, wkm0Var.m), fetVar3, 0);
                                                fetVar3.r(false);
                                                z4 = false;
                                            } else if (clm0Var instanceof xkm0) {
                                                fetVar3.e0(2115690461);
                                                zcl zclVar21 = qmk.f28987a;
                                                xkm0 xkm0Var = (xkm0) clm0Var;
                                                qcc.l(s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7), xkm0Var.f41035a, xkm0Var.b, xkm0Var.c, fetVar3, 0);
                                                z4 = false;
                                                fetVar3.r(false);
                                            } else if (clm0Var instanceof ykm0) {
                                                fetVar3.e0(2117482726);
                                                zcl zclVar22 = qmk.f28987a;
                                                mm40 mm40VarN11 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                ykm0 ykm0Var = (ykm0) clm0Var;
                                                aym aymVar = new aym(ykm0Var.b, ykm0Var.f42798a, ykm0Var.c, ykm0Var.d, ykm0Var.e);
                                                z4 = false;
                                                vdb.z(mm40VarN11, aymVar, fetVar3, 0);
                                                fetVar3.r(false);
                                            } else if (clm0Var instanceof zkm0) {
                                                fetVar3.e0(2118681589);
                                                zcl zclVar23 = qmk.f28987a;
                                                mm40 mm40VarN12 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                zkm0 zkm0Var = (zkm0) clm0Var;
                                                j1n j1nVar = zkm0Var.f44541a;
                                                j1n j1nVar2 = zkm0Var.b;
                                                String str21 = zkm0Var.d;
                                                String str22 = zkm0Var.e;
                                                String str23 = zkm0Var.f;
                                                String str24 = zkm0Var.c;
                                                x0m x0mVar6 = x0m.f40076a;
                                                aac.q(mm40VarN12, j1nVar, j1nVar2, str24, str21, str22, str23, fetVar3, 0);
                                                z4 = false;
                                                fetVar3.r(false);
                                            } else if (clm0Var instanceof alm0) {
                                                fetVar3.e0(2119486225);
                                                zcl zclVar24 = qmk.f28987a;
                                                mm40 mm40VarN13 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                alm0 alm0Var = (alm0) clm0Var;
                                                j1n j1nVar3 = alm0Var.f1076a;
                                                j1n j1nVar4 = alm0Var.b;
                                                String str25 = alm0Var.d;
                                                String str26 = alm0Var.e;
                                                String str27 = alm0Var.f;
                                                String str28 = alm0Var.c;
                                                x0m x0mVar7 = x0m.f40076a;
                                                aac.q(mm40VarN13, j1nVar3, j1nVar4, str28, str25, str26, str27, fetVar3, 805306368);
                                                z4 = false;
                                                fetVar3.r(false);
                                            } else {
                                                if (!(clm0Var instanceof blm0)) {
                                                    throw b1j.f(1869305128, fetVar3, false);
                                                }
                                                fetVar3.e0(2120290613);
                                                zcl zclVar25 = qmk.f28987a;
                                                mm40 mm40VarN14 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                blm0 blm0Var = (blm0) clm0Var;
                                                j1n j1nVar5 = blm0Var.f2802a;
                                                j1n j1nVar6 = blm0Var.b;
                                                String str29 = blm0Var.d;
                                                String str30 = blm0Var.e;
                                                String str31 = blm0Var.f;
                                                String str32 = blm0Var.c;
                                                x0m x0mVar8 = x0m.f40076a;
                                                aac.q(mm40VarN14, j1nVar5, j1nVar6, str32, str29, str30, str31, fetVar3, 0);
                                                z4 = false;
                                                fetVar3.r(false);
                                            }
                                            fetVar3.r(z4);
                                        } else if (klm0VarB instanceof vkm0) {
                                            fetVar3.e0(-2098338437);
                                            vkm0 vkm0Var = (vkm0) klm0VarB;
                                            if (vkm0Var instanceof pkm0) {
                                                fetVar3.e0(975045769);
                                                zcl zclVar26 = qmk.f28987a;
                                                pkm0 pkm0Var = (pkm0) vkm0Var;
                                                kcx.u(s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7), new ztm(pkm0Var.f27142a, pkm0Var.b, pkm0Var.c, pkm0Var.d, pkm0Var.e, pkm0Var.f, pkm0Var.g, pkm0Var.h, pkm0Var.i, pkm0Var.j, pkm0Var.k, pkm0Var.l, pkm0Var.m), fetVar3, 0);
                                                fetVar3.r(false);
                                                z3 = false;
                                            } else if (vkm0Var instanceof qkm0) {
                                                fetVar3.e0(976689110);
                                                zcl zclVar27 = qmk.f28987a;
                                                qkm0 qkm0Var = (qkm0) vkm0Var;
                                                vcc.j(s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7), qkm0Var.f28893a, qkm0Var.b, qkm0Var.c, fetVar3, 0);
                                                z3 = false;
                                                fetVar3.r(false);
                                            } else if (vkm0Var instanceof rkm0) {
                                                fetVar3.e0(978533951);
                                                zcl zclVar28 = qmk.f28987a;
                                                mm40 mm40VarN15 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                rkm0 rkm0Var = (rkm0) vkm0Var;
                                                bym bymVar = new bym(rkm0Var.b, rkm0Var.f30656a, rkm0Var.c, rkm0Var.d, rkm0Var.e);
                                                z3 = false;
                                                feb.p(mm40VarN15, bymVar, fetVar3, 0);
                                                fetVar3.r(false);
                                            } else if (vkm0Var instanceof skm0) {
                                                fetVar3.e0(979897424);
                                                zcl zclVar29 = qmk.f28987a;
                                                mm40 mm40VarN16 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                skm0 skm0Var = (skm0) vkm0Var;
                                                bzm bzmVar5 = skm0Var.f32358a;
                                                bzm bzmVar6 = skm0Var.b;
                                                String str33 = skm0Var.d;
                                                azm azmVar3 = skm0Var.c;
                                                q6x q6xVar3 = q6x.f28221a;
                                                vym vymVar = new vym(bzmVar5, bzmVar6, azmVar3, str33, skm0Var.e, skm0Var.f);
                                                z3 = false;
                                                kpb.k(mm40VarN16, vymVar, fetVar3, 0);
                                                fetVar3.r(false);
                                            } else if (vkm0Var instanceof tkm0) {
                                                fetVar3.e0(980710027);
                                                zcl zclVar30 = qmk.f28987a;
                                                mm40 mm40VarN17 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                tkm0 tkm0Var = (tkm0) vkm0Var;
                                                k1n k1nVar = tkm0Var.f34102a;
                                                k1n k1nVar2 = tkm0Var.b;
                                                String str34 = tkm0Var.d;
                                                String str35 = tkm0Var.e;
                                                a2m a2mVar = tkm0Var.c;
                                                String str36 = tkm0Var.f;
                                                x0m x0mVar9 = x0m.f40076a;
                                                sac.r(mm40VarN17, k1nVar, k1nVar2, a2mVar, str34, str35, str36, fetVar3, 0);
                                                z3 = false;
                                                fetVar3.r(false);
                                            } else {
                                                if (!(vkm0Var instanceof ukm0)) {
                                                    throw b1j.f(-245638306, fetVar3, false);
                                                }
                                                fetVar3.e0(981310776);
                                                zcl zclVar31 = qmk.f28987a;
                                                mm40 mm40VarN18 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                ukm0 ukm0Var = (ukm0) vkm0Var;
                                                bzm bzmVar7 = ukm0Var.f35835a;
                                                bzm bzmVar8 = ukm0Var.b;
                                                String str37 = ukm0Var.d;
                                                azm azmVar4 = ukm0Var.c;
                                                q6x q6xVar4 = q6x.f28221a;
                                                vym vymVar2 = new vym(bzmVar7, bzmVar8, azmVar4, str37, ukm0Var.e, ukm0Var.f);
                                                z3 = false;
                                                kpb.k(mm40VarN18, vymVar2, fetVar3, 0);
                                                fetVar3.r(false);
                                            }
                                            fetVar3.r(z3);
                                        } else if (klm0VarB instanceof okm0) {
                                            fetVar3.e0(-2098155785);
                                            okm0 okm0Var = (okm0) klm0VarB;
                                            if (okm0Var instanceof ikm0) {
                                                fetVar3.e0(678614378);
                                                zcl zclVar32 = qmk.f28987a;
                                                ikm0 ikm0Var = (ikm0) okm0Var;
                                                kcx.u(s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7), new ztm(ikm0Var.f14934a, ikm0Var.b, ikm0Var.c, ikm0Var.d, ikm0Var.e, ikm0Var.f, ikm0Var.g, ikm0Var.h, ikm0Var.i, ikm0Var.j, ikm0Var.k, ikm0Var.l, ikm0Var.m), fetVar3, 0);
                                                fetVar3.r(false);
                                                z2 = false;
                                            } else if (okm0Var instanceof jkm0) {
                                                fetVar3.e0(680265655);
                                                zcl zclVar33 = qmk.f28987a;
                                                jkm0 jkm0Var = (jkm0) okm0Var;
                                                vcc.j(s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7), jkm0Var.f16677a, jkm0Var.b, jkm0Var.c, fetVar3, 0);
                                                z2 = false;
                                                fetVar3.r(false);
                                            } else if (okm0Var instanceof kkm0) {
                                                fetVar3.e0(682122400);
                                                zcl zclVar34 = qmk.f28987a;
                                                mm40 mm40VarN19 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                kkm0 kkm0Var = (kkm0) okm0Var;
                                                bym bymVar2 = new bym(kkm0Var.b, kkm0Var.f18448a, kkm0Var.c, kkm0Var.d, kkm0Var.e);
                                                z2 = false;
                                                feb.p(mm40VarN19, bymVar2, fetVar3, 0);
                                                fetVar3.r(false);
                                            } else if (okm0Var instanceof lkm0) {
                                                fetVar3.e0(683493809);
                                                zcl zclVar35 = qmk.f28987a;
                                                mm40 mm40VarN20 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                lkm0 lkm0Var = (lkm0) okm0Var;
                                                bzm bzmVar9 = lkm0Var.f20207a;
                                                bzm bzmVar10 = lkm0Var.b;
                                                String str38 = lkm0Var.d;
                                                azm azmVar5 = lkm0Var.c;
                                                q6x q6xVar5 = q6x.f28221a;
                                                vym vymVar3 = new vym(bzmVar9, bzmVar10, azmVar5, str38, lkm0Var.e, lkm0Var.f);
                                                z2 = false;
                                                kpb.k(mm40VarN20, vymVar3, fetVar3, 0);
                                                fetVar3.r(false);
                                            } else if (okm0Var instanceof mkm0) {
                                                fetVar3.e0(684310380);
                                                zcl zclVar36 = qmk.f28987a;
                                                mm40 mm40VarN21 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                mkm0 mkm0Var = (mkm0) okm0Var;
                                                k1n k1nVar3 = mkm0Var.f21950a;
                                                k1n k1nVar4 = mkm0Var.b;
                                                String str39 = mkm0Var.d;
                                                String str40 = mkm0Var.e;
                                                a2m a2mVar2 = mkm0Var.c;
                                                String str41 = mkm0Var.f;
                                                x0m x0mVar10 = x0m.f40076a;
                                                sac.r(mm40VarN21, k1nVar3, k1nVar4, a2mVar2, str39, str40, str41, fetVar3, 0);
                                                z2 = false;
                                                fetVar3.r(false);
                                            } else {
                                                if (!(okm0Var instanceof nkm0)) {
                                                    throw b1j.f(1823009285, fetVar3, false);
                                                }
                                                fetVar3.e0(684915097);
                                                zcl zclVar37 = qmk.f28987a;
                                                mm40 mm40VarN22 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                nkm0 nkm0Var = (nkm0) okm0Var;
                                                bzm bzmVar11 = nkm0Var.f23687a;
                                                bzm bzmVar12 = nkm0Var.b;
                                                String str42 = nkm0Var.d;
                                                azm azmVar6 = nkm0Var.c;
                                                q6x q6xVar6 = q6x.f28221a;
                                                vym vymVar4 = new vym(bzmVar11, bzmVar12, azmVar6, str42, nkm0Var.e, nkm0Var.f);
                                                z2 = false;
                                                kpb.k(mm40VarN22, vymVar4, fetVar3, 0);
                                                fetVar3.r(false);
                                            }
                                            fetVar3.r(z2);
                                        }
                                    }
                                    throw b1j.f(-344803662, fetVar3, false);
                                }
                                fetVar3.X();
                                return Unit.f46060a;
                        }
                    }
                }, fetVar), kc5.c, fetVar, 1797120, 0);
            }
            throw b1j.f(-258948117, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d8m(mm40Var, eim0Var, function1, i, (byte) 19);
        }
    }

    public static final void o(wnk wnkVar, Function1 function1, fet fetVar, int i) {
        wnkVar.getClass();
        function1.getClass();
        fetVar.g0(-451210966);
        int i2 = (fetVar.g(wnkVar) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = b8o.f2164a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new mmn((byte) 11);
                fetVar.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objP3 = fetVar.P();
            if (z || objP3 == cl5Var) {
                objP3 = new a8o(wnkVar, function1);
                fetVar.o0(objP3);
            }
            y860.g(xdrVar, mm40VarN, function2, null, (Function1) objP3, fetVar, 390, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fun(wnkVar, function1, i, (byte) 13);
        }
    }

    public static final void p(mm40 mm40Var, qdp qdpVar, fet fetVar, int i) {
        byte b;
        mm40 mm40Var2;
        float f;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1032703082);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(qdpVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(o7k0.e(mm40VarD, 20.0f), "EVENT_CARD_INFO_BOTTOM");
            Object objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                objP = new e4p((byte) 20);
                fetVar2.o0(objP);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, true, (Function1) objP);
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA);
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
            if (qdpVar.f) {
                fetVar2.e0(799100297);
                f = 1.0f;
                j6n.h(qdpVar.g, hro0.f13541a, o7k0.e(o7k0.A(s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11).e(new ecu0(yx7Var)), null, 3), 16.0f), 0, 0, fetVar2, 0, 24);
                fetVar2.r(false);
            } else {
                f = 1.0f;
                fetVar2.e0(799424464);
                fetVar2.r(false);
            }
            mm40 mm40VarD2 = o7k0.d(jm40Var, f);
            String str = qdpVar.e;
            qrq qrqVar = j1t0.c;
            long j = qmk.q;
            b = 1;
            v8q0.a(str, mm40VarD2, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, j, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 48, 24960, 109544);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            b = 1;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pdp(mm40Var2, qdpVar, i, b);
        }
    }

    public static final void q(int i, fet fetVar, mm40 mm40Var, String str, boolean z) {
        k6z k6zVar;
        fetVar.g0(-1134469002);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarE0 = o2e.e0(o7k0.d(mm40Var, 1.0f), "EVENT_CARD_BODY_NAME");
            tj30 tj30VarC = zq8.c(gqw0.d, false);
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
            if (z) {
                fetVar.e0(526761559);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(526762483);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(703268080, new ndp(mm40Var, str), fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z05(mm40Var, str, z, i, (byte) 3);
        }
    }

    public static final void r(mm40 mm40Var, sdp sdpVar, Function1 function1, fet fetVar, int i) {
        int i2;
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(1771718599);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(sdpVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 88.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarE0 = o2e.e0(s5x0.I(i120.Q(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), vgg0.a(16.0f)), s5x0.u(8.0f, 8.0f, 8.0f, 0.0f, 8)), "EVENT_CARD_ROW");
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
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
            boolean zG = fetVar2.g(sdpVar.b);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(sdpVar.b);
                fetVar2.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            mm40 mm40VarN = o7k0.n(jm40Var, 72.0f);
            zcl zclVar2 = qmk.g;
            mm40 mm40VarE1 = o2e.e0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN), "EVENT_CARD_IMAGE");
            String str = (String) pz40Var.getValue();
            pge pgeVar = gqw0.A;
            pm80 pm80VarF = a8k0.F(sdpVar.h, 0, fetVar2);
            pm80 pm80VarF2 = a8k0.F(sdpVar.i, 0, fetVar2);
            boolean zG2 = ((i2 & 896) == 256) | fetVar2.g(pz40Var);
            Object objP2 = fetVar2.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new jg2(function1, pz40Var, (byte) 13);
                fetVar2.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            int i4 = i2 & 112;
            boolean zG3 = fetVar2.g(pz40Var) | (i4 == 32);
            Object objP3 = fetVar2.P();
            byte b = 5;
            if (zG3 || objP3 == cl5Var) {
                objP3 = new f5p(sdpVar, pz40Var, b);
                fetVar2.o0(objP3);
            }
            k7x.b(str, null, mm40VarE1, pm80VarF, pm80VarF2, null, null, function2, (Function1) objP3, null, pgeVar, null, fetVar2, 36912, 6, 31328);
            fetVar2 = fetVar2;
            if (sdpVar.j) {
                fetVar2.e0(-723426185);
                i3 = 0;
                j0x.b(a8k0.F(R.drawable.ic_glyph_technical_works, 0, fetVar2), null, s5x0.J(i120.Q(s5x0.J(i120.Q(o7k0.n(jm40Var, 72.0f), ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundLight60(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 16.0f), ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), vgg0.f37379a), 8.0f), null, null, 0.0f, new m78(((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), 5), fetVar2, 56, 56);
                fetVar2.r(false);
            } else {
                i3 = 0;
                fetVar2.e0(-722630043);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, i3);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarD2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            s(o7k0.e(jm40Var, 26.0f), sdpVar.e, sdpVar.h, sdpVar.i, sdpVar.d, fetVar2, 0);
            u(i3, fetVar2, o7k0.e(jm40Var, 26.0f), sdpVar.f);
            z(null, sdpVar, fetVar2, i4);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r3o((Object) mm40Var, (Object) sdpVar, (Object) function1, i, (byte) 5);
        }
    }

    public static final void s(final mm40 mm40Var, final int i, final int i2, final int i3, final String str, fet fetVar, final int i4) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1464354779);
        int i5 = i4 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.e(i) ? 32 : 16) | (fetVar2.e(i2) ? 256 : 128) | (fetVar2.e(i3) ? 2048 : 1024) | (fetVar2.g(str) ? 16384 : 8192);
        if (fetVar2.U(i5 & 1, (i5 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 28.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 20.0f);
            pge pgeVar = gqw0.A;
            pm80 pm80VarF = a8k0.F(i2, (i5 >> 6) & 14, fetVar2);
            pm80 pm80VarF2 = a8k0.F(i3, (i5 >> 9) & 14, fetVar2);
            zfn zfnVar = zaq0.b;
            k7x.b(Integer.valueOf(i), null, mm40VarN, pm80VarF, pm80VarF2, null, null, null, null, null, pgeVar, new m78(((ThemeColors) fetVar2.k(zfnVar)).getSecondary60(), 5), fetVar2, ((i5 >> 3) & 14) | 36912, 6, 27616);
            mm40 mm40VarE0 = o2e.e0(o7k0.d(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f), "CARD_HEADER_TEXT");
            Object objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                objP = new e4p((byte) 19);
                fetVar2.o0(objP);
            }
            v8q0.a(str, pai0.a(mm40VarE0, true, (Function1) objP), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2, (i5 >> 12) & 14, 24960, 109560);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(i, i2, i3, str, i4) { // from class: a.odp
                public final /* synthetic */ int b;
                public final /* synthetic */ int c;
                public final /* synthetic */ int d;
                public final /* synthetic */ String e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    ckb.s(this.f25086a, this.b, this.c, this.d, this.e, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void t(mm40 mm40Var, qdp qdpVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(1085835039);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(qdpVar) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(s5x0.I(i120.Q(o7k0.e(mm40VarD, 88.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), vgg0.a(16.0f)), new lh80(12.0f, 8.0f, 8.0f, 10.0f)), "EVENT_CARD_ROW");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            v(0, fetVar, o7k0.e(jm40Var, 28.0f), qdpVar.b, qdpVar.c);
            qxw.o(fetVar, o7k0.n(jm40Var, 2.0f));
            q(0, fetVar, o7k0.e(jm40Var, 18.0f), qdpVar.d, qdpVar.h);
            qxw.o(fetVar, o7k0.n(jm40Var, 2.0f));
            p(null, qdpVar, fetVar, i2 & 112);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pdp(mm40Var, qdpVar, i, b);
        }
    }

    public static final void u(int i, fet fetVar, mm40 mm40Var, String str) {
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(-728789794);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarE0 = o2e.e0(o7k0.y(o7k0.d(mm40Var, 1.0f), gqw0.d, 2), "EVENT_CARD_BODY_NAME");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarE1 = o2e.e0(o7k0.d(jm40.b, 1.0f), "EVENT_CARD_BODY_NAME_TEXT");
            qrq qrqVar = j1t0.b;
            long j = qmk.r;
            v8q0.a(str, mm40VarE1, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, j, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, qmk.F, 16646109), fetVar2, ((i2 >> 3) & 14) | 48, 24960, 109544);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdm(mm40Var, str2, i, (byte) 29);
        }
    }

    public static final void v(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-614038034);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.e(R.drawable.sport_new) ? 256 : 128) | (fetVar2.e(R.drawable.sport_new) ? 2048 : 1024) | (fetVar2.g(str2) ? 16384 : 8192);
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            mm40 mm40VarE0 = o2e.e0(mm40Var, "CARD_HEADER_TEXT");
            Object objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                objP = new e4p((byte) 18);
                fetVar2.o0(objP);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, true, (Function1) objP);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA);
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
            mm40 mm40VarN = o7k0.n(jm40Var, 20.0f);
            pge pgeVar = gqw0.A;
            pm80 pm80VarF = a8k0.F(R.drawable.sport_new, (i2 >> 6) & 14, fetVar2);
            pm80 pm80VarF2 = a8k0.F(R.drawable.sport_new, (i2 >> 9) & 14, fetVar2);
            zfn zfnVar = zaq0.b;
            k7x.b(str, null, mm40VarN, pm80VarF, pm80VarF2, null, null, null, null, null, pgeVar, new m78(((ThemeColors) fetVar2.k(zfnVar)).getSecondary60(), 5), fetVar2, ((i2 >> 3) & 14) | 36912, 6, 27616);
            v8q0.a(str2, o7k0.d(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(5), qmk.C, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2, (i2 >> 12) & 14, 24960, 107512);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new man(mm40Var, str, str2, i, (byte) 2);
        }
    }

    public static final void w(mm40 mm40Var, pwe pweVar, Function0 function0, fet fetVar, int i) {
        mm40 mm40VarQ;
        function0.getClass();
        fetVar.g0(1577864446);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(pweVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.e0(204290728);
            mm40 mm40VarW = y860.W(mm40Var, null, null, false, null, function0, 28);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40VarW, 60.0f), 1.0f);
            if (pweVar.e) {
                fetVar.e0(2062170718);
                long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                zcl zclVar2 = qmk.i;
                zcl zclVar3 = qmk.f28987a;
                mm40VarQ = i120.Q(mm40VarD, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar3, zclVar3));
                fetVar.r(false);
            } else {
                fetVar.e0(2062618792);
                long backgroundContent2 = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                zcl zclVar4 = qmk.i;
                ugg0 ugg0Var = vgg0.f37379a;
                mm40VarQ = i120.Q(mm40VarD, backgroundContent2, new ugg0(zclVar4, zclVar4, zclVar4, zclVar4));
                fetVar.r(false);
            }
            fetVar.r(false);
            mm40 mm40VarE0 = o2e.e0(s5x0.K(mm40VarQ, 12.0f, 6.0f), "CARD_INFO_ROW");
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            c(0, fetVar, pweVar.b, new x7z(1.0f, true), pweVar.f27707a);
            b(pweVar.c, 6, fetVar, jm40.b, pweVar.d, pweVar.e);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ann(mm40Var, pweVar, function0, i, (byte) 10);
        }
    }

    public static final void x(mm40 mm40Var, tdp tdpVar, Function1 function1, fet fetVar, int i) {
        int i2;
        tdpVar.getClass();
        fetVar.g0(2068121345);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(tdpVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            if (tdpVar instanceof qdp) {
                fetVar.e0(-1105234932);
                Object objP2 = fetVar.P();
                if (objP2 == obj) {
                    objP2 = dw9.j(fetVar);
                }
                gy40 gy40Var = (gy40) objP2;
                boolean z2 = (i3 & 896) == 256;
                Object objP3 = fetVar.P();
                if (z2 || objP3 == obj) {
                    objP3 = new s8o(function1, (byte) 28);
                    fetVar.o0(objP3);
                }
                t(y860.W(mm40Var, gy40Var, null, false, null, (Function0) objP3, 28), (qdp) tdpVar, fetVar, i4);
                fetVar.r(false);
            } else if (tdpVar instanceof sdp) {
                fetVar.e0(97786837);
                sdp sdpVar = (sdp) tdpVar;
                boolean z3 = sdpVar.j;
                mm40 mm40VarW = jm40.b;
                if (z3) {
                    fetVar.e0(98163921);
                    fetVar.r(false);
                } else {
                    fetVar.e0(97909907);
                    Object objP4 = fetVar.P();
                    if (objP4 == obj) {
                        objP4 = dw9.j(fetVar);
                    }
                    gy40 gy40Var2 = (gy40) objP4;
                    boolean zG = fetVar.g(pz40Var) | ((i3 & 896) == 256);
                    Object objP5 = fetVar.P();
                    if (zG || objP5 == obj) {
                        objP5 = new rw1(function1, pz40Var, (byte) 4);
                        fetVar.o0(objP5);
                    }
                    mm40VarW = y860.W(mm40VarW, gy40Var2, null, false, null, (Function0) objP5, 28);
                    fetVar.r(false);
                }
                mm40 mm40VarE = mm40Var.e(mm40VarW);
                boolean zG2 = fetVar.g(pz40Var);
                Object objP6 = fetVar.P();
                if (zG2 || objP6 == obj) {
                    objP6 = new wil(pz40Var, (byte) 22);
                    fetVar.o0(objP6);
                }
                r(mm40VarE, sdpVar, (Function1) objP6, fetVar, i4);
                fetVar.r(false);
            } else {
                if (!(tdpVar instanceof rdp)) {
                    throw b1j.f(-1105236250, fetVar, false);
                }
                fetVar.e0(-1105205070);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarE2 = o7k0.e(mm40Var, 88.0f);
                zcl zclVar2 = qmk.i;
                ugg0 ugg0Var = vgg0.f37379a;
                h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE2), vbc.d0(null, fetVar, 0, 1), fetVar, false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l51((Object) mm40Var, (Object) tdpVar, (Object) function1, i, (byte) 8);
        }
    }

    public static final void y(wui0 wui0Var, boolean z, fet fetVar, int i) {
        yjj0 ugg0Var;
        fetVar.g0(-64863499);
        int i2 = (fetVar.e(wui0Var.ordinal()) ? 4 : 2) | i | (fetVar.h(z) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
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
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            int iOrdinal = wui0Var.ordinal();
            if (iOrdinal == 0) {
                zcl zclVar = qmk.i;
                ugg0 ugg0Var2 = vgg0.f37379a;
                ugg0Var = new ugg0(zclVar, zclVar, zclVar, zclVar);
            } else if (iOrdinal == 1) {
                zcl zclVar2 = qmk.f28987a;
                ugg0Var = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
            } else if (iOrdinal == 2) {
                ugg0Var = jd8.n;
            } else if (iOrdinal != 3) {
                t9f.b();
                return;
            } else {
                zcl zclVar3 = qmk.f28987a;
                ugg0Var = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
            }
            mm40 mm40VarQ = i120.Q(mm40VarD, backgroundContent, ugg0Var);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            zcl zclVar4 = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(jm40Var, 12.0f, 10.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarK);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            mm40 mm40VarN = o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 12.0f, 0.0f, 11), 40.0f);
            zcl zclVar5 = qmk.m;
            ugg0 ugg0Var3 = vgg0.f37379a;
            mm40 mm40VarS = o7k0.s(rw2.d(h97.e(zclVar5, zclVar5, zclVar5, zclVar5, mm40VarN), vbc.d0(null, fetVar, 0, 1), fetVar, jm40Var, 16.0f), z ? 128.0f : 96.0f);
            zcl zclVar6 = qmk.e;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar6, zclVar6, zclVar6, zclVar6, mm40VarS), vbc.d0(null, fetVar, 0, 1)));
            fetVar.r(true);
            fetVar.r(true);
            if (wui0Var == wui0.b || wui0Var == wui0.c) {
                fetVar.e0(899428223);
                mbc.o(agi0.f827a, jr8.f16991a.b(s5x0.N(jm40Var, 64.0f, 0.0f, 0.0f, 0.0f, 14), gqw0.i), false, fetVar, 6, 4);
                fetVar.r(false);
            } else {
                fetVar.e0(899611123);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jv1(wui0Var, z, i, (byte) 24);
        }
    }

    public static final void z(mm40 mm40Var, sdp sdpVar, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1935857304);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(sdpVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 20.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            mm40 mm40VarE0 = o2e.e0(jr8.f16991a.b(o7k0.d(jm40Var, 1.0f), gqw0.d), "EVENT_CARD_INFO_BOTTOM");
            String str = sdpVar.g;
            qrq qrqVar = j1t0.c;
            long j = qmk.q;
            long j2 = qmk.D;
            v8q0.a(str, mm40VarE0, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, j, null, null, null, 0L, new f2q0(5), j2, 2, false, 1, 0, null, new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, j2, 16646109), fetVar, 0, 24960, 107496);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n0n((Object) mm40Var2, (Object) sdpVar, i, (byte) 11);
        }
    }
}
