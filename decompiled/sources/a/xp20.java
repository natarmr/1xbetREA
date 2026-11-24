package a;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public class xp20 extends wp20 {
    public static Object d(Map map, Object obj) {
        map.getClass();
        if (map instanceof pp20) {
            return ((pp20) map).i();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        v4i0.o(f140.k(obj, "Key ", " is missing in the map."));
        return null;
    }

    public static HashMap e(Pair... pairArr) {
        HashMap map = new HashMap(wp20.a(pairArr.length));
        l(map, pairArr);
        return map;
    }

    public static Map f(Pair... pairArr) {
        if (pairArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(wp20.a(pairArr.length));
            l(linkedHashMap, pairArr);
            return linkedHashMap;
        }
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        return lunVar;
    }

    public static Map g(Map map, Object obj) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.remove(obj);
        return i(linkedHashMap);
    }

    public static LinkedHashMap h(Pair... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(wp20.a(pairArr.length));
        l(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static final Map i(LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        if (size == 0) {
            lun lunVar = lun.f20680a;
            lunVar.getClass();
            return lunVar;
        }
        if (size != 1) {
            return linkedHashMap;
        }
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static LinkedHashMap j(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map k(Map map, Pair pair) {
        map.getClass();
        if (map.isEmpty()) {
            return wp20.b(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.f46059a, pair.b);
        return linkedHashMap;
    }

    public static void l(Map map, Pair[] pairArr) {
        map.getClass();
        for (Pair pair : pairArr) {
            map.put(pair.f46059a, pair.b);
        }
    }

    public static Map m(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            o(iterable, linkedHashMap);
            return i(linkedHashMap);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            lun lunVar = lun.f20680a;
            lunVar.getClass();
            return lunVar;
        }
        if (size == 1) {
            return wp20.b((Pair) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(wp20.a(collection.size()));
        o(iterable, linkedHashMap2);
        return linkedHashMap2;
    }

    public static Map n(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            lun lunVar = lun.f20680a;
            lunVar.getClass();
            return lunVar;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static final void o(Iterable iterable, LinkedHashMap linkedHashMap) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linkedHashMap.put(pair.f46059a, pair.b);
        }
    }

    public static LinkedHashMap p(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }
}
