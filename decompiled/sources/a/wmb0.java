package a;

/* JADX INFO: loaded from: classes.dex */
public final class wmb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39398a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final short f;

    public wmb0(boolean z, pnh0 pnh0Var, boolean z2, int i) {
        zfn zfnVar = k13.f17498a;
        int i2 = !z ? 262152 : 262144;
        i2 = pnh0Var == pnh0.b ? i2 | 8192 : i2;
        i2 = z2 ? i2 : i2 | 512;
        boolean z3 = pnh0Var == pnh0.f27287a;
        this.f39398a = i2;
        this.b = z3;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = (short) 1002;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmb0)) {
            return false;
        }
        wmb0 wmb0Var = (wmb0) obj;
        return this.f39398a == wmb0Var.f39398a && this.b == wmb0Var.b && this.c == wmb0Var.c && this.d == wmb0Var.d && this.e == wmb0Var.e && this.f == wmb0Var.f;
    }

    public final int hashCode() {
        return (brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(this.f39398a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, false) + this.f) * 31;
    }

    public wmb0(int i) {
        this((i & 1) == 0, pnh0.f27287a, true, 0);
    }
}
