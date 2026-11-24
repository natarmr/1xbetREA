package a;

/* JADX INFO: loaded from: classes.dex */
public final class k35 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l45 f17602a;
    public final l45 b;

    public k35(l45 l45Var, l45 l45Var2) {
        this.f17602a = l45Var;
        this.b = l45Var2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k35)) {
            return false;
        }
        k35 k35Var = (k35) obj;
        return this.f17602a.equals(k35Var.f17602a) && this.b.equals(k35Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.f17602a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.f17602a + ", secondaryOutConfig=" + this.b + "}";
    }
}
