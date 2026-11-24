package a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class lz40 implements vhy, Set, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz40 f20890a;
    public final iz40 b;

    public lz40(iz40 iz40Var) {
        this.f20890a = iz40Var;
        this.b = iz40Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.b.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        iz40 iz40Var = this.b;
        int i = iz40Var.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            iz40Var.k(it.next());
        }
        return i != iz40Var.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.b.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f20890a.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f20890a.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lz40.class != obj.getClass()) {
            return false;
        }
        return this.f20890a.equals(((lz40) obj).f20890a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f20890a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f20890a.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new sjt(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.b.l(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        iz40 iz40Var = this.b;
        int i = iz40Var.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            iz40Var.i(it.next());
        }
        return i != iz40Var.d;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0053 A[LOOP:0: B:5:0x0014->B:17:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0056 A[EDGE_INSN: B:24:0x0056->B:18:0x0056 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x0053], SYNTHETIC] */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        iz40 iz40Var = this.b;
        Object[] objArr = iz40Var.b;
        int i = iz40Var.d;
        long[] jArr = iz40Var.f15620a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!CollectionsKt.L(collection, objArr[i5])) {
                                iz40Var.m(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != iz40Var.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f20890a.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return wha0.W(this, objArr);
    }

    public final String toString() {
        return this.f20890a.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return wha0.V(this);
    }
}
