package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ckv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f4528a = q3d.j(q3d.j(new Pair(0, 0), new Pair(0, 1), new Pair(0, 2)), q3d.j(new Pair(1, 0), new Pair(1, 1), new Pair(1, 2)), q3d.j(new Pair(2, 0), new Pair(2, 1), new Pair(2, 2)), q3d.j(new Pair(0, 0), new Pair(1, 0), new Pair(2, 0)), q3d.j(new Pair(0, 1), new Pair(1, 1), new Pair(2, 1)), q3d.j(new Pair(0, 2), new Pair(1, 2), new Pair(2, 2)), q3d.j(new Pair(0, 0), new Pair(1, 1), new Pair(2, 2)), q3d.j(new Pair(0, 2), new Pair(1, 1), new Pair(2, 0)));

    public static final List a(Map map) {
        map.getClass();
        Collection collectionValues = new TreeMap(map).values();
        collectionValues.getClass();
        List listL0 = CollectionsKt.L0(collectionValues);
        if (listL0.isEmpty()) {
            return iun.f15405a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : f4528a) {
            List<Pair> list = (List) obj;
            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
            for (Pair pair : list) {
                int iIntValue = ((Number) pair.f46059a).intValue();
                arrayList2.add((rab) ((List) listL0.get(iIntValue)).get(((Number) pair.b).intValue()));
            }
            if (!arrayList2.isEmpty()) {
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((rab) it.next()) != rab.c) {
                        }
                    }
                }
            }
            if (CollectionsKt.L0(CollectionsKt.O0(arrayList2)).size() == 1) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
