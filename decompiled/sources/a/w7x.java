package a;

/* JADX INFO: loaded from: classes.dex */
public final class w7x implements j73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xen f38694a;
    public final kkf0 b;
    public final long c;

    public w7x(xen xenVar, kkf0 kkf0Var, long j) {
        this.f38694a = xenVar;
        this.b = kkf0Var;
        this.c = j;
        if (xenVar instanceof uts0) {
            uts0 uts0Var = (uts0) xenVar;
            if (uts0Var.f36270a != 0 || uts0Var.b != 0) {
                return;
            }
        } else if (!(xenVar instanceof jfk0) && (!(xenVar instanceof jmy) || ((jmy) xenVar).f16788a.f15048a != 0)) {
            return;
        }
        jf4.o("Animation to be infinitely repeated cannot have a 0-duration");
        throw null;
    }

    @Override // a.j73
    public final l5u0 a(lxs0 lxs0Var) {
        o5u0 o5u0VarA = this.f38694a.a(lxs0Var);
        dr8 dr8Var = new dr8();
        dr8Var.c = o5u0VarA;
        dr8Var.d = this.b;
        dr8Var.f6545a = ((long) (o5u0VarA.f() + o5u0VarA.e())) * 1000000;
        dr8Var.b = this.c * 1000000;
        return dr8Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w7x) {
            w7x w7xVar = (w7x) obj;
            if (w7xVar.f38694a.equals(this.f38694a) && w7xVar.b == this.b && w7xVar.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.f38694a.hashCode() * 31)) * 31);
    }
}
