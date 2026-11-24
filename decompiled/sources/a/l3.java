package a;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class l3 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient j3 f19336a;
    public transient b4 b;
    public final transient Map c;
    public final /* synthetic */ mx40 d;

    public l3(mx40 mx40Var, Map map) {
        this.d = mx40Var;
        this.c = map;
    }

    public final AbstractMap.SimpleImmutableEntry a(Map.Entry entry) {
        Object key = entry.getKey();
        List list = (List) ((Collection) entry.getValue());
        boolean z = list instanceof RandomAccess;
        mx40 mx40Var = this.d;
        return new AbstractMap.SimpleImmutableEntry(key, z ? new p3(mx40Var, key, list, null) : new t3(mx40Var, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        mx40 mx40Var = this.d;
        if (this.c == mx40Var.d) {
            mx40Var.e();
            return;
        }
        k3 k3Var = new k3(this);
        while (k3Var.hasNext()) {
            k3Var.next();
            k3Var.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        j3 j3Var = this.f19336a;
        if (j3Var != null) {
            return j3Var;
        }
        j3 j3Var2 = new j3(this);
        this.f19336a = j3Var2;
        return j3Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.c;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        List list = (List) collection;
        boolean z = list instanceof RandomAccess;
        mx40 mx40Var = this.d;
        return z ? new p3(mx40Var, obj, list, null) : new t3(mx40Var, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        mx40 mx40Var = this.d;
        Set set = mx40Var.f3702a;
        if (set != null) {
            return set;
        }
        Set setD = mx40Var.d();
        mx40Var.f3702a = setD;
        return setD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.c.remove(obj);
        if (collection == null) {
            return null;
        }
        mx40 mx40Var = this.d;
        Collection collectionF = mx40Var.f();
        collectionF.addAll(collection);
        mx40Var.e -= collection.size();
        collection.clear();
        return collectionF;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.c.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        b4 b4Var = this.b;
        if (b4Var != null) {
            return b4Var;
        }
        b4 b4Var2 = new b4(this);
        this.b = b4Var2;
        return b4Var2;
    }
}
