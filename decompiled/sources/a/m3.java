package a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class m3 extends bui0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f21088a;
    public final /* synthetic */ mx40 b;

    public m3(mx40 mx40Var, Map map) {
        this.b = mx40Var;
        map.getClass();
        this.f21088a = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            k3 k3Var = (k3) it;
            if (!k3Var.hasNext()) {
                return;
            }
            k3Var.next();
            k3Var.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f21088a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f21088a.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f21088a.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f21088a.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f21088a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new k3(this, this.f21088a.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int size;
        Collection collection = (Collection) this.f21088a.remove(obj);
        if (collection != null) {
            size = collection.size();
            collection.clear();
            this.b.e -= size;
        } else {
            size = 0;
        }
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f21088a.size();
    }
}
