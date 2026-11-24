package a;

/* JADX INFO: loaded from: classes.dex */
public final class pe80 extends x1x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wfg0 f26840a;
    public final w03 b;

    public pe80(wfg0 wfg0Var) {
        w03 w03VarA;
        this.f26840a = wfg0Var;
        if (r8x.S(wfg0Var)) {
            w03VarA = null;
        } else {
            w03VarA = z03.a();
            w03.b(w03VarA, wfg0Var);
        }
        this.b = w03VarA;
    }

    @Override // a.x1x
    public final jge0 C() {
        wfg0 wfg0Var = this.f26840a;
        return new jge0(wfg0Var.f39069a, wfg0Var.b, wfg0Var.c, wfg0Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pe80) {
            return this.f26840a.equals(((pe80) obj).f26840a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26840a.hashCode();
    }
}
