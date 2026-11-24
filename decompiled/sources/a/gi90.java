package a;

import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class gi90 extends j4 {
    public final Object[] b;
    public final Object[] c;
    public final int d;
    public final int e;

    public gi90(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.b = objArr;
        this.c = objArr2;
        this.d = i;
        this.e = i2;
        if (!(b() > 32)) {
            dsb0.a("Trie-based persistent vector should have at least 33 elements, got " + b());
        }
        int length = objArr2.length;
    }

    public static Object[] m(Object[] objArr, int i, int i2, Object obj, kuo kuoVar) {
        int iX = k7n0.x(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iX == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            qx3.e(iX + 1, iX, 31, objArr, objArrCopyOf);
            kuoVar.f18920a = objArr[31];
            objArrCopyOf[iX] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[iX];
        obj2.getClass();
        objArrCopyOf2[iX] = m((Object[]) obj2, i3, i2, obj, kuoVar);
        while (true) {
            iX++;
            if (iX >= 32 || objArrCopyOf2[iX] == null) {
                break;
            }
            Object obj3 = objArr[iX];
            obj3.getClass();
            objArrCopyOf2[iX] = m((Object[]) obj3, i3, 0, kuoVar.f18920a, kuoVar);
        }
        return objArrCopyOf2;
    }

    public static Object[] q(Object[] objArr, int i, int i2, kuo kuoVar) {
        Object[] objArrQ;
        int iX = k7n0.x(i2, i);
        if (i == 5) {
            kuoVar.f18920a = objArr[iX];
            objArrQ = null;
        } else {
            Object obj = objArr[iX];
            obj.getClass();
            objArrQ = q((Object[]) obj, i - 5, i2, kuoVar);
        }
        if (objArrQ == null && iX == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iX] = objArrQ;
        return objArrCopyOf;
    }

    public static Object[] y(int i, int i2, Object obj, Object[] objArr) {
        int iX = k7n0.x(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[iX] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iX];
        obj2.getClass();
        objArrCopyOf[iX] = y(i - 5, i2, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    @Override // a.u1
    public final int b() {
        return this.d;
    }

    @Override // a.j4
    public final j4 e(int i, Object obj) {
        int i2 = this.d;
        bww.C(i, i2);
        if (i == i2) {
            return f(obj);
        }
        int iW = w();
        Object[] objArr = this.b;
        if (i >= iW) {
            return o(i - iW, obj, objArr);
        }
        kuo kuoVar = new kuo(null);
        return o(0, kuoVar.f18920a, m(objArr, this.e, i, obj, kuoVar));
    }

    @Override // a.j4
    public final j4 f(Object obj) {
        int iW = w();
        int i = this.d;
        int i2 = i - iW;
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        if (i2 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i2] = obj;
            return new gi90(objArr, objArrCopyOf, i + 1, this.e);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return r(objArr, objArr2, objArr3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        bww.A(i, b());
        if (w() <= i) {
            objArr = this.c;
        } else {
            Object[] objArr2 = this.b;
            for (int i2 = this.e; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[k7n0.x(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // a.j4
    public final ii90 h() {
        return new ii90(this, this.b, this.c, this.e);
    }

    @Override // a.j4
    public final j4 j(h4 h4Var) {
        ii90 ii90Var = new ii90(this, this.b, this.c, this.e);
        ii90Var.M(h4Var);
        return ii90Var.f();
    }

    @Override // a.j4
    public final j4 k(int i) {
        bww.A(i, b());
        int iW = w();
        int i2 = this.e;
        Object[] objArr = this.b;
        return i >= iW ? v(objArr, iW, i2, i - iW) : v(t(objArr, i2, i, new kuo(this.c[0])), iW, i2, 0);
    }

    @Override // a.j4
    public final j4 l(int i, Object obj) {
        int i2 = this.d;
        bww.A(i, i2);
        int iW = w();
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        int i3 = this.e;
        if (iW > i) {
            return new gi90(y(i3, i, obj, objArr), objArr2, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = obj;
        return new gi90(objArr, objArrCopyOf, i2, i3);
    }

    @Override // a.b3, java.util.List
    public final ListIterator listIterator(int i) {
        bww.C(i, this.d);
        return new ki90(i, this.d, (this.e / 5) + 1, this.b, this.c);
    }

    public final gi90 o(int i, Object obj, Object[] objArr) {
        int iW = w();
        int i2 = this.d;
        int i3 = i2 - iW;
        Object[] objArr2 = this.c;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            qx3.e(i + 1, i, i3, objArr2, objArrCopyOf);
            objArrCopyOf[i] = obj;
            return new gi90(objArr, objArrCopyOf, i2 + 1, this.e);
        }
        Object obj2 = objArr2[31];
        qx3.e(i + 1, i, i3 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return r(objArr, objArrCopyOf, objArr3);
    }

    public final gi90 r(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.d;
        int i2 = i >> 5;
        int i3 = this.e;
        if (i2 <= (1 << i3)) {
            return new gi90(s(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new gi90(s(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    public final Object[] s(int i, Object[] objArr, Object[] objArr2) {
        int iX = k7n0.x(b() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iX] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iX] = s(i - 5, (Object[]) objArrCopyOf[iX], objArr2);
        return objArrCopyOf;
    }

    public final Object[] t(Object[] objArr, int i, int i2, kuo kuoVar) {
        int iX = k7n0.x(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iX == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            qx3.e(iX, iX + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = kuoVar.f18920a;
            kuoVar.f18920a = objArr[iX];
            return objArrCopyOf;
        }
        int iX2 = objArr[31] == null ? k7n0.x(w() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = iX + 1;
        if (i4 <= iX2) {
            while (true) {
                Object obj = objArrCopyOf2[iX2];
                obj.getClass();
                objArrCopyOf2[iX2] = t((Object[]) obj, i3, 0, kuoVar);
                if (iX2 == i4) {
                    break;
                }
                iX2--;
            }
        }
        Object obj2 = objArrCopyOf2[iX];
        obj2.getClass();
        objArrCopyOf2[iX] = t((Object[]) obj2, i3, i2, kuoVar);
        return objArrCopyOf2;
    }

    public final j4 v(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.d - i;
        if (i4 != 1) {
            Object[] objArr2 = this.c;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                qx3.e(i3, i3 + 1, i4, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i5] = null;
            return new gi90(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new mak0(objArr);
        }
        kuo kuoVar = new kuo(null);
        Object[] objArrQ = q(objArr, i2, i - 1, kuoVar);
        objArrQ.getClass();
        Object obj = kuoVar.f18920a;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (objArrQ[1] != null) {
            return new gi90(objArrQ, objArr3, i, i2);
        }
        Object obj2 = objArrQ[0];
        obj2.getClass();
        return new gi90((Object[]) obj2, objArr3, i, i2 - 5);
    }

    public final int w() {
        return (this.d - 1) & (-32);
    }
}
