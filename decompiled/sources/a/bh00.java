package a;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class bh00 extends AbstractSequentialList implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2581a;
    public final tdr b;

    public bh00(List list, tdr tdrVar) {
        list.getClass();
        this.f2581a = list;
        this.b = tdrVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f2581a.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new zg00(this, this.f2581a.listIterator(i), (byte) 1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.f2581a.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2581a.size();
    }
}
