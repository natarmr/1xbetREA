package a;

/* JADX INFO: loaded from: classes.dex */
public final class ka5 extends lm40 {
    public scq0 o;
    public final /* synthetic */ la5 p;

    public ka5(la5 la5Var) {
        this.p = la5Var;
    }

    @Override // a.lm40
    public final void R0() {
        la5 la5Var = this.p;
        la5Var.b = this;
        if (la5Var.c != null) {
            this.o = x4d0.f0(this, new ys3(this, la5Var, (byte) 26));
        }
    }

    @Override // a.lm40
    public final void S0() {
        la5 la5Var = this.p;
        if (la5Var.b == this) {
            la5Var.b = null;
        }
        scq0 scq0Var = this.o;
        if (scq0Var != null) {
            scq0Var.b();
        }
        this.o = null;
    }
}
