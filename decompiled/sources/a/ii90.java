package a;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ii90 extends e4 implements Collection, lhy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j4 f14818a;
    public Object[] b;
    public Object[] c;
    public int d;
    public evz e = new evz();
    public Object[] f;
    public Object[] g;
    public int h;

    public ii90(j4 j4Var, Object[] objArr, Object[] objArr2, int i) {
        this.f14818a = j4Var;
        this.b = objArr;
        this.c = objArr2;
        this.d = i;
        this.f = objArr;
        this.g = objArr2;
        this.h = j4Var.size();
    }

    public static void g(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object[] F(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            dsb0.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            dsb0.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrQ = q(objArr);
        int iX = k7n0.x(i, i2);
        int i3 = i2 - 5;
        objArrQ[iX] = F((Object[]) objArrQ[iX], i, i3, it);
        while (true) {
            iX++;
            if (iX >= 32 || !it.hasNext()) {
                break;
            }
            objArrQ[iX] = F((Object[]) objArrQ[iX], 0, i3, it);
        }
        return objArrQ;
    }

    public final Object[] G(Object[] objArr, int i, Object[][] objArr2) {
        y2 y2Var = new y2(objArr2);
        int i2 = i >> 5;
        int i3 = this.d;
        Object[] objArrF = i2 < (1 << i3) ? F(objArr, i, i3, y2Var) : q(objArr);
        while (y2Var.hasNext()) {
            this.d += 5;
            objArrF = t(objArrF);
            int i4 = this.d;
            F(objArrF, 1 << i4, i4, y2Var);
        }
        return objArrF;
    }

    public final void H(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.h;
        int i2 = i >> 5;
        int i3 = this.d;
        if (i2 > (1 << i3)) {
            this.f = I(this.d + 5, t(objArr), objArr2);
            this.g = objArr3;
            this.d += 5;
            this.h++;
            return;
        }
        if (objArr == null) {
            this.f = objArr2;
            this.g = objArr3;
            this.h = i + 1;
        } else {
            this.f = I(i3, objArr, objArr2);
            this.g = objArr3;
            this.h++;
        }
    }

    public final Object[] I(int i, Object[] objArr, Object[] objArr2) {
        int iX = k7n0.x(b() - 1, i);
        Object[] objArrQ = q(objArr);
        if (i == 5) {
            objArrQ[iX] = objArr2;
            return objArrQ;
        }
        objArrQ[iX] = I(i - 5, (Object[]) objArrQ[iX], objArr2);
        return objArrQ;
    }

    public final int J(Function1 function1, Object[] objArr, int i, int i2, kuo kuoVar, ArrayList arrayList, ArrayList arrayList2) {
        if (m(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = kuoVar.f18920a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrS = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) function1.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrS = !arrayList.isEmpty() ? (Object[]) hne.k(1, arrayList) : s();
                    i2 = 0;
                }
                objArrS[i2] = obj2;
                i2++;
            }
        }
        kuoVar.f18920a = objArrS;
        if (objArr2 != objArrS) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int K(Function1 function1, Object[] objArr, int i, kuo kuoVar) {
        Object[] objArrQ = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrQ = q(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrQ[i2] = obj;
                i2++;
            }
        }
        kuoVar.f18920a = objArrQ;
        return i2;
    }

    public final int L(Function1 function1, int i, kuo kuoVar) {
        int iK = K(function1, this.g, i, kuoVar);
        Object obj = kuoVar.f18920a;
        if (iK == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iK, i, (Object) null);
        this.g = objArr;
        this.h -= i - iK;
        return iK;
    }

    public final boolean M(Function1 function1) {
        int i;
        Function1 function2 = function1;
        int iU = U();
        Object[] objArrV = null;
        kuo kuoVar = new kuo(null);
        boolean z = false;
        if (this.f != null) {
            c3 c3VarO = o(0);
            int iK = 32;
            while (iK == 32 && c3VarO.hasNext()) {
                iK = K(function2, (Object[]) c3VarO.next(), 32, kuoVar);
            }
            if (iK == 32) {
                int iL = L(function2, iU, kuoVar);
                if (iL == 0) {
                    y(this.f, this.h, this.d);
                }
                if (iL != iU) {
                }
            } else {
                int i2 = (c3VarO.b - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iJ = iK;
                while (c3VarO.hasNext()) {
                    iJ = J(function2, (Object[]) c3VarO.next(), 32, iJ, kuoVar, arrayList2, arrayList);
                    function2 = function1;
                }
                int iJ2 = J(function1, this.g, iU, iJ, kuoVar, arrayList2, arrayList);
                Object obj = kuoVar.f18920a;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iJ2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrF = this.f;
                if (zIsEmpty) {
                    objArrF.getClass();
                } else {
                    objArrF = F(objArrF, i2, this.d, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    dsb0.a("invalid size");
                }
                if (size == 0) {
                    this.d = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.d;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.d = i - 5;
                        Object[] objArr2 = objArrF[0];
                        objArr2.getClass();
                        objArrF = objArr2;
                    }
                    objArrV = v(objArrF, i3, i);
                }
                this.f = objArrV;
                this.g = objArr;
                this.h = size + iJ2;
            }
            z = true;
        } else if (L(function2, iU, kuoVar) != iU) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] O(Object[] objArr, int i, int i2, kuo kuoVar) {
        int iX = k7n0.x(i2, i);
        if (i == 0) {
            Object obj = objArr[iX];
            Object[] objArrQ = q(objArr);
            qx3.e(iX, iX + 1, 32, objArr, objArrQ);
            objArrQ[31] = kuoVar.f18920a;
            kuoVar.f18920a = obj;
            return objArrQ;
        }
        int iX2 = objArr[31] == null ? k7n0.x(R() - 1, i) : 31;
        Object[] objArrQ2 = q(objArr);
        int i3 = i - 5;
        int i4 = iX + 1;
        if (i4 <= iX2) {
            while (true) {
                Object obj2 = objArrQ2[iX2];
                obj2.getClass();
                objArrQ2[iX2] = O((Object[]) obj2, i3, 0, kuoVar);
                if (iX2 == i4) {
                    break;
                }
                iX2--;
            }
        }
        Object obj3 = objArrQ2[iX];
        obj3.getClass();
        objArrQ2[iX] = O((Object[]) obj3, i3, i2, kuoVar);
        return objArrQ2;
    }

    public final Object Q(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.h - i;
        Object[] objArr2 = this.g;
        if (i4 == 1) {
            Object obj = objArr2[0];
            y(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrQ = q(objArr2);
        qx3.e(i3, i3 + 1, i4, objArr2, objArrQ);
        objArrQ[i4 - 1] = null;
        this.f = objArr;
        this.g = objArrQ;
        this.h = (i + i4) - 1;
        this.d = i2;
        return obj2;
    }

    public final int R() {
        int i = this.h;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] S(Object[] objArr, int i, int i2, Object obj, kuo kuoVar) {
        int iX = k7n0.x(i2, i);
        Object[] objArrQ = q(objArr);
        if (i != 0) {
            Object obj2 = objArrQ[iX];
            obj2.getClass();
            objArrQ[iX] = S((Object[]) obj2, i - 5, i2, obj, kuoVar);
            return objArrQ;
        }
        if (objArrQ != objArr) {
            ((AbstractList) this).modCount++;
        }
        kuoVar.f18920a = objArrQ[iX];
        objArrQ[iX] = obj;
        return objArrQ;
    }

    public final void T(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrS;
        if (i3 < 1) {
            dsb0.a("requires at least one nullBuffer");
        }
        Object[] objArrQ = q(objArr);
        objArr2[0] = objArrQ;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            qx3.e(size + 1, i4, i2, objArrQ, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrS = objArrQ;
            } else {
                objArrS = s();
                i3--;
                objArr2[i3] = objArrS;
            }
            int i7 = i2 - i6;
            qx3.e(0, i7, i2, objArrQ, objArr3);
            qx3.e(size + 1, i4, i7, objArrQ, objArrS);
            objArr3 = objArrS;
        }
        Iterator it = collection.iterator();
        g(objArrQ, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrS2 = s();
            g(objArrS2, 0, it);
            objArr2[i8] = objArrS2;
        }
        g(objArr3, 0, it);
    }

    public final int U() {
        int i = this.h;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        bww.C(i, b());
        if (i == b()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iR = R();
        if (i >= iR) {
            l(i - iR, obj, this.f);
            return;
        }
        kuo kuoVar = new kuo(null);
        Object[] objArr = this.f;
        objArr.getClass();
        l(0, kuoVar.f18920a, k(objArr, this.d, i, obj, kuoVar));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrS;
        bww.C(i, this.h);
        if (i == this.h) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.h - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.g;
            Object[] objArrQ = q(objArr);
            qx3.e(size2 + 1, i3, U(), objArr, objArrQ);
            g(objArrQ, i3, collection.iterator());
            this.g = objArrQ;
            this.h = collection.size() + this.h;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iU = U();
        int size3 = collection.size() + this.h;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= R()) {
            objArrS = s();
            collection2 = collection;
            T(collection2, i, this.g, iU, objArr2, size, objArrS);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.g;
            if (size3 > iU) {
                int i4 = size3 - iU;
                Object[] objArrR = r(i4, objArr3);
                j(collection2, i, i4, objArr2, size, objArrR);
                objArr2 = objArr2;
                objArrS = objArrR;
            } else {
                objArrS = s();
                int i5 = iU - size3;
                qx3.e(0, i5, iU, objArr3, objArrS);
                int i6 = 32 - i5;
                Object[] objArrR2 = r(i6, this.g);
                int i7 = size - 1;
                objArr2[i7] = objArrR2;
                j(collection2, i, i6, objArr2, i7, objArrR2);
                collection2 = collection2;
            }
        }
        this.f = G(this.f, i2, objArr2);
        this.g = objArrS;
        this.h = collection2.size() + this.h;
        return true;
    }

    @Override // a.e4
    public final int b() {
        return this.h;
    }

    @Override // a.e4
    public final Object e(int i) {
        bww.A(i, b());
        ((AbstractList) this).modCount++;
        int iR = R();
        if (i >= iR) {
            return Q(this.f, iR, this.d, i - iR);
        }
        kuo kuoVar = new kuo(this.g[0]);
        Object[] objArr = this.f;
        objArr.getClass();
        Q(O(objArr, this.d, i, kuoVar), iR, this.d, 0);
        return kuoVar.f18920a;
    }

    public final j4 f() {
        j4 gi90Var;
        Object[] objArr = this.f;
        if (objArr == this.b && this.g == this.c) {
            gi90Var = this.f14818a;
        } else {
            this.e = new evz();
            this.b = objArr;
            Object[] objArr2 = this.g;
            this.c = objArr2;
            if (objArr == null) {
                gi90Var = objArr2.length == 0 ? mak0.c : new mak0(Arrays.copyOf(this.g, b()));
            } else {
                Object[] objArr3 = this.f;
                objArr3.getClass();
                gi90Var = new gi90(objArr3, this.g, b(), this.d);
            }
        }
        this.f14818a = gi90Var;
        return gi90Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        bww.A(i, b());
        if (R() <= i) {
            objArr = this.g;
        } else {
            Object[] objArr2 = this.f;
            objArr2.getClass();
            for (int i2 = this.d; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[k7n0.x(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final int h() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f == null) {
            jf4.n("root is null");
            return;
        }
        int i4 = i >> 5;
        c3 c3VarO = o(R() >> 5);
        int i5 = i3;
        Object[] objArrR = objArr2;
        while (c3VarO.b - 1 != i4) {
            Object[] objArr3 = (Object[]) c3VarO.previous();
            qx3.e(0, 32 - i2, 32, objArr3, objArrR);
            objArrR = r(i2, objArr3);
            i5--;
            objArr[i5] = objArrR;
        }
        Object[] objArr4 = (Object[]) c3VarO.previous();
        int iR = i3 - (((R() >> 5) - 1) - i4);
        if (iR < i3) {
            objArr2 = objArr[iR];
            objArr2.getClass();
        }
        T(collection, i, objArr4, 32, objArr, iR, objArr2);
    }

    public final Object[] k(Object[] objArr, int i, int i2, Object obj, kuo kuoVar) {
        Object obj2;
        int iX = k7n0.x(i2, i);
        if (i == 0) {
            kuoVar.f18920a = objArr[31];
            Object[] objArrQ = q(objArr);
            qx3.e(iX + 1, iX, 31, objArr, objArrQ);
            objArrQ[iX] = obj;
            return objArrQ;
        }
        Object[] objArrQ2 = q(objArr);
        int i3 = i - 5;
        Object obj3 = objArrQ2[iX];
        obj3.getClass();
        objArrQ2[iX] = k((Object[]) obj3, i3, i2, obj, kuoVar);
        while (true) {
            iX++;
            if (iX >= 32 || (obj2 = objArrQ2[iX]) == null) {
                break;
            }
            objArrQ2[iX] = k((Object[]) obj2, i3, 0, kuoVar.f18920a, kuoVar);
        }
        return objArrQ2;
    }

    public final void l(int i, Object obj, Object[] objArr) {
        int iU = U();
        Object[] objArrQ = q(this.g);
        Object[] objArr2 = this.g;
        if (iU >= 32) {
            Object obj2 = objArr2[31];
            qx3.e(i + 1, i, 31, objArr2, objArrQ);
            objArrQ[i] = obj;
            H(objArr, objArrQ, t(obj2));
            return;
        }
        qx3.e(i + 1, i, iU, objArr2, objArrQ);
        objArrQ[i] = obj;
        this.f = objArr;
        this.g = objArrQ;
        this.h++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        bww.C(i, this.h);
        return new mi90(this, i);
    }

    public final boolean m(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.e;
    }

    public final c3 o(int i) {
        Object[] objArr = this.f;
        if (objArr == null) {
            jf4.n("Invalid root");
            return null;
        }
        int iR = R() >> 5;
        bww.C(i, iR);
        int i2 = this.d;
        return i2 == 0 ? new h99(objArr, i) : new mqs0(objArr, i, iR, i2 / 5);
    }

    public final Object[] q(Object[] objArr) {
        if (objArr == null) {
            return s();
        }
        if (m(objArr)) {
            return objArr;
        }
        Object[] objArrS = s();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        qx3.i(0, length, 6, objArr, objArrS);
        return objArrS;
    }

    public final Object[] r(int i, Object[] objArr) {
        if (m(objArr)) {
            qx3.e(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] objArrS = s();
        qx3.e(i, 0, 32 - i, objArr, objArrS);
        return objArrS;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return M(new h4(collection, (byte) 2));
    }

    public final Object[] s() {
        Object[] objArr = new Object[33];
        objArr[32] = this.e;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        bww.A(i, b());
        if (R() > i) {
            kuo kuoVar = new kuo(null);
            Object[] objArr = this.f;
            objArr.getClass();
            this.f = S(objArr, this.d, i, obj, kuoVar);
            return kuoVar.f18920a;
        }
        Object[] objArrQ = q(this.g);
        if (objArrQ != this.g) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrQ[i2];
        objArrQ[i2] = obj;
        this.g = objArrQ;
        return obj2;
    }

    public final Object[] t(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.e;
        return objArr;
    }

    public final Object[] v(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            dsb0.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iX = k7n0.x(i, i2);
        Object obj = objArr[iX];
        obj.getClass();
        Object objV = v((Object[]) obj, i, i2 - 5);
        if (iX < 31) {
            int i3 = iX + 1;
            if (objArr[i3] != null) {
                if (m(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrS = s();
                qx3.e(0, 0, i3, objArr, objArrS);
                objArr = objArrS;
            }
        }
        if (objV == objArr[iX]) {
            return objArr;
        }
        Object[] objArrQ = q(objArr);
        objArrQ[iX] = objV;
        return objArrQ;
    }

    public final Object[] w(Object[] objArr, int i, int i2, kuo kuoVar) {
        Object[] objArrW;
        int iX = k7n0.x(i2 - 1, i);
        if (i == 5) {
            kuoVar.f18920a = objArr[iX];
            objArrW = null;
        } else {
            Object obj = objArr[iX];
            obj.getClass();
            objArrW = w((Object[]) obj, i - 5, i2, kuoVar);
        }
        if (objArrW == null && iX == 0) {
            return null;
        }
        Object[] objArrQ = q(objArr);
        objArrQ[iX] = objArrW;
        return objArrQ;
    }

    public final void y(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.g = objArr;
            this.h = i;
            this.d = i2;
            return;
        }
        kuo kuoVar = new kuo(null);
        objArr.getClass();
        Object[] objArrW = w(objArr, i2, i, kuoVar);
        objArrW.getClass();
        Object obj = kuoVar.f18920a;
        obj.getClass();
        this.g = (Object[]) obj;
        this.h = i;
        if (objArrW[1] == null) {
            this.f = (Object[]) objArrW[0];
            this.d = i2 - 5;
        } else {
            this.f = objArrW;
            this.d = i2;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iU = U();
        if (iU < 32) {
            Object[] objArrQ = q(this.g);
            objArrQ[iU] = obj;
            this.g = objArrQ;
            this.h = b() + 1;
        } else {
            H(this.f, this.g, t(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iU = U();
        Iterator it = collection.iterator();
        if (32 - iU >= collection.size()) {
            Object[] objArrQ = q(this.g);
            g(objArrQ, iU, it);
            this.g = objArrQ;
            this.h = collection.size() + this.h;
            return true;
        }
        int size = ((collection.size() + iU) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrQ2 = q(this.g);
        g(objArrQ2, iU, it);
        objArr[0] = objArrQ2;
        for (int i = 1; i < size; i++) {
            Object[] objArrS = s();
            g(objArrS, 0, it);
            objArr[i] = objArrS;
        }
        this.f = G(this.f, R(), objArr);
        Object[] objArrS2 = s();
        g(objArrS2, 0, it);
        this.g = objArrS2;
        this.h = collection.size() + this.h;
        return true;
    }
}
