package a;

/* JADX INFO: loaded from: classes.dex */
public final class av5 extends hvv {
    public int o0;
    public int p0;
    public zu5 q0;

    @Override // a.hvv, a.k3e, a.vme0, a.vuo
    public final void apply() {
        s();
        int iE = hne.E(this.o0);
        int i = 1;
        if (iE != 1 && iE != 3) {
            if (iE != 4) {
                i = iE != 5 ? 0 : 3;
            } else {
                i = 2;
            }
        }
        zu5 zu5Var = this.q0;
        zu5Var.w0 = i;
        zu5Var.y0 = this.p0;
    }

    @Override // a.k3e
    public final k3e k(int i) {
        this.p0 = i;
        return this;
    }

    @Override // a.k3e
    public final k3e l(Float f) {
        this.p0 = this.l0.d(f);
        return this;
    }

    @Override // a.hvv
    public final jvv s() {
        zu5 zu5Var = this.q0;
        if (zu5Var != null) {
            return zu5Var;
        }
        zu5 zu5Var2 = new zu5();
        this.q0 = zu5Var2;
        return zu5Var2;
    }
}
