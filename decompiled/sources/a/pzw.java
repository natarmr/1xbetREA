package a;

import android.content.Context;
import android.os.Build;
import android.text.format.DateFormat;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class pzw {
    public static final mm40 A(int i, fet fetVar, mm40 mm40Var, final Function0 function0) {
        mm40Var.getClass();
        function0.getClass();
        WeakHashMap weakHashMap = djv0.w;
        final boolean zBooleanValue = ((Boolean) ((hgk0) zcm0.i(fetVar).c.d).getValue()).booleanValue();
        final float fH = ((wgu0) fetVar.k(bmd.t)).h();
        Object objP = fetVar.P();
        cl5 cl5Var = ukd.f35823a;
        if (objP == cl5Var) {
            objP = androidx.compose.runtime.e.a(0.0f);
            fetVar.o0(objP);
        }
        final agk0 agk0Var = (agk0) objP;
        Object objP2 = fetVar.P();
        if (objP2 == cl5Var) {
            objP2 = androidx.compose.runtime.e.e(Boolean.FALSE);
            fetVar.o0(objP2);
        }
        final pz40 pz40Var = (pz40) objP2;
        byte b = 1;
        boolean zH = ((((i & 112) ^ 48) > 32 && fetVar.g(function0)) || (i & 48) == 32) | fetVar.h(zBooleanValue) | fetVar.d(fH);
        Object objP3 = fetVar.P();
        if (zH || objP3 == cl5Var) {
            Function1 function1 = new Function1() { // from class: a.vm40
                /* JADX WARN: Code duplicated, block: B:21:0x0051  */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    MotionEvent motionEvent = (MotionEvent) obj;
                    motionEvent.getClass();
                    int actionMasked = motionEvent.getActionMasked();
                    agk0 agk0Var2 = agk0Var;
                    pz40 pz40Var2 = pz40Var;
                    if (actionMasked == 0) {
                        agk0Var2.m(motionEvent.getY());
                        pz40Var2.setValue(Boolean.FALSE);
                    } else if (actionMasked == 1) {
                        agk0Var2.m(0.0f);
                        pz40Var2.setValue(Boolean.FALSE);
                    } else if (actionMasked != 2) {
                        if (actionMasked == 3) {
                            agk0Var2.m(0.0f);
                            pz40Var2.setValue(Boolean.FALSE);
                        }
                    } else if (zBooleanValue && !((Boolean) pz40Var2.getValue()).booleanValue() && agk0Var2.l() != 0.0f && Math.abs(motionEvent.getY() - agk0Var2.l()) > fH) {
                        function0.invoke();
                        pz40Var2.setValue(Boolean.TRUE);
                    }
                    return Unit.f46060a;
                }
            };
            fetVar.o0(function1);
            objP3 = function1;
        }
        Function1 function2 = (Function1) objP3;
        return fnn0.a(mm40Var, function2, new qo90(function2, b));
    }

    public static final zi50 B(Long l, long j) {
        if (l == null) {
            return zi50.f44426a;
        }
        long jLongValue = l.longValue();
        if (jLongValue < j) {
            return zi50.c;
        }
        return jLongValue > j ? zi50.b : zi50.f44426a;
    }

    public static final zi50 C(String str, String str2) {
        Integer intOrNull = str != null ? StringsKt.toIntOrNull(str) : null;
        if (intOrNull == null || str2 == null) {
            return zi50.f44426a;
        }
        int iIntValue = intOrNull.intValue();
        Integer intOrNull2 = StringsKt.toIntOrNull(str2);
        int iIntValue2 = intOrNull2 != null ? intOrNull2.intValue() : 0;
        if (iIntValue < iIntValue2) {
            return zi50.c;
        }
        return iIntValue > iIntValue2 ? zi50.b : zi50.f44426a;
    }

    public static final zi50 D(bj50 bj50Var, bj50 bj50Var2, boolean z) {
        zi50 zi50Var;
        zi50 zi50Var2;
        zi50 zi50VarB;
        zi50 zi50VarC;
        Long l = bj50Var.j;
        if (O(bj50Var, bj50Var2) && bj50Var.c && bj50Var2 != null) {
            if (bj50Var2.c && l != null) {
                if (l.longValue() != 0) {
                    String str = z ? bj50Var.m : bj50Var.n;
                    String str2 = z ? bj50Var2.m : bj50Var2.n;
                    if (str != null && str2 != null) {
                        List listI0 = StringsKt.i0(str, new char[]{'/'}, 6);
                        List listI1 = StringsKt.i0(str2, new char[]{'/'}, 6);
                        Iterable iterableS0 = CollectionsKt.S0(listI0);
                        if (!(iterableS0 instanceof Collection) || !((Collection) iterableS0).isEmpty()) {
                            Iterator it = iterableS0.iterator();
                            do {
                                iil iilVar = (iil) it;
                                if (!iilVar.b.hasNext()) {
                                    zi50Var = zi50.f44426a;
                                    break;
                                }
                                IndexedValue indexedValue = (IndexedValue) iilVar.next();
                                zi50VarC = C((String) indexedValue.b, (String) CollectionsKt.W(indexedValue.f46061a, listI1));
                                zi50Var = zi50.b;
                            } while (zi50VarC != zi50Var);
                        } else {
                            zi50Var = zi50.f44426a;
                            break;
                        }
                    } else {
                        zi50Var = zi50.f44426a;
                    }
                    boolean z2 = z == ((l.longValue() > 1L ? 1 : (l.longValue() == 1L ? 0 : -1)) == 0);
                    if (z2) {
                        Double d = bj50Var.k;
                        Double d2 = bj50Var2.k;
                        double dDoubleValue = d2 != null ? d2.doubleValue() : 0.0d;
                        if (d != null) {
                            double dDoubleValue2 = d.doubleValue();
                            if (dDoubleValue2 < dDoubleValue) {
                                zi50Var2 = zi50.c;
                            } else {
                                zi50Var2 = dDoubleValue2 > dDoubleValue ? zi50.b : zi50.f44426a;
                            }
                        } else {
                            zi50Var2 = zi50.f44426a;
                        }
                    } else {
                        zi50Var2 = zi50.f44426a;
                    }
                    if (z2) {
                        Long l2 = bj50Var.l;
                        Long l3 = bj50Var2.l;
                        zi50VarB = B(l2, l3 != null ? l3.longValue() : 0L);
                    } else {
                        zi50VarB = zi50.f44426a;
                    }
                    zi50 zi50Var3 = zi50.b;
                    return (zi50Var == zi50Var3 || zi50Var2 == zi50Var3 || zi50VarB == zi50Var3) ? zi50Var3 : zi50.f44426a;
                }
            }
        }
        return zi50.f44426a;
    }

    public static void E(bnk0 bnk0Var, String str, int i, int i2, int i3, int i4, int i5) {
        int i6 = (i5 & 4) != 0 ? -1 : i;
        int i7 = (i5 & 8) != 0 ? -1 : i2;
        int i8 = (i5 & 16) != 0 ? -1 : i3;
        int i9 = (i5 & 32) != 0 ? -1 : i4;
        bnk0Var.getClass();
        str.getClass();
        bnk0Var.f2888a.add(new zmk0(str, i6, -1.0f, i7, i8, i9));
    }

    public static final zi50 F(bj50 bj50Var, bj50 bj50Var2) {
        Long l;
        if (O(bj50Var, bj50Var2)) {
            return B(bj50Var.d, (bj50Var2 == null || (l = bj50Var2.d) == null) ? 0L : l.longValue());
        }
        return zi50.f44426a;
    }

    public static final zi50 G(bj50 bj50Var, bj50 bj50Var2) {
        Long l;
        if (O(bj50Var, bj50Var2)) {
            return B(bj50Var.e, (bj50Var2 == null || (l = bj50Var2.e) == null) ? 0L : l.longValue());
        }
        return zi50.f44426a;
    }

    public static final gbn H(Function1 function1) {
        return new gbn(new t4c0((byte) 23), new o5c0(3, (byte) 10), new rpa0(function1, (byte) 25), x4c0.m);
    }

    public static final w0g0 I(v5l0 v5l0Var) {
        cll0 cll0Var;
        v5l0Var.getClass();
        int iOrdinal = v5l0Var.ordinal();
        if (iOrdinal == 0) {
            cll0Var = xkl0.f41033a;
        } else if (iOrdinal == 1) {
            cll0Var = bll0.f2800a;
        } else if (iOrdinal == 2) {
            cll0Var = all0.f1074a;
        } else if (iOrdinal == 3) {
            cll0Var = zkl0.f44539a;
        } else {
            if (iOrdinal != 4) {
                t9f.b();
                return null;
            }
            cll0Var = ykl0.f42796a;
        }
        return new w0g0(cll0Var);
    }

    public static final xsf0 J(a9q0 a9q0Var, int i) {
        z8q0 z8q0Var = a9q0Var.f491a;
        bw40 bw40Var = a9q0Var.b;
        if (z8q0Var.f43981a.b.length() != 0) {
            int iD = bw40Var.d(i);
            if ((i != 0 && iD == bw40Var.d(i - 1)) || (i != z8q0Var.f43981a.b.length() && iD == bw40Var.d(i + 1))) {
                return a9q0Var.a(i);
            }
        }
        return a9q0Var.j(i);
    }

    public static final int K(mch0 mch0Var) {
        Iterator<E> it = mch0Var.b.iterator();
        if (!it.hasNext()) {
            itt0.a();
            return 0;
        }
        int iAbs = Math.abs(((nch0) it.next()).f23294a);
        while (it.hasNext()) {
            int iAbs2 = Math.abs(((nch0) it.next()).f23294a);
            if (iAbs < iAbs2) {
                iAbs = iAbs2;
            }
        }
        return kpb.Z(iAbs);
    }

    public static boolean L() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Blu")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Blu")) {
                return false;
            }
        }
        return "studio x10".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean M() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Itel")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Itel")) {
                return false;
            }
        }
        return "itel w6004".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean N() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Positivo")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Positivo")) {
                return false;
            }
        }
        return "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    public static final boolean O(bj50 bj50Var, bj50 bj50Var2) {
        return bj50Var2 != null && bj50Var.b && bj50Var2.b && bj50Var.f2689a == bj50Var2.f2689a;
    }

    public static boolean P() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Vivo")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Vivo")) {
                return false;
            }
        }
        return "vivo 1805".equalsIgnoreCase(Build.MODEL);
    }

    public static void Q(dfn0 dfn0Var, int i, rbe rbeVar) {
        long j = dfn0Var.j(i);
        List listE = dfn0Var.e(j);
        if (listE.isEmpty()) {
            return;
        }
        if (i == dfn0Var.l() - 1) {
            v4i0.e();
            return;
        }
        long j2 = dfn0Var.j(i + 1) - dfn0Var.j(i);
        if (j2 > 0) {
            rbeVar.accept(new ftf(j, j2, listE));
        }
    }

    public static final String[] R(Metadata metadata) {
        String[] strArrD1 = metadata.d1();
        if (strArrD1.length == 0) {
            strArrD1 = null;
        }
        if (strArrD1 != null) {
            return strArrD1;
        }
        throw new w4x("Metadata is missing: kotlin.Metadata.data1 must not be an empty array", null);
    }

    public static final f3w S(nc10 nc10Var, ctf0 ctf0Var, String str, boolean z) {
        ctf0Var.getClass();
        rc10 rc10Var = nc10Var.c;
        String strA = ctf0Var.b.a(T(rc10Var, z), Arrays.copyOf(new Object[0], 0));
        pn40 pn40Var = pn40.f27267a;
        return new f3w("", strA, pn40.c(nc10Var.f, p3u0.c), str, rc10Var == rc10.b ? e3w.b : e3w.f7156a);
    }

    public static final int T(rc10 rc10Var, boolean z) {
        Integer numValueOf;
        if (rc10Var == rc10.b) {
            numValueOf = z ? Integer.valueOf(R.string.history_your_win_new) : null;
            return numValueOf != null ? numValueOf.intValue() : R.string.history_your_win;
        }
        numValueOf = z ? Integer.valueOf(R.string.history_bet_rate) : null;
        return numValueOf != null ? numValueOf.intValue() : R.string.bet;
    }

    public static final x680 U(nc10 nc10Var, ctf0 ctf0Var, String str, boolean z) {
        long textPrimary;
        ctf0Var.getClass();
        rc10 rc10Var = nc10Var.c;
        String strA = ctf0Var.b.a(T(rc10Var, z), Arrays.copyOf(new Object[0], 0));
        pn40 pn40Var = pn40.f27267a;
        String strC = pn40.c(nc10Var.f, p3u0.c);
        if (rc10Var == rc10.b) {
            pz40 pz40Var = s6t0.f31722a;
            textPrimary = StaticColors.INSTANCE.m98getGreen0d7_KjU();
        } else {
            pz40 pz40Var2 = s6t0.f31722a;
            textPrimary = s6t0.b().f33626a.getTextPrimary();
        }
        return new x680("PAYOUT", strA, new wty(strC, str, textPrimary));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    public static void V(dfn0 dfn0Var, kfn0 kfn0Var, rbe rbeVar) {
        int iA;
        boolean z;
        long j = kfn0Var.b;
        if (j == -9223372036854775807L) {
            iA = 0;
        } else {
            iA = dfn0Var.a(j);
            if (iA == -1) {
                iA = dfn0Var.l();
            }
            if (iA > 0 && dfn0Var.j(iA - 1) == j) {
                iA--;
            }
        }
        if (j == -9223372036854775807L || iA >= dfn0Var.l()) {
            z = false;
        } else {
            List listE = dfn0Var.e(j);
            long j2 = dfn0Var.j(iA);
            if (listE.isEmpty()) {
                z = false;
            } else {
                long j3 = kfn0Var.b;
                if (j3 < j2) {
                    rbeVar.accept(new ftf(j3, j2 - j3, listE));
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        for (int i = iA; i < dfn0Var.l(); i++) {
            Q(dfn0Var, i, rbeVar);
        }
        if (kfn0Var.f18204a) {
            if (z) {
                iA--;
            }
            for (int i2 = 0; i2 < iA; i2++) {
                Q(dfn0Var, i2, rbeVar);
            }
            if (z) {
                rbeVar.accept(new ftf(dfn0Var.j(iA), j - dfn0Var.j(iA), dfn0Var.e(j)));
            }
        }
    }

    public static final sam W(szj0 szj0Var, boolean z, ctf0 ctf0Var) {
        String strA;
        oam oamVar;
        ctf0Var.getClass();
        if (!z || szj0Var == null) {
            return ram.f30142a;
        }
        rzj0 rzj0Var = szj0Var.e;
        if (rzj0Var.equals(pzj0.f27849a)) {
            strA = ctf0Var.b.a(R.string.cyber_game_screen_to_event_button_name, Arrays.copyOf(new Object[0], 0));
        } else {
            if (!rzj0Var.equals(qzj0.f29581a)) {
                t9f.b();
                return null;
            }
            strA = ctf0Var.b.a(R.string.game_screen_to_simulation_button_name, Arrays.copyOf(new Object[0], 0));
        }
        znq0 znq0Var = szj0Var.f;
        if (znq0Var != null) {
            long j = znq0Var.f44687a * 1000;
            lsm0 lsm0Var = ctf0Var.b;
            oamVar = new oam(j, lsm0Var.a(R.string.before_start, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.timer_days_short_v2, Arrays.copyOf(new Object[0], 0)));
        } else {
            oamVar = null;
        }
        int iOrdinal = szj0Var.b.ordinal();
        if (iOrdinal == 0) {
            return new pam(strA, oamVar);
        }
        if (iOrdinal == 1) {
            return new qam(strA, ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), oamVar);
        }
        t9f.b();
        return null;
    }

    public static final p070 X(m070 m070Var, String str) {
        m070Var.getClass();
        str.getClass();
        List list = m070Var.f20941a;
        if (list != null) {
            return new p070(vfc.S(str, list, m070Var.c), vfc.T(m070Var.b));
        }
        throw new bun();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v7, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.ArrayList] */
    public static final bvd0 Y(hvd0 hvd0Var, f5h f5hVar) {
        ivd0 ivd0Var;
        ivd0 ivd0Var2;
        myd0 myd0Var;
        ?? arrayList;
        ?? arrayList2;
        eyd0 eyd0Var;
        int iOrdinal;
        String str;
        ?? arrayList3;
        List list;
        List list2;
        z9h z9hVar;
        Long l;
        String str2;
        ?? arrayList4;
        List list3;
        List list4;
        z9h z9hVar2;
        Long l2;
        hvd0Var.getClass();
        f5hVar.getClass();
        h2g h2gVar = f5hVar.B;
        h2g h2gVar2 = f5hVar.A;
        qvd0 qvd0Var = hvd0Var.f13722a;
        long jLongValue = -1;
        if (qvd0Var != null) {
            long jLongValue2 = (h2gVar2 == null || (list4 = h2gVar2.c) == null || (z9hVar2 = (z9h) CollectionsKt.firstOrNull(list4)) == null || (l2 = z9hVar2.f44018a) == null) ? -1L : l2.longValue();
            if (h2gVar2 == null || (str2 = h2gVar2.f12331a) == null) {
                str2 = "";
            }
            if (h2gVar2 == null || (list3 = h2gVar2.c) == null) {
                arrayList4 = iun.f15405a;
            } else {
                arrayList4 = new ArrayList(r3d.q(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    String str3 = ((z9h) it.next()).c;
                    if (str3 == null) {
                        str3 = "";
                    }
                    arrayList4.add(str3);
                }
            }
            ivd0Var = q0x.T(qvd0Var, jLongValue2, str2, arrayList4);
        } else {
            iun iunVar = iun.f15405a;
            lun lunVar = lun.f20680a;
            lunVar.getClass();
            ivd0Var = new ivd0(-1L, "", iunVar, iunVar, -1, lunVar, lunVar, rvd0.c, iunVar);
        }
        qvd0 qvd0Var2 = hvd0Var.b;
        if (qvd0Var2 != null) {
            if (h2gVar != null && (list2 = h2gVar.c) != null && (z9hVar = (z9h) CollectionsKt.firstOrNull(list2)) != null && (l = z9hVar.f44018a) != null) {
                jLongValue = l.longValue();
            }
            if (h2gVar == null || (str = h2gVar.f12331a) == null) {
                str = "";
            }
            if (h2gVar == null || (list = h2gVar.c) == null) {
                arrayList3 = iun.f15405a;
            } else {
                arrayList3 = new ArrayList(r3d.q(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    String str4 = ((z9h) it2.next()).c;
                    if (str4 == null) {
                        str4 = "";
                    }
                    arrayList3.add(str4);
                }
            }
            ivd0Var2 = q0x.T(qvd0Var2, jLongValue, str, arrayList3);
        } else {
            iun iunVar2 = iun.f15405a;
            lun lunVar2 = lun.f20680a;
            lunVar2.getClass();
            ivd0Var2 = new ivd0(-1L, "", iunVar2, iunVar2, -1, lunVar2, lunVar2, rvd0.c, iunVar2);
        }
        pyd0 pyd0Var = hvd0Var.c;
        if (pyd0Var != null) {
            String str5 = pyd0Var.f27799a;
            if (str5 == null) {
                str5 = "";
            }
            List<lyd0> list5 = pyd0Var.b;
            if (list5 != null) {
                arrayList = new ArrayList(r3d.q(list5, 10));
                for (lyd0 lyd0Var : list5) {
                    String str6 = lyd0Var.f20857a;
                    if (str6 == null) {
                        str6 = "";
                    }
                    Integer num = lyd0Var.b;
                    int iIntValue = num != null ? num.intValue() : -1;
                    Integer num2 = lyd0Var.c;
                    arrayList.add(new iyd0(str6, iIntValue, num2 != null ? num2.intValue() : -1));
                }
            } else {
                arrayList = 0;
            }
            if (arrayList == 0) {
                arrayList = iun.f15405a;
            }
            List<dyd0> list6 = pyd0Var.c;
            if (list6 != null) {
                arrayList2 = new ArrayList(r3d.q(list6, 10));
                for (dyd0 dyd0Var : list6) {
                    dyd0Var.getClass();
                    String str7 = dyd0Var.f6886a;
                    if (str7 == null) {
                        str7 = "";
                    }
                    Integer num3 = dyd0Var.b;
                    int iIntValue2 = num3 != null ? num3.intValue() : -1;
                    Integer num4 = dyd0Var.c;
                    int iIntValue3 = num4 != null ? num4.intValue() : -1;
                    gyd0 gyd0Var = dyd0Var.d;
                    if (gyd0Var == null || (iOrdinal = gyd0Var.ordinal()) == 0) {
                        eyd0Var = eyd0.f8623a;
                    } else if (iOrdinal == 1) {
                        eyd0Var = eyd0.b;
                    } else if (iOrdinal == 2) {
                        eyd0Var = eyd0.c;
                    } else {
                        if (iOrdinal != 3) {
                            t9f.b();
                            return null;
                        }
                        eyd0Var = eyd0.d;
                    }
                    Integer num5 = dyd0Var.e;
                    arrayList2.add(new ayd0(str7, iIntValue2, iIntValue3, eyd0Var, num5 != null ? num5.intValue() : -1));
                }
            } else {
                arrayList2 = iun.f15405a;
            }
            myd0Var = new myd0(str5, arrayList, arrayList2);
        } else {
            iun iunVar3 = iun.f15405a;
            myd0Var = new myd0("", iunVar3, iunVar3);
        }
        return new bvd0(ivd0Var, ivd0Var2, myd0Var);
    }

    public static final v0g0 Z(icg icgVar, q0s q0sVar, v5l0 v5l0Var, ctf0 ctf0Var) {
        m1g0 l1g0Var;
        j1g0 i1g0Var;
        icgVar.getClass();
        String str = icgVar.c;
        long j = icgVar.g;
        heg hegVar = icgVar.i;
        heg hegVar2 = icgVar.j;
        long j2 = icgVar.f14535a;
        ctf0Var.getClass();
        int iOrdinal = v5l0Var.ordinal();
        if (iOrdinal == 0) {
            jwm jwmVarH = xww.H(icgVar, q0sVar, ctf0Var);
            jwm jwmVarK = xww.K(icgVar, q0sVar, ctf0Var);
            jwm jwmVarJ = xww.J(icgVar, q0sVar);
            String str2 = hegVar2.f12922a;
            int length = str2.length();
            String str3 = hegVar.f12922a;
            return new q0g0(j2, length == 0 ? new y0g0(str3, jwmVarH, jwmVarK) : new z0g0(qxw.D(str3, hegVar.b), qxw.D(str2, hegVar2.b), o1g0.b(j, str), jwmVarH, jwmVarK, jwmVarJ));
        }
        if (iOrdinal == 1) {
            jwm jwmVarH2 = xww.H(icgVar, q0sVar, ctf0Var);
            String str4 = hegVar.f12922a;
            jwm jwmVarK2 = xww.K(icgVar, q0sVar, ctf0Var);
            jwm jwmVarJ2 = xww.J(icgVar, q0sVar);
            String str5 = hegVar2.f12922a;
            if (str5.length() == 0) {
                l1g0Var = new k1g0(str4, jwmVarH2, jwmVarK2);
            } else {
                Pair pairC = o1g0.c(j, str);
                l1g0Var = new l1g0(new vzm(str4, (String) pairC.f46059a), new vzm(str5, (String) pairC.b), jwmVarH2, jwmVarK2, jwmVarJ2);
            }
            return new u0g0(j2, l1g0Var);
        }
        if (iOrdinal == 2) {
            jwm jwmVarH3 = xww.H(icgVar, q0sVar, ctf0Var);
            String str6 = hegVar.f12922a;
            jwm jwmVarK3 = xww.K(icgVar, q0sVar, ctf0Var);
            jwm jwmVarJ3 = xww.J(icgVar, q0sVar);
            String str7 = hegVar2.f12922a;
            if (str7.length() == 0) {
                i1g0Var = new h1g0(str6, jwmVarH3.f17257a, jwmVarK3);
            } else {
                Pair pairC2 = o1g0.c(j, str);
                i1g0Var = new i1g0(azw.N(hegVar.b, str6, (String) pairC2.f46059a), azw.N(hegVar2.b, str7, (String) pairC2.b), ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), jwmVarH3, jwmVarK3, jwmVarJ3);
            }
            return new t0g0(j2, i1g0Var);
        }
        if (iOrdinal == 3) {
            jwm jwmVarH4 = xww.H(icgVar, q0sVar, ctf0Var);
            jwm jwmVarK4 = xww.K(icgVar, q0sVar, ctf0Var);
            jwm jwmVarJ4 = xww.J(icgVar, q0sVar);
            String str8 = hegVar2.f12922a;
            int length2 = str8.length();
            String str9 = hegVar.f12922a;
            return new s0g0(j2, length2 == 0 ? new e1g0(str9, jwmVarH4, jwmVarK4) : new f1g0(yyw.I(str9, hegVar.b), yyw.I(str8, hegVar2.b), o1g0.a(j, str), jwmVarH4, jwmVarK4, jwmVarJ4));
        }
        if (iOrdinal != 4) {
            t9f.b();
            return null;
        }
        jwm jwmVarH5 = xww.H(icgVar, q0sVar, ctf0Var);
        jwm jwmVarK5 = xww.K(icgVar, q0sVar, ctf0Var);
        jwm jwmVarJ5 = xww.J(icgVar, q0sVar);
        String str10 = hegVar2.f12922a;
        int length3 = str10.length();
        String str11 = hegVar.f12922a;
        return new r0g0(j2, length3 == 0 ? new b1g0(str11, jwmVarH5.f17257a, jwmVarK5) : new c1g0(piz.E(str11, hegVar.b), piz.E(str10, hegVar2.b), o1g0.a(j, str), jwmVarH5.f17257a, jwmVarK5, jwmVarJ5));
    }

    public static final void a(mm40 mm40Var, fqj0 fqj0Var, fet fetVar, int i) {
        int i2;
        mm40Var.getClass();
        fqj0Var.getClass();
        fetVar.g0(-1623539932);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(fqj0Var) ? 32 : 16;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
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
            yfe0VarU.d = new gc30(mm40Var, fqj0Var, i, b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static final wog0 a0(epg0 epg0Var) {
        ?? arrayList;
        ?? arrayList2;
        opg0 opg0Var;
        epg0Var.getClass();
        List list = epg0Var.f8188a;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(b0((apg0) it.next()));
            }
        } else {
            arrayList = iun.f15405a;
        }
        List list2 = epg0Var.b;
        if (list2 != null) {
            arrayList2 = new ArrayList(r3d.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(b0((apg0) it2.next()));
            }
        } else {
            arrayList2 = iun.f15405a;
        }
        List list3 = epg0Var.c;
        if (list3 == null) {
            list3 = iun.f15405a;
        }
        Integer num = epg0Var.d;
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue == 1) {
                opg0Var = opg0.f25641a;
            } else if (iIntValue != 2) {
                opg0Var = iIntValue != 3 ? opg0.d : opg0.c;
            } else {
                opg0Var = opg0.b;
            }
        } else {
            opg0Var = opg0.d;
        }
        return new wog0(arrayList, arrayList2, list3, opg0Var);
    }

    public static final void b(fqj0 fqj0Var, fet fetVar, int i) {
        fetVar.g0(-521254720);
        int i2 = (fetVar.g(fqj0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.N(jm40.b, 8.0f, 12.0f, 0.0f, 0.0f, 12), 108.0f), 32.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0Var));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new on7((byte) 12, i, fqj0Var);
        }
    }

    public static final xog0 b0(apg0 apg0Var) {
        Integer num = apg0Var.f1251a;
        int iIntValue = num != null ? num.intValue() : -1;
        Integer num2 = apg0Var.b;
        int iIntValue2 = num2 != null ? num2.intValue() : -1;
        Integer num3 = apg0Var.c;
        return new xog0(iIntValue, iIntValue2, num3 != null ? num3.intValue() : -1);
    }

    public static final void c(fqj0 fqj0Var, fet fetVar, int i) {
        fqj0Var.getClass();
        fetVar.g0(863476311);
        int i2 = (fetVar.g(fqj0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.N(jm40.b, 8.0f, 16.0f, 8.0f, 0.0f, 8), 1.0f), 46.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0Var));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new on7((byte) 8, i, fqj0Var);
        }
    }

    public static final wcp0 c0(Pair pair, String str, List list) {
        Object obj = pair.b;
        Object obj2 = pair.f46059a;
        str.getClass();
        list.getClass();
        if (str.length() > 0) {
            String str2 = (String) CollectionsKt.firstOrNull(list);
            if (str2 == null) {
                str2 = "";
            }
            c5a0 c5a0Var = new c5a0(new c280(vsm0.s(((Number) obj2).longValue(), str2), R.drawable.ic_glyph_placeholder_player));
            String str3 = (String) CollectionsKt.W(1, list);
            return new ocp0(c5a0Var, new c5a0(new c280(vsm0.s(((Number) obj).longValue(), str3 != null ? str3 : ""), R.drawable.ic_glyph_placeholder_player)), str);
        }
        String str4 = (String) CollectionsKt.firstOrNull(list);
        if (str4 == null) {
            str4 = "";
        }
        c5a0 c5a0Var2 = new c5a0(new c280(vsm0.s(((Number) obj2).longValue(), str4), R.drawable.ic_glyph_placeholder_player));
        String str5 = (String) CollectionsKt.W(1, list);
        return new ucp0(c5a0Var2, new c5a0(new c280(vsm0.s(((Number) obj).longValue(), str5 != null ? str5 : ""), R.drawable.ic_glyph_placeholder_player)));
    }

    public static final void d(fqj0 fqj0Var, fet fetVar, int i) {
        fqj0Var.getClass();
        fetVar.g0(1307101743);
        int i2 = (fetVar.g(fqj0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            float f = qmk.a(fetVar).d;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK = s5x0.K(jm40Var, f, 12.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
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
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 4.0f, 0.0f, 0.0f, 13);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            int i3 = (i2 << 3) & 112;
            a(jm40Var, fqj0Var, fetVar, i3 | 6);
            a(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), fqj0Var, fetVar, i3);
            fetVar.r(true);
            int i4 = i2 & 14;
            c(fqj0Var, fetVar, i4);
            c(fqj0Var, fetVar, i4);
            c(fqj0Var, fetVar, i4);
            c(fqj0Var, fetVar, i4);
            o(fqj0Var, fetVar, i4);
            c(fqj0Var, fetVar, i4);
            c(fqj0Var, fetVar, i4);
            c(fqj0Var, fetVar, i4);
            c(fqj0Var, fetVar, i4);
            o(fqj0Var, fetVar, i4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new on7((byte) 7, i, fqj0Var);
        }
    }

    public static final long d0(rc10 rc10Var) {
        int iOrdinal = rc10Var.ordinal();
        if (iOrdinal == 0) {
            pz40 pz40Var = s6t0.f31722a;
            return s6t0.b().f33626a.getPrimary();
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            pz40 pz40Var2 = s6t0.f31722a;
            return StaticColors.INSTANCE.m98getGreen0d7_KjU();
        }
        t9f.b();
        return 0L;
    }

    public static final void e(int i, fet fetVar, e900 e900Var, boolean z) {
        int i2;
        byte b;
        fetVar.g0(2077739945);
        if ((i & 6) == 0) {
            i2 = (fetVar.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(e900Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK = s5x0.K(o7k0.d(o7k0.e(jm40Var, 60.0f), 1.0f), 12.0f, 10.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
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
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarN = o7k0.n(jm40Var, 40.0f);
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, i120.P(mm40VarN, e900Var, ugg0Var, 4));
            mm40 mm40VarP = i120.P(o7k0.p(s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14), z ? 128.0f : 96.0f, 16.0f), e900Var, ugg0Var, 4);
            yx7 yx7Var = gqw0.k;
            zq8.a(0, fetVar, mm40VarP.e(new ecu0(yx7Var)));
            mm40 mm40VarL = twn.l(yx7Var, o7k0.d(jm40Var, 1.0f));
            x5d x5dVarA = w5d.a(uc9.e, gqw0.o, fetVar, 54);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarL);
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
            zq8.a(0, fetVar, i120.P(o7k0.p(jm40Var, 64.0f, 16.0f), e900Var, ugg0Var, 4));
            zq8.a(0, fetVar, i120.P(o7k0.p(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 48.0f, 8.0f), e900Var, ugg0Var, 4));
            b = 1;
            fetVar.r(true);
            fetVar.r(true);
        } else {
            b = 1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dcd(z, e900Var, i, b);
        }
    }

    public static final int e0(rc10 rc10Var) {
        int iOrdinal = rc10Var.ordinal();
        if (iOrdinal == 0) {
            return R.string.accepted;
        }
        if (iOrdinal == 1) {
            return R.string.paid;
        }
        if (iOrdinal == 2) {
            return R.string.return1;
        }
        t9f.b();
        return 0;
    }

    public static final void f(mch0 mch0Var, float f, fet fetVar, int i) {
        fetVar.g0(-2017450785);
        int i2 = (fetVar.g(mch0Var) ? 4 : 2) | i | (fetVar.d(f) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            float fI = q3d.i(mch0Var.b) * 32.0f;
            boolean z = ycl.a(f, fI) < 0;
            Pair pair = z ? new Pair(new ycl(fI), new ycl(32.0f)) : new Pair(new ycl(f), new ycl(f / q3d.i(mch0Var.b)));
            float f2 = ((ycl) pair.f46059a).f42389a;
            float f3 = ((ycl) pair.b).f42389a;
            g9q0 g9q0VarN = pym0.n(fetVar);
            mm40 mm40VarS = o7k0.s(o7k0.e(s5x0.N(jm40.b, 8.0f, 8.0f, z ? 16.0f : 0.0f, 0.0f, 8), 224.0f), f2);
            boolean zD = fetVar.d(f3) | ((i2 & 14) == 4) | fetVar.g(g9q0VarN);
            Object objP = fetVar.P();
            if (zD || objP == ukd.f35823a) {
                objP = new ny2((Object) mch0Var, f3, (Object) g9q0VarN, (byte) 13);
                fetVar.o0(objP);
            }
            qxw.o(fetVar, rq8.L(mm40VarS, (Function1) objP));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rx7((byte) 7, f, i, mch0Var);
        }
    }

    public static final void g(mm40 mm40Var, ygx ygxVar, xdr xdrVar, fet fetVar, int i) {
        int i2;
        xdrVar.getClass();
        fetVar.g0(255804091);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(ygxVar) : fetVar.i(ygxVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(xdrVar) ? 256 : 128;
        }
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarQ = i120.Q(o7k0.d(mm40Var, 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarI = s5x0.I(mm40VarQ, new lh80(qmk.a(fetVar).c, 8.0f, qmk.a(fetVar).c, ygxVar.e ? 0.0f : 8.0f));
            boolean z2 = (i2 & 896) == 256;
            int i3 = i2 & 112;
            if (i3 == 32 || ((i2 & 64) != 0 && fetVar.i(ygxVar))) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new vgx(xdrVar, ygxVar, (byte) 6);
                fetVar.o0(objP);
            }
            yyw.i(mm40VarI, ygxVar, (Function0) objP, u1c.M(-1007842457, new wgx(ygxVar, (byte) 12), fetVar), u1c.M(792044864, new wgx(ygxVar, (byte) 13), fetVar), u1c.M(-272922367, new wgx(ygxVar, (byte) 14), fetVar), u1c.M(-1337889598, new wgx(ygxVar, (byte) 15), fetVar), fetVar, i3 | 1797120);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xgx(mm40Var, ygxVar, xdrVar, i, (byte) 3);
        }
    }

    public static final void h(int i, fet fetVar, mm40 mm40Var, String str) {
        fet fetVar2 = fetVar;
        String str2 = str;
        str2.getClass();
        fetVar2.g0(-911747805);
        int i2 = i | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            long jM78getBlack800d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m78getBlack800d7_KjU();
            zcl zclVar = qmk.d;
            ugg0 ugg0Var = vgg0.f37379a;
            v8q0.a(str, s5x0.K(i120.Q(mm40VarD, jM78getBlack800d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar)), 8.0f, 4.0f), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2, (i2 >> 3) & 14, 24960, 109560);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ndp(mm40Var, str2, i, (byte) 12);
        }
    }

    public static final void i(k3t0 k3t0Var, fet fetVar, int i) {
        k3t0Var.getClass();
        fetVar.g0(2139781402);
        int i2 = (fetVar.g(k3t0Var) ? 4 : 2) | i;
        byte b = 0;
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            int i3 = i2 & 14;
            i3t0 i3t0Var = (i3t0) k3t0Var;
            pz40 pz40VarY = i3t0Var.y(fetVar);
            f9m0 f9m0Var = new f9m0(R.string.statistic, fmm.f9790a, 0L, false, false, null, null, false, 252);
            zdm0 zdm0VarC = ((drd0) pz40VarY.getValue()).c();
            j9m0 j9m0VarB = ((drd0) pz40VarY.getValue()).b();
            boolean zA = ((drd0) pz40VarY.getValue()).a();
            boolean z = i3 == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new dbh(i3t0Var, (byte) 9);
                fetVar.o0(objP);
            }
            ffb0.D(jm40.b, f9m0Var, zdm0VarC, j9m0VarB, zA, (Function0) objP, null, null, u1c.M(-1531484504, new fg00(pz40VarY, i3t0Var, b), fetVar), fetVar, 100663302, 192);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xcr(k3t0Var, i, b2);
        }
    }

    public static final void j(mm40 mm40Var, boolean z, long j, fet fetVar) {
        l7m0 l7m0VarB = d43.b(z ? 180.0f : 0.0f, ro4.m0(150, 0, ihn.f14788a, 2), null, null, fetVar, 0, 28);
        boolean zG = fetVar.g(l7m0VarB);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = new ufp(l7m0VarB, (byte) 17);
            fetVar.o0(objP);
        }
        dww.c(a8k0.F(R.drawable.ic_glyph_chevron_down_small, 0, fetVar), null, rq8.M(mm40Var, (Function1) objP), j, fetVar, 56, 0);
    }

    public static final void k(mm40 mm40Var, i740 i740Var, Function0 function0, Function0 function1, Function1 function2, fet fetVar, int i) {
        jm40 jm40Var;
        byte b;
        fet fetVar2 = fetVar;
        i740Var.getClass();
        int i2 = i740Var.f;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        fetVar2.g0(1299404980);
        int i3 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(i740Var) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024) | (fetVar2.i(function2) ? 16384 : 8192);
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            Context context = (Context) fetVar2.k(dy2.b);
            boolean zE = fetVar2.e(i2);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zE || objP == cl5Var) {
                rdj rdjVar = rdj.f30294a;
                objP = rdj.g(new znq0(i2), efj.UNIVERSAL, Boolean.valueOf(DateFormat.is24HourFormat(context)), false, 56);
                fetVar2.o0(objP);
            }
            String str = (String) objP;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarD);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(mm40VarE, backgroundContent, ljcVar);
            byte b2 = 0;
            mm40 mm40VarE0 = o2e.e0(s5x0.J(y860.Z(mm40VarQ, null, false, function1, function0, 444), 16.0f), "MESSAGE_ITEM");
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
            jm40 jm40Var2 = jm40.b;
            v8q0.a(str, o2e.e0(jm40Var2, "MESSAGE_ITEM_DATE"), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, 48, 0, 131064);
            v8q0.a(i740Var.c, o2e.e0(s5x0.N(jm40Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13), "MESSAGE_ITEM_TITLE"), ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.u(), fetVar, 0, 0, 131064);
            v8q0.b(i740Var.d, o2e.e0(s5x0.N(jm40Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13), "MESSAGE_ITEM_DESCRIPTION"), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, g1t0.n(), fetVar, 0, 0, 262136);
            fetVar2 = fetVar;
            String str2 = i740Var.e;
            if (str2 == null || str2.length() == 0) {
                fetVar2.e0(1677017668);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1675722240);
                pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_picture, 0, fetVar2);
                m78 m78Var = new m78(((ThemeColors) fetVar2.k(zfnVar)).getSecondary20(), 5);
                Object objP2 = fetVar2.P();
                if (objP2 == cl5Var) {
                    b = 2;
                    objP2 = new o240(b);
                    fetVar2.o0(objP2);
                } else {
                    b = 2;
                }
                oil oilVarT = ju70.T(pm80VarF, m78Var, (Function2) objP2, b);
                k7x.b(i740Var.e, null, i120.Q(lgb.J(ny9.O(1.7777778f, o7k0.d(s5x0.N(jm40Var2, 0.0f, 12.0f, 0.0f, 0.0f, 13), 1.0f), false), vgg0.a(10.0f)), ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), ljcVar), oilVarT, oilVarT, null, null, null, null, null, gqw0.A, null, fetVar, 36912, 6, 31712);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            wul wulVar = i740Var.i;
            if (wulVar == null) {
                fetVar2.e0(1677063857);
                fetVar2.r(false);
                jm40Var = jm40Var2;
            } else {
                fetVar2.e0(1677063858);
                jm40Var = jm40Var2;
                qzb.n(o7k0.d(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f), wulVar, function0, fetVar2, i3 & 896, 0);
                fetVar2.r(false);
            }
            wul wulVar2 = i740Var.j;
            if (wulVar2 == null) {
                fetVar2.e0(1677381018);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1677381019);
                mm40 mm40VarD2 = o7k0.d(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f);
                boolean z = ((57344 & i3) == 16384) | ((i3 & 112) == 32);
                Object objP3 = fetVar2.P();
                if (z || objP3 == cl5Var) {
                    objP3 = new a540(i740Var, function2, b2);
                    fetVar2.o0(objP3);
                }
                qzb.n(mm40VarD2, wulVar2, (Function0) objP3, fetVar2, 0, 0);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ajw((Object) mm40Var, (Object) i740Var, (Object) function0, (Object) function1, function2, i, (byte) 9);
        }
    }

    public static final void l(mm40 mm40Var, rd80 rd80Var, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        rd80Var.getClass();
        fetVar2.g0(-120040153);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(rd80Var) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40Var, 0.0f, 8.0f, 1);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
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
            k7x.b(rd80Var.b, null, o7k0.n(jm40.b, 20.0f), a8k0.F(R.drawable.no_photo_placeholder_toto_header, 0, fetVar2), a8k0.F(R.drawable.no_photo_placeholder_toto_header, 0, fetVar2), null, null, null, null, null, gqw0.A, null, fetVar2, 36912, 6, 31712);
            v8q0.a(rd80Var.f30279a, s5x0.N(new x7z(1.0f, true), 8.0f, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0.a(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0, 24960, 110588);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o680((Object) mm40Var, (Object) rd80Var, i, (byte) 2);
        }
    }

    public static final void m(lga0 lga0Var, fet fetVar, int i) {
        boolean z;
        jm40 jm40Var;
        fet fetVar2 = fetVar;
        lga0Var.getClass();
        fetVar2.g0(-1945102715);
        int i2 = i | (fetVar2.g(lga0Var) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarE0 = o2e.e0(o7k0.s(jm40Var2, 36.0f), "PLAYER_LEVEL_ABILITIES_COLUMN");
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
            jm40 jm40Var3 = jm40Var2;
            v8q0.a(lga0Var.f19999a, o2e.e0(new wkw(gqw0.n), "PLAYER_LEVEL_ABILITIES_TITLE_TEXT"), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.e0(-1143494354);
            for (wy90 wy90Var : lga0Var.b) {
                if (wy90Var != null) {
                    if (wy90Var instanceof ty90) {
                        fetVar2.e0(774177070);
                        j0x.h(((ty90) wy90Var).f34742a, fetVar2, 0);
                        fetVar2.r(false);
                    } else {
                        z = false;
                        if (wy90Var instanceof uy90) {
                            fetVar2.e0(774179899);
                            d9x.q(0, fetVar2);
                            fetVar2.r(false);
                        } else {
                            if (wy90Var instanceof vy90) {
                                fetVar2.e0(774182159);
                                wdx.t(((vy90) wy90Var).f38237a, fetVar2, 0);
                                fetVar2.r(false);
                            } else if (wy90Var instanceof sy90) {
                                fetVar2.e0(774185066);
                                zcl zclVar2 = qmk.f28987a;
                                jm40Var = jm40Var3;
                                rz4.t(jm40Var, 44.0f, fetVar2, false);
                            }
                            jm40Var3 = jm40Var;
                        }
                    }
                    jm40Var = jm40Var3;
                    jm40Var3 = jm40Var;
                } else {
                    z = false;
                }
                throw b1j.f(774175191, fetVar2, z);
            }
            fetVar2.r(false);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cz90(lga0Var, i, (byte) 14);
        }
    }

    public static final void n(mm40 mm40Var, ArrayList arrayList, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        function1.getClass();
        fetVar.g0(-994709371);
        int i2 = i | 6 | (fetVar.g(arrayList) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, 16.0f, 0.0f, 16.0f, 5);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new td8(arrayList, function1, (byte) 4);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarD, null, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, 0, 506);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cue0(mm40Var2, arrayList, function1, i, (byte) 1);
        }
    }

    public static final void o(fqj0 fqj0Var, fet fetVar, int i) {
        fqj0Var.getClass();
        fetVar.g0(-1051490092);
        int i2 = (fetVar.g(fqj0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.N(jm40.b, 0.0f, 24.0f, 0.0f, 8.0f, 5), 152.0f), 12.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0Var));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new on7((byte) 9, i, fqj0Var);
        }
    }

    public static final void p(mch0 mch0Var, qdz qdzVar, fet fetVar, int i) {
        yfe0 yfe0VarU;
        kch0 kch0Var;
        mch0Var.getClass();
        qdzVar.getClass();
        fetVar.g0(218030668);
        byte b = 2;
        int i2 = (fetVar.g(mch0Var) ? 4 : 2) | i | (fetVar.g(qdzVar) ? 32 : 16);
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (mch0Var.b.size() < 2) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    kch0Var = new kch0(mch0Var, qdzVar, i, b2);
                }
            } else {
                rah0 rah0VarC = qdzVar.c(mch0Var.f21552a, new x0h0((byte) 10), fetVar, (i2 << 3) & 896);
                zcl zclVar = qmk.f28987a;
                obc.d(bmd.n.a(k6z.f17794a), u1c.M(161150348, new j5d0(rah0VarC, mch0Var, (byte) 25), fetVar), fetVar, 56);
            }
            yfe0VarU.d = kch0Var;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            kch0Var = new kch0(mch0Var, qdzVar, i, b);
            yfe0VarU.d = kch0Var;
        }
    }

    public static final void q(mm40 mm40Var, e900 e900Var, fet fetVar, int i) {
        fetVar.g0(1910637622);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(e900Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            zcl zclVar = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40Var, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar));
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
            int i3 = (i2 & 112) | 6;
            e(i3, fetVar, e900Var, true);
            long backgroundContent2 = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            rcb.p(0, fetVar, s5x0.N(i120.Q(jm40Var, backgroundContent2, ljcVar), 64.0f, 0.0f, 0.0f, 0.0f, 14));
            e(i3, fetVar, e900Var, false);
            rcb.p(0, fetVar, s5x0.N(i120.Q(jm40Var, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), ljcVar), 64.0f, 0.0f, 0.0f, 0.0f, 14));
            e(i3, fetVar, e900Var, true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kqh0((Object) mm40Var, (Object) e900Var, i, (byte) 22);
        }
    }

    public static final void r(long j, fqj0 fqj0Var, fet fetVar, int i) {
        fetVar.g0(-118422302);
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
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 94.0f), 16.0f);
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0Var));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(s5x0.N(jm40Var, 16.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f), 16.0f)), fqj0Var, fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yxh(j, fqj0Var, i, (byte) 1);
        }
    }

    public static final void s(mm40 mm40Var, fqj0 fqj0Var, fet fetVar, int i) {
        int i2;
        mm40Var.getClass();
        fqj0Var.getClass();
        fetVar.g0(-384170204);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(fqj0Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(mm40Var, 60.0f), 32.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0Var));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gc30(mm40Var, fqj0Var, i, b);
        }
    }

    public static final void t(fqj0 fqj0Var, fet fetVar, int i) {
        fqj0Var.getClass();
        fetVar.g0(1665901463);
        int i2 = (fetVar.g(fqj0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.N(jm40.b, 0.0f, 16.0f, 0.0f, 0.0f, 13), 46.0f), 24.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0Var));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new on7((byte) 10, i, fqj0Var);
        }
    }

    public static final void u(fqj0 fqj0Var, boolean z, fet fetVar, int i) {
        fqj0Var.getClass();
        fetVar.g0(326755571);
        int i2 = (fetVar.g(fqj0Var) ? 4 : 2) | i;
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.N(jm40Var, 8.0f, 16.0f, 8.0f, 0.0f, 8), 40.0f), !z ? 12.0f : 0.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0Var));
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.s(s5x0.N(jm40Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), 46.0f), 24.0f)), fqj0Var));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.s(s5x0.N(jm40Var, 8.0f, 16.0f, 8.0f, 0.0f, 8), 40.0f), z ? 12.0f : 0.0f)), fqj0Var, fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gd30(fqj0Var, z, i, b);
        }
    }

    public static final void v(fqj0 fqj0Var, fet fetVar, int i) {
        fqj0Var.getClass();
        fetVar.g0(342308004);
        int i2 = (fetVar.g(fqj0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            float f = qmk.a(fetVar).d;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK = s5x0.K(jm40Var, f, 12.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
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
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 4.0f, 0.0f, 0.0f, 13);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            int i3 = (i2 << 3) & 112;
            s(jm40Var, fqj0Var, fetVar, i3 | 6);
            s(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), fqj0Var, fetVar, i3);
            s(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), fqj0Var, fetVar, i3);
            s(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), fqj0Var, fetVar, i3);
            s(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), fqj0Var, fetVar, i3);
            fetVar.r(true);
            int i4 = i2 & 14;
            t(fqj0Var, fetVar, i4);
            int i5 = i4 | 48;
            u(fqj0Var, true, fetVar, i5);
            u(fqj0Var, true, fetVar, i5);
            u(fqj0Var, false, fetVar, i5);
            u(fqj0Var, true, fetVar, i5);
            u(fqj0Var, true, fetVar, i5);
            t(fqj0Var, fetVar, i4);
            u(fqj0Var, false, fetVar, i5);
            u(fqj0Var, false, fetVar, i5);
            u(fqj0Var, false, fetVar, i5);
            t(fqj0Var, fetVar, i4);
            u(fqj0Var, true, fetVar, i5);
            u(fqj0Var, true, fetVar, i5);
            u(fqj0Var, false, fetVar, i5);
            u(fqj0Var, true, fetVar, i5);
            u(fqj0Var, true, fetVar, i5);
            t(fqj0Var, fetVar, i4);
            u(fqj0Var, false, fetVar, i5);
            u(fqj0Var, false, fetVar, i5);
            u(fqj0Var, false, fetVar, i5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new on7((byte) 6, i, fqj0Var);
        }
    }

    public static final void w(mm40 mm40Var, o9l0 o9l0Var, fet fetVar) {
        zcl zclVar = qmk.f28987a;
        thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
        jpm0.o(fetVar, thg0VarA, gqw0.x);
        jpm0.o(fetVar, bh90VarM, gqw0.w);
        jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
        jpm0.n(fetVar);
        jpm0.o(fetVar, mm40VarC0, gqw0.v);
        j6n.h(o9l0Var.f24885a, kro0.f18776a, o7k0.e(jm40.b, 16.0f), 0, 0, fetVar, 48, 24);
        v8q0.a(o9l0Var.b, null, ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 0, 24960, 110586);
        fetVar.r(true);
    }

    public static final void x(mm40 mm40Var, mch0 mch0Var, fet fetVar, int i) {
        int i2;
        boolean z;
        boolean z2;
        fet fetVar2 = fetVar;
        fetVar2.g0(8452860);
        int i3 = 4;
        int i4 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(mch0Var) ? 32 : 16);
        boolean z3 = false;
        boolean z4 = true;
        if (fetVar2.U(i4 & 1, (i4 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.N(mm40Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), 48.0f), 228.0f);
            x5d x5dVarA = w5d.a(uc9.g, gqw0.m, fetVar2, 6);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            int iK = K(mch0Var);
            int i5 = iK * 4;
            fetVar2.e0(-728417301);
            int i6 = 0;
            while (i6 < 9) {
                jm40 jm40Var = jm40.b;
                if (i6 != i3) {
                    fetVar2.e0(617321894);
                    String strValueOf = String.valueOf(Math.abs((i6 * iK) - i5));
                    long jM130getWhite600d7_KjU = StaticColors.INSTANCE.m130getWhite600d7_KjU();
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    boolean z5 = z3;
                    i2 = i3;
                    z2 = z4;
                    fet fetVar3 = fetVar2;
                    v8q0.a(strValueOf, s5x0.N(mm40VarD, 16.0f, 0.0f, 0.0f, 0.0f, 14), jM130getWhite600d7_KjU, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), fetVar3, 0, 24960, 109560);
                    fetVar2 = fetVar3;
                    fetVar2.r(z5);
                    z = z5;
                } else {
                    i2 = i3;
                    z = z3;
                    z2 = z4;
                    fetVar2.e0(617810981);
                    zcl zclVar3 = qmk.f28987a;
                    rz4.t(jm40Var, 12.0f, fetVar2, z);
                }
                i6++;
                z4 = z2;
                z3 = z;
                i3 = i2;
                iK = iK;
            }
            fetVar2.r(z3);
            fetVar2.r(z4);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j5d0(mm40Var, mch0Var, i, (byte) 26);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:51:0x0103  */
    public static final void y(lc00 lc00Var, eqb0 eqb0Var, m9s m9sVar, ctf0 ctf0Var) {
        dqb0 cqb0Var;
        String strValueOf;
        String str;
        char c;
        int i;
        int i2;
        m9sVar.getClass();
        ctf0Var.getClass();
        long j = m9sVar.A;
        upb0 upb0Var = j == 2721879 ? upb0.f36057a : j == 2669842 ? upb0.b : upb0.c;
        int iOrdinal = upb0Var.ordinal();
        boolean z = true;
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                return;
            }
            t9f.b();
            return;
        }
        uen uenVar = wen.b;
        long jE = wen.e(ibc.w0(eqb0Var.b, bfn.SECONDS));
        boolean z2 = eqb0Var.c;
        boolean z3 = false;
        lsm0 lsm0Var = ctf0Var.b;
        lc00Var.add(new vqb0(lsm0Var.a(R.string.bet_before_higher_vs_lower_game_start, Arrays.copyOf(new Object[0], 0)), jE, z2));
        List<lqb0> list = eqb0Var.f8230a;
        boolean z4 = upb0Var == upb0.f36057a;
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayListQ0 = CollectionsKt.q0(m9sVar.m, m9sVar.n);
        wpb0 wpb0Var = new wpb0(R.dimen.size_32);
        lc00 lc00VarB = kotlin.collections.a.b();
        lc00VarB.add(new iqb0(new aqb0(R.drawable.ic_power_of_power, R.dimen.size_16)));
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        int i3 = 0;
        while (i3 < size) {
            String str2 = (String) CollectionsKt.W(i3, arrayListQ0);
            if (str2 == null) {
                str2 = "";
            }
            if (kotlin.text.c.x(str2, ujn.h, z3)) {
                str = str2;
            } else {
                if (str2.length() != 0) {
                    List list2 = u0d.f34849a;
                    if (!u0d.c(str2)) {
                        String str3 = StringsKt.O(str2, "playerlogo/", z) ? "%s/%s" : "%s/playerlogo/%s";
                        Locale locale = Locale.ENGLISH;
                        Object[] objArr = {ujn.h, str2};
                        c = 2;
                        str = String.format(locale, str3, Arrays.copyOf(objArr, 2));
                    }
                    if (z4) {
                        i = R.dimen.space_2;
                    } else {
                        i = R.dimen.space_4;
                    }
                    if (z4) {
                        i2 = R.color.static_black_40;
                    } else if (i3 < 3) {
                        i2 = R.color.cyber_synthetic_power_of_power_first_team_border_color;
                    } else {
                        i2 = R.color.cyber_synthetic_power_of_power_second_team_border_color;
                    }
                    arrayList.add(new iqb0(new bqb0(str, i, i2)));
                    i3++;
                    z = true;
                    z3 = false;
                }
                str = "";
            }
            c = 2;
            if (z4) {
                i = R.dimen.space_2;
            } else {
                i = R.dimen.space_4;
            }
            if (z4) {
                i2 = R.color.static_black_40;
            } else if (i3 < 3) {
                i2 = R.color.cyber_synthetic_power_of_power_first_team_border_color;
            } else {
                i2 = R.color.cyber_synthetic_power_of_power_second_team_border_color;
            }
            arrayList.add(new iqb0(new bqb0(str, i, i2)));
            i3++;
            z = true;
            z3 = false;
        }
        lc00VarB.addAll(arrayList);
        jqb0 jqb0Var = new jqb0(wpb0Var, kotlin.collections.a.a(lc00VarB), new qpb0(z4 ? R.dimen.space_8 : R.dimen.space_0));
        c0o<vpb0> c0oVar = vpb0.d;
        ArrayList arrayList2 = new ArrayList(r3d.q(c0oVar, 10));
        for (vpb0 vpb0Var : c0oVar) {
            vpb0 vpb0Var2 = vpb0.HERO_NAME;
            ypb0 wpb0Var2 = vpb0Var == vpb0Var2 ? new wpb0(R.dimen.size_144) : xpb0.f41261a;
            lc00 lc00VarB2 = kotlin.collections.a.b();
            lc00VarB2.add(new iqb0(new cqb0(lsm0Var.a(vpb0Var.f37797a, Arrays.copyOf(new Object[0], 0)), vpb0Var == vpb0Var2 ? zpb0.f44753a : zpb0.b)));
            ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
            for (lqb0 lqb0Var : list) {
                switch (vpb0Var.ordinal()) {
                    case 0:
                        cqb0Var = new cqb0(lqb0Var.d, zpb0.f44753a);
                        break;
                    case 1:
                        int i4 = lqb0Var.e;
                        Integer numValueOf = Integer.valueOf(i4);
                        if (i4 == 0) {
                            numValueOf = null;
                        }
                        if (numValueOf == null || (strValueOf = String.valueOf(numValueOf.intValue())) == null) {
                            strValueOf = "-";
                        }
                        cqb0Var = new cqb0(strValueOf, zpb0.b);
                        break;
                    case 2:
                        cqb0Var = new aqb0(lqb0Var.f20480a ? R.drawable.circle_red : R.drawable.circle_green, R.dimen.size_10);
                        break;
                    case 3:
                        cqb0Var = new cqb0(String.valueOf(lqb0Var.c), zpb0.b);
                        break;
                    case 4:
                        cqb0Var = new cqb0(String.valueOf(lqb0Var.b), zpb0.b);
                        break;
                    case 5:
                        cqb0Var = new cqb0(lqb0Var.h, zpb0.b);
                        break;
                    case 6:
                        cqb0Var = new cqb0(String.valueOf(lqb0Var.f), zpb0.b);
                        break;
                    case 7:
                        cqb0Var = new cqb0(String.valueOf(lqb0Var.g), zpb0.b);
                        break;
                    default:
                        t9f.b();
                        return;
                }
                arrayList3.add(new iqb0(cqb0Var));
            }
            lc00VarB2.addAll(arrayList3);
            arrayList2.add(new jqb0(wpb0Var2, kotlin.collections.a.a(lc00VarB2), new qpb0(z4 ? R.dimen.space_8 : R.dimen.space_0)));
        }
        lc00Var.add(new pqb0(jqb0Var, arrayList2));
    }

    public static final cd90 z(Integer num, Integer num2, LinkedHashMap linkedHashMap, Integer num3) {
        Collection collection = (List) linkedHashMap.get(1);
        if (collection == null) {
            collection = iun.f15405a;
        }
        ArrayList arrayListN0 = CollectionsKt.N0(collection);
        Collection collection2 = (List) linkedHashMap.get(2);
        if (collection2 == null) {
            collection2 = iun.f15405a;
        }
        ArrayList arrayListN1 = CollectionsKt.N0(collection2);
        if (arrayListN0.size() < 5) {
            int size = 5 - arrayListN0.size();
            for (int i = 0; i < size; i++) {
                arrayListN0.add(new qc90(false));
            }
        }
        if (arrayListN1.size() < 5) {
            int size2 = 5 - arrayListN1.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayListN1.add(new qc90(false));
            }
        }
        if (num3 != null && num3.intValue() == 1) {
            Iterator it = arrayListN0.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                }
                if (((sc90) it.next()) instanceof qc90) {
                    break;
                }
                i3++;
            }
            if (i3 == -1) {
                arrayListN0.add(new qc90(true));
            } else {
                arrayListN0.remove(i3);
                arrayListN0.add(i3, new qc90(true));
            }
        } else if (num3 != null && num3.intValue() == 2) {
            Iterator it2 = arrayListN1.iterator();
            int i4 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i4 = -1;
                    break;
                }
                if (((sc90) it2.next()) instanceof qc90) {
                    break;
                }
                i4++;
            }
            if (i4 == -1) {
                arrayListN1.add(new qc90(true));
            } else {
                arrayListN1.remove(i4);
                arrayListN1.add(i4, new qc90(true));
            }
        }
        if (arrayListN0.size() < arrayListN1.size()) {
            int size3 = arrayListN1.size() - arrayListN0.size();
            for (int i5 = 0; i5 < size3; i5++) {
                arrayListN0.add(new qc90(false));
            }
        }
        if (arrayListN1.size() < arrayListN0.size()) {
            int size4 = arrayListN0.size() - arrayListN1.size();
            for (int i6 = 0; i6 < size4; i6++) {
                arrayListN1.add(new qc90(false));
            }
        }
        return new cd90(num != null ? num.intValue() : 0, num2 != null ? num2.intValue() : 0, arrayListN0, arrayListN1);
    }
}
