package a;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class xg00 implements ListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f40818a;
    public final /* synthetic */ ListIterator b;
    public final /* synthetic */ yg00 c;

    public xg00(yg00 yg00Var, ListIterator listIterator) {
        this.b = listIterator;
        this.c = yg00Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.b;
        listIterator.add(obj);
        listIterator.previous();
        this.f40818a = false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ListIterator listIterator = this.b;
        if (listIterator.hasPrevious()) {
            this.f40818a = true;
            return listIterator.previous();
        }
        itt0.a();
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.c.b(this.b.nextIndex());
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ListIterator listIterator = this.b;
        if (listIterator.hasNext()) {
            this.f40818a = true;
            return listIterator.next();
        }
        itt0.a();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return nextIndex() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        x0x.J("no calls to next() since the last call to remove()", this.f40818a);
        this.b.remove();
        this.f40818a = false;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        x0x.K(this.f40818a);
        this.b.set(obj);
    }
}
