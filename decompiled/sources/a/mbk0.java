package a;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class mbk0 extends AbstractList implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21514a;
    public Object b;

    public static /* synthetic */ void b(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        if (i < 0 || i > (i2 = this.f21514a)) {
            hny.k(this.f21514a, b1j.m(i, "Index: ", ", Size: "));
            return;
        }
        if (i2 == 0) {
            this.b = obj;
        } else if (i2 == 1 && i == 0) {
            this.b = new Object[]{obj, this.b};
        } else {
            Object[] objArr = new Object[i2 + 1];
            Object obj2 = this.b;
            if (i2 == 1) {
                objArr[0] = obj2;
            } else {
                Object[] objArr2 = (Object[]) obj2;
                System.arraycopy(objArr2, 0, objArr, 0, i);
                System.arraycopy(objArr2, i, objArr, i + 1, this.f21514a - i);
            }
            objArr[i] = obj;
            this.b = objArr;
        }
        this.f21514a++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.b = null;
        this.f21514a = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f21514a)) {
            hny.k(this.f21514a, b1j.m(i, "Index: ", ", Size: "));
            return null;
        }
        Object obj = this.b;
        return i2 == 1 ? obj : ((Object[]) obj)[i];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        int i = this.f21514a;
        if (i == 0) {
            return kbk0.b;
        }
        if (i == 1) {
            return new lbk0(this);
        }
        Iterator it = super.iterator();
        if (it != null) {
            return it;
        }
        b(3);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f21514a)) {
            hny.k(this.f21514a, b1j.m(i, "Index: ", ", Size: "));
            return null;
        }
        Object obj = this.b;
        if (i2 == 1) {
            this.b = null;
        } else {
            Object[] objArr = (Object[]) obj;
            Object obj2 = objArr[i];
            if (i2 == 2) {
                this.b = objArr[1 - i];
            } else {
                int i3 = (i2 - i) - 1;
                if (i3 > 0) {
                    System.arraycopy(objArr, i + 1, objArr, i, i3);
                }
                i2 = this.f21514a;
                objArr[i2 - 1] = null;
            }
            obj = obj2;
        }
        this.f21514a = i2 - 1;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        if (i < 0 || i >= (i2 = this.f21514a)) {
            hny.k(this.f21514a, b1j.m(i, "Index: ", ", Size: "));
            return null;
        }
        Object obj2 = this.b;
        if (i2 == 1) {
            this.b = obj;
            return obj2;
        }
        Object[] objArr = (Object[]) obj2;
        Object obj3 = objArr[i];
        objArr[i] = obj;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21514a;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        int i = this.f21514a;
        if (i >= 2) {
            Arrays.sort((Object[]) this.b, 0, i, comparator);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            b(4);
            throw null;
        }
        int length = objArr.length;
        int i = this.f21514a;
        if (i == 1) {
            if (length == 0) {
                Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 1);
                objArr2[0] = this.b;
                return objArr2;
            }
            objArr[0] = this.b;
        } else {
            if (length < i) {
                Object[] objArrCopyOf = Arrays.copyOf((Object[]) this.b, i, objArr.getClass());
                if (objArrCopyOf != null) {
                    return objArrCopyOf;
                }
                b(6);
                throw null;
            }
            if (i != 0) {
                System.arraycopy(this.b, 0, objArr, 0, i);
            }
        }
        int i2 = this.f21514a;
        if (length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int i = this.f21514a;
        if (i == 0) {
            this.b = obj;
        } else {
            Object obj2 = this.b;
            if (i == 1) {
                this.b = new Object[]{obj2, obj};
            } else {
                Object[] objArr = (Object[]) obj2;
                int length = objArr.length;
                if (i >= length) {
                    int iA = ua80.a(length, 3, 2, 1);
                    int i2 = i + 1;
                    if (iA < i2) {
                        iA = i2;
                    }
                    Object[] objArr2 = new Object[iA];
                    this.b = objArr2;
                    System.arraycopy(objArr, 0, objArr2, 0, length);
                    objArr = objArr2;
                }
                i = this.f21514a;
                objArr[i] = obj;
            }
        }
        this.f21514a = i + 1;
        ((AbstractList) this).modCount++;
        return true;
    }
}
