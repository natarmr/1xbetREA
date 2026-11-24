package a;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c3 implements ListIterator, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3648a;
    public int b;
    public int c;

    public /* synthetic */ c3(int i, int i2, byte b) {
        this.f3648a = b;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        switch (this.f3648a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3648a) {
            case 0:
                return this.b < this.c;
            default:
                return this.b < this.c;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f3648a) {
            case 0:
                return this.b > 0;
            default:
                return this.b > 0;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f3648a) {
            case 0:
                break;
        }
        return this.b;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.f3648a) {
            case 0:
                i = this.b;
                break;
            default:
                i = this.b;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        switch (this.f3648a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        switch (this.f3648a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
