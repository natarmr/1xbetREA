package a;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class het0 extends AbstractList implements sez, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oez f12940a;

    public het0(oez oezVar) {
        this.f12940a = oezVar;
    }

    @Override // a.sez
    public final void L0(lg9 lg9Var) {
        throw new UnsupportedOperationException();
    }

    @Override // a.sez
    public final List a() {
        return Collections.unmodifiableList(this.f12940a.b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f12940a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        get0 get0Var = new get0((byte) 0);
        get0Var.b = this.f12940a.iterator();
        return get0Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        fet0 fet0Var = new fet0((byte) 0);
        fet0Var.b = this.f12940a.listIterator(i);
        return fet0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12940a.b.size();
    }

    @Override // a.sez
    public final Object x(int i) {
        return this.f12940a.b.get(i);
    }

    @Override // a.sez
    public final sez d() {
        return this;
    }
}
