package a;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class lc00 extends e4 implements List, RandomAccess, Serializable {
    private static final kc00 d = new kc00(null);
    public static final lc00 e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f19777a;
    public int b;
    public boolean c;

    static {
        lc00 lc00Var = new lc00(0);
        lc00Var.c = true;
        e = lc00Var;
    }

    public lc00(int i) {
        if (i >= 0) {
            this.f19777a = new Object[i];
        } else {
            jf4.o("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        j();
        x2 x2Var = b3.f1878a;
        int i2 = this.b;
        x2Var.getClass();
        x2.c(i, i2);
        ((AbstractList) this).modCount++;
        k(i, 1);
        this.f19777a[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        j();
        x2 x2Var = b3.f1878a;
        int i2 = this.b;
        x2Var.getClass();
        x2.c(i, i2);
        int size = collection.size();
        g(i, collection, size);
        return size > 0;
    }

    @Override // a.e4
    public final int b() {
        return this.b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        j();
        m(0, this.b);
    }

    @Override // a.e4
    public final Object e(int i) {
        j();
        x2 x2Var = b3.f1878a;
        int i2 = this.b;
        x2Var.getClass();
        x2.b(i, i2);
        return l(i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f19777a;
            int i = this.b;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (Intrinsics.d(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void g(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        k(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f19777a[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        x2 x2Var = b3.f1878a;
        int i2 = this.b;
        x2Var.getClass();
        x2.b(i, i2);
        return this.f19777a[i];
    }

    public final void h(int i, Object obj) {
        ((AbstractList) this).modCount++;
        k(i, 1);
        this.f19777a[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f19777a;
        int i = this.b;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.b; i++) {
            if (Intrinsics.d(this.f19777a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j() {
        if (this.c) {
            e9d0.b();
        }
    }

    public final void k(int i, int i2) {
        int i3 = this.b + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArrCopyOf = this.f19777a;
        if (i3 > objArrCopyOf.length) {
            x2 x2Var = b3.f1878a;
            int length = objArrCopyOf.length;
            x2Var.getClass();
            int iE = x2.e(length, i3);
            Object[] objArr = this.f19777a;
            objArr.getClass();
            objArrCopyOf = Arrays.copyOf(objArr, iE);
            this.f19777a = objArrCopyOf;
        }
        qx3.e(i + i2, i, this.b, objArrCopyOf, objArrCopyOf);
        this.b += i2;
    }

    public final Object l(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f19777a;
        Object obj = objArr[i];
        qx3.e(i, i + 1, this.b, objArr, objArr);
        Object[] objArr2 = this.f19777a;
        int i2 = this.b - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.b--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.b - 1; i >= 0; i--) {
            if (Intrinsics.d(this.f19777a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        x2 x2Var = b3.f1878a;
        int i2 = this.b;
        x2Var.getClass();
        x2.c(i, i2);
        return new paw(this, i);
    }

    public final void m(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f19777a;
        qx3.e(i, i + i2, this.b, objArr, objArr);
        Object[] objArr2 = this.f19777a;
        int i3 = this.b;
        uvw.N(objArr2, i3 - i2, i3);
        this.b -= i2;
    }

    public final int o(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.f19777a;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.f19777a;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        qx3.e(i + i4, i2 + i, this.b, objArr, objArr);
        Object[] objArr3 = this.f19777a;
        int i7 = this.b;
        uvw.N(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.b -= i6;
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        j();
        return o(0, this.b, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        j();
        return o(0, this.b, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        j();
        x2 x2Var = b3.f1878a;
        int i2 = this.b;
        x2Var.getClass();
        x2.b(i, i2);
        Object[] objArr = this.f19777a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        x2 x2Var = b3.f1878a;
        int i3 = this.b;
        x2Var.getClass();
        x2.d(i, i2, i3);
        return new jc00(this.f19777a, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.b;
        Object[] objArr2 = this.f19777a;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        qx3.e(0, 0, i, objArr2, objArr);
        int i2 = this.b;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return uvw.S(this.f19777a, 0, this.b, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public /* synthetic */ lc00(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    public lc00() {
        this(0, 1, null);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        j();
        int i = this.b;
        ((AbstractList) this).modCount++;
        k(i, 1);
        this.f19777a[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        j();
        int size = collection.size();
        g(this.b, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return qx3.k(this.f19777a, 0, this.b);
    }
}
