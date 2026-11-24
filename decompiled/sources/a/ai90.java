package a;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ai90 implements Iterator, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f913a;
    public Object b;
    public final Map c;
    public int d;

    public /* synthetic */ ai90(Object obj, Map map, byte b) {
        this.f913a = b;
        this.b = obj;
        this.c = map;
    }

    public wb00 a() {
        if (!hasNext()) {
            itt0.a();
            return null;
        }
        Object obj = this.c.get(this.b);
        if (obj != null) {
            wb00 wb00Var = (wb00) obj;
            this.d++;
            this.b = wb00Var.c;
            return wb00Var;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.b + ") has changed after it was added to the persistent map.");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.f913a;
        Map map = this.c;
        switch (b) {
            case 0:
                return this.d < map.size();
            case 1:
                return this.d < map.size();
            default:
                return this.d < map.size();
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        byte b = this.f913a;
        Object obj = null;
        Map map = this.c;
        switch (b) {
            case 0:
                return a();
            case 1:
                if (hasNext()) {
                    obj = this.b;
                    this.d++;
                    Object obj2 = map.get(obj);
                    if (obj2 == null) {
                        throw new ConcurrentModificationException(f140.k(obj, "Hash code of an element (", ") has changed after it was added to the persistent set."));
                    }
                    this.b = ((yb00) obj2).b;
                } else {
                    itt0.a();
                }
                return obj;
            default:
                if (hasNext()) {
                    obj = this.b;
                    this.d++;
                    Object obj3 = map.get(obj);
                    if (obj3 == null) {
                        throw new ConcurrentModificationException(f140.k(obj, "Hash code of an element (", ") has changed after it was added to the persistent set."));
                    }
                    this.b = ((zb00) obj3).b;
                } else {
                    itt0.a();
                }
                return obj;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.f913a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
