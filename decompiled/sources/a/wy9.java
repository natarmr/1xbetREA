package a;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class wy9 implements hmx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zy9 f39963a;
    public final Object b;
    public j2a c;
    public iun d;
    public final ArrayList e;
    public boolean f;
    public boolean g;

    public wy9(m1a m1aVar, zy9 zy9Var) {
        zy9Var.getClass();
        this.f39963a = zy9Var;
        this.b = new Object();
        lun.f20680a.getClass();
        this.d = iun.f15405a;
        this.e = new ArrayList();
    }

    @Override // a.hmx
    public final void a(List list) throws l3a {
        list.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Set<Set> setC = zy9.c(this.f39963a);
            if (setC == null) {
                setC = xun.f41520a;
            }
            for (Set set : setC) {
                Set set2 = set;
                ArrayList arrayList = new ArrayList(r3d.q(set2, 10));
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((g0a) it.next()).f10449a);
                }
                Set setP0 = CollectionsKt.P0(arrayList);
                if (list.containsAll(setP0)) {
                    List listL0 = CollectionsKt.L0(set);
                    if (listL0.size() >= 2) {
                        String str = ((g0a) listL0.get(0)).f10449a;
                        String str2 = ((g0a) listL0.get(1)).f10449a;
                        try {
                            if (wb.J(this.f39963a, str) && wb.J(this.f39963a, str2)) {
                                linkedHashSet.add(set);
                                if (!linkedHashMap.containsKey(str)) {
                                    linkedHashMap.put(str, new ArrayList());
                                }
                                Object obj = linkedHashMap.get(str);
                                obj.getClass();
                                ((List) obj).add(str2);
                                if (!linkedHashMap.containsKey(str2)) {
                                    linkedHashMap.put(str2, new ArrayList());
                                }
                                Object obj2 = linkedHashMap.get(str2);
                                obj2.getClass();
                                ((List) obj2).add(str);
                            }
                        } catch (nbx e) {
                            if (l8x.j0()) {
                                Log.w("CXCP", "Skipping incompatible concurrent pair: " + set + " due to " + e.getMessage());
                            }
                        }
                    }
                } else if (l8x.j0()) {
                    Log.w("CXCP", "Failed to retrieve concurrent camera: " + setP0 + " from " + list);
                }
            }
            synchronized (this.b) {
            }
        } catch (Exception e2) {
            throw new l3a("Failed to retrieve concurrent camera id info for camera-pipe.", e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [a.wy9] */
    public final void b(j2a j2aVar) throws l3a {
        ?? arrayList;
        j2aVar.getClass();
        synchronized (this.b) {
            this.c = j2aVar;
        }
        ArrayList arrayListA = zy9.a(this.f39963a);
        if (arrayListA != null) {
            arrayList = new ArrayList(r3d.q(arrayListA, 10));
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                arrayList.add(((g0a) it.next()).f10449a);
            }
        } else {
            arrayList = iun.f15405a;
        }
        a(arrayList);
    }
}
