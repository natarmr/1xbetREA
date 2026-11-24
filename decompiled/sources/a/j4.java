package a;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class j4 extends b3 {
    @Override // a.u1, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // a.u1, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
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

    public abstract j4 e(int i, Object obj);

    public abstract j4 f(Object obj);

    public j4 g(Collection collection) {
        ii90 ii90VarH = h();
        ii90VarH.addAll(collection);
        return ii90VarH.f();
    }

    public abstract ii90 h();

    @Override // a.b3, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public abstract j4 j(h4 h4Var);

    public abstract j4 k(int i);

    public abstract j4 l(int i, Object obj);

    @Override // a.b3, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // a.b3, java.util.List
    public final List subList(int i, int i2) {
        return new z3x(this, i, i2);
    }
}
