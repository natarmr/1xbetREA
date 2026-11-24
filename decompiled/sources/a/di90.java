package a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class di90 extends g4 implements Collection, lhy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bi90 f6128a;
    public Object b;
    public Object c;
    public final gh90 d;

    public di90(bi90 bi90Var) {
        this.f6128a = bi90Var;
        this.b = bi90Var.b;
        this.c = bi90Var.c;
        this.d = new gh90(bi90Var.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        gh90 gh90Var = this.d;
        if (gh90Var.containsKey(obj)) {
            return false;
        }
        this.f6128a = null;
        if (isEmpty()) {
            this.b = obj;
            this.c = obj;
            gh90Var.put(obj, new yb00());
            return true;
        }
        Object obj2 = gh90Var.get(this.c);
        obj2.getClass();
        gh90Var.put(this.c, new yb00(((yb00) obj2).f42319a, obj));
        gh90Var.put(obj, new yb00(this.c));
        this.c = obj;
        return true;
    }

    @Override // a.g4
    public final int b() {
        return this.d.g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        gh90 gh90Var = this.d;
        if (!gh90Var.isEmpty()) {
            this.f6128a = null;
        }
        gh90Var.clear();
        ujn ujnVar = ujn.k;
        this.b = ujnVar;
        this.c = ujnVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    public final bi90 e() {
        bi90 bi90Var = this.f6128a;
        if (bi90Var != null) {
            return bi90Var;
        }
        bi90 bi90Var2 = new bi90(this.b, this.c, this.d.build());
        this.f6128a = bi90Var2;
        return bi90Var2;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        gh90 gh90Var = this.d;
        Set set = (Set) obj;
        if (gh90Var.g != set.size()) {
            return false;
        }
        if (set instanceof bi90) {
            return gh90Var.c.g(((bi90) obj).d.d, new ch90((byte) 18));
        }
        return set instanceof di90 ? gh90Var.c.g(((di90) obj).d.c, new ch90((byte) 19)) : super.equals(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ei90(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        gh90 gh90Var = this.d;
        yb00 yb00Var = (yb00) gh90Var.remove(obj);
        if (yb00Var == null) {
            return false;
        }
        Object obj2 = yb00Var.b;
        Object obj3 = yb00Var.f42319a;
        this.f6128a = null;
        ujn ujnVar = ujn.k;
        if (obj3 != ujnVar) {
            Object obj4 = gh90Var.get(obj3);
            obj4.getClass();
            gh90Var.put(obj3, new yb00(((yb00) obj4).f42319a, obj2));
        } else {
            this.b = obj2;
        }
        if (obj2 == ujnVar) {
            this.c = obj3;
            return true;
        }
        Object obj5 = gh90Var.get(obj2);
        obj5.getClass();
        gh90Var.put(obj2, new yb00(obj3, ((yb00) obj5).b));
        return true;
    }
}
