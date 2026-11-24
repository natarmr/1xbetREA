package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class kgi0 implements Iterator, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18242a;
    public final Object b;
    public boolean c = true;

    public /* synthetic */ kgi0(Object obj, byte b) {
        this.f18242a = b;
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f18242a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.f18242a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (this.c) {
                    this.c = false;
                    return obj;
                }
                itt0.a();
                return null;
            case 1:
                if (this.c) {
                    this.c = false;
                    return obj;
                }
                itt0.a();
                return null;
            default:
                if (this.c) {
                    this.c = false;
                    return ((ll60) obj).f20232a;
                }
                itt0.a();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f18242a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
