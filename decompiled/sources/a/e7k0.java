package a;

/* JADX INFO: loaded from: classes.dex */
public final class e7k0 {
    public static final e7k0 c = new e7k0(-1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7331a;
    public final int b;

    static {
        new e7k0(0, 0);
        vtt0.H(0);
        vtt0.H(1);
    }

    public e7k0(int i, int i2) {
        x0x.A((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.f7331a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof e7k0) {
            e7k0 e7k0Var = (e7k0) obj;
            if (this.f7331a == e7k0Var.f7331a && this.b == e7k0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f7331a;
        int i2 = i << 16;
        return this.b ^ ((i >>> 16) | i2);
    }

    public final String toString() {
        return this.f7331a + "x" + this.b;
    }
}
