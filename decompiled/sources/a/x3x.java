package a;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class x3x extends b4x {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ b4x e;

    public x3x(b4x b4xVar, int i, int i2) {
        this.e = b4xVar;
        this.c = i;
        this.d = i2;
    }

    @Override // a.b4x, java.util.List
    /* JADX INFO: renamed from: G */
    public final b4x subList(int i, int i2) {
        x0x.I(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // a.s3x
    public final Object[] f() {
        return this.e.f();
    }

    @Override // a.s3x
    public final int g() {
        return this.e.h() + this.c + this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        x0x.D(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // a.s3x
    public final int h() {
        return this.e.h() + this.c;
    }

    @Override // a.b4x, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // a.b4x, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // a.b4x, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
