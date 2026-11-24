package a;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class jc00 extends e4 implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f16254a;
    public final int b;
    public int c;
    public final jc00 d;
    public final lc00 e;

    public jc00(Object[] objArr, int i, int i2, jc00 jc00Var, lc00 lc00Var) {
        objArr.getClass();
        this.f16254a = objArr;
        this.b = i;
        this.c = i2;
        this.d = jc00Var;
        this.e = lc00Var;
        ((AbstractList) this).modCount = ((AbstractList) lc00Var).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        k();
        j();
        x2 x2Var = b3.f1878a;
        int i2 = this.c;
        x2Var.getClass();
        x2.c(i, i2);
        h(this.b + i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        k();
        j();
        x2 x2Var = b3.f1878a;
        int i2 = this.c;
        x2Var.getClass();
        x2.c(i, i2);
        int size = collection.size();
        g(this.b + i, collection, size);
        return size > 0;
    }

    @Override // a.e4
    public final int b() {
        j();
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        k();
        j();
        m(this.b, this.c);
    }

    @Override // a.e4
    public final Object e(int i) {
        k();
        j();
        x2 x2Var = b3.f1878a;
        int i2 = this.c;
        x2Var.getClass();
        x2.b(i, i2);
        return l(this.b + i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        j();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f16254a;
            int i = this.c;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (Intrinsics.d(objArr[this.b + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void g(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        lc00 lc00Var = this.e;
        jc00 jc00Var = this.d;
        if (jc00Var != null) {
            jc00Var.g(i, collection, i2);
        } else {
            lc00 lc00Var2 = lc00.e;
            lc00Var.g(i, collection, i2);
        }
        this.f16254a = lc00Var.f19777a;
        this.c += i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        j();
        x2 x2Var = b3.f1878a;
        int i2 = this.c;
        x2Var.getClass();
        x2.b(i, i2);
        return this.f16254a[this.b + i];
    }

    public final void h(int i, Object obj) {
        ((AbstractList) this).modCount++;
        lc00 lc00Var = this.e;
        jc00 jc00Var = this.d;
        if (jc00Var != null) {
            jc00Var.h(i, obj);
        } else {
            lc00 lc00Var2 = lc00.e;
            lc00Var.h(i, obj);
        }
        this.f16254a = lc00Var.f19777a;
        this.c++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        j();
        Object[] objArr = this.f16254a;
        int i = this.c;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.b + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        j();
        for (int i = 0; i < this.c; i++) {
            if (Intrinsics.d(this.f16254a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        j();
        return this.c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j() {
        if (((AbstractList) this.e).modCount == ((AbstractList) this).modCount) {
            return;
        }
        jf4.e();
    }

    public final void k() {
        if (this.e.c) {
            e9d0.b();
        }
    }

    public final Object l(int i) {
        Object objL;
        ((AbstractList) this).modCount++;
        jc00 jc00Var = this.d;
        if (jc00Var != null) {
            objL = jc00Var.l(i);
        } else {
            lc00 lc00Var = lc00.e;
            objL = this.e.l(i);
        }
        this.c--;
        return objL;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        j();
        for (int i = this.c - 1; i >= 0; i--) {
            if (Intrinsics.d(this.f16254a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        j();
        x2 x2Var = b3.f1878a;
        int i2 = this.c;
        x2Var.getClass();
        x2.c(i, i2);
        return new paw(this, i);
    }

    public final void m(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        jc00 jc00Var = this.d;
        if (jc00Var != null) {
            jc00Var.m(i, i2);
        } else {
            lc00 lc00Var = lc00.e;
            this.e.m(i, i2);
        }
        this.c -= i2;
    }

    public final int o(int i, int i2, Collection collection, boolean z) {
        int iO;
        jc00 jc00Var = this.d;
        if (jc00Var != null) {
            iO = jc00Var.o(i, i2, collection, z);
        } else {
            lc00 lc00Var = lc00.e;
            iO = this.e.o(i, i2, collection, z);
        }
        if (iO > 0) {
            ((AbstractList) this).modCount++;
        }
        this.c -= iO;
        return iO;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        k();
        j();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            e(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        k();
        j();
        return o(this.b, this.c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        k();
        j();
        return o(this.b, this.c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        k();
        j();
        x2 x2Var = b3.f1878a;
        int i2 = this.c;
        x2Var.getClass();
        x2.b(i, i2);
        Object[] objArr = this.f16254a;
        int i3 = this.b + i;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        x2 x2Var = b3.f1878a;
        int i3 = this.c;
        x2Var.getClass();
        x2.d(i, i2, i3);
        return new jc00(this.f16254a, this.b + i, i2 - i, this, this.e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        j();
        int length = objArr.length;
        int i = this.c;
        Object[] objArr2 = this.f16254a;
        int i2 = this.b;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        qx3.e(0, i2, i + i2, objArr2, objArr);
        int i3 = this.c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        j();
        return uvw.S(this.f16254a, this.b, this.c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        k();
        j();
        h(this.b + this.c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        k();
        j();
        int size = collection.size();
        g(this.b + this.c, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        j();
        Object[] objArr = this.f16254a;
        int i = this.c;
        int i2 = this.b;
        return qx3.k(objArr, i2, i + i2);
    }
}
