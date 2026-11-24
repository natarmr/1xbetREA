package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class hrc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pzu f13523a;

    public /* synthetic */ hrc(pzu pzuVar) {
        this.f13523a = pzuVar;
    }

    public long a() {
        Map mapU = this.f13523a.U();
        if (mapU.isEmpty()) {
            return 0L;
        }
        ArrayList arrayList = new ArrayList(mapU.size());
        Iterator it = mapU.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((Set) ((Map.Entry) it.next()).getValue()).size()));
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            v4i0.p("Empty collection can't be reduced.");
            return 0L;
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            next = Long.valueOf(((Number) next).longValue() * ((Number) it2.next()).longValue());
        }
        return ((Number) next).longValue();
    }
}
