package kotlin.collections;

import a.x3d;
import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public class b extends x3d {
    public static ArrayList D(Iterable iterable, Class cls) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static SortedSet E(Iterable iterable) {
        TreeSet treeSet = new TreeSet();
        CollectionsKt___CollectionsKt.G(iterable, treeSet);
        return treeSet;
    }
}
