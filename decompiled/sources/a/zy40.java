package a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class zy40 implements vhy, Set, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xy40 f45188a;
    public final xy40 b;

    public zy40(xy40 xy40Var) {
        this.f45188a = xy40Var;
        this.b = xy40Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.b.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        xy40 xy40Var = this.b;
        int i = xy40Var.g;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            xy40Var.g(it.next());
        }
        return i != xy40Var.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.b.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f45188a.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f45188a.c(it.next())) {
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
        if (obj == null || zy40.class != obj.getClass()) {
            return false;
        }
        return this.f45188a.equals(((zy40) obj).f45188a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f45188a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f45188a.g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new sjt(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.b.h(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int iNumberOfTrailingZeros;
        collection.getClass();
        xy40 xy40Var = this.b;
        int i = xy40Var.g;
        Iterator it = collection.iterator();
        while (true) {
            int i2 = 1;
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int iHashCode = next != null ? next.hashCode() : 0;
            int i4 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
            int i5 = i4 ^ (i4 >>> 16);
            int i6 = i5 & 127;
            int i7 = xy40Var.f;
            int i8 = (i5 >>> 7) & i7;
            while (true) {
                long[] jArr = xy40Var.f41690a;
                int i9 = i8 >> 3;
                int i10 = (i8 & 7) << 3;
                long j = ((jArr[i9 + i2] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
                long j2 = (((long) i6) * 72340172838076673L) ^ j;
                long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (j3 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i8) & i7;
                    int i11 = i2;
                    if (Intrinsics.d(xy40Var.b[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                    j3 &= j3 - 1;
                    i2 = i11;
                }
                int i12 = i2;
                if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i3 += 8;
                i8 = (i8 + i3) & i7;
                i2 = i12;
            }
            if (iNumberOfTrailingZeros >= 0) {
                xy40Var.i(iNumberOfTrailingZeros);
            }
        }
        return i != xy40Var.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.b.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f45188a.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return wha0.W(this, objArr);
    }

    public final String toString() {
        return this.f45188a.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return wha0.V(this);
    }
}
