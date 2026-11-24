package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.ColorMatrixColorFilter;
import android.javax.sip.message.Response;
import android.text.BidiFormatter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.feed.linelive.presentation.feeds.child.champs.models.FeedsChampsItemsSelectionState;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class dtb {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void A(kmq kmqVar, Object obj, Object obj2, zje zjeVar) {
        onq onqVar;
        if (zjeVar instanceof onq) {
            onqVar = (onq) zjeVar;
            int i = onqVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                onqVar.k = i - Integer.MIN_VALUE;
            } else {
                onqVar = new onq(zjeVar);
            }
        } else {
            onqVar = new onq(zjeVar);
        }
        Object obj3 = onqVar.j;
        Object obj4 = wne.f39444a;
        int i2 = onqVar.k;
        if (i2 == 0) {
            z1x.P(obj3);
            onqVar.i = obj2;
            onqVar.k = 1;
            if (kmqVar.a(obj, onqVar) == obj4) {
                return;
            }
        } else if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return;
        } else {
            obj2 = onqVar.i;
            z1x.P(obj3);
        }
        throw new t(obj2);
    }

    public static final c0o B(Enum[] enumArr) {
        enumArr.getClass();
        return new c0o(enumArr);
    }

    public static boolean C(Pair pair, int i) {
        return ((Calendar) pair.f46059a).get(i) == ((Calendar) pair.b).get(i);
    }

    public static final String D(String str, List list) {
        Object next;
        Object next2;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((wmg) next).f39405a, str));
        wmg wmgVar = (wmg) next;
        String str2 = wmgVar != null ? wmgVar.f39405a : null;
        Iterator it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (Intrinsics.d((wmg) next2, new wmg("", "", "", null, null, null, null, null, false, 0, iun.f15405a, "")));
        wmg wmgVar2 = (wmg) next2;
        String str3 = wmgVar2 != null ? wmgVar2.f39405a : null;
        if (str3 == null) {
            str3 = "";
        }
        return sj3.j0(str2, str3);
    }

    public static final String F(String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder(ujn.h);
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
        return sb.toString();
    }

    public static final float G(rlp rlpVar) {
        int iOrdinal = rlpVar.d.ordinal();
        if (iOrdinal == 0) {
            zcl zclVar = qmk.f28987a;
            return 0.0f;
        }
        if (iOrdinal == 1) {
            zcl zclVar2 = qmk.f28987a;
            return 12.0f;
        }
        if (iOrdinal == 2) {
            zcl zclVar3 = qmk.f28987a;
            return 12.0f;
        }
        if (iOrdinal == 3) {
            zcl zclVar4 = qmk.f28987a;
            return 12.0f;
        }
        if (iOrdinal == 4) {
            zcl zclVar5 = qmk.f28987a;
            return 0.0f;
        }
        t9f.b();
        return 0.0f;
    }

    public static final dja H(xcz xczVar) {
        Object next;
        Iterator it = xczVar.j().l.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ncz) next).p < 0);
        ncz nczVar = (ncz) next;
        Object obj = nczVar != null ? nczVar.l : null;
        if (obj instanceof dja) {
            return (dja) obj;
        }
        return null;
    }

    public static final String I(it9 it9Var, boolean z) {
        String str = it9Var.c;
        rdj rdjVar = rdj.f30294a;
        long j = it9Var.b;
        return ua80.i(str, " (", rdj.h(new znq0(j), ykq0.UNIVERSAL, Boolean.valueOf(z), null, 248), Separators.RPAREN);
    }

    public static final double J(n97 n97Var) {
        n97Var.getClass();
        Double d = n97Var.D;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        Double d2 = n97Var.Q;
        double dDoubleValue2 = d2 != null ? d2.doubleValue() : -1.0d;
        return (dDoubleValue2 != -1.0d && dDoubleValue > dDoubleValue2) ? dDoubleValue2 : dDoubleValue;
    }

    public static final int K(boolean z, long j) {
        return (j == 40 || z) ? R.drawable.ic_glyph_cyber_gamepad : R.drawable.ic_glyph_category_new;
    }

    public static final String L(int i, String str, String str2, List list, boolean z) {
        list.getClass();
        str.getClass();
        str2.getClass();
        if (list.contains(Integer.valueOf(i)) && z) {
            bzu bzuVarE = rz4.e("static", "img", "android", "TopChamps");
            if (str2.length() == 0) {
                str2 = String.valueOf(i);
            }
            axq.u(bzuVarE, str2, "backgrounds", "icon.svg");
            return ((StringBuilder) bzuVarE.b).toString();
        }
        StringBuilder sb = new StringBuilder(ujn.h);
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
        return sb.toString();
    }

    public static final float M(rlp rlpVar) {
        int iOrdinal = rlpVar.d.ordinal();
        if (iOrdinal == 0) {
            zcl zclVar = qmk.f28987a;
            return 12.0f;
        }
        if (iOrdinal == 1) {
            zcl zclVar2 = qmk.f28987a;
            return 12.0f;
        }
        if (iOrdinal == 2) {
            zcl zclVar3 = qmk.f28987a;
            return 12.0f;
        }
        if (iOrdinal == 3) {
            zcl zclVar4 = qmk.f28987a;
            return 12.0f;
        }
        if (iOrdinal == 4) {
            zcl zclVar5 = qmk.f28987a;
            return 0.0f;
        }
        t9f.b();
        return 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:106:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:108:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:110:0x0307  */
    /* JADX WARN: Code duplicated, block: B:154:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:157:0x0422 A[LOOP:8: B:155:0x041c->B:157:0x0422, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:160:0x0460  */
    /* JADX WARN: Code duplicated, block: B:161:0x0468  */
    /* JADX WARN: Code duplicated, block: B:164:0x047f  */
    /* JADX WARN: Code duplicated, block: B:166:0x0489  */
    /* JADX WARN: Code duplicated, block: B:167:0x0496  */
    /* JADX WARN: Code duplicated, block: B:171:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:172:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:175:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:197:0x04d8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x029a  */
    /* JADX WARN: Code duplicated, block: B:97:0x02b8  */
    public static final ArrayList N(List list, List list2, boolean z, String str, ctf0 ctf0Var, String str2, Set set, Set set2, zmb zmbVar, FeedsChampsItemsSelectionState feedsChampsItemsSelectionState, boolean z2) {
        ArrayList arrayList;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        HashMap map;
        char c;
        ArrayList<olp> arrayList2;
        Iterator it;
        long j;
        boolean z7;
        boolean z8;
        boolean z9;
        zmb zmbVar2;
        ArrayList arrayList3;
        boolean z10;
        long j2;
        xkp xkpVarD0;
        Collection collectionC;
        Iterable iterableC;
        List list3;
        boolean z11;
        Collection collectionC2;
        List listF;
        List list4;
        int i;
        HashMap map2;
        Iterator it2;
        boolean z12;
        String str3 = str;
        String str4 = str2;
        boolean z13 = feedsChampsItemsSelectionState.f46666a;
        Set set3 = feedsChampsItemsSelectionState.b;
        list.getClass();
        list2.getClass();
        str4.getClass();
        set.getClass();
        set3.getClass();
        zmbVar.getClass();
        set2.getClass();
        ctf0Var.getClass();
        int i2 = 10;
        if (str4.length() == 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            HashMap map3 = new HashMap();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                rbb rbbVar = (rbb) it3.next();
                long j3 = rbbVar.n;
                List list5 = rbbVar.d;
                if (!linkedHashMap.containsKey(Long.valueOf(j3))) {
                    f7k.A(linkedHashMap, rbbVar, str3);
                    map3.put(Long.valueOf(j3), new ArrayList());
                }
                if (list5.isEmpty()) {
                    List list6 = (List) map3.get(Long.valueOf(j3));
                    if (list6 != null) {
                        list6.addAll(f7k.F(rbbVar, z, z13, ctf0Var, set2, set3, z2));
                    }
                } else {
                    List list7 = (List) map3.get(Long.valueOf(j3));
                    if (list7 != null) {
                        ArrayList<olp> arrayList4 = new ArrayList(r3d.q(list5, i2));
                        Iterator it4 = list5.iterator();
                        while (it4.hasNext()) {
                            sum0 sum0Var = (sum0) it4.next();
                            Iterator it5 = it4;
                            long j4 = j3;
                            boolean z14 = z13;
                            z13 = z14;
                            arrayList4.add(f7k.f0(sum0Var, z, set2, z14, zmbVar, set3));
                            j3 = j4;
                            list7 = list7;
                            it3 = it3;
                            it4 = it5;
                            map3 = map3;
                        }
                        map2 = map3;
                        it2 = it3;
                        List list8 = list7;
                        long j5 = j3;
                        olp olpVar = (olp) CollectionsKt.f0(arrayList4);
                        if (olpVar != null) {
                            olpVar.k = true;
                        }
                        ArrayList arrayList5 = new ArrayList();
                        for (olp olpVar2 : arrayList4) {
                            boolean z15 = z13;
                            w3d.u(arrayList5, olpVar2.p ? CollectionsKt.q0(kotlin.collections.a.c(olpVar2), f7k.O(olpVar2, rbbVar, ctf0Var, z2)) : kotlin.collections.a.c(olpVar2));
                            z13 = z15;
                        }
                        z12 = z13;
                        xkp xkpVarD1 = f7k.d0(rbbVar, arrayList4, rbbVar.f, set.contains(f7k.K(zmbVar, rbbVar.f30176a, j5)));
                        list8.addAll(xkpVarD1.j ? CollectionsKt.q0(kotlin.collections.a.c(xkpVarD1), arrayList5) : kotlin.collections.a.c(xkpVarD1));
                    }
                    map3 = map2;
                    it3 = it2;
                    z13 = z12;
                    i2 = 10;
                }
                z12 = z13;
                map2 = map3;
                it2 = it3;
                map3 = map2;
                it3 = it2;
                z13 = z12;
                i2 = 10;
            }
            HashMap map4 = map3;
            Iterator it6 = list2.iterator();
            while (it6.hasNext()) {
                ri00 ri00Var = (ri00) it6.next();
                long j6 = ri00Var.f30515a;
                ArrayList<si00> arrayList6 = ri00Var.d;
                HashMap map5 = map4;
                List list9 = (List) map5.get(Long.valueOf(j6));
                if (list9 != null) {
                    long j7 = ri00Var.f30515a;
                    ArrayList arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
                    for (si00 si00Var : arrayList6) {
                        String str5 = si00Var.b;
                        int i3 = si00Var.c;
                        aj00 aj00Var = si00Var.f32240a;
                        if (aj00Var instanceof xi00) {
                            i = R.drawable.ic_glyph_awards;
                        } else if (aj00Var instanceof wi00) {
                            i = R.drawable.ic_glyph_cricket_individual_total;
                        } else if (aj00Var instanceof zi00) {
                            i = R.drawable.ic_glyph_cricket_over;
                        } else {
                            if (!(aj00Var instanceof yi00)) {
                                t9f.b();
                                return null;
                            }
                            i = R.drawable.ic_cricket;
                        }
                        long j8 = j7;
                        arrayList7.add(new clp(str5, j8, i3, aj00Var, i));
                        j7 = j8;
                    }
                    clp clpVar = (clp) CollectionsKt.f0(arrayList7);
                    if (clpVar != null) {
                        clpVar.d = true;
                    }
                    boolean zContains = set.contains("-2");
                    Collection collectionC3 = kotlin.collections.a.c(new alp(ri00Var.c, zContains, ctf0Var.b.a(R.string.expresses, Arrays.copyOf(new Object[0], 0)), arrayList6.size()));
                    if (zContains) {
                        collectionC3 = CollectionsKt.q0(collectionC3, arrayList7);
                    }
                    list9.addAll(Math.min(ri00Var.b, list9.size()), collectionC3);
                }
                map4 = map5;
            }
            HashMap map6 = map4;
            f7k.c0(linkedHashMap, map6);
            return f7k.e0(linkedHashMap, map6);
        }
        zmb zmbVar3 = zmbVar;
        boolean z16 = z2;
        boolean z17 = z13;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        HashMap map7 = new HashMap();
        Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            rbb rbbVar2 = (rbb) it7.next();
            String str6 = rbbVar2.c;
            List list10 = rbbVar2.d;
            long j9 = rbbVar2.n;
            if (StringsKt.O(str6, str4, true)) {
                if (!linkedHashMap2.containsKey(Long.valueOf(j9))) {
                    f7k.A(linkedHashMap2, rbbVar2, str3);
                    map7.put(Long.valueOf(j9), new ArrayList());
                }
                arrayList = new ArrayList();
                for (Object obj : list10) {
                    if (StringsKt.O(((sum0) obj).c, str4, true) || StringsKt.O(rbbVar2.c, str4, true)) {
                        arrayList.add(obj);
                    }
                }
                if (list10.isEmpty()) {
                    boolean z18 = z17;
                    listF = f7k.F(rbbVar2, z, z18, ctf0Var, set2, set3, z16);
                    list4 = (List) map7.get(Long.valueOf(j9));
                    if (list4 != null) {
                        list4.addAll(listF);
                    }
                    z8 = z2;
                    zmbVar2 = zmbVar;
                    z10 = z18;
                } else {
                    z3 = z17;
                    z4 = true;
                    if (arrayList.size() == 1 || zmbVar == zmb.b) {
                        z5 = z2;
                        z6 = z3;
                        linkedHashMap2 = linkedHashMap2;
                        map = map7;
                        c = '\n';
                        arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                        it = arrayList.iterator();
                        j = 0;
                        while (it.hasNext()) {
                            sum0 sum0Var2 = (sum0) it.next();
                            j += sum0Var2.e;
                            Iterator it8 = it;
                            boolean z19 = z4;
                            boolean z20 = z6;
                            arrayList2.add(f7k.f0(sum0Var2, z, set2, z20, zmbVar, set3));
                            z6 = z20;
                            map = map;
                            z4 = z19;
                            z5 = z5;
                            c = '\n';
                            it = it8;
                        }
                        map7 = map;
                        z7 = z4;
                        z8 = z5;
                        z9 = z6;
                        zmbVar2 = zmbVar;
                        if (arrayList2.isEmpty()) {
                            collectionC = iun.f15405a;
                            z10 = z9;
                            set3 = set3;
                            j2 = j9;
                        } else {
                            ((olp) CollectionsKt.d0(arrayList2)).k = z7;
                            arrayList3 = new ArrayList();
                            for (olp olpVar3 : arrayList2) {
                                if (olpVar3.p) {
                                    iterableC = CollectionsKt.q0(kotlin.collections.a.c(olpVar3), f7k.O(olpVar3, rbbVar2, ctf0Var, z8));
                                } else {
                                    iterableC = kotlin.collections.a.c(olpVar3);
                                }
                                w3d.u(arrayList3, iterableC);
                            }
                            z10 = z9;
                            set3 = set3;
                            j2 = j9;
                            xkpVarD0 = f7k.d0(rbbVar2, arrayList2, j, set.contains(f7k.K(zmbVar2, rbbVar2.f30176a, j2)));
                            if (xkpVarD0.j) {
                                collectionC = CollectionsKt.q0(kotlin.collections.a.c(xkpVarD0), arrayList3);
                            } else {
                                collectionC = kotlin.collections.a.c(xkpVarD0);
                            }
                        }
                        if (collectionC.isEmpty() && (list3 = (List) map7.get(Long.valueOf(j2))) != null) {
                            list3.addAll(collectionC);
                        }
                    } else {
                        sum0 sum0Var3 = (sum0) arrayList.get(0);
                        boolean z21 = z3 && set3.contains(Long.valueOf(sum0Var3.f32829a));
                        boolean z22 = z21 || set3.size() < 10;
                        boolean z23 = sum0Var3.k;
                        HashMap map8 = map7;
                        long j10 = sum0Var3.e;
                        int i4 = z23 ? R.drawable.ic_glyph_favourite_active : R.drawable.ic_glyph_favourite_inactive;
                        long j11 = sum0Var3.f32829a;
                        String str7 = sum0Var3.c;
                        long j12 = sum0Var3.l;
                        int i5 = sum0Var3.i;
                        String strQ = f7k.Q(sum0Var3, zmbVar);
                        int i6 = (int) j10;
                        pgb pgbVar = sum0Var3.n;
                        boolean z24 = pgbVar == pgb.b;
                        boolean z25 = pgbVar == pgb.c;
                        dlp dlpVar = new dlp(sum0Var3.k, i4);
                        List list11 = sum0Var3.m;
                        boolean zContains2 = set2.contains(Long.valueOf(sum0Var3.f32829a));
                        linkedHashMap2 = linkedHashMap2;
                        ilp ilpVar = new ilp(j11, str7, j12, false, i5, strQ, i6, z24, z25, zContains2, j10 > 0, list11, dlpVar, z, z3, z21, z22);
                        if (zContains2) {
                            List listC = kotlin.collections.a.c(ilpVar);
                            long j13 = sum0Var3.b;
                            z11 = z2;
                            collectionC2 = CollectionsKt.q0(listC, f7k.N(ilpVar, j13, ctf0Var, z11));
                        } else {
                            z11 = z2;
                            collectionC2 = kotlin.collections.a.c(ilpVar);
                        }
                        List list12 = (List) map8.get(Long.valueOf(j9));
                        if (list12 != null) {
                            list12.addAll(collectionC2);
                        }
                        map7 = map8;
                        z8 = z11;
                        set3 = set3;
                        z10 = z3;
                        zmbVar2 = zmbVar;
                    }
                }
            } else {
                if (list10 == null || !list10.isEmpty()) {
                    Iterator it9 = list10.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            if (StringsKt.O(((sum0) it9.next()).c, str4, true)) {
                                if (!linkedHashMap2.containsKey(Long.valueOf(j9))) {
                                    f7k.A(linkedHashMap2, rbbVar2, str3);
                                    map7.put(Long.valueOf(j9), new ArrayList());
                                }
                                arrayList = new ArrayList();
                                while (r3.hasNext()) {
                                    if (StringsKt.O(((sum0) obj).c, str4, true)) {
                                        arrayList.add(obj);
                                    } else {
                                        arrayList.add(obj);
                                    }
                                }
                                if (list10.isEmpty()) {
                                    boolean z110 = z17;
                                    listF = f7k.F(rbbVar2, z, z110, ctf0Var, set2, set3, z16);
                                    list4 = (List) map7.get(Long.valueOf(j9));
                                    if (list4 != null) {
                                        list4.addAll(listF);
                                    }
                                    z8 = z2;
                                    zmbVar2 = zmbVar;
                                    z10 = z110;
                                } else {
                                    z3 = z17;
                                    z4 = true;
                                    if (arrayList.size() == 1) {
                                        z5 = z2;
                                        z6 = z3;
                                        linkedHashMap2 = linkedHashMap2;
                                        map = map7;
                                        c = '\n';
                                        arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                                        it = arrayList.iterator();
                                        j = 0;
                                        while (it.hasNext()) {
                                            sum0 sum0Var4 = (sum0) it.next();
                                            j += sum0Var4.e;
                                            Iterator it10 = it;
                                            boolean z111 = z4;
                                            boolean z26 = z6;
                                            arrayList2.add(f7k.f0(sum0Var4, z, set2, z26, zmbVar, set3));
                                            z6 = z26;
                                            map = map;
                                            z4 = z111;
                                            z5 = z5;
                                            c = '\n';
                                            it = it10;
                                        }
                                        map7 = map;
                                        z7 = z4;
                                        z8 = z5;
                                        z9 = z6;
                                        zmbVar2 = zmbVar;
                                        if (arrayList2.isEmpty()) {
                                            collectionC = iun.f15405a;
                                            z10 = z9;
                                            set3 = set3;
                                            j2 = j9;
                                        } else {
                                            ((olp) CollectionsKt.d0(arrayList2)).k = z7;
                                            arrayList3 = new ArrayList();
                                            while (r2.hasNext()) {
                                                if (olpVar3.p) {
                                                    iterableC = CollectionsKt.q0(kotlin.collections.a.c(olpVar3), f7k.O(olpVar3, rbbVar2, ctf0Var, z8));
                                                } else {
                                                    iterableC = kotlin.collections.a.c(olpVar3);
                                                }
                                                w3d.u(arrayList3, iterableC);
                                            }
                                            z10 = z9;
                                            set3 = set3;
                                            j2 = j9;
                                            xkpVarD0 = f7k.d0(rbbVar2, arrayList2, j, set.contains(f7k.K(zmbVar2, rbbVar2.f30176a, j2)));
                                            if (xkpVarD0.j) {
                                                collectionC = CollectionsKt.q0(kotlin.collections.a.c(xkpVarD0), arrayList3);
                                            } else {
                                                collectionC = kotlin.collections.a.c(xkpVarD0);
                                            }
                                        }
                                        if (collectionC.isEmpty()) {
                                        }
                                    } else {
                                        z5 = z2;
                                        z6 = z3;
                                        linkedHashMap2 = linkedHashMap2;
                                        map = map7;
                                        c = '\n';
                                        arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                                        it = arrayList.iterator();
                                        j = 0;
                                        while (it.hasNext()) {
                                            sum0 sum0Var5 = (sum0) it.next();
                                            j += sum0Var5.e;
                                            Iterator it11 = it;
                                            boolean z112 = z4;
                                            boolean z27 = z6;
                                            arrayList2.add(f7k.f0(sum0Var5, z, set2, z27, zmbVar, set3));
                                            z6 = z27;
                                            map = map;
                                            z4 = z112;
                                            z5 = z5;
                                            c = '\n';
                                            it = it11;
                                        }
                                        map7 = map;
                                        z7 = z4;
                                        z8 = z5;
                                        z9 = z6;
                                        zmbVar2 = zmbVar;
                                        if (arrayList2.isEmpty()) {
                                            collectionC = iun.f15405a;
                                            z10 = z9;
                                            set3 = set3;
                                            j2 = j9;
                                        } else {
                                            ((olp) CollectionsKt.d0(arrayList2)).k = z7;
                                            arrayList3 = new ArrayList();
                                            while (r2.hasNext()) {
                                                if (olpVar3.p) {
                                                    iterableC = CollectionsKt.q0(kotlin.collections.a.c(olpVar3), f7k.O(olpVar3, rbbVar2, ctf0Var, z8));
                                                } else {
                                                    iterableC = kotlin.collections.a.c(olpVar3);
                                                }
                                                w3d.u(arrayList3, iterableC);
                                            }
                                            z10 = z9;
                                            set3 = set3;
                                            j2 = j9;
                                            xkpVarD0 = f7k.d0(rbbVar2, arrayList2, j, set.contains(f7k.K(zmbVar2, rbbVar2.f30176a, j2)));
                                            if (xkpVarD0.j) {
                                                collectionC = CollectionsKt.q0(kotlin.collections.a.c(xkpVarD0), arrayList3);
                                            } else {
                                                collectionC = kotlin.collections.a.c(xkpVarD0);
                                            }
                                        }
                                        if (collectionC.isEmpty()) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                zmbVar2 = zmbVar3;
                z8 = z16;
                z10 = z17;
            }
            set3 = set3;
            linkedHashMap2 = linkedHashMap2;
            z17 = z10;
            zmbVar3 = zmbVar2;
            map7 = map7;
            z16 = z8;
            str3 = str;
            str4 = str2;
        }
        LinkedHashMap linkedHashMap3 = linkedHashMap2;
        HashMap map9 = map7;
        f7k.c0(linkedHashMap3, map9);
        return f7k.e0(linkedHashMap3, map9);
    }

    public static final prs0 O(hzw hzwVar) {
        q0d q0dVar;
        hzwVar.getClass();
        if (hzwVar.equals(czw.f5244a)) {
            vi9 vi9Var = vi9.c;
            q0dVar = new q0d(vi9Var, vi9Var, vi9Var);
        } else if (hzwVar.equals(fzw.f10431a)) {
            vi9 vi9Var2 = vi9.e;
            q0dVar = new q0d(vi9Var2, vi9Var2, vi9Var2);
        } else if (hzwVar.equals(ezw.f8691a)) {
            vi9 vi9Var3 = vi9.c;
            q0dVar = new q0d(vi9Var3, vi9Var3, vi9Var3);
        } else if (hzwVar.equals(gzw.f12203a)) {
            vi9 vi9Var4 = vi9.c;
            q0dVar = new q0d(vi9Var4, vi9Var4, vi9.e);
        } else {
            if (!hzwVar.equals(dzw.f6962a)) {
                t9f.b();
                return null;
            }
            vi9 vi9Var5 = vi9.c;
            q0dVar = new q0d(vi9Var5, vi9Var5, vi9Var5);
        }
        return new prs0(q0dVar.f27891a, q0dVar.b, q0dVar.c);
    }

    public static final ArrayList P(Context context, List list) {
        Object zo5Var;
        Object ahg0Var;
        list.getClass();
        context.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k2x k2xVar = (k2x) it.next();
            if (k2xVar != null) {
                byte b = 1;
                if (k2xVar instanceof g2x) {
                    zo5Var = new zo5(b);
                } else {
                    if (k2xVar instanceof i2x) {
                        ahg0Var = new fjc((byte) 1);
                    } else if (k2xVar instanceof j2x) {
                        float f = ((j2x) k2xVar).f15803a;
                        ahg0Var = new ahg0(f, f, f, f);
                    } else if (k2xVar instanceof e2x) {
                        zo5Var = new dc5(context, (byte) 1);
                    } else if (k2xVar instanceof f2x) {
                        zo5Var = new dc5(context, (byte) 0);
                    } else if (k2xVar instanceof h2x) {
                        zo5Var = new zo5((byte) 2);
                    }
                    zo5Var = ahg0Var;
                }
                arrayList.add(zo5Var);
            }
            t9f.b();
            return null;
        }
        return arrayList;
    }

    public static final Object R(xcz xczVar, List list, dja djaVar, bnn0 bnn0Var) {
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((y39) it.next()).getKey() == djaVar) {
                break;
            }
            i++;
        }
        dja djaVarH = H(xczVar);
        if (i == -1 || djaVarH == djaVar) {
            return Unit.f46060a;
        }
        Object objL = xczVar.l(i, 0, bnn0Var);
        return objL == wne.f39444a ? objL : Unit.f46060a;
    }

    public static final long S(ezm ezmVar) {
        boolean z = ezmVar.b;
        fgm fgmVar = ezmVar.e;
        long j = ezmVar.f8677a;
        if (z) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (ezmVar.d) {
                int iOrdinal = fgmVar.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    long j2 = jCurrentTimeMillis - j;
                    if (j2 >= 0) {
                        return j2;
                    }
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return 0L;
                    }
                    long j3 = j - jCurrentTimeMillis;
                    if (j3 >= 0) {
                        return j3;
                    }
                }
            } else {
                long j4 = jCurrentTimeMillis - ezmVar.c;
                int iOrdinal2 = fgmVar.ordinal();
                if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                    return j + j4;
                }
                if (iOrdinal2 != 2) {
                    t9f.b();
                    return 0L;
                }
                long j5 = j - j4;
                if (j5 >= 0) {
                    return j5;
                }
            }
        }
        return 0L;
    }

    public static final long T(fus fusVar) {
        fusVar.getClass();
        long jCurrentTimeMillis = fusVar.f10180a ? (System.currentTimeMillis() - fusVar.d) / 1000 : 0L;
        boolean z = fusVar.b;
        long j = fusVar.c;
        return z ? j - jCurrentTimeMillis : j + jCurrentTimeMillis;
    }

    public static final qnq U(gmq gmqVar, int i) {
        if (i > 0) {
            return new qnq(gmqVar, i);
        }
        c99.s(ua80.e(i, "Requested element count ", " should be positive"));
        return null;
    }

    public static final String V(mcy mcyVar) {
        if (mcyVar == null || (mcyVar instanceof bdy)) {
            return "";
        }
        ipb.f15154a.getClass();
        int iOrdinal = cl5.s(mcyVar).ordinal();
        if (iOrdinal == 0) {
            Boolean boolB = wsm0.b(ncy.j(mcyVar).b());
            return String.valueOf(boolB != null ? boolB.booleanValue() : false);
        }
        if (iOrdinal == 1) {
            yby ybyVarH = ncy.h(mcyVar);
            ArrayList arrayList = new ArrayList(r3d.q(ybyVarH, 10));
            Iterator it = ybyVarH.f42361a.iterator();
            while (it.hasNext()) {
                arrayList.add(V((mcy) it.next()));
            }
            return arrayList.toString();
        }
        if (iOrdinal == 2) {
            Integer numG = ncy.g(ncy.j(mcyVar));
            return String.valueOf(numG != null ? numG.intValue() : 0);
        }
        if (iOrdinal == 3) {
            return mcyVar instanceof jdy ? ((jdy) mcyVar).b() : mcyVar.toString();
        }
        t9f.b();
        return null;
    }

    public static final void a(mm40 mm40Var, final ogs0 ogs0Var, boolean z, final boolean z2, fet fetVar, final int i, final int i2) {
        final boolean z3;
        int i3;
        final mm40 mm40Var2;
        int i4;
        int i5;
        int i6;
        long jM81getDarkBlue0d7_KjU;
        fet fetVar2 = fetVar;
        fetVar2.g0(-922984044);
        int i7 = i | 6 | (fetVar2.g(ogs0Var) ? 32 : 16);
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 = i7 | 384;
            z3 = z;
        } else {
            z3 = z;
            i3 = i7 | (fetVar2.h(z3) ? 256 : 128);
        }
        int i9 = i3 | (fetVar2.h(z2) ? 2048 : 1024);
        if (fetVar2.U(i9 & 1, (i9 & 1171) != 1170)) {
            if (i8 != 0) {
                z3 = false;
            }
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
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
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(mm40VarD, 60.0f, 0.0f, 2);
            zfn zfnVar = zaq0.b;
            boolean z5 = z3;
            mm40 mm40VarQ = i120.Q(mm40VarG, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), vgg0.b(z3 ? 16.0f : 0.0f, z5 ? 16.0f : 0.0f, z2 ? 16.0f : 0.0f, z2 ? 16.0f : 0.0f));
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
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
            yx7 yx7Var = gqw0.k;
            mm40 mm40VarE0 = o2e.e0(o7k0.n(i120.Q(s5x0.N(new ecu0(yx7Var), 12.0f, 10.0f, 0.0f, 10.0f, 4), ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundGroupSecondary(), vgg0.f37379a), 40.0f), "CompactTransactionCellComponentBoxIconTestTag");
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarE0);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            mm40 mm40VarN = o7k0.n(jm40Var, 24.0f);
            int i10 = ogs0Var.i;
            if (i10 == 1) {
                i4 = R.drawable.ic_glyph_minus_small;
            } else if (i10 == 2) {
                i4 = R.drawable.ic_glyph_plus_small;
            } else if (i10 != 3) {
                i4 = i10 != 4 ? R.drawable.ic_glyph_question : R.drawable.ic_glyph_waiting;
            } else {
                i4 = R.drawable.ic_glyph_cancel;
            }
            mm40 mm40VarE1 = o2e.e0(mm40VarN, String.valueOf(i4));
            if (i10 == 1) {
                i5 = 0;
                i6 = R.drawable.ic_glyph_minus_small;
            } else if (i10 == 2) {
                i5 = 0;
                i6 = R.drawable.ic_glyph_plus_small;
            } else if (i10 == 3) {
                i5 = 0;
                i6 = R.drawable.ic_glyph_cancel;
            } else if (i10 != 4) {
                i6 = R.drawable.ic_glyph_question;
                i5 = 0;
            } else {
                i5 = 0;
                i6 = R.drawable.ic_glyph_waiting;
            }
            pm80 pm80VarF = a8k0.F(i6, i5, fetVar2);
            if (i10 == 1) {
                jM81getDarkBlue0d7_KjU = StaticColors.INSTANCE.m81getDarkBlue0d7_KjU();
            } else if (i10 == 2) {
                jM81getDarkBlue0d7_KjU = StaticColors.INSTANCE.m98getGreen0d7_KjU();
            } else if (i10 != 3) {
                jM81getDarkBlue0d7_KjU = i10 != 4 ? StaticColors.INSTANCE.m95getGray0d7_KjU() : StaticColors.INSTANCE.m132getYellow0d7_KjU();
            } else {
                jM81getDarkBlue0d7_KjU = StaticColors.INSTANCE.m113getRed0d7_KjU();
            }
            dww.c(pm80VarF, null, mm40VarE1, jM81getDarkBlue0d7_KjU, fetVar2, 56, 0);
            fetVar2.r(true);
            mm40 mm40VarN2 = s5x0.N(new ecu0(yx7Var), 8.0f, 0.0f, 16.0f, 0.0f, 10);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarE = mm40VarN2.e(new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarE);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar4);
            mm40 mm40VarE2 = o2e.e0(s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), "CompactTransactionCellComponentTextTestTag");
            String strUnicodeWrap = BidiFormatter.getInstance().unicodeWrap(ogs0Var.f);
            strUnicodeWrap.getClass();
            v8q0.a(strUnicodeWrap, mm40VarE2, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 3, 0, null, ibm0.t(g1t0.g(), fetVar2), fetVar, 0, 24960, 110588);
            mm40 mm40VarE3 = o2e.e0(s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 12.0f, 5), "CompactTransactionCellComponentDateTextTestTag");
            rdj rdjVar = rdj.f30294a;
            v8q0.a(rdj.g(new znq0(ogs0Var.b), efj.UNIVERSAL, Boolean.valueOf(ogs0Var.l), false, 56), mm40VarE3, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.n(g1t0.h(), fetVar), fetVar, 0, 24960, 110588);
            fetVar2 = fetVar;
            fetVar2.r(true);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(754764590, new cnc(ogs0Var, (byte) 3), fetVar2), fetVar2, 56);
            fetVar2.r(true);
            if (z2) {
                fetVar2.e0(-839751592);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-996925294);
                rcb.p(0, fetVar2, s5x0.N(i120.Q(jm40Var, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n), 64.0f, 0.0f, 0.0f, 0.0f, 14));
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40Var2 = jm40Var;
            z3 = z5;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(ogs0Var, z3, z2, i, i2) { // from class: a.rcd
                public final /* synthetic */ ogs0 b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ byte e;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.e = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    dtb.a(this.f30233a, this.b, this.c, this.d, (fet) obj, iL, this.e);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void b(k7q0 k7q0Var, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(2080741862);
        if ((i & 6) == 0) {
            i2 = (fetVar.i(k7q0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            agc.h(k7q0Var, ugdVar, fetVar, i2 & 126);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new w8d(k7q0Var, ugdVar, i, b);
        }
    }

    public static final void c(mm40 mm40Var, sdp0 sdp0Var, boolean z, String str, boolean z2, Function2 function2, fet fetVar, int i) {
        long jM123getWhite0d7_KjU;
        boolean z3;
        str.getClass();
        function2.getClass();
        pz40 pz40VarF = androidx.compose.runtime.e.f(Boolean.valueOf(z), fetVar);
        pz40 pz40VarF2 = androidx.compose.runtime.e.f(Boolean.valueOf(z2), fetVar);
        int i2 = i >> 9;
        pz40 pz40VarF3 = androidx.compose.runtime.e.f(str, fetVar);
        if (((Boolean) pz40VarF2.getValue()).booleanValue()) {
            jM123getWhite0d7_KjU = cs0.D(fetVar, 1701392785, fetVar, false);
        } else {
            fetVar.e0(1701393905);
            jM123getWhite0d7_KjU = afn0.p(fetVar).m123getWhite0d7_KjU();
            fetVar.r(false);
        }
        l7m0 l7m0VarB = m5k0.b(jM123getWhite0d7_KjU, null, fetVar, 0, 14);
        mm40 mm40VarK0 = q8a.k0(mm40Var, enx.b);
        yx7 yx7Var = gqw0.k;
        zcl zclVar = qmk.f28987a;
        thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
        int iHashCode = Long.hashCode(fetVar.T);
        bh90 bh90VarM = fetVar.m();
        mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK0);
        mkd.c0.getClass();
        fetVar.i0();
        boolean z4 = fetVar.S;
        Function0 function0 = e7z.u1;
        if (z4) {
            fetVar.l(function0);
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
        zhg0 zhg0Var = zhg0.f44392a;
        jm40 jm40Var = jm40.b;
        kcp0.a(zhg0Var.a(1.0f, jm40Var, true), sdp0Var, function2, fetVar, i2 & 896, 0);
        mbc.o(xfi0.f40792a, s5x0.L(o7k0.c(jm40Var, 1.0f), 0.0f, 4.0f, 1), false, fetVar, 390, 0);
        mm40 mm40VarA = zhg0Var.a(1.0f, jm40Var, true);
        thg0 thg0VarA2 = shg0.a(new qw3(4.0f, true, new gne(gqw0.o, (byte) 12)), yx7Var, fetVar, 48);
        int iHashCode2 = Long.hashCode(fetVar.T);
        bh90 bh90VarM2 = fetVar.m();
        mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarA);
        fetVar.i0();
        if (fetVar.S) {
            fetVar.l(function0);
        } else {
            fetVar.r0();
        }
        jpm0.o(fetVar, thg0VarA2, shdVar);
        jpm0.o(fetVar, bh90VarM2, shdVar2);
        vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
        jpm0.o(fetVar, mm40VarC1, shdVar4);
        if (((Boolean) pz40VarF.getValue()).booleanValue()) {
            fetVar.e0(-1784883787);
            z3 = false;
            vdx.d(0, fetVar, null);
        } else {
            z3 = false;
            fetVar.e0(503193790);
        }
        fetVar.r(z3);
        mm40 mm40VarN = s5x0.N(zhg0Var.a(1.0f, jm40Var, z3), 4.0f, 0.0f, 0.0f, 0.0f, 14);
        String str2 = (String) pz40VarF3.getValue();
        afn0.v(fetVar).getClass();
        y9q0 y9q0VarA = y9q0.a(g1t0.j(), 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, null, 16744447);
        boolean zG = fetVar.g(l7m0VarB);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = new oad(l7m0VarB, (byte) 1);
            fetVar.o0(objP);
        }
        aad.e(str2, mm40VarN, y9q0VarA, null, 2, false, 1, 0, (n4d) objP, new n05(qmk.p, qmk.s, qmk.n), fetVar, 1597440, 168);
        fetVar.r(true);
        fetVar.r(true);
    }

    public static final void d(a4x a4xVar, Function1 function1, fet fetVar, int i) {
        a4xVar.getClass();
        function1.getClass();
        fetVar.g0(-27238117);
        int i2 = (fetVar.g(a4xVar) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(jm40.b, qmk.a(fetVar).c, 8.0f);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = r0h.f29629a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new or0(a4xVar, function1, (byte) 10);
                fetVar.o0(objP2);
            }
            y860.f(xdrVar, mm40VarK, (Function1) objP2, fetVar, 6, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q0h(b, i, a4xVar, function1);
        }
    }

    public static final void e(mm40 mm40Var, xcz xczVar, enh enhVar, Function1 function1, fet fetVar, int i) {
        int i2;
        xczVar.getClass();
        function1.getClass();
        fetVar.g0(-179513553);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(xczVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(enhVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = enhVar instanceof cnh;
            byte b = 14;
            cl5 cl5Var = ukd.f35823a;
            if (z) {
                fetVar.e0(-653631847);
                mm40 mm40VarE0 = o2e.e0(o7k0.d(mm40Var, 1.0f), "CYBER_TOURNAMENT_CARD_COLLECTION_SQUARE_S");
                zcl zclVar = qmk.f28987a;
                lh80 lh80VarT = s5x0.t(8.0f, 0.0f, 2);
                qw3 qw3Var = new qw3(8.0f, true, new jf4(b));
                boolean z2 = ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
                Object objP = fetVar.P();
                if (z2 || objP == cl5Var) {
                    objP = new ngh(enhVar, function1, (byte) 5);
                    fetVar.o0(objP);
                }
                b8k0.f(mm40VarE0, xczVar, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, i2 & 112, Response.NOT_ACCEPTABLE_HERE);
                fetVar.r(false);
            } else {
                if (!(enhVar instanceof dnh)) {
                    throw b1j.f(-713823571, fetVar, false);
                }
                fetVar.e0(-652878516);
                mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
                zcl zclVar2 = qmk.f28987a;
                lh80 lh80VarT2 = s5x0.t(8.0f, 0.0f, 2);
                qw3 qw3Var2 = new qw3(8.0f, true, new jf4(b));
                Object objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = new m7h((byte) 20);
                    fetVar.o0(objP2);
                }
                b8k0.f(mm40VarD, null, lh80VarT2, false, qw3Var2, null, null, false, null, (Function1) objP2, fetVar, 817889280, 362);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dg0((byte) 26, i, (Object) mm40Var, (Object) xczVar, (Object) enhVar, (Object) function1);
        }
    }

    public static final void f(mm40 mm40Var, gol golVar, sh1 sh1Var, Function0 function0, Function1 function1, fet fetVar, int i) {
        int i2;
        golVar.getClass();
        fetVar.g0(1731212134);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(golVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.e(sh1Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (!fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            fetVar.X();
        } else if (golVar instanceof eol) {
            fetVar.e0(573774122);
            int iOrdinal = sh1Var.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(573901036);
                i(mm40Var, (eol) golVar, function0, fetVar, ((i2 >> 3) & 896) | (i2 & 126));
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                fetVar.e0(574206634);
                g(mm40Var, (eol) golVar, function0, fetVar, ((i2 >> 3) & 896) | (i2 & 126));
                fetVar.r(false);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw b1j.f(1542529496, fetVar, false);
                }
                fetVar.e0(573901036);
                i(mm40Var, (eol) golVar, function0, fetVar, ((i2 >> 3) & 896) | (i2 & 126));
                fetVar.r(false);
            } else {
                fetVar.e0(574514619);
                k(mm40Var, (eol) golVar, function1, fetVar, ((i2 >> 6) & 896) | (i2 & 126));
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            if (!golVar.equals(fol.f9886a)) {
                throw b1j.f(1542527601, fetVar, false);
            }
            fetVar.e0(574870964);
            int iOrdinal2 = sh1Var.ordinal();
            if (iOrdinal2 == 0) {
                fetVar.e0(575006186);
                j(i2 & 14, fetVar, mm40Var);
                fetVar.r(false);
            } else if (iOrdinal2 == 1) {
                fetVar.e0(575186792);
                h(i2 & 14, fetVar, mm40Var);
                fetVar.r(false);
            } else if (iOrdinal2 != 2) {
                if (iOrdinal2 != 3) {
                    throw b1j.f(1542564878, fetVar, false);
                }
                fetVar.e0(575006186);
                j(i2 & 14, fetVar, mm40Var);
                fetVar.r(false);
            } else {
                fetVar.e0(575369289);
                l(i2 & 14, fetVar, mm40Var);
                fetVar.r(false);
            }
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qnl(mm40Var, golVar, sh1Var, function0, function1, i, (byte) 0);
        }
    }

    public static final void g(mm40 mm40Var, eol eolVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1099023658);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(eolVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(mm40Var, 128.0f), 72.0f);
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new b1i(function0, (byte) 25);
                fetVar.o0(objP);
            }
            mm40 mm40VarJ = lgb.J(y860.W(mm40VarE, null, null, false, null, (Function0) objP, 28), vgg0.a(16.0f));
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            j0x.b(lv00.T(eolVar.b, eolVar.g, null, null, fetVar, 0, 12), null, lgb.J(s5x0.J(i120.Q(lgb.J(s5x0.J(i120.Q(mm40VarJ, backgroundContent, ljcVar), 4.0f), vgg0.a(12.0f)), ((ThemeColors) fetVar.k(zfnVar)).getBackground(), ljcVar), 4.0f), vgg0.a(8.0f)), null, gqw0.A, 0.0f, null, fetVar, 24624, 104);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rnl(mm40Var, eolVar, function0, i, (byte) 0);
        }
    }

    public static final void h(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(1101099056);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(mm40Var, 128.0f), 72.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ujl(mm40Var, i, (byte) 7);
        }
    }

    public static final void i(mm40 mm40Var, eol eolVar, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        int i2;
        pcy pcyVar;
        eol eolVar2 = eolVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(217071172);
        if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i2 = (fetVar2.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(eolVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function0) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new b1i(function0, (byte) 26);
                fetVar2.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40Var2, null, null, false, null, (Function0) objP, 28);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(mm40VarW, vgg0.a(16.0f));
            long backgroundContent = afn0.m(fetVar2).getBackgroundContent();
            ljc ljcVar = jd8.n;
            mm40 mm40VarJ2 = s5x0.J(i120.Q(mm40VarJ, backgroundContent, ljcVar), 4.0f);
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ2);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            ugg0 ugg0VarA = vgg0.a(12.0f);
            jm40 jm40Var = jm40.b;
            j0x.b(lv00.T(eolVar2.b, eolVar2.g, null, null, fetVar2, 0, 12), null, lgb.J(ny9.O(2.0f, s5x0.J(i120.Q(lgb.J(jm40Var, ugg0VarA), afn0.m(fetVar2).getBackground(), ljcVar), 4.0f), false), vgg0.a(8.0f)), null, gqw0.A, 0.0f, null, fetVar, 24624, 104);
            mm40 mm40VarL = s5x0.L(o7k0.e(jm40Var, 42.0f), 0.0f, 4.0f, 1);
            x5d x5dVarA2 = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.n, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarL);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar = pcyVar2;
                fetVar.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            String str = eolVar.d;
            afn0.v(fetVar).getClass();
            pcy pcyVar3 = pcyVar;
            v8q0.a(str, null, afn0.m(fetVar).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 0, 24960, 110586);
            mm40 mm40VarL2 = s5x0.L(o7k0.e(o7k0.d(jm40Var, 1.0f), 40.0f), 8.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar, 54);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarL2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar3);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            dww.c(a8k0.F(R.drawable.ic_glyph_cards, 0, fetVar), null, o7k0.n(jm40Var, 16.0f), afn0.m(fetVar).getSecondary(), fetVar, 56, 0);
            mm40 mm40VarU = o7k0.u(s5x0.N(jm40Var, 4.0f, 0.0f, 2.0f, 0.0f, 10), 0.0f, 68.0f, 1);
            eolVar2 = eolVar;
            String str2 = eolVar2.f;
            afn0.v(fetVar).getClass();
            v8q0.a(str2, mm40VarU, afn0.m(fetVar).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 0, 24960, 110584);
            mm40 mm40VarU2 = o7k0.u(jm40Var, 0.0f, 38.0f, 1);
            String str3 = eolVar2.e;
            afn0.v(fetVar).getClass();
            v8q0.a(str3, mm40VarU2, afn0.m(fetVar).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            ohs0.x(fetVar2, true, true, true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rnl(mm40Var, eolVar2, function0, i, (byte) 1);
        }
    }

    public static final void j(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(1385121154);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new thd((byte) 11);
                fetVar.o0(objP);
            }
            mm40 mm40VarQ = knx.Q(mm40Var, (xdr) objP);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarQ), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ujl(mm40Var, i, (byte) 5);
        }
    }

    public static final void k(mm40 mm40Var, eol eolVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        int i2;
        h4d h4dVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1920808388);
        if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i2 = (fetVar2.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(eolVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        byte b = 1;
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new nk1(function1, eolVar, b);
                fetVar2.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40Var2, null, null, false, null, (Function0) objP, 28);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarW, backgroundContent, vgg0.a(16.0f)), 8.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ2 = lgb.J(ny9.O(2.0f, jm40Var, false), vgg0.a(8.0f));
            n0x n0xVar = eolVar.b;
            boolean z2 = eolVar.c;
            mz3 mz3VarT = lv00.T(n0xVar, eolVar.g, null, null, fetVar2, 0, 12);
            pge pgeVar = gqw0.A;
            if (z2) {
                h4dVar = null;
            } else {
                float[] fArrA = g4d.a();
                g4d.b(fArrA);
                h4d h4dVar2 = new h4d(new ColorMatrixColorFilter(fArrA));
                h4dVar2.b = fArrA;
                h4dVar = h4dVar2;
            }
            fetVar2 = fetVar;
            j0x.b(mz3VarT, null, mm40VarJ2, null, pgeVar, 0.0f, h4dVar, fetVar2, 24624, 40);
            if (z2) {
                fetVar2.e0(453496549);
                thb.f(ffb0.Q(jr8.f16991a.b(jm40Var, gqw0.c), 8.0f, -8.0f), new lf5(2, new y3d(((ThemeColors) fetVar2.k(zfnVar)).getBackground())), fetVar2, 0, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(453841548);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new snl(mm40Var, eolVar, function1, i, (byte) 0);
        }
    }

    public static final void l(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(654729771);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new thd((byte) 12);
                fetVar.o0(objP);
            }
            mm40 mm40VarQ = knx.Q(mm40Var, (xdr) objP);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarQ), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ujl(mm40Var, i, (byte) 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:0x0055  */
    /* JADX WARN: Code duplicated, block: B:35:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:74:0x0107  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    public static final void m(mm40 mm40Var, String str, String str2, long j, Function1 function1, Function0 function0, fet fetVar, int i, int i2) {
        int i3;
        String str3;
        int i4;
        int i5;
        int i6;
        Function0 function2;
        int i7;
        String str4;
        Function0 function3;
        long j2;
        yfe0 yfe0VarU;
        Function0 function4;
        Object objP;
        int i8;
        int i9;
        fetVar.g0(654600937);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                str3 = str;
                i3 |= fetVar.g(str3) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (fetVar.g(str2)) {
                    i9 = 256;
                } else {
                    i9 = 128;
                }
                i3 |= i9;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (fetVar.h(false)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            i5 = i3 | 24576;
            if ((196608 & i) == 0) {
                if (fetVar.i(function1)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i5 |= i8;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                if ((1572864 & i) == 0) {
                    function2 = function0;
                    if (fetVar.i(function2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i5 |= i7;
                }
                if (fetVar.U(i5 & 1, (599187 & i5) != 599186)) {
                    if (i10 != 0) {
                        str3 = "";
                    }
                    long j3 = y3d.f;
                    if (i6 != 0) {
                        objP = fetVar.P();
                        if (objP == ukd.f35823a) {
                            objP = new knl((byte) 19);
                            fetVar.o0(objP);
                        }
                        function4 = (Function0) objP;
                    } else {
                        function4 = function2;
                    }
                    mm40 mm40VarQ = i120.Q(mm40Var, j3, jd8.n);
                    zcl zclVar = qmk.f28987a;
                    int i11 = i5 << 3;
                    int i12 = ((i5 >> 6) & 112) | (i11 & 896);
                    int i13 = i5 << 6;
                    aac.n(s5x0.K(mm40VarQ, 16.0f, 8.0f), false, str3, null, str2, null, function1, null, function4, fetVar, i12 | (57344 & i13) | (i11 & 3670016) | (i13 & 234881024), 168);
                    str4 = str3;
                    function3 = function4;
                    j2 = j3;
                } else {
                    fetVar.X();
                    str4 = str3;
                    function3 = function2;
                    j2 = j;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new ayj(mm40Var, str4, str2, j2, function1, function3, i, i2);
                }
            }
            i5 |= 1572864;
            function2 = function0;
            if (fetVar.U(i5 & 1, (599187 & i5) != 599186)) {
                if (i10 != 0) {
                    str3 = "";
                }
                long j4 = y3d.f;
                if (i6 != 0) {
                    objP = fetVar.P();
                    if (objP == ukd.f35823a) {
                        objP = new knl((byte) 19);
                        fetVar.o0(objP);
                    }
                    function4 = (Function0) objP;
                } else {
                    function4 = function2;
                }
                mm40 mm40VarQ2 = i120.Q(mm40Var, j4, jd8.n);
                zcl zclVar2 = qmk.f28987a;
                int i14 = i5 << 3;
                int i15 = ((i5 >> 6) & 112) | (i14 & 896);
                int i16 = i5 << 6;
                aac.n(s5x0.K(mm40VarQ2, 16.0f, 8.0f), false, str3, null, str2, null, function1, null, function4, fetVar, i15 | (57344 & i16) | (i14 & 3670016) | (i16 & 234881024), 168);
                str4 = str3;
                function3 = function4;
                j2 = j4;
            } else {
                fetVar.X();
                str4 = str3;
                function3 = function2;
                j2 = j;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new ayj(mm40Var, str4, str2, j2, function1, function3, i, i2);
            }
        }
        i3 |= 48;
        str3 = str;
        if ((i & 384) == 0) {
            if (fetVar.g(str2)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i3 |= i9;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (fetVar.h(false)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        i5 = i3 | 24576;
        if ((196608 & i) == 0) {
            if (fetVar.i(function1)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i5 |= i8;
        }
        i6 = i2 & 64;
        if (i6 != 0) {
            if ((1572864 & i) == 0) {
                function2 = function0;
                if (fetVar.i(function2)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i5 |= i7;
            }
            if (fetVar.U(i5 & 1, (599187 & i5) != 599186)) {
                if (i10 != 0) {
                    str3 = "";
                }
                long j5 = y3d.f;
                if (i6 != 0) {
                    objP = fetVar.P();
                    if (objP == ukd.f35823a) {
                        objP = new knl((byte) 19);
                        fetVar.o0(objP);
                    }
                    function4 = (Function0) objP;
                } else {
                    function4 = function2;
                }
                mm40 mm40VarQ3 = i120.Q(mm40Var, j5, jd8.n);
                zcl zclVar3 = qmk.f28987a;
                int i17 = i5 << 3;
                int i18 = ((i5 >> 6) & 112) | (i17 & 896);
                int i19 = i5 << 6;
                aac.n(s5x0.K(mm40VarQ3, 16.0f, 8.0f), false, str3, null, str2, null, function1, null, function4, fetVar, i18 | (57344 & i19) | (i17 & 3670016) | (i19 & 234881024), 168);
                str4 = str3;
                function3 = function4;
                j2 = j5;
            } else {
                fetVar.X();
                str4 = str3;
                function3 = function2;
                j2 = j;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new ayj(mm40Var, str4, str2, j2, function1, function3, i, i2);
            }
        }
        i5 |= 1572864;
        function2 = function0;
        if (fetVar.U(i5 & 1, (599187 & i5) != 599186)) {
            if (i10 != 0) {
                str3 = "";
            }
            long j6 = y3d.f;
            if (i6 != 0) {
                objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = new knl((byte) 19);
                    fetVar.o0(objP);
                }
                function4 = (Function0) objP;
            } else {
                function4 = function2;
            }
            mm40 mm40VarQ4 = i120.Q(mm40Var, j6, jd8.n);
            zcl zclVar4 = qmk.f28987a;
            int i110 = i5 << 3;
            int i111 = ((i5 >> 6) & 112) | (i110 & 896);
            int i112 = i5 << 6;
            aac.n(s5x0.K(mm40VarQ4, 16.0f, 8.0f), false, str3, null, str2, null, function1, null, function4, fetVar, i111 | (57344 & i112) | (i110 & 3670016) | (i112 & 234881024), 168);
            str4 = str3;
            function3 = function4;
            j2 = j6;
        } else {
            fetVar.X();
            str4 = str3;
            function3 = function2;
            j2 = j;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ayj(mm40Var, str4, str2, j2, function1, function3, i, i2);
        }
    }

    public static final void n(mm40 mm40Var, e7m e7mVar, Function1 function1, ugd ugdVar, fet fetVar, int i) {
        int i2;
        shd shdVar;
        shd shdVar2;
        boolean z;
        float f;
        shd shdVar3;
        ugd ugdVar2 = ugdVar;
        function1.getClass();
        fetVar.g0(-880015528);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(e7mVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(i120.Q(lgb.J(mm40VarD, vgg0.a(16.0f)), ((StaticColors) fetVar.k(m8m0.f21378a)).m73getBlack400d7_KjU(), jd8.n), 4.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar4 = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar4);
            shd shdVar5 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar6 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar6);
            jpm0.n(fetVar);
            shd shdVar7 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar7);
            if (e7mVar instanceof d7m) {
                fetVar.e0(-276353561);
                d7m d7mVar = (d7m) e7mVar;
                a4x a4xVar = d7mVar.f5599a;
                hxh0 hxh0Var = d7mVar.c;
                boolean z3 = (i2 & 112) == 32;
                Object objP = fetVar.P();
                if (z3 || objP == ukd.f35823a) {
                    objP = new ntl(e7mVar, b);
                    fetVar.o0(objP);
                }
                shdVar = shdVar5;
                shdVar2 = shdVar6;
                shdVar3 = shdVar4;
                f = 1.0f;
                ibc.o(null, a4xVar, hxh0Var, false, (Function0) objP, function1, fetVar, (i2 << 9) & 458752, 9);
                z = false;
                fetVar.r(false);
            } else {
                shdVar = shdVar5;
                shdVar2 = shdVar6;
                z = false;
                f = 1.0f;
                shdVar3 = shdVar4;
                fetVar.e0(-276095052);
                fetVar.r(false);
            }
            mm40 mm40VarE0 = o2e.e0(lgb.J(ny9.O(1.7777778f, o7k0.d(jm40.b, f), z), vgg0.a(12.0f)), "GAME_STEAM_BOX_TAG");
            int i3 = i2 & 7168;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, z);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE0);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar3);
            jpm0.o(fetVar, bh90VarM2, shdVar);
            vqd.u(iHashCode2, fetVar, shdVar2, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar7);
            ugdVar2 = ugdVar;
            ua80.p(((i3 >> 6) & 112) | 6, ugdVar2, jr8.f16991a, fetVar, true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0i(mm40Var, (Object) e7mVar, function1, (wdr) ugdVar2, i, (byte) 11);
        }
    }

    public static final void o(nz30 nz30Var, Function1 function1, mm40 mm40Var, fet fetVar, int i, int i2) {
        int i3;
        mm40 mm40Var2;
        nz30Var.getClass();
        function1.getClass();
        fetVar.g0(1008204358);
        int i4 = (fetVar.g(nz30Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
        } else {
            i3 = i4 | (fetVar.g(mm40Var) ? 256 : 128);
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            if (i5 != 0) {
                mm40Var = jm40.b;
            }
            int i6 = i3 & 14;
            boolean z = i6 == 4;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new edl(nz30Var, (byte) 18);
                fetVar.o0(objP);
            }
            Function1 function2 = (Function1) objP;
            boolean z2 = ((i3 & 112) == 32) | (i6 == 4);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new dpl((byte) 12, (Object) nz30Var, function1);
                fetVar.o0(objP2);
            }
            mm40 mm40Var3 = mm40Var;
            dwi0.b(function2, mm40Var3, (Function1) objP2, fetVar, (i3 >> 3) & 112, 0);
            mm40Var2 = mm40Var3;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l51((Object) nz30Var, (Object) function1, mm40Var2, i, i2, (byte) 7);
        }
    }

    public static final void p(rum rumVar, fet fetVar) {
        if (rumVar instanceof num) {
            fetVar.e0(106592286);
            num numVar = (num) rumVar;
            f7k.l(null, numVar.f24155a, numVar.b, numVar.c, numVar.e, numVar.d, numVar.f, fetVar, 0, 1);
            fetVar.r(false);
            return;
        }
        boolean z = rumVar instanceof oum;
        jm40 jm40Var = jm40.b;
        if (z) {
            fetVar.e0(107016211);
            oum oumVar = (oum) rumVar;
            wwb.l(o2e.e0(jm40Var, "DS_EVENT_CARD_CYBER_V1"), oumVar.f25884a, oumVar.b, oumVar.c, oumVar.d, oumVar.e, fetVar, 6);
            fetVar.r(false);
            return;
        }
        if (rumVar instanceof pum) {
            fetVar.e0(107479444);
            pum pumVar = (pum) rumVar;
            fxb.n(o2e.e0(jm40Var, "DS_EVENT_CARD_CYBER_V3"), pumVar.f27624a, pumVar.b, pumVar.c, pumVar.d, fetVar, 6);
            fetVar.r(false);
            return;
        }
        if (!(rumVar instanceof qum)) {
            throw b1j.f(-827846292, fetVar, false);
        }
        fetVar.e0(107897293);
        qum qumVar = (qum) rumVar;
        dyb.s(o2e.e0(jm40Var, "DS_EVENT_CARD_CYBER_V4"), qumVar.f29352a, qumVar.b, qumVar.c, qumVar.d, qumVar.e, qumVar.f, qumVar.g, fetVar, 6);
        fetVar.r(false);
    }

    public static final void q(mm40 mm40Var, ny1 ny1Var, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(2083699864);
        int i2 = i | 6 | (fetVar.g(ny1Var) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            byte b2 = 14;
            qw3 qw3Var = new qw3(4.0f, true, new jf4(b2));
            qw3 qw3Var2 = new qw3(4.0f, true, new jf4(b2));
            ugd ugdVarM = u1c.M(1685174205, new elm(ny1Var, b), fetVar);
            mm40Var2 = jm40.b;
            jwb.p(mm40Var2, qw3Var, qw3Var2, null, 0, 0, ugdVarM, fetVar, 1572870, 56);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d0n((byte) 17, i, mm40Var2, ny1Var);
        }
    }

    public static final void r(mm40 mm40Var, final iqr iqrVar, fet fetVar, int i) {
        mm40 mm40Var2;
        iqrVar.getClass();
        fetVar.g0(6987284);
        int i2 = (fetVar.g(iqrVar) ? 32 : 16) | i;
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = mm40Var;
            mm40 mm40VarJ = s5x0.J(i120.Q(s5x0.N(mm40Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundGroup(), vgg0.a(12.0f)), 8.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zfn zfnVar = bmd.n;
            k6z k6zVar = k6z.f17794a;
            obc.d(zfnVar.a(k6zVar), u1c.M(-1461263816, new Function2() { // from class: a.eqr
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = b;
                    final iqr iqrVar2 = iqrVar;
                    Object[] objArr = 0;
                    final byte b4 = 1;
                    switch (b3) {
                        case 0:
                            fet fetVar2 = (fet) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                if (1.0f <= 0.0d) {
                                    vcx.a("invalid weight; must be greater than zero");
                                }
                                x7z x7zVar = new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                                zcl zclVar2 = qmk.f28987a;
                                jwb.p(s5x0.L(x7zVar, 8.0f, 0.0f, 2), uc9.e, new qw3(2.0f, true, new jf4((byte) 14)), null, 0, 0, u1c.M(1078317533, new xdr() { // from class: a.gqr
                                    @Override // a.xdr
                                    public final Object F(Object obj3, Object obj4, Object obj5) {
                                        float f;
                                        float f2;
                                        byte b5 = b4;
                                        iqr iqrVar3 = iqrVar2;
                                        fet fetVar3 = (fet) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        ((bpq) obj3).getClass();
                                        int i3 = iIntValue2 & 17;
                                        switch (b5) {
                                            case 0:
                                                if (fetVar3.U(iIntValue2 & 1, i3 != 16)) {
                                                    int i4 = 0;
                                                    for (Object obj6 : iqrVar3.d) {
                                                        int i5 = i4 + 1;
                                                        if (i4 < 0) {
                                                            q3d.p();
                                                            throw null;
                                                        }
                                                        nc90 nc90Var = (nc90) obj6;
                                                        if (i4 != q3d.i(iqrVar3.d)) {
                                                            zcl zclVar3 = qmk.f28987a;
                                                            f = 2.0f;
                                                        } else {
                                                            zcl zclVar4 = qmk.f28987a;
                                                            f = 0.0f;
                                                        }
                                                        cww.g(s5x0.N(jm40.b, 0.0f, 0.0f, f, 0.0f, 11), nc90Var, fetVar3, 0);
                                                        i4 = i5;
                                                    }
                                                } else {
                                                    fetVar3.X();
                                                }
                                                return Unit.f46060a;
                                            default:
                                                if (fetVar3.U(iIntValue2 & 1, i3 != 16)) {
                                                    int i6 = 0;
                                                    for (Object obj7 : iqrVar3.c) {
                                                        int i7 = i6 + 1;
                                                        if (i6 < 0) {
                                                            q3d.p();
                                                            throw null;
                                                        }
                                                        nc90 nc90Var2 = (nc90) obj7;
                                                        if (i6 != q3d.i(iqrVar3.c)) {
                                                            zcl zclVar5 = qmk.f28987a;
                                                            f2 = 2.0f;
                                                        } else {
                                                            zcl zclVar6 = qmk.f28987a;
                                                            f2 = 0.0f;
                                                        }
                                                        cww.g(s5x0.N(jm40.b, 0.0f, 0.0f, f2, 0.0f, 11), nc90Var2, fetVar3, 0);
                                                        i6 = i7;
                                                    }
                                                } else {
                                                    fetVar3.X();
                                                }
                                                return Unit.f46060a;
                                        }
                                    }
                                }, fetVar2), fetVar2, 1572912, 56);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            fet fetVar3 = (fet) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                if (1.0f <= 0.0d) {
                                    vcx.a("invalid weight; must be greater than zero");
                                }
                                x7z x7zVar2 = new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                                zcl zclVar3 = qmk.f28987a;
                                mm40 mm40VarL = s5x0.L(x7zVar2, 8.0f, 0.0f, 2);
                                nw3 nw3Var = uc9.e;
                                qw3 qw3Var = new qw3(2.0f, true, new jf4((byte) 14));
                                final Object[] objArr2 = objArr == true ? 1 : 0;
                                jwb.p(mm40VarL, nw3Var, qw3Var, null, 0, 0, u1c.M(-198303916, new xdr() { // from class: a.gqr
                                    @Override // a.xdr
                                    public final Object F(Object obj3, Object obj4, Object obj5) {
                                        float f;
                                        float f2;
                                        byte b5 = objArr2;
                                        iqr iqrVar3 = iqrVar2;
                                        fet fetVar4 = (fet) obj4;
                                        int iIntValue3 = ((Integer) obj5).intValue();
                                        ((bpq) obj3).getClass();
                                        int i3 = iIntValue3 & 17;
                                        switch (b5) {
                                            case 0:
                                                if (fetVar4.U(iIntValue3 & 1, i3 != 16)) {
                                                    int i4 = 0;
                                                    for (Object obj6 : iqrVar3.d) {
                                                        int i5 = i4 + 1;
                                                        if (i4 < 0) {
                                                            q3d.p();
                                                            throw null;
                                                        }
                                                        nc90 nc90Var = (nc90) obj6;
                                                        if (i4 != q3d.i(iqrVar3.d)) {
                                                            zcl zclVar4 = qmk.f28987a;
                                                            f = 2.0f;
                                                        } else {
                                                            zcl zclVar5 = qmk.f28987a;
                                                            f = 0.0f;
                                                        }
                                                        cww.g(s5x0.N(jm40.b, 0.0f, 0.0f, f, 0.0f, 11), nc90Var, fetVar4, 0);
                                                        i4 = i5;
                                                    }
                                                } else {
                                                    fetVar4.X();
                                                }
                                                return Unit.f46060a;
                                            default:
                                                if (fetVar4.U(iIntValue3 & 1, i3 != 16)) {
                                                    int i6 = 0;
                                                    for (Object obj7 : iqrVar3.c) {
                                                        int i7 = i6 + 1;
                                                        if (i6 < 0) {
                                                            q3d.p();
                                                            throw null;
                                                        }
                                                        nc90 nc90Var2 = (nc90) obj7;
                                                        if (i6 != q3d.i(iqrVar3.c)) {
                                                            zcl zclVar6 = qmk.f28987a;
                                                            f2 = 2.0f;
                                                        } else {
                                                            zcl zclVar7 = qmk.f28987a;
                                                            f2 = 0.0f;
                                                        }
                                                        cww.g(s5x0.N(jm40.b, 0.0f, 0.0f, f2, 0.0f, 11), nc90Var2, fetVar4, 0);
                                                        i6 = i7;
                                                    }
                                                } else {
                                                    fetVar4.X();
                                                }
                                                return Unit.f46060a;
                                        }
                                    }
                                }, fetVar3), fetVar3, 1572912, 56);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 56);
            q0x.s(0, fetVar, s5x0.L(jm40.b, 8.0f, 0.0f, 2), iqrVar.f15222a, iqrVar.b);
            obc.d(zfnVar.a(k6zVar), u1c.M(-1194556177, new Function2() { // from class: a.eqr
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = b2;
                    final iqr iqrVar2 = iqrVar;
                    Object[] objArr = 0;
                    final byte b4 = 1;
                    switch (b3) {
                        case 0:
                            fet fetVar2 = (fet) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                if (1.0f <= 0.0d) {
                                    vcx.a("invalid weight; must be greater than zero");
                                }
                                x7z x7zVar = new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                                zcl zclVar2 = qmk.f28987a;
                                jwb.p(s5x0.L(x7zVar, 8.0f, 0.0f, 2), uc9.e, new qw3(2.0f, true, new jf4((byte) 14)), null, 0, 0, u1c.M(1078317533, new xdr() { // from class: a.gqr
                                    @Override // a.xdr
                                    public final Object F(Object obj3, Object obj4, Object obj5) {
                                        float f;
                                        float f2;
                                        byte b5 = b4;
                                        iqr iqrVar3 = iqrVar2;
                                        fet fetVar4 = (fet) obj4;
                                        int iIntValue3 = ((Integer) obj5).intValue();
                                        ((bpq) obj3).getClass();
                                        int i3 = iIntValue3 & 17;
                                        switch (b5) {
                                            case 0:
                                                if (fetVar4.U(iIntValue3 & 1, i3 != 16)) {
                                                    int i4 = 0;
                                                    for (Object obj6 : iqrVar3.d) {
                                                        int i5 = i4 + 1;
                                                        if (i4 < 0) {
                                                            q3d.p();
                                                            throw null;
                                                        }
                                                        nc90 nc90Var = (nc90) obj6;
                                                        if (i4 != q3d.i(iqrVar3.d)) {
                                                            zcl zclVar4 = qmk.f28987a;
                                                            f = 2.0f;
                                                        } else {
                                                            zcl zclVar5 = qmk.f28987a;
                                                            f = 0.0f;
                                                        }
                                                        cww.g(s5x0.N(jm40.b, 0.0f, 0.0f, f, 0.0f, 11), nc90Var, fetVar4, 0);
                                                        i4 = i5;
                                                    }
                                                } else {
                                                    fetVar4.X();
                                                }
                                                return Unit.f46060a;
                                            default:
                                                if (fetVar4.U(iIntValue3 & 1, i3 != 16)) {
                                                    int i6 = 0;
                                                    for (Object obj7 : iqrVar3.c) {
                                                        int i7 = i6 + 1;
                                                        if (i6 < 0) {
                                                            q3d.p();
                                                            throw null;
                                                        }
                                                        nc90 nc90Var2 = (nc90) obj7;
                                                        if (i6 != q3d.i(iqrVar3.c)) {
                                                            zcl zclVar6 = qmk.f28987a;
                                                            f2 = 2.0f;
                                                        } else {
                                                            zcl zclVar7 = qmk.f28987a;
                                                            f2 = 0.0f;
                                                        }
                                                        cww.g(s5x0.N(jm40.b, 0.0f, 0.0f, f2, 0.0f, 11), nc90Var2, fetVar4, 0);
                                                        i6 = i7;
                                                    }
                                                } else {
                                                    fetVar4.X();
                                                }
                                                return Unit.f46060a;
                                        }
                                    }
                                }, fetVar2), fetVar2, 1572912, 56);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            fet fetVar3 = (fet) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                if (1.0f <= 0.0d) {
                                    vcx.a("invalid weight; must be greater than zero");
                                }
                                x7z x7zVar2 = new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                                zcl zclVar3 = qmk.f28987a;
                                mm40 mm40VarL = s5x0.L(x7zVar2, 8.0f, 0.0f, 2);
                                nw3 nw3Var = uc9.e;
                                qw3 qw3Var = new qw3(2.0f, true, new jf4((byte) 14));
                                final byte objArr2 = objArr == true ? 1 : 0;
                                jwb.p(mm40VarL, nw3Var, qw3Var, null, 0, 0, u1c.M(-198303916, new xdr() { // from class: a.gqr
                                    @Override // a.xdr
                                    public final Object F(Object obj3, Object obj4, Object obj5) {
                                        float f;
                                        float f2;
                                        byte b5 = objArr2;
                                        iqr iqrVar3 = iqrVar2;
                                        fet fetVar4 = (fet) obj4;
                                        int iIntValue3 = ((Integer) obj5).intValue();
                                        ((bpq) obj3).getClass();
                                        int i3 = iIntValue3 & 17;
                                        switch (b5) {
                                            case 0:
                                                if (fetVar4.U(iIntValue3 & 1, i3 != 16)) {
                                                    int i4 = 0;
                                                    for (Object obj6 : iqrVar3.d) {
                                                        int i5 = i4 + 1;
                                                        if (i4 < 0) {
                                                            q3d.p();
                                                            throw null;
                                                        }
                                                        nc90 nc90Var = (nc90) obj6;
                                                        if (i4 != q3d.i(iqrVar3.d)) {
                                                            zcl zclVar4 = qmk.f28987a;
                                                            f = 2.0f;
                                                        } else {
                                                            zcl zclVar5 = qmk.f28987a;
                                                            f = 0.0f;
                                                        }
                                                        cww.g(s5x0.N(jm40.b, 0.0f, 0.0f, f, 0.0f, 11), nc90Var, fetVar4, 0);
                                                        i4 = i5;
                                                    }
                                                } else {
                                                    fetVar4.X();
                                                }
                                                return Unit.f46060a;
                                            default:
                                                if (fetVar4.U(iIntValue3 & 1, i3 != 16)) {
                                                    int i6 = 0;
                                                    for (Object obj7 : iqrVar3.c) {
                                                        int i7 = i6 + 1;
                                                        if (i6 < 0) {
                                                            q3d.p();
                                                            throw null;
                                                        }
                                                        nc90 nc90Var2 = (nc90) obj7;
                                                        if (i6 != q3d.i(iqrVar3.c)) {
                                                            zcl zclVar6 = qmk.f28987a;
                                                            f2 = 2.0f;
                                                        } else {
                                                            zcl zclVar7 = qmk.f28987a;
                                                            f2 = 0.0f;
                                                        }
                                                        cww.g(s5x0.N(jm40.b, 0.0f, 0.0f, f2, 0.0f, 11), nc90Var2, fetVar4, 0);
                                                        i6 = i7;
                                                    }
                                                } else {
                                                    fetVar4.X();
                                                }
                                                return Unit.f46060a;
                                        }
                                    }
                                }, fetVar3), fetVar3, 1572912, 56);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gup(mm40Var2, iqrVar, i, (byte) 20);
        }
    }

    public static final void s(mm40 mm40Var, xcz xczVar, a4x a4xVar, dja djaVar, nek nekVar, xak xakVar, Function1 function1, fet fetVar, int i) {
        int i2;
        Object xb2Var;
        int i3;
        int i4;
        int i5;
        Object g6qVar;
        Object obj;
        dja djaVar2;
        a4xVar.getClass();
        nekVar.getClass();
        xakVar.getClass();
        function1.getClass();
        fetVar.g0(222173019);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(xczVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar.g(a4xVar) : fetVar.i(a4xVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.e(djaVar == null ? -1 : djaVar.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & 32768) == 0 ? fetVar.g(nekVar) : fetVar.i(nekVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (i & 262144) == 0 ? fetVar.g(xakVar) : fetVar.i(xakVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(function1) ? 1048576 : 524288;
        }
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 599187) != 599186)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new thd((byte) 23);
                fetVar.o0(objP);
            }
            pfk0 pfk0VarP = idx.P(xczVar, (xdr) objP, fetVar, ((i2 >> 3) & 14) | 24576, 14);
            pz40 pz40VarF = androidx.compose.runtime.e.f(djaVar, fetVar);
            pz40 pz40VarF2 = androidx.compose.runtime.e.f(a4xVar, fetVar);
            int i6 = i2 & 112;
            boolean zG = (i6 == 32) | fetVar.g(pz40VarF2) | fetVar.g(pz40VarF) | ((i2 & 3670016) == 1048576);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                i3 = i6;
                i4 = i2;
                i5 = 2048;
                xb2Var = new xb2(xczVar, pz40VarF2, pz40VarF, function1, null, (byte) 29);
                fetVar.o0(xb2Var);
            } else {
                i4 = i2;
                xb2Var = objP2;
                i3 = i6;
                i5 = 2048;
            }
            m0x0.t(fetVar, xczVar, (Function2) xb2Var);
            int i7 = i4 & 896;
            boolean z2 = (i3 == 32) | (i7 == 256 || ((i4 & 512) != 0 && fetVar.i(a4xVar))) | ((i4 & 7168) == i5);
            Object objP3 = fetVar.P();
            if (z2 || objP3 == cl5Var) {
                g6qVar = new g6q((Object) xczVar, (Object) a4xVar, (Object) djaVar, (yje) null, (byte) 24);
                obj = a4xVar;
                djaVar2 = djaVar;
                fetVar.o0(g6qVar);
            } else {
                g6qVar = objP3;
                obj = a4xVar;
                djaVar2 = djaVar;
            }
            m0x0.v(djaVar2, obj, (Function2) g6qVar, fetVar);
            boolean z3 = (i7 == 256 || ((i4 & 512) != 0 && fetVar.i(obj))) | ((57344 & i4) == 16384 || ((i4 & 32768) != 0 && fetVar.i(nekVar)));
            if ((458752 & i4) == 131072 || ((i4 & 262144) != 0 && fetVar.i(xakVar))) {
                z = true;
            }
            boolean z4 = z3 | z;
            Object objP4 = fetVar.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new f8m(obj, (Object) nekVar, (Object) xakVar, (byte) 25);
                fetVar.o0(objP4);
            }
            b8k0.f(mm40Var, xczVar, null, false, null, null, pfk0VarP, false, null, (Function1) objP4, fetVar, i4 & 126, 444);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t49((Object) mm40Var, (Object) xczVar, (Object) a4xVar, (Object) djaVar, (Object) nekVar, (Object) xakVar, (Object) function1, i, (byte) 15);
        }
    }

    public static final void t(int i, fet fetVar, mm40 mm40Var, String str) {
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
        long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
        ((g1t0) fetVar.k(j1t0.e)).getClass();
        v8q0.a(str, null, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.e(), fetVar, (i >> 3) & 14, 24960, 109562);
        fetVar.r(true);
    }

    public static final void u(RecyclerView recyclerView, List list, qv5 qv5Var) {
        list.getClass();
        qv5Var.getClass();
        androidx.recyclerview.widget.b layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null) {
            gridLayoutManager.m1 = new lto(qv5Var, list);
        }
    }

    public static final lnq z(gmq gmqVar, int i) {
        if (i >= 0) {
            return new lnq(gmqVar, i, (byte) 0);
        }
        c99.s(twn.m(i, "Drop count should be non-negative, but had "));
        return null;
    }

    public Object E(Object obj, Object obj2) {
        return null;
    }

    public Object Q() {
        return Unit.f46060a;
    }

    public abstract boolean w(Object obj, Object obj2);

    public abstract boolean x(Object obj, Object obj2);

    public abstract boolean y(Object obj);

    public void v(Object obj) {
    }
}
