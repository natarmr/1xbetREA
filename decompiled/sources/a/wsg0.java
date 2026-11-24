package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class wsg0 extends zsg0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xsg0 f39690a;
    public xsg0 b;

    @Override // a.zsg0
    public final void a(xsg0 xsg0Var) {
        xsg0 xsg0Var2 = this.f39690a;
        xsg0 xsg0Var3 = null;
        if (xsg0Var2 == xsg0Var && xsg0Var == this.b) {
            this.b = null;
            this.f39690a = null;
            xsg0Var2 = null;
        }
        xsg0 xsg0Var4 = xsg0Var2;
        if (xsg0Var2 == xsg0Var) {
            xsg0Var4 = xsg0Var2.d;
            this.f39690a = xsg0Var4;
        }
        xsg0 xsg0Var5 = this.b;
        if (xsg0Var5 == xsg0Var) {
            if (xsg0Var5 != xsg0Var4 && xsg0Var4 != null) {
                xsg0Var3 = xsg0Var5.c;
            }
            this.b = xsg0Var3;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        xsg0 xsg0Var = this.b;
        xsg0 xsg0Var2 = this.f39690a;
        this.b = (xsg0Var == xsg0Var2 || xsg0Var2 == null) ? null : xsg0Var.c;
        return xsg0Var;
    }
}
