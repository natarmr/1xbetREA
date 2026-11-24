package a;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i4 extends b3 implements a4x {
    @Override // a.u1, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // a.u1, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract i4 e(q9v q9vVar);

    @Override // a.b3, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // a.b3, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // a.b3, java.util.List
    public final List subList(int i, int i2) {
        return new y3x(this, i, i2);
    }
}
