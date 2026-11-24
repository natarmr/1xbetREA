package a;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zg00 extends mls0 implements ListIterator {
    public final /* synthetic */ byte b;
    public final /* synthetic */ AbstractList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zg00(AbstractList abstractList, ListIterator listIterator, byte b) {
        super(listIterator);
        this.b = b;
        this.c = abstractList;
    }

    @Override // a.mls0
    public final Object a(Object obj) {
        byte b = this.b;
        AbstractList abstractList = this.c;
        switch (b) {
            case 0:
                return ((ah00) abstractList).b.apply(obj);
            default:
                return ((bh00) abstractList).b.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f22009a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f22009a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.f22009a).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f22009a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
