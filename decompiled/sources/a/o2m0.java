package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o2m0 extends bnn0 implements Function2 {
    public boolean i;
    public byte j;
    public final /* synthetic */ r2m0 k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ jvn m;
    public final /* synthetic */ Integer n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Long p;
    public final /* synthetic */ List q;
    public final /* synthetic */ List r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ boolean u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2m0(r2m0 r2m0Var, boolean z, jvn jvnVar, Integer num, int i, Long l, List list, List list2, boolean z2, boolean z3, boolean z4, yje yjeVar) {
        super(2, yjeVar);
        this.k = r2m0Var;
        this.l = z;
        this.m = jvnVar;
        this.n = num;
        this.o = i;
        this.p = l;
        this.q = list;
        this.r = list2;
        this.s = z2;
        this.t = z3;
        this.u = z4;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new o2m0(this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o2m0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:139:0x02f4 A[EDGE_INSN: B:139:0x02f4->B:169:0x035c BREAK  A[LOOP:8: B:141:0x02fc->B:168:0x0359]] */
    /* JADX WARN: Code duplicated, block: B:140:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:143:0x0302  */
    /* JADX WARN: Code duplicated, block: B:145:0x030a  */
    /* JADX WARN: Code duplicated, block: B:148:0x0316  */
    /* JADX WARN: Code duplicated, block: B:156:0x0330  */
    /* JADX WARN: Code duplicated, block: B:162:0x0341  */
    /* JADX WARN: Code duplicated, block: B:164:0x0345  */
    /* JADX WARN: Code duplicated, block: B:165:0x034b  */
    /* JADX WARN: Code duplicated, block: B:168:0x0359 A[LOOP:8: B:141:0x02fc->B:168:0x0359, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:210:0x040e  */
    /* JADX WARN: Code duplicated, block: B:213:0x041d  */
    /* JADX WARN: Code duplicated, block: B:215:0x0425  */
    /* JADX WARN: Code duplicated, block: B:218:0x0431  */
    /* JADX WARN: Code duplicated, block: B:223:0x0449  */
    /* JADX WARN: Code duplicated, block: B:228:0x0455  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:292:0x0579  */
    /* JADX WARN: Code duplicated, block: B:296:0x058a  */
    /* JADX WARN: Code duplicated, block: B:299:0x059f A[LOOP:7: B:297:0x0599->B:299:0x059f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:300:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:302:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:309:0x02c4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:315:0x05c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:320:0x057c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x0443 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x035c A[EDGE_INSN: B:337:0x035c->B:169:0x035c BREAK  A[LOOP:8: B:141:0x02fc->B:168:0x0359], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x032b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:39:0x0109  */
    /* JADX WARN: Code duplicated, block: B:41:0x0137  */
    /* JADX WARN: Code duplicated, block: B:85:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:87:0x0202  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19, types: [a.f280] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16, types: [a.f280] */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [a.f280] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [a.f280] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [a.f280] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v24, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v28, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43, types: [a.f280] */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v7, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27, types: [a.dfb] */
    /* JADX WARN: Type inference failed for: r9v28, types: [a.dfb] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objA2;
        boolean z;
        Long l;
        Pair pair;
        dqk0 dqk0Var;
        Iterable iterable;
        ArrayList arrayList;
        Iterator it;
        Integer num;
        List list;
        Long l2;
        List<mhv> list2;
        boolean z2;
        String str;
        mhv mhvVar;
        List list3;
        ?? arrayList2;
        Iterator it2;
        Object obj2;
        Object next;
        mhv mhvVar2;
        List list4;
        ?? r0;
        Double d;
        Object next2;
        ifb efbVar;
        Iterable iterable2;
        Long l3;
        boolean z3;
        ffb ffbVar;
        boolean z4;
        mhv mhvVar3;
        List<g380> list5;
        ?? arrayList3;
        ?? r12;
        Object next3;
        mhv mhvVar4;
        List list6;
        Iterator it3;
        g380 g380Var;
        ?? r10;
        zgo zgoVar;
        double dDoubleValue;
        double d2;
        Double d3;
        Iterator it4;
        Object next4;
        Integer num2;
        boolean z5;
        efb efbVar2;
        ArrayList arrayList4;
        ?? arrayList5;
        Iterator it5;
        ?? r9;
        List list7;
        Iterable iterable3;
        efb efbVar3;
        Long l4;
        boolean z6;
        Object dfbVar;
        ?? r2;
        boolean z7;
        Double d4;
        Object next5;
        Iterator it6;
        ?? r13;
        Object next6;
        Iterator it7;
        Object next7;
        o2m0 o2m0Var = this;
        wne wneVar = wne.f39444a;
        byte b = o2m0Var.j;
        boolean z8 = o2m0Var.l;
        String str2 = null;
        r2m0 r2m0Var = o2m0Var.k;
        int i = 1;
        if (b == 0) {
            z1x.P(obj);
            rzf rzfVar = r2m0Var.e;
            o2m0Var.j = (byte) 1;
            objA = rzfVar.a(z8, o2m0Var);
            if (objA != wneVar) {
            }
            return wneVar;
        }
        if (b == 1) {
            z1x.P(obj);
            objA = obj;
        } else {
            if (b != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = o2m0Var.i;
            z1x.P(obj);
            objA2 = obj;
        }
        List list8 = (List) ((dx5) objA2).a();
        if (z) {
            iterable = iun.f15405a;
        } else {
            pair = (Pair) ((p7m0) r2m0Var.c.f21068a.b).getValue();
            if (pair != null) {
                dqk0Var = (dqk0) pair.b;
            } else {
                dqk0Var = null;
            }
            if (dqk0Var instanceof cqk0) {
                iterable = (List) ((cqk0) dqk0Var).f4798a;
            } else {
                iterable = iun.f15405a;
            }
        }
        arrayList = new ArrayList(r3d.q(list8, 10));
        it = list8.iterator();
        while (it.hasNext()) {
            lfb lfbVar = (lfb) it.next();
            lfbVar.getClass();
            iterable.getClass();
            List list9 = o2m0Var.q;
            list9.getClass();
            List list10 = o2m0Var.r;
            list10.getClass();
            num = lfbVar.f19945a;
            list = lfbVar.d;
            l2 = lfbVar.b;
            list2 = lfbVar.c;
            z2 = o2m0Var.s;
            boolean z9 = o2m0Var.t;
            str = str2;
            boolean z10 = o2m0Var.u;
            int i2 = 0;
            z4 = false;
            z4 = false;
            z4 = false;
            z4 = false;
            i2 = 0;
            if (num != null && num.intValue() == i) {
                gfb gfbVar = (gfb) CollectionsKt.firstOrNull(kotlin.collections.b.D(iterable, gfb.class));
                if (list2 == null && (mhvVar2 = (mhv) CollectionsKt.firstOrNull(list2)) != null && (list4 = mhvVar2.b) != null) {
                    if (!list4.isEmpty()) {
                        Iterator it8 = list4.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                it = it;
                                list2 = list2;
                                i2 = 1;
                                break;
                            }
                            g380 g380Var2 = (g380) it8.next();
                            if (gfbVar != null) {
                                Iterator it9 = gfbVar.f11200a.iterator();
                                while (true) {
                                    if (!it9.hasNext()) {
                                        it = it;
                                        next2 = str;
                                        break;
                                    }
                                    next2 = it9.next();
                                    int i3 = ((f280) next2).f8801a;
                                    it = it;
                                    Integer num3 = g380Var2.f10600a;
                                    if (num3 != null && i3 == num3.intValue()) {
                                        break;
                                    }
                                    it = it;
                                }
                                r0 = (f280) next2;
                            } else {
                                it = it;
                                r0 = str;
                            }
                            yk5 yk5Var = izc.f15629a;
                            zgo zgoVar2 = g380Var2.d;
                            double dDoubleValue2 = (zgoVar2 == null || (d = zgoVar2.f) == null) ? 0.0d : d.doubleValue();
                            double d5 = r0 != 0 ? r0.d.e : 0.0d;
                            yk5Var.getClass();
                            if (yk5.b(dDoubleValue2, d5) != izc.c) {
                                break;
                            }
                            list2 = list2;
                            it8 = it8;
                            it = it;
                        }
                    } else {
                        i2 = i;
                    }
                    if (list2 != null || (mhvVar = (mhv) CollectionsKt.firstOrNull(list2)) == null || (list3 = mhvVar.b) == null) {
                        jf4.k(str);
                        return str;
                    }
                    ArrayList arrayList6 = new ArrayList(r3d.q(list3, 10));
                    Iterator it10 = list3.iterator();
                    while (it10.hasNext()) {
                        g380 g380Var3 = (g380) it10.next();
                        if (gfbVar != null) {
                            Iterator it11 = gfbVar.f11200a.iterator();
                            while (true) {
                                if (!it11.hasNext()) {
                                    it2 = it10;
                                    next = str;
                                    break;
                                }
                                next = it11.next();
                                int i4 = ((f280) next).f8801a;
                                it2 = it10;
                                Integer num4 = g380Var3.f10600a;
                                if (num4 != null && i4 == num4.intValue()) {
                                    break;
                                }
                                it10 = it2;
                            }
                            obj2 = (f280) next;
                        } else {
                            it2 = it10;
                            obj2 = str;
                        }
                        boolean z11 = z2;
                        boolean z12 = z9;
                        ?? r15 = i2;
                        arrayList6.add(x9x.Y(g380Var3, l2 != null ? l2.longValue() : 0L, obj2, list9, list10, r15, z11, z12, z10));
                        list = list;
                        l2 = l2;
                        z2 = z11;
                        i2 = r15 == true ? 1 : 0;
                        z9 = z12;
                        z10 = z10;
                        it10 = it2;
                    }
                    List list11 = list;
                    if (list11 != null) {
                        arrayList2 = new ArrayList(r3d.q(list11, 10));
                        Iterator it12 = list11.iterator();
                        while (it12.hasNext()) {
                            arrayList2.add(bkb.q0((aqs) it12.next()));
                        }
                    } else {
                        arrayList2 = str;
                    }
                    if (arrayList2 == 0) {
                        arrayList2 = iun.f15405a;
                    }
                    efbVar = new gfb(arrayList6, arrayList2);
                }
                if (list2 != null) {
                }
                jf4.k(str);
                return str;
            }
            it = it;
            l3 = l2;
            z3 = z2;
            if (num != null && num.intValue() == 2) {
                ffbVar = (ffb) CollectionsKt.firstOrNull(kotlin.collections.b.D(iterable, ffb.class));
                if (list2 != null && (mhvVar4 = (mhv) CollectionsKt.firstOrNull(list2)) != null && (list6 = mhvVar4.b) != null) {
                    if (list6.isEmpty()) {
                        z4 = true;
                        break;
                    }
                    it3 = list6.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            z4 = true;
                            break;
                        }
                        g380Var = (g380) it3.next();
                        if (ffbVar != null) {
                            it4 = ffbVar.f9441a.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    next4 = str;
                                    break;
                                }
                                next4 = it4.next();
                                int i5 = ((f280) next4).f8801a;
                                num2 = g380Var.f10600a;
                                if (num2 != null && i5 == num2.intValue()) {
                                    break;
                                }
                            }
                            r10 = (f280) next4;
                        } else {
                            r10 = str;
                        }
                        yk5 yk5Var2 = izc.f15629a;
                        zgoVar = g380Var.d;
                        if (zgoVar != null || (d3 = zgoVar.f) == null) {
                            dDoubleValue = 0.0d;
                        } else {
                            dDoubleValue = d3.doubleValue();
                        }
                        if (r10 != 0) {
                            d2 = r10.d.e;
                        } else {
                            d2 = 0.0d;
                        }
                        yk5Var2.getClass();
                        if (yk5.b(dDoubleValue, d2) == izc.c) {
                            break;
                        }
                        it3 = it3;
                    }
                }
                boolean z13 = z4;
                if (list2 != null || (mhvVar3 = (mhv) CollectionsKt.firstOrNull(list2)) == null || (list5 = mhvVar3.b) == null) {
                    jf4.k(str);
                    return str;
                }
                ArrayList arrayList7 = new ArrayList(r3d.q(list5, 10));
                for (g380 g380Var4 : list5) {
                    if (ffbVar != null) {
                        Iterator it13 = ffbVar.f9441a.iterator();
                        while (true) {
                            if (!it13.hasNext()) {
                                next3 = str;
                                break;
                            }
                            next3 = it13.next();
                            int i6 = ((f280) next3).f8801a;
                            Integer num5 = g380Var4.f10600a;
                            if (num5 != null && i6 == num5.intValue()) {
                                break;
                            }
                        }
                        r12 = (f280) next3;
                    } else {
                        r12 = str;
                    }
                    boolean z14 = z3;
                    arrayList7.add(x9x.Y(g380Var4, l3 != null ? l3.longValue() : 0L, r12, list9, list10, z13, z14, z9, z10));
                    z3 = z14;
                }
                if (list != null) {
                    arrayList3 = new ArrayList(r3d.q(list, 10));
                    Iterator it14 = list.iterator();
                    while (it14.hasNext()) {
                        arrayList3.add(bkb.q0((aqs) it14.next()));
                    }
                } else {
                    arrayList3 = str;
                }
                if (arrayList3 == 0) {
                    arrayList3 = iun.f15405a;
                }
                efbVar = new ffb(arrayList7, arrayList3);
            } else {
                z5 = z3;
                efbVar2 = (efb) CollectionsKt.firstOrNull(kotlin.collections.b.D(iterable, efb.class));
                if (list2 != null) {
                    jf4.k(str);
                    return str;
                }
                arrayList4 = new ArrayList();
                for (mhv mhvVar5 : list2) {
                    if (efbVar2 != null) {
                        it7 = efbVar2.f7714a.iterator();
                        do {
                            if (it7.hasNext()) {
                                next7 = str;
                                break;
                            }
                            next7 = it7.next();
                        } while (!Intrinsics.d(mhvVar5.f21816a, ((dfb) next7).f5992a));
                        r9 = (dfb) next7;
                    } else {
                        r9 = str;
                    }
                    list7 = mhvVar5.b;
                    if (list7 != null || list7.isEmpty()) {
                        iterable3 = iterable;
                        efbVar3 = efbVar2;
                        l4 = l3;
                        z6 = z5;
                        dfbVar = str;
                    } else {
                        long jLongValue = l3 != null ? l3.longValue() : 0L;
                        if (list7.isEmpty()) {
                            iterable3 = iterable;
                            efbVar3 = efbVar2;
                            l4 = l3;
                            jLongValue = jLongValue;
                            z7 = true;
                            break;
                        }
                        Iterator it15 = list7.iterator();
                        while (true) {
                            if (!it15.hasNext()) {
                                iterable3 = iterable;
                                efbVar3 = efbVar2;
                                l4 = l3;
                                jLongValue = jLongValue;
                                z7 = true;
                                break;
                            }
                            iterable3 = iterable;
                            g380 g380Var5 = (g380) it15.next();
                            efbVar3 = efbVar2;
                            if (r9 != 0) {
                                Iterator it16 = r9.b.iterator();
                                while (true) {
                                    if (!it16.hasNext()) {
                                        l4 = l3;
                                        next5 = str;
                                        break;
                                    }
                                    next5 = it16.next();
                                    Iterator it17 = it16;
                                    int i7 = ((f280) next5).f8801a;
                                    l4 = l3;
                                    Integer num6 = g380Var5.f10600a;
                                    if (num6 != null && i7 == num6.intValue()) {
                                        break;
                                    }
                                    it16 = it17;
                                    l3 = l4;
                                }
                                r2 = (f280) next5;
                            } else {
                                l4 = l3;
                                r2 = str;
                            }
                            yk5 yk5Var3 = izc.f15629a;
                            zgo zgoVar3 = g380Var5.d;
                            double dDoubleValue3 = (zgoVar3 == null || (d4 = zgoVar3.f) == null) ? 0.0d : d4.doubleValue();
                            double d6 = r2 != 0 ? r2.d.e : 0.0d;
                            yk5Var3.getClass();
                            if (yk5.b(dDoubleValue3, d6) != izc.c) {
                                z7 = false;
                                break;
                            }
                            iterable = iterable3;
                            efbVar2 = efbVar3;
                            l3 = l4;
                            jLongValue = jLongValue;
                        }
                        String str3 = mhvVar5.f21816a;
                        if (str3 == null) {
                            str3 = "";
                        }
                        ArrayList arrayList8 = new ArrayList(r3d.q(list7, 10));
                        Iterator it18 = list7.iterator();
                        ?? r11 = r9;
                        while (it18.hasNext()) {
                            g380 g380Var6 = (g380) it18.next();
                            if (r11 != 0) {
                                Iterator it19 = r11.b.iterator();
                                while (true) {
                                    if (!it19.hasNext()) {
                                        it6 = it18;
                                        next6 = str;
                                        break;
                                    }
                                    next6 = it19.next();
                                    int i8 = ((f280) next6).f8801a;
                                    it6 = it18;
                                    Integer num7 = g380Var6.f10600a;
                                    if (num7 != null && i8 == num7.intValue()) {
                                        break;
                                    }
                                    it18 = it6;
                                }
                                r13 = (f280) next6;
                            } else {
                                it6 = it18;
                                r13 = str;
                            }
                            boolean z15 = z5;
                            ?? r4 = r11;
                            long j = jLongValue;
                            jLongValue = j;
                            arrayList8.add(x9x.Y(g380Var6, j, r13, list9, list10, z7, z15, z9, z10));
                            r11 = r4;
                            z5 = z15;
                            it18 = it6;
                        }
                        z6 = z5;
                        dfbVar = new dfb(str3, arrayList8);
                    }
                    if (dfbVar != null) {
                        arrayList4.add(dfbVar);
                    }
                    z5 = z6;
                    iterable = iterable3;
                    efbVar2 = efbVar3;
                    l3 = l4;
                }
                iterable2 = iterable;
                if (list != null) {
                    arrayList5 = new ArrayList(r3d.q(list, 10));
                    it5 = list.iterator();
                    while (it5.hasNext()) {
                        arrayList5.add(bkb.q0((aqs) it5.next()));
                    }
                } else {
                    arrayList5 = str;
                }
                if (arrayList5 == 0) {
                    arrayList5 = iun.f15405a;
                }
                efbVar = new efb(arrayList4, arrayList5);
            }
            arrayList.add(efbVar);
            o2m0Var = this;
            str2 = str;
            it = it;
            iterable = iterable2;
            i = 1;
            iterable2 = iterable;
            arrayList.add(efbVar);
            o2m0Var = this;
            str2 = str;
            it = it;
            iterable = iterable2;
            i = 1;
        }
        return arrayList;
        boolean zBooleanValue = ((Boolean) objA).booleanValue();
        lnf0 lnf0VarD = r2m0Var.d.d();
        jvn jvnVar = o2m0Var.m;
        jvnVar.getClass();
        jo20 jo20Var = new jo20();
        jo20Var.put("cfView", Integer.valueOf(jvnVar.getId()));
        Integer num8 = o2m0Var.n;
        if (num8 != null) {
            jo20Var.put("country", num8);
        }
        jo20Var.put("fcountry", Integer.valueOf(lnf0VarD.b));
        jo20Var.put("gr", 1357);
        jo20Var.put(ParameterNames.ID, Integer.valueOf(o2m0Var.o));
        jo20Var.put("lng", lnf0VarD.f20342a);
        jo20Var.put("ref", 1);
        if (z8 && (l = o2m0Var.p) != null) {
            jo20Var.put("userId", l);
        }
        TreeMap treeMap = new TreeMap(w6x.j(22, jo20Var, "whence"));
        ljf0 ljf0Var = r2m0Var.b;
        o2m0Var.i = zBooleanValue;
        o2m0Var.j = (byte) 2;
        objA2 = ((g2m0) ((enj0) ljf0Var.f20148a).invoke()).a(treeMap, o2m0Var);
        if (objA2 != wneVar) {
            z = zBooleanValue;
            List list12 = (List) ((dx5) objA2).a();
            if (z) {
                iterable = iun.f15405a;
            } else {
                pair = (Pair) ((p7m0) r2m0Var.c.f21068a.b).getValue();
                if (pair != null) {
                    dqk0Var = (dqk0) pair.b;
                } else {
                    dqk0Var = null;
                }
                if (dqk0Var instanceof cqk0) {
                    iterable = (List) ((cqk0) dqk0Var).f4798a;
                } else {
                    iterable = iun.f15405a;
                }
            }
            arrayList = new ArrayList(r3d.q(list12, 10));
            it = list12.iterator();
            while (it.hasNext()) {
                lfb lfbVar2 = (lfb) it.next();
                lfbVar2.getClass();
                iterable.getClass();
                List list13 = o2m0Var.q;
                list13.getClass();
                List list14 = o2m0Var.r;
                list14.getClass();
                num = lfbVar2.f19945a;
                list = lfbVar2.d;
                l2 = lfbVar2.b;
                list2 = lfbVar2.c;
                z2 = o2m0Var.s;
                boolean z16 = o2m0Var.t;
                str = str2;
                boolean z17 = o2m0Var.u;
                int i9 = 0;
                z4 = false;
                z4 = false;
                z4 = false;
                z4 = false;
                i9 = 0;
                if (num != null) {
                    gfb gfbVar2 = (gfb) CollectionsKt.firstOrNull(kotlin.collections.b.D(iterable, gfb.class));
                    list2 = list2 == null ? list2 : list2;
                    if (list2 != null) {
                    }
                    jf4.k(str);
                    return str;
                }
                it = it;
                l3 = l2;
                z3 = z2;
                if (num != null) {
                    ffbVar = (ffb) CollectionsKt.firstOrNull(kotlin.collections.b.D(iterable, ffb.class));
                    if (list2 != null) {
                        if (list6.isEmpty()) {
                            z4 = true;
                            break;
                        }
                        it3 = list6.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                z4 = true;
                                break;
                            }
                            g380Var = (g380) it3.next();
                            if (ffbVar != null) {
                                it4 = ffbVar.f9441a.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        next4 = str;
                                        break;
                                    }
                                    next4 = it4.next();
                                    int i10 = ((f280) next4).f8801a;
                                    num2 = g380Var.f10600a;
                                    if (num2 != null) {
                                        break;
                                        break;
                                    }
                                }
                                r10 = (f280) next4;
                            } else {
                                r10 = str;
                            }
                            yk5 yk5Var4 = izc.f15629a;
                            zgoVar = g380Var.d;
                            if (zgoVar != null) {
                                dDoubleValue = 0.0d;
                            } else {
                                dDoubleValue = 0.0d;
                            }
                            if (r10 != 0) {
                                d2 = r10.d.e;
                            } else {
                                d2 = 0.0d;
                            }
                            yk5Var4.getClass();
                            if (yk5.b(dDoubleValue, d2) == izc.c) {
                                break;
                                break;
                            }
                            it3 = it3;
                        }
                    }
                    boolean z18 = z4;
                    if (list2 != null) {
                    }
                    jf4.k(str);
                    return str;
                }
                z5 = z3;
                efbVar2 = (efb) CollectionsKt.firstOrNull(kotlin.collections.b.D(iterable, efb.class));
                if (list2 != null) {
                    jf4.k(str);
                    return str;
                }
                arrayList4 = new ArrayList();
                while (r6.hasNext()) {
                    if (efbVar2 != null) {
                        it7 = efbVar2.f7714a.iterator();
                        do {
                            if (it7.hasNext()) {
                                next7 = str;
                                break;
                            }
                            next7 = it7.next();
                        } while (!Intrinsics.d(mhvVar5.f21816a, ((dfb) next7).f5992a));
                        r9 = (dfb) next7;
                    } else {
                        r9 = str;
                    }
                    list7 = mhvVar5.b;
                    if (list7 != null) {
                        iterable3 = iterable;
                        efbVar3 = efbVar2;
                        l4 = l3;
                        z6 = z5;
                        dfbVar = str;
                    } else {
                        iterable3 = iterable;
                        efbVar3 = efbVar2;
                        l4 = l3;
                        z6 = z5;
                        dfbVar = str;
                    }
                    if (dfbVar != null) {
                        arrayList4.add(dfbVar);
                    }
                    z5 = z6;
                    iterable = iterable3;
                    efbVar2 = efbVar3;
                    l3 = l4;
                }
                iterable2 = iterable;
                if (list != null) {
                    arrayList5 = new ArrayList(r3d.q(list, 10));
                    it5 = list.iterator();
                    while (it5.hasNext()) {
                        arrayList5.add(bkb.q0((aqs) it5.next()));
                    }
                } else {
                    arrayList5 = str;
                }
                if (arrayList5 == 0) {
                    arrayList5 = iun.f15405a;
                }
                efbVar = new efb(arrayList4, arrayList5);
                arrayList.add(efbVar);
                o2m0Var = this;
                str2 = str;
                it = it;
                iterable = iterable2;
                i = 1;
            }
            return arrayList;
        }
        return wneVar;
    }
}
