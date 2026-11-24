package a;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class paw implements ListIterator, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26676a;
    public int b;
    public int c;
    public int d;
    public final Object e;

    public paw(SnapshotStateList snapshotStateList, int i) {
        this.f26676a = (byte) 3;
        this.e = snapshotStateList;
        this.b = i - 1;
        this.c = -1;
        this.d = p8a.W(snapshotStateList);
    }

    public void a() {
        if (((AbstractList) ((jc00) this.e).e).modCount == this.d) {
            return;
        }
        jf4.e();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        byte b = this.f26676a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                jc00 jc00Var = (jc00) obj2;
                int i = this.b;
                this.b = i + 1;
                jc00Var.add(i, obj);
                this.c = -1;
                this.d = ((AbstractList) jc00Var).modCount;
                return;
            case 2:
                b();
                lc00 lc00Var = (lc00) obj2;
                int i2 = this.b;
                this.b = i2 + 1;
                lc00Var.add(i2, obj);
                this.c = -1;
                this.d = ((AbstractList) lc00Var).modCount;
                return;
            default:
                c();
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj2;
                snapshotStateList.add(this.b + 1, obj);
                this.c = -1;
                this.b++;
                this.d = p8a.W(snapshotStateList);
                return;
        }
    }

    public void b() {
        if (((AbstractList) ((lc00) this.e)).modCount == this.d) {
            return;
        }
        jf4.e();
    }

    public void c() {
        if (p8a.W((SnapshotStateList) this.e) == this.d) {
            return;
        }
        jf4.e();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        byte b = this.f26676a;
        Object obj = this.e;
        switch (b) {
            case 0:
                return this.b < this.d;
            case 1:
                return this.b < ((jc00) obj).c;
            case 2:
                return this.b < ((lc00) obj).b;
            default:
                return this.b < ((SnapshotStateList) obj).size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f26676a) {
            case 0:
                return this.b > this.c;
            case 1:
                return this.b > 0;
            case 2:
                return this.b > 0;
            default:
                return this.b >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        byte b = this.f26676a;
        Object obj = this.e;
        switch (b) {
            case 0:
                vy40 vy40Var = ((raw) obj).f30156a;
                int i = this.b;
                this.b = i + 1;
                Object objG = vy40Var.g(i);
                objG.getClass();
                return (lm40) objG;
            case 1:
                a();
                int i2 = this.b;
                jc00 jc00Var = (jc00) obj;
                if (i2 >= jc00Var.c) {
                    itt0.a();
                    return null;
                }
                this.b = i2 + 1;
                this.c = i2;
                return jc00Var.f16254a[jc00Var.b + i2];
            case 2:
                b();
                int i3 = this.b;
                lc00 lc00Var = (lc00) obj;
                if (i3 >= lc00Var.b) {
                    itt0.a();
                    return null;
                }
                this.b = i3 + 1;
                this.c = i3;
                return lc00Var.f19777a[i3];
            default:
                c();
                int i4 = this.b + 1;
                this.c = i4;
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj;
                p8a.i0(i4, snapshotStateList.size());
                Object obj2 = snapshotStateList.get(i4);
                this.b = i4;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f26676a) {
            case 0:
                return this.b - this.c;
            case 1:
                return this.b;
            case 2:
                return this.b;
            default:
                return this.b + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        byte b = this.f26676a;
        Object obj = this.e;
        switch (b) {
            case 0:
                vy40 vy40Var = ((raw) obj).f30156a;
                int i = this.b - 1;
                this.b = i;
                Object objG = vy40Var.g(i);
                objG.getClass();
                return (lm40) objG;
            case 1:
                a();
                int i2 = this.b;
                if (i2 <= 0) {
                    itt0.a();
                    return null;
                }
                int i3 = i2 - 1;
                this.b = i3;
                this.c = i3;
                jc00 jc00Var = (jc00) obj;
                return jc00Var.f16254a[jc00Var.b + i3];
            case 2:
                b();
                int i4 = this.b;
                if (i4 <= 0) {
                    itt0.a();
                    return null;
                }
                int i5 = i4 - 1;
                this.b = i5;
                this.c = i5;
                return ((lc00) obj).f19777a[i5];
            default:
                c();
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj;
                p8a.i0(this.b, snapshotStateList.size());
                int i6 = this.b;
                this.c = i6;
                Object obj2 = snapshotStateList.get(i6);
                this.b--;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.f26676a) {
            case 0:
                return (this.b - this.c) - 1;
            case 1:
                i = this.b;
                break;
            case 2:
                i = this.b;
                break;
            default:
                return this.b;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        byte b = this.f26676a;
        Object obj = this.e;
        switch (b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                jc00 jc00Var = (jc00) obj;
                a();
                int i = this.c;
                if (i == -1) {
                    jf4.n("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                jc00Var.e(i);
                this.b = this.c;
                this.c = -1;
                this.d = ((AbstractList) jc00Var).modCount;
                return;
            case 2:
                lc00 lc00Var = (lc00) obj;
                b();
                int i2 = this.c;
                if (i2 == -1) {
                    jf4.n("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                lc00Var.e(i2);
                this.b = this.c;
                this.c = -1;
                this.d = ((AbstractList) lc00Var).modCount;
                return;
            default:
                c();
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj;
                snapshotStateList.remove(this.c);
                this.b--;
                this.c = -1;
                this.d = p8a.W(snapshotStateList);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        byte b = this.f26676a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i = this.c;
                if (i != -1) {
                    ((jc00) obj2).set(i, obj);
                    return;
                } else {
                    jf4.n("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                b();
                int i2 = this.c;
                if (i2 != -1) {
                    ((lc00) obj2).set(i2, obj);
                    return;
                } else {
                    jf4.n("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj2;
                c();
                int i3 = this.c;
                if (i3 < 0) {
                    jf4.n("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    snapshotStateList.set(i3, obj);
                    this.d = p8a.W(snapshotStateList);
                    return;
                }
        }
    }

    public paw(lc00 lc00Var, int i) {
        this.f26676a = (byte) 2;
        this.e = lc00Var;
        this.b = i;
        this.c = -1;
        this.d = ((AbstractList) lc00Var).modCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public paw(raw rawVar, int i, int i2) {
        this(rawVar, (i2 & 1) != 0 ? 0 : i, 0, rawVar.f30156a.b);
        this.f26676a = (byte) 0;
    }

    public paw(raw rawVar, int i, int i2, int i3) {
        this.f26676a = (byte) 0;
        this.e = rawVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public paw(jc00 jc00Var, int i) {
        this.f26676a = (byte) 1;
        this.e = jc00Var;
        this.b = i;
        this.c = -1;
        this.d = ((AbstractList) jc00Var).modCount;
    }
}
