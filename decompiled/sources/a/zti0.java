package a;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class zti0 extends AbstractCollection implements Set {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection f44961a;
    public final lsb0 b;

    public zti0(Collection collection, lsb0 lsb0Var) {
        this.f44961a = collection;
        this.b = lsb0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        x0x.A(this.b.apply(obj));
        return this.f44961a.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            x0x.A(this.b.apply(it.next()));
        }
        return this.f44961a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Collection collection = this.f44961a;
        boolean z = collection instanceof RandomAccess;
        lsb0 lsb0Var = this.b;
        if (!z || !(collection instanceof List)) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (lsb0Var.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) collection;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!lsb0Var.apply(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        g8x.W(list, lsb0Var, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        g8x.W(list, lsb0Var, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean zContains;
        Collection collection = this.f44961a;
        collection.getClass();
        try {
            zContains = collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.b.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return d7x.u(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return d7x.A(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f44961a.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (this.b.apply(it.next())) {
                break;
            }
            i++;
        }
        return true ^ (i != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f44961a.iterator();
        it.getClass();
        return new dzx(it, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f44961a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f44961a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.b.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f44961a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.b.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f44961a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.b.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            dzx dzxVar = (dzx) it;
            if (!dzxVar.hasNext()) {
                return arrayList.toArray();
            }
            arrayList.add(dzxVar.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            dzx dzxVar = (dzx) it;
            if (dzxVar.hasNext()) {
                arrayList.add(dzxVar.next());
            } else {
                return arrayList.toArray(objArr);
            }
        }
    }
}
