package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.os.Build;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public abstract class z1x {
    public static final int A(xpg0 xpg0Var, String str) {
        xpg0Var.getClass();
        int columnCount = xpg0Var.getColumnCount();
        int i = 0;
        while (true) {
            if (i >= columnCount) {
                i = -1;
                break;
            }
            if (str.equals(xpg0Var.getColumnName(i))) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return i;
        }
        String strL = hne.l('`', "`", str);
        int columnCount2 = xpg0Var.getColumnCount();
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount2) {
                i2 = -1;
                break;
            }
            if (strL.equals(xpg0Var.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount3 = xpg0Var.getColumnCount();
            String strConcat = Separators.DOT.concat(str);
            String strL2 = hne.l('`', Separators.DOT, str);
            for (int i3 = 0; i3 < columnCount3; i3++) {
                String columnName = xpg0Var.getColumnName(i3);
                if (columnName.length() >= str.length() + 2 && (kotlin.text.c.n(columnName, strConcat, false) || (columnName.charAt(0) == '`' && kotlin.text.c.n(columnName, strL2, false)))) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public static long B(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static final g0g0 C(Throwable th) {
        th.getClass();
        return new g0g0(th);
    }

    public static final void D(x5a x5aVar, ne80 ne80Var, ucs0 ucs0Var) {
        x5aVar.p(ne80Var.f23373a, ucs0Var);
    }

    public static void E(fhl fhlVar, x1x x1xVar, long j) {
        boolean z = x1xVar instanceof oe80;
        l0q l0qVar = l0q.f19214a;
        if (z) {
            jge0 jge0Var = ((oe80) x1xVar).f25111a;
            float f = jge0Var.f16474a;
            fhlVar.K(j, (((long) Float.floatToRawIntBits(jge0Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), O(jge0Var), 1.0f, l0qVar, null, 3);
            return;
        }
        if (!(x1xVar instanceof pe80)) {
            if (x1xVar instanceof ne80) {
                fhlVar.i(((ne80) x1xVar).f23373a, j, 1.0f, l0qVar);
                return;
            } else {
                t9f.b();
                return;
            }
        }
        pe80 pe80Var = (pe80) x1xVar;
        w03 w03Var = pe80Var.b;
        if (w03Var != null) {
            fhlVar.i(w03Var, j, 1.0f, l0qVar);
            return;
        }
        wfg0 wfg0Var = pe80Var.f26840a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (wfg0Var.h >> 32));
        fhlVar.W(j, (((long) Float.floatToRawIntBits(wfg0Var.f39069a)) << 32) | (((long) Float.floatToRawIntBits(wfg0Var.b)) & 4294967295L), (((long) Float.floatToRawIntBits(wfg0Var.b())) << 32) | (((long) Float.floatToRawIntBits(wfg0Var.a())) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), l0qVar, 3);
    }

    public static int F(tna0 tna0Var) {
        tna0Var.getClass();
        sna0 sna0Var = tna0Var.f34224a;
        rna0 rna0Var = tna0Var.b;
        int iOrdinal = sna0Var.ordinal();
        if (iOrdinal == 0) {
            switch (rna0Var) {
                case TWO:
                    return R.drawable.fool_2_spade;
                case THREE:
                    return R.drawable.fool_3_spade;
                case FOUR:
                    return R.drawable.fool_4_spade;
                case FIVE:
                    return R.drawable.fool_5_spade;
                case SIX:
                    return R.drawable.fool_6_spade;
                case SEVEN:
                    return R.drawable.fool_7_spade;
                case EIGHT:
                    return R.drawable.fool_8_spade;
                case NINE:
                    return R.drawable.fool_9_spade;
                case TEN:
                    return R.drawable.fool_10_spade;
                case JACK:
                    return R.drawable.fool_j_spade;
                case QUEEN:
                    return R.drawable.fool_q_spade;
                case KING:
                    return R.drawable.fool_k_spade;
                case ACE:
                    return R.drawable.fool_a_spade;
                case JOKER:
                    return R.drawable.fool_joker_black;
                case UNKNOWN:
                    return R.drawable.card_back;
                default:
                    t9f.b();
                    return 0;
            }
        }
        if (iOrdinal == 1) {
            switch (rna0Var) {
                case TWO:
                    return R.drawable.fool_2_club;
                case THREE:
                    return R.drawable.fool_3_club;
                case FOUR:
                    return R.drawable.fool_4_club;
                case FIVE:
                    return R.drawable.fool_5_club;
                case SIX:
                    return R.drawable.fool_6_club;
                case SEVEN:
                    return R.drawable.fool_7_club;
                case EIGHT:
                    return R.drawable.fool_8_club;
                case NINE:
                    return R.drawable.fool_9_club;
                case TEN:
                    return R.drawable.fool_10_club;
                case JACK:
                    return R.drawable.fool_j_club;
                case QUEEN:
                    return R.drawable.fool_q_club;
                case KING:
                    return R.drawable.fool_k_club;
                case ACE:
                    return R.drawable.fool_a_club;
                case JOKER:
                    return R.drawable.fool_joker_black;
                case UNKNOWN:
                    return R.drawable.card_back;
                default:
                    t9f.b();
                    return 0;
            }
        }
        if (iOrdinal == 2) {
            switch (rna0Var) {
                case TWO:
                    return R.drawable.fool_2_diamond;
                case THREE:
                    return R.drawable.fool_3_diamond;
                case FOUR:
                    return R.drawable.fool_4_diamond;
                case FIVE:
                    return R.drawable.fool_5_diamond;
                case SIX:
                    return R.drawable.fool_6_diamond;
                case SEVEN:
                    return R.drawable.fool_7_diamond;
                case EIGHT:
                    return R.drawable.fool_8_diamond;
                case NINE:
                    return R.drawable.fool_9_diamond;
                case TEN:
                    return R.drawable.fool_10_diamond;
                case JACK:
                    return R.drawable.fool_j_diamond;
                case QUEEN:
                    return R.drawable.fool_q_diamond;
                case KING:
                    return R.drawable.fool_k_diamond;
                case ACE:
                    return R.drawable.fool_a_diamond;
                case JOKER:
                    return R.drawable.fool_joker_red;
                case UNKNOWN:
                    return R.drawable.card_back;
                default:
                    t9f.b();
                    return 0;
            }
        }
        if (iOrdinal != 3) {
            if (iOrdinal == 4) {
                return R.drawable.card_back;
            }
            t9f.b();
            return 0;
        }
        switch (rna0Var) {
            case TWO:
                return R.drawable.fool_2_heart;
            case THREE:
                return R.drawable.fool_3_heart;
            case FOUR:
                return R.drawable.fool_4_heart;
            case FIVE:
                return R.drawable.fool_5_heart;
            case SIX:
                return R.drawable.fool_6_heart;
            case SEVEN:
                return R.drawable.fool_7_heart;
            case EIGHT:
                return R.drawable.fool_8_heart;
            case NINE:
                return R.drawable.fool_9_heart;
            case TEN:
                return R.drawable.fool_10_heart;
            case JACK:
                return R.drawable.fool_j_heart;
            case QUEEN:
                return R.drawable.fool_q_heart;
            case KING:
                return R.drawable.fool_k_heart;
            case ACE:
                return R.drawable.fool_a_heart;
            case JOKER:
                return R.drawable.fool_joker_red;
            case UNKNOWN:
                return R.drawable.card_back;
            default:
                t9f.b();
                return 0;
        }
    }

    public static final SpannableStringBuilder G(String str, String str2) {
        str.getClass();
        str2.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int iV = StringsKt.V(str2, str, 0, false, 6);
        spannableStringBuilder.append((CharSequence) str2).setSpan(new StyleSpan(1), iV, str.length() + iV, 33);
        return spannableStringBuilder;
    }

    public static final double H(int i, List list) {
        String str = (String) CollectionsKt.W(i, list);
        if (str != null) {
            return Double.parseDouble(str);
        }
        return 0.0d;
    }

    public static final double I(b820 b820Var) {
        fo7 fo7Var = b820Var.b;
        if (fo7Var.equals(xn7.b)) {
            gx4 gx4Var = b820Var.f;
            if (gx4Var != null) {
                return gx4Var.c.b.f38133a;
            }
        } else {
            if (fo7Var.equals(co7.b)) {
                return b820Var.d.f31171a.b.f38133a;
            }
            if (!fo7Var.equals(zn7.b)) {
                t9f.b();
                return 0.0d;
            }
        }
        return 0.0d;
    }

    public static final dfa0 J(pxd0 pxd0Var, pxd0 pxd0Var2) {
        String str;
        String str2 = pxd0Var.d;
        qxd0 qxd0Var = pxd0Var.e;
        Integer num = qxd0Var.d;
        qxd0 qxd0Var2 = pxd0Var2.e;
        ffa0 ffa0VarF = uvw.F(num, qxd0Var2.d);
        ffa0 ffa0VarF2 = uvw.F(qxd0Var.f29479a, qxd0Var2.f29479a);
        Integer num2 = qxd0Var.b;
        Integer num3 = qxd0Var2.b;
        if (num2 != null) {
            str = num2 + "";
        } else {
            str = "-";
        }
        return new dfa0(dyb.r0(q3d.j(ffa0VarF, ffa0VarF2, new ffa0(str, uvw.L(num2, num3, true)), uvw.E(qxd0Var.e, qxd0Var2.e, Separators.PERCENT), uvw.F(qxd0Var.c, qxd0Var2.c))), str2);
    }

    public static final ArrayList K(qgy qgyVar) {
        qgyVar.getClass();
        List parameters = qgyVar.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((hre0) obj).n() == aiy.d) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final ijl L(kg kgVar) {
        int iOrdinal = kgVar.ordinal();
        if (iOrdinal == 0) {
            return ijl.f14880a;
        }
        if (iOrdinal == 1) {
            return ijl.b;
        }
        if (iOrdinal == 2) {
            return ijl.c;
        }
        if (iOrdinal == 3) {
            return ijl.d;
        }
        if (iOrdinal == 4) {
            return ijl.e;
        }
        t9f.b();
        return null;
    }

    public static final u6n M(d280 d280Var, w6n w6nVar, fet fetVar) {
        boolean zG = fetVar.g(d280Var) | fetVar.e(w6nVar.ordinal());
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = new u6n(d4d.STATIC_WHITE60, w6nVar, d280Var);
            fetVar.o0(objP);
        }
        return (u6n) objP;
    }

    public static final o0x N(o0x o0xVar, qho qhoVar) {
        o0xVar.getClass();
        qhoVar.getClass();
        return o0xVar instanceof m0x ? new m0x(qhoVar.b(((m0x) o0xVar).f20977a), null, 6) : o0xVar;
    }

    public static final long O(jge0 jge0Var) {
        float f = jge0Var.c - jge0Var.f16474a;
        return (((long) Float.floatToRawIntBits(jge0Var.d - jge0Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final void P(Object obj) {
        if (obj instanceof g0g0) {
            throw ((g0g0) obj).f10458a;
        }
    }

    public static final mzc0 Q(q2b q2bVar, String str) {
        q2bVar.getClass();
        kr5 kr5Var = q2bVar.f27993a;
        int i = kr5Var.b;
        String str2 = kr5Var.o;
        String str3 = kr5Var.q;
        if (!q2bVar.b) {
            str = "";
        }
        return new mzc0(i, str2, str3, new n0x(kr5Var.f), str);
    }

    public static final mzc0 R(ivc ivcVar, String str) {
        ivcVar.getClass();
        uvc uvcVar = ivcVar.f15439a;
        int i = uvcVar.f36341a;
        String str2 = uvcVar.i;
        String str3 = uvcVar.j;
        if (!ivcVar.b) {
            str = "";
        }
        return new mzc0(i, str2, str3, new n0x(uvcVar.b), str);
    }

    public static final on8 S(b820 b820Var) {
        fo7 fo7Var = b820Var.b;
        boolean z = b820Var.l;
        ly6 ly6Var = b820Var.f2138a;
        boolean z2 = ly6Var.g;
        jye jyeVar = ly6Var.b.f;
        vw6 vw6Var = b820Var.d.f31171a.b;
        czc0 czc0Var = b820Var.e;
        Boolean boolValueOf = czc0Var != null ? Boolean.valueOf(czc0Var.e) : null;
        gx4 gx4Var = b820Var.f;
        return new on8(fo7Var, z, z2, jyeVar, vw6Var, boolValueOf, gx4Var != null ? gx4Var.c.b : null, gx4Var != null ? gx4Var.b : null);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fa  */
    public static final fax T(List list, ctf0 ctf0Var, String str, ch00 ch00Var, boolean z) {
        String strA;
        ikv0 ikv0Var;
        ikv0 ikv0Var2;
        list.getClass();
        ctf0Var.getClass();
        str.getClass();
        ArrayList arrayList = new ArrayList();
        List listA0 = CollectionsKt.A0(list, new wpv((byte) 9));
        ArrayList arrayList2 = new ArrayList(r3d.q(listA0, 10));
        Iterator it = listA0.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            lmo lmoVar = null;
            if (!it.hasNext()) {
                dja djaVar = dja.PENALTY;
                a4x a4xVarO0 = z ? dyb.o0(arrayList) : dyb.r0(CollectionsKt.D0(arrayList, 3));
                if (arrayList.size() - 1 >= 3) {
                    lsm0 lsm0Var = ctf0Var.b;
                    lmoVar = new lmo(lsm0Var.a(R.string.expand, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.collapse, Arrays.copyOf(new Object[0], 0)), z);
                }
                return new fax(ch00Var, str, a4xVarO0, lmoVar);
            }
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            aq30 aq30Var = (aq30) next;
            rdj rdjVar = rdj.f30294a;
            long j = aq30Var.b;
            zp30 zp30Var = aq30Var.d;
            zp30 zp30Var2 = aq30Var.c;
            fe30 fe30Var = aq30Var.e;
            String strF = rdj.f(new znq0(j), sdj.UNIVERSAL, null, 60);
            if (fe30Var instanceof ee30) {
                ee30 ee30Var = (ee30) fe30Var;
                strA = ctf0Var.b.a(R.string.placeholder_score_two_teams, Arrays.copyOf(new Object[]{Integer.valueOf(ee30Var.f7650a), Integer.valueOf(ee30Var.b)}, 2));
            } else {
                strA = ctf0Var.b.a(R.string.vs, Arrays.copyOf(new Object[i], i));
            }
            String str2 = strA;
            String str3 = aq30Var.f1279a;
            odp0 odp0Var = new odp0(new d5a0(new c280(zp30Var2.b, R.drawable.ic_glyph_placeholder_player)));
            String str4 = zp30Var2.c;
            odp0 odp0Var2 = new odp0(new d5a0(new c280(zp30Var.b, R.drawable.ic_glyph_placeholder_player)));
            String str5 = zp30Var.c;
            zg30 zg30VarA = fe30Var.a();
            if (zg30VarA == null) {
                ikv0Var = ikv0.c;
            } else if (zg30VarA instanceof wg30) {
                ikv0Var = ikv0.f14948a;
            } else if (zg30VarA instanceof xg30) {
                ikv0Var = ikv0.b;
            } else if (zg30VarA instanceof vg30) {
                ikv0Var = ikv0.c;
            } else {
                ikv0Var = ikv0.c;
            }
            ikv0 ikv0Var3 = ikv0Var;
            zg30 zg30VarA2 = fe30Var.a();
            if (zg30VarA2 == null) {
                ikv0Var2 = ikv0.c;
            } else if (zg30VarA2 instanceof wg30) {
                ikv0Var2 = ikv0.b;
            } else if (zg30VarA2 instanceof xg30) {
                ikv0Var2 = ikv0.f14948a;
            } else if (zg30VarA2 instanceof vg30) {
                ikv0Var2 = ikv0.c;
            } else {
                ikv0Var2 = ikv0.c;
            }
            arrayList2.add(Boolean.valueOf(arrayList.add(new hzy(odp0Var, str4, odp0Var2, str5, strF, str2, str3, ikv0Var3, ikv0Var2))));
            i2 = i3;
            i = 0;
        }
    }

    public static final wi10 U(zi10 zi10Var) {
        Object next;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Integer num = zi10Var.f44419a;
        if (num == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue = num.intValue();
        Integer num2 = zi10Var.b;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Integer num3 = zi10Var.c;
        long jIntValue = num3 != null ? (((long) num3.intValue()) * 1000) + jCurrentTimeMillis : jCurrentTimeMillis;
        c0o c0oVar = vi10.e;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (!((vi10) next).f37455a.equals(zi10Var.d));
        vi10 vi10Var = (vi10) next;
        if (vi10Var == null) {
            jf4.k(null);
            return null;
        }
        Double d = zi10Var.e;
        if (d == null) {
            jf4.k(null);
            return null;
        }
        double dDoubleValue = d.doubleValue();
        wh10 wh10Var = zi10Var.f;
        if (wh10Var != null) {
            return new wi10(iIntValue, iIntValue2, jIntValue, vi10Var, jCurrentTimeMillis, dDoubleValue, g1x.B(wh10Var));
        }
        jf4.k(null);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ojc ojcVar, Function1 function1, fet fetVar, int i) {
        fet fetVar2;
        boolean z;
        fet fetVar3;
        fet fetVar4 = fetVar;
        fetVar4.g0(412334521);
        int i2 = i | (fetVar4.i(ojcVar) ? 4 : 2) | (fetVar4.i(function1) ? 32 : 16);
        if (fetVar4.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            androidx.compose.runtime.d dVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarN, ((ThemeColors) fetVar4.k(dVar)).getBackgroundContent(), vgg0.b(12.0f, 12.0f, 12.0f, 12.0f));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar4, 0);
            int iHashCode = Long.hashCode(fetVar4.T);
            bh90 bh90VarM = fetVar4.m();
            mm40 mm40VarC0 = kbc.c0(fetVar4, mm40VarQ);
            mkd.c0.getClass();
            fetVar4.i0();
            boolean z2 = fetVar4.S;
            Function0 function0 = e7z.u1;
            if (z2) {
                fetVar4.l(function0);
            } else {
                fetVar4.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar4, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar4, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar4, numValueOf, shdVar3);
            jpm0.n(fetVar4);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar4, mm40VarC0, shdVar4);
            mm40 mm40VarK = s5x0.K(o7k0.d(jm40Var, 1.0f), 12.0f, 12.0f);
            boolean z3 = ((i2 & 14) == 4 || fetVar4.i(ojcVar)) | ((i2 & 112) == 32);
            Object objP = fetVar4.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new o0k0((Object) function1, (Object) ojcVar, (byte) 13);
                fetVar4.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarK, null, null, false, null, (Function0) objP, 28);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar4, 0);
            int iHashCode2 = Long.hashCode(fetVar4.T);
            bh90 bh90VarM2 = fetVar4.m();
            mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarW);
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(function0);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, thg0VarA, shdVar);
            jpm0.o(fetVar4, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar4, shdVar3, fetVar4);
            x7z x7zVarI = ohs0.i(fetVar4, mm40VarC1, shdVar4, 1.0f, true);
            String str = ojcVar.f25351a;
            boolean z4 = ojcVar.c;
            int i3 = 0;
            v8q0.a(str, x7zVarI, ((ThemeColors) fetVar4.k(dVar)).getPrimary(), null, qmk.s, null, null, null, 0L, new f2q0(1), 0L, 2, false, 1, 0, null, ibm0.t(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar4), fetVar, 0, 24960, 109544);
            j0x.b(a8k0.F(z4 ? R.drawable.ic_arrow_down : R.drawable.ic_arrow_up, 0, fetVar), null, jm40Var, null, null, 0.0f, null, fetVar, 440, 120);
            fet fetVar5 = fetVar;
            int i4 = 1;
            jm40 jm40Var2 = jm40Var;
            fetVar5.r(true);
            if (z4) {
                z = 1;
                fetVar5.e0(-210974157);
                fetVar5.r(false);
                fetVar3 = fetVar5;
            } else {
                fetVar5.e0(-212034140);
                mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                zfi0 zfi0Var = zfi0.f44303a;
                mbc.o(zfi0Var, mm40VarD, false, fetVar5, 54, 4);
                fet fetVar6 = fetVar5;
                for (a9x a9xVar : ojcVar.b) {
                    String str2 = a9xVar.f497a;
                    String str3 = a9xVar.b;
                    ArrayList arrayListU = ohs0.u(str3);
                    bnk0 bnk0Var = new bnk0();
                    pzw.E(bnk0Var, str2, 0, 0, 1, R.attr.uikitTextPrimary, 14);
                    pzw.E(bnk0Var, ": ", 0, 0, 1, R.attr.uikitTextPrimary, 14);
                    pzw.E(bnk0Var, str3, 0, 0, 0, R.attr.uikitSecondary, 14);
                    arrayListU.addAll(bnk0Var.f2888a);
                    Context context = (Context) fetVar6.k(dy2.b);
                    context.getClass();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ArrayList arrayList = new ArrayList(r3d.q(arrayListU, 10));
                    Iterator it = arrayListU.iterator();
                    while (it.hasNext()) {
                        arrayList.add(spannableStringBuilder.append((CharSequence) ((zmk0) it.next()).a(context)));
                    }
                    SpannableString spannableStringValueOf = SpannableString.valueOf(spannableStringBuilder);
                    spannableStringValueOf.getClass();
                    String html = Html.toHtml(spannableStringValueOf, i3);
                    html.getClass();
                    int i5 = j83.e;
                    j83 j83VarO0 = kc5.O0(html);
                    zcl zclVar2 = qmk.f28987a;
                    jm40 jm40Var3 = jm40Var2;
                    v8q0.b(j83VarO0, s5x0.N(jm40Var3, 12.0f, 12.0f, 0.0f, 12.0f, 4), ((ThemeColors) fetVar6.k(zaq0.b)).getPrimary(), null, 0L, null, 0L, new f2q0(i4), 0L, 2, false, 1, 0, null, null, ibm0.t(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar6), fetVar, 0, 24960, 240632);
                    fet fetVar7 = fetVar;
                    mbc.o(zfi0Var, o7k0.d(jm40Var3, 1.0f), false, fetVar7, 54, 4);
                    i4 = i4;
                    jm40Var2 = jm40Var3;
                    i3 = 0;
                    fetVar6 = fetVar7;
                }
                z = i4;
                fetVar6.r(i3);
                fetVar3 = fetVar6;
            }
            fetVar3.r(z);
            fetVar2 = fetVar3;
        } else {
            fetVar4.X();
            fetVar2 = fetVar4;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a5k0(ojcVar, function1, i, (byte) 28);
        }
    }

    public static izp b(y190 y190Var, yzp yzpVar, String str, abe0 abe0Var, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            abe0Var = null;
        }
        return new izp(y190Var, yzpVar, str, abe0Var);
    }

    public static final void c(a9x a9xVar, fet fetVar, int i) {
        a9x a9xVar2 = a9xVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(891153104);
        int i2 = i | (fetVar2.g(a9xVar2) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 12.0f, 12.0f, 12.0f, 0.0f, 8);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            String str = a9xVar2.f497a;
            y9q0 y9q0VarK = g1t0.k();
            zfn zfnVar = zaq0.b;
            v8q0.a(str, mm40VarD, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarK, fetVar, 48, 0, 131064);
            a9xVar2 = a9xVar;
            v8q0.a(a9xVar2.b, s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 6.0f, 0.0f, 12.0f, 5), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.m(), fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new edk0(a9xVar2, i, (byte) 17);
        }
    }

    public static final void d(mm40 mm40Var, boolean z, ugd ugdVar, fet fetVar, int i, int i2) {
        int i3;
        fetVar.g0(-1573299845);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.i(ugdVar) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            mm40 mm40VarY = o7k0.y(mm40Var, null, 3);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(mm40VarY, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), vgg0.b(16.0f, 16.0f, z ? 16.0f : 0.0f, z ? 16.0f : 0.0f));
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
            ua80.p(((i3 >> 3) & 112) | 6, ugdVar, jr8.f16991a, fetVar, true);
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aw5(mm40Var2, z, ugdVar, i, i2);
        }
    }

    public static final void e(yhg0 yhg0Var, mm40 mm40Var, long j, f07 f07Var, long j2, Function1 function1, fet fetVar, int i) {
        function1.getClass();
        boolean z = true;
        boolean z2 = ((((458752 & i) ^ 196608) > 131072 && fetVar.g(function1)) || (i & 196608) == 131072) | ((((i & 7168) ^ 3072) > 2048 && fetVar.e(f07Var.ordinal())) || (i & 3072) == 2048);
        if ((((i & 896) ^ 384) <= 256 || !fetVar.f(j)) && (i & 384) != 256) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objP = fetVar.P();
        if (z3 || objP == ukd.f35823a) {
            ku20 ku20Var = new ku20(function1, f07Var, j, (byte) 0);
            fetVar.o0(ku20Var);
            objP = ku20Var;
        }
        dww.c(a8k0.F(R.drawable.ic_glyph_info_circle, 0, fetVar), null, y860.W(mm40Var, null, null, false, null, (Function0) objP, 28), j2, fetVar, 56 | ((i >> 3) & 7168), 0);
    }

    public static final void f(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, ugd ugdVar4, fet fetVar, int i) {
        int i2;
        fetVar.g0(1669526271);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar4) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-2096982081, new bka(mm40Var, ugdVar, ugdVar2, ugdVar3, ugdVar4, (byte) 1), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cka(mm40Var, ugdVar, ugdVar2, ugdVar3, ugdVar4, i, (byte) 1);
        }
    }

    public static final void g(mm40 mm40Var, ma40 ma40Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        function1.getClass();
        fetVar.g0(666298400);
        int i2 = i | 6 | (fetVar.g(ma40Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ma40Var instanceof ka40;
            mm40Var2 = jm40.b;
            if (z) {
                fetVar.e0(-1642999731);
                x1x.k(mm40Var2, ((ka40) ma40Var).f17947a, function1, fetVar, i2 & 910);
                fetVar.r(false);
            } else {
                if (!ma40Var.equals(la40.f19690a)) {
                    throw b1j.f(362640130, fetVar, false);
                }
                fetVar.e0(-1642779352);
                n2x.e(6, fetVar);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mtz(mm40Var2, ma40Var, function1, i, (byte) 21);
        }
    }

    public static final void h(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, fet fetVar, int i, int i2) {
        if ((i2 & 8) != 0) {
            ugdVar3 = null;
        }
        byte b = 1;
        boolean z = ((((i & 896) ^ 384) > 256 && fetVar.g(ugdVar2)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) > 2048 && fetVar.g(ugdVar3)) || (i & 3072) == 2048);
        Object objP = fetVar.P();
        if (z || objP == ukd.f35823a) {
            objP = new h13(ugdVar2, ugdVar3, b);
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
        ugdVar.invoke(fetVar, Integer.valueOf((i >> 3) & 14));
        if (ugdVar2 == null) {
            fetVar.e0(-466444840);
            fetVar.r(false);
        } else {
            fetVar.e0(816237385);
            twn.v((i >> 6) & 14, ugdVar2, fetVar, false);
        }
        if (ugdVar3 == null) {
            fetVar.e0(-466407144);
            fetVar.r(false);
        } else {
            fetVar.e0(816238601);
            twn.v((i >> 9) & 14, ugdVar3, fetVar, false);
        }
        fetVar.r(true);
    }

    public static final void i(mm40 mm40Var, l7m0 l7m0Var, ugd ugdVar, fet fetVar, int i) {
        fetVar.g0(143293666);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | 16;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                l7m0Var = g8x.U((View) fetVar.k(dy2.f), fetVar, 0);
            } else {
                fetVar.X();
            }
            fetVar.s();
            WeakHashMap weakHashMap = djv0.w;
            int iF = h8x.F((tly) l7m0Var.getValue(), zcm0.i(fetVar).e.e().d);
            boolean zE = fetVar.e(iF);
            Object objP = fetVar.P();
            if (zE || objP == ukd.f35823a) {
                objP = new mq8(iF, (byte) 8);
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
            twn.v(6, ugdVar, fetVar, true);
        } else {
            fetVar.X();
        }
        l7m0 l7m0Var2 = l7m0Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jwe0(mm40Var, l7m0Var2, ugdVar, i, (byte) 0);
        }
    }

    public static final void j(int i, int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        fetVar.g0(763475031);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.d(o7k0.e(mm40Var, 16.0f), 1.0f), vgg0.a(16.0f)), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i00(mm40Var, i, i2, (byte) 17);
        }
    }

    public static final void k(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(367288816);
        if (fetVar.U(i & 1, (i & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40Var, 16.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
            j(0, 1, fetVar, null);
            jm40 jm40Var = jm40.b;
            j(0, 0, fetVar, s5x0.N(jm40Var, 0.0f, 16.0f, 60.0f, 0.0f, 9));
            j(0, 0, fetVar, s5x0.N(jm40Var, 0.0f, 16.0f, 112.0f, 0.0f, 9));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqj0(mm40Var, i, (byte) 5);
        }
    }

    public static final void l(mm40 mm40Var, a4x a4xVar, sw3 sw3Var, Function2 function2, fet fetVar, int i) {
        a4xVar.getClass();
        function2.getClass();
        fetVar.g0(-2067027236);
        int i2 = 2048;
        int i3 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.g(sw3Var) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024);
        byte b = 0;
        boolean z = true;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            x5d x5dVarA = w5d.a(sw3Var, gqw0.m, fetVar, (((i3 & 14) | ((i3 >> 3) & 112)) >> 3) & 14);
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
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, -1063949813, a4xVar);
            while (itO.hasNext()) {
                y3r0 y3r0Var = (y3r0) itO.next();
                boolean z2 = z;
                gy30 gy30Var = y3r0Var.c;
                boolean zG = ((i3 & 7168) == i2 ? z2 : false) | fetVar.g(y3r0Var);
                Object objP = fetVar.P();
                if (zG || objP == ukd.f35823a) {
                    objP = new o0k0(function2, y3r0Var, b);
                    fetVar.o0(objP);
                }
                jiq0.y(null, gy30Var, (Function0) objP, null, null, fetVar, 0, 25);
                z = z2;
                i2 = 2048;
            }
            fetVar.r(false);
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dfc0((byte) 22, i, (Object) mm40Var, (Object) a4xVar, (Object) sw3Var, (Object) function2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:41:0x0068  */
    /* JADX WARN: Code duplicated, block: B:43:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0085  */
    /* JADX WARN: Code duplicated, block: B:54:0x0089  */
    /* JADX WARN: Code duplicated, block: B:56:0x008c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x0097  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x010e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0119  */
    /* JADX WARN: Code duplicated, block: B:88:0x013b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0145  */
    /* JADX WARN: Code duplicated, block: B:93:0x0160  */
    /* JADX WARN: Code duplicated, block: B:96:0x016b  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    public static final void m(mm40 mm40Var, ow3 ow3Var, yx7 yx7Var, ugd ugdVar, xdr xdrVar, xdr xdrVar2, fet fetVar, int i, int i2) {
        int i3;
        ow3 ow3Var2;
        int i4;
        yx7 yx7Var2;
        int i5;
        int i6;
        xdr xdrVar3;
        int i7;
        int i8;
        xdr xdrVar4;
        int i9;
        boolean z;
        ow3 ow3Var3;
        yx7 yx7Var3;
        xdr xdrVar5;
        xdr xdrVar6;
        yfe0 yfe0VarU;
        ow3 ow3Var4;
        zhg0 zhg0Var;
        boolean z2;
        int i10;
        fetVar.g0(-1048827750);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 48) == 0) {
                ow3Var2 = ow3Var;
                i3 |= fetVar.g(ow3Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    yx7Var2 = yx7Var;
                    if (fetVar.g(yx7Var2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if (fetVar.i(ugdVar)) {
                        i10 = 2048;
                    } else {
                        i10 = 1024;
                    }
                    i3 |= i10;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        xdrVar3 = xdrVar;
                        if (fetVar.i(xdrVar3)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        if ((196608 & i) == 0) {
                            xdrVar4 = xdrVar2;
                            if (fetVar.i(xdrVar4)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        if ((74899 & i3) != 74898) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (fetVar.U(i3 & 1, z)) {
                            if (i11 != 0) {
                                ow3Var4 = uc9.f35418a;
                            } else {
                                ow3Var4 = ow3Var2;
                            }
                            if (i4 != 0) {
                                yx7Var2 = gqw0.k;
                            }
                            if (i6 != 0) {
                                xdrVar3 = null;
                            }
                            if (i8 != 0) {
                                xdrVar4 = null;
                            }
                            thg0 thg0VarA = shg0.a(ow3Var4, yx7Var2, fetVar, ((i3 & 1022) >> 3) & 126);
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
                            zhg0Var = zhg0.f44392a;
                            if (xdrVar3 == null) {
                                fetVar.e0(336490495);
                                z2 = false;
                            } else {
                                z2 = false;
                                fetVar.e0(2089064514);
                                xdrVar3.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 9) & 112) | 6));
                            }
                            fetVar.r(z2);
                            ugdVar.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 6) & 112) | 6));
                            if (xdrVar4 == null) {
                                fetVar.e0(336555967);
                            } else {
                                fetVar.e0(2089066626);
                                xdrVar4.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 12) & 112) | 6));
                            }
                            fetVar.r(z2);
                            fetVar.r(true);
                            ow3Var3 = ow3Var4;
                        } else {
                            fetVar.X();
                            ow3Var3 = ow3Var2;
                        }
                        yx7Var3 = yx7Var2;
                        xdrVar5 = xdrVar3;
                        xdrVar6 = xdrVar4;
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new hjl(mm40Var, ow3Var3, yx7Var3, ugdVar, xdrVar5, xdrVar6, i, i2, (byte) 5);
                        }
                    }
                    i3 |= 196608;
                    xdrVar4 = xdrVar2;
                    if ((74899 & i3) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i3 & 1, z)) {
                        if (i11 != 0) {
                            ow3Var4 = uc9.f35418a;
                        } else {
                            ow3Var4 = ow3Var2;
                        }
                        if (i4 != 0) {
                            yx7Var2 = gqw0.k;
                        }
                        if (i6 != 0) {
                            xdrVar3 = null;
                        }
                        if (i8 != 0) {
                            xdrVar4 = null;
                        }
                        thg0 thg0VarA2 = shg0.a(ow3Var4, yx7Var2, fetVar, ((i3 & 1022) >> 3) & 126);
                        int iHashCode2 = Long.hashCode(fetVar.T);
                        bh90 bh90VarM2 = fetVar.m();
                        mm40 mm40VarC1 = kbc.c0(fetVar, mm40Var);
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, thg0VarA2, gqw0.x);
                        jpm0.o(fetVar, bh90VarM2, gqw0.w);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC1, gqw0.v);
                        zhg0Var = zhg0.f44392a;
                        if (xdrVar3 == null) {
                            fetVar.e0(336490495);
                            z2 = false;
                        } else {
                            z2 = false;
                            fetVar.e0(2089064514);
                            xdrVar3.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 9) & 112) | 6));
                        }
                        fetVar.r(z2);
                        ugdVar.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 6) & 112) | 6));
                        if (xdrVar4 == null) {
                            fetVar.e0(336555967);
                        } else {
                            fetVar.e0(2089066626);
                            xdrVar4.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 12) & 112) | 6));
                        }
                        fetVar.r(z2);
                        fetVar.r(true);
                        ow3Var3 = ow3Var4;
                    } else {
                        fetVar.X();
                        ow3Var3 = ow3Var2;
                    }
                    yx7Var3 = yx7Var2;
                    xdrVar5 = xdrVar3;
                    xdrVar6 = xdrVar4;
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new hjl(mm40Var, ow3Var3, yx7Var3, ugdVar, xdrVar5, xdrVar6, i, i2, (byte) 5);
                    }
                }
                i3 |= 24576;
                xdrVar3 = xdrVar;
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        xdrVar4 = xdrVar2;
                        if (fetVar.i(xdrVar4)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((74899 & i3) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i3 & 1, z)) {
                        if (i11 != 0) {
                            ow3Var4 = uc9.f35418a;
                        } else {
                            ow3Var4 = ow3Var2;
                        }
                        if (i4 != 0) {
                            yx7Var2 = gqw0.k;
                        }
                        if (i6 != 0) {
                            xdrVar3 = null;
                        }
                        if (i8 != 0) {
                            xdrVar4 = null;
                        }
                        thg0 thg0VarA3 = shg0.a(ow3Var4, yx7Var2, fetVar, ((i3 & 1022) >> 3) & 126);
                        int iHashCode3 = Long.hashCode(fetVar.T);
                        bh90 bh90VarM3 = fetVar.m();
                        mm40 mm40VarC2 = kbc.c0(fetVar, mm40Var);
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, thg0VarA3, gqw0.x);
                        jpm0.o(fetVar, bh90VarM3, gqw0.w);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode3), gqw0.y);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC2, gqw0.v);
                        zhg0Var = zhg0.f44392a;
                        if (xdrVar3 == null) {
                            fetVar.e0(336490495);
                            z2 = false;
                        } else {
                            z2 = false;
                            fetVar.e0(2089064514);
                            xdrVar3.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 9) & 112) | 6));
                        }
                        fetVar.r(z2);
                        ugdVar.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 6) & 112) | 6));
                        if (xdrVar4 == null) {
                            fetVar.e0(336555967);
                        } else {
                            fetVar.e0(2089066626);
                            xdrVar4.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 12) & 112) | 6));
                        }
                        fetVar.r(z2);
                        fetVar.r(true);
                        ow3Var3 = ow3Var4;
                    } else {
                        fetVar.X();
                        ow3Var3 = ow3Var2;
                    }
                    yx7Var3 = yx7Var2;
                    xdrVar5 = xdrVar3;
                    xdrVar6 = xdrVar4;
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new hjl(mm40Var, ow3Var3, yx7Var3, ugdVar, xdrVar5, xdrVar6, i, i2, (byte) 5);
                    }
                }
                i3 |= 196608;
                xdrVar4 = xdrVar2;
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i3 & 1, z)) {
                    if (i11 != 0) {
                        ow3Var4 = uc9.f35418a;
                    } else {
                        ow3Var4 = ow3Var2;
                    }
                    if (i4 != 0) {
                        yx7Var2 = gqw0.k;
                    }
                    if (i6 != 0) {
                        xdrVar3 = null;
                    }
                    if (i8 != 0) {
                        xdrVar4 = null;
                    }
                    thg0 thg0VarA4 = shg0.a(ow3Var4, yx7Var2, fetVar, ((i3 & 1022) >> 3) & 126);
                    int iHashCode4 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM4 = fetVar.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar, mm40Var);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA4, gqw0.x);
                    jpm0.o(fetVar, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC3, gqw0.v);
                    zhg0Var = zhg0.f44392a;
                    if (xdrVar3 == null) {
                        fetVar.e0(336490495);
                        z2 = false;
                    } else {
                        z2 = false;
                        fetVar.e0(2089064514);
                        xdrVar3.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 9) & 112) | 6));
                    }
                    fetVar.r(z2);
                    ugdVar.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 6) & 112) | 6));
                    if (xdrVar4 == null) {
                        fetVar.e0(336555967);
                    } else {
                        fetVar.e0(2089066626);
                        xdrVar4.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 12) & 112) | 6));
                    }
                    fetVar.r(z2);
                    fetVar.r(true);
                    ow3Var3 = ow3Var4;
                } else {
                    fetVar.X();
                    ow3Var3 = ow3Var2;
                }
                yx7Var3 = yx7Var2;
                xdrVar5 = xdrVar3;
                xdrVar6 = xdrVar4;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new hjl(mm40Var, ow3Var3, yx7Var3, ugdVar, xdrVar5, xdrVar6, i, i2, (byte) 5);
                }
            }
            i3 |= 384;
            yx7Var2 = yx7Var;
            if ((i & 3072) == 0) {
                if (fetVar.i(ugdVar)) {
                    i10 = 2048;
                } else {
                    i10 = 1024;
                }
                i3 |= i10;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    xdrVar3 = xdrVar;
                    if (fetVar.i(xdrVar3)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        xdrVar4 = xdrVar2;
                        if (fetVar.i(xdrVar4)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((74899 & i3) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i3 & 1, z)) {
                        if (i11 != 0) {
                            ow3Var4 = uc9.f35418a;
                        } else {
                            ow3Var4 = ow3Var2;
                        }
                        if (i4 != 0) {
                            yx7Var2 = gqw0.k;
                        }
                        if (i6 != 0) {
                            xdrVar3 = null;
                        }
                        if (i8 != 0) {
                            xdrVar4 = null;
                        }
                        thg0 thg0VarA5 = shg0.a(ow3Var4, yx7Var2, fetVar, ((i3 & 1022) >> 3) & 126);
                        int iHashCode5 = Long.hashCode(fetVar.T);
                        bh90 bh90VarM5 = fetVar.m();
                        mm40 mm40VarC4 = kbc.c0(fetVar, mm40Var);
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, thg0VarA5, gqw0.x);
                        jpm0.o(fetVar, bh90VarM5, gqw0.w);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode5), gqw0.y);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC4, gqw0.v);
                        zhg0Var = zhg0.f44392a;
                        if (xdrVar3 == null) {
                            fetVar.e0(336490495);
                            z2 = false;
                        } else {
                            z2 = false;
                            fetVar.e0(2089064514);
                            xdrVar3.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 9) & 112) | 6));
                        }
                        fetVar.r(z2);
                        ugdVar.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 6) & 112) | 6));
                        if (xdrVar4 == null) {
                            fetVar.e0(336555967);
                        } else {
                            fetVar.e0(2089066626);
                            xdrVar4.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 12) & 112) | 6));
                        }
                        fetVar.r(z2);
                        fetVar.r(true);
                        ow3Var3 = ow3Var4;
                    } else {
                        fetVar.X();
                        ow3Var3 = ow3Var2;
                    }
                    yx7Var3 = yx7Var2;
                    xdrVar5 = xdrVar3;
                    xdrVar6 = xdrVar4;
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new hjl(mm40Var, ow3Var3, yx7Var3, ugdVar, xdrVar5, xdrVar6, i, i2, (byte) 5);
                    }
                }
                i3 |= 196608;
                xdrVar4 = xdrVar2;
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i3 & 1, z)) {
                    if (i11 != 0) {
                        ow3Var4 = uc9.f35418a;
                    } else {
                        ow3Var4 = ow3Var2;
                    }
                    if (i4 != 0) {
                        yx7Var2 = gqw0.k;
                    }
                    if (i6 != 0) {
                        xdrVar3 = null;
                    }
                    if (i8 != 0) {
                        xdrVar4 = null;
                    }
                    thg0 thg0VarA6 = shg0.a(ow3Var4, yx7Var2, fetVar, ((i3 & 1022) >> 3) & 126);
                    int iHashCode6 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM6 = fetVar.m();
                    mm40 mm40VarC5 = kbc.c0(fetVar, mm40Var);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA6, gqw0.x);
                    jpm0.o(fetVar, bh90VarM6, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode6), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC5, gqw0.v);
                    zhg0Var = zhg0.f44392a;
                    if (xdrVar3 == null) {
                        fetVar.e0(336490495);
                        z2 = false;
                    } else {
                        z2 = false;
                        fetVar.e0(2089064514);
                        xdrVar3.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 9) & 112) | 6));
                    }
                    fetVar.r(z2);
                    ugdVar.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 6) & 112) | 6));
                    if (xdrVar4 == null) {
                        fetVar.e0(336555967);
                    } else {
                        fetVar.e0(2089066626);
                        xdrVar4.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 12) & 112) | 6));
                    }
                    fetVar.r(z2);
                    fetVar.r(true);
                    ow3Var3 = ow3Var4;
                } else {
                    fetVar.X();
                    ow3Var3 = ow3Var2;
                }
                yx7Var3 = yx7Var2;
                xdrVar5 = xdrVar3;
                xdrVar6 = xdrVar4;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new hjl(mm40Var, ow3Var3, yx7Var3, ugdVar, xdrVar5, xdrVar6, i, i2, (byte) 5);
                }
            }
            i3 |= 24576;
            xdrVar3 = xdrVar;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    xdrVar4 = xdrVar2;
                    if (fetVar.i(xdrVar4)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i3 & 1, z)) {
                    if (i11 != 0) {
                        ow3Var4 = uc9.f35418a;
                    } else {
                        ow3Var4 = ow3Var2;
                    }
                    if (i4 != 0) {
                        yx7Var2 = gqw0.k;
                    }
                    if (i6 != 0) {
                        xdrVar3 = null;
                    }
                    if (i8 != 0) {
                        xdrVar4 = null;
                    }
                    thg0 thg0VarA7 = shg0.a(ow3Var4, yx7Var2, fetVar, ((i3 & 1022) >> 3) & 126);
                    int iHashCode7 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM7 = fetVar.m();
                    mm40 mm40VarC6 = kbc.c0(fetVar, mm40Var);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA7, gqw0.x);
                    jpm0.o(fetVar, bh90VarM7, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode7), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC6, gqw0.v);
                    zhg0Var = zhg0.f44392a;
                    if (xdrVar3 == null) {
                        fetVar.e0(336490495);
                        z2 = false;
                    } else {
                        z2 = false;
                        fetVar.e0(2089064514);
                        xdrVar3.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 9) & 112) | 6));
                    }
                    fetVar.r(z2);
                    ugdVar.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 6) & 112) | 6));
                    if (xdrVar4 == null) {
                        fetVar.e0(336555967);
                    } else {
                        fetVar.e0(2089066626);
                        xdrVar4.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 12) & 112) | 6));
                    }
                    fetVar.r(z2);
                    fetVar.r(true);
                    ow3Var3 = ow3Var4;
                } else {
                    fetVar.X();
                    ow3Var3 = ow3Var2;
                }
                yx7Var3 = yx7Var2;
                xdrVar5 = xdrVar3;
                xdrVar6 = xdrVar4;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new hjl(mm40Var, ow3Var3, yx7Var3, ugdVar, xdrVar5, xdrVar6, i, i2, (byte) 5);
                }
            }
            i3 |= 196608;
            xdrVar4 = xdrVar2;
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i3 & 1, z)) {
                if (i11 != 0) {
                    ow3Var4 = uc9.f35418a;
                } else {
                    ow3Var4 = ow3Var2;
                }
                if (i4 != 0) {
                    yx7Var2 = gqw0.k;
                }
                if (i6 != 0) {
                    xdrVar3 = null;
                }
                if (i8 != 0) {
                    xdrVar4 = null;
                }
                thg0 thg0VarA8 = shg0.a(ow3Var4, yx7Var2, fetVar, ((i3 & 1022) >> 3) & 126);
                int iHashCode8 = Long.hashCode(fetVar.T);
                bh90 bh90VarM8 = fetVar.m();
                mm40 mm40VarC7 = kbc.c0(fetVar, mm40Var);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA8, gqw0.x);
                jpm0.o(fetVar, bh90VarM8, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode8), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC7, gqw0.v);
                zhg0Var = zhg0.f44392a;
                if (xdrVar3 == null) {
                    fetVar.e0(336490495);
                    z2 = false;
                } else {
                    z2 = false;
                    fetVar.e0(2089064514);
                    xdrVar3.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 9) & 112) | 6));
                }
                fetVar.r(z2);
                ugdVar.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 6) & 112) | 6));
                if (xdrVar4 == null) {
                    fetVar.e0(336555967);
                } else {
                    fetVar.e0(2089066626);
                    xdrVar4.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 12) & 112) | 6));
                }
                fetVar.r(z2);
                fetVar.r(true);
                ow3Var3 = ow3Var4;
            } else {
                fetVar.X();
                ow3Var3 = ow3Var2;
            }
            yx7Var3 = yx7Var2;
            xdrVar5 = xdrVar3;
            xdrVar6 = xdrVar4;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new hjl(mm40Var, ow3Var3, yx7Var3, ugdVar, xdrVar5, xdrVar6, i, i2, (byte) 5);
            }
        }
        i3 |= 48;
        ow3Var2 = ow3Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                yx7Var2 = yx7Var;
                if (fetVar.g(yx7Var2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if (fetVar.i(ugdVar)) {
                    i10 = 2048;
                } else {
                    i10 = 1024;
                }
                i3 |= i10;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    xdrVar3 = xdrVar;
                    if (fetVar.i(xdrVar3)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        xdrVar4 = xdrVar2;
                        if (fetVar.i(xdrVar4)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((74899 & i3) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i3 & 1, z)) {
                        if (i11 != 0) {
                            ow3Var4 = uc9.f35418a;
                        } else {
                            ow3Var4 = ow3Var2;
                        }
                        if (i4 != 0) {
                            yx7Var2 = gqw0.k;
                        }
                        if (i6 != 0) {
                            xdrVar3 = null;
                        }
                        if (i8 != 0) {
                            xdrVar4 = null;
                        }
                        thg0 thg0VarA9 = shg0.a(ow3Var4, yx7Var2, fetVar, ((i3 & 1022) >> 3) & 126);
                        int iHashCode9 = Long.hashCode(fetVar.T);
                        bh90 bh90VarM9 = fetVar.m();
                        mm40 mm40VarC8 = kbc.c0(fetVar, mm40Var);
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, thg0VarA9, gqw0.x);
                        jpm0.o(fetVar, bh90VarM9, gqw0.w);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode9), gqw0.y);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC8, gqw0.v);
                        zhg0Var = zhg0.f44392a;
                        if (xdrVar3 == null) {
                            fetVar.e0(336490495);
                            z2 = false;
                        } else {
                            z2 = false;
                            fetVar.e0(2089064514);
                            xdrVar3.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 9) & 112) | 6));
                        }
                        fetVar.r(z2);
                        ugdVar.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 6) & 112) | 6));
                        if (xdrVar4 == null) {
                            fetVar.e0(336555967);
                        } else {
                            fetVar.e0(2089066626);
                            xdrVar4.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 12) & 112) | 6));
                        }
                        fetVar.r(z2);
                        fetVar.r(true);
                        ow3Var3 = ow3Var4;
                    } else {
                        fetVar.X();
                        ow3Var3 = ow3Var2;
                    }
                    yx7Var3 = yx7Var2;
                    xdrVar5 = xdrVar3;
                    xdrVar6 = xdrVar4;
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new hjl(mm40Var, ow3Var3, yx7Var3, ugdVar, xdrVar5, xdrVar6, i, i2, (byte) 5);
                    }
                }
                i3 |= 196608;
                xdrVar4 = xdrVar2;
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i3 & 1, z)) {
                    if (i11 != 0) {
                        ow3Var4 = uc9.f35418a;
                    } else {
                        ow3Var4 = ow3Var2;
                    }
                    if (i4 != 0) {
                        yx7Var2 = gqw0.k;
                    }
                    if (i6 != 0) {
                        xdrVar3 = null;
                    }
                    if (i8 != 0) {
                        xdrVar4 = null;
                    }
                    thg0 thg0VarA10 = shg0.a(ow3Var4, yx7Var2, fetVar, ((i3 & 1022) >> 3) & 126);
                    int iHashCode10 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM10 = fetVar.m();
                    mm40 mm40VarC9 = kbc.c0(fetVar, mm40Var);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA10, gqw0.x);
                    jpm0.o(fetVar, bh90VarM10, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode10), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC9, gqw0.v);
                    zhg0Var = zhg0.f44392a;
                    if (xdrVar3 == null) {
                        fetVar.e0(336490495);
                        z2 = false;
                    } else {
                        z2 = false;
                        fetVar.e0(2089064514);
                        xdrVar3.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 9) & 112) | 6));
                    }
                    fetVar.r(z2);
                    ugdVar.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 6) & 112) | 6));
                    if (xdrVar4 == null) {
                        fetVar.e0(336555967);
                    } else {
                        fetVar.e0(2089066626);
                        xdrVar4.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 12) & 112) | 6));
                    }
                    fetVar.r(z2);
                    fetVar.r(true);
                    ow3Var3 = ow3Var4;
                } else {
                    fetVar.X();
                    ow3Var3 = ow3Var2;
                }
                yx7Var3 = yx7Var2;
                xdrVar5 = xdrVar3;
                xdrVar6 = xdrVar4;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new hjl(mm40Var, ow3Var3, yx7Var3, ugdVar, xdrVar5, xdrVar6, i, i2, (byte) 5);
                }
            }
            i3 |= 24576;
            xdrVar3 = xdrVar;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    xdrVar4 = xdrVar2;
                    if (fetVar.i(xdrVar4)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i3 & 1, z)) {
                    if (i11 != 0) {
                        ow3Var4 = uc9.f35418a;
                    } else {
                        ow3Var4 = ow3Var2;
                    }
                    if (i4 != 0) {
                        yx7Var2 = gqw0.k;
                    }
                    if (i6 != 0) {
                        xdrVar3 = null;
                    }
                    if (i8 != 0) {
                        xdrVar4 = null;
                    }
                    thg0 thg0VarA11 = shg0.a(ow3Var4, yx7Var2, fetVar, ((i3 & 1022) >> 3) & 126);
                    int iHashCode11 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM11 = fetVar.m();
                    mm40 mm40VarC10 = kbc.c0(fetVar, mm40Var);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA11, gqw0.x);
                    jpm0.o(fetVar, bh90VarM11, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode11), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC10, gqw0.v);
                    zhg0Var = zhg0.f44392a;
                    if (xdrVar3 == null) {
                        fetVar.e0(336490495);
                        z2 = false;
                    } else {
                        z2 = false;
                        fetVar.e0(2089064514);
                        xdrVar3.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 9) & 112) | 6));
                    }
                    fetVar.r(z2);
                    ugdVar.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 6) & 112) | 6));
                    if (xdrVar4 == null) {
                        fetVar.e0(336555967);
                    } else {
                        fetVar.e0(2089066626);
                        xdrVar4.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 12) & 112) | 6));
                    }
                    fetVar.r(z2);
                    fetVar.r(true);
                    ow3Var3 = ow3Var4;
                } else {
                    fetVar.X();
                    ow3Var3 = ow3Var2;
                }
                yx7Var3 = yx7Var2;
                xdrVar5 = xdrVar3;
                xdrVar6 = xdrVar4;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new hjl(mm40Var, ow3Var3, yx7Var3, ugdVar, xdrVar5, xdrVar6, i, i2, (byte) 5);
                }
            }
            i3 |= 196608;
            xdrVar4 = xdrVar2;
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i3 & 1, z)) {
                if (i11 != 0) {
                    ow3Var4 = uc9.f35418a;
                } else {
                    ow3Var4 = ow3Var2;
                }
                if (i4 != 0) {
                    yx7Var2 = gqw0.k;
                }
                if (i6 != 0) {
                    xdrVar3 = null;
                }
                if (i8 != 0) {
                    xdrVar4 = null;
                }
                thg0 thg0VarA12 = shg0.a(ow3Var4, yx7Var2, fetVar, ((i3 & 1022) >> 3) & 126);
                int iHashCode12 = Long.hashCode(fetVar.T);
                bh90 bh90VarM12 = fetVar.m();
                mm40 mm40VarC11 = kbc.c0(fetVar, mm40Var);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA12, gqw0.x);
                jpm0.o(fetVar, bh90VarM12, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode12), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC11, gqw0.v);
                zhg0Var = zhg0.f44392a;
                if (xdrVar3 == null) {
                    fetVar.e0(336490495);
                    z2 = false;
                } else {
                    z2 = false;
                    fetVar.e0(2089064514);
                    xdrVar3.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 9) & 112) | 6));
                }
                fetVar.r(z2);
                ugdVar.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 6) & 112) | 6));
                if (xdrVar4 == null) {
                    fetVar.e0(336555967);
                } else {
                    fetVar.e0(2089066626);
                    xdrVar4.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 12) & 112) | 6));
                }
                fetVar.r(z2);
                fetVar.r(true);
                ow3Var3 = ow3Var4;
            } else {
                fetVar.X();
                ow3Var3 = ow3Var2;
            }
            yx7Var3 = yx7Var2;
            xdrVar5 = xdrVar3;
            xdrVar6 = xdrVar4;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new hjl(mm40Var, ow3Var3, yx7Var3, ugdVar, xdrVar5, xdrVar6, i, i2, (byte) 5);
            }
        }
        i3 |= 384;
        yx7Var2 = yx7Var;
        if ((i & 3072) == 0) {
            if (fetVar.i(ugdVar)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i3 |= i10;
        }
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                xdrVar3 = xdrVar;
                if (fetVar.i(xdrVar3)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    xdrVar4 = xdrVar2;
                    if (fetVar.i(xdrVar4)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i3 & 1, z)) {
                    if (i11 != 0) {
                        ow3Var4 = uc9.f35418a;
                    } else {
                        ow3Var4 = ow3Var2;
                    }
                    if (i4 != 0) {
                        yx7Var2 = gqw0.k;
                    }
                    if (i6 != 0) {
                        xdrVar3 = null;
                    }
                    if (i8 != 0) {
                        xdrVar4 = null;
                    }
                    thg0 thg0VarA13 = shg0.a(ow3Var4, yx7Var2, fetVar, ((i3 & 1022) >> 3) & 126);
                    int iHashCode13 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM13 = fetVar.m();
                    mm40 mm40VarC12 = kbc.c0(fetVar, mm40Var);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA13, gqw0.x);
                    jpm0.o(fetVar, bh90VarM13, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode13), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC12, gqw0.v);
                    zhg0Var = zhg0.f44392a;
                    if (xdrVar3 == null) {
                        fetVar.e0(336490495);
                        z2 = false;
                    } else {
                        z2 = false;
                        fetVar.e0(2089064514);
                        xdrVar3.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 9) & 112) | 6));
                    }
                    fetVar.r(z2);
                    ugdVar.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 6) & 112) | 6));
                    if (xdrVar4 == null) {
                        fetVar.e0(336555967);
                    } else {
                        fetVar.e0(2089066626);
                        xdrVar4.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 12) & 112) | 6));
                    }
                    fetVar.r(z2);
                    fetVar.r(true);
                    ow3Var3 = ow3Var4;
                } else {
                    fetVar.X();
                    ow3Var3 = ow3Var2;
                }
                yx7Var3 = yx7Var2;
                xdrVar5 = xdrVar3;
                xdrVar6 = xdrVar4;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new hjl(mm40Var, ow3Var3, yx7Var3, ugdVar, xdrVar5, xdrVar6, i, i2, (byte) 5);
                }
            }
            i3 |= 196608;
            xdrVar4 = xdrVar2;
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i3 & 1, z)) {
                if (i11 != 0) {
                    ow3Var4 = uc9.f35418a;
                } else {
                    ow3Var4 = ow3Var2;
                }
                if (i4 != 0) {
                    yx7Var2 = gqw0.k;
                }
                if (i6 != 0) {
                    xdrVar3 = null;
                }
                if (i8 != 0) {
                    xdrVar4 = null;
                }
                thg0 thg0VarA14 = shg0.a(ow3Var4, yx7Var2, fetVar, ((i3 & 1022) >> 3) & 126);
                int iHashCode14 = Long.hashCode(fetVar.T);
                bh90 bh90VarM14 = fetVar.m();
                mm40 mm40VarC13 = kbc.c0(fetVar, mm40Var);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA14, gqw0.x);
                jpm0.o(fetVar, bh90VarM14, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode14), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC13, gqw0.v);
                zhg0Var = zhg0.f44392a;
                if (xdrVar3 == null) {
                    fetVar.e0(336490495);
                    z2 = false;
                } else {
                    z2 = false;
                    fetVar.e0(2089064514);
                    xdrVar3.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 9) & 112) | 6));
                }
                fetVar.r(z2);
                ugdVar.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 6) & 112) | 6));
                if (xdrVar4 == null) {
                    fetVar.e0(336555967);
                } else {
                    fetVar.e0(2089066626);
                    xdrVar4.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 12) & 112) | 6));
                }
                fetVar.r(z2);
                fetVar.r(true);
                ow3Var3 = ow3Var4;
            } else {
                fetVar.X();
                ow3Var3 = ow3Var2;
            }
            yx7Var3 = yx7Var2;
            xdrVar5 = xdrVar3;
            xdrVar6 = xdrVar4;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new hjl(mm40Var, ow3Var3, yx7Var3, ugdVar, xdrVar5, xdrVar6, i, i2, (byte) 5);
            }
        }
        i3 |= 24576;
        xdrVar3 = xdrVar;
        i8 = i2 & 32;
        if (i8 != 0) {
            if ((196608 & i) == 0) {
                xdrVar4 = xdrVar2;
                if (fetVar.i(xdrVar4)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i3 & 1, z)) {
                if (i11 != 0) {
                    ow3Var4 = uc9.f35418a;
                } else {
                    ow3Var4 = ow3Var2;
                }
                if (i4 != 0) {
                    yx7Var2 = gqw0.k;
                }
                if (i6 != 0) {
                    xdrVar3 = null;
                }
                if (i8 != 0) {
                    xdrVar4 = null;
                }
                thg0 thg0VarA15 = shg0.a(ow3Var4, yx7Var2, fetVar, ((i3 & 1022) >> 3) & 126);
                int iHashCode15 = Long.hashCode(fetVar.T);
                bh90 bh90VarM15 = fetVar.m();
                mm40 mm40VarC14 = kbc.c0(fetVar, mm40Var);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA15, gqw0.x);
                jpm0.o(fetVar, bh90VarM15, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode15), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC14, gqw0.v);
                zhg0Var = zhg0.f44392a;
                if (xdrVar3 == null) {
                    fetVar.e0(336490495);
                    z2 = false;
                } else {
                    z2 = false;
                    fetVar.e0(2089064514);
                    xdrVar3.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 9) & 112) | 6));
                }
                fetVar.r(z2);
                ugdVar.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 6) & 112) | 6));
                if (xdrVar4 == null) {
                    fetVar.e0(336555967);
                } else {
                    fetVar.e0(2089066626);
                    xdrVar4.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 12) & 112) | 6));
                }
                fetVar.r(z2);
                fetVar.r(true);
                ow3Var3 = ow3Var4;
            } else {
                fetVar.X();
                ow3Var3 = ow3Var2;
            }
            yx7Var3 = yx7Var2;
            xdrVar5 = xdrVar3;
            xdrVar6 = xdrVar4;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new hjl(mm40Var, ow3Var3, yx7Var3, ugdVar, xdrVar5, xdrVar6, i, i2, (byte) 5);
            }
        }
        i3 |= 196608;
        xdrVar4 = xdrVar2;
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i3 & 1, z)) {
            if (i11 != 0) {
                ow3Var4 = uc9.f35418a;
            } else {
                ow3Var4 = ow3Var2;
            }
            if (i4 != 0) {
                yx7Var2 = gqw0.k;
            }
            if (i6 != 0) {
                xdrVar3 = null;
            }
            if (i8 != 0) {
                xdrVar4 = null;
            }
            thg0 thg0VarA16 = shg0.a(ow3Var4, yx7Var2, fetVar, ((i3 & 1022) >> 3) & 126);
            int iHashCode16 = Long.hashCode(fetVar.T);
            bh90 bh90VarM16 = fetVar.m();
            mm40 mm40VarC15 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA16, gqw0.x);
            jpm0.o(fetVar, bh90VarM16, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode16), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC15, gqw0.v);
            zhg0Var = zhg0.f44392a;
            if (xdrVar3 == null) {
                fetVar.e0(336490495);
                z2 = false;
            } else {
                z2 = false;
                fetVar.e0(2089064514);
                xdrVar3.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 9) & 112) | 6));
            }
            fetVar.r(z2);
            ugdVar.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 6) & 112) | 6));
            if (xdrVar4 == null) {
                fetVar.e0(336555967);
            } else {
                fetVar.e0(2089066626);
                xdrVar4.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 12) & 112) | 6));
            }
            fetVar.r(z2);
            fetVar.r(true);
            ow3Var3 = ow3Var4;
        } else {
            fetVar.X();
            ow3Var3 = ow3Var2;
        }
        yx7Var3 = yx7Var2;
        xdrVar5 = xdrVar3;
        xdrVar6 = xdrVar4;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hjl(mm40Var, ow3Var3, yx7Var3, ugdVar, xdrVar5, xdrVar6, i, i2, (byte) 5);
        }
    }

    public static final void n(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(890211199);
        if (fetVar.U(i & 1, (i & 3) != 2)) {
            mm40 mm40VarW = o7k0.w(o7k0.d(mm40Var, 1.0f), null, false, 3);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            float f = Float.MAX_VALUE;
            if (1.0f <= Float.MAX_VALUE) {
                f = 1.0f;
            }
            x7z x7zVar = new x7z(f, true);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, x7zVar);
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
            zx7 zx7Var2 = gqw0.e;
            jr8 jr8Var = jr8.f16991a;
            jm40 jm40Var = jm40.b;
            q(0, fetVar, jr8Var.b(jm40Var, zx7Var2));
            fetVar.r(true);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(jm40Var, 80.0f);
            tj30 tj30VarC2 = zq8.c(zx7Var2, false);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarS);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 40.0f), 12.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(vqm.b, fetVar, 6, 0), fetVar, 0, true);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar2 = new x7z(1.0f > f ? Float.MAX_VALUE : 1.0f, true);
            tj30 tj30VarC3 = zq8.c(zx7Var, false);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, x7zVar2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC3, shdVar);
            jpm0.o(fetVar, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar4);
            q(0, fetVar, jr8Var.b(jm40Var, zx7Var2));
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqj0(mm40Var, i, (byte) 22);
        }
    }

    public static final void o(wxl0 wxl0Var, Function1 function1, fet fetVar, int i) {
        wxl0Var.getClass();
        function1.getClass();
        fetVar.g0(1218954549);
        int i2 = (fetVar.i(wxl0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 12.0f, 0.0f, 12.0f, 0.0f, 10);
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
            p(wxl0Var.b, function1, fetVar, (i2 & 112) | 8);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a5k0(wxl0Var, function1, i, (byte) 26);
        }
    }

    public static final void p(rwl0 rwl0Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(1520644487);
        int i2 = (fetVar.i(rwl0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarE0 = o2e.e0(o7k0.d(jm40.b, 1.0f), "STADIUM_INFO_LIST");
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, 12.0f, 0.0f, 20.0f, 5);
            boolean z = ((i2 & 14) == 4 || fetVar.i(rwl0Var)) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new u5l0((byte) 12, (Object) rwl0Var, function1);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarE0, null, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, 6, 506);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a5k0(rwl0Var, function1, i, (byte) 27);
        }
    }

    public static final void q(int i, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fetVar.g0(1400485506);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = mm40Var;
            mm40 mm40VarN = s5x0.N(mm40Var2, 0.0f, 0.0f, 0.0f, 22.0f, 7);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.n, fetVar, 48);
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
            mm40 mm40VarN2 = o7k0.n(jm40Var, 56.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN2);
            vqm vqmVar = vqm.b;
            zq8.a(0, fetVar, xbc.c0(mm40VarE, vbc.d0(vqmVar, fetVar, 6, 0)));
            mm40 mm40VarE2 = o7k0.e(o7k0.s(jm40Var, 64.0f), 12.0f);
            zcl zclVar3 = qmk.m;
            dw9.x(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarE2), vbc.d0(vqmVar, fetVar, 6, 0), fetVar, 0, true);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqj0(mm40Var2, i, (byte) 24);
        }
    }

    public static final yw00 r(ctf0 ctf0Var) {
        g9x g9xVar = new g9x(ctf0Var.b.a(R.string.call_to_auth, Arrays.copyOf(new Object[0], 0)));
        nul nulVar = nul.e;
        oe9 oe9Var = oe9.f25112a;
        lsm0 lsm0Var = ctf0Var.b;
        return new yw00(g9xVar, new wul(nulVar, oe9Var, new ue9(lsm0Var.a(R.string.offer_to_auth_login_button, Arrays.copyOf(new Object[0], 0))), true, false, true), new wul(iul.e, oe9Var, new ue9(lsm0Var.a(R.string.offer_to_auth_registration_button, Arrays.copyOf(new Object[0], 0))), true, false, true));
    }

    public static final List s(List list, ctf0 ctf0Var, y78 y78Var, boolean z, boolean z2, wcb wcbVar, int i, boolean z3, boolean z4, v5l0 v5l0Var, String str, boolean z5) {
        list.getClass();
        ctf0Var.getClass();
        if (list.isEmpty()) {
            return iun.f15405a;
        }
        lc00 lc00VarB = kotlin.collections.a.b();
        lc00VarB.add(new agh0(new hjm(ctf0Var.f(R.string.events_live, new Object[0]), null, null, null, null, null, true, null, null, false, null, null, 8126)));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            d0t d0tVar = (d0t) obj;
            String strA = wcbVar != null ? wcbVar.a(d0tVar.v, d0tVar.u) : null;
            if (strA == null) {
                strA = "";
            }
            lc00VarB.add(n2x.P(d0tVar, ctf0Var, y78Var, z, z2, strA, i, z3, z4, v5l0Var, str, unh0.i0(i2, lc00VarB), z5));
            i2 = i3;
        }
        return kotlin.collections.a.a(lc00VarB);
    }

    public static void t(String str, boolean z) {
        if (z) {
            return;
        }
        jf4.o(str);
    }

    public static void u(boolean z) {
        if (z) {
            return;
        }
        e9d0.o();
    }

    public static void v(int i, int i2, int i3, String str) {
        if (i < i2) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too low)");
        }
        if (i <= i3) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too high)");
    }

    public static void w(int i) {
        if (i >= 0) {
            return;
        }
        e9d0.o();
    }

    public static void x(Object obj, String str) {
        if (obj != null) {
            return;
        }
        hny.u(str);
    }

    public static void y(String str, boolean z) {
        if (z) {
            return;
        }
        jf4.n(str);
    }

    public static final List z(List list) {
        String str = (String) CollectionsKt.f0(list);
        if (str == null) {
            str = "";
        }
        return StringsKt__StringsKt.split$default(kotlin.text.c.r(str, Separators.STAR, "", false), new String[]{"-"}, false, 0, 6, null);
    }
}
