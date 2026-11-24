package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class n60 extends d50 {
    public final int b;
    public final int c;
    public final int d;
    public final m60 e;

    public n60(int i, int i2, int i3, m60 m60Var) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = m60Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n60)) {
            return false;
        }
        n60 n60Var = (n60) obj;
        return n60Var.b == this.b && n60Var.c == this.c && n60Var.d == this.d && n60Var.e == this.e;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesEax Parameters (variant: ");
        sb.append(this.e);
        sb.append(", ");
        sb.append(this.c);
        sb.append("-byte IV, ");
        sb.append(this.d);
        sb.append("-byte tag, and ");
        return rz4.j(this.b, "-byte key)", sb);
    }
}
