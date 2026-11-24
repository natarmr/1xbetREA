package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.BidiFormatter;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.tournament_bracket.domain.model.CyberTournamentBracketMatchStatusModel;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class thb {
    public static final String A(l2g0 l2g0Var, ctf0 ctf0Var) {
        l2g0Var.getClass();
        ctf0Var.getClass();
        long millis = TimeUnit.SECONDS.toMillis(l2g0Var.s);
        rdj rdjVar = rdj.f30294a;
        boolean zH = ctf0Var.h();
        return rdj.g(new ynq0(millis), efj.UNIVERSAL, Boolean.valueOf(zH), true, 32);
    }

    public static final String B(d0t d0tVar, dmr dmrVar) {
        Object next;
        Iterator it = d0tVar.p.n.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((cmr) next).f4620a != dmrVar);
        cmr cmrVar = (cmr) next;
        String str = cmrVar != null ? cmrVar.b : null;
        return str == null ? "" : str;
    }

    public static final String C(z0w z0wVar, ctf0 ctf0Var, Map map) {
        String str;
        ctf0Var.getClass();
        long j = z0wVar.t;
        ril0 ril0Var = (ril0) map.get(Long.valueOf(j));
        if (ril0Var == null || (str = ril0Var.b) == null) {
            str = z0wVar.u;
        }
        String strConcat = str.concat(". ");
        if (str.length() <= 0) {
            strConcat = null;
        }
        if (strConcat == null) {
            strConcat = "";
        }
        return j == 95 ? ctf0Var.b.a(R.string.betconstructor, Arrays.copyOf(new Object[0], 0)) : strConcat.concat(z0wVar.b);
    }

    public static final String D(kzv kzvVar, ctf0 ctf0Var, Map map) {
        String str;
        ctf0Var.getClass();
        map.getClass();
        z0w z0wVar = (z0w) CollectionsKt.U(kzvVar.Y);
        long j = kzvVar.h;
        ril0 ril0Var = (ril0) map.get(Long.valueOf(j));
        if (ril0Var == null || (str = ril0Var.b) == null) {
            str = z0wVar.u;
        }
        int length = z0wVar.p.length();
        String strL = z0wVar.m;
        if (length > 0) {
            strL = kng0.l(strL, " - ", z0wVar.p);
        }
        String strConcat = str.concat(". ");
        if (str.length() <= 0) {
            strConcat = null;
        }
        if (strConcat == null) {
            strConcat = "";
        }
        return j == 95 ? kng0.l(ctf0Var.b.a(R.string.betconstructor, Arrays.copyOf(new Object[0], 0)), ". ", strL) : ua80.i(strConcat, kzvVar.A, ". ", strL);
    }

    public static final String E(l2g0 l2g0Var) {
        l2g0Var.getClass();
        List listP = xkb.P();
        if (listP == null || !listP.isEmpty()) {
            Iterator it = listP.iterator();
            while (it.hasNext()) {
                if (((yxg) it.next()).b == l2g0Var.c) {
                    t480 t480VarH = H(l2g0Var);
                    return sj3.j0(t480VarH != null ? t480VarH.f33307a : null, "");
                }
            }
        }
        t480 t480VarH2 = H(l2g0Var);
        return sj3.j0(t480VarH2 != null ? t480VarH2.f33307a : null, "0");
    }

    public static final int F(int i, boolean z) {
        if (i == 4) {
            return z ? R.drawable.dota_pre_pick_placeholder : R.drawable.dota_pre_ban_placeholder;
        }
        if (i != 5) {
            return (i == 7 || i == 8 || i == 9 || i == 12) ? R.drawable.dota_pre_pick_placeholder : R.drawable.dota_pre_ban_placeholder;
        }
        return z ? R.drawable.dota_pre_ban_placeholder : R.drawable.dota_pre_pick_placeholder;
    }

    public static final t480 H(l2g0 l2g0Var) {
        String strR;
        String string;
        String string2;
        String value;
        long j = l2g0Var.c;
        String str = l2g0Var.p;
        List listP = xkb.P();
        ArrayList arrayList = new ArrayList(r3d.q(listP, 10));
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((yxg) it.next()).b));
        }
        if (j == 66 || j == 99) {
            strR = kotlin.text.c.r(str, "-", Separators.COLON, false);
        } else if (arrayList.contains(Long.valueOf(j))) {
            bh30 bh30VarB = new Regex("(\\d+\\s*[:-]\\s*\\d+)").b(str);
            if (bh30VarB == null || (value = bh30VarB.getValue()) == null) {
                value = Separators.COLON;
            }
            strR = kotlin.text.c.r(value, "-", Separators.COLON, false);
        } else {
            bh30 bh30VarB2 = new Regex("(\\d+\\s*[:-]\\s*\\d+)").b(str);
            if (bh30VarB2 == null || (strR = bh30VarB2.getValue()) == null) {
                strR = Separators.COLON;
            }
        }
        List listSplit$default = StringsKt__StringsKt.split$default(strR, new String[]{Separators.COLON}, false, 0, 6, null);
        String str2 = (String) CollectionsKt.W(0, listSplit$default);
        if (str2 == null || (string = StringsKt.u0(str2).toString()) == null || string.length() == 0) {
            string = null;
        }
        String str3 = (String) CollectionsKt.W(1, listSplit$default);
        if (str3 == null || (string2 = StringsKt.u0(str3).toString()) == null || string2.length() == 0) {
            string2 = null;
        }
        if (string == null || string2 == null) {
            return null;
        }
        return new t480(string, string2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    public static final Pair I(List list, boolean z) {
        Object b280Var;
        Object b280Var2;
        list.getClass();
        int i = R.drawable.ic_home;
        String str = "";
        if (z) {
            b280Var = new b280(i);
        } else {
            String str2 = (String) CollectionsKt.firstOrNull(list);
            if (str2 == null) {
                str2 = "";
            }
            if (!kotlin.text.c.x(str2, ujn.h, false)) {
                if (str2.length() == 0) {
                    str2 = "";
                } else {
                    List list2 = u0d.f34849a;
                    if (u0d.c(str2)) {
                        str2 = "";
                    } else {
                        str2 = String.format(Locale.ENGLISH, StringsKt.O(str2, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str2}, 2));
                    }
                }
            }
            b280Var = new c280(str2, R.drawable.no_photo_new);
        }
        if (z) {
            b280Var2 = new b280(i);
        } else {
            String str3 = (String) (1 < list.size() ? list.get(1) : "");
            str3.getClass();
            if (kotlin.text.c.x(str3, ujn.h, false)) {
                str = str3;
            } else if (str3.length() != 0) {
                List list3 = u0d.f34849a;
                if (!u0d.c(str3)) {
                    str = String.format(Locale.ENGLISH, StringsKt.O(str3, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str3}, 2));
                }
            }
            b280Var2 = new c280(str, R.drawable.no_photo_new);
        }
        return new Pair(b280Var, b280Var2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    public static final Pair J(List list, boolean z) {
        Object b280Var;
        Object b280Var2;
        list.getClass();
        int i = R.drawable.ic_away;
        String str = "";
        if (z) {
            b280Var = new b280(i);
        } else {
            String str2 = (String) CollectionsKt.firstOrNull(list);
            if (str2 == null) {
                str2 = "";
            }
            if (!kotlin.text.c.x(str2, ujn.h, false)) {
                if (str2.length() == 0) {
                    str2 = "";
                } else {
                    List list2 = u0d.f34849a;
                    if (u0d.c(str2)) {
                        str2 = "";
                    } else {
                        str2 = String.format(Locale.ENGLISH, StringsKt.O(str2, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str2}, 2));
                    }
                }
            }
            b280Var = new c280(str2, R.drawable.no_photo_new);
        }
        if (z) {
            b280Var2 = new b280(i);
        } else {
            String str3 = (String) (1 < list.size() ? list.get(1) : "");
            str3.getClass();
            if (kotlin.text.c.x(str3, ujn.h, false)) {
                str = str3;
            } else if (str3.length() != 0) {
                List list3 = u0d.f34849a;
                if (!u0d.c(str3)) {
                    str = String.format(Locale.ENGLISH, StringsKt.O(str3, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str3}, 2));
                }
            }
            b280Var2 = new c280(str, R.drawable.no_photo_new);
        }
        return new Pair(b280Var, b280Var2);
    }

    public static final String K(l2g0 l2g0Var) {
        l2g0Var.getClass();
        List listP = xkb.P();
        if (listP == null || !listP.isEmpty()) {
            Iterator it = listP.iterator();
            while (it.hasNext()) {
                if (((yxg) it.next()).b == l2g0Var.c) {
                    t480 t480VarH = H(l2g0Var);
                    return sj3.j0(t480VarH != null ? t480VarH.b : null, "");
                }
            }
        }
        t480 t480VarH2 = H(l2g0Var);
        return sj3.j0(t480VarH2 != null ? t480VarH2.b : null, "0");
    }

    public static final long L(ozh ozhVar) {
        Long lValueOf;
        if (ozhVar instanceof kzh) {
            lValueOf = Long.valueOf(((kzh) ozhVar).o);
        } else {
            lValueOf = ((ozhVar instanceof izh) || (ozhVar instanceof jzh)) ? null : 0L;
        }
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        return 0L;
    }

    public static final d280 M(List list, boolean z) {
        list.getClass();
        if (z) {
            return new b280(R.drawable.ic_home);
        }
        String str = (String) CollectionsKt.firstOrNull(list);
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (kotlin.text.c.x(str, ujn.h, false)) {
            str2 = str;
        } else if (str.length() != 0) {
            List list2 = u0d.f34849a;
            if (!u0d.c(str)) {
                str2 = String.format(Locale.ENGLISH, StringsKt.O(str, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str}, 2));
            }
        }
        return new c280(str2, R.drawable.no_photo_new);
    }

    public static final d280 N(List list, boolean z) {
        list.getClass();
        if (z) {
            return new b280(R.drawable.ic_away);
        }
        String str = (String) CollectionsKt.firstOrNull(list);
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (kotlin.text.c.x(str, ujn.h, false)) {
            str2 = str;
        } else if (str.length() != 0) {
            List list2 = u0d.f34849a;
            if (!u0d.c(str)) {
                str2 = String.format(Locale.ENGLISH, StringsKt.O(str, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str}, 2));
            }
        }
        return new c280(str2, R.drawable.no_photo_new);
    }

    public static final String O(l2g0 l2g0Var, List list, wcb wcbVar) {
        list.getClass();
        wcbVar.getClass();
        eel0 eel0Var = x1x.E(l2g0Var.c, l2g0Var.d, l2g0Var.w, list, wcbVar).f9413a;
        if (eel0Var instanceof ael0) {
            return ((ael0) eel0Var).f735a;
        }
        if (eel0Var instanceof cel0) {
            return ((cel0) eel0Var).f4219a;
        }
        t9f.b();
        return null;
    }

    public static final kzj0 P(wsy wsyVar) {
        wsyVar.getClass();
        tft0 tft0VarJ0 = wsyVar.j0();
        if (tft0VarJ0 instanceof kkq) {
            return ((kkq) tft0VarJ0).b;
        }
        if (tft0VarJ0 instanceof kzj0) {
            return (kzj0) tft0VarJ0;
        }
        t9f.b();
        return null;
    }

    public static final jge Q(jge jgeVar) {
        if (jgeVar instanceof yfe) {
            return new yfe(new ca8(((yfe) jgeVar).f42537a.a()));
        }
        if (jgeVar instanceof zfe) {
            return new zfe(new ca8(((zfe) jgeVar).f44298a.a()));
        }
        if (jgeVar instanceof age) {
            return new age(new ca8(((age) jgeVar).f819a.a()));
        }
        if (jgeVar instanceof bge) {
            return new bge(new ca8(((bge) jgeVar).f2550a.a()));
        }
        if (jgeVar instanceof cge) {
            return new cge(new ca8(((cge) jgeVar).f4307a.a()));
        }
        if (jgeVar instanceof dge) {
            return new dge(new ca8(((dge) jgeVar).f6037a.a()));
        }
        if (jgeVar instanceof ege) {
            return new ege(new ca8(((ege) jgeVar).f7760a.a()));
        }
        if (jgeVar instanceof fge) {
            return new fge(new ca8(((fge) jgeVar).f9487a.a()));
        }
        if (jgeVar instanceof gge) {
            return new gge(new ca8(((gge) jgeVar).f11249a.a()));
        }
        if (jgeVar instanceof hge) {
            return new hge(new ca8(((hge) jgeVar).f13014a.a()));
        }
        if (jgeVar instanceof ige) {
            return new ige(new ca8(((ige) jgeVar).f14731a.a()));
        }
        t9f.b();
        return null;
    }

    public static final a4x R(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            scp scpVar = (scp) it.next();
            arrayList.add(new iem(scpVar.f31998a, scpVar.b));
        }
        return dyb.o0(arrayList);
    }

    public static final lc00 S(gm7 gm7Var, boolean z) {
        lc00 lc00VarB = kotlin.collections.a.b();
        lc00VarB.add(q4f.c);
        lc00VarB.add(q4f.d);
        if (gm7Var.f11529a) {
            lc00VarB.add(q4f.e);
        }
        if (gm7Var.d) {
            lc00VarB.add(q4f.f);
        }
        if (gm7Var.f) {
            lc00VarB.add(q4f.g);
        }
        if (gm7Var.e) {
            lc00VarB.add(q4f.h);
        }
        if (gm7Var.c) {
            lc00VarB.add(q4f.i);
        }
        if (gm7Var.p) {
            lc00VarB.add(q4f.j);
        }
        if (gm7Var.j) {
            lc00VarB.add(q4f.k);
        }
        if (gm7Var.s && z) {
            lc00VarB.add(q4f.l);
        }
        if (gm7Var.g) {
            lc00VarB.add(q4f.m);
        }
        lc00VarB.add(q4f.x);
        return kotlin.collections.a.a(lc00VarB);
    }

    public static final zjh T(hkh hkhVar) {
        CyberTournamentBracketMatchStatusModel cyberTournamentBracketMatchStatusModel;
        hkhVar.getClass();
        String str = hkhVar.f13208a;
        if (str == null) {
            str = "";
        }
        Long l = hkhVar.b;
        long jLongValue = l != null ? l.longValue() : -1L;
        Long l2 = hkhVar.c;
        long jLongValue2 = l2 != null ? l2.longValue() : -1L;
        mkh mkhVarU = U(hkhVar.d);
        mkh mkhVarU2 = U(hkhVar.e);
        String str2 = hkhVar.f;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = hkhVar.g;
        if (str3 == null) {
            str3 = "";
        }
        Integer num = hkhVar.h;
        if (num != null && num.intValue() == 0) {
            cyberTournamentBracketMatchStatusModel = CyberTournamentBracketMatchStatusModel.b;
        } else {
            cyberTournamentBracketMatchStatusModel = (num != null && num.intValue() == 1) ? CyberTournamentBracketMatchStatusModel.c : CyberTournamentBracketMatchStatusModel.d;
        }
        String str4 = hkhVar.i;
        String str5 = str4 != null ? str4 : "";
        Long l3 = hkhVar.j;
        return new zjh(str, jLongValue, jLongValue2, mkhVarU, mkhVarU2, str2, str3, cyberTournamentBracketMatchStatusModel, str5, l3 != null ? l3.longValue() : -1L);
    }

    public static final mkh U(pkh pkhVar) {
        Boolean bool;
        Integer num;
        Long l;
        long jLongValue = (pkhVar == null || (l = pkhVar.f27133a) == null) ? -1L : l.longValue();
        String str = pkhVar != null ? pkhVar.b : null;
        if (str == null) {
            str = "";
        }
        return new mkh((pkhVar == null || (num = pkhVar.d) == null) ? -1 : num.intValue(), jLongValue, str, lmc.E(pkhVar != null ? pkhVar.c : null), (pkhVar == null || (bool = pkhVar.e) == null) ? false : bool.booleanValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.util.ArrayList] */
    public static final esh V(hsh hshVar) {
        String strF;
        String strF2;
        ?? arrayList;
        ArrayList arrayList2;
        List list;
        hshVar.getClass();
        Long l = hshVar.f13582a;
        long jLongValue = l != null ? l.longValue() : 0L;
        String str = hshVar.b;
        String str2 = "";
        String str3 = str == null ? "" : str;
        Integer num = hshVar.c;
        int iIntValue = num != null ? num.intValue() : 0;
        String str4 = hshVar.d;
        String str5 = str4 == null ? "" : str4;
        String str6 = hshVar.e;
        String str7 = str6 == null ? "" : str6;
        Long l2 = hshVar.f;
        if (l2 != null) {
            long jLongValue2 = l2.longValue();
            rdj rdjVar = rdj.f30294a;
            strF = rdj.f(new znq0(jLongValue2), sdj.UNIVERSAL, null, 60);
        } else {
            strF = null;
        }
        String str8 = strF == null ? "" : strF;
        Long l3 = hshVar.g;
        if (l3 != null) {
            long jLongValue3 = l3.longValue();
            rdj rdjVar2 = rdj.f30294a;
            strF2 = rdj.f(new znq0(jLongValue3), sdj.UNIVERSAL, null, 60);
        } else {
            strF2 = null;
        }
        String str9 = strF2 == null ? "" : strF2;
        List list2 = hshVar.h;
        if (list2 != null) {
            arrayList = new ArrayList(r3d.q(list2, 10));
            for (Iterator it = list2.iterator(); it.hasNext(); it = it) {
                lsh lshVar = (lsh) it.next();
                String strE = lmc.E(lshVar.b);
                String str10 = lshVar.f20578a;
                if (str10 == null) {
                    str10 = "";
                }
                Long l4 = lshVar.c;
                arrayList.add(new ish(str10, strE, l4 != null ? l4.longValue() : 0L));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        List list3 = hshVar.i;
        if (list3 != null) {
            arrayList2 = new ArrayList(r3d.q(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                lsh lshVar2 = (lsh) it2.next();
                String strE2 = lmc.E(lshVar2.b);
                String str11 = lshVar2.f20578a;
                if (str11 == null) {
                    str11 = str2;
                }
                Long l5 = lshVar2.c;
                Iterator it3 = it2;
                arrayList2.add(new ish(str11, strE2, l5 != null ? l5.longValue() : 0L));
                str2 = str2;
                it2 = it3;
            }
        } else {
            arrayList2 = null;
        }
        String str12 = str2;
        List list4 = arrayList2;
        if (arrayList2 == null) {
            list4 = iun.f15405a;
        }
        List list5 = list4;
        List list6 = hshVar.j;
        if (list6 != null) {
            ArrayList arrayList3 = new ArrayList(r3d.q(list6, 10));
            Iterator it4 = list6.iterator();
            while (it4.hasNext()) {
                kdg kdgVar = (kdg) it4.next();
                kdgVar.getClass();
                String str13 = kdgVar.f18106a;
                if (str13 == null) {
                    str13 = str12;
                }
                Integer num2 = kdgVar.b;
                int iIntValue2 = num2 != null ? num2.intValue() : -1;
                odg odgVar = kdgVar.c;
                Iterator it5 = it4;
                String strE3 = lmc.E(odgVar != null ? odgVar.c : null);
                String str14 = odgVar != null ? odgVar.b : null;
                if (str14 == null) {
                    str14 = str12;
                }
                arrayList3.add(new hdg(str13, iIntValue2, new ldg(str14, strE3)));
                it4 = it5;
                jLongValue = jLongValue;
            }
            list = arrayList3;
        } else {
            list = null;
        }
        long j = jLongValue;
        if (list == null) {
            list = iun.f15405a;
        }
        return new esh(j, str3, iIntValue, str5, str7, str8, str9, arrayList, list5, list, Intrinsics.d(hshVar.k, Boolean.TRUE));
    }

    public static final ArrayList W(d0t d0tVar, dmr dmrVar, dmr dmrVar2) {
        List listD0;
        String strB = B(d0tVar, dmrVar);
        ArrayList arrayList = new ArrayList(strB.length());
        for (int i = 0; i < strB.length(); i++) {
            arrayList.add(Integer.valueOf(kotlin.text.a.a(strB.charAt(i))));
        }
        List listD1 = CollectionsKt.D0(arrayList, 5);
        if (listD1.size() == 5) {
            String strB2 = B(d0tVar, dmrVar2);
            ArrayList arrayList2 = new ArrayList(strB2.length());
            for (int i2 = 0; i2 < strB2.length(); i2++) {
                arrayList2.add(Integer.valueOf(kotlin.text.a.a(strB2.charAt(i2))));
            }
            listD0 = CollectionsKt.D0(arrayList2, 5);
        } else {
            listD0 = iun.f15405a;
        }
        ArrayList arrayList3 = new ArrayList(r3d.q(listD1, 10));
        int i3 = 0;
        for (Object obj : listD1) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                q3d.p();
                throw null;
            }
            int iIntValue = ((Number) obj).intValue();
            dmr dmrVar3 = dmr.r;
            int i5 = R.drawable.transparent;
            if (dmrVar == dmrVar3) {
                switch (iIntValue) {
                    case 1:
                        i5 = R.drawable.ic_dice_white_1;
                        break;
                    case 2:
                        i5 = R.drawable.ic_dice_white_2;
                        break;
                    case 3:
                        i5 = R.drawable.ic_dice_white_3;
                        break;
                    case 4:
                        i5 = R.drawable.ic_dice_white_4;
                        break;
                    case 5:
                        i5 = R.drawable.ic_dice_white_5;
                        break;
                    case 6:
                        i5 = R.drawable.ic_dice_white_6;
                        break;
                }
            } else {
                switch (iIntValue) {
                    case 1:
                        i5 = R.drawable.ic_dice_black_1;
                        break;
                    case 2:
                        i5 = R.drawable.ic_dice_black_2;
                        break;
                    case 3:
                        i5 = R.drawable.ic_dice_black_3;
                        break;
                    case 4:
                        i5 = R.drawable.ic_dice_black_4;
                        break;
                    case 5:
                        i5 = R.drawable.ic_dice_black_5;
                        break;
                    case 6:
                        i5 = R.drawable.ic_dice_black_6;
                        break;
                }
            }
            arrayList3.add(new llk(i5, (listD0.isEmpty() || listD0.contains(Integer.valueOf(i4))) ? false : true));
            i3 = i4;
        }
        return arrayList3;
    }

    public static final mvn X(w0w w0wVar) {
        switch (w0wVar.ordinal()) {
            case 0:
                return mvn.f22465a;
            case 1:
                return mvn.b;
            case 2:
                return mvn.c;
            case 3:
                return mvn.d;
            case 4:
                return mvn.e;
            case 5:
                return mvn.f;
            case 6:
                return mvn.g;
            case 7:
                return mvn.h;
            default:
                t9f.b();
                return null;
        }
    }

    public static final la30 Y(k4h k4hVar, m9s m9sVar) {
        k4hVar.getClass();
        m9sVar.getClass();
        yk5 yk5Var = mc6.b;
        qqs qqsVar = m9sVar.h;
        Integer numValueOf = Integer.valueOf(qqsVar.n);
        yk5Var.getClass();
        byte b = yk5.d(numValueOf).f21536a;
        int i = qqsVar.d;
        return new la30(b, znq0.f(k4hVar.f17669a.f26277a.m), "", qem0.l(b, i), qem0.l(b, i));
    }

    public static final kzj0 Z(wsy wsyVar) {
        wsyVar.getClass();
        tft0 tft0VarJ0 = wsyVar.j0();
        if (tft0VarJ0 instanceof kkq) {
            return ((kkq) tft0VarJ0).c;
        }
        if (tft0VarJ0 instanceof kzj0) {
            return (kzj0) tft0VarJ0;
        }
        t9f.b();
        return null;
    }

    public static final void a(final eq8 eq8Var, xpj0 xpj0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        final eq8 eq8Var2;
        xpj0 xpj0Var2;
        xpj0 xpj0VarF;
        int i3;
        function1.getClass();
        fetVar.g0(-1695143974);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(eq8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                xpj0VarF = dm40.f(fetVar);
                i3 = i2 & (-113);
            } else {
                fetVar.X();
                i3 = i2 & (-113);
                xpj0VarF = xpj0Var;
            }
            fetVar.s();
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            boolean z = (i3 & 896) == 256;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new dib(function1, (byte) 12);
                fetVar.o0(objP2);
            }
            eq8Var2 = eq8Var;
            xpj0 xpj0Var3 = xpj0VarF;
            ulb.i((Function0) objP2, null, false, null, null, xpj0Var3, null, u1c.M(-2088797700, new xdr() { // from class: a.uuc
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b3 = b;
                    eq8 eq8Var3 = eq8Var;
                    switch (b3) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((y5d) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                wwb.i(null, eq8Var3.f8224a, 0L, 0, 0L, fetVar2, 0, 29);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((y5d) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                zcl zclVar = qmk.f28987a;
                                kkb.m(s5x0.N(jm40.b, 0.0f, 12.0f, 0.0f, 16.0f, 5), eq8Var3.b, null, 0, 0L, 0L, fetVar3, 0, 60);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-1845260837, new x2g((Object) xpj0VarF, (Object) vneVar, (Object) function1, (Object) eq8Var, (byte) 10), fetVar), u1c.M(1867025645, new xdr() { // from class: a.uuc
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b3 = b2;
                    eq8 eq8Var3 = eq8Var2;
                    switch (b3) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((y5d) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                wwb.i(null, eq8Var3.f8224a, 0L, 0, 0L, fetVar2, 0, 29);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((y5d) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                zcl zclVar = qmk.f28987a;
                                kkb.m(s5x0.N(jm40.b, 0.0f, 12.0f, 0.0f, 16.0f, 5), eq8Var3.b, null, 0, 0L, 0L, fetVar3, 0, 60);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 905969664, 222);
            xpj0Var2 = xpj0Var3;
        } else {
            eq8Var2 = eq8Var;
            fetVar.X();
            xpj0Var2 = xpj0Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sa5((byte) 29, i, (Object) eq8Var2, (Object) xpj0Var2, function1);
        }
    }

    public static final void b(mm40 mm40Var, p3w p3wVar, Function1 function1, Function2 function2, fet fetVar, int i) {
        int i2;
        fetVar.g0(2084658741);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(p3wVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function2) ? 2048 : 1024;
        }
        int i3 = i2;
        byte b = 1;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            mm40 mm40VarE0 = o2e.e0(o7k0.d(mm40Var, 1.0f), "COMPACT_HISTORY_CARD_TEST_TAG");
            boolean zF = fetVar.f(backgroundContent);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zF || objP == cl5Var) {
                objP = new bx((byte) 26, backgroundContent);
                fetVar.o0(objP);
            }
            mm40 mm40VarK = rq8.K(mm40VarE0, (Function1) objP);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarK, 0.0f, 0.0f, 0.0f, 4.0f, 7);
            boolean z = ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new gbd(function1, p3wVar, b);
                fetVar.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarN, null, null, false, null, (Function0) objP2, 28);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
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
            sj3.c(s5x0.K(jm40Var, 12.0f, 4.0f), p3wVar, function1, fetVar, i3 & 1008);
            mbc.o(zfi0.f44303a, s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), false, fetVar, 6, 4);
            if (function2 == null) {
                fetVar.e0(-1368716114);
                fetVar.r(false);
            } else {
                fetVar.e0(-321246797);
                h97.q((i3 >> 9) & 14, fetVar, function2, false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dg0((Object) mm40Var, (Object) p3wVar, function1, (wdr) function2, i, (byte) 13);
        }
    }

    public static final void c(p3w p3wVar, Function1 function1, fet fetVar, int i) {
        int i2;
        ugd ugdVarM;
        function1.getClass();
        fetVar.g0(-1639918097);
        int i3 = i & 6;
        byte b = 2;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(p3wVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new gbd(function1, p3wVar, b2);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = y860.W(jm40Var, null, null, false, null, (Function0) objP, 28);
            if (p3wVar.g.isEmpty()) {
                fetVar.e0(456220887);
                fetVar.r(false);
                ugdVarM = null;
            } else {
                fetVar.e0(453722194);
                ugdVarM = u1c.M(225104441, new c61(p3wVar, b), fetVar);
                fetVar.r(false);
            }
            b(mm40VarW, p3wVar, function1, ugdVarM, fetVar, i2 & 1008);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zma(p3wVar, function1, i);
        }
    }

    public static final void d(int i, int i2, fet fetVar, mm40 mm40Var, List list) {
        list.getClass();
        fetVar.g0(664655874);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(list) ? 32 : 16) | (fetVar.e(i) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(6.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            Iterator itV = kng0.v(fetVar, mm40VarC0, gqw0.v, 1975151266, list);
            int i4 = 0;
            while (itV.hasNext()) {
                Object next = itV.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    q3d.p();
                    throw null;
                }
                e(null, ((hll) next).f, i4 == i, fetVar, 0);
                i4 = i5;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dll(mm40Var, list, i, i2);
        }
    }

    public static final void e(mm40 mm40Var, oll ollVar, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        long separator;
        fetVar.g0(-748232713);
        int i2 = i | 6 | (fetVar.g(ollVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            float f = z ? 8.0f : 4.0f;
            if (ollVar instanceof kll) {
                pz40 pz40Var = s6t0.f31722a;
                separator = s6t0.b().f33626a.getCommerce();
            } else if (ollVar instanceof lll) {
                if (((lll) ollVar).f20253a) {
                    pz40 pz40Var2 = s6t0.f31722a;
                    separator = s6t0.b().f33626a.getSecondary();
                } else {
                    pz40 pz40Var3 = s6t0.f31722a;
                    separator = s6t0.b().f33626a.getSecondary60();
                }
            } else if (ollVar.equals(mll.f21995a)) {
                pz40 pz40Var4 = s6t0.f31722a;
                separator = s6t0.b().f33626a.getCommerce();
            } else if (!ollVar.equals(nll.f23733a)) {
                t9f.b();
                return;
            } else {
                pz40 pz40Var5 = s6t0.f31722a;
                separator = s6t0.b().f33626a.getSeparator();
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 24.0f), f);
            boolean zF = fetVar.f(separator);
            Object objP = fetVar.P();
            if (zF || objP == ukd.f35823a) {
                objP = new nme((byte) 12, separator);
                fetVar.o0(objP);
            }
            p8a.k(mm40VarE, (Function1) objP, fetVar, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new igm((byte) 12, i, mm40Var2, (Object) ollVar, z);
        }
    }

    public static final void f(mm40 mm40Var, uf5 uf5Var, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        float f;
        mm40 mm40VarQ;
        boolean z;
        long jM123getWhite0d7_KjU;
        long jM98getGreen0d7_KjU;
        long backgroundContent;
        uf5Var.getClass();
        fetVar.g0(-975929495);
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
        if ((i & 48) == 0) {
            i3 |= fetVar.g(uf5Var) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            if (i4 != 0) {
                mm40Var2 = jm40Var;
            }
            boolean z2 = uf5Var instanceof sf5;
            if (z2) {
                zcl zclVar = qmk.f28987a;
                f = 10.0f;
            } else if (uf5Var instanceof nf5) {
                zcl zclVar2 = qmk.f28987a;
                f = 12.0f;
            } else if (!(uf5Var instanceof pf5) && !(uf5Var instanceof of5) && !(uf5Var instanceof tf5)) {
                t9f.b();
                return;
            } else {
                zcl zclVar3 = qmk.f28987a;
                f = 18.0f;
            }
            mm40 mm40VarN = o7k0.n(mm40Var2, f);
            if (uf5Var.b()) {
                fetVar.e0(-1281523524);
                y3d y3dVarA = uf5Var.a();
                if (y3dVarA == null) {
                    fetVar.e0(-1565356550);
                    backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1565357883);
                    fetVar.r(false);
                    backgroundContent = y3dVarA.f41946a;
                }
                mm40VarQ = i120.Q(jm40Var, backgroundContent, vgg0.f37379a);
                fetVar.r(false);
            } else {
                fetVar.e0(-1281303703);
                fetVar.r(false);
                mm40VarQ = jm40Var;
            }
            mm40 mm40VarE0 = o2e.e0(mm40VarN.e(mm40VarQ), "DS_BADGE");
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z3 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
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
            if (z2) {
                fetVar.e0(-1673855566);
                sf5 sf5Var = (sf5) uf5Var;
                if (sf5Var instanceof rf5) {
                    fetVar.e0(915839154);
                    jM98getGreen0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m113getRed0d7_KjU();
                    fetVar.r(false);
                } else {
                    if (!(sf5Var instanceof qf5)) {
                        throw b1j.f(915836705, fetVar, false);
                    }
                    fetVar.e0(915841492);
                    jM98getGreen0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m98getGreen0d7_KjU();
                    fetVar.r(false);
                }
                zq8.a(0, fetVar, i120.Q(o7k0.n(jm40Var, 6.0f), jM98getGreen0d7_KjU, vgg0.f37379a));
                fetVar.r(false);
            } else if (uf5Var instanceof nf5) {
                fetVar.e0(-1673407771);
                nf5 nf5Var = (nf5) uf5Var;
                if (nf5Var instanceof kf5) {
                    fetVar.e0(915853588);
                    jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m98getGreen0d7_KjU();
                    fetVar.r(false);
                } else if (nf5Var instanceof lf5) {
                    fetVar.e0(915855862);
                    jM123getWhite0d7_KjU = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                    fetVar.r(false);
                } else {
                    if (!(nf5Var instanceof mf5)) {
                        throw b1j.f(915851150, fetVar, false);
                    }
                    fetVar.e0(915858324);
                    jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                    fetVar.r(false);
                }
                zq8.a(0, fetVar, i120.Q(o7k0.n(jm40Var, 8.0f), jM123getWhite0d7_KjU, vgg0.f37379a));
                fetVar.r(false);
            } else {
                if (uf5Var instanceof pf5) {
                    fetVar.e0(-1672873269);
                    mm40 mm40VarN2 = o7k0.n(jm40Var, 14.0f);
                    zfn zfnVar = m8m0.f21378a;
                    mm40 mm40VarQ2 = i120.Q(mm40VarN2, ((StaticColors) fetVar.k(zfnVar)).m113getRed0d7_KjU(), vgg0.f37379a);
                    tj30 tj30VarC2 = zq8.c(zx7Var, false);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ2);
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
                    dww.c(a8k0.F(R.drawable.ic_glyph_popular, 0, fetVar), null, o2e.e0(o7k0.n(jm40Var, 10.0f), "TAG_BADGE_FIRE_ICON"), ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), fetVar, 56, 0);
                    fetVar.r(true);
                    fetVar.r(false);
                } else {
                    if (uf5Var instanceof of5) {
                        fetVar.e0(-1672135996);
                        mm40 mm40VarN3 = o7k0.n(jm40Var, 14.0f);
                        zfn zfnVar2 = m8m0.f21378a;
                        mm40 mm40VarQ3 = i120.Q(mm40VarN3, ((StaticColors) fetVar.k(zfnVar2)).m98getGreen0d7_KjU(), vgg0.f37379a);
                        tj30 tj30VarC3 = zq8.c(zx7Var, false);
                        int iHashCode3 = Long.hashCode(fetVar.T);
                        bh90 bh90VarM3 = fetVar.m();
                        mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarQ3);
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(pcyVar);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, tj30VarC3, shdVar);
                        jpm0.o(fetVar, bh90VarM3, shdVar2);
                        vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
                        jpm0.o(fetVar, mm40VarC2, shdVar4);
                        dww.c(a8k0.F(R.drawable.ic_glyph_new, 0, fetVar), null, o7k0.n(jm40Var, 10.0f), ((StaticColors) fetVar.k(zfnVar2)).m123getWhite0d7_KjU(), fetVar, 56, 0);
                        fetVar.r(true);
                        fetVar.r(false);
                    } else {
                        if (!(uf5Var instanceof tf5)) {
                            throw b1j.f(915836814, fetVar, false);
                        }
                        fetVar.e0(-1671475169);
                        dww.c(a8k0.F(((tf5) uf5Var).f33850a, 0, fetVar), null, o7k0.n(jm40Var, 14.0f), y3d.g, fetVar, 3128, 0);
                        fetVar.r(false);
                    }
                    z = true;
                }
                fetVar.r(z);
            }
            z = true;
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q02(mm40Var2, (Object) uf5Var, i, i2, (byte) 7);
        }
    }

    public static final void g(yhm yhmVar, bzl bzlVar, Function1 function1, fet fetVar, int i) {
        boolean z;
        bzl bzlVarZ = (i & 4) != 0 ? mbc.Z(fetVar) : bzlVar;
        boolean z2 = yhmVar instanceof vhm;
        if (z2) {
            z = ((vhm) yhmVar).e instanceof nlm;
        } else if (yhmVar instanceof whm) {
            whm whmVar = (whm) yhmVar;
            z = (whmVar.f instanceof nlm) || (whmVar.i instanceof nlm);
        } else if (yhmVar instanceof uhm) {
            z = ((uhm) yhmVar).f instanceof nlm;
        } else {
            if (!(yhmVar instanceof xhm)) {
                t9f.b();
                return;
            }
        }
        boolean zG = fetVar.g(function1);
        Object objP = fetVar.P();
        cl5 cl5Var = ukd.f35823a;
        if (zG || objP == cl5Var) {
            objP = new p3l(function1, (byte) 8);
            fetVar.o0(objP);
        }
        Function0 function0 = (Function0) objP;
        boolean zG2 = fetVar.g(function1);
        Object objP2 = fetVar.P();
        if (zG2 || objP2 == cl5Var) {
            objP2 = new p3l(function1, (byte) 13);
            fetVar.o0(objP2);
        }
        nkb.n(z, function0, (Function0) objP2, fetVar, 0, 0);
        byte b = 20;
        if (z2) {
            fetVar.e0(-1920711809);
            vhm vhmVar = (vhm) yhmVar;
            boolean zG3 = fetVar.g(function1);
            Object objP3 = fetVar.P();
            if (zG3 || objP3 == cl5Var) {
                objP3 = new p3l(function1, (byte) 14);
                fetVar.o0(objP3);
            }
            Function0 function2 = (Function0) objP3;
            boolean zG4 = fetVar.g(function1);
            Object objP4 = fetVar.P();
            if (zG4 || objP4 == cl5Var) {
                objP4 = new ynk(function1, b);
                fetVar.o0(objP4);
            }
            Function1 function3 = (Function1) objP4;
            boolean zG5 = fetVar.g(function1);
            Object objP5 = fetVar.P();
            if (zG5 || objP5 == cl5Var) {
                objP5 = new p3l(function1, (byte) 15);
                fetVar.o0(objP5);
            }
            Function0 function4 = (Function0) objP5;
            boolean zG6 = fetVar.g(function1);
            Object objP6 = fetVar.P();
            if (zG6 || objP6 == cl5Var) {
                objP6 = new ynk(function1, (byte) 22);
                fetVar.o0(objP6);
            }
            Function1 function5 = (Function1) objP6;
            boolean zG7 = fetVar.g(function1);
            Object objP7 = fetVar.P();
            if (zG7 || objP7 == cl5Var) {
                objP7 = new p3l(function1, (byte) 16);
                fetVar.o0(objP7);
            }
            ahb.h(vhmVar, function2, function3, function4, function5, (Function0) objP7, fetVar, 0);
            fetVar.r(false);
            return;
        }
        byte b2 = 21;
        if (yhmVar instanceof whm) {
            fetVar.e0(-1920020478);
            whm whmVar2 = (whm) yhmVar;
            boolean zG8 = fetVar.g(function1);
            Object objP8 = fetVar.P();
            if (zG8 || objP8 == cl5Var) {
                objP8 = new ynk(function1, (byte) 23);
                fetVar.o0(objP8);
            }
            Function1 function6 = (Function1) objP8;
            boolean zG9 = fetVar.g(function1);
            Object objP9 = fetVar.P();
            if (zG9 || objP9 == cl5Var) {
                objP9 = new p3l(function1, (byte) 7);
                fetVar.o0(objP9);
            }
            Function0 function7 = (Function0) objP9;
            boolean zG10 = fetVar.g(function1);
            Object objP10 = fetVar.P();
            if (zG10 || objP10 == cl5Var) {
                objP10 = new ynk(function1, b2);
                fetVar.o0(objP10);
            }
            Function1 function8 = (Function1) objP10;
            boolean zG11 = fetVar.g(function1);
            Object objP11 = fetVar.P();
            if (zG11 || objP11 == cl5Var) {
                objP11 = new p3l(function1, (byte) 17);
                fetVar.o0(objP11);
            }
            Function0 function9 = (Function0) objP11;
            boolean zG12 = fetVar.g(function1);
            Object objP12 = fetVar.P();
            if (zG12 || objP12 == cl5Var) {
                objP12 = new ynk(function1, (byte) 24);
                fetVar.o0(objP12);
            }
            Function1 function10 = (Function1) objP12;
            boolean zG13 = fetVar.g(function1);
            Object objP13 = fetVar.P();
            if (zG13 || objP13 == cl5Var) {
                objP13 = new p3l(function1, (byte) 18);
                fetVar.o0(objP13);
            }
            bkb.h(whmVar2, bzlVarZ, function6, function7, function8, function9, function10, (Function0) objP13, fetVar, 0);
            fetVar.r(false);
            return;
        }
        bzl bzlVar2 = bzlVarZ;
        if (!(yhmVar instanceof uhm)) {
            if (!(yhmVar instanceof xhm)) {
                throw b1j.f(492230588, fetVar, false);
            }
            fetVar.e0(492310407);
            xhm xhmVar = (xhm) yhmVar;
            boolean zG14 = fetVar.g(function1);
            Object objP14 = fetVar.P();
            if (zG14 || objP14 == cl5Var) {
                objP14 = new p3l(function1, (byte) 11);
                fetVar.o0(objP14);
            }
            Function0 function11 = (Function0) objP14;
            boolean zG15 = fetVar.g(function1);
            Object objP15 = fetVar.P();
            if (zG15 || objP15 == cl5Var) {
                objP15 = new p3l(function1, (byte) 12);
                fetVar.o0(objP15);
            }
            zjb.i(xhmVar, function11, (Function0) objP15, fetVar, 0);
            fetVar.r(false);
            return;
        }
        fetVar.e0(-1919201582);
        uhm uhmVar = (uhm) yhmVar;
        boolean zG16 = fetVar.g(function1);
        Object objP16 = fetVar.P();
        if (zG16 || objP16 == cl5Var) {
            objP16 = new ynk(function1, (byte) 25);
            fetVar.o0(objP16);
        }
        Function1 function12 = (Function1) objP16;
        boolean zG17 = fetVar.g(function1);
        Object objP17 = fetVar.P();
        byte b3 = 19;
        if (zG17 || objP17 == cl5Var) {
            objP17 = new p3l(function1, b3);
            fetVar.o0(objP17);
        }
        Function0 function13 = (Function0) objP17;
        boolean zG18 = fetVar.g(function1);
        Object objP18 = fetVar.P();
        if (zG18 || objP18 == cl5Var) {
            objP18 = new p3l(function1, b);
            fetVar.o0(objP18);
        }
        Function0 function14 = (Function0) objP18;
        boolean zG19 = fetVar.g(function1);
        Object objP19 = fetVar.P();
        if (zG19 || objP19 == cl5Var) {
            objP19 = new p3l(function1, b2);
            fetVar.o0(objP19);
        }
        Function0 function15 = (Function0) objP19;
        boolean zG20 = fetVar.g(function1);
        Object objP20 = fetVar.P();
        if (zG20 || objP20 == cl5Var) {
            objP20 = new ynk(function1, (byte) 26);
            fetVar.o0(objP20);
        }
        Function1 function16 = (Function1) objP20;
        boolean zG21 = fetVar.g(function1);
        Object objP21 = fetVar.P();
        if (zG21 || objP21 == cl5Var) {
            objP21 = new p3l(function1, (byte) 9);
            fetVar.o0(objP21);
        }
        Function0 function17 = (Function0) objP21;
        boolean zG22 = fetVar.g(function1);
        Object objP22 = fetVar.P();
        if (zG22 || objP22 == cl5Var) {
            objP22 = new ynk(function1, b3);
            fetVar.o0(objP22);
        }
        Function1 function18 = (Function1) objP22;
        boolean zG23 = fetVar.g(function1);
        Object objP23 = fetVar.P();
        if (zG23 || objP23 == cl5Var) {
            objP23 = new p3l(function1, (byte) 10);
            fetVar.o0(objP23);
        }
        lgb.k(uhmVar, bzlVar2, function12, function13, function14, function15, function16, function17, function18, (Function0) objP23, fetVar, 0);
        fetVar.r(false);
    }

    public static final void h(mm40 mm40Var, w56 w56Var, boolean z, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        Object obj;
        float f;
        ugd ugdVarM;
        w56Var.getClass();
        function1.getClass();
        fetVar.g0(187841847);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(w56Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            obj = function2;
            i2 |= fetVar.i(obj) ? 16384 : 8192;
        } else {
            obj = function2;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            if (w56Var instanceof r56) {
                zcl zclVar = qmk.f28987a;
                f = 16.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 20.0f;
            }
            boolean z2 = ((i2 & 7168) == 2048) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new gnm(function1, w56Var, (byte) 8);
                fetVar.o0(objP);
            }
            mm40 mm40VarE0 = o2e.e0(y860.W(mm40Var, null, null, false, null, (Function0) objP, 28), "SPORT_BASIC_EVENT_CARD_LIVE");
            if (w56Var instanceof t56) {
                fetVar.e0(-345155304);
                ugdVarM = u1c.M(-1480228464, new i3l(w56Var, (byte) 20), fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(-345037969);
                fetVar.r(false);
                ugdVarM = null;
            }
            a8k0.n(mm40VarE0, f, 0L, ugdVarM, u1c.M(555474166, new p5m(w56Var, function1, (byte) 25), fetVar), u1c.M(1821544951, new jv1((Object) w56Var, z, (byte) 11), fetVar), u1c.M(-1207351560, new i4a0((Object) w56Var, z, (Object) function1, obj, (byte) 20), fetVar), fetVar, 1794048, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mg((Object) mm40Var, (Object) w56Var, z, function1, (wdr) function2, i, (byte) 8);
        }
    }

    public static final void i(mm40 mm40Var, oym oymVar, fet fetVar, int i) {
        if (oymVar instanceof jym) {
            fetVar.e0(1179590997);
            ahb.j(mm40Var, (jym) oymVar, fetVar, i & 126);
            fetVar.r(false);
            return;
        }
        if (oymVar instanceof kym) {
            fetVar.e0(1179781306);
            zjb.k(mm40Var, (kym) oymVar, fetVar, i & 126);
            fetVar.r(false);
            return;
        }
        if (oymVar instanceof lym) {
            fetVar.e0(1179966810);
            bkb.j(mm40Var, (lym) oymVar, fetVar, i & 126);
            fetVar.r(false);
        } else if (oymVar instanceof mym) {
            fetVar.e0(1180152314);
            ckb.m(mm40Var, (mym) oymVar, fetVar, i & 126);
            fetVar.r(false);
        } else {
            if (!(oymVar instanceof nym)) {
                throw b1j.f(-1485970840, fetVar, false);
            }
            fetVar.e0(1180337818);
            gkb.l(mm40Var, (nym) oymVar, fetVar, i & 126);
            fetVar.r(false);
        }
    }

    public static final void j(mm40 mm40Var, yhm0 yhm0Var, Function1 function1, fet fetVar, int i) {
        float f;
        long backgroundContent;
        yhm0Var.getClass();
        function1.getClass();
        fetVar.g0(191531927);
        byte b = 16;
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(yhm0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            if (yhm0Var instanceof thm0) {
                zcl zclVar = qmk.f28987a;
                f = 16.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 20.0f;
            }
            float f2 = f;
            pim0 pim0VarE = yhm0Var.e();
            if (pim0VarE != null) {
                if (pim0VarE instanceof nim0) {
                    fetVar.e0(-621399199);
                    backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
                    fetVar.r(false);
                } else if (pim0VarE instanceof oim0) {
                    fetVar.e0(-621396280);
                    backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                    fetVar.r(false);
                }
                boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32);
                Object objP = fetVar.P();
                if (z || objP == ukd.f35823a) {
                    objP = new gnm(function1, yhm0Var, b);
                    fetVar.o0(objP);
                }
                a8k0.n(y860.W(mm40Var, null, null, false, null, (Function0) objP, 28), f2, backgroundContent, null, hp4.b, u1c.M(-2110230825, new mxm(yhm0Var, b), fetVar), hp4.c, fetVar, 1797120, 0);
            }
            throw b1j.f(-621402133, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d8m(mm40Var, yhm0Var, function1, i, (byte) 18);
        }
    }

    public static final void k(gvu0 gvu0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(144652366);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(gvu0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) fetVar.k(dy2.b);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = d7o.f5603a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            boolean zI = fetVar.i(context) | ((i2 & 14) == 4);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new qzn(gvu0Var, context, (byte) 19);
                fetVar.o0(objP2);
            }
            fetVar2 = fetVar;
            y860.f(xdrVar, null, (Function1) objP2, fetVar2, 6, 2);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o6o(gvu0Var, i, (byte) 5);
        }
    }

    public static final void l(mm40 mm40Var, mfa mfaVar, Function0 function0, Function0 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1727463936);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(mfaVar) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            long backgroundContent = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            zcl zclVar2 = qmk.i;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarD, backgroundContent, new ugg0(zclVar, zclVar, zclVar2, zclVar2)), 12.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
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
            jm40 jm40Var = jm40.b;
            r(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 2.0f, 7), mfaVar.f21685a, mfaVar.b, fetVar2, 0);
            vfc.q(s5x0.L(jm40Var, 0.0f, 6.0f, 1), androidx.compose.runtime.e.f(mfaVar.c, fetVar2), new gil0(0, null, null, new zgl0(), 7), null, null, fetVar, 0, 24);
            fetVar2 = fetVar;
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD2);
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
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            nul nulVar = nul.e;
            oe9 oe9Var = oe9.c;
            wul wulVar = new wul(nulVar, oe9Var, new ue9(rsm0.w(R.string.to_coupon_express_card_button, 0, fetVar2)), true, false, false);
            boolean z2 = (i2 & 896) == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new dbn(function0, (byte) 5);
                fetVar2.o0(objP);
            }
            qzb.n(x7zVar, wulVar, (Function0) objP, fetVar2, 0, 0);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar2 = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            wul wulVar2 = new wul(lul.e, oe9Var, new ue9(rsm0.w(R.string.make_bet, 0, fetVar2)), true, false, false);
            boolean z3 = (i2 & 7168) == 2048;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new dbn(function1, (byte) 6);
                fetVar2.o0(objP2);
            }
            qzb.n(x7zVar2, wulVar2, (Function0) objP2, fetVar2, 0, 0);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqk((byte) 24, i, (Object) mm40Var, (Object) mfaVar, (Object) function0, (Object) function1);
        }
    }

    public static final void m(mm40 mm40Var, f5m f5mVar, fet fetVar, int i) {
        fetVar.g0(2128862237);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(f5mVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.n, fetVar, 48);
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
            go8 go8Var = f5mVar.f8968a;
            if (go8Var == null) {
                fetVar.e0(-1701136741);
                fetVar.r(false);
            } else {
                fetVar.e0(-1701136740);
                p(0, go8Var.b, fetVar, go8Var.f11618a, go8Var.c);
                fetVar.r(false);
            }
            String str = f5mVar.b;
            if (str == null) {
                fetVar.e0(-1700852254);
                fetVar.r(false);
            } else {
                fetVar.e0(-1700852253);
                mm40 mm40VarE0 = o2e.e0(jm40.b, "EXTRA_INFO_TEXT");
                pz40 pz40Var = s6t0.f31722a;
                o(6, StaticColors.INSTANCE.m130getWhite600d7_KjU(), fetVar, mm40VarE0, str);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cxj(mm40Var, f5mVar, i, (byte) 29);
        }
    }

    public static final void n(int i, int i2, fet fetVar, mm40 mm40Var, String str, String str2, String str3) {
        String str4;
        mm40 mm40Var2;
        int i3;
        int i4;
        int i5;
        int i6;
        long jM81getDarkBlue0d7_KjU;
        fet fetVar2 = fetVar;
        str3.getClass();
        fetVar2.g0(1846728275);
        int i7 = i2 | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.e(i) ? 256 : 128) | (fetVar2.g(str2) ? 2048 : 1024) | (fetVar2.g(str3) ? 16384 : 8192);
        if (fetVar2.U(i7 & 1, (i7 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(o7k0.w(jm40Var, null, false, 3), "HistoryInfoOperationСellTestTag");
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE1 = o2e.e0(i120.Q(o7k0.n(s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14), 40.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundGroupSecondary(), vgg0.f37379a), "TRANSACTION_CELL_ICON");
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE1);
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
            mm40 mm40VarB = jr8.f16991a.b(o7k0.n(jm40Var, 24.0f), zx7Var);
            if (i == 1) {
                i3 = 3;
                i4 = R.drawable.ic_glyph_minus_small;
            } else if (i != 2) {
                i3 = 3;
                if (i != 3) {
                    i4 = i != 4 ? R.drawable.ic_glyph_question_mark : R.drawable.ic_glyph_waiting;
                } else {
                    i4 = R.drawable.ic_glyph_cancel;
                }
            } else {
                i3 = 3;
                i4 = R.drawable.ic_glyph_plus_small;
            }
            mm40 mm40VarE2 = o2e.e0(mm40VarB, String.valueOf(i4));
            if (i == 1) {
                i5 = 0;
                i6 = R.drawable.ic_glyph_minus_small;
            } else if (i == 2) {
                i5 = 0;
                i6 = R.drawable.ic_glyph_plus_small;
            } else if (i != i3) {
                i6 = i != 4 ? R.drawable.ic_glyph_question_mark : R.drawable.ic_glyph_waiting;
                i5 = 0;
            } else {
                i5 = 0;
                i6 = R.drawable.ic_glyph_cancel;
            }
            pm80 pm80VarF = a8k0.F(i6, i5, fetVar2);
            if (i == 1) {
                jM81getDarkBlue0d7_KjU = StaticColors.INSTANCE.m81getDarkBlue0d7_KjU();
            } else if (i == 2) {
                jM81getDarkBlue0d7_KjU = StaticColors.INSTANCE.m98getGreen0d7_KjU();
            } else if (i != 3) {
                jM81getDarkBlue0d7_KjU = i != 4 ? StaticColors.INSTANCE.m95getGray0d7_KjU() : StaticColors.INSTANCE.m132getYellow0d7_KjU();
            } else {
                jM81getDarkBlue0d7_KjU = StaticColors.INSTANCE.m113getRed0d7_KjU();
            }
            dww.c(pm80VarF, null, mm40VarE2, jM81getDarkBlue0d7_KjU, fetVar2, 56, 0);
            fetVar2.r(true);
            mm40 mm40VarH = dw9.h(1.0f, s5x0.M(jm40Var, 8.0f, 12.0f, 4.0f, 12.0f), true);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarH);
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
            mm40 mm40VarE3 = o2e.e0(jm40Var, "TRANSACTION_CELL_DESCRIPTION");
            String strUnicodeWrap = BidiFormatter.getInstance().unicodeWrap(str);
            strUnicodeWrap.getClass();
            v8q0.a(strUnicodeWrap, mm40VarE3, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 3, 0, null, ibm0.t(g1t0.g(), fetVar2), fetVar, 48, 24960, 110588);
            v8q0.a(str3, o2e.e0(s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), "TRANSACTION_CELL_TIME"), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.n(g1t0.h(), fetVar), fetVar, (i7 >> 12) & 14, 24960, 110588);
            fetVar2 = fetVar;
            fetVar2.r(true);
            str4 = str2;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(2117730167, new v(i, str4), fetVar2), fetVar2, 56);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            str4 = str2;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a0n(mm40Var2, str, i, str4, str3, i2);
        }
    }

    public static final void o(int i, long j, fet fetVar, mm40 mm40Var, String str) {
        int i2;
        String str2;
        fetVar.g0(1526333800);
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
            i2 |= fetVar.f(j) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 14.0f);
            long j2 = qmk.q;
            n05 n05Var = new n05(qmk.p, j2, qmk.n);
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str2, mm40VarE, j, n05Var, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, j2, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, ((i2 >> 3) & 14) | (i2 & 896), 24960, 109552);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e5m((byte) 0, i, j, mm40Var, str);
        }
    }

    public static final void p(int i, long j, fet fetVar, String str, boolean z) {
        fetVar.g0(1828123493);
        byte b = 4;
        int i2 = i | (fetVar.g(str) ? 4 : 2) | (fetVar.f(j) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                long jW0 = ibc.w0(j - new Date().getTime(), bfn.MILLISECONDS);
                uen uenVar = wen.b;
                objP = Long.valueOf(wen.l(jW0, bfn.SECONDS));
                fetVar.o0(objP);
            }
            long jLongValue = ((Number) objP).longValue();
            if (z) {
                fetVar.e0(1441930030);
                yhh.a(jLongValue, false, 0L, Long.valueOf(j), u1c.M(-1539303647, new h0(str, b), fetVar), fetVar, ((i2 << 6) & 7168) | 24630, 4);
                fetVar.r(false);
            } else {
                fetVar.e0(1442417195);
                o(((i2 << 3) & 112) | 6, ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), fetVar, o2e.e0(jm40.b, "DESCRIPTION_TEXT"), str);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d5m(i, j, str, z);
        }
    }

    public static final void q(mm40 mm40Var, m0x m0xVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(1521810064);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(m0xVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_category_new, 0, fetVar);
            zcl zclVar = qmk.f28987a;
            k7x.b(m0xVar.a(), null, o7k0.n(mm40Var, 16.0f), pm80VarF, pm80VarF, null, null, null, null, null, gqw0.A, new m78(((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), 5), fetVar, 36912, 6, 27616);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n0n((Object) mm40Var, (Object) m0xVar, i, (byte) 8);
        }
    }

    public static final void r(mm40 mm40Var, String str, m0x m0xVar, fet fetVar, int i) {
        fetVar.g0(-1155420277);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(m0xVar) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
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
            zcl zclVar = qmk.f28987a;
            int i3 = i2 >> 3;
            q(s5x0.N(jm40.b, 0.0f, 0.0f, 4.0f, 0.0f, 11), m0xVar, fetVar, i3 & 112);
            v8q0.a(str, null, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 3, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, i3 & 14, 24960, 110586);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ann(mm40Var, str, m0xVar, i, (byte) 7);
        }
    }

    public static final void s(cp cpVar) {
        List list = u0d.f34849a;
        yfu0 yfu0Var = cpVar.u;
        u0d.n(((hth) yfu0Var).b, ((tog) cpVar.u()).f34281a.b, R.drawable.icon_globe_empty, 3);
        ((hth) yfu0Var).e.post(new zre(cpVar, (byte) 1));
    }

    public static String t() {
        StringBuilder sb = new StringBuilder(ujn.h);
        if ("static/img/android/champions_club/en/1.png".length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O("static/img/android/champions_club/en/1.png", ujn.h, false) || kotlin.text.c.x("static/img/android/champions_club/en/1.png", "https://", false)) {
            sb.setLength(0);
            sb.append("static/img/android/champions_club/en/1.png");
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0("static/img/android/champions_club/en/1.png", '/'));
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ae  */
    public static final lmf u(long j, trf trfVar, String str, String str2, int i, String str3, boolean z) {
        String str4 = str2;
        str.getClass();
        List listJ = q3d.j(0, 1, 2, 3, 4);
        ArrayList arrayList = new ArrayList(r3d.q(listJ, 10));
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            arrayList.add((pqf) CollectionsKt.W(((Number) it.next()).intValue(), trfVar.f34420a));
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
                List list = u0d.f34849a;
                if (u0d.c(str4)) {
                    str4 = "";
                } else {
                    str4 = String.format(Locale.ENGLISH, StringsKt.O(str4, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str4}, 2));
                }
            }
        }
        return new lmf(str3, j, new jmf(str4, str), ieb.Y(pqfVar), ieb.Y(pqfVar2), ieb.Y(pqfVar3), ieb.Y(pqfVar4), ieb.Y(pqfVar5), i, z);
    }

    public static final ArrayList v(List list) {
        jge igeVar;
        list.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gj0 gj0Var = (gj0) it.next();
            if (gj0Var != null) {
                if (gj0Var instanceof vi0) {
                    igeVar = new yfe(new x98(gj0Var));
                } else if (gj0Var instanceof wi0) {
                    igeVar = new zfe(new x98(gj0Var));
                } else if (gj0Var instanceof xi0) {
                    igeVar = new age(new x98(gj0Var));
                } else if (gj0Var instanceof yi0) {
                    igeVar = new bge(new x98(gj0Var));
                } else if (gj0Var instanceof zi0) {
                    igeVar = new cge(new x98(gj0Var));
                } else if (gj0Var instanceof aj0) {
                    igeVar = new dge(new x98(gj0Var));
                } else if (gj0Var instanceof bj0) {
                    igeVar = new ege(new x98(gj0Var));
                } else if (gj0Var instanceof cj0) {
                    igeVar = new fge(new x98(gj0Var));
                } else if (gj0Var instanceof dj0) {
                    igeVar = new gge(new x98(gj0Var));
                } else if (gj0Var instanceof ej0) {
                    igeVar = new hge(new x98(gj0Var));
                } else if (gj0Var instanceof fj0) {
                    igeVar = new ige(new x98(gj0Var));
                }
                arrayList.add(igeVar);
            }
            t9f.b();
            return null;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    public static final ArrayList w(List list, List list2) {
        Object next;
        list.getClass();
        list2.getClass();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            q1h q1hVar = (q1h) obj;
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((f2h) next).f8812a.equals(q1hVar.c));
            f2h f2hVar = (f2h) next;
            if (f2hVar != null) {
                boolean z = i == list2.size() - 1 && list2.size() <= 5;
                q1hVar.getClass();
                String str = f2hVar.c;
                String str2 = f2hVar.d;
                str2.getClass();
                if (!kotlin.text.c.x(str2, ujn.h, false)) {
                    if (str2.length() == 0) {
                        str2 = "";
                    } else {
                        List list3 = u0d.f34849a;
                        if (u0d.c(str2)) {
                            str2 = "";
                        } else {
                            str2 = String.format(Locale.ENGLISH, StringsKt.O(str2, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str2}, 2));
                        }
                    }
                }
                String str3 = str2;
                String str4 = q1hVar.g;
                long j = q1hVar.f;
                rdj rdjVar = rdj.f30294a;
                arrayList.add(new efr(str, str3, str4, rdj.h(new znq0(j), ykq0.UNIVERSAL, Boolean.TRUE, null, 248), rdj.f(new znq0(j), sdj.UNIVERSAL, null, 60), z));
            }
            i = i2;
        }
        return arrayList;
    }

    public static final ArrayList x(List list) {
        jge igeVar;
        list.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gj0 gj0Var = (gj0) it.next();
            if (gj0Var != null) {
                if (gj0Var instanceof vi0) {
                    igeVar = new yfe(new fa8(gj0Var));
                } else if (gj0Var instanceof wi0) {
                    igeVar = new zfe(new fa8(gj0Var));
                } else if (gj0Var instanceof xi0) {
                    igeVar = new age(new fa8(gj0Var));
                } else if (gj0Var instanceof yi0) {
                    igeVar = new bge(new fa8(gj0Var));
                } else if (gj0Var instanceof zi0) {
                    igeVar = new cge(new fa8(gj0Var));
                } else if (gj0Var instanceof aj0) {
                    igeVar = new dge(new fa8(gj0Var));
                } else if (gj0Var instanceof bj0) {
                    igeVar = new ege(new fa8(gj0Var));
                } else if (gj0Var instanceof cj0) {
                    igeVar = new fge(new fa8(gj0Var));
                } else if (gj0Var instanceof dj0) {
                    igeVar = new gge(new fa8(gj0Var));
                } else if (gj0Var instanceof ej0) {
                    igeVar = new hge(new fa8(gj0Var));
                } else if (gj0Var instanceof fj0) {
                    igeVar = new ige(new fa8(gj0Var));
                }
                arrayList.add(igeVar);
            }
            t9f.b();
            return null;
        }
        return arrayList;
    }

    public static Handler y(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ia3.f(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e) {
            e = e;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            ohq.p(cause);
            return null;
        }
    }

    public static final a2m z(l2g0 l2g0Var) {
        t480 t480VarH = H(l2g0Var);
        List listP = xkb.P();
        boolean z = false;
        if (listP == null || !listP.isEmpty()) {
            Iterator it = listP.iterator();
            while (it.hasNext()) {
                if (((yxg) it.next()).b == l2g0Var.c) {
                    z = true;
                    break;
                }
            }
        }
        c2m c2mVar = c2m.f3631a;
        return (t480VarH == null && z) ? new z1m(c2mVar) : new y1m(c2mVar, new x1m(), E(l2g0Var), K(l2g0Var), false, false);
    }

    public abstract String G();
}
