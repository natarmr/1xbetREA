package a;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class w3d extends v3d {
    public static Object A(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(list.size() - 1);
    }

    public static void u(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void v(Collection collection, Object[] objArr) {
        collection.getClass();
        objArr.getClass();
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        collection.addAll(listAsList);
    }

    public static final Collection w(Iterable iterable) {
        iterable.getClass();
        return iterable instanceof Collection ? (Collection) iterable : CollectionsKt.L0(iterable);
    }

    public static final boolean x(Collection collection, Function1 function1, boolean z) {
        Iterator it = collection.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) function1.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static boolean y(List list, Function1 function1) {
        int i;
        list.getClass();
        function1.getClass();
        if (!(list instanceof RandomAccess)) {
            if (!(list instanceof khy) || (list instanceof lhy)) {
                return x(list, function1, true);
            }
            zys0.g(list, "kotlin.collections.MutableIterable");
            throw null;
        }
        int size = list.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                Object obj = list.get(i2);
                if (!((Boolean) function1.invoke(obj)).booleanValue()) {
                    if (i != i2) {
                        list.set(i, obj);
                    }
                    i++;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i >= list.size()) {
            return false;
        }
        int size2 = list.size() - 1;
        if (i <= size2) {
            while (true) {
                list.remove(size2);
                if (size2 == i) {
                    break;
                }
                size2--;
            }
        }
        return true;
    }

    public static Object z(List list) {
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        }
        v4i0.o("List is empty.");
        return null;
    }
}
