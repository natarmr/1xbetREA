package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class r8x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f30049a;

    public static final void A(mm40 mm40Var, String str, j83 j83Var, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        mm40 mm40Var3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1745285157);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i3 = i | (fetVar2.g(mm40Var2) ? 4 : 2);
        }
        int i5 = i3 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(j83Var) ? 256 : 128);
        if (fetVar2.U(i5 & 1, (i5 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40Var4 = i4 != 0 ? jm40Var : mm40Var2;
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var4, 16.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar2, 48);
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
            y9q0 y9q0VarD = g1t0.d();
            zfn zfnVar = zaq0.b;
            v8q0.a(str, new x7z(1.0f, true), ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarD, fetVar2, (i5 >> 3) & 14, 24960, 110584);
            v8q0.b(j83Var, o7k0.u(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 0.0f, 130.0f, 1), ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, null, g1t0.a(), fetVar2, (i5 >> 6) & 14, 24960, 241656);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var3 = mm40Var4;
        } else {
            fetVar2.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p2n(mm40Var3, (Object) str, (Object) j83Var, i, i2, (byte) 22);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v47, types: [java.lang.CharSequence, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v37, types: [int] */
    /* JADX WARN: Type inference failed for: r5v38, types: [int] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v66 */
    public static final void B(lc00 lc00Var, eoy eoyVar, ctf0 ctf0Var, m9s m9sVar, boolean z) {
        Object next;
        char c;
        boolean z2;
        int i;
        String strA;
        char c2;
        ctf0Var.getClass();
        m9sVar.getClass();
        ArrayList arrayList = eoyVar.b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            sna0 sna0Var = ((tna0) obj).f34224a;
            if (sna0Var == sna0.f32484a || sna0Var == sna0.b) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            sna0 sna0Var2 = ((tna0) obj2).f34224a;
            if (sna0Var2 == sna0.c || sna0Var2 == sna0.d) {
                arrayList3.add(obj2);
            }
        }
        Iterator it = eoyVar.f8159a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((tna0) next).b != rna0.JOKER);
        tna0 tna0Var = (tna0) next;
        qqs qqsVar = m9sVar.h;
        long j = qqsVar.h;
        boolean z3 = znq0.f(j) == 0 || z || tna0Var != null;
        List listJ = q3d.j(new coy("SPADESSIX", R.drawable.killer_joker_spade_six), new coy("CLUBSSIX", R.drawable.killer_joker_club_six), new coy("SPADESSEVEN", R.drawable.killer_joker_spade_seven), new coy("CLUBSSEVEN", R.drawable.killer_joker_club_seven), new coy("SPADESEIGHT", R.drawable.killer_joker_spade_eight), new coy("CLUBSEIGHT", R.drawable.killer_joker_club_eight), new coy("SPADESNINE", R.drawable.killer_joker_spade_nine), new coy("CLUBSNINE", R.drawable.killer_joker_club_nine), new coy("SPADESTEN", R.drawable.killer_joker_spade_ten), new coy("CLUBSTEN", R.drawable.killer_joker_club_ten), new coy("SPADESJACK", R.drawable.killer_joker_spade_jack), new coy("CLUBSJACK", R.drawable.killer_joker_club_jack), new coy("SPADESQUEEN", R.drawable.killer_joker_spade_queen), new coy("CLUBSQUEEN", R.drawable.killer_joker_club_queen), new coy("SPADESKING", R.drawable.killer_joker_spade_king), new coy("CLUBSKING", R.drawable.killer_joker_club_king), new coy("SPADESACE", R.drawable.killer_joker_spade_ace), new coy("CLUBSACE", R.drawable.killer_joker_club_ace));
        List listJ2 = q3d.j(new coy("HEARTSSIX", R.drawable.killer_joker_heart_six), new coy("DIAMONDSSIX", R.drawable.killer_joker_diamond_six), new coy("HEARTSSEVEN", R.drawable.killer_joker_heart_seven), new coy("DIAMONDSSEVEN", R.drawable.killer_joker_diamond_seven), new coy("HEARTSEIGHT", R.drawable.killer_joker_heart_eight), new coy("DIAMONDSEIGHT", R.drawable.killer_joker_diamond_eight), new coy("HEARTSNINE", R.drawable.killer_joker_heart_nine), new coy("DIAMONDSNINE", R.drawable.killer_joker_diamond_nine), new coy("HEARTSTEN", R.drawable.killer_joker_heart_ten), new coy("DIAMONDSTEN", R.drawable.killer_joker_diamond_ten), new coy("HEARTSJACK", R.drawable.killer_joker_heart_jack), new coy("DIAMONDSJACK", R.drawable.killer_joker_diamond_jack), new coy("HEARTSQUEEN", R.drawable.killer_joker_heart_queen), new coy("DIAMONDSQUEEN", R.drawable.killer_joker_diamond_queen), new coy("HEARTSKING", R.drawable.killer_joker_heart_king), new coy("DIAMONDSKING", R.drawable.killer_joker_diamond_king), new coy("HEARTSACE", R.drawable.killer_joker_heart_ace), new coy("DIAMONDSACE", R.drawable.killer_joker_diamond_ace));
        float f = tna0Var != null ? 0.7f : 0.2f;
        ArrayList<tna0> arrayList4 = new ArrayList(CollectionsKt.q0(arrayList2, arrayList3));
        if (zys0.a(arrayList4).remove(tna0Var) && tna0Var != null) {
            arrayList4.add(tna0Var);
        }
        ArrayList arrayList5 = new ArrayList(r3d.q(arrayList4, 10));
        for (tna0 tna0Var2 : arrayList4) {
            tna0Var2.getClass();
            arrayList5.add(new coy(ohs0.n(tna0Var2.f34224a.name(), tna0Var2.b.name()), z1x.F(tna0Var2)));
        }
        int iL = L(arrayList2);
        int i2 = R.drawable.cybergame_killer_joker_winner_bg;
        int i3 = R.drawable.cybergame_killer_joker_bg;
        loy loyVar = new loy(iL, (tna0Var == null || L(arrayList2) < L(arrayList3)) ? R.drawable.cybergame_killer_joker_bg : R.drawable.cybergame_killer_joker_winner_bg);
        int iL2 = L(arrayList3);
        if (tna0Var != null) {
            if (L(arrayList3) < L(arrayList2)) {
                i2 = R.drawable.cybergame_killer_joker_bg;
            }
            i3 = i2;
        }
        moy moyVar = new moy(iL2, i3);
        long jF = znq0.f(j);
        lsm0 lsm0Var = ctf0Var.b;
        String strA2 = lsm0Var.a(R.string.killer_joker_move, Arrays.copyOf(new Object[0], 0));
        boolean z4 = !z3;
        znq0 znq0Var = qqsVar.k;
        noy noyVar = new noy(jF, znq0Var != null ? Long.valueOf(znq0.f(znq0Var.f44687a)) : null, strA2, z4);
        StringBuilder sb = new StringBuilder(ujn.h);
        if (StringsKt.O("static/img/android/esports/274/BackgroundJoker.svg", ujn.h, false) || kotlin.text.c.x("static/img/android/esports/274/BackgroundJoker.svg", "https://", false)) {
            c = '/';
            z2 = false;
            sb.setLength(0);
            sb.append("static/img/android/esports/274/BackgroundJoker.svg");
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            c = '/';
            z2 = false;
            sb.append(StringsKt.y0("static/img/android/esports/274/BackgroundJoker.svg", '/'));
        }
        String string = sb.toString();
        ?? sb2 = new StringBuilder(ujn.h);
        boolean zO = StringsKt.O("static/img/android/esports/274/Joker.svg", ujn.h, z2);
        ?? r5 = z2;
        if (zO) {
            sb2.setLength(r5);
            sb2.append("static/img/android/esports/274/Joker.svg");
            i = r5;
        } else if (kotlin.text.c.x("static/img/android/esports/274/Joker.svg", "https://", z2)) {
            r5 = 0;
            sb2.setLength(r5);
            sb2.append("static/img/android/esports/274/Joker.svg");
            i = r5;
        } else {
            if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                c2 = c;
            } else {
                c2 = c;
                sb2.append(c2);
            }
            i = 0;
            sb2.append(StringsKt.y0("static/img/android/esports/274/Joker.svg", c2));
        }
        ioy ioyVar = new ioy(string, sb2.toString());
        int iL3 = L(arrayList2);
        int iL4 = L(arrayList3);
        if (z) {
            strA = lsm0Var.a(R.string.bet_before_higher_vs_lower_game_start, Arrays.copyOf(new Object[i], (int) i));
        } else if (tna0Var == null) {
            strA = lsm0Var.a(R.string.killer_joker_taking_card, Arrays.copyOf(new Object[i], (int) i));
        } else if (iL4 == iL3) {
            strA = lsm0Var.a(R.string.draw, Arrays.copyOf(new Object[i], (int) i));
        } else {
            strA = iL4 > iL3 ? lsm0Var.a(R.string.sport_durak_end_game_win_v2, Arrays.copyOf(new Object[]{2}, 1)) : lsm0Var.a(R.string.sport_durak_end_game_win_v2, Arrays.copyOf(new Object[]{1}, 1));
        }
        lc00Var.add(new poy(listJ, listJ2, f, noyVar, arrayList5, loyVar, moyVar, ioyVar, new koy(strA, z3)));
    }

    public static void C(t9k0 t9k0Var, List list, zfe0 zfe0Var) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iC = t9k0Var.c((bet) list.get(i));
            int iO = t9k0Var.O(t9k0Var.b, t9k0Var.q(iC));
            Object obj = iO < t9k0Var.f(t9k0Var.b, t9k0Var.q(iC + 1)) ? t9k0Var.c[t9k0Var.g(iO)] : ukd.f35823a;
            yfe0 yfe0Var = obj instanceof yfe0 ? (yfe0) obj : null;
            if (yfe0Var != null) {
                yfe0Var.f42538a = zfe0Var;
            }
        }
    }

    public static final void D(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((DsCellRightSwitch) ((g2j0) yfu0Var).c.e).setChecked(((d2j0) cpVar.u()).f5358a);
        g2j0 g2j0Var = (g2j0) yfu0Var;
        ((DsCellMiddleTitle) g2j0Var.c.c).setTitle(R.string.auto_maximum);
        ((DsSettingsCell) g2j0Var.c.d).setFirst(true);
        ((DsSettingsCell) g2j0Var.c.d).setLast(true);
    }

    public static final void E(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((s2k) yfu0Var).c.setVisibility(((n5c0) cpVar.u()).b ? 0 : 8);
        ((s2k) yfu0Var).d.setVisibility(((n5c0) cpVar.u()).b ? 0 : 8);
    }

    public static final boolean F(Map map, Map.Entry entry) {
        Object obj = map.get(entry.getKey());
        if (obj != null) {
            return obj.equals(entry.getValue());
        }
        return entry.getValue() == null && map.containsKey(entry.getKey());
    }

    public static final f3w G(kzv kzvVar, ctf0 ctf0Var, String str, boolean z) {
        double d = kzvVar.V;
        if (!z || d == 0.0d) {
            return null;
        }
        String strA = ctf0Var.b.a(R.string.advance, Arrays.copyOf(new Object[0], 0));
        pn40 pn40Var = pn40.f27267a;
        return new f3w("ADVANCE_AMOUNT", strA, pn40.c(d, p3u0.c), str, e3w.f7156a);
    }

    public static final f3w H(kzv kzvVar, ctf0 ctf0Var, String str, boolean z) {
        String strA;
        String strL;
        String strA2;
        String strC;
        double d = kzvVar.w;
        i0w i0wVar = kzvVar.g;
        double d2 = kzvVar.V;
        double d3 = kzvVar.U;
        if (z) {
            if (d3 != 0.0d && i0wVar == i0w.e) {
                strA2 = ctf0Var.b.a(R.string.advance_conf_bet_no_colon, Arrays.copyOf(new Object[0], 0));
            } else {
                if (d2 == 0.0d) {
                    return null;
                }
                strA2 = ctf0Var.b.a(R.string.advance_close_no_dots, Arrays.copyOf(new Object[0], 0));
            }
            String str2 = strA2;
            if (d3 != 0.0d && i0wVar == i0w.e) {
                pn40 pn40Var = pn40.f27267a;
                strC = pn40.c(d3, p3u0.c);
            } else {
                pn40 pn40Var2 = pn40.f27267a;
                strC = pn40.c(d, p3u0.c);
            }
            return new f3w("ADVANCE_BET_ID", str2, strC, str, e3w.f7156a);
        }
        if (d3 != 0.0d && i0wVar == i0w.e) {
            strA = ctf0Var.b.a(R.string.advance_conf_bet_no_colon, Arrays.copyOf(new Object[0], 0));
        } else {
            if (d2 == 0.0d) {
                return null;
            }
            strA = ctf0Var.b.a(R.string.advance_close_no_dots, Arrays.copyOf(new Object[0], 0));
        }
        if (d3 != 0.0d && i0wVar == i0w.e) {
            pn40 pn40Var3 = pn40.f27267a;
            strL = pn40.c(d3, p3u0.c);
        } else {
            pn40 pn40Var4 = pn40.f27267a;
            p3u0 p3u0Var = p3u0.c;
            strL = kng0.l(pn40.c(d, p3u0Var), Separators.SLASH, pn40.c(d2, p3u0Var));
        }
        return new f3w("ADVANCE_BET_ID", strA, strL, str, e3w.f7156a);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007f  */
    public static final h3w I(kzv kzvVar, ctf0 ctf0Var, String str, boolean z, boolean z2) {
        double d;
        int iOrdinal;
        long jM145getCommerce0d7_KjU;
        long j;
        double d2 = kzvVar.r;
        lb90 lb90Var = kzvVar.n;
        double d3 = kzvVar.f;
        double d4 = kzvVar.o;
        hxu hxuVar = kzvVar.O;
        i0w i0wVar = kzvVar.g;
        boolean z3 = lb90Var == lb90.b && Intrinsics.d(hxuVar, hxu.h) && z;
        if (!z3 || i0wVar != i0w.b) {
            if (!z3) {
                d = 0.0d;
                if (hxuVar.f.b != 0.0d && q3d.j(i0w.b, i0w.d).contains(i0wVar)) {
                    d4 = hxuVar.f.b;
                } else if (i0wVar == i0w.f13966a || i0wVar == i0w.b) {
                    d4 = d2;
                } else if (i0wVar == i0w.d) {
                    d4 = kzvVar.c;
                }
            }
            iOrdinal = i0wVar.ordinal();
            if (iOrdinal != 3 || iOrdinal == 4 || iOrdinal == 6) {
                pz40 pz40Var = s6t0.f31722a;
                jM145getCommerce0d7_KjU = s6t0.b().f33626a.getCommerce();
            } else {
                pz40 pz40Var2 = s6t0.f31722a;
                jM145getCommerce0d7_KjU = s6t0.b().f33626a.getSecondary();
            }
            j = jM145getCommerce0d7_KjU;
            if (d4 == d || !z2) {
                String strA = ctf0Var.b.a(R.string.bet, Arrays.copyOf(new Object[0], 0));
                pn40 pn40Var = pn40.f27267a;
                return new f3w("", strA, pn40.c(d3, p3u0.c), str, e3w.f7156a);
            }
            if (kzvVar.L < d3 || i0wVar == i0w.i) {
                String strA2 = ctf0Var.b.a(R.string.bet, Arrays.copyOf(new Object[0], 0));
                pn40 pn40Var2 = pn40.f27267a;
                p3u0 p3u0Var = p3u0.c;
                return new np2(strA2, pn40.c(d3, p3u0Var), pn40.c(d4, p3u0Var), str, j);
            }
            String strA3 = ctf0Var.b.a(R.string.history_bet_rate_partially_sold, Arrays.copyOf(new Object[0], 0));
            pn40 pn40Var3 = pn40.f27267a;
            double d5 = d3 - kzvVar.E;
            p3u0 p3u0Var2 = p3u0.c;
            return new np2(strA3, pn40.c(d5, p3u0Var2), pn40.c(d2, p3u0Var2), str, j);
        }
        d4 = kzvVar.p;
        d = 0.0d;
        iOrdinal = i0wVar.ordinal();
        if (iOrdinal != 3) {
            pz40 pz40Var3 = s6t0.f31722a;
            jM145getCommerce0d7_KjU = s6t0.b().f33626a.getCommerce();
        } else {
            pz40 pz40Var4 = s6t0.f31722a;
            jM145getCommerce0d7_KjU = s6t0.b().f33626a.getCommerce();
        }
        j = jM145getCommerce0d7_KjU;
        if (d4 == d) {
            if (kzvVar.L < d3) {
            }
            String strA4 = ctf0Var.b.a(R.string.bet, Arrays.copyOf(new Object[0], 0));
            pn40 pn40Var4 = pn40.f27267a;
            p3u0 p3u0Var3 = p3u0.c;
            return new np2(strA4, pn40.c(d3, p3u0Var3), pn40.c(d4, p3u0Var3), str, j);
        }
        String strA5 = ctf0Var.b.a(R.string.bet, Arrays.copyOf(new Object[0], 0));
        pn40 pn40Var5 = pn40.f27267a;
        return new f3w("", strA5, pn40.c(d3, p3u0.c), str, e3w.f7156a);
    }

    public static final f3w J(kzv kzvVar, ctf0 ctf0Var, String str) {
        ctf0Var.getClass();
        if (!kzvVar.x) {
            return null;
        }
        String strA = ctf0Var.b.a(R.string.history_auto_sale, Arrays.copyOf(new Object[0], 0));
        pn40 pn40Var = pn40.f27267a;
        return new f3w("", strA, pn40.c(kzvVar.y, p3u0.c), str, e3w.f7156a);
    }

    public static final int L(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((tna0) obj).b != rna0.JOKER) {
                arrayList2.add(obj);
            }
        }
        return arrayList2.size();
    }

    public static final f3w M(kzv kzvVar, ctf0 ctf0Var, String str) {
        int i;
        i0w i0wVar = i0w.i;
        double d = kzvVar.L;
        i0w i0wVar2 = kzvVar.g;
        double d2 = kzvVar.f;
        if (d >= d2 || i0wVar2 == i0wVar) {
            i = i0wVar2 == i0wVar ? R.string.credited_to_account_with_colon : R.string.bet;
        } else {
            i = R.string.history_bet_rate_partially_sold;
        }
        String strR = kotlin.text.c.r(ctf0Var.b.a(i, Arrays.copyOf(new Object[0], 0)), Separators.COLON, "", false);
        pn40 pn40Var = pn40.f27267a;
        double d3 = kzvVar.C;
        if (d3 <= 0.0d) {
            d3 = i0wVar2 == i0wVar ? kzvVar.M : d2 - kzvVar.E;
        }
        return new f3w("", strR, pn40.c(d3, p3u0.c), str, e3w.f7156a);
    }

    public static final int N(s9b0 s9b0Var, boolean z, qho qhoVar) {
        int i;
        switch (s9b0Var.ordinal()) {
            case 0:
                i = R.drawable.ic_glyph_live;
                break;
            case 1:
                i = R.drawable.ic_glyph_line;
                break;
            case 2:
                i = R.drawable.ic_glyph_cyber_gamepad;
                break;
            case 3:
                i = R.drawable.ic_glyph_games;
                break;
            case 4:
                i = !z ? R.drawable.ic_glyph_cards : R.drawable.ic_glyph_virtual;
                break;
            case 5:
                i = R.drawable.ic_glyph_express;
                break;
            case 6:
                i = R.drawable.ic_glyph_championship_live;
                break;
            case 7:
                i = R.drawable.ic_glyph_championship_line;
                break;
            default:
                t9f.b();
                return 0;
        }
        return qhoVar.b(i);
    }

    public static final bfj O(kzv kzvVar, ctf0 ctf0Var) {
        int i;
        long jM113getRed0d7_KjU;
        int i2;
        i0w i0wVar = kzvVar.g;
        switch (i0wVar.ordinal()) {
            case 0:
                i = R.string.error;
                break;
            case 1:
                i = R.string.accepted;
                break;
            case 2:
                i = R.string.loosed;
                break;
            case 3:
                i = R.string.won;
                break;
            case 4:
                i = R.string.paid;
                break;
            case 5:
                i = R.string.removed;
                break;
            case 6:
                i = R.string.expired;
                break;
            case 7:
                i = R.string.blocked;
                break;
            case 8:
                i = R.string.bought;
                break;
            default:
                t9f.b();
                return null;
        }
        String strA = ctf0Var.b.a(i, Arrays.copyOf(new Object[0], 0));
        switch (i0wVar.ordinal()) {
            case 0:
            case 2:
            case 5:
            case 6:
                pz40 pz40Var = s6t0.f31722a;
                jM113getRed0d7_KjU = StaticColors.INSTANCE.m113getRed0d7_KjU();
                break;
            case 1:
                pz40 pz40Var2 = s6t0.f31722a;
                jM113getRed0d7_KjU = s6t0.b().f33626a.getPrimary();
                break;
            case 3:
            case 4:
            case 8:
                pz40 pz40Var3 = s6t0.f31722a;
                jM113getRed0d7_KjU = StaticColors.INSTANCE.m98getGreen0d7_KjU();
                break;
            case 7:
                pz40 pz40Var4 = s6t0.f31722a;
                jM113getRed0d7_KjU = s6t0.b().f33626a.getSecondary();
                break;
            default:
                t9f.b();
                return null;
        }
        long j = jM113getRed0d7_KjU;
        switch (i0wVar.ordinal()) {
            case 0:
            case 1:
            case 3:
            case 4:
                i2 = R.drawable.ic_glyph_status_outline_check;
                break;
            case 2:
                i2 = R.drawable.ic_glyph_status_outline_minus;
                break;
            case 5:
            case 6:
                i2 = R.drawable.ic_glyph_status_outline_cancel;
                break;
            case 7:
                i2 = R.drawable.ic_glyph_status_outline_block;
                break;
            case 8:
                i2 = R.drawable.ic_glyph_status_outline_plus;
                break;
            default:
                t9f.b();
                return null;
        }
        return new bfj(i2, j, bfb.R(kzvVar.d, ctf0Var), strA);
    }

    public static final boolean Q(List list, vr20 vr20Var, long j) {
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

    public static final oui0 R(String str, int i, boolean z) {
        Integer numValueOf = Integer.valueOf(i);
        pz40 pz40Var = s6t0.f31722a;
        return new oui0(numValueOf, new y3d(z ? s6t0.b().f33626a.getPrimary() : s6t0.b().f33626a.getSecondary()), new n0x(str), (y3d) null, 24);
    }

    public static final boolean S(wfg0 wfg0Var) {
        long j = wfg0Var.e;
        return (j >>> 32) == (4294967295L & j) && j == wfg0Var.f && j == wfg0Var.g && j == wfg0Var.h;
    }

    public static final gqw0 T(std stdVar, String str, Executor executor, Function0 function0) {
        executor.getClass();
        hy40 hy40Var = new hy40(gqw0.x1);
        tu9 tu9Var = new tu9();
        tu9Var.c = new msf0();
        wu9 wu9Var = new wu9(tu9Var);
        tu9Var.b = wu9Var;
        tu9Var.f34540a = hne.class;
        try {
            executor.execute(new qx9(stdVar, str, function0, hy40Var, tu9Var));
            Unit unit = Unit.f46060a;
            if (unit != null) {
                tu9Var.f34540a = unit;
            }
        } catch (Exception e) {
            wu9Var.b(e);
        }
        return new gqw0();
    }

    public static final aq90 U(int i, tui0 tui0Var, nvi0 nvi0Var, oui0 oui0Var) {
        return new aq90(i, new rqm((vui0) tui0Var, (pui0) oui0Var, (pvi0) nvi0Var, (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, Response.SERVER_TIMEOUT));
    }

    public static final wjd V(lkz lkzVar, fet fetVar, int i) {
        byte b = 1;
        if ((i & 1) != 0) {
            lkzVar = lkz.e;
        }
        Object obj = (clz) fetVar.k(or00.f25714a);
        boolean zG = fetVar.g(obj);
        Object objP = fetVar.P();
        Object obj2 = ukd.f35823a;
        if (zG || objP == obj2) {
            objP = new wjd();
            fetVar.o0(objP);
        }
        wjd wjdVar = (wjd) objP;
        boolean zI = fetVar.i(wjdVar) | fetVar.i(obj);
        Object objP2 = fetVar.P();
        if (zI || objP2 == obj2) {
            objP2 = new dff0(obj, wjdVar, b);
            fetVar.o0(objP2);
        }
        m0x0.n(wjdVar, obj, (Function1) objP2, fetVar);
        boolean zI2 = fetVar.i(wjdVar) | fetVar.e(lkzVar.ordinal());
        Object objP3 = fetVar.P();
        if (zI2 || objP3 == obj2) {
            objP3 = new tye0(wjdVar, lkzVar, null, (byte) 6);
            fetVar.o0(objP3);
        }
        m0x0.v(wjdVar, lkzVar, (Function2) objP3, fetVar);
        return wjdVar;
    }

    public static final j9z W(f7u f7uVar, m8y m8yVar) {
        f7uVar.getClass();
        m8yVar.getClass();
        return new j9z(f7uVar, m8yVar, false);
    }

    public static final mm40 X(mm40 mm40Var, float f, float f2) {
        return (f == 1.0f && f2 == 1.0f) ? mm40Var : i4w0.U(mm40Var, f, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 0, null, 1048572);
    }

    public static final tui0 Y(String str, boolean z) {
        long jM183getTextPrimary0d7_KjU;
        if (z) {
            pz40 pz40Var = s6t0.f31722a;
            jM183getTextPrimary0d7_KjU = s6t0.b().f33626a.getPrimary();
        } else {
            pz40 pz40Var2 = s6t0.f31722a;
            jM183getTextPrimary0d7_KjU = s6t0.b().f33626a.getTextPrimary();
        }
        return new tui0(str, new y3d(jM183getTextPrimary0d7_KjU));
    }

    public static final aq90 Z(nq90 nq90Var, boolean z) {
        nq90Var.getClass();
        if (nq90Var instanceof gq90) {
            gq90 gq90Var = (gq90) nq90Var;
            int i = gq90Var.f11722a;
            tui0 tui0VarY = Y(gq90Var.c, z);
            StringBuilder sb = new StringBuilder(ujn.h);
            String str = gq90Var.e;
            if (str.length() == 0) {
                sb.setLength(0);
            } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
                sb.setLength(0);
                sb.append(str);
            } else {
                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                    sb.append('/');
                }
                sb.append(StringsKt.y0(str, '/'));
            }
            return U(i, tui0VarY, new nvi0(z), R(sb.toString(), R.drawable.ic_glyph_language, z));
        }
        if (nq90Var instanceof hq90) {
            hq90 hq90Var = (hq90) nq90Var;
            String str2 = hq90Var.d;
            int i2 = hq90Var.f13474a;
            tui0 tui0VarY2 = Y(hq90Var.c + (str2.length() > 0 ? kng0.l(" (", str2, Separators.RPAREN) : ""), z);
            bzu bzuVarE = rz4.e("static", "img", "android", "icons_currency");
            rz4.s((long) i2, ".svg", bzuVarE);
            oui0 oui0VarR = R(((StringBuilder) bzuVarE.b).toString(), R.drawable.ic_glyph_currency_placeholder, z);
            pz40 pz40Var = s6t0.f31722a;
            y3d y3dVar = new y3d(z ? s6t0.b().f33626a.getPrimary() : s6t0.b().f33626a.getSecondary());
            Integer num = oui0VarR.f25879a;
            y3d y3dVar2 = oui0VarR.b;
            o0x o0xVar = oui0VarR.c;
            o0xVar.getClass();
            return U(i2, tui0VarY2, new nvi0(z), new oui0(num, y3dVar2, o0xVar, y3dVar, (uf5) null));
        }
        if (!(nq90Var instanceof kq90)) {
            return U(nq90Var.getId(), Y(nq90Var.getTitle(), z), new nvi0(z), null);
        }
        kq90 kq90Var = (kq90) nq90Var;
        String str3 = kq90Var.d;
        int i3 = kq90Var.f18711a;
        int i4 = cy7.f5159a;
        boolean zD = cy7.d(str3);
        String str4 = kq90Var.g;
        tui0 tui0VarY3 = Y(zD ? w6x.q(str4, "+ ", str3) : ua80.i("+", str4, Separators.SP, str3), z);
        StringBuilder sb2 = new StringBuilder(ujn.h);
        String str5 = kq90Var.f;
        if (str5.length() == 0) {
            sb2.setLength(0);
        } else if (StringsKt.O(str5, ujn.h, false) || kotlin.text.c.x(str5, "https://", false)) {
            sb2.setLength(0);
            sb2.append(str5);
        } else {
            if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                sb2.append('/');
            }
            sb2.append(StringsKt.y0(str5, '/'));
        }
        return U(i3, tui0VarY3, new nvi0(z), R(sb2.toString(), R.drawable.ic_glyph_language, z));
    }

    public static final void a(mm40 mm40Var, bhl0 bhl0Var, ahl0 ahl0Var, Function0 function0, fet fetVar, int i) {
        qe80 qe80Var;
        fetVar.g0(712536614);
        byte b = 4;
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(bhl0Var) ? 32 : 16) | (fetVar.g(ahl0Var) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 >> 6;
            ahl0Var.getClass();
            boolean z = (((i3 & 14) ^ 6) > 4 && fetVar.g(ahl0Var)) || (i3 & 6) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                if (ahl0Var instanceof zgl0) {
                    pz40 pz40Var = s6t0.f31722a;
                    qe80Var = new qe80(s6t0.b().f33626a.getBackgroundContent(), s6t0.b().f33626a.getSeparator(), s6t0.b().f33626a.getSecondary(), s6t0.b().f33626a.getSecondary());
                } else if (!(ahl0Var instanceof ygl0)) {
                    t9f.b();
                    return;
                } else {
                    pz40 pz40Var2 = s6t0.f31722a;
                    StaticColors staticColors = StaticColors.INSTANCE;
                    qe80Var = new qe80(staticColors.m125getWhite100d7_KjU(), staticColors.m126getWhite200d7_KjU(), staticColors.m130getWhite600d7_KjU(), staticColors.m130getWhite600d7_KjU());
                }
                objP = qe80Var;
                fetVar.o0(objP);
            }
            qe80 qe80Var2 = (qe80) objP;
            b(mm40Var, qe80Var2.f28571a, qe80Var2.b, function0, u1c.M(-826620390, new nhl0(bhl0Var, qe80Var2, b), fetVar), u1c.M(-64739079, new rqc0(qe80Var2, (byte) 23), fetVar), fetVar, 221184 | (i2 & 14) | (i2 & 7168));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dfc0((byte) 29, i, (Object) mm40Var, (Object) bhl0Var, (Object) ahl0Var, (Object) function0);
        }
    }

    public static final ouj0 a0(cit0 cit0Var, long j, long j2, int i, String str) {
        cit0Var.getClass();
        str.getClass();
        pn40 pn40Var = pn40.f27267a;
        String strC = pn40.c(cit0Var.m, p3u0.c);
        boolean z = cit0Var.t;
        List<m97> list = cit0Var.e;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (m97 m97Var : list) {
            std stdVar = gwe.b;
            arrayList.add(xia0.d0(m97Var, 13));
        }
        int i2 = cit0Var.r;
        int i3 = cit0Var.c;
        boolean z2 = cit0Var.s;
        List list2 = cit0Var.D;
        List list3 = cit0Var.h;
        long j3 = cit0Var.w;
        String str2 = cit0Var.A;
        String str3 = cit0Var.u;
        q4f.f28094a.getClass();
        return new ouj0(j, j2, strC, z, arrayList, i2, i3, z2, list2, list3, j3, i, false, false, str2, str3, null, "", nwd.b(i2), false, false, Boolean.TRUE, str, cit0Var.L, cit0Var.g0);
    }

    public static final void b(mm40 mm40Var, long j, long j2, Function0 function0, ugd ugdVar, ugd ugdVar2, fet fetVar, int i) {
        int i2;
        fetVar.g0(991296697);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.f(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = (i2 & 7168) == 2048;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new xhl0(function0, (byte) 3);
                fetVar.o0(objP2);
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = y860.W(jm40Var, gy40Var, null, false, null, (Function0) objP2, 28);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarW, 0.0f, 6.0f, 1);
            zcl zclVar2 = qmk.h;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = i120.Q(o7k0.e(i120.S(mm40VarL, 1.0f, j2, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 36.0f), j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)).e(mm40Var);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            mm40 mm40VarJ = s5x0.J(jr8.f16991a.b(jm40Var, gqw0.e), 8.0f);
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarJ);
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
            Object objValueOf = Integer.valueOf(((i2 >> 9) & 112) | 6);
            zhg0 zhg0Var = zhg0.f44392a;
            ugdVar.F(zhg0Var, fetVar, objValueOf);
            h97.p(((i2 >> 12) & 112) | 6, ugdVar2, zhg0Var, fetVar, true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vv2(mm40Var, j, j2, function0, ugdVar, ugdVar2, i, (byte) 2);
        }
    }

    public static final n4m0 b0(ctf0 ctf0Var, v12 v12Var) {
        ctf0Var.getClass();
        lsm0 lsm0Var = ctf0Var.b;
        uui0 uui0Var = new uui0(lsm0Var.a(R.string.statistic_stage_header, Arrays.copyOf(new Object[0], 0)), null, lsm0Var.a(R.string.find_out_teams_position, Arrays.copyOf(new Object[0], 0)), null, null, 58);
        Integer numValueOf = Integer.valueOf(R.drawable.ic_info_tabble);
        m0x m0xVar = new m0x(R.drawable.ic_info_tabble, null, 6);
        pz40 pz40Var = s6t0.f31722a;
        return new n4m0(new rqm((vui0) uui0Var, (pui0) new nui0(numValueOf, null, m0xVar, new y3d(s6t0.b().f33626a.getPrimary()), null, null, 0.0f, 242), (pvi0) null, (d4d) null, (tvi0) null, (wui0) null, true, (e900) null, Response.ALTERNATIVE_SERVICE), v12Var);
    }

    public static final void c(ir8 ir8Var, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-154750085);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(ir8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarB = ir8Var.b(jm40.b, gqw0.c);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarR = ffb0.R(mm40VarB, 0.0f, -6.0f, 1);
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarR);
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
            h97.p((i2 & 112) | 6, ugdVar, zhg0.f44392a, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mhl0(ir8Var, ugdVar, i, b);
        }
    }

    public static final y9q0 c0(y9q0 y9q0Var) {
        eo80 eo80Var = y9q0Var.b;
        smk0 smk0Var = y9q0Var.f42262a;
        return (daq0.e(eo80Var.c) && daq0.e(smk0Var.b)) ? y9q0.a(y9q0Var, 0L, 0L, null, null, null, 0L, null, null, 0, 0, idm0.v(daq0.c(eo80Var.c) / daq0.c(smk0Var.b), 8589934592L), null, null, 16646143) : y9q0Var;
    }

    public static final void d(t1y t1yVar, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(-342440935);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(t1yVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            long jM139getBackgroundContent0d7_KjU = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(mm40VarD, jM139getBackgroundContent0d7_KjU, vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarK = s5x0.K(o7k0.d(jm40Var, 1.0f), 12.0f, 10.0f);
            wul wulVar = t1yVar.i;
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new u9x(function1, (byte) 9);
                fetVar.o0(objP);
            }
            qzb.n(mm40VarK, wulVar, (Function0) objP, fetVar, 0, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j1y(t1yVar, function1, i, (byte) 2);
        }
    }

    public static final void e(mm40 mm40Var, Function2 function2, Function2 function3, Function2 function4, Function2 function5, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1992997102);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function5) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = r71.C;
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
            if (function2 == null) {
                fetVar.e0(1118140766);
                fetVar.r(false);
            } else {
                fetVar.e0(-2042140925);
                h97.q((i2 >> 3) & 14, fetVar, function2, false);
            }
            if (function3 == null) {
                fetVar.e0(1118173502);
                fetVar.r(false);
            } else {
                fetVar.e0(-2042139869);
                h97.q((i2 >> 6) & 14, fetVar, function3, false);
            }
            if (function4 == null) {
                fetVar.e0(1118209214);
                fetVar.r(false);
            } else {
                fetVar.e0(-2042138717);
                h97.q((i2 >> 9) & 14, fetVar, function4, false);
            }
            if (function5 == null) {
                fetVar.e0(1118246910);
                fetVar.r(false);
            } else {
                fetVar.e0(-2042137501);
                h97.q((i2 >> 12) & 14, fetVar, function5, false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjp((Object) mm40Var, (Object) function2, (Object) function3, (Object) function4, (Object) function5, i, (byte) 11);
        }
    }

    public static final void f(mm40 mm40Var, pz40 pz40Var, pil0 pil0Var, Function0 function0, Function0 function1, fet fetVar, int i) {
        int i2;
        Object re80Var;
        long jM156getPrimary600d7_KjU;
        Object mf5Var;
        fetVar.g0(-998770148);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(pz40Var) ? 32 : 16) | (fetVar.g(pil0Var) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            ahl0 ahl0VarC = pil0Var.c();
            ahl0VarC.getClass();
            boolean zG = fetVar.g(ahl0VarC);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                if (ahl0VarC instanceof zgl0) {
                    pz40 pz40Var2 = s6t0.f31722a;
                    zgl0 zgl0Var = (zgl0) ahl0VarC;
                    re80Var = new re80(s6t0.b().f33626a.getBackgroundContent(), s6t0.b().f33626a.getSeparator(), s6t0.b().f33626a.getPrimary20(), s6t0.b().f33626a.getPrimary60(), zgl0Var.f44350a, zgl0Var.b, s6t0.b().f33626a.getBackgroundContent(), s6t0.b().f33626a.getSeparator(), s6t0.b().f33626a.getSecondary(), s6t0.b().f33626a.getSecondary());
                } else {
                    if (!(ahl0VarC instanceof ygl0)) {
                        t9f.b();
                        return;
                    }
                    pz40 pz40Var3 = s6t0.f31722a;
                    StaticColors staticColors = StaticColors.INSTANCE;
                    ygl0 ygl0Var = (ygl0) ahl0VarC;
                    re80Var = new re80(staticColors.m125getWhite100d7_KjU(), staticColors.m126getWhite200d7_KjU(), staticColors.m126getWhite200d7_KjU(), staticColors.m130getWhite600d7_KjU(), ygl0Var.f42591a, ygl0Var.b, staticColors.m62getBlack0d7_KjU(), staticColors.m129getWhite400d7_KjU(), staticColors.m130getWhite600d7_KjU(), staticColors.m130getWhite600d7_KjU());
                }
                fetVar.o0(re80Var);
            } else {
                i3 = i3;
                re80Var = objP;
            }
            re80 re80Var2 = (re80) re80Var;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = jgk0.b(new zhl0(pz40Var, (byte) 6));
                fetVar.o0(objP2);
            }
            l7m0 l7m0Var = (l7m0) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = jgk0.b(new zhl0(pz40Var, (byte) 7));
                fetVar.o0(objP3);
            }
            l7m0 l7m0Var2 = (l7m0) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = jgk0.b(new zhl0(pz40Var, (byte) 1));
                fetVar.o0(objP4);
            }
            l7m0 l7m0Var3 = (l7m0) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var) {
                objP5 = jgk0.b(new zhl0(pz40Var, (byte) 2));
                fetVar.o0(objP5);
            }
            l7m0 l7m0Var4 = (l7m0) objP5;
            Object objP6 = fetVar.P();
            byte b = 3;
            if (objP6 == cl5Var) {
                objP6 = jgk0.b(new zhl0(pz40Var, b));
                fetVar.o0(objP6);
            }
            l7m0 l7m0Var5 = (l7m0) objP6;
            Object objP7 = fetVar.P();
            if (objP7 == cl5Var) {
                objP7 = jgk0.b(new zhl0(pz40Var, (byte) 4));
                fetVar.o0(objP7);
            }
            l7m0 l7m0Var6 = (l7m0) objP7;
            Object objP8 = fetVar.P();
            if (objP8 == cl5Var) {
                objP8 = jgk0.b(new zhl0(pz40Var, (byte) 5));
                fetVar.o0(objP8);
            }
            l7m0 l7m0Var7 = (l7m0) objP8;
            Object objP9 = fetVar.P();
            if (objP9 == cl5Var) {
                objP9 = jgk0.b(new hhl0(pz40Var, l7m0Var5, l7m0Var6, (byte) 8));
                fetVar.o0(objP9);
            }
            l7m0 l7m0Var8 = (l7m0) objP9;
            Object objP10 = fetVar.P();
            if (objP10 == cl5Var) {
                objP10 = jgk0.b(new hhl0(pz40Var, l7m0Var5, l7m0Var6, (byte) 9));
                fetVar.o0(objP10);
            }
            l7m0 l7m0Var9 = (l7m0) objP10;
            if (((Boolean) l7m0Var7.getValue()).booleanValue() && (pil0Var.c() instanceof zgl0)) {
                pz40 pz40Var4 = s6t0.f31722a;
                jM156getPrimary600d7_KjU = s6t0.b().f33626a.getPrimary60();
            } else {
                jM156getPrimary600d7_KjU = re80Var2.h;
            }
            long j = re80Var2.g;
            long j2 = re80Var2.i;
            boolean zF = fetVar.f(jM156getPrimary600d7_KjU) | fetVar.f(j) | fetVar.f(j2);
            long j3 = jM156getPrimary600d7_KjU;
            Object objP11 = fetVar.P();
            if (zF || objP11 == cl5Var) {
                objP11 = new r1m(j3, re80Var2.g, re80Var2.i);
                fetVar.o0(objP11);
            }
            r1m r1mVar = (r1m) objP11;
            boolean zF2 = fetVar.f(j3) | fetVar.f(j);
            Object objP12 = fetVar.P();
            if (zF2 || objP12 == cl5Var) {
                objP12 = new l1m(j3, j);
                fetVar.o0(objP12);
            }
            l1m l1mVar = (l1m) objP12;
            boolean zF3 = fetVar.f(j3) | fetVar.f(j) | fetVar.f(j2);
            Object objP13 = fetVar.P();
            if (zF3 || objP13 == cl5Var) {
                objP13 = new c1m(j3, re80Var2.g, re80Var2.i);
                fetVar.o0(objP13);
            }
            c1m c1mVar = (c1m) objP13;
            boolean zF4 = fetVar.f(j3) | fetVar.f(j);
            Object objP14 = fetVar.P();
            if (zF4 || objP14 == cl5Var) {
                objP14 = new tsl(new rsl(j3, j));
                fetVar.o0(objP14);
            }
            tsl tslVar = (tsl) objP14;
            boolean zF5 = fetVar.f(j3) | fetVar.f(j);
            Object objP15 = fetVar.P();
            if (zF5 || objP15 == cl5Var) {
                objP15 = new usl(new rsl(j3, j));
                fetVar.o0(objP15);
            }
            usl uslVar = (usl) objP15;
            boolean zG2 = fetVar.g(pil0Var.c());
            Object objP16 = fetVar.P();
            if (zG2 || objP16 == cl5Var) {
                ahl0 ahl0VarC2 = pil0Var.c();
                if (ahl0VarC2 != null) {
                    if (ahl0VarC2 instanceof zgl0) {
                        mf5Var = new lf5(3, null);
                    } else if (ahl0VarC2 instanceof ygl0) {
                        mf5Var = new mf5();
                    }
                    objP16 = mf5Var;
                    fetVar.o0(objP16);
                }
                t9f.b();
                return;
            }
            nf5 nf5Var = (nf5) objP16;
            long j4 = re80Var2.f30323a;
            long j5 = re80Var2.b;
            long j6 = re80Var2.c;
            long j7 = re80Var2.d;
            ugd ugdVarM = u1c.M(1180711311, new ghl0(l7m0Var4, nf5Var, l7m0Var3, l7m0Var, pil0Var, re80Var2, l7m0Var2, c1mVar, l7m0Var5, r1mVar, l7m0Var6, l1mVar, l7m0Var8, tslVar, l7m0Var9, uslVar), fetVar);
            int i4 = i3 << 12;
            g(mm40Var, l7m0Var3, l7m0Var7, j4, j5, j6, j7, function0, function1, ugdVarM, fetVar, (i3 & 14) | 805306800 | (29360128 & i4) | (i4 & 234881024));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gja(mm40Var, pz40Var, pil0Var, function0, function1, i, (byte) 10);
        }
    }

    public static final void g(final mm40 mm40Var, final l7m0 l7m0Var, final l7m0 l7m0Var2, final long j, final long j2, final long j3, final long j4, final Function0 function0, final Function0 function1, final ugd ugdVar, fet fetVar, final int i) {
        int i2;
        boolean z;
        Pair pair;
        fetVar.g0(-2116139572);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        int i3 = i2;
        if ((i & 384) == 0) {
            i3 |= fetVar.g(l7m0Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar.f(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= fetVar.f(j2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= fetVar.f(j3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= fetVar.f(j4) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= fetVar.i(function0) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= fetVar.i(function1) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= fetVar.i(ugdVar) ? 536870912 : 268435456;
        }
        if (fetVar.U(i3 & 1, (i3 & 306783379) != 306783378)) {
            boolean z2 = l7m0Var.getValue() == k0d.b;
            Context context = (Context) fetVar.k(dy2.b);
            if (((Boolean) l7m0Var2.getValue()).booleanValue()) {
                z = true;
                pair = new Pair(new y3d(j3), new y3d(j4));
            } else {
                z = true;
                pair = new Pair(new y3d(j), new y3d(j2));
            }
            long j5 = ((y3d) pair.f46059a).f41946a;
            long j6 = ((y3d) pair.b).f41946a;
            mm40 mm40VarE0 = o2e.e0(epv0.N(jm40.b, z2 != 0 ? 0.5f : 1.0f), "COMPACT_CARD_SPORT_EXPRESS_MARKET_TAG");
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            Object objJ = objP;
            if (objP == obj) {
                objJ = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objJ;
            boolean z3 = !z2;
            boolean zI = ((i3 & 234881024) == 67108864 ? z : false) | fetVar.i(context);
            Object objP2 = fetVar.P();
            Object obj2 = objP2;
            if (zI || objP2 == obj) {
                Object jhl0Var = new jhl0(function1, context, (byte) 4);
                fetVar.o0(jhl0Var);
                obj2 = jhl0Var;
            }
            Function0 function2 = (Function0) obj2;
            boolean z4 = (i3 & 29360128) == 8388608 ? z : false;
            Object objP3 = fetVar.P();
            Object obj3 = objP3;
            if (z4 || objP3 == obj) {
                Object xhl0Var = new xhl0(function0, (byte) 2);
                fetVar.o0(xhl0Var);
                obj3 = xhl0Var;
            }
            mm40 mm40VarZ = y860.Z(mm40VarE0, gy40Var, z3, function2, (Function0) obj3, 440);
            zcl zclVar = qmk.f28987a;
            boolean z5 = z;
            mm40 mm40VarB = o7k0.b(s5x0.L(mm40VarZ, 0.0f, 6.0f, z5 ? 1 : 0), 0.0f, 36.0f, z5 ? 1 : 0);
            boolean zF = fetVar.f(j5) | fetVar.f(j6);
            Object objP4 = fetVar.P();
            if (zF || objP4 == obj) {
                objP4 = new lf4((byte) 10, j5, j6);
                fetVar.o0(objP4);
            }
            mm40 mm40VarE = rq8.K(mm40VarB, (Function1) objP4).e(mm40Var);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            ua80.p(((i3 >> 24) & 112) | 6, ugdVar, jr8.f16991a, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.ail0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int iL = x8x.L(i | 1);
                    r8x.g(mm40Var, l7m0Var, l7m0Var2, j, j2, j3, j4, function0, function1, ugdVar, (fet) obj4, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void h(t1y t1yVar, Function1 function1, fet fetVar, int i) {
        int i2;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1051435779);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(t1yVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.i(function1) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(s5x0.L(jm40Var, 8.0f, 0.0f, 2), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), vgg0.a(20.0f));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            int i3 = i2;
            kn5 kn5Var = t1yVar.b;
            wul wulVar = t1yVar.h;
            int i4 = i3 & 112;
            boolean z3 = i4 == 32;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new u9x(function1, (byte) 10);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z4 = i4 == 32;
            Object objP2 = fetVar2.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new u9x(function1, (byte) 11);
                fetVar2.o0(objP2);
            }
            y(kn5Var, wulVar, function0, (Function0) objP2, fetVar2, 0);
            vtb.t(null, qqm.b, null, 0L, fetVar, 48, 13);
            wvb.o(null, 12.0f, 0L, fetVar, 0, 5);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            ox6 ox6Var = t1yVar.c;
            qln0 qln0Var = ox6Var.d;
            hx6 hx6Var = ox6Var.e;
            i8k0 i8k0Var = t1yVar.d;
            String str = t1yVar.f;
            boolean z5 = i4 == 32;
            Object objP3 = fetVar.P();
            if (z5 || objP3 == cl5Var) {
                objP3 = new i1y(function1, (byte) 0);
                fetVar.o0(objP3);
            }
            Function1 function2 = (Function1) objP3;
            boolean z6 = i4 == 32;
            Object objP4 = fetVar.P();
            if (z6 || objP4 == cl5Var) {
                z = true;
                objP4 = new i1y(function1, 1 == true ? 1 : 0);
                fetVar.o0(objP4);
            } else {
                z = true;
            }
            f1t0.d(mm40VarD, ox6Var, qln0Var, hx6Var, i8k0Var, str, function2, (Function1) objP4, fetVar, 6);
            fetVar2 = fetVar;
            fetVar2.r(z);
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j1y(t1yVar, function1, i, (byte) 0);
        }
    }

    public static final void i(mm40 mm40Var, beo beoVar, Function2 function2, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        beoVar.getClass();
        fetVar.g0(1614126844);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(beoVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function2) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
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
            tvw tvwVar = beoVar.c;
            zcl zclVar = qmk.f28987a;
            feb.y(tvwVar, 24.0f, fetVar, 0);
            mm40 mm40VarE0 = o2e.e0(o7k0.g(s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14), 32.0f, 0.0f, 2), "EVENT_CARD_CHAMP_LABEL");
            x5d x5dVarA2 = w5d.a(uc9.e, xx7Var, fetVar, 6);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE0);
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
            int i3 = i2;
            v8q0.a(beoVar.d, null, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            if (function2 == null) {
                fetVar2.e0(1122422829);
                fetVar2.r(false);
            } else {
                fetVar2.e0(36207188);
                h97.q((i3 >> 6) & 14, fetVar2, function2, false);
            }
            ohs0.x(fetVar2, true, true, true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r3o((Object) mm40Var, (Object) beoVar, (Object) function2, i, (byte) 17);
        }
    }

    public static final void j(t1y t1yVar, Function1 function1, fet fetVar, int i) {
        int i2;
        Function1 function2;
        byte b;
        fet fetVar2 = fetVar;
        fetVar2.g0(307674497);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(t1yVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.i(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, 8.0f, 0.0f, 2);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarN = s5x0.N(i120.Q(mm40VarL, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), vgg0.a(16.0f)), 0.0f, 10.0f, 0.0f, 8.0f, 5);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD);
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
            mm40 mm40VarH = dw9.h(1.0f, s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14), true);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarH);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            qjx qjxVar = t1yVar.e;
            String str = qjxVar.f28861a;
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            y9q0 y9q0VarA = y9q0.a(g1t0.m(), ((ThemeColors) fetVar.k(zfnVar)).getWarning(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
            long j = qmk.o;
            long j2 = qmk.r;
            long j3 = qmk.n;
            b = 1;
            v8q0.a(str, null, 0L, new n05(j, j2, j3), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarA, fetVar, 0, 24960, 110582);
            mm40 mm40VarL2 = s5x0.L(jm40Var, 0.0f, 2.0f, 1);
            String str2 = qjxVar.b;
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            v8q0.a(str2, mm40VarL2, 0L, new n05(j, j2, j3), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.h(), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0, 24960, 110580);
            fetVar.r(true);
            mm40 mm40VarH2 = phu0.H(s5x0.N(jm40Var, 12.0f, 0.0f, 8.0f, 0.0f, 10), null, 1);
            wul wulVar = new wul(iul.e, oe9.c, new ve9(qjxVar.c, R.drawable.ic_glyph_plus_small), true, false, false);
            boolean z2 = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                function2 = function1;
                objP = new u9x(function2, (byte) 8);
                fetVar.o0(objP);
            } else {
                function2 = function1;
            }
            fetVar2 = fetVar;
            qzb.n(mm40VarH2, wulVar, (Function0) objP, fetVar2, 0, 0);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            function2 = function1;
            b = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j1y(t1yVar, function2, i, b);
        }
    }

    public static final void k(mm40 mm40Var, t1y t1yVar, Function1 function1, fet fetVar, int i) {
        t1yVar.getClass();
        function1.getClass();
        fetVar.g0(1920873527);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(t1yVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new u9x(function1, (byte) 6);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new u9x(function1, (byte) 7);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            l(mm40Var, t1yVar, function1, fetVar, i2 & 1022);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hpr(mm40Var, t1yVar, function1, i, (byte) 18);
        }
    }

    public static final void l(mm40 mm40Var, t1y t1yVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        int i2;
        t1yVar.getClass();
        function1.getClass();
        fetVar.g0(264668424);
        if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i2 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(t1yVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarW = o7k0.w(jm40.b, null, false, 3);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
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
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            idx.b(null, t1yVar.g, fetVar, 0);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(s5x0.N(mm40Var2, 0.0f, 136.0f, 0.0f, 0.0f, 13), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12));
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
            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
            x(t1yVar.f33192a, fetVar, 0);
            if (t1yVar.k) {
                fetVar.e0(-1060396434);
                j(t1yVar, function1, fetVar, (i3 >> 3) & 126);
                fetVar.r(false);
            } else {
                fetVar.e0(-1060327242);
                fetVar.r(false);
            }
            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
            int i4 = (i3 >> 3) & 126;
            h(t1yVar, function1, fetVar, i4);
            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
            d(t1yVar, function1, fetVar, i4);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r3o((Object) mm40Var, (Object) t1yVar, (Object) function1, i, (byte) 18);
        }
    }

    public static final void m(mm40 mm40Var, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1035745923);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40.b, 40.0f), 1.0f);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40VarD, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            qw3 qw3Var = new qw3(24.0f, true, new jf4((byte) 14));
            lh80 lh80VarT = s5x0.t(qmk.a(fetVar).d, 0.0f, 2);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new tr20(b);
                fetVar.o0(objP);
            }
            b8k0.f(null, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 817889280, 363);
            fetVar.r(true);
            ugdVar.invoke(fetVar, 6);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gn8(mm40Var, ugdVar, i, (byte) 3);
        }
    }

    public static final void n(mm40 mm40Var, p3w p3wVar, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2;
        ugd ugdVar;
        ugd ugdVar2;
        ugd ugdVar3;
        fetVar.g0(2089547814);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(p3wVar) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            ugd ugdVarM = null;
            if (p3wVar.s.length() > 0) {
                fetVar.e0(-1536804761);
                ugd ugdVarM2 = u1c.M(-1049210153, new c61(p3wVar, (byte) 7), fetVar);
                fetVar.r(false);
                ugdVar = ugdVarM2;
            } else {
                fetVar.e0(-1536408736);
                fetVar.r(false);
                ugdVar = null;
            }
            if (p3wVar.u.length() > 0) {
                fetVar.e0(-1536302406);
                ugd ugdVarM3 = u1c.M(-926306216, new c61(p3wVar, (byte) 8), fetVar);
                fetVar.r(false);
                ugdVar2 = ugdVarM3;
            } else {
                fetVar.e0(-1536016896);
                fetVar.r(false);
                ugdVar2 = null;
            }
            if (p3wVar.v.length() > 0) {
                fetVar.e0(-1535905141);
                ugd ugdVarM4 = u1c.M(-803402279, new c61(p3wVar, (byte) 9), fetVar);
                fetVar.r(false);
                ugdVar3 = ugdVarM4;
            } else {
                fetVar.e0(-1535635968);
                fetVar.r(false);
                ugdVar3 = null;
            }
            if (p3wVar.t.length() > 0) {
                fetVar.e0(-1535495662);
                ugdVarM = u1c.M(-680498342, new c61(p3wVar, (byte) 10), fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(-1534341408);
                fetVar.r(false);
            }
            mm40Var2 = mm40Var;
            fetVar2 = fetVar;
            e(mm40Var2, ugdVar, ugdVar2, ugdVar3, ugdVarM, fetVar2, i2 & 14);
        } else {
            mm40Var2 = mm40Var;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d61(mm40Var2, p3wVar, i, b);
        }
    }

    public static final void o(mm40 mm40Var, ahl0 ahl0Var, Function0 function0, fet fetVar, int i) {
        int i2;
        se80 se80Var;
        fetVar.g0(2061035313);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(ahl0Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 >> 3;
            ahl0Var.getClass();
            boolean z = (((i4 & 14) ^ 6) > 4 && fetVar.g(ahl0Var)) || (i4 & 6) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                if (ahl0Var instanceof zgl0) {
                    pz40 pz40Var = s6t0.f31722a;
                    se80Var = new se80(s6t0.b().f33626a.getBackgroundContent(), s6t0.b().f33626a.getSeparator(), s6t0.b().f33626a.getSecondary());
                } else if (!(ahl0Var instanceof ygl0)) {
                    t9f.b();
                    return;
                } else {
                    pz40 pz40Var2 = s6t0.f31722a;
                    StaticColors staticColors = StaticColors.INSTANCE;
                    se80Var = new se80(staticColors.m125getWhite100d7_KjU(), staticColors.m126getWhite200d7_KjU(), staticColors.m130getWhite600d7_KjU());
                }
                objP = se80Var;
                fetVar.o0(objP);
            }
            se80 se80Var2 = (se80) objP;
            p(mm40Var, se80Var2.f32066a, se80Var2.b, function0, u1c.M(216341419, new rqc0(se80Var2, (byte) 24), fetVar), fetVar, (i3 & 14) | 24576 | ((i3 << 3) & 7168));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new thl0(mm40Var, ahl0Var, function0, i, (byte) 2);
        }
    }

    public static final void p(mm40 mm40Var, long j, long j2, Function0 function0, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-503998600);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.f(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = (i2 & 7168) == 2048;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new xhl0(function0, b);
                fetVar.o0(objP2);
            }
            mm40 mm40VarW = y860.W(jm40.b, gy40Var, null, false, null, (Function0) objP2, 28);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarW, 0.0f, 6.0f, 1);
            zcl zclVar2 = qmk.h;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = i120.Q(o7k0.e(i120.S(mm40VarL, 1.0f, j2, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 36.0f), j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)).e(mm40Var);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            ua80.p(((i2 >> 9) & 112) | 6, ugdVar, jr8.f16991a, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p0m(mm40Var, j, j2, function0, ugdVar, i);
        }
    }

    public static final void q(mm40 mm40Var, ex40 ex40Var, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1822386367);
        int i2 = i | 6 | (fetVar2.g(ex40Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarD, 8.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
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
            A(null, ex40Var.f8560a, ex40Var.b, fetVar2, 0, 1);
            A(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), ex40Var.c, ex40Var.d, fetVar, 0, 0);
            v8q0.a(ex40Var.e, s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), fetVar), fetVar, 0, 24960, 110588);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba30(mm40Var2, ex40Var, i, (byte) 15);
        }
    }

    public static final void r(mm40 mm40Var, deo0 deo0Var, a4x a4xVar, ucr0 ucr0Var, fet fetVar, int i) {
        fet fetVar2;
        fet fetVar3 = fetVar;
        deo0Var.getClass();
        a4xVar.getClass();
        fetVar3.g0(156293248);
        int i2 = 2;
        int i3 = i | (fetVar3.g(mm40Var) ? 4 : 2) | (fetVar3.g(deo0Var) ? 32 : 16) | (fetVar3.g(a4xVar) ? 256 : 128) | (fetVar3.g(ucr0Var) ? 2048 : 1024);
        boolean z = false;
        boolean z2 = true;
        if (fetVar3.U(i3 & 1, (i3 & 1171) != 1170)) {
            thg0 thg0VarA = shg0.a(ucr0Var.f, gqw0.k, fetVar3, 48);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40Var);
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
            Iterator itO = h97.o(fetVar3, mm40VarC0, gqw0.v, 669628937, a4xVar);
            while (itO.hasNext()) {
                ceo0 ceo0Var = (ceo0) itO.next();
                mm40 mm40VarL = s5x0.L(jm40.b, ucr0Var.c, 0.0f, i2);
                ycl yclVar = (ycl) ucr0Var.b.get(new kcm0(ceo0Var.f4222a));
                mm40 mm40VarS = o7k0.s(mm40VarL, yclVar != null ? yclVar.f42389a : ucr0Var.d);
                String str = (String) deo0Var.i.get(new kcm0(ceo0Var.f4222a));
                if (str == null) {
                    str = "";
                }
                if (str.length() == 0) {
                    str = "-";
                }
                pz40 pz40Var = s6t0.f31722a;
                qrq qrqVar = j1t0.c;
                long j = qmk.r;
                fet fetVar4 = fetVar3;
                v8q0.a(str, mm40VarS, s6t0.b().f33626a.getTextPrimary(), new n05(qmk.o, j, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, qmk.F, 16646109), fetVar4, 0, 24960, 109552);
                z = z;
                z2 = z2;
                fetVar3 = fetVar4;
                i2 = 2;
            }
            fetVar2 = fetVar3;
            fetVar2.r(z);
            fetVar2.r(z2);
        } else {
            fetVar2 = fetVar3;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pd50((byte) 26, i, (Object) mm40Var, (Object) deo0Var, (Object) a4xVar, (Object) ucr0Var);
        }
    }

    public static final void s(ba50 ba50Var, ugd ugdVar, fet fetVar, int i) {
        ba50Var.getClass();
        fetVar.g0(-285798923);
        int i2 = (fetVar.g(ba50Var) ? 4 : 2) | i | 48;
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            obc.e(new l5d0[]{ca50.f3992a.a(ba50Var), ka50.f17948a.a(new ja50())}, u1c.M(-1912671947, new w(ugdVar, (byte) 26), fetVar), fetVar, 48);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j5d0(ba50Var, ugdVar, i, b);
        }
    }

    public static final wfg0 t(float f, float f2, float f3, float f4, float f5, float f6) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        return new wfg0(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final wfg0 u(jge0 jge0Var, long j, long j2, long j3, long j4) {
        return new wfg0(jge0Var.f16474a, jge0Var.b, jge0Var.c, jge0Var.d, j, j2, j3, j4);
    }

    public static final wfg0 v(float f, float f2, float f3, float f4, long j) {
        return t(f, f2, f3, f4, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final void w(fqh0 fqh0Var, boolean z, boolean z2, Function1 function1, mm40 mm40Var, fet fetVar, int i) {
        boolean z3;
        boolean z4;
        fet fetVar2;
        fqh0Var.getClass();
        function1.getClass();
        fetVar.g0(828800446);
        int i2 = (fetVar.g(fqh0Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            z3 = z;
            i2 |= fetVar.h(z3) ? 32 : 16;
        } else {
            z3 = z;
        }
        if ((i & 384) == 0) {
            z4 = z2;
            i2 |= fetVar.h(z4) ? 256 : 128;
        } else {
            z4 = z2;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        int i3 = i2 | (fetVar.g(mm40Var) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = i3 & 7168;
            int i5 = i3 & 14;
            boolean z5 = (i4 == 2048) | (i5 == 4);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z5 || objP == cl5Var) {
                objP = new x6h0(function1, fqh0Var, (byte) 5);
                fetVar.o0(objP);
            }
            mm40 mm40VarY = y860.Y(mm40Var, false, null, null, (Function0) objP, 15);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarY);
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
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = jqh0.f16954a;
                fetVar.o0(objP2);
            }
            xdr xdrVar = (xdr) ((jhy) objP2);
            boolean z6 = (i5 == 4) | (i4 == 2048) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objP3 = fetVar.P();
            if (z6 || objP3 == cl5Var) {
                bt8 bt8Var = new bt8(z3, z4, (hqh0) fqh0Var, function1, (byte) 3);
                fetVar.o0(bt8Var);
                objP3 = bt8Var;
            }
            fetVar2 = fetVar;
            y860.f(xdrVar, null, (Function1) objP3, fetVar2, 6, 2);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gbn0(fqh0Var, z, z2, function1, mm40Var, i);
        }
    }

    public static final void x(e0s e0sVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(947167123);
        int i2 = i | (fetVar2.g(e0sVar) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, 8.0f, 0.0f, 2);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarN = s5x0.N(i120.Q(mm40VarL, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), vgg0.a(20.0f)), 0.0f, 10.0f, 0.0f, 8.0f, 5);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            wvb.o(null, 12.0f, 0L, fetVar2, 0, 5);
            mm40 mm40VarK = s5x0.K(o7k0.d(jm40Var, 1.0f), 12.0f, 4.0f);
            thg0 thg0VarA = shg0.a(new qw3(6.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarK);
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
            String str = e0sVar.c;
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str, x7zVar, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.g(), ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0, 24960, 110588);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar2 = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            String str2 = e0sVar.f7003a;
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            v8q0.a(str2, x7zVar2, 0L, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, y9q0.a(g1t0.r(), ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0, 24960, 109564);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xxv(e0sVar, i, (byte) 21);
        }
    }

    public static final void y(kn5 kn5Var, wul wulVar, Function0 function0, Function0 function1, fet fetVar, int i) {
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1857722263);
        int i2 = i | (fetVar2.g(kn5Var) ? 4 : 2) | (fetVar2.g(wulVar) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarH = phu0.H(s5x0.K(mm40VarD, 12.0f, 10.0f), null, 1);
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarH);
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
            boolean z3 = (i2 & 896) == 256;
            Object objP = fetVar2.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new dbn(function0, (byte) 21);
                fetVar2.o0(objP);
            }
            qzb.n(null, wulVar, (Function0) objP, fetVar2, i2 & 112, 1);
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarK = s5x0.K(o7k0.d(zhg0Var.a(1.0f, jm40Var, true), 1.0f), 8.0f, 2.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarK);
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
            boolean z4 = kn5Var.e;
            String str = kn5Var.d;
            String str2 = kn5Var.c;
            if (z4) {
                fetVar2.e0(-1105761188);
                mm40 mm40VarD2 = o7k0.d(y860.W(jm40Var, null, null, false, null, function1, 28), 1.0f);
                thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar, 48);
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarD2);
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
                String str3 = str2 + Separators.SP + str;
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                v8q0.a(str3, zhg0Var.a(1.0f, jm40Var, true), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.m(), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0, 24960, 110588);
                fetVar2 = fetVar;
                fetVar2.r(true);
                fetVar2.r(false);
                z = true;
            } else {
                fetVar2.e0(-1104852547);
                mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                thg0 thg0VarA3 = shg0.a(lw3Var, yx7Var, fetVar2, 48);
                int iHashCode4 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM4 = fetVar2.m();
                mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarD3);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA3, shdVar);
                jpm0.o(fetVar2, bh90VarM4, shdVar2);
                vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC3, shdVar4);
                mm40 mm40VarA = zhg0Var.a(1.0f, jm40Var, true);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                int iHashCode5 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM5 = fetVar2.m();
                mm40 mm40VarC4 = kbc.c0(fetVar2, mm40VarA);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, x5dVarA, shdVar);
                jpm0.o(fetVar2, bh90VarM5, shdVar2);
                vqd.u(iHashCode5, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC4, shdVar4);
                String str4 = kn5Var.f18566a;
                zfn zfnVar = j1t0.e;
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                y9q0 y9q0VarG = g1t0.g();
                zfn zfnVar2 = zaq0.b;
                y9q0 y9q0VarA = y9q0.a(y9q0VarG, ((ThemeColors) fetVar2.k(zfnVar2)).getSecondary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
                z = true;
                v8q0.a(str4, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, y9q0VarA, fetVar, 0, 24576, 114686);
                mm40 mm40VarL = s5x0.L(jm40Var, 0.0f, 2.0f, 1);
                String strL = kng0.l(str2, Separators.SP, str);
                ((g1t0) fetVar.k(zfnVar)).getClass();
                v8q0.a(strL, mm40VarL, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.m(), ((ThemeColors) fetVar.k(zfnVar2)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0, 24960, 110588);
                fetVar2 = fetVar;
                ohs0.x(fetVar2, true, true, false);
            }
            fetVar2.r(z);
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cbr((byte) 9, i, (Object) kn5Var, (Object) wulVar, (Object) function0, (Object) function1);
        }
    }

    public static final void z(int i, fet fetVar, mm40 mm40Var) {
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        xx7 xx7Var = gqw0.m;
        fetVar.g0(-306415141);
        int i2 = (i & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i : i;
        boolean z = true;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarZ = o7k0.z(s5x0.N(mm40Var, qmk.a(fetVar).c, 0.0f, 0.0f, 0.0f, 14), xx7Var, true);
            byte b = 14;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4(b)), gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarZ);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar4);
            jpm0.o(fetVar, bh90VarM, shdVar3);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), shdVar2);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, shdVar);
            fetVar.e0(613389210);
            int i3 = 0;
            while (i3 < 3) {
                zcl zclVar2 = qmk.f28987a;
                x5d x5dVarA = w5d.a(new qw3(4.0f, z, new jf4(b)), xx7Var, fetVar, 0);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                jm40 jm40Var = jm40.b;
                mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA, shdVar4);
                jpm0.o(fetVar, bh90VarM2, shdVar3);
                jpm0.o(fetVar, Integer.valueOf(iHashCode2), shdVar2);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar);
                fetVar.e0(245223087);
                for (int i4 = 0; i4 < 3; i4++) {
                    zcl zclVar3 = qmk.f28987a;
                    zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.e(o7k0.s(jm40Var, 370.0f), 64.0f), vgg0.a(16.0f)), fqj0VarD0));
                }
                fetVar.r(false);
                fetVar.r(true);
                i3++;
                z = true;
                b = 14;
            }
            fetVar.r(false);
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v2w(mm40Var, i, (byte) 22);
        }
    }

    public abstract bsr0 K();

    public vw00 P() {
        return vw00.b;
    }
}
