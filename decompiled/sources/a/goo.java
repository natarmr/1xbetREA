package a;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class goo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uno f11640a;
    public final yvf b;

    public goo(uno unoVar, yvf yvfVar) {
        unoVar.getClass();
        yvfVar.getClass();
        this.f11640a = unoVar;
        this.b = yvfVar;
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

    public final void b() {
        long id = this.b.a().getId();
        uno unoVar = this.f11640a;
        unoVar.a(id).b = true;
        HashMap map = (HashMap) unoVar.a(id).f22099a.getValue();
        boolean zA = a(map);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            c(((Number) ((Map.Entry) it.next()).getKey()).longValue(), id, zA, false);
        }
    }

    public final void c(long j, long j2, boolean z, boolean z2) {
        uno unoVar = this.f11640a;
        if (z2) {
            unoVar.a(j2).b = true;
        }
        unoVar.getClass();
        HashMap map = new HashMap();
        map.putAll((Map) unoVar.a(j2).f22099a.getValue());
        map.put(Long.valueOf(j), Boolean.valueOf(z));
        unoVar.a(j2).f22099a.o(null, map);
    }
}
