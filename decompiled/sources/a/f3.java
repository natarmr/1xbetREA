package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class f3 extends d5 {
    public final /* synthetic */ h3 b;

    public f3(h3 h3Var) {
        this.b = h3Var;
    }

    @Override // a.u1
    public final int b() {
        return this.b.c();
    }

    @Override // a.u1, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // a.d5, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new e3(this.b.a().iterator(), (byte) 0);
    }
}
