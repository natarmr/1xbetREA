package a;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes2.dex */
public final class b5q implements Iterator, khy {
    public final Iterator b;
    public Object d;
    public final /* synthetic */ Sequence e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2016a = 0;
    public int c = -1;

    public b5q(tjt tjtVar) {
        this.e = tjtVar;
        this.b = ((Sequence) tjtVar.c).iterator();
    }

    public void a() {
        Object next;
        c5q c5qVar = (c5q) this.e;
        do {
            Iterator it = this.b;
            if (!it.hasNext()) {
                this.c = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) c5qVar.c.invoke(next)).booleanValue() != c5qVar.b);
        this.d = next;
        this.c = 1;
    }

    public void b() {
        Iterator it = this.b;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((Function1) ((tjt) this.e).b).invoke(next)).booleanValue()) {
                this.c = 1;
                this.d = next;
                return;
            }
        }
        this.c = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2016a) {
            case 0:
                if (this.c == -1) {
                    a();
                }
                return this.c == 1;
            default:
                if (this.c == -1) {
                    b();
                }
                return this.c == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2016a) {
            case 0:
                if (this.c == -1) {
                    a();
                }
                if (this.c == 0) {
                    itt0.a();
                    return null;
                }
                Object obj = this.d;
                this.d = null;
                this.c = -1;
                return obj;
            default:
                if (this.c == -1) {
                    b();
                }
                if (this.c == 0) {
                    itt0.a();
                    return null;
                }
                Object obj2 = this.d;
                this.d = null;
                this.c = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2016a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b5q(c5q c5qVar) {
        this.e = c5qVar;
        this.b = c5qVar.f3783a.iterator();
    }
}
