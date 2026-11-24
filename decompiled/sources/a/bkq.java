package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class bkq implements Iterator, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f2761a;
    public Iterator b;
    public byte c;
    public final /* synthetic */ ckq d;

    public bkq(ckq ckqVar) {
        this.d = ckqVar;
        this.f2761a = ckqVar.f4519a.iterator();
    }

    public final boolean a() {
        Iterator it;
        Iterator it2 = this.b;
        if (it2 != null && it2.hasNext()) {
            this.c = (byte) 1;
            return true;
        }
        do {
            Iterator it3 = this.f2761a;
            if (!it3.hasNext()) {
                this.c = (byte) 2;
                this.b = null;
                return false;
            }
            Object next = it3.next();
            ckq ckqVar = this.d;
            it = (Iterator) ckqVar.c.invoke(ckqVar.b.invoke(next));
        } while (!it.hasNext());
        this.b = it;
        this.c = (byte) 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.c;
        if (b == 1) {
            return true;
        }
        if (b == 2) {
            return false;
        }
        return a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.c;
        if (b == 2) {
            itt0.a();
            return null;
        }
        if (b == 0 && !a()) {
            itt0.a();
            return null;
        }
        this.c = (byte) 0;
        Iterator it = this.b;
        it.getClass();
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
