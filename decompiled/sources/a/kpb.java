package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import androidx.fragment.app.Fragment;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.feed.notifictation.presentation.models.GameSubscriptionSettingsScreenUiModel;
import org.xplatform.feed.notifictation.presentation.models.PeriodSubscriptionSettingsScreenUiModel;
import org.xplatform.feed.notifictation.presentation.models.SubscriptionEventSettingsUiModel;
import org.xplatform.feed.notifictation.presentation.models.SubscriptionEventUiModel;
import org.xplatform.feed.notifictation.presentation.models.SubscriptionPeriodUiModel;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class kpb {
    public static final CoroutineContext A(aeg0 aeg0Var, boolean z, zje zjeVar) {
        if (!aeg0Var.k()) {
            return ((sje) aeg0Var.f()).f32300a;
        }
        if (zjeVar.getContext().get(des0.f5965a) != null) {
            hny.b();
            return null;
        }
        if (z) {
            CoroutineContext coroutineContext = aeg0Var.b;
            if (coroutineContext != null) {
                return coroutineContext;
            }
            Intrinsics.h("transactionContext");
            throw null;
        }
        sje sjeVar = aeg0Var.f727a;
        if (sjeVar != null) {
            return sjeVar.f32300a;
        }
        Intrinsics.h("coroutineScope");
        throw null;
    }

    public static final t480 B(d0t d0tVar) {
        Object objPrevious;
        d0tVar.getClass();
        rqs rqsVar = d0tVar.p;
        int i = rqsVar.b;
        List list = rqsVar.d;
        ListIterator listIterator = list.listIterator(list.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((df90) objPrevious).f5989a != i);
        df90 df90Var = (df90) objPrevious;
        if (df90Var != null) {
            tf90 tf90Var = df90Var.b;
            if (!d0tVar.z) {
                return new t480(String.valueOf(tf90Var.b), String.valueOf(tf90Var.c));
            }
        }
        return new t480("", "");
    }

    public static final y1m C(d0t d0tVar) {
        d0tVar.getClass();
        rqs rqsVar = d0tVar.p;
        String strValueOf = String.valueOf(rqsVar.B.f35394a);
        String strValueOf2 = String.valueOf(rqsVar.B.b);
        boolean z = rqsVar.t;
        boolean z2 = rqsVar.u;
        return new y1m(c2m.f3631a, new x1m(), strValueOf, strValueOf2, z, z2);
    }

    public static final d280 D(d0t d0tVar) {
        d0tVar.getClass();
        f0t f0tVar = d0tVar.q;
        String str = (String) CollectionsKt.W(0, f0tVar.d);
        if (str == null) {
            str = "";
        }
        return d0tVar.B ? new b280(R.drawable.ic_home) : new c280(vsm0.s(f0tVar.f8731a, str), R.drawable.ic_glyph_placeholder_player);
    }

    public static final String E(d0t d0tVar) {
        String strValueOf;
        Object next;
        Object next2;
        tf90 tf90Var;
        d0tVar.getClass();
        rqs rqsVar = d0tVar.p;
        Iterator it = q3d.j(kvg.d, jtg.d, hxg.d, lug.d, ntg.d, ewg.d, lxg.d, fwg.d, cug.d, xrg.d, wrg.d, uvg.d, dug.d, wtg.d, csg.d, ltg.d, ptg.d, msg.d, org.d).iterator();
        do {
            strValueOf = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((yxg) next).b != d0tVar.v);
        if (next != null || rqsVar.b == 0 || rqsVar.d.isEmpty()) {
            return "";
        }
        int i = rqsVar.b;
        Iterator it2 = rqsVar.d.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (((df90) next2).f5989a != i);
        df90 df90Var = (df90) next2;
        if (df90Var != null && (tf90Var = df90Var.b) != null) {
            strValueOf = String.valueOf(tf90Var.b);
        }
        return strValueOf == null ? "" : strValueOf;
    }

    public static final t480 F(d0t d0tVar) {
        String strValueOf;
        tf90 tf90Var;
        String strValueOf2;
        tf90 tf90Var2;
        List list = d0tVar.p.d;
        if (list.isEmpty()) {
            return new t480("", "");
        }
        df90 df90Var = (df90) CollectionsKt.f0(list);
        String str = "0";
        if (df90Var == null || (tf90Var2 = df90Var.b) == null || (strValueOf = String.valueOf(tf90Var2.b)) == null) {
            strValueOf = "0";
        }
        df90 df90Var2 = (df90) CollectionsKt.f0(list);
        if (df90Var2 != null && (tf90Var = df90Var2.b) != null && (strValueOf2 = String.valueOf(tf90Var.c)) != null) {
            str = strValueOf2;
        }
        return new t480(strValueOf, str);
    }

    public static final String G(d0t d0tVar, ctf0 ctf0Var) {
        d0tVar.getClass();
        ctf0Var.getClass();
        String strG = d0tVar.p.m;
        if (strG.length() == 0) {
            rdj rdjVar = rdj.f30294a;
            boolean zH = ctf0Var.h();
            long j = d0tVar.s;
            strG = rdj.g(new znq0(j), efj.UNIVERSAL, Boolean.valueOf(zH), false, 56);
        }
        return StringsKt.x0(ctf0Var.b.a(R.string.placeholder_variant_3, Arrays.copyOf(new Object[]{d0tVar.c, strG}, 2))).toString();
    }

    public static final String H(d0t d0tVar, y78 y78Var, boolean z) {
        d0tVar.getClass();
        y78Var.getClass();
        Set setL0 = tx3.l0(new Long[]{Long.valueOf(zvg.d.b), Long.valueOf(csg.d.b), Long.valueOf(pxg.d.b)});
        String string = y78.n(y78Var, d0tVar, !qzb.H0(d0tVar), z, 4).toString();
        if (string.length() <= 0 || setL0.contains(Long.valueOf(d0tVar.v))) {
            string = null;
        }
        return string == null ? "" : string;
    }

    public static final t480 K(d0t d0tVar) {
        Object obj;
        Object next;
        d0tVar.getClass();
        rqs rqsVar = d0tVar.p;
        int i = rqsVar.b;
        List list = rqsVar.d;
        Iterator it = list.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((df90) next).f5989a != i);
        boolean z = next == null;
        if (list.isEmpty() || d0tVar.z || z) {
            return new t480("", "");
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            Object objPrevious = listIterator.previous();
            if (((df90) objPrevious).f5989a == i) {
                obj = objPrevious;
                break;
            }
        }
        df90 df90Var = (df90) obj;
        if (df90Var == null) {
            df90Var = (df90) CollectionsKt.d0(list);
        }
        return new t480(String.valueOf(df90Var.b.b), String.valueOf(df90Var.b.c));
    }

    public static final t480 L(d0t d0tVar) {
        Object objPrevious;
        d0tVar.getClass();
        rqs rqsVar = d0tVar.p;
        List list = rqsVar.d;
        if (list.isEmpty() || d0tVar.z) {
            return new t480("", "");
        }
        ListIterator listIterator = list.listIterator(list.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((df90) objPrevious).f5989a != rqsVar.b);
        df90 df90Var = (df90) objPrevious;
        if (df90Var == null) {
            df90Var = (df90) CollectionsKt.d0(list);
        }
        return new t480(String.valueOf(df90Var.b.b), String.valueOf(df90Var.b.c));
    }

    public static final String M(d0t d0tVar) {
        Object next;
        d0tVar.getClass();
        rqs rqsVar = d0tVar.p;
        int i = rqsVar.b;
        Iterator it = rqsVar.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((df90) next).f5989a != i);
        df90 df90Var = (df90) next;
        String strValueOf = df90Var != null ? String.valueOf(df90Var.f5989a) : null;
        return strValueOf == null ? "" : strValueOf;
    }

    public static final String N(it9 it9Var, boolean z) {
        String str = it9Var.c;
        rdj rdjVar = rdj.f30294a;
        long j = it9Var.b;
        return ua80.i(str, " (", rdj.h(new znq0(j), ykq0.UNIVERSAL, Boolean.valueOf(z), null, 248), Separators.RPAREN);
    }

    public static final t480 R(d0t d0tVar) {
        d0tVar.getClass();
        rqs rqsVar = d0tVar.p;
        return new t480(String.valueOf(rqsVar.B.f35394a), String.valueOf(rqsVar.B.b));
    }

    public static final kpm S(d0t d0tVar) {
        d0tVar.getClass();
        hpm hpmVar = new hpm(0L, 3);
        rqs rqsVar = d0tVar.p;
        return new kpm(opm.f25648a, hpmVar, d5c.O(String.valueOf(rqsVar.B.f35394a), String.valueOf(rqsVar.B.b), rqsVar.t, rqsVar.u, new hpm(0L, 3)));
    }

    public static final String T(ms2 ms2Var) {
        if (ms2Var instanceof kr2) {
            return "popular_new_sport";
        }
        if (ms2Var instanceof jr2) {
            return "popular_new_esports";
        }
        if (ms2Var instanceof lr2) {
            return "popular_new_top";
        }
        return ms2Var instanceof ks2 ? "top_event_bottom_sheet" : "";
    }

    public static final d280 U(d0t d0tVar) {
        d0tVar.getClass();
        f0t f0tVar = d0tVar.r;
        String str = (String) CollectionsKt.W(0, f0tVar.d);
        if (str == null) {
            str = "";
        }
        return d0tVar.B ? new b280(R.drawable.ic_away) : new c280(vsm0.s(f0tVar.f8731a, str), R.drawable.ic_glyph_placeholder_player);
    }

    public static final String V(d0t d0tVar) {
        String strValueOf;
        Object next;
        rqs rqsVar;
        int i;
        Object next2;
        tf90 tf90Var;
        d0tVar.getClass();
        Iterator it = q3d.j(kvg.d, jtg.d, hxg.d, lug.d, ntg.d, ewg.d, lxg.d, fwg.d, cug.d, xrg.d, wrg.d, uvg.d, dug.d, wtg.d, csg.d, ltg.d, ptg.d, msg.d, org.d).iterator();
        do {
            strValueOf = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((yxg) next).b != d0tVar.v);
        if (next != null || (i = (rqsVar = d0tVar.p).b) == 0) {
            return "";
        }
        Iterator it2 = rqsVar.d.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (((df90) next2).f5989a != i);
        df90 df90Var = (df90) next2;
        if (df90Var != null && (tf90Var = df90Var.b) != null) {
            strValueOf = String.valueOf(tf90Var.c);
        }
        return strValueOf == null ? "" : strValueOf;
    }

    public static final String X(d0t d0tVar) {
        d0tVar.getClass();
        String str = d0tVar.p.m;
        if (str.length() != 0) {
            return str;
        }
        rdj rdjVar = rdj.f30294a;
        return rdj.g(new znq0(d0tVar.s), efj.UNIVERSAL, null, false, 60);
    }

    public static int Z(float f) {
        int i;
        int i2 = 100;
        if (f <= 1000.0f) {
            i = 1;
        } else if (f <= 10000.0f) {
            i = 10;
        } else {
            i = f <= 100000.0f ? 100 : 1000;
        }
        if (f <= i * 100) {
            i2 = 25;
        } else if (f <= i * Response.OK) {
            i2 = 50;
        } else if (f > i * Response.BAD_REQUEST) {
            if (f <= i * Response.BUSY_EVERYWHERE) {
                i2 = 150;
            } else {
                i2 = f <= ((float) (i * 800)) ? Response.OK : 250;
            }
        }
        return i2 * i;
    }

    public static final void a(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(2021756622);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(mm40Var, 6.0f), 24.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            mm40 mm40VarQ = i120.Q(o7k0.n(jm40.b, 6.0f), ((StaticColors) fetVar.k(m8m0.f21378a)).m113getRed0d7_KjU(), vgg0.a(3.0f));
            tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xml(mm40Var, z, i, (byte) 18);
        }
    }

    public static final boolean a0(d0t d0tVar, boolean z, boolean z2) {
        d0tVar.getClass();
        return d0tVar.G && !z && z2;
    }

    public static final void b(gy40 gy40Var, gk5 gk5Var, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i) {
        long secondary20;
        long secondary10;
        boolean z;
        long secondary21;
        long secondary11;
        fet fetVar2 = fetVar;
        gy40Var.getClass();
        gk5Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        fetVar2.g0(418221947);
        int i2 = i | (fetVar2.g(gk5Var) ? 256 : 128) | (fetVar2.i(function0) ? 2048 : 1024) | (fetVar2.i(function1) ? 16384 : 8192) | (fetVar2.i(function2) ? 131072 : 65536);
        if (fetVar2.U(i2 & 1, (74899 & i2) != 74898)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            float f = xfn.a(fetVar2).d;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(mm40VarD, f, 12.0f, xfn.a(fetVar2).d, 12.0f);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarM);
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
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarA = zhg0Var.a(1.0f, jm40Var, true);
            boolean z2 = gk5Var.f11429a;
            boolean z3 = gk5Var.b;
            mm40 mm40VarW = y860.W(mm40VarA, gy40Var, null, z2, null, function0, 24);
            if (z2) {
                fetVar2.e0(-925086927);
                secondary20 = afn0.m(fetVar2).getCommerce();
                fetVar2.r(false);
            } else {
                fetVar2.e0(-925023346);
                secondary20 = afn0.m(fetVar2).getSecondary20();
                fetVar2.r(false);
            }
            long commerceForeground = afn0.m(fetVar2).getCommerceForeground();
            if (z2) {
                fetVar2.e0(-924821567);
                secondary10 = afn0.m(fetVar2).getBackgroundGroupSecondary();
                fetVar2.r(false);
            } else {
                fetVar2.e0(-924742610);
                secondary10 = afn0.m(fetVar2).getSecondary10();
                fetVar2.r(false);
            }
            f7k.a(R.string.top_up, R.drawable.ic_glyph_replenish, 24576, secondary20, commerceForeground, secondary10, fetVar2, mm40VarW, true);
            mm40 mm40VarW2 = y860.W(zhg0Var.a(1.0f, jm40Var, true), gy40Var, null, gk5Var.b, null, function1, 24);
            if (z3) {
                z = false;
                secondary21 = cs0.e(fetVar2, -1276735714, fetVar2, false);
            } else {
                z = false;
                fetVar2.e0(-1276734718);
                secondary21 = afn0.m(fetVar2).getSecondary20();
                fetVar2.r(false);
            }
            long j = secondary21;
            if (z3) {
                fetVar2.e0(-1276731313);
                secondary11 = afn0.m(fetVar2).getBackgroundGroupSecondary();
            } else {
                fetVar2.e0(-1276729790);
                secondary11 = afn0.m(fetVar2).getSecondary10();
            }
            fetVar2.r(z);
            f7k.a(R.string.withdraw_money, R.drawable.ic_glyph_minus_small, 24576, j, afn0.m(fetVar2).getCommerceForeground(), secondary11, fetVar2, mm40VarW2, true);
            fetVar2 = fetVar;
            f7k.a(R.string.all_balances, R.drawable.ic_glyph_wallet_alt, 24576, afn0.m(fetVar).getPrimary(), afn0.m(fetVar).getPrimary(), afn0.m(fetVar).getBackgroundGroupSecondary(), fetVar2, y860.W(zhg0Var.a(1.0f, jm40Var, true), gy40Var, null, false, null, function2, 28), false);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba00((Object) gy40Var, (Object) gk5Var, (Object) function0, (Object) function1, (Object) function2, i, (byte) 22);
        }
    }

    public static final boolean b0(d0t d0tVar, boolean z) {
        d0tVar.getClass();
        return (d0tVar.h || z || d0tVar.x == 0) ? false : true;
    }

    public static final void c(mm40 mm40Var, jdp0 jdp0Var, boolean z, String str, boolean z2, Function2 function2, fet fetVar, int i) {
        y9q0 y9q0Var;
        str.getClass();
        mm40 mm40Var2 = (i & 1) != 0 ? jm40.b : mm40Var;
        pz40 pz40VarF = androidx.compose.runtime.e.f(Boolean.valueOf(z), fetVar);
        pz40 pz40VarF2 = androidx.compose.runtime.e.f(Boolean.valueOf(z2), fetVar);
        pz40 pz40VarF3 = androidx.compose.runtime.e.f(str, fetVar);
        l5d0 l5d0VarA = fap.b.a(w6n.i);
        l5d0 l5d0VarA2 = jcp0.f16288a.a(null);
        zfn zfnVar = ggp0.d;
        if (((Boolean) pz40VarF.getValue()).booleanValue()) {
            y9q0Var = new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109);
        } else {
            y9q0Var = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
        }
        obc.e(new l5d0[]{l5d0VarA, l5d0VarA2, zfnVar.a(y9q0Var), yfp.f42551a.a(new ycl(28.0f)), fap.f9220a.a(fetVar.k(bmd.n)), ggp0.b.a(gqw0.d), dw9.k(5, ggp0.c)}, u1c.M(1493393063, new acb0((Object) pz40VarF, (Object) pz40VarF2, (Object) mm40Var2, (Object) jdp0Var, (Object) pz40VarF3, (Object) function2, (byte) 11), fetVar), fetVar, 48);
    }

    public static final boolean c0(aot0 aot0Var) {
        String lowerCase;
        String str = aot0Var.c;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        } else {
            lowerCase = null;
        }
        return Intrinsics.d(lowerCase, "http") || Intrinsics.d(lowerCase, "https");
    }

    public static final void d(smh smhVar, Function1 function1, fet fetVar, int i) {
        byte b;
        fet fetVar2;
        jm40 jm40Var;
        smh smhVar2 = smhVar;
        smhVar2.getClass();
        function1.getClass();
        fetVar.g0(-319519449);
        byte b2 = 2;
        int i2 = i | (fetVar.g(smhVar2) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var2, 128.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN);
            ncg0 ncg0VarA = lcg0.a(0.0f, 7);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new tmh(function1, smhVar2, b2);
                fetVar.o0(objP2);
            }
            mm40 mm40VarF = phu0.F(mm40VarE, null, ncg0VarA, false, gy40Var, (Function0) objP2, fetVar, 24960, 5);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarF);
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
            pm80 pm80VarF = a8k0.F(R.drawable.tournament_card_placeholder, 0, fetVar);
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarA = jr8Var.a(jm40Var2);
            String str = smhVar2.b;
            rmh rmhVar = smhVar2.f;
            k7x.b(str, null, mm40VarA, pm80VarF, pm80VarF, null, null, null, null, null, gqw0.A, null, fetVar, 36912, 6, 31712);
            mm40 mm40VarA2 = jr8Var.a(jm40Var2);
            StaticColors staticColors = StaticColors.INSTANCE;
            zq8.a(0, fetVar, i120.P(mm40VarA2, yk5.n(q3d.j(new y3d(staticColors.m121getTransparent0d7_KjU()), new y3d(staticColors.m121getTransparent0d7_KjU()), new y3d(staticColors.m121getTransparent0d7_KjU()), new y3d(staticColors.m75getBlack600d7_KjU()), new y3d(staticColors.m62getBlack0d7_KjU())), 0.0f, 0.0f, 14), null, 6));
            if (rmhVar instanceof pmh) {
                fetVar.e0(1559812870);
                jm40Var = jm40Var2;
                j6n.h(((pmh) rmhVar).f27234a, kro0.f18776a, jr8Var.b(s5x0.N(jm40Var, 8.0f, 8.0f, 8.0f, 0.0f, 8), zx7Var), 0, 0, fetVar, 48, 24);
                fetVar.r(false);
            } else {
                jm40Var = jm40Var2;
                fetVar.e0(1560113973);
                fetVar.r(false);
            }
            mm40 mm40VarJ = s5x0.J(jr8Var.b(jm40Var, gqw0.g), 8.0f);
            smhVar2 = smhVar;
            String str2 = smhVar2.d;
            long jT = idm0.t(12);
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            n05 n05Var = new n05(jT, g1t0.l().f42262a.b, idm0.t(1));
            long jM123getWhite0d7_KjU = staticColors.m123getWhite0d7_KjU();
            ((g1t0) fetVar.k(zfnVar)).getClass();
            v8q0.a(str2, mm40VarJ, jM123getWhite0d7_KjU, n05Var, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.l(), fetVar, 0, 24960, 110576);
            fetVar2 = fetVar;
            b = 1;
            fetVar2.r(true);
        } else {
            b = 1;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vmh(smhVar2, function1, i, b);
        }
    }

    public static final boolean d0(d0t d0tVar, boolean z) {
        d0tVar.getClass();
        return (!d0tVar.F || d0tVar.h || z) ? false : true;
    }

    public static final void e(mm40 mm40Var, final bfj bfjVar, fet fetVar, int i) {
        bfjVar.getClass();
        fetVar.g0(1659658914);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(bfjVar) ? 32 : 16);
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            boolean zG = fetVar.g(bfjVar.f2506a + "COMPACT_TITLE_REMEMBER_ID");
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new ugd(1264884530, true, new Function2() { // from class: a.afj
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b3 = b;
                        bfj bfjVar2 = bfjVar;
                        switch (b3) {
                            case 0:
                                fet fetVar2 = (fet) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    v8q0.a(bfjVar2.f2506a, mrv.k0(jm40.b, "TITLE_TEXT"), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), fetVar2), fetVar2, 48, 24960, 110588);
                                } else {
                                    fetVar2.X();
                                }
                                break;
                            default:
                                fet fetVar3 = (fet) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    jm40 jm40Var = jm40.b;
                                    mm40 mm40VarK0 = mrv.k0(jm40Var, "DESCRIPTION_TEXT");
                                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar3, 48);
                                    int iHashCode = Long.hashCode(fetVar3.T);
                                    bh90 bh90VarM = fetVar3.m();
                                    mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarK0);
                                    mkd.c0.getClass();
                                    fetVar3.i0();
                                    if (fetVar3.S) {
                                        fetVar3.l(e7z.u1);
                                    } else {
                                        fetVar3.r0();
                                    }
                                    jpm0.o(fetVar3, thg0VarA, gqw0.x);
                                    jpm0.o(fetVar3, bh90VarM, gqw0.w);
                                    jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                                    jpm0.n(fetVar3);
                                    jpm0.o(fetVar3, mm40VarC0, gqw0.v);
                                    zcl zclVar = qmk.f28987a;
                                    dww.c(a8k0.F(bfjVar2.c, 0, fetVar3), null, o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 2.0f, 0.0f, 11), 16.0f), bfjVar2.d, fetVar3, 56, 0);
                                    v8q0.a(bfjVar2.b, null, bfjVar2.d, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar3, 0, 24960, 110586);
                                    fetVar3.r(true);
                                } else {
                                    fetVar3.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                fetVar.o0(objP);
            }
            Function2 function2 = (Function2) objP;
            boolean zG2 = fetVar.g(bfjVar.b + "COMPACT_DESCRIPTION_REMEMBER_ID");
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new ugd(224592691, true, new Function2() { // from class: a.afj
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b3 = b2;
                        bfj bfjVar2 = bfjVar;
                        switch (b3) {
                            case 0:
                                fet fetVar2 = (fet) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    v8q0.a(bfjVar2.f2506a, mrv.k0(jm40.b, "TITLE_TEXT"), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), fetVar2), fetVar2, 48, 24960, 110588);
                                } else {
                                    fetVar2.X();
                                }
                                break;
                            default:
                                fet fetVar3 = (fet) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    jm40 jm40Var = jm40.b;
                                    mm40 mm40VarK0 = mrv.k0(jm40Var, "DESCRIPTION_TEXT");
                                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar3, 48);
                                    int iHashCode = Long.hashCode(fetVar3.T);
                                    bh90 bh90VarM = fetVar3.m();
                                    mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarK0);
                                    mkd.c0.getClass();
                                    fetVar3.i0();
                                    if (fetVar3.S) {
                                        fetVar3.l(e7z.u1);
                                    } else {
                                        fetVar3.r0();
                                    }
                                    jpm0.o(fetVar3, thg0VarA, gqw0.x);
                                    jpm0.o(fetVar3, bh90VarM, gqw0.w);
                                    jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                                    jpm0.n(fetVar3);
                                    jpm0.o(fetVar3, mm40VarC0, gqw0.v);
                                    zcl zclVar = qmk.f28987a;
                                    dww.c(a8k0.F(bfjVar2.c, 0, fetVar3), null, o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 2.0f, 0.0f, 11), 16.0f), bfjVar2.d, fetVar3, 56, 0);
                                    v8q0.a(bfjVar2.b, null, bfjVar2.d, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar3, 0, 24960, 110586);
                                    fetVar3.r(true);
                                } else {
                                    fetVar3.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                fetVar.o0(objP2);
            }
            hmw0.j(mm40VarD, function2, (Function2) objP2, fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new chh(mm40Var, bfjVar, i, (byte) 29);
        }
    }

    public static final boolean e0(d0t d0tVar) {
        d0tVar.getClass();
        return d0tVar.p.A == 64;
    }

    public static final void f(mm40 mm40Var, pnl pnlVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(1983806337);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(pnlVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.e0(-527582055);
            g(mm40Var, pnlVar, function0, fetVar, i2 & 1022);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nnl(mm40Var, pnlVar, function0, i, (byte) 6);
        }
    }

    public static final boolean f0(d0t d0tVar, boolean z) {
        d0tVar.getClass();
        return (!d0tVar.H || d0tVar.G || z) ? false : true;
    }

    public static final void g(mm40 mm40Var, pnl pnlVar, Function0 function0, fet fetVar, int i) {
        int i2;
        pcy pcyVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(-320000116);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(pnlVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function0) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zfn zfnVar = zaq0.b;
            long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(lgb.J(mm40Var, vgg0.a(16.0f)), ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n);
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new b1i(function0, (byte) 24);
                fetVar2.o0(objP);
            }
            mm40 mm40VarN = s5x0.N(phu0.F(mm40VarQ, null, null, false, null, (Function0) objP, fetVar, 0, 15), 0.0f, 0.0f, 16.0f, 0.0f, 11);
            byte b = 14;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4(b)), gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar2 = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar2);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            boolean z3 = fetVar.k(bmd.n) == k6z.b;
            jm40 jm40Var = jm40.b;
            k7x.a(pnlVar.d.a(), null, s5x0.N(o7k0.n(yyw.V(jm40Var, z3), 92.0f), 0.0f, 0.0f, 4.0f, 0.0f, 11), gqw0.A, null, fetVar, 1572912, 1976);
            x7z x7zVar = new x7z(1.0f, true);
            x5d x5dVarA = w5d.a(new qw3(6.0f, true, new jf4(b)), gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, x7zVar);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar = pcyVar2;
                fetVar.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            String str = pnlVar.f27294a;
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            pcy pcyVar3 = pcyVar;
            v8q0.a(str, null, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), new n05(qmk.q, qmk.t, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.v(), fetVar, 0, 24960, 110578);
            String str2 = pnlVar.b;
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            v8q0.a(str2, null, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.g(), fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
            boolean zF = fetVar2.f(secondary);
            Object objP2 = fetVar2.P();
            if (zF || objP2 == cl5Var) {
                objP2 = new nme((byte) 18, secondary);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarJ = s5x0.J(rq8.K(jm40Var, (Function1) objP2), 6.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarJ);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar3);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            j0x.b(a8k0.F(R.drawable.ic_glyph_chevron_right_small, 0, fetVar2), null, o7k0.n(jm40Var, 20.0f), null, null, 0.0f, null, fetVar2, 56, 120);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nnl(mm40Var, pnlVar, function0, i, (byte) 7);
        }
    }

    public static final boolean g0(d0t d0tVar) {
        d0tVar.getClass();
        if (d0tVar.C && d0tVar.z) {
            return (d0tVar.p.j == 0 && d0tVar.s == 0) ? false : true;
        }
        return false;
    }

    public static final void h(mm40 mm40Var, ov60 ov60Var, Function0 function0, Function2 function2, fet fetVar, int i) {
        function0.getClass();
        function2.getClass();
        fetVar.g0(-1712529696);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(ov60Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 16.0f, 0.0f, 2);
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            zcl zclVar2 = qmk.k;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarN = s5x0.N(i120.Q(mm40VarL, background, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 0.0f, 4.0f, 0.0f, 12.0f, 5);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            int i3 = i2 << 6;
            nkb.h(s5x0.L(o7k0.d(jm40Var, 1.0f), 12.0f, 0.0f, 2), ov60Var.f25911a, kjm.f18392a, null, function0, null, fetVar, (57344 & i3) | 384, 40);
            v3c.r(ua80.d(jm40Var, 4.0f, fetVar, jm40Var, 1.0f), ov60Var.b, 0.0f, null, null, function2, fetVar, (i3 & 458752) | 6, 28);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqk((byte) 10, i, (Object) mm40Var, (Object) ov60Var, (Object) function0, (Object) function2);
        }
    }

    public static final Object h0(aeg0 aeg0Var, boolean z, boolean z2, Function1 function1) {
        aeg0Var.getClass();
        aeg0Var.a();
        if (!aeg0Var.k() || aeg0Var.l() || aeg0Var.i.get() == null) {
            return yyw.Y(new oyh(aeg0Var, z, z2, function1, (yje) null));
        }
        jf4.n("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        return null;
    }

    public static final void i(mm40 mm40Var, c280 c280Var, fet fetVar, int i) {
        fetVar.g0(1231395671);
        int i2 = i | 6 | (fetVar.g(c280Var) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 40.0f);
            long jM125getWhite100d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m125getWhite100d7_KjU();
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarS = i120.S(mm40VarN, 1.0f, jM125getWhite100d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
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
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new u6n(d4d.STATIC_WHITE20, w6n.j, c280Var);
                fetVar.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            boolean zG = fetVar.g(u6nVar);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new d1n(u6nVar, b);
                fetVar.o0(objP2);
            }
            kkb.p(1, fetVar, null, (Function0) objP2);
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rlb(mm40Var, c280Var, i, b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Object i0(aeg0 aeg0Var, boolean z, boolean z2, Function1 function1, zje zjeVar) {
        pyh pyhVar;
        boolean z3;
        aeg0 aeg0Var2;
        boolean z4;
        Function1 function2;
        if (zjeVar instanceof pyh) {
            pyhVar = (pyh) zjeVar;
            int i = pyhVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                pyhVar.n = i - Integer.MIN_VALUE;
            } else {
                pyhVar = new pyh(zjeVar);
            }
        } else {
            pyhVar = new pyh(zjeVar);
        }
        pyh pyhVar2 = pyhVar;
        Object obj = pyhVar2.m;
        wne wneVar = wne.f39444a;
        int i2 = pyhVar2.n;
        if (i2 == 0) {
            z1x.P(obj);
            if (aeg0Var.k() && aeg0Var.n() && aeg0Var.l()) {
                nyh nyhVar = new nyh(z2, z, aeg0Var, null, function1, (byte) 1);
                pyhVar2.n = 1;
                Object objR = aeg0Var.r(z, nyhVar, pyhVar2);
                if (objR != wneVar) {
                    return objR;
                }
            } else {
                z3 = z;
                pyhVar2.i = aeg0Var;
                pyhVar2.j = function1;
                pyhVar2.k = z3;
                pyhVar2.l = z2;
                pyhVar2.n = 2;
                CoroutineContext coroutineContextA = A(aeg0Var, z2, pyhVar2);
                if (coroutineContextA != wneVar) {
                    aeg0Var2 = aeg0Var;
                    obj = coroutineContextA;
                    z4 = z2;
                    function2 = function1;
                }
            }
        }
        if (i2 == 1) {
            z1x.P(obj);
            return obj;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        boolean z5 = pyhVar2.l;
        z3 = pyhVar2.k;
        Function1 function3 = pyhVar2.j;
        aeg0 aeg0Var3 = pyhVar2.i;
        z1x.P(obj);
        z4 = z5;
        function2 = function3;
        aeg0Var2 = aeg0Var3;
        oyh oyhVar = new oyh((yje) null, aeg0Var2, z3, z4, function2);
        pyhVar2.i = null;
        pyhVar2.j = null;
        pyhVar2.n = 3;
        Object objD0 = qjj.d0((CoroutineContext) obj, oyhVar, pyhVar2);
        return objD0 == wneVar ? wneVar : objD0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(mm40 mm40Var, dkm dkmVar, fet fetVar, int i, int i2) {
        int i3;
        mm40 mm40Var2;
        dkm dkmVar2;
        dkm dkmVar3;
        mm40 mm40Var3;
        float f;
        long jM123getWhite0d7_KjU;
        float f2;
        fetVar.g0(-340722478);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && fetVar.g(dkmVar)) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                mm40 mm40Var4 = i4 != 0 ? jm40.b : mm40Var;
                if ((i2 & 2) != 0) {
                    mm40Var3 = mm40Var4;
                    dkmVar3 = new dkm((ycl) null, (y3d) (0 == true ? 1 : 0), 7);
                } else {
                    dkmVar3 = dkmVar;
                    mm40Var3 = mm40Var4;
                }
            } else {
                fetVar.X();
                mm40Var3 = mm40Var;
                dkmVar3 = dkmVar;
            }
            fetVar.s();
            if (dkmVar3 == null || !(dkmVar3 instanceof dkm)) {
                throw b1j.f(-1016782771, fetVar, false);
            }
            fetVar.e0(-1455308579);
            ycl yclVar = dkmVar3.f6237a;
            if (yclVar != null) {
                f = yclVar.f42389a;
            } else {
                zcl zclVar = qmk.f28987a;
                f = 40.0f;
            }
            mm40 mm40VarN = o7k0.n(mm40Var3, f);
            y3d y3dVar = dkmVar3.c;
            if (y3dVar == null) {
                fetVar.e0(-1016772137);
                jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                fetVar.r(false);
            } else {
                fetVar.e0(-1016773346);
                fetVar.r(false);
                jM123getWhite0d7_KjU = y3dVar.f41946a;
            }
            ycl yclVar2 = dkmVar3.b;
            if (yclVar2 != null) {
                f2 = yclVar2.f42389a;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f2 = 4.0f;
            }
            long jM121getTransparent0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU();
            zcl zclVar3 = qmk.f28987a;
            u7x.r(mm40VarN, jM123getWhite0d7_KjU, f2, jM121getTransparent0d7_KjU, fetVar, 0);
            fetVar.r(false);
            mm40Var2 = mm40Var3;
            dkmVar2 = dkmVar3;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            dkmVar2 = dkmVar;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e7h(mm40Var2, (Object) dkmVar2, i, i2, (byte) 1);
        }
    }

    public static final boolean j0(d0t d0tVar) {
        d0tVar.getClass();
        long jU0 = u0(d0tVar) - System.currentTimeMillis();
        if (jU0 < 0) {
            jU0 = 0;
        }
        return d0tVar.z && jU0 != 0;
    }

    public static final void k(mm40 mm40Var, vym vymVar, fet fetVar, int i) {
        int i2;
        boolean z;
        String str = vymVar.f;
        String str2 = vymVar.e;
        fetVar.g0(1806023895);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(vymVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 12.0f, 0.0f, 2);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
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
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            yx7 yx7Var = gqw0.l;
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            mm40 mm40VarN = s5x0.N(ohs0.i(fetVar, mm40VarC1, shdVar4, 1.0f, true), 0.0f, 0.0f, 4.0f, 0.0f, 11);
            x5d x5dVarA2 = w5d.a(new qw3(4.0f, false, new gne(yx7Var, (byte) 11)), xx7Var, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarN);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            p(null, vymVar.f38255a, fetVar, 0);
            p(null, vymVar.b, fetVar, 0);
            fetVar.r(true);
            q6x q6xVar = q6x.f28221a;
            o(0, fetVar, o7k0.e(jm40Var, 52.0f).e(new ecu0(yx7Var)));
            fetVar.e0(-1347521340);
            fetVar.r(false);
            fetVar.e0(-1347348732);
            fetVar.r(false);
            azm azmVar = vymVar.c;
            if (azmVar == null) {
                fetVar.e0(-1347178139);
                fetVar.r(false);
                z = true;
            } else {
                fetVar.e0(-1347178138);
                z = true;
                q(null, azmVar, true, fetVar, 384);
                fetVar.r(false);
            }
            fetVar.r(z);
            if (str2.length() <= 0 && str.length() <= 0 && vymVar.d.length() <= 0) {
                fetVar.e0(564873749);
                fetVar.r(false);
            } else {
                fetVar.e0(564650797);
                sj3.p(6, 0, fetVar, jm40Var, vymVar.d, str2, str);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xvm((byte) 25, i, mm40Var, vymVar);
        }
    }

    public static final a1g k0(gmq gmqVar, long j, Function2 function2) {
        if (j > 0) {
            return new a1g(gmqVar, new jnq(j, function2, null), (byte) 20);
        }
        c99.s(h97.h(j, "Expected positive amount of retries, but had "));
        return null;
    }

    public static final void l(int i, int i2, fet fetVar, mm40 mm40Var, String str) {
        int i3;
        str.getClass();
        fetVar.g0(-177887852);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(mm40Var) ? 256 : 128;
        }
        byte b = 0;
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 14;
            int i5 = i3 & 112;
            boolean z = (i4 == 4) | (i5 == 32);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new e6n(b, i, str);
                fetVar.o0(objP);
            }
            Function1 function1 = (Function1) objP;
            int i6 = (i4 == 4 ? (byte) 1 : (byte) 0) | (i5 == 32 ? (byte) 1 : (byte) 0);
            Object objP2 = fetVar.P();
            if (i6 != 0 || objP2 == cl5Var) {
                objP2 = new e6n(b2, i, str);
                fetVar.o0(objP2);
            }
            dwi0.b(function1, mm40Var, (Function1) objP2, fetVar, (i3 >> 3) & 112, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a18((byte) 23, i, i2, str, mm40Var);
        }
    }

    public static float l0(float f, float f2, float f3, float f4, float f5) {
        float f6 = f * f;
        float f7 = f6 * f;
        float f8 = 3.0f * f6;
        float fA = rw2.a(f7, f6, ((f5 - f3) * 0.3f) / 2.0f, ((((-2.0f) * f7) + f8) * f4) + (((f7 - (2.0f * f6)) + f) * (((f4 - f2) * 0.3f) / 2.0f)) + ((((2.0f * f7) - f8) + 1.0f) * f3));
        return (fA < Math.min(f3, f4) || fA > Math.max(f3, f4)) ? rw2.a(f4, f3, f, f3) : fA;
    }

    public static final void m(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        int i2;
        a4xVar.getClass();
        fetVar.g0(1986584462);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            pm80 pm80VarF = a8k0.F(R.drawable.default_background, 0, fetVar);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP);
            }
            cgk0 cgk0Var = (cgk0) objP;
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = androidx.compose.runtime.e.e(pm80VarF);
                fetVar.o0(objP2);
            }
            pz40 pz40Var = (pz40) objP2;
            String str = (String) CollectionsKt.W(cgk0Var.l(), a4xVar);
            pm80 pm80Var = (pm80) pz40Var.getValue();
            pm80 pm80Var2 = (pm80) pz40Var.getValue();
            pge pgeVar = gqw0.A;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = new wil(pz40Var, (byte) 25);
                fetVar.o0(objP3);
            }
            Function1 function1 = (Function1) objP3;
            boolean zG = fetVar.g(cgk0Var) | (i3 == 32);
            Object objP4 = fetVar.P();
            if (zG || objP4 == obj) {
                objP4 = new wmr(a4xVar, cgk0Var, (byte) 1);
                fetVar.o0(objP4);
            }
            k7x.b(str, null, mm40Var, pm80Var, pm80Var2, null, null, function1, (Function1) objP4, null, pgeVar, null, fetVar, ((i2 << 6) & 896) | 12619824, 6, 31328);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zph(mm40Var, a4xVar, i, (byte) 12);
        }
    }

    public static final long m0(kum kumVar) {
        kumVar.getClass();
        fgm fgmVar = fgm.f9498a;
        long jCurrentTimeMillis = kumVar.f18917a - (System.currentTimeMillis() - kumVar.b);
        if (jCurrentTimeMillis < 0) {
            return 0L;
        }
        return jCurrentTimeMillis;
    }

    public static final void n(int i, long j, fet fetVar, mm40 mm40Var, String str) {
        str.getClass();
        tj30 tj30VarC = zq8.c(gqw0.e, false);
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
        ((g1t0) fetVar.k(j1t0.e)).getClass();
        v8q0.a(str, null, j, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.e(), fetVar, ((i >> 3) & 14) | (i & 896), 24960, 109562);
        fetVar.r(true);
    }

    public static final a4x n0(String str, List list) {
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            muy muyVar = (muy) it.next();
            arrayList.add(new ap8(muyVar.e, muyVar.g, muyVar.d, muyVar.c.equals(str)));
        }
        return dyb.o0(arrayList);
    }

    public static final void o(int i, fet fetVar, mm40 mm40Var) {
        q6x q6xVar = q6x.f28221a;
        fetVar.g0(1482886815);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.e(2) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.s(mm40Var, 10.0f), 2.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
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
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = null;
                fetVar.o0(null);
            }
            mm40 mm40Var2 = (mm40) objP;
            if (mm40Var2 == null) {
                fetVar.e0(597369506);
                fetVar.r(false);
            } else {
                fetVar.e0(597369507);
                a(0, fetVar, mm40Var2);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xml(mm40Var, i, (byte) 17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:102:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:104:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:105:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:107:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:108:0x01de  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:111:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:114:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:116:0x0200  */
    /* JADX WARN: Code duplicated, block: B:117:0x0205  */
    /* JADX WARN: Code duplicated, block: B:119:0x0209  */
    /* JADX WARN: Code duplicated, block: B:120:0x020e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0216 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x0218  */
    /* JADX WARN: Code duplicated, block: B:124:0x021d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0222  */
    /* JADX WARN: Code duplicated, block: B:127:0x022a  */
    /* JADX WARN: Code duplicated, block: B:128:0x022f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0237  */
    /* JADX WARN: Code duplicated, block: B:131:0x023c  */
    /* JADX WARN: Code duplicated, block: B:133:0x0244  */
    /* JADX WARN: Code duplicated, block: B:134:0x0249  */
    /* JADX WARN: Code duplicated, block: B:136:0x0251  */
    /* JADX WARN: Code duplicated, block: B:137:0x0256  */
    /* JADX WARN: Code duplicated, block: B:139:0x025e  */
    /* JADX WARN: Code duplicated, block: B:140:0x0263  */
    /* JADX WARN: Code duplicated, block: B:142:0x026b  */
    /* JADX WARN: Code duplicated, block: B:143:0x0270  */
    /* JADX WARN: Code duplicated, block: B:145:0x0278  */
    /* JADX WARN: Code duplicated, block: B:146:0x027d  */
    /* JADX WARN: Code duplicated, block: B:148:0x0285  */
    /* JADX WARN: Code duplicated, block: B:149:0x028a  */
    /* JADX WARN: Code duplicated, block: B:151:0x0292  */
    /* JADX WARN: Code duplicated, block: B:152:0x0297  */
    /* JADX WARN: Code duplicated, block: B:154:0x029f  */
    /* JADX WARN: Code duplicated, block: B:155:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:157:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:158:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:160:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:161:0x02be  */
    /* JADX WARN: Code duplicated, block: B:163:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:164:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:166:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:167:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:169:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:170:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:172:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:173:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:175:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:176:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:178:0x0307  */
    /* JADX WARN: Code duplicated, block: B:179:0x030c  */
    /* JADX WARN: Code duplicated, block: B:181:0x0314  */
    /* JADX WARN: Code duplicated, block: B:182:0x0319  */
    /* JADX WARN: Code duplicated, block: B:184:0x0321  */
    /* JADX WARN: Code duplicated, block: B:185:0x0326  */
    /* JADX WARN: Code duplicated, block: B:187:0x032e  */
    /* JADX WARN: Code duplicated, block: B:188:0x0333  */
    /* JADX WARN: Code duplicated, block: B:190:0x033b  */
    /* JADX WARN: Code duplicated, block: B:191:0x0340  */
    /* JADX WARN: Code duplicated, block: B:193:0x0348  */
    /* JADX WARN: Code duplicated, block: B:194:0x034d  */
    /* JADX WARN: Code duplicated, block: B:196:0x0355  */
    /* JADX WARN: Code duplicated, block: B:197:0x035a  */
    /* JADX WARN: Code duplicated, block: B:199:0x0362  */
    /* JADX WARN: Code duplicated, block: B:200:0x0367  */
    /* JADX WARN: Code duplicated, block: B:202:0x036f  */
    /* JADX WARN: Code duplicated, block: B:203:0x0374  */
    /* JADX WARN: Code duplicated, block: B:205:0x037c  */
    /* JADX WARN: Code duplicated, block: B:206:0x0381  */
    /* JADX WARN: Code duplicated, block: B:208:0x0389  */
    /* JADX WARN: Code duplicated, block: B:209:0x038d  */
    /* JADX WARN: Code duplicated, block: B:211:0x0395  */
    /* JADX WARN: Code duplicated, block: B:212:0x0399  */
    /* JADX WARN: Code duplicated, block: B:214:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:215:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:217:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:218:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:220:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:221:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:223:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:224:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:226:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:227:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:229:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:230:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:232:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:69:0x0141  */
    /* JADX WARN: Code duplicated, block: B:71:0x0147  */
    /* JADX WARN: Code duplicated, block: B:72:0x014c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0152  */
    /* JADX WARN: Code duplicated, block: B:75:0x0157  */
    /* JADX WARN: Code duplicated, block: B:77:0x015b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0160  */
    /* JADX WARN: Code duplicated, block: B:80:0x0166  */
    /* JADX WARN: Code duplicated, block: B:81:0x016b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0171  */
    /* JADX WARN: Code duplicated, block: B:84:0x0176  */
    /* JADX WARN: Code duplicated, block: B:86:0x017e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0183  */
    /* JADX WARN: Code duplicated, block: B:89:0x018b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0190  */
    /* JADX WARN: Code duplicated, block: B:92:0x0198  */
    /* JADX WARN: Code duplicated, block: B:93:0x019d  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:96:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b7  */
    public static final cqr o0(bqr bqrVar, boolean z) {
        long j;
        String string;
        int i;
        bqrVar.getClass();
        long j2 = bqrVar.f3046a;
        long j3 = bqrVar.b;
        long j4 = jwg.d.b;
        if (j2 != j4) {
            if (j2 == 40 && j3 == 2) {
                StringBuilder sb = new StringBuilder(ujn.h);
                if (StringsKt.O("static/img/ImgDefault/Esports/LoL/GameBackground.png", ujn.h, false) || kotlin.text.c.x("static/img/ImgDefault/Esports/LoL/GameBackground.png", "https://", false)) {
                    sb.setLength(0);
                    sb.append("static/img/ImgDefault/Esports/LoL/GameBackground.png");
                } else {
                    if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                        sb.append('/');
                    }
                    sb.append(StringsKt.y0("static/img/ImgDefault/Esports/LoL/GameBackground.png", '/'));
                }
                string = sb.toString();
            } else {
                j = 40;
                if (j2 == qtg.d.b && z) {
                    StringBuilder sb2 = new StringBuilder(ujn.h);
                    if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/Dice/BigPig/background.png", ujn.h, false) || kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/Dice/BigPig/background.png", "https://", false)) {
                        sb2.setLength(0);
                        sb2.append("static/img/ImgDefault/Esports/Virtual/Dice/BigPig/background.png");
                    } else {
                        if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                            sb2.append('/');
                        }
                        sb2.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/Dice/BigPig/background.png", '/'));
                    }
                    string = sb2.toString();
                } else {
                    StringBuilder sb3 = new StringBuilder(ujn.h);
                    String str = bqrVar.c;
                    str.getClass();
                    if (str.length() == 0) {
                        sb3.setLength(0);
                    } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
                        sb3.setLength(0);
                        sb3.append(str);
                    } else {
                        if (sb3.length() > 0 && !StringsKt.S(sb3, Separators.SLASH)) {
                            sb3.append('/');
                        }
                        sb3.append(StringsKt.y0(str, '/'));
                    }
                    string = sb3.toString();
                }
            }
            i = R.color.static_black;
            if (j2 == j) {
                if (j3 == 1) {
                    i = R.color.dota_statistic_bg;
                } else if (j3 == 46) {
                    i = R.color.cyber_cs2_bg;
                } else if (j3 == 2) {
                    i = R.color.cyber_lol_redesign_bg;
                } else if (j3 == 27) {
                    i = R.color.cyber_valorant_bg;
                } else if (j3 == 15) {
                    i = R.color.cyber_rainbow_bg;
                }
            } else if (j2 == kvg.d.b) {
                i = R.color.cyber_mortal_kombat_bg;
            } else if (j2 == bxg.d.b) {
                i = R.color.cyber_fifa_bg;
            } else if (j2 == rvg.d.b) {
                i = R.color.cyber_pes_bg;
            } else if (j2 == twg.d.b) {
                i = R.color.cyber_subway_surfers_bg;
            } else if (j2 == ltg.d.b) {
                i = R.color.cyber_volleyball_bg;
            } else if (j2 == fvg.d.b) {
                i = R.color.cyber_marble_volleyball_bg;
            } else if (j2 == xug.d.b) {
                i = R.color.cyber_marble_football_bg;
            } else if (j2 == gxg.d.b) {
                i = R.color.cyber_star_craft_bg;
            } else if (j2 == mxg.d.b) {
                i = R.color.cyber_twenty_one_bg;
            } else if (j2 == tvg.d.b) {
                i = R.color.cyber_poker_bg;
            } else if (j2 == jrg.d.b) {
                i = R.color.cyber_bakkara_bg;
            } else if (j2 == j4) {
                i = R.color.cyber_setto_e_mezzo_bg;
            } else if (j2 == qtg.d.b) {
                if (z) {
                    i = R.color.uikit_cyber_brown_ton_16;
                } else {
                    i = R.color.cyber_dice_bg;
                }
            } else if (j2 == ktg.d.b) {
                i = R.color.cyber_ufc_bg;
            } else if (j2 == iwg.d.b) {
                i = R.color.cyber_sekiro_bg;
            } else if (j2 == jtg.d.b) {
                i = R.color.cyber_tekken_bg;
            } else if (j2 == jxg.d.b) {
                i = R.color.cyber_table_football_pro_bg;
            } else if (j2 == msg.d.b) {
                i = R.color.cyber_battlegrounds_bg;
            } else if (j2 == ysg.d.b) {
                i = R.color.cyber_injustice_bg;
            } else if (j2 == gwg.d.b) {
                i = R.color.cyber_sega_football_bg;
            } else if (j2 == avg.d.b) {
                i = R.color.cyber_marble_mma_bg;
            } else if (j2 == qug.d.b) {
                i = R.color.cyber_marble_baseball_bg;
            } else if (j2 == ixg.d.b) {
                i = R.color.cyber_cyber_tennis_bg;
            } else if (j2 == lwg.d.b) {
                i = R.color.cyber_sonic_bg;
            } else if (j2 == erg.d.b) {
                i = R.color.cyber_angry_birds_bg;
            } else if (j2 == pvg.d.b) {
                i = R.color.cyber_overcooked_bg;
            } else if (j2 == irg.d.b) {
                i = R.color.cyber_assault_squad_bg;
            } else if (j2 == bsg.d.b) {
                i = R.color.cyber_crash_bg;
            } else if (j2 == ewg.d.b) {
                i = R.color.cyber_russian_lotto;
            } else if (j2 == fwg.d.b) {
                i = R.color.cyber_sea_battle_bg;
            } else if (j2 == pxg.d.b) {
                i = R.color.cyber_victory_formula_bg;
            } else if (j2 == fsg.d.b) {
                i = R.color.cyber_crystal_bg;
            } else if (j2 == hwg.d.b) {
                i = R.color.cyber_seka_bg;
            } else if (j2 == rtg.d.b) {
                i = R.color.cyber_poker_dice_bg;
            } else if (j2 == iug.d.b) {
                i = R.color.cyber_higher_vs_lower_bg;
            } else if (j2 == yug.d.b) {
                i = R.color.cyber_marble_golf_bg;
            } else if (j2 == uug.d.b) {
                i = R.color.cyber_marble_collisions_bg;
            } else if (j2 == evg.d.b) {
                i = R.color.cyber_marble_slides_bg;
            } else if (j2 == gvg.d.b) {
                i = R.color.cyber_marble_waves_bg;
            } else if (j2 == osg.d.b) {
                i = R.color.cyber_marble_billiard_bg;
            } else if (j2 == ntg.d.b) {
                i = R.color.cyber_darts_live_bg;
            } else if (j2 == xrg.d.b) {
                i = R.color.cyber_durak_bg;
            } else if (j2 == yrg.d.b) {
                i = R.color.cyber_card_football_bg;
            } else if (j2 == cwg.d.b) {
                i = R.color.cyber_roulette_bg;
            } else if (j2 == lug.d.b) {
                i = R.color.cyber_killer_joker_bg;
            } else if (j2 == uvg.d.b) {
                i = R.color.cyber_power_of_power_bg;
            } else if (j2 == cug.d.b) {
                i = R.color.cyber_gold_rush_bg;
            } else if (j2 == wrg.d.b) {
                i = R.color.cyber_card_cricket_bg;
            } else if (j2 == vrg.d.b) {
                i = R.color.cyber_card_basketball_bg;
            }
            return new cqr(string, i, false);
        }
        StringBuilder sb4 = new StringBuilder(ujn.h);
        if (StringsKt.O("static/img/ImgDefault/Esports/Sette_e_mezzo/SettoEMezzo2.png", ujn.h, false) || kotlin.text.c.x("static/img/ImgDefault/Esports/Sette_e_mezzo/SettoEMezzo2.png", "https://", false)) {
            sb4.setLength(0);
            sb4.append("static/img/ImgDefault/Esports/Sette_e_mezzo/SettoEMezzo2.png");
        } else {
            if (sb4.length() > 0 && !StringsKt.S(sb4, Separators.SLASH)) {
                sb4.append('/');
            }
            sb4.append(StringsKt.y0("static/img/ImgDefault/Esports/Sette_e_mezzo/SettoEMezzo2.png", '/'));
        }
        string = sb4.toString();
        j = 40;
        i = R.color.static_black;
        if (j2 == j) {
            if (j3 == 1) {
                i = R.color.dota_statistic_bg;
            } else if (j3 == 46) {
                i = R.color.cyber_cs2_bg;
            } else if (j3 == 2) {
                i = R.color.cyber_lol_redesign_bg;
            } else if (j3 == 27) {
                i = R.color.cyber_valorant_bg;
            } else if (j3 == 15) {
                i = R.color.cyber_rainbow_bg;
            }
        } else if (j2 == kvg.d.b) {
            i = R.color.cyber_mortal_kombat_bg;
        } else if (j2 == bxg.d.b) {
            i = R.color.cyber_fifa_bg;
        } else if (j2 == rvg.d.b) {
            i = R.color.cyber_pes_bg;
        } else if (j2 == twg.d.b) {
            i = R.color.cyber_subway_surfers_bg;
        } else if (j2 == ltg.d.b) {
            i = R.color.cyber_volleyball_bg;
        } else if (j2 == fvg.d.b) {
            i = R.color.cyber_marble_volleyball_bg;
        } else if (j2 == xug.d.b) {
            i = R.color.cyber_marble_football_bg;
        } else if (j2 == gxg.d.b) {
            i = R.color.cyber_star_craft_bg;
        } else if (j2 == mxg.d.b) {
            i = R.color.cyber_twenty_one_bg;
        } else if (j2 == tvg.d.b) {
            i = R.color.cyber_poker_bg;
        } else if (j2 == jrg.d.b) {
            i = R.color.cyber_bakkara_bg;
        } else if (j2 == j4) {
            i = R.color.cyber_setto_e_mezzo_bg;
        } else if (j2 == qtg.d.b) {
            if (z) {
                i = R.color.uikit_cyber_brown_ton_16;
            } else {
                i = R.color.cyber_dice_bg;
            }
        } else if (j2 == ktg.d.b) {
            i = R.color.cyber_ufc_bg;
        } else if (j2 == iwg.d.b) {
            i = R.color.cyber_sekiro_bg;
        } else if (j2 == jtg.d.b) {
            i = R.color.cyber_tekken_bg;
        } else if (j2 == jxg.d.b) {
            i = R.color.cyber_table_football_pro_bg;
        } else if (j2 == msg.d.b) {
            i = R.color.cyber_battlegrounds_bg;
        } else if (j2 == ysg.d.b) {
            i = R.color.cyber_injustice_bg;
        } else if (j2 == gwg.d.b) {
            i = R.color.cyber_sega_football_bg;
        } else if (j2 == avg.d.b) {
            i = R.color.cyber_marble_mma_bg;
        } else if (j2 == qug.d.b) {
            i = R.color.cyber_marble_baseball_bg;
        } else if (j2 == ixg.d.b) {
            i = R.color.cyber_cyber_tennis_bg;
        } else if (j2 == lwg.d.b) {
            i = R.color.cyber_sonic_bg;
        } else if (j2 == erg.d.b) {
            i = R.color.cyber_angry_birds_bg;
        } else if (j2 == pvg.d.b) {
            i = R.color.cyber_overcooked_bg;
        } else if (j2 == irg.d.b) {
            i = R.color.cyber_assault_squad_bg;
        } else if (j2 == bsg.d.b) {
            i = R.color.cyber_crash_bg;
        } else if (j2 == ewg.d.b) {
            i = R.color.cyber_russian_lotto;
        } else if (j2 == fwg.d.b) {
            i = R.color.cyber_sea_battle_bg;
        } else if (j2 == pxg.d.b) {
            i = R.color.cyber_victory_formula_bg;
        } else if (j2 == fsg.d.b) {
            i = R.color.cyber_crystal_bg;
        } else if (j2 == hwg.d.b) {
            i = R.color.cyber_seka_bg;
        } else if (j2 == rtg.d.b) {
            i = R.color.cyber_poker_dice_bg;
        } else if (j2 == iug.d.b) {
            i = R.color.cyber_higher_vs_lower_bg;
        } else if (j2 == yug.d.b) {
            i = R.color.cyber_marble_golf_bg;
        } else if (j2 == uug.d.b) {
            i = R.color.cyber_marble_collisions_bg;
        } else if (j2 == evg.d.b) {
            i = R.color.cyber_marble_slides_bg;
        } else if (j2 == gvg.d.b) {
            i = R.color.cyber_marble_waves_bg;
        } else if (j2 == osg.d.b) {
            i = R.color.cyber_marble_billiard_bg;
        } else if (j2 == ntg.d.b) {
            i = R.color.cyber_darts_live_bg;
        } else if (j2 == xrg.d.b) {
            i = R.color.cyber_durak_bg;
        } else if (j2 == yrg.d.b) {
            i = R.color.cyber_card_football_bg;
        } else if (j2 == cwg.d.b) {
            i = R.color.cyber_roulette_bg;
        } else if (j2 == lug.d.b) {
            i = R.color.cyber_killer_joker_bg;
        } else if (j2 == uvg.d.b) {
            i = R.color.cyber_power_of_power_bg;
        } else if (j2 == cug.d.b) {
            i = R.color.cyber_gold_rush_bg;
        } else if (j2 == wrg.d.b) {
            i = R.color.cyber_card_cricket_bg;
        } else if (j2 == vrg.d.b) {
            i = R.color.cyber_card_basketball_bg;
        }
        return new cqr(string, i, false);
    }

    public static final void p(mm40 mm40Var, bzm bzmVar, fet fetVar, int i) {
        byte b;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(777965970);
        int i2 = i | 6 | (fetVar2.g(bzmVar) ? 32 : 16);
        byte b2 = 1;
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 24.0f), 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
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
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1802623762, new xym(bzmVar, b2), fetVar2), fetVar2, 56);
            mm40 mm40VarN = s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            String str = bzmVar.f3476a;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarD = g1t0.d();
            long j = qmk.p;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            b = 1;
            v8q0.a(str, mm40VarN, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), new n05(j, g1t0.d().f42262a.b, idm0.s(0.25d)), 0L, null, null, null, 0L, null, qmk.C, 2, false, 2, 0, null, y9q0VarD, fetVar, 0, 24960, 108528);
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
            yfe0VarU.d = new yym(mm40Var2, bzmVar, i, b);
        }
    }

    public static final zts p0(GameSubscriptionSettingsScreenUiModel gameSubscriptionSettingsScreenUiModel) {
        gameSubscriptionSettingsScreenUiModel.getClass();
        ots otsVar = new ots(gameSubscriptionSettingsScreenUiModel.b, gameSubscriptionSettingsScreenUiModel.f46678a);
        ArrayList<PeriodSubscriptionSettingsScreenUiModel> arrayList = gameSubscriptionSettingsScreenUiModel.c;
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (PeriodSubscriptionSettingsScreenUiModel periodSubscriptionSettingsScreenUiModel : arrayList) {
            SubscriptionPeriodUiModel subscriptionPeriodUiModel = periodSubscriptionSettingsScreenUiModel.f46679a;
            long j = subscriptionPeriodUiModel.f46682a;
            String str = subscriptionPeriodUiModel.b;
            ArrayList<SubscriptionEventSettingsUiModel> arrayList3 = periodSubscriptionSettingsScreenUiModel.b;
            ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
            for (SubscriptionEventSettingsUiModel subscriptionEventSettingsUiModel : arrayList3) {
                SubscriptionEventUiModel subscriptionEventUiModel = subscriptionEventSettingsUiModel.f46680a;
                arrayList4.add(new sho(subscriptionEventUiModel.b, subscriptionEventUiModel.f46681a, subscriptionEventSettingsUiModel.b));
            }
            arrayList2.add(new xf90(j, str, arrayList4));
        }
        return new zts(otsVar, arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public static final void q(mm40 mm40Var, azm azmVar, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2;
        String str;
        ?? r2;
        fet fetVar3;
        fet fetVar4;
        boolean z2;
        fet fetVar5;
        fet fetVar6 = fetVar;
        fetVar6.g0(-1465928683);
        int i2 = i | 6 | (fetVar6.g(azmVar) ? 32 : 16);
        if (fetVar6.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(jm40Var, 32.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar6, 48);
            int iHashCode = Long.hashCode(fetVar6.T);
            bh90 bh90VarM = fetVar6.m();
            mm40 mm40VarC0 = kbc.c0(fetVar6, mm40VarS);
            mkd.c0.getClass();
            fetVar6.i0();
            if (fetVar6.S) {
                fetVar6.l(e7z.u1);
            } else {
                fetVar6.r0();
            }
            jpm0.o(fetVar6, x5dVarA, gqw0.x);
            jpm0.o(fetVar6, bh90VarM, gqw0.w);
            jpm0.o(fetVar6, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar6);
            jpm0.o(fetVar6, mm40VarC0, gqw0.v);
            String str2 = azmVar.f1723a;
            String str3 = azmVar.c;
            String str4 = azmVar.b;
            if (str2.length() > 0) {
                fetVar6.e0(-908351993);
                mm40 mm40VarD = o7k0.d(o7k0.e(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), 12.0f), 1.0f);
                String str5 = azmVar.f1723a;
                long secondary = ((ThemeColors) fetVar6.k(zaq0.b)).getSecondary();
                ((g1t0) fetVar6.k(j1t0.e)).getClass();
                r2 = 0;
                str = str4;
                v8q0.a(str5, mm40VarD, secondary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.e(), fetVar, 0, 24960, 109560);
                fet fetVar7 = fetVar;
                fetVar7.r(false);
                fetVar3 = fetVar7;
            } else {
                str = str4;
                r2 = 0;
                fet fetVar8 = fetVar6;
                fetVar8.e0(-907896169);
                fetVar8.r(false);
                fetVar3 = fetVar8;
            }
            fetVar3.e0(-907778245);
            fetVar3.r(r2);
            fetVar3.e0(-907632421);
            fetVar3.r(r2);
            if (z) {
                fetVar3.e0(-907576838);
                fet fetVar9 = fetVar3;
                pzb.n(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), f7k.Z(str, fetVar3), null, fetVar9, 0, 0);
                fet fetVar10 = fetVar9;
                fetVar10.r(r2);
                fetVar4 = fetVar10;
            } else {
                fetVar3.e0(-907317151);
                sac.p(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), new dqm(f7k.Z(str, fetVar3), null), fetVar3, r2, r2);
                fetVar3.r(r2);
                fetVar4 = fetVar3;
            }
            if (z) {
                fetVar4.e0(-906961922);
                fet fetVar11 = fetVar;
                pzb.n(null, f7k.Z(str3, fetVar4), null, fetVar11, 0, 1);
                fetVar11.r(r2);
                z2 = true;
                fetVar5 = fetVar11;
            } else {
                fet fetVar12 = fetVar4;
                fetVar12.e0(-906769691);
                z2 = true;
                sac.p(null, new dqm(f7k.Z(str3, fetVar12), null), fetVar12, r2, 1);
                fetVar12.r(r2);
                fetVar5 = fetVar12;
            }
            fetVar5.r(z2);
            mm40Var2 = jm40Var;
            fetVar2 = fetVar5;
        } else {
            fetVar6.X();
            mm40Var2 = mm40Var;
            fetVar2 = fetVar6;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wym(mm40Var2, azmVar, z, i, (byte) 1);
        }
    }

    public static final long q0(d0t d0tVar) {
        d0tVar.getClass();
        return TimeUnit.SECONDS.toMillis(d0tVar.t);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0027  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int r(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L8
            if (r5 == 0) goto L6
            return r0
        L6:
            int r4 = r4 - r3
            return r4
        L8:
            if (r5 != 0) goto Ld
            if (r3 > r2) goto L16
            goto L11
        Ld:
            int r1 = r4 - r3
            if (r1 <= r2) goto L16
        L11:
            if (r5 == 0) goto L14
            goto L21
        L14:
            int r2 = r2 - r3
            return r2
        L16:
            if (r5 == 0) goto L1b
            if (r3 > r2) goto L24
            goto L1f
        L1b:
            int r1 = r4 - r3
            if (r1 <= r2) goto L24
        L1f:
            if (r5 != 0) goto L22
        L21:
            return r2
        L22:
            int r2 = r2 - r3
            return r2
        L24:
            if (r5 != 0) goto L27
            return r0
        L27:
            int r4 = r4 - r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kpb.r(int, int, int, boolean):int");
    }

    public static final long r0(d0t d0tVar) {
        d0tVar.getClass();
        return TimeUnit.SECONDS.toMillis(d0tVar.p.j);
    }

    public static final long s0(d0t d0tVar) {
        d0tVar.getClass();
        if (d0tVar.p.j == 0 || d0tVar.A != boh.UNKNOWN) {
            return 0L;
        }
        return r0(d0tVar);
    }

    public static final u180 t0(kzv kzvVar) {
        z0w z0wVar = (z0w) CollectionsKt.firstOrNull(kzvVar.Y);
        if (z0wVar == null) {
            return p180.f26188a;
        }
        String str = z0wVar.m;
        String str2 = z0wVar.p;
        List list = z0wVar.r;
        List list2 = z0wVar.o;
        long j = kzvVar.h;
        opm opmVar = opm.f25648a;
        if (j == 95) {
            return new q180(str, str2, new lpm(opmVar, new hpm(0L, 3)));
        }
        if (list2.size() != 2 || list.size() != 2) {
            if (str2.length() == 0) {
                return new r180(str);
            }
            String str3 = (String) CollectionsKt.firstOrNull(list2);
            if (str3 == null) {
                str3 = "";
            }
            c280 c280Var = new c280(vsm0.s(z0wVar.n, str3), R.drawable.ic_glyph_placeholder_player);
            String str4 = (String) CollectionsKt.firstOrNull(list);
            return new s180(str, c280Var, str2, new c280(vsm0.s(z0wVar.q, str4 != null ? str4 : ""), R.drawable.ic_glyph_placeholder_player), new lpm(opmVar, new hpm(0L, 3)));
        }
        String str5 = (String) CollectionsKt.firstOrNull(list2);
        if (str5 == null) {
            str5 = "";
        }
        c280 c280Var2 = new c280(vsm0.t(str5), R.drawable.ic_glyph_placeholder_player);
        String str6 = (String) CollectionsKt.f0(list2);
        if (str6 == null) {
            str6 = "";
        }
        c280 c280Var3 = new c280(vsm0.t(str6), R.drawable.ic_glyph_placeholder_player);
        String str7 = (String) CollectionsKt.firstOrNull(list);
        if (str7 == null) {
            str7 = "";
        }
        c280 c280Var4 = new c280(vsm0.t(str7), R.drawable.ic_glyph_placeholder_player);
        String str8 = (String) CollectionsKt.f0(list);
        return new t180(str, c280Var2, c280Var3, str2, c280Var4, new c280(vsm0.t(str8 != null ? str8 : ""), R.drawable.ic_glyph_placeholder_player), new lpm(opmVar, new hpm(0L, 3)));
    }

    public static final boolean u(sip sipVar) {
        sipVar.getClass();
        int iOrdinal = sipVar.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1) {
            return true;
        }
        t9f.b();
        return false;
    }

    public static final long u0(d0t d0tVar) {
        d0tVar.getClass();
        return TimeUnit.SECONDS.toMillis(d0tVar.s);
    }

    public static final long v(sip sipVar) {
        sipVar.getClass();
        int iOrdinal = sipVar.ordinal();
        if (iOrdinal == 0) {
            uen uenVar = wen.b;
            return ibc.w0(30L, bfn.SECONDS);
        }
        if (iOrdinal == 1) {
            uen uenVar2 = wen.b;
            return ibc.w0(8L, bfn.SECONDS);
        }
        t9f.b();
        return 0L;
    }

    public static final String v0(ms2 ms2Var) {
        ms2Var.getClass();
        if (ms2Var == null) {
            return "unknown";
        }
        if (ms2Var instanceof mr2) {
            return "main_screen";
        }
        if (ms2Var instanceof rq2) {
            return "cybersport_main";
        }
        if (ms2Var instanceof jq2) {
            return "cybersport_champ";
        }
        if (ms2Var instanceof uq2) {
            return "cyber_champs_games";
        }
        if (ms2Var instanceof lq2) {
            return "game_screen_cyber";
        }
        if (ms2Var instanceof cq2) {
            return "bet_favor_team";
        }
        if (ms2Var instanceof aq2) {
            return "bet_favor_championship";
        }
        if (ms2Var instanceof bq2) {
            return "bet_favor_events";
        }
        if (ms2Var instanceof pr2) {
            return "search";
        }
        if (ms2Var instanceof qr2) {
            return "search_in_coupon";
        }
        if (ms2Var instanceof gs2) {
            return "sport_champ_games";
        }
        if (ms2Var instanceof fs2) {
            return "sport_champ_allmatches";
        }
        if (ms2Var instanceof zq2) {
            return "game_screen";
        }
        if (ms2Var instanceof hs2) {
            return "sport_domestic_games";
        }
        if (ms2Var instanceof wq2) {
            return "bet_favor";
        }
        if (ms2Var instanceof xq2) {
            return "favor_other";
        }
        if (ms2Var instanceof sq2) {
            return "cyber_team";
        }
        if (ms2Var instanceof lr2) {
            return "popular_new_top";
        }
        if (ms2Var instanceof kr2) {
            return "popular_new_sport";
        }
        if (ms2Var instanceof jr2) {
            return "popular_new_esports";
        }
        if (ms2Var instanceof iq2) {
            return "additional_blocks_games_list";
        }
        if (ms2Var instanceof gq2) {
            return "cricket_over";
        }
        if (ms2Var instanceof hq2) {
            return "cricket_pers_total";
        }
        if (ms2Var instanceof br2) {
            return "game_screen_insight";
        }
        if (ms2Var instanceof hr2) {
            return "classic_popular_live";
        }
        if (ms2Var instanceof gr2) {
            return "classic_popular_line";
        }
        if (ms2Var instanceof fr2) {
            return "classic_popular_esports";
        }
        if (ms2Var instanceof tq2) {
            return "cyber_virual_category";
        }
        if (ms2Var instanceof mq2) {
            return "cyber_hltv_award";
        }
        if (ms2Var instanceof vq2) {
            return "duel";
        }
        if (ms2Var instanceof rr2) {
            return "similar_games";
        }
        if (ms2Var instanceof ar2) {
            return "game_screen_transition";
        }
        if ((ms2Var instanceof er2) || (ms2Var instanceof is2)) {
            return "notifications";
        }
        if (ms2Var instanceof cr2) {
            return "list_of_games";
        }
        if (ms2Var instanceof eq2) {
            return "bets_on_players";
        }
        if (ms2Var instanceof kq2) {
            return "cyber_general_champ";
        }
        if (ms2Var instanceof fq2) {
            return "bet_favor_watched";
        }
        if (ms2Var instanceof qq2) {
            return "similar_games_cybersport";
        }
        if (ms2Var instanceof nr2) {
            return "related_games_screen";
        }
        return ms2Var instanceof ks2 ? "top_event_bottom_sheet" : "unknown";
    }

    public static final a4x w(String str, List list) {
        list.getClass();
        str.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wmg wmgVar = (wmg) it.next();
            String str2 = wmgVar.f39405a;
            arrayList.add(new hfa0(kkg.j, str2, wmgVar.b, "", wmgVar.c, Intrinsics.d(str2, str)));
        }
        return dyb.o0(arrayList);
    }

    public static final void w0(Fragment fragment, boolean z, Function0 function0, Function0 function1, ii iiVar) {
        iiVar.getClass();
        String strH = fragment.H(R.string.confirmation);
        strH.getClass();
        String strH2 = fragment.H(R.string.change_settings_animation_enabled_text);
        strH2.getClass();
        u0i.c2.getClass();
        Fragment fragmentJ = fragment.C().J(u0i.e2 + BundleUtil.UNDERLINE_TAG + strH + BundleUtil.UNDERLINE_TAG + strH2);
        if (z) {
            if (fragmentJ != null) {
                ((u0i) fragmentJ).z0(false, false, false);
            }
        } else {
            if (fragmentJ != null) {
                return;
            }
            ccq0.V(fragment, "WARNING_DIALOG_REQUEST_KEY", new dbn(function0, (byte) 7));
            ccq0.T(fragment, "WARNING_DIALOG_REQUEST_KEY", new dbn(function1, (byte) 8));
            String strH3 = fragment.H(R.string.go_to_settings_text);
            strH3.getClass();
            ua80.r(fragment, iiVar, new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, fragment.H(R.string.back_text), (String) null, "WARNING_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable x(gmq gmqVar, kmq kmqVar, zje zjeVar) throws Throwable {
        hnq hnqVar;
        mie0 mie0Var;
        bby bbyVar;
        CancellationException cancellationException;
        if (zjeVar instanceof hnq) {
            hnqVar = (hnq) zjeVar;
            int i = hnqVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                hnqVar.k = i - Integer.MIN_VALUE;
            } else {
                hnqVar = new hnq(zjeVar);
            }
        } else {
            hnqVar = new hnq(zjeVar);
        }
        Object obj = hnqVar.j;
        wne wneVar = wne.f39444a;
        int i2 = hnqVar.k;
        if (i2 == 0) {
            mie0 mie0VarJ = ohs0.j(obj);
            try {
                kmq o4mVar = new o4m((Object) kmqVar, (Object) mie0VarJ, (byte) 11);
                hnqVar.i = mie0VarJ;
                hnqVar.k = 1;
                if (gmqVar.c(o4mVar, hnqVar) == wneVar) {
                    return wneVar;
                }
                return null;
            } catch (Throwable th) {
                th = th;
                mie0Var = mie0VarJ;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mie0Var = hnqVar.i;
            try {
                z1x.P(obj);
                return null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        Throwable th3 = (Throwable) mie0Var.f21842a;
        if ((th3 != null && th3.equals(th)) || ((bbyVar = (bby) hnqVar.getContext().get(gqw0.o1)) != null && bbyVar.isCancelled() && (cancellationException = bbyVar.getCancellationException()) != null && cancellationException.equals(th))) {
            throw th;
        }
        if (th3 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            tjo.a(th3, th);
            throw th3;
        }
        tjo.a(th, th3);
        throw th;
    }

    public static kpb y(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i == 0) {
            return new pq40(dArr, dArr2);
        }
        if (i == 2) {
            double d = dArr[0];
            double[] dArr3 = dArr2[0];
            hwf hwfVar = new hwf();
            hwfVar.f13767a = d;
            hwfVar.b = dArr3;
            return hwfVar;
        }
        b900 b900Var = new b900();
        int length = dArr2[0].length;
        b900Var.c = new double[length];
        b900Var.f2185a = dArr;
        b900Var.b = dArr2;
        if (length > 2) {
            double d2 = 0.0d;
            int i2 = 0;
            while (true) {
                double d3 = d2;
                if (i2 >= dArr.length) {
                    break;
                }
                double d4 = dArr2[i2][0];
                if (i2 > 0) {
                    Math.hypot(d4 - d2, d4 - d3);
                }
                i2++;
                d2 = d4;
            }
        }
        return b900Var;
    }

    public int I() {
        List list = fxc.c;
        if (list != null) {
            return list.size();
        }
        Intrinsics.h("newItems");
        throw null;
    }

    public int J() {
        ArrayList arrayList = fxc.b;
        if (arrayList != null) {
            return arrayList.size();
        }
        Intrinsics.h("oldItems");
        throw null;
    }

    public abstract double O(double d);

    public abstract void P(double d, double[] dArr);

    public abstract void Q(double d, float[] fArr);

    public abstract void W(double d, double[] dArr);

    public abstract double[] Y();

    public boolean s(int i, int i2) {
        List list = fxc.c;
        if (list == null) {
            Intrinsics.h("newItems");
            throw null;
        }
        Object obj = list.get(i2);
        ArrayList arrayList = fxc.b;
        if (arrayList != null) {
            return Intrinsics.d(obj, arrayList.get(i));
        }
        Intrinsics.h("oldItems");
        throw null;
    }

    public boolean t(int i, int i2) {
        List list = fxc.c;
        if (list == null) {
            Intrinsics.h("newItems");
            throw null;
        }
        int i3 = ((uvc) list.get(i2)).f36341a;
        ArrayList arrayList = fxc.b;
        if (arrayList != null) {
            return i3 == ((uvc) arrayList.get(i)).f36341a;
        }
        Intrinsics.h("oldItems");
        throw null;
    }

    public Object z(int i, int i2) {
        return null;
    }
}
