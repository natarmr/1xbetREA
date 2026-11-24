package a;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class w3x extends b4x {
    public final transient b4x c;

    public w3x(b4x b4xVar) {
        this.c = b4xVar;
    }

    @Override // a.b4x, java.util.List
    /* JADX INFO: renamed from: G */
    public final b4x subList(int i, int i2) {
        b4x b4xVar = this.c;
        x0x.I(i, i2, b4xVar.size());
        return b4xVar.subList(b4xVar.size() - i2, b4xVar.size() - i).y();
    }

    @Override // a.b4x, a.s3x, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        b4x b4xVar = this.c;
        x0x.D(i, b4xVar.size());
        return b4xVar.get((b4xVar.size() - 1) - i);
    }

    @Override // a.s3x
    public final boolean i() {
        return this.c.i();
    }

    @Override // a.b4x, java.util.List
    public final int indexOf(Object obj) {
        b4x b4xVar = this.c;
        int iLastIndexOf = b4xVar.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (b4xVar.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // a.b4x, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // a.b4x, java.util.List
    public final int lastIndexOf(Object obj) {
        b4x b4xVar = this.c;
        int iIndexOf = b4xVar.indexOf(obj);
        if (iIndexOf >= 0) {
            return (b4xVar.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // a.b4x, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    @Override // a.b4x
    public final b4x y() {
        return this.c;
    }

    @Override // a.b4x, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
