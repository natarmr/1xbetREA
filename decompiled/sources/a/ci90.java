package a;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ci90 extends d5 implements h4x, Collection, khy {
    public static final ci90 e;
    public final Object b;
    public final Object c;
    public final eh90 d;

    static {
        jtv jtvVar = jtv.h;
        e = new ci90(jtvVar, jtvVar, eh90.f);
    }

    public ci90(Object obj, Object obj2, eh90 eh90Var) {
        this.b = obj;
        this.c = obj2;
        this.d = eh90Var;
    }

    @Override // a.u1
    public final int b() {
        return this.d.e;
    }

    @Override // a.u1, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // a.d5, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ai90(this.b, this.d, (byte) 2);
    }
}
