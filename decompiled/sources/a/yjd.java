package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class yjd extends af50 {
    public final b530 h;
    public Function0 i;
    public Function0 j;
    public Function0 k;
    public Function0 l;

    public yjd(df50 df50Var, b530 b530Var) {
        super(df50Var, false, 0);
        this.h = b530Var;
        this.i = new a7d((byte) 14);
        this.j = new a7d((byte) 15);
        this.k = new a7d((byte) 16);
        this.l = new a7d((byte) 17);
    }

    @Override // a.af50
    public final void c() {
        this.h.invoke(this.d);
        this.k.invoke();
    }

    @Override // a.af50
    public final void d() {
        this.h.invoke(this.d);
        this.l.invoke();
    }

    @Override // a.af50
    public final void e(xe50 xe50Var) {
        this.h.invoke(this.d);
    }

    @Override // a.af50
    public final void f(xe50 xe50Var) {
        this.h.invoke(this.d);
    }

    @Override // a.af50
    public final void g() {
        this.h.invoke(this.d);
        this.i.invoke();
    }
}
