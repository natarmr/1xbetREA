package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public class zp20 extends yp20 {
    public static List q(Map map) {
        map.getClass();
        if (map.size() == 0) {
            return iun.f15405a;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return iun.f15405a;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return kotlin.collections.a.c(new Pair(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new Pair(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
