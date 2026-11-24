package a;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class lx3 implements Collection, Set, lhy, vhy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f20795a = jd8.h;
    public Object[] b = jd8.j;
    public int c;

    public lx3(int i) {
        if (i > 0) {
            kc5.K0(this, i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iQ0;
        int i2 = this.c;
        if (obj == null) {
            iQ0 = kc5.Q0(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iQ0 = kc5.Q0(this, obj, iHashCode);
        }
        if (iQ0 >= 0) {
            return false;
        }
        int i3 = ~iQ0;
        int[] iArr = this.f20795a;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.b;
            int[] iArr2 = new int[i4];
            this.f20795a = iArr2;
            this.b = new Object[i4];
            if (i2 != this.c) {
                jf4.e();
                return false;
            }
            if (iArr2.length != 0) {
                qx3.h(0, iArr.length, 6, iArr, iArr2);
                qx3.i(0, objArr.length, 6, objArr, this.b);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.f20795a;
            int i5 = i3 + 1;
            qx3.d(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.b;
            qx3.e(i5, i3, i2, objArr2, objArr2);
        }
        int i6 = this.c;
        if (i2 == i6) {
            int[] iArr4 = this.f20795a;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.b[i3] = obj;
                this.c = i6 + 1;
                return true;
            }
        }
        jf4.e();
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.c;
        int i = this.c;
        int[] iArr = this.f20795a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.b;
            int[] iArr2 = new int[size];
            this.f20795a = iArr2;
            this.b = new Object[size];
            if (i > 0) {
                qx3.h(0, i, 6, iArr, iArr2);
                qx3.i(0, this.c, 6, objArr, this.b);
            }
        }
        if (this.c != i) {
            jf4.e();
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final Object b(int i) {
        int i2 = this.c;
        Object[] objArr = this.b;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.f20795a;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                qx3.d(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.b;
                qx3.e(i, i4, i2, objArr2, objArr2);
            }
            this.b[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.f20795a = iArr2;
            this.b = new Object[i5];
            if (i > 0) {
                qx3.h(0, i, 6, iArr, iArr2);
                qx3.i(0, i, 6, objArr, this.b);
            }
            if (i < i3) {
                int i6 = i + 1;
                qx3.d(i, i6, i2, iArr, this.f20795a);
                qx3.e(i, i6, i2, objArr, this.b);
            }
        }
        if (i2 == this.c) {
            this.c = i3;
            return obj;
        }
        jf4.e();
        return null;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.c;
        if (i != 0) {
            this.f20795a = jd8.h;
            this.b = jd8.j;
            i = 0;
            this.c = 0;
        }
        if (i == 0) {
            return;
        }
        jf4.e();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? kc5.Q0(this, null, 0) : kc5.Q0(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.c;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.b[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f20795a;
        int i = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new bx3(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iQ0 = obj == null ? kc5.Q0(this, null, 0) : kc5.Q0(this, obj, obj.hashCode());
        if (iQ0 < 0) {
            return false;
        }
        b(iQ0);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.c - 1; -1 < i; i--) {
            if (!CollectionsKt.L(collection, this.b[i])) {
                b(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        qx3.e(0, 0, this.c, this.b, objArr);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 14);
        sb.append('{');
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return qx3.k(this.b, 0, this.c);
    }
}
