package a;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class lak0 extends i4 {
    public static final lak0 c = new lak0(new Object[0]);
    public final Object[] b;

    public lak0(Object[] objArr) {
        this.b = objArr;
    }

    @Override // a.u1
    public final int b() {
        return this.b.length;
    }

    @Override // a.i4
    public final i4 e(q9v q9vVar) {
        Object[] objArr = this.b;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = q9vVar;
            return new lak0(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = q9vVar;
        return new fi90(objArr, objArr2, objArr.length + 1, 0);
    }

    public final i4 f(Collection collection) {
        if (collection.isEmpty()) {
            return this;
        }
        Object[] objArr = this.b;
        if (collection.size() + objArr.length > 32) {
            hi90 hi90VarG = g();
            hi90VarG.addAll(collection);
            return hi90VarG.f();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new lak0(objArrCopyOf);
    }

    public final hi90 g() {
        return new hi90(this, null, this.b, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.b;
        zvw.J(i, objArr.length);
        return objArr[i];
    }

    @Override // a.b3, java.util.List
    public final int indexOf(Object obj) {
        return tx3.H(obj, this.b);
    }

    @Override // a.b3, java.util.List
    public final int lastIndexOf(Object obj) {
        return tx3.P(obj, this.b);
    }

    @Override // a.b3, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.b;
        zvw.K(i, objArr.length);
        return new g99(objArr, i, objArr.length);
    }
}
