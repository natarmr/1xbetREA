package a;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class mak0 extends j4 {
    public static final mak0 c = new mak0(new Object[0]);
    public final Object[] b;

    public mak0(Object[] objArr) {
        this.b = objArr;
        int length = objArr.length;
    }

    @Override // a.u1
    public final int b() {
        return this.b.length;
    }

    @Override // a.j4
    public final j4 e(int i, Object obj) {
        Object[] objArr = this.b;
        bww.C(i, objArr.length);
        if (i == objArr.length) {
            return f(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            qx3.i(0, i, 6, objArr, objArr2);
            qx3.e(i + 1, i, objArr.length, objArr, objArr2);
            objArr2[i] = obj;
            return new mak0(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        qx3.e(i + 1, i, objArr.length - 1, objArr, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new gi90(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // a.j4
    public final j4 f(Object obj) {
        Object[] objArr = this.b;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = obj;
            return new mak0(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new gi90(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // a.j4
    public final j4 g(Collection collection) {
        Object[] objArr = this.b;
        if (collection.size() + objArr.length > 32) {
            ii90 ii90VarH = h();
            ii90VarH.addAll(collection);
            return ii90VarH.f();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new mak0(objArrCopyOf);
    }

    @Override // java.util.List
    public final Object get(int i) {
        bww.A(i, b());
        return this.b[i];
    }

    @Override // a.j4
    public final ii90 h() {
        return new ii90(this, null, this.b, 0);
    }

    @Override // a.b3, java.util.List
    public final int indexOf(Object obj) {
        return tx3.H(obj, this.b);
    }

    @Override // a.j4
    public final j4 j(h4 h4Var) {
        Object[] objArr = this.b;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) h4Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        return length == 0 ? c : new mak0(qx3.k(objArrCopyOf, 0, length));
    }

    @Override // a.j4
    public final j4 k(int i) {
        Object[] objArr = this.b;
        bww.A(i, objArr.length);
        if (objArr.length == 1) {
            return c;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        qx3.e(i, i + 1, objArr.length, objArr, objArrCopyOf);
        return new mak0(objArrCopyOf);
    }

    @Override // a.j4
    public final j4 l(int i, Object obj) {
        bww.A(i, b());
        Object[] objArr = this.b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = obj;
        return new mak0(objArrCopyOf);
    }

    @Override // a.b3, java.util.List
    public final int lastIndexOf(Object obj) {
        return tx3.P(obj, this.b);
    }

    @Override // a.b3, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.b;
        bww.C(i, objArr.length);
        return new h99(objArr, i, objArr.length);
    }
}
