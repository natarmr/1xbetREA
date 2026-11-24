package a;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public abstract class uwo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f36403a;
    public static final Map b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f36403a = linkedHashMap;
        b(e4m0.y, a("java.util.ArrayList", "java.util.LinkedList"));
        b(e4m0.z, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(e4m0.A, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        swq swqVar = new swq("java.util.function.Function");
        b(new qlc(swqVar.b(), swqVar.f32934a.g()), a("java.util.function.UnaryOperator"));
        swq swqVar2 = new swq("java.util.function.BiFunction");
        b(new qlc(swqVar2.b(), swqVar2.f32934a.g()), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(((qlc) entry.getKey()).a(), ((qlc) entry.getValue()).a()));
        }
        b = xp20.m(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            swq swqVar = new swq(str);
            arrayList.add(new qlc(swqVar.b(), swqVar.f32934a.g()));
        }
        return arrayList;
    }

    public static void b(qlc qlcVar, ArrayList arrayList) {
        for (Object obj : arrayList) {
            f36403a.put(obj, qlcVar);
        }
    }
}
