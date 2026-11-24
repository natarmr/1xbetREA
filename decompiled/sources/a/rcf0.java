package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class rcf0 extends b4x {
    public static final rcf0 e = new rcf0(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public rcf0(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // a.b4x, a.s3x
    public final int e(int i, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i2 = this.d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // a.s3x
    public final Object[] f() {
        return this.c;
    }

    @Override // a.s3x
    public final int g() {
        return this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        x0x.D(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // a.s3x
    public final int h() {
        return 0;
    }

    @Override // a.s3x
    public final boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
