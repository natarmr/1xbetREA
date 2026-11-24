package a;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class jet0 extends AbstractList implements rez, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qez f16393a;

    public jet0(qez qezVar) {
        this.f16393a = qezVar;
    }

    @Override // a.rez
    public final List a() {
        return Collections.unmodifiableList(this.f16393a.b);
    }

    @Override // a.rez
    public final void f0(og9 og9Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f16393a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        get0 get0Var = new get0((byte) 2);
        get0Var.b = this.f16393a.iterator();
        return get0Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        fet0 fet0Var = new fet0((byte) 2);
        fet0Var.b = this.f16393a.listIterator(i);
        return fet0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16393a.size();
    }

    @Override // a.rez
    public final Object x(int i) {
        return this.f16393a.b.get(i);
    }

    @Override // a.rez
    public final rez d() {
        return this;
    }
}
