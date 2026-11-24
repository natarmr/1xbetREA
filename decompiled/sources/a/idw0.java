package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class idw0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14606a = 0;
    public final Iterator b;
    public final Iterator c;

    public idw0(rew0 rew0Var, Iterator it, Iterator it2) {
        this.b = it;
        this.c = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f14606a) {
            case 0:
                if (this.b.hasNext()) {
                    return true;
                }
                return this.c.hasNext();
            default:
                return this.b.hasNext() || this.c.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.f14606a;
        Iterator it = this.c;
        Iterator it2 = this.b;
        switch (b) {
            case 0:
                if (it2.hasNext()) {
                    return new slw0(((Integer) it2.next()).toString());
                }
                if (it.hasNext()) {
                    return new slw0((String) it.next());
                }
                itt0.a();
                return null;
            default:
                return it2.hasNext() ? it2.next() : it.next();
        }
    }

    public idw0(Iterator it, Iterator it2) {
        this.b = it;
        this.c = it2;
    }
}
