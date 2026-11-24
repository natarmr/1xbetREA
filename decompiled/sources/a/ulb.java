package a;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.javax.sip.message.Response;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ulb {
    public static final void A(g8n g8nVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-944231548);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(g8nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 34.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            String str = g8nVar.e;
            if (str == null) {
                fetVar.e0(208426519);
                fetVar.r(false);
            } else {
                fetVar.e0(208426520);
                j6n.h(str, kro0.f18776a, null, 0, 0, fetVar, 48, 28);
                fetVar.r(false);
            }
            String str2 = g8nVar.d;
            if (str2 == null) {
                fetVar.e0(208609326);
                fetVar.r(false);
            } else {
                fetVar.e0(208609327);
                j6n.h(str2, lso0.f20590a, null, 0, 0, fetVar, 48, 28);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2l(g8nVar, i, (byte) 17);
        }
    }

    public static final void B(h8n h8nVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(233244260);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(h8nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 34.0f);
            x5d x5dVarA = w5d.a(new qw3(2.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.n, fetVar, 48);
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
            String str = h8nVar.c;
            if (str == null) {
                fetVar.e0(1245945951);
                fetVar.r(false);
            } else {
                fetVar.e0(1245945952);
                s(str, ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), fetVar, 0);
                fetVar.r(false);
            }
            String str2 = h8nVar.d;
            if (str2 == null) {
                fetVar.e0(1246083281);
                fetVar.r(false);
            } else {
                fetVar.e0(1246083282);
                s(str2, ((StaticColors) fetVar.k(m8m0.f21378a)).m130getWhite600d7_KjU(), fetVar, 0);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2l(h8nVar, i, (byte) 15);
        }
    }

    public static gmq D(gmq gmqVar, int i) {
        i99 i99Var = i99.f14377a;
        if (i < 0 && i != -2 && i != -1) {
            c99.s(twn.m(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i == -1) {
            i99Var = i99.b;
            i = 0;
        }
        int i2 = i;
        i99 i99Var2 = i99Var;
        return gmqVar instanceof afr ? afr.e((afr) gmqVar, null, i2, i99Var2, 1) : new rtb(gmqVar, null, i2, i99Var2, 2);
    }

    public static final bln E(String str, e0d e0dVar, boolean z) {
        c0d c0dVar;
        String str2 = e0dVar.c;
        String str3 = e0dVar.d;
        double d = e0dVar.b;
        double d2 = e0dVar.f6983a;
        if (d == 0.0d || d2 == 0.0d) {
            c0dVar = c0d.f3518a;
        } else if (z && d != d2) {
            c0dVar = c0d.e;
        } else if (z) {
            c0dVar = c0d.d;
        } else if (d2 > d) {
            c0dVar = c0d.b;
        } else {
            c0dVar = d2 < d ? c0d.c : c0d.f3518a;
        }
        return new bln(str, new j43(str2, str3, c0dVar, false));
    }

    public static final ArrayList F(List list, ypl0 ypl0Var) {
        l4t0 l4t0Var;
        int i;
        char c;
        int i2;
        char c2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (tlb.Y((n4t0) obj)) {
                arrayList.add(obj);
            }
        }
        List listA0 = CollectionsKt.A0(arrayList, new wpv((byte) 0));
        ArrayList arrayList2 = new ArrayList(r3d.q(listA0, 10));
        Iterator it = listA0.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                q3d.p();
                throw null;
            }
            n4t0 n4t0Var = (n4t0) next;
            g4t0 g4t0Var = n4t0Var.e;
            m4t0 m4t0Var = n4t0Var.d;
            m4t0 m4t0Var2 = n4t0Var.c;
            if (g4t0Var instanceof e4t0) {
                l4t0Var = ((e4t0) g4t0Var).f7200a;
            } else {
                if (!(g4t0Var instanceof f4t0)) {
                    t9f.b();
                    return null;
                }
                l4t0Var = ((f4t0) g4t0Var).c;
            }
            long j = i3;
            String str = n4t0Var.f22914a;
            n0x n0xVar = new n0x(ypl0Var.c.j);
            String str2 = n4t0Var.f;
            String str3 = m4t0Var2.c;
            Iterator it2 = it;
            StringBuilder sb = new StringBuilder(ujn.h);
            String str4 = m4t0Var2.b;
            if (str4.length() == 0) {
                sb.setLength(0);
            } else {
                int i5 = 0;
                if (StringsKt.O(str4, ujn.h, false)) {
                    sb.setLength(i5);
                    sb.append(str4);
                } else if (kotlin.text.c.x(str4, "https://", false)) {
                    i5 = 0;
                    sb.setLength(i5);
                    sb.append(str4);
                } else {
                    if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                        i = 1;
                        c = '/';
                    } else {
                        sb.append('/');
                        c = '/';
                        i = 1;
                    }
                    char[] cArr = new char[i];
                    cArr[0] = c;
                    sb.append(StringsKt.y0(str4, cArr));
                }
            }
            roh rohVar = new roh(new c280(sb.toString(), R.drawable.ic_glyph_placeholder_player), str3);
            String str5 = m4t0Var.c;
            StringBuilder sb2 = new StringBuilder(ujn.h);
            String str6 = m4t0Var.b;
            if (str6.length() == 0) {
                sb2.setLength(0);
                i2 = 0;
            } else {
                if (StringsKt.O(str6, ujn.h, false)) {
                    i2 = 0;
                } else if (kotlin.text.c.x(str6, "https://", false)) {
                    i2 = 0;
                } else {
                    if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                        c2 = '/';
                    } else {
                        c2 = '/';
                        sb2.append('/');
                    }
                    i2 = 0;
                    sb2.append(StringsKt.y0(str6, c2));
                }
                sb2.setLength(i2);
                sb2.append(str6);
            }
            roh rohVar2 = new roh(new c280(sb2.toString(), R.drawable.ic_glyph_placeholder_player), str5);
            toh tohVar = l4t0Var instanceof i4t0 ? toh.f34283a : l4t0Var instanceof j4t0 ? toh.b : toh.c;
            rdj rdjVar = rdj.f30294a;
            arrayList2.add(new qoh(j, str, n0xVar, str2, rohVar, rohVar2, tohVar, rdj.f(new znq0(n4t0Var.b), sdj.UNIVERSAL, null, 60)));
            it = it2;
            i3 = i4;
        }
        return arrayList2;
    }

    public static final vpv G(long j, boolean z, ctf0 ctf0Var, lov lovVar, ypl0 ypl0Var) {
        Object next;
        ArrayList arrayListF;
        String strA;
        lov lovVar2 = lovVar;
        List list = lovVar2.e;
        List list2 = lovVar2.f;
        List list3 = lovVar2.g;
        ctf0Var.getClass();
        ypl0Var.getClass();
        c0o c0oVar = upv.d;
        ArrayList arrayList = new ArrayList();
        c0oVar.getClass();
        y2 y2Var = new y2(c0oVar, (byte) 0);
        while (true) {
            int i = 1;
            if (!y2Var.hasNext()) {
                Iterator it = arrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((upv) next).f36086a != j);
                upv upvVar = (upv) next;
                if (upvVar == null && (upvVar = (upv) CollectionsKt.firstOrNull(arrayList)) == null) {
                    return null;
                }
                lsm0 lsm0Var = ctf0Var.b;
                hjm hjmVar = new hjm(lsm0Var.a(R.string.last_fights, Arrays.copyOf(new Object[0], 0)), new njm(127), new y3d(StaticColors.INSTANCE.m123getWhite0d7_KjU()), null, null, null, false, null, null, false, null, null, 8184);
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    upv upvVar2 = (upv) it2.next();
                    long j2 = upvVar2.f36086a;
                    int iOrdinal = upvVar2.ordinal();
                    if (iOrdinal == 0) {
                        strA = "";
                    } else if (iOrdinal == i) {
                        strA = lovVar2.c;
                    } else {
                        if (iOrdinal != 2) {
                            t9f.b();
                            return null;
                        }
                        strA = lovVar2.d;
                    }
                    if (strA.length() == 0) {
                        strA = lsm0Var.a(upvVar2.b, Arrays.copyOf(new Object[0], 0));
                    }
                    xxl xxlVar = new xxl(strA);
                    byte b = upvVar2.f36086a;
                    hjm hjmVar2 = hjmVar;
                    Iterator it3 = it2;
                    upv upvVar3 = upvVar;
                    arrayList2.add(new lxl(j2, (dyl) xxlVar, false, ((long) b) == ((long) upvVar.f36086a) ? uxl.b : uxl.f36445a, (cwl) null, 108));
                    it2 = it3;
                    lovVar2 = lovVar;
                    hjmVar = hjmVar2;
                    upvVar = upvVar3;
                    i = 1;
                }
                hjm hjmVar3 = hjmVar;
                a4x a4xVarO0 = dyb.o0(arrayList2);
                float f = xfn.b(ctf0Var.j()).c;
                zcl zclVar = qmk.f28987a;
                fyl fylVar = new fyl(a4xVarO0, null, null, s5x0.t(f + 8.0f, 0.0f, 2), null, 22);
                int iOrdinal2 = upvVar.ordinal();
                if (iOrdinal2 == 0) {
                    arrayListF = F(list, ypl0Var);
                } else if (iOrdinal2 == 1) {
                    arrayListF = F(list2, ypl0Var);
                } else {
                    if (iOrdinal2 != 2) {
                        t9f.b();
                        return null;
                    }
                    arrayListF = F(list3, ypl0Var);
                }
                return new vpv(z, hjmVar3, fylVar, dyb.o0(CollectionsKt.D0(arrayListF, 3)));
            }
            Object next2 = y2Var.next();
            upv upvVar4 = (upv) next2;
            upvVar4.getClass();
            int iOrdinal3 = upvVar4.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        t9f.b();
                        return null;
                    }
                    if (list3 == null || !list3.isEmpty()) {
                        Iterator it4 = list3.iterator();
                        while (it4.hasNext()) {
                            if (tlb.Y((n4t0) it4.next())) {
                                arrayList.add(next2);
                                break;
                            }
                        }
                    }
                } else if (list2 == null || !list2.isEmpty()) {
                    Iterator it5 = list2.iterator();
                    while (it5.hasNext()) {
                        if (tlb.Y((n4t0) it5.next())) {
                            arrayList.add(next2);
                            break;
                            break;
                        }
                    }
                }
            } else if (list == null || !list.isEmpty()) {
                Iterator it6 = list.iterator();
                while (it6.hasNext()) {
                    if (tlb.Y((n4t0) it6.next())) {
                        arrayList.add(next2);
                        break;
                        break;
                    }
                }
            }
        }
    }

    public static final p5a H(gmq gmqVar) {
        return gmqVar instanceof p5a ? (p5a) gmqVar : new r5a(gmqVar);
    }

    public static final void J(AbstractMap abstractMap, Pair pair) {
        Object obj = pair.f46059a;
        if (((Number) obj).longValue() != -1) {
            abstractMap.put("dateFrom", obj);
        }
        abstractMap.put("dateTo", pair.b);
    }

    public static final void K(int i, Map map) {
        if (i > 0) {
            map.put("fcountry", Integer.valueOf(i));
        }
    }

    public static final gmq L(gmq gmqVar, CoroutineContext coroutineContext) {
        if (coroutineContext.get(gqw0.o1) != null) {
            hny.v(coroutineContext, "Flow context cannot contain job in it. Had ");
            return null;
        }
        if (coroutineContext.equals(kotlin.coroutines.g.f46065a)) {
            return gmqVar;
        }
        return gmqVar instanceof afr ? afr.e((afr) gmqVar, coroutineContext, 0, null, 6) : new rtb(gmqVar, coroutineContext, 0, null, 12);
    }

    public static final sgy M(ugi0 ugi0Var) {
        ugi0Var.getClass();
        if (ugi0Var instanceof nje) {
            return ((nje) ugi0Var).b;
        }
        if (ugi0Var instanceof vgi0) {
            return M(((vgi0) ugi0Var).f37382a);
        }
        return null;
    }

    public static final ArrayList N(ArrayList arrayList) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        int i = 0;
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            rlk rlkVar = ((olk) obj).c;
            arrayList2.add(new gyr(String.valueOf((rlkVar == null || (num4 = rlkVar.f30701a) == null) ? 0 : num4.intValue()), String.valueOf((rlkVar == null || (num3 = rlkVar.b) == null) ? 0 : num3.intValue()), String.valueOf(((rlkVar == null || (num2 = rlkVar.f30701a) == null) ? 0 : num2.intValue()) + ((rlkVar == null || (num = rlkVar.b) == null) ? 0 : num.intValue())), String.valueOf(i3)));
            i2 = i3;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        int size = 1 - arrayList3.size();
        if (size >= 0) {
            while (true) {
                arrayList3.add(new gyr("-", "-", "-", "-"));
                if (i == size) {
                    break;
                }
                i++;
            }
        }
        return arrayList3;
    }

    public static final int O(pdj pdjVar) {
        pdjVar.getClass();
        int iOrdinal = pdjVar.ordinal();
        if (iOrdinal == 0) {
            return R.string.history_filter_month;
        }
        if (iOrdinal == 1) {
            return R.string.history_filter_set_period;
        }
        if (iOrdinal == 2) {
            return R.string.send_to_email;
        }
        t9f.b();
        return 0;
    }

    public static final void P(AbstractMap abstractMap) {
        abstractMap.put("gr", 1357);
    }

    public static final void S(AbstractMap abstractMap, boolean z) {
        if (z) {
            abstractMap.put("hasVideo", 1);
        }
    }

    public static final boolean T(xrz xrzVar, ucq ucqVar) {
        if (xrzVar instanceof lf7) {
            return ucqVar.l;
        }
        if (xrzVar instanceof m810) {
            return ucqVar.m;
        }
        if (xrzVar instanceof q8k) {
            return ucqVar.i;
        }
        if (xrzVar instanceof pki0) {
            return ucqVar.j;
        }
        if (xrzVar instanceof h8i0) {
            return ucqVar.k;
        }
        return false;
    }

    public static final boolean U(int i, boolean z) {
        if (i == 0) {
            return false;
        }
        if (i != 1) {
            if (i != 2 || z) {
                return false;
            }
        } else if (!z) {
            return false;
        }
        return true;
    }

    public static final void V(LinkedHashMap linkedHashMap, String str) {
        linkedHashMap.put("lng", str);
    }

    public static final void W(String str, TreeMap treeMap) {
        treeMap.put("lng", str);
    }

    public static final void X(AbstractMap abstractMap, ygq0 ygq0Var) {
        ygq0Var.getClass();
        if (ygq0Var == ygq0.NOT || ygq0Var == ygq0.CUSTOM_DATE) {
            return;
        }
        abstractMap.put("minOffset", jpm0.p(ygq0Var));
    }

    public static final void Y(TreeMap treeMap, Integer num) {
        if (num != null) {
            treeMap.put("mode", num);
        }
    }

    public static final String Z(String str, fet fetVar) {
        str.getClass();
        boolean zG = fetVar.g(str);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            String strL = ttm0.L(3, str);
            if (strL.length() == 0) {
                strL = "0";
            }
            objP = strL;
            fetVar.o0(objP);
        }
        return (String) objP;
    }

    public static final void a(int i, ugd ugdVar, xdr xdrVar, xdr xdrVar2, fet fetVar) {
        fetVar.g0(-1127000728);
        int i2 = (fetVar.i(xdrVar) ? 4 : 2) | i | (fetVar.i(xdrVar2) ? 32 : 16) | (fetVar.i(ugdVar) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(mm40VarD, backgroundContent, vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12));
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
            y5d y5dVar = y5d.f42040a;
            if (xdrVar != null) {
                fetVar.e0(-1370970752);
                xdrVar.F(y5dVar, fetVar, Integer.valueOf(((i2 << 3) & 112) | 6));
                fetVar.r(false);
            } else {
                fetVar.e0(-1370936156);
                fetVar.r(false);
            }
            ugdVar.F(y5dVar, fetVar, Integer.valueOf(((i2 >> 3) & 112) | 6));
            if (xdrVar2 != null) {
                fetVar.e0(-1370881379);
                xdrVar2.F(y5dVar, fetVar, Integer.valueOf((i2 & 112) | 6));
                fetVar.r(false);
            } else {
                fetVar.e0(-1370843900);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new coh(xdrVar, xdrVar2, ugdVar, i, (byte) 22);
        }
    }

    public static final void a0(TreeMap treeMap, List list) {
        if (list.isEmpty()) {
            return;
        }
        treeMap.put("sportIds", CollectionsKt.b0(CollectionsKt.z0(list), Separators.COMMA, null, null, null, 62));
    }

    public static final void b(String str, fet fetVar, int i) {
        fetVar.g0(-1040345060);
        byte b = 4;
        int i2 = (fetVar.g(str) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 28.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            if (str == null) {
                fetVar.e0(-579669610);
                fetVar.r(false);
            } else {
                fetVar.e0(-579669609);
                zfn zfnVar = bmd.h;
                obc.d(zfnVar.a(new z6k(((w6k) fetVar.k(zfnVar)).getDensity(), 1.0f)), u1c.M(734053716, new hxk(str, b), fetVar), fetVar, 56);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hxk((byte) 5, i, str);
        }
    }

    public static final long b0(qtm qtmVar) {
        qtmVar.getClass();
        long j = qtmVar.f29305a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        fgm fgmVar = fgm.f9498a;
        long j2 = j - jCurrentTimeMillis;
        if (j2 < 0) {
            return 0L;
        }
        return j2;
    }

    public static final void c(mm40 mm40Var, fqj0 fqj0Var, fet fetVar, int i) {
        int i2;
        mm40Var.getClass();
        fqj0Var.getClass();
        fetVar.g0(-167072416);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(fqj0Var) ? 32 : 16);
        byte b = 0;
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

    public static final g5a0 c0(long j, String str) {
        str.getClass();
        return new g5a0(new c280(vsm0.s(j, str), R.drawable.ic_glyph_placeholder_player), null);
    }

    public static final void d(z77 z77Var, Function1 function1, fet fetVar, int i) {
        Function1 function2;
        boolean z;
        boolean z2;
        fet fetVar2 = fetVar;
        z77Var.getClass();
        function1.getClass();
        fetVar2.g0(120883782);
        int i2 = (fetVar2.g(z77Var) ? 4 : 2) | i | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            long backgroundContent = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarM = s5x0.M(i120.Q(o7k0.e(jm40Var, 52.0f), backgroundContent, vgg0.c(0.0f, 0.0f, 20.0f, 20.0f, 3)), 12.0f, 8.0f, 12.0f, 8.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarM);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
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
            if (z77Var instanceof y77) {
                fetVar2.e0(-1382293190);
                xcm0.f(null, ((y77) z77Var).g, function1, fetVar2, (i2 << 3) & 896, 1);
                fetVar2.r(false);
                function2 = function1;
                z2 = true;
            } else {
                fetVar2.e0(-1382026931);
                String str = z77Var.f().e.b;
                thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA, shdVar);
                jpm0.o(fetVar2, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
                x7z x7zVarI = ohs0.i(fetVar2, mm40VarC1, shdVar4, 1.0f, true);
                on5 on5VarB = z77Var.b();
                int i3 = i2 & 112;
                boolean z4 = i3 == 32;
                Object objP = fetVar2.P();
                cl5 cl5Var = ukd.f35823a;
                if (z4 || objP == cl5Var) {
                    objP = new dib(function1, (byte) 24);
                    fetVar2.o0(objP);
                }
                Function0 function0 = (Function0) objP;
                boolean z5 = i3 == 32;
                Object objP2 = fetVar2.P();
                if (z5 || objP2 == cl5Var) {
                    objP2 = new dib(function1, (byte) 25);
                    fetVar2.o0(objP2);
                }
                Function0 function3 = (Function0) objP2;
                function2 = function1;
                rcb.j(x7zVarI, on5VarB, function0, function3, fetVar2, 0, 0);
                fetVar2 = fetVar2;
                if (str.length() > 0) {
                    fetVar2.e0(-111856012);
                    mm40 mm40VarU = o7k0.u(jm40Var, 0.0f, 140.0f, 1);
                    boolean zG = fetVar2.g(str);
                    Object objP3 = fetVar2.P();
                    if (zG || objP3 == cl5Var) {
                        objP3 = new wul(nul.e, oe9.c, new ve9(str, R.drawable.ic_glyph_sell), true, false, false);
                        fetVar2.o0(objP3);
                    }
                    wul wulVar = (wul) objP3;
                    boolean z6 = i3 == 32;
                    Object objP4 = fetVar2.P();
                    if (z6 || objP4 == cl5Var) {
                        objP4 = new dib(function2, (byte) 26);
                        fetVar2.o0(objP4);
                    }
                    qzb.n(mm40VarU, wulVar, (Function0) objP4, fetVar2, 0, 0);
                    z = false;
                    fetVar2.r(false);
                } else {
                    z = false;
                    fetVar2.e0(-110884441);
                    fetVar2.r(false);
                }
                z2 = true;
                fetVar2.r(true);
                fetVar2.r(z);
            }
            fetVar2.r(z2);
        } else {
            function2 = function1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k57(z77Var, function2, i, (byte) 2);
        }
    }

    public static final xuf d0(tuf tufVar) {
        tufVar.getClass();
        return new xuf(tufVar.f34547a, tufVar.b, tufVar.c, tufVar.d, tufVar.e, tufVar.f, tufVar.g, tufVar.h, tufVar.i, tufVar.j, tufVar.k, tufVar.l, tufVar.m, tufVar.n);
    }

    public static final void e(mm40 mm40Var, p2r0 p2r0Var, xcz xczVar, hh80 hh80Var, qw3 qw3Var, Function1 function1, fet fetVar, int i) {
        p2r0Var.getClass();
        xczVar.getClass();
        hh80Var.getClass();
        function1.getClass();
        fetVar.g0(1794244721);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(p2r0Var) ? 32 : 16) | (fetVar.g(xczVar) ? 256 : 128) | (fetVar.g(qw3Var) ? 16384 : 8192) | (fetVar.i(function1) ? 131072 : 65536);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            mm40 mm40VarS = o7k0.s(jm40.b, ((ycl) fetVar.k(wdr0.f38987a)).f42389a);
            boolean z = p2r0Var.f26266a;
            boolean zG = ((i2 & 112) == 32) | fetVar.g(mm40VarS) | fetVar.h(z) | ((458752 & i2) == 131072);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                t13 t13Var = new t13((Object) p2r0Var, (Object) mm40VarS, z, (Object) function1, (byte) 4);
                fetVar.o0(t13Var);
                objP = t13Var;
            }
            b8k0.f(mm40Var, xczVar, hh80Var, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, (i2 & 14) | ((i2 >> 3) & 112) | 384 | (57344 & i2), Response.NOT_ACCEPTABLE_HERE);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new acb0(mm40Var, p2r0Var, xczVar, hh80Var, qw3Var, function1, i, (byte) 12);
        }
    }

    public static final z4l e0(e1h e1hVar, Integer num) {
        String string;
        int i;
        String str;
        int i2;
        List list;
        l1h l1hVar;
        boolean zBooleanValue;
        i6l i6lVar;
        int i3;
        char c;
        Long l;
        String string2;
        int i4;
        char c2;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        e1hVar.getClass();
        Integer num11 = e1hVar.f7035a;
        int iIntValue = num11 != null ? num11.intValue() : 0;
        String str2 = e1hVar.b;
        String str3 = str2 == null ? "" : str2;
        Integer num12 = e1hVar.c;
        int iIntValue2 = num12 != null ? num12.intValue() : 0;
        String str4 = e1hVar.d;
        String str5 = str4 == null ? "" : str4;
        Integer num13 = e1hVar.e;
        int iIntValue3 = num13 != null ? num13.intValue() : 0;
        Integer num14 = e1hVar.f;
        int iIntValue4 = num14 != null ? num14.intValue() : 0;
        Long l2 = e1hVar.g;
        long jLongValue = l2 != null ? l2.longValue() : 0L;
        Integer num15 = e1hVar.h;
        int iIntValue5 = num15 != null ? num15.intValue() : 0;
        Collection collection = e1hVar.i;
        if (collection == null) {
            collection = iun.f15405a;
        }
        o1h o1hVar = e1hVar.j;
        l1h l1hVar2 = new l1h((o1hVar == null || (num10 = o1hVar.f24480a) == null) ? 0 : num10.intValue(), (o1hVar == null || (num9 = o1hVar.b) == null) ? 0 : num9.intValue(), (o1hVar == null || (num8 = o1hVar.c) == null) ? 0 : num8.intValue(), (o1hVar == null || (num7 = o1hVar.d) == null) ? -1 : num7.intValue(), (o1hVar == null || (num6 = o1hVar.e) == null) ? -1 : num6.intValue(), (o1hVar == null || (num5 = o1hVar.f) == null) ? 0 : num5.intValue(), (o1hVar == null || (num4 = o1hVar.g) == null) ? 0 : num4.intValue(), (o1hVar == null || (num3 = o1hVar.h) == null) ? 0 : num3.intValue(), (o1hVar == null || (num2 = o1hVar.i) == null) ? 0 : num2.intValue());
        List list2 = e1hVar.k;
        int i5 = iIntValue5;
        if (list2 != null) {
            string = "";
            ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                b1h b1hVar = (b1h) it.next();
                b1hVar.getClass();
                Iterator it2 = it;
                Long l3 = b1hVar.f1805a;
                if (l3 != null) {
                    StringBuilder sb = new StringBuilder(ujn.h);
                    String str6 = "/sfiles/dota2/abilities/128/" + l3 + ".png";
                    if (str6.length() == 0) {
                        sb.setLength(0);
                        l = l3;
                    } else {
                        l = l3;
                        int i6 = 0;
                        if (StringsKt.O(str6, ujn.h, false)) {
                            sb.setLength(i6);
                            sb.append(str6);
                        } else if (kotlin.text.c.x(str6, "https://", false)) {
                            i6 = 0;
                            sb.setLength(i6);
                            sb.append(str6);
                        } else {
                            if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                i4 = 1;
                                c2 = '/';
                            } else {
                                sb.append('/');
                                c2 = '/';
                                i4 = 1;
                            }
                            char[] cArr = new char[i4];
                            cArr[0] = c2;
                            sb.append(StringsKt.y0(str6, cArr));
                        }
                    }
                    string2 = sb.toString();
                } else {
                    l = l3;
                    string2 = string;
                }
                long jLongValue2 = l != null ? l.longValue() : 0L;
                Integer num16 = b1hVar.b;
                int iIntValue6 = num16 != null ? num16.intValue() : 0;
                Integer num17 = b1hVar.c;
                int iIntValue7 = num17 != null ? num17.intValue() : 0;
                String str7 = b1hVar.d;
                String str8 = str7 == null ? string : str7;
                List list3 = b1hVar.e;
                if (list3 == null) {
                    list3 = iun.f15405a;
                }
                arrayList.add(new z3l(iIntValue6, iIntValue7, jLongValue2, str8, string2, list3));
                it = it2;
                iIntValue = iIntValue;
                str3 = str3;
                iIntValue2 = iIntValue2;
            }
            i = iIntValue;
            str = str3;
            i2 = iIntValue2;
            list = arrayList;
        } else {
            string = "";
            i = iIntValue;
            str = str3;
            i2 = iIntValue2;
            list = iun.f15405a;
        }
        Boolean bool = e1hVar.o;
        boolean zBooleanValue2 = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = e1hVar.m;
        if (bool2 != null) {
            zBooleanValue = bool2.booleanValue();
            l1hVar = l1hVar2;
        } else {
            l1hVar = l1hVar2;
            zBooleanValue = false;
        }
        Boolean bool3 = e1hVar.n;
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        Long l4 = e1hVar.l;
        long jLongValue3 = l4 != null ? l4.longValue() : 0L;
        Integer num18 = e1hVar.p;
        int iIntValue8 = num18 != null ? num18.intValue() : 0;
        if (num11 != null) {
            StringBuilder sb2 = new StringBuilder(ujn.h);
            String strJ = h97.j(num11, "/sfiles/dota2/128/", ".jpg");
            if (strJ.length() == 0) {
                sb2.setLength(0);
            } else {
                if (StringsKt.O(strJ, ujn.h, false)) {
                    i3 = 0;
                } else if (kotlin.text.c.x(strJ, "https://", false)) {
                    i3 = 0;
                } else {
                    if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                        c = '/';
                    } else {
                        c = '/';
                        sb2.append('/');
                    }
                    sb2.append(StringsKt.y0(strJ, c));
                }
                sb2.setLength(i3);
                sb2.append(strJ);
            }
            string = sb2.toString();
        }
        if (num != null && num.intValue() == 1) {
            i6lVar = i6l.b;
        } else {
            i6lVar = (num != null && num.intValue() == 2) ? i6l.c : i6l.f14245a;
        }
        i6l i6lVar2 = i6lVar;
        Integer num19 = e1hVar.q;
        return new z4l(i, str, i2, str5, iIntValue3, iIntValue4, jLongValue, i5, collection, l1hVar, list, zBooleanValue2, zBooleanValue, zBooleanValue3, jLongValue3, iIntValue8, string, i6lVar2, num19 != null ? num19.intValue() : -1);
    }

    public static final void f(smh smhVar, Function1 function1, fet fetVar, int i) {
        jm40 jm40Var;
        pcy pcyVar;
        jm40 jm40Var2;
        zx7 zx7Var;
        smh smhVar2 = smhVar;
        fet fetVar2 = fetVar;
        smhVar2.getClass();
        String str = smhVar2.e;
        function1.getClass();
        fetVar2.g0(1183889017);
        int i2 = i | (fetVar2.g(smhVar2) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var3 = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var3, 176.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN);
            ncg0 ncg0VarA = lcg0.a(0.0f, 7);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objP2 = fetVar2.P();
            if (z || objP2 == cl5Var) {
                objP2 = new tmh(function1, smhVar2, (byte) 1);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarF = phu0.F(mm40VarE, null, ncg0VarA, false, gy40Var, (Function0) objP2, fetVar2, 24960, 5);
            zx7 zx7Var2 = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var2, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarF);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar2);
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
            pm80 pm80VarF = a8k0.F(R.drawable.tournament_card_placeholder, 0, fetVar2);
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarA = jr8Var.a(jm40Var3);
            String str2 = smhVar2.b;
            omh omhVar = smhVar2.c;
            rmh rmhVar = smhVar2.f;
            fet fetVar3 = fetVar;
            k7x.b(str2, null, mm40VarA, pm80VarF, pm80VarF, null, null, null, null, null, gqw0.A, null, fetVar3, 36912, 6, 31712);
            mm40 mm40VarA2 = jr8Var.a(jm40Var3);
            StaticColors staticColors = StaticColors.INSTANCE;
            zq8.a(0, fetVar3, i120.P(mm40VarA2, new e900(q3d.j(new y3d(staticColors.m121getTransparent0d7_KjU()), new y3d(staticColors.m75getBlack600d7_KjU()), new y3d(staticColors.m62getBlack0d7_KjU())), null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)))), null, 6));
            if (rmhVar instanceof pmh) {
                fetVar3.e0(1682465748);
                jm40Var = jm40Var3;
                j6n.h(((pmh) rmhVar).f27234a, kro0.f18776a, jr8Var.b(s5x0.N(jm40Var3, 8.0f, 8.0f, 8.0f, 0.0f, 8), zx7Var2), 0, 0, fetVar3, 48, 24);
                fetVar3.r(false);
            } else {
                jm40Var = jm40Var3;
                fetVar3.e0(1682766851);
                fetVar3.r(false);
            }
            mm40 mm40VarN2 = s5x0.N(o7k0.d(jm40Var, 1.0f), 8.0f, 0.0f, 8.0f, 8.0f, 2);
            zx7 zx7Var3 = gqw0.g;
            mm40 mm40VarB = jr8Var.b(mm40VarN2, zx7Var3);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
            int iHashCode2 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM2 = fetVar3.m();
            mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarB);
            fetVar3.i0();
            if (fetVar3.S) {
                pcyVar = pcyVar2;
                fetVar3.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar3.r0();
            }
            jpm0.o(fetVar3, x5dVarA, shdVar);
            jpm0.o(fetVar3, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar3, shdVar3, fetVar3);
            jpm0.o(fetVar3, mm40VarC1, shdVar4);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar3, 0);
            int iHashCode3 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM3 = fetVar3.m();
            mm40 mm40VarC2 = kbc.c0(fetVar3, jm40Var);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, thg0VarA, shdVar);
            jpm0.o(fetVar3, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar3, shdVar3, fetVar3);
            jpm0.o(fetVar3, mm40VarC2, shdVar4);
            if (omhVar instanceof mmh) {
                fetVar3.e0(166999934);
                lgb.v(o7k0.n(jm40Var, 20.0f), o7k0.n(jm40Var, 20.0f), ((mmh) omhVar).f22037a, R.drawable.ic_glyph_cyber_gamepad, ((ThemeColors) fetVar3.k(zaq0.b)).getSecondary(), gqw0.f1, fetVar3, 196608, 0);
                fetVar3.r(false);
            } else {
                fetVar3.e0(167471785);
                fetVar3.r(false);
            }
            if (str.length() > 0) {
                fetVar3.e0(167577340);
                jm40 jm40Var4 = jm40Var;
                jm40Var2 = jm40Var4;
                mm40 mm40VarL = twn.l(gqw0.k, s5x0.N(jm40Var4, 8.0f, 0.0f, 0.0f, 0.0f, 14));
                long jM123getWhite0d7_KjU = staticColors.m123getWhite0d7_KjU();
                ((g1t0) fetVar3.k(j1t0.e)).getClass();
                zx7Var = zx7Var3;
                v8q0.a(str, mm40VarL, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.m(), fetVar, 0, 24960, 109560);
                fetVar3 = fetVar;
                fetVar3.r(false);
            } else {
                jm40Var2 = jm40Var;
                zx7Var = zx7Var3;
                fetVar3.e0(168099721);
                fetVar3.r(false);
            }
            fetVar3.r(true);
            String str3 = smhVar.d;
            mm40 mm40VarN3 = s5x0.N(jm40Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar3.k(zfnVar)).getClass();
            long j = g1t0.r().f42262a.b;
            long j2 = qmk.q;
            long jM123getWhite0d7_KjU2 = staticColors.m123getWhite0d7_KjU();
            ((g1t0) fetVar3.k(zfnVar)).getClass();
            zx7 zx7Var4 = zx7Var;
            smhVar2 = smhVar;
            kc5.N(str3, mm40VarN3, jM123getWhite0d7_KjU2, null, null, 0L, j2, j, null, null, 0L, zx7Var4, 2, false, 2, 0, false, null, g1t0.r(), 0.0f, fetVar, 0, 1600512, 0, 3055416);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vmh(smhVar2, function1, i, (byte) 0);
        }
    }

    public static final List f0(d0t d0tVar) {
        Object next;
        Object g0g0Var;
        Iterator it = d0tVar.p.n.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((cmr) next).f4620a != dmr.q);
        cmr cmrVar = (cmr) next;
        String str = cmrVar != null ? cmrVar.b : null;
        if (str == null) {
            str = "";
        }
        if (StringsKt.W(str)) {
            return iun.f15405a;
        }
        try {
            e0g0 e0g0Var = j0g0.b;
            wcy wcyVarC = vdx.f37253a;
            if (wcyVarC == null) {
                wcyVarC = qxw.c(new f8l0((byte) 15));
                vdx.f37253a = wcyVarC;
            }
            g0g0Var = (List) wcyVarC.b(mrv.j0(new zw3(olk.Companion.serializer(), (byte) 0)), str);
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        List list = (List) (g0g0Var instanceof g0g0 ? null : g0g0Var);
        return list == null ? iun.f15405a : list;
    }

    public static final void g(mm40 mm40Var, pnl pnlVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(-351235597);
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
            fetVar.e0(1765014948);
            h(mm40Var, pnlVar, function0, fetVar, i2 & 1022);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nnl(mm40Var, pnlVar, function0, i, (byte) 2);
        }
    }

    public static final iao g0(hao haoVar, long j, boolean z, ovm0 ovm0Var) {
        boolean zContains;
        k0d k0dVar;
        long j2 = haoVar.b;
        if (ovm0Var == null) {
            zContains = false;
        } else if (ovm0Var instanceof mvm0) {
            zContains = true;
        } else {
            if (!(ovm0Var instanceof nvm0)) {
                t9f.b();
                return null;
            }
            zContains = ((nvm0) ovm0Var).b.contains(Long.valueOf(j2));
        }
        boolean z2 = zContains;
        int i = haoVar.f12733a;
        String strN = haoVar.l;
        uoy uoyVar = haoVar.q;
        long j3 = haoVar.b;
        double d = haoVar.f;
        tqt tqtVar = uoy.b;
        byte b = uoyVar.f36034a;
        tqtVar.getClass();
        uoy uoyVarJ = tqt.j(b);
        long j4 = haoVar.c;
        if (z) {
            strN = axq.n(vqd.q(haoVar.s, j2, "[Р :", "][М:"), "] ", strN);
        }
        String str = strN;
        String str2 = haoVar.j;
        if (haoVar.h) {
            k0dVar = k0d.b;
        } else {
            ur20 ur20Var = haoVar.n;
            if (ur20Var == ur20.b) {
                k0dVar = k0d.c;
            } else {
                k0dVar = ur20Var == ur20.c ? k0d.d : k0d.f17460a;
            }
        }
        return new iao(i, j3, d, j, uoyVarJ, j4, new chl0(str, str2, k0dVar, j2e.U(haoVar.w), haoVar.o, haoVar.p, haoVar.u, z2, new xgl0(haoVar.b, haoVar.f, haoVar.d, haoVar.l, haoVar.f12733a, j, uoyVar.f36034a, haoVar.c, z2)));
    }

    public static final void h(mm40 mm40Var, pnl pnlVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-566233208);
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
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            zcl zclVar = qmk.f28987a;
            nkb.h(s5x0.L(jm40.b, 8.0f, 0.0f, 2), new hjm(pnlVar.f27294a, null, null, null, null, null, false, null, null, false, null, null, 8190), kjm.f18392a, null, null, null, fetVar, 384, 56);
            String str = pnlVar.b;
            pz40 pz40Var = s6t0.f31722a;
            fetVar2 = fetVar;
            jiq0.y(null, new gy30(new ux30(12, s6t0.b().f33626a.getTextPrimary(), str, (String) null), new rx30(new m0x(R.drawable.ic_glyph_coupon, null, 6), 0L, null, R.drawable.ic_glyph_coupon, 0L, null, Response.BAD_GATEWAY), cy30.f5153a, s6t0.b().f33626a.getBackgroundContent(), null, null, 240), function0, function0, null, fetVar2, (i3 & 896) | ((i3 << 3) & 7168), 17);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nnl(mm40Var, pnlVar, function0, i, (byte) 3);
        }
    }

    public static final dkk h0(d0t d0tVar) {
        List listF0 = f0(d0tVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF0) {
            Integer num = ((olk) obj).b;
            if (num != null && num.intValue() == 1) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayListN = N(arrayList);
        gyr gyrVar = (gyr) (arrayListN.size() > 0 ? arrayListN.get(0) : new gyr("-", "-", "-", "-"));
        List listF1 = f0(d0tVar);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listF1) {
            Integer num2 = ((olk) obj2).b;
            if (num2 != null && num2.intValue() == 1) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayListN2 = N(arrayList2);
        gyr gyrVar2 = (gyr) (1 < arrayListN2.size() ? arrayListN2.get(1) : new gyr("-", "-", "-", "-"));
        return new dkk(gyrVar.f12144a, gyrVar.b, gyrVar.c, gyrVar2.f12144a, gyrVar2.b, gyrVar2.c);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:80:0x0100  */
    /* JADX WARN: Code duplicated, block: B:83:0x0110  */
    /* JADX WARN: Code duplicated, block: B:84:0x011a  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public static final void i(Function0 function0, mm40 mm40Var, boolean z, em40 em40Var, Function2 function2, xpj0 xpj0Var, Function2 function3, xdr xdrVar, xdr xdrVar2, ugd ugdVar, fet fetVar, int i, int i2) {
        int i3;
        mm40 mm40Var2;
        int i4;
        xpj0 xpj0VarF;
        int i5;
        Object obj;
        int i6;
        xdr xdrVar3;
        int i7;
        boolean z2;
        boolean z3;
        Function2 function4;
        Function2 function5;
        mm40 mm40Var3;
        xdr xdrVar4;
        xpj0 xpj0Var2;
        em40 em40Var2;
        yfe0 yfe0VarU;
        mm40 mm40Var4;
        em40 em40Var3;
        j2l j2lVar;
        int i8;
        j2l j2lVar2;
        int i9;
        xpj0 xpj0Var3;
        mm40 mm40Var5;
        Function2 function6;
        Function2 function7;
        int i10;
        xdr xdrVar5;
        boolean z4;
        int i11;
        function0.getClass();
        fetVar.g0(-927619953);
        if ((i & 6) == 0) {
            i3 = (fetVar.i(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 == 0) {
            if ((i & 48) == 0) {
                mm40Var2 = mm40Var;
                i3 |= fetVar.g(mm40Var2) ? 32 : 16;
            }
            i4 = i3 | 384;
            if ((i & 3072) == 0) {
                i4 = i3 | 1408;
            }
            if ((i & 24576) == 0) {
                i4 |= 8192;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    xpj0VarF = xpj0Var;
                    int i13 = fetVar.g(xpj0VarF) ? 131072 : 65536;
                    i4 |= i13;
                } else {
                    xpj0VarF = xpj0Var;
                }
                i4 |= i13;
            } else {
                xpj0VarF = xpj0Var;
            }
            if ((1572864 & i) == 0) {
                i4 |= 524288;
            }
            i5 = i4 | 12582912;
            if ((100663296 & i) == 0) {
                obj = xdrVar;
                if (fetVar.i(obj)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i5 |= i11;
            } else {
                obj = xdrVar;
            }
            i6 = i2 & 512;
            if (i6 != 0) {
                if ((805306368 & i) == 0) {
                    xdrVar3 = xdrVar2;
                    if (fetVar.i(xdrVar3)) {
                        i7 = 536870912;
                    } else {
                        i7 = 268435456;
                    }
                    i5 |= i7;
                }
                if ((306783379 & i5) == 306783378) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (fetVar.U(i5 & 1, z2)) {
                    fetVar.Z();
                    if ((i & 1) != 0 || fetVar.B()) {
                        if (i12 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        em40Var3 = sl40.f32380a;
                        j2lVar = new j2l((byte) 27);
                        i8 = i5 & (-64513);
                        if ((i2 & 32) != 0) {
                            xpj0VarF = dm40.f(fetVar);
                            i8 = i5 & (-523265);
                        }
                        j2lVar2 = new j2l((byte) 28);
                        i9 = i8 & (-3670017);
                        if (i6 != 0) {
                            xpj0Var3 = xpj0VarF;
                            mm40Var5 = mm40Var4;
                            function6 = j2lVar2;
                            function7 = j2lVar;
                            i10 = i9;
                            z4 = true;
                            xdrVar5 = null;
                        } else {
                            xpj0Var3 = xpj0VarF;
                            mm40Var5 = mm40Var4;
                            function6 = j2lVar2;
                            function7 = j2lVar;
                            i10 = i9;
                            xdrVar5 = xdrVar3;
                            z4 = true;
                        }
                    } else {
                        fetVar.X();
                        int i14 = i5 & (-64513);
                        if ((i2 & 32) != 0) {
                            i14 = i5 & (-523265);
                        }
                        i10 = i14 & (-3670017);
                        function6 = function3;
                        xpj0Var3 = xpj0VarF;
                        mm40Var5 = mm40Var2;
                        xdrVar5 = xdrVar3;
                        z4 = z;
                        em40Var3 = em40Var;
                        function7 = function2;
                    }
                    fetVar.s();
                    mm40 mm40VarW = o050.W(mm40Var5);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarE0 = o2e.e0(o7k0.u(mm40VarW, 0.0f, 512.0f, 1), "MODAL_BOTTOM_SHEET");
                    zfn zfnVar = zaq0.b;
                    xpj0 xpj0Var4 = xpj0Var3;
                    Function2 function8 = function6;
                    em40 em40Var4 = em40Var3;
                    Function2 function9 = function7;
                    dm40.a(function0, mm40VarE0, xpj0Var4, 0.0f, false, vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), y3d.c(0.4f, ((StaticColors) fetVar.k(m8m0.f21378a)).m109getOverlayBackground400d7_KjU()), null, function9, em40Var4, u1c.M(-302084115, new wv50(z4, obj, xdrVar5, ugdVar, function6, (byte) 2), fetVar), fetVar, ((i10 >> 9) & 896) | (i10 & 14), 3078);
                    xpj0Var2 = xpj0Var4;
                    function4 = function9;
                    em40Var2 = em40Var4;
                    mm40Var3 = mm40Var5;
                    z3 = z4;
                    function5 = function8;
                    xdrVar4 = xdrVar5;
                } else {
                    fetVar.X();
                    z3 = z;
                    function4 = function2;
                    function5 = function3;
                    mm40Var3 = mm40Var2;
                    xdrVar4 = xdrVar3;
                    xpj0Var2 = xpj0VarF;
                    em40Var2 = em40Var;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new zbc(function0, mm40Var3, z3, em40Var2, function4, xpj0Var2, function5, xdrVar, xdrVar4, ugdVar, i, i2);
                }
            }
            i5 |= 805306368;
            xdrVar3 = xdrVar2;
            if ((306783379 & i5) == 306783378) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (fetVar.U(i5 & 1, z2)) {
                fetVar.Z();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    em40Var3 = sl40.f32380a;
                    j2lVar = new j2l((byte) 27);
                    i8 = i5 & (-64513);
                    if ((i2 & 32) != 0) {
                        xpj0VarF = dm40.f(fetVar);
                        i8 = i5 & (-523265);
                    }
                    j2lVar2 = new j2l((byte) 28);
                    i9 = i8 & (-3670017);
                    if (i6 != 0) {
                        xpj0Var3 = xpj0VarF;
                        mm40Var5 = mm40Var4;
                        function6 = j2lVar2;
                        function7 = j2lVar;
                        i10 = i9;
                        z4 = true;
                        xdrVar5 = null;
                    } else {
                        xpj0Var3 = xpj0VarF;
                        mm40Var5 = mm40Var4;
                        function6 = j2lVar2;
                        function7 = j2lVar;
                        i10 = i9;
                        xdrVar5 = xdrVar3;
                        z4 = true;
                    }
                } else {
                    if (i12 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    em40Var3 = sl40.f32380a;
                    j2lVar = new j2l((byte) 27);
                    i8 = i5 & (-64513);
                    if ((i2 & 32) != 0) {
                        xpj0VarF = dm40.f(fetVar);
                        i8 = i5 & (-523265);
                    }
                    j2lVar2 = new j2l((byte) 28);
                    i9 = i8 & (-3670017);
                    if (i6 != 0) {
                        xpj0Var3 = xpj0VarF;
                        mm40Var5 = mm40Var4;
                        function6 = j2lVar2;
                        function7 = j2lVar;
                        i10 = i9;
                        z4 = true;
                        xdrVar5 = null;
                    } else {
                        xpj0Var3 = xpj0VarF;
                        mm40Var5 = mm40Var4;
                        function6 = j2lVar2;
                        function7 = j2lVar;
                        i10 = i9;
                        xdrVar5 = xdrVar3;
                        z4 = true;
                    }
                }
                fetVar.s();
                mm40 mm40VarW2 = o050.W(mm40Var5);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarE1 = o2e.e0(o7k0.u(mm40VarW2, 0.0f, 512.0f, 1), "MODAL_BOTTOM_SHEET");
                zfn zfnVar2 = zaq0.b;
                xpj0 xpj0Var5 = xpj0Var3;
                Function2 function10 = function6;
                em40 em40Var5 = em40Var3;
                Function2 function11 = function7;
                dm40.a(function0, mm40VarE1, xpj0Var5, 0.0f, false, vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12), ((ThemeColors) fetVar.k(zfnVar2)).getBackgroundContent(), ((ThemeColors) fetVar.k(zfnVar2)).getBackgroundContent(), y3d.c(0.4f, ((StaticColors) fetVar.k(m8m0.f21378a)).m109getOverlayBackground400d7_KjU()), null, function11, em40Var5, u1c.M(-302084115, new wv50(z4, obj, xdrVar5, ugdVar, function6, (byte) 2), fetVar), fetVar, ((i10 >> 9) & 896) | (i10 & 14), 3078);
                xpj0Var2 = xpj0Var5;
                function4 = function11;
                em40Var2 = em40Var5;
                mm40Var3 = mm40Var5;
                z3 = z4;
                function5 = function10;
                xdrVar4 = xdrVar5;
            } else {
                fetVar.X();
                z3 = z;
                function4 = function2;
                function5 = function3;
                mm40Var3 = mm40Var2;
                xdrVar4 = xdrVar3;
                xpj0Var2 = xpj0VarF;
                em40Var2 = em40Var;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new zbc(function0, mm40Var3, z3, em40Var2, function4, xpj0Var2, function5, xdrVar, xdrVar4, ugdVar, i, i2);
            }
        }
        i3 |= 48;
        mm40Var2 = mm40Var;
        i4 = i3 | 384;
        if ((i & 3072) == 0) {
            i4 = i3 | 1408;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                xpj0VarF = xpj0Var;
                if (fetVar.g(xpj0VarF)) {
                }
                i4 |= i13;
            } else {
                xpj0VarF = xpj0Var;
            }
            i4 |= i13;
        } else {
            xpj0VarF = xpj0Var;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        i5 = i4 | 12582912;
        if ((100663296 & i) == 0) {
            obj = xdrVar;
            if (fetVar.i(obj)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i5 |= i11;
        } else {
            obj = xdrVar;
        }
        i6 = i2 & 512;
        if (i6 != 0) {
            if ((805306368 & i) == 0) {
                xdrVar3 = xdrVar2;
                if (fetVar.i(xdrVar3)) {
                    i7 = 536870912;
                } else {
                    i7 = 268435456;
                }
                i5 |= i7;
            }
            if ((306783379 & i5) == 306783378) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (fetVar.U(i5 & 1, z2)) {
                fetVar.Z();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    em40Var3 = sl40.f32380a;
                    j2lVar = new j2l((byte) 27);
                    i8 = i5 & (-64513);
                    if ((i2 & 32) != 0) {
                        xpj0VarF = dm40.f(fetVar);
                        i8 = i5 & (-523265);
                    }
                    j2lVar2 = new j2l((byte) 28);
                    i9 = i8 & (-3670017);
                    if (i6 != 0) {
                        xpj0Var3 = xpj0VarF;
                        mm40Var5 = mm40Var4;
                        function6 = j2lVar2;
                        function7 = j2lVar;
                        i10 = i9;
                        z4 = true;
                        xdrVar5 = null;
                    } else {
                        xpj0Var3 = xpj0VarF;
                        mm40Var5 = mm40Var4;
                        function6 = j2lVar2;
                        function7 = j2lVar;
                        i10 = i9;
                        xdrVar5 = xdrVar3;
                        z4 = true;
                    }
                } else {
                    if (i12 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    em40Var3 = sl40.f32380a;
                    j2lVar = new j2l((byte) 27);
                    i8 = i5 & (-64513);
                    if ((i2 & 32) != 0) {
                        xpj0VarF = dm40.f(fetVar);
                        i8 = i5 & (-523265);
                    }
                    j2lVar2 = new j2l((byte) 28);
                    i9 = i8 & (-3670017);
                    if (i6 != 0) {
                        xpj0Var3 = xpj0VarF;
                        mm40Var5 = mm40Var4;
                        function6 = j2lVar2;
                        function7 = j2lVar;
                        i10 = i9;
                        z4 = true;
                        xdrVar5 = null;
                    } else {
                        xpj0Var3 = xpj0VarF;
                        mm40Var5 = mm40Var4;
                        function6 = j2lVar2;
                        function7 = j2lVar;
                        i10 = i9;
                        xdrVar5 = xdrVar3;
                        z4 = true;
                    }
                }
                fetVar.s();
                mm40 mm40VarW3 = o050.W(mm40Var5);
                zcl zclVar3 = qmk.f28987a;
                mm40 mm40VarE2 = o2e.e0(o7k0.u(mm40VarW3, 0.0f, 512.0f, 1), "MODAL_BOTTOM_SHEET");
                zfn zfnVar3 = zaq0.b;
                xpj0 xpj0Var6 = xpj0Var3;
                Function2 function12 = function6;
                em40 em40Var6 = em40Var3;
                Function2 function13 = function7;
                dm40.a(function0, mm40VarE2, xpj0Var6, 0.0f, false, vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12), ((ThemeColors) fetVar.k(zfnVar3)).getBackgroundContent(), ((ThemeColors) fetVar.k(zfnVar3)).getBackgroundContent(), y3d.c(0.4f, ((StaticColors) fetVar.k(m8m0.f21378a)).m109getOverlayBackground400d7_KjU()), null, function13, em40Var6, u1c.M(-302084115, new wv50(z4, obj, xdrVar5, ugdVar, function6, (byte) 2), fetVar), fetVar, ((i10 >> 9) & 896) | (i10 & 14), 3078);
                xpj0Var2 = xpj0Var6;
                function4 = function13;
                em40Var2 = em40Var6;
                mm40Var3 = mm40Var5;
                z3 = z4;
                function5 = function12;
                xdrVar4 = xdrVar5;
            } else {
                fetVar.X();
                z3 = z;
                function4 = function2;
                function5 = function3;
                mm40Var3 = mm40Var2;
                xdrVar4 = xdrVar3;
                xpj0Var2 = xpj0VarF;
                em40Var2 = em40Var;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new zbc(function0, mm40Var3, z3, em40Var2, function4, xpj0Var2, function5, xdrVar, xdrVar4, ugdVar, i, i2);
            }
        }
        i5 |= 805306368;
        xdrVar3 = xdrVar2;
        if ((306783379 & i5) == 306783378) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (fetVar.U(i5 & 1, z2)) {
            fetVar.Z();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                em40Var3 = sl40.f32380a;
                j2lVar = new j2l((byte) 27);
                i8 = i5 & (-64513);
                if ((i2 & 32) != 0) {
                    xpj0VarF = dm40.f(fetVar);
                    i8 = i5 & (-523265);
                }
                j2lVar2 = new j2l((byte) 28);
                i9 = i8 & (-3670017);
                if (i6 != 0) {
                    xpj0Var3 = xpj0VarF;
                    mm40Var5 = mm40Var4;
                    function6 = j2lVar2;
                    function7 = j2lVar;
                    i10 = i9;
                    z4 = true;
                    xdrVar5 = null;
                } else {
                    xpj0Var3 = xpj0VarF;
                    mm40Var5 = mm40Var4;
                    function6 = j2lVar2;
                    function7 = j2lVar;
                    i10 = i9;
                    xdrVar5 = xdrVar3;
                    z4 = true;
                }
            } else {
                if (i12 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                em40Var3 = sl40.f32380a;
                j2lVar = new j2l((byte) 27);
                i8 = i5 & (-64513);
                if ((i2 & 32) != 0) {
                    xpj0VarF = dm40.f(fetVar);
                    i8 = i5 & (-523265);
                }
                j2lVar2 = new j2l((byte) 28);
                i9 = i8 & (-3670017);
                if (i6 != 0) {
                    xpj0Var3 = xpj0VarF;
                    mm40Var5 = mm40Var4;
                    function6 = j2lVar2;
                    function7 = j2lVar;
                    i10 = i9;
                    z4 = true;
                    xdrVar5 = null;
                } else {
                    xpj0Var3 = xpj0VarF;
                    mm40Var5 = mm40Var4;
                    function6 = j2lVar2;
                    function7 = j2lVar;
                    i10 = i9;
                    xdrVar5 = xdrVar3;
                    z4 = true;
                }
            }
            fetVar.s();
            mm40 mm40VarW4 = o050.W(mm40Var5);
            zcl zclVar4 = qmk.f28987a;
            mm40 mm40VarE3 = o2e.e0(o7k0.u(mm40VarW4, 0.0f, 512.0f, 1), "MODAL_BOTTOM_SHEET");
            zfn zfnVar4 = zaq0.b;
            xpj0 xpj0Var7 = xpj0Var3;
            Function2 function14 = function6;
            em40 em40Var7 = em40Var3;
            Function2 function15 = function7;
            dm40.a(function0, mm40VarE3, xpj0Var7, 0.0f, false, vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12), ((ThemeColors) fetVar.k(zfnVar4)).getBackgroundContent(), ((ThemeColors) fetVar.k(zfnVar4)).getBackgroundContent(), y3d.c(0.4f, ((StaticColors) fetVar.k(m8m0.f21378a)).m109getOverlayBackground400d7_KjU()), null, function15, em40Var7, u1c.M(-302084115, new wv50(z4, obj, xdrVar5, ugdVar, function6, (byte) 2), fetVar), fetVar, ((i10 >> 9) & 896) | (i10 & 14), 3078);
            xpj0Var2 = xpj0Var7;
            function4 = function15;
            em40Var2 = em40Var7;
            mm40Var3 = mm40Var5;
            z3 = z4;
            function5 = function14;
            xdrVar4 = xdrVar5;
        } else {
            fetVar.X();
            z3 = z;
            function4 = function2;
            function5 = function3;
            mm40Var3 = mm40Var2;
            xdrVar4 = xdrVar3;
            xpj0Var2 = xpj0VarF;
            em40Var2 = em40Var;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zbc(function0, mm40Var3, z3, em40Var2, function4, xpj0Var2, function5, xdrVar, xdrVar4, ugdVar, i, i2);
        }
    }

    public static final l9n i0(pbv pbvVar, ctf0 ctf0Var, Set set, boolean z) {
        y9n y9nVar;
        j9n h9nVar;
        Integer numValueOf = Integer.valueOf(R.drawable.ic_games_placeholder);
        pbvVar.getClass();
        ctf0Var.getClass();
        set.getClass();
        String str = pbvVar.f;
        long j = pbvVar.f26728a;
        hds hdsVar = pbvVar.n;
        boolean z2 = false;
        if (wvb.O(str) > 1.0d) {
            String strA = ctf0Var.b.a(R.string.win_to_xgame_card_title, Arrays.copyOf(new Object[0], 0));
            pn40 pn40Var = pn40.f27267a;
            y9nVar = new y9n(strA, TokenNames.X.concat(pn40.c(wvb.O(str), p3u0.c)));
        } else {
            y9nVar = null;
        }
        y9n y9nVar2 = y9nVar;
        lc00 lc00VarB = kotlin.collections.a.b();
        if (pbvVar.o && (pbvVar.e instanceof z470)) {
            lc00VarB.add(p9n.DEMO);
        }
        int iOrdinal = pbvVar.d.ordinal();
        if (iOrdinal == 1) {
            lc00VarB.add(p9n.NEW);
        } else if (iOrdinal == 2) {
            lc00VarB.add(p9n.FREE);
        } else if (iOrdinal == 3) {
            lc00VarB.add(p9n.BEST);
        } else if (iOrdinal == 5) {
            lc00VarB.add(p9n.SPECIAL);
        }
        lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
        p9n p9nVar = (p9n) CollectionsKt.W(0, lc00VarA);
        p9n p9nVar2 = (p9n) CollectionsKt.W(1, lc00VarA);
        x9n t9nVar = pbvVar.p ? new t9n(new n0x(hdsVar.f12884a), new n0x(azw.R(hdsVar.f12884a)), numValueOf, p9nVar, p9nVar2) : new u9n(new n0x(hdsVar.f12884a), new n0x(azw.R(hdsVar.f12884a)), numValueOf, p9nVar, p9nVar2, y9nVar2);
        String str2 = pbvVar.c;
        if (z) {
            Set set2 = set;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    if (((Number) it.next()).longValue() == j) {
                        z2 = true;
                        break;
                    }
                }
            }
            h9nVar = new g9n(str2, z2);
        } else {
            h9nVar = new h9n(str2);
        }
        return new l9n(j, t9nVar, h9nVar);
    }

    public static final void j(mm40 mm40Var, i8n i8nVar, fet fetVar, int i) {
        fetVar.g0(-374283349);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(i8nVar) ? 32 : 16);
        byte b = 3;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            xx7 xx7Var = gqw0.n;
            mm40 mm40VarA = o7k0.A(mm40Var, xx7Var, 2);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarU = o7k0.u(o7k0.e(mm40VarA, 132.0f), 0.0f, 200.0f, 1);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), xx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarU);
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
            b(i8nVar.a(), fetVar, 0);
            int i3 = (i2 >> 3) & 14;
            u(i8nVar, fetVar, i3);
            q(i8nVar, fetVar, i3);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p5m(mm40Var, i8nVar, i, b);
        }
    }

    public static final its j0(jlr jlrVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, yws ywsVar) {
        fts etsVar;
        jlrVar.getClass();
        if (jlrVar instanceof xkr) {
            m9s m9sVar = ((xkr) jlrVar).d;
            boolean zB = m9sVar.b();
            String str = m9sVar.u;
            fts etsVar2 = cts.f4956a;
            dts dtsVar = dts.f6669a;
            if (!zB || !z2 || z || ywsVar == null || !ywsVar.c) {
                etsVar = etsVar2;
            } else if (z3 || !(z4 || z5)) {
                etsVar = dtsVar;
            } else {
                String str2 = ywsVar.f43387a;
                etsVar = new ets(new GameBroadcastingParams(m9sVar.f21426a, m9sVar.x, m9sVar.r, m9sVar.o, m9sVar.B, str, m9sVar.p, str2 == null ? "" : str2));
            }
            int i = m9sVar.B;
            if (i > 0) {
                if (z3) {
                    etsVar2 = dtsVar;
                } else {
                    String str3 = ywsVar != null ? ywsVar.f43387a : null;
                    etsVar2 = new ets(new GameBroadcastingParams(m9sVar.f21426a, m9sVar.x, m9sVar.r, m9sVar.o, i, str, m9sVar.p, str3 == null ? "" : str3));
                }
            }
            if (!(etsVar instanceof cts) || !(etsVar2 instanceof cts)) {
                return new gts(etsVar, etsVar2);
            }
        }
        return hts.f13648a;
    }

    public static final void k(int i, fet fetVar, boolean z) {
        long separator;
        fetVar.g0(876210847);
        int i2 = (fetVar.h(z) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, z ? 4.0f : 20.0f, 5), 36.0f), 4.0f);
            if (z) {
                fetVar.e0(225047558);
                separator = ((StaticColors) fetVar.k(m8m0.f21378a)).m126getWhite200d7_KjU();
            } else {
                fetVar.e0(225048552);
                separator = ((ThemeColors) fetVar.k(zaq0.b)).getSeparator();
            }
            fetVar.r(false);
            zq8.a(0, fetVar, i120.Q(mm40VarE, separator, vgg0.f37379a));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new obg((byte) 3, i, z);
        }
    }

    public static final dkk k0(d0t d0tVar) {
        List listF0 = f0(d0tVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF0) {
            Integer num = ((olk) obj).b;
            if (num != null && num.intValue() == 2) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayListN = N(arrayList);
        gyr gyrVar = (gyr) (arrayListN.size() > 0 ? arrayListN.get(0) : new gyr("-", "-", "-", "-"));
        List listF1 = f0(d0tVar);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listF1) {
            Integer num2 = ((olk) obj2).b;
            if (num2 != null && num2.intValue() == 2) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayListN2 = N(arrayList2);
        gyr gyrVar2 = (gyr) (1 < arrayListN2.size() ? arrayListN2.get(1) : new gyr("-", "-", "-", "-"));
        return new dkk(gyrVar.f12144a, gyrVar.b, gyrVar.c, gyrVar2.f12144a, gyrVar2.b, gyrVar2.c);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:108:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:109:0x0301  */
    /* JADX WARN: Code duplicated, block: B:112:0x030c  */
    /* JADX WARN: Code duplicated, block: B:113:0x030e  */
    /* JADX WARN: Code duplicated, block: B:119:0x031d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0334  */
    /* JADX WARN: Code duplicated, block: B:125:0x034a  */
    /* JADX WARN: Code duplicated, block: B:128:0x035c  */
    /* JADX WARN: Code duplicated, block: B:129:0x035e  */
    /* JADX WARN: Code duplicated, block: B:133:0x0369  */
    /* JADX WARN: Code duplicated, block: B:135:0x037d  */
    /* JADX WARN: Code duplicated, block: B:137:0x0389  */
    /* JADX WARN: Code duplicated, block: B:139:0x0396  */
    /*  JADX ERROR: JadxRuntimeException in pass: PrepareForCodeGen
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r14v13 int
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.instructions.args.RegisterArg.sameCodeVar(RegisterArg.java:193)
        	at jadx.core.dex.visitors.PrepareForCodeGen.modifyArith(PrepareForCodeGen.java:242)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:88)
        */
    public static final void l(a.mm40 r38, a.mim r39, boolean r40, a.e2d r41, kotlin.jvm.functions.Function2 r42, kotlin.jvm.functions.Function1 r43, a.fet r44, int r45) {
        /*
            Method dump skipped, instruction units count: 969
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ulb.l(a.mm40, a.mim, boolean, a.e2d, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, a.fet, int):void");
    }

    public static final void l0(Map map, boolean z, long j) {
        if (!z || j <= 0) {
            return;
        }
        map.put("userId", Long.valueOf(j));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x007c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0082  */
    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    /* JADX WARN: Code duplicated, block: B:43:0x009a  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:50:0x0111  */
    /* JADX WARN: Code duplicated, block: B:52:0x011a  */
    /* JADX WARN: Code duplicated, block: B:53:0x011d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0149  */
    /* JADX WARN: Code duplicated, block: B:62:0x0154  */
    /* JADX WARN: Code duplicated, block: B:68:0x017f  */
    /* JADX WARN: Code duplicated, block: B:70:0x018c  */
    /* JADX WARN: Code duplicated, block: B:72:0x019b  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x0111, please report this as an issue */
    public static final void m(mm40 mm40Var, final vjm vjmVar, final jwm jwmVar, final jwm jwmVar2, final boolean z, long j, fet fetVar, final int i, final int i2) {
        long secondary;
        int i3;
        boolean z2;
        final long j2;
        final mm40 mm40Var2;
        yfe0 yfe0VarU;
        int i4;
        long j3;
        int i5;
        mm40 mm40Var3;
        xx7 xx7Var;
        String str;
        String str2;
        fetVar.g0(1672345350);
        int i6 = i | 6 | (fetVar.g(jwmVar) ? 2048 : 1024) | (fetVar.g(jwmVar2) ? 16384 : 8192) | (fetVar.h(z) ? 131072 : 65536);
        if ((i2 & 64) == 0) {
            secondary = j;
            int i7 = fetVar.f(secondary) ? 1048576 : 524288;
            i3 = i6 | i7;
            if ((599187 & i3) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (fetVar.U(i3 & 1, z2)) {
                fetVar.Z();
                if ((i & 1) != 0 || fetVar.B()) {
                    i4 = i2 & 64;
                    jm40 jm40Var = jm40.b;
                    if (i4 != 0) {
                        secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                        i3 &= -3670017;
                    }
                    j3 = secondary;
                    i5 = i3;
                    mm40Var3 = jm40Var;
                } else {
                    fetVar.X();
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    j3 = secondary;
                    i5 = i3;
                    mm40Var3 = mm40Var;
                }
                fetVar.s();
                if (z) {
                    xx7Var = gqw0.o;
                } else {
                    xx7Var = gqw0.m;
                }
                mm40 mm40VarD = o7k0.d(mm40Var3, 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.k, (byte) 11)), xx7Var, fetVar, 0);
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
                brm0.x(fetVar, mm40VarC0, gqw0.v, 331150034, false);
                if (fetVar.k(bmd.n) == k6z.f17794a) {
                    fetVar.e0(331238973);
                    if (jwmVar != null) {
                        str = jwmVar.f17257a;
                    } else {
                        str = null;
                    }
                    if (str != null || str.length() == 0) {
                        fetVar.e0(331583538);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(331289472);
                        r(null, jwmVar.f17257a, vjmVar, j3, jwmVar.b, z, fetVar, 384 | ((i5 >> 9) & 7168) | (i5 & 458752));
                        fetVar.r(false);
                    }
                    str2 = jwmVar2 != null ? jwmVar2.f17257a : null;
                    if (str2 != null || str2.length() == 0) {
                        fetVar.e0(331956530);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(331658620);
                        r(null, jwmVar2.f17257a, vjmVar, j3, jwmVar2.b, z, fetVar, 384 | ((i5 >> 9) & 7168) | (i5 & 458752));
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                } else {
                    fetVar.e0(331966450);
                    fetVar.r(false);
                }
                fetVar.r(true);
                mm40Var2 = mm40Var3;
                j2 = j3;
            } else {
                fetVar.X();
                j2 = secondary;
                mm40Var2 = mm40Var;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2(vjmVar, jwmVar, jwmVar2, z, j2, i, i2) { // from class: a.tjm
                    public final /* synthetic */ vjm b;
                    public final /* synthetic */ jwm c;
                    public final /* synthetic */ jwm d;
                    public final /* synthetic */ boolean e;
                    public final /* synthetic */ long f;
                    public final /* synthetic */ byte g;

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.g = i2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iL = x8x.L(433);
                        ulb.m(this.f34055a, this.b, this.c, this.d, this.e, this.f, (fet) obj, iL, this.g);
                        return Unit.f46060a;
                    }
                };
            }
        }
        secondary = j;
        i3 = i6 | i7;
        if ((599187 & i3) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (fetVar.U(i3 & 1, z2)) {
            fetVar.Z();
            if ((i & 1) != 0) {
                i4 = i2 & 64;
                jm40 jm40Var2 = jm40.b;
                if (i4 != 0) {
                    secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                    i3 &= -3670017;
                }
                j3 = secondary;
                i5 = i3;
                mm40Var3 = jm40Var2;
            } else {
                i4 = i2 & 64;
                jm40 jm40Var3 = jm40.b;
                if (i4 != 0) {
                    secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                    i3 &= -3670017;
                }
                j3 = secondary;
                i5 = i3;
                mm40Var3 = jm40Var3;
            }
            fetVar.s();
            if (z) {
                xx7Var = gqw0.o;
            } else {
                xx7Var = gqw0.m;
            }
            mm40 mm40VarD2 = o7k0.d(mm40Var3, 1.0f);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarN2 = s5x0.N(mm40VarD2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA2 = w5d.a(new qw3(4.0f, false, new gne(gqw0.k, (byte) 11)), xx7Var, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN2);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, gqw0.x);
            jpm0.o(fetVar, bh90VarM2, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
            jpm0.n(fetVar);
            brm0.x(fetVar, mm40VarC1, gqw0.v, 331150034, false);
            if (fetVar.k(bmd.n) == k6z.f17794a) {
                fetVar.e0(331238973);
                if (jwmVar != null) {
                    str = jwmVar.f17257a;
                } else {
                    str = null;
                }
                if (str != null) {
                    fetVar.e0(331583538);
                    fetVar.r(false);
                } else {
                    fetVar.e0(331583538);
                    fetVar.r(false);
                }
                if (jwmVar2 != null) {
                }
                if (str2 != null) {
                    fetVar.e0(331956530);
                    fetVar.r(false);
                } else {
                    fetVar.e0(331956530);
                    fetVar.r(false);
                }
                fetVar.r(false);
            } else {
                fetVar.e0(331966450);
                fetVar.r(false);
            }
            fetVar.r(true);
            mm40Var2 = mm40Var3;
            j2 = j3;
        } else {
            fetVar.X();
            j2 = secondary;
            mm40Var2 = mm40Var;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(vjmVar, jwmVar, jwmVar2, z, j2, i, i2) { // from class: a.tjm
                public final /* synthetic */ vjm b;
                public final /* synthetic */ jwm c;
                public final /* synthetic */ jwm d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ long f;
                public final /* synthetic */ byte g;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.g = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(433);
                    ulb.m(this.f34055a, this.b, this.c, this.d, this.e, this.f, (fet) obj, iL, this.g);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void m0(AbstractMap abstractMap, int i) {
        if (i > 0) {
            abstractMap.put("country", Integer.valueOf(i));
        }
    }

    public static final void n(mm40 mm40Var, kzm kzmVar, fet fetVar) {
        if (kzmVar instanceof hzm) {
            fetVar.e0(1562930971);
            tlb.n(mm40Var, (hzm) kzmVar, fetVar, 0);
            fetVar.r(false);
        } else if (kzmVar instanceof izm) {
            fetVar.e0(1562935670);
            ntb.r(mm40Var, (izm) kzmVar, fetVar, 0);
            fetVar.r(false);
        } else {
            if (!(kzmVar instanceof jzm)) {
                throw b1j.f(1562929184, fetVar, false);
            }
            fetVar.e0(1562940214);
            vtb.x(mm40Var, (jzm) kzmVar, fetVar, 0);
            fetVar.r(false);
        }
    }

    public static final void o(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        int i2;
        a4xVar.getClass();
        fetVar.g0(-610407130);
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
            m78 m78Var = new m78(StaticColors.INSTANCE.m76getBlack700d7_KjU(), 3);
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = new wil(pz40Var, (byte) 23);
                fetVar.o0(objP3);
            }
            Function1 function1 = (Function1) objP3;
            boolean zG = fetVar.g(cgk0Var) | (i3 == 32);
            Object objP4 = fetVar.P();
            if (zG || objP4 == obj) {
                objP4 = new wmr(a4xVar, cgk0Var, (byte) 0);
                fetVar.o0(objP4);
            }
            k7x.b(str, null, mm40Var, pm80Var, pm80Var2, null, null, function1, (Function1) objP4, null, pgeVar, m78Var, fetVar, ((i2 << 6) & 896) | 12619824, 6, 27232);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zph(mm40Var, a4xVar, i, (byte) 11);
        }
    }

    public static final void p(int i, fet fetVar, mm40 mm40Var) {
        fet fetVar2;
        fetVar.g0(1986252769);
        int i2 = i | 6;
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new h7w(b);
                fetVar.o0(objP);
            }
            jm40 jm40Var = jm40.b;
            fetVar2 = fetVar;
            dwi0.b((Function1) objP, jm40Var, null, fetVar2, 54, 4);
            mm40Var = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wqr(mm40Var, i, (byte) 4);
        }
    }

    public static final void q(i8n i8nVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(1559382235);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(i8nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 0;
        if (!fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            fetVar.X();
        } else if (i8nVar instanceof f8n) {
            fetVar.e0(-377255174);
            z((f8n) i8nVar, fetVar, i2 & 14);
            fetVar.r(false);
        } else if (i8nVar instanceof g8n) {
            fetVar.e0(-377252966);
            A((g8n) i8nVar, fetVar, i2 & 14);
            fetVar.r(false);
        } else {
            if (!(i8nVar instanceof h8n)) {
                throw b1j.f(-377256638, fetVar, false);
            }
            fetVar.e0(-377250692);
            B((h8n) i8nVar, fetVar, i2 & 14);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k6m(i8nVar, i, b);
        }
    }

    public static final void r(mm40 mm40Var, final String str, final vjm vjmVar, final long j, final int i, final boolean z, fet fetVar, final int i2) {
        mm40 mm40Var2;
        y9q0 y9q0VarG;
        fetVar.g0(387922797);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.e(vjmVar.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.f(j) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.e(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.h(z) ? 131072 : 65536;
        }
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            int iOrdinal = vjmVar.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(-868337828);
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                y9q0VarG = g1t0.g();
                fetVar.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw b1j.f(-868340193, fetVar, false);
                }
                fetVar.e0(-868335301);
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                y9q0VarG = g1t0.d();
                fetVar.r(false);
            }
            y9q0 y9q0Var = y9q0VarG;
            f2q0 f2q0Var = new f2q0(z ? 6 : 5);
            int i4 = i3 >> 3;
            mm40Var2 = jm40.b;
            v8q0.a(str, mm40Var2, j, null, 0L, null, null, null, 0L, f2q0Var, 0L, 2, false, i, 0, null, y9q0Var, fetVar, (i4 & 14) | ((i3 << 3) & 112) | (i4 & 896), (i3 & 57344) | 384, 109560);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final mm40 mm40Var3 = mm40Var2;
            yfe0VarU.d = new Function2() { // from class: a.ujm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ulb.r(mm40Var3, str, vjmVar, j, i, z, (fet) obj, x8x.L(i2 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void s(String str, long j, fet fetVar, int i) {
        fetVar.g0(1235494783);
        int i2 = i | (fetVar.g(str) ? 4 : 2) | (fetVar.f(j) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarW = o7k0.w(o7k0.e(mm40VarD, 16.0f), gqw0.k, false, 2);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarW, j, new n05(qmk.o, qmk.q, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, (i2 & 14) | ((i2 << 3) & 896), 24960, 109552);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bs0(str, j, i, (byte) 3);
        }
    }

    public static final void t(String str, fet fetVar, int i) {
        fetVar.g0(-2036697632);
        int i2 = i | (fetVar.g(str) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zfn zfnVar = m8m0.f21378a;
            long jM125getWhite100d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m125getWhite100d7_KjU();
            zcl zclVar = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarK = s5x0.K(i120.S(i120.Q(jm40.b, jM125getWhite100d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar)), 1.0f, ((StaticColors) fetVar.k(zfnVar)).m125getWhite100d7_KjU(), new ugg0(zclVar, zclVar, zclVar, zclVar)), 6.0f, 4.0f);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarK, ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), new n05(qmk.p, qmk.q, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.a(), fetVar, i2 & 14, 24960, 110576);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hxk((byte) 6, i, str);
        }
    }

    public static final void u(i8n i8nVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(355655753);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(i8nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 54.0f);
            x5d x5dVarA = w5d.a(new qw3(8.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.n, fetVar, 48);
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
            String strB = i8nVar.b();
            if (strB == null) {
                fetVar.e0(802234751);
            } else {
                fetVar.e0(802234752);
                t(strB, fetVar, 0);
            }
            fetVar.r(false);
            e6m e6mVarF = i8nVar.f();
            if (e6mVarF == null) {
                fetVar.e0(802303044);
            } else {
                fetVar.e0(802303045);
                w(e6mVarF, fetVar, 0);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k6m(i8nVar, i, b);
        }
    }

    public static final void v(tlm tlmVar, gmm gmmVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        Function1 function3;
        fetVar.g0(-2137604548);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(tlmVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 16;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(gmmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function3 = function1;
            i2 |= fetVar.i(function3) ? 256 : 128;
        } else {
            function3 = function1;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            imm immVar = new imm(new ilm(((ThemeColors) fetVar.k(zaq0.b)).getSecondary()), tlmVar, gmmVar, y3d.f, false, null);
            int i3 = i2 & 7168;
            boolean z = i3 == 2048;
            Object objP = fetVar.P();
            byte b2 = 9;
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new mfp(function2, b2);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 2048;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new qyo(function2, b);
                fetVar.o0(objP2);
            }
            Function1 function4 = (Function1) objP2;
            boolean z3 = i3 == 2048;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new qyo(function2, (byte) 17);
                fetVar.o0(objP3);
            }
            Function1 function5 = (Function1) objP3;
            boolean z4 = i3 == 2048;
            Object objP4 = fetVar.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new mfp(function2, (byte) 10);
                fetVar.o0(objP4);
            }
            hlm.c(null, immVar, null, function0, null, function3, function4, function5, (Function0) objP4, null, null, null, fetVar, ((i2 << 9) & 458752) | 805306368, 54, 21);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pip(tlmVar, gmmVar, function1, function2, i, (byte) 1);
        }
    }

    public static final void w(e6m e6mVar, fet fetVar, int i) {
        fetVar.g0(-28090518);
        int i2 = (fetVar.g(e6mVar) ? 4 : 2) | i;
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new c8n(e6mVar.f7292a, new w7n(new z7n(), e6mVar.b, e6mVar.c, e6mVar.f, e6mVar.e, null, 32));
                fetVar.o0(objP);
            }
            v7n.c(null, (c8n) objP, null, fetVar, 5);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x5m(e6mVar, i, b);
        }
    }

    public static final void x(long j, fqj0 fqj0Var, fet fetVar, int i) {
        fetVar.g0(16180349);
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
            yfe0VarU.d = new yxh(j, fqj0Var, i, (byte) 0);
        }
    }

    public static final void y(int i, fet fetVar, a4x a4xVar, Function0 function0, Function1 function1) {
        fet fetVar2;
        a4x a4xVar2;
        Function0 function2;
        Function1 function3;
        fetVar.g0(1734576944);
        int i2 = (fetVar.g(a4xVar) ? 4 : 2) | i | (fetVar.i(function0) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar2 = fetVar;
            g7x.f(null, a4xVar, function0, function1, fetVar2, (i2 << 3) & 8176);
            a4xVar2 = a4xVar;
            function2 = function0;
            function3 = function1;
        } else {
            fetVar2 = fetVar;
            a4xVar2 = a4xVar;
            function2 = function0;
            function3 = function1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pbg(a4xVar2, function2, function3, i, (byte) 2);
        }
    }

    public static final void z(f8n f8nVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-486878076);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(f8nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 34.0f);
            x5d x5dVarA = w5d.a(new qw3(2.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.n, fetVar, 48);
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
            String str = f8nVar.d;
            if (str == null) {
                fetVar.e0(1445808031);
                fetVar.r(false);
            } else {
                fetVar.e0(1445808032);
                s(str, ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), fetVar, 0);
                fetVar.r(false);
            }
            String str2 = f8nVar.e;
            if (str2 == null) {
                fetVar.e0(1445942385);
                fetVar.r(false);
            } else {
                fetVar.e0(1445942386);
                s(str2, ((StaticColors) fetVar.k(m8m0.f21378a)).m130getWhite600d7_KjU(), fetVar, 0);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2l(f8nVar, i, (byte) 16);
        }
    }

    public abstract void C(xpg0 xpg0Var, Object obj);

    public abstract String I();

    public Unit Q(qpg0 qpg0Var, Object obj) {
        if (obj == null) {
            return Unit.f46060a;
        }
        xpg0 xpg0VarZ0 = qpg0Var.Z0(I());
        try {
            C(xpg0VarZ0, obj);
            xpg0VarZ0.W0();
            ay3.L(xpg0VarZ0, null);
            return Unit.f46060a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ay3.L(xpg0VarZ0, th);
                throw th2;
            }
        }
    }

    public Unit R(qpg0 qpg0Var, ArrayList arrayList) {
        xpg0 xpg0VarZ0 = qpg0Var.Z0(I());
        try {
            for (Object obj : arrayList) {
                if (obj != null) {
                    C(xpg0VarZ0, obj);
                    xpg0VarZ0.W0();
                    xpg0VarZ0.reset();
                }
            }
            ay3.L(xpg0VarZ0, null);
            return Unit.f46060a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ay3.L(xpg0VarZ0, th);
                throw th2;
            }
        }
    }
}
