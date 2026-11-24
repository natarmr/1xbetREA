package a;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e3 implements Iterator, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7110a;
    public final Iterator b;

    public e3(p4u0 p4u0Var) {
        this.f7110a = (byte) 2;
        this.b = p4u0Var.j.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f7110a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f7110a) {
            case 0:
                return ((Map.Entry) this.b.next()).getKey();
            case 1:
                return ((Map.Entry) this.b.next()).getValue();
            default:
                return (r4u0) this.b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f7110a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ e3(Iterator it, byte b) {
        this.f7110a = b;
        this.b = it;
    }
}
