package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ysg0 extends zsg0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xsg0 f43166a;
    public boolean b = true;
    public final /* synthetic */ atg0 c;

    public ysg0(atg0 atg0Var) {
        this.c = atg0Var;
    }

    @Override // a.zsg0
    public final void a(xsg0 xsg0Var) {
        xsg0 xsg0Var2 = this.f43166a;
        if (xsg0Var == xsg0Var2) {
            xsg0 xsg0Var3 = xsg0Var2.d;
            this.f43166a = xsg0Var3;
            this.b = xsg0Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b) {
            return this.c.f1431a != null;
        }
        xsg0 xsg0Var = this.f43166a;
        return (xsg0Var == null || xsg0Var.c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            this.b = false;
            xsg0 xsg0Var = this.c.f1431a;
            this.f43166a = xsg0Var;
            return xsg0Var;
        }
        xsg0 xsg0Var2 = this.f43166a;
        xsg0 xsg0Var3 = xsg0Var2 != null ? xsg0Var2.c : null;
        this.f43166a = xsg0Var3;
        return xsg0Var3;
    }
}
