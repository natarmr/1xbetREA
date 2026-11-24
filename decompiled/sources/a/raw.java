package a;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class raw implements List, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vy40 f30156a = new vy40(16);
    public final iy40 b = new iy40(16);
    public int c = -1;

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final long b() {
        long jL = vtb.l(Float.POSITIVE_INFINITY, false, false);
        int i = this.c + 1;
        int i2 = this.f30156a.b - 1;
        if (i > i2) {
            return jL;
        }
        while (i >= 0) {
            iy40 iy40Var = this.b;
            if (i >= iy40Var.b) {
                break;
            }
            long j = iy40Var.f15572a[i];
            if (acb.N(j, jL) < 0) {
                jL = j;
            }
            if ((acb.R(jL) < 0.0f && acb.U(jL)) || i == i2) {
                return jL;
            }
            i++;
        }
        v4i0.m("Index must be between 0 and size");
        return 0L;
    }

    public final void c(int i, int i2) {
        iy40 iy40Var;
        int i3;
        if (i >= i2) {
            return;
        }
        this.f30156a.m(i, i2);
        if (i < 0 || i > (i3 = (iy40Var = this.b).b) || i2 < 0 || i2 > i3) {
            v4i0.m("Index must be between 0 and size");
            return;
        }
        if (i2 < i) {
            jf4.o("The end index must be < start index");
        } else if (i2 != i) {
            if (i2 < i3) {
                long[] jArr = iy40Var.f15572a;
                qx3.g(jArr, jArr, i, i2, i3);
            }
            iy40Var.b -= i2 - i;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.c = -1;
        this.f30156a.d();
        this.b.b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof lm40) && indexOf((lm40) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((lm40) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object objG = this.f30156a.g(i);
        objG.getClass();
        return (lm40) objG;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof lm40)) {
            return -1;
        }
        lm40 lm40Var = (lm40) obj;
        vy40 vy40Var = this.f30156a;
        int i = vy40Var.b - 1;
        if (i < 0) {
            return -1;
        }
        int i2 = 0;
        while (!Intrinsics.d(vy40Var.g(i2), lm40Var)) {
            if (i2 == i) {
                return -1;
            }
            i2++;
        }
        return i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f30156a.i();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new paw(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof lm40) {
            lm40 lm40Var = (lm40) obj;
            vy40 vy40Var = this.f30156a;
            for (int i = vy40Var.b - 1; -1 < i; i--) {
                if (Intrinsics.d(vy40Var.g(i), lm40Var)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new paw(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f30156a.b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new qaw(this, i, i2);
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
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new paw(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
