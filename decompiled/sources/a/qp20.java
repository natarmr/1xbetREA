package a;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final class qp20 implements Map, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hz40 f29095a;
    public wzn b;
    public wzn c;
    public d5n0 d;

    public qp20(hz40 hz40Var) {
        this.f29095a = hz40Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f29095a.c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f29095a.d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        wzn wznVar = this.b;
        if (wznVar != null) {
            return wznVar;
        }
        wzn wznVar2 = new wzn(this.f29095a, (byte) 0);
        this.b = wznVar2;
        return wznVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qp20.class != obj.getClass()) {
            return false;
        }
        return this.f29095a.equals(((qp20) obj).f29095a);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f29095a.g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f29095a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f29095a.i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        wzn wznVar = this.c;
        if (wznVar != null) {
            return wznVar;
        }
        wzn wznVar2 = new wzn(this.f29095a, (byte) 1);
        this.c = wznVar2;
        return wznVar2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f29095a.e;
    }

    public final String toString() {
        return this.f29095a.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        d5n0 d5n0Var = this.d;
        if (d5n0Var != null) {
            return d5n0Var;
        }
        d5n0 d5n0Var2 = new d5n0(this.f29095a);
        this.d = d5n0Var2;
        return d5n0Var2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
