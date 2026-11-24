package a;

import java.util.Iterator;
import kotlin.collections.IndexedValue;

/* JADX INFO: loaded from: classes2.dex */
public final class iil implements Iterator, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14833a = 0;
    public final Iterator b;
    public int c;

    public iil(jil jilVar) {
        this.b = jilVar.f16580a.iterator();
        this.c = jilVar.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.f14833a;
        Iterator it = this.b;
        switch (b) {
            case 0:
                break;
            default:
                return it.hasNext();
        }
        while (this.c > 0 && it.hasNext()) {
            it.next();
            this.c--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.f14833a;
        Iterator it = this.b;
        switch (b) {
            case 0:
                break;
            default:
                int i = this.c;
                this.c = i + 1;
                if (i >= 0) {
                    return new IndexedValue(i, it.next());
                }
                q3d.p();
                throw null;
        }
        while (this.c > 0 && it.hasNext()) {
            it.next();
            this.c--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f14833a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public iil(Iterator it) {
        it.getClass();
        this.b = it;
    }
}
