package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s2 implements Iterator, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f31478a;
    public Object b;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.f31478a;
        if (b == 0) {
            this.f31478a = (byte) 3;
            a();
            return this.f31478a == 1;
        }
        if (b == 1) {
            return true;
        }
        if (b == 2) {
            return false;
        }
        jf4.o("hasNext called when the iterator is in the FAILED state.");
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.f31478a;
        if (b == 1) {
            this.f31478a = (byte) 0;
            return this.b;
        }
        if (b != 2) {
            this.f31478a = (byte) 3;
            a();
            if (this.f31478a == 1) {
                this.f31478a = (byte) 0;
                return this.b;
            }
        }
        itt0.a();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
