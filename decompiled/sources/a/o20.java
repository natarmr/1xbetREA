package a;

import android.javax.sip.message.Response;
import android.text.Html;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.feed.linelive.presentation.feeds.child.champs.models.FeedsChampsItemsSelectionState;
import org.xplatform.security.api.domain.models.SecretQuestionModel;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o20 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24507a;
    public final /* synthetic */ ctf0 b;
    public final /* synthetic */ g2v c;

    public /* synthetic */ o20(g2v g2vVar, ctf0 ctf0Var, byte b) {
        this.f24507a = b;
        this.c = g2vVar;
        this.b = ctf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:170:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:171:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:174:0x058d  */
    /* JADX WARN: Code duplicated, block: B:177:0x05a6 A[LOOP:0: B:175:0x05a0->B:177:0x05a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:181:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:185:0x05ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:186:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:187:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:189:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:192:0x062c  */
    /* JADX WARN: Code duplicated, block: B:194:0x0642  */
    /* JADX WARN: Code duplicated, block: B:195:0x0645  */
    /* JADX WARN: Code duplicated, block: B:200:0x0676  */
    /* JADX WARN: Code duplicated, block: B:204:0x0682 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:205:0x0684  */
    /* JADX WARN: Code duplicated, block: B:206:0x068a  */
    /* JADX WARN: Code duplicated, block: B:210:0x069d  */
    /* JADX WARN: Code duplicated, block: B:212:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:214:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:216:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:217:0x06c6  */
    /* JADX WARN: Code duplicated, block: B:219:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:220:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:221:0x070a  */
    /* JADX WARN: Code duplicated, block: B:224:0x0737  */
    /* JADX WARN: Code duplicated, block: B:225:0x073a  */
    /* JADX WARN: Code duplicated, block: B:227:0x073e  */
    /* JADX WARN: Code duplicated, block: B:228:0x074b  */
    private final Object a(Object obj) {
        gua0 gua0Var;
        g2v g2vVar;
        Object obj2;
        a4x a4xVarO0;
        ArrayList arrayList;
        Iterator it;
        List list;
        LinkedHashMap linkedHashMap;
        String str;
        ArrayList arrayList2;
        List listQ0;
        kra0 gra0Var;
        gua0 gua0Var2;
        kra0 ira0Var;
        HashMap map;
        List listQ1;
        lsm0 lsm0Var;
        String strA;
        int i;
        gmm dmmVar;
        long primary;
        long secondary;
        ArrayList arrayList3;
        Iterator it2;
        wkm wkmVar;
        wkm wkmVar2;
        wa50 ta50Var;
        xip xipVar;
        long j;
        gmm gmmVar;
        int iOrdinal;
        qim oimVar;
        j8l0 j8l0Var;
        j8l0 j8l0Var2;
        wxl wxlVar;
        long background;
        ArrayList arrayList4;
        skm skmVar;
        skm skmVar2;
        oa50 la50Var;
        gua0 gua0Var3 = (gua0) obj;
        gua0Var3.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        h8l0 h8l0Var = gua0Var3.j;
        rlp rlpVar = gua0Var3.b;
        FeedsChampsItemsSelectionState feedsChampsItemsSelectionState = gua0Var3.p;
        fua0 fua0Var = gua0Var3.f11919a;
        String str2 = gua0Var3.c;
        if (!(fua0Var instanceof eua0)) {
            boolean z = fua0Var instanceof cua0;
            g2v g2vVar2 = this.c;
            if (z) {
                ira0Var = new ira0(g2v.b(g2vVar2, pb10.g, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 0L, System.currentTimeMillis() + 10000, 350));
            } else {
                if (!(fua0Var instanceof dua0)) {
                    t9f.b();
                    return null;
                }
                knb knbVarX = r7x.x(gua0Var3);
                Set set = gua0Var3.d;
                zmb zmbVar = gua0Var3.f;
                String str3 = rlpVar.c.f14345a;
                str2.getClass();
                set.getClass();
                zmbVar.getClass();
                feedsChampsItemsSelectionState.getClass();
                int length = str2.length();
                List list2 = knbVarX.f18576a;
                if (length == 0) {
                    ArrayList arrayList5 = new ArrayList();
                    obj2 = null;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    HashMap map2 = new HashMap();
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        rbb rbbVar = (rbb) it3.next();
                        HashMap map3 = map2;
                        long j2 = rbbVar.n;
                        Iterator it4 = it3;
                        List list3 = rbbVar.d;
                        h8l0 h8l0Var2 = h8l0Var;
                        if (linkedHashMap2.containsKey(Long.valueOf(j2))) {
                            map = map3;
                        } else {
                            linkedHashMap2.put(Long.valueOf(j2), m7x.y(rbbVar, str3));
                            map = map3;
                            map.put(Long.valueOf(j2), new ArrayList());
                        }
                        List list4 = (List) map.get(Long.valueOf(j2));
                        if (list4 != null) {
                            if (list3.isEmpty()) {
                                list4.add(m7x.T(rbbVar, feedsChampsItemsSelectionState));
                            } else {
                                String strH = m7x.H(rbbVar);
                                boolean zContains = set.contains(f7k.K(zmbVar, rbbVar.f30176a, j2));
                                a2l0 a2l0VarS = m7x.S(rbbVar.c);
                                int i2 = (int) rbbVar.f;
                                pgb pgbVar = rbbVar.o;
                                ara0 ara0Var = new ara0(rbbVar.f30176a, rbbVar.c, rbbVar.n, strH, new k7l0(a2l0VarS, i2, strH, null, m7x.r(pgbVar == pgb.b, pgbVar == pgb.c), zContains, Integer.valueOf(list3.size()), 24), zContains);
                                if (zContains) {
                                    ArrayList arrayList6 = new ArrayList(r3d.q(list3, 10));
                                    Iterator it5 = list3.iterator();
                                    while (it5.hasNext()) {
                                        arrayList6.add(m7x.V((sum0) it5.next(), zmbVar, feedsChampsItemsSelectionState));
                                    }
                                    listQ1 = CollectionsKt.q0(kotlin.collections.a.c(ara0Var), arrayList6);
                                } else {
                                    listQ1 = kotlin.collections.a.c(ara0Var);
                                }
                                list4.addAll(listQ1);
                            }
                        }
                        map2 = map;
                        it3 = it4;
                        g2vVar2 = g2vVar2;
                        linkedHashMap2 = linkedHashMap2;
                        h8l0Var = h8l0Var2;
                        gua0Var3 = gua0Var3;
                        ctf0Var = ctf0Var;
                    }
                    gua0Var = gua0Var3;
                    ctf0Var = ctf0Var;
                    h8l0Var = h8l0Var;
                    LinkedHashMap linkedHashMap3 = linkedHashMap2;
                    HashMap map4 = map2;
                    g2vVar = g2vVar2;
                    for (Map.Entry entry : linkedHashMap3.entrySet()) {
                        long jLongValue = ((Number) entry.getKey()).longValue();
                        bra0 bra0Var = (bra0) entry.getValue();
                        List list5 = (List) map4.get(Long.valueOf(jLongValue));
                        if (list5 != null && !list5.isEmpty()) {
                            arrayList5.add(bra0Var);
                            arrayList5.addAll(list5);
                        }
                    }
                    a4xVarO0 = dyb.o0(arrayList5);
                } else {
                    gua0Var = gua0Var3;
                    ctf0Var = ctf0Var;
                    h8l0Var = h8l0Var;
                    g2vVar = g2vVar2;
                    obj2 = null;
                    ArrayList arrayList7 = new ArrayList();
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    HashMap map5 = new HashMap();
                    Iterator it6 = list2.iterator();
                    while (it6.hasNext()) {
                        rbb rbbVar2 = (rbb) it6.next();
                        String str4 = rbbVar2.c;
                        List list6 = rbbVar2.d;
                        long j3 = rbbVar2.n;
                        if (StringsKt.O(str4, str2, true)) {
                            it = it6;
                            list = list6;
                        } else {
                            if (list6 == null || !list6.isEmpty()) {
                                Iterator it7 = list6.iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        it = it6;
                                        list = list6;
                                        if (!StringsKt.O(((sum0) it7.next()).c, str2, true)) {
                                            it6 = it;
                                            list6 = list;
                                        }
                                    }
                                }
                            }
                            it = it6;
                            arrayList2 = arrayList7;
                            linkedHashMap = linkedHashMap4;
                            str = str3;
                            it6 = it;
                            arrayList7 = arrayList2;
                            linkedHashMap4 = linkedHashMap;
                            str3 = str;
                        }
                        if (!linkedHashMap4.containsKey(Long.valueOf(j3))) {
                            linkedHashMap4.put(Long.valueOf(j3), m7x.y(rbbVar2, str3));
                            map5.put(Long.valueOf(j3), new ArrayList());
                        }
                        List list7 = (List) map5.get(Long.valueOf(j3));
                        if (list7 == null) {
                            arrayList2 = arrayList7;
                            linkedHashMap = linkedHashMap4;
                            str = str3;
                        } else {
                            ArrayList arrayList8 = new ArrayList();
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                LinkedHashMap linkedHashMap5 = linkedHashMap4;
                                Object next = it8.next();
                                String str5 = str3;
                                Iterator it9 = it8;
                                if (StringsKt.O(((sum0) next).c, str2, true) || StringsKt.O(str4, str2, true)) {
                                    arrayList8.add(next);
                                }
                                linkedHashMap4 = linkedHashMap5;
                                str3 = str5;
                                it8 = it9;
                            }
                            linkedHashMap = linkedHashMap4;
                            str = str3;
                            if (list.isEmpty()) {
                                list7.add(m7x.T(rbbVar2, feedsChampsItemsSelectionState));
                            } else if (arrayList8.size() != 1 || zmbVar == zmb.b) {
                                if (arrayList8.isEmpty()) {
                                    listQ0 = iun.f15405a;
                                    arrayList2 = arrayList7;
                                } else {
                                    long j4 = 0;
                                    for (Iterator it10 = arrayList8.iterator(); it10.hasNext(); it10 = it10) {
                                        j4 += ((sum0) it10.next()).e;
                                        arrayList7 = arrayList7;
                                    }
                                    arrayList2 = arrayList7;
                                    String strH2 = m7x.H(rbbVar2);
                                    boolean zContains2 = set.contains(f7k.K(zmbVar, rbbVar2.f30176a, j3));
                                    a2l0 a2l0VarS2 = m7x.S(str4);
                                    int i3 = (int) j4;
                                    pgb pgbVar2 = rbbVar2.o;
                                    ara0 ara0Var2 = new ara0(rbbVar2.f30176a, rbbVar2.c, rbbVar2.n, strH2, new k7l0(a2l0VarS2, i3, strH2, null, m7x.r(pgbVar2 == pgb.b, pgbVar2 == pgb.c), zContains2, Integer.valueOf(arrayList8.size()), 24), zContains2);
                                    if (zContains2) {
                                        ArrayList arrayList9 = new ArrayList(r3d.q(arrayList8, 10));
                                        Iterator it11 = arrayList8.iterator();
                                        while (it11.hasNext()) {
                                            arrayList9.add(m7x.V((sum0) it11.next(), zmbVar, feedsChampsItemsSelectionState));
                                        }
                                        listQ0 = CollectionsKt.q0(kotlin.collections.a.c(ara0Var2), arrayList9);
                                    } else {
                                        listQ0 = kotlin.collections.a.c(ara0Var2);
                                    }
                                }
                                list7.addAll(listQ0);
                            } else {
                                sum0 sum0Var = (sum0) arrayList8.get(0);
                                boolean z2 = feedsChampsItemsSelectionState.f46666a;
                                Set set2 = feedsChampsItemsSelectionState.b;
                                boolean z3 = z2 && set2.contains(Long.valueOf(sum0Var.f32829a));
                                boolean z4 = z3 || set2.size() < 10;
                                int i4 = sum0Var.k ? R.drawable.ic_glyph_favourite_active : R.drawable.ic_glyph_favourite_inactive;
                                String strI = m7x.I(sum0Var, zmbVar);
                                String str6 = sum0Var.c;
                                int i5 = (int) sum0Var.e;
                                pgb pgbVar3 = sum0Var.n;
                                list7.add(new cra0(sum0Var.f32829a, sum0Var.c, sum0Var.l, strI, m7x.z(str6, i5, strI, m7x.r(pgbVar3 == pgb.b, pgbVar3 == pgb.c), feedsChampsItemsSelectionState.f46666a, z3, z4, i4), sum0Var.i, false, sum0Var.k));
                            }
                            arrayList2 = arrayList7;
                        }
                        it6 = it;
                        arrayList7 = arrayList2;
                        linkedHashMap4 = linkedHashMap;
                        str3 = str;
                    }
                    ArrayList arrayList10 = arrayList7;
                    for (Map.Entry entry2 : linkedHashMap4.entrySet()) {
                        long jLongValue2 = ((Number) entry2.getKey()).longValue();
                        bra0 bra0Var2 = (bra0) entry2.getValue();
                        List list8 = (List) map5.get(Long.valueOf(jLongValue2));
                        if (list8 == null || list8.isEmpty()) {
                            arrayList = arrayList10;
                        } else {
                            arrayList = arrayList10;
                            arrayList.add(bra0Var2);
                            arrayList.addAll(list8);
                        }
                        arrayList10 = arrayList;
                    }
                    a4xVarO0 = dyb.o0(arrayList10);
                }
                if (a4xVarO0 == null || !a4xVarO0.isEmpty()) {
                    Iterator<E> it12 = a4xVarO0.iterator();
                    while (true) {
                        if (!it12.hasNext()) {
                            gua0Var2 = gua0Var;
                            if (str2.length() > 0) {
                                gra0Var = new hra0(g2v.b(g2vVar, pb10.e, null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990));
                            } else {
                                gra0Var = new ira0(g2v.b(g2vVar, pb10.g, null, null, 0, 0, R.string.currently_no_events, 0, R.string.refresh_data, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                            }
                        } else if (!(((era0) it12.next()) instanceof bra0)) {
                            gua0Var2 = gua0Var;
                            gra0Var = new gra0(a4xVarO0, gua0Var2.h, gua0Var2.g, gua0Var2.i);
                        }
                    }
                } else {
                    gua0Var2 = gua0Var;
                    if (str2.length() > 0) {
                        gra0Var = new hra0(g2v.b(g2vVar, pb10.e, null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990));
                    } else {
                        gra0Var = new ira0(g2v.b(g2vVar, pb10.g, null, null, 0, 0, R.string.currently_no_events, 0, R.string.refresh_data, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                    }
                }
                ira0Var = gra0Var;
            }
            lul lulVar = lul.e;
            oe9 oe9Var = oe9.f25112a;
            Object[] objArr = {String.valueOf(feedsChampsItemsSelectionState.b.size()), "10"};
            lsm0Var = ctf0Var.b;
            ctf0 ctf0Var2 = ctf0Var;
            hn8 hn8Var = new hn8(gua0Var2.q, new mtl(dyb.g0(new itl(new wul(lulVar, oe9Var, new ue9(lsm0Var.a(R.string.select_items_max, Arrays.copyOf(objArr, 2))), !feedsChampsItemsSelectionState.b.isEmpty(), false, true), rk.y), new itl(new wul(nul.e, oe9Var, new ue9(lsm0Var.a(R.string.cancel, Arrays.copyOf(new Object[0], 0))), true, false, true), rk.x))));
            strA = lsm0Var.a(R.string.polybet, Arrays.copyOf(new Object[0], 0));
            i = fta0.f10102a[h8l0Var.ordinal()];
            dmmVar = fmm.f9790a;
            if (i == 4) {
                a4x<xip> a4xVarQ = p7x.q(gua0Var2);
                arrayList4 = new ArrayList(r3d.q(a4xVarQ, 10));
                for (xip xipVar2 : a4xVarQ) {
                    arrayList4.add(new skm(xipVar2.f40956a, xipVar2.b, xipVar2.d, (y3d) null, 48));
                }
                a4x a4xVarO1 = dyb.o0(arrayList4);
                skmVar = (skm) CollectionsKt.W(0, a4xVarO1);
                skmVar2 = (skm) CollectionsKt.W(1, a4xVarO1);
                skm skmVar3 = (skm) CollectionsKt.W(2, a4xVarO1);
                if (skmVar != null) {
                    if (skmVar2 == null && skmVar3 != null) {
                        la50Var = new ma50(skmVar, skmVar2, skmVar3);
                    } else if (skmVar2 != null) {
                        la50Var = new na50(skmVar, skmVar2);
                    } else {
                        la50Var = new la50(skmVar);
                    }
                    dmmVar = new emm(la50Var);
                }
            } else {
                a4x a4xVarQ2 = p7x.q(gua0Var2);
                pz40 pz40Var = s6t0.f31722a;
                primary = s6t0.b().f33626a.getPrimary();
                secondary = s6t0.b().f33626a.getSecondary();
                arrayList3 = new ArrayList(r3d.q(a4xVarQ2, 10));
                it2 = a4xVarQ2.iterator();
                while (it2.hasNext()) {
                    xipVar = (xip) it2.next();
                    byte b = xipVar.f40956a;
                    Iterator it13 = it2;
                    int i6 = xipVar.b;
                    boolean z5 = xipVar.d;
                    if (xipVar.c) {
                        j = primary;
                    } else {
                        j = secondary;
                    }
                    arrayList3.add(new wkm(b, i6, z5, ra50.f30118a, j));
                    it2 = it13;
                }
                a4x a4xVarO2 = dyb.o0(arrayList3);
                wkmVar = (wkm) CollectionsKt.W(0, a4xVarO2);
                wkmVar2 = (wkm) CollectionsKt.W(1, a4xVarO2);
                wkm wkmVar3 = (wkm) CollectionsKt.W(2, a4xVarO2);
                if (wkmVar != null) {
                    if (wkmVar2 == null && wkmVar3 != null) {
                        ta50Var = new ua50(wkmVar, wkmVar2, wkmVar3);
                    } else if (wkmVar2 != null) {
                        ta50Var = new va50(wkmVar, wkmVar2);
                    } else {
                        ta50Var = new ta50(wkmVar);
                    }
                    dmmVar = new dmm(ta50Var);
                }
            }
            gmmVar = dmmVar;
            iOrdinal = h8l0Var.ordinal();
            if (iOrdinal != 0) {
                oimVar = new oim(strA, gua0Var2.k, lsm0Var.a(R.string.search, Arrays.copyOf(new Object[0], 0)), gua0Var2.c, gua0Var2.k, gmmVar, 0, lak0.c, axh0.f1625a, null);
            } else if (iOrdinal != 1) {
                oimVar = new mim(gmmVar, gua0Var2.k, lsm0Var.a(R.string.search, Arrays.copyOf(new Object[0], 0)), gua0Var2.c, gua0Var2.k, 0, lak0.c, strA, 256);
            } else if (iOrdinal != 2) {
                oimVar = new lim(0, gmmVar, lak0.c, strA, lsm0Var.a(R.string.search, Arrays.copyOf(new Object[0], 0)), gua0Var2.c, null, gua0Var2.k, gua0Var2.k);
            } else {
                if (iOrdinal == 3) {
                    t9f.b();
                    return obj2;
                }
                oimVar = new nim(0, gmmVar, lak0.c, strA, lsm0Var.a(R.string.search, Arrays.copyOf(new Object[0], 0)), gua0Var2.c, null, gua0Var2.k, gua0Var2.k);
            }
            a4x a4xVar = gua0Var2.m;
            ghq0 ghq0Var = gua0Var2.n;
            j8l0Var = rlpVar.d;
            j8l0Var2 = j8l0.SMALL_ITEM_LINE_SEPARATOR;
            if (j8l0Var == j8l0Var2) {
                wxlVar = wxl.SECONDARY;
            } else {
                wxlVar = wxl.PRIMARY;
            }
            if (j8l0Var == j8l0Var2) {
                pz40 pz40Var2 = s6t0.f31722a;
                background = s6t0.b().f33626a.getBackgroundContent();
            } else {
                pz40 pz40Var3 = s6t0.f31722a;
                background = s6t0.b().f33626a.getBackground();
            }
            a4xVar.getClass();
            return new nua0(ira0Var, hn8Var, oimVar, new iua0(iom0.i(a4xVar, ghq0Var, ctf0Var2), wxlVar, background));
        }
        ira0Var = jra0.f16994a;
        obj2 = null;
        gua0Var2 = gua0Var3;
        lul lulVar2 = lul.e;
        oe9 oe9Var2 = oe9.f25112a;
        Object[] objArr2 = {String.valueOf(feedsChampsItemsSelectionState.b.size()), "10"};
        lsm0Var = ctf0Var.b;
        ctf0 ctf0Var3 = ctf0Var;
        hn8 hn8Var2 = new hn8(gua0Var2.q, new mtl(dyb.g0(new itl(new wul(lulVar2, oe9Var2, new ue9(lsm0Var.a(R.string.select_items_max, Arrays.copyOf(objArr2, 2))), !feedsChampsItemsSelectionState.b.isEmpty(), false, true), rk.y), new itl(new wul(nul.e, oe9Var2, new ue9(lsm0Var.a(R.string.cancel, Arrays.copyOf(new Object[0], 0))), true, false, true), rk.x))));
        strA = lsm0Var.a(R.string.polybet, Arrays.copyOf(new Object[0], 0));
        i = fta0.f10102a[h8l0Var.ordinal()];
        dmmVar = fmm.f9790a;
        if (i == 4) {
            a4x<xip> a4xVarQ3 = p7x.q(gua0Var2);
            arrayList4 = new ArrayList(r3d.q(a4xVarQ3, 10));
            while (r3.hasNext()) {
                arrayList4.add(new skm(xipVar2.f40956a, xipVar2.b, xipVar2.d, (y3d) null, 48));
            }
            a4x a4xVarO3 = dyb.o0(arrayList4);
            skmVar = (skm) CollectionsKt.W(0, a4xVarO3);
            skmVar2 = (skm) CollectionsKt.W(1, a4xVarO3);
            skm skmVar4 = (skm) CollectionsKt.W(2, a4xVarO3);
            if (skmVar != null) {
                if (skmVar2 == null) {
                    if (skmVar2 != null) {
                        la50Var = new na50(skmVar, skmVar2);
                    } else {
                        la50Var = new la50(skmVar);
                    }
                } else if (skmVar2 != null) {
                    la50Var = new na50(skmVar, skmVar2);
                } else {
                    la50Var = new la50(skmVar);
                }
                dmmVar = new emm(la50Var);
            }
        } else {
            a4x a4xVarQ4 = p7x.q(gua0Var2);
            pz40 pz40Var4 = s6t0.f31722a;
            primary = s6t0.b().f33626a.getPrimary();
            secondary = s6t0.b().f33626a.getSecondary();
            arrayList3 = new ArrayList(r3d.q(a4xVarQ4, 10));
            it2 = a4xVarQ4.iterator();
            while (it2.hasNext()) {
                xipVar = (xip) it2.next();
                byte b2 = xipVar.f40956a;
                Iterator it14 = it2;
                int i7 = xipVar.b;
                boolean z6 = xipVar.d;
                if (xipVar.c) {
                    j = primary;
                } else {
                    j = secondary;
                }
                arrayList3.add(new wkm(b2, i7, z6, ra50.f30118a, j));
                it2 = it14;
            }
            a4x a4xVarO4 = dyb.o0(arrayList3);
            wkmVar = (wkm) CollectionsKt.W(0, a4xVarO4);
            wkmVar2 = (wkm) CollectionsKt.W(1, a4xVarO4);
            wkm wkmVar4 = (wkm) CollectionsKt.W(2, a4xVarO4);
            if (wkmVar != null) {
                if (wkmVar2 == null) {
                    if (wkmVar2 != null) {
                        ta50Var = new va50(wkmVar, wkmVar2);
                    } else {
                        ta50Var = new ta50(wkmVar);
                    }
                } else if (wkmVar2 != null) {
                    ta50Var = new va50(wkmVar, wkmVar2);
                } else {
                    ta50Var = new ta50(wkmVar);
                }
                dmmVar = new dmm(ta50Var);
            }
        }
        gmmVar = dmmVar;
        iOrdinal = h8l0Var.ordinal();
        if (iOrdinal != 0) {
            oimVar = new oim(strA, gua0Var2.k, lsm0Var.a(R.string.search, Arrays.copyOf(new Object[0], 0)), gua0Var2.c, gua0Var2.k, gmmVar, 0, lak0.c, axh0.f1625a, null);
        } else if (iOrdinal != 1) {
            oimVar = new mim(gmmVar, gua0Var2.k, lsm0Var.a(R.string.search, Arrays.copyOf(new Object[0], 0)), gua0Var2.c, gua0Var2.k, 0, lak0.c, strA, 256);
        } else if (iOrdinal != 2) {
            oimVar = new lim(0, gmmVar, lak0.c, strA, lsm0Var.a(R.string.search, Arrays.copyOf(new Object[0], 0)), gua0Var2.c, null, gua0Var2.k, gua0Var2.k);
        } else {
            if (iOrdinal == 3) {
                t9f.b();
                return obj2;
            }
            oimVar = new nim(0, gmmVar, lak0.c, strA, lsm0Var.a(R.string.search, Arrays.copyOf(new Object[0], 0)), gua0Var2.c, null, gua0Var2.k, gua0Var2.k);
        }
        a4x a4xVar2 = gua0Var2.m;
        ghq0 ghq0Var2 = gua0Var2.n;
        j8l0Var = rlpVar.d;
        j8l0Var2 = j8l0.SMALL_ITEM_LINE_SEPARATOR;
        if (j8l0Var == j8l0Var2) {
            wxlVar = wxl.SECONDARY;
        } else {
            wxlVar = wxl.PRIMARY;
        }
        if (j8l0Var == j8l0Var2) {
            pz40 pz40Var5 = s6t0.f31722a;
            background = s6t0.b().f33626a.getBackgroundContent();
        } else {
            pz40 pz40Var6 = s6t0.f31722a;
            background = s6t0.b().f33626a.getBackground();
        }
        a4xVar2.getClass();
        return new nua0(ira0Var, hn8Var2, oimVar, new iua0(iom0.i(a4xVar2, ghq0Var2, ctf0Var3), wxlVar, background));
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0218  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object b(Object obj) {
        Object next;
        plh0 mlh0Var;
        imm immVar;
        lc00 lc00Var;
        amh0 amh0Var;
        String str;
        int i;
        mdm mdmVarB;
        boolean z;
        String str2;
        mmh0 mmh0Var = (mmh0) obj;
        mmh0Var.getClass();
        String str3 = mmh0Var.e;
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        int i2 = mmh0Var.d;
        String str4 = mmh0Var.f;
        boolean z2 = i2 != 0 ? str4.length() > 0 : !(str3.length() <= 0 || str4.length() <= 0);
        pz40 pz40Var = s6t0.f31722a;
        ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
        lsm0 lsm0Var = ctf0Var.b;
        imm immVar2 = new imm(ilmVar, new plm(lsm0Var.a(R.string.secret_question, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
        llh0 llh0Var = mmh0Var.f22038a;
        boolean z3 = i2 == 0;
        boolean z4 = i2 != -1;
        Iterator it = mmh0Var.b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((SecretQuestionModel) next).f46923a != i2);
        SecretQuestionModel secretQuestionModel = (SecretQuestionModel) next;
        String str5 = (secretQuestionModel == null || (str2 = secretQuestionModel.b) == null) ? "" : str2;
        String str6 = mmh0Var.g;
        amh0 amh0Var2 = mmh0Var.i;
        if (!llh0Var.equals(jlh0.f16718a)) {
            if (llh0Var instanceof ilh0) {
                int iOrdinal = ((ilh0) llh0Var).f14979a.ordinal();
                g2v g2vVar = this.c;
                if (iOrdinal == 0) {
                    mdmVarB = g2v.b(g2vVar, pb10.g, null, null, 0, 0, R.string.statistic_empty_data, 0, 0, 0L, 0L, 990);
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return null;
                    }
                    mdmVarB = g2v.b(g2vVar, pb10.g, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 0L, System.currentTimeMillis() + 10000, 350);
                }
                mlh0Var = new nlh0(mdmVarB);
            } else {
                if (!(llh0Var instanceof klh0)) {
                    t9f.b();
                    return null;
                }
                lc00 lc00VarB = kotlin.collections.a.b();
                lc00VarB.add(new pkh0(xlh0.f41073a, new x6q0(str5, g6q0.f10780a, new s7q0(""), true, false, null, lsm0Var.a(R.string.secret_question_hint, Arrays.copyOf(new Object[0], 0)), "", 0, 31104), xx30.b, false));
                o6q0 o6q0Var = o6q0.f24750a;
                if (z3) {
                    lsm0Var = lsm0Var;
                    immVar = immVar2;
                    amh0Var = amh0Var2;
                    lc00Var = lc00VarB;
                    str = "";
                    x6q0 x6q0Var = new x6q0(str3, o6q0Var, new s7q0(str6), true, str6.length() > 0, null, lsm0Var.a(R.string.secret_question_your_question_hint, Arrays.copyOf(new Object[0], 0)), "", 6, 14720);
                    xx30 xx30Var = xx30.d;
                    zlh0 zlh0Var = zlh0.f44581a;
                    lc00Var.add(new pkh0(zlh0Var, x6q0Var, xx30Var, Intrinsics.d(amh0Var, zlh0Var)));
                } else {
                    lsm0Var = lsm0Var;
                    immVar = immVar2;
                    lc00Var = lc00VarB;
                    amh0Var = amh0Var2;
                    str = "";
                }
                i = 0;
                x6q0 x6q0Var2 = new x6q0(str4, o6q0Var, new s7q0(str), z4, false, null, lsm0Var.a(R.string.enter_answer, Arrays.copyOf(new Object[0], 0)), "", 7, 14720);
                xx30 xx30Var2 = xx30.c;
                ylh0 ylh0Var = ylh0.f42842a;
                lc00Var.add(new pkh0(ylh0Var, x6q0Var2, xx30Var2, Intrinsics.d(amh0Var, ylh0Var)));
                mlh0Var = new mlh0(dyb.o0(kotlin.collections.a.a(lc00Var)));
                mmh0Var = mmh0Var;
            }
            if (mmh0Var.h || !z2) {
                z = i;
            } else {
                z = 1;
            }
            return new nmh0(immVar, new mtl(dyb.g0(new itl(new wul(lul.e, oe9.f25112a, new ue9(lsm0Var.a(R.string.save, Arrays.copyOf(new Object[i], i))), z, false, false), rk.o))), mlh0Var, mmh0Var.c);
        }
        mlh0Var = olh0.f25455a;
        immVar = immVar2;
        i = 0;
        if (mmh0Var.h) {
            z = i;
        } else {
            z = i;
        }
        return new nmh0(immVar, new mtl(dyb.g0(new itl(new wul(lul.e, oe9.f25112a, new ue9(lsm0Var.a(R.string.save, Arrays.copyOf(new Object[i], i))), z, false, false), rk.o))), mlh0Var, mmh0Var.c);
    }

    private final Object c(Object obj) {
        String strA;
        int i;
        int i2;
        c1l0 c1l0Var = (c1l0) obj;
        c1l0Var.getClass();
        String str = c1l0Var.b;
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        List list = c1l0Var.d;
        Double d = c1l0Var.f3578a;
        boolean zIsEmpty = list.isEmpty();
        int i3 = 0;
        lsm0 lsm0Var = ctf0Var.b;
        pzu pzuVar = new pzu(lsm0Var.a(R.string.sport_cashback, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.vip_cash_back_your, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.sport_cashback_withdraw_sum_hint, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.usdt, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.sport_cashback_receive, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.rules, Arrays.copyOf(new Object[0], 0)));
        if (c1l0Var.f) {
            return new h1l0(pzuVar);
        }
        g2v g2vVar = this.c;
        int i4 = 1;
        if (zIsEmpty && !b8k0.Q(c1l0Var) && d != null) {
            double dDoubleValue = d.doubleValue();
            pn40 pn40Var = pn40.f27267a;
            return new d1l0(pzuVar, new oe(pn40.c(dDoubleValue, p3u0.d), lsm0Var.a(R.string.usdt, Arrays.copyOf(new Object[0], 0))), str, str.length() > 0, c1l0Var.c, c1l0Var.g, g2v.b(g2vVar, pb10.f, null, null, 0, 0, R.string.sport_cashback_transactions_empty, 0, R.string.make_bet, 0L, 0L, 862));
        }
        if (zIsEmpty || b8k0.Q(c1l0Var) || d == null) {
            return new g1l0(pzuVar, g2v.b(g2vVar, pb10.g, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
        }
        double dDoubleValue2 = d.doubleValue();
        pn40 pn40Var2 = pn40.f27267a;
        oe oeVar = new oe(pn40.c(dDoubleValue2, p3u0.d), lsm0Var.a(R.string.usdt, Arrays.copyOf(new Object[0], 0)));
        boolean z = str.length() > 0;
        boolean z2 = c1l0Var.c;
        lc00 lc00VarB = kotlin.collections.a.b();
        lc00VarB.add(new z0l0(lsm0Var.a(R.string.transactions_history, Arrays.copyOf(new Object[0], 0))));
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p2z p2zVar = (p2z) it.next();
            int iOrdinal = p2zVar.d.ordinal();
            if (iOrdinal == 0) {
                strA = lsm0Var.a(R.string.sport_cashback_transactions_credited, Arrays.copyOf(new Object[i3], i3));
                i = R.drawable.glyph_replenish;
                i2 = R.string.plus_usdt;
            } else {
                if (iOrdinal != i4) {
                    t9f.b();
                    return null;
                }
                strA = lsm0Var.a(R.string.sport_cashback_transactions_withdrawn, Arrays.copyOf(new Object[i3], i3));
                i = R.drawable.glyph_indeterminate;
                i2 = R.string.minus_usdt;
            }
            String str2 = strA;
            int i5 = i2;
            pn40 pn40Var3 = pn40.f27267a;
            String strA2 = lsm0Var.a(i5, Arrays.copyOf(new Object[]{pn40.c(p2zVar.c, p3u0.c)}, i4));
            rdj rdjVar = rdj.f30294a;
            arrayList.add(new y0l0(p2zVar.b, new rqm((vui0) new rui0(str2, null, rdj.f(new znq0(p2zVar.f26273a), sdj.UNIVERSAL, null, 60), null, 58), (pui0) new oui0((Integer) null, (y3d) null, new m0x(i, null, 6), (y3d) null, 27), (pvi0) new mvi0(strA2, null), (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, Response.SERVER_TIMEOUT)));
            lsm0Var = lsm0Var;
            it = it;
            i4 = 1;
            i3 = 0;
        }
        return new e1l0(pzuVar, oeVar, str, z, z2, c1l0Var.g, cs0.f(lc00VarB, lc00VarB, arrayList));
    }

    private final Object g(Object obj) {
        int size;
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        dmm dmmVar;
        gmm gmmVar;
        String string;
        boolean z4;
        lsl0 lsl0Var = (lsl0) obj;
        lsl0Var.getClass();
        mdm mdmVarB = g2v.b(this.c, pb10.e, null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990);
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        boolean z5 = lsl0Var.j;
        List list = lsl0Var.k;
        boolean z6 = lsl0Var.c;
        if (z5 || list.isEmpty()) {
            size = 0;
            z = false;
            z2 = false;
            z3 = false;
        } else {
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            int i = 0;
            for (Object obj2 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    q3d.p();
                    throw null;
                }
                msl0 msl0Var = (msl0) obj2;
                arrayList.add(new zpl0(i, msl0Var.f22327a, msl0Var.c));
                i = i2;
            }
            if (arrayList.isEmpty()) {
                z4 = false;
                break;
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z4 = false;
                    break;
                }
                if (((zpl0) it.next()).c) {
                    z4 = true;
                    break;
                }
            }
            boolean z7 = !arrayList.equals(lsl0Var.f20586a);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (((zpl0) obj3).c) {
                    arrayList2.add(obj3);
                }
            }
            size = arrayList2.size();
            ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Long.valueOf(((zpl0) it2.next()).b));
            }
            z = z4;
            z2 = z7;
            z3 = !arrayList3.equals(lsl0Var.b);
        }
        long jD = fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var));
        long jD2 = fbc.d(ctf0.b(R.attr.uikitTextPrimary, ctf0Var));
        long jD3 = fbc.d(ctf0.b(R.attr.uikitBackgroundContent, ctf0Var));
        boolean z8 = !z6;
        List<msl0> list2 = lsl0Var.l;
        ArrayList arrayList4 = new ArrayList(r3d.q(list2, 10));
        for (msl0 msl0Var2 : list2) {
            long j2 = msl0Var2.f22327a;
            boolean z9 = msl0Var2.d;
            if (j2 != 0) {
                bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                rz4.s(j2, ".svg", bzuVarD);
                string = ((StringBuilder) bzuVarD.b).toString();
            } else {
                string = "";
            }
            t1l0 t1l0Var = new t1l0(p1l0.SPORT_ICON, new y3d(jD), string, null, new y3d(jD), null, 232);
            b2l0 b2l0Var = new b2l0(msl0Var2.b, jD2);
            boolean z10 = msl0Var2.c;
            g3l0 c3l0Var = z6 == 0 ? new c3l0(jD, z10, !z9) : new d3l0(z10, !z9);
            zcl zclVar = qmk.f28987a;
            arrayList4.add(msl0.c(msl0Var2, false, false, new zrm(b2l0Var, t1l0Var, c3l0Var, (d4d) null, new l3l0(16.0f), 8), 15));
            size = size;
            z8 = z8;
            z6 = z6;
        }
        int i3 = size;
        boolean z11 = z8;
        boolean z12 = z6;
        a4x a4xVarO0 = dyb.o0(arrayList4);
        lsm0 lsm0Var = ctf0Var.b;
        Spanned spannedFromHtml = Html.fromHtml(String.format(lsm0Var.a(R.string.selector_sport_new, Arrays.copyOf(new Object[0], 0)), Arrays.copyOf(new Object[]{Integer.valueOf(i3), Integer.valueOf(lsl0Var.h)}, 2)), 0);
        spannedFromHtml.getClass();
        String string2 = spannedFromHtml.toString();
        tlm nlmVar = new nlm(new hmm(2, lsl0Var.e, lsm0Var.a(R.string.input_query_message, Arrays.copyOf(new Object[0], 0)), lsl0Var.f));
        rlm rlmVar = new rlm(lsm0Var.a(R.string.kind_sports, Arrays.copyOf(new Object[0], 0)), string2, jD, jD, fa50.f9191a);
        if (!z12) {
            nlmVar = rlmVar;
        }
        lc00 lc00VarB = kotlin.collections.a.b();
        ra50 ra50Var = ra50.f30118a;
        lc00VarB.add(new wkm(0, R.drawable.ic_glyph_clear, z, ra50Var, jD));
        if (z12) {
            j = jD;
        } else {
            j = jD;
            lc00VarB.add(new wkm(1, R.drawable.ic_glyph_search, true, ra50Var, j));
        }
        lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
        int iB = lc00VarA.b();
        if (iB != 1) {
            if (iB != 2) {
                gmmVar = fmm.f9790a;
            } else {
                dmmVar = new dmm(new va50((wkm) lc00VarA.get(0), (wkm) lc00VarA.get(1)));
            }
            imm immVar = new imm(new ilm(j), nlmVar, gmmVar, jD3, true, null);
            boolean z13 = z3;
            nul nulVar = nul.e;
            oe9 oe9Var = oe9.f25112a;
            return new nsl0(immVar, lsl0Var.i, a4xVarO0, lsl0Var.j, mdmVarB, z2, z13, z11, new mtl(dyb.g0(new itl(new wul(nulVar, oe9Var, new ue9(lsm0Var.a(R.string.reset, Arrays.copyOf(new Object[0], 0))), z13, false, true), sh00.Y), new itl(new wul(lul.e, oe9Var, new ue9(lsm0Var.a(R.string.apply_action, Arrays.copyOf(new Object[0], 0))), z2, false, true), sh00.B))));
        }
        dmmVar = new dmm(new ta50((wkm) lc00VarA.get(0)));
        gmmVar = dmmVar;
        imm immVar2 = new imm(new ilm(j), nlmVar, gmmVar, jD3, true, null);
        boolean z14 = z3;
        nul nulVar2 = nul.e;
        oe9 oe9Var2 = oe9.f25112a;
        return new nsl0(immVar2, lsl0Var.i, a4xVarO0, lsl0Var.j, mdmVarB, z2, z14, z11, new mtl(dyb.g0(new itl(new wul(nulVar2, oe9Var2, new ue9(lsm0Var.a(R.string.reset, Arrays.copyOf(new Object[0], 0))), z14, false, true), sh00.Y), new itl(new wul(lul.e, oe9Var2, new ue9(lsm0Var.a(R.string.apply_action, Arrays.copyOf(new Object[0], 0))), z2, false, true), sh00.B))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r9v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v30, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v66 */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v22 a.ogl0, still in use, count: 2, list:
          (r13v22 a.ogl0) from 0x0263: PHI (r13v23 a.ogl0) = (r13v22 a.ogl0), (r13v32 a.ogl0) binds: [B:96:0x0254, B:181:0x0522] A[DONT_GENERATE, DONT_INLINE]
          (r13v22 a.ogl0) from 0x0115: MOVE (r45v5 a.ogl0) = (r13v22 a.ogl0) (LINE:278)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object r62) {
        /*
            Method dump skipped, instruction units count: 3848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.o20.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ o20(ctf0 ctf0Var, g2v g2vVar, byte b) {
        this.f24507a = b;
        this.b = ctf0Var;
        this.c = g2vVar;
    }
}
