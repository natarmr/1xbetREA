package a;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class yni0 extends g4 implements Set, Serializable {
    private static final xni0 b = new xni0(null);
    public static final yni0 c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo20 f42943a;

    static {
        jo20.n.getClass();
        c = new yni0(jo20.o);
    }

    public yni0() {
        this.f42943a = new jo20();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f42943a.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        this.f42943a.d();
        return super.addAll(collection);
    }

    @Override // a.g4
    public final int b() {
        return this.f42943a.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f42943a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f42943a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f42943a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        jo20 jo20Var = this.f42943a;
        jo20Var.getClass();
        return new go20(jo20Var, (byte) 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        jo20 jo20Var = this.f42943a;
        jo20Var.d();
        int iH = jo20Var.h(obj);
        if (iH < 0) {
            return false;
        }
        jo20Var.m(iH);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.f42943a.d();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.f42943a.d();
        return super.retainAll(collection);
    }

    public yni0(jo20 jo20Var) {
        jo20Var.getClass();
        this.f42943a = jo20Var;
    }

    public yni0(int i) {
        this.f42943a = new jo20(i);
    }
}
