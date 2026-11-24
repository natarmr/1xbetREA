package a;

/* JADX INFO: loaded from: classes6.dex */
public final class p35 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f26283a;
    public final mwb0 b;
    public final t45 c;

    public p35(Object obj, mwb0 mwb0Var, t45 t45Var) {
        this.f26283a = obj;
        this.b = mwb0Var;
        this.c = t45Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p35)) {
            return false;
        }
        p35 p35Var = (p35) obj;
        if (!this.f26283a.equals(p35Var.f26283a) || !this.b.equals(p35Var.b)) {
            return false;
        }
        t45 t45Var = p35Var.c;
        t45 t45Var2 = this.c;
        if (t45Var2 == null) {
            return t45Var == null;
        }
        return t45Var2.equals(t45Var);
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.f26283a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003;
        t45 t45Var = this.c;
        return ((t45Var == null ? 0 : t45Var.hashCode()) ^ iHashCode) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f26283a + ", priority=" + this.b + ", productData=" + this.c + ", eventContext=null}";
    }
}
