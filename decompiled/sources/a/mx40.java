package a;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes2.dex */
public final class mx40 extends c4 implements Serializable {
    public final transient Map d;
    public transient int e;
    public transient lx40 f;

    public mx40(Map map) {
        x0x.A(map.isEmpty());
        this.d = map;
    }

    @Override // a.c4
    public final Map b() {
        Map map = this.d;
        if (map instanceof NavigableMap) {
            return new n3(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new q3(this, (SortedMap) map) : new l3(this, map);
    }

    @Override // a.c4
    public final Set d() {
        Map map = this.d;
        if (map instanceof NavigableMap) {
            return new o3(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new r3(this, (SortedMap) map) : new m3(this, map);
    }

    public final void e() {
        Map map = this.d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.e = 0;
    }

    public final Collection f() {
        return (List) this.f.get();
    }
}
