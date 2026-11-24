package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class bh9 extends wg9 implements Iterable {
    @Override // a.wg9
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final bh9 b() {
        return (bh9) super.b();
    }

    @Override // a.wg9, a.xg9
    public final Object clone() {
        return (bh9) super.b();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ah9 ah9Var = new ah9();
        ah9Var.b = 0;
        ah9Var.c = this;
        return ah9Var;
    }
}
