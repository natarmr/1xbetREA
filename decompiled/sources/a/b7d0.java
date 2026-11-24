package a;

/* JADX INFO: loaded from: classes.dex */
public final class b7d0 implements c7d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rl f2103a;
    public final m050 b;

    public b7d0(rl rlVar, m050 m050Var) {
        this.f2103a = rlVar;
        this.b = m050Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7d0)) {
            return false;
        }
        b7d0 b7d0Var = (b7d0) obj;
        return this.f2103a == b7d0Var.f2103a && this.b == b7d0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2103a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(activeCamera=" + this.f2103a + ", token=" + this.b + ')';
    }
}
