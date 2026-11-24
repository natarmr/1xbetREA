package a;

/* JADX INFO: loaded from: classes.dex */
public final class j35 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15814a;
    public final int b;
    public final tu9 c;

    public j35(int i, int i2, tu9 tu9Var) {
        this.f15814a = i;
        this.b = i2;
        this.c = tu9Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j35) {
            j35 j35Var = (j35) obj;
            return this.f15814a == j35Var.f15814a && this.b == j35Var.b && this.c == j35Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.f15814a ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f15814a + ", rotationDegrees=" + this.b + ", completer=" + this.c + "}";
    }
}
