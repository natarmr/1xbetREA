package a;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class ino {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pmo f15084a;

    public ino(pmo pmoVar) {
        pmoVar.getClass();
        this.f15084a = pmoVar;
    }

    public static boolean a(HashMap map) {
        if (map.isEmpty()) {
            return true;
        }
        Collection collectionValues = map.values();
        collectionValues.getClass();
        Collection collection = collectionValues;
        if (collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!((Boolean) it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
