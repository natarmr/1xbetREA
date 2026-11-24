package a;

/* JADX INFO: loaded from: classes.dex */
public final class uiz extends lm40 implements vld, t7v {
    public e03 o;
    public djz p;
    public k7q0 q;
    public final pz40 r = androidx.compose.runtime.e.e(null);

    public uiz(e03 e03Var, djz djzVar, k7q0 k7q0Var) {
        this.o = e03Var;
        this.p = djzVar;
        this.q = k7q0Var;
    }

    @Override // a.t7v
    public final void P(s460 s460Var) {
        ((hgk0) this.r).setValue(s460Var);
    }

    @Override // a.lm40
    public final void R0() {
        e03 e03Var = this.o;
        if (e03Var.f6971a != null) {
            adx.c("Expected textInputModifierNode to be null");
        }
        e03Var.f6971a = this;
    }

    @Override // a.lm40
    public final void S0() {
        this.o.k(this);
    }
}
