package a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class gx3 extends nuj0 implements Map {
    public ax3 d;
    public cx3 e;
    public ex3 f;

    @Override // java.util.Map
    public final Set entrySet() {
        ax3 ax3Var = this.d;
        if (ax3Var != null) {
            return ax3Var;
        }
        ax3 ax3Var2 = new ax3(this, (byte) 0);
        this.d = ax3Var2;
        return ax3Var2;
    }

    public final boolean k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        cx3 cx3Var = this.e;
        if (cx3Var != null) {
            return cx3Var;
        }
        cx3 cx3Var2 = new cx3(this);
        this.e = cx3Var2;
        return cx3Var2;
    }

    public final boolean l(Collection collection) {
        int i = this.c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.c;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        ex3 ex3Var = this.f;
        if (ex3Var != null) {
            return ex3Var;
        }
        ex3 ex3Var2 = new ex3(this);
        this.f = ex3Var2;
        return ex3Var2;
    }
}
