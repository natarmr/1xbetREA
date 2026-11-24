package a;

/* JADX INFO: loaded from: classes2.dex */
public final class g7k0 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10819a;
    public final int b;

    public g7k0(int i, int i2) {
        this.f10819a = i;
        this.b = i2;
    }

    public final g7k0 a(g7k0 g7k0Var) {
        int i = g7k0Var.b;
        int i2 = this.f10819a;
        int i3 = i2 * i;
        int i4 = g7k0Var.f10819a;
        int i5 = this.b;
        return i3 <= i4 * i5 ? new g7k0(i4, (i5 * i4) / i2) : new g7k0((i2 * i) / i5, i);
    }

    public final g7k0 b(g7k0 g7k0Var) {
        int i = g7k0Var.b;
        int i2 = this.f10819a;
        int i3 = i2 * i;
        int i4 = g7k0Var.f10819a;
        int i5 = this.b;
        return i3 >= i4 * i5 ? new g7k0(i4, (i5 * i4) / i2) : new g7k0((i2 * i) / i5, i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g7k0 g7k0Var = (g7k0) obj;
        int i = this.b * this.f10819a;
        int i2 = g7k0Var.b * g7k0Var.f10819a;
        if (i2 < i) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g7k0.class == obj.getClass()) {
            g7k0 g7k0Var = (g7k0) obj;
            if (this.f10819a == g7k0Var.f10819a && this.b == g7k0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f10819a * 31) + this.b;
    }

    public final String toString() {
        return this.f10819a + "x" + this.b;
    }
}
