package a;

/* JADX INFO: loaded from: classes.dex */
public final class d34 {
    public static final d34 d = new c34().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5384a;
    public final boolean b;
    public final boolean c;

    public d34(c34 c34Var) {
        this.f5384a = c34Var.f3655a;
        this.b = c34Var.b;
        this.c = c34Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d34.class != obj.getClass()) {
            return false;
        }
        d34 d34Var = (d34) obj;
        return this.f5384a == d34Var.f5384a && this.b == d34Var.b && this.c == d34Var.c;
    }

    public final int hashCode() {
        return ((this.f5384a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1) + (this.c ? 1 : 0);
    }
}
