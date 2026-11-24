package a;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ejw0 extends eet0 implements ListIterator {
    public final int b;
    public int c;
    public final hhw0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejw0(hhw0 hhw0Var, int i) {
        super((byte) 2);
        int size = hhw0Var.size();
        dem0.A(i, size);
        this.b = size;
        this.c = i;
        this.d = hhw0Var;
    }

    public final Object a(int i) {
        return this.d.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            itt0.a();
            return null;
        }
        int i = this.c;
        this.c = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            itt0.a();
            return null;
        }
        int i = this.c - 1;
        this.c = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
