package a;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class k3 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17593a = 0;
    public final Iterator b;
    public Object c;
    public final /* synthetic */ Object d;

    public k3(t3 t3Var) {
        this.d = t3Var;
        Collection collection = t3Var.b;
        this.c = collection;
        this.b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void a() {
        t3 t3Var = (t3) this.d;
        t3Var.c();
        if (t3Var.b == ((Collection) this.c)) {
            return;
        }
        jf4.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f17593a) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.f17593a;
        Iterator it = this.b;
        switch (b) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                this.c = (Collection) entry.getValue();
                return ((l3) this.d).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.c = entry2;
                return entry2.getKey();
            default:
                a();
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        byte b = this.f17593a;
        Object obj = this.d;
        Iterator it = this.b;
        switch (b) {
            case 0:
                x0x.J("no calls to next() since the last call to remove()", ((Collection) this.c) != null);
                it.remove();
                ((l3) obj).d.e -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                break;
            case 1:
                x0x.J("no calls to next() since the last call to remove()", ((Map.Entry) this.c) != null);
                Collection collection = (Collection) ((Map.Entry) this.c).getValue();
                it.remove();
                ((m3) obj).b.e -= collection.size();
                collection.clear();
                this.c = null;
                break;
            default:
                it.remove();
                t3 t3Var = (t3) obj;
                t3Var.e.e--;
                t3Var.e();
                break;
        }
    }

    public k3(t3 t3Var, ListIterator listIterator) {
        this.d = t3Var;
        this.c = t3Var.b;
        this.b = listIterator;
    }

    public k3(m3 m3Var, Iterator it) {
        this.b = it;
        this.d = m3Var;
    }

    public k3(l3 l3Var) {
        this.d = l3Var;
        this.b = l3Var.c.entrySet().iterator();
    }
}
