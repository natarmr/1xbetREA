package a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h3 implements Map, khy {
    public static final d3 c = new d3(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile f3 f12361a;
    public volatile g3 b;

    public abstract Set a();

    public Set b() {
        if (this.f12361a == null) {
            this.f12361a = new f3(this);
        }
        f3 f3Var = this.f12361a;
        f3Var.getClass();
        return f3Var;
    }

    public int c() {
        return a().size();
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return e(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set setA = a();
        if (setA.isEmpty()) {
            return false;
        }
        Iterator it = setA.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public Collection d() {
        if (this.b == null) {
            this.b = new g3(this, (byte) 0);
        }
        g3 g3Var = this.b;
        g3Var.getClass();
        return g3Var;
    }

    public final Map.Entry e(Object obj) {
        Object next;
        Iterator it = a().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.d(((Map.Entry) next).getKey(), obj)) {
                return (Map.Entry) next;
            }
        }
        next = null;
        return (Map.Entry) next;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return a();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (c() != map.size()) {
            return false;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : setEntrySet) {
            if (entry == null) {
                return false;
            }
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object obj2 = get(key);
            if (!Intrinsics.d(value, obj2)) {
                return false;
            }
            if (obj2 == null && !containsKey(key)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        Map.Entry entryE = e(obj);
        if (entryE != null) {
            return entryE.getValue();
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return a().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return c() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return b();
    }

    @Override // java.util.Map, a.th90
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return c();
    }

    public final String toString() {
        return CollectionsKt.b0(a(), ", ", "{", "}", new t1(this, (byte) 2), 24);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return d();
    }
}
