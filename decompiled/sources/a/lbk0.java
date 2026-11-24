package a;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class lbk0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19758a;
    public final int b;
    public final /* synthetic */ mbk0 c;

    public lbk0(mbk0 mbk0Var) {
        this.c = mbk0Var;
        this.b = ((AbstractList) mbk0Var).modCount;
    }

    public final void a() {
        mbk0 mbk0Var = this.c;
        int i = ((AbstractList) mbk0Var).modCount;
        int i2 = this.b;
        if (i == i2) {
            return;
        }
        throw new ConcurrentModificationException("ModCount: " + ((AbstractList) mbk0Var).modCount + "; expected: " + i2);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f19758a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f19758a) {
            itt0.a();
            return null;
        }
        this.f19758a = true;
        a();
        return this.c.b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        this.c.clear();
    }
}
