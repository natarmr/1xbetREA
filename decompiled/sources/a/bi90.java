package a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class bi90 extends d5 implements g4x {
    public static final bi90 e;
    public final Object b;
    public final Object c;
    public final dh90 d;

    static {
        ujn ujnVar = ujn.k;
        dh90 dh90Var = dh90.f;
        dh90Var.getClass();
        e = new bi90(ujnVar, ujnVar, dh90Var);
    }

    public bi90(Object obj, Object obj2, dh90 dh90Var) {
        this.b = obj;
        this.c = obj2;
        this.d = dh90Var;
    }

    @Override // a.u1
    public final int b() {
        return this.d.e;
    }

    @Override // a.u1, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    public final bi90 e(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return this;
        }
        di90 di90Var = new di90(this);
        di90Var.addAll(collection);
        return di90Var.e();
    }

    @Override // a.d5, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        dh90 dh90Var = this.d;
        nqs0 nqs0Var = dh90Var.d;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (dh90Var.e != set.size()) {
            return false;
        }
        if (set instanceof bi90) {
            return nqs0Var.g(((bi90) obj).d.d, new ch90((byte) 16));
        }
        return set instanceof di90 ? nqs0Var.g(((di90) obj).d.c, new ch90((byte) 17)) : super.equals(obj);
    }

    @Override // a.d5, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ai90(this.b, this.d, (byte) 1);
    }
}
