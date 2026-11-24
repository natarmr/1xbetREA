package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class q50 extends d50 {
    public final int b;
    public final int c;
    public final p50 d;

    public q50(int i, int i2, p50 p50Var) {
        this.b = i;
        this.c = i2;
        this.d = p50Var;
    }

    public final int d0() {
        p50 p50Var = p50.f;
        int i = this.c;
        p50 p50Var2 = this.d;
        if (p50Var2 == p50Var) {
            return i;
        }
        if (p50Var2 == p50.c) {
            return i + 5;
        }
        if (p50Var2 == p50.d) {
            return i + 5;
        }
        if (p50Var2 == p50.e) {
            return i + 5;
        }
        jf4.n("Unknown variant");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q50)) {
            return false;
        }
        q50 q50Var = (q50) obj;
        return q50Var.b == this.b && q50Var.d0() == d0() && q50Var.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Integer.valueOf(this.c), this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb.append(this.d);
        sb.append(", ");
        sb.append(this.c);
        sb.append("-byte tags, and ");
        return rz4.j(this.b, "-byte key)", sb);
    }
}
