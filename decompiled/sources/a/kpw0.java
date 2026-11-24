package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class kpw0 extends how0 {
    public static final Object[] l;
    public static final kpw0 m;
    public final transient Object[] g;
    public final transient int h;
    public final transient Object[] i;
    public final transient int j;
    public final transient int k;

    static {
        Object[] objArr = new Object[0];
        l = objArr;
        m = new kpw0(0, 0, 0, objArr, objArr);
    }

    public kpw0(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super((byte) 2);
        this.g = objArr;
        this.h = i;
        this.i = objArr2;
        this.j = i2;
        this.k = i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.i;
        if (objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
        while (true) {
            int i = iRotateLeft & this.j;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i + 1;
        }
    }

    @Override // a.hdw0
    public final int e(Object[] objArr) {
        Object[] objArr2 = this.g;
        int i = this.k;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // a.hdw0
    public final int f() {
        return this.k;
    }

    @Override // a.hdw0
    public final int h() {
        return 0;
    }

    @Override // a.how0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return m().listIterator(0);
    }

    @Override // a.hdw0
    public final eet0 j() {
        return m().listIterator(0);
    }

    @Override // a.hdw0
    public final Object[] k() {
        return this.g;
    }

    @Override // a.how0
    public final cow0 o() {
        return cow0.q(this.k, this.g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.k;
    }
}
