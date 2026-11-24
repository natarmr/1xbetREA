package a;

/* JADX INFO: loaded from: classes.dex */
public final class x3c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40212a;
    public final boolean b;

    public x3c0(int i, boolean z) {
        this.f40212a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x3c0.class != obj.getClass()) {
            return false;
        }
        x3c0 x3c0Var = (x3c0) obj;
        return this.f40212a == x3c0Var.f40212a && this.b == x3c0Var.b;
    }

    public final int hashCode() {
        return (this.f40212a * 31) + (this.b ? 1 : 0);
    }
}
