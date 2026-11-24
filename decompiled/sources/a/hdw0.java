package a;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hdw0 extends AbstractCollection implements Serializable {
    public static final Object[] b = new Object[0];
    public static final Object[] c = new Object[0];
    public static final Object[] d = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12892a;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f12892a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f12892a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f12892a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public int e(Object[] objArr) {
        eet0 eet0VarJ = j();
        int i = 0;
        while (eet0VarJ.hasNext()) {
            objArr[i] = eet0VarJ.next();
            i++;
        }
        return i;
    }

    public int f() {
        throw new UnsupportedOperationException();
    }

    public Object[] g() {
        return null;
    }

    public int h() {
        switch (this.f12892a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public int i() {
        throw new UnsupportedOperationException();
    }

    public abstract eet0 j();

    public Object[] k() {
        return null;
    }

    public abstract int l(Object[] objArr);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f12892a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f12892a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f12892a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        switch (this.f12892a) {
            case 0:
                break;
            case 1:
                break;
        }
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f12892a) {
            case 0:
                objArr.getClass();
                int size = size();
                int length = objArr.length;
                if (length < size) {
                    Object[] objArrG = g();
                    if (objArrG != null) {
                        return Arrays.copyOfRange(objArrG, h(), i(), objArr.getClass());
                    }
                    if (length != 0) {
                        objArr = Arrays.copyOf(objArr, 0);
                    }
                    objArr = Arrays.copyOf(objArr, size);
                } else if (length > size) {
                    objArr[size] = null;
                }
                l(objArr);
                return objArr;
            case 1:
                objArr.getClass();
                int size2 = size();
                if (objArr.length < size2) {
                    Object[] objArrK = k();
                    if (objArrK != null) {
                        return Arrays.copyOfRange(objArrK, f(), b(), objArr.getClass());
                    }
                    if (objArr.length != 0) {
                        objArr = Arrays.copyOf(objArr, 0);
                    }
                    objArr = Arrays.copyOf(objArr, size2);
                } else if (objArr.length > size2) {
                    objArr[size2] = null;
                }
                e(objArr);
                return objArr;
            default:
                objArr.getClass();
                int size3 = size();
                int length2 = objArr.length;
                if (length2 < size3) {
                    Object[] objArrK2 = k();
                    if (objArrK2 != null) {
                        return Arrays.copyOfRange(objArrK2, h(), f(), objArr.getClass());
                    }
                    if (length2 != 0) {
                        objArr = Arrays.copyOf(objArr, 0);
                    }
                    objArr = Arrays.copyOf(objArr, size3);
                } else if (length2 > size3) {
                    objArr[size3] = null;
                }
                e(objArr);
                return objArr;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        switch (this.f12892a) {
            case 0:
                return toArray(b);
            case 1:
                return toArray(c);
            default:
                return toArray(d);
        }
    }
}
