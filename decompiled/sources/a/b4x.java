package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b4x extends s3x implements List, RandomAccess {
    public static final v3x b = new v3x(rcf0.e, 0);

    public static rcf0 F(Comparator comparator, List list) {
        comparator.getClass();
        if (list == null) {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            list = arrayList;
        }
        Object[] array = list.toArray();
        h8x.w(array.length, array);
        Arrays.sort(array, comparator);
        return k(array.length, array);
    }

    public static rcf0 k(int i, Object[] objArr) {
        return i == 0 ? rcf0.e : new rcf0(i, objArr);
    }

    public static u3x l() {
        return new u3x(4);
    }

    public static u3x m(int i) {
        e3c.s(i, "expectedSize");
        return new u3x(i);
    }

    public static b4x o(Collection collection) {
        if (!(collection instanceof s3x)) {
            Object[] array = collection.toArray();
            h8x.w(array.length, array);
            return k(array.length, array);
        }
        b4x b4xVarB = ((s3x) collection).b();
        if (!b4xVarB.i()) {
            return b4xVarB;
        }
        Object[] array2 = b4xVarB.toArray(s3x.f31578a);
        return k(array2.length, array2);
    }

    public static rcf0 q(Object[] objArr) {
        if (objArr.length == 0) {
            return rcf0.e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        h8x.w(objArr2.length, objArr2);
        return k(objArr2.length, objArr2);
    }

    public static rcf0 s(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        h8x.w(5, objArr);
        return k(5, objArr);
    }

    public static rcf0 t(Object obj) {
        Object[] objArr = {obj};
        h8x.w(1, objArr);
        return k(1, objArr);
    }

    public static rcf0 v(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        h8x.w(2, objArr);
        return k(2, objArr);
    }

    public static rcf0 w(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Object... objArr) {
        x0x.z("the total number of elements must fit in an int", objArr.length <= 2147483635);
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        objArr2[6] = str7;
        objArr2[7] = str8;
        objArr2[8] = str9;
        objArr2[9] = str10;
        objArr2[10] = str11;
        objArr2[11] = str12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        h8x.w(length, objArr2);
        return k(length, objArr2);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public b4x subList(int i, int i2) {
        x0x.I(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? rcf0.e : new x3x(this, i, i3);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // a.s3x, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // a.s3x
    public int e(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && Objects.equals(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (Objects.equals(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // a.s3x
    /* JADX INFO: renamed from: j */
    public final eet0 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final v3x listIterator(int i) {
        x0x.H(i, size());
        return isEmpty() ? b : new v3x(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public b4x y() {
        return size() <= 1 ? this : new w3x(this);
    }

    @Override // a.s3x
    public final b4x b() {
        return this;
    }
}
