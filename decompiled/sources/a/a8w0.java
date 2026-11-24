package a;

/* JADX INFO: loaded from: classes4.dex */
public final class a8w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f449a;
    public final double b;
    public final z7w0 c;

    public a8w0(double d, double d2, z7w0 z7w0Var) {
        this.f449a = d;
        this.b = d2;
        this.c = z7w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8w0)) {
            return false;
        }
        a8w0 a8w0Var = (a8w0) obj;
        return Double.compare(this.f449a, a8w0Var.f449a) == 0 && Double.compare(this.b, a8w0Var.b) == 0 && this.c == a8w0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.d(this.b, Double.hashCode(this.f449a) * 31, 31);
    }

    public final String toString() {
        return "GpuProfile(baselineTimeMs=" + this.f449a + ", heavyLoadTimeMs=" + this.b + ", suspectedArchitecture=" + this.c + ')';
    }
}
