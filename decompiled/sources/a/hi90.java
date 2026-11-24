package a;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class hi90 extends e4 implements Collection, lhy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13103a;
    public i4 b;
    public xuz c;
    public Object[] d;
    public Object[] e;
    public int f;

    public hi90(i4 i4Var, Object[] objArr, Object[] objArr2, int i) {
        objArr2.getClass();
        this.f13103a = i;
        this.b = i4Var;
        this.c = new xuz();
        this.d = objArr;
        this.e = objArr2;
        this.f = i4Var.size();
    }

    public static void g(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object[] F(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            jf4.n("Check failed.");
            return null;
        }
        if (i2 < 0) {
            jf4.n("Check failed.");
            return null;
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrQ = q(objArr);
        int iW = k5n0.w(i, i2);
        int i3 = i2 - 5;
        objArrQ[iW] = F((Object[]) objArrQ[iW], i, i3, it);
        while (true) {
            iW++;
            if (iW >= 32 || !it.hasNext()) {
                break;
            }
            objArrQ[iW] = F((Object[]) objArrQ[iW], 0, i3, it);
        }
        return objArrQ;
    }

    public final Object[] G(Object[] objArr, int i, Object[][] objArr2) {
        y2 y2Var = new y2(objArr2);
        int i2 = i >> 5;
        int i3 = this.f13103a;
        Object[] objArrF = i2 < (1 << i3) ? F(objArr, i, i3, y2Var) : q(objArr);
        while (y2Var.hasNext()) {
            this.f13103a += 5;
            objArrF = t(objArrF);
            int i4 = this.f13103a;
            F(objArrF, 1 << i4, i4, y2Var);
        }
        return objArrF;
    }

    public final void H(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f >> 5;
        int i2 = this.f13103a;
        if (i > (1 << i2)) {
            S(I(this.f13103a + 5, t(objArr), objArr2));
            T(objArr3);
            this.f13103a += 5;
            this.f++;
            return;
        }
        if (objArr == null) {
            S(objArr2);
            T(objArr3);
            this.f++;
        } else {
            S(I(i2, objArr, objArr2));
            T(objArr3);
            this.f++;
        }
    }

    public final Object[] I(int i, Object[] objArr, Object[] objArr2) {
        int iW = k5n0.w(b() - 1, i);
        Object[] objArrQ = q(objArr);
        if (i == 5) {
            objArrQ[iW] = objArr2;
            return objArrQ;
        }
        objArrQ[iW] = I(i - 5, (Object[]) objArrQ[iW], objArr2);
        return objArrQ;
    }

    public final int J(h4 h4Var, Object[] objArr, int i, int i2, onv onvVar, ArrayList arrayList, ArrayList arrayList2) {
        if (m(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = onvVar.f25567a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrS = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) h4Var.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrS = !arrayList.isEmpty() ? (Object[]) hne.k(1, arrayList) : s();
                    i2 = 0;
                }
                objArrS[i2] = obj2;
                i2++;
            }
        }
        onvVar.f25567a = objArrS;
        if (objArr2 != objArrS) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int K(h4 h4Var, Object[] objArr, int i, onv onvVar) {
        Object[] objArrQ = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) h4Var.invoke(obj)).booleanValue()) {
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
        onvVar.f25567a = objArrQ;
        return i2;
    }

    public final int L(h4 h4Var, int i, onv onvVar) {
        int iK = K(h4Var, this.e, i, onvVar);
        if (iK == i) {
            return i;
        }
        Object obj = onvVar.f25567a;
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iK, i, (Object) null);
        T(objArr);
        this.f -= i - iK;
        return iK;
    }

    public final Object[] M(Object[] objArr, int i, int i2, onv onvVar) {
        int iW = k5n0.w(i2, i);
        if (i == 0) {
            Object obj = objArr[iW];
            Object[] objArrQ = q(objArr);
            qx3.e(iW, iW + 1, 32, objArr, objArrQ);
            objArrQ[31] = onvVar.f25567a;
            onvVar.f25567a = obj;
            return objArrQ;
        }
        int iW2 = objArr[31] == null ? k5n0.w(Q() - 1, i) : 31;
        Object[] objArrQ2 = q(objArr);
        int i3 = i - 5;
        int i4 = iW + 1;
        if (i4 <= iW2) {
            while (true) {
                Object obj2 = objArrQ2[iW2];
                obj2.getClass();
                objArrQ2[iW2] = M((Object[]) obj2, i3, 0, onvVar);
                if (iW2 == i4) {
                    break;
                }
                iW2--;
            }
        }
        Object obj3 = objArrQ2[iW];
        obj3.getClass();
        objArrQ2[iW] = M((Object[]) obj3, i3, i2, onvVar);
        return objArrQ2;
    }

    public final Object O(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.f - i;
        Object[] objArr2 = this.e;
        if (i4 == 1) {
            Object obj = objArr2[0];
            y(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrQ = q(objArr2);
        qx3.e(i3, i3 + 1, i4, objArr2, objArrQ);
        objArrQ[i4 - 1] = null;
        S(objArr);
        T(objArrQ);
        this.f = (i + i4) - 1;
        this.f13103a = i2;
        return obj2;
    }

    public final int Q() {
        int i = this.f;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] R(Object[] objArr, int i, int i2, Object obj, onv onvVar) {
        int iW = k5n0.w(i2, i);
        Object[] objArrQ = q(objArr);
        if (i != 0) {
            Object obj2 = objArrQ[iW];
            obj2.getClass();
            objArrQ[iW] = R((Object[]) obj2, i - 5, i2, obj, onvVar);
            return objArrQ;
        }
        if (objArrQ != objArr) {
            ((AbstractList) this).modCount++;
        }
        onvVar.f25567a = objArrQ[iW];
        objArrQ[iW] = obj;
        return objArrQ;
    }

    public final void S(Object[] objArr) {
        if (objArr != this.d) {
            this.b = null;
            this.d = objArr;
        }
    }

    public final void T(Object[] objArr) {
        if (objArr != this.e) {
            this.b = null;
            this.e = objArr;
        }
    }

    public final void U(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrS;
        if (i3 < 1) {
            jf4.n("Check failed.");
            return;
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

    public final int V() {
        int i = this.f;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        zvw.K(i, b());
        if (i == b()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iQ = Q();
        if (i >= iQ) {
            l(i - iQ, obj, this.d);
            return;
        }
        onv onvVar = new onv((Object) null);
        Object[] objArr = this.d;
        objArr.getClass();
        l(0, onvVar.f25567a, j(objArr, this.f13103a, i, obj, onvVar));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrS;
        collection.getClass();
        zvw.K(i, this.f);
        if (i == this.f) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.f - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.e;
            Object[] objArrQ = q(objArr);
            qx3.e(size2 + 1, i3, V(), objArr, objArrQ);
            g(objArrQ, i3, collection.iterator());
            T(objArrQ);
            this.f = collection.size() + this.f;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iV = V();
        int size3 = collection.size() + this.f;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= Q()) {
            objArrS = s();
            collection2 = collection;
            U(collection2, i, this.e, iV, objArr2, size, objArrS);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.e;
            if (size3 > iV) {
                int i4 = size3 - iV;
                Object[] objArrR = r(i4, objArr3);
                k(collection2, i, i4, objArr2, size, objArrR);
                objArr2 = objArr2;
                objArrS = objArrR;
            } else {
                objArrS = s();
                int i5 = iV - size3;
                qx3.e(0, i5, iV, objArr3, objArrS);
                int i6 = 32 - i5;
                Object[] objArrR2 = r(i6, this.e);
                int i7 = size - 1;
                objArr2[i7] = objArrR2;
                k(collection2, i, i6, objArr2, i7, objArrR2);
                collection2 = collection2;
            }
        }
        S(G(this.d, i2, objArr2));
        T(objArrS);
        this.f = collection2.size() + this.f;
        return true;
    }

    @Override // a.e4
    public final int b() {
        return this.f;
    }

    @Override // a.e4
    public final Object e(int i) {
        zvw.J(i, b());
        ((AbstractList) this).modCount++;
        int iQ = Q();
        if (i >= iQ) {
            return O(this.d, iQ, this.f13103a, i - iQ);
        }
        onv onvVar = new onv(this.e[0]);
        Object[] objArr = this.d;
        objArr.getClass();
        O(M(objArr, this.f13103a, i, onvVar), iQ, this.f13103a, 0);
        return onvVar.f25567a;
    }

    public final i4 f() {
        i4 fi90Var = this.b;
        if (fi90Var == null) {
            Object[] objArr = this.d;
            Object[] objArr2 = this.e;
            this.c = new xuz();
            if (objArr == null) {
                fi90Var = objArr2.length == 0 ? lak0.c : new lak0(Arrays.copyOf(objArr2, this.f));
            } else {
                fi90Var = new fi90(objArr, objArr2, this.f, this.f13103a);
            }
            this.b = fi90Var;
        }
        return fi90Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        zvw.J(i, b());
        if (Q() <= i) {
            objArr = this.e;
        } else {
            Object[] objArr2 = this.d;
            objArr2.getClass();
            for (int i2 = this.f13103a; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[k5n0.w(i, i2)];
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

    public final Object[] j(Object[] objArr, int i, int i2, Object obj, onv onvVar) {
        Object obj2;
        int iW = k5n0.w(i2, i);
        if (i == 0) {
            onvVar.f25567a = objArr[31];
            Object[] objArrQ = q(objArr);
            qx3.e(iW + 1, iW, 31, objArr, objArrQ);
            objArrQ[iW] = obj;
            return objArrQ;
        }
        Object[] objArrQ2 = q(objArr);
        int i3 = i - 5;
        Object obj3 = objArrQ2[iW];
        obj3.getClass();
        objArrQ2[iW] = j((Object[]) obj3, i3, i2, obj, onvVar);
        while (true) {
            iW++;
            if (iW >= 32 || (obj2 = objArrQ2[iW]) == null) {
                break;
            }
            objArrQ2[iW] = j((Object[]) obj2, i3, 0, onvVar.f25567a, onvVar);
        }
        return objArrQ2;
    }

    public final void k(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.d == null) {
            jf4.n("Required value was null.");
            return;
        }
        int i4 = i >> 5;
        c3 c3VarO = o(Q() >> 5);
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
        int iQ = i3 - (((Q() >> 5) - 1) - i4);
        if (iQ < i3) {
            objArr2 = objArr[iQ];
            objArr2.getClass();
        }
        U(collection, i, objArr4, 32, objArr, iQ, objArr2);
    }

    public final void l(int i, Object obj, Object[] objArr) {
        int iV = V();
        Object[] objArrQ = q(this.e);
        Object[] objArr2 = this.e;
        if (iV >= 32) {
            Object obj2 = objArr2[31];
            qx3.e(i + 1, i, 31, objArr2, objArrQ);
            objArrQ[i] = obj;
            H(objArr, objArrQ, t(obj2));
            return;
        }
        qx3.e(i + 1, i, iV, objArr2, objArrQ);
        objArrQ[i] = obj;
        S(objArr);
        T(objArrQ);
        this.f++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        zvw.K(i, this.f);
        return new li90(this, i);
    }

    public final boolean m(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.c;
    }

    public final c3 o(int i) {
        if (this.d == null) {
            jf4.n("Required value was null.");
            return null;
        }
        int iQ = Q() >> 5;
        zvw.K(i, iQ);
        int i2 = this.f13103a;
        Object[] objArr = this.d;
        if (i2 == 0) {
            objArr.getClass();
            return new g99(objArr, i);
        }
        objArr.getClass();
        return new lqs0(objArr, i, iQ, i2 / 5);
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

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        hi90 hi90Var;
        int i;
        collection.getClass();
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        h4 h4Var = new h4(collection, (byte) 1);
        int iV = V();
        Object[] objArrV = null;
        onv onvVar = new onv(objArrV);
        if (this.d != null) {
            c3 c3VarO = o(0);
            int iK = 32;
            while (iK == 32 && c3VarO.hasNext()) {
                iK = K(h4Var, (Object[]) c3VarO.next(), 32, onvVar);
            }
            if (iK == 32) {
                int iL = L(h4Var, iV, onvVar);
                if (iL == 0) {
                    y(this.d, this.f, this.f13103a);
                }
                if (iL != iV) {
                    hi90Var = this;
                } else {
                    hi90Var = this;
                }
            } else {
                int i2 = (c3VarO.b - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iJ = iK;
                while (c3VarO.hasNext()) {
                    iJ = J(h4Var, (Object[]) c3VarO.next(), 32, iJ, onvVar, arrayList2, arrayList);
                }
                hi90Var = this;
                int iJ2 = hi90Var.J(h4Var, hi90Var.e, iV, iJ, onvVar, arrayList2, arrayList);
                Object obj = onvVar.f25567a;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iJ2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrF = hi90Var.d;
                if (zIsEmpty) {
                    objArrF.getClass();
                } else {
                    objArrF = hi90Var.F(objArrF, i2, hi90Var.f13103a, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    jf4.n("Check failed.");
                    return false;
                }
                if (size == 0) {
                    hi90Var.f13103a = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = hi90Var.f13103a;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        hi90Var.f13103a = i - 5;
                        Object[] objArr2 = objArrF[0];
                        objArr2.getClass();
                        objArrF = objArr2;
                    }
                    objArrV = hi90Var.v(objArrF, i3, i);
                }
                hi90Var.S(objArrV);
                hi90Var.T(objArr);
                hi90Var.f = size + iJ2;
            }
            z = true;
        } else if (L(h4Var, iV, onvVar) != iV) {
            hi90Var = this;
            z = true;
        } else {
            hi90Var = this;
        }
        if (z) {
            ((AbstractList) hi90Var).modCount++;
        }
        return z;
    }

    public final Object[] s() {
        Object[] objArr = new Object[33];
        objArr[32] = this.c;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zvw.J(i, b());
        if (Q() > i) {
            onv onvVar = new onv((Object) null);
            Object[] objArr = this.d;
            objArr.getClass();
            S(R(objArr, this.f13103a, i, obj, onvVar));
            return onvVar.f25567a;
        }
        Object[] objArrQ = q(this.e);
        if (objArrQ != this.e) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrQ[i2];
        objArrQ[i2] = obj;
        T(objArrQ);
        return obj2;
    }

    public final Object[] t(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.c;
        return objArr;
    }

    public final Object[] v(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            jf4.n("Check failed.");
            return null;
        }
        if (i2 == 0) {
            return objArr;
        }
        int iW = k5n0.w(i, i2);
        Object obj = objArr[iW];
        obj.getClass();
        Object objV = v((Object[]) obj, i, i2 - 5);
        if (iW < 31) {
            int i3 = iW + 1;
            if (objArr[i3] != null) {
                if (m(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrS = s();
                qx3.e(0, 0, i3, objArr, objArrS);
                objArr = objArrS;
            }
        }
        if (objV == objArr[iW]) {
            return objArr;
        }
        Object[] objArrQ = q(objArr);
        objArrQ[iW] = objV;
        return objArrQ;
    }

    public final Object[] w(Object[] objArr, int i, int i2, onv onvVar) {
        Object[] objArrW;
        int iW = k5n0.w(i2 - 1, i);
        if (i == 5) {
            onvVar.f25567a = objArr[iW];
            objArrW = null;
        } else {
            Object obj = objArr[iW];
            obj.getClass();
            objArrW = w((Object[]) obj, i - 5, i2, onvVar);
        }
        if (objArrW == null && iW == 0) {
            return null;
        }
        Object[] objArrQ = q(objArr);
        objArrQ[iW] = objArrW;
        return objArrQ;
    }

    public final void y(Object[] objArr, int i, int i2) {
        Object obj = null;
        if (i2 == 0) {
            S(null);
            if (objArr == null) {
                objArr = new Object[0];
            }
            T(objArr);
            this.f = i;
            this.f13103a = i2;
            return;
        }
        onv onvVar = new onv(obj);
        objArr.getClass();
        Object[] objArrW = w(objArr, i2, i, onvVar);
        objArrW.getClass();
        Object obj2 = onvVar.f25567a;
        obj2.getClass();
        T((Object[]) obj2);
        this.f = i;
        if (objArrW[1] == null) {
            S((Object[]) objArrW[0]);
            this.f13103a = i2 - 5;
        } else {
            S(objArrW);
            this.f13103a = i2;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iV = V();
        if (iV < 32) {
            Object[] objArrQ = q(this.e);
            objArrQ[iV] = obj;
            T(objArrQ);
            this.f = b() + 1;
        } else {
            H(this.d, this.e, t(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iV = V();
        Iterator it = collection.iterator();
        if (32 - iV >= collection.size()) {
            Object[] objArrQ = q(this.e);
            g(objArrQ, iV, it);
            T(objArrQ);
            this.f = collection.size() + this.f;
            return true;
        }
        int size = ((collection.size() + iV) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrQ2 = q(this.e);
        g(objArrQ2, iV, it);
        objArr[0] = objArrQ2;
        for (int i = 1; i < size; i++) {
            Object[] objArrS = s();
            g(objArrS, 0, it);
            objArr[i] = objArrS;
        }
        S(G(this.d, Q(), objArr));
        Object[] objArrS2 = s();
        g(objArrS2, 0, it);
        T(objArrS2);
        this.f = collection.size() + this.f;
        return true;
    }
}
