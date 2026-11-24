package a;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public final class aui0 extends zti0 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f44961a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f44961a.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (this.b.apply(next)) {
                return next;
            }
        }
        itt0.a();
        return null;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new aui0(((SortedSet) this.f44961a).headSet(obj), this.b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f44961a;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.b.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new aui0(((SortedSet) this.f44961a).subSet(obj, obj2), this.b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new aui0(((SortedSet) this.f44961a).tailSet(obj), this.b);
    }
}
