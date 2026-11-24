package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class jpw0 extends cow0 {
    public static final jpw0 h = new jpw0(0, new Object[0]);
    public final transient Object[] f;
    public final transient int g;

    public jpw0(int i, Object[] objArr) {
        super((byte) 2);
        this.f = objArr;
        this.g = i;
    }

    @Override // a.cow0, a.hdw0
    public final int e(Object[] objArr) {
        Object[] objArr2 = this.f;
        int i = this.g;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // a.hdw0
    public final int f() {
        return this.g;
    }

    @Override // java.util.List
    public final Object get(int i) {
        xsm0.A(i, this.g);
        Object obj = this.f[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // a.hdw0
    public final int h() {
        return 0;
    }

    @Override // a.hdw0
    public final Object[] k() {
        return this.f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.g;
    }
}
