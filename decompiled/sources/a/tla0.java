package a;

import android.javax.sip.message.Response;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tla0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34133a;
    public final /* synthetic */ ocl b;
    public final /* synthetic */ ctf0 c;
    public final /* synthetic */ r9u d;

    public /* synthetic */ tla0(r9u r9uVar, ctf0 ctf0Var, ocl oclVar) {
        this.f34133a = (byte) 8;
        this.d = r9uVar;
        this.c = ctf0Var;
        this.b = oclVar;
    }

    /* JADX WARN: Code duplicated, block: B:202:0x05ac  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v17, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24, types: [a.hyl0] */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30, types: [a.gyl0] */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    private final Object a(Object obj) throws Throwable {
        Object ojj0Var;
        Iterator it;
        List list;
        int i;
        Object obj2;
        ?? arrayList;
        Object tzr0Var;
        ?? arrayList2;
        List<z2m0> list2;
        rss rssVar;
        Object next;
        Object objPrevious;
        x2m0 x2m0Var = (x2m0) obj;
        x2m0Var.getClass();
        ygp ygpVar = ygp.t;
        r9u r9uVar = this.d;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        boolean zD = j1q0Var.f15748a.d(ygpVar);
        ctf0 ctf0Var = this.c;
        ctf0Var.getClass();
        nc5 nc5Var = x2m0Var.f;
        pdt0 pdt0Var = x2m0Var.c;
        String str = x2m0Var.g;
        k2m0 k2m0Var = new k2m0(ydx.c0(nc5Var), x2m0Var.e);
        if (x2m0Var.f40175a) {
            return new b3m0(k2m0Var, str, zD);
        }
        boolean z = x2m0Var.b;
        ocl oclVar = this.b;
        if (z) {
            return new a3m0(k2m0Var, str, zD, ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
        }
        if (pdt0Var == null || pdt0Var.f) {
            return new a3m0(k2m0Var, str, zD, ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990));
        }
        List list3 = x2m0Var.d;
        ArrayList arrayList3 = new ArrayList(r3d.q(list3, 10));
        Iterator it2 = list3.iterator();
        int i2 = 0;
        while (true) {
            Throwable th = null;
            if (!it2.hasNext()) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : arrayList3) {
                    if (((phv) obj3).c) {
                        arrayList4.add(obj3);
                    }
                }
                List list4 = pdt0Var.c;
                Map map = pdt0Var.e;
                Map map2 = pdt0Var.d;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj4 : list4) {
                    if (!((z5d) obj4).f43810a) {
                        arrayList5.add(obj4);
                    }
                }
                ArrayList arrayList6 = new ArrayList(r3d.q(arrayList5, 10));
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    arrayList6.add(new xzr0(((z5d) it3.next()).d));
                }
                ArrayList arrayList7 = new ArrayList();
                ArrayList<y8b> arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                for (Object obj5 : list4) {
                    Throwable th2 = th;
                    if (((z5d) obj5).f43810a) {
                        arrayList9.add(obj5);
                    }
                    th = th2;
                }
                Throwable th3 = th;
                int size = arrayList9.size();
                Set setKeySet = map2.keySet();
                ArrayList arrayList10 = new ArrayList();
                for (Object obj6 : setKeySet) {
                    String str2 = str;
                    String str3 = (String) obj6;
                    boolean z2 = zD;
                    k2m0 k2m0Var2 = k2m0Var;
                    ArrayList arrayList11 = arrayList3;
                    ArrayList arrayList12 = new ArrayList(r3d.q(arrayList4, 10));
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        arrayList12.add(((phv) it4.next()).b);
                    }
                    if (arrayList12.contains(str3)) {
                        arrayList10.add(obj6);
                    }
                    str = str2;
                    zD = z2;
                    k2m0Var = k2m0Var2;
                    arrayList3 = arrayList11;
                }
                String str4 = str;
                boolean z3 = zD;
                k2m0 k2m0Var3 = k2m0Var;
                ArrayList arrayList13 = arrayList3;
                Iterator it5 = arrayList10.iterator();
                while (it5.hasNext()) {
                    String str5 = (String) it5.next();
                    List list5 = (List) map.get(str5);
                    int size2 = list5 != null ? list5.size() : 0;
                    int iD = ((size2 - 1) * ctf0Var.d(R.dimen.space_6)) + (ctf0Var.d(R.dimen.size_50) * size2) + ctf0Var.d(R.dimen.space_6) + ctf0Var.d(R.dimen.space_18);
                    String str6 = "-";
                    if (StringsKt.W(str5) || map2.size() <= 1) {
                        it = it5;
                        list = list4;
                        arrayList8.add(l5s0.f19475a);
                        int size3 = arrayList6.size();
                        ArrayList arrayList14 = new ArrayList(size3);
                        for (int i3 = 0; i3 < size3; i3++) {
                            arrayList14.add(new pzr0());
                        }
                        arrayList7.add(arrayList14);
                    } else {
                        arrayList8.add(new k5s0(str5));
                        int size4 = arrayList6.size();
                        ArrayList arrayList15 = new ArrayList(size4);
                        for (int i4 = 0; i4 < size4; i4++) {
                            arrayList15.add(new szr0());
                        }
                        arrayList7.add(arrayList15);
                        Iterator it6 = list4.iterator();
                        do {
                            if (!it6.hasNext()) {
                                next = th3;
                                break;
                            }
                            next = it6.next();
                        } while (!((z5d) next).f43810a);
                        z5d z5dVar = (z5d) next;
                        String str7 = z5dVar != null ? z5dVar.d : "-";
                        ListIterator listIterator = list4.listIterator(list4.size());
                        do {
                            if (!listIterator.hasPrevious()) {
                                objPrevious = th3;
                                break;
                            }
                            objPrevious = listIterator.previous();
                        } while (!((z5d) objPrevious).f43810a);
                        z5d z5dVar2 = (z5d) objPrevious;
                        String str8 = z5dVar2 != null ? z5dVar2.d : "-";
                        ArrayList arrayList16 = new ArrayList();
                        for (Object obj7 : list4) {
                            Iterator it7 = it5;
                            List list6 = list4;
                            if (((z5d) obj7).f43810a) {
                                arrayList16.add(obj7);
                            }
                            it5 = it7;
                            list4 = list6;
                        }
                        it = it5;
                        list = list4;
                        ArrayList arrayList17 = new ArrayList(r3d.q(arrayList16, 10));
                        Iterator it8 = arrayList16.iterator();
                        while (it8.hasNext()) {
                            arrayList17.add(((z5d) it8.next()).d);
                        }
                        arrayList8.add(new h5s0(str7, str8, CollectionsKt.b0(arrayList17, null, null, null, new vlf((byte) 8), 31)));
                        ArrayList arrayList18 = new ArrayList(r3d.q(arrayList6, 10));
                        Iterator it9 = arrayList6.iterator();
                        while (it9.hasNext()) {
                            arrayList18.add(new ozr0(((w8b) it9.next()).f38714a.f12665a));
                        }
                        arrayList7.add(arrayList18);
                    }
                    ArrayList arrayList19 = new ArrayList();
                    List list7 = (List) map2.get(str5);
                    if (list7 != null) {
                        Iterator it10 = list7.iterator();
                        while (it10.hasNext()) {
                            udt0 udt0Var = (udt0) it10.next();
                            List list8 = udt0Var.c;
                            Iterator it11 = it10;
                            ArrayList arrayList20 = new ArrayList(r3d.q(list8, 10));
                            Iterator it12 = list8.iterator();
                            while (it12.hasNext()) {
                                fyl0 fyl0Var = (fyl0) it12.next();
                                oab oabVar = fyl0Var.f10363a;
                                iyl0 iyl0Var = fyl0Var.c;
                                int i5 = dyf.f6889a[oabVar.ordinal()];
                                Iterator it13 = it12;
                                t2m0 t2m0Var = udt0Var.b;
                                if (i5 == 1) {
                                    int iB = fxb.B(t2m0Var);
                                    ?? r7 = iyl0Var instanceof gyl0 ? (gyl0) iyl0Var : th3;
                                    if (r7 == 0 || (list2 = r7.f12136a) == null) {
                                        arrayList2 = th3;
                                    } else {
                                        arrayList2 = new ArrayList(r3d.q(list2, 10));
                                        for (z2m0 z2m0Var : list2) {
                                            z2m0Var.getClass();
                                            int iOrdinal = z2m0Var.ordinal();
                                            if (iOrdinal == 0) {
                                                rssVar = rss.c;
                                            } else if (iOrdinal == 1) {
                                                rssVar = rss.c;
                                            } else if (iOrdinal == 2) {
                                                rssVar = rss.d;
                                            } else if (iOrdinal == 3) {
                                                rssVar = rss.e;
                                            } else {
                                                if (iOrdinal != 4) {
                                                    t9f.b();
                                                    return th3;
                                                }
                                                rssVar = rss.f;
                                            }
                                            arrayList2.add(rssVar);
                                        }
                                    }
                                    if (arrayList2 == 0) {
                                        arrayList2 = iun.f15405a;
                                    }
                                    tzr0Var = new rzr0(iB, arrayList2, q3d.j(new g9b(ctf0Var.d(R.dimen.space_8)), new f9b(ctf0Var.d(R.dimen.space_48)), new g9b(ctf0Var.d(R.dimen.space_8)), new g9b(ctf0Var.d(R.dimen.space_4))));
                                } else {
                                    str6 = str6;
                                    udt0Var = udt0Var;
                                    int iB2 = fxb.B(t2m0Var);
                                    ?? r8 = iyl0Var instanceof hyl0 ? (hyl0) iyl0Var : th3;
                                    tzr0Var = new tzr0(r8 != 0 ? r8.f13864a : str6, iB2);
                                }
                                arrayList20.add(tzr0Var);
                                it12 = it13;
                                str6 = str6;
                                udt0Var = udt0Var;
                            }
                            arrayList19.add(CollectionsKt.O(arrayList20, size));
                            it10 = it11;
                        }
                    }
                    arrayList7.addAll(arrayList19);
                    List list9 = (List) map2.get(str5);
                    if (list9 != null) {
                        ArrayList arrayList21 = new ArrayList(r3d.q(list9, 10));
                        Iterator it14 = list9.iterator();
                        int i6 = 0;
                        while (it14.hasNext()) {
                            Object next2 = it14.next();
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                q3d.p();
                                throw th3;
                            }
                            udt0 udt0Var2 = (udt0) next2;
                            t2m0 t2m0Var2 = udt0Var2.b;
                            ufp0 ufp0Var = udt0Var2.f35496a;
                            arrayList21.add(new i5s0(ufp0Var.b, fxb.B(t2m0Var2), ufp0Var.d, ufp0Var.f35586a, String.valueOf(i7), ufp0Var.c, q3d.j(new h9b(String.valueOf(i7)), new h9b(ufp0Var.b), new g9b(ctf0Var.d(R.dimen.space_8)), new f9b(ctf0Var.d(R.dimen.space_16))), ctf0Var.d(R.dimen.size_144), ctf0Var.d(R.dimen.size_68)));
                            i6 = i7;
                            it14 = it14;
                            size = size;
                        }
                        i = size;
                        obj2 = arrayList21;
                    } else {
                        i = size;
                        obj2 = iun.f15405a;
                    }
                    arrayList8.addAll(obj2);
                    List<jtq> list10 = (List) map.get(str5);
                    if (list10 != null) {
                        arrayList = new ArrayList(r3d.q(list10, 10));
                        for (jtq jtqVar : list10) {
                            arrayList.add(new utq(jtqVar.b, fxb.B(jtqVar.f17112a)));
                        }
                    } else {
                        arrayList = iun.f15405a;
                    }
                    arrayList8.add(new j5s0(iD, arrayList));
                    int size5 = arrayList6.size();
                    ArrayList arrayList22 = new ArrayList(size5);
                    for (int i8 = 0; i8 < size5; i8++) {
                        arrayList22.add(new qzr0(iD));
                    }
                    arrayList7.add(arrayList22);
                    it5 = it;
                    list4 = list;
                    size = i;
                }
                ArrayList arrayList23 = new ArrayList(r3d.q(arrayList8, 10));
                for (y8b y8bVar : arrayList8) {
                    if (y8bVar == null) {
                        ojj0Var = new ojj0();
                    } else if (y8bVar instanceof k5s0) {
                        ojj0Var = new qjj0(((k5s0) y8bVar).f17736a);
                    } else if (y8bVar instanceof j5s0) {
                        j5s0 j5s0Var = (j5s0) y8bVar;
                        ojj0Var = new pjj0(j5s0Var.b, j5s0Var.f15948a);
                    } else if (y8bVar instanceof l5s0) {
                        ojj0Var = new rjj0();
                    } else {
                        ojj0Var = new ojj0();
                    }
                    arrayList23.add(ojj0Var);
                }
                return new c3m0(k2m0Var3, str4, z3, new fiv(arrayList7, arrayList8, arrayList6, arrayList23), arrayList13);
            }
            Object next3 = it2.next();
            int i9 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            tyl0 tyl0Var = (tyl0) next3;
            tyl0Var.getClass();
            arrayList3.add(new phv(tyl0Var.f34761a, i2, tyl0Var.b));
            i2 = i9;
        }
    }

    private final Object b(Object obj) {
        c6p0 c6p0Var;
        c6p0 c6p0Var2;
        c6p0 c6p0Var3;
        long jM121getTransparent0d7_KjU;
        z5p0 z5p0Var = (z5p0) obj;
        z5p0Var.getClass();
        ygp ygpVar = ygp.t;
        r9u r9uVar = this.d;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        boolean zD = j1q0Var.f15748a.d(ygpVar);
        ctf0 ctf0Var = this.c;
        ctf0Var.getClass();
        u5p0 u5p0Var = new u5p0(ydx.c0(z5p0Var.c), z5p0Var.b);
        boolean z = z5p0Var.e;
        ocl oclVar = this.b;
        if (z) {
            return new e6p0(u5p0Var, zD, ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
        }
        if (z5p0Var.f) {
            return new e6p0(u5p0Var, zD, ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990));
        }
        if (z5p0Var.d) {
            return new f6p0(u5p0Var, zD);
        }
        cpp0 cpp0Var = z5p0Var.h;
        if (cpp0Var == null) {
            return new e6p0(u5p0Var, zD, ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990));
        }
        m5p0 m5p0Var = cpp0Var.f4760a;
        List<juq> list = cpp0Var.c;
        iwb iwbVar = cpp0Var.b.b;
        iwb iwbVar2 = m5p0Var.b;
        List list2 = iwbVar2.c;
        List list3 = iwbVar2.f15480a;
        b6p0 b6p0Var = null;
        if (list3.isEmpty() && iwbVar.f15480a.isEmpty()) {
            c6p0Var = null;
        } else {
            String strA = ctf0Var.b.a(R.string.staticstic_strengths, Arrays.copyOf(new Object[0], 0));
            ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(k7n0.D((vvb) it.next()));
            }
            a4x a4xVarO0 = dyb.o0(arrayList);
            List list4 = iwbVar.f15480a;
            ArrayList arrayList2 = new ArrayList(r3d.q(list4, 10));
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(k7n0.D((vvb) it2.next()));
            }
            c6p0Var = new c6p0(strA, a4xVarO0, dyb.o0(arrayList2));
        }
        List list5 = iwbVar2.b;
        if (list2.isEmpty() && iwbVar.c.isEmpty()) {
            c6p0Var2 = null;
        } else {
            String strA2 = ctf0Var.b.a(R.string.statistic_weaknesses, Arrays.copyOf(new Object[0], 0));
            ArrayList arrayList3 = new ArrayList(r3d.q(list2, 10));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(k7n0.D((vvb) it3.next()));
            }
            a4x a4xVarO1 = dyb.o0(arrayList3);
            List list6 = iwbVar.c;
            ArrayList arrayList4 = new ArrayList(r3d.q(list6, 10));
            Iterator it4 = list6.iterator();
            while (it4.hasNext()) {
                arrayList4.add(k7n0.D((vvb) it4.next()));
            }
            c6p0Var2 = new c6p0(strA2, a4xVarO1, dyb.o0(arrayList4));
        }
        if (list5.isEmpty() && iwbVar.b.isEmpty()) {
            c6p0Var3 = null;
        } else {
            String strA3 = ctf0Var.b.a(R.string.statistic_style, Arrays.copyOf(new Object[0], 0));
            ArrayList arrayList5 = new ArrayList(r3d.q(list5, 10));
            Iterator it5 = list5.iterator();
            while (it5.hasNext()) {
                arrayList5.add(k7n0.D((vvb) it5.next()));
            }
            a4x a4xVarO2 = dyb.o0(arrayList5);
            List list7 = iwbVar.b;
            ArrayList arrayList6 = new ArrayList(r3d.q(list7, 10));
            Iterator it6 = list7.iterator();
            while (it6.hasNext()) {
                arrayList6.add(k7n0.D((vvb) it6.next()));
            }
            c6p0Var3 = new c6p0(strA3, a4xVarO2, dyb.o0(arrayList6));
        }
        if (!list.isEmpty()) {
            String strA4 = ctf0Var.b.a(R.string.statistic_forecast, Arrays.copyOf(new Object[0], 0));
            ArrayList arrayList7 = new ArrayList(r3d.q(list, 10));
            for (juq juqVar : list) {
                juqVar.getClass();
                dwb dwbVar = juqVar.b;
                if (dwbVar instanceof fuq) {
                    pz40 pz40Var = s6t0.f31722a;
                    jM121getTransparent0d7_KjU = StaticColors.INSTANCE.m111getPurple0d7_KjU();
                } else if (dwbVar instanceof iuq) {
                    pz40 pz40Var2 = s6t0.f31722a;
                    jM121getTransparent0d7_KjU = StaticColors.INSTANCE.m98getGreen0d7_KjU();
                } else if (dwbVar instanceof guq) {
                    pz40 pz40Var3 = s6t0.f31722a;
                    jM121getTransparent0d7_KjU = StaticColors.INSTANCE.m119getTeal0d7_KjU();
                } else {
                    if (!dwbVar.equals(huq.b)) {
                        t9f.b();
                        return null;
                    }
                    pz40 pz40Var4 = s6t0.f31722a;
                    jM121getTransparent0d7_KjU = StaticColors.INSTANCE.m121getTransparent0d7_KjU();
                }
                arrayList7.add(new q5p0(jM121getTransparent0d7_KjU, null, juqVar.f17169a, dwbVar.f6789a));
            }
            b6p0Var = new b6p0(dyb.o0(arrayList7), strA4);
        }
        ArrayList arrayList8 = new ArrayList();
        if (c6p0Var != null) {
            arrayList8.add(c6p0Var);
        }
        if (c6p0Var2 != null) {
            arrayList8.add(c6p0Var2);
        }
        if (c6p0Var3 != null) {
            arrayList8.add(c6p0Var3);
        }
        if (b6p0Var != null) {
            arrayList8.add(b6p0Var);
        }
        return new g6p0(u5p0Var, zD, dyb.o0(arrayList8));
    }

    private final Object c(Object obj) {
        ctp0 ctp0Var;
        gsp0 gsp0Var = (gsp0) obj;
        gsp0Var.getClass();
        ygp ygpVar = ygp.t;
        r9u r9uVar = this.d;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        boolean zD = j1q0Var.f15748a.d(ygpVar);
        ctf0 ctf0Var = this.c;
        ctf0Var.getClass();
        nc5 nc5Var = gsp0Var.c;
        List<esp0> list = gsp0Var.d;
        csp0 csp0Var = new csp0(ydx.c0(nc5Var), aem0.x(gsp0Var.b, gsp0Var.f11841a, ctf0Var));
        boolean z = gsp0Var.f;
        ocl oclVar = this.b;
        if (z) {
            return new gtp0(csp0Var, ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), zD);
        }
        if (gsp0Var.g) {
            return new gtp0(csp0Var, ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990), zD);
        }
        if (gsp0Var.e) {
            return new htp0(csp0Var, zD);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
        for (esp0 esp0Var : list) {
            arrayList.add(new yvh0(esp0Var.b, bwh0.f3325a));
            List<dsp0> list2 = esp0Var.f;
            ArrayList arrayList3 = new ArrayList(r3d.q(list2, 10));
            for (dsp0 dsp0Var : list2) {
                String str = dsp0Var.b;
                int i = dsp0Var.f6623a;
                if (i != 55) {
                    switch (i) {
                        case 17:
                            ctp0Var = xsp0.c;
                            break;
                        case 18:
                            ctp0Var = hsp0.c;
                            break;
                        case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                            ctp0Var = qsp0.c;
                            break;
                        case 20:
                            ctp0Var = osp0.c;
                            break;
                        case 21:
                            ctp0Var = nsp0.c;
                            break;
                        case 22:
                            ctp0Var = usp0.c;
                            break;
                        default:
                            ctp0Var = zsp0.c;
                            break;
                    }
                } else {
                    ctp0Var = tsp0.c;
                }
                arrayList3.add(new etp0(str, ctp0Var));
            }
            arrayList2.add(dyb.o0(arrayList3));
        }
        return new ftp0(csp0Var, dyb.o0(arrayList), dyb.o0(arrayList2), list.size(), ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990), zD);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Iterable, java.util.List] */
    private final Object g(Object obj) {
        ?? arrayList;
        s3q0 s3q0Var = (s3q0) obj;
        s3q0Var.getClass();
        ygp ygpVar = ygp.t;
        r9u r9uVar = this.d;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        boolean zD = j1q0Var.f15748a.d(ygpVar);
        ctf0 ctf0Var = this.c;
        ctf0Var.getClass();
        nc5 nc5Var = s3q0Var.g;
        List<l3q0> list = s3q0Var.e;
        k3q0 k3q0Var = new k3q0(ydx.c0(nc5Var), s3q0Var.f);
        if (s3q0Var.b) {
            return new u3q0(k3q0Var, zD);
        }
        boolean z = s3q0Var.c;
        ocl oclVar = this.b;
        if (z) {
            return new t3q0(k3q0Var, zD, ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
        }
        if (list != null && list.isEmpty()) {
            return new t3q0(k3q0Var, zD, ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990));
        }
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (l3q0 l3q0Var : list) {
                l3q0Var.getClass();
                String str = l3q0Var.f19371a;
                String str2 = l3q0Var.b;
                int i = l3q0Var.c;
                String strQ = l3q0Var.d;
                if (!StringsKt.W(strQ)) {
                    strQ = w6x.q(ujn.h, "/genfiles/statistics/football/", strQ);
                }
                arrayList.add(new m39(i, str, str2, strQ, l3q0Var.e));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        ?? r9 = arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : r9) {
            if (((m39) obj2).e) {
                arrayList2.add(obj2);
            }
        }
        int i2 = s3q0Var.d;
        lc00 lc00VarB = kotlin.collections.a.b();
        lsm0 lsm0Var = ctf0Var.b;
        lc00VarB.add(lsm0Var.a(R.string.all_events, Arrays.copyOf(new Object[0], 0)));
        if (!arrayList2.isEmpty()) {
            lc00VarB.add(lsm0Var.a(R.string.statistic_text_broadcast_only_important, Arrays.copyOf(new Object[0], 0)));
        }
        return new v3q0(k3q0Var, zD, i2, dyb.o0(kotlin.collections.a.a(lc00VarB)), r9, arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x016b  */
    /* JADX WARN: Code duplicated, block: B:44:0x024e  */
    private final Object h(Object obj) {
        nar0 nar0Var;
        nar0 nar0Var2;
        tbr0 tbr0Var = (tbr0) obj;
        tbr0Var.getClass();
        ygp ygpVar = ygp.t;
        r9u r9uVar = this.d;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        boolean zD = j1q0Var.f15748a.d(ygpVar);
        ctf0 ctf0Var = this.c;
        ctf0Var.getClass();
        nc5 nc5Var = tbr0Var.c;
        jjy jjyVar = tbr0Var.g;
        rbr0 rbr0Var = new rbr0(ydx.c0(nc5Var), aem0.x(tbr0Var.b, tbr0Var.f33680a, ctf0Var));
        boolean z = tbr0Var.e;
        ocl oclVar = this.b;
        if (z) {
            return new vbr0(rbr0Var, zD, ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
        }
        if (tbr0Var.d) {
            return new wbr0(rbr0Var, zD);
        }
        if (jjyVar != null) {
            ArrayList arrayList = jjyVar.d;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!((fjy) it.next()).b.isEmpty()) {
                        ajy ajyVar = ajy.RAIDER;
                        wiy wiyVarO = yqm0.o(jjyVar, 0, ajyVar);
                        wiy wiyVarO2 = yqm0.o(jjyVar, 1, ajyVar);
                        b9a0 b9a0VarN = yqm0.n(jjyVar, 0, ajyVar);
                        b9a0 b9a0VarN2 = yqm0.n(jjyVar, 1, ajyVar);
                        boolean z2 = yqm0.q(b9a0VarN).length() > 0 && yqm0.q(b9a0VarN2).length() > 0;
                        if (wiyVarO != null) {
                            bjy bjyVar = wiyVarO.d;
                            if (wiyVarO2 != null) {
                                bjy bjyVar2 = wiyVarO2.d;
                                if (z2) {
                                    long j = bjyVar.f2726a;
                                    long j2 = bjyVar.b;
                                    float f = j;
                                    long j3 = bjyVar2.f2726a;
                                    long j4 = bjyVar2.b;
                                    float f2 = j3;
                                    float f3 = f + f2;
                                    float f4 = j2;
                                    float f5 = j4;
                                    float f6 = f4 + f5;
                                    lsm0 lsm0Var = ctf0Var.b;
                                    String strA = lsm0Var.a(R.string.statistic_kabaddi_top_raider_title, Arrays.copyOf(new Object[0], 0));
                                    String strQ = yqm0.q(b9a0VarN);
                                    d4d d4dVar = d4d.SECONDARY60;
                                    w6n w6nVar = w6n.h;
                                    nar0Var = new nar0(strA, strQ, new u6n(d4dVar, w6nVar, new c280(yqm0.p(b9a0VarN), R.drawable.ic_glyph_placeholder_player)), yqm0.q(b9a0VarN2), new u6n(d4dVar, w6nVar, new c280(yqm0.p(b9a0VarN2), R.drawable.ic_glyph_placeholder_player)), new s6x(f / f3, f2 / f3, lsm0Var.a(R.string.statistic_kabaddi_raid_attempts, Arrays.copyOf(new Object[0], 0)), String.valueOf(j), String.valueOf(j3)), new s6x(f4 / f6, f5 / f6, lsm0Var.a(R.string.statistic_kabaddi_raid_points, Arrays.copyOf(new Object[0], 0)), String.valueOf(j2), String.valueOf(j4)));
                                } else {
                                    nar0Var = null;
                                }
                            } else {
                                nar0Var = null;
                            }
                        } else {
                            nar0Var = null;
                        }
                        ajy ajyVar2 = ajy.TACKLER;
                        wiy wiyVarO3 = yqm0.o(jjyVar, 0, ajyVar2);
                        wiy wiyVarO4 = yqm0.o(jjyVar, 1, ajyVar2);
                        b9a0 b9a0VarN3 = yqm0.n(jjyVar, 0, ajyVar2);
                        b9a0 b9a0VarN4 = yqm0.n(jjyVar, 1, ajyVar2);
                        boolean z3 = yqm0.q(b9a0VarN3).length() > 0 && yqm0.q(b9a0VarN4).length() > 0;
                        if (wiyVarO3 != null) {
                            bjy bjyVar3 = wiyVarO3.d;
                            if (wiyVarO4 != null) {
                                bjy bjyVar4 = wiyVarO4.d;
                                if (z3) {
                                    long j5 = bjyVar3.c;
                                    long j6 = bjyVar3.d;
                                    float f7 = j5;
                                    long j7 = bjyVar4.c;
                                    long j8 = bjyVar4.d;
                                    float f8 = j7;
                                    float f9 = f7 + f8;
                                    float f10 = j6;
                                    float f11 = j8;
                                    float f12 = f10 + f11;
                                    lsm0 lsm0Var2 = ctf0Var.b;
                                    String strA2 = lsm0Var2.a(R.string.statistic_kabaddi_top_tackler_title, Arrays.copyOf(new Object[0], 0));
                                    String strQ2 = yqm0.q(b9a0VarN3);
                                    d4d d4dVar2 = d4d.SECONDARY60;
                                    w6n w6nVar2 = w6n.h;
                                    nar0Var2 = new nar0(strA2, strQ2, new u6n(d4dVar2, w6nVar2, new c280(yqm0.p(b9a0VarN3), R.drawable.ic_glyph_placeholder_player)), yqm0.q(b9a0VarN4), new u6n(d4dVar2, w6nVar2, new c280(yqm0.p(b9a0VarN4), R.drawable.ic_glyph_placeholder_player)), new s6x(f7 / f9, f8 / f9, lsm0Var2.a(R.string.statistic_kabaddi_tackle_attempts, Arrays.copyOf(new Object[0], 0)), String.valueOf(j5), String.valueOf(j7)), new s6x(f10 / f12, f11 / f12, lsm0Var2.a(R.string.statistic_kabaddi_tackle_points, Arrays.copyOf(new Object[0], 0)), String.valueOf(j6), String.valueOf(j8)));
                                } else {
                                    nar0Var2 = null;
                                }
                            } else {
                                nar0Var2 = null;
                            }
                        } else {
                            nar0Var2 = null;
                        }
                        return (nar0Var == null && nar0Var2 == null) ? new vbr0(rbr0Var, zD, ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990)) : new ubr0(rbr0Var, zD, nar0Var, nar0Var2);
                    }
                }
            }
        }
        return new vbr0(rbr0Var, zD, ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990));
    }

    /* JADX WARN: Code duplicated, block: B:112:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:171:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:181:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:183:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:185:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:186:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:187:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:190:0x0612  */
    /* JADX WARN: Code duplicated, block: B:328:0x0a52  */
    /* JADX WARN: Code duplicated, block: B:330:0x0a57  */
    /* JADX WARN: Code duplicated, block: B:333:0x0a6c A[LOOP:19: B:331:0x0a66->B:333:0x0a6c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:335:0x0a95  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r19v8 java.lang.Object, still in use, count: 2, list:
          (r19v8 java.lang.Object) from 0x0884: PHI (r19 I:??) = (r19v5 java.lang.Object), (r19v8 java.lang.Object) binds: [B:251:0x0882, B:476:0x0884] A[DONT_GENERATE, DONT_INLINE]
          (r19v8 java.lang.Object) from 0x0877: CHECK_CAST (a.k5i0) (r19v8 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object r51) {
        /*
            Method dump skipped, instruction units count: 3808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.tla0.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ tla0(ocl oclVar, ctf0 ctf0Var, r9u r9uVar, byte b) {
        this.f34133a = b;
        this.b = oclVar;
        this.c = ctf0Var;
        this.d = r9uVar;
    }

    public /* synthetic */ tla0(ctf0 ctf0Var, ocl oclVar, r9u r9uVar, byte b) {
        this.f34133a = b;
        this.c = ctf0Var;
        this.b = oclVar;
        this.d = r9uVar;
    }

    public /* synthetic */ tla0(ctf0 ctf0Var, r9u r9uVar, ocl oclVar) {
        this.f34133a = (byte) 3;
        this.c = ctf0Var;
        this.d = r9uVar;
        this.b = oclVar;
    }
}
