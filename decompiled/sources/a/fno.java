package a;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class fno {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cno f9848a;
    public final yr20 b;

    public fno(cno cnoVar, yr20 yr20Var) {
        cnoVar.getClass();
        yr20Var.getClass();
        this.f9848a = cnoVar;
        this.b = yr20Var;
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
