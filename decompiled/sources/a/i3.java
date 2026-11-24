package a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class i3 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f14072a;
    public Object b = null;
    public Collection c = null;
    public Iterator d = ezx.f8692a;
    public final /* synthetic */ mx40 e;

    public i3(mx40 mx40Var) {
        this.e = mx40Var;
        this.f14072a = mx40Var.d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14072a.hasNext() || this.d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f14072a.next();
            this.b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.c = collection;
            this.d = collection.iterator();
        }
        return this.d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.d.remove();
        Collection collection = this.c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f14072a.remove();
        }
        this.e.e--;
    }
}
