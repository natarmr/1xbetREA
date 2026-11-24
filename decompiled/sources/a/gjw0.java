package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class gjw0 extends ghw0 {
    public static final gjw0 h = new gjw0(0, new Object[0]);
    public final transient Object[] f;
    public final transient int g;

    public gjw0(int i, Object[] objArr) {
        super((byte) 0);
        this.f = objArr;
        this.g = i;
    }

    @Override // a.hdw0
    public final Object[] g() {
        return this.f;
    }

    @Override // java.util.List
    public final Object get(int i) {
        xcm0.w(i, this.g);
        Object obj = this.f[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // a.hdw0
    public final int h() {
        return 0;
    }

    @Override // a.hdw0
    public final int i() {
        return this.g;
    }

    @Override // a.ghw0, a.hdw0
    public final int l(Object[] objArr) {
        Object[] objArr2 = this.f;
        int i = this.g;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.g;
    }
}
