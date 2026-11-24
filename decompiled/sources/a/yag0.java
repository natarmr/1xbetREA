package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class yag0 extends e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f42296a;

    public yag0(ArrayList arrayList) {
        this.f42296a = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f42296a.add(x3d.C(i, this), obj);
    }

    @Override // a.e4
    public final int b() {
        return this.f42296a.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f42296a.clear();
    }

    @Override // a.e4
    public final Object e(int i) {
        return this.f42296a.remove(x3d.B(i, this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f42296a.get(x3d.B(i, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new xag0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new xag0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.f42296a.set(x3d.B(i, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new xag0(this, i);
    }
}
