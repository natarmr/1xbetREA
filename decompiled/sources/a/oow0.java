package a;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oow0 extends how0 implements NavigableSet, Iterable {
    public final transient Comparator g;
    public transient oow0 h;

    public oow0(Comparator comparator) {
        super((byte) 2);
        this.g = comparator;
    }

    public static npw0 s(Comparator comparator) {
        if (dpw0.b == comparator) {
            return npw0.j;
        }
        knw0 knw0Var = cow0.e;
        return new npw0(jpw0.h, comparator);
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.g;
    }

    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        npw0 npw0Var = (npw0) this;
        return npw0Var.w(0, npw0Var.t(obj, false));
    }

    public abstract Object last();

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final oow0 descendingSet() {
        oow0 oow0VarS = this.h;
        if (oow0VarS == null) {
            npw0 npw0Var = (npw0) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(npw0Var.g);
            oow0VarS = npw0Var.isEmpty() ? s(comparatorReverseOrder) : new npw0(npw0Var.i.m(), comparatorReverseOrder);
            this.h = oow0VarS;
            oow0VarS.h = this;
        }
        return oow0VarS;
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final npw0 subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.g.compare(obj, obj2) > 0) {
            e9d0.o();
            return null;
        }
        npw0 npw0Var = (npw0) this;
        npw0 npw0VarW = npw0Var.w(npw0Var.v(obj, z), npw0Var.i.size());
        return npw0VarW.w(0, npw0VarW.t(obj2, z2));
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        npw0 npw0Var = (npw0) this;
        return npw0Var.w(npw0Var.v(obj, true), npw0Var.i.size());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        npw0 npw0Var = (npw0) this;
        return npw0Var.w(0, npw0Var.t(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        npw0 npw0Var = (npw0) this;
        return npw0Var.w(npw0Var.v(obj, z), npw0Var.i.size());
    }
}
