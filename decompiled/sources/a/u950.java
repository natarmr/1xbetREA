package a;

import a.rb50;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
@ahi0(with = v950.class)
public final class u950<T extends rb50> implements List<T>, b8m0, RandomAccess, mhy {
    public static final t950 Companion = new t950();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SnapshotStateList f35267a;

    public u950(SnapshotStateList snapshotStateList) {
        this.f35267a = snapshotStateList;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        return this.f35267a.add((rb50) obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.f35267a.addAll(i, collection);
    }

    @Override // a.b8m0
    public final e8m0 b(e8m0 e8m0Var, e8m0 e8m0Var2, e8m0 e8m0Var3) {
        this.f35267a.getClass();
        return null;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f35267a.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof rb50)) {
            return false;
        }
        return this.f35267a.contains((rb50) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f35267a.containsAll(collection);
    }

    @Override // a.b8m0
    public final e8m0 g() {
        return this.f35267a.f45348a;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return (rb50) this.f35267a.get(i);
    }

    @Override // a.b8m0
    public final void h(e8m0 e8m0Var) {
        SnapshotStateList snapshotStateList = this.f35267a;
        e8m0Var.b = snapshotStateList.f45348a;
        snapshotStateList.f45348a = (x7m0) e8m0Var;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof rb50)) {
            return -1;
        }
        return this.f35267a.indexOf((rb50) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f35267a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f35267a.listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof rb50)) {
            return -1;
        }
        return this.f35267a.lastIndexOf((rb50) obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        SnapshotStateList snapshotStateList = this.f35267a;
        snapshotStateList.getClass();
        return new paw(snapshotStateList, i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        if (!(obj instanceof rb50)) {
            return false;
        }
        return this.f35267a.remove((rb50) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f35267a.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f35267a.retainAll(collection);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        return (rb50) this.f35267a.set(i, (rb50) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f35267a.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return this.f35267a.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return wha0.V(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return wha0.W(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.f35267a.addAll(collection);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.f35267a.add(i, (rb50) obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f35267a.listIterator();
    }

    @Override // java.util.List
    public final Object remove(int i) {
        return (rb50) this.f35267a.remove(i);
    }
}
