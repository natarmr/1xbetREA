package a;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ul9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35861a = 0;
    public final k050 b = new k050();
    public final Object c;
    public final Object d;

    public ul9(zas0 zas0Var, s3t0 s3t0Var) {
        this.c = zas0Var;
        this.d = s3t0Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public final Object a(List list, yje yjeVar) {
        Object g0g0Var;
        pl9 pl9Var;
        ?? g0g0Var2;
        iun iunVar;
        boolean z;
        ?? r7;
        List list2;
        ?? arrayList;
        byte b = this.f35861a;
        Object obj = this.d;
        switch (b) {
            case 0:
                LinkedHashMap linkedHashMap = ((hl9) obj).e;
                if (yjeVar instanceof pl9) {
                    pl9Var = (pl9) yjeVar;
                    int i = pl9Var.l;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        pl9Var.l = i - Integer.MIN_VALUE;
                    } else {
                        pl9Var = new pl9(this, (zje) yjeVar);
                    }
                } else {
                    pl9Var = new pl9(this, (zje) yjeVar);
                }
                Object objB = pl9Var.j;
                wne wneVar = wne.f39444a;
                int i2 = pl9Var.l;
                try {
                    if (i2 == 0) {
                        z1x.P(objB);
                        e0g0 e0g0Var = j0g0.b;
                        list.getClass();
                        arrayList = (List) linkedHashMap.get(list);
                        if (arrayList == 0) {
                            r7v r7vVar = (r7v) this.c;
                            pl9Var.i = list;
                            pl9Var.l = 1;
                            objB = ((lk9) ((zm) r7vVar.f29996a).invoke()).b(list, 0, pl9Var);
                            if (objB == wneVar) {
                                return wneVar;
                            }
                        }
                        e0g0 e0g0Var2 = j0g0.b;
                        g0g0Var2 = arrayList;
                        iunVar = iun.f15405a;
                        z = g0g0Var2 instanceof g0g0;
                        r7 = g0g0Var2;
                        if (z) {
                            r7 = iunVar;
                        }
                        list2 = (List) r7;
                        if (!list2.isEmpty()) {
                            return list2;
                        }
                        list.getClass();
                        linkedHashMap.put(list, list2);
                        return list2;
                    }
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = pl9Var.i;
                    z1x.P(objB);
                    Iterable iterable = (Iterable) ((dx5) objB).a();
                    arrayList = new ArrayList(r3d.q(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(d5c.W((r4g) it.next()));
                    }
                    e0g0 e0g0Var3 = j0g0.b;
                    g0g0Var2 = arrayList;
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var4 = j0g0.b;
                    g0g0Var2 = new g0g0(th);
                }
                iunVar = iun.f15405a;
                z = g0g0Var2 instanceof g0g0;
                r7 = g0g0Var2;
                if (z) {
                    r7 = iunVar;
                }
                list2 = (List) r7;
                if (!list2.isEmpty()) {
                    return list2;
                }
                list.getClass();
                linkedHashMap.put(list, list2);
                return list2;
            default:
                try {
                    e0g0 e0g0Var5 = j0g0.b;
                    g0g0Var = ((s3t0) obj).e;
                    break;
                } catch (Throwable th2) {
                    e0g0 e0g0Var6 = j0g0.b;
                    g0g0Var = new g0g0(th2);
                }
                Object obj2 = iun.f15405a;
                if (g0g0Var instanceof g0g0) {
                    g0g0Var = obj2;
                }
                return (List) g0g0Var;
        }
    }

    public final o4g b() {
        byte b = this.f35861a;
        Object obj = this.d;
        switch (b) {
            case 0:
                return (o4g) ((hl9) obj).b.getValue();
            default:
                return (o4g) ((s3t0) obj).b.getValue();
        }
    }

    public final List c() {
        byte b = this.f35861a;
        Object obj = this.d;
        switch (b) {
            case 0:
                return (List) ((hl9) obj).d.getValue();
            default:
                return (List) ((s3t0) obj).d.getValue();
        }
    }

    public final p7m0 d() {
        byte b = this.f35861a;
        Object obj = this.d;
        switch (b) {
            case 0:
                return ((hl9) obj).d;
            default:
                return ((s3t0) obj).d;
        }
    }

    public final p7m0 e() {
        byte b = this.f35861a;
        Object obj = this.d;
        switch (b) {
            case 0:
                return ((hl9) obj).c;
            default:
                return ((s3t0) obj).c;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:9:0x002f  */
    public final Object f(int i, int i2, zje zjeVar) throws Throwable {
        sl9 sl9Var;
        i050 i050Var;
        List list;
        int i3;
        int i4;
        t3t0 t3t0Var;
        i050 i050Var2;
        List list2;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        byte b = this.f35861a;
        Object obj = this.c;
        i050 i050Var3 = this.b;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                LinkedHashMap linkedHashMap = ((hl9) obj2).f13246a;
                if (zjeVar instanceof sl9) {
                    sl9Var = (sl9) zjeVar;
                    int i9 = sl9Var.n;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        sl9Var.n = i9 - Integer.MIN_VALUE;
                    } else {
                        sl9Var = new sl9(this, zjeVar);
                    }
                } else {
                    sl9Var = new sl9(this, zjeVar);
                }
                Object objA = sl9Var.l;
                wne wneVar = wne.f39444a;
                int i10 = sl9Var.n;
                try {
                    if (i10 == 0) {
                        z1x.P(objA);
                        sl9Var.k = i050Var3;
                        sl9Var.i = i7;
                        sl9Var.j = i8;
                        sl9Var.n = 1;
                        if (i050Var3.d(sl9Var) != wneVar) {
                        }
                        return wneVar;
                    }
                    if (i10 != 1) {
                        if (i10 != 2) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i4 = sl9Var.j;
                        i3 = sl9Var.i;
                        i050Var = sl9Var.k;
                        try {
                            z1x.P(objA);
                            list = fbc.W((gag) ((dx5) objA).a()).f5745a;
                            list.getClass();
                            StringBuilder sb = new StringBuilder();
                            sb.append(i3);
                            sb.append(i4);
                            linkedHashMap.put(sb.toString(), list);
                            i050Var.c(null);
                            return list;
                        } catch (Throwable th) {
                            th = th;
                            i050Var.c(null);
                            throw th;
                        }
                    }
                    int i11 = sl9Var.j;
                    int i12 = sl9Var.i;
                    i050Var3 = sl9Var.k;
                    z1x.P(objA);
                    i8 = i11;
                    i7 = i12;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append(i8);
                    list = (List) linkedHashMap.get(sb2.toString());
                    if (list == null) {
                        sl9Var.k = i050Var3;
                        sl9Var.i = i7;
                        sl9Var.j = i8;
                        sl9Var.n = 2;
                        int i13 = i7;
                        int i14 = i8;
                        objA = ((lk9) ((zm) ((r7v) obj).f29996a).invoke()).a(kotlin.collections.a.c(new Long(0L)), 0, i13, i14, sl9Var);
                        if (objA != wneVar) {
                            i050Var = i050Var3;
                            i3 = i13;
                            i4 = i14;
                            list = fbc.W((gag) ((dx5) objA).a()).f5745a;
                            list.getClass();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(i3);
                            sb3.append(i4);
                            linkedHashMap.put(sb3.toString(), list);
                            i050Var.c(null);
                        }
                        return wneVar;
                    }
                    i050Var3.c(null);
                    return list;
                } catch (Throwable th2) {
                    th = th2;
                    i050Var = i050Var3;
                    i050Var.c(null);
                    throw th;
                }
            default:
                LinkedHashMap linkedHashMap2 = ((s3t0) obj2).f31576a;
                if (zjeVar instanceof t3t0) {
                    t3t0Var = (t3t0) zjeVar;
                    int i15 = t3t0Var.n;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        t3t0Var.n = i15 - Integer.MIN_VALUE;
                    } else {
                        t3t0Var = new t3t0(this, zjeVar);
                    }
                } else {
                    t3t0Var = new t3t0(this, zjeVar);
                }
                Object objA2 = t3t0Var.l;
                wne wneVar2 = wne.f39444a;
                int i16 = t3t0Var.n;
                try {
                    if (i16 == 0) {
                        z1x.P(objA2);
                        t3t0Var.k = i050Var3;
                        t3t0Var.i = i7;
                        t3t0Var.j = i8;
                        t3t0Var.n = 1;
                        if (i050Var3.d(t3t0Var) != wneVar2) {
                        }
                        return wneVar2;
                    }
                    if (i16 != 1) {
                        if (i16 != 2) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i6 = t3t0Var.j;
                        i5 = t3t0Var.i;
                        i050Var2 = t3t0Var.k;
                        try {
                            z1x.P(objA2);
                            list2 = ebc.c0((List) ((dx5) objA2).a()).f5745a;
                            list2.getClass();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(i5);
                            sb4.append(i6);
                            linkedHashMap2.put(sb4.toString(), list2);
                            i050Var2.c(null);
                            return list2;
                        } catch (Throwable th3) {
                            th = th3;
                            i050Var2.c(null);
                            throw th;
                        }
                    }
                    int i17 = t3t0Var.j;
                    int i18 = t3t0Var.i;
                    i050Var3 = t3t0Var.k;
                    z1x.P(objA2);
                    i8 = i17;
                    i7 = i18;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(i7);
                    sb5.append(i8);
                    list2 = (List) linkedHashMap2.get(sb5.toString());
                    if (list2 == null) {
                        t3t0Var.k = i050Var3;
                        t3t0Var.i = i7;
                        t3t0Var.j = i8;
                        t3t0Var.n = 2;
                        objA2 = ((n3t0) ((lkr0) ((zas0) obj).b).invoke()).a(i8, i7, t3t0Var);
                        if (objA2 != wneVar2) {
                            int i19 = i8;
                            i5 = i7;
                            i6 = i19;
                            i050Var2 = i050Var3;
                            list2 = ebc.c0((List) ((dx5) objA2).a()).f5745a;
                            list2.getClass();
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(i5);
                            sb6.append(i6);
                            linkedHashMap2.put(sb6.toString(), list2);
                            i050Var2.c(null);
                        }
                        return wneVar2;
                    }
                    i050Var3.c(null);
                    return list2;
                } catch (Throwable th4) {
                    th = th4;
                    i050Var2 = i050Var3;
                    i050Var2.c(null);
                    throw th;
                }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v21, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r14v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v31, types: [java.util.ArrayList] */
    public final Object g(List list, zje zjeVar) {
        tl9 tl9Var;
        List listL0;
        ?? arrayList;
        o4g o4gVar;
        u3t0 u3t0Var;
        o4g o4gVar2;
        byte b = this.f35861a;
        Object obj = this.d;
        byte b2 = 1;
        switch (b) {
            case 0:
                hl9 hl9Var = (hl9) obj;
                if (zjeVar instanceof tl9) {
                    tl9Var = (tl9) zjeVar;
                    int i = tl9Var.m;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        tl9Var.m = i - Integer.MIN_VALUE;
                    } else {
                        tl9Var = new tl9(this, zjeVar);
                    }
                } else {
                    tl9Var = new tl9(this, zjeVar);
                }
                Object objB = tl9Var.k;
                wne wneVar = wne.f39444a;
                int i2 = tl9Var.m;
                try {
                    if (i2 == 0) {
                        z1x.P(objB);
                        r7v r7vVar = (r7v) this.c;
                        List<Long> listU = cs0.u(0L);
                        tl9Var.i = list;
                        tl9Var.m = 1;
                        objB = ((lk9) ((zm) r7vVar.f29996a).invoke()).b(listU, 0, tl9Var);
                        if (objB != wneVar) {
                        }
                        return wneVar;
                    }
                    if (i2 == 1) {
                        list = tl9Var.i;
                        z1x.P(objB);
                    } else {
                        if (i2 != 2) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o4gVar = tl9Var.j;
                        z1x.P(objB);
                    }
                    o4gVar.getClass();
                    hl9Var.b.o(null, o4gVar);
                    return o4gVar;
                    Calendar calendar = Calendar.getInstance();
                    Calendar calendar2 = Calendar.getInstance();
                    d5g d5gVar = (d5g) CollectionsKt.U(listL0);
                    d5g d5gVar2 = (d5g) CollectionsKt.d0(listL0);
                    calendar.set(1, d5gVar.f5503a);
                    calendar.set(2, ((Number) CollectionsKt.U(d5gVar.b)).intValue() - 1);
                    calendar.set(5, 1);
                    calendar2.set(1, d5gVar2.f5503a);
                    calendar2.set(2, ((Number) CollectionsKt.d0(d5gVar2.b)).intValue() - 1);
                    calendar2.set(5, 2);
                    arrayList = new ArrayList();
                    while (calendar2.after(calendar)) {
                        arrayList.add(new d5g(calendar.get(1), kotlin.collections.a.c(Integer.valueOf(calendar.get(2) + 1))));
                        calendar.add(2, 1);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    arrayList = iun.f15405a;
                }
                List list2 = (List) ((dx5) objB).a();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    Long l = ((r4g) it.next()).f29832a;
                    if (l != null) {
                        arrayList2.add(l);
                    }
                }
                ckq ckqVarC = lgi0.c(pgi0.q(new sx3(list2, b2), new vlf((byte) 15)), new eoh0((byte) 23));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                bkq bkqVar = new bkq(ckqVarC);
                while (bkqVar.hasNext()) {
                    Object next = bkqVar.next();
                    Integer num = ((n4g) next).f22896a;
                    Object arrayList3 = linkedHashMap.get(num);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap.put(num, arrayList3);
                    }
                    ((List) arrayList3).add(next);
                }
                ArrayList arrayList4 = new ArrayList();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Iterable iterable = (Iterable) entry.getValue();
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        List list3 = ((n4g) it2.next()).b;
                        if (list3 != null) {
                            arrayList5.add(list3);
                        }
                    }
                    List listZ0 = CollectionsKt.z0(CollectionsKt.P0(r3d.r(arrayList5)));
                    Integer num2 = (Integer) entry.getKey();
                    d5g d5gVar3 = num2 != null ? new d5g(num2.intValue(), CollectionsKt.L0(listZ0)) : null;
                    if (d5gVar3 != null) {
                        arrayList4.add(d5gVar3);
                    }
                }
                listL0 = CollectionsKt.L0(CollectionsKt.A0(arrayList4, new vt5((byte) 18)));
                o4g o4gVar3 = new o4g(arrayList2, arrayList);
                List listC = c();
                if (!listC.isEmpty()) {
                    list = listC;
                } else if (list.isEmpty()) {
                    list = arrayList2;
                }
                tl9Var.i = null;
                tl9Var.j = o4gVar3;
                tl9Var.m = 2;
                hl9Var.d.n(list);
                Unit unit = Unit.f46060a;
                wne wneVar2 = wne.f39444a;
                if (unit != wneVar) {
                    o4gVar = o4gVar3;
                    o4gVar.getClass();
                    hl9Var.b.o(null, o4gVar);
                    return o4gVar;
                }
                return wneVar;
            default:
                s3t0 s3t0Var = (s3t0) obj;
                if (zjeVar instanceof u3t0) {
                    u3t0Var = (u3t0) zjeVar;
                    int i3 = u3t0Var.l;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        u3t0Var.l = i3 - Integer.MIN_VALUE;
                    } else {
                        u3t0Var = new u3t0(this, zjeVar);
                    }
                } else {
                    u3t0Var = new u3t0(this, zjeVar);
                }
                Object obj2 = u3t0Var.j;
                wne wneVar3 = wne.f39444a;
                int i4 = u3t0Var.l;
                if (i4 == 0) {
                    z1x.P(obj2);
                    List list4 = s3t0Var.e;
                    list4.getClass();
                    List listC2 = kotlin.collections.a.c(189L);
                    o4g o4gVar4 = new o4g(listC2, ((k4g) CollectionsKt.U(list4)).c);
                    u3t0Var.i = o4gVar4;
                    u3t0Var.l = 1;
                    s3t0Var.d.n(listC2);
                    if (Unit.f46060a == wneVar3) {
                        return wneVar3;
                    }
                    o4gVar2 = o4gVar4;
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o4gVar2 = u3t0Var.i;
                    z1x.P(obj2);
                }
                o4gVar2.getClass();
                p7m0 p7m0Var = s3t0Var.b;
                p7m0Var.getClass();
                p7m0Var.o(null, o4gVar2);
                return o4gVar2;
        }
    }

    public final Unit h(c5g c5gVar) {
        byte b = this.f35861a;
        Object obj = this.d;
        switch (b) {
            case 0:
                ((hl9) obj).c.n(c5gVar);
                Unit unit = Unit.f46060a;
                wne wneVar = wne.f39444a;
                return unit;
            default:
                ((s3t0) obj).c.n(c5gVar);
                Unit unit2 = Unit.f46060a;
                wne wneVar2 = wne.f39444a;
                return unit2;
        }
    }

    public ul9(r7v r7vVar, hl9 hl9Var) {
        this.c = r7vVar;
        this.d = hl9Var;
    }
}
