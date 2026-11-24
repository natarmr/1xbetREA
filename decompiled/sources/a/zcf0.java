package a;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zcf0 extends j4x {
    public static final zcf0 h;
    public final transient b4x g;

    static {
        v3x v3xVar = b4x.b;
        h = new zcf0(rcf0.e, s950.b);
    }

    public zcf0(b4x b4xVar, Comparator comparator) {
        super(comparator);
        this.g = b4xVar;
    }

    @Override // a.f4x, a.s3x
    public final b4x b() {
        return this.g;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iW = w(obj, true);
        b4x b4xVar = this.g;
        if (iW == b4xVar.size()) {
            return null;
        }
        return b4xVar.get(iW);
    }

    @Override // a.s3x, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.g, obj, this.d) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof xcf0) {
            collection = ((xcf0) collection).k();
        }
        Comparator comparator = this.d;
        if (!cww.w(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        eet0 it = iterator();
        Iterator it2 = collection.iterator();
        v3x v3xVar = (v3x) it;
        if (!v3xVar.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = v3xVar.next();
        while (true) {
            try {
                int iCompare = comparator.compare(next2, next);
                if (iCompare < 0) {
                    if (!v3xVar.hasNext()) {
                        return false;
                    }
                    next2 = v3xVar.next();
                } else if (iCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iCompare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.g.y().listIterator(0);
    }

    @Override // a.s3x
    public final int e(int i, Object[] objArr) {
        return this.g.e(i, objArr);
    }

    @Override // a.f4x, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.g.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.d;
        if (!cww.w(comparator, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            eet0 it2 = iterator();
            do {
                v3x v3xVar = (v3x) it2;
                if (!v3xVar.hasNext()) {
                    return true;
                }
                next = v3xVar.next();
                next2 = it.next();
                if (next2 == null) {
                    return false;
                }
            } while (comparator.compare(next, next2) == 0);
            return false;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // a.s3x
    public final Object[] f() {
        return this.g.f();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.g.get(0);
        }
        itt0.a();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iV = v(obj, true) - 1;
        if (iV == -1) {
            return null;
        }
        return this.g.get(iV);
    }

    @Override // a.s3x
    public final int g() {
        return this.g.g();
    }

    @Override // a.s3x
    public final int h() {
        return this.g.h();
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iW = w(obj, false);
        b4x b4xVar = this.g;
        if (iW == b4xVar.size()) {
            return null;
        }
        return b4xVar.get(iW);
    }

    @Override // a.s3x
    public final boolean i() {
        return this.g.i();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: j */
    public final eet0 iterator() {
        return this.g.listIterator(0);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            itt0.a();
            return null;
        }
        b4x b4xVar = this.g;
        return b4xVar.get(b4xVar.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iV = v(obj, false) - 1;
        if (iV == -1) {
            return null;
        }
        return this.g.get(iV);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g.size();
    }

    public final zcf0 t(int i, int i2) {
        b4x b4xVar = this.g;
        if (i == 0 && i2 == b4xVar.size()) {
            return this;
        }
        Comparator comparator = this.d;
        return i < i2 ? new zcf0(b4xVar.subList(i, i2), comparator) : j4x.r(comparator);
    }

    public final int v(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.g, obj, this.d);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    public final int w(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.g, obj, this.d);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }
}
