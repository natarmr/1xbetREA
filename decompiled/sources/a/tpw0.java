package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class tpw0 extends how0 {
    public final transient Object g;

    public tpw0(Object obj) {
        super((byte) 2);
        this.g = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.g.equals(obj);
    }

    @Override // a.hdw0
    public final int e(Object[] objArr) {
        objArr[0] = this.g;
        return 1;
    }

    @Override // a.how0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new row0(this.g);
    }

    @Override // a.hdw0
    public final eet0 j() {
        return new row0(this.g);
    }

    @Override // a.how0
    public final cow0 m() {
        Object[] objArr = {this.g};
        for (int i = 0; i < 1; i++) {
            knw0 knw0Var = cow0.e;
            if (objArr[i] == null) {
                hny.u(twn.m(i, "at index "));
                return null;
            }
        }
        return cow0.q(1, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return kng0.l("[", this.g.toString(), "]");
    }
}
