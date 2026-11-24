package a;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class lrm0 implements AutoCloseable {
    public static final z04 i = o2e.Y(0);
    public static final z04 j = o2e.Y(0);
    public static final z04 k = o2e.Y(0);
    public static final z04 l = o2e.Y(0);
    public static final z04 m = o2e.Y(0);
    public static final List n = q3d.j(m2a.y, m2a.z);
    public static final mjf0 o = new mjf0(20);
    public static final List p = q3d.j(new grm0(0), new grm0(34));
    public static final mjf0 q = new mjf0(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tz9 f20540a;
    public final LinkedHashMap b;
    public final List c;
    public final LinkedHashMap d;
    public final jo20 e;
    public final List f;
    public final ArrayList g;
    public final ArrayList h;

    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:75:0x0171  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [a.ef80] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v7, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    public lrm0(c1a c1aVar, tz9 tz9Var, rqt rqtVar, w1k w1kVar) {
        boolean z;
        tz9 tz9Var2;
        ?? arrayList;
        m2a m2aVar;
        Integer num;
        c1aVar.getClass();
        w1kVar.getClass();
        this.f20540a = tz9Var;
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList3 = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26 || tz9Var.h != 0) {
            z = false;
        } else {
            c1a.a0.getClass();
            if (b1a.c(c1aVar)) {
                z = false;
            } else {
                CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
                key.getClass();
                ow9 ow9Var = (ow9) c1aVar;
                Integer num2 = (Integer) ow9Var.c(key);
                if ((num2 != null && num2.intValue() == 0) || (i2 >= 28 && (num = (Integer) ow9Var.c(key)) != null && num.intValue() == 4)) {
                    z = false;
                } else {
                    z = true;
                }
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Iterator it = tz9Var.c.iterator();
        while (true) {
            m2a m2aVar2 = null;
            if (!it.hasNext()) {
                Iterator it2 = this.f20540a.b.iterator();
                while (it2.hasNext()) {
                    e3a e3aVar = (e3a) it2.next();
                    for (gf80 gf80Var : e3aVar.f7123a) {
                        if (!linkedHashMap.containsKey(gf80Var)) {
                            z04 z04Var = l;
                            z04Var.getClass();
                            int iIncrementAndGet = z04.b.incrementAndGet(z04Var);
                            Size size = gf80Var.f11196a;
                            int i3 = gf80Var.b;
                            String str = gf80Var.c;
                            String str2 = str == null ? this.f20540a.f34794a : str;
                            Integer num3 = (Integer) linkedHashMap3.get(e3aVar);
                            if (z) {
                                ?? r15 = gf80Var instanceof ef80 ? (ef80) gf80Var : m2aVar2;
                                if (r15 != 0) {
                                    m2aVar = r15.i;
                                } else {
                                    m2aVar = m2aVar2;
                                }
                            } else {
                                m2aVar = m2aVar2;
                            }
                            jrm0 jrm0Var = new jrm0(iIncrementAndGet, size, i3, str2, num3, m2aVar, gf80Var.d, gf80Var.e, gf80Var.f, gf80Var.g, gf80Var.h);
                            linkedHashMap.put(gf80Var, jrm0Var);
                            arrayList2.add(jrm0Var);
                            it2 = it2;
                            m2aVar2 = null;
                        }
                    }
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                int size2 = this.f20540a.b.size();
                int i4 = 0;
                while (true) {
                    tz9Var2 = this.f20540a;
                    if (i4 >= size2) {
                        break;
                    }
                    e3a e3aVar2 = (e3a) tz9Var2.b.get(i4);
                    List list = e3aVar2.f7123a;
                    ArrayList<krm0> arrayList4 = new ArrayList(r3d.q(list, 10));
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        Object obj = linkedHashMap.get((gf80) it3.next());
                        obj.getClass();
                        jrm0 jrm0Var2 = (jrm0) obj;
                        z04 z04Var2 = j;
                        z04Var2.getClass();
                        krm0 krm0Var = new krm0(z04.b.incrementAndGet(z04Var2), jrm0Var2.c, jrm0Var2.f, jrm0Var2.h, jrm0Var2.g, jrm0Var2.i, jrm0Var2.j, jrm0Var2.b, jrm0Var2.d);
                        linkedHashMap4.put(krm0Var, jrm0Var2);
                        arrayList4.add(krm0Var);
                        size2 = size2;
                    }
                    int i5 = size2;
                    z04 z04Var3 = i;
                    z04Var3.getClass();
                    f3a f3aVar = new f3a(z04.b.incrementAndGet(z04Var3), arrayList4);
                    linkedHashMap2.put(e3aVar2, f3aVar);
                    arrayList3.add(f3aVar);
                    for (krm0 krm0Var2 : arrayList4) {
                        krm0Var2.getClass();
                        krm0Var2.j = f3aVar;
                    }
                    Iterator it4 = e3aVar2.f7123a.iterator();
                    while (it4.hasNext()) {
                        Object obj2 = linkedHashMap.get((gf80) it4.next());
                        obj2.getClass();
                        ((jrm0) obj2).l.add(f3aVar);
                    }
                    i4++;
                    size2 = i5;
                }
                ArrayList<ffx> arrayList5 = tz9Var2.d;
                if (arrayList5 != null) {
                    arrayList = new ArrayList(r3d.q(arrayList5, 10));
                    for (ffx ffxVar : arrayList5) {
                        z04 z04Var4 = k;
                        z04Var4.getClass();
                        int iIncrementAndGet2 = z04.b.incrementAndGet(z04Var4);
                        ffxVar.getClass();
                        arrayList.add(new irm0(iIncrementAndGet2, ffxVar.b));
                    }
                } else {
                    arrayList = iun.f15405a;
                }
                this.f = arrayList;
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                for (Object obj3 : arrayList3) {
                    ArrayList arrayList8 = ((f3a) obj3).b;
                    if (!arrayList8.isEmpty()) {
                        Iterator it5 = arrayList8.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                jf80 jf80Var = ((krm0) it5.next()).g;
                                if (jf80Var == null ? false : jf80.a(jf80Var.f16412a, 1L)) {
                                    arrayList6.add(obj3);
                                    break;
                                }
                            }
                        }
                    }
                    arrayList7.add(obj3);
                }
                if (arrayList6.isEmpty()) {
                    ArrayList arrayList9 = new ArrayList();
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj4 : arrayList3) {
                        ArrayList arrayList11 = ((f3a) obj4).b;
                        if (!arrayList11.isEmpty()) {
                            Iterator it6 = arrayList11.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    if (CollectionsKt.L(n, ((krm0) it6.next()).h)) {
                                        arrayList9.add(obj4);
                                        break;
                                    }
                                }
                            }
                        }
                        arrayList10.add(obj4);
                    }
                    if (arrayList9.isEmpty()) {
                        ArrayList arrayList12 = new ArrayList();
                        ArrayList arrayList13 = new ArrayList();
                        for (Object obj5 : arrayList3) {
                            ArrayList arrayList14 = ((f3a) obj5).b;
                            if (!arrayList14.isEmpty()) {
                                Iterator it7 = arrayList14.iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        if (p.contains(new grm0(((krm0) it7.next()).c))) {
                                            arrayList12.add(obj5);
                                            break;
                                        }
                                    }
                                }
                            }
                            arrayList13.add(obj5);
                        }
                        if (!arrayList12.isEmpty()) {
                            arrayList3 = CollectionsKt.q0(CollectionsKt.A0(arrayList12, q), arrayList13);
                        }
                    } else {
                        arrayList3 = CollectionsKt.q0(CollectionsKt.A0(arrayList9, o), arrayList10);
                    }
                } else {
                    arrayList3 = CollectionsKt.q0(arrayList6, arrayList7);
                }
                ArrayList arrayList15 = new ArrayList();
                ArrayList arrayList16 = new ArrayList();
                for (Object obj6 : arrayList3) {
                    ArrayList arrayList17 = ((f3a) obj6).b;
                    if (arrayList17.isEmpty()) {
                        arrayList16.add(obj6);
                        break;
                    }
                    Iterator it8 = arrayList17.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            jf80 jf80Var2 = ((krm0) it8.next()).g;
                            if (jf80Var2 == null ? false : jf80.a(jf80Var2.f16412a, 3L)) {
                                arrayList15.add(obj6);
                                break;
                            }
                        } else {
                            arrayList16.add(obj6);
                            break;
                            break;
                        }
                    }
                }
                if (arrayList15.isEmpty()) {
                    ArrayList arrayList18 = new ArrayList();
                    ArrayList arrayList19 = new ArrayList();
                    for (Object obj7 : arrayList3) {
                        ArrayList arrayList20 = ((f3a) obj7).b;
                        if (!arrayList20.isEmpty()) {
                            Iterator it9 = arrayList20.iterator();
                            while (true) {
                                if (it9.hasNext()) {
                                    kf80 kf80Var = ((krm0) it9.next()).i;
                                    if (kf80Var == null ? false : kf80.a(kf80Var.f18185a, 1L)) {
                                        arrayList18.add(obj7);
                                    }
                                }
                            }
                        }
                        arrayList19.add(obj7);
                    }
                    if (!arrayList18.isEmpty()) {
                        arrayList3 = CollectionsKt.q0(arrayList19, arrayList18);
                    }
                } else {
                    arrayList3 = CollectionsKt.q0(arrayList16, arrayList15);
                }
                this.g = arrayList3;
                ArrayList arrayList21 = new ArrayList(r3d.q(arrayList3, 10));
                Iterator it10 = arrayList3.iterator();
                while (it10.hasNext()) {
                    arrayList21.add(new mrm0(((f3a) it10.next()).f8851a));
                }
                CollectionsKt.P0(arrayList21);
                this.b = linkedHashMap2;
                this.c = CollectionsKt.A0(arrayList2, new mto(this, (byte) 9));
                this.d = linkedHashMap4;
                ArrayList arrayList22 = this.g;
                ArrayList arrayList23 = new ArrayList();
                Iterator it11 = arrayList22.iterator();
                while (it11.hasNext()) {
                    w3d.u(arrayList23, ((f3a) it11.next()).b);
                }
                this.h = arrayList23;
                jo20 jo20Var = new jo20();
                Iterator it12 = this.f20540a.b.iterator();
                while (it12.hasNext()) {
                    ((e3a) it12.next()).getClass();
                }
                this.e = jo20Var.b();
                return;
            }
            List<e3a> list2 = (List) it.next();
            if (list2.isEmpty()) {
                jf4.n("Check failed.");
                throw null;
            }
            List list3 = this.f20540a.b;
            ArrayList arrayList24 = new ArrayList();
            Iterator it13 = list3.iterator();
            while (it13.hasNext()) {
                w3d.u(arrayList24, ((e3a) it13.next()).f7123a);
            }
            ArrayList arrayList25 = new ArrayList();
            Iterator it14 = arrayList24.iterator();
            while (it14.hasNext()) {
                it14.next();
            }
            ArrayList arrayList26 = new ArrayList();
            Iterator it15 = arrayList25.iterator();
            if (it15.hasNext()) {
                throw rw2.h(it15);
            }
            z04 z04Var5 = m;
            z04Var5.getClass();
            int iIncrementAndGet3 = z04.b.incrementAndGet(z04Var5);
            while (arrayList26.contains(Integer.valueOf(iIncrementAndGet3))) {
                iIncrementAndGet3 = z04.b.incrementAndGet(z04Var5);
            }
            for (e3a e3aVar3 : list2) {
                if (linkedHashMap3.containsKey(e3aVar3)) {
                    jf4.n("Check failed.");
                    throw null;
                }
                linkedHashMap3.put(e3aVar3, Integer.valueOf(iIncrementAndGet3));
            }
        }
    }

    public final f3a a(int i2) {
        Object next;
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((f3a) next).f8851a == i2) {
                return (f3a) next;
            }
        }
        next = null;
        return (f3a) next;
    }

    public final e3a c(int i2) {
        Object next;
        Iterator it = this.b.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((f3a) ((Map.Entry) next).getValue()).f8851a != i2);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (e3a) entry.getKey();
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        boolean zIsTerminated;
        for (AutoCloseable autoCloseable : (mo20) this.e.values()) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else {
                if (!(autoCloseable instanceof ExecutorService)) {
                    e9d0.o();
                    return;
                }
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    public final String toString() {
        return "StreamGraph(" + this.b + ')';
    }
}
