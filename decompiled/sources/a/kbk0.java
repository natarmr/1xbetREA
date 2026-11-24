package a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class kbk0 implements Iterator {
    public static final kbk0 b = new kbk0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18018a;

    public /* synthetic */ kbk0(byte b2) {
        this.f18018a = b2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f18018a) {
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f18018a) {
            case 0:
                throw new NoSuchElementException();
            case 1:
                throw new NoSuchElementException();
            default:
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f18018a) {
            case 0:
                throw new IllegalStateException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
