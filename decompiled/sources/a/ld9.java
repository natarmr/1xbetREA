package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ld9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f19838a;
    public static final LinkedHashMap b;
    public static final Set c;
    public static final Set d;

    static {
        twq twqVar = i4m0.j;
        Pair pair = new Pair(twqVar.a(g950.e("name")).i(), j4m0.d);
        Pair pair2 = new Pair(twqVar.a(g950.e("ordinal")).i(), g950.e("ordinal"));
        Pair pair3 = new Pair(cjx.N(i4m0.C, "size"), g950.e("size"));
        swq swqVar = i4m0.G;
        Map mapF = xp20.f(pair, pair2, pair3, new Pair(cjx.N(swqVar, "size"), g950.e("size")), new Pair(i4m0.e.a(g950.e("length")).i(), g950.e("length")), new Pair(cjx.N(swqVar, "keys"), g950.e("keySet")), new Pair(cjx.N(swqVar, "values"), g950.e("values")), new Pair(cjx.N(swqVar, "entries"), g950.e("entrySet")), new Pair(cjx.N(i4m0.a0, "size"), g950.e("length")), new Pair(cjx.N(i4m0.b0, "size"), g950.e("length")), new Pair(cjx.N(i4m0.c0, "size"), g950.e("length")));
        f19838a = mapF;
        Set<Map.Entry> setEntrySet = mapF.entrySet();
        ArrayList<Pair> arrayList = new ArrayList(r3d.q(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new Pair(((swq) entry.getKey()).f32934a.g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair4 : arrayList) {
            g950 g950Var = (g950) pair4.b;
            Object arrayList2 = linkedHashMap.get(g950Var);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(g950Var, arrayList2);
            }
            ((List) arrayList2).add((g950) pair4.f46059a);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(wp20.a(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), CollectionsKt.N((Iterable) entry2.getValue()));
        }
        b = linkedHashMap2;
        Map map = f19838a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            String str = bay.f2281a;
            qlc qlcVarH = bay.h(((swq) entry3.getKey()).b().f32934a);
            qlcVarH.getClass();
            linkedHashSet.add(qlcVarH.a().a((g950) entry3.getValue()));
        }
        Set setKeySet = f19838a.keySet();
        c = setKeySet;
        Set set = setKeySet;
        ArrayList arrayList3 = new ArrayList(r3d.q(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList3.add(((swq) it.next()).f32934a.g());
        }
        d = CollectionsKt.P0(arrayList3);
    }
}
