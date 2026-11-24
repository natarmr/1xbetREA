package a;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mls0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f22009a;

    public mls0(Iterator it) {
        it.getClass();
        this.f22009a = it;
    }

    public Object a(Object obj) {
        return ((Map.Entry) obj).getValue();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22009a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f22009a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f22009a.remove();
    }
}
