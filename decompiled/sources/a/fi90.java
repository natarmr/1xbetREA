package a;

import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class fi90 extends i4 {
    public final Object[] b;
    public final Object[] c;
    public final int d;
    public final int e;

    public fi90(Object[] objArr, Object[] objArr2, int i, int i2) {
        objArr.getClass();
        objArr2.getClass();
        this.b = objArr;
        this.c = objArr2;
        this.d = i;
        this.e = i2;
        if (b() > 32) {
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + b()).toString());
    }

    @Override // a.u1
    public final int b() {
        return this.d;
    }

    @Override // a.i4
    public final i4 e(q9v q9vVar) {
        int i = this.d;
        int i2 = i - ((i - 1) & (-32));
        int i3 = this.e;
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        if (i2 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i2] = q9vVar;
            return new fi90(objArr, objArrCopyOf, i + 1, i3);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = q9vVar;
        if ((i >> 5) <= (1 << i3)) {
            return new fi90(f(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new fi90(f(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    public final Object[] f(int i, Object[] objArr, Object[] objArr2) {
        int iW = k5n0.w(b() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iW] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iW] = f(i - 5, (Object[]) objArrCopyOf[iW], objArr2);
        return objArrCopyOf;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        int i2 = this.d;
        zvw.J(i, i2);
        if (((i2 - 1) & (-32)) <= i) {
            objArr = this.c;
        } else {
            Object[] objArr2 = this.b;
            for (int i3 = this.e; i3 > 0; i3 -= 5) {
                Object[] objArr3 = objArr2[k5n0.w(i, i3)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // a.b3, java.util.List
    public final ListIterator listIterator(int i) {
        zvw.K(i, this.d);
        return new ji90(i, this.d, (this.e / 5) + 1, this.b, this.c);
    }
}
