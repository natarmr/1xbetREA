package a;

/* JADX INFO: loaded from: classes.dex */
public final class z35 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n45 f43703a;
    public final int b;

    public z35(n45 n45Var, int i) {
        this.f43703a = n45Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z35)) {
            return false;
        }
        z35 z35Var = (z35) obj;
        return this.f43703a.equals(z35Var.f43703a) && this.b == z35Var.b;
    }

    public final int hashCode() {
        return this.b ^ ((this.f43703a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{packet=");
        sb.append(this.f43703a);
        sb.append(", jpegQuality=");
        return rz4.j(this.b, "}", sb);
    }
}
