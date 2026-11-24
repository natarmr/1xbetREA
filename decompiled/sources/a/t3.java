package a;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public class t3 extends AbstractCollection implements List {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f33241a;
    public Collection b;
    public final t3 c;
    public final Collection d;
    public final /* synthetic */ mx40 e;
    public final /* synthetic */ mx40 f;

    public t3(mx40 mx40Var, Object obj, List list, t3 t3Var) {
        this.f = mx40Var;
        this.e = mx40Var;
        this.f33241a = obj;
        this.b = list;
        this.c = t3Var;
        this.d = t3Var == null ? null : t3Var.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        boolean zIsEmpty = this.b.isEmpty();
        boolean zAdd = this.b.add(obj);
        if (zAdd) {
            this.e.e++;
            if (zIsEmpty) {
                b();
            }
        }
        return zAdd;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.b).addAll(i, collection);
        if (zAddAll) {
            this.f.e += this.b.size() - size;
            if (size == 0) {
                b();
            }
        }
        return zAddAll;
    }

    public final void b() {
        t3 t3Var = this.c;
        if (t3Var != null) {
            t3Var.b();
        } else {
            this.e.d.put(this.f33241a, this.b);
        }
    }

    public final void c() {
        Collection collection;
        t3 t3Var = this.c;
        if (t3Var != null) {
            t3Var.c();
            if (t3Var.b == this.d) {
                return;
            }
            jf4.e();
            return;
        }
        if (!this.b.isEmpty() || (collection = (Collection) this.e.d.get(this.f33241a)) == null) {
            return;
        }
        this.b = collection;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.b.clear();
        this.e.e -= size;
        e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        c();
        return this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        c();
        return this.b.containsAll(collection);
    }

    public final void e() {
        t3 t3Var = this.c;
        if (t3Var != null) {
            t3Var.e();
        } else if (this.b.isEmpty()) {
            this.e.d.remove(this.f33241a);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        c();
        return this.b.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        c();
        return ((List) this.b).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        c();
        return this.b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        c();
        return ((List) this.b).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        c();
        return new k3(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        c();
        return ((List) this.b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        c();
        return new s3(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        boolean zRemove = this.b.remove(obj);
        if (zRemove) {
            this.e.e--;
            e();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.b.removeAll(collection);
        if (zRemoveAll) {
            this.e.e += this.b.size() - size;
            e();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.b.retainAll(collection);
        if (zRetainAll) {
            this.e.e += this.b.size() - size;
            e();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        c();
        return ((List) this.b).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        c();
        return this.b.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        c();
        List listSubList = ((List) this.b).subList(i, i2);
        t3 t3Var = this.c;
        if (t3Var == null) {
            t3Var = this;
        }
        boolean z = listSubList instanceof RandomAccess;
        mx40 mx40Var = this.f;
        Object obj = this.f33241a;
        return z ? new p3(mx40Var, obj, listSubList, t3Var) : new t3(mx40Var, obj, listSubList, t3Var);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        c();
        return this.b.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        c();
        return new s3(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        c();
        Object objRemove = ((List) this.b).remove(i);
        this.f.e--;
        e();
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        c();
        boolean zIsEmpty = this.b.isEmpty();
        ((List) this.b).add(i, obj);
        this.f.e++;
        if (zIsEmpty) {
            b();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.b.addAll(collection);
        if (zAddAll) {
            this.e.e += this.b.size() - size;
            if (size == 0) {
                b();
            }
        }
        return zAddAll;
    }
}
