package a;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class iet0 extends AbstractList implements RandomAccess, tez {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pez f14652a;

    public iet0(pez pezVar) {
        this.f14652a = pezVar;
    }

    @Override // a.tez
    public final List a() {
        return Collections.unmodifiableList(this.f14652a.f26875a);
    }

    @Override // a.tez
    public final pg9 a0(int i) {
        return this.f14652a.a0(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f14652a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        get0 get0Var = new get0((byte) 1);
        get0Var.b = this.f14652a.iterator();
        return get0Var;
    }

    @Override // a.tez
    public final void j0(nh00 nh00Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        fet0 fet0Var = new fet0((byte) 1);
        fet0Var.b = this.f14652a.listIterator(i);
        return fet0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14652a.size();
    }

    @Override // a.tez
    public final iet0 d() {
        return this;
    }
}
