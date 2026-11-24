package a;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xw3 extends e4 {
    public static final ww3 d = new ww3(null);
    public static final Object[] e = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41591a;
    public Object[] b;
    public int c;

    public xw3(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = e;
        } else {
            if (i <= 0) {
                jf4.o(twn.m(i, "Illegal Capacity: "));
                throw null;
            }
            objArr = new Object[i];
        }
        this.b = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        x2 x2Var = b3.f1878a;
        int i2 = this.c;
        x2Var.getClass();
        x2.c(i, i2);
        if (i == this.c) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        q();
        g(this.c + 1);
        int iO = o(this.f41591a + i);
        int i3 = this.c;
        if (i < ((i3 + 1) >> 1)) {
            if (iO == 0) {
                Object[] objArr = this.b;
                objArr.getClass();
                length = objArr.length - 1;
            } else {
                length = iO - 1;
            }
            int length2 = this.f41591a;
            if (length2 == 0) {
                Object[] objArr2 = this.b;
                objArr2.getClass();
                length2 = objArr2.length;
            }
            int i4 = length2 - 1;
            int i5 = this.f41591a;
            Object[] objArr3 = this.b;
            if (length >= i5) {
                objArr3[i4] = objArr3[i5];
                qx3.e(i5, i5 + 1, length + 1, objArr3, objArr3);
            } else {
                qx3.e(i5 - 1, i5, objArr3.length, objArr3, objArr3);
                Object[] objArr4 = this.b;
                objArr4[objArr4.length - 1] = objArr4[0];
                qx3.e(0, 1, length + 1, objArr4, objArr4);
            }
            this.b[length] = obj;
            this.f41591a = i4;
        } else {
            int iO2 = o(i3 + this.f41591a);
            Object[] objArr5 = this.b;
            if (iO < iO2) {
                qx3.e(iO + 1, iO, iO2, objArr5, objArr5);
            } else {
                qx3.e(1, 0, iO2, objArr5, objArr5);
                Object[] objArr6 = this.b;
                objArr6[0] = objArr6[objArr6.length - 1];
                qx3.e(iO + 1, iO, objArr6.length - 1, objArr6, objArr6);
            }
            this.b[iO] = obj;
        }
        this.c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        x2 x2Var = b3.f1878a;
        int i2 = this.c;
        x2Var.getClass();
        x2.c(i, i2);
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.c) {
            return addAll(collection);
        }
        q();
        g(collection.size() + this.c);
        int iO = o(this.c + this.f41591a);
        int iO2 = o(this.f41591a + i);
        int size = collection.size();
        if (i >= ((this.c + 1) >> 1)) {
            int i3 = iO2 + size;
            Object[] objArr = this.b;
            if (iO2 < iO) {
                int i4 = size + iO;
                if (i4 <= objArr.length) {
                    qx3.e(i3, iO2, iO, objArr, objArr);
                } else if (i3 >= objArr.length) {
                    qx3.e(i3 - objArr.length, iO2, iO, objArr, objArr);
                } else {
                    int length = iO - (i4 - objArr.length);
                    qx3.e(0, length, iO, objArr, objArr);
                    Object[] objArr2 = this.b;
                    qx3.e(i3, iO2, length, objArr2, objArr2);
                }
            } else {
                qx3.e(size, 0, iO, objArr, objArr);
                Object[] objArr3 = this.b;
                if (i3 >= objArr3.length) {
                    qx3.e(i3 - objArr3.length, iO2, objArr3.length, objArr3, objArr3);
                } else {
                    qx3.e(0, objArr3.length - size, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.b;
                    qx3.e(i3, iO2, objArr4.length - size, objArr4, objArr4);
                }
            }
            f(iO2, collection);
            return true;
        }
        int i5 = this.f41591a;
        int length2 = i5 - size;
        Object[] objArr5 = this.b;
        if (iO2 < i5) {
            qx3.e(length2, i5, objArr5.length, objArr5, objArr5);
            Object[] objArr6 = this.b;
            if (size >= iO2) {
                qx3.e(objArr6.length - size, 0, iO2, objArr6, objArr6);
            } else {
                qx3.e(objArr6.length - size, 0, size, objArr6, objArr6);
                Object[] objArr7 = this.b;
                qx3.e(0, size, iO2, objArr7, objArr7);
            }
        } else if (length2 >= 0) {
            qx3.e(length2, i5, iO2, objArr5, objArr5);
        } else {
            length2 += objArr5.length;
            int i6 = iO2 - i5;
            int length3 = objArr5.length - length2;
            if (length3 >= i6) {
                qx3.e(length2, i5, iO2, objArr5, objArr5);
            } else {
                qx3.e(length2, i5, i5 + length3, objArr5, objArr5);
                Object[] objArr8 = this.b;
                qx3.e(0, this.f41591a + length3, iO2, objArr8, objArr8);
            }
        }
        this.f41591a = length2;
        f(l(iO2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        q();
        g(this.c + 1);
        int length = this.f41591a;
        if (length == 0) {
            Object[] objArr = this.b;
            objArr.getClass();
            length = objArr.length;
        }
        int i = length - 1;
        this.f41591a = i;
        this.b[i] = obj;
        this.c++;
    }

    public final void addLast(Object obj) {
        q();
        g(b() + 1);
        this.b[o(b() + this.f41591a)] = obj;
        this.c = b() + 1;
    }

    @Override // a.e4
    public final int b() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            q();
            m(this.f41591a, o(b() + this.f41591a));
        }
        this.f41591a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // a.e4
    public final Object e(int i) {
        x2 x2Var = b3.f1878a;
        int i2 = this.c;
        x2Var.getClass();
        x2.b(i, i2);
        if (i == b() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        q();
        int iO = o(this.f41591a + i);
        Object[] objArr = this.b;
        Object obj = objArr[iO];
        int i3 = this.c >> 1;
        int i4 = this.f41591a;
        if (i < i3) {
            if (iO >= i4) {
                qx3.e(i4 + 1, i4, iO, objArr, objArr);
            } else {
                qx3.e(1, 0, iO, objArr, objArr);
                Object[] objArr2 = this.b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.f41591a;
                qx3.e(i5 + 1, i5, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.b;
            int i6 = this.f41591a;
            objArr3[i6] = null;
            this.f41591a = j(i6);
        } else {
            int iO2 = o((b() - 1) + i4);
            Object[] objArr4 = this.b;
            if (iO <= iO2) {
                qx3.e(iO, iO + 1, iO2 + 1, objArr4, objArr4);
            } else {
                qx3.e(iO, iO + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.b;
                objArr5[objArr5.length - 1] = objArr5[0];
                qx3.e(0, 1, iO2 + 1, objArr5, objArr5);
            }
            this.b[iO2] = null;
        }
        this.c--;
        return obj;
    }

    public final void f(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.b.length;
        while (i < length && it.hasNext()) {
            this.b[i] = it.next();
            i++;
        }
        int i2 = this.f41591a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.b[i3] = it.next();
        }
        this.c = collection.size() + this.c;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.b[this.f41591a];
        }
        v4i0.o("ArrayDeque is empty.");
        return null;
    }

    public final void g(int i) {
        if (i < 0) {
            jf4.n("Deque is too big.");
            return;
        }
        Object[] objArr = this.b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == e) {
            if (i < 10) {
                i = 10;
            }
            this.b = new Object[i];
            return;
        }
        x2 x2Var = b3.f1878a;
        int length = objArr.length;
        x2Var.getClass();
        Object[] objArr2 = new Object[x2.e(length, i)];
        Object[] objArr3 = this.b;
        qx3.e(0, this.f41591a, objArr3.length, objArr3, objArr2);
        Object[] objArr4 = this.b;
        int length2 = objArr4.length;
        int i2 = this.f41591a;
        qx3.e(length2 - i2, 0, i2, objArr4, objArr2);
        this.f41591a = 0;
        this.b = objArr2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        x2 x2Var = b3.f1878a;
        int i2 = this.c;
        x2Var.getClass();
        x2.b(i, i2);
        return this.b[o(this.f41591a + i)];
    }

    public final Object h() {
        if (isEmpty()) {
            return null;
        }
        return this.b[this.f41591a];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iO = o(b() + this.f41591a);
        int length = this.f41591a;
        if (length < iO) {
            while (length < iO) {
                if (Intrinsics.d(obj, this.b[length])) {
                    i = this.f41591a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.f41591a) < iO) {
            return -1;
        }
        int length2 = this.b.length;
        while (length < length2) {
            if (Intrinsics.d(obj, this.b[length])) {
                i = this.f41591a;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iO; i2++) {
            if (Intrinsics.d(obj, this.b[i2])) {
                length = i2 + this.b.length;
                i = this.f41591a;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return b() == 0;
    }

    public final int j(int i) {
        Object[] objArr = this.b;
        objArr.getClass();
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final Object k() {
        if (isEmpty()) {
            return null;
        }
        return this.b[o((size() - 1) + this.f41591a)];
    }

    public final int l(int i) {
        return i < 0 ? i + this.b.length : i;
    }

    public final Object last() {
        if (isEmpty()) {
            v4i0.o("ArrayDeque is empty.");
            return null;
        }
        return this.b[o((size() - 1) + this.f41591a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr;
        int length;
        int i;
        int iO = o(this.c + this.f41591a);
        int i2 = this.f41591a;
        if (i2 < iO) {
            length = iO - 1;
            if (i2 <= length) {
                while (!Intrinsics.d(obj, this.b[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f41591a;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.f41591a >= iO) {
            do {
                iO--;
                objArr = this.b;
                if (-1 >= iO) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.f41591a;
                    if (i3 <= length) {
                        while (!Intrinsics.d(obj, this.b[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.f41591a;
                    }
                }
                return length - i;
            } while (!Intrinsics.d(obj, objArr[iO]));
            length = iO + this.b.length;
            i = this.f41591a;
            return length - i;
        }
        return -1;
    }

    public final void m(int i, int i2) {
        Object[] objArr = this.b;
        if (i < i2) {
            qx3.l(i, i2, null, objArr);
        } else {
            qx3.l(i, objArr.length, null, objArr);
            qx3.l(0, i2, null, this.b);
        }
    }

    public final int o(int i) {
        Object[] objArr = this.b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void q() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        e(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iO;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int iO2 = o(b() + this.f41591a);
            int i = this.f41591a;
            if (i < iO2) {
                iO = i;
                while (true) {
                    objArr = this.b;
                    if (i >= iO2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.b[iO] = obj;
                        iO++;
                    }
                    i++;
                }
                qx3.l(iO, iO2, null, objArr);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.b[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iO = o(i2);
                for (int i3 = 0; i3 < iO2; i3++) {
                    Object[] objArr3 = this.b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.b[iO] = obj3;
                        iO = j(iO);
                    }
                }
                z = z2;
            }
            if (z) {
                q();
                this.c = l(iO - this.f41591a);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            v4i0.o("ArrayDeque is empty.");
            return null;
        }
        q();
        Object[] objArr = this.b;
        int i = this.f41591a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f41591a = j(i);
        this.c = b() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            v4i0.o("ArrayDeque is empty.");
            return null;
        }
        q();
        int iO = o((size() - 1) + this.f41591a);
        Object[] objArr = this.b;
        Object obj = objArr[iO];
        objArr[iO] = null;
        this.c = b() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        x2 x2Var = b3.f1878a;
        int i3 = this.c;
        x2Var.getClass();
        x2.d(i, i2, i3);
        int i4 = i2 - i;
        if (i4 == 0) {
            return;
        }
        if (i4 == this.c) {
            clear();
            return;
        }
        if (i4 == 1) {
            e(i);
            return;
        }
        q();
        int i5 = this.c - i2;
        int i6 = this.f41591a;
        if (i < i5) {
            int iO = o((i - 1) + i6);
            int iO2 = o(this.f41591a + (i2 - 1));
            while (i > 0) {
                int i7 = iO + 1;
                int iMin = Math.min(i, Math.min(i7, iO2 + 1));
                Object[] objArr = this.b;
                int i8 = iO2 - iMin;
                int i9 = iO - iMin;
                qx3.e(i8 + 1, i9 + 1, i7, objArr, objArr);
                iO = l(i9);
                iO2 = l(i8);
                i -= iMin;
            }
            int iO3 = o(this.f41591a + i4);
            m(this.f41591a, iO3);
            this.f41591a = iO3;
        } else {
            int iO4 = o(i6 + i2);
            int iO5 = o(this.f41591a + i);
            int i10 = this.c;
            while (true) {
                i10 -= i2;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.b;
                i2 = Math.min(i10, Math.min(objArr2.length - iO4, objArr2.length - iO5));
                Object[] objArr3 = this.b;
                int i11 = iO4 + i2;
                qx3.e(iO5, iO4, i11, objArr3, objArr3);
                iO4 = o(i11);
                iO5 = o(iO5 + i2);
            }
            int iO6 = o(this.c + this.f41591a);
            m(l(iO6 - i4), iO6);
        }
        this.c -= i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iO;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int iO2 = o(b() + this.f41591a);
            int i = this.f41591a;
            if (i < iO2) {
                iO = i;
                while (true) {
                    objArr = this.b;
                    if (i >= iO2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.b[iO] = obj;
                        iO++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                qx3.l(iO, iO2, null, objArr);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iO = o(i2);
                for (int i3 = 0; i3 < iO2; i3++) {
                    Object[] objArr3 = this.b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.b[iO] = obj3;
                        iO = j(iO);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                q();
                this.c = l(iO - this.f41591a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        x2 x2Var = b3.f1878a;
        int i2 = this.c;
        x2Var.getClass();
        x2.b(i, i2);
        int iO = o(this.f41591a + i);
        Object[] objArr = this.b;
        Object obj2 = objArr[iO];
        objArr[iO] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.c;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int iO = o(this.c + this.f41591a);
        int i2 = this.f41591a;
        if (i2 < iO) {
            qx3.i(i2, iO, 2, this.b, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.b;
            qx3.e(0, this.f41591a, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.b;
            qx3.e(objArr3.length - this.f41591a, 0, iO, objArr3, objArr);
        }
        int i3 = this.c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public xw3() {
        this.b = e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        q();
        g(collection.size() + b());
        f(o(b() + this.f41591a), collection);
        return true;
    }
}
