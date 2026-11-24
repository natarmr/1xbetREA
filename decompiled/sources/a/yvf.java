package a;

/* JADX INFO: loaded from: classes5.dex */
public final class yvf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7m0 f43316a = q7m0.a(null);

    public final xvm0 a() {
        xvm0 xvm0Var = (xvm0) this.f43316a.getValue();
        if (xvm0Var != null) {
            return xvm0Var;
        }
        throw new ef5();
    }

    public final void b(xvm0 xvm0Var) {
        p7m0 p7m0Var;
        Object value;
        xvm0Var.getClass();
        do {
            p7m0Var = this.f43316a;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, xvm0Var));
    }
}
