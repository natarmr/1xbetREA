package a;

/* JADX INFO: loaded from: classes.dex */
public final class vn30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f37698a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public vn30(Object obj, int i, int i2, long j, int i3) {
        this.f37698a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final vn30 a(Object obj) {
        if (this.f37698a.equals(obj)) {
            return this;
        }
        return new vn30(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b(vn30 vn30Var) {
        if (vn30Var == null) {
            return false;
        }
        if (this == vn30Var) {
            return true;
        }
        return this.f37698a.equals(vn30Var.f37698a) && this.b == vn30Var.b && this.c == vn30Var.c && this.d == vn30Var.d;
    }

    public final boolean c() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn30)) {
            return false;
        }
        vn30 vn30Var = (vn30) obj;
        return b(vn30Var) && this.e == vn30Var.e;
    }

    public final int hashCode() {
        return ((((((((this.f37698a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public vn30(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public vn30(Object obj, int i, long j) {
        this(obj, -1, -1, j, i);
    }

    public vn30(Object obj) {
        this(obj, -1L);
    }
}
