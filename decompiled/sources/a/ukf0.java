package a;

/* JADX INFO: loaded from: classes.dex */
public final class ukf0 implements cfq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35825a;
    public final jmy b;
    public final kkf0 c;
    public final long d;

    public ukf0(int i, jmy jmyVar, kkf0 kkf0Var, long j) {
        this.f35825a = i;
        this.b = jmyVar;
        this.c = kkf0Var;
        this.d = j;
    }

    @Override // a.j73
    public final p5u0 a(lxs0 lxs0Var) {
        return new u5u0(this.f35825a, this.b.a(lxs0Var), this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ukf0) {
            ukf0 ukf0Var = (ukf0) obj;
            if (ukf0Var.f35825a == this.f35825a && ukf0Var.b == this.b && ukf0Var.c == this.c && ukf0Var.d == this.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.f35825a * 31)) * 31)) * 31);
    }
}
