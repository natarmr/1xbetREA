package a;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class npw0 extends oow0 {
    public static final npw0 j;
    public final transient cow0 i;

    static {
        knw0 knw0Var = cow0.e;
        j = new npw0(jpw0.h, dpw0.b);
    }

    public npw0(cow0 cow0Var, Comparator comparator) {
        super(comparator);
        this.i = cow0Var;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iV = v(obj, true);
        cow0 cow0Var = this.i;
        if (iV == cow0Var.size()) {
            return null;
        }
        return cow0Var.get(iV);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.i, obj, this.g) >= 0) {
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
        if (collection instanceof apw0) {
            collection = ((apw0) collection).zza();
        }
        Comparator comparator = this.g;
        if (!jtt0.x(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        knw0 knw0VarListIterator = this.i.listIterator(0);
        Iterator it = collection.iterator();
        if (knw0VarListIterator.hasNext()) {
            Object next = it.next();
            Object next2 = knw0VarListIterator.next();
            while (true) {
                try {
                    int iCompare = comparator.compare(next2, next);
                    if (iCompare >= 0) {
                        if (iCompare != 0) {
                            break;
                        }
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    } else {
                        if (!knw0VarListIterator.hasNext()) {
                            break;
                        }
                        next2 = knw0VarListIterator.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.i.m().listIterator(0);
    }

    @Override // a.hdw0
    public final int e(Object[] objArr) {
        return this.i.e(objArr);
    }

    @Override // a.how0, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            cow0 cow0Var = this.i;
            if (cow0Var.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.g;
                if (!jtt0.x(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    knw0 knw0VarListIterator = cow0Var.listIterator(0);
                    while (knw0VarListIterator.hasNext()) {
                        Object next = knw0VarListIterator.next();
                        Object next2 = it.next();
                        if (next2 == null || comparator.compare(next, next2) != 0) {
                        }
                    }
                    return true;
                } catch (ClassCastException | NoSuchElementException unused) {
                }
            }
        }
        return false;
    }

    @Override // a.hdw0
    public final int f() {
        return this.i.f();
    }

    @Override // a.oow0, java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.i.get(0);
        }
        itt0.a();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iT = t(obj, true) - 1;
        if (iT == -1) {
            return null;
        }
        return this.i.get(iT);
    }

    @Override // a.hdw0
    public final int h() {
        return this.i.h();
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iV = v(obj, false);
        cow0 cow0Var = this.i;
        if (iV == cow0Var.size()) {
            return null;
        }
        return cow0Var.get(iV);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.i.listIterator(0);
    }

    @Override // a.hdw0
    public final eet0 j() {
        return this.i.listIterator(0);
    }

    @Override // a.hdw0
    public final Object[] k() {
        return this.i.k();
    }

    @Override // a.oow0, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            itt0.a();
            return null;
        }
        cow0 cow0Var = this.i;
        return cow0Var.get(cow0Var.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iT = t(obj, false) - 1;
        if (iT == -1) {
            return null;
        }
        return this.i.get(iT);
    }

    @Override // a.how0
    public final cow0 m() {
        return this.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.i.size();
    }

    public final int t(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.i, obj, this.g);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    public final int v(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.i, obj, this.g);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    public final npw0 w(int i, int i2) {
        cow0 cow0Var = this.i;
        if (i == 0) {
            if (i2 == cow0Var.size()) {
                return this;
            }
            i = 0;
        }
        Comparator comparator = this.g;
        return i < i2 ? new npw0(cow0Var.subList(i, i2), comparator) : oow0.s(comparator);
    }
}
