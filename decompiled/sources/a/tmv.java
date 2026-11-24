package a;

/* JADX INFO: loaded from: classes.dex */
public final class tmv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tq8 f34213a;
    public final y60 b;
    public final m60 c;

    public tmv(tq8 tq8Var, y60 y60Var, m60 m60Var) {
        this.f34213a = tq8Var;
        this.b = y60Var;
        this.c = m60Var;
        if (tq8Var.b() == 0 && tq8Var.a() == 0) {
            jf4.o("Bounds must be non zero");
            throw null;
        }
        if (tq8Var.f34369a == 0 || tq8Var.b == 0) {
            return;
        }
        jf4.o("Bounding rectangle must start at the top or left window edge for folding features");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (tmv.class.equals(obj != null ? obj.getClass() : null)) {
            obj.getClass();
            tmv tmvVar = (tmv) obj;
            return this.f34213a.equals(tmvVar.f34213a) && this.b == tmvVar.b && this.c == tmvVar.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f34213a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return tmv.class.getSimpleName() + " { " + this.f34213a + ", type=" + this.b + ", state=" + this.c + " }";
    }
}
