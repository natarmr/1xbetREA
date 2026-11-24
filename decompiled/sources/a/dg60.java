package a;

/* JADX INFO: loaded from: classes.dex */
public final class dg60 extends af50 {
    public final eg60 h;
    public boolean i;

    public dg60(eg60 eg60Var, fg60 fg60Var) {
        super(fg60Var, eg60Var.b, 0);
        this.h = eg60Var;
        this.i = true;
    }

    @Override // a.af50
    public final void c() {
        this.h.a();
    }

    @Override // a.af50
    public final void d() {
        this.h.b();
    }

    @Override // a.af50
    public final void e(xe50 xe50Var) {
        this.h.c(new pb5(xe50Var));
    }

    @Override // a.af50
    public final void f(xe50 xe50Var) {
        xe50Var.getClass();
        this.h.d(new pb5(xe50Var));
    }

    public final void j(boolean z) {
        this.i = z;
        i(z && this.h.b);
    }
}
