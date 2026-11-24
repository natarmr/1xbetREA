package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ycf0 extends f4x {
    public static final Object[] i;
    public static final ycf0 j;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int g;
    public final transient int h;

    static {
        Object[] objArr = new Object[0];
        i = objArr;
        j = new ycf0(0, 0, 0, objArr, objArr);
    }

    public ycf0(int i2, int i3, int i4, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i2;
        this.f = objArr2;
        this.g = i3;
        this.h = i4;
    }

    @Override // a.s3x, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int iZ = gkb.Z(obj);
                while (true) {
                    int i2 = iZ & this.g;
                    Object obj2 = objArr[i2];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iZ = i2 + 1;
                }
            }
        }
        return false;
    }

    @Override // a.s3x
    public final int e(int i2, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i3 = this.h;
        System.arraycopy(objArr2, 0, objArr, i2, i3);
        return i2 + i3;
    }

    @Override // a.s3x
    public final Object[] f() {
        return this.d;
    }

    @Override // a.s3x
    public final int g() {
        return this.h;
    }

    @Override // a.s3x
    public final int h() {
        return 0;
    }

    @Override // a.f4x, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // a.s3x
    public final boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: j */
    public final eet0 iterator() {
        return b().listIterator(0);
    }

    @Override // a.f4x
    public final b4x o() {
        return b4x.k(this.h, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }
}
